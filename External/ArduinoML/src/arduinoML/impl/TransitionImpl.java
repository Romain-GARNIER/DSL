/**
 */
package arduinoML.impl;

import arduinoML.ArduinoMLPackage;
import arduinoML.BaseCondition;
import arduinoML.BooleanCondition;
import arduinoML.State;
import arduinoML.Transition;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoML.impl.TransitionImpl#getNext <em>Next</em>}</li>
 *   <li>{@link arduinoML.impl.TransitionImpl#getState <em>State</em>}</li>
 *   <li>{@link arduinoML.impl.TransitionImpl#getBasecondition <em>Basecondition</em>}</li>
 *   <li>{@link arduinoML.impl.TransitionImpl#getBooleancondition <em>Booleancondition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected State next;

	/**
	 * The cached value of the '{@link #getBasecondition() <em>Basecondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasecondition()
	 * @generated
	 * @ordered
	 */
	protected BaseCondition basecondition;

	/**
	 * The cached value of the '{@link #getBooleancondition() <em>Booleancondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleancondition()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanCondition> booleancondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoMLPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (State)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoMLPackage.TRANSITION__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNext(State newNext) {
		State oldNext = next;
		next = newNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoMLPackage.TRANSITION__NEXT, oldNext, next));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getState() {
		if (eContainerFeatureID() != ArduinoMLPackage.TRANSITION__STATE) return null;
		return (State)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState(State newState, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newState, ArduinoMLPackage.TRANSITION__STATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(State newState) {
		if (newState != eInternalContainer() || (eContainerFeatureID() != ArduinoMLPackage.TRANSITION__STATE && newState != null)) {
			if (EcoreUtil.isAncestor(this, newState))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newState != null)
				msgs = ((InternalEObject)newState).eInverseAdd(this, ArduinoMLPackage.STATE__TRANSITIONS, State.class, msgs);
			msgs = basicSetState(newState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoMLPackage.TRANSITION__STATE, newState, newState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseCondition getBasecondition() {
		return basecondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasecondition(BaseCondition newBasecondition, NotificationChain msgs) {
		BaseCondition oldBasecondition = basecondition;
		basecondition = newBasecondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArduinoMLPackage.TRANSITION__BASECONDITION, oldBasecondition, newBasecondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBasecondition(BaseCondition newBasecondition) {
		if (newBasecondition != basecondition) {
			NotificationChain msgs = null;
			if (basecondition != null)
				msgs = ((InternalEObject)basecondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArduinoMLPackage.TRANSITION__BASECONDITION, null, msgs);
			if (newBasecondition != null)
				msgs = ((InternalEObject)newBasecondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArduinoMLPackage.TRANSITION__BASECONDITION, null, msgs);
			msgs = basicSetBasecondition(newBasecondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoMLPackage.TRANSITION__BASECONDITION, newBasecondition, newBasecondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BooleanCondition> getBooleancondition() {
		if (booleancondition == null) {
			booleancondition = new EObjectContainmentEList<BooleanCondition>(BooleanCondition.class, this, ArduinoMLPackage.TRANSITION__BOOLEANCONDITION);
		}
		return booleancondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoMLPackage.TRANSITION__STATE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetState((State)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoMLPackage.TRANSITION__STATE:
				return basicSetState(null, msgs);
			case ArduinoMLPackage.TRANSITION__BASECONDITION:
				return basicSetBasecondition(null, msgs);
			case ArduinoMLPackage.TRANSITION__BOOLEANCONDITION:
				return ((InternalEList<?>)getBooleancondition()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ArduinoMLPackage.TRANSITION__STATE:
				return eInternalContainer().eInverseRemove(this, ArduinoMLPackage.STATE__TRANSITIONS, State.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArduinoMLPackage.TRANSITION__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case ArduinoMLPackage.TRANSITION__STATE:
				return getState();
			case ArduinoMLPackage.TRANSITION__BASECONDITION:
				return getBasecondition();
			case ArduinoMLPackage.TRANSITION__BOOLEANCONDITION:
				return getBooleancondition();
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
			case ArduinoMLPackage.TRANSITION__NEXT:
				setNext((State)newValue);
				return;
			case ArduinoMLPackage.TRANSITION__STATE:
				setState((State)newValue);
				return;
			case ArduinoMLPackage.TRANSITION__BASECONDITION:
				setBasecondition((BaseCondition)newValue);
				return;
			case ArduinoMLPackage.TRANSITION__BOOLEANCONDITION:
				getBooleancondition().clear();
				getBooleancondition().addAll((Collection<? extends BooleanCondition>)newValue);
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
			case ArduinoMLPackage.TRANSITION__NEXT:
				setNext((State)null);
				return;
			case ArduinoMLPackage.TRANSITION__STATE:
				setState((State)null);
				return;
			case ArduinoMLPackage.TRANSITION__BASECONDITION:
				setBasecondition((BaseCondition)null);
				return;
			case ArduinoMLPackage.TRANSITION__BOOLEANCONDITION:
				getBooleancondition().clear();
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
			case ArduinoMLPackage.TRANSITION__NEXT:
				return next != null;
			case ArduinoMLPackage.TRANSITION__STATE:
				return getState() != null;
			case ArduinoMLPackage.TRANSITION__BASECONDITION:
				return basecondition != null;
			case ArduinoMLPackage.TRANSITION__BOOLEANCONDITION:
				return booleancondition != null && !booleancondition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransitionImpl
