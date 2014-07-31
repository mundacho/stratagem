/**
 */
package ch.unige.smv.cui.metamodel.adt.impl;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ch.unige.smv.cui.metamodel.adt.ADT;
import ch.unige.smv.cui.metamodel.adt.ATerm;
import ch.unige.smv.cui.metamodel.adt.AdtFactory;
import ch.unige.smv.cui.metamodel.adt.AdtPackage;
import ch.unige.smv.cui.metamodel.adt.Equation;
import ch.unige.smv.cui.metamodel.adt.Operation;
import ch.unige.smv.cui.metamodel.adt.Signature;
import ch.unige.smv.cui.metamodel.adt.Term;
import ch.unige.smv.cui.metamodel.adt.Variable;
import ch.unige.smv.cui.metamodel.adt.VariableDeclaration;
import ch.unige.smv.cui.metamodel.adt.util.AdtValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ADT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.impl.ADTImpl#getName <em>Name</em>}</li>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.impl.ADTImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.impl.ADTImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.impl.ADTImpl#getEquations <em>Equations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ADTImpl extends MinimalEObjectImpl.Container implements ADT {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "adt";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected Signature signature;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDeclaration> variables;

	/**
	 * The cached value of the '{@link #getEquations() <em>Equations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquations()
	 * @generated
	 * @ordered
	 */
	protected EList<Equation> equations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ADTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdtPackage.Literals.ADT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdtPackage.ADT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature getSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignature(Signature newSignature, NotificationChain msgs) {
		Signature oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdtPackage.ADT__SIGNATURE, oldSignature, newSignature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(Signature newSignature) {
		if (newSignature != signature) {
			NotificationChain msgs = null;
			if (signature != null)
				msgs = ((InternalEObject)signature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdtPackage.ADT__SIGNATURE, null, msgs);
			if (newSignature != null)
				msgs = ((InternalEObject)newSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdtPackage.ADT__SIGNATURE, null, msgs);
			msgs = basicSetSignature(newSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdtPackage.ADT__SIGNATURE, newSignature, newSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableDeclaration> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this, AdtPackage.ADT__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Equation> getEquations() {
		if (equations == null) {
			equations = new EObjectContainmentEList<Equation>(Equation.class, this, AdtPackage.ADT__EQUATIONS);
		}
		return equations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdtPackage.ADT__SIGNATURE:
				return basicSetSignature(null, msgs);
			case AdtPackage.ADT__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case AdtPackage.ADT__EQUATIONS:
				return ((InternalEList<?>)getEquations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdtPackage.ADT__NAME:
				return getName();
			case AdtPackage.ADT__SIGNATURE:
				return getSignature();
			case AdtPackage.ADT__VARIABLES:
				return getVariables();
			case AdtPackage.ADT__EQUATIONS:
				return getEquations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AdtPackage.ADT__NAME:
				setName((String)newValue);
				return;
			case AdtPackage.ADT__SIGNATURE:
				setSignature((Signature)newValue);
				return;
			case AdtPackage.ADT__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends VariableDeclaration>)newValue);
				return;
			case AdtPackage.ADT__EQUATIONS:
				getEquations().clear();
				getEquations().addAll((Collection<? extends Equation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AdtPackage.ADT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AdtPackage.ADT__SIGNATURE:
				setSignature((Signature)null);
				return;
			case AdtPackage.ADT__VARIABLES:
				getVariables().clear();
				return;
			case AdtPackage.ADT__EQUATIONS:
				getEquations().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AdtPackage.ADT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AdtPackage.ADT__SIGNATURE:
				return signature != null;
			case AdtPackage.ADT__VARIABLES:
				return variables != null && !variables.isEmpty();
			case AdtPackage.ADT__EQUATIONS:
				return equations != null && !equations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	@Override
	public ATerm term(String functor, ATerm... subterms) {
		Operation termOp = null;
		for (Operation op : getSignature().getAllOperations()) {
			if (op.getName().equals(functor)) {
				termOp = op;
				break;
			}
		}
		if (termOp != null) { // it is an operation
			Term t = AdtFactory.eINSTANCE.createTerm();
			t.setAdt(this);
			t.setOperationSymbol(termOp);
			t.getSubterms().addAll(Arrays.asList(subterms));
			BasicDiagnostic diagnostics = new BasicDiagnostic();
			HashMap<Object, Object> context = new HashMap<Object, Object>();
			boolean result = AdtValidator.INSTANCE.validateTerm(t, diagnostics, context);
			if (!result) {
				throw new IllegalArgumentException();
			}
			return t;
		} else  { // maybe it's a variable
			for (VariableDeclaration vd: getVariables()) {
				if (vd.getName().equals(functor)) {
					Variable v = AdtFactory.eINSTANCE.createVariable();
					v.setAdt(this);
					v.setDeclaration(vd);
					return v;
				}
				
			}
			// if we are here we're neither a variable nor an operation
			throw new IllegalStateException("The functor " + functor + " is not defined in the adt.");
		}
	}
	
	@Override
	public ADT declareVariable(String name, String sort) {
		this.setName(name);
		VariableDeclaration vd = AdtFactory.eINSTANCE.createVariableDeclaration();
		vd.setName(name);
		vd.setSort(getSignature().getSortByName(sort));
		this.getVariables().add(vd);
		BasicDiagnostic diagnostics = new BasicDiagnostic();
		HashMap<Object, Object> context = new HashMap<Object, Object>();
		boolean result = AdtValidator.INSTANCE.validateADT_UniqueVariableNames(this, diagnostics, context);
		if (!result) throw new IllegalArgumentException(diagnostics.getMessage());
		return  this;
	}

} //ADTImpl
