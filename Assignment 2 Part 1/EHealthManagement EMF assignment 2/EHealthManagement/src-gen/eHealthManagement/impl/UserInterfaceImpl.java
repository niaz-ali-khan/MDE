/**
 */
package eHealthManagement.impl;

import eHealthManagement.AllowedUserInterfaces;
import eHealthManagement.EHealthManagementPackage;
import eHealthManagement.User;
import eHealthManagement.UserInterface;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.impl.UserInterfaceImpl#getUserInterfaces <em>User Interfaces</em>}</li>
 *   <li>{@link eHealthManagement.impl.UserInterfaceImpl#getUser <em>User</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserInterfaceImpl extends MinimalEObjectImpl.Container implements UserInterface {
	/**
	 * The default value of the '{@link #getUserInterfaces() <em>User Interfaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserInterfaces()
	 * @generated
	 * @ordered
	 */
	protected static final AllowedUserInterfaces USER_INTERFACES_EDEFAULT = AllowedUserInterfaces.PROFILE_VIEW;

	/**
	 * The cached value of the '{@link #getUserInterfaces() <em>User Interfaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserInterfaces()
	 * @generated
	 * @ordered
	 */
	protected AllowedUserInterfaces userInterfaces = USER_INTERFACES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected User user;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementPackage.Literals.USER_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowedUserInterfaces getUserInterfaces() {
		return userInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserInterfaces(AllowedUserInterfaces newUserInterfaces) {
		AllowedUserInterfaces oldUserInterfaces = userInterfaces;
		userInterfaces = newUserInterfaces == null ? USER_INTERFACES_EDEFAULT : newUserInterfaces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EHealthManagementPackage.USER_INTERFACE__USER_INTERFACES, oldUserInterfaces, userInterfaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getUser() {
		if (user != null && user.eIsProxy()) {
			InternalEObject oldUser = (InternalEObject) user;
			user = (User) eResolveProxy(oldUser);
			if (user != oldUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EHealthManagementPackage.USER_INTERFACE__USER, oldUser, user));
			}
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(User newUser) {
		User oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.USER_INTERFACE__USER,
					oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EHealthManagementPackage.USER_INTERFACE__USER_INTERFACES:
			return getUserInterfaces();
		case EHealthManagementPackage.USER_INTERFACE__USER:
			if (resolve)
				return getUser();
			return basicGetUser();
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
		case EHealthManagementPackage.USER_INTERFACE__USER_INTERFACES:
			setUserInterfaces((AllowedUserInterfaces) newValue);
			return;
		case EHealthManagementPackage.USER_INTERFACE__USER:
			setUser((User) newValue);
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
		case EHealthManagementPackage.USER_INTERFACE__USER_INTERFACES:
			setUserInterfaces(USER_INTERFACES_EDEFAULT);
			return;
		case EHealthManagementPackage.USER_INTERFACE__USER:
			setUser((User) null);
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
		case EHealthManagementPackage.USER_INTERFACE__USER_INTERFACES:
			return userInterfaces != USER_INTERFACES_EDEFAULT;
		case EHealthManagementPackage.USER_INTERFACE__USER:
			return user != null;
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
		result.append(" (UserInterfaces: ");
		result.append(userInterfaces);
		result.append(')');
		return result.toString();
	}

	@Override
	public void setText(String string) {
		// TODO Auto-generated method stub

	}

} //UserInterfaceImpl
