/**
 */
package eHealthManagement.impl;

import eHealthManagement.EHealthManagementPackage;
import eHealthManagement.VideoUI;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Video UI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.impl.VideoUIImpl#getVideoUIName <em>Video UI Name</em>}</li>
 *   <li>{@link eHealthManagement.impl.VideoUIImpl#getVideoUIType <em>Video UI Type</em>}</li>
 *   <li>{@link eHealthManagement.impl.VideoUIImpl#getVideoUISize <em>Video UI Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VideoUIImpl extends MinimalEObjectImpl.Container implements VideoUI {
	/**
	 * The default value of the '{@link #getVideoUIName() <em>Video UI Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoUIName()
	 * @generated
	 * @ordered
	 */
	protected static final String VIDEO_UI_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVideoUIName() <em>Video UI Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoUIName()
	 * @generated
	 * @ordered
	 */
	protected String videoUIName = VIDEO_UI_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVideoUIType() <em>Video UI Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoUIType()
	 * @generated
	 * @ordered
	 */
	protected static final String VIDEO_UI_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVideoUIType() <em>Video UI Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoUIType()
	 * @generated
	 * @ordered
	 */
	protected String videoUIType = VIDEO_UI_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVideoUISize() <em>Video UI Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoUISize()
	 * @generated
	 * @ordered
	 */
	protected static final long VIDEO_UI_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getVideoUISize() <em>Video UI Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoUISize()
	 * @generated
	 * @ordered
	 */
	protected long videoUISize = VIDEO_UI_SIZE_EDEFAULT;

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
		return EHealthManagementPackage.Literals.VIDEO_UI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVideoUIName() {
		return videoUIName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVideoUIName(String newVideoUIName) {
		String oldVideoUIName = videoUIName;
		videoUIName = newVideoUIName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.VIDEO_UI__VIDEO_UI_NAME, oldVideoUIName, videoUIName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVideoUIType() {
		return videoUIType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVideoUIType(String newVideoUIType) {
		String oldVideoUIType = videoUIType;
		videoUIType = newVideoUIType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.VIDEO_UI__VIDEO_UI_TYPE, oldVideoUIType, videoUIType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getVideoUISize() {
		return videoUISize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVideoUISize(long newVideoUISize) {
		long oldVideoUISize = videoUISize;
		videoUISize = newVideoUISize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.VIDEO_UI__VIDEO_UI_SIZE, oldVideoUISize, videoUISize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EHealthManagementPackage.VIDEO_UI__VIDEO_UI_NAME:
				return getVideoUIName();
			case EHealthManagementPackage.VIDEO_UI__VIDEO_UI_TYPE:
				return getVideoUIType();
			case EHealthManagementPackage.VIDEO_UI__VIDEO_UI_SIZE:
				return getVideoUISize();
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
			case EHealthManagementPackage.VIDEO_UI__VIDEO_UI_NAME:
				setVideoUIName((String)newValue);
				return;
			case EHealthManagementPackage.VIDEO_UI__VIDEO_UI_TYPE:
				setVideoUIType((String)newValue);
				return;
			case EHealthManagementPackage.VIDEO_UI__VIDEO_UI_SIZE:
				setVideoUISize((Long)newValue);
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
			case EHealthManagementPackage.VIDEO_UI__VIDEO_UI_NAME:
				setVideoUIName(VIDEO_UI_NAME_EDEFAULT);
				return;
			case EHealthManagementPackage.VIDEO_UI__VIDEO_UI_TYPE:
				setVideoUIType(VIDEO_UI_TYPE_EDEFAULT);
				return;
			case EHealthManagementPackage.VIDEO_UI__VIDEO_UI_SIZE:
				setVideoUISize(VIDEO_UI_SIZE_EDEFAULT);
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
			case EHealthManagementPackage.VIDEO_UI__VIDEO_UI_NAME:
				return VIDEO_UI_NAME_EDEFAULT == null ? videoUIName != null : !VIDEO_UI_NAME_EDEFAULT.equals(videoUIName);
			case EHealthManagementPackage.VIDEO_UI__VIDEO_UI_TYPE:
				return VIDEO_UI_TYPE_EDEFAULT == null ? videoUIType != null : !VIDEO_UI_TYPE_EDEFAULT.equals(videoUIType);
			case EHealthManagementPackage.VIDEO_UI__VIDEO_UI_SIZE:
				return videoUISize != VIDEO_UI_SIZE_EDEFAULT;
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
		result.append(" (VideoUIName: ");
		result.append(videoUIName);
		result.append(", VideoUIType: ");
		result.append(videoUIType);
		result.append(", VideoUISize: ");
		result.append(videoUISize);
		result.append(')');
		return result.toString();
	}

} //VideoUIImpl
