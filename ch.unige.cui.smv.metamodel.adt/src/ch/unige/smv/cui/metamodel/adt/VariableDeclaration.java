/**
 */
package ch.unige.smv.cui.metamodel.adt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.VariableDeclaration#getSort <em>Sort</em>}</li>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.VariableDeclaration#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage#getVariableDeclaration()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NameNotEmpty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NameNotEmpty='name <> \'\''"
 * @generated
 */
public interface VariableDeclaration extends EObject {
	/**
	 * Returns the value of the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort</em>' reference.
	 * @see #setSort(ASort)
	 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage#getVariableDeclaration_Sort()
	 * @model required="true"
	 * @generated
	 */
	ASort getSort();

	/**
	 * Sets the value of the '{@link ch.unige.smv.cui.metamodel.adt.VariableDeclaration#getSort <em>Sort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort</em>' reference.
	 * @see #getSort()
	 * @generated
	 */
	void setSort(ASort value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"v"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage#getVariableDeclaration_Name()
	 * @model default="v" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ch.unige.smv.cui.metamodel.adt.VariableDeclaration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // VariableDeclaration
