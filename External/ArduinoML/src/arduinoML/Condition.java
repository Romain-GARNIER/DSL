/**
 */
package arduinoML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoML.Condition#getSensor <em>Sensor</em>}</li>
 *   <li>{@link arduinoML.Condition#getValue <em>Value</em>}</li>
 *   <li>{@link arduinoML.Condition#getAnalogvalue <em>Analogvalue</em>}</li>
 *   <li>{@link arduinoML.Condition#getComparator <em>Comparator</em>}</li>
 * </ul>
 *
 * @see arduinoML.ArduinoMLPackage#getCondition()
 * @model abstract="true"
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' reference.
	 * @see #setSensor(Sensor)
	 * @see arduinoML.ArduinoMLPackage#getCondition_Sensor()
	 * @model required="true"
	 * @generated
	 */
	Sensor getSensor();

	/**
	 * Sets the value of the '{@link arduinoML.Condition#getSensor <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(Sensor value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link arduinoML.Signal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see arduinoML.Signal
	 * @see #setValue(Signal)
	 * @see arduinoML.ArduinoMLPackage#getCondition_Value()
	 * @model
	 * @generated
	 */
	Signal getValue();

	/**
	 * Sets the value of the '{@link arduinoML.Condition#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see arduinoML.Signal
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Signal value);

	/**
	 * Returns the value of the '<em><b>Analogvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analogvalue</em>' attribute.
	 * @see #setAnalogvalue(int)
	 * @see arduinoML.ArduinoMLPackage#getCondition_Analogvalue()
	 * @model
	 * @generated
	 */
	int getAnalogvalue();

	/**
	 * Sets the value of the '{@link arduinoML.Condition#getAnalogvalue <em>Analogvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analogvalue</em>' attribute.
	 * @see #getAnalogvalue()
	 * @generated
	 */
	void setAnalogvalue(int value);

	/**
	 * Returns the value of the '<em><b>Comparator</b></em>' attribute.
	 * The literals are from the enumeration {@link arduinoML.Comparator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparator</em>' attribute.
	 * @see arduinoML.Comparator
	 * @see #setComparator(Comparator)
	 * @see arduinoML.ArduinoMLPackage#getCondition_Comparator()
	 * @model required="true"
	 * @generated
	 */
	Comparator getComparator();

	/**
	 * Sets the value of the '{@link arduinoML.Condition#getComparator <em>Comparator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparator</em>' attribute.
	 * @see arduinoML.Comparator
	 * @see #getComparator()
	 * @generated
	 */
	void setComparator(Comparator value);

} // Condition
