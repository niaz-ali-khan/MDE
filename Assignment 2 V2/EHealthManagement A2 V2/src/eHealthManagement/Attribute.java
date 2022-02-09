/**
 */
package eHealthManagement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.Attribute#getAllowedAttributeType <em>Allowed Attribute Type</em>}</li>
 *   <li>{@link eHealthManagement.Attribute#getAttributeSize <em>Attribute Size</em>}</li>
 *   <li>{@link eHealthManagement.Attribute#getEventmessagetype <em>Eventmessagetype</em>}</li>
 *   <li>{@link eHealthManagement.Attribute#getCimage <em>Cimage</em>}</li>
 *   <li>{@link eHealthManagement.Attribute#getCstring <em>Cstring</em>}</li>
 *   <li>{@link eHealthManagement.Attribute#getCvarchar <em>Cvarchar</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Allowed Attribute Type</b></em>' attribute.
	 * The literals are from the enumeration {@link eHealthManagement.AllowedAttributeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Attribute Type</em>' attribute.
	 * @see eHealthManagement.AllowedAttributeType
	 * @see #setAllowedAttributeType(AllowedAttributeType)
	 * @see eHealthManagement.EHealthManagementPackage#getAttribute_AllowedAttributeType()
	 * @model
	 * @generated
	 */
	AllowedAttributeType getAllowedAttributeType();

	/**
	 * Sets the value of the '{@link eHealthManagement.Attribute#getAllowedAttributeType <em>Allowed Attribute Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Attribute Type</em>' attribute.
	 * @see eHealthManagement.AllowedAttributeType
	 * @see #getAllowedAttributeType()
	 * @generated
	 */
	void setAllowedAttributeType(AllowedAttributeType value);

	/**
	 * Returns the value of the '<em><b>Attribute Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Size</em>' attribute.
	 * @see #setAttributeSize(long)
	 * @see eHealthManagement.EHealthManagementPackage#getAttribute_AttributeSize()
	 * @model
	 * @generated
	 */
	long getAttributeSize();

	/**
	 * Sets the value of the '{@link eHealthManagement.Attribute#getAttributeSize <em>Attribute Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Size</em>' attribute.
	 * @see #getAttributeSize()
	 * @generated
	 */
	void setAttributeSize(long value);

	/**
	 * Returns the value of the '<em><b>Eventmessagetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eventmessagetype</em>' reference.
	 * @see #setEventmessagetype(EventMessageType)
	 * @see eHealthManagement.EHealthManagementPackage#getAttribute_Eventmessagetype()
	 * @model
	 * @generated
	 */
	EventMessageType getEventmessagetype();

	/**
	 * Sets the value of the '{@link eHealthManagement.Attribute#getEventmessagetype <em>Eventmessagetype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eventmessagetype</em>' reference.
	 * @see #getEventmessagetype()
	 * @generated
	 */
	void setEventmessagetype(EventMessageType value);

	/**
	 * Returns the value of the '<em><b>Cimage</b></em>' containment reference list.
	 * The list contents are of type {@link eHealthManagement.CImage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cimage</em>' containment reference list.
	 * @see eHealthManagement.EHealthManagementPackage#getAttribute_Cimage()
	 * @model containment="true"
	 * @generated
	 */
	EList<CImage> getCimage();

	/**
	 * Returns the value of the '<em><b>Cstring</b></em>' containment reference list.
	 * The list contents are of type {@link eHealthManagement.CString}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cstring</em>' containment reference list.
	 * @see eHealthManagement.EHealthManagementPackage#getAttribute_Cstring()
	 * @model containment="true"
	 * @generated
	 */
	EList<CString> getCstring();

	/**
	 * Returns the value of the '<em><b>Cvarchar</b></em>' containment reference list.
	 * The list contents are of type {@link eHealthManagement.CVarchar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cvarchar</em>' containment reference list.
	 * @see eHealthManagement.EHealthManagementPackage#getAttribute_Cvarchar()
	 * @model containment="true"
	 * @generated
	 */
	EList<CVarchar> getCvarchar();

} // Attribute
