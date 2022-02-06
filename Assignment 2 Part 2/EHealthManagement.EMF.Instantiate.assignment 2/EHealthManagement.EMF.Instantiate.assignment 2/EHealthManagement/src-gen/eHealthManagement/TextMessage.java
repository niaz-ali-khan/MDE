/**
 */
package eHealthManagement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.TextMessage#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link eHealthManagement.TextMessage#getETextMessageName <em>EText Message Name</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getTextMessage()
 * @model
 * @generated
 */
public interface TextMessage extends MessageType {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference.
	 * @see #setAttributes(Attributes)
	 * @see eHealthManagement.EHealthManagementPackage#getTextMessage_Attributes()
	 * @model
	 * @generated
	 */
	Attributes getAttributes();

	/**
	 * Sets the value of the '{@link eHealthManagement.TextMessage#getAttributes <em>Attributes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(Attributes value);

	/**
	 * Returns the value of the '<em><b>EText Message Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EText Message Name</em>' attribute.
	 * @see #setETextMessageName(String)
	 * @see eHealthManagement.EHealthManagementPackage#getTextMessage_ETextMessageName()
	 * @model
	 * @generated
	 */
	String getETextMessageName();

	/**
	 * Sets the value of the '{@link eHealthManagement.TextMessage#getETextMessageName <em>EText Message Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EText Message Name</em>' attribute.
	 * @see #getETextMessageName()
	 * @generated
	 */
	void setETextMessageName(String value);

} // TextMessage
