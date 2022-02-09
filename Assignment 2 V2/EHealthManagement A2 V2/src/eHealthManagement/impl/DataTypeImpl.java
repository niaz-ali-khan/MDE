/**
 */
package eHealthManagement.impl;

import eHealthManagement.DataType;
import eHealthManagement.EHealthManagementPackage;
import eHealthManagement.Entity;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.impl.DataTypeImpl#getDataTypeName <em>Data Type Name</em>}</li>
 *   <li>{@link eHealthManagement.impl.DataTypeImpl#getDataTypeSize <em>Data Type Size</em>}</li>
 *   <li>{@link eHealthManagement.impl.DataTypeImpl#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypeImpl extends MinimalEObjectImpl.Container implements DataType {
	/**
	 * The default value of the '{@link #getDataTypeName() <em>Data Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataTypeName() <em>Data Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypeName()
	 * @generated
	 * @ordered
	 */
	protected String dataTypeName = DATA_TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataTypeSize() <em>Data Type Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypeSize()
	 * @generated
	 * @ordered
	 */
	protected static final long DATA_TYPE_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDataTypeSize() <em>Data Type Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypeSize()
	 * @generated
	 * @ordered
	 */
	protected long dataTypeSize = DATA_TYPE_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementPackage.Literals.DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataTypeName() {
		return dataTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataTypeName(String newDataTypeName) {
		String oldDataTypeName = dataTypeName;
		dataTypeName = newDataTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.DATA_TYPE__DATA_TYPE_NAME, oldDataTypeName, dataTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDataTypeSize() {
		return dataTypeSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataTypeSize(long newDataTypeSize) {
		long oldDataTypeSize = dataTypeSize;
		dataTypeSize = newDataTypeSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.DATA_TYPE__DATA_TYPE_SIZE, oldDataTypeSize, dataTypeSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntity() {
		if (entity == null) {
			entity = new EObjectContainmentEList<Entity>(Entity.class, this, EHealthManagementPackage.DATA_TYPE__ENTITY);
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EHealthManagementPackage.DATA_TYPE__ENTITY:
				return ((InternalEList<?>)getEntity()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EHealthManagementPackage.DATA_TYPE__DATA_TYPE_NAME:
				return getDataTypeName();
			case EHealthManagementPackage.DATA_TYPE__DATA_TYPE_SIZE:
				return getDataTypeSize();
			case EHealthManagementPackage.DATA_TYPE__ENTITY:
				return getEntity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EHealthManagementPackage.DATA_TYPE__DATA_TYPE_NAME:
				setDataTypeName((String)newValue);
				return;
			case EHealthManagementPackage.DATA_TYPE__DATA_TYPE_SIZE:
				setDataTypeSize((Long)newValue);
				return;
			case EHealthManagementPackage.DATA_TYPE__ENTITY:
				getEntity().clear();
				getEntity().addAll((Collection<? extends Entity>)newValue);
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
			case EHealthManagementPackage.DATA_TYPE__DATA_TYPE_NAME:
				setDataTypeName(DATA_TYPE_NAME_EDEFAULT);
				return;
			case EHealthManagementPackage.DATA_TYPE__DATA_TYPE_SIZE:
				setDataTypeSize(DATA_TYPE_SIZE_EDEFAULT);
				return;
			case EHealthManagementPackage.DATA_TYPE__ENTITY:
				getEntity().clear();
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
			case EHealthManagementPackage.DATA_TYPE__DATA_TYPE_NAME:
				return DATA_TYPE_NAME_EDEFAULT == null ? dataTypeName != null : !DATA_TYPE_NAME_EDEFAULT.equals(dataTypeName);
			case EHealthManagementPackage.DATA_TYPE__DATA_TYPE_SIZE:
				return dataTypeSize != DATA_TYPE_SIZE_EDEFAULT;
			case EHealthManagementPackage.DATA_TYPE__ENTITY:
				return entity != null && !entity.isEmpty();
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
		result.append(" (DataTypeName: ");
		result.append(dataTypeName);
		result.append(", DataTypeSize: ");
		result.append(dataTypeSize);
		result.append(')');
		return result.toString();
	}

} //DataTypeImpl
