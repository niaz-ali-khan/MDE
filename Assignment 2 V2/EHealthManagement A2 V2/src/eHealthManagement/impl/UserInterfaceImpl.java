/**
 */
package eHealthManagement.impl;

import eHealthManagement.AllowedUserInterface;
import eHealthManagement.CommunicationInterface;
import eHealthManagement.DataType;
import eHealthManagement.EHealthManagementPackage;
import eHealthManagement.MessageExchangeStandard;
import eHealthManagement.RepresentationInterface;
import eHealthManagement.User;
import eHealthManagement.UserInterface;

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
 * An implementation of the model object '<em><b>User Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.impl.UserInterfaceImpl#getUserInterfaceType <em>User Interface Type</em>}</li>
 *   <li>{@link eHealthManagement.impl.UserInterfaceImpl#isUserInterfaceValidity <em>User Interface Validity</em>}</li>
 *   <li>{@link eHealthManagement.impl.UserInterfaceImpl#getUser <em>User</em>}</li>
 *   <li>{@link eHealthManagement.impl.UserInterfaceImpl#getRepresentationinterface <em>Representationinterface</em>}</li>
 *   <li>{@link eHealthManagement.impl.UserInterfaceImpl#getCommunicationinterface <em>Communicationinterface</em>}</li>
 *   <li>{@link eHealthManagement.impl.UserInterfaceImpl#getMessageexchangestandard <em>Messageexchangestandard</em>}</li>
 *   <li>{@link eHealthManagement.impl.UserInterfaceImpl#getDatatype <em>Datatype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserInterfaceImpl extends MinimalEObjectImpl.Container implements UserInterface {
	/**
	 * The default value of the '{@link #getUserInterfaceType() <em>User Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserInterfaceType()
	 * @generated
	 * @ordered
	 */
	protected static final AllowedUserInterface USER_INTERFACE_TYPE_EDEFAULT = AllowedUserInterface.PROFILE_VIEW;

	/**
	 * The cached value of the '{@link #getUserInterfaceType() <em>User Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserInterfaceType()
	 * @generated
	 * @ordered
	 */
	protected AllowedUserInterface userInterfaceType = USER_INTERFACE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUserInterfaceValidity() <em>User Interface Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUserInterfaceValidity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USER_INTERFACE_VALIDITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUserInterfaceValidity() <em>User Interface Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUserInterfaceValidity()
	 * @generated
	 * @ordered
	 */
	protected boolean userInterfaceValidity = USER_INTERFACE_VALIDITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected User user;

	/**
	 * The cached value of the '{@link #getRepresentationinterface() <em>Representationinterface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationinterface()
	 * @generated
	 * @ordered
	 */
	protected EList<RepresentationInterface> representationinterface;

	/**
	 * The cached value of the '{@link #getCommunicationinterface() <em>Communicationinterface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationinterface()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationInterface> communicationinterface;

	/**
	 * The cached value of the '{@link #getMessageexchangestandard() <em>Messageexchangestandard</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageexchangestandard()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageExchangeStandard> messageexchangestandard;

	/**
	 * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> datatype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementPackage.Literals.USER_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowedUserInterface getUserInterfaceType() {
		return userInterfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserInterfaceType(AllowedUserInterface newUserInterfaceType) {
		AllowedUserInterface oldUserInterfaceType = userInterfaceType;
		userInterfaceType = newUserInterfaceType == null ? USER_INTERFACE_TYPE_EDEFAULT : newUserInterfaceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.USER_INTERFACE__USER_INTERFACE_TYPE, oldUserInterfaceType, userInterfaceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUserInterfaceValidity() {
		return userInterfaceValidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserInterfaceValidity(boolean newUserInterfaceValidity) {
		boolean oldUserInterfaceValidity = userInterfaceValidity;
		userInterfaceValidity = newUserInterfaceValidity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.USER_INTERFACE__USER_INTERFACE_VALIDITY, oldUserInterfaceValidity, userInterfaceValidity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getUser() {
		if (user != null && user.eIsProxy()) {
			InternalEObject oldUser = (InternalEObject)user;
			user = (User)eResolveProxy(oldUser);
			if (user != oldUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EHealthManagementPackage.USER_INTERFACE__USER, oldUser, user));
			}
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(User newUser) {
		User oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.USER_INTERFACE__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RepresentationInterface> getRepresentationinterface() {
		if (representationinterface == null) {
			representationinterface = new EObjectContainmentEList<RepresentationInterface>(RepresentationInterface.class, this, EHealthManagementPackage.USER_INTERFACE__REPRESENTATIONINTERFACE);
		}
		return representationinterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationInterface> getCommunicationinterface() {
		if (communicationinterface == null) {
			communicationinterface = new EObjectContainmentEList<CommunicationInterface>(CommunicationInterface.class, this, EHealthManagementPackage.USER_INTERFACE__COMMUNICATIONINTERFACE);
		}
		return communicationinterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageExchangeStandard> getMessageexchangestandard() {
		if (messageexchangestandard == null) {
			messageexchangestandard = new EObjectContainmentEList<MessageExchangeStandard>(MessageExchangeStandard.class, this, EHealthManagementPackage.USER_INTERFACE__MESSAGEEXCHANGESTANDARD);
		}
		return messageexchangestandard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getDatatype() {
		if (datatype == null) {
			datatype = new EObjectContainmentEList<DataType>(DataType.class, this, EHealthManagementPackage.USER_INTERFACE__DATATYPE);
		}
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EHealthManagementPackage.USER_INTERFACE__REPRESENTATIONINTERFACE:
				return ((InternalEList<?>)getRepresentationinterface()).basicRemove(otherEnd, msgs);
			case EHealthManagementPackage.USER_INTERFACE__COMMUNICATIONINTERFACE:
				return ((InternalEList<?>)getCommunicationinterface()).basicRemove(otherEnd, msgs);
			case EHealthManagementPackage.USER_INTERFACE__MESSAGEEXCHANGESTANDARD:
				return ((InternalEList<?>)getMessageexchangestandard()).basicRemove(otherEnd, msgs);
			case EHealthManagementPackage.USER_INTERFACE__DATATYPE:
				return ((InternalEList<?>)getDatatype()).basicRemove(otherEnd, msgs);
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
			case EHealthManagementPackage.USER_INTERFACE__USER_INTERFACE_TYPE:
				return getUserInterfaceType();
			case EHealthManagementPackage.USER_INTERFACE__USER_INTERFACE_VALIDITY:
				return isUserInterfaceValidity();
			case EHealthManagementPackage.USER_INTERFACE__USER:
				if (resolve) return getUser();
				return basicGetUser();
			case EHealthManagementPackage.USER_INTERFACE__REPRESENTATIONINTERFACE:
				return getRepresentationinterface();
			case EHealthManagementPackage.USER_INTERFACE__COMMUNICATIONINTERFACE:
				return getCommunicationinterface();
			case EHealthManagementPackage.USER_INTERFACE__MESSAGEEXCHANGESTANDARD:
				return getMessageexchangestandard();
			case EHealthManagementPackage.USER_INTERFACE__DATATYPE:
				return getDatatype();
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
			case EHealthManagementPackage.USER_INTERFACE__USER_INTERFACE_TYPE:
				setUserInterfaceType((AllowedUserInterface)newValue);
				return;
			case EHealthManagementPackage.USER_INTERFACE__USER_INTERFACE_VALIDITY:
				setUserInterfaceValidity((Boolean)newValue);
				return;
			case EHealthManagementPackage.USER_INTERFACE__USER:
				setUser((User)newValue);
				return;
			case EHealthManagementPackage.USER_INTERFACE__REPRESENTATIONINTERFACE:
				getRepresentationinterface().clear();
				getRepresentationinterface().addAll((Collection<? extends RepresentationInterface>)newValue);
				return;
			case EHealthManagementPackage.USER_INTERFACE__COMMUNICATIONINTERFACE:
				getCommunicationinterface().clear();
				getCommunicationinterface().addAll((Collection<? extends CommunicationInterface>)newValue);
				return;
			case EHealthManagementPackage.USER_INTERFACE__MESSAGEEXCHANGESTANDARD:
				getMessageexchangestandard().clear();
				getMessageexchangestandard().addAll((Collection<? extends MessageExchangeStandard>)newValue);
				return;
			case EHealthManagementPackage.USER_INTERFACE__DATATYPE:
				getDatatype().clear();
				getDatatype().addAll((Collection<? extends DataType>)newValue);
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
			case EHealthManagementPackage.USER_INTERFACE__USER_INTERFACE_TYPE:
				setUserInterfaceType(USER_INTERFACE_TYPE_EDEFAULT);
				return;
			case EHealthManagementPackage.USER_INTERFACE__USER_INTERFACE_VALIDITY:
				setUserInterfaceValidity(USER_INTERFACE_VALIDITY_EDEFAULT);
				return;
			case EHealthManagementPackage.USER_INTERFACE__USER:
				setUser((User)null);
				return;
			case EHealthManagementPackage.USER_INTERFACE__REPRESENTATIONINTERFACE:
				getRepresentationinterface().clear();
				return;
			case EHealthManagementPackage.USER_INTERFACE__COMMUNICATIONINTERFACE:
				getCommunicationinterface().clear();
				return;
			case EHealthManagementPackage.USER_INTERFACE__MESSAGEEXCHANGESTANDARD:
				getMessageexchangestandard().clear();
				return;
			case EHealthManagementPackage.USER_INTERFACE__DATATYPE:
				getDatatype().clear();
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
			case EHealthManagementPackage.USER_INTERFACE__USER_INTERFACE_TYPE:
				return userInterfaceType != USER_INTERFACE_TYPE_EDEFAULT;
			case EHealthManagementPackage.USER_INTERFACE__USER_INTERFACE_VALIDITY:
				return userInterfaceValidity != USER_INTERFACE_VALIDITY_EDEFAULT;
			case EHealthManagementPackage.USER_INTERFACE__USER:
				return user != null;
			case EHealthManagementPackage.USER_INTERFACE__REPRESENTATIONINTERFACE:
				return representationinterface != null && !representationinterface.isEmpty();
			case EHealthManagementPackage.USER_INTERFACE__COMMUNICATIONINTERFACE:
				return communicationinterface != null && !communicationinterface.isEmpty();
			case EHealthManagementPackage.USER_INTERFACE__MESSAGEEXCHANGESTANDARD:
				return messageexchangestandard != null && !messageexchangestandard.isEmpty();
			case EHealthManagementPackage.USER_INTERFACE__DATATYPE:
				return datatype != null && !datatype.isEmpty();
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
		result.append(" (UserInterfaceType: ");
		result.append(userInterfaceType);
		result.append(", UserInterfaceValidity: ");
		result.append(userInterfaceValidity);
		result.append(')');
		return result.toString();
	}

} //UserInterfaceImpl
