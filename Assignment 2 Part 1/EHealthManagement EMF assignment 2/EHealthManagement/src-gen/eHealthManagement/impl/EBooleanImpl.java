/**
 */
package eHealthManagement.impl;

import eHealthManagement.EBoolean;
import eHealthManagement.EHealthManagementPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EBoolean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.impl.EBooleanImpl#isEBooleanDefault <em>EBoolean Default</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EBooleanImpl extends AttributesImpl implements EBoolean {
	/**
	 * The default value of the '{@link #isEBooleanDefault() <em>EBoolean Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEBooleanDefault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EBOOLEAN_DEFAULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEBooleanDefault() <em>EBoolean Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEBooleanDefault()
	 * @generated
	 * @ordered
	 */
	protected boolean eBooleanDefault = EBOOLEAN_DEFAULT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EBooleanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementPackage.Literals.EBOOLEAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEBooleanDefault() {
		return eBooleanDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEBooleanDefault(boolean newEBooleanDefault) {
		boolean oldEBooleanDefault = eBooleanDefault;
		eBooleanDefault = newEBooleanDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.EBOOLEAN__EBOOLEAN_DEFAULT,
					oldEBooleanDefault, eBooleanDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EHealthManagementPackage.EBOOLEAN__EBOOLEAN_DEFAULT:
			return isEBooleanDefault();
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
		case EHealthManagementPackage.EBOOLEAN__EBOOLEAN_DEFAULT:
			setEBooleanDefault((Boolean) newValue);
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
		case EHealthManagementPackage.EBOOLEAN__EBOOLEAN_DEFAULT:
			setEBooleanDefault(EBOOLEAN_DEFAULT_EDEFAULT);
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
		case EHealthManagementPackage.EBOOLEAN__EBOOLEAN_DEFAULT:
			return eBooleanDefault != EBOOLEAN_DEFAULT_EDEFAULT;
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
		result.append(" (EBooleanDefault: ");
		result.append(eBooleanDefault);
		result.append(')');
		return result.toString();
	}

} //EBooleanImpl
