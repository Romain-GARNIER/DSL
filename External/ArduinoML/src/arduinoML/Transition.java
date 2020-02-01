/**
 */
package arduinoML;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoML.Transition#getNext <em>Next</em>}</li>
 *   <li>{@link arduinoML.Transition#getState <em>State</em>}</li>
 *   <li>{@link arduinoML.Transition#getBasecondition <em>Basecondition</em>}</li>
 *   <li>{@link arduinoML.Transition#getBooleancondition <em>Booleancondition</em>}</li>
 * </ul>
 *
 * @see arduinoML.ArduinoMLPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(State)
	 * @see arduinoML.ArduinoMLPackage#getTransition_Next()
	 * @model required="true"
	 * @generated
	 */
	State getNext();

	/**
	 * Sets the value of the '{@link arduinoML.Transition#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(State value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link arduinoML.State#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see arduinoML.ArduinoMLPackage#getTransition_State()
	 * @see arduinoML.State#getTransitions
	 * @model opposite="transitions" required="true" transient="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link arduinoML.Transition#getState <em>State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' container reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Basecondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basecondition</em>' containment reference.
	 * @see #setBasecondition(BaseCondition)
	 * @see arduinoML.ArduinoMLPackage#getTransition_Basecondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BaseCondition getBasecondition();

	/**
	 * Sets the value of the '{@link arduinoML.Transition#getBasecondition <em>Basecondition</em>}' containment reference.
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
	 * @see arduinoML.ArduinoMLPackage#getTransition_Booleancondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<BooleanCondition> getBooleancondition();

} // Transition
