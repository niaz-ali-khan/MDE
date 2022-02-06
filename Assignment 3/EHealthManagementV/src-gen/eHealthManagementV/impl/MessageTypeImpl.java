/**
 */
package eHealthManagementV.impl;

import eHealthManagementV.EHealthManagementVPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagementV.impl.MessageTypeImpl#getEMessageTypeName <em>EMessage Type Name</em>}</li>
 *   <li>{@link eHealthManagementV.impl.MessageTypeImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageTypeImpl extends CommunicationInterfacesImpl implements MessageType {
	/**
	 * The default value of the '{@link #getEMessageTypeName() <em>EMessage Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMessageTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String EMESSAGE_TYPE_NAME_EDEFAULT = "msg";

	/**
	 * The cached value of the '{@link #getEMessageTypeName() <em>EMessage Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMessageTypeName()
	 * @generated
	 * @ordered
	 */
	protected String eMessageTypeName = EMESSAGE_TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementVPackage.Literals.MESSAGE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEMessageTypeName() {
		return eMessageTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEMessageTypeName(String newEMessageTypeName) {
		String oldEMessageTypeName = eMessageTypeName;
		eMessageTypeName = newEMessageTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EHealthManagementVPackage.MESSAGE_TYPE__EMESSAGE_TYPE_NAME, oldEMessageTypeName, eMessageTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementVPackage.MESSAGE_TYPE__SIZE, oldSize,
					size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EHealthManagementVPackage.MESSAGE_TYPE__EMESSAGE_TYPE_NAME:
			return getEMessageTypeName();
		case EHealthManagementVPackage.MESSAGE_TYPE__SIZE:
			return getSize();
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
		case EHealthManagementVPackage.MESSAGE_TYPE__EMESSAGE_TYPE_NAME:
			setEMessageTypeName((String) newValue);
			return;
		case EHealthManagementVPackage.MESSAGE_TYPE__SIZE:
			setSize((Integer) newValue);
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
		case EHealthManagementVPackage.MESSAGE_TYPE__EMESSAGE_TYPE_NAME:
			setEMessageTypeName(EMESSAGE_TYPE_NAME_EDEFAULT);
			return;
		case EHealthManagementVPackage.MESSAGE_TYPE__SIZE:
			setSize(SIZE_EDEFAULT);
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
		case EHealthManagementVPackage.MESSAGE_TYPE__EMESSAGE_TYPE_NAME:
			return EMESSAGE_TYPE_NAME_EDEFAULT == null ? eMessageTypeName != null
					: !EMESSAGE_TYPE_NAME_EDEFAULT.equals(eMessageTypeName);
		case EHealthManagementVPackage.MESSAGE_TYPE__SIZE:
			return size != SIZE_EDEFAULT;
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
		result.append(" (EMessageTypeName: ");
		result.append(eMessageTypeName);
		result.append(", Size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //MessageTypeImpl
