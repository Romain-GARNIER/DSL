package arduinoML.homemade;

import arduinoML.*;
import arduinoML.util.ArduinoMLSwitch;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see arduinoML.ArduinoMLPackage
 * 
 */
public class ArduinoMLSwitchPrinter extends ArduinoMLSwitch<String> {
	public ArduinoMLSwitchPrinter() {
		if (modelPackage == null) {
			modelPackage = ArduinoMLPackage.eINSTANCE;
		}
	}


	/**
	 * Returns the result of interpreting the object as an instance of '<em>Brick</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Brick</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * 
	 */
	public String caseBrick(Brick object) {
		return "";
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * 
	 */
	public String caseActuator(Actuator object) {
		return "\tpinMode("+object.getPin()+", OUTPUT);\n";
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * 
	 */
	public String caseSensor(Sensor object) {
		return "\tpinMode("+object.getPin()+", INPUT);\n";
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * 
	 */
	public String caseApp(App object) {
		 StringBuilder sb = new StringBuilder();
		 boolean hasErrorState = false;
		 sb.append("// Code generated by ArduinoML\n"
		 		+ "// Structural concepts\n"
				+ "void setup() {\n");
		 for(Brick b : object.getBricks())
			sb.append(doSwitch(b));
		 for(State s : object.getStates()) {
			 if(s.getErrors().size()>0) {
				 sb.append("\tpinMode(13, OUTPUT); // The default Error LED\n");
				 hasErrorState = true;
				 break;
			 }
		 }
		 sb.append("}\n\n"
		 		+ "//Behavioral concepts\n"
		 		+ "long time=0; long debounce = 300;\n");
		 for(State s : object.getStates())
				sb.append(doSwitch(s));
		 sb.append("\nvoid loop() {state_"+object.getInitial().getName()+"();} // Entering init state");
		 if(hasErrorState) {
			 sb.append(createSinkState());
		 }
		 return sb.toString();
	}
	
	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * 
	 */
	public String caseState(State object) {
		StringBuilder sb = new StringBuilder();
		 sb.append("\nvoid state_"+object.getName()+"() {\n");
		 for(Action a : object.getActions())
			 sb.append(doSwitch(a));
		 sb.append("\tboolean guard = millis() - time > debounce;\n");
		 if(object.getErrors().size()>0) {
			 for(SinkError e : object.getErrors()) {
				 sb.append(doSwitch(e));
			 }
		 }
		 for(Transition t : object.getTransitions()) {
			 sb.append(doSwitch(t));
		 }
		 sb.append("\telse { state_"+object.getName()+"(); }\n");
		 sb.append("}\n");
		 return sb.toString();
	}
	
	
	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * 
	 */
	public String caseAction(Action object) {
		StringBuilder sb = new StringBuilder();
		if(object.getActuator().getType().getValue() == 0) {
			sb.append("\tanalogWrite("
			 		+object.getActuator().getPin()
			 		+", "+object.getAnalogvalue()
			 		+");\n");
		}
		else {
			sb.append("\tdigitalWrite("
			 		+object.getActuator().getPin()
			 		+", "+object.getValue().getLiteral()
			 		+");\n");
		}
		 return sb.toString();
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * 
	 */
	public String caseTransition(Transition object) {
		StringBuilder sb = new StringBuilder();
		if(object.getBasecondition().getSensor().getType().getValue() == 0) {
			sb.append("\tif ((analogRead(" + object.getBasecondition().getSensor().getPin() + ") " + caseComparator(object.getBasecondition().getComparator()) + " "+ object.getBasecondition().getAnalogvalue() + ")");
		}
		else {
			sb.append("\tif ((digitalRead(" + object.getBasecondition().getSensor().getPin() + ") " + caseComparator(object.getBasecondition().getComparator())+ " " + object.getBasecondition().getValue() + ")");
		}
		 if(object.getBooleancondition().size()>0) {
			 for(BooleanCondition b : object.getBooleancondition()) {
				 if(b.getSensor().getType().getValue() == 0) {
					 if(b.getOperator().getValue() == 1) {
						 sb.append(" || (analogRead(" + b.getSensor().getPin() + ") " + caseComparator(b.getComparator())+ " " + b.getAnalogvalue()+ ")");
					 }
					 else {
						 sb.append(" && (analogRead(" + b.getSensor().getPin() + ") " +caseComparator(b.getComparator())+ " " + b.getAnalogvalue()+ ")");
					 }
				 }
				 else {
					 if(b.getOperator().getValue() == 1) {
						 sb.append(" || (digitalRead(" + b.getSensor().getPin() + ") " + caseComparator(b.getComparator())+ " " + b.getValue()+ ")");
					 }
					 else {
						 sb.append(" && (digitalRead(" + b.getSensor().getPin() + ") " +caseComparator(b.getComparator())+ " " + b.getValue()+ ")");
					 }
				 }
				 
			 }
		 }
		 sb.append( " && guard ) {\n"
		 		 + "\t\ttime = millis();\n" + 
				 "\t\tstate_"+object.getNext().getName()+"();\n"
		 		 + "\t}\n");
		 return sb.toString();
	}

	public String caseSinkError(SinkError object) {
		StringBuilder sb = new StringBuilder();
		 sb.append("\tif ((digitalRead(" + object.getBasecondition().getSensor().getPin() + ") == " + object.getBasecondition().getValue() + ")");
		 if(object.getBooleancondition().size()>0) {
			 for(BooleanCondition b : object.getBooleancondition()) {
				 if(b.getOperator().getValue() == 1) {
					 sb.append(" || (digitalRead(" + b.getSensor().getPin() + ") == " + b.getValue()+ ")");
				 }
				 else {
					 sb.append(" && (digitalRead(" + b.getSensor().getPin() + ") == " + b.getValue()+ ")");
				 }
			 }
		 }
		 sb.append( " && guard ) {\n"
		 		 + "\t\ttime = millis();\n" 
				 + "\t\tsink_state("+object.getValue() + ");\n"
		 		 + "\t}\n") ;
		 return sb.toString();
	}
	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * 
	 */
	@Override
	public String defaultCase(EObject object) {
		return "";
	}
	
	public String createSinkState() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n\nvoid sink_state(int x) {\n" + "\tfor(int i = 0; i < x; i++){\n" 
		+ "\t\tdigitalWrite(13, HIGH);\n"
		+ "\t\tdelay(800);\n"
		+ "\t\tdigitalWrite(13, LOW);\n"
		+ "\t\tdelay(800);\n\t}\n"
		+ "\tdelay(1500);\n"
		+ "\tsink_state(x);\n}");
		return sb.toString();
	}
	
	public String caseComparator(Comparator object) {
		switch(object.getLiteral()) {
			case "equ":
				return "==";
			case "inf":
				return "<";
			case "sup":
				return ">";
			case "esup":
				return ">=";
			case "einf":
				return "<=";
		}
		return null;
		
	}

} //ArduinoMLSwitch
