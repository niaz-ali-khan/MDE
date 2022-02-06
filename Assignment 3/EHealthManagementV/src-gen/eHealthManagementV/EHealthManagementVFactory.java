/**
 */
package eHealthManagementV;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eHealthManagementV.EHealthManagementVPackage
 * @generated
 */
public interface EHealthManagementVFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EHealthManagementVFactory eINSTANCE = eHealthManagementV.impl.EHealthManagementVFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Users</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Users</em>'.
	 * @generated
	 */
	Users createUsers();

	/**
	 * Returns a new object of class '<em>User Interfaces</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Interfaces</em>'.
	 * @generated
	 */
	UserInterfaces createUserInterfaces();

	/**
	 * Returns a new object of class '<em>Representation Interfaces</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Representation Interfaces</em>'.
	 * @generated
	 */
	RepresentationInterfaces createRepresentationInterfaces();

	/**
	 * Returns a new object of class '<em>Communication Interfaces</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Interfaces</em>'.
	 * @generated
	 */
	CommunicationInterfaces createCommunicationInterfaces();

	/**
	 * Returns a new object of class '<em>Image UI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image UI</em>'.
	 * @generated
	 */
	ImageUI createImageUI();

	/**
	 * Returns a new object of class '<em>Text UI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text UI</em>'.
	 * @generated
	 */
	TextUI createTextUI();

	/**
	 * Returns a new object of class '<em>Video UI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Video UI</em>'.
	 * @generated
	 */
	VideoUI createVideoUI();

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
	 * Returns a new object of class '<em>Message Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Type</em>'.
	 * @generated
	 */
	MessageType createMessageType();

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
	 * Returns a new object of class '<em>File Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Message</em>'.
	 * @generated
	 */
	FileMessage createFileMessage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EHealthManagementVPackage getEHealthManagementVPackage();

} //EHealthManagementVFactory
