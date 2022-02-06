/**
 */
package eHealthManagement.impl;

import eHealthManagement.EHealthManagementPackage;
import eHealthManagement.MessageType;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link eHealthManagement.impl.MessageTypeImpl#getEMessageTypeName <em>EMessage Type Name</em>}</li>
 *   <li>{@link eHealthManagement.impl.MessageTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageTypeImpl extends CommunicationInterfaceImpl implements MessageType {
	/**
	 * The default value of the '{@link #getEMessageTypeName() <em>EMessage Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMessageTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String EMESSAGE_TYPE_NAME_EDEFAULT = "check";

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
		return EHealthManagementPackage.Literals.MESSAGE_TYPE;
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
					EHealthManagementPackage.MESSAGE_TYPE__EMESSAGE_TYPE_NAME, oldEMessageTypeName, eMessageTypeName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.MESSAGE_TYPE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void InstantiateMessageInterface() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EHealthManagementPackage.MESSAGE_TYPE__EMESSAGE_TYPE_NAME:
			return getEMessageTypeName();
		case EHealthManagementPackage.MESSAGE_TYPE__NAME:
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
		case EHealthManagementPackage.MESSAGE_TYPE__EMESSAGE_TYPE_NAME:
			setEMessageTypeName((String) newValue);
			return;
		case EHealthManagementPackage.MESSAGE_TYPE__NAME:
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
		case EHealthManagementPackage.MESSAGE_TYPE__EMESSAGE_TYPE_NAME:
			setEMessageTypeName(EMESSAGE_TYPE_NAME_EDEFAULT);
			return;
		case EHealthManagementPackage.MESSAGE_TYPE__NAME:
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
		case EHealthManagementPackage.MESSAGE_TYPE__EMESSAGE_TYPE_NAME:
			return EMESSAGE_TYPE_NAME_EDEFAULT == null ? eMessageTypeName != null
					: !EMESSAGE_TYPE_NAME_EDEFAULT.equals(eMessageTypeName);
		case EHealthManagementPackage.MESSAGE_TYPE__NAME:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case EHealthManagementPackage.MESSAGE_TYPE___INSTANTIATE_MESSAGE_INTERFACE:
			InstantiateMessageInterface();
			return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MessageTypeImpl
