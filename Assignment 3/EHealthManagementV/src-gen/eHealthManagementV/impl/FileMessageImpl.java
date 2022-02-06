/**
 */
package eHealthManagementV.impl;

import eHealthManagementV.EHealthManagementVPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagementV.impl.FileMessageImpl#getEFileMessageName <em>EFile Message Name</em>}</li>
 *   <li>{@link eHealthManagementV.impl.FileMessageImpl#getFileSize <em>File Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileMessageImpl extends MessageTypeImpl implements FileMessage {
	/**
	 * The default value of the '{@link #getEFileMessageName() <em>EFile Message Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEFileMessageName()
	 * @generated
	 * @ordered
	 */
	protected static final String EFILE_MESSAGE_NAME_EDEFAULT = "file";
	/**
	 * The cached value of the '{@link #getEFileMessageName() <em>EFile Message Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEFileMessageName()
	 * @generated
	 * @ordered
	 */
	protected String eFileMessageName = EFILE_MESSAGE_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getFileSize() <em>File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSize()
	 * @generated
	 * @ordered
	 */
	protected static final int FILE_SIZE_EDEFAULT = 2;
	/**
	 * The cached value of the '{@link #getFileSize() <em>File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSize()
	 * @generated
	 * @ordered
	 */
	protected int fileSize = FILE_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementVPackage.Literals.FILE_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEFileMessageName() {
		return eFileMessageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEFileMessageName(String newEFileMessageName) {
		String oldEFileMessageName = eFileMessageName;
		eFileMessageName = newEFileMessageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EHealthManagementVPackage.FILE_MESSAGE__EFILE_MESSAGE_NAME, oldEFileMessageName, eFileMessageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFileSize() {
		return fileSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileSize(int newFileSize) {
		int oldFileSize = fileSize;
		fileSize = newFileSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementVPackage.FILE_MESSAGE__FILE_SIZE,
					oldFileSize, fileSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EHealthManagementVPackage.FILE_MESSAGE__EFILE_MESSAGE_NAME:
			return getEFileMessageName();
		case EHealthManagementVPackage.FILE_MESSAGE__FILE_SIZE:
			return getFileSize();
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
		case EHealthManagementVPackage.FILE_MESSAGE__EFILE_MESSAGE_NAME:
			setEFileMessageName((String) newValue);
			return;
		case EHealthManagementVPackage.FILE_MESSAGE__FILE_SIZE:
			setFileSize((Integer) newValue);
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
		case EHealthManagementVPackage.FILE_MESSAGE__EFILE_MESSAGE_NAME:
			setEFileMessageName(EFILE_MESSAGE_NAME_EDEFAULT);
			return;
		case EHealthManagementVPackage.FILE_MESSAGE__FILE_SIZE:
			setFileSize(FILE_SIZE_EDEFAULT);
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
		case EHealthManagementVPackage.FILE_MESSAGE__EFILE_MESSAGE_NAME:
			return EFILE_MESSAGE_NAME_EDEFAULT == null ? eFileMessageName != null
					: !EFILE_MESSAGE_NAME_EDEFAULT.equals(eFileMessageName);
		case EHealthManagementVPackage.FILE_MESSAGE__FILE_SIZE:
			return fileSize != FILE_SIZE_EDEFAULT;
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
		result.append(" (EFileMessageName: ");
		result.append(eFileMessageName);
		result.append(", FileSize: ");
		result.append(fileSize);
		result.append(')');
		return result.toString();
	}

} //FileMessageImpl
