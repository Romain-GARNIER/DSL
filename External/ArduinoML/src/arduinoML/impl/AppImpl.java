/**
 */
package arduinoML.impl;

import arduinoML.App;
import arduinoML.ArduinoMLPackage;
import arduinoML.Brick;
import arduinoML.State;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoML.impl.AppImpl#getBricks <em>Bricks</em>}</li>
 *   <li>{@link arduinoML.impl.AppImpl#getStates <em>States</em>}</li>
 *   <li>{@link arduinoML.impl.AppImpl#getInitial <em>Initial</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppImpl extends NamedElementImpl implements App {
	/**
	 * The cached value of the '{@link #getBricks() <em>Bricks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBricks()
	 * @generated
	 * @ordered
	 */
	protected EList<Brick> bricks;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getInitial() <em>Initial</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial()
	 * @generated
	 * @ordered
	 */
	protected State initial;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoMLPackage.Literals.APP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Brick> getBricks() {
		if (bricks == null) {
			bricks = new EObjectContainmentEList<Brick>(Brick.class, this, ArduinoMLPackage.APP__BRICKS);
		}
		return bricks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, ArduinoMLPackage.APP__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getInitial() {
		if (initial != null && initial.eIsProxy()) {
			InternalEObject oldInitial = (InternalEObject)initial;
			initial = (State)eResolveProxy(oldInitial);
			if (initial != oldInitial) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoMLPackage.APP__INITIAL, oldInitial, initial));
			}
		}
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetInitial() {
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitial(State newInitial) {
		State oldInitial = initial;
		initial = newInitial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoMLPackage.APP__INITIAL, oldInitial, initial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoMLPackage.APP__BRICKS:
				return ((InternalEList<?>)getBricks()).basicRemove(otherEnd, msgs);
			case ArduinoMLPackage.APP__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArduinoMLPackage.APP__BRICKS:
				return getBricks();
			case ArduinoMLPackage.APP__STATES:
				return getStates();
			case ArduinoMLPackage.APP__INITIAL:
				if (resolve) return getInitial();
				return basicGetInitial();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArduinoMLPackage.APP__BRICKS:
				getBricks().clear();
				getBricks().addAll((Collection<? extends Brick>)newValue);
				return;
			case ArduinoMLPackage.APP__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case ArduinoMLPackage.APP__INITIAL:
				setInitial((State)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ArduinoMLPackage.APP__BRICKS:
				getBricks().clear();
				return;
			case ArduinoMLPackage.APP__STATES:
				getStates().clear();
				return;
			case ArduinoMLPackage.APP__INITIAL:
				setInitial((State)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ArduinoMLPackage.APP__BRICKS:
				return bricks != null && !bricks.isEmpty();
			case ArduinoMLPackage.APP__STATES:
				return states != null && !states.isEmpty();
			case ArduinoMLPackage.APP__INITIAL:
				return initial != null;
		}
		return super.eIsSet(featureID);
	}

} //AppImpl
