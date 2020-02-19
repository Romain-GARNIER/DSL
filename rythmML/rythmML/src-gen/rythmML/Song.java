/**
 */
package rythmML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Song</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rythmML.Song#getTracks <em>Tracks</em>}</li>
 *   <li>{@link rythmML.Song#getSequences <em>Sequences</em>}</li>
 * </ul>
 *
 * @see rythmML.RythmMLPackage#getSong()
 * @model
 * @generated
 */
public interface Song extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Tracks</b></em>' containment reference list.
	 * The list contents are of type {@link rythmML.Track}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracks</em>' containment reference list.
	 * @see rythmML.RythmMLPackage#getSong_Tracks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Track> getTracks();

	/**
	 * Returns the value of the '<em><b>Sequences</b></em>' containment reference list.
	 * The list contents are of type {@link rythmML.Sequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequences</em>' containment reference list.
	 * @see rythmML.RythmMLPackage#getSong_Sequences()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Sequence> getSequences();

} // Song
