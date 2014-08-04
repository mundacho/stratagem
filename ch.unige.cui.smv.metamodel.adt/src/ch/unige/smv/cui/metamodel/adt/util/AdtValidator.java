/**
 */
package ch.unige.smv.cui.metamodel.adt.util;

import java.util.Map;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import ch.unige.smv.cui.metamodel.adt.ADT;
import ch.unige.smv.cui.metamodel.adt.ASort;
import ch.unige.smv.cui.metamodel.adt.ATerm;
import ch.unige.smv.cui.metamodel.adt.AdtPackage;
import ch.unige.smv.cui.metamodel.adt.Equation;
import ch.unige.smv.cui.metamodel.adt.Operation;
import ch.unige.smv.cui.metamodel.adt.Signature;
import ch.unige.smv.cui.metamodel.adt.Sort;
import ch.unige.smv.cui.metamodel.adt.SubSort;
import ch.unige.smv.cui.metamodel.adt.Term;
import ch.unige.smv.cui.metamodel.adt.Variable;
import ch.unige.smv.cui.metamodel.adt.VariableDeclaration;

/**
 * <!-- begin-user-doc --> 
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage
 * @generated
 */
public class AdtValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final AdtValidator INSTANCE = new AdtValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ch.unige.smv.cui.metamodel.adt";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public AdtValidator() {
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
	  return AdtPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case AdtPackage.ADT:
				return validateADT((ADT)value, diagnostics, context);
			case AdtPackage.ASORT:
				return validateASort((ASort)value, diagnostics, context);
			case AdtPackage.SUB_SORT:
				return validateSubSort((SubSort)value, diagnostics, context);
			case AdtPackage.SORT:
				return validateSort((Sort)value, diagnostics, context);
			case AdtPackage.SIGNATURE:
				return validateSignature((Signature)value, diagnostics, context);
			case AdtPackage.VARIABLE_DECLARATION:
				return validateVariableDeclaration((VariableDeclaration)value, diagnostics, context);
			case AdtPackage.OPERATION:
				return validateOperation((Operation)value, diagnostics, context);
			case AdtPackage.ATERM:
				return validateATerm((ATerm)value, diagnostics, context);
			case AdtPackage.TERM:
				return validateTerm((Term)value, diagnostics, context);
			case AdtPackage.VARIABLE:
				return validateVariable((Variable)value, diagnostics, context);
			case AdtPackage.EQUATION:
				return validateEquation((Equation)value, diagnostics, context);
			case AdtPackage.OBJECT:
				return validateObject(value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateADT(ADT adt, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(adt, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(adt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(adt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(adt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(adt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(adt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(adt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(adt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(adt, diagnostics, context);
		if (result || diagnostics != null) result &= validateADT_UniqueVariableNames(adt, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueVariableNames constraint of '<em>ADT</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ADT__UNIQUE_VARIABLE_NAMES__EEXPRESSION = "variables\n" +
		"\t\t\t->isUnique(name)";

	/**
	 * Validates the UniqueVariableNames constraint of '<em>ADT</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateADT_UniqueVariableNames(ADT adt,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AdtPackage.Literals.ADT,
				 adt,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UniqueVariableNames",
				 ADT__UNIQUE_VARIABLE_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateASort(ASort aSort, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(aSort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(aSort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(aSort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(aSort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(aSort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(aSort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(aSort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(aSort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(aSort, diagnostics, context);
		if (result || diagnostics != null) result &= validateASort_NameNotEmpty(aSort, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NameNotEmpty constraint of '<em>ASort</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ASORT__NAME_NOT_EMPTY__EEXPRESSION = "name <> ''";

	/**
	 * Validates the NameNotEmpty constraint of '<em>ASort</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateASort_NameNotEmpty(ASort aSort,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AdtPackage.Literals.ASORT,
				 aSort,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NameNotEmpty",
				 ASORT__NAME_NOT_EMPTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubSort(SubSort subSort,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(subSort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(subSort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(subSort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(subSort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(subSort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(subSort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(subSort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(subSort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(subSort, diagnostics, context);
		if (result || diagnostics != null) result &= validateASort_NameNotEmpty(subSort, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubSort_SuperSortNotNull(subSort, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SuperSortNotNull constraint of '<em>Sub Sort</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SUB_SORT__SUPER_SORT_NOT_NULL__EEXPRESSION = "superSort <> null";

	/**
	 * Validates the SuperSortNotNull constraint of '<em>Sub Sort</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSubSort_SuperSortNotNull(SubSort subSort,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AdtPackage.Literals.SUB_SORT,
				 subSort,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SuperSortNotNull",
				 SUB_SORT__SUPER_SORT_NOT_NULL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSort(Sort sort, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sort, diagnostics, context);
		if (result || diagnostics != null) result &= validateASort_NameNotEmpty(sort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignature(Signature signature,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(signature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(signature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(signature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(signature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(signature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(signature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(signature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(signature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(signature, diagnostics, context);
		if (result || diagnostics != null) result &= validateSignature_UniqueSorts(signature, diagnostics, context);
		if (result || diagnostics != null) result &= validateSignature_UniqueOperations(signature, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueSorts constraint of '<em>Signature</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SIGNATURE__UNIQUE_SORTS__EEXPRESSION = "sorts\n" +
		"\t\t\t->isUnique(name)";

	/**
	 * Validates the UniqueSorts constraint of '<em>Signature</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSignature_UniqueSorts(Signature signature,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AdtPackage.Literals.SIGNATURE,
				 signature,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UniqueSorts",
				 SIGNATURE__UNIQUE_SORTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the UniqueOperations constraint of '<em>Signature</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SIGNATURE__UNIQUE_OPERATIONS__EEXPRESSION = "allOperations\n" +
		"\t\t\t->isUnique(name)";

	/**
	 * Validates the UniqueOperations constraint of '<em>Signature</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateSignature_UniqueOperations(Signature signature,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AdtPackage.Literals.SIGNATURE,
				 signature,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UniqueOperations",
				 SIGNATURE__UNIQUE_OPERATIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableDeclaration(
			VariableDeclaration variableDeclaration,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(variableDeclaration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(variableDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(variableDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(variableDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(variableDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(variableDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(variableDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(variableDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(variableDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validateVariableDeclaration_NameNotEmpty(variableDeclaration, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NameNotEmpty constraint of '
	 * <em>Variable Declaration</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected static final String VARIABLE_DECLARATION__NAME_NOT_EMPTY__EEXPRESSION = "name <> ''";

	/**
	 * Validates the NameNotEmpty constraint of '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableDeclaration_NameNotEmpty(
			VariableDeclaration variableDeclaration,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AdtPackage.Literals.VARIABLE_DECLARATION,
				 variableDeclaration,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NameNotEmpty",
				 VARIABLE_DECLARATION__NAME_NOT_EMPTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation(Operation operation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_ValidReturnType(operation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ValidReturnType constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPERATION__VALID_RETURN_TYPE__EEXPRESSION = "returnType <> null";

	/**
	 * Validates the ValidReturnType constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_ValidReturnType(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AdtPackage.Literals.OPERATION,
				 operation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ValidReturnType",
				 OPERATION__VALID_RETURN_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateATerm(ATerm aTerm, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aTerm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerm(Term term, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(term, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(term, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(term, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(term, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(term, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(term, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(term, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(term, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(term, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerm_CorrectNumberOfParameters(term, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerm_CorrectTypeOfParameters(term, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerm_RightAdtSubterms(term, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the CorrectNumberOfParameters
	 * constraint of '<em>Term</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected static final String TERM__CORRECT_NUMBER_OF_PARAMETERS__EEXPRESSION = "(operationSymbol <> null) implies  subterms->size() = operationSymbol.formalParameters->size()";

	/**
	 * Validates the CorrectNumberOfParameters constraint of '<em>Term</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerm_CorrectNumberOfParameters(Term term,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AdtPackage.Literals.TERM,
				 term,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "CorrectNumberOfParameters",
				 TERM__CORRECT_NUMBER_OF_PARAMETERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the CorrectTypeOfParameters
	 * constraint of '<em>Term</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	protected static final String TERM__CORRECT_TYPE_OF_PARAMETERS__EEXPRESSION = "subterms\n" +
		"\t\t\t->forAll(p | ((p.sort <> null) and (operationSymbol <> null)) implies p.sort.isSubSortOf(operationSymbol.formalParameters\n" +
		"\t\t\t\t\t->at(subterms\n" +
		"\t\t\t\t\t\t->indexOf(p))))";

	/**
	 * Validates the CorrectTypeOfParameters constraint of '<em>Term</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateTerm_CorrectTypeOfParameters(Term term,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AdtPackage.Literals.TERM,
				 term,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "CorrectTypeOfParameters",
				 TERM__CORRECT_TYPE_OF_PARAMETERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the RightAdtSubterms constraint of '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TERM__RIGHT_ADT_SUBTERMS__EEXPRESSION = "(subterms <> null) implies subterms->forAll(t | t.adt = self.adt)";

	/**
	 * Validates the RightAdtSubterms constraint of '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerm_RightAdtSubterms(Term term, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AdtPackage.Literals.TERM,
				 term,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "RightAdtSubterms",
				 TERM__RIGHT_ADT_SUBTERMS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable(Variable variable,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquation(Equation equation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(equation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject(Object object, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} // AdtValidator
