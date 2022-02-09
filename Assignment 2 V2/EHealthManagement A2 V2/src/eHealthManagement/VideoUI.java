/**
 */
package eHealthManagement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video UI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.VideoUI#getVideoUIName <em>Video UI Name</em>}</li>
 *   <li>{@link eHealthManagement.VideoUI#getVideoUIType <em>Video UI Type</em>}</li>
 *   <li>{@link eHealthManagement.VideoUI#getVideoUISize <em>Video UI Size</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getVideoUI()
 * @model
 * @generated
 */
public interface VideoUI extends EObject {
	/**
	 * Returns the value of the '<em><b>Video UI Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video UI Name</em>' attribute.
	 * @see #setVideoUIName(String)
	 * @see eHealthManagement.EHealthManagementPackage#getVideoUI_VideoUIName()
	 * @model
	 * @generated
	 */
	String getVideoUIName();

	/**
	 * Sets the value of the '{@link eHealthManagement.VideoUI#getVideoUIName <em>Video UI Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Video UI Name</em>' attribute.
	 * @see #getVideoUIName()
	 * @generated
	 */
	void setVideoUIName(String value);

	/**
	 * Returns the value of the '<em><b>Video UI Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video UI Type</em>' attribute.
	 * @see #setVideoUIType(String)
	 * @see eHealthManagement.EHealthManagementPackage#getVideoUI_VideoUIType()
	 * @model
	 * @generated
	 */
	String getVideoUIType();

	/**
	 * Sets the value of the '{@link eHealthManagement.VideoUI#getVideoUIType <em>Video UI Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Video UI Type</em>' attribute.
	 * @see #getVideoUIType()
	 * @generated
	 */
	void setVideoUIType(String value);

	/**
	 * Returns the value of the '<em><b>Video UI Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video UI Size</em>' attribute.
	 * @see #setVideoUISize(long)
	 * @see eHealthManagement.EHealthManagementPackage#getVideoUI_VideoUISize()
	 * @model
	 * @generated
	 */
	long getVideoUISize();

	/**
	 * Sets the value of the '{@link eHealthManagement.VideoUI#getVideoUISize <em>Video UI Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Video UI Size</em>' attribute.
	 * @see #getVideoUISize()
	 * @generated
	 */
	void setVideoUISize(long value);

} // VideoUI
