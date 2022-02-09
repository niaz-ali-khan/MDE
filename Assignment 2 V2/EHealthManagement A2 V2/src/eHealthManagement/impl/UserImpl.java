/**
 */
package eHealthManagement.impl;

import eHealthManagement.AllowedUserType;
import eHealthManagement.EHealthManagementPackage;
import eHealthManagement.User;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.impl.UserImpl#getUserType <em>User Type</em>}</li>
 *   <li>{@link eHealthManagement.impl.UserImpl#isUserValidity <em>User Validity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends MinimalEObjectImpl.Container implements User {
	/**
	 * The default value of the '{@link #getUserType() <em>User Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserType()
	 * @generated
	 * @ordered
	 */
	protected static final AllowedUserType USER_TYPE_EDEFAULT = AllowedUserType.DOCTOR;

	/**
	 * The cached value of the '{@link #getUserType() <em>User Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserType()
	 * @generated
	 * @ordered
	 */
	protected AllowedUserType userType = USER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUserValidity() <em>User Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUserValidity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USER_VALIDITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUserValidity() <em>User Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUserValidity()
	 * @generated
	 * @ordered
	 */
	protected boolean userValidity = USER_VALIDITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowedUserType getUserType() {
		return userType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserType(AllowedUserType newUserType) {
		AllowedUserType oldUserType = userType;
		userType = newUserType == null ? USER_TYPE_EDEFAULT : newUserType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.USER__USER_TYPE, oldUserType, userType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUserValidity() {
		return userValidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserValidity(boolean newUserValidity) {
		boolean oldUserValidity = userValidity;
		userValidity = newUserValidity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.USER__USER_VALIDITY, oldUserValidity, userValidity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EHealthManagementPackage.USER__USER_TYPE:
				return getUserType();
			case EHealthManagementPackage.USER__USER_VALIDITY:
				return isUserValidity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EHealthManagementPackage.USER__USER_TYPE:
				setUserType((AllowedUserType)newValue);
				return;
			case EHealthManagementPackage.USER__USER_VALIDITY:
				setUserValidity((Boolean)newValue);
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
			case EHealthManagementPackage.USER__USER_TYPE:
				setUserType(USER_TYPE_EDEFAULT);
				return;
			case EHealthManagementPackage.USER__USER_VALIDITY:
				setUserValidity(USER_VALIDITY_EDEFAULT);
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
			case EHealthManagementPackage.USER__USER_TYPE:
				return userType != USER_TYPE_EDEFAULT;
			case EHealthManagementPackage.USER__USER_VALIDITY:
				return userValidity != USER_VALIDITY_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (UserType: ");
		result.append(userType);
		result.append(", UserValidity: ");
		result.append(userValidity);
		result.append(')');
		return result.toString();
	}

} //UserImpl
