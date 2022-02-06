/**
 */
package eHealthManagement;

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
 *   <li>{@link eHealthManagement.UserInterface#getUserInterfaces <em>User Interfaces</em>}</li>
 *   <li>{@link eHealthManagement.UserInterface#getUser <em>User</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getUserInterface()
 * @model
 * @generated
 */
public interface UserInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>User Interfaces</b></em>' attribute.
	 * The literals are from the enumeration {@link eHealthManagement.AllowedUserInterfaces}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Interfaces</em>' attribute.
	 * @see eHealthManagement.AllowedUserInterfaces
	 * @see #setUserInterfaces(AllowedUserInterfaces)
	 * @see eHealthManagement.EHealthManagementPackage#getUserInterface_UserInterfaces()
	 * @model
	 * @generated
	 */
	AllowedUserInterfaces getUserInterfaces();

	/**
	 * Sets the value of the '{@link eHealthManagement.UserInterface#getUserInterfaces <em>User Interfaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Interfaces</em>' attribute.
	 * @see eHealthManagement.AllowedUserInterfaces
	 * @see #getUserInterfaces()
	 * @generated
	 */
	void setUserInterfaces(AllowedUserInterfaces value);

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

	void setText(String string);

} // UserInterface
