/**
 */
package ch.unige.cui.smv.metamodel.ts.impl;

import ch.unige.cui.smv.metamodel.ts.DeclaredStrategy;
import ch.unige.cui.smv.metamodel.ts.NonVariableStrategy;
import ch.unige.cui.smv.metamodel.ts.TsPackage;
import ch.unige.cui.smv.metamodel.ts.VariableStrategy;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declared Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.unige.cui.smv.metamodel.ts.impl.DeclaredStrategyImpl#getName <em>Name</em>}</li>
 *   <li>{@link ch.unige.cui.smv.metamodel.ts.impl.DeclaredStrategyImpl#getBody <em>Body</em>}</li>
 *   <li>{@link ch.unige.cui.smv.metamodel.ts.impl.DeclaredStrategyImpl#getFormalParams <em>Formal Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeclaredStrategyImpl extends MinimalEObjectImpl.Container implements DeclaredStrategy {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected NonVariableStrategy body;

	/**
	 * The cached value of the '{@link #getFormalParams() <em>Formal Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalParams()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableStrategy> formalParams;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclaredStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TsPackage.Literals.DECLARED_STRATEGY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TsPackage.DECLARED_STRATEGY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonVariableStrategy getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(NonVariableStrategy newBody, NotificationChain msgs) {
		NonVariableStrategy oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TsPackage.DECLARED_STRATEGY__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(NonVariableStrategy newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TsPackage.DECLARED_STRATEGY__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TsPackage.DECLARED_STRATEGY__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TsPackage.DECLARED_STRATEGY__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableStrategy> getFormalParams() {
		if (formalParams == null) {
			formalParams = new EObjectContainmentEList<VariableStrategy>(VariableStrategy.class, this, TsPackage.DECLARED_STRATEGY__FORMAL_PARAMS);
		}
		return formalParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TsPackage.DECLARED_STRATEGY__BODY:
				return basicSetBody(null, msgs);
			case TsPackage.DECLARED_STRATEGY__FORMAL_PARAMS:
				return ((InternalEList<?>)getFormalParams()).basicRemove(otherEnd, msgs);
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
			case TsPackage.DECLARED_STRATEGY__NAME:
				return getName();
			case TsPackage.DECLARED_STRATEGY__BODY:
				return getBody();
			case TsPackage.DECLARED_STRATEGY__FORMAL_PARAMS:
				return getFormalParams();
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
			case TsPackage.DECLARED_STRATEGY__NAME:
				setName((String)newValue);
				return;
			case TsPackage.DECLARED_STRATEGY__BODY:
				setBody((NonVariableStrategy)newValue);
				return;
			case TsPackage.DECLARED_STRATEGY__FORMAL_PARAMS:
				getFormalParams().clear();
				getFormalParams().addAll((Collection<? extends VariableStrategy>)newValue);
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
			case TsPackage.DECLARED_STRATEGY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TsPackage.DECLARED_STRATEGY__BODY:
				setBody((NonVariableStrategy)null);
				return;
			case TsPackage.DECLARED_STRATEGY__FORMAL_PARAMS:
				getFormalParams().clear();
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
			case TsPackage.DECLARED_STRATEGY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TsPackage.DECLARED_STRATEGY__BODY:
				return body != null;
			case TsPackage.DECLARED_STRATEGY__FORMAL_PARAMS:
				return formalParams != null && !formalParams.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer();
		int paramsSize = getFormalParams().size();
		result.append(name);
		if (paramsSize == 0) {
			 result.append(" = " + getBody());
			return result.toString();
		}
		result.append('(');
		Object[] paramsAsArray = getFormalParams().toArray();
		result.append(paramsAsArray[0]);
		for (int i = 1; i < paramsAsArray.length; i++) {
			result.append(", " + paramsAsArray[i]);

		}
		result.append(") = " + getBody());
		return result.toString();
	}

} //DeclaredStrategyImpl
