/**
 */
package eHealthManagement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.DocumentType#getDocumentTypeName <em>Document Type Name</em>}</li>
 *   <li>{@link eHealthManagement.DocumentType#getDocumentTypeSize <em>Document Type Size</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getDocumentType()
 * @model
 * @generated
 */
public interface DocumentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Document Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Type Name</em>' attribute.
	 * @see #setDocumentTypeName(String)
	 * @see eHealthManagement.EHealthManagementPackage#getDocumentType_DocumentTypeName()
	 * @model
	 * @generated
	 */
	String getDocumentTypeName();

	/**
	 * Sets the value of the '{@link eHealthManagement.DocumentType#getDocumentTypeName <em>Document Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Type Name</em>' attribute.
	 * @see #getDocumentTypeName()
	 * @generated
	 */
	void setDocumentTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Document Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Type Size</em>' attribute.
	 * @see #setDocumentTypeSize(long)
	 * @see eHealthManagement.EHealthManagementPackage#getDocumentType_DocumentTypeSize()
	 * @model
	 * @generated
	 */
	long getDocumentTypeSize();

	/**
	 * Sets the value of the '{@link eHealthManagement.DocumentType#getDocumentTypeSize <em>Document Type Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Type Size</em>' attribute.
	 * @see #getDocumentTypeSize()
	 * @generated
	 */
	void setDocumentTypeSize(long value);

} // DocumentType
