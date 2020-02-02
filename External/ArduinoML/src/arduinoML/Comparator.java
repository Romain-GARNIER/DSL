/**
 */
package arduinoML;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Comparator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see arduinoML.ArduinoMLPackage#getComparator()
 * @model
 * @generated
 */
public enum Comparator implements Enumerator {
	/**
	 * The '<em><b>Sup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUP_VALUE
	 * @generated
	 * @ordered
	 */
	SUP(0, "sup", "sup"),

	/**
	 * The '<em><b>Inf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INF_VALUE
	 * @generated
	 * @ordered
	 */
	INF(1, "inf", "inf"),

	/**
	 * The '<em><b>Equ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQU_VALUE
	 * @generated
	 * @ordered
	 */
	EQU(2, "equ", "equ"),

	/**
	 * The '<em><b>Esup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESUP_VALUE
	 * @generated
	 * @ordered
	 */
	ESUP(3, "esup", "esup"),

	/**
	 * The '<em><b>Einf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EINF_VALUE
	 * @generated
	 * @ordered
	 */
	EINF(4, "einf", "einf");

	/**
	 * The '<em><b>Sup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUP
	 * @model name="sup"
	 * @generated
	 * @ordered
	 */
	public static final int SUP_VALUE = 0;

	/**
	 * The '<em><b>Inf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INF
	 * @model name="inf"
	 * @generated
	 * @ordered
	 */
	public static final int INF_VALUE = 1;

	/**
	 * The '<em><b>Equ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQU
	 * @model name="equ"
	 * @generated
	 * @ordered
	 */
	public static final int EQU_VALUE = 2;

	/**
	 * The '<em><b>Esup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESUP
	 * @model name="esup"
	 * @generated
	 * @ordered
	 */
	public static final int ESUP_VALUE = 3;

	/**
	 * The '<em><b>Einf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EINF
	 * @model name="einf"
	 * @generated
	 * @ordered
	 */
	public static final int EINF_VALUE = 4;

	/**
	 * An array of all the '<em><b>Comparator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Comparator[] VALUES_ARRAY =
		new Comparator[] {
			SUP,
			INF,
			EQU,
			ESUP,
			EINF,
		};

	/**
	 * A public read-only list of all the '<em><b>Comparator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Comparator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Comparator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Comparator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Comparator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Comparator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Comparator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Comparator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Comparator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Comparator get(int value) {
		switch (value) {
			case SUP_VALUE: return SUP;
			case INF_VALUE: return INF;
			case EQU_VALUE: return EQU;
			case ESUP_VALUE: return ESUP;
			case EINF_VALUE: return EINF;
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
	private Comparator(int value, String name, String literal) {
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
	
} //Comparator
