/**
 */
package eHealthManagement.impl;

import eHealthManagement.AllowedCommunicationInterfaceType;
import eHealthManagement.CommunicationInterface;
import eHealthManagement.DatasetType;
import eHealthManagement.DocumentType;
import eHealthManagement.EHealthManagementPackage;
import eHealthManagement.MessageType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.impl.CommunicationInterfaceImpl#getCommunicationInterfaceType <em>Communication Interface Type</em>}</li>
 *   <li>{@link eHealthManagement.impl.CommunicationInterfaceImpl#isCommunicationInterfaceValidity <em>Communication Interface Validity</em>}</li>
 *   <li>{@link eHealthManagement.impl.CommunicationInterfaceImpl#getMessagetype <em>Messagetype</em>}</li>
 *   <li>{@link eHealthManagement.impl.CommunicationInterfaceImpl#getDocumenttype <em>Documenttype</em>}</li>
 *   <li>{@link eHealthManagement.impl.CommunicationInterfaceImpl#getDatasettype <em>Datasettype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationInterfaceImpl extends MinimalEObjectImpl.Container implements CommunicationInterface {
	/**
	 * The default value of the '{@link #getCommunicationInterfaceType() <em>Communication Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationInterfaceType()
	 * @generated
	 * @ordered
	 */
	protected static final AllowedCommunicationInterfaceType COMMUNICATION_INTERFACE_TYPE_EDEFAULT = AllowedCommunicationInterfaceType.COMMUNICATION_VIEW;

	/**
	 * The cached value of the '{@link #getCommunicationInterfaceType() <em>Communication Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationInterfaceType()
	 * @generated
	 * @ordered
	 */
	protected AllowedCommunicationInterfaceType communicationInterfaceType = COMMUNICATION_INTERFACE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCommunicationInterfaceValidity() <em>Communication Interface Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCommunicationInterfaceValidity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMMUNICATION_INTERFACE_VALIDITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCommunicationInterfaceValidity() <em>Communication Interface Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCommunicationInterfaceValidity()
	 * @generated
	 * @ordered
	 */
	protected boolean communicationInterfaceValidity = COMMUNICATION_INTERFACE_VALIDITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMessagetype() <em>Messagetype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessagetype()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageType> messagetype;

	/**
	 * The cached value of the '{@link #getDocumenttype() <em>Documenttype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumenttype()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentType> documenttype;

	/**
	 * The cached value of the '{@link #getDatasettype() <em>Datasettype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasettype()
	 * @generated
	 * @ordered
	 */
	protected EList<DatasetType> datasettype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementPackage.Literals.COMMUNICATION_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowedCommunicationInterfaceType getCommunicationInterfaceType() {
		return communicationInterfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationInterfaceType(AllowedCommunicationInterfaceType newCommunicationInterfaceType) {
		AllowedCommunicationInterfaceType oldCommunicationInterfaceType = communicationInterfaceType;
		communicationInterfaceType = newCommunicationInterfaceType == null ? COMMUNICATION_INTERFACE_TYPE_EDEFAULT : newCommunicationInterfaceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.COMMUNICATION_INTERFACE__COMMUNICATION_INTERFACE_TYPE, oldCommunicationInterfaceType, communicationInterfaceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCommunicationInterfaceValidity() {
		return communicationInterfaceValidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationInterfaceValidity(boolean newCommunicationInterfaceValidity) {
		boolean oldCommunicationInterfaceValidity = communicationInterfaceValidity;
		communicationInterfaceValidity = newCommunicationInterfaceValidity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.COMMUNICATION_INTERFACE__COMMUNICATION_INTERFACE_VALIDITY, oldCommunicationInterfaceValidity, communicationInterfaceValidity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageType> getMessagetype() {
		if (messagetype == null) {
			messagetype = new EObjectContainmentEList<MessageType>(MessageType.class, this, EHealthManagementPackage.COMMUNICATION_INTERFACE__MESSAGETYPE);
		}
		return messagetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentType> getDocumenttype() {
		if (documenttype == null) {
			documenttype = new EObjectContainmentEList<DocumentType>(DocumentType.class, this, EHealthManagementPackage.COMMUNICATION_INTERFACE__DOCUMENTTYPE);
		}
		return documenttype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatasetType> getDatasettype() {
		if (datasettype == null) {
			datasettype = new EObjectContainmentEList<DatasetType>(DatasetType.class, this, EHealthManagementPackage.COMMUNICATION_INTERFACE__DATASETTYPE);
		}
		return datasettype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EHealthManagementPackage.COMMUNICATION_INTERFACE__MESSAGETYPE:
				return ((InternalEList<?>)getMessagetype()).basicRemove(otherEnd, msgs);
			case EHealthManagementPackage.COMMUNICATION_INTERFACE__DOCUMENTTYPE:
				return ((InternalEList<?>)getDocumenttype()).basicRemove(otherEnd, msgs);
			case EHealthManagementPackage.COMMUNICATION_INTERFACE__DATASETTYPE:
				return ((InternalEList<?>)getDatasettype()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EHealthManagementPackage.COMMUNICATION_INTERFACE__COMMUNICATION_INTERFACE_TYPE:
				return getCommunicationInterfaceType();
			case EHealthManagementPackage.COMMUNICATION_INTERFACE__COMMUNICATION_INTERFACE_VALIDITY:
				return isCommunicationInterfaceValidity();
			case EHealthManagementPackage.COMMUNICATION_INTERFACE__MESSAGETYPE:
				return getMessagetype();
			case EHealthManagementPackage.COMMUNICATION_INTERFACE__DOCUMENTTYPE:
				return getDocumenttype();
			case EHealthManagementPackage.COMMUNICATION_INTERFACE__DATASETTYPE:
				return getDatasettype();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EHealthManagementPackage.COMMUNICATION_INTERFACE__COMMUNICATION_INTERFACE_TYPE:
				setCommunicationInterfaceType((AllowedCommunicationInterfaceType)newValue);
				return;
			case EHealthManagementPackage.COMMUNICATION_INTERFACE__COMMUNICATION_INTERFACE_VALIDITY:
				setCommunicationInterfaceValidity((Boolean)newValue);
				return;
			case EHealthManagementPackage.COMMUNICATION_INTERFACE__MESSAGETYPE:
				getMessagetype().clear();
				getMessagetype().addAll((Collection<? extends MessageType>)newValue);
				return;
			case EHealthManagementPackage.COMMUNICATION_INTERFACE__DOCUMENTTYPE:
				getDocumenttype().clear();
				getDocumenttype().addAll((Collection<? extends DocumentType>)newValue);
				return;
			case EHealthManagementPackage.COMMUNICATION_INTERFACE__DATASETTYPE:
				getDatasettype().clear();
				getDatasettype().addAll((Collection<? extends DatasetType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EHealthManagementPackage.COMMUNICATION_INTERFACE__COMMUNICATION_INTERFACE_TYPE:
				setCommunicationInterfaceType(COMMUNICATION_INTERFACE_TYPE_EDEFAULT);
				return;
			case EHealthManagementPackage.COMMUNICATION_INTERFACE__COMMUNICATION_INTERFACE_VALIDITY:
				setCommunicationInterfaceValidity(COMMUNICATION_INTERFACE_VALIDITY_EDEFAULT);
				return;
			case EHealthManagementPackage.COMMUNICATION_INTERFACE__MESSAGETYPE:
				getMessagetype().clear();
				return;
			case EHealthManagementPackage.COMMUNICATION_INTERFACE__DOCUMENTTYPE:
				getDocumenttype().clear();
				return;
			case EHealthManagementPackage.COMMUNICATION_INTERFACE__DATASETTYPE:
				getDatasettype().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EHealthManagementPackage.COMMUNICATION_INTERFACE__COMMUNICATION_INTERFACE_TYPE:
				return communicationInterfaceType != COMMUNICATION_INTERFACE_TYPE_EDEFAULT;
			case EHealthManagementPackage.COMMUNICATION_INTERFACE__COMMUNICATION_INTERFACE_VALIDITY:
				return communicationInterfaceValidity != COMMUNICATION_INTERFACE_VALIDITY_EDEFAULT;
			case EHealthManagementPackage.COMMUNICATION_INTERFACE__MESSAGETYPE:
				return messagetype != null && !messagetype.isEmpty();
			case EHealthManagementPackage.COMMUNICATION_INTERFACE__DOCUMENTTYPE:
				return documenttype != null && !documenttype.isEmpty();
			case EHealthManagementPackage.COMMUNICATION_INTERFACE__DATASETTYPE:
				return datasettype != null && !datasettype.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (CommunicationInterfaceType: ");
		result.append(communicationInterfaceType);
		result.append(", CommunicationInterfaceValidity: ");
		result.append(communicationInterfaceValidity);
		result.append(')');
		return result.toString();
	}

} //CommunicationInterfaceImpl
