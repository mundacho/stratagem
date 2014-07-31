/**
 */
package ch.unige.smv.cui.metamodel.adt.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ch.unige.smv.cui.metamodel.adt.ASort;
import ch.unige.smv.cui.metamodel.adt.ATerm;
import ch.unige.smv.cui.metamodel.adt.AdtPackage;
import ch.unige.smv.cui.metamodel.adt.Operation;
import ch.unige.smv.cui.metamodel.adt.Term;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.impl.TermImpl#getOperationSymbol <em>Operation Symbol</em>}</li>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.impl.TermImpl#getSubterms <em>Subterms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TermImpl extends ATermImpl implements Term {
	
	/**
	 * The cached value of the '{@link #getOperationSymbol() <em>Operation Symbol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationSymbol()
	 * @generated
	 * @ordered
	 */
	protected Operation operationSymbol;
	/**
	 * The cached value of the '{@link #getSubterms() <em>Subterms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubterms()
	 * @generated
	 * @ordered
	 */
	protected EList<ATerm> subterms;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdtPackage.Literals.TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperationSymbol() {
		if (operationSymbol != null && operationSymbol.eIsProxy()) {
			InternalEObject oldOperationSymbol = (InternalEObject)operationSymbol;
			operationSymbol = (Operation)eResolveProxy(oldOperationSymbol);
			if (operationSymbol != oldOperationSymbol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdtPackage.TERM__OPERATION_SYMBOL, oldOperationSymbol, operationSymbol));
			}
		}
		return operationSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetOperationSymbol() {
		return operationSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationSymbol(Operation newOperationSymbol) {
		Operation oldOperationSymbol = operationSymbol;
		operationSymbol = newOperationSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdtPackage.TERM__OPERATION_SYMBOL, oldOperationSymbol, operationSymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATerm> getSubterms() {
		if (subterms == null) {
			subterms = new EObjectContainmentEList<ATerm>(ATerm.class, this, AdtPackage.TERM__SUBTERMS);
		}
		return subterms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdtPackage.TERM__SUBTERMS:
				return ((InternalEList<?>)getSubterms()).basicRemove(otherEnd, msgs);
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
			case AdtPackage.TERM__OPERATION_SYMBOL:
				if (resolve) return getOperationSymbol();
				return basicGetOperationSymbol();
			case AdtPackage.TERM__SUBTERMS:
				return getSubterms();
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
			case AdtPackage.TERM__OPERATION_SYMBOL:
				setOperationSymbol((Operation)newValue);
				return;
			case AdtPackage.TERM__SUBTERMS:
				getSubterms().clear();
				getSubterms().addAll((Collection<? extends ATerm>)newValue);
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
			case AdtPackage.TERM__OPERATION_SYMBOL:
				setOperationSymbol((Operation)null);
				return;
			case AdtPackage.TERM__SUBTERMS:
				getSubterms().clear();
				return;
		}
		super.eUnset(featureID);
	}
	
	@Override
	public ASort basicGetSort() {
		return operationSymbol.getReturnType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AdtPackage.TERM__OPERATION_SYMBOL:
				return operationSymbol != null;
			case AdtPackage.TERM__SUBTERMS:
				return subterms != null && !subterms.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public boolean isVariable() {
		return false;
	}
	
	@Override
	public String getSymbol() {
		return getOperationSymbol().getName();
	}
	
	@Override
	public String toString() {
		if (getSubterms().isEmpty()) return getSymbol();
		StringBuffer result = new StringBuffer();
		result.append(getSymbol());	
		Object[] subtermsAsArray = getSubterms().toArray();
		if (subtermsAsArray.length == 0) return result.toString();
		result.append('(');
		result.append(subtermsAsArray[0]);
		for (int i = 1; i < subtermsAsArray.length; i++) {
			result.append(", " + subtermsAsArray[i]);

		}
		result.append(")");
		return result.toString();
	}
	
} //TermImpl
