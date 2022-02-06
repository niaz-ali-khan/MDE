/**
 */
package eHealthManagementV.impl;

import eHealthManagementV.AllowedAttributeTypes;
import eHealthManagementV.AllowedCommunicationInterfaceTypes;
import eHealthManagementV.AllowedRepresentationInterfaceTypes;
import eHealthManagementV.AllowedUserInterfaces;
import eHealthManagementV.AllowedUserTypes;
import eHealthManagementV.EHealthManagementVFactory;
import eHealthManagementV.EHealthManagementVPackage;

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
public class EHealthManagementVPackageImpl extends EPackageImpl implements EHealthManagementVPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userInterfacesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass representationInterfacesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationInterfacesEClass = null;

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
	private EClass messageTypeEClass = null;

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
	private EClass fileMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allowedRepresentationInterfaceTypesEEnum = null;

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
	private EEnum allowedCommunicationInterfaceTypesEEnum = null;

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
	 * @see eHealthManagementV.EHealthManagementVPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EHealthManagementVPackageImpl() {
		super(eNS_URI, EHealthManagementVFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EHealthManagementVPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EHealthManagementVPackage init() {
		if (isInited)
			return (EHealthManagementVPackage) EPackage.Registry.INSTANCE
					.getEPackage(EHealthManagementVPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEHealthManagementVPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EHealthManagementVPackageImpl theEHealthManagementVPackage = registeredEHealthManagementVPackage instanceof EHealthManagementVPackageImpl
				? (EHealthManagementVPackageImpl) registeredEHealthManagementVPackage
				: new EHealthManagementVPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theEHealthManagementVPackage.createPackageContents();

		// Initialize created meta-data
		theEHealthManagementVPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEHealthManagementVPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EHealthManagementVPackage.eNS_URI, theEHealthManagementVPackage);
		return theEHealthManagementVPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsers() {
		return usersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsers_UserTypes() {
		return (EAttribute) usersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsers_UserValidity() {
		return (EAttribute) usersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserInterfaces() {
		return userInterfacesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserInterfaces_UserInterfacesTypes() {
		return (EAttribute) userInterfacesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserInterfaces_UserInterfacesValidity() {
		return (EAttribute) userInterfacesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserInterfaces_Users() {
		return (EReference) userInterfacesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepresentationInterfaces() {
		return representationInterfacesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepresentationInterfaces_RepresentationInterfacesTypes() {
		return (EAttribute) representationInterfacesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepresentationInterfaces_RepresentationInterfacesValidity() {
		return (EAttribute) representationInterfacesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationInterfaces() {
		return communicationInterfacesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationInterfaces_CommunicationInterfacesTypes() {
		return (EAttribute) communicationInterfacesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationInterfaces_CommunicationInterfacesValidity() {
		return (EAttribute) communicationInterfacesEClass.getEStructuralFeatures().get(1);
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
	public EClass getVideoUI() {
		return videoUIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideoUI_EVdeoUIName() {
		return (EAttribute) videoUIEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getMessageType_Size() {
		return (EAttribute) messageTypeEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getImageMessage_ImageSize() {
		return (EAttribute) imageMessageEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getTextMessage_ETextMessageName() {
		return (EAttribute) textMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextMessage_TextSize() {
		return (EAttribute) textMessageEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getFileMessage_FileSize() {
		return (EAttribute) fileMessageEClass.getEStructuralFeatures().get(1);
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
	public EEnum getAllowedUserTypes() {
		return allowedUserTypesEEnum;
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
	public EHealthManagementVFactory getEHealthManagementVFactory() {
		return (EHealthManagementVFactory) getEFactoryInstance();
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
		usersEClass = createEClass(USERS);
		createEAttribute(usersEClass, USERS__USER_TYPES);
		createEAttribute(usersEClass, USERS__USER_VALIDITY);

		userInterfacesEClass = createEClass(USER_INTERFACES);
		createEAttribute(userInterfacesEClass, USER_INTERFACES__USER_INTERFACES_TYPES);
		createEAttribute(userInterfacesEClass, USER_INTERFACES__USER_INTERFACES_VALIDITY);
		createEReference(userInterfacesEClass, USER_INTERFACES__USERS);

		representationInterfacesEClass = createEClass(REPRESENTATION_INTERFACES);
		createEAttribute(representationInterfacesEClass, REPRESENTATION_INTERFACES__REPRESENTATION_INTERFACES_TYPES);
		createEAttribute(representationInterfacesEClass, REPRESENTATION_INTERFACES__REPRESENTATION_INTERFACES_VALIDITY);

		communicationInterfacesEClass = createEClass(COMMUNICATION_INTERFACES);
		createEAttribute(communicationInterfacesEClass, COMMUNICATION_INTERFACES__COMMUNICATION_INTERFACES_TYPES);
		createEAttribute(communicationInterfacesEClass, COMMUNICATION_INTERFACES__COMMUNICATION_INTERFACES_VALIDITY);

		imageUIEClass = createEClass(IMAGE_UI);
		createEAttribute(imageUIEClass, IMAGE_UI__EIMAGE_UI_NAME);

		textUIEClass = createEClass(TEXT_UI);
		createEAttribute(textUIEClass, TEXT_UI__ETEXT_UI_NAME);

		videoUIEClass = createEClass(VIDEO_UI);
		createEAttribute(videoUIEClass, VIDEO_UI__EVDEO_UI_NAME);

		documentTypeEClass = createEClass(DOCUMENT_TYPE);
		createEAttribute(documentTypeEClass, DOCUMENT_TYPE__EDOCUMENT_TYPE_NAME);

		dataSetTypeEClass = createEClass(DATA_SET_TYPE);
		createEAttribute(dataSetTypeEClass, DATA_SET_TYPE__EDATA_SET_TYPE_NAME);

		messageTypeEClass = createEClass(MESSAGE_TYPE);
		createEAttribute(messageTypeEClass, MESSAGE_TYPE__EMESSAGE_TYPE_NAME);
		createEAttribute(messageTypeEClass, MESSAGE_TYPE__SIZE);

		imageMessageEClass = createEClass(IMAGE_MESSAGE);
		createEAttribute(imageMessageEClass, IMAGE_MESSAGE__EIMAGE_MESSAGE_NAME);
		createEAttribute(imageMessageEClass, IMAGE_MESSAGE__IMAGE_SIZE);

		textMessageEClass = createEClass(TEXT_MESSAGE);
		createEAttribute(textMessageEClass, TEXT_MESSAGE__ETEXT_MESSAGE_NAME);
		createEAttribute(textMessageEClass, TEXT_MESSAGE__TEXT_SIZE);

		fileMessageEClass = createEClass(FILE_MESSAGE);
		createEAttribute(fileMessageEClass, FILE_MESSAGE__EFILE_MESSAGE_NAME);
		createEAttribute(fileMessageEClass, FILE_MESSAGE__FILE_SIZE);

		// Create enums
		allowedRepresentationInterfaceTypesEEnum = createEEnum(ALLOWED_REPRESENTATION_INTERFACE_TYPES);
		allowedUserTypesEEnum = createEEnum(ALLOWED_USER_TYPES);
		allowedCommunicationInterfaceTypesEEnum = createEEnum(ALLOWED_COMMUNICATION_INTERFACE_TYPES);
		allowedUserInterfacesEEnum = createEEnum(ALLOWED_USER_INTERFACES);
		allowedAttributeTypesEEnum = createEEnum(ALLOWED_ATTRIBUTE_TYPES);
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
		representationInterfacesEClass.getESuperTypes().add(this.getUserInterfaces());
		communicationInterfacesEClass.getESuperTypes().add(this.getUserInterfaces());
		imageUIEClass.getESuperTypes().add(this.getRepresentationInterfaces());
		textUIEClass.getESuperTypes().add(this.getRepresentationInterfaces());
		videoUIEClass.getESuperTypes().add(this.getRepresentationInterfaces());
		documentTypeEClass.getESuperTypes().add(this.getCommunicationInterfaces());
		dataSetTypeEClass.getESuperTypes().add(this.getCommunicationInterfaces());
		messageTypeEClass.getESuperTypes().add(this.getCommunicationInterfaces());
		imageMessageEClass.getESuperTypes().add(this.getMessageType());
		textMessageEClass.getESuperTypes().add(this.getMessageType());
		fileMessageEClass.getESuperTypes().add(this.getMessageType());

		// Initialize classes, features, and operations; add parameters
		initEClass(usersEClass, Object.class, "Users", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsers_UserTypes(), this.getAllowedUserTypes(), "UserTypes", null, 0, 1, Users.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsers_UserValidity(), ecorePackage.getEBoolean(), "UserValidity", "false", 0, 1, Users.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userInterfacesEClass, UserInterfaces.class, "UserInterfaces", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserInterfaces_UserInterfacesTypes(), this.getAllowedUserInterfaces(), "UserInterfacesTypes",
				null, 0, 1, UserInterfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserInterfaces_UserInterfacesValidity(), ecorePackage.getEBoolean(), "UserInterfacesValidity",
				"true", 0, 1, UserInterfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserInterfaces_Users(), this.getUsers(), null, "users", null, 0, 1, UserInterfaces.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(representationInterfacesEClass, RepresentationInterfaces.class, "RepresentationInterfaces",
				!IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepresentationInterfaces_RepresentationInterfacesTypes(),
				this.getAllowedRepresentationInterfaceTypes(), "RepresentationInterfacesTypes", null, 0, 1,
				RepresentationInterfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepresentationInterfaces_RepresentationInterfacesValidity(), ecorePackage.getEBoolean(),
				"RepresentationInterfacesValidity", "true", 0, 1, RepresentationInterfaces.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationInterfacesEClass, CommunicationInterfaces.class, "CommunicationInterfaces",
				!IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunicationInterfaces_CommunicationInterfacesTypes(),
				this.getAllowedCommunicationInterfaceTypes(), "CommunicationInterfacesTypes", null, 0, 1,
				CommunicationInterfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationInterfaces_CommunicationInterfacesValidity(), ecorePackage.getEBoolean(),
				"CommunicationInterfacesValidity", null, 0, 1, CommunicationInterfaces.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageUIEClass, ImageUI.class, "ImageUI", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageUI_EImageUIName(), ecorePackage.getEString(), "EImageUIName", null, 0, 1, ImageUI.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textUIEClass, TextUI.class, "TextUI", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextUI_ETextUIName(), ecorePackage.getEString(), "ETextUIName", null, 0, 1, TextUI.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(videoUIEClass, VideoUI.class, "VideoUI", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVideoUI_EVdeoUIName(), ecorePackage.getEString(), "EVdeoUIName", null, 0, 1, VideoUI.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentTypeEClass, DocumentType.class, "DocumentType", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentType_EDocumentTypeName(), ecorePackage.getEString(), "EDocumentTypeName", null, 0, 1,
				DocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(dataSetTypeEClass, DataSetType.class, "DataSetType", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSetType_EDataSetTypeName(), ecorePackage.getEString(), "EDataSetTypeName", null, 0, 1,
				DataSetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(messageTypeEClass, MessageType.class, "MessageType", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageType_EMessageTypeName(), ecorePackage.getEString(), "EMessageTypeName", "msg", 0, 1,
				MessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageType_Size(), ecorePackage.getEInt(), "Size", "1", 0, 1, MessageType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageMessageEClass, Object.class, "ImageMessage", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageMessage_EImageMessageName(), ecorePackage.getEString(), "EImageMessageName", "img", 0, 1,
				ImageMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageMessage_ImageSize(), ecorePackage.getEInt(), "ImageSize", "3", 0, 1, ImageMessage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textMessageEClass, Object.class, "TextMessage", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextMessage_ETextMessageName(), ecorePackage.getEString(), "ETextMessageName", "txt", 0, 1,
				TextMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextMessage_TextSize(), ecorePackage.getEInt(), "TextSize", "4", 0, 1, TextMessage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileMessageEClass, Object.class, "FileMessage", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileMessage_EFileMessageName(), ecorePackage.getEString(), "EFileMessageName", "file", 0, 1,
				FileMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileMessage_FileSize(), ecorePackage.getEInt(), "FileSize", "2", 0, 1, FileMessage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(allowedRepresentationInterfaceTypesEEnum, AllowedRepresentationInterfaceTypes.class,
				"AllowedRepresentationInterfaceTypes");
		addEEnumLiteral(allowedRepresentationInterfaceTypesEEnum, AllowedRepresentationInterfaceTypes.DOCTOR_PROFILE);
		addEEnumLiteral(allowedRepresentationInterfaceTypesEEnum, AllowedRepresentationInterfaceTypes.PATIENT_PROFILE);
		addEEnumLiteral(allowedRepresentationInterfaceTypesEEnum, AllowedRepresentationInterfaceTypes.MEDICINE_LIST);
		addEEnumLiteral(allowedRepresentationInterfaceTypesEEnum,
				AllowedRepresentationInterfaceTypes.PRESCRIPTION_VIEW);
		addEEnumLiteral(allowedRepresentationInterfaceTypesEEnum, AllowedRepresentationInterfaceTypes.DIAGNOSYS_VIEW);

		initEEnum(allowedUserTypesEEnum, AllowedUserTypes.class, "AllowedUserTypes");
		addEEnumLiteral(allowedUserTypesEEnum, AllowedUserTypes.DOCTOR);
		addEEnumLiteral(allowedUserTypesEEnum, AllowedUserTypes.PATIENT);
		addEEnumLiteral(allowedUserTypesEEnum, AllowedUserTypes.SYSTEM_ADMIN);

		initEEnum(allowedCommunicationInterfaceTypesEEnum, AllowedCommunicationInterfaceTypes.class,
				"AllowedCommunicationInterfaceTypes");
		addEEnumLiteral(allowedCommunicationInterfaceTypesEEnum, AllowedCommunicationInterfaceTypes.COMMUNICATION_VIEW);
		addEEnumLiteral(allowedCommunicationInterfaceTypesEEnum, AllowedCommunicationInterfaceTypes.NOTIFICATION_VIEW);
		addEEnumLiteral(allowedCommunicationInterfaceTypesEEnum, AllowedCommunicationInterfaceTypes.FEEDBACK_VIEW);

		initEEnum(allowedUserInterfacesEEnum, AllowedUserInterfaces.class, "AllowedUserInterfaces");
		addEEnumLiteral(allowedUserInterfacesEEnum, AllowedUserInterfaces.PROFILE_VIEW);
		addEEnumLiteral(allowedUserInterfacesEEnum, AllowedUserInterfaces.INFORMATION_VIEW);

		initEEnum(allowedAttributeTypesEEnum, AllowedAttributeTypes.class, "AllowedAttributeTypes");
		addEEnumLiteral(allowedAttributeTypesEEnum, AllowedAttributeTypes.EBOOLEAN);
		addEEnumLiteral(allowedAttributeTypesEEnum, AllowedAttributeTypes.EDATE);
		addEEnumLiteral(allowedAttributeTypesEEnum, AllowedAttributeTypes.ESTRING);
		addEEnumLiteral(allowedAttributeTypesEEnum, AllowedAttributeTypes.EVARCHAR);
		addEEnumLiteral(allowedAttributeTypesEEnum, AllowedAttributeTypes.IMAGE);

		// Create resource
		createResource(eNS_URI);
	}

} //EHealthManagementVPackageImpl
