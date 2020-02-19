/**
 */
package rythmML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rythmML.Sequence#getBars <em>Bars</em>}</li>
 * </ul>
 *
 * @see rythmML.RythmMLPackage#getSequence()
 * @model
 * @generated
 */
public interface Sequence extends EObject {
	/**
	 * Returns the value of the '<em><b>Bars</b></em>' containment reference list.
	 * The list contents are of type {@link rythmML.Bar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bars</em>' containment reference list.
	 * @see rythmML.RythmMLPackage#getSequence_Bars()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Bar> getBars();

} // Sequence
