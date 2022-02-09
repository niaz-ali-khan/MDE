/**
 */
package eHealthManagement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dataset Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.DatasetType#getDatasetTypeName <em>Dataset Type Name</em>}</li>
 *   <li>{@link eHealthManagement.DatasetType#getDatasetTypeSize <em>Dataset Type Size</em>}</li>
 *   <li>{@link eHealthManagement.DatasetType#isDatasetTypePropagationStatus <em>Dataset Type Propagation Status</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getDatasetType()
 * @model
 * @generated
 */
public interface DatasetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Dataset Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset Type Name</em>' attribute.
	 * @see #setDatasetTypeName(String)
	 * @see eHealthManagement.EHealthManagementPackage#getDatasetType_DatasetTypeName()
	 * @model
	 * @generated
	 */
	String getDatasetTypeName();

	/**
	 * Sets the value of the '{@link eHealthManagement.DatasetType#getDatasetTypeName <em>Dataset Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataset Type Name</em>' attribute.
	 * @see #getDatasetTypeName()
	 * @generated
	 */
	void setDatasetTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Dataset Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset Type Size</em>' attribute.
	 * @see #setDatasetTypeSize(long)
	 * @see eHealthManagement.EHealthManagementPackage#getDatasetType_DatasetTypeSize()
	 * @model
	 * @generated
	 */
	long getDatasetTypeSize();

	/**
	 * Sets the value of the '{@link eHealthManagement.DatasetType#getDatasetTypeSize <em>Dataset Type Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataset Type Size</em>' attribute.
	 * @see #getDatasetTypeSize()
	 * @generated
	 */
	void setDatasetTypeSize(long value);

	/**
	 * Returns the value of the '<em><b>Dataset Type Propagation Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset Type Propagation Status</em>' attribute.
	 * @see #setDatasetTypePropagationStatus(boolean)
	 * @see eHealthManagement.EHealthManagementPackage#getDatasetType_DatasetTypePropagationStatus()
	 * @model
	 * @generated
	 */
	boolean isDatasetTypePropagationStatus();

	/**
	 * Sets the value of the '{@link eHealthManagement.DatasetType#isDatasetTypePropagationStatus <em>Dataset Type Propagation Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataset Type Propagation Status</em>' attribute.
	 * @see #isDatasetTypePropagationStatus()
	 * @generated
	 */
	void setDatasetTypePropagationStatus(boolean value);

} // DatasetType
