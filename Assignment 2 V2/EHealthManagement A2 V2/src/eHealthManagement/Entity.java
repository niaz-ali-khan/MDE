/**
 */
package eHealthManagement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.Entity#getEntityName <em>Entity Name</em>}</li>
 *   <li>{@link eHealthManagement.Entity#getEntitySize <em>Entity Size</em>}</li>
 *   <li>{@link eHealthManagement.Entity#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Name</em>' attribute.
	 * @see #setEntityName(String)
	 * @see eHealthManagement.EHealthManagementPackage#getEntity_EntityName()
	 * @model
	 * @generated
	 */
	String getEntityName();

	/**
	 * Sets the value of the '{@link eHealthManagement.Entity#getEntityName <em>Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Name</em>' attribute.
	 * @see #getEntityName()
	 * @generated
	 */
	void setEntityName(String value);

	/**
	 * Returns the value of the '<em><b>Entity Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Size</em>' attribute.
	 * @see #setEntitySize(long)
	 * @see eHealthManagement.EHealthManagementPackage#getEntity_EntitySize()
	 * @model
	 * @generated
	 */
	long getEntitySize();

	/**
	 * Sets the value of the '{@link eHealthManagement.Entity#getEntitySize <em>Entity Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Size</em>' attribute.
	 * @see #getEntitySize()
	 * @generated
	 */
	void setEntitySize(long value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link eHealthManagement.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see eHealthManagement.EHealthManagementPackage#getEntity_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

} // Entity
