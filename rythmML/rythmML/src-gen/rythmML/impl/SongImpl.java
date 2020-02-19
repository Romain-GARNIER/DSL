/**
 */
package rythmML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rythmML.RythmMLPackage;
import rythmML.Sequence;
import rythmML.Song;
import rythmML.Track;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Song</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rythmML.impl.SongImpl#getTracks <em>Tracks</em>}</li>
 *   <li>{@link rythmML.impl.SongImpl#getSequences <em>Sequences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SongImpl extends NamedElementImpl implements Song {
	/**
	 * The cached value of the '{@link #getTracks() <em>Tracks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracks()
	 * @generated
	 * @ordered
	 */
	protected EList<Track> tracks;

	/**
	 * The cached value of the '{@link #getSequences() <em>Sequences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequences()
	 * @generated
	 * @ordered
	 */
	protected EList<Sequence> sequences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SongImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RythmMLPackage.Literals.SONG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Track> getTracks() {
		if (tracks == null) {
			tracks = new EObjectContainmentEList<Track>(Track.class, this, RythmMLPackage.SONG__TRACKS);
		}
		return tracks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Sequence> getSequences() {
		if (sequences == null) {
			sequences = new EObjectContainmentEList<Sequence>(Sequence.class, this, RythmMLPackage.SONG__SEQUENCES);
		}
		return sequences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RythmMLPackage.SONG__TRACKS:
			return ((InternalEList<?>) getTracks()).basicRemove(otherEnd, msgs);
		case RythmMLPackage.SONG__SEQUENCES:
			return ((InternalEList<?>) getSequences()).basicRemove(otherEnd, msgs);
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
		case RythmMLPackage.SONG__TRACKS:
			return getTracks();
		case RythmMLPackage.SONG__SEQUENCES:
			return getSequences();
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
		case RythmMLPackage.SONG__TRACKS:
			getTracks().clear();
			getTracks().addAll((Collection<? extends Track>) newValue);
			return;
		case RythmMLPackage.SONG__SEQUENCES:
			getSequences().clear();
			getSequences().addAll((Collection<? extends Sequence>) newValue);
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
		case RythmMLPackage.SONG__TRACKS:
			getTracks().clear();
			return;
		case RythmMLPackage.SONG__SEQUENCES:
			getSequences().clear();
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
		case RythmMLPackage.SONG__TRACKS:
			return tracks != null && !tracks.isEmpty();
		case RythmMLPackage.SONG__SEQUENCES:
			return sequences != null && !sequences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SongImpl
