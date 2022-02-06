/**
 */
package eHealthManagement.impl;

import eHealthManagement.EHealthManagementPackage;
import eHealthManagement.UIImage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.impl.UIImageImpl#getEUIImageName <em>EUI Image Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UIImageImpl extends ImageUIImpl implements UIImage {
	/**
	 * The default value of the '{@link #getEUIImageName() <em>EUI Image Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEUIImageName()
	 * @generated
	 * @ordered
	 */
	protected static final String EUI_IMAGE_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEUIImageName() <em>EUI Image Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEUIImageName()
	 * @generated
	 * @ordered
	 */
	protected String euiImageName = EUI_IMAGE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementPackage.Literals.UI_IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEUIImageName() {
		return euiImageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEUIImageName(String newEUIImageName) {
		String oldEUIImageName = euiImageName;
		euiImageName = newEUIImageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.UI_IMAGE__EUI_IMAGE_NAME,
					oldEUIImageName, euiImageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EHealthManagementPackage.UI_IMAGE__EUI_IMAGE_NAME:
			return getEUIImageName();
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
		case EHealthManagementPackage.UI_IMAGE__EUI_IMAGE_NAME:
			setEUIImageName((String) newValue);
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
		case EHealthManagementPackage.UI_IMAGE__EUI_IMAGE_NAME:
			setEUIImageName(EUI_IMAGE_NAME_EDEFAULT);
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
		case EHealthManagementPackage.UI_IMAGE__EUI_IMAGE_NAME:
			return EUI_IMAGE_NAME_EDEFAULT == null ? euiImageName != null
					: !EUI_IMAGE_NAME_EDEFAULT.equals(euiImageName);
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
		result.append(" (EUIImageName: ");
		result.append(euiImageName);
		result.append(')');
		return result.toString();
	}

} //UIImageImpl
