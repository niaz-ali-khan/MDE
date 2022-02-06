/**
 */
package eHealthManagement;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Allowed Representation Interface Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eHealthManagement.EHealthManagementPackage#getAllowedRepresentationInterfaceTypes()
 * @model
 * @generated
 */
public enum AllowedRepresentationInterfaceTypes implements Enumerator {
	/**
	 * The '<em><b>Doctor Profile</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCTOR_PROFILE_VALUE
	 * @generated
	 * @ordered
	 */
	DOCTOR_PROFILE(0, "DoctorProfile", "DoctorProfile"),

	/**
	 * The '<em><b>Patient Profile</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATIENT_PROFILE_VALUE
	 * @generated
	 * @ordered
	 */
	PATIENT_PROFILE(1, "PatientProfile", "BOOLEAN"),

	/**
	 * The '<em><b>Medicine List</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICINE_LIST_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICINE_LIST(2, "MedicineList", "MedicineList"),

	/**
	 * The '<em><b>Prescription View</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESCRIPTION_VIEW_VALUE
	 * @generated
	 * @ordered
	 */
	PRESCRIPTION_VIEW(3, "PrescriptionView", "PrescriptionView"),

	/**
	 * The '<em><b>Diagnosys View</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIAGNOSYS_VIEW_VALUE
	 * @generated
	 * @ordered
	 */
	DIAGNOSYS_VIEW(4, "DiagnosysView", "DiagnosysView");

	/**
	 * The '<em><b>Doctor Profile</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCTOR_PROFILE
	 * @model name="DoctorProfile"
	 * @generated
	 * @ordered
	 */
	public static final int DOCTOR_PROFILE_VALUE = 0;

	/**
	 * The '<em><b>Patient Profile</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATIENT_PROFILE
	 * @model name="PatientProfile" literal="BOOLEAN"
	 * @generated
	 * @ordered
	 */
	public static final int PATIENT_PROFILE_VALUE = 1;

	/**
	 * The '<em><b>Medicine List</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICINE_LIST
	 * @model name="MedicineList"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICINE_LIST_VALUE = 2;

	/**
	 * The '<em><b>Prescription View</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESCRIPTION_VIEW
	 * @model name="PrescriptionView"
	 * @generated
	 * @ordered
	 */
	public static final int PRESCRIPTION_VIEW_VALUE = 3;

	/**
	 * The '<em><b>Diagnosys View</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIAGNOSYS_VIEW
	 * @model name="DiagnosysView"
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSYS_VIEW_VALUE = 4;

	/**
	 * An array of all the '<em><b>Allowed Representation Interface Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AllowedRepresentationInterfaceTypes[] VALUES_ARRAY = new AllowedRepresentationInterfaceTypes[] {
			DOCTOR_PROFILE, PATIENT_PROFILE, MEDICINE_LIST, PRESCRIPTION_VIEW, DIAGNOSYS_VIEW, };

	/**
	 * A public read-only list of all the '<em><b>Allowed Representation Interface Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AllowedRepresentationInterfaceTypes> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Allowed Representation Interface Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllowedRepresentationInterfaceTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AllowedRepresentationInterfaceTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Allowed Representation Interface Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllowedRepresentationInterfaceTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AllowedRepresentationInterfaceTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Allowed Representation Interface Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllowedRepresentationInterfaceTypes get(int value) {
		switch (value) {
		case DOCTOR_PROFILE_VALUE:
			return DOCTOR_PROFILE;
		case PATIENT_PROFILE_VALUE:
			return PATIENT_PROFILE;
		case MEDICINE_LIST_VALUE:
			return MEDICINE_LIST;
		case PRESCRIPTION_VIEW_VALUE:
			return PRESCRIPTION_VIEW;
		case DIAGNOSYS_VIEW_VALUE:
			return DIAGNOSYS_VIEW;
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
	private AllowedRepresentationInterfaceTypes(int value, String name, String literal) {
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

} //AllowedRepresentationInterfaceTypes
