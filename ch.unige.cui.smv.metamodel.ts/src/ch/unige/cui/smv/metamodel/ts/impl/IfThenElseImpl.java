/**
 */
package ch.unige.cui.smv.metamodel.ts.impl;

import ch.unige.cui.smv.metamodel.ts.IfThenElse;
import ch.unige.cui.smv.metamodel.ts.Strategy;
import ch.unige.cui.smv.metamodel.ts.TsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Then Else</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.unige.cui.smv.metamodel.ts.impl.IfThenElseImpl#getS1 <em>S1</em>}</li>
 *   <li>{@link ch.unige.cui.smv.metamodel.ts.impl.IfThenElseImpl#getS2 <em>S2</em>}</li>
 *   <li>{@link ch.unige.cui.smv.metamodel.ts.impl.IfThenElseImpl#getS3 <em>S3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfThenElseImpl extends NonVariableStrategyImpl implements IfThenElse {
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
	 * The cached value of the '{@link #getS3() <em>S3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS3()
	 * @generated
	 * @ordered
	 */
	protected Strategy s3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfThenElseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TsPackage.Literals.IF_THEN_ELSE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TsPackage.IF_THEN_ELSE__S1, oldS1, newS1);
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
				msgs = ((InternalEObject)s1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TsPackage.IF_THEN_ELSE__S1, null, msgs);
			if (newS1 != null)
				msgs = ((InternalEObject)newS1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TsPackage.IF_THEN_ELSE__S1, null, msgs);
			msgs = basicSetS1(newS1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TsPackage.IF_THEN_ELSE__S1, newS1, newS1));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TsPackage.IF_THEN_ELSE__S2, oldS2, newS2);
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
				msgs = ((InternalEObject)s2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TsPackage.IF_THEN_ELSE__S2, null, msgs);
			if (newS2 != null)
				msgs = ((InternalEObject)newS2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TsPackage.IF_THEN_ELSE__S2, null, msgs);
			msgs = basicSetS2(newS2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TsPackage.IF_THEN_ELSE__S2, newS2, newS2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strategy getS3() {
		return s3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetS3(Strategy newS3, NotificationChain msgs) {
		Strategy oldS3 = s3;
		s3 = newS3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TsPackage.IF_THEN_ELSE__S3, oldS3, newS3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setS3(Strategy newS3) {
		if (newS3 != s3) {
			NotificationChain msgs = null;
			if (s3 != null)
				msgs = ((InternalEObject)s3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TsPackage.IF_THEN_ELSE__S3, null, msgs);
			if (newS3 != null)
				msgs = ((InternalEObject)newS3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TsPackage.IF_THEN_ELSE__S3, null, msgs);
			msgs = basicSetS3(newS3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TsPackage.IF_THEN_ELSE__S3, newS3, newS3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TsPackage.IF_THEN_ELSE__S1:
				return basicSetS1(null, msgs);
			case TsPackage.IF_THEN_ELSE__S2:
				return basicSetS2(null, msgs);
			case TsPackage.IF_THEN_ELSE__S3:
				return basicSetS3(null, msgs);
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
			case TsPackage.IF_THEN_ELSE__S1:
				return getS1();
			case TsPackage.IF_THEN_ELSE__S2:
				return getS2();
			case TsPackage.IF_THEN_ELSE__S3:
				return getS3();
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
			case TsPackage.IF_THEN_ELSE__S1:
				setS1((Strategy)newValue);
				return;
			case TsPackage.IF_THEN_ELSE__S2:
				setS2((Strategy)newValue);
				return;
			case TsPackage.IF_THEN_ELSE__S3:
				setS3((Strategy)newValue);
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
			case TsPackage.IF_THEN_ELSE__S1:
				setS1((Strategy)null);
				return;
			case TsPackage.IF_THEN_ELSE__S2:
				setS2((Strategy)null);
				return;
			case TsPackage.IF_THEN_ELSE__S3:
				setS3((Strategy)null);
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
			case TsPackage.IF_THEN_ELSE__S1:
				return s1 != null;
			case TsPackage.IF_THEN_ELSE__S2:
				return s2 != null;
			case TsPackage.IF_THEN_ELSE__S3:
				return s3 != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer("IfThenElse(");
		result.append(getS1());
		result.append(", ");
		result.append(getS2());
		result.append(", ");
		result.append(getS3());
		result.append(")");
		return result.toString();
	}

} //IfThenElseImpl
