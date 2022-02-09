/**
 */
package eHealthManagement.impl;

import eHealthManagement.CVarchar;
import eHealthManagement.EHealthManagementPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CVarchar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.impl.CVarcharImpl#getCVarcharName <em>CVarchar Name</em>}</li>
 *   <li>{@link eHealthManagement.impl.CVarcharImpl#getCVarcharSize <em>CVarchar Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CVarcharImpl extends MinimalEObjectImpl.Container implements CVarchar {
	/**
	 * The default value of the '{@link #getCVarcharName() <em>CVarchar Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCVarcharName()
	 * @generated
	 * @ordered
	 */
	protected static final String CVARCHAR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCVarcharName() <em>CVarchar Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCVarcharName()
	 * @generated
	 * @ordered
	 */
	protected String cVarcharName = CVARCHAR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCVarcharSize() <em>CVarchar Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCVarcharSize()
	 * @generated
	 * @ordered
	 */
	protected static final long CVARCHAR_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCVarcharSize() <em>CVarchar Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCVarcharSize()
	 * @generated
	 * @ordered
	 */
	protected long cVarcharSize = CVARCHAR_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CVarcharImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementPackage.Literals.CVARCHAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCVarcharName() {
		return cVarcharName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCVarcharName(String newCVarcharName) {
		String oldCVarcharName = cVarcharName;
		cVarcharName = newCVarcharName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.CVARCHAR__CVARCHAR_NAME, oldCVarcharName, cVarcharName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCVarcharSize() {
		return cVarcharSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCVarcharSize(long newCVarcharSize) {
		long oldCVarcharSize = cVarcharSize;
		cVarcharSize = newCVarcharSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.CVARCHAR__CVARCHAR_SIZE, oldCVarcharSize, cVarcharSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EHealthManagementPackage.CVARCHAR__CVARCHAR_NAME:
				return getCVarcharName();
			case EHealthManagementPackage.CVARCHAR__CVARCHAR_SIZE:
				return getCVarcharSize();
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
			case EHealthManagementPackage.CVARCHAR__CVARCHAR_NAME:
				setCVarcharName((String)newValue);
				return;
			case EHealthManagementPackage.CVARCHAR__CVARCHAR_SIZE:
				setCVarcharSize((Long)newValue);
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
			case EHealthManagementPackage.CVARCHAR__CVARCHAR_NAME:
				setCVarcharName(CVARCHAR_NAME_EDEFAULT);
				return;
			case EHealthManagementPackage.CVARCHAR__CVARCHAR_SIZE:
				setCVarcharSize(CVARCHAR_SIZE_EDEFAULT);
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
			case EHealthManagementPackage.CVARCHAR__CVARCHAR_NAME:
				return CVARCHAR_NAME_EDEFAULT == null ? cVarcharName != null : !CVARCHAR_NAME_EDEFAULT.equals(cVarcharName);
			case EHealthManagementPackage.CVARCHAR__CVARCHAR_SIZE:
				return cVarcharSize != CVARCHAR_SIZE_EDEFAULT;
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
		result.append(" (CVarcharName: ");
		result.append(cVarcharName);
		result.append(", CVarcharSize: ");
		result.append(cVarcharSize);
		result.append(')');
		return result.toString();
	}

} //CVarcharImpl
