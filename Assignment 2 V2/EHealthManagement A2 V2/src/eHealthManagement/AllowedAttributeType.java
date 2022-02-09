/**
 */
package eHealthManagement;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Allowed Attribute Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eHealthManagement.EHealthManagementPackage#getAllowedAttributeType()
 * @model
 * @generated
 */
public enum AllowedAttributeType implements Enumerator {
	/**
	 * The '<em><b>CImage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIMAGE_VALUE
	 * @generated
	 * @ordered
	 */
	CIMAGE(0, "CImage", "CImage"),

	/**
	 * The '<em><b>CString</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSTRING_VALUE
	 * @generated
	 * @ordered
	 */
	CSTRING(1, "CString", "CString"),

	/**
	 * The '<em><b>CVarchar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CVARCHAR_VALUE
	 * @generated
	 * @ordered
	 */
	CVARCHAR(2, "CVarchar", "CVarchar");

	/**
	 * The '<em><b>CImage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIMAGE
	 * @model name="CImage"
	 * @generated
	 * @ordered
	 */
	public static final int CIMAGE_VALUE = 0;

	/**
	 * The '<em><b>CString</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSTRING
	 * @model name="CString"
	 * @generated
	 * @ordered
	 */
	public static final int CSTRING_VALUE = 1;

	/**
	 * The '<em><b>CVarchar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CVARCHAR
	 * @model name="CVarchar"
	 * @generated
	 * @ordered
	 */
	public static final int CVARCHAR_VALUE = 2;

	/**
	 * An array of all the '<em><b>Allowed Attribute Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AllowedAttributeType[] VALUES_ARRAY =
		new AllowedAttributeType[] {
			CIMAGE,
			CSTRING,
			CVARCHAR,
		};

	/**
	 * A public read-only list of all the '<em><b>Allowed Attribute Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AllowedAttributeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Allowed Attribute Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllowedAttributeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AllowedAttributeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Allowed Attribute Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllowedAttributeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AllowedAttributeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Allowed Attribute Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllowedAttributeType get(int value) {
		switch (value) {
			case CIMAGE_VALUE: return CIMAGE;
			case CSTRING_VALUE: return CSTRING;
			case CVARCHAR_VALUE: return CVARCHAR;
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
	private AllowedAttributeType(int value, String name, String literal) {
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
	
} //AllowedAttributeType
