/**
 */
package rythmML;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Note Value</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rythmML.RythmMLPackage#getNoteValue()
 * @model
 * @generated
 */
public enum NoteValue implements Enumerator {
	/**
	 * The '<em><b>DO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DO_VALUE
	 * @generated
	 * @ordered
	 */
	DO(0, "DO", "DO"),

	/**
	 * The '<em><b>DOd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOD_VALUE
	 * @generated
	 * @ordered
	 */
	DOD(1, "DOd", "DOd"),

	/**
	 * The '<em><b>RE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RE_VALUE
	 * @generated
	 * @ordered
	 */
	RE(2, "RE", "RE"),

	/**
	 * The '<em><b>REd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RED_VALUE
	 * @generated
	 * @ordered
	 */
	RED(3, "REd", "REd"),

	/**
	 * The '<em><b>MI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MI_VALUE
	 * @generated
	 * @ordered
	 */
	MI(4, "MI", "MI"),

	/**
	 * The '<em><b>FA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FA_VALUE
	 * @generated
	 * @ordered
	 */
	FA(5, "FA", "FA"),

	/**
	 * The '<em><b>FAd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAD_VALUE
	 * @generated
	 * @ordered
	 */
	FAD(6, "FAd", "FAd"),

	/**
	 * The '<em><b>SOL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOL_VALUE
	 * @generated
	 * @ordered
	 */
	SOL(7, "SOL", "SOL"),

	/**
	 * The '<em><b>SO Ld</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SO_LD_VALUE
	 * @generated
	 * @ordered
	 */
	SO_LD(8, "SOLd", "SOLd"),

	/**
	 * The '<em><b>LA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LA_VALUE
	 * @generated
	 * @ordered
	 */
	LA(9, "LA", "LA"),

	/**
	 * The '<em><b>LAd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAD_VALUE
	 * @generated
	 * @ordered
	 */
	LAD(10, "LAd", "LAd"),

	/**
	 * The '<em><b>SI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SI_VALUE
	 * @generated
	 * @ordered
	 */
	SI(11, "SI", "SI");

	/**
	 * The '<em><b>DO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DO_VALUE = 0;

	/**
	 * The '<em><b>DOd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOD
	 * @model name="DOd"
	 * @generated
	 * @ordered
	 */
	public static final int DOD_VALUE = 1;

	/**
	 * The '<em><b>RE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RE_VALUE = 2;

	/**
	 * The '<em><b>REd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RED
	 * @model name="REd"
	 * @generated
	 * @ordered
	 */
	public static final int RED_VALUE = 3;

	/**
	 * The '<em><b>MI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MI_VALUE = 4;

	/**
	 * The '<em><b>FA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FA_VALUE = 5;

	/**
	 * The '<em><b>FAd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAD
	 * @model name="FAd"
	 * @generated
	 * @ordered
	 */
	public static final int FAD_VALUE = 6;

	/**
	 * The '<em><b>SOL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOL_VALUE = 7;

	/**
	 * The '<em><b>SO Ld</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SO_LD
	 * @model name="SOLd"
	 * @generated
	 * @ordered
	 */
	public static final int SO_LD_VALUE = 8;

	/**
	 * The '<em><b>LA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LA_VALUE = 9;

	/**
	 * The '<em><b>LAd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAD
	 * @model name="LAd"
	 * @generated
	 * @ordered
	 */
	public static final int LAD_VALUE = 10;

	/**
	 * The '<em><b>SI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SI_VALUE = 11;

	/**
	 * An array of all the '<em><b>Note Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NoteValue[] VALUES_ARRAY = new NoteValue[] { DO, DOD, RE, RED, MI, FA, FAD, SOL, SO_LD, LA,
			LAD, SI, };

	/**
	 * A public read-only list of all the '<em><b>Note Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NoteValue> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Note Value</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NoteValue get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NoteValue result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Note Value</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NoteValue getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NoteValue result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Note Value</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NoteValue get(int value) {
		switch (value) {
		case DO_VALUE:
			return DO;
		case DOD_VALUE:
			return DOD;
		case RE_VALUE:
			return RE;
		case RED_VALUE:
			return RED;
		case MI_VALUE:
			return MI;
		case FA_VALUE:
			return FA;
		case FAD_VALUE:
			return FAD;
		case SOL_VALUE:
			return SOL;
		case SO_LD_VALUE:
			return SO_LD;
		case LA_VALUE:
			return LA;
		case LAD_VALUE:
			return LAD;
		case SI_VALUE:
			return SI;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private NoteValue(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
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
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //NoteValue
