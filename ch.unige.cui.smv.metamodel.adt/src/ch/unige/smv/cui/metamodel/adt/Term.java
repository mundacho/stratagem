/**
 */
package ch.unige.smv.cui.metamodel.adt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.Term#getOperationSymbol <em>Operation Symbol</em>}</li>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.Term#getSubterms <em>Subterms</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage#getTerm()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CorrectNumberOfParameters CorrectTypeOfParameters RightAdtSubterms'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot CorrectNumberOfParameters='(operationSymbol <> null) implies  subterms->size() = operationSymbol.formalParameters->size()' CorrectNumberOfParameters$message='\'Invalid number of parameters for term: \' + self.toString() + \'. Required \' + operationSymbol.formalParameters->size()->toString() + \', found \' + subterms->size()->toString()' CorrectTypeOfParameters='subterms\n\t\t\t->forAll(p | ((p.sort <> null) and (operationSymbol <> null)) implies p.sort.isSubSortOf(operationSymbol.formalParameters\n\t\t\t\t\t->at(subterms\n\t\t\t\t\t\t->indexOf(p))))' CorrectTypeOfParameters$message='\'Invalid type of parameters for term: \' + self.toString()' RightAdtSubterms='(subterms <> null) implies subterms->forAll(t | t.adt = self.adt)' RightAdtSubterms$message='\'Some subterms do not have the same adt as the parent term: \' + self.toString()'"
 * @generated
 */
public interface Term extends ATerm {
	/**
	 * Returns the value of the '<em><b>Operation Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Symbol</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Symbol</em>' reference.
	 * @see #setOperationSymbol(Operation)
	 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage#getTerm_OperationSymbol()
	 * @model required="true"
	 * @generated
	 */
	Operation getOperationSymbol();

	/**
	 * Sets the value of the '{@link ch.unige.smv.cui.metamodel.adt.Term#getOperationSymbol <em>Operation Symbol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Symbol</em>' reference.
	 * @see #getOperationSymbol()
	 * @generated
	 */
	void setOperationSymbol(Operation value);

	/**
	 * Returns the value of the '<em><b>Subterms</b></em>' containment reference list.
	 * The list contents are of type {@link ch.unige.smv.cui.metamodel.adt.ATerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subterms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subterms</em>' containment reference list.
	 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage#getTerm_Subterms()
	 * @model containment="true"
	 * @generated
	 */
	EList<ATerm> getSubterms();

} // Term
