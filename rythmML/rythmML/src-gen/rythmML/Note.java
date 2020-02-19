/**
 */
package rythmML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rythmML.Note#getValue <em>Value</em>}</li>
 *   <li>{@link rythmML.Note#getDuration <em>Duration</em>}</li>
 *   <li>{@link rythmML.Note#getTick <em>Tick</em>}</li>
 * </ul>
 *
 * @see rythmML.RythmMLPackage#getNote()
 * @model
 * @generated
 */
public interface Note extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link rythmML.NoteValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see rythmML.NoteValue
	 * @see #setValue(NoteValue)
	 * @see rythmML.RythmMLPackage#getNote_Value()
	 * @model required="true"
	 * @generated
	 */
	NoteValue getValue();

	/**
	 * Sets the value of the '{@link rythmML.Note#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see rythmML.NoteValue
	 * @see #getValue()
	 * @generated
	 */
	void setValue(NoteValue value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see rythmML.RythmMLPackage#getNote_Duration()
	 * @model required="true"
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link rythmML.Note#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Tick</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link rythmML.Tick#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tick</em>' reference.
	 * @see #setTick(Tick)
	 * @see rythmML.RythmMLPackage#getNote_Tick()
	 * @see rythmML.Tick#getNote
	 * @model opposite="note" required="true"
	 * @generated
	 */
	Tick getTick();

	/**
	 * Sets the value of the '{@link rythmML.Note#getTick <em>Tick</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tick</em>' reference.
	 * @see #getTick()
	 * @generated
	 */
	void setTick(Tick value);

} // Note
