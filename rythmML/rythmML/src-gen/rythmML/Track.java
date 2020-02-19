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
 *   <li>{@link rythmML.Track#getSequences <em>Sequences</em>}</li>
 * </ul>
 *
 * @see rythmML.RythmMLPackage#getTrack()
 * @model
 * @generated
 */
public interface Track extends EObject {
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
