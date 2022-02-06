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
 *   <li>{@link eHealthManagement.impl.MessageExchangeStandardImpl#getEMessageExchangeStandardName <em>EMessage Exchange Standard Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageExchangeStandardImpl extends MinimalEObjectImpl.Container implements MessageExchangeStandard {
	/**
	 * The default value of the '{@link #getEMessageExchangeStandardName() <em>EMessage Exchange Standard Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMessageExchangeStandardName()
	 * @generated
	 * @ordered
	 */
	protected static final String EMESSAGE_EXCHANGE_STANDARD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEMessageExchangeStandardName() <em>EMessage Exchange Standard Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMessageExchangeStandardName()
	 * @generated
	 * @ordered
	 */
	protected String eMessageExchangeStandardName = EMESSAGE_EXCHANGE_STANDARD_NAME_EDEFAULT;

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
	public String getEMessageExchangeStandardName() {
		return eMessageExchangeStandardName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEMessageExchangeStandardName(String newEMessageExchangeStandardName) {
		String oldEMessageExchangeStandardName = eMessageExchangeStandardName;
		eMessageExchangeStandardName = newEMessageExchangeStandardName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EHealthManagementPackage.MESSAGE_EXCHANGE_STANDARD__EMESSAGE_EXCHANGE_STANDARD_NAME,
					oldEMessageExchangeStandardName, eMessageExchangeStandardName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EHealthManagementPackage.MESSAGE_EXCHANGE_STANDARD__EMESSAGE_EXCHANGE_STANDARD_NAME:
			return getEMessageExchangeStandardName();
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
		case EHealthManagementPackage.MESSAGE_EXCHANGE_STANDARD__EMESSAGE_EXCHANGE_STANDARD_NAME:
			setEMessageExchangeStandardName((String) newValue);
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
		case EHealthManagementPackage.MESSAGE_EXCHANGE_STANDARD__EMESSAGE_EXCHANGE_STANDARD_NAME:
			setEMessageExchangeStandardName(EMESSAGE_EXCHANGE_STANDARD_NAME_EDEFAULT);
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
		case EHealthManagementPackage.MESSAGE_EXCHANGE_STANDARD__EMESSAGE_EXCHANGE_STANDARD_NAME:
			return EMESSAGE_EXCHANGE_STANDARD_NAME_EDEFAULT == null ? eMessageExchangeStandardName != null
					: !EMESSAGE_EXCHANGE_STANDARD_NAME_EDEFAULT.equals(eMessageExchangeStandardName);
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
		result.append(" (EMessageExchangeStandardName: ");
		result.append(eMessageExchangeStandardName);
		result.append(')');
		return result.toString();
	}

} //MessageExchangeStandardImpl
