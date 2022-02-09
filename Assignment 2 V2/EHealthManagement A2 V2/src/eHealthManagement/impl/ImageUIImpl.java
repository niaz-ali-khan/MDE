/**
 */
package eHealthManagement.impl;

import eHealthManagement.EHealthManagementPackage;
import eHealthManagement.ImageUI;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image UI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.impl.ImageUIImpl#getImageUIName <em>Image UI Name</em>}</li>
 *   <li>{@link eHealthManagement.impl.ImageUIImpl#getImageUIType <em>Image UI Type</em>}</li>
 *   <li>{@link eHealthManagement.impl.ImageUIImpl#getImageUISize <em>Image UI Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageUIImpl extends MinimalEObjectImpl.Container implements ImageUI {
	/**
	 * The default value of the '{@link #getImageUIName() <em>Image UI Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageUIName()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_UI_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageUIName() <em>Image UI Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageUIName()
	 * @generated
	 * @ordered
	 */
	protected String imageUIName = IMAGE_UI_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageUIType() <em>Image UI Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageUIType()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_UI_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageUIType() <em>Image UI Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageUIType()
	 * @generated
	 * @ordered
	 */
	protected String imageUIType = IMAGE_UI_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageUISize() <em>Image UI Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageUISize()
	 * @generated
	 * @ordered
	 */
	protected static final long IMAGE_UI_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getImageUISize() <em>Image UI Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageUISize()
	 * @generated
	 * @ordered
	 */
	protected long imageUISize = IMAGE_UI_SIZE_EDEFAULT;

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
		return EHealthManagementPackage.Literals.IMAGE_UI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageUIName() {
		return imageUIName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageUIName(String newImageUIName) {
		String oldImageUIName = imageUIName;
		imageUIName = newImageUIName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.IMAGE_UI__IMAGE_UI_NAME, oldImageUIName, imageUIName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageUIType() {
		return imageUIType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageUIType(String newImageUIType) {
		String oldImageUIType = imageUIType;
		imageUIType = newImageUIType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.IMAGE_UI__IMAGE_UI_TYPE, oldImageUIType, imageUIType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getImageUISize() {
		return imageUISize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageUISize(long newImageUISize) {
		long oldImageUISize = imageUISize;
		imageUISize = newImageUISize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.IMAGE_UI__IMAGE_UI_SIZE, oldImageUISize, imageUISize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EHealthManagementPackage.IMAGE_UI__IMAGE_UI_NAME:
				return getImageUIName();
			case EHealthManagementPackage.IMAGE_UI__IMAGE_UI_TYPE:
				return getImageUIType();
			case EHealthManagementPackage.IMAGE_UI__IMAGE_UI_SIZE:
				return getImageUISize();
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
			case EHealthManagementPackage.IMAGE_UI__IMAGE_UI_NAME:
				setImageUIName((String)newValue);
				return;
			case EHealthManagementPackage.IMAGE_UI__IMAGE_UI_TYPE:
				setImageUIType((String)newValue);
				return;
			case EHealthManagementPackage.IMAGE_UI__IMAGE_UI_SIZE:
				setImageUISize((Long)newValue);
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
			case EHealthManagementPackage.IMAGE_UI__IMAGE_UI_NAME:
				setImageUIName(IMAGE_UI_NAME_EDEFAULT);
				return;
			case EHealthManagementPackage.IMAGE_UI__IMAGE_UI_TYPE:
				setImageUIType(IMAGE_UI_TYPE_EDEFAULT);
				return;
			case EHealthManagementPackage.IMAGE_UI__IMAGE_UI_SIZE:
				setImageUISize(IMAGE_UI_SIZE_EDEFAULT);
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
			case EHealthManagementPackage.IMAGE_UI__IMAGE_UI_NAME:
				return IMAGE_UI_NAME_EDEFAULT == null ? imageUIName != null : !IMAGE_UI_NAME_EDEFAULT.equals(imageUIName);
			case EHealthManagementPackage.IMAGE_UI__IMAGE_UI_TYPE:
				return IMAGE_UI_TYPE_EDEFAULT == null ? imageUIType != null : !IMAGE_UI_TYPE_EDEFAULT.equals(imageUIType);
			case EHealthManagementPackage.IMAGE_UI__IMAGE_UI_SIZE:
				return imageUISize != IMAGE_UI_SIZE_EDEFAULT;
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
		result.append(" (ImageUIName: ");
		result.append(imageUIName);
		result.append(", ImageUIType: ");
		result.append(imageUIType);
		result.append(", ImageUISize: ");
		result.append(imageUISize);
		result.append(')');
		return result.toString();
	}

} //ImageUIImpl
