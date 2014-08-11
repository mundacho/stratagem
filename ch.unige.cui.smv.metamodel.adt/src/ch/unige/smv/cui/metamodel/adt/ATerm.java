/**
 */
package ch.unige.smv.cui.metamodel.adt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ATerm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.ATerm#getAdt <em>Adt</em>}</li>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.ATerm#getSort <em>Sort</em>}</li>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.ATerm#getSymbol <em>Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage#getATerm()
 * @model abstract="true"
 * @generated
 */
public interface ATerm extends EObject {
	/**
	 * Returns the value of the '<em><b>Adt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adt</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adt</em>' reference.
	 * @see #setAdt(ADT)
	 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage#getATerm_Adt()
	 * @model required="true" transient="true"
	 * @generated
	 */
	ADT getAdt();

	/**
	 * Sets the value of the '{@link ch.unige.smv.cui.metamodel.adt.ATerm#getAdt <em>Adt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adt</em>' reference.
	 * @see #getAdt()
	 * @generated
	 */
	void setAdt(ADT value);

	/**
	 * Returns the value of the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort</em>' reference.
	 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage#getATerm_Sort()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	ASort getSort();
	
	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage#getATerm_Symbol()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getSymbol();

	/**
	 * @return true if the term is a variable.
	 */
	boolean isVariable();
	
	

} // ATerm
