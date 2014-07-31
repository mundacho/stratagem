/**
 */
package ch.unige.cui.smv.metamodel.ts.impl;

import ch.unige.cui.smv.metamodel.ts.DeclaredStrategyInstance;
import ch.unige.cui.smv.metamodel.ts.Strategy;
import ch.unige.cui.smv.metamodel.ts.TsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Declared Strategy Instance</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link ch.unige.cui.smv.metamodel.ts.impl.DeclaredStrategyInstanceImpl#getName
 * <em>Name</em>}</li>
 * <li>
 * {@link ch.unige.cui.smv.metamodel.ts.impl.DeclaredStrategyInstanceImpl#getActualParams
 * <em>Actual Params</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DeclaredStrategyInstanceImpl extends NonVariableStrategyImpl
		implements DeclaredStrategyInstance {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActualParams()
	 * <em>Actual Params</em>}' containment reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getActualParams()
	 * @generated
	 * @ordered
	 */
	protected EList<Strategy> actualParams;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DeclaredStrategyInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TsPackage.Literals.DECLARED_STRATEGY_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TsPackage.DECLARED_STRATEGY_INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Strategy> getActualParams() {
		if (actualParams == null) {
			actualParams = new EObjectContainmentEList<Strategy>(
					Strategy.class, this,
					TsPackage.DECLARED_STRATEGY_INSTANCE__ACTUAL_PARAMS);
		}
		return actualParams;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TsPackage.DECLARED_STRATEGY_INSTANCE__ACTUAL_PARAMS:
			return ((InternalEList<?>) getActualParams()).basicRemove(otherEnd,
					msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TsPackage.DECLARED_STRATEGY_INSTANCE__NAME:
			return getName();
		case TsPackage.DECLARED_STRATEGY_INSTANCE__ACTUAL_PARAMS:
			return getActualParams();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TsPackage.DECLARED_STRATEGY_INSTANCE__NAME:
			setName((String) newValue);
			return;
		case TsPackage.DECLARED_STRATEGY_INSTANCE__ACTUAL_PARAMS:
			getActualParams().clear();
			getActualParams().addAll((Collection<? extends Strategy>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TsPackage.DECLARED_STRATEGY_INSTANCE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TsPackage.DECLARED_STRATEGY_INSTANCE__ACTUAL_PARAMS:
			getActualParams().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TsPackage.DECLARED_STRATEGY_INSTANCE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case TsPackage.DECLARED_STRATEGY_INSTANCE__ACTUAL_PARAMS:
			return actualParams != null && !actualParams.isEmpty();
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

		StringBuffer result = new StringBuffer();
		int paramsSize = getActualParams().size();
		result.append(name);
		if (paramsSize == 0)
			return name.toString();
		result.append('(');
		Object[] paramsAsArray = getActualParams().toArray();
		result.append(paramsAsArray[0]);
		for (int i = 1; i < paramsAsArray.length; i++) {
			result.append(", " + paramsAsArray[i]);

		}
		result.append(")");
		return result.toString();
	}

} // DeclaredStrategyInstanceImpl
