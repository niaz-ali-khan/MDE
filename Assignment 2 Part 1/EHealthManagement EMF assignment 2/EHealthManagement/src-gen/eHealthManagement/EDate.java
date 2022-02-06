/**
 */
package eHealthManagement;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eHealthManagement.EDate#getEDateDefault <em>EDate Default</em>}</li>
 * </ul>
 *
 * @see eHealthManagement.EHealthManagementPackage#getEDate()
 * @model
 * @generated
 */
public interface EDate extends Attributes {
	/**
	 * Returns the value of the '<em><b>EDate Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EDate Default</em>' attribute.
	 * @see #setEDateDefault(Date)
	 * @see eHealthManagement.EHealthManagementPackage#getEDate_EDateDefault()
	 * @model
	 * @generated
	 */
	Date getEDateDefault();

	/**
	 * Sets the value of the '{@link eHealthManagement.EDate#getEDateDefault <em>EDate Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EDate Default</em>' attribute.
	 * @see #getEDateDefault()
	 * @generated
	 */
	void setEDateDefault(Date value);

} // EDate
