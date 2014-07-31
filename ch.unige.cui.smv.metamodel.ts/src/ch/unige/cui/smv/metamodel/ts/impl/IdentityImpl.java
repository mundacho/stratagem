/**
 */
package ch.unige.cui.smv.metamodel.ts.impl;

import ch.unige.cui.smv.metamodel.ts.Identity;
import ch.unige.cui.smv.metamodel.ts.TsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IdentityImpl extends NonVariableStrategyImpl implements Identity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TsPackage.Literals.IDENTITY;
	}
	
	@Override
	public String toString() {
		return "Identity";
	}

} //IdentityImpl
