/**
 */
package eHealthManagement.impl;

import eHealthManagement.EHealthManagementPackage;
import eHealthManagement.TextUI;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text UI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.impl.TextUIImpl#getTextUIName <em>Text UI Name</em>}</li>
 *   <li>{@link eHealthManagement.impl.TextUIImpl#getTextUIType <em>Text UI Type</em>}</li>
 *   <li>{@link eHealthManagement.impl.TextUIImpl#getTextUISize <em>Text UI Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextUIImpl extends MinimalEObjectImpl.Container implements TextUI {
	/**
	 * The default value of the '{@link #getTextUIName() <em>Text UI Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextUIName()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_UI_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextUIName() <em>Text UI Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextUIName()
	 * @generated
	 * @ordered
	 */
	protected String textUIName = TEXT_UI_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextUIType() <em>Text UI Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextUIType()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_UI_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextUIType() <em>Text UI Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextUIType()
	 * @generated
	 * @ordered
	 */
	protected String textUIType = TEXT_UI_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextUISize() <em>Text UI Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextUISize()
	 * @generated
	 * @ordered
	 */
	protected static final long TEXT_UI_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTextUISize() <em>Text UI Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextUISize()
	 * @generated
	 * @ordered
	 */
	protected long textUISize = TEXT_UI_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextUIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementPackage.Literals.TEXT_UI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextUIName() {
		return textUIName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextUIName(String newTextUIName) {
		String oldTextUIName = textUIName;
		textUIName = newTextUIName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.TEXT_UI__TEXT_UI_NAME, oldTextUIName, textUIName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextUIType() {
		return textUIType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextUIType(String newTextUIType) {
		String oldTextUIType = textUIType;
		textUIType = newTextUIType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.TEXT_UI__TEXT_UI_TYPE, oldTextUIType, textUIType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTextUISize() {
		return textUISize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextUISize(long newTextUISize) {
		long oldTextUISize = textUISize;
		textUISize = newTextUISize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.TEXT_UI__TEXT_UI_SIZE, oldTextUISize, textUISize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EHealthManagementPackage.TEXT_UI__TEXT_UI_NAME:
				return getTextUIName();
			case EHealthManagementPackage.TEXT_UI__TEXT_UI_TYPE:
				return getTextUIType();
			case EHealthManagementPackage.TEXT_UI__TEXT_UI_SIZE:
				return getTextUISize();
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
			case EHealthManagementPackage.TEXT_UI__TEXT_UI_NAME:
				setTextUIName((String)newValue);
				return;
			case EHealthManagementPackage.TEXT_UI__TEXT_UI_TYPE:
				setTextUIType((String)newValue);
				return;
			case EHealthManagementPackage.TEXT_UI__TEXT_UI_SIZE:
				setTextUISize((Long)newValue);
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
			case EHealthManagementPackage.TEXT_UI__TEXT_UI_NAME:
				setTextUIName(TEXT_UI_NAME_EDEFAULT);
				return;
			case EHealthManagementPackage.TEXT_UI__TEXT_UI_TYPE:
				setTextUIType(TEXT_UI_TYPE_EDEFAULT);
				return;
			case EHealthManagementPackage.TEXT_UI__TEXT_UI_SIZE:
				setTextUISize(TEXT_UI_SIZE_EDEFAULT);
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
			case EHealthManagementPackage.TEXT_UI__TEXT_UI_NAME:
				return TEXT_UI_NAME_EDEFAULT == null ? textUIName != null : !TEXT_UI_NAME_EDEFAULT.equals(textUIName);
			case EHealthManagementPackage.TEXT_UI__TEXT_UI_TYPE:
				return TEXT_UI_TYPE_EDEFAULT == null ? textUIType != null : !TEXT_UI_TYPE_EDEFAULT.equals(textUIType);
			case EHealthManagementPackage.TEXT_UI__TEXT_UI_SIZE:
				return textUISize != TEXT_UI_SIZE_EDEFAULT;
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
		result.append(" (TextUIName: ");
		result.append(textUIName);
		result.append(", TextUIType: ");
		result.append(textUIType);
		result.append(", TextUISize: ");
		result.append(textUISize);
		result.append(')');
		return result.toString();
	}

} //TextUIImpl
