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
 *   <li>{@link eHealthManagement.User#getUserTypes <em>User Types</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>User Types</b></em>' attribute.
	 * The literals are from the enumeration {@link eHealthManagement.AllowedUserTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Types</em>' attribute.
	 * @see eHealthManagement.AllowedUserTypes
	 * @see #setUserTypes(AllowedUserTypes)
	 * @see eHealthManagement.EHealthManagementPackage#getUser_UserTypes()
	 * @model
	 * @generated
	 */
	AllowedUserTypes getUserTypes();

	/**
	 * Sets the value of the '{@link eHealthManagement.User#getUserTypes <em>User Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Types</em>' attribute.
	 * @see eHealthManagement.AllowedUserTypes
	 * @see #getUserTypes()
	 * @generated
	 */
	void setUserTypes(AllowedUserTypes value);

} // User
