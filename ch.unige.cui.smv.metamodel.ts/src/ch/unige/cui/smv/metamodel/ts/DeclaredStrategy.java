/**
 */
package ch.unige.cui.smv.metamodel.ts;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declared Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.unige.cui.smv.metamodel.ts.DeclaredStrategy#getName <em>Name</em>}</li>
 *   <li>{@link ch.unige.cui.smv.metamodel.ts.DeclaredStrategy#getBody <em>Body</em>}</li>
 *   <li>{@link ch.unige.cui.smv.metamodel.ts.DeclaredStrategy#getFormalParams <em>Formal Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.unige.cui.smv.metamodel.ts.TsPackage#getDeclaredStrategy()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueVariableParameters'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot UniqueVariableParameters='Tuple {\n\tmessage : String = \'The parameter names are not unique for declared strategy: \' + name,\n\tstatus : Boolean = formalParams <> null implies formalParams->isUnique(name)\n}.status'"
 * @generated
 */
public interface DeclaredStrategy extends EObject {
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
	 * @see ch.unige.cui.smv.metamodel.ts.TsPackage#getDeclaredStrategy_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ch.unige.cui.smv.metamodel.ts.DeclaredStrategy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(NonVariableStrategy)
	 * @see ch.unige.cui.smv.metamodel.ts.TsPackage#getDeclaredStrategy_Body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NonVariableStrategy getBody();

	/**
	 * Sets the value of the '{@link ch.unige.cui.smv.metamodel.ts.DeclaredStrategy#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(NonVariableStrategy value);

	/**
	 * Returns the value of the '<em><b>Formal Params</b></em>' containment reference list.
	 * The list contents are of type {@link ch.unige.cui.smv.metamodel.ts.VariableStrategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Params</em>' containment reference list.
	 * @see ch.unige.cui.smv.metamodel.ts.TsPackage#getDeclaredStrategy_FormalParams()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableStrategy> getFormalParams();

} // DeclaredStrategy
