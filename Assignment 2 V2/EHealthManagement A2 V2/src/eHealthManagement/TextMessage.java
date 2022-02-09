/**
 */
package eHealthManagement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.TextMessage#getTextMessageName <em>Text Message Name</em>}</li>
 *   <li>{@link eHealthManagement.TextMessage#getTextMessageSize <em>Text Message Size</em>}</li>
 *   <li>{@link eHealthManagement.TextMessage#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getTextMessage()
 * @model
 * @generated
 */
public interface TextMessage extends EObject {
	/**
	 * Returns the value of the '<em><b>Text Message Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Message Name</em>' attribute.
	 * @see #setTextMessageName(String)
	 * @see eHealthManagement.EHealthManagementPackage#getTextMessage_TextMessageName()
	 * @model
	 * @generated
	 */
	String getTextMessageName();

	/**
	 * Sets the value of the '{@link eHealthManagement.TextMessage#getTextMessageName <em>Text Message Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Message Name</em>' attribute.
	 * @see #getTextMessageName()
	 * @generated
	 */
	void setTextMessageName(String value);

	/**
	 * Returns the value of the '<em><b>Text Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Message Size</em>' attribute.
	 * @see #setTextMessageSize(long)
	 * @see eHealthManagement.EHealthManagementPackage#getTextMessage_TextMessageSize()
	 * @model
	 * @generated
	 */
	long getTextMessageSize();

	/**
	 * Sets the value of the '{@link eHealthManagement.TextMessage#getTextMessageSize <em>Text Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Message Size</em>' attribute.
	 * @see #getTextMessageSize()
	 * @generated
	 */
	void setTextMessageSize(long value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see eHealthManagement.EHealthManagementPackage#getTextMessage_Attribute()
	 * @model
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link eHealthManagement.TextMessage#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

} // TextMessage
