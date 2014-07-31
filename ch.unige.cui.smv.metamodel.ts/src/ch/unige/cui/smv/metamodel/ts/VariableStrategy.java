/**
 */
package ch.unige.cui.smv.metamodel.ts;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.unige.cui.smv.metamodel.ts.VariableStrategy#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.unige.cui.smv.metamodel.ts.TsPackage#getVariableStrategy()
 * @model
 * @generated
 */
public interface VariableStrategy extends Strategy {
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
	 * @see ch.unige.cui.smv.metamodel.ts.TsPackage#getVariableStrategy_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ch.unige.cui.smv.metamodel.ts.VariableStrategy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // VariableStrategy
