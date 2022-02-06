/**
 */
package eHealthManagement;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Allowed Attribute Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eHealthManagement.EHealthManagementPackage#getAllowedAttributeTypes()
 * @model
 * @generated
 */
public enum AllowedAttributeTypes implements Enumerator {
	/**
	 * The '<em><b>EBoolean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EBOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	EBOOLEAN(0, "EBoolean", "EBoolean"),

	/**
	 * The '<em><b>EDate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDATE_VALUE
	 * @generated
	 * @ordered
	 */
	EDATE(1, "EDate", "BOOLEAN"),

	/**
	 * The '<em><b>EString</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESTRING_VALUE
	 * @generated
	 * @ordered
	 */
	ESTRING(2, "EString", "EString"),

	/**
	 * The '<em><b>EVarchar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVARCHAR_VALUE
	 * @generated
	 * @ordered
	 */
	EVARCHAR(3, "EVarchar", "EVarchar"),

	/**
	 * The '<em><b>IMAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE(4, "IMAGE", "IMAGE");

	/**
	 * The '<em><b>EBoolean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EBOOLEAN
	 * @model name="EBoolean"
	 * @generated
	 * @ordered
	 */
	public static final int EBOOLEAN_VALUE = 0;

	/**
	 * The '<em><b>EDate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDATE
	 * @model name="EDate" literal="BOOLEAN"
	 * @generated
	 * @ordered
	 */
	public static final int EDATE_VALUE = 1;

	/**
	 * The '<em><b>EString</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESTRING
	 * @model name="EString"
	 * @generated
	 * @ordered
	 */
	public static final int ESTRING_VALUE = 2;

	/**
	 * The '<em><b>EVarchar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVARCHAR
	 * @model name="EVarchar"
	 * @generated
	 * @ordered
	 */
	public static final int EVARCHAR_VALUE = 3;

	/**
	 * The '<em><b>IMAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Allowed Attribute Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AllowedAttributeTypes[] VALUES_ARRAY = new AllowedAttributeTypes[] { EBOOLEAN, EDATE, ESTRING,
			EVARCHAR, IMAGE, };

	/**
	 * A public read-only list of all the '<em><b>Allowed Attribute Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AllowedAttributeTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Allowed Attribute Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllowedAttributeTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AllowedAttributeTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Allowed Attribute Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllowedAttributeTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AllowedAttributeTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Allowed Attribute Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllowedAttributeTypes get(int value) {
		switch (value) {
		case EBOOLEAN_VALUE:
			return EBOOLEAN;
		case EDATE_VALUE:
			return EDATE;
		case ESTRING_VALUE:
			return ESTRING;
		case EVARCHAR_VALUE:
			return EVARCHAR;
		case IMAGE_VALUE:
			return IMAGE;
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
	private AllowedAttributeTypes(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

} //AllowedAttributeTypes
