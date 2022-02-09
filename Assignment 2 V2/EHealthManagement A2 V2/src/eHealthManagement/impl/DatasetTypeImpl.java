/**
 */
package eHealthManagement.impl;

import eHealthManagement.DatasetType;
import eHealthManagement.EHealthManagementPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dataset Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.impl.DatasetTypeImpl#getDatasetTypeName <em>Dataset Type Name</em>}</li>
 *   <li>{@link eHealthManagement.impl.DatasetTypeImpl#getDatasetTypeSize <em>Dataset Type Size</em>}</li>
 *   <li>{@link eHealthManagement.impl.DatasetTypeImpl#isDatasetTypePropagationStatus <em>Dataset Type Propagation Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatasetTypeImpl extends MinimalEObjectImpl.Container implements DatasetType {
	/**
	 * The default value of the '{@link #getDatasetTypeName() <em>Dataset Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasetTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATASET_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatasetTypeName() <em>Dataset Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasetTypeName()
	 * @generated
	 * @ordered
	 */
	protected String datasetTypeName = DATASET_TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatasetTypeSize() <em>Dataset Type Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasetTypeSize()
	 * @generated
	 * @ordered
	 */
	protected static final long DATASET_TYPE_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDatasetTypeSize() <em>Dataset Type Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasetTypeSize()
	 * @generated
	 * @ordered
	 */
	protected long datasetTypeSize = DATASET_TYPE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDatasetTypePropagationStatus() <em>Dataset Type Propagation Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDatasetTypePropagationStatus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DATASET_TYPE_PROPAGATION_STATUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDatasetTypePropagationStatus() <em>Dataset Type Propagation Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDatasetTypePropagationStatus()
	 * @generated
	 * @ordered
	 */
	protected boolean datasetTypePropagationStatus = DATASET_TYPE_PROPAGATION_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatasetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementPackage.Literals.DATASET_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatasetTypeName() {
		return datasetTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatasetTypeName(String newDatasetTypeName) {
		String oldDatasetTypeName = datasetTypeName;
		datasetTypeName = newDatasetTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.DATASET_TYPE__DATASET_TYPE_NAME, oldDatasetTypeName, datasetTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDatasetTypeSize() {
		return datasetTypeSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatasetTypeSize(long newDatasetTypeSize) {
		long oldDatasetTypeSize = datasetTypeSize;
		datasetTypeSize = newDatasetTypeSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.DATASET_TYPE__DATASET_TYPE_SIZE, oldDatasetTypeSize, datasetTypeSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDatasetTypePropagationStatus() {
		return datasetTypePropagationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatasetTypePropagationStatus(boolean newDatasetTypePropagationStatus) {
		boolean oldDatasetTypePropagationStatus = datasetTypePropagationStatus;
		datasetTypePropagationStatus = newDatasetTypePropagationStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.DATASET_TYPE__DATASET_TYPE_PROPAGATION_STATUS, oldDatasetTypePropagationStatus, datasetTypePropagationStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EHealthManagementPackage.DATASET_TYPE__DATASET_TYPE_NAME:
				return getDatasetTypeName();
			case EHealthManagementPackage.DATASET_TYPE__DATASET_TYPE_SIZE:
				return getDatasetTypeSize();
			case EHealthManagementPackage.DATASET_TYPE__DATASET_TYPE_PROPAGATION_STATUS:
				return isDatasetTypePropagationStatus();
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
			case EHealthManagementPackage.DATASET_TYPE__DATASET_TYPE_NAME:
				setDatasetTypeName((String)newValue);
				return;
			case EHealthManagementPackage.DATASET_TYPE__DATASET_TYPE_SIZE:
				setDatasetTypeSize((Long)newValue);
				return;
			case EHealthManagementPackage.DATASET_TYPE__DATASET_TYPE_PROPAGATION_STATUS:
				setDatasetTypePropagationStatus((Boolean)newValue);
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
			case EHealthManagementPackage.DATASET_TYPE__DATASET_TYPE_NAME:
				setDatasetTypeName(DATASET_TYPE_NAME_EDEFAULT);
				return;
			case EHealthManagementPackage.DATASET_TYPE__DATASET_TYPE_SIZE:
				setDatasetTypeSize(DATASET_TYPE_SIZE_EDEFAULT);
				return;
			case EHealthManagementPackage.DATASET_TYPE__DATASET_TYPE_PROPAGATION_STATUS:
				setDatasetTypePropagationStatus(DATASET_TYPE_PROPAGATION_STATUS_EDEFAULT);
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
			case EHealthManagementPackage.DATASET_TYPE__DATASET_TYPE_NAME:
				return DATASET_TYPE_NAME_EDEFAULT == null ? datasetTypeName != null : !DATASET_TYPE_NAME_EDEFAULT.equals(datasetTypeName);
			case EHealthManagementPackage.DATASET_TYPE__DATASET_TYPE_SIZE:
				return datasetTypeSize != DATASET_TYPE_SIZE_EDEFAULT;
			case EHealthManagementPackage.DATASET_TYPE__DATASET_TYPE_PROPAGATION_STATUS:
				return datasetTypePropagationStatus != DATASET_TYPE_PROPAGATION_STATUS_EDEFAULT;
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
		result.append(" (DatasetTypeName: ");
		result.append(datasetTypeName);
		result.append(", DatasetTypeSize: ");
		result.append(datasetTypeSize);
		result.append(", DatasetTypePropagationStatus: ");
		result.append(datasetTypePropagationStatus);
		result.append(')');
		return result.toString();
	}

} //DatasetTypeImpl
