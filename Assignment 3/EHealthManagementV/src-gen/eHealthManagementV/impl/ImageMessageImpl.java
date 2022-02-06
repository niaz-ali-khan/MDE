/**
 */
package eHealthManagementV.impl;

import eHealthManagementV.EHealthManagementVPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagementV.impl.ImageMessageImpl#getEImageMessageName <em>EImage Message Name</em>}</li>
 *   <li>{@link eHealthManagementV.impl.ImageMessageImpl#getImageSize <em>Image Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageMessageImpl extends MessageTypeImpl implements ImageMessage {
	/**
	 * The default value of the '{@link #getEImageMessageName() <em>EImage Message Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEImageMessageName()
	 * @generated
	 * @ordered
	 */
	protected static final String EIMAGE_MESSAGE_NAME_EDEFAULT = "img";
	/**
	 * The cached value of the '{@link #getEImageMessageName() <em>EImage Message Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEImageMessageName()
	 * @generated
	 * @ordered
	 */
	protected String eImageMessageName = EIMAGE_MESSAGE_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getImageSize() <em>Image Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageSize()
	 * @generated
	 * @ordered
	 */
	protected static final int IMAGE_SIZE_EDEFAULT = 3;
	/**
	 * The cached value of the '{@link #getImageSize() <em>Image Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageSize()
	 * @generated
	 * @ordered
	 */
	protected int imageSize = IMAGE_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementVPackage.Literals.IMAGE_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEImageMessageName() {
		return eImageMessageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEImageMessageName(String newEImageMessageName) {
		String oldEImageMessageName = eImageMessageName;
		eImageMessageName = newEImageMessageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EHealthManagementVPackage.IMAGE_MESSAGE__EIMAGE_MESSAGE_NAME, oldEImageMessageName,
					eImageMessageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getImageSize() {
		return imageSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageSize(int newImageSize) {
		int oldImageSize = imageSize;
		imageSize = newImageSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementVPackage.IMAGE_MESSAGE__IMAGE_SIZE,
					oldImageSize, imageSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EHealthManagementVPackage.IMAGE_MESSAGE__EIMAGE_MESSAGE_NAME:
			return getEImageMessageName();
		case EHealthManagementVPackage.IMAGE_MESSAGE__IMAGE_SIZE:
			return getImageSize();
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
		case EHealthManagementVPackage.IMAGE_MESSAGE__EIMAGE_MESSAGE_NAME:
			setEImageMessageName((String) newValue);
			return;
		case EHealthManagementVPackage.IMAGE_MESSAGE__IMAGE_SIZE:
			setImageSize((Integer) newValue);
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
		case EHealthManagementVPackage.IMAGE_MESSAGE__EIMAGE_MESSAGE_NAME:
			setEImageMessageName(EIMAGE_MESSAGE_NAME_EDEFAULT);
			return;
		case EHealthManagementVPackage.IMAGE_MESSAGE__IMAGE_SIZE:
			setImageSize(IMAGE_SIZE_EDEFAULT);
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
		case EHealthManagementVPackage.IMAGE_MESSAGE__EIMAGE_MESSAGE_NAME:
			return EIMAGE_MESSAGE_NAME_EDEFAULT == null ? eImageMessageName != null
					: !EIMAGE_MESSAGE_NAME_EDEFAULT.equals(eImageMessageName);
		case EHealthManagementVPackage.IMAGE_MESSAGE__IMAGE_SIZE:
			return imageSize != IMAGE_SIZE_EDEFAULT;
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
		result.append(" (EImageMessageName: ");
		result.append(eImageMessageName);
		result.append(", ImageSize: ");
		result.append(imageSize);
		result.append(')');
		return result.toString();
	}

} //ImageMessageImpl
