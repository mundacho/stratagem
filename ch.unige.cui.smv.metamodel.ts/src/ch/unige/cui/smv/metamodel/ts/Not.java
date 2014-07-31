/**
 */
package ch.unige.cui.smv.metamodel.ts;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.unige.cui.smv.metamodel.ts.Not#getS <em>S</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.unige.cui.smv.metamodel.ts.TsPackage#getNot()
 * @model
 * @generated
 */
public interface Not extends NonVariableStrategy {
	/**
	 * Returns the value of the '<em><b>S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>S</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S</em>' containment reference.
	 * @see #setS(Strategy)
	 * @see ch.unige.cui.smv.metamodel.ts.TsPackage#getNot_S()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Strategy getS();

	/**
	 * Sets the value of the '{@link ch.unige.cui.smv.metamodel.ts.Not#getS <em>S</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>S</em>' containment reference.
	 * @see #getS()
	 * @generated
	 */
	void setS(Strategy value);

} // Not
