package main.groovy.groovuinoml.dsl

import io.github.mosser.arduinoml.kernel.behavioral.SinkError
import io.github.mosser.arduinoml.kernel.behavioral.Transition
import io.github.mosser.arduinoml.kernel.structural.BaseCondition
import io.github.mosser.arduinoml.kernel.structural.BooleanCondition
import io.github.mosser.arduinoml.kernel.structural.Operator

import java.util.List;

import io.github.mosser.arduinoml.kernel.behavioral.Action
import io.github.mosser.arduinoml.kernel.behavioral.State
import io.github.mosser.arduinoml.kernel.structural.Actuator
import io.github.mosser.arduinoml.kernel.structural.Sensor
import io.github.mosser.arduinoml.kernel.structural.SIGNAL

import java.util.concurrent.locks.Condition

abstract class GroovuinoMLBasescript extends Script {
	// sensor "name" pin n
	def sensor(String name) {
		[pin: { n -> ((GroovuinoMLBinding)this.getBinding()).getGroovuinoMLModel().createSensor(name, n) },
		onPin: { n -> ((GroovuinoMLBinding)this.getBinding()).getGroovuinoMLModel().createSensor(name, n)}]
	}
	
	// actuator "name" pin n
	def actuator(String name) {
		[pin: { n -> ((GroovuinoMLBinding)this.getBinding()).getGroovuinoMLModel().createActuator(name, n) }]
	}
	
	// state "name" means actuator becomes signal [and actuator becomes signal]*n
	def state(String name) {
		List<Action> actions = new ArrayList<Action>()
		((GroovuinoMLBinding) this.getBinding()).getGroovuinoMLModel().createState(name, actions)
		// recursive closure to allow multiple and statements
		def closure
		closure = { actuator ->
			[becomes: { signal ->
				Action action = new Action()
				action.setActuator(actuator instanceof String ? (Actuator)((GroovuinoMLBinding)this.getBinding()).getVariable(actuator) : (Actuator)actuator)
				action.setValue(signal instanceof String ? (SIGNAL)((GroovuinoMLBinding)this.getBinding()).getVariable(signal) : (SIGNAL)signal)
				actions.add(action)
				[and: closure]
			}]
		}
		[means: closure]
	}
	
	// initial state
	def initial(state) {
		((GroovuinoMLBinding) this.getBinding()).getGroovuinoMLModel().setInitialState(state instanceof String ? (State)((GroovuinoMLBinding)this.getBinding()).getVariable(state) : (State)state)
	}
	
	// from state1 to state2 when sensor becomes signal [and|or sensor becomes signal]*n
	def from(state1) {
		Transition transition = new Transition()
		((GroovuinoMLBinding) this.getBinding()).getGroovuinoMLModel().createTransition(
				state1 instanceof String ? (State)((GroovuinoMLBinding)this.getBinding()).getVariable(state1) : (State)state1,
				transition)

		[to: { state2 ->
			transition.setNext(state2 instanceof String ? (State)((GroovuinoMLBinding)this.getBinding()).getVariable(state2) : (State)state2)

			[when: { sensor ->
				[becomes: { signal ->
					BaseCondition condition = new BaseCondition();
					condition.setSensor(sensor instanceof String ? (Sensor)((GroovuinoMLBinding)this.getBinding()).getVariable(sensor) : (Sensor)sensor)
					condition.setValue(signal instanceof String ? (SIGNAL)((GroovuinoMLBinding)this.getBinding()).getVariable(signal) : (SIGNAL)signal)
					transition.setCondition(condition)

					def closureAND
					def closureOR
					closureOR = { sensorOR ->
						[becomes: { signalOR ->
							BooleanCondition booleanCondition = new BooleanCondition()
							booleanCondition.setSensor(sensorOR instanceof String ? (Sensor)((GroovuinoMLBinding)this.getBinding()).getVariable(sensorOR) : (Sensor)sensorOR)
							booleanCondition.setValue(signalOR instanceof String ? (SIGNAL)((GroovuinoMLBinding)this.getBinding()).getVariable(signalOR) : (SIGNAL)signalOR)
							booleanCondition.setOperator(Operator.OR)
							transition.addBooleanCondition(booleanCondition)
						}]
					}
					closureAND = { sensorAND ->
						[becomes: { signalAND ->
							BooleanCondition booleanCondition = new BooleanCondition()
							booleanCondition.setSensor(sensorAND instanceof String ? (Sensor)((GroovuinoMLBinding)this.getBinding()).getVariable(sensorAND) : (Sensor)sensorAND)
							booleanCondition.setValue(signalAND instanceof String ? (SIGNAL)((GroovuinoMLBinding)this.getBinding()).getVariable(signalAND) : (SIGNAL)signalAND)
							booleanCondition.setOperator(Operator.AND)
							transition.addBooleanCondition(booleanCondition)
						}]
					}
					[or: closureOR,
					 and: closureAND]
				}]
			}]
		}]
	}

	// error n from state1 when sensor becomes signal [and|or sensor becomes signal]*n
	def error(n) {
		[from: { state ->
			SinkError sinkError = new SinkError(n)
			((GroovuinoMLBinding) this.getBinding()).getGroovuinoMLModel().createSinkError(
					state instanceof String ? (State)((GroovuinoMLBinding)this.getBinding()).getVariable(state) : (State)state,
					sinkError)
			[when: { sensor ->
				[becomes: { signal ->
					BaseCondition condition = new BaseCondition();
					condition.setSensor(sensor instanceof String ? (Sensor)((GroovuinoMLBinding)this.getBinding()).getVariable(sensor) : (Sensor)sensor)
					condition.setValue(signal instanceof String ? (SIGNAL)((GroovuinoMLBinding)this.getBinding()).getVariable(signal) : (SIGNAL)signal)
					sinkError.setCondition(condition)

					def closureAND
					def closureOR
					closureOR = { sensorOR ->
						[becomes: { signalOR ->
							BooleanCondition booleanCondition = new BooleanCondition()
							booleanCondition.setSensor(sensorOR instanceof String ? (Sensor)((GroovuinoMLBinding)this.getBinding()).getVariable(sensorOR) : (Sensor)sensorOR)
							booleanCondition.setValue(signalOR instanceof String ? (SIGNAL)((GroovuinoMLBinding)this.getBinding()).getVariable(signalOR) : (SIGNAL)signalOR)
							booleanCondition.setOperator(Operator.OR)
							sinkError.addBooleanCondition(booleanCondition)
						}]
					}
					closureAND = { sensorAND ->
						[becomes: { signalAND ->
							BooleanCondition booleanCondition = new BooleanCondition()
							booleanCondition.setSensor(sensorAND instanceof String ? (Sensor)((GroovuinoMLBinding)this.getBinding()).getVariable(sensorAND) : (Sensor)sensorAND)
							booleanCondition.setValue(signalAND instanceof String ? (SIGNAL)((GroovuinoMLBinding)this.getBinding()).getVariable(signalAND) : (SIGNAL)signalAND)
							booleanCondition.setOperator(Operator.AND)
							sinkError.addBooleanCondition(booleanCondition)
						}]
					}
					[or: closureOR,
					 and: closureAND]
				}]
			}]
		}]
	}
	
	// export name
	def export(String name) {
		println(((GroovuinoMLBinding) this.getBinding()).getGroovuinoMLModel().generateCode(name).toString())
	}
	
	// disable run method while running
	int count = 0
	abstract void scriptBody()
	def run() {
		if(count == 0) {
			count++
			scriptBody()
		} else {
			println "Run method is disabled"
		}
	}
}
