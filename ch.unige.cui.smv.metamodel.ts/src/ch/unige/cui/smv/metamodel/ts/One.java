/**
 */
package ch.unige.cui.smv.metamodel.ts;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.unige.cui.smv.metamodel.ts.One#getN <em>N</em>}</li>
 *   <li>{@link ch.unige.cui.smv.metamodel.ts.One#getS <em>S</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.unige.cui.smv.metamodel.ts.TsPackage#getOne()
 * @model
 * @generated
 */
public interface One extends NonVariableStrategy {
	/**
	 * Returns the value of the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>N</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>N</em>' attribute.
	 * @see #setN(int)
	 * @see ch.unige.cui.smv.metamodel.ts.TsPackage#getOne_N()
	 * @model required="true"
	 * @generated
	 */
	int getN();

	/**
	 * Sets the value of the '{@link ch.unige.cui.smv.metamodel.ts.One#getN <em>N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>N</em>' attribute.
	 * @see #getN()
	 * @generated
	 */
	void setN(int value);

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
	 * @see ch.unige.cui.smv.metamodel.ts.TsPackage#getOne_S()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Strategy getS();

	/**
	 * Sets the value of the '{@link ch.unige.cui.smv.metamodel.ts.One#getS <em>S</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>S</em>' containment reference.
	 * @see #getS()
	 * @generated
	 */
	void setS(Strategy value);

} // One
