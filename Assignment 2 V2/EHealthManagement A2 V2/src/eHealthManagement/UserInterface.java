/**
 */
package eHealthManagement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.UserInterface#getUserInterfaceType <em>User Interface Type</em>}</li>
 *   <li>{@link eHealthManagement.UserInterface#isUserInterfaceValidity <em>User Interface Validity</em>}</li>
 *   <li>{@link eHealthManagement.UserInterface#getUser <em>User</em>}</li>
 *   <li>{@link eHealthManagement.UserInterface#getRepresentationinterface <em>Representationinterface</em>}</li>
 *   <li>{@link eHealthManagement.UserInterface#getCommunicationinterface <em>Communicationinterface</em>}</li>
 *   <li>{@link eHealthManagement.UserInterface#getMessageexchangestandard <em>Messageexchangestandard</em>}</li>
 *   <li>{@link eHealthManagement.UserInterface#getDatatype <em>Datatype</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getUserInterface()
 * @model
 * @generated
 */
public interface UserInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>User Interface Type</b></em>' attribute.
	 * The literals are from the enumeration {@link eHealthManagement.AllowedUserInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Interface Type</em>' attribute.
	 * @see eHealthManagement.AllowedUserInterface
	 * @see #setUserInterfaceType(AllowedUserInterface)
	 * @see eHealthManagement.EHealthManagementPackage#getUserInterface_UserInterfaceType()
	 * @model
	 * @generated
	 */
	AllowedUserInterface getUserInterfaceType();

	/**
	 * Sets the value of the '{@link eHealthManagement.UserInterface#getUserInterfaceType <em>User Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Interface Type</em>' attribute.
	 * @see eHealthManagement.AllowedUserInterface
	 * @see #getUserInterfaceType()
	 * @generated
	 */
	void setUserInterfaceType(AllowedUserInterface value);

	/**
	 * Returns the value of the '<em><b>User Interface Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Interface Validity</em>' attribute.
	 * @see #setUserInterfaceValidity(boolean)
	 * @see eHealthManagement.EHealthManagementPackage#getUserInterface_UserInterfaceValidity()
	 * @model
	 * @generated
	 */
	boolean isUserInterfaceValidity();

	/**
	 * Sets the value of the '{@link eHealthManagement.UserInterface#isUserInterfaceValidity <em>User Interface Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Interface Validity</em>' attribute.
	 * @see #isUserInterfaceValidity()
	 * @generated
	 */
	void setUserInterfaceValidity(boolean value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see eHealthManagement.EHealthManagementPackage#getUserInterface_User()
	 * @model
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link eHealthManagement.UserInterface#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Representationinterface</b></em>' containment reference list.
	 * The list contents are of type {@link eHealthManagement.RepresentationInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representationinterface</em>' containment reference list.
	 * @see eHealthManagement.EHealthManagementPackage#getUserInterface_Representationinterface()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RepresentationInterface> getRepresentationinterface();

	/**
	 * Returns the value of the '<em><b>Communicationinterface</b></em>' containment reference list.
	 * The list contents are of type {@link eHealthManagement.CommunicationInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communicationinterface</em>' containment reference list.
	 * @see eHealthManagement.EHealthManagementPackage#getUserInterface_Communicationinterface()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CommunicationInterface> getCommunicationinterface();

	/**
	 * Returns the value of the '<em><b>Messageexchangestandard</b></em>' containment reference list.
	 * The list contents are of type {@link eHealthManagement.MessageExchangeStandard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messageexchangestandard</em>' containment reference list.
	 * @see eHealthManagement.EHealthManagementPackage#getUserInterface_Messageexchangestandard()
	 * @model containment="true"
	 * @generated
	 */
	EList<MessageExchangeStandard> getMessageexchangestandard();

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' containment reference list.
	 * The list contents are of type {@link eHealthManagement.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' containment reference list.
	 * @see eHealthManagement.EHealthManagementPackage#getUserInterface_Datatype()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataType> getDatatype();

} // UserInterface
