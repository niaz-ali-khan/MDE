/**
 */
package eHealthManagement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.DataSetType#getEDataSetTypeName <em>EData Set Type Name</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getDataSetType()
 * @model
 * @generated
 */
public interface DataSetType extends CommunicationInterface {
	/**
	 * Returns the value of the '<em><b>EData Set Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EData Set Type Name</em>' attribute.
	 * @see #setEDataSetTypeName(String)
	 * @see eHealthManagement.EHealthManagementPackage#getDataSetType_EDataSetTypeName()
	 * @model
	 * @generated
	 */
	String getEDataSetTypeName();

	/**
	 * Sets the value of the '{@link eHealthManagement.DataSetType#getEDataSetTypeName <em>EData Set Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EData Set Type Name</em>' attribute.
	 * @see #getEDataSetTypeName()
	 * @generated
	 */
	void setEDataSetTypeName(String value);

} // DataSetType
