/**
 */
package rythmML;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see rythmML.RythmMLFactory
 * @model kind="package"
 * @generated
 */
public interface RythmMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rythmML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/rythmML";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rythmML";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RythmMLPackage eINSTANCE = rythmML.impl.RythmMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link rythmML.impl.SongImpl <em>Song</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rythmML.impl.SongImpl
	 * @see rythmML.impl.RythmMLPackageImpl#getSong()
	 * @generated
	 */
	int SONG = 0;

	/**
	 * The feature id for the '<em><b>Tracks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG__TRACKS = 0;

	/**
	 * The number of structural features of the '<em>Song</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Song</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rythmML.impl.TrackImpl <em>Track</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rythmML.impl.TrackImpl
	 * @see rythmML.impl.RythmMLPackageImpl#getTrack()
	 * @generated
	 */
	int TRACK = 1;

	/**
	 * The feature id for the '<em><b>Sequences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__SEQUENCES = 0;

	/**
	 * The number of structural features of the '<em>Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rythmML.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rythmML.impl.SequenceImpl
	 * @see rythmML.impl.RythmMLPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 2;

	/**
	 * The feature id for the '<em><b>Bars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__BARS = 0;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rythmML.impl.BarImpl <em>Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rythmML.impl.BarImpl
	 * @see rythmML.impl.RythmMLPackageImpl#getBar()
	 * @generated
	 */
	int BAR = 3;

	/**
	 * The feature id for the '<em><b>Beats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR__BEATS = 0;

	/**
	 * The number of structural features of the '<em>Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rythmML.impl.BeatImpl <em>Beat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rythmML.impl.BeatImpl
	 * @see rythmML.impl.RythmMLPackageImpl#getBeat()
	 * @generated
	 */
	int BEAT = 4;

	/**
	 * The feature id for the '<em><b>Ticks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAT__TICKS = 0;

	/**
	 * The number of structural features of the '<em>Beat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Beat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rythmML.impl.TickImpl <em>Tick</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rythmML.impl.TickImpl
	 * @see rythmML.impl.RythmMLPackageImpl#getTick()
	 * @generated
	 */
	int TICK = 5;

	/**
	 * The number of structural features of the '<em>Tick</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Tick</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TICK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rythmML.impl.NoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rythmML.impl.NoteImpl
	 * @see rythmML.impl.RythmMLPackageImpl#getNote()
	 * @generated
	 */
	int NOTE = 6;

	/**
	 * The feature id for the '<em><b>Beat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__BEAT = 0;

	/**
	 * The feature id for the '<em><b>Tick</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__TICK = 1;

	/**
	 * The feature id for the '<em><b>Bar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__BAR = 2;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rythmML.impl.NewEClass8Impl <em>New EClass8</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rythmML.impl.NewEClass8Impl
	 * @see rythmML.impl.RythmMLPackageImpl#getNewEClass8()
	 * @generated
	 */
	int NEW_ECLASS8 = 7;

	/**
	 * The number of structural features of the '<em>New EClass8</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ECLASS8_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>New EClass8</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ECLASS8_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rythmML.Value <em>Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rythmML.Value
	 * @see rythmML.impl.RythmMLPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 8;

	/**
	 * Returns the meta object for class '{@link rythmML.Song <em>Song</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Song</em>'.
	 * @see rythmML.Song
	 * @generated
	 */
	EClass getSong();

	/**
	 * Returns the meta object for the containment reference list '{@link rythmML.Song#getTracks <em>Tracks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tracks</em>'.
	 * @see rythmML.Song#getTracks()
	 * @see #getSong()
	 * @generated
	 */
	EReference getSong_Tracks();

	/**
	 * Returns the meta object for class '{@link rythmML.Track <em>Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Track</em>'.
	 * @see rythmML.Track
	 * @generated
	 */
	EClass getTrack();

	/**
	 * Returns the meta object for the containment reference list '{@link rythmML.Track#getSequences <em>Sequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequences</em>'.
	 * @see rythmML.Track#getSequences()
	 * @see #getTrack()
	 * @generated
	 */
	EReference getTrack_Sequences();

	/**
	 * Returns the meta object for class '{@link rythmML.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see rythmML.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link rythmML.Sequence#getBars <em>Bars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bars</em>'.
	 * @see rythmML.Sequence#getBars()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Bars();

	/**
	 * Returns the meta object for class '{@link rythmML.Bar <em>Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bar</em>'.
	 * @see rythmML.Bar
	 * @generated
	 */
	EClass getBar();

	/**
	 * Returns the meta object for the containment reference list '{@link rythmML.Bar#getBeats <em>Beats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Beats</em>'.
	 * @see rythmML.Bar#getBeats()
	 * @see #getBar()
	 * @generated
	 */
	EReference getBar_Beats();

	/**
	 * Returns the meta object for class '{@link rythmML.Beat <em>Beat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Beat</em>'.
	 * @see rythmML.Beat
	 * @generated
	 */
	EClass getBeat();

	/**
	 * Returns the meta object for the containment reference list '{@link rythmML.Beat#getTicks <em>Ticks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ticks</em>'.
	 * @see rythmML.Beat#getTicks()
	 * @see #getBeat()
	 * @generated
	 */
	EReference getBeat_Ticks();

	/**
	 * Returns the meta object for class '{@link rythmML.Tick <em>Tick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tick</em>'.
	 * @see rythmML.Tick
	 * @generated
	 */
	EClass getTick();

	/**
	 * Returns the meta object for class '{@link rythmML.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see rythmML.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for the reference '{@link rythmML.Note#getBeat <em>Beat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Beat</em>'.
	 * @see rythmML.Note#getBeat()
	 * @see #getNote()
	 * @generated
	 */
	EReference getNote_Beat();

	/**
	 * Returns the meta object for the reference '{@link rythmML.Note#getTick <em>Tick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tick</em>'.
	 * @see rythmML.Note#getTick()
	 * @see #getNote()
	 * @generated
	 */
	EReference getNote_Tick();

	/**
	 * Returns the meta object for the reference '{@link rythmML.Note#getBar <em>Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bar</em>'.
	 * @see rythmML.Note#getBar()
	 * @see #getNote()
	 * @generated
	 */
	EReference getNote_Bar();

	/**
	 * Returns the meta object for class '{@link rythmML.NewEClass8 <em>New EClass8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New EClass8</em>'.
	 * @see rythmML.NewEClass8
	 * @generated
	 */
	EClass getNewEClass8();

	/**
	 * Returns the meta object for enum '{@link rythmML.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Value</em>'.
	 * @see rythmML.Value
	 * @generated
	 */
	EEnum getValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RythmMLFactory getRythmMLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link rythmML.impl.SongImpl <em>Song</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rythmML.impl.SongImpl
		 * @see rythmML.impl.RythmMLPackageImpl#getSong()
		 * @generated
		 */
		EClass SONG = eINSTANCE.getSong();

		/**
		 * The meta object literal for the '<em><b>Tracks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SONG__TRACKS = eINSTANCE.getSong_Tracks();

		/**
		 * The meta object literal for the '{@link rythmML.impl.TrackImpl <em>Track</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rythmML.impl.TrackImpl
		 * @see rythmML.impl.RythmMLPackageImpl#getTrack()
		 * @generated
		 */
		EClass TRACK = eINSTANCE.getTrack();

		/**
		 * The meta object literal for the '<em><b>Sequences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACK__SEQUENCES = eINSTANCE.getTrack_Sequences();

		/**
		 * The meta object literal for the '{@link rythmML.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rythmML.impl.SequenceImpl
		 * @see rythmML.impl.RythmMLPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Bars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__BARS = eINSTANCE.getSequence_Bars();

		/**
		 * The meta object literal for the '{@link rythmML.impl.BarImpl <em>Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rythmML.impl.BarImpl
		 * @see rythmML.impl.RythmMLPackageImpl#getBar()
		 * @generated
		 */
		EClass BAR = eINSTANCE.getBar();

		/**
		 * The meta object literal for the '<em><b>Beats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAR__BEATS = eINSTANCE.getBar_Beats();

		/**
		 * The meta object literal for the '{@link rythmML.impl.BeatImpl <em>Beat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rythmML.impl.BeatImpl
		 * @see rythmML.impl.RythmMLPackageImpl#getBeat()
		 * @generated
		 */
		EClass BEAT = eINSTANCE.getBeat();

		/**
		 * The meta object literal for the '<em><b>Ticks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEAT__TICKS = eINSTANCE.getBeat_Ticks();

		/**
		 * The meta object literal for the '{@link rythmML.impl.TickImpl <em>Tick</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rythmML.impl.TickImpl
		 * @see rythmML.impl.RythmMLPackageImpl#getTick()
		 * @generated
		 */
		EClass TICK = eINSTANCE.getTick();

		/**
		 * The meta object literal for the '{@link rythmML.impl.NoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rythmML.impl.NoteImpl
		 * @see rythmML.impl.RythmMLPackageImpl#getNote()
		 * @generated
		 */
		EClass NOTE = eINSTANCE.getNote();

		/**
		 * The meta object literal for the '<em><b>Beat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTE__BEAT = eINSTANCE.getNote_Beat();

		/**
		 * The meta object literal for the '<em><b>Tick</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTE__TICK = eINSTANCE.getNote_Tick();

		/**
		 * The meta object literal for the '<em><b>Bar</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTE__BAR = eINSTANCE.getNote_Bar();

		/**
		 * The meta object literal for the '{@link rythmML.impl.NewEClass8Impl <em>New EClass8</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rythmML.impl.NewEClass8Impl
		 * @see rythmML.impl.RythmMLPackageImpl#getNewEClass8()
		 * @generated
		 */
		EClass NEW_ECLASS8 = eINSTANCE.getNewEClass8();

		/**
		 * The meta object literal for the '{@link rythmML.Value <em>Value</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rythmML.Value
		 * @see rythmML.impl.RythmMLPackageImpl#getValue()
		 * @generated
		 */
		EEnum VALUE = eINSTANCE.getValue();

	}

} //RythmMLPackage
