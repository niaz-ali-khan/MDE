/**
 */
package eHealthManagementV;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Allowed User Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eHealthManagementV.EHealthManagementVPackage#getAllowedUserTypes()
 * @model
 * @generated
 */
public enum AllowedUserTypes implements Enumerator {
	/**
	 * The '<em><b>Doctor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCTOR_VALUE
	 * @generated
	 * @ordered
	 */
	DOCTOR(0, "Doctor", "Doctor"),

	/**
	 * The '<em><b>Patient</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATIENT_VALUE
	 * @generated
	 * @ordered
	 */
	PATIENT(1, "Patient", "Patient"),

	/**
	 * The '<em><b>System Admin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_ADMIN_VALUE
	 * @generated
	 * @ordered
	 */
	SYSTEM_ADMIN(2, "SystemAdmin", "SystemAdmin");

	/**
	 * The '<em><b>Doctor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCTOR
	 * @model name="Doctor"
	 * @generated
	 * @ordered
	 */
	public static final int DOCTOR_VALUE = 0;

	/**
	 * The '<em><b>Patient</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATIENT
	 * @model name="Patient"
	 * @generated
	 * @ordered
	 */
	public static final int PATIENT_VALUE = 1;

	/**
	 * The '<em><b>System Admin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_ADMIN
	 * @model name="SystemAdmin"
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEM_ADMIN_VALUE = 2;

	/**
	 * An array of all the '<em><b>Allowed User Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AllowedUserTypes[] VALUES_ARRAY = new AllowedUserTypes[] { DOCTOR, PATIENT, SYSTEM_ADMIN, };

	/**
	 * A public read-only list of all the '<em><b>Allowed User Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AllowedUserTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Allowed User Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllowedUserTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AllowedUserTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Allowed User Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllowedUserTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AllowedUserTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Allowed User Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllowedUserTypes get(int value) {
		switch (value) {
		case DOCTOR_VALUE:
			return DOCTOR;
		case PATIENT_VALUE:
			return PATIENT;
		case SYSTEM_ADMIN_VALUE:
			return SYSTEM_ADMIN;
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
	private AllowedUserTypes(int value, String name, String literal) {
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

} //AllowedUserTypes
