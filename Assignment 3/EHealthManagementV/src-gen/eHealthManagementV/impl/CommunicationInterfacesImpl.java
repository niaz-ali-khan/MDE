/**
 */
package eHealthManagementV.impl;

import eHealthManagementV.AllowedCommunicationInterfaceTypes;
import eHealthManagementV.EHealthManagementVPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Interfaces</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagementV.impl.CommunicationInterfacesImpl#getCommunicationInterfacesTypes <em>Communication Interfaces Types</em>}</li>
 *   <li>{@link eHealthManagementV.impl.CommunicationInterfacesImpl#isCommunicationInterfacesValidity <em>Communication Interfaces Validity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationInterfacesImpl extends UserInterfacesImpl implements CommunicationInterfaces {
	/**
	 * The default value of the '{@link #getCommunicationInterfacesTypes() <em>Communication Interfaces Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationInterfacesTypes()
	 * @generated
	 * @ordered
	 */
	protected static final AllowedCommunicationInterfaceTypes COMMUNICATION_INTERFACES_TYPES_EDEFAULT = AllowedCommunicationInterfaceTypes.COMMUNICATION_VIEW;

	/**
	 * The cached value of the '{@link #getCommunicationInterfacesTypes() <em>Communication Interfaces Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationInterfacesTypes()
	 * @generated
	 * @ordered
	 */
	protected AllowedCommunicationInterfaceTypes communicationInterfacesTypes = COMMUNICATION_INTERFACES_TYPES_EDEFAULT;

	/**
	 * The default value of the '{@link #isCommunicationInterfacesValidity() <em>Communication Interfaces Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCommunicationInterfacesValidity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMMUNICATION_INTERFACES_VALIDITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCommunicationInterfacesValidity() <em>Communication Interfaces Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCommunicationInterfacesValidity()
	 * @generated
	 * @ordered
	 */
	protected boolean communicationInterfacesValidity = COMMUNICATION_INTERFACES_VALIDITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationInterfacesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementVPackage.Literals.COMMUNICATION_INTERFACES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowedCommunicationInterfaceTypes getCommunicationInterfacesTypes() {
		return communicationInterfacesTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationInterfacesTypes(AllowedCommunicationInterfaceTypes newCommunicationInterfacesTypes) {
		AllowedCommunicationInterfaceTypes oldCommunicationInterfacesTypes = communicationInterfacesTypes;
		communicationInterfacesTypes = newCommunicationInterfacesTypes == null ? COMMUNICATION_INTERFACES_TYPES_EDEFAULT
				: newCommunicationInterfacesTypes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EHealthManagementVPackage.COMMUNICATION_INTERFACES__COMMUNICATION_INTERFACES_TYPES,
					oldCommunicationInterfacesTypes, communicationInterfacesTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCommunicationInterfacesValidity() {
		return communicationInterfacesValidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationInterfacesValidity(boolean newCommunicationInterfacesValidity) {
		boolean oldCommunicationInterfacesValidity = communicationInterfacesValidity;
		communicationInterfacesValidity = newCommunicationInterfacesValidity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EHealthManagementVPackage.COMMUNICATION_INTERFACES__COMMUNICATION_INTERFACES_VALIDITY,
					oldCommunicationInterfacesValidity, communicationInterfacesValidity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EHealthManagementVPackage.COMMUNICATION_INTERFACES__COMMUNICATION_INTERFACES_TYPES:
			return getCommunicationInterfacesTypes();
		case EHealthManagementVPackage.COMMUNICATION_INTERFACES__COMMUNICATION_INTERFACES_VALIDITY:
			return isCommunicationInterfacesValidity();
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
		case EHealthManagementVPackage.COMMUNICATION_INTERFACES__COMMUNICATION_INTERFACES_TYPES:
			setCommunicationInterfacesTypes((AllowedCommunicationInterfaceTypes) newValue);
			return;
		case EHealthManagementVPackage.COMMUNICATION_INTERFACES__COMMUNICATION_INTERFACES_VALIDITY:
			setCommunicationInterfacesValidity((Boolean) newValue);
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
		case EHealthManagementVPackage.COMMUNICATION_INTERFACES__COMMUNICATION_INTERFACES_TYPES:
			setCommunicationInterfacesTypes(COMMUNICATION_INTERFACES_TYPES_EDEFAULT);
			return;
		case EHealthManagementVPackage.COMMUNICATION_INTERFACES__COMMUNICATION_INTERFACES_VALIDITY:
			setCommunicationInterfacesValidity(COMMUNICATION_INTERFACES_VALIDITY_EDEFAULT);
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
		case EHealthManagementVPackage.COMMUNICATION_INTERFACES__COMMUNICATION_INTERFACES_TYPES:
			return communicationInterfacesTypes != COMMUNICATION_INTERFACES_TYPES_EDEFAULT;
		case EHealthManagementVPackage.COMMUNICATION_INTERFACES__COMMUNICATION_INTERFACES_VALIDITY:
			return communicationInterfacesValidity != COMMUNICATION_INTERFACES_VALIDITY_EDEFAULT;
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
		result.append(" (CommunicationInterfacesTypes: ");
		result.append(communicationInterfacesTypes);
		result.append(", CommunicationInterfacesValidity: ");
		result.append(communicationInterfacesValidity);
		result.append(')');
		return result.toString();
	}

} //CommunicationInterfacesImpl
