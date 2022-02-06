/**
 */
package eHealthManagementV.impl;

import eHealthManagementV.AllowedUserTypes;
import eHealthManagementV.EHealthManagementVPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Users</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagementV.impl.UsersImpl#getUserTypes <em>User Types</em>}</li>
 *   <li>{@link eHealthManagementV.impl.UsersImpl#isUserValidity <em>User Validity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsersImpl extends MinimalEObjectImpl.Container implements Users {
	/**
	 * The default value of the '{@link #getUserTypes() <em>User Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserTypes()
	 * @generated
	 * @ordered
	 */
	protected static final AllowedUserTypes USER_TYPES_EDEFAULT = AllowedUserTypes.DOCTOR;

	/**
	 * The cached value of the '{@link #getUserTypes() <em>User Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserTypes()
	 * @generated
	 * @ordered
	 */
	protected AllowedUserTypes userTypes = USER_TYPES_EDEFAULT;

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
	protected UsersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementVPackage.Literals.USERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowedUserTypes getUserTypes() {
		return userTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserTypes(AllowedUserTypes newUserTypes) {
		AllowedUserTypes oldUserTypes = userTypes;
		userTypes = newUserTypes == null ? USER_TYPES_EDEFAULT : newUserTypes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementVPackage.USERS__USER_TYPES,
					oldUserTypes, userTypes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementVPackage.USERS__USER_VALIDITY,
					oldUserValidity, userValidity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EHealthManagementVPackage.USERS__USER_TYPES:
			return getUserTypes();
		case EHealthManagementVPackage.USERS__USER_VALIDITY:
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
		case EHealthManagementVPackage.USERS__USER_TYPES:
			setUserTypes((AllowedUserTypes) newValue);
			return;
		case EHealthManagementVPackage.USERS__USER_VALIDITY:
			setUserValidity((Boolean) newValue);
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
		case EHealthManagementVPackage.USERS__USER_TYPES:
			setUserTypes(USER_TYPES_EDEFAULT);
			return;
		case EHealthManagementVPackage.USERS__USER_VALIDITY:
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
		case EHealthManagementVPackage.USERS__USER_TYPES:
			return userTypes != USER_TYPES_EDEFAULT;
		case EHealthManagementVPackage.USERS__USER_VALIDITY:
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (UserTypes: ");
		result.append(userTypes);
		result.append(", UserValidity: ");
		result.append(userValidity);
		result.append(')');
		return result.toString();
	}

} //UsersImpl
