/**
 */
package eHealthManagement.impl;

import eHealthManagement.DocumentType;
import eHealthManagement.EHealthManagementPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.impl.DocumentTypeImpl#getDocumentTypeName <em>Document Type Name</em>}</li>
 *   <li>{@link eHealthManagement.impl.DocumentTypeImpl#getDocumentTypeSize <em>Document Type Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentTypeImpl extends MinimalEObjectImpl.Container implements DocumentType {
	/**
	 * The default value of the '{@link #getDocumentTypeName() <em>Document Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentTypeName() <em>Document Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentTypeName()
	 * @generated
	 * @ordered
	 */
	protected String documentTypeName = DOCUMENT_TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentTypeSize() <em>Document Type Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentTypeSize()
	 * @generated
	 * @ordered
	 */
	protected static final long DOCUMENT_TYPE_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDocumentTypeSize() <em>Document Type Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentTypeSize()
	 * @generated
	 * @ordered
	 */
	protected long documentTypeSize = DOCUMENT_TYPE_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementPackage.Literals.DOCUMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentTypeName() {
		return documentTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentTypeName(String newDocumentTypeName) {
		String oldDocumentTypeName = documentTypeName;
		documentTypeName = newDocumentTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.DOCUMENT_TYPE__DOCUMENT_TYPE_NAME, oldDocumentTypeName, documentTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDocumentTypeSize() {
		return documentTypeSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentTypeSize(long newDocumentTypeSize) {
		long oldDocumentTypeSize = documentTypeSize;
		documentTypeSize = newDocumentTypeSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.DOCUMENT_TYPE__DOCUMENT_TYPE_SIZE, oldDocumentTypeSize, documentTypeSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EHealthManagementPackage.DOCUMENT_TYPE__DOCUMENT_TYPE_NAME:
				return getDocumentTypeName();
			case EHealthManagementPackage.DOCUMENT_TYPE__DOCUMENT_TYPE_SIZE:
				return getDocumentTypeSize();
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
			case EHealthManagementPackage.DOCUMENT_TYPE__DOCUMENT_TYPE_NAME:
				setDocumentTypeName((String)newValue);
				return;
			case EHealthManagementPackage.DOCUMENT_TYPE__DOCUMENT_TYPE_SIZE:
				setDocumentTypeSize((Long)newValue);
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
			case EHealthManagementPackage.DOCUMENT_TYPE__DOCUMENT_TYPE_NAME:
				setDocumentTypeName(DOCUMENT_TYPE_NAME_EDEFAULT);
				return;
			case EHealthManagementPackage.DOCUMENT_TYPE__DOCUMENT_TYPE_SIZE:
				setDocumentTypeSize(DOCUMENT_TYPE_SIZE_EDEFAULT);
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
			case EHealthManagementPackage.DOCUMENT_TYPE__DOCUMENT_TYPE_NAME:
				return DOCUMENT_TYPE_NAME_EDEFAULT == null ? documentTypeName != null : !DOCUMENT_TYPE_NAME_EDEFAULT.equals(documentTypeName);
			case EHealthManagementPackage.DOCUMENT_TYPE__DOCUMENT_TYPE_SIZE:
				return documentTypeSize != DOCUMENT_TYPE_SIZE_EDEFAULT;
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
		result.append(" (DocumentTypeName: ");
		result.append(documentTypeName);
		result.append(", DocumentTypeSize: ");
		result.append(documentTypeSize);
		result.append(')');
		return result.toString();
	}

} //DocumentTypeImpl
