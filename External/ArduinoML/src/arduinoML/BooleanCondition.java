/**
 */
package arduinoML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduinoML.BooleanCondition#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see arduinoML.ArduinoMLPackage#getBooleanCondition()
 * @model
 * @generated
 */
public interface BooleanCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The default value is <code>"OR"</code>.
	 * The literals are from the enumeration {@link arduinoML.Operator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see arduinoML.Operator
	 * @see #setOperator(Operator)
	 * @see arduinoML.ArduinoMLPackage#getBooleanCondition_Operator()
	 * @model default="OR" required="true"
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link arduinoML.BooleanCondition#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see arduinoML.Operator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

} // BooleanCondition
