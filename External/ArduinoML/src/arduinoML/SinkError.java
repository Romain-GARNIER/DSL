/**
 */
package arduinoML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sink Error</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoML.SinkError#getValue <em>Value</em>}</li>
 *   <li>{@link arduinoML.SinkError#getBasecondition <em>Basecondition</em>}</li>
 *   <li>{@link arduinoML.SinkError#getBooleancondition <em>Booleancondition</em>}</li>
 *   <li>{@link arduinoML.SinkError#getState <em>State</em>}</li>
 * </ul>
 *
 * @see arduinoML.ArduinoMLPackage#getSinkError()
 * @model
 * @generated
 */
public interface SinkError extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see arduinoML.ArduinoMLPackage#getSinkError_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link arduinoML.SinkError#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Basecondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basecondition</em>' containment reference.
	 * @see #setBasecondition(BaseCondition)
	 * @see arduinoML.ArduinoMLPackage#getSinkError_Basecondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BaseCondition getBasecondition();

	/**
	 * Sets the value of the '{@link arduinoML.SinkError#getBasecondition <em>Basecondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basecondition</em>' containment reference.
	 * @see #getBasecondition()
	 * @generated
	 */
	void setBasecondition(BaseCondition value);

	/**
	 * Returns the value of the '<em><b>Booleancondition</b></em>' containment reference list.
	 * The list contents are of type {@link arduinoML.BooleanCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booleancondition</em>' containment reference list.
	 * @see arduinoML.ArduinoMLPackage#getSinkError_Booleancondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<BooleanCondition> getBooleancondition();

	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link arduinoML.State#getErrors <em>Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see arduinoML.ArduinoMLPackage#getSinkError_State()
	 * @see arduinoML.State#getErrors
	 * @model opposite="errors" required="true" transient="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link arduinoML.SinkError#getState <em>State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' container reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

} // SinkError
