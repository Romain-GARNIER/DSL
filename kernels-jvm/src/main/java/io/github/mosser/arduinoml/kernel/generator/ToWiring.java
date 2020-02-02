package io.github.mosser.arduinoml.kernel.generator;

import io.github.mosser.arduinoml.kernel.App;
import io.github.mosser.arduinoml.kernel.behavioral.*;
import io.github.mosser.arduinoml.kernel.structural.*;

import java.lang.Exception;

/**
 * Quick and dirty visitor to support the generation of Wiring code
 */
public class ToWiring extends Visitor<StringBuffer> {

	private final static String CURRENT_STATE = "current_state";

	public ToWiring() {
		this.result = new StringBuffer();
	}

	private void w(String s) {
		result.append(String.format("%s\n",s));
	}

	private void wline(String s) {
		result.append(String.format("%s",s));
	}

	@Override
	public void visit(App app) {
		w("// Wiring code generated from an ArduinoML model");
		w(String.format("// Application name: %s\n", app.getName()));

		w("void setup(){");
		for(Brick brick: app.getBricks()){
			brick.accept(this);
		}
		w("}\n");

		w("long time = 0; long debounce = 200;\n");

		for(State state: app.getStates()){
			state.accept(this);
		}

		if (app.getInitial() != null) {
			w("void loop() {");
			w(String.format("  state_%s();", app.getInitial().getName()));
			w("}");
		}

		printErrorState();
	}

	@Override
	public void visit(Actuator actuator) {
	 	w(String.format("  pinMode(%d, OUTPUT); // %s [Actuator]", actuator.getPin(), actuator.getName()));
	}


	@Override
	public void visit(Sensor sensor) {
		w(String.format("  pinMode(%d, INPUT);  // %s [Sensor]", sensor.getPin(), sensor.getName()));
	}

	@Override
	public void visit(State state) {
		w(String.format("void state_%s() {",state.getName()));
		for(Action action: state.getActions()) {
			action.accept(this);
		}

		w("  boolean guard = millis() - time > debounce;");
		for(SinkError sinkError : state.getSinkError()){
			sinkError.accept(this);
		}

		if(state.getTransitions().size()>0){
			context.put(CURRENT_STATE, state);
			for(Transition transition : state.getTransitions()) {
				transition.accept(this);
			}
			w("else {");
			w(String.format("    state_%s();",((State) context.get(CURRENT_STATE)).getName()));
			w("  }");
		}

		w("}\n");
	}

	@Override
	public void visit(Transition transition) {
		if(transition.getCondition().getSensor().getType() == Type.ANALOG)
			wline(String.format("  if( analogRead(%d) == %s",
					transition.getCondition().getSensor().getPin(),transition.getCondition().getAnalogValue()));
		else
			wline(String.format("  if( digitalRead(%d) == %s",
					transition.getCondition().getSensor().getPin(),transition.getCondition().getValue()));
		if(transition.getBooleanConditions().size() > 0){
			for(BooleanCondition b : transition.getBooleanConditions()) {
				if(transition.getCondition().getSensor().getType() == Type.ANALOG){
					if(b.getOperator() == Operator.AND) {
						wline(String.format(" && analogRead(%d) %s %s",b.getSensor().getPin(),
								stringComparator(b.getComparator()),
								b.getAnalogValue()));
					}else {
						wline(String.format(" || analogRead(%d) %s %s",b.getSensor().getPin(),
								stringComparator(b.getComparator()),
								b.getAnalogValue()));
					}
				}else {
					if(b.getOperator() == Operator.AND) {
						wline(String.format(" && digitalRead(%d) == %s",b.getSensor().getPin(),b.getValue()));
					}else {
						wline(String.format(" || digitalRead(%d) == %s",b.getSensor().getPin(),b.getValue()));
					}
				}
			}
		}
		w(" && guard ) {");
		w("    time = millis();");
		w(String.format("    state_%s();",transition.getNext().getName()));
		w("  }");
	}

	@Override
	public void visit(Action action) {
		if(action.getActuator().getType() == Type.ANALOG)
			w(String.format("  analogWrite(%d,%s);",action.getActuator().getPin(),action.getAnalogValue()));
		else
			w(String.format("  digitalWrite(%d,%s);",action.getActuator().getPin(),action.getValue()));

	}

	@Override
	public void visit(SinkError sinkError) {
		wline(String.format("  if( digitalRead(%d) == %s",
				sinkError.getCondition().getSensor().getPin(),sinkError.getCondition().getValue()));
		if(sinkError.getBooleanConditions().size() > 0){
			for(BooleanCondition b : sinkError.getBooleanConditions()) {
				if(b.getOperator() == Operator.AND) {
					wline(String.format(" && digitalRead(%d) == %s",b.getSensor().getPin(),b.getValue()));
				}
				else {
					wline(String.format(" || digitalRead(%d) == %s",b.getSensor().getPin(),b.getValue()));
				}
			}
		}
		w(" && guard ) {");
		w("    time = millis();");
		w(String.format("    state_error(%d);",sinkError.getValue()));
		w("  }");
	}

	void printErrorState(){
		w("void state_error(int x) {");
		w("	for(int i = 0; i < x; i++){");
		w("		digitalWrite(13, HIGH);");
		w("		delay(800);");
		w("		digitalWrite(13, LOW);");
		w("		delay(800);");
		w("	}");
		w("	delay(1500);");
		w("	state_error(x);");
		w("}");
	}

	String stringComparator(Comparator comparator){
		if(comparator == Comparator.SUP)
			return ">";
		if(comparator == Comparator.INF)
			return ">";
		return "==";
	}
}
