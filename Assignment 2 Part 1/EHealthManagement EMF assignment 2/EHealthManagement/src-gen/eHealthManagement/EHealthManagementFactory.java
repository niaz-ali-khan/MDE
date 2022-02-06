/**
 */
package eHealthManagement;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eHealthManagement.EHealthManagementPackage
 * @generated
 */
public interface EHealthManagementFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EHealthManagementFactory eINSTANCE = eHealthManagement.impl.EHealthManagementFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>User Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Interface</em>'.
	 * @generated
	 */
	UserInterface createUserInterface();

	/**
	 * Returns a new object of class '<em>Representation Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Representation Interface</em>'.
	 * @generated
	 */
	RepresentationInterface createRepresentationInterface();

	/**
	 * Returns a new object of class '<em>Communication Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Interface</em>'.
	 * @generated
	 */
	CommunicationInterface createCommunicationInterface();

	/**
	 * Returns a new object of class '<em>Text UI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text UI</em>'.
	 * @generated
	 */
	TextUI createTextUI();

	/**
	 * Returns a new object of class '<em>Image UI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image UI</em>'.
	 * @generated
	 */
	ImageUI createImageUI();

	/**
	 * Returns a new object of class '<em>Message Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Type</em>'.
	 * @generated
	 */
	MessageType createMessageType();

	/**
	 * Returns a new object of class '<em>Document Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Type</em>'.
	 * @generated
	 */
	DocumentType createDocumentType();

	/**
	 * Returns a new object of class '<em>Data Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Set Type</em>'.
	 * @generated
	 */
	DataSetType createDataSetType();

	/**
	 * Returns a new object of class '<em>File Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Message</em>'.
	 * @generated
	 */
	FileMessage createFileMessage();

	/**
	 * Returns a new object of class '<em>Image Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Message</em>'.
	 * @generated
	 */
	ImageMessage createImageMessage();

	/**
	 * Returns a new object of class '<em>Text Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Message</em>'.
	 * @generated
	 */
	TextMessage createTextMessage();

	/**
	 * Returns a new object of class '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type</em>'.
	 * @generated
	 */
	DataType createDataType();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attributes</em>'.
	 * @generated
	 */
	Attributes createAttributes();

	/**
	 * Returns a new object of class '<em>Message Exchange Standard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Exchange Standard</em>'.
	 * @generated
	 */
	MessageExchangeStandard createMessageExchangeStandard();

	/**
	 * Returns a new object of class '<em>Event Message Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Message Type</em>'.
	 * @generated
	 */
	EventMessageType createEventMessageType();

	/**
	 * Returns a new object of class '<em>UI Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Image</em>'.
	 * @generated
	 */
	UIImage createUIImage();

	/**
	 * Returns a new object of class '<em>UI String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI String</em>'.
	 * @generated
	 */
	UIString createUIString();

	/**
	 * Returns a new object of class '<em>UI Varchar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Varchar</em>'.
	 * @generated
	 */
	UIVarchar createUIVarchar();

	/**
	 * Returns a new object of class '<em>EDate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EDate</em>'.
	 * @generated
	 */
	EDate createEDate();

	/**
	 * Returns a new object of class '<em>EBoolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EBoolean</em>'.
	 * @generated
	 */
	EBoolean createEBoolean();

	/**
	 * Returns a new object of class '<em>EString</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EString</em>'.
	 * @generated
	 */
	EString createEString();

	/**
	 * Returns a new object of class '<em>EVarchar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EVarchar</em>'.
	 * @generated
	 */
	EVarchar createEVarchar();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EHealthManagementPackage getEHealthManagementPackage();

} //EHealthManagementFactory
