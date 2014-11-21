/**
 */
package ch.unige.cui.smv.metamodel.ts.util;

import ch.unige.cui.smv.metamodel.ts.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ch.unige.cui.smv.metamodel.ts.TsPackage
 * @generated
 */
public class TsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TsSwitch<Adapter> modelSwitch =
		new TsSwitch<Adapter>() {
			@Override
			public Adapter caseTransitionSystem(TransitionSystem object) {
				return createTransitionSystemAdapter();
			}
			@Override
			public Adapter caseDeclaredStrategy(DeclaredStrategy object) {
				return createDeclaredStrategyAdapter();
			}
			@Override
			public Adapter caseStrategy(Strategy object) {
				return createStrategyAdapter();
			}
			@Override
			public Adapter caseNonVariableStrategy(NonVariableStrategy object) {
				return createNonVariableStrategyAdapter();
			}
			@Override
			public Adapter caseVariableStrategy(VariableStrategy object) {
				return createVariableStrategyAdapter();
			}
			@Override
			public Adapter caseIdentity(Identity object) {
				return createIdentityAdapter();
			}
			@Override
			public Adapter caseFail(Fail object) {
				return createFailAdapter();
			}
			@Override
			public Adapter caseChoice(Choice object) {
				return createChoiceAdapter();
			}
			@Override
			public Adapter caseDeclaredStrategyInstance(DeclaredStrategyInstance object) {
				return createDeclaredStrategyInstanceAdapter();
			}
			@Override
			public Adapter caseFixPointStrategy(FixPointStrategy object) {
				return createFixPointStrategyAdapter();
			}
			@Override
			public Adapter caseIfThenElse(IfThenElse object) {
				return createIfThenElseAdapter();
			}
			@Override
			public Adapter caseNot(Not object) {
				return createNotAdapter();
			}
			@Override
			public Adapter caseOne(One object) {
				return createOneAdapter();
			}
			@Override
			public Adapter caseSaturation(Saturation object) {
				return createSaturationAdapter();
			}
			@Override
			public Adapter caseSequence(Sequence object) {
				return createSequenceAdapter();
			}
			@Override
			public Adapter caseUnion(Union object) {
				return createUnionAdapter();
			}
			@Override
			public Adapter caseSimpleStrategy(SimpleStrategy object) {
				return createSimpleStrategyAdapter();
			}
			@Override
			public Adapter caseAll(All object) {
				return createAllAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ch.unige.cui.smv.metamodel.ts.TransitionSystem <em>Transition System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.unige.cui.smv.metamodel.ts.TransitionSystem
	 * @generated
	 */
	public Adapter createTransitionSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.unige.cui.smv.metamodel.ts.DeclaredStrategy <em>Declared Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.unige.cui.smv.metamodel.ts.DeclaredStrategy
	 * @generated
	 */
	public Adapter createDeclaredStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.unige.cui.smv.metamodel.ts.Strategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.unige.cui.smv.metamodel.ts.Strategy
	 * @generated
	 */
	public Adapter createStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.unige.cui.smv.metamodel.ts.NonVariableStrategy <em>Non Variable Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.unige.cui.smv.metamodel.ts.NonVariableStrategy
	 * @generated
	 */
	public Adapter createNonVariableStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.unige.cui.smv.metamodel.ts.VariableStrategy <em>Variable Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.unige.cui.smv.metamodel.ts.VariableStrategy
	 * @generated
	 */
	public Adapter createVariableStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.unige.cui.smv.metamodel.ts.Identity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.unige.cui.smv.metamodel.ts.Identity
	 * @generated
	 */
	public Adapter createIdentityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.unige.cui.smv.metamodel.ts.Fail <em>Fail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.unige.cui.smv.metamodel.ts.Fail
	 * @generated
	 */
	public Adapter createFailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.unige.cui.smv.metamodel.ts.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.unige.cui.smv.metamodel.ts.Choice
	 * @generated
	 */
	public Adapter createChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.unige.cui.smv.metamodel.ts.DeclaredStrategyInstance <em>Declared Strategy Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.unige.cui.smv.metamodel.ts.DeclaredStrategyInstance
	 * @generated
	 */
	public Adapter createDeclaredStrategyInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.unige.cui.smv.metamodel.ts.FixPointStrategy <em>Fix Point Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.unige.cui.smv.metamodel.ts.FixPointStrategy
	 * @generated
	 */
	public Adapter createFixPointStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.unige.cui.smv.metamodel.ts.IfThenElse <em>If Then Else</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.unige.cui.smv.metamodel.ts.IfThenElse
	 * @generated
	 */
	public Adapter createIfThenElseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.unige.cui.smv.metamodel.ts.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.unige.cui.smv.metamodel.ts.Not
	 * @generated
	 */
	public Adapter createNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.unige.cui.smv.metamodel.ts.One <em>One</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.unige.cui.smv.metamodel.ts.One
	 * @generated
	 */
	public Adapter createOneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.unige.cui.smv.metamodel.ts.Saturation <em>Saturation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.unige.cui.smv.metamodel.ts.Saturation
	 * @generated
	 */
	public Adapter createSaturationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.unige.cui.smv.metamodel.ts.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.unige.cui.smv.metamodel.ts.Sequence
	 * @generated
	 */
	public Adapter createSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.unige.cui.smv.metamodel.ts.Union <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.unige.cui.smv.metamodel.ts.Union
	 * @generated
	 */
	public Adapter createUnionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.unige.cui.smv.metamodel.ts.SimpleStrategy <em>Simple Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.unige.cui.smv.metamodel.ts.SimpleStrategy
	 * @generated
	 */
	public Adapter createSimpleStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ch.unige.cui.smv.metamodel.ts.All <em>All</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ch.unige.cui.smv.metamodel.ts.All
	 * @generated
	 */
	public Adapter createAllAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TsAdapterFactory
