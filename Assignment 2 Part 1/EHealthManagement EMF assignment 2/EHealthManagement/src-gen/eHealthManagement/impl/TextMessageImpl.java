/**
 */
package eHealthManagement.impl;

import eHealthManagement.Attributes;
import eHealthManagement.EHealthManagementPackage;
import eHealthManagement.TextMessage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.impl.TextMessageImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link eHealthManagement.impl.TextMessageImpl#getETextMessageName <em>EText Message Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextMessageImpl extends MessageTypeImpl implements TextMessage {
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
	 * The default value of the '{@link #getETextMessageName() <em>EText Message Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETextMessageName()
	 * @generated
	 * @ordered
	 */
	protected static final String ETEXT_MESSAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getETextMessageName() <em>EText Message Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETextMessageName()
	 * @generated
	 * @ordered
	 */
	protected String eTextMessageName = ETEXT_MESSAGE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementPackage.Literals.TEXT_MESSAGE;
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
							EHealthManagementPackage.TEXT_MESSAGE__ATTRIBUTES, oldAttributes, attributes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.TEXT_MESSAGE__ATTRIBUTES,
					oldAttributes, attributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getETextMessageName() {
		return eTextMessageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setETextMessageName(String newETextMessageName) {
		String oldETextMessageName = eTextMessageName;
		eTextMessageName = newETextMessageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EHealthManagementPackage.TEXT_MESSAGE__ETEXT_MESSAGE_NAME, oldETextMessageName, eTextMessageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EHealthManagementPackage.TEXT_MESSAGE__ATTRIBUTES:
			if (resolve)
				return getAttributes();
			return basicGetAttributes();
		case EHealthManagementPackage.TEXT_MESSAGE__ETEXT_MESSAGE_NAME:
			return getETextMessageName();
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
		case EHealthManagementPackage.TEXT_MESSAGE__ATTRIBUTES:
			setAttributes((Attributes) newValue);
			return;
		case EHealthManagementPackage.TEXT_MESSAGE__ETEXT_MESSAGE_NAME:
			setETextMessageName((String) newValue);
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
		case EHealthManagementPackage.TEXT_MESSAGE__ATTRIBUTES:
			setAttributes((Attributes) null);
			return;
		case EHealthManagementPackage.TEXT_MESSAGE__ETEXT_MESSAGE_NAME:
			setETextMessageName(ETEXT_MESSAGE_NAME_EDEFAULT);
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
		case EHealthManagementPackage.TEXT_MESSAGE__ATTRIBUTES:
			return attributes != null;
		case EHealthManagementPackage.TEXT_MESSAGE__ETEXT_MESSAGE_NAME:
			return ETEXT_MESSAGE_NAME_EDEFAULT == null ? eTextMessageName != null
					: !ETEXT_MESSAGE_NAME_EDEFAULT.equals(eTextMessageName);
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
		result.append(" (ETextMessageName: ");
		result.append(eTextMessageName);
		result.append(')');
		return result.toString();
	}

} //TextMessageImpl
