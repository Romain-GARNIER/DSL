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
 *   <li>{@link rythmML.Note#getBeat <em>Beat</em>}</li>
 *   <li>{@link rythmML.Note#getTick <em>Tick</em>}</li>
 *   <li>{@link rythmML.Note#getBar <em>Bar</em>}</li>
 * </ul>
 *
 * @see rythmML.RythmMLPackage#getNote()
 * @model
 * @generated
 */
public interface Note extends EObject {
	/**
	 * Returns the value of the '<em><b>Beat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beat</em>' reference.
	 * @see #setBeat(Beat)
	 * @see rythmML.RythmMLPackage#getNote_Beat()
	 * @model required="true"
	 * @generated
	 */
	Beat getBeat();

	/**
	 * Sets the value of the '{@link rythmML.Note#getBeat <em>Beat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beat</em>' reference.
	 * @see #getBeat()
	 * @generated
	 */
	void setBeat(Beat value);

	/**
	 * Returns the value of the '<em><b>Tick</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tick</em>' reference.
	 * @see #setTick(Tick)
	 * @see rythmML.RythmMLPackage#getNote_Tick()
	 * @model required="true"
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

	/**
	 * Returns the value of the '<em><b>Bar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bar</em>' reference.
	 * @see #setBar(Bar)
	 * @see rythmML.RythmMLPackage#getNote_Bar()
	 * @model required="true"
	 * @generated
	 */
	Bar getBar();

	/**
	 * Sets the value of the '{@link rythmML.Note#getBar <em>Bar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bar</em>' reference.
	 * @see #getBar()
	 * @generated
	 */
	void setBar(Bar value);

} // Note
