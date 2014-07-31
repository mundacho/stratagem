/**
 */
package ch.unige.smv.cui.metamodel.adt.impl;

import ch.unige.smv.cui.metamodel.adt.ADT;
import ch.unige.smv.cui.metamodel.adt.ASort;
import ch.unige.smv.cui.metamodel.adt.ATerm;
import ch.unige.smv.cui.metamodel.adt.AdtPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ATerm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.impl.ATermImpl#getAdt <em>Adt</em>}</li>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.impl.ATermImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.impl.ATermImpl#getSymbol <em>Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ATermImpl extends MinimalEObjectImpl.Container implements ATerm {
	/**
	 * The cached value of the '{@link #getAdt() <em>Adt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdt()
	 * @generated
	 * @ordered
	 */
	protected ADT adt;

	/**
	 * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdtPackage.Literals.ATERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADT getAdt() {
		if (adt != null && adt.eIsProxy()) {
			InternalEObject oldAdt = (InternalEObject)adt;
			adt = (ADT)eResolveProxy(oldAdt);
			if (adt != oldAdt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdtPackage.ATERM__ADT, oldAdt, adt));
			}
		}
		return adt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADT basicGetAdt() {
		return adt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdt(ADT newAdt) {
		ADT oldAdt = adt;
		adt = newAdt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdtPackage.ATERM__ADT, oldAdt, adt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASort getSort() {
		ASort sort = basicGetSort();
		return sort != null && sort.eIsProxy() ? (ASort)eResolveProxy((InternalEObject)sort) : sort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract ASort basicGetSort();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public abstract String getSymbol();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdtPackage.ATERM__ADT:
				if (resolve) return getAdt();
				return basicGetAdt();
			case AdtPackage.ATERM__SORT:
				if (resolve) return getSort();
				return basicGetSort();
			case AdtPackage.ATERM__SYMBOL:
				return getSymbol();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AdtPackage.ATERM__ADT:
				setAdt((ADT)newValue);
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
			case AdtPackage.ATERM__ADT:
				setAdt((ADT)null);
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
			case AdtPackage.ATERM__ADT:
				return adt != null;
			case AdtPackage.ATERM__SORT:
				return basicGetSort() != null;
			case AdtPackage.ATERM__SYMBOL:
				return SYMBOL_EDEFAULT == null ? getSymbol() != null : !SYMBOL_EDEFAULT.equals(getSymbol());
		}
		return super.eIsSet(featureID);
	}

} //ATermImpl
