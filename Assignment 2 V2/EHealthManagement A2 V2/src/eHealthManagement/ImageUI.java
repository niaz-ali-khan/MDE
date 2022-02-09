/**
 */
package eHealthManagement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image UI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.ImageUI#getImageUIName <em>Image UI Name</em>}</li>
 *   <li>{@link eHealthManagement.ImageUI#getImageUIType <em>Image UI Type</em>}</li>
 *   <li>{@link eHealthManagement.ImageUI#getImageUISize <em>Image UI Size</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getImageUI()
 * @model
 * @generated
 */
public interface ImageUI extends EObject {
	/**
	 * Returns the value of the '<em><b>Image UI Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image UI Name</em>' attribute.
	 * @see #setImageUIName(String)
	 * @see eHealthManagement.EHealthManagementPackage#getImageUI_ImageUIName()
	 * @model
	 * @generated
	 */
	String getImageUIName();

	/**
	 * Sets the value of the '{@link eHealthManagement.ImageUI#getImageUIName <em>Image UI Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image UI Name</em>' attribute.
	 * @see #getImageUIName()
	 * @generated
	 */
	void setImageUIName(String value);

	/**
	 * Returns the value of the '<em><b>Image UI Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image UI Type</em>' attribute.
	 * @see #setImageUIType(String)
	 * @see eHealthManagement.EHealthManagementPackage#getImageUI_ImageUIType()
	 * @model
	 * @generated
	 */
	String getImageUIType();

	/**
	 * Sets the value of the '{@link eHealthManagement.ImageUI#getImageUIType <em>Image UI Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image UI Type</em>' attribute.
	 * @see #getImageUIType()
	 * @generated
	 */
	void setImageUIType(String value);

	/**
	 * Returns the value of the '<em><b>Image UI Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image UI Size</em>' attribute.
	 * @see #setImageUISize(long)
	 * @see eHealthManagement.EHealthManagementPackage#getImageUI_ImageUISize()
	 * @model
	 * @generated
	 */
	long getImageUISize();

	/**
	 * Sets the value of the '{@link eHealthManagement.ImageUI#getImageUISize <em>Image UI Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image UI Size</em>' attribute.
	 * @see #getImageUISize()
	 * @generated
	 */
	void setImageUISize(long value);

} // ImageUI
