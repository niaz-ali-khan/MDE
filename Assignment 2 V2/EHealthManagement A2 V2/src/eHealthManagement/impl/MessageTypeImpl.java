/**
 */
package eHealthManagement.impl;

import eHealthManagement.EHealthManagementPackage;
import eHealthManagement.FileMessage;
import eHealthManagement.ImageMessage;
import eHealthManagement.MessageType;
import eHealthManagement.TextMessage;

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
 * An implementation of the model object '<em><b>Message Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.impl.MessageTypeImpl#getMessageTypeName <em>Message Type Name</em>}</li>
 *   <li>{@link eHealthManagement.impl.MessageTypeImpl#getMessageTypeSize <em>Message Type Size</em>}</li>
 *   <li>{@link eHealthManagement.impl.MessageTypeImpl#getImagemessge <em>Imagemessge</em>}</li>
 *   <li>{@link eHealthManagement.impl.MessageTypeImpl#getFilemessage <em>Filemessage</em>}</li>
 *   <li>{@link eHealthManagement.impl.MessageTypeImpl#getTextmessage <em>Textmessage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageTypeImpl extends MinimalEObjectImpl.Container implements MessageType {
	/**
	 * The default value of the '{@link #getMessageTypeName() <em>Message Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageTypeName() <em>Message Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageTypeName()
	 * @generated
	 * @ordered
	 */
	protected String messageTypeName = MESSAGE_TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageTypeSize() <em>Message Type Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageTypeSize()
	 * @generated
	 * @ordered
	 */
	protected static final long MESSAGE_TYPE_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMessageTypeSize() <em>Message Type Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageTypeSize()
	 * @generated
	 * @ordered
	 */
	protected long messageTypeSize = MESSAGE_TYPE_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImagemessge() <em>Imagemessge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagemessge()
	 * @generated
	 * @ordered
	 */
	protected EList<ImageMessage> imagemessge;

	/**
	 * The cached value of the '{@link #getFilemessage() <em>Filemessage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilemessage()
	 * @generated
	 * @ordered
	 */
	protected EList<FileMessage> filemessage;

	/**
	 * The cached value of the '{@link #getTextmessage() <em>Textmessage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextmessage()
	 * @generated
	 * @ordered
	 */
	protected EList<TextMessage> textmessage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementPackage.Literals.MESSAGE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageTypeName() {
		return messageTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageTypeName(String newMessageTypeName) {
		String oldMessageTypeName = messageTypeName;
		messageTypeName = newMessageTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.MESSAGE_TYPE__MESSAGE_TYPE_NAME, oldMessageTypeName, messageTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMessageTypeSize() {
		return messageTypeSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageTypeSize(long newMessageTypeSize) {
		long oldMessageTypeSize = messageTypeSize;
		messageTypeSize = newMessageTypeSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.MESSAGE_TYPE__MESSAGE_TYPE_SIZE, oldMessageTypeSize, messageTypeSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImageMessage> getImagemessge() {
		if (imagemessge == null) {
			imagemessge = new EObjectContainmentEList<ImageMessage>(ImageMessage.class, this, EHealthManagementPackage.MESSAGE_TYPE__IMAGEMESSGE);
		}
		return imagemessge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FileMessage> getFilemessage() {
		if (filemessage == null) {
			filemessage = new EObjectContainmentEList<FileMessage>(FileMessage.class, this, EHealthManagementPackage.MESSAGE_TYPE__FILEMESSAGE);
		}
		return filemessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextMessage> getTextmessage() {
		if (textmessage == null) {
			textmessage = new EObjectContainmentEList<TextMessage>(TextMessage.class, this, EHealthManagementPackage.MESSAGE_TYPE__TEXTMESSAGE);
		}
		return textmessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EHealthManagementPackage.MESSAGE_TYPE__IMAGEMESSGE:
				return ((InternalEList<?>)getImagemessge()).basicRemove(otherEnd, msgs);
			case EHealthManagementPackage.MESSAGE_TYPE__FILEMESSAGE:
				return ((InternalEList<?>)getFilemessage()).basicRemove(otherEnd, msgs);
			case EHealthManagementPackage.MESSAGE_TYPE__TEXTMESSAGE:
				return ((InternalEList<?>)getTextmessage()).basicRemove(otherEnd, msgs);
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
			case EHealthManagementPackage.MESSAGE_TYPE__MESSAGE_TYPE_NAME:
				return getMessageTypeName();
			case EHealthManagementPackage.MESSAGE_TYPE__MESSAGE_TYPE_SIZE:
				return getMessageTypeSize();
			case EHealthManagementPackage.MESSAGE_TYPE__IMAGEMESSGE:
				return getImagemessge();
			case EHealthManagementPackage.MESSAGE_TYPE__FILEMESSAGE:
				return getFilemessage();
			case EHealthManagementPackage.MESSAGE_TYPE__TEXTMESSAGE:
				return getTextmessage();
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
			case EHealthManagementPackage.MESSAGE_TYPE__MESSAGE_TYPE_NAME:
				setMessageTypeName((String)newValue);
				return;
			case EHealthManagementPackage.MESSAGE_TYPE__MESSAGE_TYPE_SIZE:
				setMessageTypeSize((Long)newValue);
				return;
			case EHealthManagementPackage.MESSAGE_TYPE__IMAGEMESSGE:
				getImagemessge().clear();
				getImagemessge().addAll((Collection<? extends ImageMessage>)newValue);
				return;
			case EHealthManagementPackage.MESSAGE_TYPE__FILEMESSAGE:
				getFilemessage().clear();
				getFilemessage().addAll((Collection<? extends FileMessage>)newValue);
				return;
			case EHealthManagementPackage.MESSAGE_TYPE__TEXTMESSAGE:
				getTextmessage().clear();
				getTextmessage().addAll((Collection<? extends TextMessage>)newValue);
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
			case EHealthManagementPackage.MESSAGE_TYPE__MESSAGE_TYPE_NAME:
				setMessageTypeName(MESSAGE_TYPE_NAME_EDEFAULT);
				return;
			case EHealthManagementPackage.MESSAGE_TYPE__MESSAGE_TYPE_SIZE:
				setMessageTypeSize(MESSAGE_TYPE_SIZE_EDEFAULT);
				return;
			case EHealthManagementPackage.MESSAGE_TYPE__IMAGEMESSGE:
				getImagemessge().clear();
				return;
			case EHealthManagementPackage.MESSAGE_TYPE__FILEMESSAGE:
				getFilemessage().clear();
				return;
			case EHealthManagementPackage.MESSAGE_TYPE__TEXTMESSAGE:
				getTextmessage().clear();
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
			case EHealthManagementPackage.MESSAGE_TYPE__MESSAGE_TYPE_NAME:
				return MESSAGE_TYPE_NAME_EDEFAULT == null ? messageTypeName != null : !MESSAGE_TYPE_NAME_EDEFAULT.equals(messageTypeName);
			case EHealthManagementPackage.MESSAGE_TYPE__MESSAGE_TYPE_SIZE:
				return messageTypeSize != MESSAGE_TYPE_SIZE_EDEFAULT;
			case EHealthManagementPackage.MESSAGE_TYPE__IMAGEMESSGE:
				return imagemessge != null && !imagemessge.isEmpty();
			case EHealthManagementPackage.MESSAGE_TYPE__FILEMESSAGE:
				return filemessage != null && !filemessage.isEmpty();
			case EHealthManagementPackage.MESSAGE_TYPE__TEXTMESSAGE:
				return textmessage != null && !textmessage.isEmpty();
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
		result.append(" (MessageTypeName: ");
		result.append(messageTypeName);
		result.append(", MessageTypeSize: ");
		result.append(messageTypeSize);
		result.append(')');
		return result.toString();
	}

} //MessageTypeImpl
