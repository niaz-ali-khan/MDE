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
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getFileMessage()
 * @model superTypes="eHealthManagement.MessageType"
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

} // FileMessage
