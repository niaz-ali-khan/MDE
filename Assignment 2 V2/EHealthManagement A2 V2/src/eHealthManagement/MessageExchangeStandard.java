/**
 */
package eHealthManagement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Exchange Standard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.MessageExchangeStandard#getMessageExchangeStandardName <em>Message Exchange Standard Name</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getMessageExchangeStandard()
 * @model
 * @generated
 */
public interface MessageExchangeStandard extends EObject {
	/**
	 * Returns the value of the '<em><b>Message Exchange Standard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Exchange Standard Name</em>' attribute.
	 * @see #setMessageExchangeStandardName(String)
	 * @see eHealthManagement.EHealthManagementPackage#getMessageExchangeStandard_MessageExchangeStandardName()
	 * @model
	 * @generated
	 */
	String getMessageExchangeStandardName();

	/**
	 * Sets the value of the '{@link eHealthManagement.MessageExchangeStandard#getMessageExchangeStandardName <em>Message Exchange Standard Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Exchange Standard Name</em>' attribute.
	 * @see #getMessageExchangeStandardName()
	 * @generated
	 */
	void setMessageExchangeStandardName(String value);

} // MessageExchangeStandard
