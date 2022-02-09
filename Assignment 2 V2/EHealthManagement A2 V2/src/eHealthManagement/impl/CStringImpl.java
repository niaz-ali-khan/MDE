/**
 */
package eHealthManagement.impl;

import eHealthManagement.CString;
import eHealthManagement.EHealthManagementPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CString</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.impl.CStringImpl#getCStringName <em>CString Name</em>}</li>
 *   <li>{@link eHealthManagement.impl.CStringImpl#getCStringSize <em>CString Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CStringImpl extends MinimalEObjectImpl.Container implements CString {
	/**
	 * The default value of the '{@link #getCStringName() <em>CString Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCStringName()
	 * @generated
	 * @ordered
	 */
	protected static final String CSTRING_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCStringName() <em>CString Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCStringName()
	 * @generated
	 * @ordered
	 */
	protected String cStringName = CSTRING_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCStringSize() <em>CString Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCStringSize()
	 * @generated
	 * @ordered
	 */
	protected static final long CSTRING_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCStringSize() <em>CString Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCStringSize()
	 * @generated
	 * @ordered
	 */
	protected long cStringSize = CSTRING_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CStringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementPackage.Literals.CSTRING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCStringName() {
		return cStringName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCStringName(String newCStringName) {
		String oldCStringName = cStringName;
		cStringName = newCStringName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.CSTRING__CSTRING_NAME, oldCStringName, cStringName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCStringSize() {
		return cStringSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCStringSize(long newCStringSize) {
		long oldCStringSize = cStringSize;
		cStringSize = newCStringSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.CSTRING__CSTRING_SIZE, oldCStringSize, cStringSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EHealthManagementPackage.CSTRING__CSTRING_NAME:
				return getCStringName();
			case EHealthManagementPackage.CSTRING__CSTRING_SIZE:
				return getCStringSize();
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
			case EHealthManagementPackage.CSTRING__CSTRING_NAME:
				setCStringName((String)newValue);
				return;
			case EHealthManagementPackage.CSTRING__CSTRING_SIZE:
				setCStringSize((Long)newValue);
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
			case EHealthManagementPackage.CSTRING__CSTRING_NAME:
				setCStringName(CSTRING_NAME_EDEFAULT);
				return;
			case EHealthManagementPackage.CSTRING__CSTRING_SIZE:
				setCStringSize(CSTRING_SIZE_EDEFAULT);
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
			case EHealthManagementPackage.CSTRING__CSTRING_NAME:
				return CSTRING_NAME_EDEFAULT == null ? cStringName != null : !CSTRING_NAME_EDEFAULT.equals(cStringName);
			case EHealthManagementPackage.CSTRING__CSTRING_SIZE:
				return cStringSize != CSTRING_SIZE_EDEFAULT;
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
		result.append(" (CStringName: ");
		result.append(cStringName);
		result.append(", CStringSize: ");
		result.append(cStringSize);
		result.append(')');
		return result.toString();
	}

} //CStringImpl
