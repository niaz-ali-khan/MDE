/**
 */
package eHealthManagement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Messge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.ImageMessge#getImageMessageName <em>Image Message Name</em>}</li>
 *   <li>{@link eHealthManagement.ImageMessge#getImageMessageSize <em>Image Message Size</em>}</li>
 *   <li>{@link eHealthManagement.ImageMessge#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getImageMessge()
 * @model
 * @generated
 */
public interface ImageMessge extends EObject {
	/**
	 * Returns the value of the '<em><b>Image Message Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Message Name</em>' attribute.
	 * @see #setImageMessageName(String)
	 * @see eHealthManagement.EHealthManagementPackage#getImageMessge_ImageMessageName()
	 * @model
	 * @generated
	 */
	String getImageMessageName();

	/**
	 * Sets the value of the '{@link eHealthManagement.ImageMessge#getImageMessageName <em>Image Message Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Message Name</em>' attribute.
	 * @see #getImageMessageName()
	 * @generated
	 */
	void setImageMessageName(String value);

	/**
	 * Returns the value of the '<em><b>Image Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Message Size</em>' attribute.
	 * @see #setImageMessageSize(long)
	 * @see eHealthManagement.EHealthManagementPackage#getImageMessge_ImageMessageSize()
	 * @model
	 * @generated
	 */
	long getImageMessageSize();

	/**
	 * Sets the value of the '{@link eHealthManagement.ImageMessge#getImageMessageSize <em>Image Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Message Size</em>' attribute.
	 * @see #getImageMessageSize()
	 * @generated
	 */
	void setImageMessageSize(long value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see eHealthManagement.EHealthManagementPackage#getImageMessge_Attribute()
	 * @model
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link eHealthManagement.ImageMessge#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

} // ImageMessge
