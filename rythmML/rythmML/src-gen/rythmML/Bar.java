/**
 */
package rythmML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rythmML.Bar#getBeats <em>Beats</em>}</li>
 * </ul>
 *
 * @see rythmML.RythmMLPackage#getBar()
 * @model
 * @generated
 */
public interface Bar extends EObject {
	/**
	 * Returns the value of the '<em><b>Beats</b></em>' containment reference list.
	 * The list contents are of type {@link rythmML.Beat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beats</em>' containment reference list.
	 * @see rythmML.RythmMLPackage#getBar_Beats()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Beat> getBeats();

} // Bar
