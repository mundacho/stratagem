/**
 */
package ch.unige.cui.smv.metamodel.ts.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.ocl.examples.xtext.oclinecore.validation.OCLinEcoreEObjectValidator;

import ch.unige.cui.smv.metamodel.ts.All;
import ch.unige.cui.smv.metamodel.ts.Choice;
import ch.unige.cui.smv.metamodel.ts.DeclaredStrategy;
import ch.unige.cui.smv.metamodel.ts.DeclaredStrategyInstance;
import ch.unige.cui.smv.metamodel.ts.Fail;
import ch.unige.cui.smv.metamodel.ts.FixPointStrategy;
import ch.unige.cui.smv.metamodel.ts.Identity;
import ch.unige.cui.smv.metamodel.ts.IfThenElse;
import ch.unige.cui.smv.metamodel.ts.NonVariableStrategy;
import ch.unige.cui.smv.metamodel.ts.Not;
import ch.unige.cui.smv.metamodel.ts.One;
import ch.unige.cui.smv.metamodel.ts.Saturation;
import ch.unige.cui.smv.metamodel.ts.Sequence;
import ch.unige.cui.smv.metamodel.ts.SimpleStrategy;
import ch.unige.cui.smv.metamodel.ts.Strategy;
import ch.unige.cui.smv.metamodel.ts.TransitionSystem;
import ch.unige.cui.smv.metamodel.ts.TsPackage;
import ch.unige.cui.smv.metamodel.ts.Union;
import ch.unige.cui.smv.metamodel.ts.VariableStrategy;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ch.unige.cui.smv.metamodel.ts.TsPackage
 * @generated
 */
public class TsValidator extends OCLinEcoreEObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TsValidator INSTANCE = new TsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ch.unige.cui.smv.metamodel.ts";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TsValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return TsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case TsPackage.TRANSITION_SYSTEM:
				return validateTransitionSystem((TransitionSystem)value, diagnostics, context);
			case TsPackage.DECLARED_STRATEGY:
				return validateDeclaredStrategy((DeclaredStrategy)value, diagnostics, context);
			case TsPackage.STRATEGY:
				return validateStrategy((Strategy)value, diagnostics, context);
			case TsPackage.NON_VARIABLE_STRATEGY:
				return validateNonVariableStrategy((NonVariableStrategy)value, diagnostics, context);
			case TsPackage.VARIABLE_STRATEGY:
				return validateVariableStrategy((VariableStrategy)value, diagnostics, context);
			case TsPackage.IDENTITY:
				return validateIdentity((Identity)value, diagnostics, context);
			case TsPackage.FAIL:
				return validateFail((Fail)value, diagnostics, context);
			case TsPackage.CHOICE:
				return validateChoice((Choice)value, diagnostics, context);
			case TsPackage.DECLARED_STRATEGY_INSTANCE:
				return validateDeclaredStrategyInstance((DeclaredStrategyInstance)value, diagnostics, context);
			case TsPackage.FIX_POINT_STRATEGY:
				return validateFixPointStrategy((FixPointStrategy)value, diagnostics, context);
			case TsPackage.IF_THEN_ELSE:
				return validateIfThenElse((IfThenElse)value, diagnostics, context);
			case TsPackage.NOT:
				return validateNot((Not)value, diagnostics, context);
			case TsPackage.ONE:
				return validateOne((One)value, diagnostics, context);
			case TsPackage.SATURATION:
				return validateSaturation((Saturation)value, diagnostics, context);
			case TsPackage.SEQUENCE:
				return validateSequence((Sequence)value, diagnostics, context);
			case TsPackage.UNION:
				return validateUnion((Union)value, diagnostics, context);
			case TsPackage.SIMPLE_STRATEGY:
				return validateSimpleStrategy((SimpleStrategy)value, diagnostics, context);
			case TsPackage.ALL:
				return validateAll((All)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionSystem(TransitionSystem transitionSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transitionSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeclaredStrategy(DeclaredStrategy declaredStrategy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(declaredStrategy, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(declaredStrategy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(declaredStrategy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(declaredStrategy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(declaredStrategy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(declaredStrategy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(declaredStrategy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(declaredStrategy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(declaredStrategy, diagnostics, context);
		if (result || diagnostics != null) result &= validateDeclaredStrategy_UniqueVariableParameters(declaredStrategy, diagnostics, context);
		if (result || diagnostics != null) result &= validateDeclaredStrategy_ValidFormalParams(declaredStrategy, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueVariableParameters constraint of '<em>Declared Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DECLARED_STRATEGY__UNIQUE_VARIABLE_PARAMETERS__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The parameter names are not unique for declared strategy: ' + name,\n" +
		"\tstatus : Boolean = formalParams\n" +
		"\t\t\t<> null implies formalParams\n" +
		"\t\t\t->isUnique(name)\n" +
		"}.status";

	/**
	 * Validates the UniqueVariableParameters constraint of '<em>Declared Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeclaredStrategy_UniqueVariableParameters(DeclaredStrategy declaredStrategy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TsPackage.Literals.DECLARED_STRATEGY,
				 declaredStrategy,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UniqueVariableParameters",
				 DECLARED_STRATEGY__UNIQUE_VARIABLE_PARAMETERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ValidFormalParams constraint of '<em>Declared Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DECLARED_STRATEGY__VALID_FORMAL_PARAMS__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Formal params for strategy ' + name + ' are null',\n" +
		"\tstatus : Boolean = formalParams <> null\n" +
		"}.status";

	/**
	 * Validates the ValidFormalParams constraint of '<em>Declared Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeclaredStrategy_ValidFormalParams(DeclaredStrategy declaredStrategy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TsPackage.Literals.DECLARED_STRATEGY,
				 declaredStrategy,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ValidFormalParams",
				 DECLARED_STRATEGY__VALID_FORMAL_PARAMS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrategy(Strategy strategy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(strategy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonVariableStrategy(NonVariableStrategy nonVariableStrategy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nonVariableStrategy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableStrategy(VariableStrategy variableStrategy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableStrategy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentity(Identity identity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFail(Fail fail, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fail, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChoice(Choice choice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(choice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeclaredStrategyInstance(DeclaredStrategyInstance declaredStrategyInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(declaredStrategyInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(declaredStrategyInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(declaredStrategyInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(declaredStrategyInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(declaredStrategyInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(declaredStrategyInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(declaredStrategyInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(declaredStrategyInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(declaredStrategyInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateDeclaredStrategyInstance_RightNumberOfParams(declaredStrategyInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the RightNumberOfParams constraint of '<em>Declared Strategy Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DECLARED_STRATEGY_INSTANCE__RIGHT_NUMBER_OF_PARAMS__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Invalid number of parameters for strategy ' + name + '. Required ' +\n" +
		"\t\t\tdeclaration.formalParams\n" +
		"\t\t\t->size()\n" +
		"\t\t\t->toString() + ', found ' + actualParams\n" +
		"\t\t\t->size()\n" +
		"\t\t\t->toString(),\n" +
		"\tstatus : Boolean = (declaration <> null) implies declaration.formalParams\n" +
		"\t\t\t->size() = actualParams\n" +
		"\t\t\t->size()\n" +
		"}.status";

	/**
	 * Validates the RightNumberOfParams constraint of '<em>Declared Strategy Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeclaredStrategyInstance_RightNumberOfParams(DeclaredStrategyInstance declaredStrategyInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TsPackage.Literals.DECLARED_STRATEGY_INSTANCE,
				 declaredStrategyInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "RightNumberOfParams",
				 DECLARED_STRATEGY_INSTANCE__RIGHT_NUMBER_OF_PARAMS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFixPointStrategy(FixPointStrategy fixPointStrategy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fixPointStrategy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIfThenElse(IfThenElse ifThenElse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ifThenElse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNot(Not not, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(not, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOne(One one, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(one, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSaturation(Saturation saturation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(saturation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequence(Sequence sequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sequence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnion(Union union, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(union, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleStrategy(SimpleStrategy simpleStrategy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleStrategy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAll(All all, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(all, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //TsValidator
