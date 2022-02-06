/**
 */
package eHealthManagementV.impl;

import eHealthManagementV.EHealthManagementVPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagementV.impl.TextMessageImpl#getETextMessageName <em>EText Message Name</em>}</li>
 *   <li>{@link eHealthManagementV.impl.TextMessageImpl#getTextSize <em>Text Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextMessageImpl extends MessageTypeImpl implements TextMessage {
	/**
	 * The default value of the '{@link #getETextMessageName() <em>EText Message Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETextMessageName()
	 * @generated
	 * @ordered
	 */
	protected static final String ETEXT_MESSAGE_NAME_EDEFAULT = "txt";
	/**
	 * The cached value of the '{@link #getETextMessageName() <em>EText Message Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETextMessageName()
	 * @generated
	 * @ordered
	 */
	protected String eTextMessageName = ETEXT_MESSAGE_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getTextSize() <em>Text Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextSize()
	 * @generated
	 * @ordered
	 */
	protected static final int TEXT_SIZE_EDEFAULT = 4;
	/**
	 * The cached value of the '{@link #getTextSize() <em>Text Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextSize()
	 * @generated
	 * @ordered
	 */
	protected int textSize = TEXT_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EHealthManagementVPackage.Literals.TEXT_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getETextMessageName() {
		return eTextMessageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setETextMessageName(String newETextMessageName) {
		String oldETextMessageName = eTextMessageName;
		eTextMessageName = newETextMessageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EHealthManagementVPackage.TEXT_MESSAGE__ETEXT_MESSAGE_NAME, oldETextMessageName, eTextMessageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTextSize() {
		return textSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextSize(int newTextSize) {
		int oldTextSize = textSize;
		textSize = newTextSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EHealthManagementVPackage.TEXT_MESSAGE__TEXT_SIZE,
					oldTextSize, textSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EHealthManagementVPackage.TEXT_MESSAGE__ETEXT_MESSAGE_NAME:
			return getETextMessageName();
		case EHealthManagementVPackage.TEXT_MESSAGE__TEXT_SIZE:
			return getTextSize();
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
		case EHealthManagementVPackage.TEXT_MESSAGE__ETEXT_MESSAGE_NAME:
			setETextMessageName((String) newValue);
			return;
		case EHealthManagementVPackage.TEXT_MESSAGE__TEXT_SIZE:
			setTextSize((Integer) newValue);
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
		case EHealthManagementVPackage.TEXT_MESSAGE__ETEXT_MESSAGE_NAME:
			setETextMessageName(ETEXT_MESSAGE_NAME_EDEFAULT);
			return;
		case EHealthManagementVPackage.TEXT_MESSAGE__TEXT_SIZE:
			setTextSize(TEXT_SIZE_EDEFAULT);
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
		case EHealthManagementVPackage.TEXT_MESSAGE__ETEXT_MESSAGE_NAME:
			return ETEXT_MESSAGE_NAME_EDEFAULT == null ? eTextMessageName != null
					: !ETEXT_MESSAGE_NAME_EDEFAULT.equals(eTextMessageName);
		case EHealthManagementVPackage.TEXT_MESSAGE__TEXT_SIZE:
			return textSize != TEXT_SIZE_EDEFAULT;
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
		result.append(" (ETextMessageName: ");
		result.append(eTextMessageName);
		result.append(", TextSize: ");
		result.append(textSize);
		result.append(')');
		return result.toString();
	}

} //TextMessageImpl
