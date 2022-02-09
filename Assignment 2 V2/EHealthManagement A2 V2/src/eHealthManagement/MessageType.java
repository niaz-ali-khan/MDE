/**
 */
package eHealthManagement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.MessageType#getMessageTypeName <em>Message Type Name</em>}</li>
 *   <li>{@link eHealthManagement.MessageType#getMessageTypeSize <em>Message Type Size</em>}</li>
 *   <li>{@link eHealthManagement.MessageType#getImagemessge <em>Imagemessge</em>}</li>
 *   <li>{@link eHealthManagement.MessageType#getFilemessage <em>Filemessage</em>}</li>
 *   <li>{@link eHealthManagement.MessageType#getTextmessage <em>Textmessage</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getMessageType()
 * @model
 * @generated
 */
public interface MessageType extends EObject {
	/**
	 * Returns the value of the '<em><b>Message Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Type Name</em>' attribute.
	 * @see #setMessageTypeName(String)
	 * @see eHealthManagement.EHealthManagementPackage#getMessageType_MessageTypeName()
	 * @model
	 * @generated
	 */
	String getMessageTypeName();

	/**
	 * Sets the value of the '{@link eHealthManagement.MessageType#getMessageTypeName <em>Message Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Type Name</em>' attribute.
	 * @see #getMessageTypeName()
	 * @generated
	 */
	void setMessageTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Message Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Type Size</em>' attribute.
	 * @see #setMessageTypeSize(long)
	 * @see eHealthManagement.EHealthManagementPackage#getMessageType_MessageTypeSize()
	 * @model
	 * @generated
	 */
	long getMessageTypeSize();

	/**
	 * Sets the value of the '{@link eHealthManagement.MessageType#getMessageTypeSize <em>Message Type Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Type Size</em>' attribute.
	 * @see #getMessageTypeSize()
	 * @generated
	 */
	void setMessageTypeSize(long value);

	/**
	 * Returns the value of the '<em><b>Imagemessge</b></em>' containment reference list.
	 * The list contents are of type {@link eHealthManagement.ImageMessage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imagemessge</em>' containment reference list.
	 * @see eHealthManagement.EHealthManagementPackage#getMessageType_Imagemessge()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImageMessage> getImagemessge();

	/**
	 * Returns the value of the '<em><b>Filemessage</b></em>' containment reference list.
	 * The list contents are of type {@link eHealthManagement.FileMessage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filemessage</em>' containment reference list.
	 * @see eHealthManagement.EHealthManagementPackage#getMessageType_Filemessage()
	 * @model containment="true"
	 * @generated
	 */
	EList<FileMessage> getFilemessage();

	/**
	 * Returns the value of the '<em><b>Textmessage</b></em>' containment reference list.
	 * The list contents are of type {@link eHealthManagement.TextMessage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textmessage</em>' containment reference list.
	 * @see eHealthManagement.EHealthManagementPackage#getMessageType_Textmessage()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextMessage> getTextmessage();

} // MessageType
