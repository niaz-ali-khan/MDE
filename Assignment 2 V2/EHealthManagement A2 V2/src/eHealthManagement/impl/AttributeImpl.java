/**
 */
package eHealthManagement.impl;

import eHealthManagement.AllowedAttributeType;
import eHealthManagement.Attribute;
import eHealthManagement.CImage;
import eHealthManagement.CString;
import eHealthManagement.CVarchar;
import eHealthManagement.EHealthManagementPackage;
import eHealthManagement.EventMessageType;

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
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.impl.AttributeImpl#getAllowedAttributeType <em>Allowed Attribute Type</em>}</li>
 *   <li>{@link eHealthManagement.impl.AttributeImpl#getAttributeSize <em>Attribute Size</em>}</li>
 *   <li>{@link eHealthManagement.impl.AttributeImpl#getEventmessagetype <em>Eventmessagetype</em>}</li>
 *   <li>{@link eHealthManagement.impl.AttributeImpl#getCimage <em>Cimage</em>}</li>
 *   <li>{@link eHealthManagement.impl.AttributeImpl#getCstring <em>Cstring</em>}</li>
 *   <li>{@link eHealthManagement.impl.AttributeImpl#getCvarchar <em>Cvarchar</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute {
	/**
	 * The default value of the '{@link #getAllowedAttributeType() <em>Allowed Attribute Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedAttributeType()
	 * @generated
	 * @ordered
	 */
	protected static final AllowedAttributeType ALLOWED_ATTRIBUTE_TYPE_EDEFAULT = AllowedAttributeType.CIMAGE;

	/**
	 * The cached value of the '{@link #getAllowedAttributeType() <em>Allowed Attribute Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedAttributeType()
	 * @generated
	 * @ordered
	 */
	protected AllowedAttributeType allowedAttributeType = ALLOWED_ATTRIBUTE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttributeSize() <em>Attribute Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeSize()
	 * @generated
	 * @ordered
	 */
	protected static final long ATTRIBUTE_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getAttributeSize() <em>Attribute Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeSize()
	 * @generated
	 * @ordered
	 */
	protected long attributeSize = ATTRIBUTE_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEventmessagetype() <em>Eventmessagetype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventmessagetype()
	 * @generated
	 * @ordered
	 */
	protected EventMessageType eventmessagetype;

	/**
	 * The cached value of the '{@link #getCimage() <em>Cimage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCimage()
	 * @generated
	 * @ordered
	 */
	protected EList<CImage> cimage;

	/**
	 * The cached value of the '{@link #getCstring() <em>Cstring</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCstring()
	 * @generated
	 * @ordered
	 */
	protected EList<CString> cstring;

	/**
	 * The cached value of the '{@link #getCvarchar() <em>Cvarchar</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCvarchar()
	 * @generated
	 * @ordered
	 */
	protected EList<CVarchar> cvarchar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowedAttributeType getAllowedAttributeType() {
		return allowedAttributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowedAttributeType(AllowedAttributeType newAllowedAttributeType) {
		AllowedAttributeType oldAllowedAttributeType = allowedAttributeType;
		allowedAttributeType = newAllowedAttributeType == null ? ALLOWED_ATTRIBUTE_TYPE_EDEFAULT : newAllowedAttributeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.ATTRIBUTE__ALLOWED_ATTRIBUTE_TYPE, oldAllowedAttributeType, allowedAttributeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getAttributeSize() {
		return attributeSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeSize(long newAttributeSize) {
		long oldAttributeSize = attributeSize;
		attributeSize = newAttributeSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.ATTRIBUTE__ATTRIBUTE_SIZE, oldAttributeSize, attributeSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventMessageType getEventmessagetype() {
		if (eventmessagetype != null && eventmessagetype.eIsProxy()) {
			InternalEObject oldEventmessagetype = (InternalEObject)eventmessagetype;
			eventmessagetype = (EventMessageType)eResolveProxy(oldEventmessagetype);
			if (eventmessagetype != oldEventmessagetype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EHealthManagementPackage.ATTRIBUTE__EVENTMESSAGETYPE, oldEventmessagetype, eventmessagetype));
			}
		}
		return eventmessagetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventMessageType basicGetEventmessagetype() {
		return eventmessagetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventmessagetype(EventMessageType newEventmessagetype) {
		EventMessageType oldEventmessagetype = eventmessagetype;
		eventmessagetype = newEventmessagetype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementPackage.ATTRIBUTE__EVENTMESSAGETYPE, oldEventmessagetype, eventmessagetype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CImage> getCimage() {
		if (cimage == null) {
			cimage = new EObjectContainmentEList<CImage>(CImage.class, this, EHealthManagementPackage.ATTRIBUTE__CIMAGE);
		}
		return cimage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CString> getCstring() {
		if (cstring == null) {
			cstring = new EObjectContainmentEList<CString>(CString.class, this, EHealthManagementPackage.ATTRIBUTE__CSTRING);
		}
		return cstring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CVarchar> getCvarchar() {
		if (cvarchar == null) {
			cvarchar = new EObjectContainmentEList<CVarchar>(CVarchar.class, this, EHealthManagementPackage.ATTRIBUTE__CVARCHAR);
		}
		return cvarchar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EHealthManagementPackage.ATTRIBUTE__CIMAGE:
				return ((InternalEList<?>)getCimage()).basicRemove(otherEnd, msgs);
			case EHealthManagementPackage.ATTRIBUTE__CSTRING:
				return ((InternalEList<?>)getCstring()).basicRemove(otherEnd, msgs);
			case EHealthManagementPackage.ATTRIBUTE__CVARCHAR:
				return ((InternalEList<?>)getCvarchar()).basicRemove(otherEnd, msgs);
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
			case EHealthManagementPackage.ATTRIBUTE__ALLOWED_ATTRIBUTE_TYPE:
				return getAllowedAttributeType();
			case EHealthManagementPackage.ATTRIBUTE__ATTRIBUTE_SIZE:
				return getAttributeSize();
			case EHealthManagementPackage.ATTRIBUTE__EVENTMESSAGETYPE:
				if (resolve) return getEventmessagetype();
				return basicGetEventmessagetype();
			case EHealthManagementPackage.ATTRIBUTE__CIMAGE:
				return getCimage();
			case EHealthManagementPackage.ATTRIBUTE__CSTRING:
				return getCstring();
			case EHealthManagementPackage.ATTRIBUTE__CVARCHAR:
				return getCvarchar();
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
			case EHealthManagementPackage.ATTRIBUTE__ALLOWED_ATTRIBUTE_TYPE:
				setAllowedAttributeType((AllowedAttributeType)newValue);
				return;
			case EHealthManagementPackage.ATTRIBUTE__ATTRIBUTE_SIZE:
				setAttributeSize((Long)newValue);
				return;
			case EHealthManagementPackage.ATTRIBUTE__EVENTMESSAGETYPE:
				setEventmessagetype((EventMessageType)newValue);
				return;
			case EHealthManagementPackage.ATTRIBUTE__CIMAGE:
				getCimage().clear();
				getCimage().addAll((Collection<? extends CImage>)newValue);
				return;
			case EHealthManagementPackage.ATTRIBUTE__CSTRING:
				getCstring().clear();
				getCstring().addAll((Collection<? extends CString>)newValue);
				return;
			case EHealthManagementPackage.ATTRIBUTE__CVARCHAR:
				getCvarchar().clear();
				getCvarchar().addAll((Collection<? extends CVarchar>)newValue);
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
			case EHealthManagementPackage.ATTRIBUTE__ALLOWED_ATTRIBUTE_TYPE:
				setAllowedAttributeType(ALLOWED_ATTRIBUTE_TYPE_EDEFAULT);
				return;
			case EHealthManagementPackage.ATTRIBUTE__ATTRIBUTE_SIZE:
				setAttributeSize(ATTRIBUTE_SIZE_EDEFAULT);
				return;
			case EHealthManagementPackage.ATTRIBUTE__EVENTMESSAGETYPE:
				setEventmessagetype((EventMessageType)null);
				return;
			case EHealthManagementPackage.ATTRIBUTE__CIMAGE:
				getCimage().clear();
				return;
			case EHealthManagementPackage.ATTRIBUTE__CSTRING:
				getCstring().clear();
				return;
			case EHealthManagementPackage.ATTRIBUTE__CVARCHAR:
				getCvarchar().clear();
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
			case EHealthManagementPackage.ATTRIBUTE__ALLOWED_ATTRIBUTE_TYPE:
				return allowedAttributeType != ALLOWED_ATTRIBUTE_TYPE_EDEFAULT;
			case EHealthManagementPackage.ATTRIBUTE__ATTRIBUTE_SIZE:
				return attributeSize != ATTRIBUTE_SIZE_EDEFAULT;
			case EHealthManagementPackage.ATTRIBUTE__EVENTMESSAGETYPE:
				return eventmessagetype != null;
			case EHealthManagementPackage.ATTRIBUTE__CIMAGE:
				return cimage != null && !cimage.isEmpty();
			case EHealthManagementPackage.ATTRIBUTE__CSTRING:
				return cstring != null && !cstring.isEmpty();
			case EHealthManagementPackage.ATTRIBUTE__CVARCHAR:
				return cvarchar != null && !cvarchar.isEmpty();
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
		result.append(" (AllowedAttributeType: ");
		result.append(allowedAttributeType);
		result.append(", AttributeSize: ");
		result.append(attributeSize);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
