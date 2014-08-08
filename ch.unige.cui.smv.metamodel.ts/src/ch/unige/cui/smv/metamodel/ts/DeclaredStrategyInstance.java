/**
 */
package ch.unige.cui.smv.metamodel.ts;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declared Strategy Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.unige.cui.smv.metamodel.ts.DeclaredStrategyInstance#getName <em>Name</em>}</li>
 *   <li>{@link ch.unige.cui.smv.metamodel.ts.DeclaredStrategyInstance#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link ch.unige.cui.smv.metamodel.ts.DeclaredStrategyInstance#getActualParams <em>Actual Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.unige.cui.smv.metamodel.ts.TsPackage#getDeclaredStrategyInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='RightNumberOfParams'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot RightNumberOfParams='Tuple {\n\tmessage : String = \'Invalid number of parameters for strategy \' + name + \'. Required \' + declaration.formalParams->size()->toString() + \', found \' + actualParams->size()->toString(),\n\tstatus : Boolean = declaration <> null implies declaration.formalParams\n\t\t\t->size() = actualParams\n\t\t\t->size()\n}.status'"
 * @generated
 */
public interface DeclaredStrategyInstance extends NonVariableStrategy {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ch.unige.cui.smv.metamodel.ts.TsPackage#getDeclaredStrategyInstance_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ch.unige.cui.smv.metamodel.ts.DeclaredStrategyInstance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' reference.
	 * @see #setDeclaration(DeclaredStrategy)
	 * @see ch.unige.cui.smv.metamodel.ts.TsPackage#getDeclaredStrategyInstance_Declaration()
	 * @model required="true"
	 * @generated
	 */
	DeclaredStrategy getDeclaration();

	/**
	 * Sets the value of the '{@link ch.unige.cui.smv.metamodel.ts.DeclaredStrategyInstance#getDeclaration <em>Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' reference.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(DeclaredStrategy value);

	/**
	 * Returns the value of the '<em><b>Actual Params</b></em>' containment reference list.
	 * The list contents are of type {@link ch.unige.cui.smv.metamodel.ts.Strategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Params</em>' containment reference list.
	 * @see ch.unige.cui.smv.metamodel.ts.TsPackage#getDeclaredStrategyInstance_ActualParams()
	 * @model containment="true"
	 * @generated
	 */
	EList<Strategy> getActualParams();

} // DeclaredStrategyInstance
