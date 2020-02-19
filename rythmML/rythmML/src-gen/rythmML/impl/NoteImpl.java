/**
 */
package rythmML.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rythmML.Bar;
import rythmML.Beat;
import rythmML.Note;
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
 *   <li>{@link rythmML.impl.NoteImpl#getBeat <em>Beat</em>}</li>
 *   <li>{@link rythmML.impl.NoteImpl#getTick <em>Tick</em>}</li>
 *   <li>{@link rythmML.impl.NoteImpl#getBar <em>Bar</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NoteImpl extends MinimalEObjectImpl.Container implements Note {
	/**
	 * The cached value of the '{@link #getBeat() <em>Beat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeat()
	 * @generated
	 * @ordered
	 */
	protected Beat beat;

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
	 * The cached value of the '{@link #getBar() <em>Bar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBar()
	 * @generated
	 * @ordered
	 */
	protected Bar bar;

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
	public Beat getBeat() {
		if (beat != null && beat.eIsProxy()) {
			InternalEObject oldBeat = (InternalEObject) beat;
			beat = (Beat) eResolveProxy(oldBeat);
			if (beat != oldBeat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RythmMLPackage.NOTE__BEAT, oldBeat,
							beat));
			}
		}
		return beat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Beat basicGetBeat() {
		return beat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeat(Beat newBeat) {
		Beat oldBeat = beat;
		beat = newBeat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RythmMLPackage.NOTE__BEAT, oldBeat, beat));
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
	@Override
	public void setTick(Tick newTick) {
		Tick oldTick = tick;
		tick = newTick;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RythmMLPackage.NOTE__TICK, oldTick, tick));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bar getBar() {
		if (bar != null && bar.eIsProxy()) {
			InternalEObject oldBar = (InternalEObject) bar;
			bar = (Bar) eResolveProxy(oldBar);
			if (bar != oldBar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RythmMLPackage.NOTE__BAR, oldBar, bar));
			}
		}
		return bar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bar basicGetBar() {
		return bar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBar(Bar newBar) {
		Bar oldBar = bar;
		bar = newBar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RythmMLPackage.NOTE__BAR, oldBar, bar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RythmMLPackage.NOTE__BEAT:
			if (resolve)
				return getBeat();
			return basicGetBeat();
		case RythmMLPackage.NOTE__TICK:
			if (resolve)
				return getTick();
			return basicGetTick();
		case RythmMLPackage.NOTE__BAR:
			if (resolve)
				return getBar();
			return basicGetBar();
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
		case RythmMLPackage.NOTE__BEAT:
			setBeat((Beat) newValue);
			return;
		case RythmMLPackage.NOTE__TICK:
			setTick((Tick) newValue);
			return;
		case RythmMLPackage.NOTE__BAR:
			setBar((Bar) newValue);
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
		case RythmMLPackage.NOTE__BEAT:
			setBeat((Beat) null);
			return;
		case RythmMLPackage.NOTE__TICK:
			setTick((Tick) null);
			return;
		case RythmMLPackage.NOTE__BAR:
			setBar((Bar) null);
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
		case RythmMLPackage.NOTE__BEAT:
			return beat != null;
		case RythmMLPackage.NOTE__TICK:
			return tick != null;
		case RythmMLPackage.NOTE__BAR:
			return bar != null;
		}
		return super.eIsSet(featureID);
	}

} //NoteImpl
