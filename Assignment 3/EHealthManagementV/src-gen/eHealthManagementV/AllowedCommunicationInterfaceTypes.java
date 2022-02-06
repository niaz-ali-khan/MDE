/**
 */
package eHealthManagementV;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Allowed Communication Interface Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eHealthManagementV.EHealthManagementVPackage#getAllowedCommunicationInterfaceTypes()
 * @model
 * @generated
 */
public enum AllowedCommunicationInterfaceTypes implements Enumerator {
	/**
	 * The '<em><b>Communication View</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION_VIEW_VALUE
	 * @generated
	 * @ordered
	 */
	COMMUNICATION_VIEW(0, "CommunicationView", "CommunicationView"),

	/**
	 * The '<em><b>Notification View</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTIFICATION_VIEW_VALUE
	 * @generated
	 * @ordered
	 */
	NOTIFICATION_VIEW(1, "NotificationView", "BOOLEAN"),

	/**
	 * The '<em><b>Feedback View</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEEDBACK_VIEW_VALUE
	 * @generated
	 * @ordered
	 */
	FEEDBACK_VIEW(2, "FeedbackView", "FeedbackView");

	/**
	 * The '<em><b>Communication View</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION_VIEW
	 * @model name="CommunicationView"
	 * @generated
	 * @ordered
	 */
	public static final int COMMUNICATION_VIEW_VALUE = 0;

	/**
	 * The '<em><b>Notification View</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTIFICATION_VIEW
	 * @model name="NotificationView" literal="BOOLEAN"
	 * @generated
	 * @ordered
	 */
	public static final int NOTIFICATION_VIEW_VALUE = 1;

	/**
	 * The '<em><b>Feedback View</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEEDBACK_VIEW
	 * @model name="FeedbackView"
	 * @generated
	 * @ordered
	 */
	public static final int FEEDBACK_VIEW_VALUE = 2;

	/**
	 * An array of all the '<em><b>Allowed Communication Interface Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AllowedCommunicationInterfaceTypes[] VALUES_ARRAY = new AllowedCommunicationInterfaceTypes[] {
			COMMUNICATION_VIEW, NOTIFICATION_VIEW, FEEDBACK_VIEW, };

	/**
	 * A public read-only list of all the '<em><b>Allowed Communication Interface Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AllowedCommunicationInterfaceTypes> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Allowed Communication Interface Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllowedCommunicationInterfaceTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AllowedCommunicationInterfaceTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Allowed Communication Interface Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllowedCommunicationInterfaceTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AllowedCommunicationInterfaceTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Allowed Communication Interface Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllowedCommunicationInterfaceTypes get(int value) {
		switch (value) {
		case COMMUNICATION_VIEW_VALUE:
			return COMMUNICATION_VIEW;
		case NOTIFICATION_VIEW_VALUE:
			return NOTIFICATION_VIEW;
		case FEEDBACK_VIEW_VALUE:
			return FEEDBACK_VIEW;
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
	private AllowedCommunicationInterfaceTypes(int value, String name, String literal) {
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

} //AllowedCommunicationInterfaceTypes
