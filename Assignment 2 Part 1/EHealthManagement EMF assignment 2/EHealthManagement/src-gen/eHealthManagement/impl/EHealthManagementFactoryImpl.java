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
			EHealthManagementFactory theEHealthManagementFactory = (EHealthManagementFactory) EPackage.Registry.INSTANCE
					.getEFactory(EHealthManagementPackage.eNS_URI);
			if (theEHealthManagementFactory != null) {
				return theEHealthManagementFactory;
			}
		} catch (Exception exception) {
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
		case EHealthManagementPackage.USER:
			return createUser();
		case EHealthManagementPackage.USER_INTERFACE:
			return (EObject) createUserInterface();
		case EHealthManagementPackage.REPRESENTATION_INTERFACE:
			return createRepresentationInterface();
		case EHealthManagementPackage.COMMUNICATION_INTERFACE:
			return createCommunicationInterface();
		case EHealthManagementPackage.TEXT_UI:
			return createTextUI();
		case EHealthManagementPackage.IMAGE_UI:
			return createImageUI();
		case EHealthManagementPackage.MESSAGE_TYPE:
			return (EObject) createMessageType();
		case EHealthManagementPackage.DOCUMENT_TYPE:
			return createDocumentType();
		case EHealthManagementPackage.DATA_SET_TYPE:
			return createDataSetType();
		case EHealthManagementPackage.FILE_MESSAGE:
			return createFileMessage();
		case EHealthManagementPackage.IMAGE_MESSAGE:
			return createImageMessage();
		case EHealthManagementPackage.TEXT_MESSAGE:
			return createTextMessage();
		case EHealthManagementPackage.DATA_TYPE:
			return createDataType();
		case EHealthManagementPackage.ENTITY:
			return createEntity();
		case EHealthManagementPackage.ATTRIBUTES:
			return createAttributes();
		case EHealthManagementPackage.MESSAGE_EXCHANGE_STANDARD:
			return createMessageExchangeStandard();
		case EHealthManagementPackage.EVENT_MESSAGE_TYPE:
			return createEventMessageType();
		case EHealthManagementPackage.UI_IMAGE:
			return createUIImage();
		case EHealthManagementPackage.UI_STRING:
			return createUIString();
		case EHealthManagementPackage.UI_VARCHAR:
			return createUIVarchar();
		case EHealthManagementPackage.EDATE:
			return createEDate();
		case EHealthManagementPackage.EBOOLEAN:
			return createEBoolean();
		case EHealthManagementPackage.ESTRING:
			return createEString();
		case EHealthManagementPackage.EVARCHAR:
			return createEVarchar();
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
		case EHealthManagementPackage.ALLOWED_USER_TYPES:
			return createAllowedUserTypesFromString(eDataType, initialValue);
		case EHealthManagementPackage.ALLOWED_USER_INTERFACES:
			return createAllowedUserInterfacesFromString(eDataType, initialValue);
		case EHealthManagementPackage.ALLOWED_ATTRIBUTE_TYPES:
			return createAllowedAttributeTypesFromString(eDataType, initialValue);
		case EHealthManagementPackage.ALLOWED_COMMUNICATION_INTERFACE_TYPES:
			return createAllowedCommunicationInterfaceTypesFromString(eDataType, initialValue);
		case EHealthManagementPackage.ALLOWED_REPRESENTATION_INTERFACE_TYPES:
			return createAllowedRepresentationInterfaceTypesFromString(eDataType, initialValue);
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
		case EHealthManagementPackage.ALLOWED_USER_TYPES:
			return convertAllowedUserTypesToString(eDataType, instanceValue);
		case EHealthManagementPackage.ALLOWED_USER_INTERFACES:
			return convertAllowedUserInterfacesToString(eDataType, instanceValue);
		case EHealthManagementPackage.ALLOWED_ATTRIBUTE_TYPES:
			return convertAllowedAttributeTypesToString(eDataType, instanceValue);
		case EHealthManagementPackage.ALLOWED_COMMUNICATION_INTERFACE_TYPES:
			return convertAllowedCommunicationInterfaceTypesToString(eDataType, instanceValue);
		case EHealthManagementPackage.ALLOWED_REPRESENTATION_INTERFACE_TYPES:
			return convertAllowedRepresentationInterfaceTypesToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	public UserInterface createUserInterface() {
		UserInterfaceImpl userInterface = new UserInterfaceImpl();
		return userInterface;
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
	public TextUI createTextUI() {
		TextUIImpl textUI = new TextUIImpl();
		return textUI;
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
	public MessageType createMessageType() {
		MessageTypeImpl messageType = new MessageTypeImpl();
		return messageType;
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
	public DataSetType createDataSetType() {
		DataSetTypeImpl dataSetType = new DataSetTypeImpl();
		return dataSetType;
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
	public TextMessage createTextMessage() {
		TextMessageImpl textMessage = new TextMessageImpl();
		return textMessage;
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
	public Attributes createAttributes() {
		AttributesImpl attributes = new AttributesImpl();
		return attributes;
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
	public UIImage createUIImage() {
		UIImageImpl uiImage = new UIImageImpl();
		return uiImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIString createUIString() {
		UIStringImpl uiString = new UIStringImpl();
		return uiString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIVarchar createUIVarchar() {
		UIVarcharImpl uiVarchar = new UIVarcharImpl();
		return uiVarchar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDate createEDate() {
		EDateImpl eDate = new EDateImpl();
		return eDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EBoolean createEBoolean() {
		EBooleanImpl eBoolean = new EBooleanImpl();
		return eBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EString createEString() {
		EStringImpl eString = new EStringImpl();
		return eString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EVarchar createEVarchar() {
		EVarcharImpl eVarchar = new EVarcharImpl();
		return eVarchar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowedUserTypes createAllowedUserTypesFromString(EDataType eDataType, String initialValue) {
		AllowedUserTypes result = AllowedUserTypes.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllowedUserTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowedUserInterfaces createAllowedUserInterfacesFromString(EDataType eDataType, String initialValue) {
		AllowedUserInterfaces result = AllowedUserInterfaces.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllowedUserInterfacesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowedAttributeTypes createAllowedAttributeTypesFromString(EDataType eDataType, String initialValue) {
		AllowedAttributeTypes result = AllowedAttributeTypes.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllowedAttributeTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowedCommunicationInterfaceTypes createAllowedCommunicationInterfaceTypesFromString(EDataType eDataType,
			String initialValue) {
		AllowedCommunicationInterfaceTypes result = AllowedCommunicationInterfaceTypes.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllowedCommunicationInterfaceTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowedRepresentationInterfaceTypes createAllowedRepresentationInterfaceTypesFromString(EDataType eDataType,
			String initialValue) {
		AllowedRepresentationInterfaceTypes result = AllowedRepresentationInterfaceTypes.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllowedRepresentationInterfaceTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EHealthManagementPackage getEHealthManagementPackage() {
		return (EHealthManagementPackage) getEPackage();
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
