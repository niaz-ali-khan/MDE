/**
 */
package eHealthManagement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text UI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.TextUI#getTextUIName <em>Text UI Name</em>}</li>
 *   <li>{@link eHealthManagement.TextUI#getTextUIType <em>Text UI Type</em>}</li>
 *   <li>{@link eHealthManagement.TextUI#getTextUISize <em>Text UI Size</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getTextUI()
 * @model
 * @generated
 */
public interface TextUI extends EObject {
	/**
	 * Returns the value of the '<em><b>Text UI Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text UI Name</em>' attribute.
	 * @see #setTextUIName(String)
	 * @see eHealthManagement.EHealthManagementPackage#getTextUI_TextUIName()
	 * @model
	 * @generated
	 */
	String getTextUIName();

	/**
	 * Sets the value of the '{@link eHealthManagement.TextUI#getTextUIName <em>Text UI Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text UI Name</em>' attribute.
	 * @see #getTextUIName()
	 * @generated
	 */
	void setTextUIName(String value);

	/**
	 * Returns the value of the '<em><b>Text UI Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text UI Type</em>' attribute.
	 * @see #setTextUIType(String)
	 * @see eHealthManagement.EHealthManagementPackage#getTextUI_TextUIType()
	 * @model
	 * @generated
	 */
	String getTextUIType();

	/**
	 * Sets the value of the '{@link eHealthManagement.TextUI#getTextUIType <em>Text UI Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text UI Type</em>' attribute.
	 * @see #getTextUIType()
	 * @generated
	 */
	void setTextUIType(String value);

	/**
	 * Returns the value of the '<em><b>Text UI Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text UI Size</em>' attribute.
	 * @see #setTextUISize(long)
	 * @see eHealthManagement.EHealthManagementPackage#getTextUI_TextUISize()
	 * @model
	 * @generated
	 */
	long getTextUISize();

	/**
	 * Sets the value of the '{@link eHealthManagement.TextUI#getTextUISize <em>Text UI Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text UI Size</em>' attribute.
	 * @see #getTextUISize()
	 * @generated
	 */
	void setTextUISize(long value);

} // TextUI
