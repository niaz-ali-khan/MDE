/**
 */
package eHealthManagement.impl;

import eHealthManagement.CImage;
import eHealthManagement.EHealthManagementPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CImage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.impl.CImageImpl#getCImageName <em>CImage Name</em>}</li>
 *   <li>{@link eHealthManagement.impl.CImageImpl#getCImageSize <em>CImage Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CImageImpl extends MinimalEObjectImpl.Container implements CImage {
	/**
	 * The default value of the '{@link #getCImageName() <em>CImage Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCImageName()
	 * @generated
	 * @ordered
	 */
	protected static final String CIMAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCImageName() <em>CImage Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCImageName()
	 * @generated
	 * @ordered
	 */
	protected String cImageName = CIMAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCImageSize() <em>CImage Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCImageSize()
	 * @generated
	 * @ordered
	 */
	protected static final long CIMAGE_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCImageSize() <em>CImage Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCImageSize()
	 * @generated
	 * @ordered
	 */
	protected long cImageSize = CIMAGE_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementPackage.Literals.CIMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCImageName() {
		return cImageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCImageName(String newCImageName) {
		String oldCImageName = cImageName;
		cImageName = newCImageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.CIMAGE__CIMAGE_NAME, oldCImageName, cImageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCImageSize() {
		return cImageSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCImageSize(long newCImageSize) {
		long oldCImageSize = cImageSize;
		cImageSize = newCImageSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.CIMAGE__CIMAGE_SIZE, oldCImageSize, cImageSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EHealthManagementPackage.CIMAGE__CIMAGE_NAME:
				return getCImageName();
			case EHealthManagementPackage.CIMAGE__CIMAGE_SIZE:
				return getCImageSize();
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
			case EHealthManagementPackage.CIMAGE__CIMAGE_NAME:
				setCImageName((String)newValue);
				return;
			case EHealthManagementPackage.CIMAGE__CIMAGE_SIZE:
				setCImageSize((Long)newValue);
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
			case EHealthManagementPackage.CIMAGE__CIMAGE_NAME:
				setCImageName(CIMAGE_NAME_EDEFAULT);
				return;
			case EHealthManagementPackage.CIMAGE__CIMAGE_SIZE:
				setCImageSize(CIMAGE_SIZE_EDEFAULT);
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
			case EHealthManagementPackage.CIMAGE__CIMAGE_NAME:
				return CIMAGE_NAME_EDEFAULT == null ? cImageName != null : !CIMAGE_NAME_EDEFAULT.equals(cImageName);
			case EHealthManagementPackage.CIMAGE__CIMAGE_SIZE:
				return cImageSize != CIMAGE_SIZE_EDEFAULT;
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
		result.append(" (CImageName: ");
		result.append(cImageName);
		result.append(", CImageSize: ");
		result.append(cImageSize);
		result.append(')');
		return result.toString();
	}

} //CImageImpl
