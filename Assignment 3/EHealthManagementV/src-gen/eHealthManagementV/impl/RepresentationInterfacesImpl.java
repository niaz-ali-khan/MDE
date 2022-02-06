/**
 */
package eHealthManagementV.impl;

import eHealthManagementV.AllowedRepresentationInterfaceTypes;
import eHealthManagementV.EHealthManagementVPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Representation Interfaces</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagementV.impl.RepresentationInterfacesImpl#getRepresentationInterfacesTypes <em>Representation Interfaces Types</em>}</li>
 *   <li>{@link eHealthManagementV.impl.RepresentationInterfacesImpl#isRepresentationInterfacesValidity <em>Representation Interfaces Validity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepresentationInterfacesImpl extends UserInterfacesImpl implements RepresentationInterfaces {
	/**
	 * The default value of the '{@link #getRepresentationInterfacesTypes() <em>Representation Interfaces Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationInterfacesTypes()
	 * @generated
	 * @ordered
	 */
	protected static final AllowedRepresentationInterfaceTypes REPRESENTATION_INTERFACES_TYPES_EDEFAULT = AllowedRepresentationInterfaceTypes.DOCTOR_PROFILE;

	/**
	 * The cached value of the '{@link #getRepresentationInterfacesTypes() <em>Representation Interfaces Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationInterfacesTypes()
	 * @generated
	 * @ordered
	 */
	protected AllowedRepresentationInterfaceTypes representationInterfacesTypes = REPRESENTATION_INTERFACES_TYPES_EDEFAULT;

	/**
	 * The default value of the '{@link #isRepresentationInterfacesValidity() <em>Representation Interfaces Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRepresentationInterfacesValidity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REPRESENTATION_INTERFACES_VALIDITY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isRepresentationInterfacesValidity() <em>Representation Interfaces Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRepresentationInterfacesValidity()
	 * @generated
	 * @ordered
	 */
	protected boolean representationInterfacesValidity = REPRESENTATION_INTERFACES_VALIDITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepresentationInterfacesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementVPackage.Literals.REPRESENTATION_INTERFACES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowedRepresentationInterfaceTypes getRepresentationInterfacesTypes() {
		return representationInterfacesTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentationInterfacesTypes(AllowedRepresentationInterfaceTypes newRepresentationInterfacesTypes) {
		AllowedRepresentationInterfaceTypes oldRepresentationInterfacesTypes = representationInterfacesTypes;
		representationInterfacesTypes = newRepresentationInterfacesTypes == null
				? REPRESENTATION_INTERFACES_TYPES_EDEFAULT
				: newRepresentationInterfacesTypes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EHealthManagementVPackage.REPRESENTATION_INTERFACES__REPRESENTATION_INTERFACES_TYPES,
					oldRepresentationInterfacesTypes, representationInterfacesTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRepresentationInterfacesValidity() {
		return representationInterfacesValidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentationInterfacesValidity(boolean newRepresentationInterfacesValidity) {
		boolean oldRepresentationInterfacesValidity = representationInterfacesValidity;
		representationInterfacesValidity = newRepresentationInterfacesValidity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EHealthManagementVPackage.REPRESENTATION_INTERFACES__REPRESENTATION_INTERFACES_VALIDITY,
					oldRepresentationInterfacesValidity, representationInterfacesValidity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EHealthManagementVPackage.REPRESENTATION_INTERFACES__REPRESENTATION_INTERFACES_TYPES:
			return getRepresentationInterfacesTypes();
		case EHealthManagementVPackage.REPRESENTATION_INTERFACES__REPRESENTATION_INTERFACES_VALIDITY:
			return isRepresentationInterfacesValidity();
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
		case EHealthManagementVPackage.REPRESENTATION_INTERFACES__REPRESENTATION_INTERFACES_TYPES:
			setRepresentationInterfacesTypes((AllowedRepresentationInterfaceTypes) newValue);
			return;
		case EHealthManagementVPackage.REPRESENTATION_INTERFACES__REPRESENTATION_INTERFACES_VALIDITY:
			setRepresentationInterfacesValidity((Boolean) newValue);
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
		case EHealthManagementVPackage.REPRESENTATION_INTERFACES__REPRESENTATION_INTERFACES_TYPES:
			setRepresentationInterfacesTypes(REPRESENTATION_INTERFACES_TYPES_EDEFAULT);
			return;
		case EHealthManagementVPackage.REPRESENTATION_INTERFACES__REPRESENTATION_INTERFACES_VALIDITY:
			setRepresentationInterfacesValidity(REPRESENTATION_INTERFACES_VALIDITY_EDEFAULT);
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
		case EHealthManagementVPackage.REPRESENTATION_INTERFACES__REPRESENTATION_INTERFACES_TYPES:
			return representationInterfacesTypes != REPRESENTATION_INTERFACES_TYPES_EDEFAULT;
		case EHealthManagementVPackage.REPRESENTATION_INTERFACES__REPRESENTATION_INTERFACES_VALIDITY:
			return representationInterfacesValidity != REPRESENTATION_INTERFACES_VALIDITY_EDEFAULT;
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
		result.append(" (RepresentationInterfacesTypes: ");
		result.append(representationInterfacesTypes);
		result.append(", RepresentationInterfacesValidity: ");
		result.append(representationInterfacesValidity);
		result.append(')');
		return result.toString();
	}

} //RepresentationInterfacesImpl
