/**
 */
package eHealthManagement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Representation Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.RepresentationInterface#getRepresentationInterfaces <em>Representation Interfaces</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getRepresentationInterface()
 * @model
 * @generated
 */
public interface RepresentationInterface extends UserInterface {
	/**
	 * Returns the value of the '<em><b>Representation Interfaces</b></em>' attribute.
	 * The literals are from the enumeration {@link eHealthManagement.AllowedRepresentationInterfaceTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation Interfaces</em>' attribute.
	 * @see eHealthManagement.AllowedRepresentationInterfaceTypes
	 * @see #setRepresentationInterfaces(AllowedRepresentationInterfaceTypes)
	 * @see eHealthManagement.EHealthManagementPackage#getRepresentationInterface_RepresentationInterfaces()
	 * @model
	 * @generated
	 */
	AllowedRepresentationInterfaceTypes getRepresentationInterfaces();

	/**
	 * Sets the value of the '{@link eHealthManagement.RepresentationInterface#getRepresentationInterfaces <em>Representation Interfaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation Interfaces</em>' attribute.
	 * @see eHealthManagement.AllowedRepresentationInterfaceTypes
	 * @see #getRepresentationInterfaces()
	 * @generated
	 */
	void setRepresentationInterfaces(AllowedRepresentationInterfaceTypes value);

} // RepresentationInterface
