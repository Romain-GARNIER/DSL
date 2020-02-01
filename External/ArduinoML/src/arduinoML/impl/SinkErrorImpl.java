/**
 */
package arduinoML.impl;

import arduinoML.ArduinoMLPackage;
import arduinoML.BaseCondition;
import arduinoML.BooleanCondition;
import arduinoML.SinkError;

import arduinoML.State;
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
 * An implementation of the model object '<em><b>Sink Error</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoML.impl.SinkErrorImpl#getValue <em>Value</em>}</li>
 *   <li>{@link arduinoML.impl.SinkErrorImpl#getBasecondition <em>Basecondition</em>}</li>
 *   <li>{@link arduinoML.impl.SinkErrorImpl#getBooleancondition <em>Booleancondition</em>}</li>
 *   <li>{@link arduinoML.impl.SinkErrorImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SinkErrorImpl extends MinimalEObjectImpl.Container implements SinkError {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

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
	protected SinkErrorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoMLPackage.Literals.SINK_ERROR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoMLPackage.SINK_ERROR__VALUE, oldValue, value));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArduinoMLPackage.SINK_ERROR__BASECONDITION, oldBasecondition, newBasecondition);
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
				msgs = ((InternalEObject)basecondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArduinoMLPackage.SINK_ERROR__BASECONDITION, null, msgs);
			if (newBasecondition != null)
				msgs = ((InternalEObject)newBasecondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArduinoMLPackage.SINK_ERROR__BASECONDITION, null, msgs);
			msgs = basicSetBasecondition(newBasecondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoMLPackage.SINK_ERROR__BASECONDITION, newBasecondition, newBasecondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BooleanCondition> getBooleancondition() {
		if (booleancondition == null) {
			booleancondition = new EObjectContainmentEList<BooleanCondition>(BooleanCondition.class, this, ArduinoMLPackage.SINK_ERROR__BOOLEANCONDITION);
		}
		return booleancondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getState() {
		if (eContainerFeatureID() != ArduinoMLPackage.SINK_ERROR__STATE) return null;
		return (State)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState(State newState, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newState, ArduinoMLPackage.SINK_ERROR__STATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(State newState) {
		if (newState != eInternalContainer() || (eContainerFeatureID() != ArduinoMLPackage.SINK_ERROR__STATE && newState != null)) {
			if (EcoreUtil.isAncestor(this, newState))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newState != null)
				msgs = ((InternalEObject)newState).eInverseAdd(this, ArduinoMLPackage.STATE__ERRORS, State.class, msgs);
			msgs = basicSetState(newState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoMLPackage.SINK_ERROR__STATE, newState, newState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArduinoMLPackage.SINK_ERROR__STATE:
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
			case ArduinoMLPackage.SINK_ERROR__BASECONDITION:
				return basicSetBasecondition(null, msgs);
			case ArduinoMLPackage.SINK_ERROR__BOOLEANCONDITION:
				return ((InternalEList<?>)getBooleancondition()).basicRemove(otherEnd, msgs);
			case ArduinoMLPackage.SINK_ERROR__STATE:
				return basicSetState(null, msgs);
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
			case ArduinoMLPackage.SINK_ERROR__STATE:
				return eInternalContainer().eInverseRemove(this, ArduinoMLPackage.STATE__ERRORS, State.class, msgs);
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
			case ArduinoMLPackage.SINK_ERROR__VALUE:
				return getValue();
			case ArduinoMLPackage.SINK_ERROR__BASECONDITION:
				return getBasecondition();
			case ArduinoMLPackage.SINK_ERROR__BOOLEANCONDITION:
				return getBooleancondition();
			case ArduinoMLPackage.SINK_ERROR__STATE:
				return getState();
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
			case ArduinoMLPackage.SINK_ERROR__VALUE:
				setValue((Integer)newValue);
				return;
			case ArduinoMLPackage.SINK_ERROR__BASECONDITION:
				setBasecondition((BaseCondition)newValue);
				return;
			case ArduinoMLPackage.SINK_ERROR__BOOLEANCONDITION:
				getBooleancondition().clear();
				getBooleancondition().addAll((Collection<? extends BooleanCondition>)newValue);
				return;
			case ArduinoMLPackage.SINK_ERROR__STATE:
				setState((State)newValue);
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
			case ArduinoMLPackage.SINK_ERROR__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ArduinoMLPackage.SINK_ERROR__BASECONDITION:
				setBasecondition((BaseCondition)null);
				return;
			case ArduinoMLPackage.SINK_ERROR__BOOLEANCONDITION:
				getBooleancondition().clear();
				return;
			case ArduinoMLPackage.SINK_ERROR__STATE:
				setState((State)null);
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
			case ArduinoMLPackage.SINK_ERROR__VALUE:
				return value != VALUE_EDEFAULT;
			case ArduinoMLPackage.SINK_ERROR__BASECONDITION:
				return basecondition != null;
			case ArduinoMLPackage.SINK_ERROR__BOOLEANCONDITION:
				return booleancondition != null && !booleancondition.isEmpty();
			case ArduinoMLPackage.SINK_ERROR__STATE:
				return getState() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //SinkErrorImpl
