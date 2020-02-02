/**
 */
package arduinoML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoML.Action#getValue <em>Value</em>}</li>
 *   <li>{@link arduinoML.Action#getActuator <em>Actuator</em>}</li>
 *   <li>{@link arduinoML.Action#getAnalogvalue <em>Analogvalue</em>}</li>
 * </ul>
 *
 * @see arduinoML.ArduinoMLPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link arduinoML.Signal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see arduinoML.Signal
	 * @see #setValue(Signal)
	 * @see arduinoML.ArduinoMLPackage#getAction_Value()
	 * @model
	 * @generated
	 */
	Signal getValue();

	/**
	 * Sets the value of the '{@link arduinoML.Action#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see arduinoML.Signal
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Signal value);

	/**
	 * Returns the value of the '<em><b>Actuator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator</em>' reference.
	 * @see #setActuator(Actuator)
	 * @see arduinoML.ArduinoMLPackage#getAction_Actuator()
	 * @model required="true"
	 * @generated
	 */
	Actuator getActuator();

	/**
	 * Sets the value of the '{@link arduinoML.Action#getActuator <em>Actuator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuator</em>' reference.
	 * @see #getActuator()
	 * @generated
	 */
	void setActuator(Actuator value);

	/**
	 * Returns the value of the '<em><b>Analogvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analogvalue</em>' attribute.
	 * @see #setAnalogvalue(int)
	 * @see arduinoML.ArduinoMLPackage#getAction_Analogvalue()
	 * @model
	 * @generated
	 */
	int getAnalogvalue();

	/**
	 * Sets the value of the '{@link arduinoML.Action#getAnalogvalue <em>Analogvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analogvalue</em>' attribute.
	 * @see #getAnalogvalue()
	 * @generated
	 */
	void setAnalogvalue(int value);

} // Action
