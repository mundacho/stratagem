/**
 */
package ch.unige.cui.smv.metamodel.ts;

import ch.unige.smv.cui.metamodel.adt.Equation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.unige.cui.smv.metamodel.ts.SimpleStrategy#getEquations <em>Equations</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.unige.cui.smv.metamodel.ts.TsPackage#getSimpleStrategy()
 * @model
 * @generated
 */
public interface SimpleStrategy extends NonVariableStrategy {
	/**
	 * Returns the value of the '<em><b>Equations</b></em>' containment reference list.
	 * The list contents are of type {@link ch.unige.smv.cui.metamodel.adt.Equation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equations</em>' containment reference list.
	 * @see ch.unige.cui.smv.metamodel.ts.TsPackage#getSimpleStrategy_Equations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Equation> getEquations();

} // SimpleStrategy
