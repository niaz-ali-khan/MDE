/**
 */
package eHealthManagement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.DocumentType#getEDocumentTypeName <em>EDocument Type Name</em>}</li>
 *   <li>{@link eHealthManagement.DocumentType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getDocumentType()
 * @model
 * @generated
 */
public interface DocumentType extends CommunicationInterface {
	/**
	 * Returns the value of the '<em><b>EDocument Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EDocument Type Name</em>' attribute.
	 * @see #setEDocumentTypeName(String)
	 * @see eHealthManagement.EHealthManagementPackage#getDocumentType_EDocumentTypeName()
	 * @model
	 * @generated
	 */
	String getEDocumentTypeName();

	/**
	 * Sets the value of the '{@link eHealthManagement.DocumentType#getEDocumentTypeName <em>EDocument Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EDocument Type Name</em>' attribute.
	 * @see #getEDocumentTypeName()
	 * @generated
	 */
	void setEDocumentTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eHealthManagement.EHealthManagementPackage#getDocumentType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eHealthManagement.DocumentType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DocumentType
