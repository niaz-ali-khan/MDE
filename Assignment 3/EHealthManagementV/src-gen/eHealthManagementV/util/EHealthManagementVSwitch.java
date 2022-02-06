/**
 */
package eHealthManagementV.util;

import eHealthManagementV.*;

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
 * @see eHealthManagementV.EHealthManagementVPackage
 * @generated
 */
public class EHealthManagementVSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EHealthManagementVPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EHealthManagementVSwitch() {
		if (modelPackage == null) {
			modelPackage = EHealthManagementVPackage.eINSTANCE;
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
		case EHealthManagementVPackage.USERS: {
			Users users = (Users) theEObject;
			T result = caseUsers(users);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementVPackage.USER_INTERFACES: {
			UserInterfaces userInterfaces = (UserInterfaces) theEObject;
			T result = caseUserInterfaces(userInterfaces);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementVPackage.REPRESENTATION_INTERFACES: {
			RepresentationInterfaces representationInterfaces = (RepresentationInterfaces) theEObject;
			T result = caseRepresentationInterfaces(representationInterfaces);
			if (result == null)
				result = caseUserInterfaces(representationInterfaces);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementVPackage.COMMUNICATION_INTERFACES: {
			CommunicationInterfaces communicationInterfaces = (CommunicationInterfaces) theEObject;
			T result = caseCommunicationInterfaces(communicationInterfaces);
			if (result == null)
				result = caseUserInterfaces(communicationInterfaces);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementVPackage.IMAGE_UI: {
			ImageUI imageUI = (ImageUI) theEObject;
			T result = caseImageUI(imageUI);
			if (result == null)
				result = caseRepresentationInterfaces(imageUI);
			if (result == null)
				result = caseUserInterfaces(imageUI);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementVPackage.TEXT_UI: {
			TextUI textUI = (TextUI) theEObject;
			T result = caseTextUI(textUI);
			if (result == null)
				result = caseRepresentationInterfaces(textUI);
			if (result == null)
				result = caseUserInterfaces(textUI);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementVPackage.VIDEO_UI: {
			VideoUI videoUI = (VideoUI) theEObject;
			T result = caseVideoUI(videoUI);
			if (result == null)
				result = caseRepresentationInterfaces(videoUI);
			if (result == null)
				result = caseUserInterfaces(videoUI);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementVPackage.DOCUMENT_TYPE: {
			DocumentType documentType = (DocumentType) theEObject;
			T result = caseDocumentType(documentType);
			if (result == null)
				result = caseCommunicationInterfaces(documentType);
			if (result == null)
				result = caseUserInterfaces(documentType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementVPackage.DATA_SET_TYPE: {
			DataSetType dataSetType = (DataSetType) theEObject;
			T result = caseDataSetType(dataSetType);
			if (result == null)
				result = caseCommunicationInterfaces(dataSetType);
			if (result == null)
				result = caseUserInterfaces(dataSetType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementVPackage.MESSAGE_TYPE: {
			MessageType messageType = (MessageType) theEObject;
			T result = caseMessageType(messageType);
			if (result == null)
				result = caseCommunicationInterfaces(messageType);
			if (result == null)
				result = caseUserInterfaces(messageType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementVPackage.IMAGE_MESSAGE: {
			ImageMessage imageMessage = (ImageMessage) theEObject;
			T result = caseImageMessage(imageMessage);
			if (result == null)
				result = caseMessageType(imageMessage);
			if (result == null)
				result = caseCommunicationInterfaces(imageMessage);
			if (result == null)
				result = caseUserInterfaces(imageMessage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementVPackage.TEXT_MESSAGE: {
			TextMessage textMessage = (TextMessage) theEObject;
			T result = caseTextMessage(textMessage);
			if (result == null)
				result = caseMessageType(textMessage);
			if (result == null)
				result = caseCommunicationInterfaces(textMessage);
			if (result == null)
				result = caseUserInterfaces(textMessage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EHealthManagementVPackage.FILE_MESSAGE: {
			FileMessage fileMessage = (FileMessage) theEObject;
			T result = caseFileMessage(fileMessage);
			if (result == null)
				result = caseMessageType(fileMessage);
			if (result == null)
				result = caseCommunicationInterfaces(fileMessage);
			if (result == null)
				result = caseUserInterfaces(fileMessage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Users</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Users</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsers(Users object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Interfaces</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Interfaces</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserInterfaces(UserInterfaces object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Representation Interfaces</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Representation Interfaces</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepresentationInterfaces(RepresentationInterfaces object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Interfaces</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Interfaces</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationInterfaces(CommunicationInterfaces object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Video UI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video UI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideoUI(VideoUI object) {
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

} //EHealthManagementVSwitch
