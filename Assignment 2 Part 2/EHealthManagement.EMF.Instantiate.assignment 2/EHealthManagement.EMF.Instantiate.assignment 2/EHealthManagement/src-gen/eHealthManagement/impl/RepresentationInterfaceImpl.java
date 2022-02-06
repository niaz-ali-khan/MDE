/**
 */
package eHealthManagement.impl;

import eHealthManagement.AllowedRepresentationInterfaceTypes;
import eHealthManagement.EHealthManagementPackage;
import eHealthManagement.RepresentationInterface;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Representation Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.impl.RepresentationInterfaceImpl#getRepresentationInterfaces <em>Representation Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepresentationInterfaceImpl extends UserInterfaceImpl implements RepresentationInterface {
	/**
	 * The default value of the '{@link #getRepresentationInterfaces() <em>Representation Interfaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationInterfaces()
	 * @generated
	 * @ordered
	 */
	protected static final AllowedRepresentationInterfaceTypes REPRESENTATION_INTERFACES_EDEFAULT = AllowedRepresentationInterfaceTypes.DOCTOR_PROFILE;

	/**
	 * The cached value of the '{@link #getRepresentationInterfaces() <em>Representation Interfaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationInterfaces()
	 * @generated
	 * @ordered
	 */
	protected AllowedRepresentationInterfaceTypes representationInterfaces = REPRESENTATION_INTERFACES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepresentationInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementPackage.Literals.REPRESENTATION_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowedRepresentationInterfaceTypes getRepresentationInterfaces() {
		return representationInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentationInterfaces(AllowedRepresentationInterfaceTypes newRepresentationInterfaces) {
		AllowedRepresentationInterfaceTypes oldRepresentationInterfaces = representationInterfaces;
		representationInterfaces = newRepresentationInterfaces == null ? REPRESENTATION_INTERFACES_EDEFAULT
				: newRepresentationInterfaces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EHealthManagementPackage.REPRESENTATION_INTERFACE__REPRESENTATION_INTERFACES,
					oldRepresentationInterfaces, representationInterfaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EHealthManagementPackage.REPRESENTATION_INTERFACE__REPRESENTATION_INTERFACES:
			return getRepresentationInterfaces();
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
		case EHealthManagementPackage.REPRESENTATION_INTERFACE__REPRESENTATION_INTERFACES:
			setRepresentationInterfaces((AllowedRepresentationInterfaceTypes) newValue);
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
		case EHealthManagementPackage.REPRESENTATION_INTERFACE__REPRESENTATION_INTERFACES:
			setRepresentationInterfaces(REPRESENTATION_INTERFACES_EDEFAULT);
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
		case EHealthManagementPackage.REPRESENTATION_INTERFACE__REPRESENTATION_INTERFACES:
			return representationInterfaces != REPRESENTATION_INTERFACES_EDEFAULT;
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
		result.append(" (RepresentationInterfaces: ");
		result.append(representationInterfaces);
		result.append(')');
		return result.toString();
	}

} //RepresentationInterfaceImpl
