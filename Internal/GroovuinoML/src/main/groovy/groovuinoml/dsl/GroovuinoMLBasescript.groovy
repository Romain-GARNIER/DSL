package groovuinoml.dsl

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
	
	// from state1 to state2 when sensor becomes signal [and sensor becomes signal]*n
	def from(state1) {
		Transition transition = new Transition()
		((GroovuinoMLBinding) this.getBinding()).getGroovuinoMLModel().createTransition(state1, transition)

		[to: { state2 ->
			transition.setNext(state2 instanceof String ? (State)((GroovuinoMLBinding)this.getBinding()).getVariable(state2) : (State)state2)

			[when: { sensor ->
				[becomes: { signal ->
					BaseCondition condition = new BaseCondition();
					condition.setSensor(sensor instanceof String ? (Sensor)((GroovuinoMLBinding)this.getBinding()).getVariable(sensor) : (Sensor)sensor)
					condition.setValue(signal instanceof String ? (SIGNAL)((GroovuinoMLBinding)this.getBinding()).getVariable(signal) : (SIGNAL)signal)
					transition.setCondition(condition)

//					def closureAnd
//					def closureOR
//					closureAnd = { sensorAND ->
//						[becomes: { signalAND ->
//							BooleanCondition booleanCondition = new BooleanCondition()
//							booleanCondition.setSensor(sensor instanceof String ? (Sensor)((GroovuinoMLBinding)this.getBinding()).getVariable(sensor) : (Sensor)sensorAND)
//							booleanCondition.setValue(signal instanceof String ? (SIGNAL)((GroovuinoMLBinding)this.getBinding()).getVariable(signal) : (SIGNAL)signalAND)
//							booleanCondition.setOperator(Operator.AND)
//							transition.addBooleanCondition(booleanCondition)
//						}]
//					}
//					closureOR = { sensorOR ->
//						[becomes: { signalOR ->
//							BooleanCondition booleanCondition = new BooleanCondition()
//							booleanCondition.setSensor(sensor instanceof String ? (Sensor)((GroovuinoMLBinding)this.getBinding()).getVariable(sensor) : (Sensor)sensorOR)
//							booleanCondition.setValue(signal instanceof String ? (SIGNAL)((GroovuinoMLBinding)this.getBinding()).getVariable(signal) : (SIGNAL)signalOR)
//							booleanCondition.setOperator(Operator.OR)
//							transition.addBooleanCondition(booleanCondition)
//						}]
//					}
//					[and: closureAnd]
//					[or: closureOR]
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
