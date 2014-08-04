/**
 */
package ch.unige.smv.cui.metamodel.adt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
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
 * @see ch.unige.smv.cui.metamodel.adt.AdtFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface AdtPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "adt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cui.unige.ch/smv/adt.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "adt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdtPackage eINSTANCE = ch.unige.smv.cui.metamodel.adt.impl.AdtPackageImpl.init();

	/**
	 * The meta object id for the '{@link ch.unige.smv.cui.metamodel.adt.impl.ADTImpl <em>ADT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.unige.smv.cui.metamodel.adt.impl.ADTImpl
	 * @see ch.unige.smv.cui.metamodel.adt.impl.AdtPackageImpl#getADT()
	 * @generated
	 */
	int ADT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADT__SIGNATURE = 1;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADT__VARIABLES = 2;

	/**
	 * The feature id for the '<em><b>Equations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADT__EQUATIONS = 3;

	/**
	 * The number of structural features of the '<em>ADT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>ADT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.unige.smv.cui.metamodel.adt.impl.ASortImpl <em>ASort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.unige.smv.cui.metamodel.adt.impl.ASortImpl
	 * @see ch.unige.smv.cui.metamodel.adt.impl.AdtPackageImpl#getASort()
	 * @generated
	 */
	int ASORT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASORT__NAME = 0;

	/**
	 * The number of structural features of the '<em>ASort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASORT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Is Sub Sort Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASORT___IS_SUB_SORT_OF__ASORT = 0;

	/**
	 * The number of operations of the '<em>ASort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASORT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ch.unige.smv.cui.metamodel.adt.impl.SubSortImpl <em>Sub Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.unige.smv.cui.metamodel.adt.impl.SubSortImpl
	 * @see ch.unige.smv.cui.metamodel.adt.impl.AdtPackageImpl#getSubSort()
	 * @generated
	 */
	int SUB_SORT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SORT__NAME = ASORT__NAME;

	/**
	 * The feature id for the '<em><b>Super Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SORT__SUPER_SORT = ASORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sub Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SORT_FEATURE_COUNT = ASORT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Sub Sort Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SORT___IS_SUB_SORT_OF__ASORT = ASORT___IS_SUB_SORT_OF__ASORT;

	/**
	 * The number of operations of the '<em>Sub Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SORT_OPERATION_COUNT = ASORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.unige.smv.cui.metamodel.adt.impl.SortImpl <em>Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.unige.smv.cui.metamodel.adt.impl.SortImpl
	 * @see ch.unige.smv.cui.metamodel.adt.impl.AdtPackageImpl#getSort()
	 * @generated
	 */
	int SORT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT__NAME = ASORT__NAME;

	/**
	 * The number of structural features of the '<em>Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_FEATURE_COUNT = ASORT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Sub Sort Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT___IS_SUB_SORT_OF__ASORT = ASORT___IS_SUB_SORT_OF__ASORT;

	/**
	 * The number of operations of the '<em>Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_OPERATION_COUNT = ASORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.unige.smv.cui.metamodel.adt.impl.SignatureImpl <em>Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.unige.smv.cui.metamodel.adt.impl.SignatureImpl
	 * @see ch.unige.smv.cui.metamodel.adt.impl.AdtPackageImpl#getSignature()
	 * @generated
	 */
	int SIGNATURE = 4;

	/**
	 * The feature id for the '<em><b>Ops</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__OPS = 0;

	/**
	 * The feature id for the '<em><b>All Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__ALL_OPERATIONS = 1;

	/**
	 * The feature id for the '<em><b>Sorts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__SORTS = 2;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__OPERATIONS = 3;

	/**
	 * The feature id for the '<em><b>Generators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__GENERATORS = 4;

	/**
	 * The number of structural features of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.unige.smv.cui.metamodel.adt.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.unige.smv.cui.metamodel.adt.impl.VariableDeclarationImpl
	 * @see ch.unige.smv.cui.metamodel.adt.impl.AdtPackageImpl#getVariableDeclaration()
	 * @generated
	 */
	int VARIABLE_DECLARATION = 5;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__SORT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.unige.smv.cui.metamodel.adt.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.unige.smv.cui.metamodel.adt.impl.OperationImpl
	 * @see ch.unige.smv.cui.metamodel.adt.impl.AdtPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 6;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RETURN_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Formal Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__FORMAL_PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.unige.smv.cui.metamodel.adt.impl.ATermImpl <em>ATerm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.unige.smv.cui.metamodel.adt.impl.ATermImpl
	 * @see ch.unige.smv.cui.metamodel.adt.impl.AdtPackageImpl#getATerm()
	 * @generated
	 */
	int ATERM = 7;

	/**
	 * The feature id for the '<em><b>Adt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATERM__ADT = 0;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATERM__SORT = 1;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATERM__SYMBOL = 2;

	/**
	 * The number of structural features of the '<em>ATerm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATERM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>ATerm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATERM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ch.unige.smv.cui.metamodel.adt.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.unige.smv.cui.metamodel.adt.impl.TermImpl
	 * @see ch.unige.smv.cui.metamodel.adt.impl.AdtPackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 8;

	/**
	 * The feature id for the '<em><b>Adt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__ADT = ATERM__ADT;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__SORT = ATERM__SORT;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__SYMBOL = ATERM__SYMBOL;

	/**
	 * The feature id for the '<em><b>Operation Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__OPERATION_SYMBOL = ATERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subterms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__SUBTERMS = ATERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = ATERM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_OPERATION_COUNT = ATERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.unige.smv.cui.metamodel.adt.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.unige.smv.cui.metamodel.adt.impl.VariableImpl
	 * @see ch.unige.smv.cui.metamodel.adt.impl.AdtPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 9;

	/**
	 * The feature id for the '<em><b>Adt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ADT = ATERM__ADT;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__SORT = ATERM__SORT;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__SYMBOL = ATERM__SYMBOL;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DECLARATION = ATERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = ATERM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = ATERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ch.unige.smv.cui.metamodel.adt.impl.EquationImpl <em>Equation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ch.unige.smv.cui.metamodel.adt.impl.EquationImpl
	 * @see ch.unige.smv.cui.metamodel.adt.impl.AdtPackageImpl#getEquation()
	 * @generated
	 */
	int EQUATION = 10;

	/**
	 * The feature id for the '<em><b>Left Hand Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION__LEFT_HAND_TERM = 0;

	/**
	 * The feature id for the '<em><b>Right Hand Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION__RIGHT_HAND_TERM = 1;

	/**
	 * The number of structural features of the '<em>Equation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Equation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see ch.unige.smv.cui.metamodel.adt.impl.AdtPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 11;


	/**
	 * Returns the meta object for class '{@link ch.unige.smv.cui.metamodel.adt.ADT <em>ADT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ADT</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.ADT
	 * @generated
	 */
	EClass getADT();

	/**
	 * Returns the meta object for the attribute '{@link ch.unige.smv.cui.metamodel.adt.ADT#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.ADT#getName()
	 * @see #getADT()
	 * @generated
	 */
	EAttribute getADT_Name();

	/**
	 * Returns the meta object for the containment reference '{@link ch.unige.smv.cui.metamodel.adt.ADT#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signature</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.ADT#getSignature()
	 * @see #getADT()
	 * @generated
	 */
	EReference getADT_Signature();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.unige.smv.cui.metamodel.adt.ADT#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.ADT#getVariables()
	 * @see #getADT()
	 * @generated
	 */
	EReference getADT_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.unige.smv.cui.metamodel.adt.ADT#getEquations <em>Equations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Equations</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.ADT#getEquations()
	 * @see #getADT()
	 * @generated
	 */
	EReference getADT_Equations();

	/**
	 * Returns the meta object for class '{@link ch.unige.smv.cui.metamodel.adt.ASort <em>ASort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ASort</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.ASort
	 * @generated
	 */
	EClass getASort();

	/**
	 * Returns the meta object for the attribute '{@link ch.unige.smv.cui.metamodel.adt.ASort#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.ASort#getName()
	 * @see #getASort()
	 * @generated
	 */
	EAttribute getASort_Name();

	/**
	 * Returns the meta object for the '{@link ch.unige.smv.cui.metamodel.adt.ASort#isSubSortOf(ch.unige.smv.cui.metamodel.adt.ASort) <em>Is Sub Sort Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Sub Sort Of</em>' operation.
	 * @see ch.unige.smv.cui.metamodel.adt.ASort#isSubSortOf(ch.unige.smv.cui.metamodel.adt.ASort)
	 * @generated
	 */
	EOperation getASort__IsSubSortOf__ASort();

	/**
	 * Returns the meta object for class '{@link ch.unige.smv.cui.metamodel.adt.SubSort <em>Sub Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Sort</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.SubSort
	 * @generated
	 */
	EClass getSubSort();

	/**
	 * Returns the meta object for the reference '{@link ch.unige.smv.cui.metamodel.adt.SubSort#getSuperSort <em>Super Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Sort</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.SubSort#getSuperSort()
	 * @see #getSubSort()
	 * @generated
	 */
	EReference getSubSort_SuperSort();

	/**
	 * Returns the meta object for class '{@link ch.unige.smv.cui.metamodel.adt.Sort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.Sort
	 * @generated
	 */
	EClass getSort();

	/**
	 * Returns the meta object for class '{@link ch.unige.smv.cui.metamodel.adt.Signature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.Signature
	 * @generated
	 */
	EClass getSignature();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.unige.smv.cui.metamodel.adt.Signature#getSorts <em>Sorts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sorts</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.Signature#getSorts()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_Sorts();

	/**
	 * Returns the meta object for the reference list '{@link ch.unige.smv.cui.metamodel.adt.Signature#getAllOperations <em>All Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Operations</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.Signature#getAllOperations()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_AllOperations();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.unige.smv.cui.metamodel.adt.Signature#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.Signature#getOperations()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_Operations();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.unige.smv.cui.metamodel.adt.Signature#getGenerators <em>Generators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generators</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.Signature#getGenerators()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_Generators();

	/**
	 * Returns the meta object for the attribute list '{@link ch.unige.smv.cui.metamodel.adt.Signature#getOps <em>Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ops</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.Signature#getOps()
	 * @see #getSignature()
	 * @generated
	 */
	EAttribute getSignature_Ops();

	/**
	 * Returns the meta object for class '{@link ch.unige.smv.cui.metamodel.adt.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.VariableDeclaration
	 * @generated
	 */
	EClass getVariableDeclaration();

	/**
	 * Returns the meta object for the reference '{@link ch.unige.smv.cui.metamodel.adt.VariableDeclaration#getSort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sort</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.VariableDeclaration#getSort()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EReference getVariableDeclaration_Sort();

	/**
	 * Returns the meta object for the attribute '{@link ch.unige.smv.cui.metamodel.adt.VariableDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.VariableDeclaration#getName()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EAttribute getVariableDeclaration_Name();

	/**
	 * Returns the meta object for class '{@link ch.unige.smv.cui.metamodel.adt.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link ch.unige.smv.cui.metamodel.adt.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for the reference '{@link ch.unige.smv.cui.metamodel.adt.Operation#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.Operation#getReturnType()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_ReturnType();

	/**
	 * Returns the meta object for the reference list '{@link ch.unige.smv.cui.metamodel.adt.Operation#getFormalParameters <em>Formal Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Formal Parameters</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.Operation#getFormalParameters()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_FormalParameters();

	/**
	 * Returns the meta object for class '{@link ch.unige.smv.cui.metamodel.adt.ATerm <em>ATerm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATerm</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.ATerm
	 * @generated
	 */
	EClass getATerm();

	/**
	 * Returns the meta object for the reference '{@link ch.unige.smv.cui.metamodel.adt.ATerm#getAdt <em>Adt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Adt</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.ATerm#getAdt()
	 * @see #getATerm()
	 * @generated
	 */
	EReference getATerm_Adt();

	/**
	 * Returns the meta object for the reference '{@link ch.unige.smv.cui.metamodel.adt.ATerm#getSort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sort</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.ATerm#getSort()
	 * @see #getATerm()
	 * @generated
	 */
	EReference getATerm_Sort();

	/**
	 * Returns the meta object for the attribute '{@link ch.unige.smv.cui.metamodel.adt.ATerm#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.ATerm#getSymbol()
	 * @see #getATerm()
	 * @generated
	 */
	EAttribute getATerm_Symbol();

	/**
	 * Returns the meta object for class '{@link ch.unige.smv.cui.metamodel.adt.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for the reference '{@link ch.unige.smv.cui.metamodel.adt.Term#getOperationSymbol <em>Operation Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation Symbol</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.Term#getOperationSymbol()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_OperationSymbol();

	/**
	 * Returns the meta object for the containment reference list '{@link ch.unige.smv.cui.metamodel.adt.Term#getSubterms <em>Subterms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subterms</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.Term#getSubterms()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Subterms();

	/**
	 * Returns the meta object for class '{@link ch.unige.smv.cui.metamodel.adt.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the reference '{@link ch.unige.smv.cui.metamodel.adt.Variable#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Declaration</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.Variable#getDeclaration()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Declaration();

	/**
	 * Returns the meta object for class '{@link ch.unige.smv.cui.metamodel.adt.Equation <em>Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equation</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.Equation
	 * @generated
	 */
	EClass getEquation();

	/**
	 * Returns the meta object for the containment reference '{@link ch.unige.smv.cui.metamodel.adt.Equation#getLeftHandTerm <em>Left Hand Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Hand Term</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.Equation#getLeftHandTerm()
	 * @see #getEquation()
	 * @generated
	 */
	EReference getEquation_LeftHandTerm();

	/**
	 * Returns the meta object for the containment reference '{@link ch.unige.smv.cui.metamodel.adt.Equation#getRightHandTerm <em>Right Hand Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Hand Term</em>'.
	 * @see ch.unige.smv.cui.metamodel.adt.Equation#getRightHandTerm()
	 * @see #getEquation()
	 * @generated
	 */
	EReference getEquation_RightHandTerm();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AdtFactory getAdtFactory();

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
		 * The meta object literal for the '{@link ch.unige.smv.cui.metamodel.adt.impl.ADTImpl <em>ADT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.unige.smv.cui.metamodel.adt.impl.ADTImpl
		 * @see ch.unige.smv.cui.metamodel.adt.impl.AdtPackageImpl#getADT()
		 * @generated
		 */
		EClass ADT = eINSTANCE.getADT();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADT__NAME = eINSTANCE.getADT_Name();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADT__SIGNATURE = eINSTANCE.getADT_Signature();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADT__VARIABLES = eINSTANCE.getADT_Variables();

		/**
		 * The meta object literal for the '<em><b>Equations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADT__EQUATIONS = eINSTANCE.getADT_Equations();

		/**
		 * The meta object literal for the '{@link ch.unige.smv.cui.metamodel.adt.impl.ASortImpl <em>ASort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.unige.smv.cui.metamodel.adt.impl.ASortImpl
		 * @see ch.unige.smv.cui.metamodel.adt.impl.AdtPackageImpl#getASort()
		 * @generated
		 */
		EClass ASORT = eINSTANCE.getASort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASORT__NAME = eINSTANCE.getASort_Name();

		/**
		 * The meta object literal for the '<em><b>Is Sub Sort Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASORT___IS_SUB_SORT_OF__ASORT = eINSTANCE.getASort__IsSubSortOf__ASort();

		/**
		 * The meta object literal for the '{@link ch.unige.smv.cui.metamodel.adt.impl.SubSortImpl <em>Sub Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.unige.smv.cui.metamodel.adt.impl.SubSortImpl
		 * @see ch.unige.smv.cui.metamodel.adt.impl.AdtPackageImpl#getSubSort()
		 * @generated
		 */
		EClass SUB_SORT = eINSTANCE.getSubSort();

		/**
		 * The meta object literal for the '<em><b>Super Sort</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_SORT__SUPER_SORT = eINSTANCE.getSubSort_SuperSort();

		/**
		 * The meta object literal for the '{@link ch.unige.smv.cui.metamodel.adt.impl.SortImpl <em>Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.unige.smv.cui.metamodel.adt.impl.SortImpl
		 * @see ch.unige.smv.cui.metamodel.adt.impl.AdtPackageImpl#getSort()
		 * @generated
		 */
		EClass SORT = eINSTANCE.getSort();

		/**
		 * The meta object literal for the '{@link ch.unige.smv.cui.metamodel.adt.impl.SignatureImpl <em>Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.unige.smv.cui.metamodel.adt.impl.SignatureImpl
		 * @see ch.unige.smv.cui.metamodel.adt.impl.AdtPackageImpl#getSignature()
		 * @generated
		 */
		EClass SIGNATURE = eINSTANCE.getSignature();

		/**
		 * The meta object literal for the '<em><b>Sorts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__SORTS = eINSTANCE.getSignature_Sorts();

		/**
		 * The meta object literal for the '<em><b>All Operations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__ALL_OPERATIONS = eINSTANCE.getSignature_AllOperations();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__OPERATIONS = eINSTANCE.getSignature_Operations();

		/**
		 * The meta object literal for the '<em><b>Generators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__GENERATORS = eINSTANCE.getSignature_Generators();

		/**
		 * The meta object literal for the '<em><b>Ops</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE__OPS = eINSTANCE.getSignature_Ops();

		/**
		 * The meta object literal for the '{@link ch.unige.smv.cui.metamodel.adt.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.unige.smv.cui.metamodel.adt.impl.VariableDeclarationImpl
		 * @see ch.unige.smv.cui.metamodel.adt.impl.AdtPackageImpl#getVariableDeclaration()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Sort</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION__SORT = eINSTANCE.getVariableDeclaration_Sort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION__NAME = eINSTANCE.getVariableDeclaration_Name();

		/**
		 * The meta object literal for the '{@link ch.unige.smv.cui.metamodel.adt.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.unige.smv.cui.metamodel.adt.impl.OperationImpl
		 * @see ch.unige.smv.cui.metamodel.adt.impl.AdtPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__RETURN_TYPE = eINSTANCE.getOperation_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Formal Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__FORMAL_PARAMETERS = eINSTANCE.getOperation_FormalParameters();

		/**
		 * The meta object literal for the '{@link ch.unige.smv.cui.metamodel.adt.impl.ATermImpl <em>ATerm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.unige.smv.cui.metamodel.adt.impl.ATermImpl
		 * @see ch.unige.smv.cui.metamodel.adt.impl.AdtPackageImpl#getATerm()
		 * @generated
		 */
		EClass ATERM = eINSTANCE.getATerm();

		/**
		 * The meta object literal for the '<em><b>Adt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATERM__ADT = eINSTANCE.getATerm_Adt();

		/**
		 * The meta object literal for the '<em><b>Sort</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATERM__SORT = eINSTANCE.getATerm_Sort();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATERM__SYMBOL = eINSTANCE.getATerm_Symbol();

		/**
		 * The meta object literal for the '{@link ch.unige.smv.cui.metamodel.adt.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.unige.smv.cui.metamodel.adt.impl.TermImpl
		 * @see ch.unige.smv.cui.metamodel.adt.impl.AdtPackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '<em><b>Operation Symbol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__OPERATION_SYMBOL = eINSTANCE.getTerm_OperationSymbol();

		/**
		 * The meta object literal for the '<em><b>Subterms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__SUBTERMS = eINSTANCE.getTerm_Subterms();

		/**
		 * The meta object literal for the '{@link ch.unige.smv.cui.metamodel.adt.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.unige.smv.cui.metamodel.adt.impl.VariableImpl
		 * @see ch.unige.smv.cui.metamodel.adt.impl.AdtPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__DECLARATION = eINSTANCE.getVariable_Declaration();

		/**
		 * The meta object literal for the '{@link ch.unige.smv.cui.metamodel.adt.impl.EquationImpl <em>Equation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ch.unige.smv.cui.metamodel.adt.impl.EquationImpl
		 * @see ch.unige.smv.cui.metamodel.adt.impl.AdtPackageImpl#getEquation()
		 * @generated
		 */
		EClass EQUATION = eINSTANCE.getEquation();

		/**
		 * The meta object literal for the '<em><b>Left Hand Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUATION__LEFT_HAND_TERM = eINSTANCE.getEquation_LeftHandTerm();

		/**
		 * The meta object literal for the '<em><b>Right Hand Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUATION__RIGHT_HAND_TERM = eINSTANCE.getEquation_RightHandTerm();

		/**
		 * The meta object literal for the '<em>Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see ch.unige.smv.cui.metamodel.adt.impl.AdtPackageImpl#getObject()
		 * @generated
		 */
		EDataType OBJECT = eINSTANCE.getObject();

	}

} //AdtPackage
