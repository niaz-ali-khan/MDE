/**
 */
package eHealthManagement.impl;

import eHealthManagement.AllowedCommunicationInterfaceTypes;
import eHealthManagement.CommunicationInterface;
import eHealthManagement.EHealthManagementPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.impl.CommunicationInterfaceImpl#getCommunicationInterfaces <em>Communication Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationInterfaceImpl extends UserInterfaceImpl implements CommunicationInterface {
	/**
	 * The default value of the '{@link #getCommunicationInterfaces() <em>Communication Interfaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationInterfaces()
	 * @generated
	 * @ordered
	 */
	protected static final AllowedCommunicationInterfaceTypes COMMUNICATION_INTERFACES_EDEFAULT = AllowedCommunicationInterfaceTypes.COMMUNICATION_VIEW;

	/**
	 * The cached value of the '{@link #getCommunicationInterfaces() <em>Communication Interfaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationInterfaces()
	 * @generated
	 * @ordered
	 */
	protected AllowedCommunicationInterfaceTypes communicationInterfaces = COMMUNICATION_INTERFACES_EDEFAULT;

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
	public AllowedCommunicationInterfaceTypes getCommunicationInterfaces() {
		return communicationInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationInterfaces(AllowedCommunicationInterfaceTypes newCommunicationInterfaces) {
		AllowedCommunicationInterfaceTypes oldCommunicationInterfaces = communicationInterfaces;
		communicationInterfaces = newCommunicationInterfaces == null ? COMMUNICATION_INTERFACES_EDEFAULT
				: newCommunicationInterfaces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EHealthManagementPackage.COMMUNICATION_INTERFACE__COMMUNICATION_INTERFACES,
					oldCommunicationInterfaces, communicationInterfaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EHealthManagementPackage.COMMUNICATION_INTERFACE__COMMUNICATION_INTERFACES:
			return getCommunicationInterfaces();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EHealthManagementPackage.COMMUNICATION_INTERFACE__COMMUNICATION_INTERFACES:
			setCommunicationInterfaces((AllowedCommunicationInterfaceTypes) newValue);
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
		case EHealthManagementPackage.COMMUNICATION_INTERFACE__COMMUNICATION_INTERFACES:
			setCommunicationInterfaces(COMMUNICATION_INTERFACES_EDEFAULT);
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
		case EHealthManagementPackage.COMMUNICATION_INTERFACE__COMMUNICATION_INTERFACES:
			return communicationInterfaces != COMMUNICATION_INTERFACES_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (CommunicationInterfaces: ");
		result.append(communicationInterfaces);
		result.append(')');
		return result.toString();
	}

} //CommunicationInterfaceImpl
