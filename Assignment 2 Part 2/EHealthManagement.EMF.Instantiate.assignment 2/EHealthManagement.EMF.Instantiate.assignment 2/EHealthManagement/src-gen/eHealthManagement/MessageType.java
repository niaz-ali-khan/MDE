/**
 */
package eHealthManagement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.MessageType#getEMessageTypeName <em>EMessage Type Name</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getMessageType()
 * @model
 * @generated
 */
public interface MessageType extends CommunicationInterface {
	/**
	 * Returns the value of the '<em><b>EMessage Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EMessage Type Name</em>' attribute.
	 * @see #setEMessageTypeName(String)
	 * @see eHealthManagement.EHealthManagementPackage#getMessageType_EMessageTypeName()
	 * @model
	 * @generated
	 */
	String getEMessageTypeName();

	/**
	 * Sets the value of the '{@link eHealthManagement.MessageType#getEMessageTypeName <em>EMessage Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EMessage Type Name</em>' attribute.
	 * @see #getEMessageTypeName()
	 * @generated
	 */
	void setEMessageTypeName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void InstantiateMessageInterface();

} // MessageType
