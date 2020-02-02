/**
 */
package arduinoML.impl;

import arduinoML.ArduinoMLPackage;
import arduinoML.Comparator;
import arduinoML.Condition;
import arduinoML.Sensor;
import arduinoML.Signal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduinoML.impl.ConditionImpl#getSensor <em>Sensor</em>}</li>
 *   <li>{@link arduinoML.impl.ConditionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link arduinoML.impl.ConditionImpl#getAnalogvalue <em>Analogvalue</em>}</li>
 *   <li>{@link arduinoML.impl.ConditionImpl#getComparator <em>Comparator</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConditionImpl extends MinimalEObjectImpl.Container implements Condition {
	/**
	 * The cached value of the '{@link #getSensor() <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor()
	 * @generated
	 * @ordered
	 */
	protected Sensor sensor;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Signal VALUE_EDEFAULT = Signal.HIGH;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Signal value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnalogvalue() <em>Analogvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalogvalue()
	 * @generated
	 * @ordered
	 */
	protected static final int ANALOGVALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAnalogvalue() <em>Analogvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalogvalue()
	 * @generated
	 * @ordered
	 */
	protected int analogvalue = ANALOGVALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getComparator() <em>Comparator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparator()
	 * @generated
	 * @ordered
	 */
	protected static final Comparator COMPARATOR_EDEFAULT = Comparator.SUP;

	/**
	 * The cached value of the '{@link #getComparator() <em>Comparator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparator()
	 * @generated
	 * @ordered
	 */
	protected Comparator comparator = COMPARATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoMLPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sensor getSensor() {
		if (sensor != null && sensor.eIsProxy()) {
			InternalEObject oldSensor = (InternalEObject)sensor;
			sensor = (Sensor)eResolveProxy(oldSensor);
			if (sensor != oldSensor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoMLPackage.CONDITION__SENSOR, oldSensor, sensor));
			}
		}
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor basicGetSensor() {
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSensor(Sensor newSensor) {
		Sensor oldSensor = sensor;
		sensor = newSensor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoMLPackage.CONDITION__SENSOR, oldSensor, sensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(Signal newValue) {
		Signal oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoMLPackage.CONDITION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAnalogvalue() {
		return analogvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnalogvalue(int newAnalogvalue) {
		int oldAnalogvalue = analogvalue;
		analogvalue = newAnalogvalue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoMLPackage.CONDITION__ANALOGVALUE, oldAnalogvalue, analogvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comparator getComparator() {
		return comparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComparator(Comparator newComparator) {
		Comparator oldComparator = comparator;
		comparator = newComparator == null ? COMPARATOR_EDEFAULT : newComparator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoMLPackage.CONDITION__COMPARATOR, oldComparator, comparator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArduinoMLPackage.CONDITION__SENSOR:
				if (resolve) return getSensor();
				return basicGetSensor();
			case ArduinoMLPackage.CONDITION__VALUE:
				return getValue();
			case ArduinoMLPackage.CONDITION__ANALOGVALUE:
				return getAnalogvalue();
			case ArduinoMLPackage.CONDITION__COMPARATOR:
				return getComparator();
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
			case ArduinoMLPackage.CONDITION__SENSOR:
				setSensor((Sensor)newValue);
				return;
			case ArduinoMLPackage.CONDITION__VALUE:
				setValue((Signal)newValue);
				return;
			case ArduinoMLPackage.CONDITION__ANALOGVALUE:
				setAnalogvalue((Integer)newValue);
				return;
			case ArduinoMLPackage.CONDITION__COMPARATOR:
				setComparator((Comparator)newValue);
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
			case ArduinoMLPackage.CONDITION__SENSOR:
				setSensor((Sensor)null);
				return;
			case ArduinoMLPackage.CONDITION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ArduinoMLPackage.CONDITION__ANALOGVALUE:
				setAnalogvalue(ANALOGVALUE_EDEFAULT);
				return;
			case ArduinoMLPackage.CONDITION__COMPARATOR:
				setComparator(COMPARATOR_EDEFAULT);
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
			case ArduinoMLPackage.CONDITION__SENSOR:
				return sensor != null;
			case ArduinoMLPackage.CONDITION__VALUE:
				return value != VALUE_EDEFAULT;
			case ArduinoMLPackage.CONDITION__ANALOGVALUE:
				return analogvalue != ANALOGVALUE_EDEFAULT;
			case ArduinoMLPackage.CONDITION__COMPARATOR:
				return comparator != COMPARATOR_EDEFAULT;
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
		result.append(", analogvalue: ");
		result.append(analogvalue);
		result.append(", comparator: ");
		result.append(comparator);
		result.append(')');
		return result.toString();
	}

} //ConditionImpl
