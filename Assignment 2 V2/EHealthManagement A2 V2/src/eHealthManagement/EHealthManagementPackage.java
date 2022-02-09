/**
 */
package eHealthManagement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The meta object id for the '{@link eHealthManagement.impl.UserInterfaceImpl <em>User Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.UserInterfaceImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getUserInterface()
	 * @generated
	 */
	int USER_INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>User Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__USER_INTERFACE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>User Interface Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__USER_INTERFACE_VALIDITY = 1;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__USER = 2;

	/**
	 * The feature id for the '<em><b>Representationinterface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__REPRESENTATIONINTERFACE = 3;

	/**
	 * The feature id for the '<em><b>Communicationinterface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__COMMUNICATIONINTERFACE = 4;

	/**
	 * The feature id for the '<em><b>Messageexchangestandard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__MESSAGEEXCHANGESTANDARD = 5;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__DATATYPE = 6;

	/**
	 * The number of structural features of the '<em>User Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>User Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.UserImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getUser()
	 * @generated
	 */
	int USER = 1;

	/**
	 * The feature id for the '<em><b>User Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_TYPE = 0;

	/**
	 * The feature id for the '<em><b>User Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_VALIDITY = 1;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Representation Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_INTERFACE__REPRESENTATION_INTERFACE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Representation Interface Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_INTERFACE__REPRESENTATION_INTERFACE_VALIDITY = 1;

	/**
	 * The feature id for the '<em><b>Imageui</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_INTERFACE__IMAGEUI = 2;

	/**
	 * The feature id for the '<em><b>Textui</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_INTERFACE__TEXTUI = 3;

	/**
	 * The feature id for the '<em><b>Videoui</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_INTERFACE__VIDEOUI = 4;

	/**
	 * The number of structural features of the '<em>Representation Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_INTERFACE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Representation Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_INTERFACE_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Communication Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_INTERFACE__COMMUNICATION_INTERFACE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Communication Interface Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_INTERFACE__COMMUNICATION_INTERFACE_VALIDITY = 1;

	/**
	 * The feature id for the '<em><b>Messagetype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_INTERFACE__MESSAGETYPE = 2;

	/**
	 * The feature id for the '<em><b>Documenttype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_INTERFACE__DOCUMENTTYPE = 3;

	/**
	 * The feature id for the '<em><b>Datasettype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_INTERFACE__DATASETTYPE = 4;

	/**
	 * The number of structural features of the '<em>Communication Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_INTERFACE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Communication Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.ImageUIImpl <em>Image UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.ImageUIImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getImageUI()
	 * @generated
	 */
	int IMAGE_UI = 4;

	/**
	 * The feature id for the '<em><b>Image UI Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UI__IMAGE_UI_NAME = 0;

	/**
	 * The feature id for the '<em><b>Image UI Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UI__IMAGE_UI_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Image UI Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UI__IMAGE_UI_SIZE = 2;

	/**
	 * The number of structural features of the '<em>Image UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UI_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Image UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.TextUIImpl <em>Text UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.TextUIImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getTextUI()
	 * @generated
	 */
	int TEXT_UI = 5;

	/**
	 * The feature id for the '<em><b>Text UI Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_UI__TEXT_UI_NAME = 0;

	/**
	 * The feature id for the '<em><b>Text UI Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_UI__TEXT_UI_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Text UI Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_UI__TEXT_UI_SIZE = 2;

	/**
	 * The number of structural features of the '<em>Text UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_UI_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Text UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_UI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.VideoUIImpl <em>Video UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.VideoUIImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getVideoUI()
	 * @generated
	 */
	int VIDEO_UI = 6;

	/**
	 * The feature id for the '<em><b>Video UI Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_UI__VIDEO_UI_NAME = 0;

	/**
	 * The feature id for the '<em><b>Video UI Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_UI__VIDEO_UI_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Video UI Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_UI__VIDEO_UI_SIZE = 2;

	/**
	 * The number of structural features of the '<em>Video UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_UI_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Video UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_UI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.DatasetTypeImpl <em>Dataset Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.DatasetTypeImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getDatasetType()
	 * @generated
	 */
	int DATASET_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Dataset Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__DATASET_TYPE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Dataset Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__DATASET_TYPE_SIZE = 1;

	/**
	 * The feature id for the '<em><b>Dataset Type Propagation Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE__DATASET_TYPE_PROPAGATION_STATUS = 2;

	/**
	 * The number of structural features of the '<em>Dataset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dataset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.DocumentTypeImpl <em>Document Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.DocumentTypeImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getDocumentType()
	 * @generated
	 */
	int DOCUMENT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Document Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__DOCUMENT_TYPE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Document Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__DOCUMENT_TYPE_SIZE = 1;

	/**
	 * The number of structural features of the '<em>Document Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Document Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.MessageTypeImpl <em>Message Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.MessageTypeImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getMessageType()
	 * @generated
	 */
	int MESSAGE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Message Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__MESSAGE_TYPE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Message Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__MESSAGE_TYPE_SIZE = 1;

	/**
	 * The feature id for the '<em><b>Imagemessge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__IMAGEMESSGE = 2;

	/**
	 * The feature id for the '<em><b>Filemessage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__FILEMESSAGE = 3;

	/**
	 * The feature id for the '<em><b>Textmessage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__TEXTMESSAGE = 4;

	/**
	 * The number of structural features of the '<em>Message Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Message Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.TextMessageImpl <em>Text Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.TextMessageImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getTextMessage()
	 * @generated
	 */
	int TEXT_MESSAGE = 10;

	/**
	 * The feature id for the '<em><b>Text Message Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_MESSAGE__TEXT_MESSAGE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Text Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_MESSAGE__TEXT_MESSAGE_SIZE = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_MESSAGE__ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Text Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_MESSAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Text Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.FileMessageImpl <em>File Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.FileMessageImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getFileMessage()
	 * @generated
	 */
	int FILE_MESSAGE = 11;

	/**
	 * The feature id for the '<em><b>File Message Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MESSAGE__FILE_MESSAGE_NAME = 0;

	/**
	 * The feature id for the '<em><b>File Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MESSAGE__FILE_MESSAGE_SIZE = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MESSAGE__ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>File Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MESSAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>File Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.ImageMessageImpl <em>Image Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.ImageMessageImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getImageMessage()
	 * @generated
	 */
	int IMAGE_MESSAGE = 12;

	/**
	 * The feature id for the '<em><b>Image Message Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MESSAGE__IMAGE_MESSAGE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Image Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MESSAGE__IMAGE_MESSAGE_SIZE = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MESSAGE__ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Image Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MESSAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Image Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.DataTypeImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Data Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DATA_TYPE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Data Type Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DATA_TYPE_SIZE = 1;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ENTITY = 2;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 3;

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
	int ENTITY = 14;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ENTITY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Entity Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ENTITY_SIZE = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.AttributeImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 15;

	/**
	 * The feature id for the '<em><b>Allowed Attribute Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ALLOWED_ATTRIBUTE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Attribute Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE_SIZE = 1;

	/**
	 * The feature id for the '<em><b>Eventmessagetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__EVENTMESSAGETYPE = 2;

	/**
	 * The feature id for the '<em><b>Cimage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CIMAGE = 3;

	/**
	 * The feature id for the '<em><b>Cstring</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CSTRING = 4;

	/**
	 * The feature id for the '<em><b>Cvarchar</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CVARCHAR = 5;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.MessageExchangeStandardImpl <em>Message Exchange Standard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.MessageExchangeStandardImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getMessageExchangeStandard()
	 * @generated
	 */
	int MESSAGE_EXCHANGE_STANDARD = 16;

	/**
	 * The feature id for the '<em><b>Message Exchange Standard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGE_STANDARD__MESSAGE_EXCHANGE_STANDARD_NAME = 0;

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
	int EVENT_MESSAGE_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Event Message Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MESSAGE_TYPE__EVENT_MESSAGE_TYPE_NAME = 0;

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
	 * The meta object id for the '{@link eHealthManagement.impl.CVarcharImpl <em>CVarchar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.CVarcharImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getCVarchar()
	 * @generated
	 */
	int CVARCHAR = 18;

	/**
	 * The feature id for the '<em><b>CVarchar Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVARCHAR__CVARCHAR_NAME = 0;

	/**
	 * The feature id for the '<em><b>CVarchar Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVARCHAR__CVARCHAR_SIZE = 1;

	/**
	 * The number of structural features of the '<em>CVarchar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVARCHAR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>CVarchar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVARCHAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.CStringImpl <em>CString</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.CStringImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getCString()
	 * @generated
	 */
	int CSTRING = 19;

	/**
	 * The feature id for the '<em><b>CString Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSTRING__CSTRING_NAME = 0;

	/**
	 * The feature id for the '<em><b>CString Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSTRING__CSTRING_SIZE = 1;

	/**
	 * The number of structural features of the '<em>CString</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSTRING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>CString</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSTRING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.CImageImpl <em>CImage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.CImageImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getCImage()
	 * @generated
	 */
	int CIMAGE = 20;

	/**
	 * The feature id for the '<em><b>CImage Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIMAGE__CIMAGE_NAME = 0;

	/**
	 * The feature id for the '<em><b>CImage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIMAGE__CIMAGE_SIZE = 1;

	/**
	 * The number of structural features of the '<em>CImage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIMAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>CImage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIMAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.impl.TestImpl <em>Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.impl.TestImpl
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getTest()
	 * @generated
	 */
	int TEST = 21;

	/**
	 * The feature id for the '<em><b>Image UI Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__IMAGE_UI_NAME = IMAGE_UI__IMAGE_UI_NAME;

	/**
	 * The feature id for the '<em><b>Image UI Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__IMAGE_UI_TYPE = IMAGE_UI__IMAGE_UI_TYPE;

	/**
	 * The feature id for the '<em><b>Image UI Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__IMAGE_UI_SIZE = IMAGE_UI__IMAGE_UI_SIZE;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__TEST = IMAGE_UI_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FEATURE_COUNT = IMAGE_UI_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OPERATION_COUNT = IMAGE_UI_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eHealthManagement.AllowedUserType <em>Allowed User Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.AllowedUserType
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getAllowedUserType()
	 * @generated
	 */
	int ALLOWED_USER_TYPE = 22;

	/**
	 * The meta object id for the '{@link eHealthManagement.AllowedUserInterface <em>Allowed User Interface</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.AllowedUserInterface
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getAllowedUserInterface()
	 * @generated
	 */
	int ALLOWED_USER_INTERFACE = 23;

	/**
	 * The meta object id for the '{@link eHealthManagement.AllowedCommunicationInterfaceType <em>Allowed Communication Interface Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.AllowedCommunicationInterfaceType
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getAllowedCommunicationInterfaceType()
	 * @generated
	 */
	int ALLOWED_COMMUNICATION_INTERFACE_TYPE = 24;

	/**
	 * The meta object id for the '{@link eHealthManagement.AllowedRepresentationInterfaceType <em>Allowed Representation Interface Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.AllowedRepresentationInterfaceType
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getAllowedRepresentationInterfaceType()
	 * @generated
	 */
	int ALLOWED_REPRESENTATION_INTERFACE_TYPE = 25;

	/**
	 * The meta object id for the '{@link eHealthManagement.AllowedAttributeType <em>Allowed Attribute Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagement.AllowedAttributeType
	 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getAllowedAttributeType()
	 * @generated
	 */
	int ALLOWED_ATTRIBUTE_TYPE = 26;


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
	 * Returns the meta object for the attribute '{@link eHealthManagement.UserInterface#getUserInterfaceType <em>User Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Interface Type</em>'.
	 * @see eHealthManagement.UserInterface#getUserInterfaceType()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_UserInterfaceType();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.UserInterface#isUserInterfaceValidity <em>User Interface Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Interface Validity</em>'.
	 * @see eHealthManagement.UserInterface#isUserInterfaceValidity()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_UserInterfaceValidity();

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
	 * Returns the meta object for the containment reference list '{@link eHealthManagement.UserInterface#getRepresentationinterface <em>Representationinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Representationinterface</em>'.
	 * @see eHealthManagement.UserInterface#getRepresentationinterface()
	 * @see #getUserInterface()
	 * @generated
	 */
	EReference getUserInterface_Representationinterface();

	/**
	 * Returns the meta object for the containment reference list '{@link eHealthManagement.UserInterface#getCommunicationinterface <em>Communicationinterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Communicationinterface</em>'.
	 * @see eHealthManagement.UserInterface#getCommunicationinterface()
	 * @see #getUserInterface()
	 * @generated
	 */
	EReference getUserInterface_Communicationinterface();

	/**
	 * Returns the meta object for the containment reference list '{@link eHealthManagement.UserInterface#getMessageexchangestandard <em>Messageexchangestandard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messageexchangestandard</em>'.
	 * @see eHealthManagement.UserInterface#getMessageexchangestandard()
	 * @see #getUserInterface()
	 * @generated
	 */
	EReference getUserInterface_Messageexchangestandard();

	/**
	 * Returns the meta object for the containment reference list '{@link eHealthManagement.UserInterface#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatype</em>'.
	 * @see eHealthManagement.UserInterface#getDatatype()
	 * @see #getUserInterface()
	 * @generated
	 */
	EReference getUserInterface_Datatype();

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
	 * Returns the meta object for the attribute '{@link eHealthManagement.User#getUserType <em>User Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Type</em>'.
	 * @see eHealthManagement.User#getUserType()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_UserType();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.User#isUserValidity <em>User Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Validity</em>'.
	 * @see eHealthManagement.User#isUserValidity()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_UserValidity();

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
	 * Returns the meta object for the attribute '{@link eHealthManagement.RepresentationInterface#getRepresentationInterfaceType <em>Representation Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Representation Interface Type</em>'.
	 * @see eHealthManagement.RepresentationInterface#getRepresentationInterfaceType()
	 * @see #getRepresentationInterface()
	 * @generated
	 */
	EAttribute getRepresentationInterface_RepresentationInterfaceType();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.RepresentationInterface#getRepresentationInterfaceValidity <em>Representation Interface Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Representation Interface Validity</em>'.
	 * @see eHealthManagement.RepresentationInterface#getRepresentationInterfaceValidity()
	 * @see #getRepresentationInterface()
	 * @generated
	 */
	EAttribute getRepresentationInterface_RepresentationInterfaceValidity();

	/**
	 * Returns the meta object for the containment reference list '{@link eHealthManagement.RepresentationInterface#getImageui <em>Imageui</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imageui</em>'.
	 * @see eHealthManagement.RepresentationInterface#getImageui()
	 * @see #getRepresentationInterface()
	 * @generated
	 */
	EReference getRepresentationInterface_Imageui();

	/**
	 * Returns the meta object for the containment reference list '{@link eHealthManagement.RepresentationInterface#getTextui <em>Textui</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Textui</em>'.
	 * @see eHealthManagement.RepresentationInterface#getTextui()
	 * @see #getRepresentationInterface()
	 * @generated
	 */
	EReference getRepresentationInterface_Textui();

	/**
	 * Returns the meta object for the containment reference list '{@link eHealthManagement.RepresentationInterface#getVideoui <em>Videoui</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Videoui</em>'.
	 * @see eHealthManagement.RepresentationInterface#getVideoui()
	 * @see #getRepresentationInterface()
	 * @generated
	 */
	EReference getRepresentationInterface_Videoui();

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
	 * Returns the meta object for the attribute '{@link eHealthManagement.CommunicationInterface#getCommunicationInterfaceType <em>Communication Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication Interface Type</em>'.
	 * @see eHealthManagement.CommunicationInterface#getCommunicationInterfaceType()
	 * @see #getCommunicationInterface()
	 * @generated
	 */
	EAttribute getCommunicationInterface_CommunicationInterfaceType();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.CommunicationInterface#isCommunicationInterfaceValidity <em>Communication Interface Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication Interface Validity</em>'.
	 * @see eHealthManagement.CommunicationInterface#isCommunicationInterfaceValidity()
	 * @see #getCommunicationInterface()
	 * @generated
	 */
	EAttribute getCommunicationInterface_CommunicationInterfaceValidity();

	/**
	 * Returns the meta object for the containment reference list '{@link eHealthManagement.CommunicationInterface#getMessagetype <em>Messagetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messagetype</em>'.
	 * @see eHealthManagement.CommunicationInterface#getMessagetype()
	 * @see #getCommunicationInterface()
	 * @generated
	 */
	EReference getCommunicationInterface_Messagetype();

	/**
	 * Returns the meta object for the containment reference list '{@link eHealthManagement.CommunicationInterface#getDocumenttype <em>Documenttype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documenttype</em>'.
	 * @see eHealthManagement.CommunicationInterface#getDocumenttype()
	 * @see #getCommunicationInterface()
	 * @generated
	 */
	EReference getCommunicationInterface_Documenttype();

	/**
	 * Returns the meta object for the containment reference list '{@link eHealthManagement.CommunicationInterface#getDatasettype <em>Datasettype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datasettype</em>'.
	 * @see eHealthManagement.CommunicationInterface#getDatasettype()
	 * @see #getCommunicationInterface()
	 * @generated
	 */
	EReference getCommunicationInterface_Datasettype();

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
	 * Returns the meta object for the attribute '{@link eHealthManagement.ImageUI#getImageUIName <em>Image UI Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image UI Name</em>'.
	 * @see eHealthManagement.ImageUI#getImageUIName()
	 * @see #getImageUI()
	 * @generated
	 */
	EAttribute getImageUI_ImageUIName();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.ImageUI#getImageUIType <em>Image UI Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image UI Type</em>'.
	 * @see eHealthManagement.ImageUI#getImageUIType()
	 * @see #getImageUI()
	 * @generated
	 */
	EAttribute getImageUI_ImageUIType();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.ImageUI#getImageUISize <em>Image UI Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image UI Size</em>'.
	 * @see eHealthManagement.ImageUI#getImageUISize()
	 * @see #getImageUI()
	 * @generated
	 */
	EAttribute getImageUI_ImageUISize();

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
	 * Returns the meta object for the attribute '{@link eHealthManagement.TextUI#getTextUIName <em>Text UI Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text UI Name</em>'.
	 * @see eHealthManagement.TextUI#getTextUIName()
	 * @see #getTextUI()
	 * @generated
	 */
	EAttribute getTextUI_TextUIName();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.TextUI#getTextUIType <em>Text UI Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text UI Type</em>'.
	 * @see eHealthManagement.TextUI#getTextUIType()
	 * @see #getTextUI()
	 * @generated
	 */
	EAttribute getTextUI_TextUIType();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.TextUI#getTextUISize <em>Text UI Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text UI Size</em>'.
	 * @see eHealthManagement.TextUI#getTextUISize()
	 * @see #getTextUI()
	 * @generated
	 */
	EAttribute getTextUI_TextUISize();

	/**
	 * Returns the meta object for class '{@link eHealthManagement.VideoUI <em>Video UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video UI</em>'.
	 * @see eHealthManagement.VideoUI
	 * @generated
	 */
	EClass getVideoUI();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.VideoUI#getVideoUIName <em>Video UI Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Video UI Name</em>'.
	 * @see eHealthManagement.VideoUI#getVideoUIName()
	 * @see #getVideoUI()
	 * @generated
	 */
	EAttribute getVideoUI_VideoUIName();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.VideoUI#getVideoUIType <em>Video UI Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Video UI Type</em>'.
	 * @see eHealthManagement.VideoUI#getVideoUIType()
	 * @see #getVideoUI()
	 * @generated
	 */
	EAttribute getVideoUI_VideoUIType();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.VideoUI#getVideoUISize <em>Video UI Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Video UI Size</em>'.
	 * @see eHealthManagement.VideoUI#getVideoUISize()
	 * @see #getVideoUI()
	 * @generated
	 */
	EAttribute getVideoUI_VideoUISize();

	/**
	 * Returns the meta object for class '{@link eHealthManagement.DatasetType <em>Dataset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset Type</em>'.
	 * @see eHealthManagement.DatasetType
	 * @generated
	 */
	EClass getDatasetType();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.DatasetType#getDatasetTypeName <em>Dataset Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dataset Type Name</em>'.
	 * @see eHealthManagement.DatasetType#getDatasetTypeName()
	 * @see #getDatasetType()
	 * @generated
	 */
	EAttribute getDatasetType_DatasetTypeName();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.DatasetType#getDatasetTypeSize <em>Dataset Type Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dataset Type Size</em>'.
	 * @see eHealthManagement.DatasetType#getDatasetTypeSize()
	 * @see #getDatasetType()
	 * @generated
	 */
	EAttribute getDatasetType_DatasetTypeSize();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.DatasetType#isDatasetTypePropagationStatus <em>Dataset Type Propagation Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dataset Type Propagation Status</em>'.
	 * @see eHealthManagement.DatasetType#isDatasetTypePropagationStatus()
	 * @see #getDatasetType()
	 * @generated
	 */
	EAttribute getDatasetType_DatasetTypePropagationStatus();

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
	 * Returns the meta object for the attribute '{@link eHealthManagement.DocumentType#getDocumentTypeName <em>Document Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Type Name</em>'.
	 * @see eHealthManagement.DocumentType#getDocumentTypeName()
	 * @see #getDocumentType()
	 * @generated
	 */
	EAttribute getDocumentType_DocumentTypeName();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.DocumentType#getDocumentTypeSize <em>Document Type Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Type Size</em>'.
	 * @see eHealthManagement.DocumentType#getDocumentTypeSize()
	 * @see #getDocumentType()
	 * @generated
	 */
	EAttribute getDocumentType_DocumentTypeSize();

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
	 * Returns the meta object for the attribute '{@link eHealthManagement.MessageType#getMessageTypeName <em>Message Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Type Name</em>'.
	 * @see eHealthManagement.MessageType#getMessageTypeName()
	 * @see #getMessageType()
	 * @generated
	 */
	EAttribute getMessageType_MessageTypeName();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.MessageType#getMessageTypeSize <em>Message Type Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Type Size</em>'.
	 * @see eHealthManagement.MessageType#getMessageTypeSize()
	 * @see #getMessageType()
	 * @generated
	 */
	EAttribute getMessageType_MessageTypeSize();

	/**
	 * Returns the meta object for the containment reference list '{@link eHealthManagement.MessageType#getImagemessge <em>Imagemessge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imagemessge</em>'.
	 * @see eHealthManagement.MessageType#getImagemessge()
	 * @see #getMessageType()
	 * @generated
	 */
	EReference getMessageType_Imagemessge();

	/**
	 * Returns the meta object for the containment reference list '{@link eHealthManagement.MessageType#getFilemessage <em>Filemessage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filemessage</em>'.
	 * @see eHealthManagement.MessageType#getFilemessage()
	 * @see #getMessageType()
	 * @generated
	 */
	EReference getMessageType_Filemessage();

	/**
	 * Returns the meta object for the containment reference list '{@link eHealthManagement.MessageType#getTextmessage <em>Textmessage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Textmessage</em>'.
	 * @see eHealthManagement.MessageType#getTextmessage()
	 * @see #getMessageType()
	 * @generated
	 */
	EReference getMessageType_Textmessage();

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
	 * Returns the meta object for the attribute '{@link eHealthManagement.TextMessage#getTextMessageName <em>Text Message Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Message Name</em>'.
	 * @see eHealthManagement.TextMessage#getTextMessageName()
	 * @see #getTextMessage()
	 * @generated
	 */
	EAttribute getTextMessage_TextMessageName();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.TextMessage#getTextMessageSize <em>Text Message Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Message Size</em>'.
	 * @see eHealthManagement.TextMessage#getTextMessageSize()
	 * @see #getTextMessage()
	 * @generated
	 */
	EAttribute getTextMessage_TextMessageSize();

	/**
	 * Returns the meta object for the reference '{@link eHealthManagement.TextMessage#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see eHealthManagement.TextMessage#getAttribute()
	 * @see #getTextMessage()
	 * @generated
	 */
	EReference getTextMessage_Attribute();

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
	 * Returns the meta object for the attribute '{@link eHealthManagement.FileMessage#getFileMessageName <em>File Message Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Message Name</em>'.
	 * @see eHealthManagement.FileMessage#getFileMessageName()
	 * @see #getFileMessage()
	 * @generated
	 */
	EAttribute getFileMessage_FileMessageName();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.FileMessage#getFileMessageSize <em>File Message Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Message Size</em>'.
	 * @see eHealthManagement.FileMessage#getFileMessageSize()
	 * @see #getFileMessage()
	 * @generated
	 */
	EAttribute getFileMessage_FileMessageSize();

	/**
	 * Returns the meta object for the reference '{@link eHealthManagement.FileMessage#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see eHealthManagement.FileMessage#getAttribute()
	 * @see #getFileMessage()
	 * @generated
	 */
	EReference getFileMessage_Attribute();

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
	 * Returns the meta object for the attribute '{@link eHealthManagement.ImageMessage#getImageMessageName <em>Image Message Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Message Name</em>'.
	 * @see eHealthManagement.ImageMessage#getImageMessageName()
	 * @see #getImageMessage()
	 * @generated
	 */
	EAttribute getImageMessage_ImageMessageName();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.ImageMessage#getImageMessageSize <em>Image Message Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Message Size</em>'.
	 * @see eHealthManagement.ImageMessage#getImageMessageSize()
	 * @see #getImageMessage()
	 * @generated
	 */
	EAttribute getImageMessage_ImageMessageSize();

	/**
	 * Returns the meta object for the reference '{@link eHealthManagement.ImageMessage#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see eHealthManagement.ImageMessage#getAttribute()
	 * @see #getImageMessage()
	 * @generated
	 */
	EReference getImageMessage_Attribute();

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
	 * Returns the meta object for the attribute '{@link eHealthManagement.DataType#getDataTypeName <em>Data Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type Name</em>'.
	 * @see eHealthManagement.DataType#getDataTypeName()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_DataTypeName();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.DataType#getDataTypeSize <em>Data Type Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type Size</em>'.
	 * @see eHealthManagement.DataType#getDataTypeSize()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_DataTypeSize();

	/**
	 * Returns the meta object for the containment reference list '{@link eHealthManagement.DataType#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity</em>'.
	 * @see eHealthManagement.DataType#getEntity()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Entity();

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
	 * Returns the meta object for the attribute '{@link eHealthManagement.Entity#getEntityName <em>Entity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Name</em>'.
	 * @see eHealthManagement.Entity#getEntityName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_EntityName();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.Entity#getEntitySize <em>Entity Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Size</em>'.
	 * @see eHealthManagement.Entity#getEntitySize()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_EntitySize();

	/**
	 * Returns the meta object for the containment reference list '{@link eHealthManagement.Entity#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see eHealthManagement.Entity#getAttribute()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attribute();

	/**
	 * Returns the meta object for class '{@link eHealthManagement.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see eHealthManagement.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.Attribute#getAllowedAttributeType <em>Allowed Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allowed Attribute Type</em>'.
	 * @see eHealthManagement.Attribute#getAllowedAttributeType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_AllowedAttributeType();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.Attribute#getAttributeSize <em>Attribute Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Size</em>'.
	 * @see eHealthManagement.Attribute#getAttributeSize()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_AttributeSize();

	/**
	 * Returns the meta object for the reference '{@link eHealthManagement.Attribute#getEventmessagetype <em>Eventmessagetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Eventmessagetype</em>'.
	 * @see eHealthManagement.Attribute#getEventmessagetype()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Eventmessagetype();

	/**
	 * Returns the meta object for the containment reference list '{@link eHealthManagement.Attribute#getCimage <em>Cimage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cimage</em>'.
	 * @see eHealthManagement.Attribute#getCimage()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Cimage();

	/**
	 * Returns the meta object for the containment reference list '{@link eHealthManagement.Attribute#getCstring <em>Cstring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cstring</em>'.
	 * @see eHealthManagement.Attribute#getCstring()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Cstring();

	/**
	 * Returns the meta object for the containment reference list '{@link eHealthManagement.Attribute#getCvarchar <em>Cvarchar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cvarchar</em>'.
	 * @see eHealthManagement.Attribute#getCvarchar()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Cvarchar();

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
	 * Returns the meta object for the attribute '{@link eHealthManagement.MessageExchangeStandard#getMessageExchangeStandardName <em>Message Exchange Standard Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Exchange Standard Name</em>'.
	 * @see eHealthManagement.MessageExchangeStandard#getMessageExchangeStandardName()
	 * @see #getMessageExchangeStandard()
	 * @generated
	 */
	EAttribute getMessageExchangeStandard_MessageExchangeStandardName();

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
	 * Returns the meta object for the attribute '{@link eHealthManagement.EventMessageType#getEventMessageTypeName <em>Event Message Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Message Type Name</em>'.
	 * @see eHealthManagement.EventMessageType#getEventMessageTypeName()
	 * @see #getEventMessageType()
	 * @generated
	 */
	EAttribute getEventMessageType_EventMessageTypeName();

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
	 * Returns the meta object for class '{@link eHealthManagement.CVarchar <em>CVarchar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CVarchar</em>'.
	 * @see eHealthManagement.CVarchar
	 * @generated
	 */
	EClass getCVarchar();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.CVarchar#getCVarcharName <em>CVarchar Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CVarchar Name</em>'.
	 * @see eHealthManagement.CVarchar#getCVarcharName()
	 * @see #getCVarchar()
	 * @generated
	 */
	EAttribute getCVarchar_CVarcharName();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.CVarchar#getCVarcharSize <em>CVarchar Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CVarchar Size</em>'.
	 * @see eHealthManagement.CVarchar#getCVarcharSize()
	 * @see #getCVarchar()
	 * @generated
	 */
	EAttribute getCVarchar_CVarcharSize();

	/**
	 * Returns the meta object for class '{@link eHealthManagement.CString <em>CString</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CString</em>'.
	 * @see eHealthManagement.CString
	 * @generated
	 */
	EClass getCString();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.CString#getCStringName <em>CString Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CString Name</em>'.
	 * @see eHealthManagement.CString#getCStringName()
	 * @see #getCString()
	 * @generated
	 */
	EAttribute getCString_CStringName();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.CString#getCStringSize <em>CString Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CString Size</em>'.
	 * @see eHealthManagement.CString#getCStringSize()
	 * @see #getCString()
	 * @generated
	 */
	EAttribute getCString_CStringSize();

	/**
	 * Returns the meta object for class '{@link eHealthManagement.CImage <em>CImage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CImage</em>'.
	 * @see eHealthManagement.CImage
	 * @generated
	 */
	EClass getCImage();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.CImage#getCImageName <em>CImage Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CImage Name</em>'.
	 * @see eHealthManagement.CImage#getCImageName()
	 * @see #getCImage()
	 * @generated
	 */
	EAttribute getCImage_CImageName();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.CImage#getCImageSize <em>CImage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CImage Size</em>'.
	 * @see eHealthManagement.CImage#getCImageSize()
	 * @see #getCImage()
	 * @generated
	 */
	EAttribute getCImage_CImageSize();

	/**
	 * Returns the meta object for class '{@link eHealthManagement.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test</em>'.
	 * @see eHealthManagement.Test
	 * @generated
	 */
	EClass getTest();

	/**
	 * Returns the meta object for the attribute '{@link eHealthManagement.Test#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test</em>'.
	 * @see eHealthManagement.Test#getTest()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Test();

	/**
	 * Returns the meta object for enum '{@link eHealthManagement.AllowedUserType <em>Allowed User Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allowed User Type</em>'.
	 * @see eHealthManagement.AllowedUserType
	 * @generated
	 */
	EEnum getAllowedUserType();

	/**
	 * Returns the meta object for enum '{@link eHealthManagement.AllowedUserInterface <em>Allowed User Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allowed User Interface</em>'.
	 * @see eHealthManagement.AllowedUserInterface
	 * @generated
	 */
	EEnum getAllowedUserInterface();

	/**
	 * Returns the meta object for enum '{@link eHealthManagement.AllowedCommunicationInterfaceType <em>Allowed Communication Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allowed Communication Interface Type</em>'.
	 * @see eHealthManagement.AllowedCommunicationInterfaceType
	 * @generated
	 */
	EEnum getAllowedCommunicationInterfaceType();

	/**
	 * Returns the meta object for enum '{@link eHealthManagement.AllowedRepresentationInterfaceType <em>Allowed Representation Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allowed Representation Interface Type</em>'.
	 * @see eHealthManagement.AllowedRepresentationInterfaceType
	 * @generated
	 */
	EEnum getAllowedRepresentationInterfaceType();

	/**
	 * Returns the meta object for enum '{@link eHealthManagement.AllowedAttributeType <em>Allowed Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allowed Attribute Type</em>'.
	 * @see eHealthManagement.AllowedAttributeType
	 * @generated
	 */
	EEnum getAllowedAttributeType();

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
		 * The meta object literal for the '{@link eHealthManagement.impl.UserInterfaceImpl <em>User Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.impl.UserInterfaceImpl
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getUserInterface()
		 * @generated
		 */
		EClass USER_INTERFACE = eINSTANCE.getUserInterface();

		/**
		 * The meta object literal for the '<em><b>User Interface Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__USER_INTERFACE_TYPE = eINSTANCE.getUserInterface_UserInterfaceType();

		/**
		 * The meta object literal for the '<em><b>User Interface Validity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__USER_INTERFACE_VALIDITY = eINSTANCE.getUserInterface_UserInterfaceValidity();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_INTERFACE__USER = eINSTANCE.getUserInterface_User();

		/**
		 * The meta object literal for the '<em><b>Representationinterface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_INTERFACE__REPRESENTATIONINTERFACE = eINSTANCE.getUserInterface_Representationinterface();

		/**
		 * The meta object literal for the '<em><b>Communicationinterface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_INTERFACE__COMMUNICATIONINTERFACE = eINSTANCE.getUserInterface_Communicationinterface();

		/**
		 * The meta object literal for the '<em><b>Messageexchangestandard</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_INTERFACE__MESSAGEEXCHANGESTANDARD = eINSTANCE.getUserInterface_Messageexchangestandard();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_INTERFACE__DATATYPE = eINSTANCE.getUserInterface_Datatype();

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
		 * The meta object literal for the '<em><b>User Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USER_TYPE = eINSTANCE.getUser_UserType();

		/**
		 * The meta object literal for the '<em><b>User Validity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USER_VALIDITY = eINSTANCE.getUser_UserValidity();

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
		 * The meta object literal for the '<em><b>Representation Interface Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPRESENTATION_INTERFACE__REPRESENTATION_INTERFACE_TYPE = eINSTANCE.getRepresentationInterface_RepresentationInterfaceType();

		/**
		 * The meta object literal for the '<em><b>Representation Interface Validity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPRESENTATION_INTERFACE__REPRESENTATION_INTERFACE_VALIDITY = eINSTANCE.getRepresentationInterface_RepresentationInterfaceValidity();

		/**
		 * The meta object literal for the '<em><b>Imageui</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION_INTERFACE__IMAGEUI = eINSTANCE.getRepresentationInterface_Imageui();

		/**
		 * The meta object literal for the '<em><b>Textui</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION_INTERFACE__TEXTUI = eINSTANCE.getRepresentationInterface_Textui();

		/**
		 * The meta object literal for the '<em><b>Videoui</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPRESENTATION_INTERFACE__VIDEOUI = eINSTANCE.getRepresentationInterface_Videoui();

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
		 * The meta object literal for the '<em><b>Communication Interface Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_INTERFACE__COMMUNICATION_INTERFACE_TYPE = eINSTANCE.getCommunicationInterface_CommunicationInterfaceType();

		/**
		 * The meta object literal for the '<em><b>Communication Interface Validity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_INTERFACE__COMMUNICATION_INTERFACE_VALIDITY = eINSTANCE.getCommunicationInterface_CommunicationInterfaceValidity();

		/**
		 * The meta object literal for the '<em><b>Messagetype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_INTERFACE__MESSAGETYPE = eINSTANCE.getCommunicationInterface_Messagetype();

		/**
		 * The meta object literal for the '<em><b>Documenttype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_INTERFACE__DOCUMENTTYPE = eINSTANCE.getCommunicationInterface_Documenttype();

		/**
		 * The meta object literal for the '<em><b>Datasettype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_INTERFACE__DATASETTYPE = eINSTANCE.getCommunicationInterface_Datasettype();

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
		 * The meta object literal for the '<em><b>Image UI Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_UI__IMAGE_UI_NAME = eINSTANCE.getImageUI_ImageUIName();

		/**
		 * The meta object literal for the '<em><b>Image UI Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_UI__IMAGE_UI_TYPE = eINSTANCE.getImageUI_ImageUIType();

		/**
		 * The meta object literal for the '<em><b>Image UI Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_UI__IMAGE_UI_SIZE = eINSTANCE.getImageUI_ImageUISize();

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
		 * The meta object literal for the '<em><b>Text UI Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_UI__TEXT_UI_NAME = eINSTANCE.getTextUI_TextUIName();

		/**
		 * The meta object literal for the '<em><b>Text UI Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_UI__TEXT_UI_TYPE = eINSTANCE.getTextUI_TextUIType();

		/**
		 * The meta object literal for the '<em><b>Text UI Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_UI__TEXT_UI_SIZE = eINSTANCE.getTextUI_TextUISize();

		/**
		 * The meta object literal for the '{@link eHealthManagement.impl.VideoUIImpl <em>Video UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.impl.VideoUIImpl
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getVideoUI()
		 * @generated
		 */
		EClass VIDEO_UI = eINSTANCE.getVideoUI();

		/**
		 * The meta object literal for the '<em><b>Video UI Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO_UI__VIDEO_UI_NAME = eINSTANCE.getVideoUI_VideoUIName();

		/**
		 * The meta object literal for the '<em><b>Video UI Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO_UI__VIDEO_UI_TYPE = eINSTANCE.getVideoUI_VideoUIType();

		/**
		 * The meta object literal for the '<em><b>Video UI Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO_UI__VIDEO_UI_SIZE = eINSTANCE.getVideoUI_VideoUISize();

		/**
		 * The meta object literal for the '{@link eHealthManagement.impl.DatasetTypeImpl <em>Dataset Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.impl.DatasetTypeImpl
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getDatasetType()
		 * @generated
		 */
		EClass DATASET_TYPE = eINSTANCE.getDatasetType();

		/**
		 * The meta object literal for the '<em><b>Dataset Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET_TYPE__DATASET_TYPE_NAME = eINSTANCE.getDatasetType_DatasetTypeName();

		/**
		 * The meta object literal for the '<em><b>Dataset Type Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET_TYPE__DATASET_TYPE_SIZE = eINSTANCE.getDatasetType_DatasetTypeSize();

		/**
		 * The meta object literal for the '<em><b>Dataset Type Propagation Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASET_TYPE__DATASET_TYPE_PROPAGATION_STATUS = eINSTANCE.getDatasetType_DatasetTypePropagationStatus();

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
		 * The meta object literal for the '<em><b>Document Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_TYPE__DOCUMENT_TYPE_NAME = eINSTANCE.getDocumentType_DocumentTypeName();

		/**
		 * The meta object literal for the '<em><b>Document Type Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_TYPE__DOCUMENT_TYPE_SIZE = eINSTANCE.getDocumentType_DocumentTypeSize();

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
		 * The meta object literal for the '<em><b>Message Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_TYPE__MESSAGE_TYPE_NAME = eINSTANCE.getMessageType_MessageTypeName();

		/**
		 * The meta object literal for the '<em><b>Message Type Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_TYPE__MESSAGE_TYPE_SIZE = eINSTANCE.getMessageType_MessageTypeSize();

		/**
		 * The meta object literal for the '<em><b>Imagemessge</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_TYPE__IMAGEMESSGE = eINSTANCE.getMessageType_Imagemessge();

		/**
		 * The meta object literal for the '<em><b>Filemessage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_TYPE__FILEMESSAGE = eINSTANCE.getMessageType_Filemessage();

		/**
		 * The meta object literal for the '<em><b>Textmessage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_TYPE__TEXTMESSAGE = eINSTANCE.getMessageType_Textmessage();

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
		 * The meta object literal for the '<em><b>Text Message Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_MESSAGE__TEXT_MESSAGE_NAME = eINSTANCE.getTextMessage_TextMessageName();

		/**
		 * The meta object literal for the '<em><b>Text Message Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_MESSAGE__TEXT_MESSAGE_SIZE = eINSTANCE.getTextMessage_TextMessageSize();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_MESSAGE__ATTRIBUTE = eINSTANCE.getTextMessage_Attribute();

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
		 * The meta object literal for the '<em><b>File Message Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_MESSAGE__FILE_MESSAGE_NAME = eINSTANCE.getFileMessage_FileMessageName();

		/**
		 * The meta object literal for the '<em><b>File Message Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_MESSAGE__FILE_MESSAGE_SIZE = eINSTANCE.getFileMessage_FileMessageSize();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_MESSAGE__ATTRIBUTE = eINSTANCE.getFileMessage_Attribute();

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
		 * The meta object literal for the '<em><b>Image Message Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_MESSAGE__IMAGE_MESSAGE_NAME = eINSTANCE.getImageMessage_ImageMessageName();

		/**
		 * The meta object literal for the '<em><b>Image Message Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_MESSAGE__IMAGE_MESSAGE_SIZE = eINSTANCE.getImageMessage_ImageMessageSize();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_MESSAGE__ATTRIBUTE = eINSTANCE.getImageMessage_Attribute();

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
		 * The meta object literal for the '<em><b>Data Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__DATA_TYPE_NAME = eINSTANCE.getDataType_DataTypeName();

		/**
		 * The meta object literal for the '<em><b>Data Type Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__DATA_TYPE_SIZE = eINSTANCE.getDataType_DataTypeSize();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__ENTITY = eINSTANCE.getDataType_Entity();

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
		 * The meta object literal for the '<em><b>Entity Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__ENTITY_NAME = eINSTANCE.getEntity_EntityName();

		/**
		 * The meta object literal for the '<em><b>Entity Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__ENTITY_SIZE = eINSTANCE.getEntity_EntitySize();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ATTRIBUTE = eINSTANCE.getEntity_Attribute();

		/**
		 * The meta object literal for the '{@link eHealthManagement.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.impl.AttributeImpl
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Allowed Attribute Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__ALLOWED_ATTRIBUTE_TYPE = eINSTANCE.getAttribute_AllowedAttributeType();

		/**
		 * The meta object literal for the '<em><b>Attribute Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__ATTRIBUTE_SIZE = eINSTANCE.getAttribute_AttributeSize();

		/**
		 * The meta object literal for the '<em><b>Eventmessagetype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__EVENTMESSAGETYPE = eINSTANCE.getAttribute_Eventmessagetype();

		/**
		 * The meta object literal for the '<em><b>Cimage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__CIMAGE = eINSTANCE.getAttribute_Cimage();

		/**
		 * The meta object literal for the '<em><b>Cstring</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__CSTRING = eINSTANCE.getAttribute_Cstring();

		/**
		 * The meta object literal for the '<em><b>Cvarchar</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__CVARCHAR = eINSTANCE.getAttribute_Cvarchar();

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
		 * The meta object literal for the '<em><b>Message Exchange Standard Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_EXCHANGE_STANDARD__MESSAGE_EXCHANGE_STANDARD_NAME = eINSTANCE.getMessageExchangeStandard_MessageExchangeStandardName();

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
		 * The meta object literal for the '<em><b>Event Message Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_MESSAGE_TYPE__EVENT_MESSAGE_TYPE_NAME = eINSTANCE.getEventMessageType_EventMessageTypeName();

		/**
		 * The meta object literal for the '<em><b>Messageexchangestandard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_MESSAGE_TYPE__MESSAGEEXCHANGESTANDARD = eINSTANCE.getEventMessageType_Messageexchangestandard();

		/**
		 * The meta object literal for the '{@link eHealthManagement.impl.CVarcharImpl <em>CVarchar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.impl.CVarcharImpl
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getCVarchar()
		 * @generated
		 */
		EClass CVARCHAR = eINSTANCE.getCVarchar();

		/**
		 * The meta object literal for the '<em><b>CVarchar Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CVARCHAR__CVARCHAR_NAME = eINSTANCE.getCVarchar_CVarcharName();

		/**
		 * The meta object literal for the '<em><b>CVarchar Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CVARCHAR__CVARCHAR_SIZE = eINSTANCE.getCVarchar_CVarcharSize();

		/**
		 * The meta object literal for the '{@link eHealthManagement.impl.CStringImpl <em>CString</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.impl.CStringImpl
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getCString()
		 * @generated
		 */
		EClass CSTRING = eINSTANCE.getCString();

		/**
		 * The meta object literal for the '<em><b>CString Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSTRING__CSTRING_NAME = eINSTANCE.getCString_CStringName();

		/**
		 * The meta object literal for the '<em><b>CString Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSTRING__CSTRING_SIZE = eINSTANCE.getCString_CStringSize();

		/**
		 * The meta object literal for the '{@link eHealthManagement.impl.CImageImpl <em>CImage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.impl.CImageImpl
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getCImage()
		 * @generated
		 */
		EClass CIMAGE = eINSTANCE.getCImage();

		/**
		 * The meta object literal for the '<em><b>CImage Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIMAGE__CIMAGE_NAME = eINSTANCE.getCImage_CImageName();

		/**
		 * The meta object literal for the '<em><b>CImage Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIMAGE__CIMAGE_SIZE = eINSTANCE.getCImage_CImageSize();

		/**
		 * The meta object literal for the '{@link eHealthManagement.impl.TestImpl <em>Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.impl.TestImpl
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getTest()
		 * @generated
		 */
		EClass TEST = eINSTANCE.getTest();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__TEST = eINSTANCE.getTest_Test();

		/**
		 * The meta object literal for the '{@link eHealthManagement.AllowedUserType <em>Allowed User Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.AllowedUserType
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getAllowedUserType()
		 * @generated
		 */
		EEnum ALLOWED_USER_TYPE = eINSTANCE.getAllowedUserType();

		/**
		 * The meta object literal for the '{@link eHealthManagement.AllowedUserInterface <em>Allowed User Interface</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.AllowedUserInterface
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getAllowedUserInterface()
		 * @generated
		 */
		EEnum ALLOWED_USER_INTERFACE = eINSTANCE.getAllowedUserInterface();

		/**
		 * The meta object literal for the '{@link eHealthManagement.AllowedCommunicationInterfaceType <em>Allowed Communication Interface Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.AllowedCommunicationInterfaceType
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getAllowedCommunicationInterfaceType()
		 * @generated
		 */
		EEnum ALLOWED_COMMUNICATION_INTERFACE_TYPE = eINSTANCE.getAllowedCommunicationInterfaceType();

		/**
		 * The meta object literal for the '{@link eHealthManagement.AllowedRepresentationInterfaceType <em>Allowed Representation Interface Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.AllowedRepresentationInterfaceType
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getAllowedRepresentationInterfaceType()
		 * @generated
		 */
		EEnum ALLOWED_REPRESENTATION_INTERFACE_TYPE = eINSTANCE.getAllowedRepresentationInterfaceType();

		/**
		 * The meta object literal for the '{@link eHealthManagement.AllowedAttributeType <em>Allowed Attribute Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagement.AllowedAttributeType
		 * @see eHealthManagement.impl.EHealthManagementPackageImpl#getAllowedAttributeType()
		 * @generated
		 */
		EEnum ALLOWED_ATTRIBUTE_TYPE = eINSTANCE.getAllowedAttributeType();

	}

} //EHealthManagementPackage
