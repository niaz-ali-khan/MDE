/**
 */
package eHealthManagement.impl;

import eHealthManagement.EHealthManagementPackage;
import eHealthManagement.TextUI;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text UI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.impl.TextUIImpl#getETextUIName <em>EText UI Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextUIImpl extends RepresentationInterfaceImpl implements TextUI {
	/**
	 * The default value of the '{@link #getETextUIName() <em>EText UI Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETextUIName()
	 * @generated
	 * @ordered
	 */
	protected static final String ETEXT_UI_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getETextUIName() <em>EText UI Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETextUIName()
	 * @generated
	 * @ordered
	 */
	protected String eTextUIName = ETEXT_UI_NAME_EDEFAULT;

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
	public String getETextUIName() {
		return eTextUIName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setETextUIName(String newETextUIName) {
		String oldETextUIName = eTextUIName;
		eTextUIName = newETextUIName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.TEXT_UI__ETEXT_UI_NAME,
					oldETextUIName, eTextUIName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EHealthManagementPackage.TEXT_UI__ETEXT_UI_NAME:
			return getETextUIName();
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
		case EHealthManagementPackage.TEXT_UI__ETEXT_UI_NAME:
			setETextUIName((String) newValue);
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
		case EHealthManagementPackage.TEXT_UI__ETEXT_UI_NAME:
			setETextUIName(ETEXT_UI_NAME_EDEFAULT);
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
		case EHealthManagementPackage.TEXT_UI__ETEXT_UI_NAME:
			return ETEXT_UI_NAME_EDEFAULT == null ? eTextUIName != null : !ETEXT_UI_NAME_EDEFAULT.equals(eTextUIName);
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
		result.append(" (ETextUIName: ");
		result.append(eTextUIName);
		result.append(')');
		return result.toString();
	}

} //TextUIImpl
