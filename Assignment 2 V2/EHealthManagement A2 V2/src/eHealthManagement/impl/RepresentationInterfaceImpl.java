/**
 */
package eHealthManagement.impl;

import eHealthManagement.AllowedRepresentationInterfaceType;
import eHealthManagement.EHealthManagementPackage;
import eHealthManagement.ImageUI;
import eHealthManagement.RepresentationInterface;
import eHealthManagement.TextUI;
import eHealthManagement.VideoUI;

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
 * An implementation of the model object '<em><b>Representation Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.impl.RepresentationInterfaceImpl#getRepresentationInterfaceType <em>Representation Interface Type</em>}</li>
 *   <li>{@link eHealthManagement.impl.RepresentationInterfaceImpl#getRepresentationInterfaceValidity <em>Representation Interface Validity</em>}</li>
 *   <li>{@link eHealthManagement.impl.RepresentationInterfaceImpl#getImageui <em>Imageui</em>}</li>
 *   <li>{@link eHealthManagement.impl.RepresentationInterfaceImpl#getTextui <em>Textui</em>}</li>
 *   <li>{@link eHealthManagement.impl.RepresentationInterfaceImpl#getVideoui <em>Videoui</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepresentationInterfaceImpl extends MinimalEObjectImpl.Container implements RepresentationInterface {
	/**
	 * The default value of the '{@link #getRepresentationInterfaceType() <em>Representation Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationInterfaceType()
	 * @generated
	 * @ordered
	 */
	protected static final AllowedRepresentationInterfaceType REPRESENTATION_INTERFACE_TYPE_EDEFAULT = AllowedRepresentationInterfaceType.DOCTOR_PROFILE;

	/**
	 * The cached value of the '{@link #getRepresentationInterfaceType() <em>Representation Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationInterfaceType()
	 * @generated
	 * @ordered
	 */
	protected AllowedRepresentationInterfaceType representationInterfaceType = REPRESENTATION_INTERFACE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepresentationInterfaceValidity() <em>Representation Interface Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationInterfaceValidity()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REPRESENTATION_INTERFACE_VALIDITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepresentationInterfaceValidity() <em>Representation Interface Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationInterfaceValidity()
	 * @generated
	 * @ordered
	 */
	protected Boolean representationInterfaceValidity = REPRESENTATION_INTERFACE_VALIDITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImageui() <em>Imageui</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageui()
	 * @generated
	 * @ordered
	 */
	protected EList<ImageUI> imageui;

	/**
	 * The cached value of the '{@link #getTextui() <em>Textui</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextui()
	 * @generated
	 * @ordered
	 */
	protected EList<TextUI> textui;

	/**
	 * The cached value of the '{@link #getVideoui() <em>Videoui</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoui()
	 * @generated
	 * @ordered
	 */
	protected EList<VideoUI> videoui;

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
	public AllowedRepresentationInterfaceType getRepresentationInterfaceType() {
		return representationInterfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentationInterfaceType(AllowedRepresentationInterfaceType newRepresentationInterfaceType) {
		AllowedRepresentationInterfaceType oldRepresentationInterfaceType = representationInterfaceType;
		representationInterfaceType = newRepresentationInterfaceType == null ? REPRESENTATION_INTERFACE_TYPE_EDEFAULT : newRepresentationInterfaceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.REPRESENTATION_INTERFACE__REPRESENTATION_INTERFACE_TYPE, oldRepresentationInterfaceType, representationInterfaceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getRepresentationInterfaceValidity() {
		return representationInterfaceValidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentationInterfaceValidity(Boolean newRepresentationInterfaceValidity) {
		Boolean oldRepresentationInterfaceValidity = representationInterfaceValidity;
		representationInterfaceValidity = newRepresentationInterfaceValidity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.REPRESENTATION_INTERFACE__REPRESENTATION_INTERFACE_VALIDITY, oldRepresentationInterfaceValidity, representationInterfaceValidity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImageUI> getImageui() {
		if (imageui == null) {
			imageui = new EObjectContainmentEList<ImageUI>(ImageUI.class, this, EHealthManagementPackage.REPRESENTATION_INTERFACE__IMAGEUI);
		}
		return imageui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextUI> getTextui() {
		if (textui == null) {
			textui = new EObjectContainmentEList<TextUI>(TextUI.class, this, EHealthManagementPackage.REPRESENTATION_INTERFACE__TEXTUI);
		}
		return textui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VideoUI> getVideoui() {
		if (videoui == null) {
			videoui = new EObjectContainmentEList<VideoUI>(VideoUI.class, this, EHealthManagementPackage.REPRESENTATION_INTERFACE__VIDEOUI);
		}
		return videoui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EHealthManagementPackage.REPRESENTATION_INTERFACE__IMAGEUI:
				return ((InternalEList<?>)getImageui()).basicRemove(otherEnd, msgs);
			case EHealthManagementPackage.REPRESENTATION_INTERFACE__TEXTUI:
				return ((InternalEList<?>)getTextui()).basicRemove(otherEnd, msgs);
			case EHealthManagementPackage.REPRESENTATION_INTERFACE__VIDEOUI:
				return ((InternalEList<?>)getVideoui()).basicRemove(otherEnd, msgs);
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
			case EHealthManagementPackage.REPRESENTATION_INTERFACE__REPRESENTATION_INTERFACE_TYPE:
				return getRepresentationInterfaceType();
			case EHealthManagementPackage.REPRESENTATION_INTERFACE__REPRESENTATION_INTERFACE_VALIDITY:
				return getRepresentationInterfaceValidity();
			case EHealthManagementPackage.REPRESENTATION_INTERFACE__IMAGEUI:
				return getImageui();
			case EHealthManagementPackage.REPRESENTATION_INTERFACE__TEXTUI:
				return getTextui();
			case EHealthManagementPackage.REPRESENTATION_INTERFACE__VIDEOUI:
				return getVideoui();
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
			case EHealthManagementPackage.REPRESENTATION_INTERFACE__REPRESENTATION_INTERFACE_TYPE:
				setRepresentationInterfaceType((AllowedRepresentationInterfaceType)newValue);
				return;
			case EHealthManagementPackage.REPRESENTATION_INTERFACE__REPRESENTATION_INTERFACE_VALIDITY:
				setRepresentationInterfaceValidity((Boolean)newValue);
				return;
			case EHealthManagementPackage.REPRESENTATION_INTERFACE__IMAGEUI:
				getImageui().clear();
				getImageui().addAll((Collection<? extends ImageUI>)newValue);
				return;
			case EHealthManagementPackage.REPRESENTATION_INTERFACE__TEXTUI:
				getTextui().clear();
				getTextui().addAll((Collection<? extends TextUI>)newValue);
				return;
			case EHealthManagementPackage.REPRESENTATION_INTERFACE__VIDEOUI:
				getVideoui().clear();
				getVideoui().addAll((Collection<? extends VideoUI>)newValue);
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
			case EHealthManagementPackage.REPRESENTATION_INTERFACE__REPRESENTATION_INTERFACE_TYPE:
				setRepresentationInterfaceType(REPRESENTATION_INTERFACE_TYPE_EDEFAULT);
				return;
			case EHealthManagementPackage.REPRESENTATION_INTERFACE__REPRESENTATION_INTERFACE_VALIDITY:
				setRepresentationInterfaceValidity(REPRESENTATION_INTERFACE_VALIDITY_EDEFAULT);
				return;
			case EHealthManagementPackage.REPRESENTATION_INTERFACE__IMAGEUI:
				getImageui().clear();
				return;
			case EHealthManagementPackage.REPRESENTATION_INTERFACE__TEXTUI:
				getTextui().clear();
				return;
			case EHealthManagementPackage.REPRESENTATION_INTERFACE__VIDEOUI:
				getVideoui().clear();
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
			case EHealthManagementPackage.REPRESENTATION_INTERFACE__REPRESENTATION_INTERFACE_TYPE:
				return representationInterfaceType != REPRESENTATION_INTERFACE_TYPE_EDEFAULT;
			case EHealthManagementPackage.REPRESENTATION_INTERFACE__REPRESENTATION_INTERFACE_VALIDITY:
				return REPRESENTATION_INTERFACE_VALIDITY_EDEFAULT == null ? representationInterfaceValidity != null : !REPRESENTATION_INTERFACE_VALIDITY_EDEFAULT.equals(representationInterfaceValidity);
			case EHealthManagementPackage.REPRESENTATION_INTERFACE__IMAGEUI:
				return imageui != null && !imageui.isEmpty();
			case EHealthManagementPackage.REPRESENTATION_INTERFACE__TEXTUI:
				return textui != null && !textui.isEmpty();
			case EHealthManagementPackage.REPRESENTATION_INTERFACE__VIDEOUI:
				return videoui != null && !videoui.isEmpty();
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
		result.append(" (RepresentationInterfaceType: ");
		result.append(representationInterfaceType);
		result.append(", RepresentationInterfaceValidity: ");
		result.append(representationInterfaceValidity);
		result.append(')');
		return result.toString();
	}

} //RepresentationInterfaceImpl
