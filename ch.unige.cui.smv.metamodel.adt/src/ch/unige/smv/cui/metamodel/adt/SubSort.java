/**
 */
package ch.unige.smv.cui.metamodel.adt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Sort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.SubSort#getSuperSort <em>Super Sort</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage#getSubSort()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SuperSortNotNull'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SuperSortNotNull='superSort <> null' SuperSortNotNull$message='\'The super sort of sort \' + name + \'cannot be null\''"
 * @generated
 */
public interface SubSort extends ASort {
	/**
	 * Returns the value of the '<em><b>Super Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Sort</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Sort</em>' reference.
	 * @see #setSuperSort(ASort)
	 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage#getSubSort_SuperSort()
	 * @model required="true"
	 * @generated
	 */
	ASort getSuperSort();

	/**
	 * Sets the value of the '{@link ch.unige.smv.cui.metamodel.adt.SubSort#getSuperSort <em>Super Sort</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Sort</em>' reference.
	 * @see #getSuperSort()
	 * @generated
	 */
	void setSuperSort(ASort value);

} // SubSort
