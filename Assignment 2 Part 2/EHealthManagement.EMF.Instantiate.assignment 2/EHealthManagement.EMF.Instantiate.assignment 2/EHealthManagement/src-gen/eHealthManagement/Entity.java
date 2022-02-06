/**
 */
package eHealthManagement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.Entity#getEEntityName <em>EEntity Name</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends DataType {
	/**
	 * Returns the value of the '<em><b>EEntity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EEntity Name</em>' attribute.
	 * @see #setEEntityName(String)
	 * @see eHealthManagement.EHealthManagementPackage#getEntity_EEntityName()
	 * @model
	 * @generated
	 */
	String getEEntityName();

	/**
	 * Sets the value of the '{@link eHealthManagement.Entity#getEEntityName <em>EEntity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EEntity Name</em>' attribute.
	 * @see #getEEntityName()
	 * @generated
	 */
	void setEEntityName(String value);

} // Entity
