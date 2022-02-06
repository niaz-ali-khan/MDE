/**
 */
package eHealthManagement;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Allowed User Interfaces</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eHealthManagement.EHealthManagementPackage#getAllowedUserInterfaces()
 * @model
 * @generated
 */
public enum AllowedUserInterfaces implements Enumerator {
	/**
	 * The '<em><b>Profile View</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROFILE_VIEW_VALUE
	 * @generated
	 * @ordered
	 */
	PROFILE_VIEW(0, "ProfileView", "ProfileView"),

	/**
	 * The '<em><b>Information View</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMATION_VIEW_VALUE
	 * @generated
	 * @ordered
	 */
	INFORMATION_VIEW(1, "InformationView", "InformationView");

	/**
	 * The '<em><b>Profile View</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROFILE_VIEW
	 * @model name="ProfileView"
	 * @generated
	 * @ordered
	 */
	public static final int PROFILE_VIEW_VALUE = 0;

	/**
	 * The '<em><b>Information View</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMATION_VIEW
	 * @model name="InformationView"
	 * @generated
	 * @ordered
	 */
	public static final int INFORMATION_VIEW_VALUE = 1;

	/**
	 * An array of all the '<em><b>Allowed User Interfaces</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AllowedUserInterfaces[] VALUES_ARRAY = new AllowedUserInterfaces[] { PROFILE_VIEW,
			INFORMATION_VIEW, };

	/**
	 * A public read-only list of all the '<em><b>Allowed User Interfaces</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AllowedUserInterfaces> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Allowed User Interfaces</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllowedUserInterfaces get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AllowedUserInterfaces result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Allowed User Interfaces</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllowedUserInterfaces getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AllowedUserInterfaces result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Allowed User Interfaces</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllowedUserInterfaces get(int value) {
		switch (value) {
		case PROFILE_VIEW_VALUE:
			return PROFILE_VIEW;
		case INFORMATION_VIEW_VALUE:
			return INFORMATION_VIEW;
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
	private AllowedUserInterfaces(int value, String name, String literal) {
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

} //AllowedUserInterfaces
