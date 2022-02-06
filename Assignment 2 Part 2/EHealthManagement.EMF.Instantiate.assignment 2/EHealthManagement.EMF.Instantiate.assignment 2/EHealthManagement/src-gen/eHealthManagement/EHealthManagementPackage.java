/**
 */
package eHealthManagement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eHealthManagement.EHealthManagementFactory
 * @model kind="package"
 * @generated
 */
public interface EHealthManagementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eHealthManagement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/eHealthManagement";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eHealthManagement";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EHealthManagementPackage eINSTANCE = eHealthManagement.impl.EHealthManagementPackageImpl.init();

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.UserImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getUser()
	 * @generated
	 */
	int USER = 0;

	/**
	 * The feature id for the '<em><b>User Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_TYPES = 0;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.UserInterfaceImpl <em>User Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.UserInterfaceImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getUserInterface()
	 * @generated
	 */
	int USER_INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>User Interfaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__USER_INTERFACES = 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__USER = 1;

	/**
	 * The number of structural features of the '<em>User Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>User Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.RepresentationInterfaceImpl <em>Representation Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.RepresentationInterfaceImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getRepresentationInterface()
	 * @generated
	 */
	int REPRESENTATION_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>User Interfaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_INTERFACE__USER_INTERFACES = USER_INTERFACE__USER_INTERFACES;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_INTERFACE__USER = USER_INTERFACE__USER;

	/**
	 * The feature id for the '<em><b>Representation Interfaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_INTERFACE__REPRESENTATION_INTERFACES = USER_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Representation Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_INTERFACE_FEATURE_COUNT = USER_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Representation Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_INTERFACE_OPERATION_COUNT = USER_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.CommunicationInterfaceImpl <em>Communication Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.CommunicationInterfaceImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getCommunicationInterface()
	 * @generated
	 */
	int COMMUNICATION_INTERFACE = 3;

	/**
	 * The feature id for the '<em><b>User Interfaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_INTERFACE__USER_INTERFACES = USER_INTERFACE__USER_INTERFACES;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_INTERFACE__USER = USER_INTERFACE__USER;

	/**
	 * The feature id for the '<em><b>Communication Interfaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_INTERFACE__COMMUNICATION_INTERFACES = USER_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Communication Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_INTERFACE_FEATURE_COUNT = USER_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Communication Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_INTERFACE_OPERATION_COUNT = USER_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.TextUIImpl <em>Text UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.TextUIImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getTextUI()
	 * @generated
	 */
	int TEXT_UI = 4;

	/**
	 * The feature id for the '<em><b>User Interfaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_UI__USER_INTERFACES = REPRESENTATION_INTERFACE__USER_INTERFACES;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_UI__USER = REPRESENTATION_INTERFACE__USER;

	/**
	 * The feature id for the '<em><b>Representation Interfaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_UI__REPRESENTATION_INTERFACES = REPRESENTATION_INTERFACE__REPRESENTATION_INTERFACES;

	/**
	 * The feature id for the '<em><b>EText UI Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_UI__ETEXT_UI_NAME = REPRESENTATION_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_UI_FEATURE_COUNT = REPRESENTATION_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_UI_OPERATION_COUNT = REPRESENTATION_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.ImageUIImpl <em>Image UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.ImageUIImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getImageUI()
	 * @generated
	 */
	int IMAGE_UI = 5;

	/**
	 * The feature id for the '<em><b>User Interfaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UI__USER_INTERFACES = REPRESENTATION_INTERFACE__USER_INTERFACES;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UI__USER = REPRESENTATION_INTERFACE__USER;

	/**
	 * The feature id for the '<em><b>Representation Interfaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UI__REPRESENTATION_INTERFACES = REPRESENTATION_INTERFACE__REPRESENTATION_INTERFACES;

	/**
	 * The feature id for the '<em><b>EImage UI Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UI__EIMAGE_UI_NAME = REPRESENTATION_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Image UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UI_FEATURE_COUNT = REPRESENTATION_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Image UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UI_OPERATION_COUNT = REPRESENTATION_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.MessageTypeImpl <em>Message Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.MessageTypeImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getMessageType()
	 * @generated
	 */
	int MESSAGE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>User Interfaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__USER_INTERFACES = COMMUNICATION_INTERFACE__USER_INTERFACES;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__USER = COMMUNICATION_INTERFACE__USER;

	/**
	 * The feature id for the '<em><b>Communication Interfaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__COMMUNICATION_INTERFACES = COMMUNICATION_INTERFACE__COMMUNICATION_INTERFACES;

	/**
	 * The feature id for the '<em><b>EMessage Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__EMESSAGE_TYPE_NAME = COMMUNICATION_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE_FEATURE_COUNT = COMMUNICATION_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Instantiate Message Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE___INSTANTIATE_MESSAGE_INTERFACE = COMMUNICATION_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Message Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE_OPERATION_COUNT = COMMUNICATION_INTERFACE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.DocumentTypeImpl <em>Document Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.DocumentTypeImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getDocumentType()
	 * @generated
	 */
	int DOCUMENT_TYPE = 7;

	/**
	 * The feature id for the '<em><b>User Interfaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__USER_INTERFACES = COMMUNICATION_INTERFACE__USER_INTERFACES;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__USER = COMMUNICATION_INTERFACE__USER;

	/**
	 * The feature id for the '<em><b>Communication Interfaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__COMMUNICATION_INTERFACES = COMMUNICATION_INTERFACE__COMMUNICATION_INTERFACES;

	/**
	 * The feature id for the '<em><b>EDocument Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__EDOCUMENT_TYPE_NAME = COMMUNICATION_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Document Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE_FEATURE_COUNT = COMMUNICATION_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Document Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE_OPERATION_COUNT = COMMUNICATION_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.DataSetTypeImpl <em>Data Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.DataSetTypeImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getDataSetType()
	 * @generated
	 */
	int DATA_SET_TYPE = 8;

	/**
	 * The feature id for the '<em><b>User Interfaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TYPE__USER_INTERFACES = COMMUNICATION_INTERFACE__USER_INTERFACES;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TYPE__USER = COMMUNICATION_INTERFACE__USER;

	/**
	 * The feature id for the '<em><b>Communication Interfaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TYPE__COMMUNICATION_INTERFACES = COMMUNICATION_INTERFACE__COMMUNICATION_INTERFACES;

	/**
	 * The feature id for the '<em><b>EData Set Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TYPE__EDATA_SET_TYPE_NAME = COMMUNICATION_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TYPE_FEATURE_COUNT = COMMUNICATION_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TYPE_OPERATION_COUNT = COMMUNICATION_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.FileMessageImpl <em>File Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.FileMessageImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getFileMessage()
	 * @generated
	 */
	int FILE_MESSAGE = 9;

	/**
	 * The feature id for the '<em><b>User Interfaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MESSAGE__USER_INTERFACES = MESSAGE_TYPE__USER_INTERFACES;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MESSAGE__USER = MESSAGE_TYPE__USER;

	/**
	 * The feature id for the '<em><b>Communication Interfaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MESSAGE__COMMUNICATION_INTERFACES = MESSAGE_TYPE__COMMUNICATION_INTERFACES;

	/**
	 * The feature id for the '<em><b>EMessage Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MESSAGE__EMESSAGE_TYPE_NAME = MESSAGE_TYPE__EMESSAGE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EFile Message Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MESSAGE__EFILE_MESSAGE_NAME = MESSAGE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MESSAGE__ATTRIBUTES = MESSAGE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>File Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MESSAGE_FEATURE_COUNT = MESSAGE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Instantiate Message Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MESSAGE___INSTANTIATE_MESSAGE_INTERFACE = MESSAGE_TYPE___INSTANTIATE_MESSAGE_INTERFACE;

	/**
	 * The number of operations of the '<em>File Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MESSAGE_OPERATION_COUNT = MESSAGE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.ImageMessageImpl <em>Image Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.ImageMessageImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getImageMessage()
	 * @generated
	 */
	int IMAGE_MESSAGE = 10;

	/**
	 * The feature id for the '<em><b>User Interfaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MESSAGE__USER_INTERFACES = MESSAGE_TYPE__USER_INTERFACES;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MESSAGE__USER = MESSAGE_TYPE__USER;

	/**
	 * The feature id for the '<em><b>Communication Interfaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MESSAGE__COMMUNICATION_INTERFACES = MESSAGE_TYPE__COMMUNICATION_INTERFACES;

	/**
	 * The feature id for the '<em><b>EMessage Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MESSAGE__EMESSAGE_TYPE_NAME = MESSAGE_TYPE__EMESSAGE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MESSAGE__ATTRIBUTES = MESSAGE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EImage Message Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MESSAGE__EIMAGE_MESSAGE_NAME = MESSAGE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Image Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MESSAGE_FEATURE_COUNT = MESSAGE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Instantiate Message Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MESSAGE___INSTANTIATE_MESSAGE_INTERFACE = MESSAGE_TYPE___INSTANTIATE_MESSAGE_INTERFACE;

	/**
	 * The number of operations of the '<em>Image Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MESSAGE_OPERATION_COUNT = MESSAGE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.TextMessageImpl <em>Text Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.TextMessageImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getTextMessage()
	 * @generated
	 */
	int TEXT_MESSAGE = 11;

	/**
	 * The feature id for the '<em><b>User Interfaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_MESSAGE__USER_INTERFACES = MESSAGE_TYPE__USER_INTERFACES;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_MESSAGE__USER = MESSAGE_TYPE__USER;

	/**
	 * The feature id for the '<em><b>Communication Interfaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_MESSAGE__COMMUNICATION_INTERFACES = MESSAGE_TYPE__COMMUNICATION_INTERFACES;

	/**
	 * The feature id for the '<em><b>EMessage Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_MESSAGE__EMESSAGE_TYPE_NAME = MESSAGE_TYPE__EMESSAGE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_MESSAGE__ATTRIBUTES = MESSAGE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EText Message Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_MESSAGE__ETEXT_MESSAGE_NAME = MESSAGE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_MESSAGE_FEATURE_COUNT = MESSAGE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Instantiate Message Interface</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_MESSAGE___INSTANTIATE_MESSAGE_INTERFACE = MESSAGE_TYPE___INSTANTIATE_MESSAGE_INTERFACE;

	/**
	 * The number of operations of the '<em>Text Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_MESSAGE_OPERATION_COUNT = MESSAGE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.DataTypeImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 12;

	/**
	 * The feature id for the '<em><b>EData Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__EDATA_TYPE_NAME = 0;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.EntityImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 13;

	/**
	 * The feature id for the '<em><b>EData Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__EDATA_TYPE_NAME = DATA_TYPE__EDATA_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EEntity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__EENTITY_NAME = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.AttributesImpl <em>Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.AttributesImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getAttributes()
	 * @generated
	 */
	int ATTRIBUTES = 14;

	/**
	 * The feature id for the '<em><b>EData Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__EDATA_TYPE_NAME = ENTITY__EDATA_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EEntity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__EENTITY_NAME = ENTITY__EENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Eventmessagetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__EVENTMESSAGETYPE = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAttributes Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__EATTRIBUTES_NAME = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.MessageExchangeStandardImpl <em>Message Exchange Standard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.MessageExchangeStandardImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getMessageExchangeStandard()
	 * @generated
	 */
	int MESSAGE_EXCHANGE_STANDARD = 15;

	/**
	 * The feature id for the '<em><b>EMessage Exchange Standard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGE_STANDARD__EMESSAGE_EXCHANGE_STANDARD_NAME = 0;

	/**
	 * The number of structural features of the '<em>Message Exchange Standard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGE_STANDARD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Message Exchange Standard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGE_STANDARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.EventMessageTypeImpl <em>Event Message Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.EventMessageTypeImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getEventMessageType()
	 * @generated
	 */
	int EVENT_MESSAGE_TYPE = 16;

	/**
	 * The feature id for the '<em><b>EEvent Message Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MESSAGE_TYPE__EEVENT_MESSAGE_TYPE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Messageexchangestandard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MESSAGE_TYPE__MESSAGEEXCHANGESTANDARD = 1;

	/**
	 * The number of structural features of the '<em>Event Message Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MESSAGE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Event Message Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MESSAGE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.UIImageImpl <em>UI Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.UIImageImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getUIImage()
	 * @generated
	 */
	int UI_IMAGE = 17;

	/**
	 * The feature id for the '<em><b>User Interfaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IMAGE__USER_INTERFACES = IMAGE_UI__USER_INTERFACES;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IMAGE__USER = IMAGE_UI__USER;

	/**
	 * The feature id for the '<em><b>Representation Interfaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IMAGE__REPRESENTATION_INTERFACES = IMAGE_UI__REPRESENTATION_INTERFACES;

	/**
	 * The feature id for the '<em><b>EImage UI Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IMAGE__EIMAGE_UI_NAME = IMAGE_UI__EIMAGE_UI_NAME;

	/**
	 * The number of structural features of the '<em>UI Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IMAGE_FEATURE_COUNT = IMAGE_UI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>UI Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_IMAGE_OPERATION_COUNT = IMAGE_UI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.UIStringImpl <em>UI String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.UIStringImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getUIString()
	 * @generated
	 */
	int UI_STRING = 18;

	/**
	 * The feature id for the '<em><b>User Interfaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_STRING__USER_INTERFACES = TEXT_UI__USER_INTERFACES;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_STRING__USER = TEXT_UI__USER;

	/**
	 * The feature id for the '<em><b>Representation Interfaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_STRING__REPRESENTATION_INTERFACES = TEXT_UI__REPRESENTATION_INTERFACES;

	/**
	 * The feature id for the '<em><b>EText UI Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_STRING__ETEXT_UI_NAME = TEXT_UI__ETEXT_UI_NAME;

	/**
	 * The number of structural features of the '<em>UI String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_STRING_FEATURE_COUNT = TEXT_UI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>UI String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_STRING_OPERATION_COUNT = TEXT_UI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.UIVarcharImpl <em>UI Varchar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.UIVarcharImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getUIVarchar()
	 * @generated
	 */
	int UI_VARCHAR = 19;

	/**
	 * The feature id for the '<em><b>User Interfaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VARCHAR__USER_INTERFACES = TEXT_UI__USER_INTERFACES;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VARCHAR__USER = TEXT_UI__USER;

	/**
	 * The feature id for the '<em><b>Representation Interfaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VARCHAR__REPRESENTATION_INTERFACES = TEXT_UI__REPRESENTATION_INTERFACES;

	/**
	 * The feature id for the '<em><b>EText UI Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VARCHAR__ETEXT_UI_NAME = TEXT_UI__ETEXT_UI_NAME;

	/**
	 * The number of structural features of the '<em>UI Varchar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VARCHAR_FEATURE_COUNT = TEXT_UI_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>UI Varchar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_VARCHAR_OPERATION_COUNT = TEXT_UI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.EDateImpl <em>EDate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.EDateImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getEDate()
	 * @generated
	 */
	int EDATE = 20;

	/**
	 * The feature id for the '<em><b>EData Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATE__EDATA_TYPE_NAME = ATTRIBUTES__EDATA_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EEntity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATE__EENTITY_NAME = ATTRIBUTES__EENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Eventmessagetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATE__EVENTMESSAGETYPE = ATTRIBUTES__EVENTMESSAGETYPE;

	/**
	 * The feature id for the '<em><b>EAttributes Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATE__EATTRIBUTES_NAME = ATTRIBUTES__EATTRIBUTES_NAME;

	/**
	 * The feature id for the '<em><b>EDate Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATE__EDATE_DEFAULT = ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EDate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATE_FEATURE_COUNT = ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EDate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATE_OPERATION_COUNT = ATTRIBUTES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.EBooleanImpl <em>EBoolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.EBooleanImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getEBoolean()
	 * @generated
	 */
	int EBOOLEAN = 21;

	/**
	 * The feature id for the '<em><b>EData Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBOOLEAN__EDATA_TYPE_NAME = ATTRIBUTES__EDATA_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EEntity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBOOLEAN__EENTITY_NAME = ATTRIBUTES__EENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Eventmessagetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBOOLEAN__EVENTMESSAGETYPE = ATTRIBUTES__EVENTMESSAGETYPE;

	/**
	 * The feature id for the '<em><b>EAttributes Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBOOLEAN__EATTRIBUTES_NAME = ATTRIBUTES__EATTRIBUTES_NAME;

	/**
	 * The feature id for the '<em><b>EBoolean Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBOOLEAN__EBOOLEAN_DEFAULT = ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EBoolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBOOLEAN_FEATURE_COUNT = ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EBoolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EBOOLEAN_OPERATION_COUNT = ATTRIBUTES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.EStringImpl <em>EString</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.EStringImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getEString()
	 * @generated
	 */
	int ESTRING = 22;

	/**
	 * The feature id for the '<em><b>EData Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING__EDATA_TYPE_NAME = ATTRIBUTES__EDATA_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EEntity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING__EENTITY_NAME = ATTRIBUTES__EENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Eventmessagetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING__EVENTMESSAGETYPE = ATTRIBUTES__EVENTMESSAGETYPE;

	/**
	 * The feature id for the '<em><b>EAttributes Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING__EATTRIBUTES_NAME = ATTRIBUTES__EATTRIBUTES_NAME;

	/**
	 * The feature id for the '<em><b>EString Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING__ESTRING_DEFAULT = ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EString</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_FEATURE_COUNT = ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EString</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_OPERATION_COUNT = ATTRIBUTES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.EVarcharImpl <em>EVarchar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.EVarcharImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getEVarchar()
	 * @generated
	 */
	int EVARCHAR = 23;

	/**
	 * The feature id for the '<em><b>EData Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVARCHAR__EDATA_TYPE_NAME = ATTRIBUTES__EDATA_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EEntity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVARCHAR__EENTITY_NAME = ATTRIBUTES__EENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Eventmessagetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVARCHAR__EVENTMESSAGETYPE = ATTRIBUTES__EVENTMESSAGETYPE;

	/**
	 * The feature id for the '<em><b>EAttributes Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVARCHAR__EATTRIBUTES_NAME = ATTRIBUTES__EATTRIBUTES_NAME;

	/**
	 * The feature id for the '<em><b>EVarchar Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVARCHAR__EVARCHAR_DEFAULT = ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EVarchar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVARCHAR_FEATURE_COUNT = ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EVarchar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVARCHAR_OPERATION_COUNT = ATTRIBUTES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.AllowedUserTypes <em>Allowed User Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.AllowedUserTypes
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getAllowedUserTypes()
	 * @generated
	 */
	int ALLOWED_USER_TYPES = 24;

	/**
	 * The meta object id for the '{@link eHealthManagement.AllowedUserInterfaces <em>Allowed User Interfaces</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.AllowedUserInterfaces
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getAllowedUserInterfaces()
	 * @generated
	 */
	int ALLOWED_USER_INTERFACES = 25;

	/**
	 * The meta object id for the '{@link eHealthManagement.AllowedAttributeTypes <em>Allowed Attribute Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.AllowedAttributeTypes
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getAllowedAttributeTypes()
	 * @generated
	 */
	int ALLOWED_ATTRIBUTE_TYPES = 26;

	/**
	 * The meta object id for the '{@link eHealthManagement.AllowedCommunicationInterfaceTypes <em>Allowed Communication Interface Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.AllowedCommunicationInterfaceTypes
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getAllowedCommunicationInterfaceTypes()
	 * @generated
	 */
	int ALLOWED_COMMUNICATION_INTERFACE_TYPES = 27;

	/**
	 * The meta object id for the '{@link eHealthManagement.AllowedRepresentationInterfaceTypes <em>Allowed Representation Interface Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.AllowedRepresentationInterfaceTypes
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getAllowedRepresentationInterfaceTypes()
	 * @generated
	 */
	int ALLOWED_REPRESENTATION_INTERFACE_TYPES = 28;

	/**
	 * Returns the meta object for class '{@link eHealthManagement.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see eHealthManagement.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.User#getUserTypes <em>User Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Types</em>'.
	 * @see eHealthManagement.User#getUserTypes()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_UserTypes();

	/**
	 * Returns the meta object for class '{@link eHealthManagement.UserInterface <em>User Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Interface</em>'.
	 * @see eHealthManagement.UserInterface
	 * @generated
	 */
	EClass getUserInterface();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.UserInterface#getUserInterfaces <em>User Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Interfaces</em>'.
	 * @see eHealthManagement.UserInterface#getUserInterfaces()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_UserInterfaces();

	/**
	 * Returns the meta object for the reference '{@link eHealthManagement.UserInterface#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see eHealthManagement.UserInterface#getUser()
	 * @see #getUserInterface()
	 * @generated
	 */
	EReference getUserInterface_User();

	/**
	 * Returns the meta object for class '{@link eHealthManagement.RepresentationInterface <em>Representation Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Representation Interface</em>'.
	 * @see eHealthManagement.RepresentationInterface
	 * @generated
	 */
	EClass getRepresentationInterface();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.RepresentationInterface#getRepresentationInterfaces <em>Representation Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Representation Interfaces</em>'.
	 * @see eHealthManagement.RepresentationInterface#getRepresentationInterfaces()
	 * @see #getRepresentationInterface()
	 * @generated
	 */
	EAttribute getRepresentationInterface_RepresentationInterfaces();

	/**
	 * Returns the meta object for class '{@link eHealthManagement.CommunicationInterface <em>Communication Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Interface</em>'.
	 * @see eHealthManagement.CommunicationInterface
	 * @generated
	 */
	EClass getCommunicationInterface();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.CommunicationInterface#getCommunicationInterfaces <em>Communication Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication Interfaces</em>'.
	 * @see eHealthManagement.CommunicationInterface#getCommunicationInterfaces()
	 * @see #getCommunicationInterface()
	 * @generated
	 */
	EAttribute getCommunicationInterface_CommunicationInterfaces();

	/**
	 * Returns the meta object for class '{@link eHealthManagement.TextUI <em>Text UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text UI</em>'.
	 * @see eHealthManagement.TextUI
	 * @generated
	 */
	EClass getTextUI();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.TextUI#getETextUIName <em>EText UI Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EText UI Name</em>'.
	 * @see eHealthManagement.TextUI#getETextUIName()
	 * @see #getTextUI()
	 * @generated
	 */
	EAttribute getTextUI_ETextUIName();

	/**
	 * Returns the meta object for class '{@link eHealthManagement.ImageUI <em>Image UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image UI</em>'.
	 * @see eHealthManagement.ImageUI
	 * @generated
	 */
	EClass getImageUI();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.ImageUI#getEImageUIName <em>EImage UI Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EImage UI Name</em>'.
	 * @see eHealthManagement.ImageUI#getEImageUIName()
	 * @see #getImageUI()
	 * @generated
	 */
	EAttribute getImageUI_EImageUIName();

	/**
	 * Returns the meta object for class '{@link eHealthManagement.MessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Type</em>'.
	 * @see eHealthManagement.MessageType
	 * @generated
	 */
	EClass getMessageType();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.MessageType#getEMessageTypeName <em>EMessage Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EMessage Type Name</em>'.
	 * @see eHealthManagement.MessageType#getEMessageTypeName()
	 * @see #getMessageType()
	 * @generated
	 */
	EAttribute getMessageType_EMessageTypeName();

	/**
	 * Returns the meta object for the '{@link eHealthManagement.MessageType#InstantiateMessageInterface() <em>Instantiate Message Interface</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Instantiate Message Interface</em>' operation.
	 * @see eHealthManagement.MessageType#InstantiateMessageInterface()
	 * @generated
	 */
	EOperation getMessageType__InstantiateMessageInterface();

	/**
	 * Returns the meta object for class '{@link eHealthManagement.DocumentType <em>Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Type</em>'.
	 * @see eHealthManagement.DocumentType
	 * @generated
	 */
	EClass getDocumentType();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.DocumentType#getEDocumentTypeName <em>EDocument Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EDocument Type Name</em>'.
	 * @see eHealthManagement.DocumentType#getEDocumentTypeName()
	 * @see #getDocumentType()
	 * @generated
	 */
	EAttribute getDocumentType_EDocumentTypeName();

	/**
	 * Returns the meta object for class '{@link eHealthManagement.DataSetType <em>Data Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Set Type</em>'.
	 * @see eHealthManagement.DataSetType
	 * @generated
	 */
	EClass getDataSetType();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.DataSetType#getEDataSetTypeName <em>EData Set Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EData Set Type Name</em>'.
	 * @see eHealthManagement.DataSetType#getEDataSetTypeName()
	 * @see #getDataSetType()
	 * @generated
	 */
	EAttribute getDataSetType_EDataSetTypeName();

	/**
	 * Returns the meta object for class '{@link eHealthManagement.FileMessage <em>File Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Message</em>'.
	 * @see eHealthManagement.FileMessage
	 * @generated
	 */
	EClass getFileMessage();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.FileMessage#getEFileMessageName <em>EFile Message Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EFile Message Name</em>'.
	 * @see eHealthManagement.FileMessage#getEFileMessageName()
	 * @see #getFileMessage()
	 * @generated
	 */
	EAttribute getFileMessage_EFileMessageName();

	/**
	 * Returns the meta object for the reference '{@link eHealthManagement.FileMessage#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attributes</em>'.
	 * @see eHealthManagement.FileMessage#getAttributes()
	 * @see #getFileMessage()
	 * @generated
	 */
	EReference getFileMessage_Attributes();

	/**
	 * Returns the meta object for class '{@link eHealthManagement.ImageMessage <em>Image Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Message</em>'.
	 * @see eHealthManagement.ImageMessage
	 * @generated
	 */
	EClass getImageMessage();

	/**
	 * Returns the meta object for the reference '{@link eHealthManagement.ImageMessage#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attributes</em>'.
	 * @see eHealthManagement.ImageMessage#getAttributes()
	 * @see #getImageMessage()
	 * @generated
	 */
	EReference getImageMessage_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.ImageMessage#getEImageMessageName <em>EImage Message Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EImage Message Name</em>'.
	 * @see eHealthManagement.ImageMessage#getEImageMessageName()
	 * @see #getImageMessage()
	 * @generated
	 */
	EAttribute getImageMessage_EImageMessageName();

	/**
	 * Returns the meta object for class '{@link eHealthManagement.TextMessage <em>Text Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Message</em>'.
	 * @see eHealthManagement.TextMessage
	 * @generated
	 */
	EClass getTextMessage();

	/**
	 * Returns the meta object for the reference '{@link eHealthManagement.TextMessage#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attributes</em>'.
	 * @see eHealthManagement.TextMessage#getAttributes()
	 * @see #getTextMessage()
	 * @generated
	 */
	EReference getTextMessage_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.TextMessage#getETextMessageName <em>EText Message Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EText Message Name</em>'.
	 * @see eHealthManagement.TextMessage#getETextMessageName()
	 * @see #getTextMessage()
	 * @generated
	 */
	EAttribute getTextMessage_ETextMessageName();

	/**
	 * Returns the meta object for class '{@link eHealthManagement.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see eHealthManagement.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.DataType#getEDataTypeName <em>EData Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EData Type Name</em>'.
	 * @see eHealthManagement.DataType#getEDataTypeName()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_EDataTypeName();

	/**
	 * Returns the meta object for class '{@link eHealthManagement.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see eHealthManagement.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.Entity#getEEntityName <em>EEntity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EEntity Name</em>'.
	 * @see eHealthManagement.Entity#getEEntityName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_EEntityName();

	/**
	 * Returns the meta object for class '{@link eHealthManagement.Attributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributes</em>'.
	 * @see eHealthManagement.Attributes
	 * @generated
	 */
	EClass getAttributes();

	/**
	 * Returns the meta object for the reference '{@link eHealthManagement.Attributes#getEventmessagetype <em>Eventmessagetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Eventmessagetype</em>'.
	 * @see eHealthManagement.Attributes#getEventmessagetype()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_Eventmessagetype();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.Attributes#getEAttributesName <em>EAttributes Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EAttributes Name</em>'.
	 * @see eHealthManagement.Attributes#getEAttributesName()
	 * @see #getAttributes()
	 * @generated
	 */
	EAttribute getAttributes_EAttributesName();

	/**
	 * Returns the meta object for class '{@link eHealthManagement.MessageExchangeStandard <em>Message Exchange Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Exchange Standard</em>'.
	 * @see eHealthManagement.MessageExchangeStandard
	 * @generated
	 */
	EClass getMessageExchangeStandard();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.MessageExchangeStandard#getEMessageExchangeStandardName <em>EMessage Exchange Standard Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EMessage Exchange Standard Name</em>'.
	 * @see eHealthManagement.MessageExchangeStandard#getEMessageExchangeStandardName()
	 * @see #getMessageExchangeStandard()
	 * @generated
	 */
	EAttribute getMessageExchangeStandard_EMessageExchangeStandardName();

	/**
	 * Returns the meta object for class '{@link eHealthManagement.EventMessageType <em>Event Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Message Type</em>'.
	 * @see eHealthManagement.EventMessageType
	 * @generated
	 */
	EClass getEventMessageType();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.EventMessageType#getEEventMessageTypeName <em>EEvent Message Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EEvent Message Type Name</em>'.
	 * @see eHealthManagement.EventMessageType#getEEventMessageTypeName()
	 * @see #getEventMessageType()
	 * @generated
	 */
	EAttribute getEventMessageType_EEventMessageTypeName();

	/**
	 * Returns the meta object for the reference '{@link eHealthManagement.EventMessageType#getMessageexchangestandard <em>Messageexchangestandard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Messageexchangestandard</em>'.
	 * @see eHealthManagement.EventMessageType#getMessageexchangestandard()
	 * @see #getEventMessageType()
	 * @generated
	 */
	EReference getEventMessageType_Messageexchangestandard();

	/**
	 * Returns the meta object for class '{@link eHealthManagement.UIImage <em>UI Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Image</em>'.
	 * @see eHealthManagement.UIImage
	 * @generated
	 */
	EClass getUIImage();

	/**
	 * Returns the meta object for class '{@link eHealthManagement.UIString <em>UI String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI String</em>'.
	 * @see eHealthManagement.UIString
	 * @generated
	 */
	EClass getUIString();

	/**
	 * Returns the meta object for class '{@link eHealthManagement.UIVarchar <em>UI Varchar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Varchar</em>'.
	 * @see eHealthManagement.UIVarchar
	 * @generated
	 */
	EClass getUIVarchar();

	/**
	 * Returns the meta object for class '{@link eHealthManagement.EDate <em>EDate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDate</em>'.
	 * @see eHealthManagement.EDate
	 * @generated
	 */
	EClass getEDate();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.EDate#getEDateDefault <em>EDate Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EDate Default</em>'.
	 * @see eHealthManagement.EDate#getEDateDefault()
	 * @see #getEDate()
	 * @generated
	 */
	EAttribute getEDate_EDateDefault();

	/**
	 * Returns the meta object for class '{@link eHealthManagement.EBoolean <em>EBoolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EBoolean</em>'.
	 * @see eHealthManagement.EBoolean
	 * @generated
	 */
	EClass getEBoolean();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.EBoolean#isEBooleanDefault <em>EBoolean Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EBoolean Default</em>'.
	 * @see eHealthManagement.EBoolean#isEBooleanDefault()
	 * @see #getEBoolean()
	 * @generated
	 */
	EAttribute getEBoolean_EBooleanDefault();

	/**
	 * Returns the meta object for class '{@link eHealthManagement.EString <em>EString</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EString</em>'.
	 * @see eHealthManagement.EString
	 * @generated
	 */
	EClass getEString();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.EString#getEStringDefault <em>EString Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EString Default</em>'.
	 * @see eHealthManagement.EString#getEStringDefault()
	 * @see #getEString()
	 * @generated
	 */
	EAttribute getEString_EStringDefault();

	/**
	 * Returns the meta object for class '{@link eHealthManagement.EVarchar <em>EVarchar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EVarchar</em>'.
	 * @see eHealthManagement.EVarchar
	 * @generated
	 */
	EClass getEVarchar();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.EVarchar#getEVarcharDefault <em>EVarchar Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EVarchar Default</em>'.
	 * @see eHealthManagement.EVarchar#getEVarcharDefault()
	 * @see #getEVarchar()
	 * @generated
	 */
	EAttribute getEVarchar_EVarcharDefault();

	/**
	 * Returns the meta object for enum '{@link eHealthManagement.AllowedUserTypes <em>Allowed User Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allowed User Types</em>'.
	 * @see eHealthManagement.AllowedUserTypes
	 * @generated
	 */
	EEnum getAllowedUserTypes();

	/**
	 * Returns the meta object for enum '{@link eHealthManagement.AllowedUserInterfaces <em>Allowed User Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allowed User Interfaces</em>'.
	 * @see eHealthManagement.AllowedUserInterfaces
	 * @generated
	 */
	EEnum getAllowedUserInterfaces();

	/**
	 * Returns the meta object for enum '{@link eHealthManagement.AllowedAttributeTypes <em>Allowed Attribute Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allowed Attribute Types</em>'.
	 * @see eHealthManagement.AllowedAttributeTypes
	 * @generated
	 */
	EEnum getAllowedAttributeTypes();

	/**
	 * Returns the meta object for enum '{@link eHealthManagement.AllowedCommunicationInterfaceTypes <em>Allowed Communication Interface Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allowed Communication Interface Types</em>'.
	 * @see eHealthManagement.AllowedCommunicationInterfaceTypes
	 * @generated
	 */
	EEnum getAllowedCommunicationInterfaceTypes();

	/**
	 * Returns the meta object for enum '{@link eHealthManagement.AllowedRepresentationInterfaceTypes <em>Allowed Representation Interface Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allowed Representation Interface Types</em>'.
	 * @see eHealthManagement.AllowedRepresentationInterfaceTypes
	 * @generated
	 */
	EEnum getAllowedRepresentationInterfaceTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EHealthManagementFactory getEHealthManagementFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eHealthManagement.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.impl.UserImpl
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>User Types</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USER_TYPES = eINSTANCE.getUser_UserTypes();

		/**
		 * The meta object literal for the '{@link eHealthManagement.impl.UserInterfaceImpl <em>User Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.impl.UserInterfaceImpl
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getUserInterface()
		 * @generated
		 */
		EClass USER_INTERFACE = eINSTANCE.getUserInterface();

		/**
		 * The meta object literal for the '<em><b>User Interfaces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__USER_INTERFACES = eINSTANCE.getUserInterface_UserInterfaces();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_INTERFACE__USER = eINSTANCE.getUserInterface_User();

		/**
		 * The meta object literal for the '{@link eHealthManagement.impl.RepresentationInterfaceImpl <em>Representation Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.impl.RepresentationInterfaceImpl
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getRepresentationInterface()
		 * @generated
		 */
		EClass REPRESENTATION_INTERFACE = eINSTANCE.getRepresentationInterface();

		/**
		 * The meta object literal for the '<em><b>Representation Interfaces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPRESENTATION_INTERFACE__REPRESENTATION_INTERFACES = eINSTANCE
				.getRepresentationInterface_RepresentationInterfaces();

		/**
		 * The meta object literal for the '{@link eHealthManagement.impl.CommunicationInterfaceImpl <em>Communication Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.impl.CommunicationInterfaceImpl
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getCommunicationInterface()
		 * @generated
		 */
		EClass COMMUNICATION_INTERFACE = eINSTANCE.getCommunicationInterface();

		/**
		 * The meta object literal for the '<em><b>Communication Interfaces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_INTERFACE__COMMUNICATION_INTERFACES = eINSTANCE
				.getCommunicationInterface_CommunicationInterfaces();

		/**
		 * The meta object literal for the '{@link eHealthManagement.impl.TextUIImpl <em>Text UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.impl.TextUIImpl
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getTextUI()
		 * @generated
		 */
		EClass TEXT_UI = eINSTANCE.getTextUI();

		/**
		 * The meta object literal for the '<em><b>EText UI Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_UI__ETEXT_UI_NAME = eINSTANCE.getTextUI_ETextUIName();

		/**
		 * The meta object literal for the '{@link eHealthManagement.impl.ImageUIImpl <em>Image UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.impl.ImageUIImpl
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getImageUI()
		 * @generated
		 */
		EClass IMAGE_UI = eINSTANCE.getImageUI();

		/**
		 * The meta object literal for the '<em><b>EImage UI Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_UI__EIMAGE_UI_NAME = eINSTANCE.getImageUI_EImageUIName();

		/**
		 * The meta object literal for the '{@link eHealthManagement.impl.MessageTypeImpl <em>Message Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.impl.MessageTypeImpl
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getMessageType()
		 * @generated
		 */
		EClass MESSAGE_TYPE = eINSTANCE.getMessageType();

		/**
		 * The meta object literal for the '<em><b>EMessage Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_TYPE__EMESSAGE_TYPE_NAME = eINSTANCE.getMessageType_EMessageTypeName();

		/**
		 * The meta object literal for the '<em><b>Instantiate Message Interface</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MESSAGE_TYPE___INSTANTIATE_MESSAGE_INTERFACE = eINSTANCE
				.getMessageType__InstantiateMessageInterface();

		/**
		 * The meta object literal for the '{@link eHealthManagement.impl.DocumentTypeImpl <em>Document Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.impl.DocumentTypeImpl
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getDocumentType()
		 * @generated
		 */
		EClass DOCUMENT_TYPE = eINSTANCE.getDocumentType();

		/**
		 * The meta object literal for the '<em><b>EDocument Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_TYPE__EDOCUMENT_TYPE_NAME = eINSTANCE.getDocumentType_EDocumentTypeName();

		/**
		 * The meta object literal for the '{@link eHealthManagement.impl.DataSetTypeImpl <em>Data Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.impl.DataSetTypeImpl
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getDataSetType()
		 * @generated
		 */
		EClass DATA_SET_TYPE = eINSTANCE.getDataSetType();

		/**
		 * The meta object literal for the '<em><b>EData Set Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SET_TYPE__EDATA_SET_TYPE_NAME = eINSTANCE.getDataSetType_EDataSetTypeName();

		/**
		 * The meta object literal for the '{@link eHealthManagement.impl.FileMessageImpl <em>File Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.impl.FileMessageImpl
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getFileMessage()
		 * @generated
		 */
		EClass FILE_MESSAGE = eINSTANCE.getFileMessage();

		/**
		 * The meta object literal for the '<em><b>EFile Message Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_MESSAGE__EFILE_MESSAGE_NAME = eINSTANCE.getFileMessage_EFileMessageName();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_MESSAGE__ATTRIBUTES = eINSTANCE.getFileMessage_Attributes();

		/**
		 * The meta object literal for the '{@link eHealthManagement.impl.ImageMessageImpl <em>Image Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.impl.ImageMessageImpl
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getImageMessage()
		 * @generated
		 */
		EClass IMAGE_MESSAGE = eINSTANCE.getImageMessage();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_MESSAGE__ATTRIBUTES = eINSTANCE.getImageMessage_Attributes();

		/**
		 * The meta object literal for the '<em><b>EImage Message Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_MESSAGE__EIMAGE_MESSAGE_NAME = eINSTANCE.getImageMessage_EImageMessageName();

		/**
		 * The meta object literal for the '{@link eHealthManagement.impl.TextMessageImpl <em>Text Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.impl.TextMessageImpl
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getTextMessage()
		 * @generated
		 */
		EClass TEXT_MESSAGE = eINSTANCE.getTextMessage();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_MESSAGE__ATTRIBUTES = eINSTANCE.getTextMessage_Attributes();

		/**
		 * The meta object literal for the '<em><b>EText Message Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_MESSAGE__ETEXT_MESSAGE_NAME = eINSTANCE.getTextMessage_ETextMessageName();

		/**
		 * The meta object literal for the '{@link eHealthManagement.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.impl.DataTypeImpl
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>EData Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__EDATA_TYPE_NAME = eINSTANCE.getDataType_EDataTypeName();

		/**
		 * The meta object literal for the '{@link eHealthManagement.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.impl.EntityImpl
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>EEntity Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__EENTITY_NAME = eINSTANCE.getEntity_EEntityName();

		/**
		 * The meta object literal for the '{@link eHealthManagement.impl.AttributesImpl <em>Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.impl.AttributesImpl
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getAttributes()
		 * @generated
		 */
		EClass ATTRIBUTES = eINSTANCE.getAttributes();

		/**
		 * The meta object literal for the '<em><b>Eventmessagetype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTES__EVENTMESSAGETYPE = eINSTANCE.getAttributes_Eventmessagetype();

		/**
		 * The meta object literal for the '<em><b>EAttributes Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES__EATTRIBUTES_NAME = eINSTANCE.getAttributes_EAttributesName();

		/**
		 * The meta object literal for the '{@link eHealthManagement.impl.MessageExchangeStandardImpl <em>Message Exchange Standard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.impl.MessageExchangeStandardImpl
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getMessageExchangeStandard()
		 * @generated
		 */
		EClass MESSAGE_EXCHANGE_STANDARD = eINSTANCE.getMessageExchangeStandard();

		/**
		 * The meta object literal for the '<em><b>EMessage Exchange Standard Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_EXCHANGE_STANDARD__EMESSAGE_EXCHANGE_STANDARD_NAME = eINSTANCE
				.getMessageExchangeStandard_EMessageExchangeStandardName();

		/**
		 * The meta object literal for the '{@link eHealthManagement.impl.EventMessageTypeImpl <em>Event Message Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.impl.EventMessageTypeImpl
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getEventMessageType()
		 * @generated
		 */
		EClass EVENT_MESSAGE_TYPE = eINSTANCE.getEventMessageType();

		/**
		 * The meta object literal for the '<em><b>EEvent Message Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_MESSAGE_TYPE__EEVENT_MESSAGE_TYPE_NAME = eINSTANCE.getEventMessageType_EEventMessageTypeName();

		/**
		 * The meta object literal for the '<em><b>Messageexchangestandard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_MESSAGE_TYPE__MESSAGEEXCHANGESTANDARD = eINSTANCE
				.getEventMessageType_Messageexchangestandard();

		/**
		 * The meta object literal for the '{@link eHealthManagement.impl.UIImageImpl <em>UI Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.impl.UIImageImpl
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getUIImage()
		 * @generated
		 */
		EClass UI_IMAGE = eINSTANCE.getUIImage();

		/**
		 * The meta object literal for the '{@link eHealthManagement.impl.UIStringImpl <em>UI String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.impl.UIStringImpl
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getUIString()
		 * @generated
		 */
		EClass UI_STRING = eINSTANCE.getUIString();

		/**
		 * The meta object literal for the '{@link eHealthManagement.impl.UIVarcharImpl <em>UI Varchar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.impl.UIVarcharImpl
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getUIVarchar()
		 * @generated
		 */
		EClass UI_VARCHAR = eINSTANCE.getUIVarchar();

		/**
		 * The meta object literal for the '{@link eHealthManagement.impl.EDateImpl <em>EDate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.impl.EDateImpl
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getEDate()
		 * @generated
		 */
		EClass EDATE = eINSTANCE.getEDate();

		/**
		 * The meta object literal for the '<em><b>EDate Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDATE__EDATE_DEFAULT = eINSTANCE.getEDate_EDateDefault();

		/**
		 * The meta object literal for the '{@link eHealthManagement.impl.EBooleanImpl <em>EBoolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.impl.EBooleanImpl
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getEBoolean()
		 * @generated
		 */
		EClass EBOOLEAN = eINSTANCE.getEBoolean();

		/**
		 * The meta object literal for the '<em><b>EBoolean Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EBOOLEAN__EBOOLEAN_DEFAULT = eINSTANCE.getEBoolean_EBooleanDefault();

		/**
		 * The meta object literal for the '{@link eHealthManagement.impl.EStringImpl <em>EString</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.impl.EStringImpl
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getEString()
		 * @generated
		 */
		EClass ESTRING = eINSTANCE.getEString();

		/**
		 * The meta object literal for the '<em><b>EString Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRING__ESTRING_DEFAULT = eINSTANCE.getEString_EStringDefault();

		/**
		 * The meta object literal for the '{@link eHealthManagement.impl.EVarcharImpl <em>EVarchar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.impl.EVarcharImpl
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getEVarchar()
		 * @generated
		 */
		EClass EVARCHAR = eINSTANCE.getEVarchar();

		/**
		 * The meta object literal for the '<em><b>EVarchar Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVARCHAR__EVARCHAR_DEFAULT = eINSTANCE.getEVarchar_EVarcharDefault();

		/**
		 * The meta object literal for the '{@link eHealthManagement.AllowedUserTypes <em>Allowed User Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.AllowedUserTypes
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getAllowedUserTypes()
		 * @generated
		 */
		EEnum ALLOWED_USER_TYPES = eINSTANCE.getAllowedUserTypes();

		/**
		 * The meta object literal for the '{@link eHealthManagement.AllowedUserInterfaces <em>Allowed User Interfaces</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.AllowedUserInterfaces
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getAllowedUserInterfaces()
		 * @generated
		 */
		EEnum ALLOWED_USER_INTERFACES = eINSTANCE.getAllowedUserInterfaces();

		/**
		 * The meta object literal for the '{@link eHealthManagement.AllowedAttributeTypes <em>Allowed Attribute Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.AllowedAttributeTypes
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getAllowedAttributeTypes()
		 * @generated
		 */
		EEnum ALLOWED_ATTRIBUTE_TYPES = eINSTANCE.getAllowedAttributeTypes();

		/**
		 * The meta object literal for the '{@link eHealthManagement.AllowedCommunicationInterfaceTypes <em>Allowed Communication Interface Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.AllowedCommunicationInterfaceTypes
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getAllowedCommunicationInterfaceTypes()
		 * @generated
		 */
		EEnum ALLOWED_COMMUNICATION_INTERFACE_TYPES = eINSTANCE.getAllowedCommunicationInterfaceTypes();

		/**
		 * The meta object literal for the '{@link eHealthManagement.AllowedRepresentationInterfaceTypes <em>Allowed Representation Interface Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.AllowedRepresentationInterfaceTypes
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getAllowedRepresentationInterfaceTypes()
		 * @generated
		 */
		EEnum ALLOWED_REPRESENTATION_INTERFACE_TYPES = eINSTANCE.getAllowedRepresentationInterfaceTypes();

	}

} //EHealthManagementPackage
