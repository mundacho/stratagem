/**
 */
package ch.unige.cui.smv.metamodel.ts.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import ch.unige.cui.smv.metamodel.ts.DeclaredStrategy;
import ch.unige.cui.smv.metamodel.ts.TransitionSystem;
import ch.unige.cui.smv.metamodel.ts.TsPackage;
import ch.unige.smv.cui.metamodel.adt.ADT;
import ch.unige.smv.cui.metamodel.adt.ATerm;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Transition System</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link ch.unige.cui.smv.metamodel.ts.impl.TransitionSystemImpl#getAdt
 * <em>Adt</em>}</li>
 * <li>
 * {@link ch.unige.cui.smv.metamodel.ts.impl.TransitionSystemImpl#getInitialState
 * <em>Initial State</em>}</li>
 * <li>
 * {@link ch.unige.cui.smv.metamodel.ts.impl.TransitionSystemImpl#getTransitions
 * <em>Transitions</em>}</li>
 * <li>
 * {@link ch.unige.cui.smv.metamodel.ts.impl.TransitionSystemImpl#getAuxiliary
 * <em>Auxiliary</em>}</li>
 * <li>{@link ch.unige.cui.smv.metamodel.ts.impl.TransitionSystemImpl#getStrats
 * <em>Strats</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TransitionSystemImpl extends MinimalEObjectImpl.Container
		implements TransitionSystem {

	private Map<String, DeclaredStrategy> strategyDeclarations = new HashMap<>();

	/**
	 * Adapter to take note when an element has been added to the list.
	 * 
	 * @author mundacho
	 * 
	 */
	class ListToMapAdapter extends AdapterImpl {

		@SuppressWarnings("unchecked")
		@Override
		public void notifyChanged(Notification msg) {
			DeclaredStrategy declaredStrat;
			List<DeclaredStrategy> declaredStrategies;
			if (msg.getFeature().equals(
					TsPackageImpl.eINSTANCE.getTransitionSystem_Auxiliary())
					|| msg.getFeature().equals(
							TsPackageImpl.eINSTANCE
									.getTransitionSystem_Transitions()))
				switch (msg.getEventType()) {
				case Notification.ADD:
					declaredStrat = (DeclaredStrategy) msg.getNewValue();
					strategyDeclarations.put(declaredStrat.getName(),
							declaredStrat);
					break;
				case Notification.ADD_MANY:
					declaredStrategies = (List<DeclaredStrategy>) msg
							.getNewValue();
					for (DeclaredStrategy ds : declaredStrategies) {
						strategyDeclarations.put(ds.getName(), ds);
					}
					break;
				case Notification.REMOVE:
					declaredStrat = (DeclaredStrategy) ((FeatureMap.Entry) msg
							.getNewValue()).getValue();
					strategyDeclarations.remove(declaredStrat.getName());
					break;
				case Notification.REMOVE_MANY:
					declaredStrategies = (List<DeclaredStrategy>) msg
							.getNewValue();
					for (DeclaredStrategy ds : declaredStrategies) {
						strategyDeclarations.put(ds.getName(), ds);
					}
					break;
				}
		}

		@Override
		public boolean isAdapterForType(Object type) {
			return type == ListToMapAdapter.class;
		}
	}

	/**
	 * The cached value of the '{@link #getAdt() <em>Adt</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAdt()
	 * @generated
	 * @ordered
	 */
	protected ADT adt;

	/**
	 * The cached value of the '{@link #getInitialState()
	 * <em>Initial State</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected ATerm initialState;

	/**
	 * The cached value of the '{@link #getStrats() <em>Strats</em>}' attribute
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStrats()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap strats;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected TransitionSystemImpl() {
		super();
		final ListToMapAdapter listAdapter = new ListToMapAdapter();
		(new AdapterFactoryImpl() {
			@Override
			protected Adapter createAdapter(Notifier target) {
				return listAdapter;
			}

			@Override
			public boolean isFactoryForType(Object type) {
				return type == ListToMapAdapter.class;
			}

		}).adapt(this, ListToMapAdapter.class);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TsPackage.Literals.TRANSITION_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ADT getAdt() {
		return adt;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetAdt(ADT newAdt, NotificationChain msgs) {
		ADT oldAdt = adt;
		adt = newAdt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TsPackage.TRANSITION_SYSTEM__ADT, oldAdt,
					newAdt);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAdt(ADT newAdt) {
		if (newAdt != adt) {
			NotificationChain msgs = null;
			if (adt != null)
				msgs = ((InternalEObject) adt).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- TsPackage.TRANSITION_SYSTEM__ADT, null, msgs);
			if (newAdt != null)
				msgs = ((InternalEObject) newAdt).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- TsPackage.TRANSITION_SYSTEM__ADT, null, msgs);
			msgs = basicSetAdt(newAdt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TsPackage.TRANSITION_SYSTEM__ADT, newAdt, newAdt));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ATerm getInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetInitialState(ATerm newInitialState,
			NotificationChain msgs) {
		ATerm oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					TsPackage.TRANSITION_SYSTEM__INITIAL_STATE,
					oldInitialState, newInitialState);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setInitialState(ATerm newInitialState) {
		if (newInitialState != initialState) {
			NotificationChain msgs = null;
			if (initialState != null)
				msgs = ((InternalEObject) initialState).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- TsPackage.TRANSITION_SYSTEM__INITIAL_STATE,
						null, msgs);
			if (newInitialState != null)
				msgs = ((InternalEObject) newInitialState).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- TsPackage.TRANSITION_SYSTEM__INITIAL_STATE,
						null, msgs);
			msgs = basicSetInitialState(newInitialState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TsPackage.TRANSITION_SYSTEM__INITIAL_STATE,
					newInitialState, newInitialState));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<DeclaredStrategy> getTransitions() {
		return getStrats().list(
				TsPackage.Literals.TRANSITION_SYSTEM__TRANSITIONS);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<DeclaredStrategy> getAuxiliary() {
		return getStrats()
				.list(TsPackage.Literals.TRANSITION_SYSTEM__AUXILIARY);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FeatureMap getStrats() {
		if (strats == null) {
			strats = new BasicFeatureMap(this,
					TsPackage.TRANSITION_SYSTEM__STRATS);
		}
		return strats;
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
		case TsPackage.TRANSITION_SYSTEM__ADT:
			return basicSetAdt(null, msgs);
		case TsPackage.TRANSITION_SYSTEM__INITIAL_STATE:
			return basicSetInitialState(null, msgs);
		case TsPackage.TRANSITION_SYSTEM__TRANSITIONS:
			return ((InternalEList<?>) getTransitions()).basicRemove(otherEnd,
					msgs);
		case TsPackage.TRANSITION_SYSTEM__AUXILIARY:
			return ((InternalEList<?>) getAuxiliary()).basicRemove(otherEnd,
					msgs);
		case TsPackage.TRANSITION_SYSTEM__STRATS:
			return ((InternalEList<?>) getStrats()).basicRemove(otherEnd, msgs);
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
		case TsPackage.TRANSITION_SYSTEM__ADT:
			return getAdt();
		case TsPackage.TRANSITION_SYSTEM__INITIAL_STATE:
			return getInitialState();
		case TsPackage.TRANSITION_SYSTEM__TRANSITIONS:
			return getTransitions();
		case TsPackage.TRANSITION_SYSTEM__AUXILIARY:
			return getAuxiliary();
		case TsPackage.TRANSITION_SYSTEM__STRATS:
			if (coreType)
				return getStrats();
			return ((FeatureMap.Internal) getStrats()).getWrapper();
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
		case TsPackage.TRANSITION_SYSTEM__ADT:
			setAdt((ADT) newValue);
			return;
		case TsPackage.TRANSITION_SYSTEM__INITIAL_STATE:
			setInitialState((ATerm) newValue);
			return;
		case TsPackage.TRANSITION_SYSTEM__TRANSITIONS:
			getTransitions().clear();
			getTransitions().addAll(
					(Collection<? extends DeclaredStrategy>) newValue);
			return;
		case TsPackage.TRANSITION_SYSTEM__AUXILIARY:
			getAuxiliary().clear();
			getAuxiliary().addAll(
					(Collection<? extends DeclaredStrategy>) newValue);
			return;
		case TsPackage.TRANSITION_SYSTEM__STRATS:
			((FeatureMap.Internal) getStrats()).set(newValue);
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
		case TsPackage.TRANSITION_SYSTEM__ADT:
			setAdt((ADT) null);
			return;
		case TsPackage.TRANSITION_SYSTEM__INITIAL_STATE:
			setInitialState((ATerm) null);
			return;
		case TsPackage.TRANSITION_SYSTEM__TRANSITIONS:
			getTransitions().clear();
			return;
		case TsPackage.TRANSITION_SYSTEM__AUXILIARY:
			getAuxiliary().clear();
			return;
		case TsPackage.TRANSITION_SYSTEM__STRATS:
			getStrats().clear();
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
		case TsPackage.TRANSITION_SYSTEM__ADT:
			return adt != null;
		case TsPackage.TRANSITION_SYSTEM__INITIAL_STATE:
			return initialState != null;
		case TsPackage.TRANSITION_SYSTEM__TRANSITIONS:
			return !getTransitions().isEmpty();
		case TsPackage.TRANSITION_SYSTEM__AUXILIARY:
			return !getAuxiliary().isEmpty();
		case TsPackage.TRANSITION_SYSTEM__STRATS:
			return strats != null && !strats.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (strats: ");
		result.append(strats);
		result.append(')');
		return result.toString();
	}

	@Override
	public DeclaredStrategy getDeclaredStrategyByName(String name) {
		return strategyDeclarations.get(name);
	}

} // TransitionSystemImpl
