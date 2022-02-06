/**
 */
package eHealthManagementV.impl;

import eHealthManagementV.EHealthManagementVPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image UI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagementV.impl.ImageUIImpl#getEImageUIName <em>EImage UI Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageUIImpl extends RepresentationInterfacesImpl implements ImageUI {
	/**
	 * The default value of the '{@link #getEImageUIName() <em>EImage UI Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEImageUIName()
	 * @generated
	 * @ordered
	 */
	protected static final String EIMAGE_UI_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEImageUIName() <em>EImage UI Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEImageUIName()
	 * @generated
	 * @ordered
	 */
	protected String eImageUIName = EIMAGE_UI_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageUIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementVPackage.Literals.IMAGE_UI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEImageUIName() {
		return eImageUIName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEImageUIName(String newEImageUIName) {
		String oldEImageUIName = eImageUIName;
		eImageUIName = newEImageUIName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementVPackage.IMAGE_UI__EIMAGE_UI_NAME,
					oldEImageUIName, eImageUIName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EHealthManagementVPackage.IMAGE_UI__EIMAGE_UI_NAME:
			return getEImageUIName();
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
		case EHealthManagementVPackage.IMAGE_UI__EIMAGE_UI_NAME:
			setEImageUIName((String) newValue);
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
		case EHealthManagementVPackage.IMAGE_UI__EIMAGE_UI_NAME:
			setEImageUIName(EIMAGE_UI_NAME_EDEFAULT);
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
		case EHealthManagementVPackage.IMAGE_UI__EIMAGE_UI_NAME:
			return EIMAGE_UI_NAME_EDEFAULT == null ? eImageUIName != null
					: !EIMAGE_UI_NAME_EDEFAULT.equals(eImageUIName);
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
		result.append(" (EImageUIName: ");
		result.append(eImageUIName);
		result.append(')');
		return result.toString();
	}

} //ImageUIImpl
