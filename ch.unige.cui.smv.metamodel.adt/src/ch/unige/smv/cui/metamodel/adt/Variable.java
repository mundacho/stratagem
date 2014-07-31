/**
 */
package ch.unige.smv.cui.metamodel.adt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.Variable#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends ATerm {
	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' reference.
	 * @see #setDeclaration(VariableDeclaration)
	 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage#getVariable_Declaration()
	 * @model
	 * @generated
	 */
	VariableDeclaration getDeclaration();

	/**
	 * Sets the value of the '{@link ch.unige.smv.cui.metamodel.adt.Variable#getDeclaration <em>Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' reference.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(VariableDeclaration value);

} // Variable
