/**
 */
package eHealthManagement.impl;

import eHealthManagement.EHealthManagementPackage;
import eHealthManagement.EventMessageType;
import eHealthManagement.MessageExchangeStandard;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Message Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.impl.EventMessageTypeImpl#getEEventMessageTypeName <em>EEvent Message Type Name</em>}</li>
 *   <li>{@link eHealthManagement.impl.EventMessageTypeImpl#getMessageexchangestandard <em>Messageexchangestandard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventMessageTypeImpl extends MinimalEObjectImpl.Container implements EventMessageType {
	/**
	 * The default value of the '{@link #getEEventMessageTypeName() <em>EEvent Message Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEEventMessageTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String EEVENT_MESSAGE_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEEventMessageTypeName() <em>EEvent Message Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEEventMessageTypeName()
	 * @generated
	 * @ordered
	 */
	protected String eEventMessageTypeName = EEVENT_MESSAGE_TYPE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMessageexchangestandard() <em>Messageexchangestandard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageexchangestandard()
	 * @generated
	 * @ordered
	 */
	protected MessageExchangeStandard messageexchangestandard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventMessageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementPackage.Literals.EVENT_MESSAGE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEEventMessageTypeName() {
		return eEventMessageTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEEventMessageTypeName(String newEEventMessageTypeName) {
		String oldEEventMessageTypeName = eEventMessageTypeName;
		eEventMessageTypeName = newEEventMessageTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EHealthManagementPackage.EVENT_MESSAGE_TYPE__EEVENT_MESSAGE_TYPE_NAME, oldEEventMessageTypeName,
					eEventMessageTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageExchangeStandard getMessageexchangestandard() {
		if (messageexchangestandard != null && messageexchangestandard.eIsProxy()) {
			InternalEObject oldMessageexchangestandard = (InternalEObject) messageexchangestandard;
			messageexchangestandard = (MessageExchangeStandard) eResolveProxy(oldMessageexchangestandard);
			if (messageexchangestandard != oldMessageexchangestandard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EHealthManagementPackage.EVENT_MESSAGE_TYPE__MESSAGEEXCHANGESTANDARD,
							oldMessageexchangestandard, messageexchangestandard));
			}
		}
		return messageexchangestandard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageExchangeStandard basicGetMessageexchangestandard() {
		return messageexchangestandard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageexchangestandard(MessageExchangeStandard newMessageexchangestandard) {
		MessageExchangeStandard oldMessageexchangestandard = messageexchangestandard;
		messageexchangestandard = newMessageexchangestandard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EHealthManagementPackage.EVENT_MESSAGE_TYPE__MESSAGEEXCHANGESTANDARD, oldMessageexchangestandard,
					messageexchangestandard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EHealthManagementPackage.EVENT_MESSAGE_TYPE__EEVENT_MESSAGE_TYPE_NAME:
			return getEEventMessageTypeName();
		case EHealthManagementPackage.EVENT_MESSAGE_TYPE__MESSAGEEXCHANGESTANDARD:
			if (resolve)
				return getMessageexchangestandard();
			return basicGetMessageexchangestandard();
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
		case EHealthManagementPackage.EVENT_MESSAGE_TYPE__EEVENT_MESSAGE_TYPE_NAME:
			setEEventMessageTypeName((String) newValue);
			return;
		case EHealthManagementPackage.EVENT_MESSAGE_TYPE__MESSAGEEXCHANGESTANDARD:
			setMessageexchangestandard((MessageExchangeStandard) newValue);
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
		case EHealthManagementPackage.EVENT_MESSAGE_TYPE__EEVENT_MESSAGE_TYPE_NAME:
			setEEventMessageTypeName(EEVENT_MESSAGE_TYPE_NAME_EDEFAULT);
			return;
		case EHealthManagementPackage.EVENT_MESSAGE_TYPE__MESSAGEEXCHANGESTANDARD:
			setMessageexchangestandard((MessageExchangeStandard) null);
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
		case EHealthManagementPackage.EVENT_MESSAGE_TYPE__EEVENT_MESSAGE_TYPE_NAME:
			return EEVENT_MESSAGE_TYPE_NAME_EDEFAULT == null ? eEventMessageTypeName != null
					: !EEVENT_MESSAGE_TYPE_NAME_EDEFAULT.equals(eEventMessageTypeName);
		case EHealthManagementPackage.EVENT_MESSAGE_TYPE__MESSAGEEXCHANGESTANDARD:
			return messageexchangestandard != null;
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
		result.append(" (EEventMessageTypeName: ");
		result.append(eEventMessageTypeName);
		result.append(')');
		return result.toString();
	}

} //EventMessageTypeImpl
