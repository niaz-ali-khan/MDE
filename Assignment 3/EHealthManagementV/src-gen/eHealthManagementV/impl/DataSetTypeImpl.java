/**
 */
package eHealthManagementV.impl;

import eHealthManagementV.EHealthManagementVPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagementV.impl.DataSetTypeImpl#getEDataSetTypeName <em>EData Set Type Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSetTypeImpl extends CommunicationInterfacesImpl implements DataSetType {
	/**
	 * The default value of the '{@link #getEDataSetTypeName() <em>EData Set Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEDataSetTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String EDATA_SET_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEDataSetTypeName() <em>EData Set Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEDataSetTypeName()
	 * @generated
	 * @ordered
	 */
	protected String eDataSetTypeName = EDATA_SET_TYPE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementVPackage.Literals.DATA_SET_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEDataSetTypeName() {
		return eDataSetTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEDataSetTypeName(String newEDataSetTypeName) {
		String oldEDataSetTypeName = eDataSetTypeName;
		eDataSetTypeName = newEDataSetTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EHealthManagementVPackage.DATA_SET_TYPE__EDATA_SET_TYPE_NAME, oldEDataSetTypeName,
					eDataSetTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EHealthManagementVPackage.DATA_SET_TYPE__EDATA_SET_TYPE_NAME:
			return getEDataSetTypeName();
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
		case EHealthManagementVPackage.DATA_SET_TYPE__EDATA_SET_TYPE_NAME:
			setEDataSetTypeName((String) newValue);
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
		case EHealthManagementVPackage.DATA_SET_TYPE__EDATA_SET_TYPE_NAME:
			setEDataSetTypeName(EDATA_SET_TYPE_NAME_EDEFAULT);
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
		case EHealthManagementVPackage.DATA_SET_TYPE__EDATA_SET_TYPE_NAME:
			return EDATA_SET_TYPE_NAME_EDEFAULT == null ? eDataSetTypeName != null
					: !EDATA_SET_TYPE_NAME_EDEFAULT.equals(eDataSetTypeName);
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
		result.append(" (EDataSetTypeName: ");
		result.append(eDataSetTypeName);
		result.append(')');
		return result.toString();
	}

} //DataSetTypeImpl
