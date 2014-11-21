/**
 */
package ch.unige.cui.smv.metamodel.ts.impl;

import ch.unige.cui.smv.metamodel.ts.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TsFactoryImpl extends EFactoryImpl implements TsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TsFactory init() {
		try {
			TsFactory theTsFactory = (TsFactory)EPackage.Registry.INSTANCE.getEFactory(TsPackage.eNS_URI);
			if (theTsFactory != null) {
				return theTsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TsPackage.TRANSITION_SYSTEM: return createTransitionSystem();
			case TsPackage.DECLARED_STRATEGY: return createDeclaredStrategy();
			case TsPackage.VARIABLE_STRATEGY: return createVariableStrategy();
			case TsPackage.IDENTITY: return createIdentity();
			case TsPackage.FAIL: return createFail();
			case TsPackage.CHOICE: return createChoice();
			case TsPackage.DECLARED_STRATEGY_INSTANCE: return createDeclaredStrategyInstance();
			case TsPackage.FIX_POINT_STRATEGY: return createFixPointStrategy();
			case TsPackage.IF_THEN_ELSE: return createIfThenElse();
			case TsPackage.NOT: return createNot();
			case TsPackage.ONE: return createOne();
			case TsPackage.SATURATION: return createSaturation();
			case TsPackage.SEQUENCE: return createSequence();
			case TsPackage.UNION: return createUnion();
			case TsPackage.SIMPLE_STRATEGY: return createSimpleStrategy();
			case TsPackage.ALL: return createAll();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionSystem createTransitionSystem() {
		TransitionSystemImpl transitionSystem = new TransitionSystemImpl();
		return transitionSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaredStrategy createDeclaredStrategy() {
		DeclaredStrategyImpl declaredStrategy = new DeclaredStrategyImpl();
		return declaredStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableStrategy createVariableStrategy() {
		VariableStrategyImpl variableStrategy = new VariableStrategyImpl();
		return variableStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identity createIdentity() {
		IdentityImpl identity = new IdentityImpl();
		return identity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fail createFail() {
		FailImpl fail = new FailImpl();
		return fail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choice createChoice() {
		ChoiceImpl choice = new ChoiceImpl();
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclaredStrategyInstance createDeclaredStrategyInstance() {
		DeclaredStrategyInstanceImpl declaredStrategyInstance = new DeclaredStrategyInstanceImpl();
		return declaredStrategyInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixPointStrategy createFixPointStrategy() {
		FixPointStrategyImpl fixPointStrategy = new FixPointStrategyImpl();
		return fixPointStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfThenElse createIfThenElse() {
		IfThenElseImpl ifThenElse = new IfThenElseImpl();
		return ifThenElse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public One createOne() {
		OneImpl one = new OneImpl();
		return one;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Saturation createSaturation() {
		SaturationImpl saturation = new SaturationImpl();
		return saturation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Union createUnion() {
		UnionImpl union = new UnionImpl();
		return union;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleStrategy createSimpleStrategy() {
		SimpleStrategyImpl simpleStrategy = new SimpleStrategyImpl();
		return simpleStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public All createAll() {
		AllImpl all = new AllImpl();
		return all;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TsPackage getTsPackage() {
		return (TsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TsPackage getPackage() {
		return TsPackage.eINSTANCE;
	}

} //TsFactoryImpl
