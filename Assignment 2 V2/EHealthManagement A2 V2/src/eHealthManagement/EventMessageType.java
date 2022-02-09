/**
 */
package eHealthManagement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Message Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.EventMessageType#getEventMessageTypeName <em>Event Message Type Name</em>}</li>
 *   <li>{@link eHealthManagement.EventMessageType#getMessageexchangestandard <em>Messageexchangestandard</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getEventMessageType()
 * @model
 * @generated
 */
public interface EventMessageType extends EObject {
	/**
	 * Returns the value of the '<em><b>Event Message Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Message Type Name</em>' attribute.
	 * @see #setEventMessageTypeName(String)
	 * @see eHealthManagement.EHealthManagementPackage#getEventMessageType_EventMessageTypeName()
	 * @model
	 * @generated
	 */
	String getEventMessageTypeName();

	/**
	 * Sets the value of the '{@link eHealthManagement.EventMessageType#getEventMessageTypeName <em>Event Message Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Message Type Name</em>' attribute.
	 * @see #getEventMessageTypeName()
	 * @generated
	 */
	void setEventMessageTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Messageexchangestandard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messageexchangestandard</em>' reference.
	 * @see #setMessageexchangestandard(MessageExchangeStandard)
	 * @see eHealthManagement.EHealthManagementPackage#getEventMessageType_Messageexchangestandard()
	 * @model
	 * @generated
	 */
	MessageExchangeStandard getMessageexchangestandard();

	/**
	 * Sets the value of the '{@link eHealthManagement.EventMessageType#getMessageexchangestandard <em>Messageexchangestandard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Messageexchangestandard</em>' reference.
	 * @see #getMessageexchangestandard()
	 * @generated
	 */
	void setMessageexchangestandard(MessageExchangeStandard value);

} // EventMessageType
