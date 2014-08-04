/**
 */
package ch.unige.smv.cui.metamodel.adt.impl;

import ch.unige.smv.cui.metamodel.adt.ATerm;
import ch.unige.smv.cui.metamodel.adt.AdtPackage;
import ch.unige.smv.cui.metamodel.adt.Equation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.impl.EquationImpl#getLeftHandTerm <em>Left Hand Term</em>}</li>
 *   <li>{@link ch.unige.smv.cui.metamodel.adt.impl.EquationImpl#getRightHandTerm <em>Right Hand Term</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EquationImpl extends MinimalEObjectImpl.Container implements Equation {
	/**
	 * The cached value of the '{@link #getLeftHandTerm() <em>Left Hand Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftHandTerm()
	 * @generated
	 * @ordered
	 */
	protected ATerm leftHandTerm;

	/**
	 * The cached value of the '{@link #getRightHandTerm() <em>Right Hand Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightHandTerm()
	 * @generated
	 * @ordered
	 */
	protected ATerm rightHandTerm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdtPackage.Literals.EQUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATerm getLeftHandTerm() {
		return leftHandTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftHandTerm(ATerm newLeftHandTerm, NotificationChain msgs) {
		ATerm oldLeftHandTerm = leftHandTerm;
		leftHandTerm = newLeftHandTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdtPackage.EQUATION__LEFT_HAND_TERM, oldLeftHandTerm, newLeftHandTerm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftHandTerm(ATerm newLeftHandTerm) {
		if (newLeftHandTerm != leftHandTerm) {
			NotificationChain msgs = null;
			if (leftHandTerm != null)
				msgs = ((InternalEObject)leftHandTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdtPackage.EQUATION__LEFT_HAND_TERM, null, msgs);
			if (newLeftHandTerm != null)
				msgs = ((InternalEObject)newLeftHandTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdtPackage.EQUATION__LEFT_HAND_TERM, null, msgs);
			msgs = basicSetLeftHandTerm(newLeftHandTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdtPackage.EQUATION__LEFT_HAND_TERM, newLeftHandTerm, newLeftHandTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATerm getRightHandTerm() {
		return rightHandTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightHandTerm(ATerm newRightHandTerm, NotificationChain msgs) {
		ATerm oldRightHandTerm = rightHandTerm;
		rightHandTerm = newRightHandTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdtPackage.EQUATION__RIGHT_HAND_TERM, oldRightHandTerm, newRightHandTerm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightHandTerm(ATerm newRightHandTerm) {
		if (newRightHandTerm != rightHandTerm) {
			NotificationChain msgs = null;
			if (rightHandTerm != null)
				msgs = ((InternalEObject)rightHandTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdtPackage.EQUATION__RIGHT_HAND_TERM, null, msgs);
			if (newRightHandTerm != null)
				msgs = ((InternalEObject)newRightHandTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdtPackage.EQUATION__RIGHT_HAND_TERM, null, msgs);
			msgs = basicSetRightHandTerm(newRightHandTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdtPackage.EQUATION__RIGHT_HAND_TERM, newRightHandTerm, newRightHandTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdtPackage.EQUATION__LEFT_HAND_TERM:
				return basicSetLeftHandTerm(null, msgs);
			case AdtPackage.EQUATION__RIGHT_HAND_TERM:
				return basicSetRightHandTerm(null, msgs);
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
			case AdtPackage.EQUATION__LEFT_HAND_TERM:
				return getLeftHandTerm();
			case AdtPackage.EQUATION__RIGHT_HAND_TERM:
				return getRightHandTerm();
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
			case AdtPackage.EQUATION__LEFT_HAND_TERM:
				setLeftHandTerm((ATerm)newValue);
				return;
			case AdtPackage.EQUATION__RIGHT_HAND_TERM:
				setRightHandTerm((ATerm)newValue);
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
			case AdtPackage.EQUATION__LEFT_HAND_TERM:
				setLeftHandTerm((ATerm)null);
				return;
			case AdtPackage.EQUATION__RIGHT_HAND_TERM:
				setRightHandTerm((ATerm)null);
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
			case AdtPackage.EQUATION__LEFT_HAND_TERM:
				return leftHandTerm != null;
			case AdtPackage.EQUATION__RIGHT_HAND_TERM:
				return rightHandTerm != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public String toString() {
		return getLeftHandTerm() + " -> " + getRightHandTerm();
	}

} //EquationImpl
