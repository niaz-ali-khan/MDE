/**
 */
package eHealthManagementV;

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
 * @see eHealthManagementV.EHealthManagementVFactory
 * @model kind="package"
 * @generated
 */
public interface EHealthManagementVPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eHealthManagementV";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/eHealthManagementV";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eHealthManagementV";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EHealthManagementVPackage eINSTANCE = eHealthManagementV.impl.EHealthManagementVPackageImpl.init();

	/**
	 * The meta object id for the '{@link eHealthManagementV.impl.UsersImpl <em>Users</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagementV.impl.UsersImpl
	 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getUsers()
	 * @generated
	 */
	int USERS = 0;

	/**
	 * The feature id for the '<em><b>User Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS__USER_TYPES = 0;

	/**
	 * The feature id for the '<em><b>User Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS__USER_VALIDITY = 1;

	/**
	 * The number of structural features of the '<em>Users</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Users</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eHealthManagementV.impl.UserInterfacesImpl <em>User Interfaces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagementV.impl.UserInterfacesImpl
	 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getUserInterfaces()
	 * @generated
	 */
	int USER_INTERFACES = 1;

	/**
	 * The feature id for the '<em><b>User Interfaces Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACES__USER_INTERFACES_TYPES = 0;

	/**
	 * The feature id for the '<em><b>User Interfaces Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACES__USER_INTERFACES_VALIDITY = 1;

	/**
	 * The feature id for the '<em><b>Users</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACES__USERS = 2;

	/**
	 * The number of structural features of the '<em>User Interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>User Interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eHealthManagementV.impl.RepresentationInterfacesImpl <em>Representation Interfaces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagementV.impl.RepresentationInterfacesImpl
	 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getRepresentationInterfaces()
	 * @generated
	 */
	int REPRESENTATION_INTERFACES = 2;

	/**
	 * The feature id for the '<em><b>User Interfaces Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_INTERFACES__USER_INTERFACES_TYPES = USER_INTERFACES__USER_INTERFACES_TYPES;

	/**
	 * The feature id for the '<em><b>User Interfaces Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_INTERFACES__USER_INTERFACES_VALIDITY = USER_INTERFACES__USER_INTERFACES_VALIDITY;

	/**
	 * The feature id for the '<em><b>Users</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_INTERFACES__USERS = USER_INTERFACES__USERS;

	/**
	 * The feature id for the '<em><b>Representation Interfaces Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_INTERFACES__REPRESENTATION_INTERFACES_TYPES = USER_INTERFACES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Representation Interfaces Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_INTERFACES__REPRESENTATION_INTERFACES_VALIDITY = USER_INTERFACES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Representation Interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_INTERFACES_FEATURE_COUNT = USER_INTERFACES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Representation Interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_INTERFACES_OPERATION_COUNT = USER_INTERFACES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eHealthManagementV.impl.CommunicationInterfacesImpl <em>Communication Interfaces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagementV.impl.CommunicationInterfacesImpl
	 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getCommunicationInterfaces()
	 * @generated
	 */
	int COMMUNICATION_INTERFACES = 3;

	/**
	 * The feature id for the '<em><b>User Interfaces Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_INTERFACES__USER_INTERFACES_TYPES = USER_INTERFACES__USER_INTERFACES_TYPES;

	/**
	 * The feature id for the '<em><b>User Interfaces Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_INTERFACES__USER_INTERFACES_VALIDITY = USER_INTERFACES__USER_INTERFACES_VALIDITY;

	/**
	 * The feature id for the '<em><b>Users</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_INTERFACES__USERS = USER_INTERFACES__USERS;

	/**
	 * The feature id for the '<em><b>Communication Interfaces Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_INTERFACES__COMMUNICATION_INTERFACES_TYPES = USER_INTERFACES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Communication Interfaces Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_INTERFACES__COMMUNICATION_INTERFACES_VALIDITY = USER_INTERFACES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Communication Interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_INTERFACES_FEATURE_COUNT = USER_INTERFACES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Communication Interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_INTERFACES_OPERATION_COUNT = USER_INTERFACES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eHealthManagementV.impl.ImageUIImpl <em>Image UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagementV.impl.ImageUIImpl
	 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getImageUI()
	 * @generated
	 */
	int IMAGE_UI = 4;

	/**
	 * The feature id for the '<em><b>User Interfaces Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UI__USER_INTERFACES_TYPES = REPRESENTATION_INTERFACES__USER_INTERFACES_TYPES;

	/**
	 * The feature id for the '<em><b>User Interfaces Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UI__USER_INTERFACES_VALIDITY = REPRESENTATION_INTERFACES__USER_INTERFACES_VALIDITY;

	/**
	 * The feature id for the '<em><b>Users</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UI__USERS = REPRESENTATION_INTERFACES__USERS;

	/**
	 * The feature id for the '<em><b>Representation Interfaces Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UI__REPRESENTATION_INTERFACES_TYPES = REPRESENTATION_INTERFACES__REPRESENTATION_INTERFACES_TYPES;

	/**
	 * The feature id for the '<em><b>Representation Interfaces Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UI__REPRESENTATION_INTERFACES_VALIDITY = REPRESENTATION_INTERFACES__REPRESENTATION_INTERFACES_VALIDITY;

	/**
	 * The feature id for the '<em><b>EImage UI Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UI__EIMAGE_UI_NAME = REPRESENTATION_INTERFACES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Image UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UI_FEATURE_COUNT = REPRESENTATION_INTERFACES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Image UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_UI_OPERATION_COUNT = REPRESENTATION_INTERFACES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eHealthManagementV.impl.TextUIImpl <em>Text UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagementV.impl.TextUIImpl
	 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getTextUI()
	 * @generated
	 */
	int TEXT_UI = 5;

	/**
	 * The feature id for the '<em><b>User Interfaces Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_UI__USER_INTERFACES_TYPES = REPRESENTATION_INTERFACES__USER_INTERFACES_TYPES;

	/**
	 * The feature id for the '<em><b>User Interfaces Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_UI__USER_INTERFACES_VALIDITY = REPRESENTATION_INTERFACES__USER_INTERFACES_VALIDITY;

	/**
	 * The feature id for the '<em><b>Users</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_UI__USERS = REPRESENTATION_INTERFACES__USERS;

	/**
	 * The feature id for the '<em><b>Representation Interfaces Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_UI__REPRESENTATION_INTERFACES_TYPES = REPRESENTATION_INTERFACES__REPRESENTATION_INTERFACES_TYPES;

	/**
	 * The feature id for the '<em><b>Representation Interfaces Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_UI__REPRESENTATION_INTERFACES_VALIDITY = REPRESENTATION_INTERFACES__REPRESENTATION_INTERFACES_VALIDITY;

	/**
	 * The feature id for the '<em><b>EText UI Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_UI__ETEXT_UI_NAME = REPRESENTATION_INTERFACES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_UI_FEATURE_COUNT = REPRESENTATION_INTERFACES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_UI_OPERATION_COUNT = REPRESENTATION_INTERFACES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eHealthManagementV.impl.VideoUIImpl <em>Video UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagementV.impl.VideoUIImpl
	 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getVideoUI()
	 * @generated
	 */
	int VIDEO_UI = 6;

	/**
	 * The feature id for the '<em><b>User Interfaces Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_UI__USER_INTERFACES_TYPES = REPRESENTATION_INTERFACES__USER_INTERFACES_TYPES;

	/**
	 * The feature id for the '<em><b>User Interfaces Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_UI__USER_INTERFACES_VALIDITY = REPRESENTATION_INTERFACES__USER_INTERFACES_VALIDITY;

	/**
	 * The feature id for the '<em><b>Users</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_UI__USERS = REPRESENTATION_INTERFACES__USERS;

	/**
	 * The feature id for the '<em><b>Representation Interfaces Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_UI__REPRESENTATION_INTERFACES_TYPES = REPRESENTATION_INTERFACES__REPRESENTATION_INTERFACES_TYPES;

	/**
	 * The feature id for the '<em><b>Representation Interfaces Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_UI__REPRESENTATION_INTERFACES_VALIDITY = REPRESENTATION_INTERFACES__REPRESENTATION_INTERFACES_VALIDITY;

	/**
	 * The feature id for the '<em><b>EVdeo UI Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_UI__EVDEO_UI_NAME = REPRESENTATION_INTERFACES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Video UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_UI_FEATURE_COUNT = REPRESENTATION_INTERFACES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Video UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_UI_OPERATION_COUNT = REPRESENTATION_INTERFACES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eHealthManagementV.impl.DocumentTypeImpl <em>Document Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagementV.impl.DocumentTypeImpl
	 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getDocumentType()
	 * @generated
	 */
	int DOCUMENT_TYPE = 7;

	/**
	 * The feature id for the '<em><b>User Interfaces Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__USER_INTERFACES_TYPES = COMMUNICATION_INTERFACES__USER_INTERFACES_TYPES;

	/**
	 * The feature id for the '<em><b>User Interfaces Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__USER_INTERFACES_VALIDITY = COMMUNICATION_INTERFACES__USER_INTERFACES_VALIDITY;

	/**
	 * The feature id for the '<em><b>Users</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__USERS = COMMUNICATION_INTERFACES__USERS;

	/**
	 * The feature id for the '<em><b>Communication Interfaces Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__COMMUNICATION_INTERFACES_TYPES = COMMUNICATION_INTERFACES__COMMUNICATION_INTERFACES_TYPES;

	/**
	 * The feature id for the '<em><b>Communication Interfaces Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__COMMUNICATION_INTERFACES_VALIDITY = COMMUNICATION_INTERFACES__COMMUNICATION_INTERFACES_VALIDITY;

	/**
	 * The feature id for the '<em><b>EDocument Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__EDOCUMENT_TYPE_NAME = COMMUNICATION_INTERFACES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Document Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE_FEATURE_COUNT = COMMUNICATION_INTERFACES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Document Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE_OPERATION_COUNT = COMMUNICATION_INTERFACES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eHealthManagementV.impl.DataSetTypeImpl <em>Data Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagementV.impl.DataSetTypeImpl
	 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getDataSetType()
	 * @generated
	 */
	int DATA_SET_TYPE = 8;

	/**
	 * The feature id for the '<em><b>User Interfaces Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TYPE__USER_INTERFACES_TYPES = COMMUNICATION_INTERFACES__USER_INTERFACES_TYPES;

	/**
	 * The feature id for the '<em><b>User Interfaces Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TYPE__USER_INTERFACES_VALIDITY = COMMUNICATION_INTERFACES__USER_INTERFACES_VALIDITY;

	/**
	 * The feature id for the '<em><b>Users</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TYPE__USERS = COMMUNICATION_INTERFACES__USERS;

	/**
	 * The feature id for the '<em><b>Communication Interfaces Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TYPE__COMMUNICATION_INTERFACES_TYPES = COMMUNICATION_INTERFACES__COMMUNICATION_INTERFACES_TYPES;

	/**
	 * The feature id for the '<em><b>Communication Interfaces Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TYPE__COMMUNICATION_INTERFACES_VALIDITY = COMMUNICATION_INTERFACES__COMMUNICATION_INTERFACES_VALIDITY;

	/**
	 * The feature id for the '<em><b>EData Set Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TYPE__EDATA_SET_TYPE_NAME = COMMUNICATION_INTERFACES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TYPE_FEATURE_COUNT = COMMUNICATION_INTERFACES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_TYPE_OPERATION_COUNT = COMMUNICATION_INTERFACES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eHealthManagementV.impl.MessageTypeImpl <em>Message Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagementV.impl.MessageTypeImpl
	 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getMessageType()
	 * @generated
	 */
	int MESSAGE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>User Interfaces Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__USER_INTERFACES_TYPES = COMMUNICATION_INTERFACES__USER_INTERFACES_TYPES;

	/**
	 * The feature id for the '<em><b>User Interfaces Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__USER_INTERFACES_VALIDITY = COMMUNICATION_INTERFACES__USER_INTERFACES_VALIDITY;

	/**
	 * The feature id for the '<em><b>Users</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__USERS = COMMUNICATION_INTERFACES__USERS;

	/**
	 * The feature id for the '<em><b>Communication Interfaces Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__COMMUNICATION_INTERFACES_TYPES = COMMUNICATION_INTERFACES__COMMUNICATION_INTERFACES_TYPES;

	/**
	 * The feature id for the '<em><b>Communication Interfaces Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__COMMUNICATION_INTERFACES_VALIDITY = COMMUNICATION_INTERFACES__COMMUNICATION_INTERFACES_VALIDITY;

	/**
	 * The feature id for the '<em><b>EMessage Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__EMESSAGE_TYPE_NAME = COMMUNICATION_INTERFACES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__SIZE = COMMUNICATION_INTERFACES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE_FEATURE_COUNT = COMMUNICATION_INTERFACES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Message Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE_OPERATION_COUNT = COMMUNICATION_INTERFACES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eHealthManagementV.impl.ImageMessageImpl <em>Image Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagementV.impl.ImageMessageImpl
	 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getImageMessage()
	 * @generated
	 */
	int IMAGE_MESSAGE = 10;

	/**
	 * The feature id for the '<em><b>User Interfaces Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MESSAGE__USER_INTERFACES_TYPES = MESSAGE_TYPE__USER_INTERFACES_TYPES;

	/**
	 * The feature id for the '<em><b>User Interfaces Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MESSAGE__USER_INTERFACES_VALIDITY = MESSAGE_TYPE__USER_INTERFACES_VALIDITY;

	/**
	 * The feature id for the '<em><b>Users</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MESSAGE__USERS = MESSAGE_TYPE__USERS;

	/**
	 * The feature id for the '<em><b>Communication Interfaces Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MESSAGE__COMMUNICATION_INTERFACES_TYPES = MESSAGE_TYPE__COMMUNICATION_INTERFACES_TYPES;

	/**
	 * The feature id for the '<em><b>Communication Interfaces Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MESSAGE__COMMUNICATION_INTERFACES_VALIDITY = MESSAGE_TYPE__COMMUNICATION_INTERFACES_VALIDITY;

	/**
	 * The feature id for the '<em><b>EMessage Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MESSAGE__EMESSAGE_TYPE_NAME = MESSAGE_TYPE__EMESSAGE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MESSAGE__SIZE = MESSAGE_TYPE__SIZE;

	/**
	 * The feature id for the '<em><b>EImage Message Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MESSAGE__EIMAGE_MESSAGE_NAME = MESSAGE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MESSAGE__IMAGE_SIZE = MESSAGE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Image Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MESSAGE_FEATURE_COUNT = MESSAGE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Image Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_MESSAGE_OPERATION_COUNT = MESSAGE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eHealthManagementV.impl.TextMessageImpl <em>Text Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagementV.impl.TextMessageImpl
	 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getTextMessage()
	 * @generated
	 */
	int TEXT_MESSAGE = 11;

	/**
	 * The feature id for the '<em><b>User Interfaces Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_MESSAGE__USER_INTERFACES_TYPES = MESSAGE_TYPE__USER_INTERFACES_TYPES;

	/**
	 * The feature id for the '<em><b>User Interfaces Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_MESSAGE__USER_INTERFACES_VALIDITY = MESSAGE_TYPE__USER_INTERFACES_VALIDITY;

	/**
	 * The feature id for the '<em><b>Users</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_MESSAGE__USERS = MESSAGE_TYPE__USERS;

	/**
	 * The feature id for the '<em><b>Communication Interfaces Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_MESSAGE__COMMUNICATION_INTERFACES_TYPES = MESSAGE_TYPE__COMMUNICATION_INTERFACES_TYPES;

	/**
	 * The feature id for the '<em><b>Communication Interfaces Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_MESSAGE__COMMUNICATION_INTERFACES_VALIDITY = MESSAGE_TYPE__COMMUNICATION_INTERFACES_VALIDITY;

	/**
	 * The feature id for the '<em><b>EMessage Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_MESSAGE__EMESSAGE_TYPE_NAME = MESSAGE_TYPE__EMESSAGE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_MESSAGE__SIZE = MESSAGE_TYPE__SIZE;

	/**
	 * The feature id for the '<em><b>EText Message Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_MESSAGE__ETEXT_MESSAGE_NAME = MESSAGE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_MESSAGE__TEXT_SIZE = MESSAGE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_MESSAGE_FEATURE_COUNT = MESSAGE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Text Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_MESSAGE_OPERATION_COUNT = MESSAGE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eHealthManagementV.impl.FileMessageImpl <em>File Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagementV.impl.FileMessageImpl
	 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getFileMessage()
	 * @generated
	 */
	int FILE_MESSAGE = 12;

	/**
	 * The feature id for the '<em><b>User Interfaces Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MESSAGE__USER_INTERFACES_TYPES = MESSAGE_TYPE__USER_INTERFACES_TYPES;

	/**
	 * The feature id for the '<em><b>User Interfaces Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MESSAGE__USER_INTERFACES_VALIDITY = MESSAGE_TYPE__USER_INTERFACES_VALIDITY;

	/**
	 * The feature id for the '<em><b>Users</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MESSAGE__USERS = MESSAGE_TYPE__USERS;

	/**
	 * The feature id for the '<em><b>Communication Interfaces Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MESSAGE__COMMUNICATION_INTERFACES_TYPES = MESSAGE_TYPE__COMMUNICATION_INTERFACES_TYPES;

	/**
	 * The feature id for the '<em><b>Communication Interfaces Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MESSAGE__COMMUNICATION_INTERFACES_VALIDITY = MESSAGE_TYPE__COMMUNICATION_INTERFACES_VALIDITY;

	/**
	 * The feature id for the '<em><b>EMessage Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MESSAGE__EMESSAGE_TYPE_NAME = MESSAGE_TYPE__EMESSAGE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MESSAGE__SIZE = MESSAGE_TYPE__SIZE;

	/**
	 * The feature id for the '<em><b>EFile Message Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MESSAGE__EFILE_MESSAGE_NAME = MESSAGE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MESSAGE__FILE_SIZE = MESSAGE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>File Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MESSAGE_FEATURE_COUNT = MESSAGE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>File Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_MESSAGE_OPERATION_COUNT = MESSAGE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eHealthManagementV.AllowedRepresentationInterfaceTypes <em>Allowed Representation Interface Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagementV.AllowedRepresentationInterfaceTypes
	 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getAllowedRepresentationInterfaceTypes()
	 * @generated
	 */
	int ALLOWED_REPRESENTATION_INTERFACE_TYPES = 13;

	/**
	 * The meta object id for the '{@link eHealthManagementV.AllowedUserTypes <em>Allowed User Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagementV.AllowedUserTypes
	 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getAllowedUserTypes()
	 * @generated
	 */
	int ALLOWED_USER_TYPES = 14;

	/**
	 * The meta object id for the '{@link eHealthManagementV.AllowedCommunicationInterfaceTypes <em>Allowed Communication Interface Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagementV.AllowedCommunicationInterfaceTypes
	 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getAllowedCommunicationInterfaceTypes()
	 * @generated
	 */
	int ALLOWED_COMMUNICATION_INTERFACE_TYPES = 15;

	/**
	 * The meta object id for the '{@link eHealthManagementV.AllowedUserInterfaces <em>Allowed User Interfaces</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagementV.AllowedUserInterfaces
	 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getAllowedUserInterfaces()
	 * @generated
	 */
	int ALLOWED_USER_INTERFACES = 16;

	/**
	 * The meta object id for the '{@link eHealthManagementV.AllowedAttributeTypes <em>Allowed Attribute Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eHealthManagementV.AllowedAttributeTypes
	 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getAllowedAttributeTypes()
	 * @generated
	 */
	int ALLOWED_ATTRIBUTE_TYPES = 17;

	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Users</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="Users"
	 * @generated
	 */
	EClass getUsers();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getUserTypes <em>User Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Types</em>'.
	 * @see java.lang.Object#getUserTypes()
	 * @see #getUsers()
	 * @generated
	 */
	EAttribute getUsers_UserTypes();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#isUserValidity <em>User Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Validity</em>'.
	 * @see java.lang.Object#isUserValidity()
	 * @see #getUsers()
	 * @generated
	 */
	EAttribute getUsers_UserValidity();

	/**
	 * Returns the meta object for class '{@link UserInterfaces <em>User Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Interfaces</em>'.
	 * @see UserInterfaces
	 * @model instanceClass="UserInterfaces"
	 * @generated
	 */
	EClass getUserInterfaces();

	/**
	 * Returns the meta object for the attribute '{@link UserInterfaces#getUserInterfacesTypes <em>User Interfaces Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Interfaces Types</em>'.
	 * @see UserInterfaces#getUserInterfacesTypes()
	 * @see #getUserInterfaces()
	 * @generated
	 */
	EAttribute getUserInterfaces_UserInterfacesTypes();

	/**
	 * Returns the meta object for the attribute '{@link UserInterfaces#isUserInterfacesValidity <em>User Interfaces Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Interfaces Validity</em>'.
	 * @see UserInterfaces#isUserInterfacesValidity()
	 * @see #getUserInterfaces()
	 * @generated
	 */
	EAttribute getUserInterfaces_UserInterfacesValidity();

	/**
	 * Returns the meta object for the reference '{@link UserInterfaces#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Users</em>'.
	 * @see UserInterfaces#getUsers()
	 * @see #getUserInterfaces()
	 * @generated
	 */
	EReference getUserInterfaces_Users();

	/**
	 * Returns the meta object for class '{@link RepresentationInterfaces <em>Representation Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Representation Interfaces</em>'.
	 * @see RepresentationInterfaces
	 * @model instanceClass="RepresentationInterfaces" superTypes="eHealthManagementV.UserInterfaces"
	 * @generated
	 */
	EClass getRepresentationInterfaces();

	/**
	 * Returns the meta object for the attribute '{@link RepresentationInterfaces#getRepresentationInterfacesTypes <em>Representation Interfaces Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Representation Interfaces Types</em>'.
	 * @see RepresentationInterfaces#getRepresentationInterfacesTypes()
	 * @see #getRepresentationInterfaces()
	 * @generated
	 */
	EAttribute getRepresentationInterfaces_RepresentationInterfacesTypes();

	/**
	 * Returns the meta object for the attribute '{@link RepresentationInterfaces#isRepresentationInterfacesValidity <em>Representation Interfaces Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Representation Interfaces Validity</em>'.
	 * @see RepresentationInterfaces#isRepresentationInterfacesValidity()
	 * @see #getRepresentationInterfaces()
	 * @generated
	 */
	EAttribute getRepresentationInterfaces_RepresentationInterfacesValidity();

	/**
	 * Returns the meta object for class '{@link CommunicationInterfaces <em>Communication Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Interfaces</em>'.
	 * @see CommunicationInterfaces
	 * @model instanceClass="CommunicationInterfaces" superTypes="eHealthManagementV.UserInterfaces"
	 * @generated
	 */
	EClass getCommunicationInterfaces();

	/**
	 * Returns the meta object for the attribute '{@link CommunicationInterfaces#getCommunicationInterfacesTypes <em>Communication Interfaces Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication Interfaces Types</em>'.
	 * @see CommunicationInterfaces#getCommunicationInterfacesTypes()
	 * @see #getCommunicationInterfaces()
	 * @generated
	 */
	EAttribute getCommunicationInterfaces_CommunicationInterfacesTypes();

	/**
	 * Returns the meta object for the attribute '{@link CommunicationInterfaces#isCommunicationInterfacesValidity <em>Communication Interfaces Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication Interfaces Validity</em>'.
	 * @see CommunicationInterfaces#isCommunicationInterfacesValidity()
	 * @see #getCommunicationInterfaces()
	 * @generated
	 */
	EAttribute getCommunicationInterfaces_CommunicationInterfacesValidity();

	/**
	 * Returns the meta object for class '{@link ImageUI <em>Image UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image UI</em>'.
	 * @see ImageUI
	 * @model instanceClass="ImageUI" superTypes="eHealthManagementV.RepresentationInterfaces"
	 * @generated
	 */
	EClass getImageUI();

	/**
	 * Returns the meta object for the attribute '{@link ImageUI#getEImageUIName <em>EImage UI Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EImage UI Name</em>'.
	 * @see ImageUI#getEImageUIName()
	 * @see #getImageUI()
	 * @generated
	 */
	EAttribute getImageUI_EImageUIName();

	/**
	 * Returns the meta object for class '{@link TextUI <em>Text UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text UI</em>'.
	 * @see TextUI
	 * @model instanceClass="TextUI" superTypes="eHealthManagementV.RepresentationInterfaces"
	 * @generated
	 */
	EClass getTextUI();

	/**
	 * Returns the meta object for the attribute '{@link TextUI#getETextUIName <em>EText UI Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EText UI Name</em>'.
	 * @see TextUI#getETextUIName()
	 * @see #getTextUI()
	 * @generated
	 */
	EAttribute getTextUI_ETextUIName();

	/**
	 * Returns the meta object for class '{@link VideoUI <em>Video UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video UI</em>'.
	 * @see VideoUI
	 * @model instanceClass="VideoUI" superTypes="eHealthManagementV.RepresentationInterfaces"
	 * @generated
	 */
	EClass getVideoUI();

	/**
	 * Returns the meta object for the attribute '{@link VideoUI#getEVdeoUIName <em>EVdeo UI Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EVdeo UI Name</em>'.
	 * @see VideoUI#getEVdeoUIName()
	 * @see #getVideoUI()
	 * @generated
	 */
	EAttribute getVideoUI_EVdeoUIName();

	/**
	 * Returns the meta object for class '{@link DocumentType <em>Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Type</em>'.
	 * @see DocumentType
	 * @model instanceClass="DocumentType" superTypes="eHealthManagementV.CommunicationInterfaces"
	 * @generated
	 */
	EClass getDocumentType();

	/**
	 * Returns the meta object for the attribute '{@link DocumentType#getEDocumentTypeName <em>EDocument Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EDocument Type Name</em>'.
	 * @see DocumentType#getEDocumentTypeName()
	 * @see #getDocumentType()
	 * @generated
	 */
	EAttribute getDocumentType_EDocumentTypeName();

	/**
	 * Returns the meta object for class '{@link DataSetType <em>Data Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Set Type</em>'.
	 * @see DataSetType
	 * @model instanceClass="DataSetType" superTypes="eHealthManagementV.CommunicationInterfaces"
	 * @generated
	 */
	EClass getDataSetType();

	/**
	 * Returns the meta object for the attribute '{@link DataSetType#getEDataSetTypeName <em>EData Set Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EData Set Type Name</em>'.
	 * @see DataSetType#getEDataSetTypeName()
	 * @see #getDataSetType()
	 * @generated
	 */
	EAttribute getDataSetType_EDataSetTypeName();

	/**
	 * Returns the meta object for class '{@link MessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Type</em>'.
	 * @see MessageType
	 * @model instanceClass="MessageType" superTypes="eHealthManagementV.CommunicationInterfaces"
	 * @generated
	 */
	EClass getMessageType();

	/**
	 * Returns the meta object for the attribute '{@link MessageType#getEMessageTypeName <em>EMessage Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EMessage Type Name</em>'.
	 * @see MessageType#getEMessageTypeName()
	 * @see #getMessageType()
	 * @generated
	 */
	EAttribute getMessageType_EMessageTypeName();

	/**
	 * Returns the meta object for the attribute '{@link MessageType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see MessageType#getSize()
	 * @see #getMessageType()
	 * @generated
	 */
	EAttribute getMessageType_Size();

	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Image Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Message</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="ImageMessage" superTypes="eHealthManagementV.MessageType"
	 * @generated
	 */
	EClass getImageMessage();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getEImageMessageName <em>EImage Message Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EImage Message Name</em>'.
	 * @see java.lang.Object#getEImageMessageName()
	 * @see #getImageMessage()
	 * @generated
	 */
	EAttribute getImageMessage_EImageMessageName();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getImageSize <em>Image Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Size</em>'.
	 * @see java.lang.Object#getImageSize()
	 * @see #getImageMessage()
	 * @generated
	 */
	EAttribute getImageMessage_ImageSize();

	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Text Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Message</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="TextMessage" superTypes="eHealthManagementV.MessageType"
	 * @generated
	 */
	EClass getTextMessage();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getETextMessageName <em>EText Message Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EText Message Name</em>'.
	 * @see java.lang.Object#getETextMessageName()
	 * @see #getTextMessage()
	 * @generated
	 */
	EAttribute getTextMessage_ETextMessageName();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getTextSize <em>Text Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Size</em>'.
	 * @see java.lang.Object#getTextSize()
	 * @see #getTextMessage()
	 * @generated
	 */
	EAttribute getTextMessage_TextSize();

	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>File Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Message</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="FileMessage" superTypes="eHealthManagementV.MessageType"
	 * @generated
	 */
	EClass getFileMessage();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getEFileMessageName <em>EFile Message Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EFile Message Name</em>'.
	 * @see java.lang.Object#getEFileMessageName()
	 * @see #getFileMessage()
	 * @generated
	 */
	EAttribute getFileMessage_EFileMessageName();

	/**
	 * Returns the meta object for the attribute '{@link java.lang.Object#getFileSize <em>File Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Size</em>'.
	 * @see java.lang.Object#getFileSize()
	 * @see #getFileMessage()
	 * @generated
	 */
	EAttribute getFileMessage_FileSize();

	/**
	 * Returns the meta object for enum '{@link eHealthManagementV.AllowedRepresentationInterfaceTypes <em>Allowed Representation Interface Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allowed Representation Interface Types</em>'.
	 * @see eHealthManagementV.AllowedRepresentationInterfaceTypes
	 * @generated
	 */
	EEnum getAllowedRepresentationInterfaceTypes();

	/**
	 * Returns the meta object for enum '{@link eHealthManagementV.AllowedUserTypes <em>Allowed User Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allowed User Types</em>'.
	 * @see eHealthManagementV.AllowedUserTypes
	 * @generated
	 */
	EEnum getAllowedUserTypes();

	/**
	 * Returns the meta object for enum '{@link eHealthManagementV.AllowedCommunicationInterfaceTypes <em>Allowed Communication Interface Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allowed Communication Interface Types</em>'.
	 * @see eHealthManagementV.AllowedCommunicationInterfaceTypes
	 * @generated
	 */
	EEnum getAllowedCommunicationInterfaceTypes();

	/**
	 * Returns the meta object for enum '{@link eHealthManagementV.AllowedUserInterfaces <em>Allowed User Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allowed User Interfaces</em>'.
	 * @see eHealthManagementV.AllowedUserInterfaces
	 * @generated
	 */
	EEnum getAllowedUserInterfaces();

	/**
	 * Returns the meta object for enum '{@link eHealthManagementV.AllowedAttributeTypes <em>Allowed Attribute Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allowed Attribute Types</em>'.
	 * @see eHealthManagementV.AllowedAttributeTypes
	 * @generated
	 */
	EEnum getAllowedAttributeTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EHealthManagementVFactory getEHealthManagementVFactory();

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
		 * The meta object literal for the '{@link eHealthManagementV.impl.UsersImpl <em>Users</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagementV.impl.UsersImpl
		 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getUsers()
		 * @generated
		 */
		EClass USERS = eINSTANCE.getUsers();

		/**
		 * The meta object literal for the '<em><b>User Types</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USERS__USER_TYPES = eINSTANCE.getUsers_UserTypes();

		/**
		 * The meta object literal for the '<em><b>User Validity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USERS__USER_VALIDITY = eINSTANCE.getUsers_UserValidity();

		/**
		 * The meta object literal for the '{@link eHealthManagementV.impl.UserInterfacesImpl <em>User Interfaces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagementV.impl.UserInterfacesImpl
		 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getUserInterfaces()
		 * @generated
		 */
		EClass USER_INTERFACES = eINSTANCE.getUserInterfaces();

		/**
		 * The meta object literal for the '<em><b>User Interfaces Types</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACES__USER_INTERFACES_TYPES = eINSTANCE.getUserInterfaces_UserInterfacesTypes();

		/**
		 * The meta object literal for the '<em><b>User Interfaces Validity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACES__USER_INTERFACES_VALIDITY = eINSTANCE.getUserInterfaces_UserInterfacesValidity();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_INTERFACES__USERS = eINSTANCE.getUserInterfaces_Users();

		/**
		 * The meta object literal for the '{@link eHealthManagementV.impl.RepresentationInterfacesImpl <em>Representation Interfaces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagementV.impl.RepresentationInterfacesImpl
		 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getRepresentationInterfaces()
		 * @generated
		 */
		EClass REPRESENTATION_INTERFACES = eINSTANCE.getRepresentationInterfaces();

		/**
		 * The meta object literal for the '<em><b>Representation Interfaces Types</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPRESENTATION_INTERFACES__REPRESENTATION_INTERFACES_TYPES = eINSTANCE
				.getRepresentationInterfaces_RepresentationInterfacesTypes();

		/**
		 * The meta object literal for the '<em><b>Representation Interfaces Validity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPRESENTATION_INTERFACES__REPRESENTATION_INTERFACES_VALIDITY = eINSTANCE
				.getRepresentationInterfaces_RepresentationInterfacesValidity();

		/**
		 * The meta object literal for the '{@link eHealthManagementV.impl.CommunicationInterfacesImpl <em>Communication Interfaces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagementV.impl.CommunicationInterfacesImpl
		 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getCommunicationInterfaces()
		 * @generated
		 */
		EClass COMMUNICATION_INTERFACES = eINSTANCE.getCommunicationInterfaces();

		/**
		 * The meta object literal for the '<em><b>Communication Interfaces Types</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_INTERFACES__COMMUNICATION_INTERFACES_TYPES = eINSTANCE
				.getCommunicationInterfaces_CommunicationInterfacesTypes();

		/**
		 * The meta object literal for the '<em><b>Communication Interfaces Validity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_INTERFACES__COMMUNICATION_INTERFACES_VALIDITY = eINSTANCE
				.getCommunicationInterfaces_CommunicationInterfacesValidity();

		/**
		 * The meta object literal for the '{@link eHealthManagementV.impl.ImageUIImpl <em>Image UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagementV.impl.ImageUIImpl
		 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getImageUI()
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
		 * The meta object literal for the '{@link eHealthManagementV.impl.TextUIImpl <em>Text UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagementV.impl.TextUIImpl
		 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getTextUI()
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
		 * The meta object literal for the '{@link eHealthManagementV.impl.VideoUIImpl <em>Video UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagementV.impl.VideoUIImpl
		 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getVideoUI()
		 * @generated
		 */
		EClass VIDEO_UI = eINSTANCE.getVideoUI();

		/**
		 * The meta object literal for the '<em><b>EVdeo UI Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO_UI__EVDEO_UI_NAME = eINSTANCE.getVideoUI_EVdeoUIName();

		/**
		 * The meta object literal for the '{@link eHealthManagementV.impl.DocumentTypeImpl <em>Document Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagementV.impl.DocumentTypeImpl
		 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getDocumentType()
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
		 * The meta object literal for the '{@link eHealthManagementV.impl.DataSetTypeImpl <em>Data Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagementV.impl.DataSetTypeImpl
		 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getDataSetType()
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
		 * The meta object literal for the '{@link eHealthManagementV.impl.MessageTypeImpl <em>Message Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagementV.impl.MessageTypeImpl
		 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getMessageType()
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
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_TYPE__SIZE = eINSTANCE.getMessageType_Size();

		/**
		 * The meta object literal for the '{@link eHealthManagementV.impl.ImageMessageImpl <em>Image Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagementV.impl.ImageMessageImpl
		 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getImageMessage()
		 * @generated
		 */
		EClass IMAGE_MESSAGE = eINSTANCE.getImageMessage();

		/**
		 * The meta object literal for the '<em><b>EImage Message Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_MESSAGE__EIMAGE_MESSAGE_NAME = eINSTANCE.getImageMessage_EImageMessageName();

		/**
		 * The meta object literal for the '<em><b>Image Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_MESSAGE__IMAGE_SIZE = eINSTANCE.getImageMessage_ImageSize();

		/**
		 * The meta object literal for the '{@link eHealthManagementV.impl.TextMessageImpl <em>Text Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagementV.impl.TextMessageImpl
		 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getTextMessage()
		 * @generated
		 */
		EClass TEXT_MESSAGE = eINSTANCE.getTextMessage();

		/**
		 * The meta object literal for the '<em><b>EText Message Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_MESSAGE__ETEXT_MESSAGE_NAME = eINSTANCE.getTextMessage_ETextMessageName();

		/**
		 * The meta object literal for the '<em><b>Text Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_MESSAGE__TEXT_SIZE = eINSTANCE.getTextMessage_TextSize();

		/**
		 * The meta object literal for the '{@link eHealthManagementV.impl.FileMessageImpl <em>File Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagementV.impl.FileMessageImpl
		 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getFileMessage()
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
		 * The meta object literal for the '<em><b>File Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_MESSAGE__FILE_SIZE = eINSTANCE.getFileMessage_FileSize();

		/**
		 * The meta object literal for the '{@link eHealthManagementV.AllowedRepresentationInterfaceTypes <em>Allowed Representation Interface Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagementV.AllowedRepresentationInterfaceTypes
		 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getAllowedRepresentationInterfaceTypes()
		 * @generated
		 */
		EEnum ALLOWED_REPRESENTATION_INTERFACE_TYPES = eINSTANCE.getAllowedRepresentationInterfaceTypes();

		/**
		 * The meta object literal for the '{@link eHealthManagementV.AllowedUserTypes <em>Allowed User Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagementV.AllowedUserTypes
		 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getAllowedUserTypes()
		 * @generated
		 */
		EEnum ALLOWED_USER_TYPES = eINSTANCE.getAllowedUserTypes();

		/**
		 * The meta object literal for the '{@link eHealthManagementV.AllowedCommunicationInterfaceTypes <em>Allowed Communication Interface Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagementV.AllowedCommunicationInterfaceTypes
		 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getAllowedCommunicationInterfaceTypes()
		 * @generated
		 */
		EEnum ALLOWED_COMMUNICATION_INTERFACE_TYPES = eINSTANCE.getAllowedCommunicationInterfaceTypes();

		/**
		 * The meta object literal for the '{@link eHealthManagementV.AllowedUserInterfaces <em>Allowed User Interfaces</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagementV.AllowedUserInterfaces
		 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getAllowedUserInterfaces()
		 * @generated
		 */
		EEnum ALLOWED_USER_INTERFACES = eINSTANCE.getAllowedUserInterfaces();

		/**
		 * The meta object literal for the '{@link eHealthManagementV.AllowedAttributeTypes <em>Allowed Attribute Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eHealthManagementV.AllowedAttributeTypes
		 * @see eHealthManagementV.impl.EHealthManagementVPackageImpl#getAllowedAttributeTypes()
		 * @generated
		 */
		EEnum ALLOWED_ATTRIBUTE_TYPES = eINSTANCE.getAllowedAttributeTypes();

	}

} //EHealthManagementVPackage
