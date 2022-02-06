/**
 */
package eHealthManagement.impl;

import eHealthManagement.DocumentType;
import eHealthManagement.EHealthManagementPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.impl.DocumentTypeImpl#getEDocumentTypeName <em>EDocument Type Name</em>}</li>
 *   <li>{@link eHealthManagement.impl.DocumentTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentTypeImpl extends CommunicationInterfaceImpl implements DocumentType {
	/**
	 * The default value of the '{@link #getEDocumentTypeName() <em>EDocument Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEDocumentTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String EDOCUMENT_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEDocumentTypeName() <em>EDocument Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEDocumentTypeName()
	 * @generated
	 * @ordered
	 */
	protected String eDocumentTypeName = EDOCUMENT_TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	public String getEDocumentTypeName() {
		return eDocumentTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEDocumentTypeName(String newEDocumentTypeName) {
		String oldEDocumentTypeName = eDocumentTypeName;
		eDocumentTypeName = newEDocumentTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EHealthManagementPackage.DOCUMENT_TYPE__EDOCUMENT_TYPE_NAME, oldEDocumentTypeName,
					eDocumentTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.DOCUMENT_TYPE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EHealthManagementPackage.DOCUMENT_TYPE__EDOCUMENT_TYPE_NAME:
			return getEDocumentTypeName();
		case EHealthManagementPackage.DOCUMENT_TYPE__NAME:
			return getName();
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
		case EHealthManagementPackage.DOCUMENT_TYPE__EDOCUMENT_TYPE_NAME:
			setEDocumentTypeName((String) newValue);
			return;
		case EHealthManagementPackage.DOCUMENT_TYPE__NAME:
			setName((String) newValue);
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
		case EHealthManagementPackage.DOCUMENT_TYPE__EDOCUMENT_TYPE_NAME:
			setEDocumentTypeName(EDOCUMENT_TYPE_NAME_EDEFAULT);
			return;
		case EHealthManagementPackage.DOCUMENT_TYPE__NAME:
			setName(NAME_EDEFAULT);
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
		case EHealthManagementPackage.DOCUMENT_TYPE__EDOCUMENT_TYPE_NAME:
			return EDOCUMENT_TYPE_NAME_EDEFAULT == null ? eDocumentTypeName != null
					: !EDOCUMENT_TYPE_NAME_EDEFAULT.equals(eDocumentTypeName);
		case EHealthManagementPackage.DOCUMENT_TYPE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (EDocumentTypeName: ");
		result.append(eDocumentTypeName);
		result.append(", Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DocumentTypeImpl
