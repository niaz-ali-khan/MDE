/**
 */
package eHealthManagementV.util;

import eHealthManagementV.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eHealthManagementV.EHealthManagementVPackage
 * @generated
 */
public class EHealthManagementVAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EHealthManagementVPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EHealthManagementVAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EHealthManagementVPackage.eINSTANCE;
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
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EHealthManagementVSwitch<Adapter> modelSwitch = new EHealthManagementVSwitch<Adapter>() {
		@Override
		public Adapter caseUsers(Users object) {
			return createUsersAdapter();
		}

		@Override
		public Adapter caseUserInterfaces(UserInterfaces object) {
			return createUserInterfacesAdapter();
		}

		@Override
		public Adapter caseRepresentationInterfaces(RepresentationInterfaces object) {
			return createRepresentationInterfacesAdapter();
		}

		@Override
		public Adapter caseCommunicationInterfaces(CommunicationInterfaces object) {
			return createCommunicationInterfacesAdapter();
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
		public Adapter caseDocumentType(DocumentType object) {
			return createDocumentTypeAdapter();
		}

		@Override
		public Adapter caseDataSetType(DataSetType object) {
			return createDataSetTypeAdapter();
		}

		@Override
		public Adapter caseMessageType(MessageType object) {
			return createMessageTypeAdapter();
		}

		@Override
		public Adapter caseImageMessage(ImageMessage object) {
			return createImageMessageAdapter();
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
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.lang.Object <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.lang.Object
	 * @generated
	 */
	public Adapter createUsersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UserInterfaces <em>User Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UserInterfaces
	 * @generated
	 */
	public Adapter createUserInterfacesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RepresentationInterfaces <em>Representation Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RepresentationInterfaces
	 * @generated
	 */
	public Adapter createRepresentationInterfacesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CommunicationInterfaces <em>Communication Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CommunicationInterfaces
	 * @generated
	 */
	public Adapter createCommunicationInterfacesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImageUI <em>Image UI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImageUI
	 * @generated
	 */
	public Adapter createImageUIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TextUI <em>Text UI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TextUI
	 * @generated
	 */
	public Adapter createTextUIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link VideoUI <em>Video UI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see VideoUI
	 * @generated
	 */
	public Adapter createVideoUIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DocumentType <em>Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DocumentType
	 * @generated
	 */
	public Adapter createDocumentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DataSetType <em>Data Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DataSetType
	 * @generated
	 */
	public Adapter createDataSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MessageType
	 * @generated
	 */
	public Adapter createMessageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.lang.Object <em>Image Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.lang.Object
	 * @generated
	 */
	public Adapter createImageMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.lang.Object <em>Text Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.lang.Object
	 * @generated
	 */
	public Adapter createTextMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.lang.Object <em>File Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.lang.Object
	 * @generated
	 */
	public Adapter createFileMessageAdapter() {
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

} //EHealthManagementVAdapterFactory
