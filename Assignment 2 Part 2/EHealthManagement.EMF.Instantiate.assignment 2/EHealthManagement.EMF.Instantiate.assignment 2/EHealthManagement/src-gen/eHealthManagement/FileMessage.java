/**
 */
package eHealthManagement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.FileMessage#getEFileMessageName <em>EFile Message Name</em>}</li>
 *   <li>{@link eHealthManagement.FileMessage#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getFileMessage()
 * @model
 * @generated
 */
public interface FileMessage extends MessageType {
	/**
	 * Returns the value of the '<em><b>EFile Message Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EFile Message Name</em>' attribute.
	 * @see #setEFileMessageName(String)
	 * @see eHealthManagement.EHealthManagementPackage#getFileMessage_EFileMessageName()
	 * @model
	 * @generated
	 */
	String getEFileMessageName();

	/**
	 * Sets the value of the '{@link eHealthManagement.FileMessage#getEFileMessageName <em>EFile Message Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EFile Message Name</em>' attribute.
	 * @see #getEFileMessageName()
	 * @generated
	 */
	void setEFileMessageName(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference.
	 * @see #setAttributes(Attributes)
	 * @see eHealthManagement.EHealthManagementPackage#getFileMessage_Attributes()
	 * @model
	 * @generated
	 */
	Attributes getAttributes();

	/**
	 * Sets the value of the '{@link eHealthManagement.FileMessage#getAttributes <em>Attributes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(Attributes value);

} // FileMessage
