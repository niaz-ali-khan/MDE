/**
 */
package eHealthManagement.util;

import eHealthManagement.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see eHealthManagement.EHealthManagementPackage
 * @generated
 */
public class EHealthManagementSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EHealthManagementPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EHealthManagementSwitch() {
		if (modelPackage == null) {
			modelPackage = EHealthManagementPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case EHealthManagementPackage.USER: {
			User user = (User) theEObject;
			T result = caseUser(user);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementPackage.USER_INTERFACE: {
			UserInterface userInterface = (UserInterface) theEObject;
			T result = caseUserInterface(userInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementPackage.REPRESENTATION_INTERFACE: {
			RepresentationInterface representationInterface = (RepresentationInterface) theEObject;
			T result = caseRepresentationInterface(representationInterface);
			if (result == null)
				result = caseUserInterface(representationInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementPackage.COMMUNICATION_INTERFACE: {
			CommunicationInterface communicationInterface = (CommunicationInterface) theEObject;
			T result = caseCommunicationInterface(communicationInterface);
			if (result == null)
				result = caseUserInterface(communicationInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementPackage.TEXT_UI: {
			TextUI textUI = (TextUI) theEObject;
			T result = caseTextUI(textUI);
			if (result == null)
				result = caseRepresentationInterface(textUI);
			if (result == null)
				result = caseUserInterface(textUI);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementPackage.IMAGE_UI: {
			ImageUI imageUI = (ImageUI) theEObject;
			T result = caseImageUI(imageUI);
			if (result == null)
				result = caseRepresentationInterface(imageUI);
			if (result == null)
				result = caseUserInterface(imageUI);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementPackage.MESSAGE_TYPE: {
			MessageType messageType = (MessageType) theEObject;
			T result = caseMessageType(messageType);
			if (result == null)
				result = caseCommunicationInterface(messageType);
			if (result == null)
				result = caseUserInterface(messageType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementPackage.DOCUMENT_TYPE: {
			DocumentType documentType = (DocumentType) theEObject;
			T result = caseDocumentType(documentType);
			if (result == null)
				result = caseCommunicationInterface(documentType);
			if (result == null)
				result = caseUserInterface(documentType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementPackage.DATA_SET_TYPE: {
			DataSetType dataSetType = (DataSetType) theEObject;
			T result = caseDataSetType(dataSetType);
			if (result == null)
				result = caseCommunicationInterface(dataSetType);
			if (result == null)
				result = caseUserInterface(dataSetType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementPackage.FILE_MESSAGE: {
			FileMessage fileMessage = (FileMessage) theEObject;
			T result = caseFileMessage(fileMessage);
			if (result == null)
				result = caseMessageType(fileMessage);
			if (result == null)
				result = caseCommunicationInterface(fileMessage);
			if (result == null)
				result = caseUserInterface(fileMessage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementPackage.IMAGE_MESSAGE: {
			ImageMessage imageMessage = (ImageMessage) theEObject;
			T result = caseImageMessage(imageMessage);
			if (result == null)
				result = caseMessageType(imageMessage);
			if (result == null)
				result = caseCommunicationInterface(imageMessage);
			if (result == null)
				result = caseUserInterface(imageMessage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementPackage.TEXT_MESSAGE: {
			TextMessage textMessage = (TextMessage) theEObject;
			T result = caseTextMessage(textMessage);
			if (result == null)
				result = caseMessageType(textMessage);
			if (result == null)
				result = caseCommunicationInterface(textMessage);
			if (result == null)
				result = caseUserInterface(textMessage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementPackage.DATA_TYPE: {
			DataType dataType = (DataType) theEObject;
			T result = caseDataType(dataType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementPackage.ENTITY: {
			Entity entity = (Entity) theEObject;
			T result = caseEntity(entity);
			if (result == null)
				result = caseDataType(entity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementPackage.ATTRIBUTES: {
			Attributes attributes = (Attributes) theEObject;
			T result = caseAttributes(attributes);
			if (result == null)
				result = caseEntity(attributes);
			if (result == null)
				result = caseDataType(attributes);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementPackage.MESSAGE_EXCHANGE_STANDARD: {
			MessageExchangeStandard messageExchangeStandard = (MessageExchangeStandard) theEObject;
			T result = caseMessageExchangeStandard(messageExchangeStandard);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementPackage.EVENT_MESSAGE_TYPE: {
			EventMessageType eventMessageType = (EventMessageType) theEObject;
			T result = caseEventMessageType(eventMessageType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementPackage.UI_IMAGE: {
			UIImage uiImage = (UIImage) theEObject;
			T result = caseUIImage(uiImage);
			if (result == null)
				result = caseImageUI(uiImage);
			if (result == null)
				result = caseRepresentationInterface(uiImage);
			if (result == null)
				result = caseUserInterface(uiImage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementPackage.UI_STRING: {
			UIString uiString = (UIString) theEObject;
			T result = caseUIString(uiString);
			if (result == null)
				result = caseTextUI(uiString);
			if (result == null)
				result = caseRepresentationInterface(uiString);
			if (result == null)
				result = caseUserInterface(uiString);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementPackage.UI_VARCHAR: {
			UIVarchar uiVarchar = (UIVarchar) theEObject;
			T result = caseUIVarchar(uiVarchar);
			if (result == null)
				result = caseTextUI(uiVarchar);
			if (result == null)
				result = caseRepresentationInterface(uiVarchar);
			if (result == null)
				result = caseUserInterface(uiVarchar);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementPackage.EDATE: {
			EDate eDate = (EDate) theEObject;
			T result = caseEDate(eDate);
			if (result == null)
				result = caseAttributes(eDate);
			if (result == null)
				result = caseEntity(eDate);
			if (result == null)
				result = caseDataType(eDate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementPackage.EBOOLEAN: {
			EBoolean eBoolean = (EBoolean) theEObject;
			T result = caseEBoolean(eBoolean);
			if (result == null)
				result = caseAttributes(eBoolean);
			if (result == null)
				result = caseEntity(eBoolean);
			if (result == null)
				result = caseDataType(eBoolean);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementPackage.ESTRING: {
			EString eString = (EString) theEObject;
			T result = caseEString(eString);
			if (result == null)
				result = caseAttributes(eString);
			if (result == null)
				result = caseEntity(eString);
			if (result == null)
				result = caseDataType(eString);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementPackage.EVARCHAR: {
			EVarchar eVarchar = (EVarchar) theEObject;
			T result = caseEVarchar(eVarchar);
			if (result == null)
				result = caseAttributes(eVarchar);
			if (result == null)
				result = caseEntity(eVarchar);
			if (result == null)
				result = caseDataType(eVarchar);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserInterface(UserInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Representation Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Representation Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepresentationInterface(RepresentationInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationInterface(CommunicationInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text UI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text UI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextUI(TextUI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image UI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image UI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageUI(ImageUI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageType(MessageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentType(DocumentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSetType(DataSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileMessage(FileMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageMessage(ImageMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextMessage(TextMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributes(Attributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Exchange Standard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Exchange Standard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageExchangeStandard(MessageExchangeStandard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Message Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Message Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventMessageType(EventMessageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIImage(UIImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIString(UIString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Varchar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Varchar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIVarchar(UIVarchar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDate(EDate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EBoolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EBoolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEBoolean(EBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EString</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EString</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEString(EString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EVarchar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EVarchar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEVarchar(EVarchar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EHealthManagementSwitch
