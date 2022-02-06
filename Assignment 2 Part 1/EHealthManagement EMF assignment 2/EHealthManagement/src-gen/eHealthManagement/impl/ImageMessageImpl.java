/**
 */
package eHealthManagement.impl;

import eHealthManagement.EHealthManagementPackage;
import eHealthManagement.ImageMessage;

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
 *   <li>{@link eHealthManagement.impl.ImageMessageImpl#getEImageMessageName <em>EImage Message Name</em>}</li>
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
	protected static final String EIMAGE_MESSAGE_NAME_EDEFAULT = null;

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
		return EHealthManagementPackage.Literals.IMAGE_MESSAGE;
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
					EHealthManagementPackage.IMAGE_MESSAGE__EIMAGE_MESSAGE_NAME, oldEImageMessageName,
					eImageMessageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EHealthManagementPackage.IMAGE_MESSAGE__EIMAGE_MESSAGE_NAME:
			return getEImageMessageName();
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
		case EHealthManagementPackage.IMAGE_MESSAGE__EIMAGE_MESSAGE_NAME:
			setEImageMessageName((String) newValue);
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
		case EHealthManagementPackage.IMAGE_MESSAGE__EIMAGE_MESSAGE_NAME:
			setEImageMessageName(EIMAGE_MESSAGE_NAME_EDEFAULT);
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
		case EHealthManagementPackage.IMAGE_MESSAGE__EIMAGE_MESSAGE_NAME:
			return EIMAGE_MESSAGE_NAME_EDEFAULT == null ? eImageMessageName != null
					: !EIMAGE_MESSAGE_NAME_EDEFAULT.equals(eImageMessageName);
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
		result.append(')');
		return result.toString();
	}

} //ImageMessageImpl
