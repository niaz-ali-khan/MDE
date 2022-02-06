/**
 */
package eHealthManagementV.impl;

import eHealthManagementV.AllowedUserInterfaces;
import eHealthManagementV.EHealthManagementVPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Interfaces</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagementV.impl.UserInterfacesImpl#getUserInterfacesTypes <em>User Interfaces Types</em>}</li>
 *   <li>{@link eHealthManagementV.impl.UserInterfacesImpl#isUserInterfacesValidity <em>User Interfaces Validity</em>}</li>
 *   <li>{@link eHealthManagementV.impl.UserInterfacesImpl#getUsers <em>Users</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserInterfacesImpl extends MinimalEObjectImpl.Container implements UserInterfaces {
	/**
	 * The default value of the '{@link #getUserInterfacesTypes() <em>User Interfaces Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserInterfacesTypes()
	 * @generated
	 * @ordered
	 */
	protected static final AllowedUserInterfaces USER_INTERFACES_TYPES_EDEFAULT = AllowedUserInterfaces.PROFILE_VIEW;

	/**
	 * The cached value of the '{@link #getUserInterfacesTypes() <em>User Interfaces Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserInterfacesTypes()
	 * @generated
	 * @ordered
	 */
	protected AllowedUserInterfaces userInterfacesTypes = USER_INTERFACES_TYPES_EDEFAULT;

	/**
	 * The default value of the '{@link #isUserInterfacesValidity() <em>User Interfaces Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUserInterfacesValidity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USER_INTERFACES_VALIDITY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUserInterfacesValidity() <em>User Interfaces Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUserInterfacesValidity()
	 * @generated
	 * @ordered
	 */
	protected boolean userInterfacesValidity = USER_INTERFACES_VALIDITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected Users users;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserInterfacesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementVPackage.Literals.USER_INTERFACES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowedUserInterfaces getUserInterfacesTypes() {
		return userInterfacesTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserInterfacesTypes(AllowedUserInterfaces newUserInterfacesTypes) {
		AllowedUserInterfaces oldUserInterfacesTypes = userInterfacesTypes;
		userInterfacesTypes = newUserInterfacesTypes == null ? USER_INTERFACES_TYPES_EDEFAULT : newUserInterfacesTypes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EHealthManagementVPackage.USER_INTERFACES__USER_INTERFACES_TYPES, oldUserInterfacesTypes,
					userInterfacesTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUserInterfacesValidity() {
		return userInterfacesValidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserInterfacesValidity(boolean newUserInterfacesValidity) {
		boolean oldUserInterfacesValidity = userInterfacesValidity;
		userInterfacesValidity = newUserInterfacesValidity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EHealthManagementVPackage.USER_INTERFACES__USER_INTERFACES_VALIDITY, oldUserInterfacesValidity,
					userInterfacesValidity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Users getUsers() {
		if (users != null && ((EObject) users).eIsProxy()) {
			InternalEObject oldUsers = (InternalEObject) users;
			users = (Users) eResolveProxy(oldUsers);
			if (users != oldUsers) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EHealthManagementVPackage.USER_INTERFACES__USERS, oldUsers, users));
			}
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Users basicGetUsers() {
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsers(Users newUsers) {
		Users oldUsers = users;
		users = newUsers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementVPackage.USER_INTERFACES__USERS,
					oldUsers, users));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EHealthManagementVPackage.USER_INTERFACES__USER_INTERFACES_TYPES:
			return getUserInterfacesTypes();
		case EHealthManagementVPackage.USER_INTERFACES__USER_INTERFACES_VALIDITY:
			return isUserInterfacesValidity();
		case EHealthManagementVPackage.USER_INTERFACES__USERS:
			if (resolve)
				return getUsers();
			return basicGetUsers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EHealthManagementVPackage.USER_INTERFACES__USER_INTERFACES_TYPES:
			setUserInterfacesTypes((AllowedUserInterfaces) newValue);
			return;
		case EHealthManagementVPackage.USER_INTERFACES__USER_INTERFACES_VALIDITY:
			setUserInterfacesValidity((Boolean) newValue);
			return;
		case EHealthManagementVPackage.USER_INTERFACES__USERS:
			setUsers((Users) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EHealthManagementVPackage.USER_INTERFACES__USER_INTERFACES_TYPES:
			setUserInterfacesTypes(USER_INTERFACES_TYPES_EDEFAULT);
			return;
		case EHealthManagementVPackage.USER_INTERFACES__USER_INTERFACES_VALIDITY:
			setUserInterfacesValidity(USER_INTERFACES_VALIDITY_EDEFAULT);
			return;
		case EHealthManagementVPackage.USER_INTERFACES__USERS:
			setUsers((Users) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EHealthManagementVPackage.USER_INTERFACES__USER_INTERFACES_TYPES:
			return userInterfacesTypes != USER_INTERFACES_TYPES_EDEFAULT;
		case EHealthManagementVPackage.USER_INTERFACES__USER_INTERFACES_VALIDITY:
			return userInterfacesValidity != USER_INTERFACES_VALIDITY_EDEFAULT;
		case EHealthManagementVPackage.USER_INTERFACES__USERS:
			return users != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (UserInterfacesTypes: ");
		result.append(userInterfacesTypes);
		result.append(", UserInterfacesValidity: ");
		result.append(userInterfacesValidity);
		result.append(')');
		return result.toString();
	}

} //UserInterfacesImpl
