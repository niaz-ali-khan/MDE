/**
 */
package eHealthManagement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.CommunicationInterface#getCommunicationInterfaces <em>Communication Interfaces</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getCommunicationInterface()
 * @model superTypes="eHealthManagement.UserInterface"
 * @generated
 */
public interface CommunicationInterface extends EObject, UserInterface {
	/**
	 * Returns the value of the '<em><b>Communication Interfaces</b></em>' attribute.
	 * The literals are from the enumeration {@link eHealthManagement.AllowedCommunicationInterfaceTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Interfaces</em>' attribute.
	 * @see eHealthManagement.AllowedCommunicationInterfaceTypes
	 * @see #setCommunicationInterfaces(AllowedCommunicationInterfaceTypes)
	 * @see eHealthManagement.EHealthManagementPackage#getCommunicationInterface_CommunicationInterfaces()
	 * @model
	 * @generated
	 */
	AllowedCommunicationInterfaceTypes getCommunicationInterfaces();

	/**
	 * Sets the value of the '{@link eHealthManagement.CommunicationInterface#getCommunicationInterfaces <em>Communication Interfaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Interfaces</em>' attribute.
	 * @see eHealthManagement.AllowedCommunicationInterfaceTypes
	 * @see #getCommunicationInterfaces()
	 * @generated
	 */
	void setCommunicationInterfaces(AllowedCommunicationInterfaceTypes value);

} // CommunicationInterface
