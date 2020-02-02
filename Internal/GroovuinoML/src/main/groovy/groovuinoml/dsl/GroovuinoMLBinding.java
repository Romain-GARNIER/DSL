package main.groovy.groovuinoml.dsl;

import java.util.Map;

import groovy.lang.Binding;
import groovy.lang.Script;
import io.github.mosser.arduinoml.kernel.structural.Comparator;
import io.github.mosser.arduinoml.kernel.structural.Type;

public class GroovuinoMLBinding extends Binding {
	// can be useful to return the script in case of syntax trick
	private Script script;
	
	private GroovuinoMLModel model;
	
	public GroovuinoMLBinding() {
		super();
	}
	
	@SuppressWarnings("rawtypes")
	public GroovuinoMLBinding(Map variables) {
		super(variables);
	}
	
	public GroovuinoMLBinding(Script script) {
		super();
		this.script = script;
	}
	
	public void setScript(Script script) {
		this.script = script;
	}
	
	public void setGroovuinoMLModel(GroovuinoMLModel model) {
		this.model = model;
	}
	
	public Object getVariable(String name) {
		// Easter egg (to show you this trick: seb is now a keyword!)
		if ("superior".equals(name)) {
			return Comparator.SUP;
		}
		if ("inferior".equals(name)) {
			return Comparator.INF;
		}
		if ("equal".equals(name)) {
			return Comparator.EQUAL;
		}
		return super.getVariable(name);
	}
	
	public void setVariable(String name, Object value) {
		super.setVariable(name, value);
	}
	
	public GroovuinoMLModel getGroovuinoMLModel() {
		return this.model;
	}
}
