/**
 */
package eHealthManagement.impl;

import eHealthManagement.Attributes;
import eHealthManagement.EHealthManagementPackage;
import eHealthManagement.EventMessageType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.impl.AttributesImpl#getEventmessagetype <em>Eventmessagetype</em>}</li>
 *   <li>{@link eHealthManagement.impl.AttributesImpl#getEAttributesName <em>EAttributes Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributesImpl extends EntityImpl implements Attributes {
	/**
	 * The cached value of the '{@link #getEventmessagetype() <em>Eventmessagetype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventmessagetype()
	 * @generated
	 * @ordered
	 */
	protected EventMessageType eventmessagetype;

	/**
	 * The default value of the '{@link #getEAttributesName() <em>EAttributes Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttributesName()
	 * @generated
	 * @ordered
	 */
	protected static final String EATTRIBUTES_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEAttributesName() <em>EAttributes Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttributesName()
	 * @generated
	 * @ordered
	 */
	protected String eAttributesName = EATTRIBUTES_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementPackage.Literals.ATTRIBUTES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventMessageType getEventmessagetype() {
		if (eventmessagetype != null && eventmessagetype.eIsProxy()) {
			InternalEObject oldEventmessagetype = (InternalEObject) eventmessagetype;
			eventmessagetype = (EventMessageType) eResolveProxy(oldEventmessagetype);
			if (eventmessagetype != oldEventmessagetype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EHealthManagementPackage.ATTRIBUTES__EVENTMESSAGETYPE, oldEventmessagetype,
							eventmessagetype));
			}
		}
		return eventmessagetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventMessageType basicGetEventmessagetype() {
		return eventmessagetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventmessagetype(EventMessageType newEventmessagetype) {
		EventMessageType oldEventmessagetype = eventmessagetype;
		eventmessagetype = newEventmessagetype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.ATTRIBUTES__EVENTMESSAGETYPE,
					oldEventmessagetype, eventmessagetype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEAttributesName() {
		return eAttributesName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEAttributesName(String newEAttributesName) {
		String oldEAttributesName = eAttributesName;
		eAttributesName = newEAttributesName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.ATTRIBUTES__EATTRIBUTES_NAME,
					oldEAttributesName, eAttributesName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EHealthManagementPackage.ATTRIBUTES__EVENTMESSAGETYPE:
			if (resolve)
				return getEventmessagetype();
			return basicGetEventmessagetype();
		case EHealthManagementPackage.ATTRIBUTES__EATTRIBUTES_NAME:
			return getEAttributesName();
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
		case EHealthManagementPackage.ATTRIBUTES__EVENTMESSAGETYPE:
			setEventmessagetype((EventMessageType) newValue);
			return;
		case EHealthManagementPackage.ATTRIBUTES__EATTRIBUTES_NAME:
			setEAttributesName((String) newValue);
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
		case EHealthManagementPackage.ATTRIBUTES__EVENTMESSAGETYPE:
			setEventmessagetype((EventMessageType) null);
			return;
		case EHealthManagementPackage.ATTRIBUTES__EATTRIBUTES_NAME:
			setEAttributesName(EATTRIBUTES_NAME_EDEFAULT);
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
		case EHealthManagementPackage.ATTRIBUTES__EVENTMESSAGETYPE:
			return eventmessagetype != null;
		case EHealthManagementPackage.ATTRIBUTES__EATTRIBUTES_NAME:
			return EATTRIBUTES_NAME_EDEFAULT == null ? eAttributesName != null
					: !EATTRIBUTES_NAME_EDEFAULT.equals(eAttributesName);
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
		result.append(" (EAttributesName: ");
		result.append(eAttributesName);
		result.append(')');
		return result.toString();
	}

} //AttributesImpl
