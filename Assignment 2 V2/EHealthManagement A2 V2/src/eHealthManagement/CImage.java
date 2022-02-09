/**
 */
package eHealthManagement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CImage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.CImage#getCImageName <em>CImage Name</em>}</li>
 *   <li>{@link eHealthManagement.CImage#getCImageSize <em>CImage Size</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getCImage()
 * @model
 * @generated
 */
public interface CImage extends EObject {
	/**
	 * Returns the value of the '<em><b>CImage Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CImage Name</em>' attribute.
	 * @see #setCImageName(String)
	 * @see eHealthManagement.EHealthManagementPackage#getCImage_CImageName()
	 * @model
	 * @generated
	 */
	String getCImageName();

	/**
	 * Sets the value of the '{@link eHealthManagement.CImage#getCImageName <em>CImage Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CImage Name</em>' attribute.
	 * @see #getCImageName()
	 * @generated
	 */
	void setCImageName(String value);

	/**
	 * Returns the value of the '<em><b>CImage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CImage Size</em>' attribute.
	 * @see #setCImageSize(long)
	 * @see eHealthManagement.EHealthManagementPackage#getCImage_CImageSize()
	 * @model
	 * @generated
	 */
	long getCImageSize();

	/**
	 * Sets the value of the '{@link eHealthManagement.CImage#getCImageSize <em>CImage Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CImage Size</em>' attribute.
	 * @see #getCImageSize()
	 * @generated
	 */
	void setCImageSize(long value);

} // CImage
