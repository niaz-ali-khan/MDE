/**
 */
package eHealthManagement.impl;

import eHealthManagement.Attribute;
import eHealthManagement.EHealthManagementPackage;
import eHealthManagement.ImageMessage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.impl.ImageMessageImpl#getImageMessageName <em>Image Message Name</em>}</li>
 *   <li>{@link eHealthManagement.impl.ImageMessageImpl#getImageMessageSize <em>Image Message Size</em>}</li>
 *   <li>{@link eHealthManagement.impl.ImageMessageImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageMessageImpl extends MinimalEObjectImpl.Container implements ImageMessage {
	/**
	 * The default value of the '{@link #getImageMessageName() <em>Image Message Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageMessageName()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_MESSAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageMessageName() <em>Image Message Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageMessageName()
	 * @generated
	 * @ordered
	 */
	protected String imageMessageName = IMAGE_MESSAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageMessageSize() <em>Image Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageMessageSize()
	 * @generated
	 * @ordered
	 */
	protected static final long IMAGE_MESSAGE_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getImageMessageSize() <em>Image Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageMessageSize()
	 * @generated
	 * @ordered
	 */
	protected long imageMessageSize = IMAGE_MESSAGE_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute attribute;

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
	public String getImageMessageName() {
		return imageMessageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageMessageName(String newImageMessageName) {
		String oldImageMessageName = imageMessageName;
		imageMessageName = newImageMessageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.IMAGE_MESSAGE__IMAGE_MESSAGE_NAME, oldImageMessageName, imageMessageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getImageMessageSize() {
		return imageMessageSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageMessageSize(long newImageMessageSize) {
		long oldImageMessageSize = imageMessageSize;
		imageMessageSize = newImageMessageSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.IMAGE_MESSAGE__IMAGE_MESSAGE_SIZE, oldImageMessageSize, imageMessageSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttribute() {
		if (attribute != null && attribute.eIsProxy()) {
			InternalEObject oldAttribute = (InternalEObject)attribute;
			attribute = (Attribute)eResolveProxy(oldAttribute);
			if (attribute != oldAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EHealthManagementPackage.IMAGE_MESSAGE__ATTRIBUTE, oldAttribute, attribute));
			}
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(Attribute newAttribute) {
		Attribute oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.IMAGE_MESSAGE__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EHealthManagementPackage.IMAGE_MESSAGE__IMAGE_MESSAGE_NAME:
				return getImageMessageName();
			case EHealthManagementPackage.IMAGE_MESSAGE__IMAGE_MESSAGE_SIZE:
				return getImageMessageSize();
			case EHealthManagementPackage.IMAGE_MESSAGE__ATTRIBUTE:
				if (resolve) return getAttribute();
				return basicGetAttribute();
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
			case EHealthManagementPackage.IMAGE_MESSAGE__IMAGE_MESSAGE_NAME:
				setImageMessageName((String)newValue);
				return;
			case EHealthManagementPackage.IMAGE_MESSAGE__IMAGE_MESSAGE_SIZE:
				setImageMessageSize((Long)newValue);
				return;
			case EHealthManagementPackage.IMAGE_MESSAGE__ATTRIBUTE:
				setAttribute((Attribute)newValue);
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
			case EHealthManagementPackage.IMAGE_MESSAGE__IMAGE_MESSAGE_NAME:
				setImageMessageName(IMAGE_MESSAGE_NAME_EDEFAULT);
				return;
			case EHealthManagementPackage.IMAGE_MESSAGE__IMAGE_MESSAGE_SIZE:
				setImageMessageSize(IMAGE_MESSAGE_SIZE_EDEFAULT);
				return;
			case EHealthManagementPackage.IMAGE_MESSAGE__ATTRIBUTE:
				setAttribute((Attribute)null);
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
			case EHealthManagementPackage.IMAGE_MESSAGE__IMAGE_MESSAGE_NAME:
				return IMAGE_MESSAGE_NAME_EDEFAULT == null ? imageMessageName != null : !IMAGE_MESSAGE_NAME_EDEFAULT.equals(imageMessageName);
			case EHealthManagementPackage.IMAGE_MESSAGE__IMAGE_MESSAGE_SIZE:
				return imageMessageSize != IMAGE_MESSAGE_SIZE_EDEFAULT;
			case EHealthManagementPackage.IMAGE_MESSAGE__ATTRIBUTE:
				return attribute != null;
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
		result.append(" (ImageMessageName: ");
		result.append(imageMessageName);
		result.append(", ImageMessageSize: ");
		result.append(imageMessageSize);
		result.append(')');
		return result.toString();
	}

} //ImageMessageImpl
