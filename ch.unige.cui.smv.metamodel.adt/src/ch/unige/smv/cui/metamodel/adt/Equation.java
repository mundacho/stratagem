/**
 */
package ch.unige.smv.cui.metamodel.adt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.Equation#getLeftHandTerm <em>Left Hand Term</em>}</li>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.Equation#getRightHandTerm <em>Right Hand Term</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage#getEquation()
 * @model
 * @generated
 */
public interface Equation extends EObject {
	/**
	 * Returns the value of the '<em><b>Left Hand Term</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Hand Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Hand Term</em>' reference.
	 * @see #setLeftHandTerm(ATerm)
	 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage#getEquation_LeftHandTerm()
	 * @model required="true"
	 * @generated
	 */
	ATerm getLeftHandTerm();

	/**
	 * Sets the value of the '{@link ch.unige.smv.cui.metamodel.adt.Equation#getLeftHandTerm <em>Left Hand Term</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Hand Term</em>' reference.
	 * @see #getLeftHandTerm()
	 * @generated
	 */
	void setLeftHandTerm(ATerm value);

	/**
	 * Returns the value of the '<em><b>Right Hand Term</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Hand Term</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Hand Term</em>' reference.
	 * @see #setRightHandTerm(ATerm)
	 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage#getEquation_RightHandTerm()
	 * @model required="true"
	 * @generated
	 */
	ATerm getRightHandTerm();

	/**
	 * Sets the value of the '{@link ch.unige.smv.cui.metamodel.adt.Equation#getRightHandTerm <em>Right Hand Term</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Hand Term</em>' reference.
	 * @see #getRightHandTerm()
	 * @generated
	 */
	void setRightHandTerm(ATerm value);

} // Equation
