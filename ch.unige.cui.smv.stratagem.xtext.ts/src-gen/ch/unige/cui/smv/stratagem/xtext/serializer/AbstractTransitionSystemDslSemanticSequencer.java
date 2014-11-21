package ch.unige.cui.smv.stratagem.xtext.serializer;

import ch.unige.cui.smv.metamodel.ts.All;
import ch.unige.cui.smv.metamodel.ts.Choice;
import ch.unige.cui.smv.metamodel.ts.DeclaredStrategy;
import ch.unige.cui.smv.metamodel.ts.DeclaredStrategyInstance;
import ch.unige.cui.smv.metamodel.ts.Fail;
import ch.unige.cui.smv.metamodel.ts.FixPointStrategy;
import ch.unige.cui.smv.metamodel.ts.Identity;
import ch.unige.cui.smv.metamodel.ts.IfThenElse;
import ch.unige.cui.smv.metamodel.ts.Not;
import ch.unige.cui.smv.metamodel.ts.One;
import ch.unige.cui.smv.metamodel.ts.Saturation;
import ch.unige.cui.smv.metamodel.ts.Sequence;
import ch.unige.cui.smv.metamodel.ts.SimpleStrategy;
import ch.unige.cui.smv.metamodel.ts.TransitionSystem;
import ch.unige.cui.smv.metamodel.ts.TsPackage;
import ch.unige.cui.smv.metamodel.ts.Union;
import ch.unige.cui.smv.metamodel.ts.VariableStrategy;
import ch.unige.cui.smv.stratagem.xtext.services.TransitionSystemDslGrammarAccess;
import ch.unige.smv.cui.metamodel.adt.ADT;
import ch.unige.smv.cui.metamodel.adt.AdtPackage;
import ch.unige.smv.cui.metamodel.adt.Equation;
import ch.unige.smv.cui.metamodel.adt.Operation;
import ch.unige.smv.cui.metamodel.adt.Signature;
import ch.unige.smv.cui.metamodel.adt.Sort;
import ch.unige.smv.cui.metamodel.adt.SubSort;
import ch.unige.smv.cui.metamodel.adt.Term;
import ch.unige.smv.cui.metamodel.adt.Variable;
import ch.unige.smv.cui.metamodel.adt.VariableDeclaration;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractTransitionSystemDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TransitionSystemDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AdtPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AdtPackage.ADT:
				if(context == grammarAccess.getADTRule()) {
					sequence_ADT(context, (ADT) semanticObject); 
					return; 
				}
				else break;
			case AdtPackage.EQUATION:
				if(context == grammarAccess.getEquationRule()) {
					sequence_Equation(context, (Equation) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getRewriteRuleRule()) {
					sequence_RewriteRule(context, (Equation) semanticObject); 
					return; 
				}
				else break;
			case AdtPackage.OPERATION:
				if(context == grammarAccess.getOperationRule()) {
					sequence_Operation(context, (Operation) semanticObject); 
					return; 
				}
				else break;
			case AdtPackage.SIGNATURE:
				if(context == grammarAccess.getSignatureRule()) {
					sequence_Signature(context, (Signature) semanticObject); 
					return; 
				}
				else break;
			case AdtPackage.SORT:
				if(context == grammarAccess.getASortRule() ||
				   context == grammarAccess.getSortRule()) {
					sequence_Sort(context, (Sort) semanticObject); 
					return; 
				}
				else break;
			case AdtPackage.SUB_SORT:
				if(context == grammarAccess.getASortRule() ||
				   context == grammarAccess.getSubSortRule()) {
					sequence_SubSort(context, (SubSort) semanticObject); 
					return; 
				}
				else break;
			case AdtPackage.TERM:
				if(context == grammarAccess.getATermRule() ||
				   context == grammarAccess.getTermRule()) {
					sequence_Term(context, (Term) semanticObject); 
					return; 
				}
				else break;
			case AdtPackage.VARIABLE:
				if(context == grammarAccess.getATermRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			case AdtPackage.VARIABLE_DECLARATION:
				if(context == grammarAccess.getVariableDeclarationRule()) {
					sequence_VariableDeclaration(context, (VariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == TsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TsPackage.ALL:
				if(context == grammarAccess.getAllRule() ||
				   context == grammarAccess.getNonVariableStrategyRule() ||
				   context == grammarAccess.getPredefStratsRule() ||
				   context == grammarAccess.getStrategyRule()) {
					sequence_All(context, (All) semanticObject); 
					return; 
				}
				else break;
			case TsPackage.CHOICE:
				if(context == grammarAccess.getChoiceRule() ||
				   context == grammarAccess.getNonVariableStrategyRule() ||
				   context == grammarAccess.getPredefStratsRule() ||
				   context == grammarAccess.getStrategyRule()) {
					sequence_Choice(context, (Choice) semanticObject); 
					return; 
				}
				else break;
			case TsPackage.DECLARED_STRATEGY:
				if(context == grammarAccess.getAuxiliaryRule()) {
					sequence_Auxiliary(context, (DeclaredStrategy) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTransitionRule()) {
					sequence_Transition(context, (DeclaredStrategy) semanticObject); 
					return; 
				}
				else break;
			case TsPackage.DECLARED_STRATEGY_INSTANCE:
				if(context == grammarAccess.getDeclaredStrategyInstanceRule() ||
				   context == grammarAccess.getNonVariableStrategyRule() ||
				   context == grammarAccess.getStrategyRule()) {
					sequence_DeclaredStrategyInstance(context, (DeclaredStrategyInstance) semanticObject); 
					return; 
				}
				else break;
			case TsPackage.FAIL:
				if(context == grammarAccess.getFailRule() ||
				   context == grammarAccess.getNonVariableStrategyRule() ||
				   context == grammarAccess.getPredefStratsRule() ||
				   context == grammarAccess.getStrategyRule()) {
					sequence_Fail(context, (Fail) semanticObject); 
					return; 
				}
				else break;
			case TsPackage.FIX_POINT_STRATEGY:
				if(context == grammarAccess.getFixpointRule() ||
				   context == grammarAccess.getNonVariableStrategyRule() ||
				   context == grammarAccess.getPredefStratsRule() ||
				   context == grammarAccess.getStrategyRule()) {
					sequence_Fixpoint(context, (FixPointStrategy) semanticObject); 
					return; 
				}
				else break;
			case TsPackage.IDENTITY:
				if(context == grammarAccess.getIdentityRule() ||
				   context == grammarAccess.getNonVariableStrategyRule() ||
				   context == grammarAccess.getPredefStratsRule() ||
				   context == grammarAccess.getStrategyRule()) {
					sequence_Identity(context, (Identity) semanticObject); 
					return; 
				}
				else break;
			case TsPackage.IF_THEN_ELSE:
				if(context == grammarAccess.getIfThenElseRule() ||
				   context == grammarAccess.getNonVariableStrategyRule() ||
				   context == grammarAccess.getPredefStratsRule() ||
				   context == grammarAccess.getStrategyRule()) {
					sequence_IfThenElse(context, (IfThenElse) semanticObject); 
					return; 
				}
				else break;
			case TsPackage.NOT:
				if(context == grammarAccess.getNonVariableStrategyRule() ||
				   context == grammarAccess.getNotRule() ||
				   context == grammarAccess.getPredefStratsRule() ||
				   context == grammarAccess.getStrategyRule()) {
					sequence_Not(context, (Not) semanticObject); 
					return; 
				}
				else break;
			case TsPackage.ONE:
				if(context == grammarAccess.getNonVariableStrategyRule() ||
				   context == grammarAccess.getOneRule() ||
				   context == grammarAccess.getPredefStratsRule() ||
				   context == grammarAccess.getStrategyRule()) {
					sequence_One(context, (One) semanticObject); 
					return; 
				}
				else break;
			case TsPackage.SATURATION:
				if(context == grammarAccess.getNonVariableStrategyRule() ||
				   context == grammarAccess.getPredefStratsRule() ||
				   context == grammarAccess.getSaturationRule() ||
				   context == grammarAccess.getStrategyRule()) {
					sequence_Saturation(context, (Saturation) semanticObject); 
					return; 
				}
				else break;
			case TsPackage.SEQUENCE:
				if(context == grammarAccess.getNonVariableStrategyRule() ||
				   context == grammarAccess.getPredefStratsRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getStrategyRule()) {
					sequence_Sequence(context, (Sequence) semanticObject); 
					return; 
				}
				else break;
			case TsPackage.SIMPLE_STRATEGY:
				if(context == grammarAccess.getNonVariableStrategyRule() ||
				   context == grammarAccess.getPredefStratsRule() ||
				   context == grammarAccess.getSimpleStrategyRule() ||
				   context == grammarAccess.getStrategyRule()) {
					sequence_SimpleStrategy(context, (SimpleStrategy) semanticObject); 
					return; 
				}
				else break;
			case TsPackage.TRANSITION_SYSTEM:
				if(context == grammarAccess.getTransitionSystemRule()) {
					sequence_TransitionSystem(context, (TransitionSystem) semanticObject); 
					return; 
				}
				else break;
			case TsPackage.UNION:
				if(context == grammarAccess.getNonVariableStrategyRule() ||
				   context == grammarAccess.getPredefStratsRule() ||
				   context == grammarAccess.getStrategyRule() ||
				   context == grammarAccess.getUnionRule()) {
					sequence_Union(context, (Union) semanticObject); 
					return; 
				}
				else break;
			case TsPackage.VARIABLE_STRATEGY:
				if(context == grammarAccess.getStrategyRule() ||
				   context == grammarAccess.getVariableStrategyRule()) {
					sequence_VariableStrategy(context, (VariableStrategy) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID signature=Signature (equations+=Equation equations+=Equation*)? (variables+=VariableDeclaration variables+=VariableDeclaration*)?)
	 */
	protected void sequence_ADT(EObject context, ADT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     S=Strategy
	 */
	protected void sequence_All(EObject context, All semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TsPackage.Literals.ALL__S) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TsPackage.Literals.ALL__S));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAllAccess().getSStrategyParserRuleCall_2_0(), semanticObject.getS());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (formalParams+=VariableStrategy formalParams+=VariableStrategy*)? body=NonVariableStrategy)
	 */
	protected void sequence_Auxiliary(EObject context, DeclaredStrategy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (S1=Strategy S2=Strategy)
	 */
	protected void sequence_Choice(EObject context, Choice semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TsPackage.Literals.CHOICE__S1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TsPackage.Literals.CHOICE__S1));
			if(transientValues.isValueTransient(semanticObject, TsPackage.Literals.CHOICE__S2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TsPackage.Literals.CHOICE__S2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getChoiceAccess().getS1StrategyParserRuleCall_2_0(), semanticObject.getS1());
		feeder.accept(grammarAccess.getChoiceAccess().getS2StrategyParserRuleCall_4_0(), semanticObject.getS2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (declaration=[DeclaredStrategy|ID] (actualParams+=Strategy actualParams+=Strategy*)?)
	 */
	protected void sequence_DeclaredStrategyInstance(EObject context, DeclaredStrategyInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (leftHandTerm=ATerm rightHandTerm=ATerm)
	 */
	protected void sequence_Equation(EObject context, Equation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AdtPackage.Literals.EQUATION__LEFT_HAND_TERM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdtPackage.Literals.EQUATION__LEFT_HAND_TERM));
			if(transientValues.isValueTransient(semanticObject, AdtPackage.Literals.EQUATION__RIGHT_HAND_TERM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdtPackage.Literals.EQUATION__RIGHT_HAND_TERM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEquationAccess().getLeftHandTermATermParserRuleCall_0_0(), semanticObject.getLeftHandTerm());
		feeder.accept(grammarAccess.getEquationAccess().getRightHandTermATermParserRuleCall_2_0(), semanticObject.getRightHandTerm());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {Fail}
	 */
	protected void sequence_Fail(EObject context, Fail semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     S=Strategy
	 */
	protected void sequence_Fixpoint(EObject context, FixPointStrategy semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TsPackage.Literals.FIX_POINT_STRATEGY__S) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TsPackage.Literals.FIX_POINT_STRATEGY__S));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFixpointAccess().getSStrategyParserRuleCall_2_0(), semanticObject.getS());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {Identity}
	 */
	protected void sequence_Identity(EObject context, Identity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (S1=Strategy S2=Strategy S3=Strategy)
	 */
	protected void sequence_IfThenElse(EObject context, IfThenElse semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TsPackage.Literals.IF_THEN_ELSE__S1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TsPackage.Literals.IF_THEN_ELSE__S1));
			if(transientValues.isValueTransient(semanticObject, TsPackage.Literals.IF_THEN_ELSE__S2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TsPackage.Literals.IF_THEN_ELSE__S2));
			if(transientValues.isValueTransient(semanticObject, TsPackage.Literals.IF_THEN_ELSE__S3) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TsPackage.Literals.IF_THEN_ELSE__S3));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIfThenElseAccess().getS1StrategyParserRuleCall_2_0(), semanticObject.getS1());
		feeder.accept(grammarAccess.getIfThenElseAccess().getS2StrategyParserRuleCall_4_0(), semanticObject.getS2());
		feeder.accept(grammarAccess.getIfThenElseAccess().getS3StrategyParserRuleCall_6_0(), semanticObject.getS3());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (S=SimpleStrategy | S=DeclaredStrategyInstance | S=VariableStrategy)
	 */
	protected void sequence_Not(EObject context, Not semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (S=Strategy n=INT)
	 */
	protected void sequence_One(EObject context, One semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TsPackage.Literals.ONE__N) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TsPackage.Literals.ONE__N));
			if(transientValues.isValueTransient(semanticObject, TsPackage.Literals.ONE__S) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TsPackage.Literals.ONE__S));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOneAccess().getSStrategyParserRuleCall_2_0(), semanticObject.getS());
		feeder.accept(grammarAccess.getOneAccess().getNINTTerminalRuleCall_4_0(), semanticObject.getN());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (formalParameters+=[ASort|ID] formalParameters+=[ASort|ID]*)? returnType=[ASort|ID])
	 */
	protected void sequence_Operation(EObject context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (leftHandTerm=ATerm rightHandTerm=ATerm)
	 */
	protected void sequence_RewriteRule(EObject context, Equation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AdtPackage.Literals.EQUATION__LEFT_HAND_TERM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdtPackage.Literals.EQUATION__LEFT_HAND_TERM));
			if(transientValues.isValueTransient(semanticObject, AdtPackage.Literals.EQUATION__RIGHT_HAND_TERM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdtPackage.Literals.EQUATION__RIGHT_HAND_TERM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRewriteRuleAccess().getLeftHandTermATermParserRuleCall_0_0(), semanticObject.getLeftHandTerm());
		feeder.accept(grammarAccess.getRewriteRuleAccess().getRightHandTermATermParserRuleCall_2_0(), semanticObject.getRightHandTerm());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (S=Strategy n=INT)
	 */
	protected void sequence_Saturation(EObject context, Saturation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TsPackage.Literals.SATURATION__S) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TsPackage.Literals.SATURATION__S));
			if(transientValues.isValueTransient(semanticObject, TsPackage.Literals.SATURATION__N) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TsPackage.Literals.SATURATION__N));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSaturationAccess().getSStrategyParserRuleCall_2_0(), semanticObject.getS());
		feeder.accept(grammarAccess.getSaturationAccess().getNINTTerminalRuleCall_4_0(), semanticObject.getN());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (S1=Strategy S2=Strategy)
	 */
	protected void sequence_Sequence(EObject context, Sequence semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TsPackage.Literals.SEQUENCE__S1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TsPackage.Literals.SEQUENCE__S1));
			if(transientValues.isValueTransient(semanticObject, TsPackage.Literals.SEQUENCE__S2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TsPackage.Literals.SEQUENCE__S2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSequenceAccess().getS1StrategyParserRuleCall_2_0(), semanticObject.getS1());
		feeder.accept(grammarAccess.getSequenceAccess().getS2StrategyParserRuleCall_4_0(), semanticObject.getS2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (sorts+=ASort sorts+=ASort* generators+=Operation generators+=Operation* (operations+=Operation operations+=Operation*)?)
	 */
	protected void sequence_Signature(EObject context, Signature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (equations+=RewriteRule equations+=RewriteRule*)
	 */
	protected void sequence_SimpleStrategy(EObject context, SimpleStrategy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Sort(EObject context, Sort semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AdtPackage.Literals.ASORT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdtPackage.Literals.ASORT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSortAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID superSort=[ASort|ID])
	 */
	protected void sequence_SubSort(EObject context, SubSort semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AdtPackage.Literals.ASORT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdtPackage.Literals.ASORT__NAME));
			if(transientValues.isValueTransient(semanticObject, AdtPackage.Literals.SUB_SORT__SUPER_SORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdtPackage.Literals.SUB_SORT__SUPER_SORT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubSortAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSubSortAccess().getSuperSortASortIDTerminalRuleCall_2_0_1(), semanticObject.getSuperSort());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (operationSymbol=[Operation|ID] (subterms+=ATerm subterms+=ATerm*)?)
	 */
	protected void sequence_Term(EObject context, Term semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (adt=ADT initialState=Term auxiliary+=Auxiliary* transitions+=Transition*)
	 */
	protected void sequence_TransitionSystem(EObject context, TransitionSystem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID body=NonVariableStrategy)
	 */
	protected void sequence_Transition(EObject context, DeclaredStrategy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (S1=Strategy S2=Strategy)
	 */
	protected void sequence_Union(EObject context, Union semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TsPackage.Literals.UNION__S1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TsPackage.Literals.UNION__S1));
			if(transientValues.isValueTransient(semanticObject, TsPackage.Literals.UNION__S2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TsPackage.Literals.UNION__S2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUnionAccess().getS1StrategyParserRuleCall_2_0(), semanticObject.getS1());
		feeder.accept(grammarAccess.getUnionAccess().getS2StrategyParserRuleCall_4_0(), semanticObject.getS2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID sort=[ASort|ID])
	 */
	protected void sequence_VariableDeclaration(EObject context, VariableDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AdtPackage.Literals.VARIABLE_DECLARATION__SORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdtPackage.Literals.VARIABLE_DECLARATION__SORT));
			if(transientValues.isValueTransient(semanticObject, AdtPackage.Literals.VARIABLE_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AdtPackage.Literals.VARIABLE_DECLARATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariableDeclarationAccess().getSortASortIDTerminalRuleCall_2_0_1(), semanticObject.getSort());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_VariableStrategy(EObject context, VariableStrategy semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TsPackage.Literals.VARIABLE_STRATEGY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TsPackage.Literals.VARIABLE_STRATEGY__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableStrategyAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     declaration=[VariableDeclaration|TERMVAR]
	 */
	protected void sequence_Variable(EObject context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
