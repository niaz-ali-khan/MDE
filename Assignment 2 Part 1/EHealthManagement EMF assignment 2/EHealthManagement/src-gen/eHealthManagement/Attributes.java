/**
 */
package eHealthManagement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.Attributes#getEventmessagetype <em>Eventmessagetype</em>}</li>
 *   <li>{@link eHealthManagement.Attributes#getEAttributesName <em>EAttributes Name</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getAttributes()
 * @model
 * @generated
 */
public interface Attributes extends Entity {
	/**
	 * Returns the value of the '<em><b>Eventmessagetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eventmessagetype</em>' reference.
	 * @see #setEventmessagetype(EventMessageType)
	 * @see eHealthManagement.EHealthManagementPackage#getAttributes_Eventmessagetype()
	 * @model
	 * @generated
	 */
	EventMessageType getEventmessagetype();

	/**
	 * Sets the value of the '{@link eHealthManagement.Attributes#getEventmessagetype <em>Eventmessagetype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eventmessagetype</em>' reference.
	 * @see #getEventmessagetype()
	 * @generated
	 */
	void setEventmessagetype(EventMessageType value);

	/**
	 * Returns the value of the '<em><b>EAttributes Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAttributes Name</em>' attribute.
	 * @see #setEAttributesName(String)
	 * @see eHealthManagement.EHealthManagementPackage#getAttributes_EAttributesName()
	 * @model
	 * @generated
	 */
	String getEAttributesName();

	/**
	 * Sets the value of the '{@link eHealthManagement.Attributes#getEAttributesName <em>EAttributes Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EAttributes Name</em>' attribute.
	 * @see #getEAttributesName()
	 * @generated
	 */
	void setEAttributesName(String value);

} // Attributes
