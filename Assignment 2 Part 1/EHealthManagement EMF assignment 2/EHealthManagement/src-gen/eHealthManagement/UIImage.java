/**
 */
package eHealthManagement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.UIImage#getEUIImageName <em>EUI Image Name</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getUIImage()
 * @model
 * @generated
 */
public interface UIImage extends ImageUI {

	/**
	 * Returns the value of the '<em><b>EUI Image Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EUI Image Name</em>' attribute.
	 * @see #setEUIImageName(String)
	 * @see eHealthManagement.EHealthManagementPackage#getUIImage_EUIImageName()
	 * @model
	 * @generated
	 */
	String getEUIImageName();

	/**
	 * Sets the value of the '{@link eHealthManagement.UIImage#getEUIImageName <em>EUI Image Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EUI Image Name</em>' attribute.
	 * @see #getEUIImageName()
	 * @generated
	 */
	void setEUIImageName(String value);
} // UIImage
