/**
 */
package eHealthManagement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.ImageMessage#getEImageMessageName <em>EImage Message Name</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getImageMessage()
 * @model superTypes="eHealthManagement.MessageType"
 * @generated
 */
public interface ImageMessage extends MessageType {
	/**
	 * Returns the value of the '<em><b>EImage Message Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EImage Message Name</em>' attribute.
	 * @see #setEImageMessageName(String)
	 * @see eHealthManagement.EHealthManagementPackage#getImageMessage_EImageMessageName()
	 * @model
	 * @generated
	 */
	String getEImageMessageName();

	/**
	 * Sets the value of the '{@link eHealthManagement.ImageMessage#getEImageMessageName <em>EImage Message Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EImage Message Name</em>' attribute.
	 * @see #getEImageMessageName()
	 * @generated
	 */
	void setEImageMessageName(String value);

} // ImageMessage
