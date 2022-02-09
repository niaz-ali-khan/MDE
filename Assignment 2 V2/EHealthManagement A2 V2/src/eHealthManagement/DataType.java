/**
 */
package eHealthManagement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.DataType#getDataTypeName <em>Data Type Name</em>}</li>
 *   <li>{@link eHealthManagement.DataType#getDataTypeSize <em>Data Type Size</em>}</li>
 *   <li>{@link eHealthManagement.DataType#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type Name</em>' attribute.
	 * @see #setDataTypeName(String)
	 * @see eHealthManagement.EHealthManagementPackage#getDataType_DataTypeName()
	 * @model
	 * @generated
	 */
	String getDataTypeName();

	/**
	 * Sets the value of the '{@link eHealthManagement.DataType#getDataTypeName <em>Data Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type Name</em>' attribute.
	 * @see #getDataTypeName()
	 * @generated
	 */
	void setDataTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Data Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type Size</em>' attribute.
	 * @see #setDataTypeSize(long)
	 * @see eHealthManagement.EHealthManagementPackage#getDataType_DataTypeSize()
	 * @model
	 * @generated
	 */
	long getDataTypeSize();

	/**
	 * Sets the value of the '{@link eHealthManagement.DataType#getDataTypeSize <em>Data Type Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type Size</em>' attribute.
	 * @see #getDataTypeSize()
	 * @generated
	 */
	void setDataTypeSize(long value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference list.
	 * The list contents are of type {@link eHealthManagement.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference list.
	 * @see eHealthManagement.EHealthManagementPackage#getDataType_Entity()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntity();

} // DataType
