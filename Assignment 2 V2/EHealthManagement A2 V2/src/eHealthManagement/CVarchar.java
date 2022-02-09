/**
 */
package eHealthManagement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CVarchar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.CVarchar#getCVarcharName <em>CVarchar Name</em>}</li>
 *   <li>{@link eHealthManagement.CVarchar#getCVarcharSize <em>CVarchar Size</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getCVarchar()
 * @model
 * @generated
 */
public interface CVarchar extends EObject {
	/**
	 * Returns the value of the '<em><b>CVarchar Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CVarchar Name</em>' attribute.
	 * @see #setCVarcharName(String)
	 * @see eHealthManagement.EHealthManagementPackage#getCVarchar_CVarcharName()
	 * @model
	 * @generated
	 */
	String getCVarcharName();

	/**
	 * Sets the value of the '{@link eHealthManagement.CVarchar#getCVarcharName <em>CVarchar Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CVarchar Name</em>' attribute.
	 * @see #getCVarcharName()
	 * @generated
	 */
	void setCVarcharName(String value);

	/**
	 * Returns the value of the '<em><b>CVarchar Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CVarchar Size</em>' attribute.
	 * @see #setCVarcharSize(long)
	 * @see eHealthManagement.EHealthManagementPackage#getCVarchar_CVarcharSize()
	 * @model
	 * @generated
	 */
	long getCVarcharSize();

	/**
	 * Sets the value of the '{@link eHealthManagement.CVarchar#getCVarcharSize <em>CVarchar Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CVarchar Size</em>' attribute.
	 * @see #getCVarcharSize()
	 * @generated
	 */
	void setCVarcharSize(long value);

} // CVarchar
