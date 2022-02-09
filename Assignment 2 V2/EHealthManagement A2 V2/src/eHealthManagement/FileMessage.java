/**
 */
package eHealthManagement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.FileMessage#getFileMessageName <em>File Message Name</em>}</li>
 *   <li>{@link eHealthManagement.FileMessage#getFileMessageSize <em>File Message Size</em>}</li>
 *   <li>{@link eHealthManagement.FileMessage#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getFileMessage()
 * @model
 * @generated
 */
public interface FileMessage extends EObject {
	/**
	 * Returns the value of the '<em><b>File Message Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Message Name</em>' attribute.
	 * @see #setFileMessageName(String)
	 * @see eHealthManagement.EHealthManagementPackage#getFileMessage_FileMessageName()
	 * @model
	 * @generated
	 */
	String getFileMessageName();

	/**
	 * Sets the value of the '{@link eHealthManagement.FileMessage#getFileMessageName <em>File Message Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Message Name</em>' attribute.
	 * @see #getFileMessageName()
	 * @generated
	 */
	void setFileMessageName(String value);

	/**
	 * Returns the value of the '<em><b>File Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Message Size</em>' attribute.
	 * @see #setFileMessageSize(long)
	 * @see eHealthManagement.EHealthManagementPackage#getFileMessage_FileMessageSize()
	 * @model
	 * @generated
	 */
	long getFileMessageSize();

	/**
	 * Sets the value of the '{@link eHealthManagement.FileMessage#getFileMessageSize <em>File Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Message Size</em>' attribute.
	 * @see #getFileMessageSize()
	 * @generated
	 */
	void setFileMessageSize(long value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see eHealthManagement.EHealthManagementPackage#getFileMessage_Attribute()
	 * @model
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link eHealthManagement.FileMessage#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

} // FileMessage
