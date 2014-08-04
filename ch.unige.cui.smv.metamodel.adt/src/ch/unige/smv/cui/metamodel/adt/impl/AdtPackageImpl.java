/**
 */
package ch.unige.smv.cui.metamodel.adt.impl;

import ch.unige.smv.cui.metamodel.adt.ASort;
import ch.unige.smv.cui.metamodel.adt.ATerm;
import ch.unige.smv.cui.metamodel.adt.AdtFactory;
import ch.unige.smv.cui.metamodel.adt.AdtPackage;
import ch.unige.smv.cui.metamodel.adt.Equation;
import ch.unige.smv.cui.metamodel.adt.Operation;
import ch.unige.smv.cui.metamodel.adt.Signature;
import ch.unige.smv.cui.metamodel.adt.Sort;
import ch.unige.smv.cui.metamodel.adt.SubSort;
import ch.unige.smv.cui.metamodel.adt.Term;
import ch.unige.smv.cui.metamodel.adt.Variable;
import ch.unige.smv.cui.metamodel.adt.VariableDeclaration;
import ch.unige.smv.cui.metamodel.adt.util.AdtValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdtPackageImpl extends EPackageImpl implements AdtPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aSortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subSortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType objectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ch.unige.smv.cui.metamodel.adt.AdtPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AdtPackageImpl() {
		super(eNS_URI, AdtFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AdtPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AdtPackage init() {
		if (isInited) return (AdtPackage)EPackage.Registry.INSTANCE.getEPackage(AdtPackage.eNS_URI);

		// Obtain or create and register package
		AdtPackageImpl theAdtPackage = (AdtPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AdtPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AdtPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAdtPackage.createPackageContents();

		// Initialize created meta-data
		theAdtPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAdtPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return AdtValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAdtPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AdtPackage.eNS_URI, theAdtPackage);
		return theAdtPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getADT() {
		return adtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getADT_Name() {
		return (EAttribute)adtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADT_Signature() {
		return (EReference)adtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADT_Variables() {
		return (EReference)adtEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADT_Equations() {
		return (EReference)adtEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getASort() {
		return aSortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getASort_Name() {
		return (EAttribute)aSortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getASort__IsSubSortOf__ASort() {
		return aSortEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubSort() {
		return subSortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubSort_SuperSort() {
		return (EReference)subSortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSort() {
		return sortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignature() {
		return signatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_Sorts() {
		return (EReference)signatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_AllOperations() {
		return (EReference)signatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_Operations() {
		return (EReference)signatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_Generators() {
		return (EReference)signatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignature_Ops() {
		return (EAttribute)signatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDeclaration() {
		return variableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDeclaration_Sort() {
		return (EReference)variableDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableDeclaration_Name() {
		return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Name() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_ReturnType() {
		return (EReference)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_FormalParameters() {
		return (EReference)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATerm() {
		return aTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATerm_Adt() {
		return (EReference)aTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATerm_Sort() {
		return (EReference)aTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATerm_Symbol() {
		return (EAttribute)aTermEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerm() {
		return termEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerm_OperationSymbol() {
		return (EReference)termEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerm_Subterms() {
		return (EReference)termEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Declaration() {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquation() {
		return equationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquation_LeftHandTerm() {
		return (EReference)equationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquation_RightHandTerm() {
		return (EReference)equationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getObject() {
		return objectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdtFactory getAdtFactory() {
		return (AdtFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		adtEClass = createEClass(ADT);
		createEAttribute(adtEClass, ADT__NAME);
		createEReference(adtEClass, ADT__SIGNATURE);
		createEReference(adtEClass, ADT__VARIABLES);
		createEReference(adtEClass, ADT__EQUATIONS);

		aSortEClass = createEClass(ASORT);
		createEAttribute(aSortEClass, ASORT__NAME);
		createEOperation(aSortEClass, ASORT___IS_SUB_SORT_OF__ASORT);

		subSortEClass = createEClass(SUB_SORT);
		createEReference(subSortEClass, SUB_SORT__SUPER_SORT);

		sortEClass = createEClass(SORT);

		signatureEClass = createEClass(SIGNATURE);
		createEAttribute(signatureEClass, SIGNATURE__OPS);
		createEReference(signatureEClass, SIGNATURE__ALL_OPERATIONS);
		createEReference(signatureEClass, SIGNATURE__SORTS);
		createEReference(signatureEClass, SIGNATURE__OPERATIONS);
		createEReference(signatureEClass, SIGNATURE__GENERATORS);

		variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);
		createEReference(variableDeclarationEClass, VARIABLE_DECLARATION__SORT);
		createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__NAME);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__RETURN_TYPE);
		createEReference(operationEClass, OPERATION__FORMAL_PARAMETERS);
		createEAttribute(operationEClass, OPERATION__NAME);

		aTermEClass = createEClass(ATERM);
		createEReference(aTermEClass, ATERM__ADT);
		createEReference(aTermEClass, ATERM__SORT);
		createEAttribute(aTermEClass, ATERM__SYMBOL);

		termEClass = createEClass(TERM);
		createEReference(termEClass, TERM__OPERATION_SYMBOL);
		createEReference(termEClass, TERM__SUBTERMS);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__DECLARATION);

		equationEClass = createEClass(EQUATION);
		createEReference(equationEClass, EQUATION__LEFT_HAND_TERM);
		createEReference(equationEClass, EQUATION__RIGHT_HAND_TERM);

		// Create data types
		objectEDataType = createEDataType(OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		subSortEClass.getESuperTypes().add(this.getASort());
		sortEClass.getESuperTypes().add(this.getASort());
		termEClass.getESuperTypes().add(this.getATerm());
		variableEClass.getESuperTypes().add(this.getATerm());

		// Initialize classes, features, and operations; add parameters
		initEClass(adtEClass, ch.unige.smv.cui.metamodel.adt.ADT.class, "ADT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getADT_Name(), ecorePackage.getEString(), "name", "adt", 1, 1, ch.unige.smv.cui.metamodel.adt.ADT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getADT_Signature(), this.getSignature(), null, "signature", null, 1, 1, ch.unige.smv.cui.metamodel.adt.ADT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getADT_Variables(), this.getVariableDeclaration(), null, "variables", null, 0, -1, ch.unige.smv.cui.metamodel.adt.ADT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getADT_Equations(), this.getEquation(), null, "equations", null, 0, -1, ch.unige.smv.cui.metamodel.adt.ADT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aSortEClass, ASort.class, "ASort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getASort_Name(), ecorePackage.getEString(), "name", "s", 1, 1, ASort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getASort__IsSubSortOf__ASort(), ecorePackage.getEBoolean(), "isSubSortOf", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getASort(), "sort", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(subSortEClass, SubSort.class, "SubSort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubSort_SuperSort(), this.getASort(), null, "superSort", null, 1, 1, SubSort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sortEClass, Sort.class, "Sort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(signatureEClass, Signature.class, "Signature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignature_Ops(), ecorePackage.getEFeatureMapEntry(), "ops", null, 0, -1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignature_AllOperations(), this.getOperation(), null, "allOperations", null, 0, -1, Signature.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSignature_Sorts(), this.getASort(), null, "sorts", null, 1, -1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignature_Operations(), this.getOperation(), null, "operations", null, 0, -1, Signature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSignature_Generators(), this.getOperation(), null, "generators", null, 1, -1, Signature.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableDeclaration_Sort(), this.getASort(), null, "sort", null, 1, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableDeclaration_Name(), ecorePackage.getEString(), "name", "v", 1, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_ReturnType(), this.getASort(), null, "returnType", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_FormalParameters(), this.getASort(), null, "formalParameters", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Name(), ecorePackage.getEString(), "name", "op", 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aTermEClass, ATerm.class, "ATerm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getATerm_Adt(), this.getADT(), null, "adt", null, 1, 1, ATerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATerm_Sort(), this.getASort(), null, "sort", null, 1, 1, ATerm.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getATerm_Symbol(), ecorePackage.getEString(), "symbol", null, 1, 1, ATerm.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(termEClass, Term.class, "Term", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTerm_OperationSymbol(), this.getOperation(), null, "operationSymbol", null, 1, 1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerm_Subterms(), this.getATerm(), null, "subterms", null, 0, -1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_Declaration(), this.getVariableDeclaration(), null, "declaration", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equationEClass, Equation.class, "Equation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquation_LeftHandTerm(), this.getATerm(), null, "leftHandTerm", null, 1, 1, Equation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEquation_RightHandTerm(), this.getATerm(), null, "rightHandTerm", null, 1, 1, Equation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(objectEDataType, Object.class, "Object", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore#/"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (adtEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueVariableNames"
		   });	
		addAnnotation
		  (aSortEClass, 
		   source, 
		   new String[] {
			 "constraints", "NameNotEmpty"
		   });	
		addAnnotation
		  (subSortEClass, 
		   source, 
		   new String[] {
			 "constraints", "SuperSortNotNull"
		   });	
		addAnnotation
		  (signatureEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueSorts UniqueOperations"
		   });	
		addAnnotation
		  (variableDeclarationEClass, 
		   source, 
		   new String[] {
			 "constraints", "NameNotEmpty"
		   });	
		addAnnotation
		  (operationEClass, 
		   source, 
		   new String[] {
			 "constraints", "ValidReturnType"
		   });	
		addAnnotation
		  (termEClass, 
		   source, 
		   new String[] {
			 "constraints", "CorrectNumberOfParameters CorrectTypeOfParameters RightAdtSubterms"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (adtEClass, 
		   source, 
		   new String[] {
			 "UniqueVariableNames", "variables\n\t\t\t->isUnique(name)",
			 "UniqueVariableNames$message", "\'The following variables are defined more than once: \' + variables->select(v | (variables->select(v1 | (v1.name = v.name))->size() > 1))->collect(name)->toString()"
		   });	
		addAnnotation
		  (aSortEClass, 
		   source, 
		   new String[] {
			 "NameNotEmpty", "name <> \'\'",
			 "NameNotEmpty$message", "\'Cannot assign empty name to sort\'"
		   });	
		addAnnotation
		  (subSortEClass, 
		   source, 
		   new String[] {
			 "SuperSortNotNull", "superSort <> null",
			 "SuperSortNotNull$message", "\'The super sort of sort \' + name + \'cannot be null\'"
		   });	
		addAnnotation
		  (signatureEClass, 
		   source, 
		   new String[] {
			 "UniqueSorts", "sorts\n\t\t\t->isUnique(name)",
			 "UniqueSorts$message", "\'There are some sorts in the adt that appear more than once: \' + sorts->select(s1 | (sorts->select(s2 | (s2.name = s1.name))->size() > 1))->collect(name)->toString()",
			 "UniqueOperations", "allOperations\n\t\t\t->isUnique(name)",
			 "UniqueOperations$message", "\'There are some operations in the adt that appear more than once: \' + allOperations->select(op1 | (allOperations->select(op2 | (op2.name = op1.name))->size() > 1))->collect(name)->toString()"
		   });	
		addAnnotation
		  (variableDeclarationEClass, 
		   source, 
		   new String[] {
			 "NameNotEmpty", "name <> \'\'"
		   });	
		addAnnotation
		  (operationEClass, 
		   source, 
		   new String[] {
			 "ValidReturnType", "returnType <> null",
			 "ValidReturnType$message", "\'The return type for operation \' + name + \' was not set.\'"
		   });	
		addAnnotation
		  (termEClass, 
		   source, 
		   new String[] {
			 "CorrectNumberOfParameters", "(operationSymbol <> null) implies  subterms->size() = operationSymbol.formalParameters->size()",
			 "CorrectNumberOfParameters$message", "\'Invalid number of parameters for term: \' + self.toString() + \'. Required \' + operationSymbol.formalParameters->size()->toString() + \', found \' + subterms->size()->toString()",
			 "CorrectTypeOfParameters", "subterms\n\t\t\t->forAll(p | ((p.sort <> null) and (operationSymbol <> null)) implies p.sort.isSubSortOf(operationSymbol.formalParameters\n\t\t\t\t\t->at(subterms\n\t\t\t\t\t\t->indexOf(p))))",
			 "CorrectTypeOfParameters$message", "\'Invalid type of parameters for term: \' + self.toString()",
			 "RightAdtSubterms", "(subterms <> null) implies subterms->forAll(t | t.adt = self.adt)",
			 "RightAdtSubterms$message", "\'Some subterms do not have the same adt as the parent term: \' + self.toString()"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (getSignature_Ops(), 
		   source, 
		   new String[] {
			 "kind", "group"
		   });	
		addAnnotation
		  (getSignature_Operations(), 
		   source, 
		   new String[] {
			 "group", "#ops"
		   });	
		addAnnotation
		  (getSignature_Generators(), 
		   source, 
		   new String[] {
			 "group", "#ops"
		   });	
		addAnnotation
		  (getOperation_FormalParameters(), 
		   source, 
		   new String[] {
			 "group", "#params"
		   });
	}

} //AdtPackageImpl
