/**
 */
package eHealthManagement.impl;

import eHealthManagement.EHealthManagementPackage;
import eHealthManagement.UIVarchar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Varchar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.impl.UIVarcharImpl#getEUIVarcharName <em>EUI Varchar Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UIVarcharImpl extends TextUIImpl implements UIVarchar {
	/**
	 * The default value of the '{@link #getEUIVarcharName() <em>EUI Varchar Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEUIVarcharName()
	 * @generated
	 * @ordered
	 */
	protected static final String EUI_VARCHAR_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEUIVarcharName() <em>EUI Varchar Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEUIVarcharName()
	 * @generated
	 * @ordered
	 */
	protected String euiVarcharName = EUI_VARCHAR_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIVarcharImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementPackage.Literals.UI_VARCHAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEUIVarcharName() {
		return euiVarcharName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEUIVarcharName(String newEUIVarcharName) {
		String oldEUIVarcharName = euiVarcharName;
		euiVarcharName = newEUIVarcharName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.UI_VARCHAR__EUI_VARCHAR_NAME,
					oldEUIVarcharName, euiVarcharName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EHealthManagementPackage.UI_VARCHAR__EUI_VARCHAR_NAME:
			return getEUIVarcharName();
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
		case EHealthManagementPackage.UI_VARCHAR__EUI_VARCHAR_NAME:
			setEUIVarcharName((String) newValue);
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
		case EHealthManagementPackage.UI_VARCHAR__EUI_VARCHAR_NAME:
			setEUIVarcharName(EUI_VARCHAR_NAME_EDEFAULT);
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
		case EHealthManagementPackage.UI_VARCHAR__EUI_VARCHAR_NAME:
			return EUI_VARCHAR_NAME_EDEFAULT == null ? euiVarcharName != null
					: !EUI_VARCHAR_NAME_EDEFAULT.equals(euiVarcharName);
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
		result.append(" (EUIVarcharName: ");
		result.append(euiVarcharName);
		result.append(')');
		return result.toString();
	}

} //UIVarcharImpl
