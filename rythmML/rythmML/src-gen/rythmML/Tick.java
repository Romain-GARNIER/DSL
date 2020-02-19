/**
 */
package rythmML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tick</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rythmML.Tick#getNote <em>Note</em>}</li>
 *   <li>{@link rythmML.Tick#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see rythmML.RythmMLPackage#getTick()
 * @model
 * @generated
 */
public interface Tick extends EObject {

	/**
	 * Returns the value of the '<em><b>Note</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link rythmML.Note#getTick <em>Tick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' reference.
	 * @see #setNote(Note)
	 * @see rythmML.RythmMLPackage#getTick_Note()
	 * @see rythmML.Note#getTick
	 * @model opposite="tick"
	 * @generated
	 */
	Note getNote();

	/**
	 * Sets the value of the '{@link rythmML.Tick#getNote <em>Note</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' reference.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(Note value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see rythmML.RythmMLPackage#getTick_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link rythmML.Tick#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);
} // Tick
