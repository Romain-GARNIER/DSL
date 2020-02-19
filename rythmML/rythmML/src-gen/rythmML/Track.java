/**
 */
package rythmML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rythmML.Track#getInstrument <em>Instrument</em>}</li>
 *   <li>{@link rythmML.Track#getId <em>Id</em>}</li>
 *   <li>{@link rythmML.Track#getSequences <em>Sequences</em>}</li>
 * </ul>
 *
 * @see rythmML.RythmMLPackage#getTrack()
 * @model
 * @generated
 */
public interface Track extends EObject {
	/**
	 * Returns the value of the '<em><b>Instrument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instrument</em>' reference.
	 * @see #setInstrument(Instrument)
	 * @see rythmML.RythmMLPackage#getTrack_Instrument()
	 * @model required="true"
	 * @generated
	 */
	Instrument getInstrument();

	/**
	 * Sets the value of the '{@link rythmML.Track#getInstrument <em>Instrument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instrument</em>' reference.
	 * @see #getInstrument()
	 * @generated
	 */
	void setInstrument(Instrument value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see rythmML.RythmMLPackage#getTrack_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link rythmML.Track#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Sequences</b></em>' containment reference list.
	 * The list contents are of type {@link rythmML.Sequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequences</em>' containment reference list.
	 * @see rythmML.RythmMLPackage#getTrack_Sequences()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Sequence> getSequences();

} // Track
