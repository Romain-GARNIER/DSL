/**
 */
package rythmML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import rythmML.Note;
import rythmML.NoteValue;
import rythmML.RythmMLPackage;
import rythmML.Tick;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rythmML.impl.NoteImpl#getValue <em>Value</em>}</li>
 *   <li>{@link rythmML.impl.NoteImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link rythmML.impl.NoteImpl#getTick <em>Tick</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NoteImpl extends MinimalEObjectImpl.Container implements Note {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final NoteValue VALUE_EDEFAULT = NoteValue.DO;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected NoteValue value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTick() <em>Tick</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTick()
	 * @generated
	 * @ordered
	 */
	protected Tick tick;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RythmMLPackage.Literals.NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoteValue getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(NoteValue newValue) {
		NoteValue oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RythmMLPackage.NOTE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RythmMLPackage.NOTE__DURATION, oldDuration,
					duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tick getTick() {
		if (tick != null && tick.eIsProxy()) {
			InternalEObject oldTick = (InternalEObject) tick;
			tick = (Tick) eResolveProxy(oldTick);
			if (tick != oldTick) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RythmMLPackage.NOTE__TICK, oldTick,
							tick));
			}
		}
		return tick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tick basicGetTick() {
		return tick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTick(Tick newTick, NotificationChain msgs) {
		Tick oldTick = tick;
		tick = newTick;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RythmMLPackage.NOTE__TICK,
					oldTick, newTick);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTick(Tick newTick) {
		if (newTick != tick) {
			NotificationChain msgs = null;
			if (tick != null)
				msgs = ((InternalEObject) tick).eInverseRemove(this, RythmMLPackage.TICK__NOTE, Tick.class, msgs);
			if (newTick != null)
				msgs = ((InternalEObject) newTick).eInverseAdd(this, RythmMLPackage.TICK__NOTE, Tick.class, msgs);
			msgs = basicSetTick(newTick, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RythmMLPackage.NOTE__TICK, newTick, newTick));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RythmMLPackage.NOTE__TICK:
			if (tick != null)
				msgs = ((InternalEObject) tick).eInverseRemove(this, RythmMLPackage.TICK__NOTE, Tick.class, msgs);
			return basicSetTick((Tick) otherEnd, msgs);
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
		case RythmMLPackage.NOTE__TICK:
			return basicSetTick(null, msgs);
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
		case RythmMLPackage.NOTE__VALUE:
			return getValue();
		case RythmMLPackage.NOTE__DURATION:
			return getDuration();
		case RythmMLPackage.NOTE__TICK:
			if (resolve)
				return getTick();
			return basicGetTick();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RythmMLPackage.NOTE__VALUE:
			setValue((NoteValue) newValue);
			return;
		case RythmMLPackage.NOTE__DURATION:
			setDuration((Integer) newValue);
			return;
		case RythmMLPackage.NOTE__TICK:
			setTick((Tick) newValue);
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
		case RythmMLPackage.NOTE__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case RythmMLPackage.NOTE__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case RythmMLPackage.NOTE__TICK:
			setTick((Tick) null);
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
		case RythmMLPackage.NOTE__VALUE:
			return value != VALUE_EDEFAULT;
		case RythmMLPackage.NOTE__DURATION:
			return duration != DURATION_EDEFAULT;
		case RythmMLPackage.NOTE__TICK:
			return tick != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(", duration: ");
		result.append(duration);
		result.append(')');
		return result.toString();
	}

} //NoteImpl
