/**
 */
package eHealthManagement.impl;

import eHealthManagement.EHealthManagementPackage;
import eHealthManagement.EVarchar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EVarchar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.impl.EVarcharImpl#getEVarcharDefault <em>EVarchar Default</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EVarcharImpl extends AttributesImpl implements EVarchar {
	/**
	 * The default value of the '{@link #getEVarcharDefault() <em>EVarchar Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEVarcharDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String EVARCHAR_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEVarcharDefault() <em>EVarchar Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEVarcharDefault()
	 * @generated
	 * @ordered
	 */
	protected String eVarcharDefault = EVARCHAR_DEFAULT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EVarcharImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementPackage.Literals.EVARCHAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEVarcharDefault() {
		return eVarcharDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEVarcharDefault(String newEVarcharDefault) {
		String oldEVarcharDefault = eVarcharDefault;
		eVarcharDefault = newEVarcharDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.EVARCHAR__EVARCHAR_DEFAULT,
					oldEVarcharDefault, eVarcharDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EHealthManagementPackage.EVARCHAR__EVARCHAR_DEFAULT:
			return getEVarcharDefault();
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
		case EHealthManagementPackage.EVARCHAR__EVARCHAR_DEFAULT:
			setEVarcharDefault((String) newValue);
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
		case EHealthManagementPackage.EVARCHAR__EVARCHAR_DEFAULT:
			setEVarcharDefault(EVARCHAR_DEFAULT_EDEFAULT);
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
		case EHealthManagementPackage.EVARCHAR__EVARCHAR_DEFAULT:
			return EVARCHAR_DEFAULT_EDEFAULT == null ? eVarcharDefault != null
					: !EVARCHAR_DEFAULT_EDEFAULT.equals(eVarcharDefault);
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
		result.append(" (EVarcharDefault: ");
		result.append(eVarcharDefault);
		result.append(')');
		return result.toString();
	}

} //EVarcharImpl
