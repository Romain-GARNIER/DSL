/**
 */
package arduinoML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Brick</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoML.Brick#getPin <em>Pin</em>}</li>
 *   <li>{@link arduinoML.Brick#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see arduinoML.ArduinoMLPackage#getBrick()
 * @model abstract="true"
 * @generated
 */
public interface Brick extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin</em>' attribute.
	 * @see #setPin(int)
	 * @see arduinoML.ArduinoMLPackage#getBrick_Pin()
	 * @model required="true"
	 * @generated
	 */
	int getPin();

	/**
	 * Sets the value of the '{@link arduinoML.Brick#getPin <em>Pin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin</em>' attribute.
	 * @see #getPin()
	 * @generated
	 */
	void setPin(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link arduinoML.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see arduinoML.Type
	 * @see #setType(Type)
	 * @see arduinoML.ArduinoMLPackage#getBrick_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link arduinoML.Brick#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see arduinoML.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // Brick
