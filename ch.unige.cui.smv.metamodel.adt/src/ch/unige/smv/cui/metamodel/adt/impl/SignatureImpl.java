/**
 */
package ch.unige.smv.cui.metamodel.adt.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import ch.unige.smv.cui.metamodel.adt.ASort;
import ch.unige.smv.cui.metamodel.adt.AdtFactory;
import ch.unige.smv.cui.metamodel.adt.AdtPackage;
import ch.unige.smv.cui.metamodel.adt.Operation;
import ch.unige.smv.cui.metamodel.adt.Signature;
import ch.unige.smv.cui.metamodel.adt.SubSort;
import ch.unige.smv.cui.metamodel.adt.util.AdtValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Signature</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.impl.SignatureImpl#getOps <em>Ops</em>}</li>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.impl.SignatureImpl#getAllOperations <em>All Operations</em>}</li>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.impl.SignatureImpl#getSorts <em>Sorts</em>}</li>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.impl.SignatureImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.impl.SignatureImpl#getGenerators <em>Generators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignatureImpl extends MinimalEObjectImpl.Container implements
		Signature {
	/**
	 * The cached value of the '{@link #getOps() <em>Ops</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOps()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ops;

	/**
	 * The cached value of the '{@link #getSorts() <em>Sorts</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSorts()
	 * @generated
	 * @ordered
	 */
	protected EList<ASort> sorts;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdtPackage.Literals.SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ASort> getSorts() {
		if (sorts == null) {
			sorts = new EObjectContainmentEList<ASort>(ASort.class, this, AdtPackage.SIGNATURE__SORTS);
		}
		return sorts;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<Operation> getAllOperations() {
		ArrayList<Operation> opArray = new ArrayList<Operation>(getOps().size());
		for (FeatureMap.Entry elt : getOps()) {
			opArray.add((Operation) elt.getValue());
		}
		return new EcoreEList.UnmodifiableEList<Operation>(this,
				AdtPackage.Literals.SIGNATURE__ALL_OPERATIONS, getOps().size(),
				opArray.toArray());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperations() {
		return getOps().list(AdtPackage.Literals.SIGNATURE__OPERATIONS);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getGenerators() {
		return getOps().list(AdtPackage.Literals.SIGNATURE__GENERATORS);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getOps() {
		if (ops == null) {
			ops = new BasicFeatureMap(this, AdtPackage.SIGNATURE__OPS);
		}
		return ops;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdtPackage.SIGNATURE__OPS:
				return ((InternalEList<?>)getOps()).basicRemove(otherEnd, msgs);
			case AdtPackage.SIGNATURE__SORTS:
				return ((InternalEList<?>)getSorts()).basicRemove(otherEnd, msgs);
			case AdtPackage.SIGNATURE__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case AdtPackage.SIGNATURE__GENERATORS:
				return ((InternalEList<?>)getGenerators()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdtPackage.SIGNATURE__OPS:
				if (coreType) return getOps();
				return ((FeatureMap.Internal)getOps()).getWrapper();
			case AdtPackage.SIGNATURE__ALL_OPERATIONS:
				return getAllOperations();
			case AdtPackage.SIGNATURE__SORTS:
				return getSorts();
			case AdtPackage.SIGNATURE__OPERATIONS:
				return getOperations();
			case AdtPackage.SIGNATURE__GENERATORS:
				return getGenerators();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AdtPackage.SIGNATURE__OPS:
				((FeatureMap.Internal)getOps()).set(newValue);
				return;
			case AdtPackage.SIGNATURE__SORTS:
				getSorts().clear();
				getSorts().addAll((Collection<? extends ASort>)newValue);
				return;
			case AdtPackage.SIGNATURE__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends Operation>)newValue);
				return;
			case AdtPackage.SIGNATURE__GENERATORS:
				getGenerators().clear();
				getGenerators().addAll((Collection<? extends Operation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AdtPackage.SIGNATURE__OPS:
				getOps().clear();
				return;
			case AdtPackage.SIGNATURE__SORTS:
				getSorts().clear();
				return;
			case AdtPackage.SIGNATURE__OPERATIONS:
				getOperations().clear();
				return;
			case AdtPackage.SIGNATURE__GENERATORS:
				getGenerators().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AdtPackage.SIGNATURE__OPS:
				return ops != null && !ops.isEmpty();
			case AdtPackage.SIGNATURE__ALL_OPERATIONS:
				return !getAllOperations().isEmpty();
			case AdtPackage.SIGNATURE__SORTS:
				return sorts != null && !sorts.isEmpty();
			case AdtPackage.SIGNATURE__OPERATIONS:
				return !getOperations().isEmpty();
			case AdtPackage.SIGNATURE__GENERATORS:
				return !getGenerators().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();
		
		String result = "Sorts\n";
		for (Iterator<ASort> it = getSorts().iterator(); it.hasNext();) {
			result += it.next().getName()
					+ (it.hasNext() ? ", " : "");
		}
		result += "\nGenerators\n";
		for (Operation op : getGenerators()) {
			result += "   " + op.getName() + ": ";
			for (Iterator<ASort> iterator = op.getFormalParameters().iterator(); iterator
					.hasNext();) {
				result += iterator.next().getName()
						+ (iterator.hasNext() ? ", " : "");
			}
			result += "-> " + op.getReturnType().getName() + "\n";
		}
		result += "Operators\n";
		for (Operation op : getOperations()) {
			result += "   " + op.getName() + ": ";
			for (Iterator<ASort> iterator = op.getFormalParameters().iterator(); iterator
					.hasNext();) {
				result += iterator.next().getName()
						+ (iterator.hasNext() ? ", " : "");
			}
			result += " -> " + op.getReturnType().getName() + "\n";
		}
		return result;
	}

	@Override
	public ASort getSortByName(String name) {
		ASort result = null;
		for (ASort sort : getSorts()) {
			if (sort.getName().equals(name)) {
				result = sort;
				break;
			}
		}
		assert (result != null); // didn't find it :-S
		return result;
	}

	@Override
	public Signature withSort(String sortName) {
		ASort s = AdtFactory.eINSTANCE.createSort();
		s.setName(sortName);
		this.getSorts().add(s);
		BasicDiagnostic diagnostics = new BasicDiagnostic();
		if (!AdtValidator.INSTANCE.validateSignature_UniqueSorts(this,
				diagnostics, new HashMap<Object, Object>())) {
			throw new IllegalArgumentException(
					"There are sorts that appear more than once in the list of sorts: "
							+ getSorts());
		}
		return this;
	}

	@Override
	public Signature withSort(String sortName, String superSortName) {
		SubSort s = AdtFactory.eINSTANCE.createSubSort();
		s.setName(sortName);
		ASort superSort = getSortByName(superSortName);
		if (superSort == null) {
			throw new IllegalArgumentException();
		}
		s.setSuperSort(superSort);
		this.getSorts().add(s);
		BasicDiagnostic diagnostics = new BasicDiagnostic();
		boolean validationResult = AdtValidator.INSTANCE.validateSignature_UniqueSorts(this, diagnostics, new HashMap<Object, Object>());
		if (validationResult || diagnostics != null)
			validationResult &= AdtValidator.INSTANCE.validateSubSort(s, diagnostics, new HashMap<Object, Object>());
		if (!validationResult) {
			throw new IllegalArgumentException(diagnostics.getMessage());
		}
		return this;
	}

	@Override
	public Signature withGenerator(String generatorName, String returnSort,
			String... sortNames) {
		assert (generatorName != null);
		assert (returnSort != null);
		EList<Operation> generators = this.getGenerators();
		Operation gen = AdtFactory.eINSTANCE.createOperation();
		gen.setName(generatorName);
		ASort sortObj = null;
		for (ASort s : getSorts()) {
			if (s.getName().equals(returnSort)) {
				sortObj = s;
				gen.setReturnType(s);
				break;
			}
		}
		if (sortObj == null) {
			throw new IllegalArgumentException();
		}
		assert (sortObj != null);
		for (String sortName : sortNames) {
			sortObj = null;
			for (ASort s : getSorts()) {
				if (s.getName().equals(sortName)) {
					sortObj = s;
					gen.getFormalParameters().add(s);
					break;
				}
			}
			if (sortObj == null) {
				throw new IllegalArgumentException();
			}
		}
		generators.add(gen);
		BasicDiagnostic diagnostics = new BasicDiagnostic();
		HashMap<Object, Object> context = new HashMap<Object, Object>();
		boolean result = AdtValidator.INSTANCE
				.validateOperation_ValidReturnType(gen, diagnostics, context);
		if (result || diagnostics != null)
			result &= AdtValidator.INSTANCE.validateSignature_UniqueOperations(
					this, diagnostics, context);
		if (!result) {
			throw new IllegalArgumentException(diagnostics.getMessage());
		}
		return this;
	}

	@Override
	public Signature withOperation(String operationName, String returnSort,
			String... sortNames) {
		assert (operationName != null);
		assert (returnSort != null);
		EList<Operation> generators = this.getOperations();
		Operation op = AdtFactory.eINSTANCE.createOperation();
		op.setName(operationName);
		ASort sortObj = null;
		for (ASort s : getSorts()) {
			if (s.getName().equals(returnSort)) {
				sortObj = s;
				op.setReturnType(s);
				break;
			}
		}
		if (sortObj == null) {
			throw new IllegalArgumentException();
		}
		for (String sortName : sortNames) {
			sortObj = null;
			for (ASort s : getSorts()) {
				if (s.getName().equals(sortName)) {
					sortObj = s;
					op.getFormalParameters().add(s);
					break;
				}
			}
			if (sortObj == null) {
				throw new IllegalArgumentException();
			}
		}
		generators.add(op);
		BasicDiagnostic diagnostics = new BasicDiagnostic();
		HashMap<Object, Object> context = new HashMap<Object, Object>();
		boolean result = AdtValidator.INSTANCE
				.validateOperation_ValidReturnType(op, diagnostics, context);
		if (result || diagnostics != null)
			result &= AdtValidator.INSTANCE.validateSignature_UniqueOperations(
					this, diagnostics, context);
		if (!result) {
			throw new IllegalArgumentException(diagnostics.getMessage());
		}
		return this;
	}

	public Operation getOperationByName(String name) {
		Operation result = null;
		for (Operation op : getAllOperations()) {
			if (op.getName().equals(name)) {
				result = op;
				break;
			}
		}
		return result;
	}

} // SignatureImpl
