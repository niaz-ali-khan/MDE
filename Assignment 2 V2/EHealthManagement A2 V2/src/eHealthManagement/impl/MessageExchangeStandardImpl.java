/**
 */
package eHealthManagement.impl;

import eHealthManagement.EHealthManagementPackage;
import eHealthManagement.MessageExchangeStandard;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Exchange Standard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.impl.MessageExchangeStandardImpl#getMessageExchangeStandardName <em>Message Exchange Standard Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageExchangeStandardImpl extends MinimalEObjectImpl.Container implements MessageExchangeStandard {
	/**
	 * The default value of the '{@link #getMessageExchangeStandardName() <em>Message Exchange Standard Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageExchangeStandardName()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EXCHANGE_STANDARD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageExchangeStandardName() <em>Message Exchange Standard Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageExchangeStandardName()
	 * @generated
	 * @ordered
	 */
	protected String messageExchangeStandardName = MESSAGE_EXCHANGE_STANDARD_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageExchangeStandardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementPackage.Literals.MESSAGE_EXCHANGE_STANDARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageExchangeStandardName() {
		return messageExchangeStandardName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageExchangeStandardName(String newMessageExchangeStandardName) {
		String oldMessageExchangeStandardName = messageExchangeStandardName;
		messageExchangeStandardName = newMessageExchangeStandardName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.MESSAGE_EXCHANGE_STANDARD__MESSAGE_EXCHANGE_STANDARD_NAME, oldMessageExchangeStandardName, messageExchangeStandardName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EHealthManagementPackage.MESSAGE_EXCHANGE_STANDARD__MESSAGE_EXCHANGE_STANDARD_NAME:
				return getMessageExchangeStandardName();
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
			case EHealthManagementPackage.MESSAGE_EXCHANGE_STANDARD__MESSAGE_EXCHANGE_STANDARD_NAME:
				setMessageExchangeStandardName((String)newValue);
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
			case EHealthManagementPackage.MESSAGE_EXCHANGE_STANDARD__MESSAGE_EXCHANGE_STANDARD_NAME:
				setMessageExchangeStandardName(MESSAGE_EXCHANGE_STANDARD_NAME_EDEFAULT);
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
			case EHealthManagementPackage.MESSAGE_EXCHANGE_STANDARD__MESSAGE_EXCHANGE_STANDARD_NAME:
				return MESSAGE_EXCHANGE_STANDARD_NAME_EDEFAULT == null ? messageExchangeStandardName != null : !MESSAGE_EXCHANGE_STANDARD_NAME_EDEFAULT.equals(messageExchangeStandardName);
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
		result.append(" (MessageExchangeStandardName: ");
		result.append(messageExchangeStandardName);
		result.append(')');
		return result.toString();
	}

} //MessageExchangeStandardImpl
