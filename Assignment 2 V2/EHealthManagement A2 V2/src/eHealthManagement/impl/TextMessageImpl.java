/**
 */
package eHealthManagement.impl;

import eHealthManagement.Attribute;
import eHealthManagement.EHealthManagementPackage;
import eHealthManagement.TextMessage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.impl.TextMessageImpl#getTextMessageName <em>Text Message Name</em>}</li>
 *   <li>{@link eHealthManagement.impl.TextMessageImpl#getTextMessageSize <em>Text Message Size</em>}</li>
 *   <li>{@link eHealthManagement.impl.TextMessageImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextMessageImpl extends MinimalEObjectImpl.Container implements TextMessage {
	/**
	 * The default value of the '{@link #getTextMessageName() <em>Text Message Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextMessageName()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_MESSAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextMessageName() <em>Text Message Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextMessageName()
	 * @generated
	 * @ordered
	 */
	protected String textMessageName = TEXT_MESSAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextMessageSize() <em>Text Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextMessageSize()
	 * @generated
	 * @ordered
	 */
	protected static final long TEXT_MESSAGE_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTextMessageSize() <em>Text Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextMessageSize()
	 * @generated
	 * @ordered
	 */
	protected long textMessageSize = TEXT_MESSAGE_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute attribute;

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
	public String getTextMessageName() {
		return textMessageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextMessageName(String newTextMessageName) {
		String oldTextMessageName = textMessageName;
		textMessageName = newTextMessageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.TEXT_MESSAGE__TEXT_MESSAGE_NAME, oldTextMessageName, textMessageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTextMessageSize() {
		return textMessageSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextMessageSize(long newTextMessageSize) {
		long oldTextMessageSize = textMessageSize;
		textMessageSize = newTextMessageSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.TEXT_MESSAGE__TEXT_MESSAGE_SIZE, oldTextMessageSize, textMessageSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttribute() {
		if (attribute != null && attribute.eIsProxy()) {
			InternalEObject oldAttribute = (InternalEObject)attribute;
			attribute = (Attribute)eResolveProxy(oldAttribute);
			if (attribute != oldAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EHealthManagementPackage.TEXT_MESSAGE__ATTRIBUTE, oldAttribute, attribute));
			}
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(Attribute newAttribute) {
		Attribute oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.TEXT_MESSAGE__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EHealthManagementPackage.TEXT_MESSAGE__TEXT_MESSAGE_NAME:
				return getTextMessageName();
			case EHealthManagementPackage.TEXT_MESSAGE__TEXT_MESSAGE_SIZE:
				return getTextMessageSize();
			case EHealthManagementPackage.TEXT_MESSAGE__ATTRIBUTE:
				if (resolve) return getAttribute();
				return basicGetAttribute();
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
			case EHealthManagementPackage.TEXT_MESSAGE__TEXT_MESSAGE_NAME:
				setTextMessageName((String)newValue);
				return;
			case EHealthManagementPackage.TEXT_MESSAGE__TEXT_MESSAGE_SIZE:
				setTextMessageSize((Long)newValue);
				return;
			case EHealthManagementPackage.TEXT_MESSAGE__ATTRIBUTE:
				setAttribute((Attribute)newValue);
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
			case EHealthManagementPackage.TEXT_MESSAGE__TEXT_MESSAGE_NAME:
				setTextMessageName(TEXT_MESSAGE_NAME_EDEFAULT);
				return;
			case EHealthManagementPackage.TEXT_MESSAGE__TEXT_MESSAGE_SIZE:
				setTextMessageSize(TEXT_MESSAGE_SIZE_EDEFAULT);
				return;
			case EHealthManagementPackage.TEXT_MESSAGE__ATTRIBUTE:
				setAttribute((Attribute)null);
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
			case EHealthManagementPackage.TEXT_MESSAGE__TEXT_MESSAGE_NAME:
				return TEXT_MESSAGE_NAME_EDEFAULT == null ? textMessageName != null : !TEXT_MESSAGE_NAME_EDEFAULT.equals(textMessageName);
			case EHealthManagementPackage.TEXT_MESSAGE__TEXT_MESSAGE_SIZE:
				return textMessageSize != TEXT_MESSAGE_SIZE_EDEFAULT;
			case EHealthManagementPackage.TEXT_MESSAGE__ATTRIBUTE:
				return attribute != null;
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
		result.append(" (TextMessageName: ");
		result.append(textMessageName);
		result.append(", TextMessageSize: ");
		result.append(textMessageSize);
		result.append(')');
		return result.toString();
	}

} //TextMessageImpl
