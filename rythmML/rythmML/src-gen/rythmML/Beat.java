/**
 */
package rythmML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Beat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rythmML.Beat#getTicks <em>Ticks</em>}</li>
 *   <li>{@link rythmML.Beat#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see rythmML.RythmMLPackage#getBeat()
 * @model
 * @generated
 */
public interface Beat extends EObject {
	/**
	 * Returns the value of the '<em><b>Ticks</b></em>' containment reference list.
	 * The list contents are of type {@link rythmML.Tick}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ticks</em>' containment reference list.
	 * @see rythmML.RythmMLPackage#getBeat_Ticks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Tick> getTicks();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see rythmML.RythmMLPackage#getBeat_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link rythmML.Beat#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // Beat
