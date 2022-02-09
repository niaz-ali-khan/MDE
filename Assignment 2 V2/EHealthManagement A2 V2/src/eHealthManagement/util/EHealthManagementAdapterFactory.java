/**
 */
package eHealthManagement.util;

import eHealthManagement.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eHealthManagement.EHealthManagementPackage
 * @generated
 */
public class EHealthManagementAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EHealthManagementPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EHealthManagementAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EHealthManagementPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EHealthManagementSwitch<Adapter> modelSwitch =
		new EHealthManagementSwitch<Adapter>() {
			@Override
			public Adapter caseUserInterface(UserInterface object) {
				return createUserInterfaceAdapter();
			}
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter caseRepresentationInterface(RepresentationInterface object) {
				return createRepresentationInterfaceAdapter();
			}
			@Override
			public Adapter caseCommunicationInterface(CommunicationInterface object) {
				return createCommunicationInterfaceAdapter();
			}
			@Override
			public Adapter caseImageUI(ImageUI object) {
				return createImageUIAdapter();
			}
			@Override
			public Adapter caseTextUI(TextUI object) {
				return createTextUIAdapter();
			}
			@Override
			public Adapter caseVideoUI(VideoUI object) {
				return createVideoUIAdapter();
			}
			@Override
			public Adapter caseDatasetType(DatasetType object) {
				return createDatasetTypeAdapter();
			}
			@Override
			public Adapter caseDocumentType(DocumentType object) {
				return createDocumentTypeAdapter();
			}
			@Override
			public Adapter caseMessageType(MessageType object) {
				return createMessageTypeAdapter();
			}
			@Override
			public Adapter caseTextMessage(TextMessage object) {
				return createTextMessageAdapter();
			}
			@Override
			public Adapter caseFileMessage(FileMessage object) {
				return createFileMessageAdapter();
			}
			@Override
			public Adapter caseImageMessage(ImageMessage object) {
				return createImageMessageAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseMessageExchangeStandard(MessageExchangeStandard object) {
				return createMessageExchangeStandardAdapter();
			}
			@Override
			public Adapter caseEventMessageType(EventMessageType object) {
				return createEventMessageTypeAdapter();
			}
			@Override
			public Adapter caseCVarchar(CVarchar object) {
				return createCVarcharAdapter();
			}
			@Override
			public Adapter caseCString(CString object) {
				return createCStringAdapter();
			}
			@Override
			public Adapter caseCImage(CImage object) {
				return createCImageAdapter();
			}
			@Override
			public Adapter caseTest(Test object) {
				return createTestAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link eHealthManagement.UserInterface <em>User Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eHealthManagement.UserInterface
	 * @generated
	 */
	public Adapter createUserInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eHealthManagement.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eHealthManagement.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eHealthManagement.RepresentationInterface <em>Representation Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eHealthManagement.RepresentationInterface
	 * @generated
	 */
	public Adapter createRepresentationInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eHealthManagement.CommunicationInterface <em>Communication Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eHealthManagement.CommunicationInterface
	 * @generated
	 */
	public Adapter createCommunicationInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eHealthManagement.ImageUI <em>Image UI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eHealthManagement.ImageUI
	 * @generated
	 */
	public Adapter createImageUIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eHealthManagement.TextUI <em>Text UI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eHealthManagement.TextUI
	 * @generated
	 */
	public Adapter createTextUIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eHealthManagement.VideoUI <em>Video UI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eHealthManagement.VideoUI
	 * @generated
	 */
	public Adapter createVideoUIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eHealthManagement.DatasetType <em>Dataset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eHealthManagement.DatasetType
	 * @generated
	 */
	public Adapter createDatasetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eHealthManagement.DocumentType <em>Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eHealthManagement.DocumentType
	 * @generated
	 */
	public Adapter createDocumentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eHealthManagement.MessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eHealthManagement.MessageType
	 * @generated
	 */
	public Adapter createMessageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eHealthManagement.TextMessage <em>Text Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eHealthManagement.TextMessage
	 * @generated
	 */
	public Adapter createTextMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eHealthManagement.FileMessage <em>File Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eHealthManagement.FileMessage
	 * @generated
	 */
	public Adapter createFileMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eHealthManagement.ImageMessage <em>Image Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eHealthManagement.ImageMessage
	 * @generated
	 */
	public Adapter createImageMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eHealthManagement.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eHealthManagement.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eHealthManagement.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eHealthManagement.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eHealthManagement.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eHealthManagement.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eHealthManagement.MessageExchangeStandard <em>Message Exchange Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eHealthManagement.MessageExchangeStandard
	 * @generated
	 */
	public Adapter createMessageExchangeStandardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eHealthManagement.EventMessageType <em>Event Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eHealthManagement.EventMessageType
	 * @generated
	 */
	public Adapter createEventMessageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eHealthManagement.CVarchar <em>CVarchar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eHealthManagement.CVarchar
	 * @generated
	 */
	public Adapter createCVarcharAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eHealthManagement.CString <em>CString</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eHealthManagement.CString
	 * @generated
	 */
	public Adapter createCStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eHealthManagement.CImage <em>CImage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eHealthManagement.CImage
	 * @generated
	 */
	public Adapter createCImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eHealthManagement.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eHealthManagement.Test
	 * @generated
	 */
	public Adapter createTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EHealthManagementAdapterFactory
