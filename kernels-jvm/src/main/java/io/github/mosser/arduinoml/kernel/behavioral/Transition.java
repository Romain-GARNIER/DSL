package io.github.mosser.arduinoml.kernel.behavioral;

import io.github.mosser.arduinoml.kernel.generator.Visitable;
import io.github.mosser.arduinoml.kernel.generator.Visitor;
import io.github.mosser.arduinoml.kernel.structural.*;

import java.util.ArrayList;

public class Transition implements Visitable {
	private State next;
	private Condition condition;
	private ArrayList<BooleanCondition> booleanConditions = new ArrayList<>();

	public State getNext() {
		return next;
	}

	public void setNext(State next) {
		this.next = next;
	}

	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}

	public ArrayList<BooleanCondition> getBooleanConditions() {
		return booleanConditions;
	}

	public void setBooleanConditions(ArrayList<BooleanCondition> booleanConditions) {
		this.booleanConditions = booleanConditions;
	}

	public void addBooleanCondition(BooleanCondition condition){
		booleanConditions.add(condition);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
