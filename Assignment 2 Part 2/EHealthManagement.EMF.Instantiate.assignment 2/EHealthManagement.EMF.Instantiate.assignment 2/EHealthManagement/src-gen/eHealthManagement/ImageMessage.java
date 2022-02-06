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
 *   <li>{@link eHealthManagement.ImageMessage#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link eHealthManagement.ImageMessage#getEImageMessageName <em>EImage Message Name</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getImageMessage()
 * @model
 * @generated
 */
public interface ImageMessage extends MessageType {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference.
	 * @see #setAttributes(Attributes)
	 * @see eHealthManagement.EHealthManagementPackage#getImageMessage_Attributes()
	 * @model
	 * @generated
	 */
	Attributes getAttributes();

	/**
	 * Sets the value of the '{@link eHealthManagement.ImageMessage#getAttributes <em>Attributes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(Attributes value);

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
