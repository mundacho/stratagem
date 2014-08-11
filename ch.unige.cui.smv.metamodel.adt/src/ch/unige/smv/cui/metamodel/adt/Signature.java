/**
 */
package ch.unige.smv.cui.metamodel.adt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.Signature#getOps <em>Ops</em>}</li>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.Signature#getAllOperations <em>All Operations</em>}</li>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.Signature#getSorts <em>Sorts</em>}</li>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.Signature#getOperations <em>Operations</em>}</li>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.Signature#getGenerators <em>Generators</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage#getSignature()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueSorts UniqueOperations'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot UniqueSorts='Tuple {\n\tmessage : String = \'There are some sorts in the adt that appear more than once: \' + sorts\n\t\t\t->select(s1 | (sorts\n\t\t\t\t->select(s2 | (s2.name = s1.name))\n\t\t\t\t->size() > 1))\n\t\t\t->collect(name)\n\t\t\t->toString(),\n\tstatus : Boolean = sorts <> null implies sorts\n\t\t\t->isUnique(name)\n}.status' UniqueOperations='Tuple {\n\tmessage : String = \'There are some operations in the adt that appear more than once: \' + allOperations\n\t\t\t->select(op1 | (allOperations\n\t\t\t\t->select(op2 | (op2.name = op1.name))\n\t\t\t\t->size() > 1))\n\t\t\t->collect(name)\n\t\t\t->toString(),\n\tstatus : Boolean = allOperations\n\t\t\t->isUnique(name)\n}.status'"
 * @generated
 */
public interface Signature extends EObject {
	/**
	 * Returns the value of the '<em><b>Sorts</b></em>' containment reference list.
	 * The list contents are of type {@link ch.unige.smv.cui.metamodel.adt.ASort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorts</em>' containment reference list.
	 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage#getSignature_Sorts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ASort> getSorts();
	
	/**
	 * Returns the same signature with a new sort. WARNING: This method modifies the current signature.
	 * 	
	 * @param sortName the name of the sort to be created.
	 * @return the modified signature.
	 */
	Signature withSort(String sortName);
	
	/**
	 * @param sortName the sort name.
	 * @param superSortName the super sort name.
	 * @return the same signature with a new sort
	 */
	Signature withSort(String sortName, String superSortName);
	
	
	
	/**
	 * Returns the same signature with a new generator. WARNING: This method modifies the current signature.
	 * @param generatorName
	 * @param returnSort the name of the return sort
	 * @param sortNames the names of the sorts in the parameters
	 * @return the modified signature
	 */
	Signature withGenerator(String generatorName, String returnSort, String... sortNames);

	/**
	 * Returns the same signature with a new operation. WARNING: This method modifies the current signature.
	 * @param operationName
	 * @param returnSort the name of the return sort
	 * @param sortNames the names of the sorts in the parameters
	 * @return the modified signature
	 */
	Signature withOperation(String operationName, String returnSort, String... sortNames);
	

	/**
	 * Returns the value of the '<em><b>All Operations</b></em>' reference list.
	 * The list contents are of type {@link ch.unige.smv.cui.metamodel.adt.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Decorator for all operations. It allows to get all operations in one list.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Operations</em>' reference list.
	 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage#getSignature_AllOperations()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Operation> getAllOperations();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link ch.unige.smv.cui.metamodel.adt.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage#getSignature_Operations()
	 * @model containment="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#ops'"
	 * @generated
	 */
	EList<Operation> getOperations();

	/**
	 * Returns the value of the '<em><b>Generators</b></em>' containment reference list.
	 * The list contents are of type {@link ch.unige.smv.cui.metamodel.adt.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generators</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generators</em>' containment reference list.
	 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage#getSignature_Generators()
	 * @model containment="true" required="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#ops'"
	 * @generated
	 */
	EList<Operation> getGenerators();

	/**
	 * Returns the value of the '<em><b>Ops</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ops</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ops</em>' attribute list.
	 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage#getSignature_Ops()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true"
	 *        extendedMetaData="kind='group'"
	 * @generated
	 */
	FeatureMap getOps();
	
	/**
	 * Gets an operation.
	 * @param name the name of the operation to get.
	 * @return the operation.
	 */
	Operation getOperationByName(String name);
	
	/**
	 * @param name the name of the sort
	 * @return a sort in this signature with the given name.
	 */
	ASort getSortByName(String name);
	

} // Signature
