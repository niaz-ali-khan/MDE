/**
 */
package eHealthManagement.impl;

import eHealthManagement.AllowedAttributeType;
import eHealthManagement.AllowedCommunicationInterfaceType;
import eHealthManagement.AllowedRepresentationInterfaceType;
import eHealthManagement.AllowedUserInterface;
import eHealthManagement.AllowedUserType;
import eHealthManagement.Attribute;
import eHealthManagement.CImage;
import eHealthManagement.CString;
import eHealthManagement.CVarchar;
import eHealthManagement.CommunicationInterface;
import eHealthManagement.DataType;
import eHealthManagement.DatasetType;
import eHealthManagement.DocumentType;
import eHealthManagement.EHealthManagementFactory;
import eHealthManagement.EHealthManagementPackage;
import eHealthManagement.Entity;
import eHealthManagement.EventMessageType;
import eHealthManagement.FileMessage;
import eHealthManagement.ImageMessage;
import eHealthManagement.ImageUI;
import eHealthManagement.MessageExchangeStandard;
import eHealthManagement.MessageType;
import eHealthManagement.RepresentationInterface;
import eHealthManagement.Test;
import eHealthManagement.TextMessage;
import eHealthManagement.TextUI;
import eHealthManagement.User;
import eHealthManagement.UserInterface;
import eHealthManagement.VideoUI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EHealthManagementPackageImpl extends EPackageImpl implements EHealthManagementPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass representationInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageUIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textUIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoUIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datasetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageExchangeStandardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventMessageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cVarcharEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allowedUserTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allowedUserInterfaceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allowedCommunicationInterfaceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allowedRepresentationInterfaceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allowedAttributeTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see eHealthManagement.EHealthManagementPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EHealthManagementPackageImpl() {
		super(eNS_URI, EHealthManagementFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link EHealthManagementPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EHealthManagementPackage init() {
		if (isInited) return (EHealthManagementPackage)EPackage.Registry.INSTANCE.getEPackage(EHealthManagementPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEHealthManagementPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EHealthManagementPackageImpl theEHealthManagementPackage = registeredEHealthManagementPackage instanceof EHealthManagementPackageImpl ? (EHealthManagementPackageImpl)registeredEHealthManagementPackage : new EHealthManagementPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theEHealthManagementPackage.createPackageContents();

		// Initialize created meta-data
		theEHealthManagementPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEHealthManagementPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EHealthManagementPackage.eNS_URI, theEHealthManagementPackage);
		return theEHealthManagementPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserInterface() {
		return userInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserInterface_UserInterfaceType() {
		return (EAttribute)userInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserInterface_UserInterfaceValidity() {
		return (EAttribute)userInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserInterface_User() {
		return (EReference)userInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserInterface_Representationinterface() {
		return (EReference)userInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserInterface_Communicationinterface() {
		return (EReference)userInterfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserInterface_Messageexchangestandard() {
		return (EReference)userInterfaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserInterface_Datatype() {
		return (EReference)userInterfaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_UserType() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_UserValidity() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepresentationInterface() {
		return representationInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepresentationInterface_RepresentationInterfaceType() {
		return (EAttribute)representationInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepresentationInterface_RepresentationInterfaceValidity() {
		return (EAttribute)representationInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationInterface_Imageui() {
		return (EReference)representationInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationInterface_Textui() {
		return (EReference)representationInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepresentationInterface_Videoui() {
		return (EReference)representationInterfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationInterface() {
		return communicationInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationInterface_CommunicationInterfaceType() {
		return (EAttribute)communicationInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationInterface_CommunicationInterfaceValidity() {
		return (EAttribute)communicationInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationInterface_Messagetype() {
		return (EReference)communicationInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationInterface_Documenttype() {
		return (EReference)communicationInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationInterface_Datasettype() {
		return (EReference)communicationInterfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageUI() {
		return imageUIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageUI_ImageUIName() {
		return (EAttribute)imageUIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageUI_ImageUIType() {
		return (EAttribute)imageUIEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageUI_ImageUISize() {
		return (EAttribute)imageUIEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextUI() {
		return textUIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextUI_TextUIName() {
		return (EAttribute)textUIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextUI_TextUIType() {
		return (EAttribute)textUIEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextUI_TextUISize() {
		return (EAttribute)textUIEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoUI() {
		return videoUIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideoUI_VideoUIName() {
		return (EAttribute)videoUIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideoUI_VideoUIType() {
		return (EAttribute)videoUIEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideoUI_VideoUISize() {
		return (EAttribute)videoUIEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatasetType() {
		return datasetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatasetType_DatasetTypeName() {
		return (EAttribute)datasetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatasetType_DatasetTypeSize() {
		return (EAttribute)datasetTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatasetType_DatasetTypePropagationStatus() {
		return (EAttribute)datasetTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentType() {
		return documentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentType_DocumentTypeName() {
		return (EAttribute)documentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentType_DocumentTypeSize() {
		return (EAttribute)documentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageType() {
		return messageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageType_MessageTypeName() {
		return (EAttribute)messageTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageType_MessageTypeSize() {
		return (EAttribute)messageTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageType_Imagemessge() {
		return (EReference)messageTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageType_Filemessage() {
		return (EReference)messageTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageType_Textmessage() {
		return (EReference)messageTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextMessage() {
		return textMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextMessage_TextMessageName() {
		return (EAttribute)textMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextMessage_TextMessageSize() {
		return (EAttribute)textMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextMessage_Attribute() {
		return (EReference)textMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileMessage() {
		return fileMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileMessage_FileMessageName() {
		return (EAttribute)fileMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileMessage_FileMessageSize() {
		return (EAttribute)fileMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileMessage_Attribute() {
		return (EReference)fileMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageMessage() {
		return imageMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageMessage_ImageMessageName() {
		return (EAttribute)imageMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageMessage_ImageMessageSize() {
		return (EAttribute)imageMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageMessage_Attribute() {
		return (EReference)imageMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_DataTypeName() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_DataTypeSize() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_Entity() {
		return (EReference)dataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_EntityName() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_EntitySize() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Attribute() {
		return (EReference)entityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_AllowedAttributeType() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_AttributeSize() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Eventmessagetype() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Cimage() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Cstring() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Cvarchar() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageExchangeStandard() {
		return messageExchangeStandardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageExchangeStandard_MessageExchangeStandardName() {
		return (EAttribute)messageExchangeStandardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventMessageType() {
		return eventMessageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventMessageType_EventMessageTypeName() {
		return (EAttribute)eventMessageTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventMessageType_Messageexchangestandard() {
		return (EReference)eventMessageTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCVarchar() {
		return cVarcharEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCVarchar_CVarcharName() {
		return (EAttribute)cVarcharEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCVarchar_CVarcharSize() {
		return (EAttribute)cVarcharEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCString() {
		return cStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCString_CStringName() {
		return (EAttribute)cStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCString_CStringSize() {
		return (EAttribute)cStringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCImage() {
		return cImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCImage_CImageName() {
		return (EAttribute)cImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCImage_CImageSize() {
		return (EAttribute)cImageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTest() {
		return testEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTest_Test() {
		return (EAttribute)testEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllowedUserType() {
		return allowedUserTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllowedUserInterface() {
		return allowedUserInterfaceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllowedCommunicationInterfaceType() {
		return allowedCommunicationInterfaceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllowedRepresentationInterfaceType() {
		return allowedRepresentationInterfaceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllowedAttributeType() {
		return allowedAttributeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EHealthManagementFactory getEHealthManagementFactory() {
		return (EHealthManagementFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		userInterfaceEClass = createEClass(USER_INTERFACE);
		createEAttribute(userInterfaceEClass, USER_INTERFACE__USER_INTERFACE_TYPE);
		createEAttribute(userInterfaceEClass, USER_INTERFACE__USER_INTERFACE_VALIDITY);
		createEReference(userInterfaceEClass, USER_INTERFACE__USER);
		createEReference(userInterfaceEClass, USER_INTERFACE__REPRESENTATIONINTERFACE);
		createEReference(userInterfaceEClass, USER_INTERFACE__COMMUNICATIONINTERFACE);
		createEReference(userInterfaceEClass, USER_INTERFACE__MESSAGEEXCHANGESTANDARD);
		createEReference(userInterfaceEClass, USER_INTERFACE__DATATYPE);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__USER_TYPE);
		createEAttribute(userEClass, USER__USER_VALIDITY);

		representationInterfaceEClass = createEClass(REPRESENTATION_INTERFACE);
		createEAttribute(representationInterfaceEClass, REPRESENTATION_INTERFACE__REPRESENTATION_INTERFACE_TYPE);
		createEAttribute(representationInterfaceEClass, REPRESENTATION_INTERFACE__REPRESENTATION_INTERFACE_VALIDITY);
		createEReference(representationInterfaceEClass, REPRESENTATION_INTERFACE__IMAGEUI);
		createEReference(representationInterfaceEClass, REPRESENTATION_INTERFACE__TEXTUI);
		createEReference(representationInterfaceEClass, REPRESENTATION_INTERFACE__VIDEOUI);

		communicationInterfaceEClass = createEClass(COMMUNICATION_INTERFACE);
		createEAttribute(communicationInterfaceEClass, COMMUNICATION_INTERFACE__COMMUNICATION_INTERFACE_TYPE);
		createEAttribute(communicationInterfaceEClass, COMMUNICATION_INTERFACE__COMMUNICATION_INTERFACE_VALIDITY);
		createEReference(communicationInterfaceEClass, COMMUNICATION_INTERFACE__MESSAGETYPE);
		createEReference(communicationInterfaceEClass, COMMUNICATION_INTERFACE__DOCUMENTTYPE);
		createEReference(communicationInterfaceEClass, COMMUNICATION_INTERFACE__DATASETTYPE);

		imageUIEClass = createEClass(IMAGE_UI);
		createEAttribute(imageUIEClass, IMAGE_UI__IMAGE_UI_NAME);
		createEAttribute(imageUIEClass, IMAGE_UI__IMAGE_UI_TYPE);
		createEAttribute(imageUIEClass, IMAGE_UI__IMAGE_UI_SIZE);

		textUIEClass = createEClass(TEXT_UI);
		createEAttribute(textUIEClass, TEXT_UI__TEXT_UI_NAME);
		createEAttribute(textUIEClass, TEXT_UI__TEXT_UI_TYPE);
		createEAttribute(textUIEClass, TEXT_UI__TEXT_UI_SIZE);

		videoUIEClass = createEClass(VIDEO_UI);
		createEAttribute(videoUIEClass, VIDEO_UI__VIDEO_UI_NAME);
		createEAttribute(videoUIEClass, VIDEO_UI__VIDEO_UI_TYPE);
		createEAttribute(videoUIEClass, VIDEO_UI__VIDEO_UI_SIZE);

		datasetTypeEClass = createEClass(DATASET_TYPE);
		createEAttribute(datasetTypeEClass, DATASET_TYPE__DATASET_TYPE_NAME);
		createEAttribute(datasetTypeEClass, DATASET_TYPE__DATASET_TYPE_SIZE);
		createEAttribute(datasetTypeEClass, DATASET_TYPE__DATASET_TYPE_PROPAGATION_STATUS);

		documentTypeEClass = createEClass(DOCUMENT_TYPE);
		createEAttribute(documentTypeEClass, DOCUMENT_TYPE__DOCUMENT_TYPE_NAME);
		createEAttribute(documentTypeEClass, DOCUMENT_TYPE__DOCUMENT_TYPE_SIZE);

		messageTypeEClass = createEClass(MESSAGE_TYPE);
		createEAttribute(messageTypeEClass, MESSAGE_TYPE__MESSAGE_TYPE_NAME);
		createEAttribute(messageTypeEClass, MESSAGE_TYPE__MESSAGE_TYPE_SIZE);
		createEReference(messageTypeEClass, MESSAGE_TYPE__IMAGEMESSGE);
		createEReference(messageTypeEClass, MESSAGE_TYPE__FILEMESSAGE);
		createEReference(messageTypeEClass, MESSAGE_TYPE__TEXTMESSAGE);

		textMessageEClass = createEClass(TEXT_MESSAGE);
		createEAttribute(textMessageEClass, TEXT_MESSAGE__TEXT_MESSAGE_NAME);
		createEAttribute(textMessageEClass, TEXT_MESSAGE__TEXT_MESSAGE_SIZE);
		createEReference(textMessageEClass, TEXT_MESSAGE__ATTRIBUTE);

		fileMessageEClass = createEClass(FILE_MESSAGE);
		createEAttribute(fileMessageEClass, FILE_MESSAGE__FILE_MESSAGE_NAME);
		createEAttribute(fileMessageEClass, FILE_MESSAGE__FILE_MESSAGE_SIZE);
		createEReference(fileMessageEClass, FILE_MESSAGE__ATTRIBUTE);

		imageMessageEClass = createEClass(IMAGE_MESSAGE);
		createEAttribute(imageMessageEClass, IMAGE_MESSAGE__IMAGE_MESSAGE_NAME);
		createEAttribute(imageMessageEClass, IMAGE_MESSAGE__IMAGE_MESSAGE_SIZE);
		createEReference(imageMessageEClass, IMAGE_MESSAGE__ATTRIBUTE);

		dataTypeEClass = createEClass(DATA_TYPE);
		createEAttribute(dataTypeEClass, DATA_TYPE__DATA_TYPE_NAME);
		createEAttribute(dataTypeEClass, DATA_TYPE__DATA_TYPE_SIZE);
		createEReference(dataTypeEClass, DATA_TYPE__ENTITY);

		entityEClass = createEClass(ENTITY);
		createEAttribute(entityEClass, ENTITY__ENTITY_NAME);
		createEAttribute(entityEClass, ENTITY__ENTITY_SIZE);
		createEReference(entityEClass, ENTITY__ATTRIBUTE);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__ALLOWED_ATTRIBUTE_TYPE);
		createEAttribute(attributeEClass, ATTRIBUTE__ATTRIBUTE_SIZE);
		createEReference(attributeEClass, ATTRIBUTE__EVENTMESSAGETYPE);
		createEReference(attributeEClass, ATTRIBUTE__CIMAGE);
		createEReference(attributeEClass, ATTRIBUTE__CSTRING);
		createEReference(attributeEClass, ATTRIBUTE__CVARCHAR);

		messageExchangeStandardEClass = createEClass(MESSAGE_EXCHANGE_STANDARD);
		createEAttribute(messageExchangeStandardEClass, MESSAGE_EXCHANGE_STANDARD__MESSAGE_EXCHANGE_STANDARD_NAME);

		eventMessageTypeEClass = createEClass(EVENT_MESSAGE_TYPE);
		createEAttribute(eventMessageTypeEClass, EVENT_MESSAGE_TYPE__EVENT_MESSAGE_TYPE_NAME);
		createEReference(eventMessageTypeEClass, EVENT_MESSAGE_TYPE__MESSAGEEXCHANGESTANDARD);

		cVarcharEClass = createEClass(CVARCHAR);
		createEAttribute(cVarcharEClass, CVARCHAR__CVARCHAR_NAME);
		createEAttribute(cVarcharEClass, CVARCHAR__CVARCHAR_SIZE);

		cStringEClass = createEClass(CSTRING);
		createEAttribute(cStringEClass, CSTRING__CSTRING_NAME);
		createEAttribute(cStringEClass, CSTRING__CSTRING_SIZE);

		cImageEClass = createEClass(CIMAGE);
		createEAttribute(cImageEClass, CIMAGE__CIMAGE_NAME);
		createEAttribute(cImageEClass, CIMAGE__CIMAGE_SIZE);

		testEClass = createEClass(TEST);
		createEAttribute(testEClass, TEST__TEST);

		// Create enums
		allowedUserTypeEEnum = createEEnum(ALLOWED_USER_TYPE);
		allowedUserInterfaceEEnum = createEEnum(ALLOWED_USER_INTERFACE);
		allowedCommunicationInterfaceTypeEEnum = createEEnum(ALLOWED_COMMUNICATION_INTERFACE_TYPE);
		allowedRepresentationInterfaceTypeEEnum = createEEnum(ALLOWED_REPRESENTATION_INTERFACE_TYPE);
		allowedAttributeTypeEEnum = createEEnum(ALLOWED_ATTRIBUTE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		testEClass.getESuperTypes().add(this.getImageUI());

		// Initialize classes, features, and operations; add parameters
		initEClass(userInterfaceEClass, UserInterface.class, "UserInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserInterface_UserInterfaceType(), this.getAllowedUserInterface(), "UserInterfaceType", null, 0, 1, UserInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserInterface_UserInterfaceValidity(), ecorePackage.getEBoolean(), "UserInterfaceValidity", null, 0, 1, UserInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserInterface_User(), this.getUser(), null, "user", null, 0, 1, UserInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserInterface_Representationinterface(), this.getRepresentationInterface(), null, "representationinterface", null, 1, -1, UserInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserInterface_Communicationinterface(), this.getCommunicationInterface(), null, "communicationinterface", null, 1, -1, UserInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserInterface_Messageexchangestandard(), this.getMessageExchangeStandard(), null, "messageexchangestandard", null, 0, -1, UserInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserInterface_Datatype(), this.getDataType(), null, "datatype", null, 0, -1, UserInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_UserType(), this.getAllowedUserType(), "UserType", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_UserValidity(), ecorePackage.getEBoolean(), "UserValidity", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(representationInterfaceEClass, RepresentationInterface.class, "RepresentationInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepresentationInterface_RepresentationInterfaceType(), this.getAllowedRepresentationInterfaceType(), "RepresentationInterfaceType", null, 0, 1, RepresentationInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepresentationInterface_RepresentationInterfaceValidity(), ecorePackage.getEBooleanObject(), "RepresentationInterfaceValidity", null, 0, 1, RepresentationInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepresentationInterface_Imageui(), this.getImageUI(), null, "imageui", null, 0, -1, RepresentationInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepresentationInterface_Textui(), this.getTextUI(), null, "textui", null, 0, -1, RepresentationInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepresentationInterface_Videoui(), this.getVideoUI(), null, "videoui", null, 0, -1, RepresentationInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationInterfaceEClass, CommunicationInterface.class, "CommunicationInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunicationInterface_CommunicationInterfaceType(), this.getAllowedCommunicationInterfaceType(), "CommunicationInterfaceType", null, 0, 1, CommunicationInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationInterface_CommunicationInterfaceValidity(), ecorePackage.getEBoolean(), "CommunicationInterfaceValidity", null, 0, 1, CommunicationInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationInterface_Messagetype(), this.getMessageType(), null, "messagetype", null, 0, -1, CommunicationInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationInterface_Documenttype(), this.getDocumentType(), null, "documenttype", null, 0, -1, CommunicationInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationInterface_Datasettype(), this.getDatasetType(), null, "datasettype", null, 0, -1, CommunicationInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageUIEClass, ImageUI.class, "ImageUI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageUI_ImageUIName(), ecorePackage.getEString(), "ImageUIName", null, 0, 1, ImageUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageUI_ImageUIType(), ecorePackage.getEString(), "ImageUIType", null, 0, 1, ImageUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageUI_ImageUISize(), ecorePackage.getELong(), "ImageUISize", null, 0, 1, ImageUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textUIEClass, TextUI.class, "TextUI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextUI_TextUIName(), ecorePackage.getEString(), "TextUIName", null, 0, 1, TextUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextUI_TextUIType(), ecorePackage.getEString(), "TextUIType", null, 0, 1, TextUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextUI_TextUISize(), ecorePackage.getELong(), "TextUISize", null, 0, 1, TextUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(videoUIEClass, VideoUI.class, "VideoUI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVideoUI_VideoUIName(), ecorePackage.getEString(), "VideoUIName", null, 0, 1, VideoUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVideoUI_VideoUIType(), ecorePackage.getEString(), "VideoUIType", null, 0, 1, VideoUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVideoUI_VideoUISize(), ecorePackage.getELong(), "VideoUISize", null, 0, 1, VideoUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datasetTypeEClass, DatasetType.class, "DatasetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatasetType_DatasetTypeName(), ecorePackage.getEString(), "DatasetTypeName", null, 0, 1, DatasetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatasetType_DatasetTypeSize(), ecorePackage.getELong(), "DatasetTypeSize", null, 0, 1, DatasetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatasetType_DatasetTypePropagationStatus(), ecorePackage.getEBoolean(), "DatasetTypePropagationStatus", null, 0, 1, DatasetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentTypeEClass, DocumentType.class, "DocumentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentType_DocumentTypeName(), ecorePackage.getEString(), "DocumentTypeName", null, 0, 1, DocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentType_DocumentTypeSize(), ecorePackage.getELong(), "DocumentTypeSize", null, 0, 1, DocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageTypeEClass, MessageType.class, "MessageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageType_MessageTypeName(), ecorePackage.getEString(), "MessageTypeName", null, 0, 1, MessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageType_MessageTypeSize(), ecorePackage.getELong(), "MessageTypeSize", null, 0, 1, MessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageType_Imagemessge(), this.getImageMessage(), null, "imagemessge", null, 0, -1, MessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageType_Filemessage(), this.getFileMessage(), null, "filemessage", null, 0, -1, MessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageType_Textmessage(), this.getTextMessage(), null, "textmessage", null, 0, -1, MessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textMessageEClass, TextMessage.class, "TextMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextMessage_TextMessageName(), ecorePackage.getEString(), "TextMessageName", null, 0, 1, TextMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextMessage_TextMessageSize(), ecorePackage.getELong(), "TextMessageSize", null, 0, 1, TextMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextMessage_Attribute(), this.getAttribute(), null, "attribute", null, 0, 1, TextMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileMessageEClass, FileMessage.class, "FileMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileMessage_FileMessageName(), ecorePackage.getEString(), "FileMessageName", null, 0, 1, FileMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileMessage_FileMessageSize(), ecorePackage.getELong(), "FileMessageSize", null, 0, 1, FileMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFileMessage_Attribute(), this.getAttribute(), null, "attribute", null, 0, 1, FileMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageMessageEClass, ImageMessage.class, "ImageMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageMessage_ImageMessageName(), ecorePackage.getEString(), "ImageMessageName", null, 0, 1, ImageMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageMessage_ImageMessageSize(), ecorePackage.getELong(), "ImageMessageSize", null, 0, 1, ImageMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImageMessage_Attribute(), this.getAttribute(), null, "attribute", null, 0, 1, ImageMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataType_DataTypeName(), ecorePackage.getEString(), "DataTypeName", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_DataTypeSize(), ecorePackage.getELong(), "DataTypeSize", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataType_Entity(), this.getEntity(), null, "entity", null, 0, -1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntity_EntityName(), ecorePackage.getEString(), "EntityName", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_EntitySize(), ecorePackage.getELong(), "EntitySize", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Attribute(), this.getAttribute(), null, "attribute", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_AllowedAttributeType(), this.getAllowedAttributeType(), "AllowedAttributeType", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_AttributeSize(), ecorePackage.getELong(), "AttributeSize", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Eventmessagetype(), this.getEventMessageType(), null, "eventmessagetype", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Cimage(), this.getCImage(), null, "cimage", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Cstring(), this.getCString(), null, "cstring", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Cvarchar(), this.getCVarchar(), null, "cvarchar", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageExchangeStandardEClass, MessageExchangeStandard.class, "MessageExchangeStandard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageExchangeStandard_MessageExchangeStandardName(), ecorePackage.getEString(), "MessageExchangeStandardName", null, 0, 1, MessageExchangeStandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventMessageTypeEClass, EventMessageType.class, "EventMessageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventMessageType_EventMessageTypeName(), ecorePackage.getEString(), "EventMessageTypeName", null, 0, 1, EventMessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventMessageType_Messageexchangestandard(), this.getMessageExchangeStandard(), null, "messageexchangestandard", null, 0, 1, EventMessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cVarcharEClass, CVarchar.class, "CVarchar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCVarchar_CVarcharName(), ecorePackage.getEString(), "CVarcharName", null, 0, 1, CVarchar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCVarchar_CVarcharSize(), ecorePackage.getELong(), "CVarcharSize", null, 0, 1, CVarchar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cStringEClass, CString.class, "CString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCString_CStringName(), ecorePackage.getEString(), "CStringName", null, 0, 1, CString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCString_CStringSize(), ecorePackage.getELong(), "CStringSize", null, 0, 1, CString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cImageEClass, CImage.class, "CImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCImage_CImageName(), ecorePackage.getEString(), "CImageName", null, 0, 1, CImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCImage_CImageSize(), ecorePackage.getELong(), "CImageSize", null, 0, 1, CImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testEClass, Test.class, "Test", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTest_Test(), ecorePackage.getEString(), "test", null, 0, 1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(allowedUserTypeEEnum, AllowedUserType.class, "AllowedUserType");
		addEEnumLiteral(allowedUserTypeEEnum, AllowedUserType.DOCTOR);
		addEEnumLiteral(allowedUserTypeEEnum, AllowedUserType.PATIENT);
		addEEnumLiteral(allowedUserTypeEEnum, AllowedUserType.SYSTEM_ADMIN);

		initEEnum(allowedUserInterfaceEEnum, AllowedUserInterface.class, "AllowedUserInterface");
		addEEnumLiteral(allowedUserInterfaceEEnum, AllowedUserInterface.PROFILE_VIEW);
		addEEnumLiteral(allowedUserInterfaceEEnum, AllowedUserInterface.INFORMATION_VIEW);

		initEEnum(allowedCommunicationInterfaceTypeEEnum, AllowedCommunicationInterfaceType.class, "AllowedCommunicationInterfaceType");
		addEEnumLiteral(allowedCommunicationInterfaceTypeEEnum, AllowedCommunicationInterfaceType.COMMUNICATION_VIEW);
		addEEnumLiteral(allowedCommunicationInterfaceTypeEEnum, AllowedCommunicationInterfaceType.NOTIFICATION_VIEW);
		addEEnumLiteral(allowedCommunicationInterfaceTypeEEnum, AllowedCommunicationInterfaceType.FEEDBACK_VIEW);

		initEEnum(allowedRepresentationInterfaceTypeEEnum, AllowedRepresentationInterfaceType.class, "AllowedRepresentationInterfaceType");
		addEEnumLiteral(allowedRepresentationInterfaceTypeEEnum, AllowedRepresentationInterfaceType.DOCTOR_PROFILE);
		addEEnumLiteral(allowedRepresentationInterfaceTypeEEnum, AllowedRepresentationInterfaceType.PATIENT_PROFILE);
		addEEnumLiteral(allowedRepresentationInterfaceTypeEEnum, AllowedRepresentationInterfaceType.MEDICINE_LIST);
		addEEnumLiteral(allowedRepresentationInterfaceTypeEEnum, AllowedRepresentationInterfaceType.PRESCRIBTION_VIEW);
		addEEnumLiteral(allowedRepresentationInterfaceTypeEEnum, AllowedRepresentationInterfaceType.DIANOSYS_VIEW);

		initEEnum(allowedAttributeTypeEEnum, AllowedAttributeType.class, "AllowedAttributeType");
		addEEnumLiteral(allowedAttributeTypeEEnum, AllowedAttributeType.CIMAGE);
		addEEnumLiteral(allowedAttributeTypeEEnum, AllowedAttributeType.CSTRING);
		addEEnumLiteral(allowedAttributeTypeEEnum, AllowedAttributeType.CVARCHAR);

		// Create resource
		createResource(eNS_URI);
	}

} //EHealthManagementPackageImpl
