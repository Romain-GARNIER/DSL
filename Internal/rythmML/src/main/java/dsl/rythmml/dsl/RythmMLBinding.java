package main.java.dsl.rythmml.dsl;

import groovy.lang.Binding;
import groovy.lang.Script;

import java.util.Map;

public class RythmMLBinding extends Binding {
	// can be useful to return the script in case of syntax trick
	private Script script;
	
	private RythmMLModel model;
	
	public RythmMLBinding() {
		super();
	}
	
	@SuppressWarnings("rawtypes")
	public RythmMLBinding(Map variables) {
		super(variables);
	}
	
	public RythmMLBinding(Script script) {
		super();
		this.script = script;
	}
	
	public void setScript(Script script) {
		this.script = script;
	}
	
	public void setGroovuinoMLModel(RythmMLModel model) {
		this.model = model;
	}
	
	public Object getVariable(String name) {
		// Easter egg (to show you this trick: seb is now a keyword!)
		if ("seb".equals(name)) {
			// could do something else like: ((App) this.getVariable("app")).action();
			System.out.println("Seb, c'est bien");
			return script;
		}
		return super.getVariable(name);
	}
	
	public void setVariable(String name, Object value) {
		super.setVariable(name, value);
	}
	
	public RythmMLModel getGroovuinoMLModel() {
		return this.model;
	}
}
