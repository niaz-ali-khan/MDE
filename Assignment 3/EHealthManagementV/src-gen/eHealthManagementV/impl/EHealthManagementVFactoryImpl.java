/**
 */
package eHealthManagementV.impl;

import eHealthManagementV.*;

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
public class EHealthManagementVFactoryImpl extends EFactoryImpl implements EHealthManagementVFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EHealthManagementVFactory init() {
		try {
			EHealthManagementVFactory theEHealthManagementVFactory = (EHealthManagementVFactory) EPackage.Registry.INSTANCE
					.getEFactory(EHealthManagementVPackage.eNS_URI);
			if (theEHealthManagementVFactory != null) {
				return theEHealthManagementVFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EHealthManagementVFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EHealthManagementVFactoryImpl() {
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
		case EHealthManagementVPackage.USERS:
			return (EObject) createUsers();
		case EHealthManagementVPackage.USER_INTERFACES:
			return (EObject) createUserInterfaces();
		case EHealthManagementVPackage.REPRESENTATION_INTERFACES:
			return (EObject) createRepresentationInterfaces();
		case EHealthManagementVPackage.COMMUNICATION_INTERFACES:
			return (EObject) createCommunicationInterfaces();
		case EHealthManagementVPackage.IMAGE_UI:
			return (EObject) createImageUI();
		case EHealthManagementVPackage.TEXT_UI:
			return (EObject) createTextUI();
		case EHealthManagementVPackage.VIDEO_UI:
			return (EObject) createVideoUI();
		case EHealthManagementVPackage.DOCUMENT_TYPE:
			return (EObject) createDocumentType();
		case EHealthManagementVPackage.DATA_SET_TYPE:
			return (EObject) createDataSetType();
		case EHealthManagementVPackage.MESSAGE_TYPE:
			return (EObject) createMessageType();
		case EHealthManagementVPackage.IMAGE_MESSAGE:
			return (EObject) createImageMessage();
		case EHealthManagementVPackage.TEXT_MESSAGE:
			return (EObject) createTextMessage();
		case EHealthManagementVPackage.FILE_MESSAGE:
			return (EObject) createFileMessage();
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
		case EHealthManagementVPackage.ALLOWED_REPRESENTATION_INTERFACE_TYPES:
			return createAllowedRepresentationInterfaceTypesFromString(eDataType, initialValue);
		case EHealthManagementVPackage.ALLOWED_USER_TYPES:
			return createAllowedUserTypesFromString(eDataType, initialValue);
		case EHealthManagementVPackage.ALLOWED_COMMUNICATION_INTERFACE_TYPES:
			return createAllowedCommunicationInterfaceTypesFromString(eDataType, initialValue);
		case EHealthManagementVPackage.ALLOWED_USER_INTERFACES:
			return createAllowedUserInterfacesFromString(eDataType, initialValue);
		case EHealthManagementVPackage.ALLOWED_ATTRIBUTE_TYPES:
			return createAllowedAttributeTypesFromString(eDataType, initialValue);
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
		case EHealthManagementVPackage.ALLOWED_REPRESENTATION_INTERFACE_TYPES:
			return convertAllowedRepresentationInterfaceTypesToString(eDataType, instanceValue);
		case EHealthManagementVPackage.ALLOWED_USER_TYPES:
			return convertAllowedUserTypesToString(eDataType, instanceValue);
		case EHealthManagementVPackage.ALLOWED_COMMUNICATION_INTERFACE_TYPES:
			return convertAllowedCommunicationInterfaceTypesToString(eDataType, instanceValue);
		case EHealthManagementVPackage.ALLOWED_USER_INTERFACES:
			return convertAllowedUserInterfacesToString(eDataType, instanceValue);
		case EHealthManagementVPackage.ALLOWED_ATTRIBUTE_TYPES:
			return convertAllowedAttributeTypesToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Users createUsers() {
		UsersImpl users = new UsersImpl();
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserInterfaces createUserInterfaces() {
		UserInterfacesImpl userInterfaces = new UserInterfacesImpl();
		return userInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentationInterfaces createRepresentationInterfaces() {
		RepresentationInterfacesImpl representationInterfaces = new RepresentationInterfacesImpl();
		return representationInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationInterfaces createCommunicationInterfaces() {
		CommunicationInterfacesImpl communicationInterfaces = new CommunicationInterfacesImpl();
		return communicationInterfaces;
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
	public MessageType createMessageType() {
		MessageTypeImpl messageType = new MessageTypeImpl();
		return messageType;
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
	public FileMessage createFileMessage() {
		FileMessageImpl fileMessage = new FileMessageImpl();
		return fileMessage;
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
	public EHealthManagementVPackage getEHealthManagementVPackage() {
		return (EHealthManagementVPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EHealthManagementVPackage getPackage() {
		return EHealthManagementVPackage.eINSTANCE;
	}

} //EHealthManagementVFactoryImpl
