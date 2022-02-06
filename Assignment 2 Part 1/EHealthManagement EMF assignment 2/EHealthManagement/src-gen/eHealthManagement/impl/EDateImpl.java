/**
 */
package eHealthManagement.impl;

import eHealthManagement.EDate;
import eHealthManagement.EHealthManagementPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EDate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.impl.EDateImpl#getEDateDefault <em>EDate Default</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EDateImpl extends AttributesImpl implements EDate {
	/**
	 * The default value of the '{@link #getEDateDefault() <em>EDate Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEDateDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Date EDATE_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEDateDefault() <em>EDate Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEDateDefault()
	 * @generated
	 * @ordered
	 */
	protected Date eDateDefault = EDATE_DEFAULT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EDateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementPackage.Literals.EDATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEDateDefault() {
		return eDateDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEDateDefault(Date newEDateDefault) {
		Date oldEDateDefault = eDateDefault;
		eDateDefault = newEDateDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.EDATE__EDATE_DEFAULT,
					oldEDateDefault, eDateDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EHealthManagementPackage.EDATE__EDATE_DEFAULT:
			return getEDateDefault();
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
		case EHealthManagementPackage.EDATE__EDATE_DEFAULT:
			setEDateDefault((Date) newValue);
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
		case EHealthManagementPackage.EDATE__EDATE_DEFAULT:
			setEDateDefault(EDATE_DEFAULT_EDEFAULT);
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
		case EHealthManagementPackage.EDATE__EDATE_DEFAULT:
			return EDATE_DEFAULT_EDEFAULT == null ? eDateDefault != null : !EDATE_DEFAULT_EDEFAULT.equals(eDateDefault);
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
		result.append(" (EDateDefault: ");
		result.append(eDateDefault);
		result.append(')');
		return result.toString();
	}

} //EDateImpl
