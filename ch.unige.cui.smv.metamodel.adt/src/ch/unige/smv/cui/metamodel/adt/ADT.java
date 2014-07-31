/**
 */
package ch.unige.smv.cui.metamodel.adt;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ADT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.ADT#getName <em>Name</em>}</li>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.ADT#getSignature <em>Signature</em>}</li>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.ADT#getVariables <em>Variables</em>}</li>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.ADT#getEquations <em>Equations</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage#getADT()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueVariableNames'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot UniqueVariableNames='variables\n\t\t\t->isUnique(name)' UniqueVariableNames$message='\'The following variables are defined more than once: \' + variables->select(v | (variables->select(v1 | (v1.name = v.name))->size() > 1))->collect(name)->toString()'"
 * @generated
 */
public interface ADT extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"adt"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage#getADT_Name()
	 * @model default="adt" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ch.unige.smv.cui.metamodel.adt.ADT#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' containment reference.
	 * @see #setSignature(Signature)
	 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage#getADT_Signature()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Signature getSignature();

	/**
	 * Sets the value of the '{@link ch.unige.smv.cui.metamodel.adt.ADT#getSignature <em>Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' containment reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(Signature value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link ch.unige.smv.cui.metamodel.adt.VariableDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage#getADT_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableDeclaration> getVariables();

	/**
	 * Returns the value of the '<em><b>Equations</b></em>' containment reference list.
	 * The list contents are of type {@link ch.unige.smv.cui.metamodel.adt.Equation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equations</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equations</em>' containment reference list.
	 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage#getADT_Equations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Equation> getEquations();
	
	/**
	 * Creates a term of this adt.
	 * 
	 * @param functor a string representing the functor.
	 * @param subterms the list of subterms.
	 * @return a valid term for this adt.
	 */
	ATerm term(String functor, ATerm... subterms);
	
	/**
	 * Return the same ADT with a new variable declared.
	 * @param name the name of the variable
	 * @param sort the sort of the variable
	 * @return the adt with the variable
	 */
	ADT declareVariable(String name, String sort);
	

} // ADT
