/**
 */
package eHealthManagement.impl;

import eHealthManagement.Attribute;
import eHealthManagement.EHealthManagementPackage;
import eHealthManagement.FileMessage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.impl.FileMessageImpl#getFileMessageName <em>File Message Name</em>}</li>
 *   <li>{@link eHealthManagement.impl.FileMessageImpl#getFileMessageSize <em>File Message Size</em>}</li>
 *   <li>{@link eHealthManagement.impl.FileMessageImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileMessageImpl extends MinimalEObjectImpl.Container implements FileMessage {
	/**
	 * The default value of the '{@link #getFileMessageName() <em>File Message Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileMessageName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_MESSAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileMessageName() <em>File Message Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileMessageName()
	 * @generated
	 * @ordered
	 */
	protected String fileMessageName = FILE_MESSAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileMessageSize() <em>File Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileMessageSize()
	 * @generated
	 * @ordered
	 */
	protected static final long FILE_MESSAGE_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getFileMessageSize() <em>File Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileMessageSize()
	 * @generated
	 * @ordered
	 */
	protected long fileMessageSize = FILE_MESSAGE_SIZE_EDEFAULT;

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
		return EHealthManagementPackage.Literals.FILE_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileMessageName() {
		return fileMessageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileMessageName(String newFileMessageName) {
		String oldFileMessageName = fileMessageName;
		fileMessageName = newFileMessageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.FILE_MESSAGE__FILE_MESSAGE_NAME, oldFileMessageName, fileMessageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getFileMessageSize() {
		return fileMessageSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileMessageSize(long newFileMessageSize) {
		long oldFileMessageSize = fileMessageSize;
		fileMessageSize = newFileMessageSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.FILE_MESSAGE__FILE_MESSAGE_SIZE, oldFileMessageSize, fileMessageSize));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EHealthManagementPackage.FILE_MESSAGE__ATTRIBUTE, oldAttribute, attribute));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.FILE_MESSAGE__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EHealthManagementPackage.FILE_MESSAGE__FILE_MESSAGE_NAME:
				return getFileMessageName();
			case EHealthManagementPackage.FILE_MESSAGE__FILE_MESSAGE_SIZE:
				return getFileMessageSize();
			case EHealthManagementPackage.FILE_MESSAGE__ATTRIBUTE:
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
			case EHealthManagementPackage.FILE_MESSAGE__FILE_MESSAGE_NAME:
				setFileMessageName((String)newValue);
				return;
			case EHealthManagementPackage.FILE_MESSAGE__FILE_MESSAGE_SIZE:
				setFileMessageSize((Long)newValue);
				return;
			case EHealthManagementPackage.FILE_MESSAGE__ATTRIBUTE:
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
			case EHealthManagementPackage.FILE_MESSAGE__FILE_MESSAGE_NAME:
				setFileMessageName(FILE_MESSAGE_NAME_EDEFAULT);
				return;
			case EHealthManagementPackage.FILE_MESSAGE__FILE_MESSAGE_SIZE:
				setFileMessageSize(FILE_MESSAGE_SIZE_EDEFAULT);
				return;
			case EHealthManagementPackage.FILE_MESSAGE__ATTRIBUTE:
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
			case EHealthManagementPackage.FILE_MESSAGE__FILE_MESSAGE_NAME:
				return FILE_MESSAGE_NAME_EDEFAULT == null ? fileMessageName != null : !FILE_MESSAGE_NAME_EDEFAULT.equals(fileMessageName);
			case EHealthManagementPackage.FILE_MESSAGE__FILE_MESSAGE_SIZE:
				return fileMessageSize != FILE_MESSAGE_SIZE_EDEFAULT;
			case EHealthManagementPackage.FILE_MESSAGE__ATTRIBUTE:
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
		result.append(" (FileMessageName: ");
		result.append(fileMessageName);
		result.append(", FileMessageSize: ");
		result.append(fileMessageSize);
		result.append(')');
		return result.toString();
	}

} //FileMessageImpl
