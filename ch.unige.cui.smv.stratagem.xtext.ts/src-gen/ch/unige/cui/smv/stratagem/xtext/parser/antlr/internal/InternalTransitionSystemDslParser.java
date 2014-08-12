package ch.unige.cui.smv.stratagem.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ch.unige.cui.smv.stratagem.xtext.services.TransitionSystemDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTransitionSystemDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_TERMVAR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TransitionSystem'", "'initialState'", "'='", "'Strategies'", "'Transitions'", "'('", "','", "')'", "'One'", "'Saturation'", "'IfThenElse'", "'{'", "'}'", "'Not'", "'Fixpoint'", "'Choice'", "'Union'", "'Sequence'", "'Identity'", "'Fail'", "'ADT'", "'Signature'", "'Axioms'", "'Variables'", "'Sorts'", "'Generators'", "'Operations'", "':'", "'->'", "'<'"
    };
    public static final int RULE_ID=4;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int RULE_TERMVAR=6;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalTransitionSystemDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTransitionSystemDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTransitionSystemDslParser.tokenNames; }
    public String getGrammarFileName() { return "../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g"; }



     	private TransitionSystemDslGrammarAccess grammarAccess;
     	
        public InternalTransitionSystemDslParser(TokenStream input, TransitionSystemDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "TransitionSystem";	
       	}
       	
       	@Override
       	protected TransitionSystemDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleTransitionSystem"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:67:1: entryRuleTransitionSystem returns [EObject current=null] : iv_ruleTransitionSystem= ruleTransitionSystem EOF ;
    public final EObject entryRuleTransitionSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionSystem = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:68:2: (iv_ruleTransitionSystem= ruleTransitionSystem EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:69:2: iv_ruleTransitionSystem= ruleTransitionSystem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionSystemRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransitionSystem_in_entryRuleTransitionSystem75);
            iv_ruleTransitionSystem=ruleTransitionSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionSystem; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransitionSystem85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransitionSystem"


    // $ANTLR start "ruleTransitionSystem"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:76:1: ruleTransitionSystem returns [EObject current=null] : (otherlv_0= 'TransitionSystem' ( (lv_adt_1_0= ruleADT ) ) otherlv_2= 'initialState' otherlv_3= '=' ( (lv_initialState_4_0= ruleTerm ) ) otherlv_5= 'Strategies' ( (lv_auxiliary_6_0= ruleAuxiliary ) )* otherlv_7= 'Transitions' ( (lv_transitions_8_0= ruleTransition ) )* ) ;
    public final EObject ruleTransitionSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_adt_1_0 = null;

        EObject lv_initialState_4_0 = null;

        EObject lv_auxiliary_6_0 = null;

        EObject lv_transitions_8_0 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:79:28: ( (otherlv_0= 'TransitionSystem' ( (lv_adt_1_0= ruleADT ) ) otherlv_2= 'initialState' otherlv_3= '=' ( (lv_initialState_4_0= ruleTerm ) ) otherlv_5= 'Strategies' ( (lv_auxiliary_6_0= ruleAuxiliary ) )* otherlv_7= 'Transitions' ( (lv_transitions_8_0= ruleTransition ) )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:80:1: (otherlv_0= 'TransitionSystem' ( (lv_adt_1_0= ruleADT ) ) otherlv_2= 'initialState' otherlv_3= '=' ( (lv_initialState_4_0= ruleTerm ) ) otherlv_5= 'Strategies' ( (lv_auxiliary_6_0= ruleAuxiliary ) )* otherlv_7= 'Transitions' ( (lv_transitions_8_0= ruleTransition ) )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:80:1: (otherlv_0= 'TransitionSystem' ( (lv_adt_1_0= ruleADT ) ) otherlv_2= 'initialState' otherlv_3= '=' ( (lv_initialState_4_0= ruleTerm ) ) otherlv_5= 'Strategies' ( (lv_auxiliary_6_0= ruleAuxiliary ) )* otherlv_7= 'Transitions' ( (lv_transitions_8_0= ruleTransition ) )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:80:3: otherlv_0= 'TransitionSystem' ( (lv_adt_1_0= ruleADT ) ) otherlv_2= 'initialState' otherlv_3= '=' ( (lv_initialState_4_0= ruleTerm ) ) otherlv_5= 'Strategies' ( (lv_auxiliary_6_0= ruleAuxiliary ) )* otherlv_7= 'Transitions' ( (lv_transitions_8_0= ruleTransition ) )*
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTransitionSystem122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTransitionSystemAccess().getTransitionSystemKeyword_0());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:84:1: ( (lv_adt_1_0= ruleADT ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:85:1: (lv_adt_1_0= ruleADT )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:85:1: (lv_adt_1_0= ruleADT )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:86:3: lv_adt_1_0= ruleADT
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionSystemAccess().getAdtADTParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleADT_in_ruleTransitionSystem143);
            lv_adt_1_0=ruleADT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTransitionSystemRule());
              	        }
                     		set(
                     			current, 
                     			"adt",
                      		lv_adt_1_0, 
                      		"ADT");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTransitionSystem155); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTransitionSystemAccess().getInitialStateKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTransitionSystem167); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTransitionSystemAccess().getEqualsSignKeyword_3());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:110:1: ( (lv_initialState_4_0= ruleTerm ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:111:1: (lv_initialState_4_0= ruleTerm )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:111:1: (lv_initialState_4_0= ruleTerm )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:112:3: lv_initialState_4_0= ruleTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionSystemAccess().getInitialStateTermParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleTransitionSystem188);
            lv_initialState_4_0=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTransitionSystemRule());
              	        }
                     		set(
                     			current, 
                     			"initialState",
                      		lv_initialState_4_0, 
                      		"Term");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTransitionSystem200); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getTransitionSystemAccess().getStrategiesKeyword_5());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:132:1: ( (lv_auxiliary_6_0= ruleAuxiliary ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:133:1: (lv_auxiliary_6_0= ruleAuxiliary )
            	    {
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:133:1: (lv_auxiliary_6_0= ruleAuxiliary )
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:134:3: lv_auxiliary_6_0= ruleAuxiliary
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTransitionSystemAccess().getAuxiliaryAuxiliaryParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAuxiliary_in_ruleTransitionSystem221);
            	    lv_auxiliary_6_0=ruleAuxiliary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTransitionSystemRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"auxiliary",
            	              		lv_auxiliary_6_0, 
            	              		"Auxiliary");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTransitionSystem234); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getTransitionSystemAccess().getTransitionsKeyword_7());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:154:1: ( (lv_transitions_8_0= ruleTransition ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:155:1: (lv_transitions_8_0= ruleTransition )
            	    {
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:155:1: (lv_transitions_8_0= ruleTransition )
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:156:3: lv_transitions_8_0= ruleTransition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTransitionSystemAccess().getTransitionsTransitionParserRuleCall_8_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleTransitionSystem255);
            	    lv_transitions_8_0=ruleTransition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTransitionSystemRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"transitions",
            	              		lv_transitions_8_0, 
            	              		"Transition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransitionSystem"


    // $ANTLR start "entryRuleTransition"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:180:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:181:2: (iv_ruleTransition= ruleTransition EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:182:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_entryRuleTransition292);
            iv_ruleTransition=ruleTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransition302); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:189:1: ruleTransition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_body_2_0= ruleNonVariableStrategy ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_body_2_0 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:192:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_body_2_0= ruleNonVariableStrategy ) ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:193:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_body_2_0= ruleNonVariableStrategy ) ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:193:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_body_2_0= ruleNonVariableStrategy ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:193:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_body_2_0= ruleNonVariableStrategy ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:193:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:194:1: (lv_name_0_0= RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:194:1: (lv_name_0_0= RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:195:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTransition344); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTransitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTransition361); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getEqualsSignKeyword_1());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:215:1: ( (lv_body_2_0= ruleNonVariableStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:216:1: (lv_body_2_0= ruleNonVariableStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:216:1: (lv_body_2_0= ruleNonVariableStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:217:3: lv_body_2_0= ruleNonVariableStrategy
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionAccess().getBodyNonVariableStrategyParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNonVariableStrategy_in_ruleTransition382);
            lv_body_2_0=ruleNonVariableStrategy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTransitionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"NonVariableStrategy");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleAuxiliary"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:241:1: entryRuleAuxiliary returns [EObject current=null] : iv_ruleAuxiliary= ruleAuxiliary EOF ;
    public final EObject entryRuleAuxiliary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuxiliary = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:242:2: (iv_ruleAuxiliary= ruleAuxiliary EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:243:2: iv_ruleAuxiliary= ruleAuxiliary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAuxiliaryRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAuxiliary_in_entryRuleAuxiliary418);
            iv_ruleAuxiliary=ruleAuxiliary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAuxiliary; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAuxiliary428); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAuxiliary"


    // $ANTLR start "ruleAuxiliary"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:250:1: ruleAuxiliary returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_formalParams_2_0= ruleVariableStrategy ) ) (otherlv_3= ',' ( (lv_formalParams_4_0= ruleVariableStrategy ) ) )* otherlv_5= ')' )? otherlv_6= '=' ( (lv_body_7_0= ruleNonVariableStrategy ) ) ) ;
    public final EObject ruleAuxiliary() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_formalParams_2_0 = null;

        EObject lv_formalParams_4_0 = null;

        EObject lv_body_7_0 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:253:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_formalParams_2_0= ruleVariableStrategy ) ) (otherlv_3= ',' ( (lv_formalParams_4_0= ruleVariableStrategy ) ) )* otherlv_5= ')' )? otherlv_6= '=' ( (lv_body_7_0= ruleNonVariableStrategy ) ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:254:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_formalParams_2_0= ruleVariableStrategy ) ) (otherlv_3= ',' ( (lv_formalParams_4_0= ruleVariableStrategy ) ) )* otherlv_5= ')' )? otherlv_6= '=' ( (lv_body_7_0= ruleNonVariableStrategy ) ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:254:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_formalParams_2_0= ruleVariableStrategy ) ) (otherlv_3= ',' ( (lv_formalParams_4_0= ruleVariableStrategy ) ) )* otherlv_5= ')' )? otherlv_6= '=' ( (lv_body_7_0= ruleNonVariableStrategy ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:254:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_formalParams_2_0= ruleVariableStrategy ) ) (otherlv_3= ',' ( (lv_formalParams_4_0= ruleVariableStrategy ) ) )* otherlv_5= ')' )? otherlv_6= '=' ( (lv_body_7_0= ruleNonVariableStrategy ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:254:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:255:1: (lv_name_0_0= RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:255:1: (lv_name_0_0= RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:256:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAuxiliary470); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getAuxiliaryAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAuxiliaryRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:272:2: (otherlv_1= '(' ( (lv_formalParams_2_0= ruleVariableStrategy ) ) (otherlv_3= ',' ( (lv_formalParams_4_0= ruleVariableStrategy ) ) )* otherlv_5= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:272:4: otherlv_1= '(' ( (lv_formalParams_2_0= ruleVariableStrategy ) ) (otherlv_3= ',' ( (lv_formalParams_4_0= ruleVariableStrategy ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAuxiliary488); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAuxiliaryAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:276:1: ( (lv_formalParams_2_0= ruleVariableStrategy ) )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:277:1: (lv_formalParams_2_0= ruleVariableStrategy )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:277:1: (lv_formalParams_2_0= ruleVariableStrategy )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:278:3: lv_formalParams_2_0= ruleVariableStrategy
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAuxiliaryAccess().getFormalParamsVariableStrategyParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariableStrategy_in_ruleAuxiliary509);
                    lv_formalParams_2_0=ruleVariableStrategy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAuxiliaryRule());
                      	        }
                             		add(
                             			current, 
                             			"formalParams",
                              		lv_formalParams_2_0, 
                              		"VariableStrategy");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:294:2: (otherlv_3= ',' ( (lv_formalParams_4_0= ruleVariableStrategy ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==18) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:294:4: otherlv_3= ',' ( (lv_formalParams_4_0= ruleVariableStrategy ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAuxiliary522); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getAuxiliaryAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:298:1: ( (lv_formalParams_4_0= ruleVariableStrategy ) )
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:299:1: (lv_formalParams_4_0= ruleVariableStrategy )
                    	    {
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:299:1: (lv_formalParams_4_0= ruleVariableStrategy )
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:300:3: lv_formalParams_4_0= ruleVariableStrategy
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAuxiliaryAccess().getFormalParamsVariableStrategyParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleVariableStrategy_in_ruleAuxiliary543);
                    	    lv_formalParams_4_0=ruleVariableStrategy();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAuxiliaryRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"formalParams",
                    	              		lv_formalParams_4_0, 
                    	              		"VariableStrategy");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAuxiliary557); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAuxiliaryAccess().getRightParenthesisKeyword_1_3());
                          
                    }

                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAuxiliary571); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getAuxiliaryAccess().getEqualsSignKeyword_2());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:324:1: ( (lv_body_7_0= ruleNonVariableStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:325:1: (lv_body_7_0= ruleNonVariableStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:325:1: (lv_body_7_0= ruleNonVariableStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:326:3: lv_body_7_0= ruleNonVariableStrategy
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAuxiliaryAccess().getBodyNonVariableStrategyParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNonVariableStrategy_in_ruleAuxiliary592);
            lv_body_7_0=ruleNonVariableStrategy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAuxiliaryRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_7_0, 
                      		"NonVariableStrategy");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAuxiliary"


    // $ANTLR start "entryRuleStrategy"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:350:1: entryRuleStrategy returns [EObject current=null] : iv_ruleStrategy= ruleStrategy EOF ;
    public final EObject entryRuleStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategy = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:351:2: (iv_ruleStrategy= ruleStrategy EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:352:2: iv_ruleStrategy= ruleStrategy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStrategyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_entryRuleStrategy628);
            iv_ruleStrategy=ruleStrategy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStrategy; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStrategy638); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStrategy"


    // $ANTLR start "ruleStrategy"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:359:1: ruleStrategy returns [EObject current=null] : (this_NonVariableStrategy_0= ruleNonVariableStrategy | this_VariableStrategy_1= ruleVariableStrategy ) ;
    public final EObject ruleStrategy() throws RecognitionException {
        EObject current = null;

        EObject this_NonVariableStrategy_0 = null;

        EObject this_VariableStrategy_1 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:362:28: ( (this_NonVariableStrategy_0= ruleNonVariableStrategy | this_VariableStrategy_1= ruleVariableStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:363:1: (this_NonVariableStrategy_0= ruleNonVariableStrategy | this_VariableStrategy_1= ruleVariableStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:363:1: (this_NonVariableStrategy_0= ruleNonVariableStrategy | this_VariableStrategy_1= ruleVariableStrategy )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=20 && LA5_0<=23)||(LA5_0>=25 && LA5_0<=31)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==17) ) {
                    alt5=1;
                }
                else if ( (LA5_2==EOF||(LA5_2>=18 && LA5_2<=19)) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:364:5: this_NonVariableStrategy_0= ruleNonVariableStrategy
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStrategyAccess().getNonVariableStrategyParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNonVariableStrategy_in_ruleStrategy685);
                    this_NonVariableStrategy_0=ruleNonVariableStrategy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NonVariableStrategy_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:374:5: this_VariableStrategy_1= ruleVariableStrategy
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStrategyAccess().getVariableStrategyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariableStrategy_in_ruleStrategy712);
                    this_VariableStrategy_1=ruleVariableStrategy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableStrategy_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStrategy"


    // $ANTLR start "entryRuleNonVariableStrategy"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:390:1: entryRuleNonVariableStrategy returns [EObject current=null] : iv_ruleNonVariableStrategy= ruleNonVariableStrategy EOF ;
    public final EObject entryRuleNonVariableStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonVariableStrategy = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:391:2: (iv_ruleNonVariableStrategy= ruleNonVariableStrategy EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:392:2: iv_ruleNonVariableStrategy= ruleNonVariableStrategy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNonVariableStrategyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNonVariableStrategy_in_entryRuleNonVariableStrategy747);
            iv_ruleNonVariableStrategy=ruleNonVariableStrategy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNonVariableStrategy; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNonVariableStrategy757); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonVariableStrategy"


    // $ANTLR start "ruleNonVariableStrategy"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:399:1: ruleNonVariableStrategy returns [EObject current=null] : ( ( ( rulePredefStrats )=>this_PredefStrats_0= rulePredefStrats ) | this_DeclaredStrategyInstance_1= ruleDeclaredStrategyInstance ) ;
    public final EObject ruleNonVariableStrategy() throws RecognitionException {
        EObject current = null;

        EObject this_PredefStrats_0 = null;

        EObject this_DeclaredStrategyInstance_1 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:402:28: ( ( ( ( rulePredefStrats )=>this_PredefStrats_0= rulePredefStrats ) | this_DeclaredStrategyInstance_1= ruleDeclaredStrategyInstance ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:403:1: ( ( ( rulePredefStrats )=>this_PredefStrats_0= rulePredefStrats ) | this_DeclaredStrategyInstance_1= ruleDeclaredStrategyInstance )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:403:1: ( ( ( rulePredefStrats )=>this_PredefStrats_0= rulePredefStrats ) | this_DeclaredStrategyInstance_1= ruleDeclaredStrategyInstance )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:403:2: ( ( rulePredefStrats )=>this_PredefStrats_0= rulePredefStrats )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:403:2: ( ( rulePredefStrats )=>this_PredefStrats_0= rulePredefStrats )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:403:3: ( rulePredefStrats )=>this_PredefStrats_0= rulePredefStrats
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNonVariableStrategyAccess().getPredefStratsParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePredefStrats_in_ruleNonVariableStrategy810);
                    this_PredefStrats_0=rulePredefStrats();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PredefStrats_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:414:5: this_DeclaredStrategyInstance_1= ruleDeclaredStrategyInstance
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNonVariableStrategyAccess().getDeclaredStrategyInstanceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaredStrategyInstance_in_ruleNonVariableStrategy838);
                    this_DeclaredStrategyInstance_1=ruleDeclaredStrategyInstance();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DeclaredStrategyInstance_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNonVariableStrategy"


    // $ANTLR start "entryRulePredefStrats"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:430:1: entryRulePredefStrats returns [EObject current=null] : iv_rulePredefStrats= rulePredefStrats EOF ;
    public final EObject entryRulePredefStrats() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredefStrats = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:431:2: (iv_rulePredefStrats= rulePredefStrats EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:432:2: iv_rulePredefStrats= rulePredefStrats EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPredefStratsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePredefStrats_in_entryRulePredefStrats873);
            iv_rulePredefStrats=rulePredefStrats();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePredefStrats; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePredefStrats883); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredefStrats"


    // $ANTLR start "rulePredefStrats"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:439:1: rulePredefStrats returns [EObject current=null] : (this_Identity_0= ruleIdentity | this_Fail_1= ruleFail | this_Choice_2= ruleChoice | this_Sequence_3= ruleSequence | this_Fixpoint_4= ruleFixpoint | this_IfThenElse_5= ruleIfThenElse | this_Not_6= ruleNot | this_SimpleStrategy_7= ruleSimpleStrategy | this_One_8= ruleOne | this_Saturation_9= ruleSaturation | this_Union_10= ruleUnion ) ;
    public final EObject rulePredefStrats() throws RecognitionException {
        EObject current = null;

        EObject this_Identity_0 = null;

        EObject this_Fail_1 = null;

        EObject this_Choice_2 = null;

        EObject this_Sequence_3 = null;

        EObject this_Fixpoint_4 = null;

        EObject this_IfThenElse_5 = null;

        EObject this_Not_6 = null;

        EObject this_SimpleStrategy_7 = null;

        EObject this_One_8 = null;

        EObject this_Saturation_9 = null;

        EObject this_Union_10 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:442:28: ( (this_Identity_0= ruleIdentity | this_Fail_1= ruleFail | this_Choice_2= ruleChoice | this_Sequence_3= ruleSequence | this_Fixpoint_4= ruleFixpoint | this_IfThenElse_5= ruleIfThenElse | this_Not_6= ruleNot | this_SimpleStrategy_7= ruleSimpleStrategy | this_One_8= ruleOne | this_Saturation_9= ruleSaturation | this_Union_10= ruleUnion ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:443:1: (this_Identity_0= ruleIdentity | this_Fail_1= ruleFail | this_Choice_2= ruleChoice | this_Sequence_3= ruleSequence | this_Fixpoint_4= ruleFixpoint | this_IfThenElse_5= ruleIfThenElse | this_Not_6= ruleNot | this_SimpleStrategy_7= ruleSimpleStrategy | this_One_8= ruleOne | this_Saturation_9= ruleSaturation | this_Union_10= ruleUnion )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:443:1: (this_Identity_0= ruleIdentity | this_Fail_1= ruleFail | this_Choice_2= ruleChoice | this_Sequence_3= ruleSequence | this_Fixpoint_4= ruleFixpoint | this_IfThenElse_5= ruleIfThenElse | this_Not_6= ruleNot | this_SimpleStrategy_7= ruleSimpleStrategy | this_One_8= ruleOne | this_Saturation_9= ruleSaturation | this_Union_10= ruleUnion )
            int alt7=11;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt7=1;
                }
                break;
            case 31:
                {
                alt7=2;
                }
                break;
            case 27:
                {
                alt7=3;
                }
                break;
            case 29:
                {
                alt7=4;
                }
                break;
            case 26:
                {
                alt7=5;
                }
                break;
            case 22:
                {
                alt7=6;
                }
                break;
            case 25:
                {
                alt7=7;
                }
                break;
            case 23:
                {
                alt7=8;
                }
                break;
            case 20:
                {
                alt7=9;
                }
                break;
            case 21:
                {
                alt7=10;
                }
                break;
            case 28:
                {
                alt7=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:444:5: this_Identity_0= ruleIdentity
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPredefStratsAccess().getIdentityParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIdentity_in_rulePredefStrats930);
                    this_Identity_0=ruleIdentity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Identity_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:454:5: this_Fail_1= ruleFail
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPredefStratsAccess().getFailParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFail_in_rulePredefStrats957);
                    this_Fail_1=ruleFail();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Fail_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:464:5: this_Choice_2= ruleChoice
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPredefStratsAccess().getChoiceParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleChoice_in_rulePredefStrats984);
                    this_Choice_2=ruleChoice();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Choice_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:474:5: this_Sequence_3= ruleSequence
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPredefStratsAccess().getSequenceParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSequence_in_rulePredefStrats1011);
                    this_Sequence_3=ruleSequence();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Sequence_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:484:5: this_Fixpoint_4= ruleFixpoint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPredefStratsAccess().getFixpointParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFixpoint_in_rulePredefStrats1038);
                    this_Fixpoint_4=ruleFixpoint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Fixpoint_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:494:5: this_IfThenElse_5= ruleIfThenElse
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPredefStratsAccess().getIfThenElseParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIfThenElse_in_rulePredefStrats1065);
                    this_IfThenElse_5=ruleIfThenElse();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IfThenElse_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:504:5: this_Not_6= ruleNot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPredefStratsAccess().getNotParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNot_in_rulePredefStrats1092);
                    this_Not_6=ruleNot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Not_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:514:5: this_SimpleStrategy_7= ruleSimpleStrategy
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPredefStratsAccess().getSimpleStrategyParserRuleCall_7()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleStrategy_in_rulePredefStrats1119);
                    this_SimpleStrategy_7=ruleSimpleStrategy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SimpleStrategy_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:524:5: this_One_8= ruleOne
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPredefStratsAccess().getOneParserRuleCall_8()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleOne_in_rulePredefStrats1146);
                    this_One_8=ruleOne();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_One_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:534:5: this_Saturation_9= ruleSaturation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPredefStratsAccess().getSaturationParserRuleCall_9()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSaturation_in_rulePredefStrats1173);
                    this_Saturation_9=ruleSaturation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Saturation_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:544:5: this_Union_10= ruleUnion
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPredefStratsAccess().getUnionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnion_in_rulePredefStrats1200);
                    this_Union_10=ruleUnion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Union_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredefStrats"


    // $ANTLR start "entryRuleOne"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:560:1: entryRuleOne returns [EObject current=null] : iv_ruleOne= ruleOne EOF ;
    public final EObject entryRuleOne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOne = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:561:2: (iv_ruleOne= ruleOne EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:562:2: iv_ruleOne= ruleOne EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOneRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOne_in_entryRuleOne1235);
            iv_ruleOne=ruleOne();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOne; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOne1245); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOne"


    // $ANTLR start "ruleOne"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:569:1: ruleOne returns [EObject current=null] : (otherlv_0= 'One' otherlv_1= '(' ( (lv_S_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_n_4_0= RULE_INT ) ) otherlv_5= ')' ) ;
    public final EObject ruleOne() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_n_4_0=null;
        Token otherlv_5=null;
        EObject lv_S_2_0 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:572:28: ( (otherlv_0= 'One' otherlv_1= '(' ( (lv_S_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_n_4_0= RULE_INT ) ) otherlv_5= ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:573:1: (otherlv_0= 'One' otherlv_1= '(' ( (lv_S_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_n_4_0= RULE_INT ) ) otherlv_5= ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:573:1: (otherlv_0= 'One' otherlv_1= '(' ( (lv_S_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_n_4_0= RULE_INT ) ) otherlv_5= ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:573:3: otherlv_0= 'One' otherlv_1= '(' ( (lv_S_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_n_4_0= RULE_INT ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleOne1282); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOneAccess().getOneKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleOne1294); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOneAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:581:1: ( (lv_S_2_0= ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:582:1: (lv_S_2_0= ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:582:1: (lv_S_2_0= ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:583:3: lv_S_2_0= ruleStrategy
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOneAccess().getSStrategyParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleOne1315);
            lv_S_2_0=ruleStrategy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOneRule());
              	        }
                     		set(
                     			current, 
                     			"S",
                      		lv_S_2_0, 
                      		"Strategy");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOne1327); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getOneAccess().getCommaKeyword_3());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:603:1: ( (lv_n_4_0= RULE_INT ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:604:1: (lv_n_4_0= RULE_INT )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:604:1: (lv_n_4_0= RULE_INT )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:605:3: lv_n_4_0= RULE_INT
            {
            lv_n_4_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleOne1344); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_n_4_0, grammarAccess.getOneAccess().getNINTTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOneRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"n",
                      		lv_n_4_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleOne1361); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getOneAccess().getRightParenthesisKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOne"


    // $ANTLR start "entryRuleDeclaredStrategyInstance"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:633:1: entryRuleDeclaredStrategyInstance returns [EObject current=null] : iv_ruleDeclaredStrategyInstance= ruleDeclaredStrategyInstance EOF ;
    public final EObject entryRuleDeclaredStrategyInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredStrategyInstance = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:634:2: (iv_ruleDeclaredStrategyInstance= ruleDeclaredStrategyInstance EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:635:2: iv_ruleDeclaredStrategyInstance= ruleDeclaredStrategyInstance EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaredStrategyInstanceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclaredStrategyInstance_in_entryRuleDeclaredStrategyInstance1397);
            iv_ruleDeclaredStrategyInstance=ruleDeclaredStrategyInstance();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaredStrategyInstance; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaredStrategyInstance1407); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaredStrategyInstance"


    // $ANTLR start "ruleDeclaredStrategyInstance"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:642:1: ruleDeclaredStrategyInstance returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_actualParams_3_0= ruleStrategy ) ) (otherlv_4= ',' ( (lv_actualParams_5_0= ruleStrategy ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleDeclaredStrategyInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_actualParams_3_0 = null;

        EObject lv_actualParams_5_0 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:645:28: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_actualParams_3_0= ruleStrategy ) ) (otherlv_4= ',' ( (lv_actualParams_5_0= ruleStrategy ) ) )* )? otherlv_6= ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:646:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_actualParams_3_0= ruleStrategy ) ) (otherlv_4= ',' ( (lv_actualParams_5_0= ruleStrategy ) ) )* )? otherlv_6= ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:646:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_actualParams_3_0= ruleStrategy ) ) (otherlv_4= ',' ( (lv_actualParams_5_0= ruleStrategy ) ) )* )? otherlv_6= ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:646:2: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_actualParams_3_0= ruleStrategy ) ) (otherlv_4= ',' ( (lv_actualParams_5_0= ruleStrategy ) ) )* )? otherlv_6= ')'
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:646:2: ()
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:647:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDeclaredStrategyInstanceAccess().getDeclaredStrategyInstanceAction_0(),
                          current);
                  
            }

            }

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:652:2: ( (otherlv_1= RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:653:1: (otherlv_1= RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:653:1: (otherlv_1= RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:654:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDeclaredStrategyInstanceRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDeclaredStrategyInstance1461); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getDeclaredStrategyInstanceAccess().getDeclarationDeclaredStrategyCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDeclaredStrategyInstance1473); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDeclaredStrategyInstanceAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:669:1: ( ( (lv_actualParams_3_0= ruleStrategy ) ) (otherlv_4= ',' ( (lv_actualParams_5_0= ruleStrategy ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||(LA9_0>=20 && LA9_0<=23)||(LA9_0>=25 && LA9_0<=31)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:669:2: ( (lv_actualParams_3_0= ruleStrategy ) ) (otherlv_4= ',' ( (lv_actualParams_5_0= ruleStrategy ) ) )*
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:669:2: ( (lv_actualParams_3_0= ruleStrategy ) )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:670:1: (lv_actualParams_3_0= ruleStrategy )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:670:1: (lv_actualParams_3_0= ruleStrategy )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:671:3: lv_actualParams_3_0= ruleStrategy
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeclaredStrategyInstanceAccess().getActualParamsStrategyParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleDeclaredStrategyInstance1495);
                    lv_actualParams_3_0=ruleStrategy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDeclaredStrategyInstanceRule());
                      	        }
                             		add(
                             			current, 
                             			"actualParams",
                              		lv_actualParams_3_0, 
                              		"Strategy");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:687:2: (otherlv_4= ',' ( (lv_actualParams_5_0= ruleStrategy ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==18) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:687:4: otherlv_4= ',' ( (lv_actualParams_5_0= ruleStrategy ) )
                    	    {
                    	    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDeclaredStrategyInstance1508); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getDeclaredStrategyInstanceAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:691:1: ( (lv_actualParams_5_0= ruleStrategy ) )
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:692:1: (lv_actualParams_5_0= ruleStrategy )
                    	    {
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:692:1: (lv_actualParams_5_0= ruleStrategy )
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:693:3: lv_actualParams_5_0= ruleStrategy
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDeclaredStrategyInstanceAccess().getActualParamsStrategyParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleDeclaredStrategyInstance1529);
                    	    lv_actualParams_5_0=ruleStrategy();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDeclaredStrategyInstanceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"actualParams",
                    	              		lv_actualParams_5_0, 
                    	              		"Strategy");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDeclaredStrategyInstance1545); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getDeclaredStrategyInstanceAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaredStrategyInstance"


    // $ANTLR start "entryRuleSaturation"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:721:1: entryRuleSaturation returns [EObject current=null] : iv_ruleSaturation= ruleSaturation EOF ;
    public final EObject entryRuleSaturation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSaturation = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:722:2: (iv_ruleSaturation= ruleSaturation EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:723:2: iv_ruleSaturation= ruleSaturation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSaturationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSaturation_in_entryRuleSaturation1581);
            iv_ruleSaturation=ruleSaturation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSaturation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSaturation1591); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSaturation"


    // $ANTLR start "ruleSaturation"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:730:1: ruleSaturation returns [EObject current=null] : (otherlv_0= 'Saturation' otherlv_1= '(' ( (lv_S_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_n_4_0= RULE_INT ) ) otherlv_5= ')' ) ;
    public final EObject ruleSaturation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_n_4_0=null;
        Token otherlv_5=null;
        EObject lv_S_2_0 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:733:28: ( (otherlv_0= 'Saturation' otherlv_1= '(' ( (lv_S_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_n_4_0= RULE_INT ) ) otherlv_5= ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:734:1: (otherlv_0= 'Saturation' otherlv_1= '(' ( (lv_S_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_n_4_0= RULE_INT ) ) otherlv_5= ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:734:1: (otherlv_0= 'Saturation' otherlv_1= '(' ( (lv_S_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_n_4_0= RULE_INT ) ) otherlv_5= ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:734:3: otherlv_0= 'Saturation' otherlv_1= '(' ( (lv_S_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_n_4_0= RULE_INT ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleSaturation1628); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSaturationAccess().getSaturationKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSaturation1640); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSaturationAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:742:1: ( (lv_S_2_0= ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:743:1: (lv_S_2_0= ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:743:1: (lv_S_2_0= ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:744:3: lv_S_2_0= ruleStrategy
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSaturationAccess().getSStrategyParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleSaturation1661);
            lv_S_2_0=ruleStrategy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSaturationRule());
              	        }
                     		set(
                     			current, 
                     			"S",
                      		lv_S_2_0, 
                      		"Strategy");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSaturation1673); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSaturationAccess().getCommaKeyword_3());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:764:1: ( (lv_n_4_0= RULE_INT ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:765:1: (lv_n_4_0= RULE_INT )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:765:1: (lv_n_4_0= RULE_INT )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:766:3: lv_n_4_0= RULE_INT
            {
            lv_n_4_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleSaturation1690); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_n_4_0, grammarAccess.getSaturationAccess().getNINTTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSaturationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"n",
                      		lv_n_4_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSaturation1707); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSaturationAccess().getRightParenthesisKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSaturation"


    // $ANTLR start "entryRuleIfThenElse"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:794:1: entryRuleIfThenElse returns [EObject current=null] : iv_ruleIfThenElse= ruleIfThenElse EOF ;
    public final EObject entryRuleIfThenElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfThenElse = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:795:2: (iv_ruleIfThenElse= ruleIfThenElse EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:796:2: iv_ruleIfThenElse= ruleIfThenElse EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfThenElseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIfThenElse_in_entryRuleIfThenElse1743);
            iv_ruleIfThenElse=ruleIfThenElse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfThenElse; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIfThenElse1753); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfThenElse"


    // $ANTLR start "ruleIfThenElse"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:803:1: ruleIfThenElse returns [EObject current=null] : (otherlv_0= 'IfThenElse' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ',' ( (lv_S3_6_0= ruleStrategy ) ) otherlv_7= ')' ) ;
    public final EObject ruleIfThenElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_S1_2_0 = null;

        EObject lv_S2_4_0 = null;

        EObject lv_S3_6_0 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:806:28: ( (otherlv_0= 'IfThenElse' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ',' ( (lv_S3_6_0= ruleStrategy ) ) otherlv_7= ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:807:1: (otherlv_0= 'IfThenElse' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ',' ( (lv_S3_6_0= ruleStrategy ) ) otherlv_7= ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:807:1: (otherlv_0= 'IfThenElse' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ',' ( (lv_S3_6_0= ruleStrategy ) ) otherlv_7= ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:807:3: otherlv_0= 'IfThenElse' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ',' ( (lv_S3_6_0= ruleStrategy ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleIfThenElse1790); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfThenElseAccess().getIfThenElseKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleIfThenElse1802); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIfThenElseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:815:1: ( (lv_S1_2_0= ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:816:1: (lv_S1_2_0= ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:816:1: (lv_S1_2_0= ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:817:3: lv_S1_2_0= ruleStrategy
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfThenElseAccess().getS1StrategyParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleIfThenElse1823);
            lv_S1_2_0=ruleStrategy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfThenElseRule());
              	        }
                     		set(
                     			current, 
                     			"S1",
                      		lv_S1_2_0, 
                      		"Strategy");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleIfThenElse1835); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIfThenElseAccess().getCommaKeyword_3());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:837:1: ( (lv_S2_4_0= ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:838:1: (lv_S2_4_0= ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:838:1: (lv_S2_4_0= ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:839:3: lv_S2_4_0= ruleStrategy
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfThenElseAccess().getS2StrategyParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleIfThenElse1856);
            lv_S2_4_0=ruleStrategy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfThenElseRule());
              	        }
                     		set(
                     			current, 
                     			"S2",
                      		lv_S2_4_0, 
                      		"Strategy");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleIfThenElse1868); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getIfThenElseAccess().getCommaKeyword_5());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:859:1: ( (lv_S3_6_0= ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:860:1: (lv_S3_6_0= ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:860:1: (lv_S3_6_0= ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:861:3: lv_S3_6_0= ruleStrategy
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfThenElseAccess().getS3StrategyParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleIfThenElse1889);
            lv_S3_6_0=ruleStrategy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfThenElseRule());
              	        }
                     		set(
                     			current, 
                     			"S3",
                      		lv_S3_6_0, 
                      		"Strategy");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleIfThenElse1901); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getIfThenElseAccess().getRightParenthesisKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfThenElse"


    // $ANTLR start "entryRuleSimpleStrategy"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:889:1: entryRuleSimpleStrategy returns [EObject current=null] : iv_ruleSimpleStrategy= ruleSimpleStrategy EOF ;
    public final EObject entryRuleSimpleStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleStrategy = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:890:2: (iv_ruleSimpleStrategy= ruleSimpleStrategy EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:891:2: iv_ruleSimpleStrategy= ruleSimpleStrategy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleStrategyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSimpleStrategy_in_entryRuleSimpleStrategy1937);
            iv_ruleSimpleStrategy=ruleSimpleStrategy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleStrategy; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleStrategy1947); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleStrategy"


    // $ANTLR start "ruleSimpleStrategy"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:898:1: ruleSimpleStrategy returns [EObject current=null] : (otherlv_0= '{' ( (lv_equations_1_0= ruleRewriteRule ) ) (otherlv_2= ',' ( (lv_equations_3_0= ruleRewriteRule ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleSimpleStrategy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_equations_1_0 = null;

        EObject lv_equations_3_0 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:901:28: ( (otherlv_0= '{' ( (lv_equations_1_0= ruleRewriteRule ) ) (otherlv_2= ',' ( (lv_equations_3_0= ruleRewriteRule ) ) )* otherlv_4= '}' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:902:1: (otherlv_0= '{' ( (lv_equations_1_0= ruleRewriteRule ) ) (otherlv_2= ',' ( (lv_equations_3_0= ruleRewriteRule ) ) )* otherlv_4= '}' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:902:1: (otherlv_0= '{' ( (lv_equations_1_0= ruleRewriteRule ) ) (otherlv_2= ',' ( (lv_equations_3_0= ruleRewriteRule ) ) )* otherlv_4= '}' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:902:3: otherlv_0= '{' ( (lv_equations_1_0= ruleRewriteRule ) ) (otherlv_2= ',' ( (lv_equations_3_0= ruleRewriteRule ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSimpleStrategy1984); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSimpleStrategyAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:906:1: ( (lv_equations_1_0= ruleRewriteRule ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:907:1: (lv_equations_1_0= ruleRewriteRule )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:907:1: (lv_equations_1_0= ruleRewriteRule )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:908:3: lv_equations_1_0= ruleRewriteRule
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSimpleStrategyAccess().getEquationsRewriteRuleParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleRewriteRule_in_ruleSimpleStrategy2005);
            lv_equations_1_0=ruleRewriteRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSimpleStrategyRule());
              	        }
                     		add(
                     			current, 
                     			"equations",
                      		lv_equations_1_0, 
                      		"RewriteRule");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:924:2: (otherlv_2= ',' ( (lv_equations_3_0= ruleRewriteRule ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:924:4: otherlv_2= ',' ( (lv_equations_3_0= ruleRewriteRule ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSimpleStrategy2018); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSimpleStrategyAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:928:1: ( (lv_equations_3_0= ruleRewriteRule ) )
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:929:1: (lv_equations_3_0= ruleRewriteRule )
            	    {
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:929:1: (lv_equations_3_0= ruleRewriteRule )
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:930:3: lv_equations_3_0= ruleRewriteRule
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSimpleStrategyAccess().getEquationsRewriteRuleParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleRewriteRule_in_ruleSimpleStrategy2039);
            	    lv_equations_3_0=ruleRewriteRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSimpleStrategyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"equations",
            	              		lv_equations_3_0, 
            	              		"RewriteRule");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSimpleStrategy2053); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSimpleStrategyAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleStrategy"


    // $ANTLR start "entryRuleNot"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:958:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:959:2: (iv_ruleNot= ruleNot EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:960:2: iv_ruleNot= ruleNot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNot_in_entryRuleNot2089);
            iv_ruleNot=ruleNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNot; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNot2099); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:967:1: ruleNot returns [EObject current=null] : (otherlv_0= 'Not' otherlv_1= '(' ( ( (lv_S_2_1= ruleSimpleStrategy | lv_S_2_2= ruleDeclaredStrategyInstance | lv_S_2_3= ruleVariableStrategy ) ) ) otherlv_3= ')' ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_S_2_1 = null;

        EObject lv_S_2_2 = null;

        EObject lv_S_2_3 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:970:28: ( (otherlv_0= 'Not' otherlv_1= '(' ( ( (lv_S_2_1= ruleSimpleStrategy | lv_S_2_2= ruleDeclaredStrategyInstance | lv_S_2_3= ruleVariableStrategy ) ) ) otherlv_3= ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:971:1: (otherlv_0= 'Not' otherlv_1= '(' ( ( (lv_S_2_1= ruleSimpleStrategy | lv_S_2_2= ruleDeclaredStrategyInstance | lv_S_2_3= ruleVariableStrategy ) ) ) otherlv_3= ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:971:1: (otherlv_0= 'Not' otherlv_1= '(' ( ( (lv_S_2_1= ruleSimpleStrategy | lv_S_2_2= ruleDeclaredStrategyInstance | lv_S_2_3= ruleVariableStrategy ) ) ) otherlv_3= ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:971:3: otherlv_0= 'Not' otherlv_1= '(' ( ( (lv_S_2_1= ruleSimpleStrategy | lv_S_2_2= ruleDeclaredStrategyInstance | lv_S_2_3= ruleVariableStrategy ) ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleNot2136); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNotAccess().getNotKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleNot2148); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNotAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:979:1: ( ( (lv_S_2_1= ruleSimpleStrategy | lv_S_2_2= ruleDeclaredStrategyInstance | lv_S_2_3= ruleVariableStrategy ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:980:1: ( (lv_S_2_1= ruleSimpleStrategy | lv_S_2_2= ruleDeclaredStrategyInstance | lv_S_2_3= ruleVariableStrategy ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:980:1: ( (lv_S_2_1= ruleSimpleStrategy | lv_S_2_2= ruleDeclaredStrategyInstance | lv_S_2_3= ruleVariableStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:981:1: (lv_S_2_1= ruleSimpleStrategy | lv_S_2_2= ruleDeclaredStrategyInstance | lv_S_2_3= ruleVariableStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:981:1: (lv_S_2_1= ruleSimpleStrategy | lv_S_2_2= ruleDeclaredStrategyInstance | lv_S_2_3= ruleVariableStrategy )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==19) ) {
                    alt11=3;
                }
                else if ( (LA11_2==17) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:982:3: lv_S_2_1= ruleSimpleStrategy
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotAccess().getSSimpleStrategyParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleStrategy_in_ruleNot2171);
                    lv_S_2_1=ruleSimpleStrategy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNotRule());
                      	        }
                             		set(
                             			current, 
                             			"S",
                              		lv_S_2_1, 
                              		"SimpleStrategy");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:997:8: lv_S_2_2= ruleDeclaredStrategyInstance
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotAccess().getSDeclaredStrategyInstanceParserRuleCall_2_0_1()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaredStrategyInstance_in_ruleNot2190);
                    lv_S_2_2=ruleDeclaredStrategyInstance();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNotRule());
                      	        }
                             		set(
                             			current, 
                             			"S",
                              		lv_S_2_2, 
                              		"DeclaredStrategyInstance");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1012:8: lv_S_2_3= ruleVariableStrategy
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotAccess().getSVariableStrategyParserRuleCall_2_0_2()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariableStrategy_in_ruleNot2209);
                    lv_S_2_3=ruleVariableStrategy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNotRule());
                      	        }
                             		set(
                             			current, 
                             			"S",
                              		lv_S_2_3, 
                              		"VariableStrategy");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleNot2224); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getNotAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleFixpoint"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1042:1: entryRuleFixpoint returns [EObject current=null] : iv_ruleFixpoint= ruleFixpoint EOF ;
    public final EObject entryRuleFixpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFixpoint = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1043:2: (iv_ruleFixpoint= ruleFixpoint EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1044:2: iv_ruleFixpoint= ruleFixpoint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFixpointRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFixpoint_in_entryRuleFixpoint2260);
            iv_ruleFixpoint=ruleFixpoint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFixpoint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFixpoint2270); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFixpoint"


    // $ANTLR start "ruleFixpoint"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1051:1: ruleFixpoint returns [EObject current=null] : (otherlv_0= 'Fixpoint' otherlv_1= '(' ( (lv_S_2_0= ruleStrategy ) ) otherlv_3= ')' ) ;
    public final EObject ruleFixpoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_S_2_0 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1054:28: ( (otherlv_0= 'Fixpoint' otherlv_1= '(' ( (lv_S_2_0= ruleStrategy ) ) otherlv_3= ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1055:1: (otherlv_0= 'Fixpoint' otherlv_1= '(' ( (lv_S_2_0= ruleStrategy ) ) otherlv_3= ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1055:1: (otherlv_0= 'Fixpoint' otherlv_1= '(' ( (lv_S_2_0= ruleStrategy ) ) otherlv_3= ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1055:3: otherlv_0= 'Fixpoint' otherlv_1= '(' ( (lv_S_2_0= ruleStrategy ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleFixpoint2307); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFixpointAccess().getFixpointKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFixpoint2319); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFixpointAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1063:1: ( (lv_S_2_0= ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1064:1: (lv_S_2_0= ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1064:1: (lv_S_2_0= ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1065:3: lv_S_2_0= ruleStrategy
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFixpointAccess().getSStrategyParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleFixpoint2340);
            lv_S_2_0=ruleStrategy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFixpointRule());
              	        }
                     		set(
                     			current, 
                     			"S",
                      		lv_S_2_0, 
                      		"Strategy");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFixpoint2352); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFixpointAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFixpoint"


    // $ANTLR start "entryRuleChoice"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1093:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1094:2: (iv_ruleChoice= ruleChoice EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1095:2: iv_ruleChoice= ruleChoice EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChoiceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleChoice_in_entryRuleChoice2388);
            iv_ruleChoice=ruleChoice();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChoice; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChoice2398); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChoice"


    // $ANTLR start "ruleChoice"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1102:1: ruleChoice returns [EObject current=null] : (otherlv_0= 'Choice' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ')' ) ;
    public final EObject ruleChoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_S1_2_0 = null;

        EObject lv_S2_4_0 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1105:28: ( (otherlv_0= 'Choice' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1106:1: (otherlv_0= 'Choice' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1106:1: (otherlv_0= 'Choice' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1106:3: otherlv_0= 'Choice' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleChoice2435); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getChoiceAccess().getChoiceKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleChoice2447); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getChoiceAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1114:1: ( (lv_S1_2_0= ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1115:1: (lv_S1_2_0= ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1115:1: (lv_S1_2_0= ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1116:3: lv_S1_2_0= ruleStrategy
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getChoiceAccess().getS1StrategyParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleChoice2468);
            lv_S1_2_0=ruleStrategy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getChoiceRule());
              	        }
                     		set(
                     			current, 
                     			"S1",
                      		lv_S1_2_0, 
                      		"Strategy");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleChoice2480); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getChoiceAccess().getCommaKeyword_3());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1136:1: ( (lv_S2_4_0= ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1137:1: (lv_S2_4_0= ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1137:1: (lv_S2_4_0= ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1138:3: lv_S2_4_0= ruleStrategy
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getChoiceAccess().getS2StrategyParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleChoice2501);
            lv_S2_4_0=ruleStrategy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getChoiceRule());
              	        }
                     		set(
                     			current, 
                     			"S2",
                      		lv_S2_4_0, 
                      		"Strategy");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleChoice2513); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getChoiceAccess().getRightParenthesisKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChoice"


    // $ANTLR start "entryRuleUnion"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1166:1: entryRuleUnion returns [EObject current=null] : iv_ruleUnion= ruleUnion EOF ;
    public final EObject entryRuleUnion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnion = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1167:2: (iv_ruleUnion= ruleUnion EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1168:2: iv_ruleUnion= ruleUnion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnion_in_entryRuleUnion2549);
            iv_ruleUnion=ruleUnion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnion; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnion2559); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnion"


    // $ANTLR start "ruleUnion"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1175:1: ruleUnion returns [EObject current=null] : (otherlv_0= 'Union' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ')' ) ;
    public final EObject ruleUnion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_S1_2_0 = null;

        EObject lv_S2_4_0 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1178:28: ( (otherlv_0= 'Union' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1179:1: (otherlv_0= 'Union' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1179:1: (otherlv_0= 'Union' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1179:3: otherlv_0= 'Union' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleUnion2596); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUnionAccess().getUnionKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleUnion2608); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUnionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1187:1: ( (lv_S1_2_0= ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1188:1: (lv_S1_2_0= ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1188:1: (lv_S1_2_0= ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1189:3: lv_S1_2_0= ruleStrategy
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnionAccess().getS1StrategyParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleUnion2629);
            lv_S1_2_0=ruleStrategy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUnionRule());
              	        }
                     		set(
                     			current, 
                     			"S1",
                      		lv_S1_2_0, 
                      		"Strategy");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleUnion2641); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getUnionAccess().getCommaKeyword_3());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1209:1: ( (lv_S2_4_0= ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1210:1: (lv_S2_4_0= ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1210:1: (lv_S2_4_0= ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1211:3: lv_S2_4_0= ruleStrategy
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnionAccess().getS2StrategyParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleUnion2662);
            lv_S2_4_0=ruleStrategy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUnionRule());
              	        }
                     		set(
                     			current, 
                     			"S2",
                      		lv_S2_4_0, 
                      		"Strategy");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleUnion2674); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getUnionAccess().getRightParenthesisKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnion"


    // $ANTLR start "entryRuleSequence"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1239:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1240:2: (iv_ruleSequence= ruleSequence EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1241:2: iv_ruleSequence= ruleSequence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSequenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSequence_in_entryRuleSequence2710);
            iv_ruleSequence=ruleSequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSequence; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSequence2720); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1248:1: ruleSequence returns [EObject current=null] : (otherlv_0= 'Sequence' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ')' ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_S1_2_0 = null;

        EObject lv_S2_4_0 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1251:28: ( (otherlv_0= 'Sequence' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1252:1: (otherlv_0= 'Sequence' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1252:1: (otherlv_0= 'Sequence' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1252:3: otherlv_0= 'Sequence' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleSequence2757); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSequenceAccess().getSequenceKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSequence2769); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSequenceAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1260:1: ( (lv_S1_2_0= ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1261:1: (lv_S1_2_0= ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1261:1: (lv_S1_2_0= ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1262:3: lv_S1_2_0= ruleStrategy
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSequenceAccess().getS1StrategyParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleSequence2790);
            lv_S1_2_0=ruleStrategy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSequenceRule());
              	        }
                     		set(
                     			current, 
                     			"S1",
                      		lv_S1_2_0, 
                      		"Strategy");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSequence2802); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSequenceAccess().getCommaKeyword_3());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1282:1: ( (lv_S2_4_0= ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1283:1: (lv_S2_4_0= ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1283:1: (lv_S2_4_0= ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1284:3: lv_S2_4_0= ruleStrategy
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSequenceAccess().getS2StrategyParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleSequence2823);
            lv_S2_4_0=ruleStrategy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSequenceRule());
              	        }
                     		set(
                     			current, 
                     			"S2",
                      		lv_S2_4_0, 
                      		"Strategy");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSequence2835); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSequenceAccess().getRightParenthesisKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequence"


    // $ANTLR start "entryRuleIdentity"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1312:1: entryRuleIdentity returns [EObject current=null] : iv_ruleIdentity= ruleIdentity EOF ;
    public final EObject entryRuleIdentity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentity = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1313:2: (iv_ruleIdentity= ruleIdentity EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1314:2: iv_ruleIdentity= ruleIdentity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentityRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentity_in_entryRuleIdentity2871);
            iv_ruleIdentity=ruleIdentity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentity; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentity2881); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdentity"


    // $ANTLR start "ruleIdentity"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1321:1: ruleIdentity returns [EObject current=null] : (otherlv_0= 'Identity' () ) ;
    public final EObject ruleIdentity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1324:28: ( (otherlv_0= 'Identity' () ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1325:1: (otherlv_0= 'Identity' () )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1325:1: (otherlv_0= 'Identity' () )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1325:3: otherlv_0= 'Identity' ()
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleIdentity2918); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIdentityAccess().getIdentityKeyword_0());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1329:1: ()
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1330:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIdentityAccess().getIdentityAction_1(),
                          current);
                  
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdentity"


    // $ANTLR start "entryRuleFail"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1343:1: entryRuleFail returns [EObject current=null] : iv_ruleFail= ruleFail EOF ;
    public final EObject entryRuleFail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFail = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1344:2: (iv_ruleFail= ruleFail EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1345:2: iv_ruleFail= ruleFail EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFailRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFail_in_entryRuleFail2963);
            iv_ruleFail=ruleFail();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFail; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFail2973); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFail"


    // $ANTLR start "ruleFail"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1352:1: ruleFail returns [EObject current=null] : (otherlv_0= 'Fail' () ) ;
    public final EObject ruleFail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1355:28: ( (otherlv_0= 'Fail' () ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1356:1: (otherlv_0= 'Fail' () )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1356:1: (otherlv_0= 'Fail' () )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1356:3: otherlv_0= 'Fail' ()
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleFail3010); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFailAccess().getFailKeyword_0());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1360:1: ()
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1361:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFailAccess().getFailAction_1(),
                          current);
                  
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFail"


    // $ANTLR start "entryRuleVariableStrategy"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1374:1: entryRuleVariableStrategy returns [EObject current=null] : iv_ruleVariableStrategy= ruleVariableStrategy EOF ;
    public final EObject entryRuleVariableStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableStrategy = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1375:2: (iv_ruleVariableStrategy= ruleVariableStrategy EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1376:2: iv_ruleVariableStrategy= ruleVariableStrategy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableStrategyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableStrategy_in_entryRuleVariableStrategy3055);
            iv_ruleVariableStrategy=ruleVariableStrategy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableStrategy; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableStrategy3065); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableStrategy"


    // $ANTLR start "ruleVariableStrategy"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1383:1: ruleVariableStrategy returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariableStrategy() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1386:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1387:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1387:1: ( (lv_name_0_0= RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1388:1: (lv_name_0_0= RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1388:1: (lv_name_0_0= RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1389:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVariableStrategy3106); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getVariableStrategyAccess().getNameIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableStrategyRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableStrategy"


    // $ANTLR start "entryRuleATerm"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1413:1: entryRuleATerm returns [EObject current=null] : iv_ruleATerm= ruleATerm EOF ;
    public final EObject entryRuleATerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleATerm = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1414:2: (iv_ruleATerm= ruleATerm EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1415:2: iv_ruleATerm= ruleATerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getATermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleATerm_in_entryRuleATerm3146);
            iv_ruleATerm=ruleATerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleATerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleATerm3156); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleATerm"


    // $ANTLR start "ruleATerm"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1422:1: ruleATerm returns [EObject current=null] : (this_Term_0= ruleTerm | this_Variable_1= ruleVariable ) ;
    public final EObject ruleATerm() throws RecognitionException {
        EObject current = null;

        EObject this_Term_0 = null;

        EObject this_Variable_1 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1425:28: ( (this_Term_0= ruleTerm | this_Variable_1= ruleVariable ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1426:1: (this_Term_0= ruleTerm | this_Variable_1= ruleVariable )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1426:1: (this_Term_0= ruleTerm | this_Variable_1= ruleVariable )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_TERMVAR) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1427:5: this_Term_0= ruleTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getATermAccess().getTermParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleATerm3203);
                    this_Term_0=ruleTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Term_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1437:5: this_Variable_1= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getATermAccess().getVariableParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleATerm3230);
                    this_Variable_1=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Variable_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleATerm"


    // $ANTLR start "entryRuleASort"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1453:1: entryRuleASort returns [EObject current=null] : iv_ruleASort= ruleASort EOF ;
    public final EObject entryRuleASort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleASort = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1454:2: (iv_ruleASort= ruleASort EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1455:2: iv_ruleASort= ruleASort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getASortRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleASort_in_entryRuleASort3265);
            iv_ruleASort=ruleASort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleASort; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleASort3275); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleASort"


    // $ANTLR start "ruleASort"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1462:1: ruleASort returns [EObject current=null] : (this_SubSort_0= ruleSubSort | this_Sort_1= ruleSort ) ;
    public final EObject ruleASort() throws RecognitionException {
        EObject current = null;

        EObject this_SubSort_0 = null;

        EObject this_Sort_1 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1465:28: ( (this_SubSort_0= ruleSubSort | this_Sort_1= ruleSort ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1466:1: (this_SubSort_0= ruleSubSort | this_Sort_1= ruleSort )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1466:1: (this_SubSort_0= ruleSubSort | this_Sort_1= ruleSort )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==EOF||LA13_1==18||LA13_1==37) ) {
                    alt13=2;
                }
                else if ( (LA13_1==41) ) {
                    alt13=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1467:5: this_SubSort_0= ruleSubSort
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getASortAccess().getSubSortParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSubSort_in_ruleASort3322);
                    this_SubSort_0=ruleSubSort();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SubSort_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1477:5: this_Sort_1= ruleSort
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getASortAccess().getSortParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSort_in_ruleASort3349);
                    this_Sort_1=ruleSort();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Sort_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleASort"


    // $ANTLR start "entryRuleADT"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1493:1: entryRuleADT returns [EObject current=null] : iv_ruleADT= ruleADT EOF ;
    public final EObject entryRuleADT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleADT = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1494:2: (iv_ruleADT= ruleADT EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1495:2: iv_ruleADT= ruleADT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getADTRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleADT_in_entryRuleADT3384);
            iv_ruleADT=ruleADT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleADT; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleADT3394); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleADT"


    // $ANTLR start "ruleADT"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1502:1: ruleADT returns [EObject current=null] : (otherlv_0= 'ADT' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Signature' ( (lv_signature_3_0= ruleSignature ) ) ( ( ( 'Axioms' )=>otherlv_4= 'Axioms' ) ( (lv_equations_5_0= ruleEquation ) ) ( (lv_equations_6_0= ruleEquation ) )* )? ( ( ( 'Variables' )=>otherlv_7= 'Variables' ) ( (lv_variables_8_0= ruleVariableDeclaration ) ) ( (lv_variables_9_0= ruleVariableDeclaration ) )* )? ) ;
    public final EObject ruleADT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_signature_3_0 = null;

        EObject lv_equations_5_0 = null;

        EObject lv_equations_6_0 = null;

        EObject lv_variables_8_0 = null;

        EObject lv_variables_9_0 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1505:28: ( (otherlv_0= 'ADT' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Signature' ( (lv_signature_3_0= ruleSignature ) ) ( ( ( 'Axioms' )=>otherlv_4= 'Axioms' ) ( (lv_equations_5_0= ruleEquation ) ) ( (lv_equations_6_0= ruleEquation ) )* )? ( ( ( 'Variables' )=>otherlv_7= 'Variables' ) ( (lv_variables_8_0= ruleVariableDeclaration ) ) ( (lv_variables_9_0= ruleVariableDeclaration ) )* )? ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1506:1: (otherlv_0= 'ADT' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Signature' ( (lv_signature_3_0= ruleSignature ) ) ( ( ( 'Axioms' )=>otherlv_4= 'Axioms' ) ( (lv_equations_5_0= ruleEquation ) ) ( (lv_equations_6_0= ruleEquation ) )* )? ( ( ( 'Variables' )=>otherlv_7= 'Variables' ) ( (lv_variables_8_0= ruleVariableDeclaration ) ) ( (lv_variables_9_0= ruleVariableDeclaration ) )* )? )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1506:1: (otherlv_0= 'ADT' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Signature' ( (lv_signature_3_0= ruleSignature ) ) ( ( ( 'Axioms' )=>otherlv_4= 'Axioms' ) ( (lv_equations_5_0= ruleEquation ) ) ( (lv_equations_6_0= ruleEquation ) )* )? ( ( ( 'Variables' )=>otherlv_7= 'Variables' ) ( (lv_variables_8_0= ruleVariableDeclaration ) ) ( (lv_variables_9_0= ruleVariableDeclaration ) )* )? )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1506:3: otherlv_0= 'ADT' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Signature' ( (lv_signature_3_0= ruleSignature ) ) ( ( ( 'Axioms' )=>otherlv_4= 'Axioms' ) ( (lv_equations_5_0= ruleEquation ) ) ( (lv_equations_6_0= ruleEquation ) )* )? ( ( ( 'Variables' )=>otherlv_7= 'Variables' ) ( (lv_variables_8_0= ruleVariableDeclaration ) ) ( (lv_variables_9_0= ruleVariableDeclaration ) )* )?
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleADT3431); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getADTAccess().getADTKeyword_0());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1510:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1511:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1511:1: (lv_name_1_0= RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1512:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleADT3448); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getADTAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getADTRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleADT3465); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getADTAccess().getSignatureKeyword_2());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1532:1: ( (lv_signature_3_0= ruleSignature ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1533:1: (lv_signature_3_0= ruleSignature )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1533:1: (lv_signature_3_0= ruleSignature )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1534:3: lv_signature_3_0= ruleSignature
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getADTAccess().getSignatureSignatureParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleSignature_in_ruleADT3486);
            lv_signature_3_0=ruleSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getADTRule());
              	        }
                     		set(
                     			current, 
                     			"signature",
                      		lv_signature_3_0, 
                      		"Signature");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1550:2: ( ( ( 'Axioms' )=>otherlv_4= 'Axioms' ) ( (lv_equations_5_0= ruleEquation ) ) ( (lv_equations_6_0= ruleEquation ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) && (synpred2_InternalTransitionSystemDsl())) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1550:3: ( ( 'Axioms' )=>otherlv_4= 'Axioms' ) ( (lv_equations_5_0= ruleEquation ) ) ( (lv_equations_6_0= ruleEquation ) )*
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1550:3: ( ( 'Axioms' )=>otherlv_4= 'Axioms' )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1550:4: ( 'Axioms' )=>otherlv_4= 'Axioms'
                    {
                    otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleADT3507); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getADTAccess().getAxiomsKeyword_4_0());
                          
                    }

                    }

                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1555:2: ( (lv_equations_5_0= ruleEquation ) )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1556:1: (lv_equations_5_0= ruleEquation )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1556:1: (lv_equations_5_0= ruleEquation )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1557:3: lv_equations_5_0= ruleEquation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getADTAccess().getEquationsEquationParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEquation_in_ruleADT3529);
                    lv_equations_5_0=ruleEquation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getADTRule());
                      	        }
                             		add(
                             			current, 
                             			"equations",
                              		lv_equations_5_0, 
                              		"Equation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1573:2: ( (lv_equations_6_0= ruleEquation ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_ID||LA14_0==RULE_TERMVAR) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1574:1: (lv_equations_6_0= ruleEquation )
                    	    {
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1574:1: (lv_equations_6_0= ruleEquation )
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1575:3: lv_equations_6_0= ruleEquation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getADTAccess().getEquationsEquationParserRuleCall_4_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleEquation_in_ruleADT3550);
                    	    lv_equations_6_0=ruleEquation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getADTRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"equations",
                    	              		lv_equations_6_0, 
                    	              		"Equation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1591:5: ( ( ( 'Variables' )=>otherlv_7= 'Variables' ) ( (lv_variables_8_0= ruleVariableDeclaration ) ) ( (lv_variables_9_0= ruleVariableDeclaration ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) && (synpred3_InternalTransitionSystemDsl())) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1591:6: ( ( 'Variables' )=>otherlv_7= 'Variables' ) ( (lv_variables_8_0= ruleVariableDeclaration ) ) ( (lv_variables_9_0= ruleVariableDeclaration ) )*
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1591:6: ( ( 'Variables' )=>otherlv_7= 'Variables' )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1591:7: ( 'Variables' )=>otherlv_7= 'Variables'
                    {
                    otherlv_7=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleADT3574); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getADTAccess().getVariablesKeyword_5_0());
                          
                    }

                    }

                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1596:2: ( (lv_variables_8_0= ruleVariableDeclaration ) )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1597:1: (lv_variables_8_0= ruleVariableDeclaration )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1597:1: (lv_variables_8_0= ruleVariableDeclaration )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1598:3: lv_variables_8_0= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getADTAccess().getVariablesVariableDeclarationParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariableDeclaration_in_ruleADT3596);
                    lv_variables_8_0=ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getADTRule());
                      	        }
                             		add(
                             			current, 
                             			"variables",
                              		lv_variables_8_0, 
                              		"VariableDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1614:2: ( (lv_variables_9_0= ruleVariableDeclaration ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_ID) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1615:1: (lv_variables_9_0= ruleVariableDeclaration )
                    	    {
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1615:1: (lv_variables_9_0= ruleVariableDeclaration )
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1616:3: lv_variables_9_0= ruleVariableDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getADTAccess().getVariablesVariableDeclarationParserRuleCall_5_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleVariableDeclaration_in_ruleADT3617);
                    	    lv_variables_9_0=ruleVariableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getADTRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"variables",
                    	              		lv_variables_9_0, 
                    	              		"VariableDeclaration");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleADT"


    // $ANTLR start "entryRuleSignature"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1640:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1641:2: (iv_ruleSignature= ruleSignature EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1642:2: iv_ruleSignature= ruleSignature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignatureRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSignature_in_entryRuleSignature3656);
            iv_ruleSignature=ruleSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignature; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSignature3666); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1649:1: ruleSignature returns [EObject current=null] : (otherlv_0= 'Sorts' ( (lv_sorts_1_0= ruleASort ) ) (otherlv_2= ',' ( (lv_sorts_3_0= ruleASort ) ) )* ( ( ( 'Generators' )=>otherlv_4= 'Generators' ) ( (lv_generators_5_0= ruleOperation ) ) ( (lv_generators_6_0= ruleOperation ) )* ) ( ( ( 'Operations' )=>otherlv_7= 'Operations' ) ( (lv_operations_8_0= ruleOperation ) ) ( (lv_operations_9_0= ruleOperation ) )* )? ) ;
    public final EObject ruleSignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_sorts_1_0 = null;

        EObject lv_sorts_3_0 = null;

        EObject lv_generators_5_0 = null;

        EObject lv_generators_6_0 = null;

        EObject lv_operations_8_0 = null;

        EObject lv_operations_9_0 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1652:28: ( (otherlv_0= 'Sorts' ( (lv_sorts_1_0= ruleASort ) ) (otherlv_2= ',' ( (lv_sorts_3_0= ruleASort ) ) )* ( ( ( 'Generators' )=>otherlv_4= 'Generators' ) ( (lv_generators_5_0= ruleOperation ) ) ( (lv_generators_6_0= ruleOperation ) )* ) ( ( ( 'Operations' )=>otherlv_7= 'Operations' ) ( (lv_operations_8_0= ruleOperation ) ) ( (lv_operations_9_0= ruleOperation ) )* )? ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1653:1: (otherlv_0= 'Sorts' ( (lv_sorts_1_0= ruleASort ) ) (otherlv_2= ',' ( (lv_sorts_3_0= ruleASort ) ) )* ( ( ( 'Generators' )=>otherlv_4= 'Generators' ) ( (lv_generators_5_0= ruleOperation ) ) ( (lv_generators_6_0= ruleOperation ) )* ) ( ( ( 'Operations' )=>otherlv_7= 'Operations' ) ( (lv_operations_8_0= ruleOperation ) ) ( (lv_operations_9_0= ruleOperation ) )* )? )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1653:1: (otherlv_0= 'Sorts' ( (lv_sorts_1_0= ruleASort ) ) (otherlv_2= ',' ( (lv_sorts_3_0= ruleASort ) ) )* ( ( ( 'Generators' )=>otherlv_4= 'Generators' ) ( (lv_generators_5_0= ruleOperation ) ) ( (lv_generators_6_0= ruleOperation ) )* ) ( ( ( 'Operations' )=>otherlv_7= 'Operations' ) ( (lv_operations_8_0= ruleOperation ) ) ( (lv_operations_9_0= ruleOperation ) )* )? )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1653:3: otherlv_0= 'Sorts' ( (lv_sorts_1_0= ruleASort ) ) (otherlv_2= ',' ( (lv_sorts_3_0= ruleASort ) ) )* ( ( ( 'Generators' )=>otherlv_4= 'Generators' ) ( (lv_generators_5_0= ruleOperation ) ) ( (lv_generators_6_0= ruleOperation ) )* ) ( ( ( 'Operations' )=>otherlv_7= 'Operations' ) ( (lv_operations_8_0= ruleOperation ) ) ( (lv_operations_9_0= ruleOperation ) )* )?
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleSignature3703); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSignatureAccess().getSortsKeyword_0());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1657:1: ( (lv_sorts_1_0= ruleASort ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1658:1: (lv_sorts_1_0= ruleASort )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1658:1: (lv_sorts_1_0= ruleASort )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1659:3: lv_sorts_1_0= ruleASort
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSignatureAccess().getSortsASortParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleASort_in_ruleSignature3724);
            lv_sorts_1_0=ruleASort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSignatureRule());
              	        }
                     		add(
                     			current, 
                     			"sorts",
                      		lv_sorts_1_0, 
                      		"ASort");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1675:2: (otherlv_2= ',' ( (lv_sorts_3_0= ruleASort ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==18) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1675:4: otherlv_2= ',' ( (lv_sorts_3_0= ruleASort ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSignature3737); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSignatureAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1679:1: ( (lv_sorts_3_0= ruleASort ) )
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1680:1: (lv_sorts_3_0= ruleASort )
            	    {
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1680:1: (lv_sorts_3_0= ruleASort )
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1681:3: lv_sorts_3_0= ruleASort
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSignatureAccess().getSortsASortParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleASort_in_ruleSignature3758);
            	    lv_sorts_3_0=ruleASort();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSignatureRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"sorts",
            	              		lv_sorts_3_0, 
            	              		"ASort");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1697:4: ( ( ( 'Generators' )=>otherlv_4= 'Generators' ) ( (lv_generators_5_0= ruleOperation ) ) ( (lv_generators_6_0= ruleOperation ) )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1697:5: ( ( 'Generators' )=>otherlv_4= 'Generators' ) ( (lv_generators_5_0= ruleOperation ) ) ( (lv_generators_6_0= ruleOperation ) )*
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1697:5: ( ( 'Generators' )=>otherlv_4= 'Generators' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1697:6: ( 'Generators' )=>otherlv_4= 'Generators'
            {
            otherlv_4=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleSignature3781); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSignatureAccess().getGeneratorsKeyword_3_0());
                  
            }

            }

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1702:2: ( (lv_generators_5_0= ruleOperation ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1703:1: (lv_generators_5_0= ruleOperation )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1703:1: (lv_generators_5_0= ruleOperation )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1704:3: lv_generators_5_0= ruleOperation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSignatureAccess().getGeneratorsOperationParserRuleCall_3_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleSignature3803);
            lv_generators_5_0=ruleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSignatureRule());
              	        }
                     		add(
                     			current, 
                     			"generators",
                      		lv_generators_5_0, 
                      		"Operation");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1720:2: ( (lv_generators_6_0= ruleOperation ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1721:1: (lv_generators_6_0= ruleOperation )
            	    {
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1721:1: (lv_generators_6_0= ruleOperation )
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1722:3: lv_generators_6_0= ruleOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSignatureAccess().getGeneratorsOperationParserRuleCall_3_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleSignature3824);
            	    lv_generators_6_0=ruleOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSignatureRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"generators",
            	              		lv_generators_6_0, 
            	              		"Operation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1738:4: ( ( ( 'Operations' )=>otherlv_7= 'Operations' ) ( (lv_operations_8_0= ruleOperation ) ) ( (lv_operations_9_0= ruleOperation ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) && (synpred5_InternalTransitionSystemDsl())) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1738:5: ( ( 'Operations' )=>otherlv_7= 'Operations' ) ( (lv_operations_8_0= ruleOperation ) ) ( (lv_operations_9_0= ruleOperation ) )*
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1738:5: ( ( 'Operations' )=>otherlv_7= 'Operations' )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1738:6: ( 'Operations' )=>otherlv_7= 'Operations'
                    {
                    otherlv_7=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleSignature3847); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getSignatureAccess().getOperationsKeyword_4_0());
                          
                    }

                    }

                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1743:2: ( (lv_operations_8_0= ruleOperation ) )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1744:1: (lv_operations_8_0= ruleOperation )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1744:1: (lv_operations_8_0= ruleOperation )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1745:3: lv_operations_8_0= ruleOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSignatureAccess().getOperationsOperationParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleSignature3869);
                    lv_operations_8_0=ruleOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSignatureRule());
                      	        }
                             		add(
                             			current, 
                             			"operations",
                              		lv_operations_8_0, 
                              		"Operation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1761:2: ( (lv_operations_9_0= ruleOperation ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_ID) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1762:1: (lv_operations_9_0= ruleOperation )
                    	    {
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1762:1: (lv_operations_9_0= ruleOperation )
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1763:3: lv_operations_9_0= ruleOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSignatureAccess().getOperationsOperationParserRuleCall_4_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleSignature3890);
                    	    lv_operations_9_0=ruleOperation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSignatureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"operations",
                    	              		lv_operations_9_0, 
                    	              		"Operation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1787:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1788:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1789:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3929);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableDeclaration3939); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1796:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1799:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1800:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1800:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1800:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1800:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1801:1: (lv_name_0_0= RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1801:1: (lv_name_0_0= RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1802:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVariableDeclaration3981); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleVariableDeclaration3998); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVariableDeclarationAccess().getColonKeyword_1());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1822:1: ( (otherlv_2= RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1823:1: (otherlv_2= RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1823:1: (otherlv_2= RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1824:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVariableDeclaration4018); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getSortASortCrossReference_2_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleEquation"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1843:1: entryRuleEquation returns [EObject current=null] : iv_ruleEquation= ruleEquation EOF ;
    public final EObject entryRuleEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquation = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1844:2: (iv_ruleEquation= ruleEquation EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1845:2: iv_ruleEquation= ruleEquation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEquationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEquation_in_entryRuleEquation4054);
            iv_ruleEquation=ruleEquation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEquation4064); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquation"


    // $ANTLR start "ruleEquation"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1852:1: ruleEquation returns [EObject current=null] : ( ( (lv_leftHandTerm_0_0= ruleATerm ) ) otherlv_1= '=' ( (lv_rightHandTerm_2_0= ruleATerm ) ) ) ;
    public final EObject ruleEquation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftHandTerm_0_0 = null;

        EObject lv_rightHandTerm_2_0 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1855:28: ( ( ( (lv_leftHandTerm_0_0= ruleATerm ) ) otherlv_1= '=' ( (lv_rightHandTerm_2_0= ruleATerm ) ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1856:1: ( ( (lv_leftHandTerm_0_0= ruleATerm ) ) otherlv_1= '=' ( (lv_rightHandTerm_2_0= ruleATerm ) ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1856:1: ( ( (lv_leftHandTerm_0_0= ruleATerm ) ) otherlv_1= '=' ( (lv_rightHandTerm_2_0= ruleATerm ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1856:2: ( (lv_leftHandTerm_0_0= ruleATerm ) ) otherlv_1= '=' ( (lv_rightHandTerm_2_0= ruleATerm ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1856:2: ( (lv_leftHandTerm_0_0= ruleATerm ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1857:1: (lv_leftHandTerm_0_0= ruleATerm )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1857:1: (lv_leftHandTerm_0_0= ruleATerm )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1858:3: lv_leftHandTerm_0_0= ruleATerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEquationAccess().getLeftHandTermATermParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleATerm_in_ruleEquation4110);
            lv_leftHandTerm_0_0=ruleATerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEquationRule());
              	        }
                     		set(
                     			current, 
                     			"leftHandTerm",
                      		lv_leftHandTerm_0_0, 
                      		"ATerm");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEquation4122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEquationAccess().getEqualsSignKeyword_1());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1878:1: ( (lv_rightHandTerm_2_0= ruleATerm ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1879:1: (lv_rightHandTerm_2_0= ruleATerm )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1879:1: (lv_rightHandTerm_2_0= ruleATerm )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1880:3: lv_rightHandTerm_2_0= ruleATerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEquationAccess().getRightHandTermATermParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleATerm_in_ruleEquation4143);
            lv_rightHandTerm_2_0=ruleATerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEquationRule());
              	        }
                     		set(
                     			current, 
                     			"rightHandTerm",
                      		lv_rightHandTerm_2_0, 
                      		"ATerm");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquation"


    // $ANTLR start "entryRuleRewriteRule"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1904:1: entryRuleRewriteRule returns [EObject current=null] : iv_ruleRewriteRule= ruleRewriteRule EOF ;
    public final EObject entryRuleRewriteRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRewriteRule = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1905:2: (iv_ruleRewriteRule= ruleRewriteRule EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1906:2: iv_ruleRewriteRule= ruleRewriteRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRewriteRuleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRewriteRule_in_entryRuleRewriteRule4179);
            iv_ruleRewriteRule=ruleRewriteRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRewriteRule; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRewriteRule4189); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRewriteRule"


    // $ANTLR start "ruleRewriteRule"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1913:1: ruleRewriteRule returns [EObject current=null] : ( ( (lv_leftHandTerm_0_0= ruleATerm ) ) otherlv_1= '->' ( (lv_rightHandTerm_2_0= ruleATerm ) ) ) ;
    public final EObject ruleRewriteRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftHandTerm_0_0 = null;

        EObject lv_rightHandTerm_2_0 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1916:28: ( ( ( (lv_leftHandTerm_0_0= ruleATerm ) ) otherlv_1= '->' ( (lv_rightHandTerm_2_0= ruleATerm ) ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1917:1: ( ( (lv_leftHandTerm_0_0= ruleATerm ) ) otherlv_1= '->' ( (lv_rightHandTerm_2_0= ruleATerm ) ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1917:1: ( ( (lv_leftHandTerm_0_0= ruleATerm ) ) otherlv_1= '->' ( (lv_rightHandTerm_2_0= ruleATerm ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1917:2: ( (lv_leftHandTerm_0_0= ruleATerm ) ) otherlv_1= '->' ( (lv_rightHandTerm_2_0= ruleATerm ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1917:2: ( (lv_leftHandTerm_0_0= ruleATerm ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1918:1: (lv_leftHandTerm_0_0= ruleATerm )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1918:1: (lv_leftHandTerm_0_0= ruleATerm )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1919:3: lv_leftHandTerm_0_0= ruleATerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRewriteRuleAccess().getLeftHandTermATermParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleATerm_in_ruleRewriteRule4235);
            lv_leftHandTerm_0_0=ruleATerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRewriteRuleRule());
              	        }
                     		set(
                     			current, 
                     			"leftHandTerm",
                      		lv_leftHandTerm_0_0, 
                      		"ATerm");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleRewriteRule4247); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRewriteRuleAccess().getHyphenMinusGreaterThanSignKeyword_1());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1939:1: ( (lv_rightHandTerm_2_0= ruleATerm ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1940:1: (lv_rightHandTerm_2_0= ruleATerm )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1940:1: (lv_rightHandTerm_2_0= ruleATerm )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1941:3: lv_rightHandTerm_2_0= ruleATerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRewriteRuleAccess().getRightHandTermATermParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleATerm_in_ruleRewriteRule4268);
            lv_rightHandTerm_2_0=ruleATerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRewriteRuleRule());
              	        }
                     		set(
                     			current, 
                     			"rightHandTerm",
                      		lv_rightHandTerm_2_0, 
                      		"ATerm");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRewriteRule"


    // $ANTLR start "entryRuleSubSort"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1965:1: entryRuleSubSort returns [EObject current=null] : iv_ruleSubSort= ruleSubSort EOF ;
    public final EObject entryRuleSubSort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubSort = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1966:2: (iv_ruleSubSort= ruleSubSort EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1967:2: iv_ruleSubSort= ruleSubSort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubSortRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubSort_in_entryRuleSubSort4304);
            iv_ruleSubSort=ruleSubSort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubSort; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubSort4314); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubSort"


    // $ANTLR start "ruleSubSort"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1974:1: ruleSubSort returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleSubSort() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1977:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1978:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1978:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1978:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1978:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1979:1: (lv_name_0_0= RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1979:1: (lv_name_0_0= RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1980:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSubSort4356); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getSubSortAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSubSortRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleSubSort4373); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSubSortAccess().getLessThanSignKeyword_1());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2000:1: ( (otherlv_2= RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2001:1: (otherlv_2= RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2001:1: (otherlv_2= RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2002:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSubSortRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSubSort4393); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getSubSortAccess().getSuperSortASortCrossReference_2_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubSort"


    // $ANTLR start "entryRuleSort"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2021:1: entryRuleSort returns [EObject current=null] : iv_ruleSort= ruleSort EOF ;
    public final EObject entryRuleSort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSort = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2022:2: (iv_ruleSort= ruleSort EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2023:2: iv_ruleSort= ruleSort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSortRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSort_in_entryRuleSort4429);
            iv_ruleSort=ruleSort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSort; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSort4439); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSort"


    // $ANTLR start "ruleSort"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2030:1: ruleSort returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSort() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2033:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2034:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2034:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2034:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2034:2: ()
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2035:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSortAccess().getSortAction_0(),
                          current);
                  
            }

            }

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2040:2: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2041:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2041:1: (lv_name_1_0= RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2042:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSort4490); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getSortAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSortRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSort"


    // $ANTLR start "entryRuleTerm"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2066:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2067:2: (iv_ruleTerm= ruleTerm EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2068:2: iv_ruleTerm= ruleTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTerm_in_entryRuleTerm4531);
            iv_ruleTerm=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerm4541); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2075:1: ruleTerm returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_subterms_3_0= ruleATerm ) ) (otherlv_4= ',' ( (lv_subterms_5_0= ruleATerm ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_subterms_3_0 = null;

        EObject lv_subterms_5_0 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2078:28: ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_subterms_3_0= ruleATerm ) ) (otherlv_4= ',' ( (lv_subterms_5_0= ruleATerm ) ) )* otherlv_6= ')' )? ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2079:1: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_subterms_3_0= ruleATerm ) ) (otherlv_4= ',' ( (lv_subterms_5_0= ruleATerm ) ) )* otherlv_6= ')' )? )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2079:1: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_subterms_3_0= ruleATerm ) ) (otherlv_4= ',' ( (lv_subterms_5_0= ruleATerm ) ) )* otherlv_6= ')' )? )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2079:2: () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_subterms_3_0= ruleATerm ) ) (otherlv_4= ',' ( (lv_subterms_5_0= ruleATerm ) ) )* otherlv_6= ')' )?
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2079:2: ()
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2080:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTermAccess().getTermAction_0(),
                          current);
                  
            }

            }

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2085:2: ( (otherlv_1= RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2086:1: (otherlv_1= RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2086:1: (otherlv_1= RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2087:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTermRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTerm4595); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getTermAccess().getOperationSymbolOperationCrossReference_1_0()); 
              	
            }

            }


            }

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2098:2: (otherlv_2= '(' ( (lv_subterms_3_0= ruleATerm ) ) (otherlv_4= ',' ( (lv_subterms_5_0= ruleATerm ) ) )* otherlv_6= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==17) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2098:4: otherlv_2= '(' ( (lv_subterms_3_0= ruleATerm ) ) (otherlv_4= ',' ( (lv_subterms_5_0= ruleATerm ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTerm4608); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTermAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2102:1: ( (lv_subterms_3_0= ruleATerm ) )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2103:1: (lv_subterms_3_0= ruleATerm )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2103:1: (lv_subterms_3_0= ruleATerm )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2104:3: lv_subterms_3_0= ruleATerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTermAccess().getSubtermsATermParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleATerm_in_ruleTerm4629);
                    lv_subterms_3_0=ruleATerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTermRule());
                      	        }
                             		add(
                             			current, 
                             			"subterms",
                              		lv_subterms_3_0, 
                              		"ATerm");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2120:2: (otherlv_4= ',' ( (lv_subterms_5_0= ruleATerm ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==18) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2120:4: otherlv_4= ',' ( (lv_subterms_5_0= ruleATerm ) )
                    	    {
                    	    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTerm4642); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getTermAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2124:1: ( (lv_subterms_5_0= ruleATerm ) )
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2125:1: (lv_subterms_5_0= ruleATerm )
                    	    {
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2125:1: (lv_subterms_5_0= ruleATerm )
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2126:3: lv_subterms_5_0= ruleATerm
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTermAccess().getSubtermsATermParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleATerm_in_ruleTerm4663);
                    	    lv_subterms_5_0=ruleATerm();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTermRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subterms",
                    	              		lv_subterms_5_0, 
                    	              		"ATerm");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTerm4677); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getTermAccess().getRightParenthesisKeyword_2_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleVariable"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2154:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2155:2: (iv_ruleVariable= ruleVariable EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2156:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable4715);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable4725); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2163:1: ruleVariable returns [EObject current=null] : ( () ( (otherlv_1= RULE_TERMVAR ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2166:28: ( ( () ( (otherlv_1= RULE_TERMVAR ) ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2167:1: ( () ( (otherlv_1= RULE_TERMVAR ) ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2167:1: ( () ( (otherlv_1= RULE_TERMVAR ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2167:2: () ( (otherlv_1= RULE_TERMVAR ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2167:2: ()
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2168:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVariableAccess().getVariableAction_0(),
                          current);
                  
            }

            }

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2173:2: ( (otherlv_1= RULE_TERMVAR ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2174:1: (otherlv_1= RULE_TERMVAR )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2174:1: (otherlv_1= RULE_TERMVAR )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2175:3: otherlv_1= RULE_TERMVAR
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_TERMVAR,FollowSets000.FOLLOW_RULE_TERMVAR_in_ruleVariable4779); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getDeclarationVariableDeclarationCrossReference_1_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleOperation"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2194:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2195:2: (iv_ruleOperation= ruleOperation EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2196:2: iv_ruleOperation= ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_entryRuleOperation4815);
            iv_ruleOperation=ruleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperation4825); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2203:1: ruleOperation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '->' )? ( (otherlv_6= RULE_ID ) ) ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2206:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '->' )? ( (otherlv_6= RULE_ID ) ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2207:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '->' )? ( (otherlv_6= RULE_ID ) ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2207:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '->' )? ( (otherlv_6= RULE_ID ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2207:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '->' )? ( (otherlv_6= RULE_ID ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2207:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2208:1: (lv_name_0_0= RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2208:1: (lv_name_0_0= RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2209:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleOperation4867); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOperationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleOperation4884); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getColonKeyword_1());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2229:1: ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '->' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==18||LA25_1==40) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2229:2: ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '->'
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2229:2: ( (otherlv_2= RULE_ID ) )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2230:1: (otherlv_2= RULE_ID )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2230:1: (otherlv_2= RULE_ID )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2231:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getOperationRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleOperation4905); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getFormalParametersASortCrossReference_2_0_0()); 
                      	
                    }

                    }


                    }

                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2242:2: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==18) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2242:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOperation4918); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2246:1: ( (otherlv_4= RULE_ID ) )
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2247:1: (otherlv_4= RULE_ID )
                    	    {
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2247:1: (otherlv_4= RULE_ID )
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2248:3: otherlv_4= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getOperationRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleOperation4938); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getFormalParametersASortCrossReference_2_1_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleOperation4952); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getOperationAccess().getHyphenMinusGreaterThanSignKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2263:3: ( (otherlv_6= RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2264:1: (otherlv_6= RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2264:1: (otherlv_6= RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2265:3: otherlv_6= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getOperationRule());
              	        }
                      
            }
            otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleOperation4974); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getReturnTypeASortCrossReference_3_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"

    // $ANTLR start synpred1_InternalTransitionSystemDsl
    public final void synpred1_InternalTransitionSystemDsl_fragment() throws RecognitionException {   
        // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:403:3: ( rulePredefStrats )
        // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:403:5: rulePredefStrats
        {
        pushFollow(FollowSets000.FOLLOW_rulePredefStrats_in_synpred1_InternalTransitionSystemDsl794);
        rulePredefStrats();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalTransitionSystemDsl

    // $ANTLR start synpred2_InternalTransitionSystemDsl
    public final void synpred2_InternalTransitionSystemDsl_fragment() throws RecognitionException {   
        // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1550:4: ( 'Axioms' )
        // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1550:6: 'Axioms'
        {
        match(input,34,FollowSets000.FOLLOW_34_in_synpred2_InternalTransitionSystemDsl3499); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalTransitionSystemDsl

    // $ANTLR start synpred3_InternalTransitionSystemDsl
    public final void synpred3_InternalTransitionSystemDsl_fragment() throws RecognitionException {   
        // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1591:7: ( 'Variables' )
        // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1591:9: 'Variables'
        {
        match(input,35,FollowSets000.FOLLOW_35_in_synpred3_InternalTransitionSystemDsl3566); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalTransitionSystemDsl

    // $ANTLR start synpred4_InternalTransitionSystemDsl
    public final void synpred4_InternalTransitionSystemDsl_fragment() throws RecognitionException {   
        // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1697:6: ( 'Generators' )
        // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1697:8: 'Generators'
        {
        match(input,37,FollowSets000.FOLLOW_37_in_synpred4_InternalTransitionSystemDsl3773); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalTransitionSystemDsl

    // $ANTLR start synpred5_InternalTransitionSystemDsl
    public final void synpred5_InternalTransitionSystemDsl_fragment() throws RecognitionException {   
        // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1738:6: ( 'Operations' )
        // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1738:8: 'Operations'
        {
        match(input,38,FollowSets000.FOLLOW_38_in_synpred5_InternalTransitionSystemDsl3839); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalTransitionSystemDsl

    // Delegated rules

    public final boolean synpred2_InternalTransitionSystemDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalTransitionSystemDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalTransitionSystemDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalTransitionSystemDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalTransitionSystemDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalTransitionSystemDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalTransitionSystemDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalTransitionSystemDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalTransitionSystemDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalTransitionSystemDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\15\uffff";
    static final String DFA6_eofS =
        "\15\uffff";
    static final String DFA6_minS =
        "\1\4\14\uffff";
    static final String DFA6_maxS =
        "\1\37\14\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\13\1\1\2";
    static final String DFA6_specialS =
        "\1\0\14\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\14\17\uffff\1\11\1\12\1\6\1\10\1\uffff\1\7\1\5\1\3\1\13\1"+
            "\4\1\1\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "403:1: ( ( ( rulePredefStrats )=>this_PredefStrats_0= rulePredefStrats ) | this_DeclaredStrategyInstance_1= ruleDeclaredStrategyInstance )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_0 = input.LA(1);

                         
                        int index6_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA6_0==30) && (synpred1_InternalTransitionSystemDsl())) {s = 1;}

                        else if ( (LA6_0==31) && (synpred1_InternalTransitionSystemDsl())) {s = 2;}

                        else if ( (LA6_0==27) && (synpred1_InternalTransitionSystemDsl())) {s = 3;}

                        else if ( (LA6_0==29) && (synpred1_InternalTransitionSystemDsl())) {s = 4;}

                        else if ( (LA6_0==26) && (synpred1_InternalTransitionSystemDsl())) {s = 5;}

                        else if ( (LA6_0==22) && (synpred1_InternalTransitionSystemDsl())) {s = 6;}

                        else if ( (LA6_0==25) && (synpred1_InternalTransitionSystemDsl())) {s = 7;}

                        else if ( (LA6_0==23) && (synpred1_InternalTransitionSystemDsl())) {s = 8;}

                        else if ( (LA6_0==20) && (synpred1_InternalTransitionSystemDsl())) {s = 9;}

                        else if ( (LA6_0==21) && (synpred1_InternalTransitionSystemDsl())) {s = 10;}

                        else if ( (LA6_0==28) && (synpred1_InternalTransitionSystemDsl())) {s = 11;}

                        else if ( (LA6_0==RULE_ID) ) {s = 12;}

                         
                        input.seek(index6_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleTransitionSystem_in_entryRuleTransitionSystem75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransitionSystem85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleTransitionSystem122 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_ruleADT_in_ruleTransitionSystem143 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTransitionSystem155 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTransitionSystem167 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleTransitionSystem188 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleTransitionSystem200 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_ruleAuxiliary_in_ruleTransitionSystem221 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_16_in_ruleTransitionSystem234 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleTransitionSystem255 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition292 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransition302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTransition344 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTransition361 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_ruleNonVariableStrategy_in_ruleTransition382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAuxiliary_in_entryRuleAuxiliary418 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAuxiliary428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAuxiliary470 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_17_in_ruleAuxiliary488 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVariableStrategy_in_ruleAuxiliary509 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleAuxiliary522 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVariableStrategy_in_ruleAuxiliary543 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleAuxiliary557 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAuxiliary571 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_ruleNonVariableStrategy_in_ruleAuxiliary592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_entryRuleStrategy628 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStrategy638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNonVariableStrategy_in_ruleStrategy685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableStrategy_in_ruleStrategy712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNonVariableStrategy_in_entryRuleNonVariableStrategy747 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNonVariableStrategy757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredefStrats_in_ruleNonVariableStrategy810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaredStrategyInstance_in_ruleNonVariableStrategy838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredefStrats_in_entryRulePredefStrats873 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePredefStrats883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentity_in_rulePredefStrats930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFail_in_rulePredefStrats957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoice_in_rulePredefStrats984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSequence_in_rulePredefStrats1011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFixpoint_in_rulePredefStrats1038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfThenElse_in_rulePredefStrats1065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNot_in_rulePredefStrats1092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleStrategy_in_rulePredefStrats1119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOne_in_rulePredefStrats1146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSaturation_in_rulePredefStrats1173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnion_in_rulePredefStrats1200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOne_in_entryRuleOne1235 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOne1245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleOne1282 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleOne1294 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleOne1315 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleOne1327 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleOne1344 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleOne1361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaredStrategyInstance_in_entryRuleDeclaredStrategyInstance1397 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaredStrategyInstance1407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDeclaredStrategyInstance1461 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleDeclaredStrategyInstance1473 = new BitSet(new long[]{0x00000000FEF80010L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleDeclaredStrategyInstance1495 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleDeclaredStrategyInstance1508 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleDeclaredStrategyInstance1529 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleDeclaredStrategyInstance1545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSaturation_in_entryRuleSaturation1581 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSaturation1591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleSaturation1628 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleSaturation1640 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleSaturation1661 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleSaturation1673 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleSaturation1690 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleSaturation1707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfThenElse_in_entryRuleIfThenElse1743 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIfThenElse1753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleIfThenElse1790 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleIfThenElse1802 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleIfThenElse1823 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleIfThenElse1835 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleIfThenElse1856 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleIfThenElse1868 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleIfThenElse1889 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleIfThenElse1901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleStrategy_in_entryRuleSimpleStrategy1937 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleStrategy1947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleSimpleStrategy1984 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleRewriteRule_in_ruleSimpleStrategy2005 = new BitSet(new long[]{0x0000000001040000L});
        public static final BitSet FOLLOW_18_in_ruleSimpleStrategy2018 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleRewriteRule_in_ruleSimpleStrategy2039 = new BitSet(new long[]{0x0000000001040000L});
        public static final BitSet FOLLOW_24_in_ruleSimpleStrategy2053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNot_in_entryRuleNot2089 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNot2099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleNot2136 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleNot2148 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_ruleSimpleStrategy_in_ruleNot2171 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleDeclaredStrategyInstance_in_ruleNot2190 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleVariableStrategy_in_ruleNot2209 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleNot2224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFixpoint_in_entryRuleFixpoint2260 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFixpoint2270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleFixpoint2307 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFixpoint2319 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleFixpoint2340 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleFixpoint2352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice2388 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChoice2398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleChoice2435 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleChoice2447 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleChoice2468 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleChoice2480 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleChoice2501 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleChoice2513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnion_in_entryRuleUnion2549 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnion2559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleUnion2596 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleUnion2608 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleUnion2629 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleUnion2641 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleUnion2662 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleUnion2674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence2710 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSequence2720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleSequence2757 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleSequence2769 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleSequence2790 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleSequence2802 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleSequence2823 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleSequence2835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentity_in_entryRuleIdentity2871 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentity2881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleIdentity2918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFail_in_entryRuleFail2963 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFail2973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleFail3010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableStrategy_in_entryRuleVariableStrategy3055 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableStrategy3065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVariableStrategy3106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleATerm_in_entryRuleATerm3146 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleATerm3156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleATerm3203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleATerm3230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleASort_in_entryRuleASort3265 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleASort3275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubSort_in_ruleASort3322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSort_in_ruleASort3349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleADT_in_entryRuleADT3384 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleADT3394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleADT3431 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleADT3448 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleADT3465 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleSignature_in_ruleADT3486 = new BitSet(new long[]{0x0000000C00000002L});
        public static final BitSet FOLLOW_34_in_ruleADT3507 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEquation_in_ruleADT3529 = new BitSet(new long[]{0x0000000800000052L});
        public static final BitSet FOLLOW_ruleEquation_in_ruleADT3550 = new BitSet(new long[]{0x0000000800000052L});
        public static final BitSet FOLLOW_35_in_ruleADT3574 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleADT3596 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleADT3617 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_ruleSignature_in_entryRuleSignature3656 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSignature3666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleSignature3703 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleASort_in_ruleSignature3724 = new BitSet(new long[]{0x0000002000040000L});
        public static final BitSet FOLLOW_18_in_ruleSignature3737 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleASort_in_ruleSignature3758 = new BitSet(new long[]{0x0000002000040000L});
        public static final BitSet FOLLOW_37_in_ruleSignature3781 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleSignature3803 = new BitSet(new long[]{0x0000004000000012L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleSignature3824 = new BitSet(new long[]{0x0000004000000012L});
        public static final BitSet FOLLOW_38_in_ruleSignature3847 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleSignature3869 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleSignature3890 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3929 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration3939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration3981 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleVariableDeclaration3998 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration4018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEquation_in_entryRuleEquation4054 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEquation4064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleATerm_in_ruleEquation4110 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleEquation4122 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleATerm_in_ruleEquation4143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRewriteRule_in_entryRuleRewriteRule4179 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRewriteRule4189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleATerm_in_ruleRewriteRule4235 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleRewriteRule4247 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleATerm_in_ruleRewriteRule4268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubSort_in_entryRuleSubSort4304 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubSort4314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSubSort4356 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleSubSort4373 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSubSort4393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSort_in_entryRuleSort4429 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSort4439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSort4490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm4531 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerm4541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTerm4595 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_17_in_ruleTerm4608 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleATerm_in_ruleTerm4629 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleTerm4642 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleATerm_in_ruleTerm4663 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleTerm4677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable4715 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable4725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_TERMVAR_in_ruleVariable4779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation4815 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperation4825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleOperation4867 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleOperation4884 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleOperation4905 = new BitSet(new long[]{0x0000010000040000L});
        public static final BitSet FOLLOW_18_in_ruleOperation4918 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleOperation4938 = new BitSet(new long[]{0x0000010000040000L});
        public static final BitSet FOLLOW_40_in_ruleOperation4952 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleOperation4974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredefStrats_in_synpred1_InternalTransitionSystemDsl794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_synpred2_InternalTransitionSystemDsl3499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_synpred3_InternalTransitionSystemDsl3566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_synpred4_InternalTransitionSystemDsl3773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_synpred5_InternalTransitionSystemDsl3839 = new BitSet(new long[]{0x0000000000000002L});
    }


}