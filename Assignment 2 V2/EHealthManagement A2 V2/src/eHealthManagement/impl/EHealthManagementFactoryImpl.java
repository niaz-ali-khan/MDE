/**
 */
package eHealthManagement.impl;

import eHealthManagement.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EHealthManagementFactoryImpl extends EFactoryImpl implements EHealthManagementFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EHealthManagementFactory init() {
		try {
			EHealthManagementFactory theEHealthManagementFactory = (EHealthManagementFactory)EPackage.Registry.INSTANCE.getEFactory(EHealthManagementPackage.eNS_URI);
			if (theEHealthManagementFactory != null) {
				return theEHealthManagementFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EHealthManagementFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EHealthManagementFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EHealthManagementPackage.USER_INTERFACE: return createUserInterface();
			case EHealthManagementPackage.USER: return createUser();
			case EHealthManagementPackage.REPRESENTATION_INTERFACE: return createRepresentationInterface();
			case EHealthManagementPackage.COMMUNICATION_INTERFACE: return createCommunicationInterface();
			case EHealthManagementPackage.IMAGE_UI: return createImageUI();
			case EHealthManagementPackage.TEXT_UI: return createTextUI();
			case EHealthManagementPackage.VIDEO_UI: return createVideoUI();
			case EHealthManagementPackage.DATASET_TYPE: return createDatasetType();
			case EHealthManagementPackage.DOCUMENT_TYPE: return createDocumentType();
			case EHealthManagementPackage.MESSAGE_TYPE: return createMessageType();
			case EHealthManagementPackage.TEXT_MESSAGE: return createTextMessage();
			case EHealthManagementPackage.FILE_MESSAGE: return createFileMessage();
			case EHealthManagementPackage.IMAGE_MESSAGE: return createImageMessage();
			case EHealthManagementPackage.DATA_TYPE: return createDataType();
			case EHealthManagementPackage.ENTITY: return createEntity();
			case EHealthManagementPackage.ATTRIBUTE: return createAttribute();
			case EHealthManagementPackage.MESSAGE_EXCHANGE_STANDARD: return createMessageExchangeStandard();
			case EHealthManagementPackage.EVENT_MESSAGE_TYPE: return createEventMessageType();
			case EHealthManagementPackage.CVARCHAR: return createCVarchar();
			case EHealthManagementPackage.CSTRING: return createCString();
			case EHealthManagementPackage.CIMAGE: return createCImage();
			case EHealthManagementPackage.TEST: return createTest();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EHealthManagementPackage.ALLOWED_USER_TYPE:
				return createAllowedUserTypeFromString(eDataType, initialValue);
			case EHealthManagementPackage.ALLOWED_USER_INTERFACE:
				return createAllowedUserInterfaceFromString(eDataType, initialValue);
			case EHealthManagementPackage.ALLOWED_COMMUNICATION_INTERFACE_TYPE:
				return createAllowedCommunicationInterfaceTypeFromString(eDataType, initialValue);
			case EHealthManagementPackage.ALLOWED_REPRESENTATION_INTERFACE_TYPE:
				return createAllowedRepresentationInterfaceTypeFromString(eDataType, initialValue);
			case EHealthManagementPackage.ALLOWED_ATTRIBUTE_TYPE:
				return createAllowedAttributeTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EHealthManagementPackage.ALLOWED_USER_TYPE:
				return convertAllowedUserTypeToString(eDataType, instanceValue);
			case EHealthManagementPackage.ALLOWED_USER_INTERFACE:
				return convertAllowedUserInterfaceToString(eDataType, instanceValue);
			case EHealthManagementPackage.ALLOWED_COMMUNICATION_INTERFACE_TYPE:
				return convertAllowedCommunicationInterfaceTypeToString(eDataType, instanceValue);
			case EHealthManagementPackage.ALLOWED_REPRESENTATION_INTERFACE_TYPE:
				return convertAllowedRepresentationInterfaceTypeToString(eDataType, instanceValue);
			case EHealthManagementPackage.ALLOWED_ATTRIBUTE_TYPE:
				return convertAllowedAttributeTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserInterface createUserInterface() {
		UserInterfaceImpl userInterface = new UserInterfaceImpl();
		return userInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentationInterface createRepresentationInterface() {
		RepresentationInterfaceImpl representationInterface = new RepresentationInterfaceImpl();
		return representationInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationInterface createCommunicationInterface() {
		CommunicationInterfaceImpl communicationInterface = new CommunicationInterfaceImpl();
		return communicationInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageUI createImageUI() {
		ImageUIImpl imageUI = new ImageUIImpl();
		return imageUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextUI createTextUI() {
		TextUIImpl textUI = new TextUIImpl();
		return textUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoUI createVideoUI() {
		VideoUIImpl videoUI = new VideoUIImpl();
		return videoUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasetType createDatasetType() {
		DatasetTypeImpl datasetType = new DatasetTypeImpl();
		return datasetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentType createDocumentType() {
		DocumentTypeImpl documentType = new DocumentTypeImpl();
		return documentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType createMessageType() {
		MessageTypeImpl messageType = new MessageTypeImpl();
		return messageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextMessage createTextMessage() {
		TextMessageImpl textMessage = new TextMessageImpl();
		return textMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileMessage createFileMessage() {
		FileMessageImpl fileMessage = new FileMessageImpl();
		return fileMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageMessage createImageMessage() {
		ImageMessageImpl imageMessage = new ImageMessageImpl();
		return imageMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageExchangeStandard createMessageExchangeStandard() {
		MessageExchangeStandardImpl messageExchangeStandard = new MessageExchangeStandardImpl();
		return messageExchangeStandard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventMessageType createEventMessageType() {
		EventMessageTypeImpl eventMessageType = new EventMessageTypeImpl();
		return eventMessageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CVarchar createCVarchar() {
		CVarcharImpl cVarchar = new CVarcharImpl();
		return cVarchar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CString createCString() {
		CStringImpl cString = new CStringImpl();
		return cString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CImage createCImage() {
		CImageImpl cImage = new CImageImpl();
		return cImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test createTest() {
		TestImpl test = new TestImpl();
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowedUserType createAllowedUserTypeFromString(EDataType eDataType, String initialValue) {
		AllowedUserType result = AllowedUserType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllowedUserTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowedUserInterface createAllowedUserInterfaceFromString(EDataType eDataType, String initialValue) {
		AllowedUserInterface result = AllowedUserInterface.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllowedUserInterfaceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowedCommunicationInterfaceType createAllowedCommunicationInterfaceTypeFromString(EDataType eDataType, String initialValue) {
		AllowedCommunicationInterfaceType result = AllowedCommunicationInterfaceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllowedCommunicationInterfaceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowedRepresentationInterfaceType createAllowedRepresentationInterfaceTypeFromString(EDataType eDataType, String initialValue) {
		AllowedRepresentationInterfaceType result = AllowedRepresentationInterfaceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllowedRepresentationInterfaceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowedAttributeType createAllowedAttributeTypeFromString(EDataType eDataType, String initialValue) {
		AllowedAttributeType result = AllowedAttributeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllowedAttributeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EHealthManagementPackage getEHealthManagementPackage() {
		return (EHealthManagementPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EHealthManagementPackage getPackage() {
		return EHealthManagementPackage.eINSTANCE;
	}

} //EHealthManagementFactoryImpl
