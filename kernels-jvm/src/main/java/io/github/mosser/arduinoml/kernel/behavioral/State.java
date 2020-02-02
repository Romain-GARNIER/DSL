package io.github.mosser.arduinoml.kernel.behavioral;

import io.github.mosser.arduinoml.kernel.NamedElement;
import io.github.mosser.arduinoml.kernel.generator.Visitable;
import io.github.mosser.arduinoml.kernel.generator.Visitor;

import java.util.ArrayList;
import java.util.List;

public class State implements NamedElement, Visitable {

	private String name;
	private List<Action> actions = new ArrayList<Action>();
	private Transition transition;
	private List<SinkError> sinkErrors = new ArrayList<>();

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	public List<Action> getActions() {
		return actions;
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}

	public Transition getTransition() {
		return transition;
	}

	public void setTransition(Transition transition) {
		this.transition = transition;
	}

	public List<SinkError> getSinkError() {
		return sinkErrors;
	}

	public void setSinkError(List<SinkError> sinkErrors) {
		this.sinkErrors = sinkErrors;
	}

	public void addSinkError(SinkError sinkError){
		this.sinkErrors.add(sinkError);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
