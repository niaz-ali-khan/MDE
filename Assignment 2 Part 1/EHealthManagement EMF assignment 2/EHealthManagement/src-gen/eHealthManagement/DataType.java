/**
 */
package eHealthManagement;

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
 *   <li>{@link eHealthManagement.DataType#getEDataTypeName <em>EData Type Name</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends EObject {
	/**
	 * Returns the value of the '<em><b>EData Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EData Type Name</em>' attribute.
	 * @see #setEDataTypeName(String)
	 * @see eHealthManagement.EHealthManagementPackage#getDataType_EDataTypeName()
	 * @model
	 * @generated
	 */
	String getEDataTypeName();

	/**
	 * Sets the value of the '{@link eHealthManagement.DataType#getEDataTypeName <em>EData Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EData Type Name</em>' attribute.
	 * @see #getEDataTypeName()
	 * @generated
	 */
	void setEDataTypeName(String value);

} // DataType
