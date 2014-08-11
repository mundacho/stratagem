/**
 */
package ch.unige.cui.smv.metamodel.ts;

import ch.unige.smv.cui.metamodel.adt.ADT;
import ch.unige.smv.cui.metamodel.adt.ATerm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.unige.cui.smv.metamodel.ts.TransitionSystem#getAdt <em>Adt</em>}</li>
 *   <li>{@link ch.unige.cui.smv.metamodel.ts.TransitionSystem#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link ch.unige.cui.smv.metamodel.ts.TransitionSystem#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link ch.unige.cui.smv.metamodel.ts.TransitionSystem#getAuxiliary <em>Auxiliary</em>}</li>
 *   <li>{@link ch.unige.cui.smv.metamodel.ts.TransitionSystem#getStrats <em>Strats</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.unige.cui.smv.metamodel.ts.TsPackage#getTransitionSystem()
 * @model
 * @generated
 */
public interface TransitionSystem extends EObject {
	
	DeclaredStrategy getDeclaredStrategyByName(String name);
	
	
	/**
	 * Returns the value of the '<em><b>Adt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adt</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adt</em>' containment reference.
	 * @see #setAdt(ADT)
	 * @see ch.unige.cui.smv.metamodel.ts.TsPackage#getTransitionSystem_Adt()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ADT getAdt();

	/**
	 * Sets the value of the '{@link ch.unige.cui.smv.metamodel.ts.TransitionSystem#getAdt <em>Adt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adt</em>' containment reference.
	 * @see #getAdt()
	 * @generated
	 */
	void setAdt(ADT value);

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' containment reference.
	 * @see #setInitialState(ATerm)
	 * @see ch.unige.cui.smv.metamodel.ts.TsPackage#getTransitionSystem_InitialState()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ATerm getInitialState();

	/**
	 * Sets the value of the '{@link ch.unige.cui.smv.metamodel.ts.TransitionSystem#getInitialState <em>Initial State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' containment reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(ATerm value);

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link ch.unige.cui.smv.metamodel.ts.DeclaredStrategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see ch.unige.cui.smv.metamodel.ts.TsPackage#getTransitionSystem_Transitions()
	 * @model containment="true" required="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#strats'"
	 * @generated
	 */
	EList<DeclaredStrategy> getTransitions();

	/**
	 * Returns the value of the '<em><b>Auxiliary</b></em>' containment reference list.
	 * The list contents are of type {@link ch.unige.cui.smv.metamodel.ts.DeclaredStrategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auxiliary</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auxiliary</em>' containment reference list.
	 * @see ch.unige.cui.smv.metamodel.ts.TsPackage#getTransitionSystem_Auxiliary()
	 * @model containment="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#strats'"
	 * @generated
	 */
	EList<DeclaredStrategy> getAuxiliary();

	/**
	 * Returns the value of the '<em><b>Strats</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strats</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strats</em>' attribute list.
	 * @see ch.unige.cui.smv.metamodel.ts.TsPackage#getTransitionSystem_Strats()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="true" transient="true"
	 *        extendedMetaData="kind='group'"
	 * @generated
	 */
	FeatureMap getStrats();

} // TransitionSystem
