/**
 */
package eHealthManagement.impl;

import eHealthManagement.AllowedAttributeTypes;
import eHealthManagement.AllowedCommunicationInterfaceTypes;
import eHealthManagement.AllowedRepresentationInterfaceTypes;
import eHealthManagement.AllowedUserInterfaces;
import eHealthManagement.AllowedUserTypes;
import eHealthManagement.Attributes;
import eHealthManagement.CommunicationInterface;
import eHealthManagement.DataSetType;
import eHealthManagement.DataType;
import eHealthManagement.DocumentType;
import eHealthManagement.EBoolean;
import eHealthManagement.EDate;
import eHealthManagement.EHealthManagementFactory;
import eHealthManagement.EHealthManagementPackage;
import eHealthManagement.EString;
import eHealthManagement.EVarchar;
import eHealthManagement.Entity;
import eHealthManagement.EventMessageType;
import eHealthManagement.FileMessage;
import eHealthManagement.ImageMessage;
import eHealthManagement.ImageUI;
import eHealthManagement.MessageExchangeStandard;
import eHealthManagement.MessageType;
import eHealthManagement.RepresentationInterface;
import eHealthManagement.TextMessage;
import eHealthManagement.TextUI;
import eHealthManagement.UIImage;
import eHealthManagement.UIString;
import eHealthManagement.UIVarchar;
import eHealthManagement.User;
import eHealthManagement.UserInterface;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
	private EClass userEClass = null;

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
	private EClass textUIEClass = null;

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
	private EClass messageTypeEClass = null;

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
	private EClass dataSetTypeEClass = null;

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
	private EClass textMessageEClass = null;

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
	private EClass attributesEClass = null;

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
	private EClass uiImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiVarcharEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eDateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eVarcharEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allowedUserTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allowedUserInterfacesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allowedAttributeTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allowedCommunicationInterfaceTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allowedRepresentationInterfaceTypesEEnum = null;

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
		if (isInited)
			return (EHealthManagementPackage) EPackage.Registry.INSTANCE.getEPackage(EHealthManagementPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEHealthManagementPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EHealthManagementPackageImpl theEHealthManagementPackage = registeredEHealthManagementPackage instanceof EHealthManagementPackageImpl
				? (EHealthManagementPackageImpl) registeredEHealthManagementPackage
				: new EHealthManagementPackageImpl();

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
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_UserTypes() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getUserInterface_UserInterfaces() {
		return (EAttribute) userInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserInterface_User() {
		return (EReference) userInterfaceEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getRepresentationInterface_RepresentationInterfaces() {
		return (EAttribute) representationInterfaceEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getCommunicationInterface_CommunicationInterfaces() {
		return (EAttribute) communicationInterfaceEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getTextUI_ETextUIName() {
		return (EAttribute) textUIEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getImageUI_EImageUIName() {
		return (EAttribute) imageUIEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getMessageType_EMessageTypeName() {
		return (EAttribute) messageTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageType_Name() {
		return (EAttribute) messageTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessageType__InstantiateMessageInterface() {
		return messageTypeEClass.getEOperations().get(0);
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
	public EAttribute getDocumentType_EDocumentTypeName() {
		return (EAttribute) documentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentType_Name() {
		return (EAttribute) documentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSetType() {
		return dataSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSetType_EDataSetTypeName() {
		return (EAttribute) dataSetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSetType_Name() {
		return (EAttribute) dataSetTypeEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getFileMessage_EFileMessageName() {
		return (EAttribute) fileMessageEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getImageMessage_EImageMessageName() {
		return (EAttribute) imageMessageEClass.getEStructuralFeatures().get(0);
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
	public EReference getTextMessage_Attributes() {
		return (EReference) textMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextMessage_ETextMessageName() {
		return (EAttribute) textMessageEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getDataType_EDataTypeName() {
		return (EAttribute) dataTypeEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getEntity_EEntityName() {
		return (EAttribute) entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributes() {
		return attributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributes_Eventmessagetype() {
		return (EReference) attributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributes_EAttributesName() {
		return (EAttribute) attributesEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getMessageExchangeStandard_EMessageExchangeStandardName() {
		return (EAttribute) messageExchangeStandardEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getEventMessageType_EEventMessageTypeName() {
		return (EAttribute) eventMessageTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventMessageType_Messageexchangestandard() {
		return (EReference) eventMessageTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIImage() {
		return uiImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIImage_EUIImageName() {
		return (EAttribute) uiImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIString() {
		return uiStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIString_EUIStringName() {
		return (EAttribute) uiStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIVarchar() {
		return uiVarcharEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIVarchar_EUIVarcharName() {
		return (EAttribute) uiVarcharEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEDate() {
		return eDateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDate_EDateDefault() {
		return (EAttribute) eDateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEBoolean() {
		return eBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEBoolean_EBooleanDefault() {
		return (EAttribute) eBooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEString() {
		return eStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEString_EStringDefault() {
		return (EAttribute) eStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEVarchar() {
		return eVarcharEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEVarchar_EVarcharDefault() {
		return (EAttribute) eVarcharEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllowedUserTypes() {
		return allowedUserTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllowedUserInterfaces() {
		return allowedUserInterfacesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllowedAttributeTypes() {
		return allowedAttributeTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllowedCommunicationInterfaceTypes() {
		return allowedCommunicationInterfaceTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllowedRepresentationInterfaceTypes() {
		return allowedRepresentationInterfaceTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EHealthManagementFactory getEHealthManagementFactory() {
		return (EHealthManagementFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__USER_TYPES);

		userInterfaceEClass = createEClass(USER_INTERFACE);
		createEAttribute(userInterfaceEClass, USER_INTERFACE__USER_INTERFACES);
		createEReference(userInterfaceEClass, USER_INTERFACE__USER);

		representationInterfaceEClass = createEClass(REPRESENTATION_INTERFACE);
		createEAttribute(representationInterfaceEClass, REPRESENTATION_INTERFACE__REPRESENTATION_INTERFACES);

		communicationInterfaceEClass = createEClass(COMMUNICATION_INTERFACE);
		createEAttribute(communicationInterfaceEClass, COMMUNICATION_INTERFACE__COMMUNICATION_INTERFACES);

		textUIEClass = createEClass(TEXT_UI);
		createEAttribute(textUIEClass, TEXT_UI__ETEXT_UI_NAME);

		imageUIEClass = createEClass(IMAGE_UI);
		createEAttribute(imageUIEClass, IMAGE_UI__EIMAGE_UI_NAME);

		messageTypeEClass = createEClass(MESSAGE_TYPE);
		createEAttribute(messageTypeEClass, MESSAGE_TYPE__EMESSAGE_TYPE_NAME);
		createEAttribute(messageTypeEClass, MESSAGE_TYPE__NAME);
		createEOperation(messageTypeEClass, MESSAGE_TYPE___INSTANTIATE_MESSAGE_INTERFACE);

		documentTypeEClass = createEClass(DOCUMENT_TYPE);
		createEAttribute(documentTypeEClass, DOCUMENT_TYPE__EDOCUMENT_TYPE_NAME);
		createEAttribute(documentTypeEClass, DOCUMENT_TYPE__NAME);

		dataSetTypeEClass = createEClass(DATA_SET_TYPE);
		createEAttribute(dataSetTypeEClass, DATA_SET_TYPE__EDATA_SET_TYPE_NAME);
		createEAttribute(dataSetTypeEClass, DATA_SET_TYPE__NAME);

		fileMessageEClass = createEClass(FILE_MESSAGE);
		createEAttribute(fileMessageEClass, FILE_MESSAGE__EFILE_MESSAGE_NAME);

		imageMessageEClass = createEClass(IMAGE_MESSAGE);
		createEAttribute(imageMessageEClass, IMAGE_MESSAGE__EIMAGE_MESSAGE_NAME);

		textMessageEClass = createEClass(TEXT_MESSAGE);
		createEReference(textMessageEClass, TEXT_MESSAGE__ATTRIBUTES);
		createEAttribute(textMessageEClass, TEXT_MESSAGE__ETEXT_MESSAGE_NAME);

		dataTypeEClass = createEClass(DATA_TYPE);
		createEAttribute(dataTypeEClass, DATA_TYPE__EDATA_TYPE_NAME);

		entityEClass = createEClass(ENTITY);
		createEAttribute(entityEClass, ENTITY__EENTITY_NAME);

		attributesEClass = createEClass(ATTRIBUTES);
		createEReference(attributesEClass, ATTRIBUTES__EVENTMESSAGETYPE);
		createEAttribute(attributesEClass, ATTRIBUTES__EATTRIBUTES_NAME);

		messageExchangeStandardEClass = createEClass(MESSAGE_EXCHANGE_STANDARD);
		createEAttribute(messageExchangeStandardEClass, MESSAGE_EXCHANGE_STANDARD__EMESSAGE_EXCHANGE_STANDARD_NAME);

		eventMessageTypeEClass = createEClass(EVENT_MESSAGE_TYPE);
		createEAttribute(eventMessageTypeEClass, EVENT_MESSAGE_TYPE__EEVENT_MESSAGE_TYPE_NAME);
		createEReference(eventMessageTypeEClass, EVENT_MESSAGE_TYPE__MESSAGEEXCHANGESTANDARD);

		uiImageEClass = createEClass(UI_IMAGE);
		createEAttribute(uiImageEClass, UI_IMAGE__EUI_IMAGE_NAME);

		uiStringEClass = createEClass(UI_STRING);
		createEAttribute(uiStringEClass, UI_STRING__EUI_STRING_NAME);

		uiVarcharEClass = createEClass(UI_VARCHAR);
		createEAttribute(uiVarcharEClass, UI_VARCHAR__EUI_VARCHAR_NAME);

		eDateEClass = createEClass(EDATE);
		createEAttribute(eDateEClass, EDATE__EDATE_DEFAULT);

		eBooleanEClass = createEClass(EBOOLEAN);
		createEAttribute(eBooleanEClass, EBOOLEAN__EBOOLEAN_DEFAULT);

		eStringEClass = createEClass(ESTRING);
		createEAttribute(eStringEClass, ESTRING__ESTRING_DEFAULT);

		eVarcharEClass = createEClass(EVARCHAR);
		createEAttribute(eVarcharEClass, EVARCHAR__EVARCHAR_DEFAULT);

		// Create enums
		allowedUserTypesEEnum = createEEnum(ALLOWED_USER_TYPES);
		allowedUserInterfacesEEnum = createEEnum(ALLOWED_USER_INTERFACES);
		allowedAttributeTypesEEnum = createEEnum(ALLOWED_ATTRIBUTE_TYPES);
		allowedCommunicationInterfaceTypesEEnum = createEEnum(ALLOWED_COMMUNICATION_INTERFACE_TYPES);
		allowedRepresentationInterfaceTypesEEnum = createEEnum(ALLOWED_REPRESENTATION_INTERFACE_TYPES);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		representationInterfaceEClass.getESuperTypes().add(this.getUserInterface());
		communicationInterfaceEClass.getESuperTypes().add(this.getUserInterface());
		textUIEClass.getESuperTypes().add(this.getRepresentationInterface());
		imageUIEClass.getESuperTypes().add(this.getRepresentationInterface());
		messageTypeEClass.getESuperTypes().add(this.getCommunicationInterface());
		documentTypeEClass.getESuperTypes().add(this.getCommunicationInterface());
		dataSetTypeEClass.getESuperTypes().add(this.getCommunicationInterface());
		fileMessageEClass.getESuperTypes().add(this.getMessageType());
		imageMessageEClass.getESuperTypes().add(this.getMessageType());
		textMessageEClass.getESuperTypes().add(this.getMessageType());
		entityEClass.getESuperTypes().add(this.getDataType());
		attributesEClass.getESuperTypes().add(this.getEntity());
		uiImageEClass.getESuperTypes().add(this.getImageUI());
		uiStringEClass.getESuperTypes().add(this.getTextUI());
		uiVarcharEClass.getESuperTypes().add(this.getTextUI());
		eDateEClass.getESuperTypes().add(this.getAttributes());
		eBooleanEClass.getESuperTypes().add(this.getAttributes());
		eStringEClass.getESuperTypes().add(this.getAttributes());
		eVarcharEClass.getESuperTypes().add(this.getAttributes());

		// Initialize classes, features, and operations; add parameters
		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_UserTypes(), this.getAllowedUserTypes(), "UserTypes", "Doctor", 0, 1, User.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userInterfaceEClass, Object.class, "UserInterface", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserInterface_UserInterfaces(), this.getAllowedUserInterfaces(), "UserInterfaces", null, 0, 1,
				UserInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getUserInterface_User(), this.getUser(), null, "user", null, 0, 1, UserInterface.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(representationInterfaceEClass, RepresentationInterface.class, "RepresentationInterface",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepresentationInterface_RepresentationInterfaces(),
				this.getAllowedRepresentationInterfaceTypes(), "RepresentationInterfaces", null, 0, 1,
				RepresentationInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationInterfaceEClass, CommunicationInterface.class, "CommunicationInterface", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunicationInterface_CommunicationInterfaces(),
				this.getAllowedCommunicationInterfaceTypes(), "CommunicationInterfaces", null, 0, 1,
				CommunicationInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textUIEClass, TextUI.class, "TextUI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextUI_ETextUIName(), ecorePackage.getEString(), "ETextUIName", null, 0, 1, TextUI.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageUIEClass, ImageUI.class, "ImageUI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageUI_EImageUIName(), ecorePackage.getEString(), "EImageUIName", null, 0, 1, ImageUI.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageTypeEClass, Object.class, "MessageType", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageType_EMessageTypeName(), ecorePackage.getEString(), "EMessageTypeName", "check", 0, 1,
				MessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageType_Name(), ecorePackage.getEString(), "Name", null, 0, 1, MessageType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMessageType__InstantiateMessageInterface(), null, "InstantiateMessageInterface", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(documentTypeEClass, DocumentType.class, "DocumentType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentType_EDocumentTypeName(), ecorePackage.getEString(), "EDocumentTypeName", null, 0, 1,
				DocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentType_Name(), ecorePackage.getEString(), "Name", null, 0, 1, DocumentType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSetTypeEClass, DataSetType.class, "DataSetType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSetType_EDataSetTypeName(), ecorePackage.getEString(), "EDataSetTypeName", null, 0, 1,
				DataSetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSetType_Name(), ecorePackage.getEString(), "Name", null, 0, 1, DataSetType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileMessageEClass, FileMessage.class, "FileMessage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileMessage_EFileMessageName(), ecorePackage.getEString(), "EFileMessageName", null, 0, 1,
				FileMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(imageMessageEClass, ImageMessage.class, "ImageMessage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageMessage_EImageMessageName(), ecorePackage.getEString(), "EImageMessageName", null, 0, 1,
				ImageMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(textMessageEClass, TextMessage.class, "TextMessage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTextMessage_Attributes(), this.getAttributes(), null, "attributes", null, 0, 1,
				TextMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextMessage_ETextMessageName(), ecorePackage.getEString(), "ETextMessageName", null, 0, 1,
				TextMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataType_EDataTypeName(), ecorePackage.getEString(), "EDataTypeName", null, 0, 1,
				DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntity_EEntityName(), ecorePackage.getEString(), "EEntityName", null, 0, 1, Entity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributesEClass, Attributes.class, "Attributes", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributes_Eventmessagetype(), this.getEventMessageType(), null, "eventmessagetype", null, 0,
				1, Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributes_EAttributesName(), ecorePackage.getEString(), "EAttributesName", null, 0, 1,
				Attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(messageExchangeStandardEClass, MessageExchangeStandard.class, "MessageExchangeStandard",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageExchangeStandard_EMessageExchangeStandardName(), ecorePackage.getEString(),
				"EMessageExchangeStandardName", null, 0, 1, MessageExchangeStandard.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventMessageTypeEClass, EventMessageType.class, "EventMessageType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventMessageType_EEventMessageTypeName(), ecorePackage.getEString(), "EEventMessageTypeName",
				null, 0, 1, EventMessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventMessageType_Messageexchangestandard(), this.getMessageExchangeStandard(), null,
				"messageexchangestandard", null, 0, 1, EventMessageType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiImageEClass, UIImage.class, "UIImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUIImage_EUIImageName(), ecorePackage.getEString(), "EUIImageName", null, 0, 1, UIImage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiStringEClass, UIString.class, "UIString", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUIString_EUIStringName(), ecorePackage.getEString(), "EUIStringName", null, 0, 1,
				UIString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(uiVarcharEClass, UIVarchar.class, "UIVarchar", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUIVarchar_EUIVarcharName(), ecorePackage.getEString(), "EUIVarcharName", null, 0, 1,
				UIVarchar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(eDateEClass, EDate.class, "EDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEDate_EDateDefault(), ecorePackage.getEDate(), "EDateDefault", null, 0, 1, EDate.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eBooleanEClass, EBoolean.class, "EBoolean", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEBoolean_EBooleanDefault(), ecorePackage.getEBoolean(), "EBooleanDefault", null, 0, 1,
				EBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(eStringEClass, EString.class, "EString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEString_EStringDefault(), ecorePackage.getEString(), "EStringDefault", null, 0, 1,
				EString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(eVarcharEClass, EVarchar.class, "EVarchar", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEVarchar_EVarcharDefault(), ecorePackage.getEString(), "EVarcharDefault", null, 0, 1,
				EVarchar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(allowedUserTypesEEnum, AllowedUserTypes.class, "AllowedUserTypes");
		addEEnumLiteral(allowedUserTypesEEnum, AllowedUserTypes.DOCTOR);
		addEEnumLiteral(allowedUserTypesEEnum, AllowedUserTypes.PATIENT);
		addEEnumLiteral(allowedUserTypesEEnum, AllowedUserTypes.SYSTEM_ADMIN);

		initEEnum(allowedUserInterfacesEEnum, AllowedUserInterfaces.class, "AllowedUserInterfaces");
		addEEnumLiteral(allowedUserInterfacesEEnum, AllowedUserInterfaces.PROFILE_VIEW);
		addEEnumLiteral(allowedUserInterfacesEEnum, AllowedUserInterfaces.INFORMATION_VIEW);

		initEEnum(allowedAttributeTypesEEnum, AllowedAttributeTypes.class, "AllowedAttributeTypes");
		addEEnumLiteral(allowedAttributeTypesEEnum, AllowedAttributeTypes.EBOOLEAN);
		addEEnumLiteral(allowedAttributeTypesEEnum, AllowedAttributeTypes.EDATE);
		addEEnumLiteral(allowedAttributeTypesEEnum, AllowedAttributeTypes.ESTRING);
		addEEnumLiteral(allowedAttributeTypesEEnum, AllowedAttributeTypes.EVARCHAR);
		addEEnumLiteral(allowedAttributeTypesEEnum, AllowedAttributeTypes.IMAGE);

		initEEnum(allowedCommunicationInterfaceTypesEEnum, AllowedCommunicationInterfaceTypes.class,
				"AllowedCommunicationInterfaceTypes");
		addEEnumLiteral(allowedCommunicationInterfaceTypesEEnum, AllowedCommunicationInterfaceTypes.COMMUNICATION_VIEW);
		addEEnumLiteral(allowedCommunicationInterfaceTypesEEnum, AllowedCommunicationInterfaceTypes.NOTIFICATION_VIEW);
		addEEnumLiteral(allowedCommunicationInterfaceTypesEEnum, AllowedCommunicationInterfaceTypes.FEEDBACK_VIEW);

		initEEnum(allowedRepresentationInterfaceTypesEEnum, AllowedRepresentationInterfaceTypes.class,
				"AllowedRepresentationInterfaceTypes");
		addEEnumLiteral(allowedRepresentationInterfaceTypesEEnum, AllowedRepresentationInterfaceTypes.DOCTOR_PROFILE);
		addEEnumLiteral(allowedRepresentationInterfaceTypesEEnum, AllowedRepresentationInterfaceTypes.PATIENT_PROFILE);
		addEEnumLiteral(allowedRepresentationInterfaceTypesEEnum, AllowedRepresentationInterfaceTypes.MEDICINE_LIST);
		addEEnumLiteral(allowedRepresentationInterfaceTypesEEnum,
				AllowedRepresentationInterfaceTypes.PRESCRIPTION_VIEW);
		addEEnumLiteral(allowedRepresentationInterfaceTypesEEnum, AllowedRepresentationInterfaceTypes.DIAGNOSYS_VIEW);

		// Create resource
		createResource(eNS_URI);
	}

} //EHealthManagementPackageImpl
