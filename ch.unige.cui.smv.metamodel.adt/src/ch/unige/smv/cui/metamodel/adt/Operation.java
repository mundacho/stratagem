/**
 */
package ch.unige.smv.cui.metamodel.adt;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.Operation#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.Operation#getFormalParameters <em>Formal Parameters</em>}</li>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.Operation#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage#getOperation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidReturnType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ValidReturnType='Tuple {\n\tmessage : String = \'The return type for operation \' + name + \' was not set.\',\n\tstatus : Boolean = returnType <> null\n}.status'"
 * @generated
 */
public interface Operation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"op"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage#getOperation_Name()
	 * @model default="op" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ch.unige.smv.cui.metamodel.adt.Operation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(ASort)
	 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage#getOperation_ReturnType()
	 * @model required="true"
	 * @generated
	 */
	ASort getReturnType();

	/**
	 * Sets the value of the '{@link ch.unige.smv.cui.metamodel.adt.Operation#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(ASort value);

	/**
	 * Returns the value of the '<em><b>Formal Parameters</b></em>' reference list.
	 * The list contents are of type {@link ch.unige.smv.cui.metamodel.adt.ASort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Parameters</em>' reference list.
	 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage#getOperation_FormalParameters()
	 * @model extendedMetaData="group='#params'"
	 * @generated
	 */
	EList<ASort> getFormalParameters();

} // Operation
