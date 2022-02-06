/**
 */
package eHealthManagementV.impl;

import eHealthManagementV.EHealthManagementVPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Video UI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagementV.impl.VideoUIImpl#getEVdeoUIName <em>EVdeo UI Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VideoUIImpl extends RepresentationInterfacesImpl implements VideoUI {
	/**
	 * The default value of the '{@link #getEVdeoUIName() <em>EVdeo UI Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEVdeoUIName()
	 * @generated
	 * @ordered
	 */
	protected static final String EVDEO_UI_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEVdeoUIName() <em>EVdeo UI Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEVdeoUIName()
	 * @generated
	 * @ordered
	 */
	protected String eVdeoUIName = EVDEO_UI_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoUIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementVPackage.Literals.VIDEO_UI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEVdeoUIName() {
		return eVdeoUIName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEVdeoUIName(String newEVdeoUIName) {
		String oldEVdeoUIName = eVdeoUIName;
		eVdeoUIName = newEVdeoUIName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementVPackage.VIDEO_UI__EVDEO_UI_NAME,
					oldEVdeoUIName, eVdeoUIName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EHealthManagementVPackage.VIDEO_UI__EVDEO_UI_NAME:
			return getEVdeoUIName();
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
		case EHealthManagementVPackage.VIDEO_UI__EVDEO_UI_NAME:
			setEVdeoUIName((String) newValue);
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
		case EHealthManagementVPackage.VIDEO_UI__EVDEO_UI_NAME:
			setEVdeoUIName(EVDEO_UI_NAME_EDEFAULT);
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
		case EHealthManagementVPackage.VIDEO_UI__EVDEO_UI_NAME:
			return EVDEO_UI_NAME_EDEFAULT == null ? eVdeoUIName != null : !EVDEO_UI_NAME_EDEFAULT.equals(eVdeoUIName);
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
		result.append(" (EVdeoUIName: ");
		result.append(eVdeoUIName);
		result.append(')');
		return result.toString();
	}

} //VideoUIImpl
