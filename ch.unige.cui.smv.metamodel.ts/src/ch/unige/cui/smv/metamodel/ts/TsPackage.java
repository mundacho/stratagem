/**
 */
package ch.unige.cui.smv.metamodel.ts;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ch.unige.cui.smv.metamodel.ts.TsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import adt_0='http://cui.unige.ch/smv/adt.ecore#/' ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface TsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ts";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cui.unige.ch/smv/transitionsystem.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ts";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TsPackage eINSTANCE = ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl.init();

	/**
	 * The meta object id for the '{@link ch.unige.cui.smv.metamodel.ts.impl.TransitionSystemImpl <em>Transition System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.unige.cui.smv.metamodel.ts.impl.TransitionSystemImpl
	 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getTransitionSystem()
	 * @generated
	 */
	int TRANSITION_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Adt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SYSTEM__ADT = 0;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SYSTEM__INITIAL_STATE = 1;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SYSTEM__TRANSITIONS = 2;

	/**
	 * The feature id for the '<em><b>Auxiliary</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SYSTEM__AUXILIARY = 3;

	/**
	 * The feature id for the '<em><b>Strats</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SYSTEM__STRATS = 4;

	/**
	 * The number of structural features of the '<em>Transition System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SYSTEM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Transition System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.unige.cui.smv.metamodel.ts.impl.DeclaredStrategyImpl <em>Declared Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.unige.cui.smv.metamodel.ts.impl.DeclaredStrategyImpl
	 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getDeclaredStrategy()
	 * @generated
	 */
	int DECLARED_STRATEGY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_STRATEGY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_STRATEGY__BODY = 1;

	/**
	 * The feature id for the '<em><b>Formal Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_STRATEGY__FORMAL_PARAMS = 2;

	/**
	 * The number of structural features of the '<em>Declared Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_STRATEGY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Declared Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_STRATEGY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.unige.cui.smv.metamodel.ts.impl.StrategyImpl <em>Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.unige.cui.smv.metamodel.ts.impl.StrategyImpl
	 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getStrategy()
	 * @generated
	 */
	int STRATEGY = 2;

	/**
	 * The number of structural features of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.unige.cui.smv.metamodel.ts.impl.NonVariableStrategyImpl <em>Non Variable Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.unige.cui.smv.metamodel.ts.impl.NonVariableStrategyImpl
	 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getNonVariableStrategy()
	 * @generated
	 */
	int NON_VARIABLE_STRATEGY = 3;

	/**
	 * The number of structural features of the '<em>Non Variable Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_VARIABLE_STRATEGY_FEATURE_COUNT = STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Non Variable Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_VARIABLE_STRATEGY_OPERATION_COUNT = STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.unige.cui.smv.metamodel.ts.impl.VariableStrategyImpl <em>Variable Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.unige.cui.smv.metamodel.ts.impl.VariableStrategyImpl
	 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getVariableStrategy()
	 * @generated
	 */
	int VARIABLE_STRATEGY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_STRATEGY__NAME = STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_STRATEGY_FEATURE_COUNT = STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_STRATEGY_OPERATION_COUNT = STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.unige.cui.smv.metamodel.ts.impl.IdentityImpl <em>Identity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.unige.cui.smv.metamodel.ts.impl.IdentityImpl
	 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getIdentity()
	 * @generated
	 */
	int IDENTITY = 5;

	/**
	 * The number of structural features of the '<em>Identity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_FEATURE_COUNT = NON_VARIABLE_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Identity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_OPERATION_COUNT = NON_VARIABLE_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.unige.cui.smv.metamodel.ts.impl.FailImpl <em>Fail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.unige.cui.smv.metamodel.ts.impl.FailImpl
	 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getFail()
	 * @generated
	 */
	int FAIL = 6;

	/**
	 * The number of structural features of the '<em>Fail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIL_FEATURE_COUNT = NON_VARIABLE_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIL_OPERATION_COUNT = NON_VARIABLE_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.unige.cui.smv.metamodel.ts.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.unige.cui.smv.metamodel.ts.impl.ChoiceImpl
	 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 7;

	/**
	 * The feature id for the '<em><b>S1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__S1 = NON_VARIABLE_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>S2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__S2 = NON_VARIABLE_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = NON_VARIABLE_STRATEGY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_OPERATION_COUNT = NON_VARIABLE_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.unige.cui.smv.metamodel.ts.impl.DeclaredStrategyInstanceImpl <em>Declared Strategy Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.unige.cui.smv.metamodel.ts.impl.DeclaredStrategyInstanceImpl
	 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getDeclaredStrategyInstance()
	 * @generated
	 */
	int DECLARED_STRATEGY_INSTANCE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_STRATEGY_INSTANCE__NAME = NON_VARIABLE_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_STRATEGY_INSTANCE__DECLARATION = NON_VARIABLE_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actual Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_STRATEGY_INSTANCE__ACTUAL_PARAMS = NON_VARIABLE_STRATEGY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Declared Strategy Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_STRATEGY_INSTANCE_FEATURE_COUNT = NON_VARIABLE_STRATEGY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Declared Strategy Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARED_STRATEGY_INSTANCE_OPERATION_COUNT = NON_VARIABLE_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.unige.cui.smv.metamodel.ts.impl.FixPointStrategyImpl <em>Fix Point Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.unige.cui.smv.metamodel.ts.impl.FixPointStrategyImpl
	 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getFixPointStrategy()
	 * @generated
	 */
	int FIX_POINT_STRATEGY = 9;

	/**
	 * The feature id for the '<em><b>S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIX_POINT_STRATEGY__S = NON_VARIABLE_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fix Point Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIX_POINT_STRATEGY_FEATURE_COUNT = NON_VARIABLE_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fix Point Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIX_POINT_STRATEGY_OPERATION_COUNT = NON_VARIABLE_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.unige.cui.smv.metamodel.ts.impl.IfThenElseImpl <em>If Then Else</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.unige.cui.smv.metamodel.ts.impl.IfThenElseImpl
	 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getIfThenElse()
	 * @generated
	 */
	int IF_THEN_ELSE = 10;

	/**
	 * The feature id for the '<em><b>S1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE__S1 = NON_VARIABLE_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>S2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE__S2 = NON_VARIABLE_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>S3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE__S3 = NON_VARIABLE_STRATEGY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Then Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_FEATURE_COUNT = NON_VARIABLE_STRATEGY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If Then Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_OPERATION_COUNT = NON_VARIABLE_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.unige.cui.smv.metamodel.ts.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.unige.cui.smv.metamodel.ts.impl.NotImpl
	 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 11;

	/**
	 * The feature id for the '<em><b>S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__S = NON_VARIABLE_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = NON_VARIABLE_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = NON_VARIABLE_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.unige.cui.smv.metamodel.ts.impl.OneImpl <em>One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.unige.cui.smv.metamodel.ts.impl.OneImpl
	 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getOne()
	 * @generated
	 */
	int ONE = 12;

	/**
	 * The feature id for the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE__N = NON_VARIABLE_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE__S = NON_VARIABLE_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_FEATURE_COUNT = NON_VARIABLE_STRATEGY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_OPERATION_COUNT = NON_VARIABLE_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.unige.cui.smv.metamodel.ts.impl.SaturationImpl <em>Saturation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.unige.cui.smv.metamodel.ts.impl.SaturationImpl
	 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getSaturation()
	 * @generated
	 */
	int SATURATION = 13;

	/**
	 * The feature id for the '<em><b>S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATURATION__S = NON_VARIABLE_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATURATION__N = NON_VARIABLE_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Saturation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATURATION_FEATURE_COUNT = NON_VARIABLE_STRATEGY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Saturation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATURATION_OPERATION_COUNT = NON_VARIABLE_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.unige.cui.smv.metamodel.ts.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.unige.cui.smv.metamodel.ts.impl.SequenceImpl
	 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 14;

	/**
	 * The feature id for the '<em><b>S1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__S1 = NON_VARIABLE_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>S2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__S2 = NON_VARIABLE_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = NON_VARIABLE_STRATEGY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_COUNT = NON_VARIABLE_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.unige.cui.smv.metamodel.ts.impl.UnionImpl <em>Union</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.unige.cui.smv.metamodel.ts.impl.UnionImpl
	 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getUnion()
	 * @generated
	 */
	int UNION = 15;

	/**
	 * The feature id for the '<em><b>S1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__S1 = NON_VARIABLE_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>S2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__S2 = NON_VARIABLE_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Union</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_FEATURE_COUNT = NON_VARIABLE_STRATEGY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Union</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_OPERATION_COUNT = NON_VARIABLE_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.unige.cui.smv.metamodel.ts.impl.SimpleStrategyImpl <em>Simple Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.unige.cui.smv.metamodel.ts.impl.SimpleStrategyImpl
	 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getSimpleStrategy()
	 * @generated
	 */
	int SIMPLE_STRATEGY = 16;

	/**
	 * The feature id for the '<em><b>Equations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STRATEGY__EQUATIONS = NON_VARIABLE_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STRATEGY_FEATURE_COUNT = NON_VARIABLE_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STRATEGY_OPERATION_COUNT = NON_VARIABLE_STRATEGY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ch.unige.cui.smv.metamodel.ts.TransitionSystem <em>Transition System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition System</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.TransitionSystem
	 * @generated
	 */
	EClass getTransitionSystem();

	/**
	 * Returns the meta object for the containment reference '{@link ch.unige.cui.smv.metamodel.ts.TransitionSystem#getAdt <em>Adt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adt</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.TransitionSystem#getAdt()
	 * @see #getTransitionSystem()
	 * @generated
	 */
	EReference getTransitionSystem_Adt();

	/**
	 * Returns the meta object for the containment reference '{@link ch.unige.cui.smv.metamodel.ts.TransitionSystem#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial State</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.TransitionSystem#getInitialState()
	 * @see #getTransitionSystem()
	 * @generated
	 */
	EReference getTransitionSystem_InitialState();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.unige.cui.smv.metamodel.ts.TransitionSystem#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.TransitionSystem#getTransitions()
	 * @see #getTransitionSystem()
	 * @generated
	 */
	EReference getTransitionSystem_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.unige.cui.smv.metamodel.ts.TransitionSystem#getAuxiliary <em>Auxiliary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Auxiliary</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.TransitionSystem#getAuxiliary()
	 * @see #getTransitionSystem()
	 * @generated
	 */
	EReference getTransitionSystem_Auxiliary();

	/**
	 * Returns the meta object for the attribute list '{@link ch.unige.cui.smv.metamodel.ts.TransitionSystem#getStrats <em>Strats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Strats</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.TransitionSystem#getStrats()
	 * @see #getTransitionSystem()
	 * @generated
	 */
	EAttribute getTransitionSystem_Strats();

	/**
	 * Returns the meta object for class '{@link ch.unige.cui.smv.metamodel.ts.DeclaredStrategy <em>Declared Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declared Strategy</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.DeclaredStrategy
	 * @generated
	 */
	EClass getDeclaredStrategy();

	/**
	 * Returns the meta object for the attribute '{@link ch.unige.cui.smv.metamodel.ts.DeclaredStrategy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.DeclaredStrategy#getName()
	 * @see #getDeclaredStrategy()
	 * @generated
	 */
	EAttribute getDeclaredStrategy_Name();

	/**
	 * Returns the meta object for the containment reference '{@link ch.unige.cui.smv.metamodel.ts.DeclaredStrategy#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.DeclaredStrategy#getBody()
	 * @see #getDeclaredStrategy()
	 * @generated
	 */
	EReference getDeclaredStrategy_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.unige.cui.smv.metamodel.ts.DeclaredStrategy#getFormalParams <em>Formal Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formal Params</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.DeclaredStrategy#getFormalParams()
	 * @see #getDeclaredStrategy()
	 * @generated
	 */
	EReference getDeclaredStrategy_FormalParams();

	/**
	 * Returns the meta object for class '{@link ch.unige.cui.smv.metamodel.ts.Strategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.Strategy
	 * @generated
	 */
	EClass getStrategy();

	/**
	 * Returns the meta object for class '{@link ch.unige.cui.smv.metamodel.ts.NonVariableStrategy <em>Non Variable Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Variable Strategy</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.NonVariableStrategy
	 * @generated
	 */
	EClass getNonVariableStrategy();

	/**
	 * Returns the meta object for class '{@link ch.unige.cui.smv.metamodel.ts.VariableStrategy <em>Variable Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Strategy</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.VariableStrategy
	 * @generated
	 */
	EClass getVariableStrategy();

	/**
	 * Returns the meta object for the attribute '{@link ch.unige.cui.smv.metamodel.ts.VariableStrategy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.VariableStrategy#getName()
	 * @see #getVariableStrategy()
	 * @generated
	 */
	EAttribute getVariableStrategy_Name();

	/**
	 * Returns the meta object for class '{@link ch.unige.cui.smv.metamodel.ts.Identity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identity</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.Identity
	 * @generated
	 */
	EClass getIdentity();

	/**
	 * Returns the meta object for class '{@link ch.unige.cui.smv.metamodel.ts.Fail <em>Fail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fail</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.Fail
	 * @generated
	 */
	EClass getFail();

	/**
	 * Returns the meta object for class '{@link ch.unige.cui.smv.metamodel.ts.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for the containment reference '{@link ch.unige.cui.smv.metamodel.ts.Choice#getS1 <em>S1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>S1</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.Choice#getS1()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_S1();

	/**
	 * Returns the meta object for the containment reference '{@link ch.unige.cui.smv.metamodel.ts.Choice#getS2 <em>S2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>S2</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.Choice#getS2()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_S2();

	/**
	 * Returns the meta object for class '{@link ch.unige.cui.smv.metamodel.ts.DeclaredStrategyInstance <em>Declared Strategy Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declared Strategy Instance</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.DeclaredStrategyInstance
	 * @generated
	 */
	EClass getDeclaredStrategyInstance();

	/**
	 * Returns the meta object for the attribute '{@link ch.unige.cui.smv.metamodel.ts.DeclaredStrategyInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.DeclaredStrategyInstance#getName()
	 * @see #getDeclaredStrategyInstance()
	 * @generated
	 */
	EAttribute getDeclaredStrategyInstance_Name();

	/**
	 * Returns the meta object for the reference '{@link ch.unige.cui.smv.metamodel.ts.DeclaredStrategyInstance#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaration</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.DeclaredStrategyInstance#getDeclaration()
	 * @see #getDeclaredStrategyInstance()
	 * @generated
	 */
	EReference getDeclaredStrategyInstance_Declaration();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.unige.cui.smv.metamodel.ts.DeclaredStrategyInstance#getActualParams <em>Actual Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actual Params</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.DeclaredStrategyInstance#getActualParams()
	 * @see #getDeclaredStrategyInstance()
	 * @generated
	 */
	EReference getDeclaredStrategyInstance_ActualParams();

	/**
	 * Returns the meta object for class '{@link ch.unige.cui.smv.metamodel.ts.FixPointStrategy <em>Fix Point Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fix Point Strategy</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.FixPointStrategy
	 * @generated
	 */
	EClass getFixPointStrategy();

	/**
	 * Returns the meta object for the containment reference '{@link ch.unige.cui.smv.metamodel.ts.FixPointStrategy#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>S</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.FixPointStrategy#getS()
	 * @see #getFixPointStrategy()
	 * @generated
	 */
	EReference getFixPointStrategy_S();

	/**
	 * Returns the meta object for class '{@link ch.unige.cui.smv.metamodel.ts.IfThenElse <em>If Then Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Then Else</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.IfThenElse
	 * @generated
	 */
	EClass getIfThenElse();

	/**
	 * Returns the meta object for the containment reference '{@link ch.unige.cui.smv.metamodel.ts.IfThenElse#getS1 <em>S1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>S1</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.IfThenElse#getS1()
	 * @see #getIfThenElse()
	 * @generated
	 */
	EReference getIfThenElse_S1();

	/**
	 * Returns the meta object for the containment reference '{@link ch.unige.cui.smv.metamodel.ts.IfThenElse#getS2 <em>S2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>S2</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.IfThenElse#getS2()
	 * @see #getIfThenElse()
	 * @generated
	 */
	EReference getIfThenElse_S2();

	/**
	 * Returns the meta object for the containment reference '{@link ch.unige.cui.smv.metamodel.ts.IfThenElse#getS3 <em>S3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>S3</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.IfThenElse#getS3()
	 * @see #getIfThenElse()
	 * @generated
	 */
	EReference getIfThenElse_S3();

	/**
	 * Returns the meta object for class '{@link ch.unige.cui.smv.metamodel.ts.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for the containment reference '{@link ch.unige.cui.smv.metamodel.ts.Not#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>S</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.Not#getS()
	 * @see #getNot()
	 * @generated
	 */
	EReference getNot_S();

	/**
	 * Returns the meta object for class '{@link ch.unige.cui.smv.metamodel.ts.One <em>One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.One
	 * @generated
	 */
	EClass getOne();

	/**
	 * Returns the meta object for the attribute '{@link ch.unige.cui.smv.metamodel.ts.One#getN <em>N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>N</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.One#getN()
	 * @see #getOne()
	 * @generated
	 */
	EAttribute getOne_N();

	/**
	 * Returns the meta object for the containment reference '{@link ch.unige.cui.smv.metamodel.ts.One#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>S</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.One#getS()
	 * @see #getOne()
	 * @generated
	 */
	EReference getOne_S();

	/**
	 * Returns the meta object for class '{@link ch.unige.cui.smv.metamodel.ts.Saturation <em>Saturation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Saturation</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.Saturation
	 * @generated
	 */
	EClass getSaturation();

	/**
	 * Returns the meta object for the containment reference '{@link ch.unige.cui.smv.metamodel.ts.Saturation#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>S</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.Saturation#getS()
	 * @see #getSaturation()
	 * @generated
	 */
	EReference getSaturation_S();

	/**
	 * Returns the meta object for the attribute '{@link ch.unige.cui.smv.metamodel.ts.Saturation#getN <em>N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>N</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.Saturation#getN()
	 * @see #getSaturation()
	 * @generated
	 */
	EAttribute getSaturation_N();

	/**
	 * Returns the meta object for class '{@link ch.unige.cui.smv.metamodel.ts.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the containment reference '{@link ch.unige.cui.smv.metamodel.ts.Sequence#getS1 <em>S1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>S1</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.Sequence#getS1()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_S1();

	/**
	 * Returns the meta object for the containment reference '{@link ch.unige.cui.smv.metamodel.ts.Sequence#getS2 <em>S2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>S2</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.Sequence#getS2()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_S2();

	/**
	 * Returns the meta object for class '{@link ch.unige.cui.smv.metamodel.ts.Union <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.Union
	 * @generated
	 */
	EClass getUnion();

	/**
	 * Returns the meta object for the containment reference '{@link ch.unige.cui.smv.metamodel.ts.Union#getS1 <em>S1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>S1</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.Union#getS1()
	 * @see #getUnion()
	 * @generated
	 */
	EReference getUnion_S1();

	/**
	 * Returns the meta object for the containment reference '{@link ch.unige.cui.smv.metamodel.ts.Union#getS2 <em>S2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>S2</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.Union#getS2()
	 * @see #getUnion()
	 * @generated
	 */
	EReference getUnion_S2();

	/**
	 * Returns the meta object for class '{@link ch.unige.cui.smv.metamodel.ts.SimpleStrategy <em>Simple Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Strategy</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.SimpleStrategy
	 * @generated
	 */
	EClass getSimpleStrategy();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.unige.cui.smv.metamodel.ts.SimpleStrategy#getEquations <em>Equations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Equations</em>'.
	 * @see ch.unige.cui.smv.metamodel.ts.SimpleStrategy#getEquations()
	 * @see #getSimpleStrategy()
	 * @generated
	 */
	EReference getSimpleStrategy_Equations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TsFactory getTsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ch.unige.cui.smv.metamodel.ts.impl.TransitionSystemImpl <em>Transition System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.unige.cui.smv.metamodel.ts.impl.TransitionSystemImpl
		 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getTransitionSystem()
		 * @generated
		 */
		EClass TRANSITION_SYSTEM = eINSTANCE.getTransitionSystem();

		/**
		 * The meta object literal for the '<em><b>Adt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_SYSTEM__ADT = eINSTANCE.getTransitionSystem_Adt();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_SYSTEM__INITIAL_STATE = eINSTANCE.getTransitionSystem_InitialState();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_SYSTEM__TRANSITIONS = eINSTANCE.getTransitionSystem_Transitions();

		/**
		 * The meta object literal for the '<em><b>Auxiliary</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_SYSTEM__AUXILIARY = eINSTANCE.getTransitionSystem_Auxiliary();

		/**
		 * The meta object literal for the '<em><b>Strats</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_SYSTEM__STRATS = eINSTANCE.getTransitionSystem_Strats();

		/**
		 * The meta object literal for the '{@link ch.unige.cui.smv.metamodel.ts.impl.DeclaredStrategyImpl <em>Declared Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.unige.cui.smv.metamodel.ts.impl.DeclaredStrategyImpl
		 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getDeclaredStrategy()
		 * @generated
		 */
		EClass DECLARED_STRATEGY = eINSTANCE.getDeclaredStrategy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARED_STRATEGY__NAME = eINSTANCE.getDeclaredStrategy_Name();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_STRATEGY__BODY = eINSTANCE.getDeclaredStrategy_Body();

		/**
		 * The meta object literal for the '<em><b>Formal Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_STRATEGY__FORMAL_PARAMS = eINSTANCE.getDeclaredStrategy_FormalParams();

		/**
		 * The meta object literal for the '{@link ch.unige.cui.smv.metamodel.ts.impl.StrategyImpl <em>Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.unige.cui.smv.metamodel.ts.impl.StrategyImpl
		 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getStrategy()
		 * @generated
		 */
		EClass STRATEGY = eINSTANCE.getStrategy();

		/**
		 * The meta object literal for the '{@link ch.unige.cui.smv.metamodel.ts.impl.NonVariableStrategyImpl <em>Non Variable Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.unige.cui.smv.metamodel.ts.impl.NonVariableStrategyImpl
		 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getNonVariableStrategy()
		 * @generated
		 */
		EClass NON_VARIABLE_STRATEGY = eINSTANCE.getNonVariableStrategy();

		/**
		 * The meta object literal for the '{@link ch.unige.cui.smv.metamodel.ts.impl.VariableStrategyImpl <em>Variable Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.unige.cui.smv.metamodel.ts.impl.VariableStrategyImpl
		 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getVariableStrategy()
		 * @generated
		 */
		EClass VARIABLE_STRATEGY = eINSTANCE.getVariableStrategy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_STRATEGY__NAME = eINSTANCE.getVariableStrategy_Name();

		/**
		 * The meta object literal for the '{@link ch.unige.cui.smv.metamodel.ts.impl.IdentityImpl <em>Identity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.unige.cui.smv.metamodel.ts.impl.IdentityImpl
		 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getIdentity()
		 * @generated
		 */
		EClass IDENTITY = eINSTANCE.getIdentity();

		/**
		 * The meta object literal for the '{@link ch.unige.cui.smv.metamodel.ts.impl.FailImpl <em>Fail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.unige.cui.smv.metamodel.ts.impl.FailImpl
		 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getFail()
		 * @generated
		 */
		EClass FAIL = eINSTANCE.getFail();

		/**
		 * The meta object literal for the '{@link ch.unige.cui.smv.metamodel.ts.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.unige.cui.smv.metamodel.ts.impl.ChoiceImpl
		 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '<em><b>S1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE__S1 = eINSTANCE.getChoice_S1();

		/**
		 * The meta object literal for the '<em><b>S2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE__S2 = eINSTANCE.getChoice_S2();

		/**
		 * The meta object literal for the '{@link ch.unige.cui.smv.metamodel.ts.impl.DeclaredStrategyInstanceImpl <em>Declared Strategy Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.unige.cui.smv.metamodel.ts.impl.DeclaredStrategyInstanceImpl
		 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getDeclaredStrategyInstance()
		 * @generated
		 */
		EClass DECLARED_STRATEGY_INSTANCE = eINSTANCE.getDeclaredStrategyInstance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARED_STRATEGY_INSTANCE__NAME = eINSTANCE.getDeclaredStrategyInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_STRATEGY_INSTANCE__DECLARATION = eINSTANCE.getDeclaredStrategyInstance_Declaration();

		/**
		 * The meta object literal for the '<em><b>Actual Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARED_STRATEGY_INSTANCE__ACTUAL_PARAMS = eINSTANCE.getDeclaredStrategyInstance_ActualParams();

		/**
		 * The meta object literal for the '{@link ch.unige.cui.smv.metamodel.ts.impl.FixPointStrategyImpl <em>Fix Point Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.unige.cui.smv.metamodel.ts.impl.FixPointStrategyImpl
		 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getFixPointStrategy()
		 * @generated
		 */
		EClass FIX_POINT_STRATEGY = eINSTANCE.getFixPointStrategy();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIX_POINT_STRATEGY__S = eINSTANCE.getFixPointStrategy_S();

		/**
		 * The meta object literal for the '{@link ch.unige.cui.smv.metamodel.ts.impl.IfThenElseImpl <em>If Then Else</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.unige.cui.smv.metamodel.ts.impl.IfThenElseImpl
		 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getIfThenElse()
		 * @generated
		 */
		EClass IF_THEN_ELSE = eINSTANCE.getIfThenElse();

		/**
		 * The meta object literal for the '<em><b>S1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_THEN_ELSE__S1 = eINSTANCE.getIfThenElse_S1();

		/**
		 * The meta object literal for the '<em><b>S2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_THEN_ELSE__S2 = eINSTANCE.getIfThenElse_S2();

		/**
		 * The meta object literal for the '<em><b>S3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_THEN_ELSE__S3 = eINSTANCE.getIfThenElse_S3();

		/**
		 * The meta object literal for the '{@link ch.unige.cui.smv.metamodel.ts.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.unige.cui.smv.metamodel.ts.impl.NotImpl
		 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT__S = eINSTANCE.getNot_S();

		/**
		 * The meta object literal for the '{@link ch.unige.cui.smv.metamodel.ts.impl.OneImpl <em>One</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.unige.cui.smv.metamodel.ts.impl.OneImpl
		 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getOne()
		 * @generated
		 */
		EClass ONE = eINSTANCE.getOne();

		/**
		 * The meta object literal for the '<em><b>N</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE__N = eINSTANCE.getOne_N();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE__S = eINSTANCE.getOne_S();

		/**
		 * The meta object literal for the '{@link ch.unige.cui.smv.metamodel.ts.impl.SaturationImpl <em>Saturation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.unige.cui.smv.metamodel.ts.impl.SaturationImpl
		 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getSaturation()
		 * @generated
		 */
		EClass SATURATION = eINSTANCE.getSaturation();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SATURATION__S = eINSTANCE.getSaturation_S();

		/**
		 * The meta object literal for the '<em><b>N</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SATURATION__N = eINSTANCE.getSaturation_N();

		/**
		 * The meta object literal for the '{@link ch.unige.cui.smv.metamodel.ts.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.unige.cui.smv.metamodel.ts.impl.SequenceImpl
		 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>S1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__S1 = eINSTANCE.getSequence_S1();

		/**
		 * The meta object literal for the '<em><b>S2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__S2 = eINSTANCE.getSequence_S2();

		/**
		 * The meta object literal for the '{@link ch.unige.cui.smv.metamodel.ts.impl.UnionImpl <em>Union</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.unige.cui.smv.metamodel.ts.impl.UnionImpl
		 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getUnion()
		 * @generated
		 */
		EClass UNION = eINSTANCE.getUnion();

		/**
		 * The meta object literal for the '<em><b>S1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNION__S1 = eINSTANCE.getUnion_S1();

		/**
		 * The meta object literal for the '<em><b>S2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNION__S2 = eINSTANCE.getUnion_S2();

		/**
		 * The meta object literal for the '{@link ch.unige.cui.smv.metamodel.ts.impl.SimpleStrategyImpl <em>Simple Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.unige.cui.smv.metamodel.ts.impl.SimpleStrategyImpl
		 * @see ch.unige.cui.smv.metamodel.ts.impl.TsPackageImpl#getSimpleStrategy()
		 * @generated
		 */
		EClass SIMPLE_STRATEGY = eINSTANCE.getSimpleStrategy();

		/**
		 * The meta object literal for the '<em><b>Equations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_STRATEGY__EQUATIONS = eINSTANCE.getSimpleStrategy_Equations();

	}

} //TsPackage
