/**
 */
package ch.unige.smv.cui.metamodel.adt.impl;

import ch.unige.smv.cui.metamodel.adt.ASort;
import ch.unige.smv.cui.metamodel.adt.AdtPackage;
import ch.unige.smv.cui.metamodel.adt.SubSort;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Sub Sort</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.impl.SubSortImpl#getSuperSort <em>Super Sort</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubSortImpl extends ASortImpl implements SubSort {
	/**
	 * The cached value of the '{@link #getSuperSort() <em>Super Sort</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSuperSort()
	 * @generated
	 * @ordered
	 */
	protected ASort superSort;

	@Override
	public boolean isSubSortOf(ASort superSort) {
		ASort currentSort = this;
		while (!currentSort.equals(this)) {
			if (currentSort instanceof SubSort) {
				SubSort ss = (SubSort) currentSort;
				currentSort = ss.getSuperSort();
			} else { // current sort is not instance of Subsort, then it's an
						// instance of Sort
				return false;
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SubSortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdtPackage.Literals.SUB_SORT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ASort getSuperSort() {
		if (superSort != null && superSort.eIsProxy()) {
			InternalEObject oldSuperSort = (InternalEObject)superSort;
			superSort = (ASort)eResolveProxy(oldSuperSort);
			if (superSort != oldSuperSort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdtPackage.SUB_SORT__SUPER_SORT, oldSuperSort, superSort));
			}
		}
		return superSort;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ASort basicGetSuperSort() {
		return superSort;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperSort(ASort newSuperSort) {
		ASort oldSuperSort = superSort;
		superSort = newSuperSort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdtPackage.SUB_SORT__SUPER_SORT, oldSuperSort, superSort));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdtPackage.SUB_SORT__SUPER_SORT:
				if (resolve) return getSuperSort();
				return basicGetSuperSort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AdtPackage.SUB_SORT__SUPER_SORT:
				setSuperSort((ASort)newValue);
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
			case AdtPackage.SUB_SORT__SUPER_SORT:
				setSuperSort((ASort)null);
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
			case AdtPackage.SUB_SORT__SUPER_SORT:
				return superSort != null;
		}
		return super.eIsSet(featureID);
	}

} // SubSortImpl
