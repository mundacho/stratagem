/**
 */
package ch.unige.smv.cui.metamodel.adt.impl;

import ch.unige.smv.cui.metamodel.adt.ATerm;
import ch.unige.smv.cui.metamodel.adt.AdtPackage;
import ch.unige.smv.cui.metamodel.adt.Equation;

import org.eclipse.emf.common.notify.Notification;
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
	 * The cached value of the '{@link #getLeftHandTerm() <em>Left Hand Term</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftHandTerm()
	 * @generated
	 * @ordered
	 */
	protected ATerm leftHandTerm;

	/**
	 * The cached value of the '{@link #getRightHandTerm() <em>Right Hand Term</em>}' reference.
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
		if (leftHandTerm != null && leftHandTerm.eIsProxy()) {
			InternalEObject oldLeftHandTerm = (InternalEObject)leftHandTerm;
			leftHandTerm = (ATerm)eResolveProxy(oldLeftHandTerm);
			if (leftHandTerm != oldLeftHandTerm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdtPackage.EQUATION__LEFT_HAND_TERM, oldLeftHandTerm, leftHandTerm));
			}
		}
		return leftHandTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATerm basicGetLeftHandTerm() {
		return leftHandTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftHandTerm(ATerm newLeftHandTerm) {
		ATerm oldLeftHandTerm = leftHandTerm;
		leftHandTerm = newLeftHandTerm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdtPackage.EQUATION__LEFT_HAND_TERM, oldLeftHandTerm, leftHandTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATerm getRightHandTerm() {
		if (rightHandTerm != null && rightHandTerm.eIsProxy()) {
			InternalEObject oldRightHandTerm = (InternalEObject)rightHandTerm;
			rightHandTerm = (ATerm)eResolveProxy(oldRightHandTerm);
			if (rightHandTerm != oldRightHandTerm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdtPackage.EQUATION__RIGHT_HAND_TERM, oldRightHandTerm, rightHandTerm));
			}
		}
		return rightHandTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATerm basicGetRightHandTerm() {
		return rightHandTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightHandTerm(ATerm newRightHandTerm) {
		ATerm oldRightHandTerm = rightHandTerm;
		rightHandTerm = newRightHandTerm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdtPackage.EQUATION__RIGHT_HAND_TERM, oldRightHandTerm, rightHandTerm));
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
				if (resolve) return getLeftHandTerm();
				return basicGetLeftHandTerm();
			case AdtPackage.EQUATION__RIGHT_HAND_TERM:
				if (resolve) return getRightHandTerm();
				return basicGetRightHandTerm();
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
