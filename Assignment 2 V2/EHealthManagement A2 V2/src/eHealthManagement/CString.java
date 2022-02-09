/**
 */
package eHealthManagement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CString</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.CString#getCStringName <em>CString Name</em>}</li>
 *   <li>{@link eHealthManagement.CString#getCStringSize <em>CString Size</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getCString()
 * @model
 * @generated
 */
public interface CString extends EObject {
	/**
	 * Returns the value of the '<em><b>CString Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CString Name</em>' attribute.
	 * @see #setCStringName(String)
	 * @see eHealthManagement.EHealthManagementPackage#getCString_CStringName()
	 * @model
	 * @generated
	 */
	String getCStringName();

	/**
	 * Sets the value of the '{@link eHealthManagement.CString#getCStringName <em>CString Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CString Name</em>' attribute.
	 * @see #getCStringName()
	 * @generated
	 */
	void setCStringName(String value);

	/**
	 * Returns the value of the '<em><b>CString Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CString Size</em>' attribute.
	 * @see #setCStringSize(long)
	 * @see eHealthManagement.EHealthManagementPackage#getCString_CStringSize()
	 * @model
	 * @generated
	 */
	long getCStringSize();

	/**
	 * Sets the value of the '{@link eHealthManagement.CString#getCStringSize <em>CString Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CString Size</em>' attribute.
	 * @see #getCStringSize()
	 * @generated
	 */
	void setCStringSize(long value);

} // CString
