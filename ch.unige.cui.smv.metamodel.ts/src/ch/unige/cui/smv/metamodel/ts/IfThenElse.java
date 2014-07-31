/**
 */
package ch.unige.cui.smv.metamodel.ts;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Then Else</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.unige.cui.smv.metamodel.ts.IfThenElse#getS1 <em>S1</em>}</li>
 *   <li>{@link ch.unige.cui.smv.metamodel.ts.IfThenElse#getS2 <em>S2</em>}</li>
 *   <li>{@link ch.unige.cui.smv.metamodel.ts.IfThenElse#getS3 <em>S3</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.unige.cui.smv.metamodel.ts.TsPackage#getIfThenElse()
 * @model
 * @generated
 */
public interface IfThenElse extends NonVariableStrategy {
	/**
	 * Returns the value of the '<em><b>S1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>S1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S1</em>' containment reference.
	 * @see #setS1(Strategy)
	 * @see ch.unige.cui.smv.metamodel.ts.TsPackage#getIfThenElse_S1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Strategy getS1();

	/**
	 * Sets the value of the '{@link ch.unige.cui.smv.metamodel.ts.IfThenElse#getS1 <em>S1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>S1</em>' containment reference.
	 * @see #getS1()
	 * @generated
	 */
	void setS1(Strategy value);

	/**
	 * Returns the value of the '<em><b>S2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>S2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S2</em>' containment reference.
	 * @see #setS2(Strategy)
	 * @see ch.unige.cui.smv.metamodel.ts.TsPackage#getIfThenElse_S2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Strategy getS2();

	/**
	 * Sets the value of the '{@link ch.unige.cui.smv.metamodel.ts.IfThenElse#getS2 <em>S2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>S2</em>' containment reference.
	 * @see #getS2()
	 * @generated
	 */
	void setS2(Strategy value);

	/**
	 * Returns the value of the '<em><b>S3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>S3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S3</em>' containment reference.
	 * @see #setS3(Strategy)
	 * @see ch.unige.cui.smv.metamodel.ts.TsPackage#getIfThenElse_S3()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Strategy getS3();

	/**
	 * Sets the value of the '{@link ch.unige.cui.smv.metamodel.ts.IfThenElse#getS3 <em>S3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>S3</em>' containment reference.
	 * @see #getS3()
	 * @generated
	 */
	void setS3(Strategy value);

} // IfThenElse
