/**
 */
package eHealthManagement;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Allowed Representation Interface Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eHealthManagement.EHealthManagementPackage#getAllowedRepresentationInterfaceType()
 * @model
 * @generated
 */
public enum AllowedRepresentationInterfaceType implements Enumerator {
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
	PATIENT_PROFILE(1, "PatientProfile", "PatientProfile"),

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
	 * The '<em><b>Prescribtion View</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESCRIBTION_VIEW_VALUE
	 * @generated
	 * @ordered
	 */
	PRESCRIBTION_VIEW(3, "PrescribtionView", "PrescribtionView"),

	/**
	 * The '<em><b>Dianosys View</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIANOSYS_VIEW_VALUE
	 * @generated
	 * @ordered
	 */
	DIANOSYS_VIEW(4, "DianosysView", "DianosysView");

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
	 * @model name="PatientProfile"
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
	 * The '<em><b>Prescribtion View</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESCRIBTION_VIEW
	 * @model name="PrescribtionView"
	 * @generated
	 * @ordered
	 */
	public static final int PRESCRIBTION_VIEW_VALUE = 3;

	/**
	 * The '<em><b>Dianosys View</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIANOSYS_VIEW
	 * @model name="DianosysView"
	 * @generated
	 * @ordered
	 */
	public static final int DIANOSYS_VIEW_VALUE = 4;

	/**
	 * An array of all the '<em><b>Allowed Representation Interface Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AllowedRepresentationInterfaceType[] VALUES_ARRAY =
		new AllowedRepresentationInterfaceType[] {
			DOCTOR_PROFILE,
			PATIENT_PROFILE,
			MEDICINE_LIST,
			PRESCRIBTION_VIEW,
			DIANOSYS_VIEW,
		};

	/**
	 * A public read-only list of all the '<em><b>Allowed Representation Interface Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AllowedRepresentationInterfaceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Allowed Representation Interface Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllowedRepresentationInterfaceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AllowedRepresentationInterfaceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Allowed Representation Interface Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllowedRepresentationInterfaceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AllowedRepresentationInterfaceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Allowed Representation Interface Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllowedRepresentationInterfaceType get(int value) {
		switch (value) {
			case DOCTOR_PROFILE_VALUE: return DOCTOR_PROFILE;
			case PATIENT_PROFILE_VALUE: return PATIENT_PROFILE;
			case MEDICINE_LIST_VALUE: return MEDICINE_LIST;
			case PRESCRIBTION_VIEW_VALUE: return PRESCRIBTION_VIEW;
			case DIANOSYS_VIEW_VALUE: return DIANOSYS_VIEW;
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
	private AllowedRepresentationInterfaceType(int value, String name, String literal) {
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
	
} //AllowedRepresentationInterfaceType
