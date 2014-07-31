/**
 */
package ch.unige.cui.smv.metamodel.ts.impl;

import ch.unige.cui.smv.metamodel.ts.Sequence;
import ch.unige.cui.smv.metamodel.ts.Strategy;
import ch.unige.cui.smv.metamodel.ts.TsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.unige.cui.smv.metamodel.ts.impl.SequenceImpl#getS1 <em>S1</em>}</li>
 *   <li>{@link ch.unige.cui.smv.metamodel.ts.impl.SequenceImpl#getS2 <em>S2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceImpl extends NonVariableStrategyImpl implements Sequence {
	/**
	 * The cached value of the '{@link #getS1() <em>S1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS1()
	 * @generated
	 * @ordered
	 */
	protected Strategy s1;

	/**
	 * The cached value of the '{@link #getS2() <em>S2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS2()
	 * @generated
	 * @ordered
	 */
	protected Strategy s2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TsPackage.Literals.SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strategy getS1() {
		return s1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetS1(Strategy newS1, NotificationChain msgs) {
		Strategy oldS1 = s1;
		s1 = newS1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TsPackage.SEQUENCE__S1, oldS1, newS1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setS1(Strategy newS1) {
		if (newS1 != s1) {
			NotificationChain msgs = null;
			if (s1 != null)
				msgs = ((InternalEObject)s1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TsPackage.SEQUENCE__S1, null, msgs);
			if (newS1 != null)
				msgs = ((InternalEObject)newS1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TsPackage.SEQUENCE__S1, null, msgs);
			msgs = basicSetS1(newS1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TsPackage.SEQUENCE__S1, newS1, newS1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strategy getS2() {
		return s2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetS2(Strategy newS2, NotificationChain msgs) {
		Strategy oldS2 = s2;
		s2 = newS2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TsPackage.SEQUENCE__S2, oldS2, newS2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setS2(Strategy newS2) {
		if (newS2 != s2) {
			NotificationChain msgs = null;
			if (s2 != null)
				msgs = ((InternalEObject)s2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TsPackage.SEQUENCE__S2, null, msgs);
			if (newS2 != null)
				msgs = ((InternalEObject)newS2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TsPackage.SEQUENCE__S2, null, msgs);
			msgs = basicSetS2(newS2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TsPackage.SEQUENCE__S2, newS2, newS2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TsPackage.SEQUENCE__S1:
				return basicSetS1(null, msgs);
			case TsPackage.SEQUENCE__S2:
				return basicSetS2(null, msgs);
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
			case TsPackage.SEQUENCE__S1:
				return getS1();
			case TsPackage.SEQUENCE__S2:
				return getS2();
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
			case TsPackage.SEQUENCE__S1:
				setS1((Strategy)newValue);
				return;
			case TsPackage.SEQUENCE__S2:
				setS2((Strategy)newValue);
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
			case TsPackage.SEQUENCE__S1:
				setS1((Strategy)null);
				return;
			case TsPackage.SEQUENCE__S2:
				setS2((Strategy)null);
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
			case TsPackage.SEQUENCE__S1:
				return s1 != null;
			case TsPackage.SEQUENCE__S2:
				return s2 != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer("Sequence(");
		result.append(getS1());
		result.append(", ");
		result.append(getS2());
		result.append(")");
		return result.toString();
	}

} //SequenceImpl
