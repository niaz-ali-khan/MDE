/**
 */
package eHealthManagement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Representation Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.RepresentationInterface#getRepresentationInterfaceType <em>Representation Interface Type</em>}</li>
 *   <li>{@link eHealthManagement.RepresentationInterface#getRepresentationInterfaceValidity <em>Representation Interface Validity</em>}</li>
 *   <li>{@link eHealthManagement.RepresentationInterface#getImageui <em>Imageui</em>}</li>
 *   <li>{@link eHealthManagement.RepresentationInterface#getTextui <em>Textui</em>}</li>
 *   <li>{@link eHealthManagement.RepresentationInterface#getVideoui <em>Videoui</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getRepresentationInterface()
 * @model
 * @generated
 */
public interface RepresentationInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Representation Interface Type</b></em>' attribute.
	 * The literals are from the enumeration {@link eHealthManagement.AllowedRepresentationInterfaceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation Interface Type</em>' attribute.
	 * @see eHealthManagement.AllowedRepresentationInterfaceType
	 * @see #setRepresentationInterfaceType(AllowedRepresentationInterfaceType)
	 * @see eHealthManagement.EHealthManagementPackage#getRepresentationInterface_RepresentationInterfaceType()
	 * @model
	 * @generated
	 */
	AllowedRepresentationInterfaceType getRepresentationInterfaceType();

	/**
	 * Sets the value of the '{@link eHealthManagement.RepresentationInterface#getRepresentationInterfaceType <em>Representation Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation Interface Type</em>' attribute.
	 * @see eHealthManagement.AllowedRepresentationInterfaceType
	 * @see #getRepresentationInterfaceType()
	 * @generated
	 */
	void setRepresentationInterfaceType(AllowedRepresentationInterfaceType value);

	/**
	 * Returns the value of the '<em><b>Representation Interface Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation Interface Validity</em>' attribute.
	 * @see #setRepresentationInterfaceValidity(Boolean)
	 * @see eHealthManagement.EHealthManagementPackage#getRepresentationInterface_RepresentationInterfaceValidity()
	 * @model
	 * @generated
	 */
	Boolean getRepresentationInterfaceValidity();

	/**
	 * Sets the value of the '{@link eHealthManagement.RepresentationInterface#getRepresentationInterfaceValidity <em>Representation Interface Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation Interface Validity</em>' attribute.
	 * @see #getRepresentationInterfaceValidity()
	 * @generated
	 */
	void setRepresentationInterfaceValidity(Boolean value);

	/**
	 * Returns the value of the '<em><b>Imageui</b></em>' containment reference list.
	 * The list contents are of type {@link eHealthManagement.ImageUI}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imageui</em>' containment reference list.
	 * @see eHealthManagement.EHealthManagementPackage#getRepresentationInterface_Imageui()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImageUI> getImageui();

	/**
	 * Returns the value of the '<em><b>Textui</b></em>' containment reference list.
	 * The list contents are of type {@link eHealthManagement.TextUI}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textui</em>' containment reference list.
	 * @see eHealthManagement.EHealthManagementPackage#getRepresentationInterface_Textui()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextUI> getTextui();

	/**
	 * Returns the value of the '<em><b>Videoui</b></em>' containment reference list.
	 * The list contents are of type {@link eHealthManagement.VideoUI}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Videoui</em>' containment reference list.
	 * @see eHealthManagement.EHealthManagementPackage#getRepresentationInterface_Videoui()
	 * @model containment="true"
	 * @generated
	 */
	EList<VideoUI> getVideoui();

} // RepresentationInterface
