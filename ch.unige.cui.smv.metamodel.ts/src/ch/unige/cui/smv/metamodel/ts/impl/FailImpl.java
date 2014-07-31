/**
 */
package ch.unige.cui.smv.metamodel.ts.impl;

import ch.unige.cui.smv.metamodel.ts.Fail;
import ch.unige.cui.smv.metamodel.ts.TsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FailImpl extends NonVariableStrategyImpl implements Fail {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TsPackage.Literals.FAIL;
	}
	
	@Override
	public String toString() {
		return "Fail";
	}

} //FailImpl
