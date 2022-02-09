/**
 */
package eHealthManagement;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link eHealthManagement.CommunicationInterface#getCommunicationInterfaceType <em>Communication Interface Type</em>}</li>
 *   <li>{@link eHealthManagement.CommunicationInterface#isCommunicationInterfaceValidity <em>Communication Interface Validity</em>}</li>
 *   <li>{@link eHealthManagement.CommunicationInterface#getMessagetype <em>Messagetype</em>}</li>
 *   <li>{@link eHealthManagement.CommunicationInterface#getDocumenttype <em>Documenttype</em>}</li>
 *   <li>{@link eHealthManagement.CommunicationInterface#getDatasettype <em>Datasettype</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getCommunicationInterface()
 * @model
 * @generated
 */
public interface CommunicationInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Communication Interface Type</b></em>' attribute.
	 * The literals are from the enumeration {@link eHealthManagement.AllowedCommunicationInterfaceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Interface Type</em>' attribute.
	 * @see eHealthManagement.AllowedCommunicationInterfaceType
	 * @see #setCommunicationInterfaceType(AllowedCommunicationInterfaceType)
	 * @see eHealthManagement.EHealthManagementPackage#getCommunicationInterface_CommunicationInterfaceType()
	 * @model
	 * @generated
	 */
	AllowedCommunicationInterfaceType getCommunicationInterfaceType();

	/**
	 * Sets the value of the '{@link eHealthManagement.CommunicationInterface#getCommunicationInterfaceType <em>Communication Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Interface Type</em>' attribute.
	 * @see eHealthManagement.AllowedCommunicationInterfaceType
	 * @see #getCommunicationInterfaceType()
	 * @generated
	 */
	void setCommunicationInterfaceType(AllowedCommunicationInterfaceType value);

	/**
	 * Returns the value of the '<em><b>Communication Interface Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Interface Validity</em>' attribute.
	 * @see #setCommunicationInterfaceValidity(boolean)
	 * @see eHealthManagement.EHealthManagementPackage#getCommunicationInterface_CommunicationInterfaceValidity()
	 * @model
	 * @generated
	 */
	boolean isCommunicationInterfaceValidity();

	/**
	 * Sets the value of the '{@link eHealthManagement.CommunicationInterface#isCommunicationInterfaceValidity <em>Communication Interface Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Interface Validity</em>' attribute.
	 * @see #isCommunicationInterfaceValidity()
	 * @generated
	 */
	void setCommunicationInterfaceValidity(boolean value);

	/**
	 * Returns the value of the '<em><b>Messagetype</b></em>' containment reference list.
	 * The list contents are of type {@link eHealthManagement.MessageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messagetype</em>' containment reference list.
	 * @see eHealthManagement.EHealthManagementPackage#getCommunicationInterface_Messagetype()
	 * @model containment="true"
	 * @generated
	 */
	EList<MessageType> getMessagetype();

	/**
	 * Returns the value of the '<em><b>Documenttype</b></em>' containment reference list.
	 * The list contents are of type {@link eHealthManagement.DocumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documenttype</em>' containment reference list.
	 * @see eHealthManagement.EHealthManagementPackage#getCommunicationInterface_Documenttype()
	 * @model containment="true"
	 * @generated
	 */
	EList<DocumentType> getDocumenttype();

	/**
	 * Returns the value of the '<em><b>Datasettype</b></em>' containment reference list.
	 * The list contents are of type {@link eHealthManagement.DatasetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datasettype</em>' containment reference list.
	 * @see eHealthManagement.EHealthManagementPackage#getCommunicationInterface_Datasettype()
	 * @model containment="true"
	 * @generated
	 */
	EList<DatasetType> getDatasettype();

} // CommunicationInterface
