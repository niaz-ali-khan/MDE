/**
 */
package eHealthManagement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.User#getUserType <em>User Type</em>}</li>
 *   <li>{@link eHealthManagement.User#isUserValidity <em>User Validity</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>User Type</b></em>' attribute.
	 * The literals are from the enumeration {@link eHealthManagement.AllowedUserType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Type</em>' attribute.
	 * @see eHealthManagement.AllowedUserType
	 * @see #setUserType(AllowedUserType)
	 * @see eHealthManagement.EHealthManagementPackage#getUser_UserType()
	 * @model
	 * @generated
	 */
	AllowedUserType getUserType();

	/**
	 * Sets the value of the '{@link eHealthManagement.User#getUserType <em>User Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Type</em>' attribute.
	 * @see eHealthManagement.AllowedUserType
	 * @see #getUserType()
	 * @generated
	 */
	void setUserType(AllowedUserType value);

	/**
	 * Returns the value of the '<em><b>User Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Validity</em>' attribute.
	 * @see #setUserValidity(boolean)
	 * @see eHealthManagement.EHealthManagementPackage#getUser_UserValidity()
	 * @model
	 * @generated
	 */
	boolean isUserValidity();

	/**
	 * Sets the value of the '{@link eHealthManagement.User#isUserValidity <em>User Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Validity</em>' attribute.
	 * @see #isUserValidity()
	 * @generated
	 */
	void setUserValidity(boolean value);

} // User
