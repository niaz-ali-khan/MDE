/**
 */
package eHealthManagement.impl;

import eHealthManagement.Attributes;
import eHealthManagement.EHealthManagementPackage;
import eHealthManagement.FileMessage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.impl.FileMessageImpl#getEFileMessageName <em>EFile Message Name</em>}</li>
 *   <li>{@link eHealthManagement.impl.FileMessageImpl#getAttributes <em>Attributes</em>}</li>
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
	protected static final String EFILE_MESSAGE_NAME_EDEFAULT = null;

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
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected Attributes attributes;

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
					EHealthManagementPackage.FILE_MESSAGE__EFILE_MESSAGE_NAME, oldEFileMessageName, eFileMessageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributes getAttributes() {
		if (attributes != null && attributes.eIsProxy()) {
			InternalEObject oldAttributes = (InternalEObject) attributes;
			attributes = (Attributes) eResolveProxy(oldAttributes);
			if (attributes != oldAttributes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EHealthManagementPackage.FILE_MESSAGE__ATTRIBUTES, oldAttributes, attributes));
			}
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributes basicGetAttributes() {
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributes(Attributes newAttributes) {
		Attributes oldAttributes = attributes;
		attributes = newAttributes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.FILE_MESSAGE__ATTRIBUTES,
					oldAttributes, attributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EHealthManagementPackage.FILE_MESSAGE__EFILE_MESSAGE_NAME:
			return getEFileMessageName();
		case EHealthManagementPackage.FILE_MESSAGE__ATTRIBUTES:
			if (resolve)
				return getAttributes();
			return basicGetAttributes();
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
		case EHealthManagementPackage.FILE_MESSAGE__EFILE_MESSAGE_NAME:
			setEFileMessageName((String) newValue);
			return;
		case EHealthManagementPackage.FILE_MESSAGE__ATTRIBUTES:
			setAttributes((Attributes) newValue);
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
		case EHealthManagementPackage.FILE_MESSAGE__EFILE_MESSAGE_NAME:
			setEFileMessageName(EFILE_MESSAGE_NAME_EDEFAULT);
			return;
		case EHealthManagementPackage.FILE_MESSAGE__ATTRIBUTES:
			setAttributes((Attributes) null);
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
		case EHealthManagementPackage.FILE_MESSAGE__EFILE_MESSAGE_NAME:
			return EFILE_MESSAGE_NAME_EDEFAULT == null ? eFileMessageName != null
					: !EFILE_MESSAGE_NAME_EDEFAULT.equals(eFileMessageName);
		case EHealthManagementPackage.FILE_MESSAGE__ATTRIBUTES:
			return attributes != null;
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
		result.append(')');
		return result.toString();
	}

} //FileMessageImpl
