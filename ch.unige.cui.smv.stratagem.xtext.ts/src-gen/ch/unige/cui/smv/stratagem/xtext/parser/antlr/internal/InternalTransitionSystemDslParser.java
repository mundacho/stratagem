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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:76:1: ruleTransitionSystem returns [EObject current=null] : (otherlv_0= 'TransitionSystem' ( (lv_adt_1_0= ruleADT ) ) otherlv_2= 'initialState' otherlv_3= '=' ( (lv_initialState_4_0= ruleTerm ) ) otherlv_5= 'Strategies' ( (lv_auxiliary_6_0= ruleAuxiliary ) )* otherlv_7= 'Transitions' ( (lv_transitions_8_0= ruleTransition ) ) ( (lv_transitions_9_0= ruleTransition ) )* ) ;
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

        EObject lv_transitions_9_0 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:79:28: ( (otherlv_0= 'TransitionSystem' ( (lv_adt_1_0= ruleADT ) ) otherlv_2= 'initialState' otherlv_3= '=' ( (lv_initialState_4_0= ruleTerm ) ) otherlv_5= 'Strategies' ( (lv_auxiliary_6_0= ruleAuxiliary ) )* otherlv_7= 'Transitions' ( (lv_transitions_8_0= ruleTransition ) ) ( (lv_transitions_9_0= ruleTransition ) )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:80:1: (otherlv_0= 'TransitionSystem' ( (lv_adt_1_0= ruleADT ) ) otherlv_2= 'initialState' otherlv_3= '=' ( (lv_initialState_4_0= ruleTerm ) ) otherlv_5= 'Strategies' ( (lv_auxiliary_6_0= ruleAuxiliary ) )* otherlv_7= 'Transitions' ( (lv_transitions_8_0= ruleTransition ) ) ( (lv_transitions_9_0= ruleTransition ) )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:80:1: (otherlv_0= 'TransitionSystem' ( (lv_adt_1_0= ruleADT ) ) otherlv_2= 'initialState' otherlv_3= '=' ( (lv_initialState_4_0= ruleTerm ) ) otherlv_5= 'Strategies' ( (lv_auxiliary_6_0= ruleAuxiliary ) )* otherlv_7= 'Transitions' ( (lv_transitions_8_0= ruleTransition ) ) ( (lv_transitions_9_0= ruleTransition ) )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:80:3: otherlv_0= 'TransitionSystem' ( (lv_adt_1_0= ruleADT ) ) otherlv_2= 'initialState' otherlv_3= '=' ( (lv_initialState_4_0= ruleTerm ) ) otherlv_5= 'Strategies' ( (lv_auxiliary_6_0= ruleAuxiliary ) )* otherlv_7= 'Transitions' ( (lv_transitions_8_0= ruleTransition ) ) ( (lv_transitions_9_0= ruleTransition ) )*
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
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:154:1: ( (lv_transitions_8_0= ruleTransition ) )
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

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:172:2: ( (lv_transitions_9_0= ruleTransition ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:173:1: (lv_transitions_9_0= ruleTransition )
            	    {
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:173:1: (lv_transitions_9_0= ruleTransition )
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:174:3: lv_transitions_9_0= ruleTransition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTransitionSystemAccess().getTransitionsTransitionParserRuleCall_9_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleTransitionSystem276);
            	    lv_transitions_9_0=ruleTransition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTransitionSystemRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"transitions",
            	              		lv_transitions_9_0, 
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:198:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:199:2: (iv_ruleTransition= ruleTransition EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:200:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_entryRuleTransition313);
            iv_ruleTransition=ruleTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransition323); if (state.failed) return current;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:207:1: ruleTransition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_body_2_0= ruleNonVariableStrategy ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_body_2_0 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:210:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_body_2_0= ruleNonVariableStrategy ) ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:211:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_body_2_0= ruleNonVariableStrategy ) ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:211:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_body_2_0= ruleNonVariableStrategy ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:211:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_body_2_0= ruleNonVariableStrategy ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:211:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:212:1: (lv_name_0_0= RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:212:1: (lv_name_0_0= RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:213:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTransition365); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTransition382); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getEqualsSignKeyword_1());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:233:1: ( (lv_body_2_0= ruleNonVariableStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:234:1: (lv_body_2_0= ruleNonVariableStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:234:1: (lv_body_2_0= ruleNonVariableStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:235:3: lv_body_2_0= ruleNonVariableStrategy
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionAccess().getBodyNonVariableStrategyParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNonVariableStrategy_in_ruleTransition403);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:259:1: entryRuleAuxiliary returns [EObject current=null] : iv_ruleAuxiliary= ruleAuxiliary EOF ;
    public final EObject entryRuleAuxiliary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuxiliary = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:260:2: (iv_ruleAuxiliary= ruleAuxiliary EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:261:2: iv_ruleAuxiliary= ruleAuxiliary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAuxiliaryRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAuxiliary_in_entryRuleAuxiliary439);
            iv_ruleAuxiliary=ruleAuxiliary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAuxiliary; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAuxiliary449); if (state.failed) return current;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:268:1: ruleAuxiliary returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_formalParams_2_0= ruleVariableStrategy ) ) (otherlv_3= ',' ( (lv_formalParams_4_0= ruleVariableStrategy ) ) )* otherlv_5= ')' )? otherlv_6= '=' ( (lv_body_7_0= ruleNonVariableStrategy ) ) ) ;
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
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:271:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_formalParams_2_0= ruleVariableStrategy ) ) (otherlv_3= ',' ( (lv_formalParams_4_0= ruleVariableStrategy ) ) )* otherlv_5= ')' )? otherlv_6= '=' ( (lv_body_7_0= ruleNonVariableStrategy ) ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:272:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_formalParams_2_0= ruleVariableStrategy ) ) (otherlv_3= ',' ( (lv_formalParams_4_0= ruleVariableStrategy ) ) )* otherlv_5= ')' )? otherlv_6= '=' ( (lv_body_7_0= ruleNonVariableStrategy ) ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:272:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_formalParams_2_0= ruleVariableStrategy ) ) (otherlv_3= ',' ( (lv_formalParams_4_0= ruleVariableStrategy ) ) )* otherlv_5= ')' )? otherlv_6= '=' ( (lv_body_7_0= ruleNonVariableStrategy ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:272:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_formalParams_2_0= ruleVariableStrategy ) ) (otherlv_3= ',' ( (lv_formalParams_4_0= ruleVariableStrategy ) ) )* otherlv_5= ')' )? otherlv_6= '=' ( (lv_body_7_0= ruleNonVariableStrategy ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:272:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:273:1: (lv_name_0_0= RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:273:1: (lv_name_0_0= RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:274:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAuxiliary491); if (state.failed) return current;
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

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:290:2: (otherlv_1= '(' ( (lv_formalParams_2_0= ruleVariableStrategy ) ) (otherlv_3= ',' ( (lv_formalParams_4_0= ruleVariableStrategy ) ) )* otherlv_5= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:290:4: otherlv_1= '(' ( (lv_formalParams_2_0= ruleVariableStrategy ) ) (otherlv_3= ',' ( (lv_formalParams_4_0= ruleVariableStrategy ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAuxiliary509); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAuxiliaryAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:294:1: ( (lv_formalParams_2_0= ruleVariableStrategy ) )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:295:1: (lv_formalParams_2_0= ruleVariableStrategy )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:295:1: (lv_formalParams_2_0= ruleVariableStrategy )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:296:3: lv_formalParams_2_0= ruleVariableStrategy
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAuxiliaryAccess().getFormalParamsVariableStrategyParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariableStrategy_in_ruleAuxiliary530);
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

                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:312:2: (otherlv_3= ',' ( (lv_formalParams_4_0= ruleVariableStrategy ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==18) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:312:4: otherlv_3= ',' ( (lv_formalParams_4_0= ruleVariableStrategy ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAuxiliary543); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getAuxiliaryAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:316:1: ( (lv_formalParams_4_0= ruleVariableStrategy ) )
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:317:1: (lv_formalParams_4_0= ruleVariableStrategy )
                    	    {
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:317:1: (lv_formalParams_4_0= ruleVariableStrategy )
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:318:3: lv_formalParams_4_0= ruleVariableStrategy
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAuxiliaryAccess().getFormalParamsVariableStrategyParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleVariableStrategy_in_ruleAuxiliary564);
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

                    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAuxiliary578); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAuxiliaryAccess().getRightParenthesisKeyword_1_3());
                          
                    }

                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAuxiliary592); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getAuxiliaryAccess().getEqualsSignKeyword_2());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:342:1: ( (lv_body_7_0= ruleNonVariableStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:343:1: (lv_body_7_0= ruleNonVariableStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:343:1: (lv_body_7_0= ruleNonVariableStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:344:3: lv_body_7_0= ruleNonVariableStrategy
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAuxiliaryAccess().getBodyNonVariableStrategyParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleNonVariableStrategy_in_ruleAuxiliary613);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:368:1: entryRuleStrategy returns [EObject current=null] : iv_ruleStrategy= ruleStrategy EOF ;
    public final EObject entryRuleStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategy = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:369:2: (iv_ruleStrategy= ruleStrategy EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:370:2: iv_ruleStrategy= ruleStrategy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStrategyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_entryRuleStrategy649);
            iv_ruleStrategy=ruleStrategy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStrategy; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStrategy659); if (state.failed) return current;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:377:1: ruleStrategy returns [EObject current=null] : (this_NonVariableStrategy_0= ruleNonVariableStrategy | this_VariableStrategy_1= ruleVariableStrategy ) ;
    public final EObject ruleStrategy() throws RecognitionException {
        EObject current = null;

        EObject this_NonVariableStrategy_0 = null;

        EObject this_VariableStrategy_1 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:380:28: ( (this_NonVariableStrategy_0= ruleNonVariableStrategy | this_VariableStrategy_1= ruleVariableStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:381:1: (this_NonVariableStrategy_0= ruleNonVariableStrategy | this_VariableStrategy_1= ruleVariableStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:381:1: (this_NonVariableStrategy_0= ruleNonVariableStrategy | this_VariableStrategy_1= ruleVariableStrategy )
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:382:5: this_NonVariableStrategy_0= ruleNonVariableStrategy
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStrategyAccess().getNonVariableStrategyParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNonVariableStrategy_in_ruleStrategy706);
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:392:5: this_VariableStrategy_1= ruleVariableStrategy
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStrategyAccess().getVariableStrategyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariableStrategy_in_ruleStrategy733);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:408:1: entryRuleNonVariableStrategy returns [EObject current=null] : iv_ruleNonVariableStrategy= ruleNonVariableStrategy EOF ;
    public final EObject entryRuleNonVariableStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonVariableStrategy = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:409:2: (iv_ruleNonVariableStrategy= ruleNonVariableStrategy EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:410:2: iv_ruleNonVariableStrategy= ruleNonVariableStrategy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNonVariableStrategyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNonVariableStrategy_in_entryRuleNonVariableStrategy768);
            iv_ruleNonVariableStrategy=ruleNonVariableStrategy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNonVariableStrategy; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNonVariableStrategy778); if (state.failed) return current;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:417:1: ruleNonVariableStrategy returns [EObject current=null] : ( ( ( rulePredefStrats )=>this_PredefStrats_0= rulePredefStrats ) | this_DeclaredStrategyInstance_1= ruleDeclaredStrategyInstance ) ;
    public final EObject ruleNonVariableStrategy() throws RecognitionException {
        EObject current = null;

        EObject this_PredefStrats_0 = null;

        EObject this_DeclaredStrategyInstance_1 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:420:28: ( ( ( ( rulePredefStrats )=>this_PredefStrats_0= rulePredefStrats ) | this_DeclaredStrategyInstance_1= ruleDeclaredStrategyInstance ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:421:1: ( ( ( rulePredefStrats )=>this_PredefStrats_0= rulePredefStrats ) | this_DeclaredStrategyInstance_1= ruleDeclaredStrategyInstance )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:421:1: ( ( ( rulePredefStrats )=>this_PredefStrats_0= rulePredefStrats ) | this_DeclaredStrategyInstance_1= ruleDeclaredStrategyInstance )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:421:2: ( ( rulePredefStrats )=>this_PredefStrats_0= rulePredefStrats )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:421:2: ( ( rulePredefStrats )=>this_PredefStrats_0= rulePredefStrats )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:421:3: ( rulePredefStrats )=>this_PredefStrats_0= rulePredefStrats
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNonVariableStrategyAccess().getPredefStratsParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePredefStrats_in_ruleNonVariableStrategy831);
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:432:5: this_DeclaredStrategyInstance_1= ruleDeclaredStrategyInstance
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNonVariableStrategyAccess().getDeclaredStrategyInstanceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaredStrategyInstance_in_ruleNonVariableStrategy859);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:448:1: entryRulePredefStrats returns [EObject current=null] : iv_rulePredefStrats= rulePredefStrats EOF ;
    public final EObject entryRulePredefStrats() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredefStrats = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:449:2: (iv_rulePredefStrats= rulePredefStrats EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:450:2: iv_rulePredefStrats= rulePredefStrats EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPredefStratsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePredefStrats_in_entryRulePredefStrats894);
            iv_rulePredefStrats=rulePredefStrats();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePredefStrats; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePredefStrats904); if (state.failed) return current;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:457:1: rulePredefStrats returns [EObject current=null] : (this_Identity_0= ruleIdentity | this_Fail_1= ruleFail | this_Choice_2= ruleChoice | this_Sequence_3= ruleSequence | this_Fixpoint_4= ruleFixpoint | this_IfThenElse_5= ruleIfThenElse | this_Not_6= ruleNot | this_SimpleStrategy_7= ruleSimpleStrategy | this_One_8= ruleOne | this_Saturation_9= ruleSaturation | this_Union_10= ruleUnion ) ;
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
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:460:28: ( (this_Identity_0= ruleIdentity | this_Fail_1= ruleFail | this_Choice_2= ruleChoice | this_Sequence_3= ruleSequence | this_Fixpoint_4= ruleFixpoint | this_IfThenElse_5= ruleIfThenElse | this_Not_6= ruleNot | this_SimpleStrategy_7= ruleSimpleStrategy | this_One_8= ruleOne | this_Saturation_9= ruleSaturation | this_Union_10= ruleUnion ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:461:1: (this_Identity_0= ruleIdentity | this_Fail_1= ruleFail | this_Choice_2= ruleChoice | this_Sequence_3= ruleSequence | this_Fixpoint_4= ruleFixpoint | this_IfThenElse_5= ruleIfThenElse | this_Not_6= ruleNot | this_SimpleStrategy_7= ruleSimpleStrategy | this_One_8= ruleOne | this_Saturation_9= ruleSaturation | this_Union_10= ruleUnion )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:461:1: (this_Identity_0= ruleIdentity | this_Fail_1= ruleFail | this_Choice_2= ruleChoice | this_Sequence_3= ruleSequence | this_Fixpoint_4= ruleFixpoint | this_IfThenElse_5= ruleIfThenElse | this_Not_6= ruleNot | this_SimpleStrategy_7= ruleSimpleStrategy | this_One_8= ruleOne | this_Saturation_9= ruleSaturation | this_Union_10= ruleUnion )
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:462:5: this_Identity_0= ruleIdentity
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPredefStratsAccess().getIdentityParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIdentity_in_rulePredefStrats951);
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:472:5: this_Fail_1= ruleFail
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPredefStratsAccess().getFailParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFail_in_rulePredefStrats978);
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:482:5: this_Choice_2= ruleChoice
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPredefStratsAccess().getChoiceParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleChoice_in_rulePredefStrats1005);
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:492:5: this_Sequence_3= ruleSequence
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPredefStratsAccess().getSequenceParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSequence_in_rulePredefStrats1032);
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:502:5: this_Fixpoint_4= ruleFixpoint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPredefStratsAccess().getFixpointParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFixpoint_in_rulePredefStrats1059);
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:512:5: this_IfThenElse_5= ruleIfThenElse
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPredefStratsAccess().getIfThenElseParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIfThenElse_in_rulePredefStrats1086);
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:522:5: this_Not_6= ruleNot
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPredefStratsAccess().getNotParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNot_in_rulePredefStrats1113);
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:532:5: this_SimpleStrategy_7= ruleSimpleStrategy
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPredefStratsAccess().getSimpleStrategyParserRuleCall_7()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleStrategy_in_rulePredefStrats1140);
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:542:5: this_One_8= ruleOne
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPredefStratsAccess().getOneParserRuleCall_8()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleOne_in_rulePredefStrats1167);
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:552:5: this_Saturation_9= ruleSaturation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPredefStratsAccess().getSaturationParserRuleCall_9()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSaturation_in_rulePredefStrats1194);
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:562:5: this_Union_10= ruleUnion
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPredefStratsAccess().getUnionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnion_in_rulePredefStrats1221);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:578:1: entryRuleOne returns [EObject current=null] : iv_ruleOne= ruleOne EOF ;
    public final EObject entryRuleOne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOne = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:579:2: (iv_ruleOne= ruleOne EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:580:2: iv_ruleOne= ruleOne EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOneRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOne_in_entryRuleOne1256);
            iv_ruleOne=ruleOne();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOne; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOne1266); if (state.failed) return current;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:587:1: ruleOne returns [EObject current=null] : (otherlv_0= 'One' otherlv_1= '(' ( (lv_S_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_n_4_0= RULE_INT ) ) otherlv_5= ')' ) ;
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
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:590:28: ( (otherlv_0= 'One' otherlv_1= '(' ( (lv_S_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_n_4_0= RULE_INT ) ) otherlv_5= ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:591:1: (otherlv_0= 'One' otherlv_1= '(' ( (lv_S_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_n_4_0= RULE_INT ) ) otherlv_5= ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:591:1: (otherlv_0= 'One' otherlv_1= '(' ( (lv_S_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_n_4_0= RULE_INT ) ) otherlv_5= ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:591:3: otherlv_0= 'One' otherlv_1= '(' ( (lv_S_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_n_4_0= RULE_INT ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleOne1303); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOneAccess().getOneKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleOne1315); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOneAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:599:1: ( (lv_S_2_0= ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:600:1: (lv_S_2_0= ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:600:1: (lv_S_2_0= ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:601:3: lv_S_2_0= ruleStrategy
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOneAccess().getSStrategyParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleOne1336);
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

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOne1348); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getOneAccess().getCommaKeyword_3());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:621:1: ( (lv_n_4_0= RULE_INT ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:622:1: (lv_n_4_0= RULE_INT )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:622:1: (lv_n_4_0= RULE_INT )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:623:3: lv_n_4_0= RULE_INT
            {
            lv_n_4_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleOne1365); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleOne1382); if (state.failed) return current;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:651:1: entryRuleDeclaredStrategyInstance returns [EObject current=null] : iv_ruleDeclaredStrategyInstance= ruleDeclaredStrategyInstance EOF ;
    public final EObject entryRuleDeclaredStrategyInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredStrategyInstance = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:652:2: (iv_ruleDeclaredStrategyInstance= ruleDeclaredStrategyInstance EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:653:2: iv_ruleDeclaredStrategyInstance= ruleDeclaredStrategyInstance EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaredStrategyInstanceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclaredStrategyInstance_in_entryRuleDeclaredStrategyInstance1418);
            iv_ruleDeclaredStrategyInstance=ruleDeclaredStrategyInstance();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaredStrategyInstance; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaredStrategyInstance1428); if (state.failed) return current;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:660:1: ruleDeclaredStrategyInstance returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_actualParams_3_0= ruleStrategy ) ) (otherlv_4= ',' ( (lv_actualParams_5_0= ruleStrategy ) ) )* )? otherlv_6= ')' ) ;
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
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:663:28: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_actualParams_3_0= ruleStrategy ) ) (otherlv_4= ',' ( (lv_actualParams_5_0= ruleStrategy ) ) )* )? otherlv_6= ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:664:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_actualParams_3_0= ruleStrategy ) ) (otherlv_4= ',' ( (lv_actualParams_5_0= ruleStrategy ) ) )* )? otherlv_6= ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:664:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_actualParams_3_0= ruleStrategy ) ) (otherlv_4= ',' ( (lv_actualParams_5_0= ruleStrategy ) ) )* )? otherlv_6= ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:664:2: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( ( (lv_actualParams_3_0= ruleStrategy ) ) (otherlv_4= ',' ( (lv_actualParams_5_0= ruleStrategy ) ) )* )? otherlv_6= ')'
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:664:2: ()
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:665:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDeclaredStrategyInstanceAccess().getDeclaredStrategyInstanceAction_0(),
                          current);
                  
            }

            }

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:670:2: ( (otherlv_1= RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:671:1: (otherlv_1= RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:671:1: (otherlv_1= RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:672:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDeclaredStrategyInstanceRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDeclaredStrategyInstance1482); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getDeclaredStrategyInstanceAccess().getDeclarationDeclaredStrategyCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDeclaredStrategyInstance1494); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDeclaredStrategyInstanceAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:687:1: ( ( (lv_actualParams_3_0= ruleStrategy ) ) (otherlv_4= ',' ( (lv_actualParams_5_0= ruleStrategy ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||(LA9_0>=20 && LA9_0<=23)||(LA9_0>=25 && LA9_0<=31)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:687:2: ( (lv_actualParams_3_0= ruleStrategy ) ) (otherlv_4= ',' ( (lv_actualParams_5_0= ruleStrategy ) ) )*
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:687:2: ( (lv_actualParams_3_0= ruleStrategy ) )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:688:1: (lv_actualParams_3_0= ruleStrategy )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:688:1: (lv_actualParams_3_0= ruleStrategy )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:689:3: lv_actualParams_3_0= ruleStrategy
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeclaredStrategyInstanceAccess().getActualParamsStrategyParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleDeclaredStrategyInstance1516);
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

                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:705:2: (otherlv_4= ',' ( (lv_actualParams_5_0= ruleStrategy ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==18) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:705:4: otherlv_4= ',' ( (lv_actualParams_5_0= ruleStrategy ) )
                    	    {
                    	    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDeclaredStrategyInstance1529); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getDeclaredStrategyInstanceAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:709:1: ( (lv_actualParams_5_0= ruleStrategy ) )
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:710:1: (lv_actualParams_5_0= ruleStrategy )
                    	    {
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:710:1: (lv_actualParams_5_0= ruleStrategy )
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:711:3: lv_actualParams_5_0= ruleStrategy
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDeclaredStrategyInstanceAccess().getActualParamsStrategyParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleDeclaredStrategyInstance1550);
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

            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDeclaredStrategyInstance1566); if (state.failed) return current;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:739:1: entryRuleSaturation returns [EObject current=null] : iv_ruleSaturation= ruleSaturation EOF ;
    public final EObject entryRuleSaturation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSaturation = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:740:2: (iv_ruleSaturation= ruleSaturation EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:741:2: iv_ruleSaturation= ruleSaturation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSaturationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSaturation_in_entryRuleSaturation1602);
            iv_ruleSaturation=ruleSaturation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSaturation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSaturation1612); if (state.failed) return current;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:748:1: ruleSaturation returns [EObject current=null] : (otherlv_0= 'Saturation' otherlv_1= '(' ( (lv_S_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_n_4_0= RULE_INT ) ) otherlv_5= ')' ) ;
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
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:751:28: ( (otherlv_0= 'Saturation' otherlv_1= '(' ( (lv_S_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_n_4_0= RULE_INT ) ) otherlv_5= ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:752:1: (otherlv_0= 'Saturation' otherlv_1= '(' ( (lv_S_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_n_4_0= RULE_INT ) ) otherlv_5= ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:752:1: (otherlv_0= 'Saturation' otherlv_1= '(' ( (lv_S_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_n_4_0= RULE_INT ) ) otherlv_5= ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:752:3: otherlv_0= 'Saturation' otherlv_1= '(' ( (lv_S_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_n_4_0= RULE_INT ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleSaturation1649); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSaturationAccess().getSaturationKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSaturation1661); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSaturationAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:760:1: ( (lv_S_2_0= ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:761:1: (lv_S_2_0= ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:761:1: (lv_S_2_0= ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:762:3: lv_S_2_0= ruleStrategy
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSaturationAccess().getSStrategyParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleSaturation1682);
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

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSaturation1694); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSaturationAccess().getCommaKeyword_3());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:782:1: ( (lv_n_4_0= RULE_INT ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:783:1: (lv_n_4_0= RULE_INT )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:783:1: (lv_n_4_0= RULE_INT )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:784:3: lv_n_4_0= RULE_INT
            {
            lv_n_4_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleSaturation1711); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSaturation1728); if (state.failed) return current;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:812:1: entryRuleIfThenElse returns [EObject current=null] : iv_ruleIfThenElse= ruleIfThenElse EOF ;
    public final EObject entryRuleIfThenElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfThenElse = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:813:2: (iv_ruleIfThenElse= ruleIfThenElse EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:814:2: iv_ruleIfThenElse= ruleIfThenElse EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfThenElseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIfThenElse_in_entryRuleIfThenElse1764);
            iv_ruleIfThenElse=ruleIfThenElse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfThenElse; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIfThenElse1774); if (state.failed) return current;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:821:1: ruleIfThenElse returns [EObject current=null] : (otherlv_0= 'IfThenElse' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ',' ( (lv_S3_6_0= ruleStrategy ) ) otherlv_7= ')' ) ;
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
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:824:28: ( (otherlv_0= 'IfThenElse' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ',' ( (lv_S3_6_0= ruleStrategy ) ) otherlv_7= ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:825:1: (otherlv_0= 'IfThenElse' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ',' ( (lv_S3_6_0= ruleStrategy ) ) otherlv_7= ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:825:1: (otherlv_0= 'IfThenElse' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ',' ( (lv_S3_6_0= ruleStrategy ) ) otherlv_7= ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:825:3: otherlv_0= 'IfThenElse' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ',' ( (lv_S3_6_0= ruleStrategy ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleIfThenElse1811); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfThenElseAccess().getIfThenElseKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleIfThenElse1823); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIfThenElseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:833:1: ( (lv_S1_2_0= ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:834:1: (lv_S1_2_0= ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:834:1: (lv_S1_2_0= ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:835:3: lv_S1_2_0= ruleStrategy
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfThenElseAccess().getS1StrategyParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleIfThenElse1844);
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

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleIfThenElse1856); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIfThenElseAccess().getCommaKeyword_3());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:855:1: ( (lv_S2_4_0= ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:856:1: (lv_S2_4_0= ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:856:1: (lv_S2_4_0= ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:857:3: lv_S2_4_0= ruleStrategy
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfThenElseAccess().getS2StrategyParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleIfThenElse1877);
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

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleIfThenElse1889); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getIfThenElseAccess().getCommaKeyword_5());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:877:1: ( (lv_S3_6_0= ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:878:1: (lv_S3_6_0= ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:878:1: (lv_S3_6_0= ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:879:3: lv_S3_6_0= ruleStrategy
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfThenElseAccess().getS3StrategyParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleIfThenElse1910);
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

            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleIfThenElse1922); if (state.failed) return current;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:907:1: entryRuleSimpleStrategy returns [EObject current=null] : iv_ruleSimpleStrategy= ruleSimpleStrategy EOF ;
    public final EObject entryRuleSimpleStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleStrategy = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:908:2: (iv_ruleSimpleStrategy= ruleSimpleStrategy EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:909:2: iv_ruleSimpleStrategy= ruleSimpleStrategy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleStrategyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSimpleStrategy_in_entryRuleSimpleStrategy1958);
            iv_ruleSimpleStrategy=ruleSimpleStrategy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleStrategy; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleStrategy1968); if (state.failed) return current;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:916:1: ruleSimpleStrategy returns [EObject current=null] : (otherlv_0= '{' ( (lv_equations_1_0= ruleRewriteRule ) ) (otherlv_2= ',' ( (lv_equations_3_0= ruleRewriteRule ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleSimpleStrategy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_equations_1_0 = null;

        EObject lv_equations_3_0 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:919:28: ( (otherlv_0= '{' ( (lv_equations_1_0= ruleRewriteRule ) ) (otherlv_2= ',' ( (lv_equations_3_0= ruleRewriteRule ) ) )* otherlv_4= '}' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:920:1: (otherlv_0= '{' ( (lv_equations_1_0= ruleRewriteRule ) ) (otherlv_2= ',' ( (lv_equations_3_0= ruleRewriteRule ) ) )* otherlv_4= '}' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:920:1: (otherlv_0= '{' ( (lv_equations_1_0= ruleRewriteRule ) ) (otherlv_2= ',' ( (lv_equations_3_0= ruleRewriteRule ) ) )* otherlv_4= '}' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:920:3: otherlv_0= '{' ( (lv_equations_1_0= ruleRewriteRule ) ) (otherlv_2= ',' ( (lv_equations_3_0= ruleRewriteRule ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSimpleStrategy2005); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSimpleStrategyAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:924:1: ( (lv_equations_1_0= ruleRewriteRule ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:925:1: (lv_equations_1_0= ruleRewriteRule )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:925:1: (lv_equations_1_0= ruleRewriteRule )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:926:3: lv_equations_1_0= ruleRewriteRule
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSimpleStrategyAccess().getEquationsRewriteRuleParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleRewriteRule_in_ruleSimpleStrategy2026);
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

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:942:2: (otherlv_2= ',' ( (lv_equations_3_0= ruleRewriteRule ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:942:4: otherlv_2= ',' ( (lv_equations_3_0= ruleRewriteRule ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSimpleStrategy2039); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSimpleStrategyAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:946:1: ( (lv_equations_3_0= ruleRewriteRule ) )
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:947:1: (lv_equations_3_0= ruleRewriteRule )
            	    {
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:947:1: (lv_equations_3_0= ruleRewriteRule )
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:948:3: lv_equations_3_0= ruleRewriteRule
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSimpleStrategyAccess().getEquationsRewriteRuleParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleRewriteRule_in_ruleSimpleStrategy2060);
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

            otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSimpleStrategy2074); if (state.failed) return current;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:976:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:977:2: (iv_ruleNot= ruleNot EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:978:2: iv_ruleNot= ruleNot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNot_in_entryRuleNot2110);
            iv_ruleNot=ruleNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNot; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNot2120); if (state.failed) return current;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:985:1: ruleNot returns [EObject current=null] : (otherlv_0= 'Not' otherlv_1= '(' ( (lv_S_2_0= ruleSimpleStrategy ) ) otherlv_3= ')' ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_S_2_0 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:988:28: ( (otherlv_0= 'Not' otherlv_1= '(' ( (lv_S_2_0= ruleSimpleStrategy ) ) otherlv_3= ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:989:1: (otherlv_0= 'Not' otherlv_1= '(' ( (lv_S_2_0= ruleSimpleStrategy ) ) otherlv_3= ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:989:1: (otherlv_0= 'Not' otherlv_1= '(' ( (lv_S_2_0= ruleSimpleStrategy ) ) otherlv_3= ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:989:3: otherlv_0= 'Not' otherlv_1= '(' ( (lv_S_2_0= ruleSimpleStrategy ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleNot2157); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNotAccess().getNotKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleNot2169); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNotAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:997:1: ( (lv_S_2_0= ruleSimpleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:998:1: (lv_S_2_0= ruleSimpleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:998:1: (lv_S_2_0= ruleSimpleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:999:3: lv_S_2_0= ruleSimpleStrategy
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNotAccess().getSSimpleStrategyParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleSimpleStrategy_in_ruleNot2190);
            lv_S_2_0=ruleSimpleStrategy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNotRule());
              	        }
                     		set(
                     			current, 
                     			"S",
                      		lv_S_2_0, 
                      		"SimpleStrategy");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleNot2202); if (state.failed) return current;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1027:1: entryRuleFixpoint returns [EObject current=null] : iv_ruleFixpoint= ruleFixpoint EOF ;
    public final EObject entryRuleFixpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFixpoint = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1028:2: (iv_ruleFixpoint= ruleFixpoint EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1029:2: iv_ruleFixpoint= ruleFixpoint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFixpointRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFixpoint_in_entryRuleFixpoint2238);
            iv_ruleFixpoint=ruleFixpoint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFixpoint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFixpoint2248); if (state.failed) return current;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1036:1: ruleFixpoint returns [EObject current=null] : (otherlv_0= 'Fixpoint' otherlv_1= '(' ( (lv_S_2_0= ruleStrategy ) ) otherlv_3= ')' ) ;
    public final EObject ruleFixpoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_S_2_0 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1039:28: ( (otherlv_0= 'Fixpoint' otherlv_1= '(' ( (lv_S_2_0= ruleStrategy ) ) otherlv_3= ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1040:1: (otherlv_0= 'Fixpoint' otherlv_1= '(' ( (lv_S_2_0= ruleStrategy ) ) otherlv_3= ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1040:1: (otherlv_0= 'Fixpoint' otherlv_1= '(' ( (lv_S_2_0= ruleStrategy ) ) otherlv_3= ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1040:3: otherlv_0= 'Fixpoint' otherlv_1= '(' ( (lv_S_2_0= ruleStrategy ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleFixpoint2285); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFixpointAccess().getFixpointKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFixpoint2297); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFixpointAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1048:1: ( (lv_S_2_0= ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1049:1: (lv_S_2_0= ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1049:1: (lv_S_2_0= ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1050:3: lv_S_2_0= ruleStrategy
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFixpointAccess().getSStrategyParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleFixpoint2318);
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

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFixpoint2330); if (state.failed) return current;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1078:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1079:2: (iv_ruleChoice= ruleChoice EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1080:2: iv_ruleChoice= ruleChoice EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChoiceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleChoice_in_entryRuleChoice2366);
            iv_ruleChoice=ruleChoice();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChoice; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChoice2376); if (state.failed) return current;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1087:1: ruleChoice returns [EObject current=null] : (otherlv_0= 'Choice' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ')' ) ;
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
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1090:28: ( (otherlv_0= 'Choice' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1091:1: (otherlv_0= 'Choice' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1091:1: (otherlv_0= 'Choice' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1091:3: otherlv_0= 'Choice' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleChoice2413); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getChoiceAccess().getChoiceKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleChoice2425); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getChoiceAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1099:1: ( (lv_S1_2_0= ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1100:1: (lv_S1_2_0= ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1100:1: (lv_S1_2_0= ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1101:3: lv_S1_2_0= ruleStrategy
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getChoiceAccess().getS1StrategyParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleChoice2446);
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

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleChoice2458); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getChoiceAccess().getCommaKeyword_3());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1121:1: ( (lv_S2_4_0= ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1122:1: (lv_S2_4_0= ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1122:1: (lv_S2_4_0= ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1123:3: lv_S2_4_0= ruleStrategy
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getChoiceAccess().getS2StrategyParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleChoice2479);
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

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleChoice2491); if (state.failed) return current;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1151:1: entryRuleUnion returns [EObject current=null] : iv_ruleUnion= ruleUnion EOF ;
    public final EObject entryRuleUnion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnion = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1152:2: (iv_ruleUnion= ruleUnion EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1153:2: iv_ruleUnion= ruleUnion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnion_in_entryRuleUnion2527);
            iv_ruleUnion=ruleUnion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnion; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnion2537); if (state.failed) return current;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1160:1: ruleUnion returns [EObject current=null] : (otherlv_0= 'Union' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ')' ) ;
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
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1163:28: ( (otherlv_0= 'Union' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1164:1: (otherlv_0= 'Union' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1164:1: (otherlv_0= 'Union' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1164:3: otherlv_0= 'Union' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleUnion2574); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUnionAccess().getUnionKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleUnion2586); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUnionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1172:1: ( (lv_S1_2_0= ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1173:1: (lv_S1_2_0= ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1173:1: (lv_S1_2_0= ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1174:3: lv_S1_2_0= ruleStrategy
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnionAccess().getS1StrategyParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleUnion2607);
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

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleUnion2619); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getUnionAccess().getCommaKeyword_3());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1194:1: ( (lv_S2_4_0= ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1195:1: (lv_S2_4_0= ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1195:1: (lv_S2_4_0= ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1196:3: lv_S2_4_0= ruleStrategy
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnionAccess().getS2StrategyParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleUnion2640);
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

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleUnion2652); if (state.failed) return current;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1224:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1225:2: (iv_ruleSequence= ruleSequence EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1226:2: iv_ruleSequence= ruleSequence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSequenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSequence_in_entryRuleSequence2688);
            iv_ruleSequence=ruleSequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSequence; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSequence2698); if (state.failed) return current;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1233:1: ruleSequence returns [EObject current=null] : (otherlv_0= 'Sequence' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ')' ) ;
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
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1236:28: ( (otherlv_0= 'Sequence' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1237:1: (otherlv_0= 'Sequence' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1237:1: (otherlv_0= 'Sequence' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1237:3: otherlv_0= 'Sequence' otherlv_1= '(' ( (lv_S1_2_0= ruleStrategy ) ) otherlv_3= ',' ( (lv_S2_4_0= ruleStrategy ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleSequence2735); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSequenceAccess().getSequenceKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSequence2747); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSequenceAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1245:1: ( (lv_S1_2_0= ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1246:1: (lv_S1_2_0= ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1246:1: (lv_S1_2_0= ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1247:3: lv_S1_2_0= ruleStrategy
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSequenceAccess().getS1StrategyParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleSequence2768);
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

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSequence2780); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSequenceAccess().getCommaKeyword_3());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1267:1: ( (lv_S2_4_0= ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1268:1: (lv_S2_4_0= ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1268:1: (lv_S2_4_0= ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1269:3: lv_S2_4_0= ruleStrategy
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSequenceAccess().getS2StrategyParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_ruleSequence2801);
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

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSequence2813); if (state.failed) return current;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1297:1: entryRuleIdentity returns [EObject current=null] : iv_ruleIdentity= ruleIdentity EOF ;
    public final EObject entryRuleIdentity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentity = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1298:2: (iv_ruleIdentity= ruleIdentity EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1299:2: iv_ruleIdentity= ruleIdentity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentityRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentity_in_entryRuleIdentity2849);
            iv_ruleIdentity=ruleIdentity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentity; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentity2859); if (state.failed) return current;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1306:1: ruleIdentity returns [EObject current=null] : (otherlv_0= 'Identity' () ) ;
    public final EObject ruleIdentity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1309:28: ( (otherlv_0= 'Identity' () ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1310:1: (otherlv_0= 'Identity' () )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1310:1: (otherlv_0= 'Identity' () )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1310:3: otherlv_0= 'Identity' ()
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleIdentity2896); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIdentityAccess().getIdentityKeyword_0());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1314:1: ()
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1315:5: 
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1328:1: entryRuleFail returns [EObject current=null] : iv_ruleFail= ruleFail EOF ;
    public final EObject entryRuleFail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFail = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1329:2: (iv_ruleFail= ruleFail EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1330:2: iv_ruleFail= ruleFail EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFailRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFail_in_entryRuleFail2941);
            iv_ruleFail=ruleFail();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFail; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFail2951); if (state.failed) return current;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1337:1: ruleFail returns [EObject current=null] : (otherlv_0= 'Fail' () ) ;
    public final EObject ruleFail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1340:28: ( (otherlv_0= 'Fail' () ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1341:1: (otherlv_0= 'Fail' () )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1341:1: (otherlv_0= 'Fail' () )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1341:3: otherlv_0= 'Fail' ()
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleFail2988); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFailAccess().getFailKeyword_0());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1345:1: ()
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1346:5: 
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1359:1: entryRuleVariableStrategy returns [EObject current=null] : iv_ruleVariableStrategy= ruleVariableStrategy EOF ;
    public final EObject entryRuleVariableStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableStrategy = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1360:2: (iv_ruleVariableStrategy= ruleVariableStrategy EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1361:2: iv_ruleVariableStrategy= ruleVariableStrategy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableStrategyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableStrategy_in_entryRuleVariableStrategy3033);
            iv_ruleVariableStrategy=ruleVariableStrategy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableStrategy; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableStrategy3043); if (state.failed) return current;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1368:1: ruleVariableStrategy returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariableStrategy() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1371:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1372:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1372:1: ( (lv_name_0_0= RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1373:1: (lv_name_0_0= RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1373:1: (lv_name_0_0= RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1374:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVariableStrategy3084); if (state.failed) return current;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1398:1: entryRuleATerm returns [EObject current=null] : iv_ruleATerm= ruleATerm EOF ;
    public final EObject entryRuleATerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleATerm = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1399:2: (iv_ruleATerm= ruleATerm EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1400:2: iv_ruleATerm= ruleATerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getATermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleATerm_in_entryRuleATerm3124);
            iv_ruleATerm=ruleATerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleATerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleATerm3134); if (state.failed) return current;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1407:1: ruleATerm returns [EObject current=null] : (this_Term_0= ruleTerm | this_Variable_1= ruleVariable ) ;
    public final EObject ruleATerm() throws RecognitionException {
        EObject current = null;

        EObject this_Term_0 = null;

        EObject this_Variable_1 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1410:28: ( (this_Term_0= ruleTerm | this_Variable_1= ruleVariable ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1411:1: (this_Term_0= ruleTerm | this_Variable_1= ruleVariable )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1411:1: (this_Term_0= ruleTerm | this_Variable_1= ruleVariable )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_TERMVAR) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1412:5: this_Term_0= ruleTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getATermAccess().getTermParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleATerm3181);
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1422:5: this_Variable_1= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getATermAccess().getVariableParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleATerm3208);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1438:1: entryRuleASort returns [EObject current=null] : iv_ruleASort= ruleASort EOF ;
    public final EObject entryRuleASort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleASort = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1439:2: (iv_ruleASort= ruleASort EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1440:2: iv_ruleASort= ruleASort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getASortRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleASort_in_entryRuleASort3243);
            iv_ruleASort=ruleASort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleASort; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleASort3253); if (state.failed) return current;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1447:1: ruleASort returns [EObject current=null] : (this_SubSort_0= ruleSubSort | this_Sort_1= ruleSort ) ;
    public final EObject ruleASort() throws RecognitionException {
        EObject current = null;

        EObject this_SubSort_0 = null;

        EObject this_Sort_1 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1450:28: ( (this_SubSort_0= ruleSubSort | this_Sort_1= ruleSort ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1451:1: (this_SubSort_0= ruleSubSort | this_Sort_1= ruleSort )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1451:1: (this_SubSort_0= ruleSubSort | this_Sort_1= ruleSort )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==41) ) {
                    alt12=1;
                }
                else if ( (LA12_1==EOF||LA12_1==18||LA12_1==37) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1452:5: this_SubSort_0= ruleSubSort
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getASortAccess().getSubSortParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSubSort_in_ruleASort3300);
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1462:5: this_Sort_1= ruleSort
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getASortAccess().getSortParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSort_in_ruleASort3327);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1478:1: entryRuleADT returns [EObject current=null] : iv_ruleADT= ruleADT EOF ;
    public final EObject entryRuleADT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleADT = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1479:2: (iv_ruleADT= ruleADT EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1480:2: iv_ruleADT= ruleADT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getADTRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleADT_in_entryRuleADT3362);
            iv_ruleADT=ruleADT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleADT; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleADT3372); if (state.failed) return current;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1487:1: ruleADT returns [EObject current=null] : (otherlv_0= 'ADT' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Signature' ( (lv_signature_3_0= ruleSignature ) ) ( ( ( 'Axioms' )=>otherlv_4= 'Axioms' ) ( (lv_equations_5_0= ruleEquation ) ) ( (lv_equations_6_0= ruleEquation ) )* )? ( ( ( 'Variables' )=>otherlv_7= 'Variables' ) ( (lv_variables_8_0= ruleVariableDeclaration ) ) ( (lv_variables_9_0= ruleVariableDeclaration ) )* )? ) ;
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
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1490:28: ( (otherlv_0= 'ADT' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Signature' ( (lv_signature_3_0= ruleSignature ) ) ( ( ( 'Axioms' )=>otherlv_4= 'Axioms' ) ( (lv_equations_5_0= ruleEquation ) ) ( (lv_equations_6_0= ruleEquation ) )* )? ( ( ( 'Variables' )=>otherlv_7= 'Variables' ) ( (lv_variables_8_0= ruleVariableDeclaration ) ) ( (lv_variables_9_0= ruleVariableDeclaration ) )* )? ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1491:1: (otherlv_0= 'ADT' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Signature' ( (lv_signature_3_0= ruleSignature ) ) ( ( ( 'Axioms' )=>otherlv_4= 'Axioms' ) ( (lv_equations_5_0= ruleEquation ) ) ( (lv_equations_6_0= ruleEquation ) )* )? ( ( ( 'Variables' )=>otherlv_7= 'Variables' ) ( (lv_variables_8_0= ruleVariableDeclaration ) ) ( (lv_variables_9_0= ruleVariableDeclaration ) )* )? )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1491:1: (otherlv_0= 'ADT' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Signature' ( (lv_signature_3_0= ruleSignature ) ) ( ( ( 'Axioms' )=>otherlv_4= 'Axioms' ) ( (lv_equations_5_0= ruleEquation ) ) ( (lv_equations_6_0= ruleEquation ) )* )? ( ( ( 'Variables' )=>otherlv_7= 'Variables' ) ( (lv_variables_8_0= ruleVariableDeclaration ) ) ( (lv_variables_9_0= ruleVariableDeclaration ) )* )? )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1491:3: otherlv_0= 'ADT' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Signature' ( (lv_signature_3_0= ruleSignature ) ) ( ( ( 'Axioms' )=>otherlv_4= 'Axioms' ) ( (lv_equations_5_0= ruleEquation ) ) ( (lv_equations_6_0= ruleEquation ) )* )? ( ( ( 'Variables' )=>otherlv_7= 'Variables' ) ( (lv_variables_8_0= ruleVariableDeclaration ) ) ( (lv_variables_9_0= ruleVariableDeclaration ) )* )?
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleADT3409); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getADTAccess().getADTKeyword_0());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1495:1: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1496:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1496:1: (lv_name_1_0= RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1497:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleADT3426); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleADT3443); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getADTAccess().getSignatureKeyword_2());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1517:1: ( (lv_signature_3_0= ruleSignature ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1518:1: (lv_signature_3_0= ruleSignature )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1518:1: (lv_signature_3_0= ruleSignature )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1519:3: lv_signature_3_0= ruleSignature
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getADTAccess().getSignatureSignatureParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleSignature_in_ruleADT3464);
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

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1535:2: ( ( ( 'Axioms' )=>otherlv_4= 'Axioms' ) ( (lv_equations_5_0= ruleEquation ) ) ( (lv_equations_6_0= ruleEquation ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) && (synpred2_InternalTransitionSystemDsl())) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1535:3: ( ( 'Axioms' )=>otherlv_4= 'Axioms' ) ( (lv_equations_5_0= ruleEquation ) ) ( (lv_equations_6_0= ruleEquation ) )*
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1535:3: ( ( 'Axioms' )=>otherlv_4= 'Axioms' )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1535:4: ( 'Axioms' )=>otherlv_4= 'Axioms'
                    {
                    otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleADT3485); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getADTAccess().getAxiomsKeyword_4_0());
                          
                    }

                    }

                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1540:2: ( (lv_equations_5_0= ruleEquation ) )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1541:1: (lv_equations_5_0= ruleEquation )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1541:1: (lv_equations_5_0= ruleEquation )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1542:3: lv_equations_5_0= ruleEquation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getADTAccess().getEquationsEquationParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEquation_in_ruleADT3507);
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

                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1558:2: ( (lv_equations_6_0= ruleEquation ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID||LA13_0==RULE_TERMVAR) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1559:1: (lv_equations_6_0= ruleEquation )
                    	    {
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1559:1: (lv_equations_6_0= ruleEquation )
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1560:3: lv_equations_6_0= ruleEquation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getADTAccess().getEquationsEquationParserRuleCall_4_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleEquation_in_ruleADT3528);
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
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1576:5: ( ( ( 'Variables' )=>otherlv_7= 'Variables' ) ( (lv_variables_8_0= ruleVariableDeclaration ) ) ( (lv_variables_9_0= ruleVariableDeclaration ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) && (synpred3_InternalTransitionSystemDsl())) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1576:6: ( ( 'Variables' )=>otherlv_7= 'Variables' ) ( (lv_variables_8_0= ruleVariableDeclaration ) ) ( (lv_variables_9_0= ruleVariableDeclaration ) )*
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1576:6: ( ( 'Variables' )=>otherlv_7= 'Variables' )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1576:7: ( 'Variables' )=>otherlv_7= 'Variables'
                    {
                    otherlv_7=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleADT3552); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getADTAccess().getVariablesKeyword_5_0());
                          
                    }

                    }

                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1581:2: ( (lv_variables_8_0= ruleVariableDeclaration ) )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1582:1: (lv_variables_8_0= ruleVariableDeclaration )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1582:1: (lv_variables_8_0= ruleVariableDeclaration )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1583:3: lv_variables_8_0= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getADTAccess().getVariablesVariableDeclarationParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariableDeclaration_in_ruleADT3574);
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

                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1599:2: ( (lv_variables_9_0= ruleVariableDeclaration ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1600:1: (lv_variables_9_0= ruleVariableDeclaration )
                    	    {
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1600:1: (lv_variables_9_0= ruleVariableDeclaration )
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1601:3: lv_variables_9_0= ruleVariableDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getADTAccess().getVariablesVariableDeclarationParserRuleCall_5_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleVariableDeclaration_in_ruleADT3595);
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
                    	    break loop15;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1625:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1626:2: (iv_ruleSignature= ruleSignature EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1627:2: iv_ruleSignature= ruleSignature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignatureRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSignature_in_entryRuleSignature3634);
            iv_ruleSignature=ruleSignature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignature; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSignature3644); if (state.failed) return current;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1634:1: ruleSignature returns [EObject current=null] : (otherlv_0= 'Sorts' ( (lv_sorts_1_0= ruleASort ) ) (otherlv_2= ',' ( (lv_sorts_3_0= ruleASort ) ) )* ( ( ( 'Generators' )=>otherlv_4= 'Generators' ) ( (lv_generators_5_0= ruleOperation ) ) ( (lv_generators_6_0= ruleOperation ) )* ) ( ( ( 'Operations' )=>otherlv_7= 'Operations' ) ( (lv_operations_8_0= ruleOperation ) ) ( (lv_operations_9_0= ruleOperation ) )* )? ) ;
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
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1637:28: ( (otherlv_0= 'Sorts' ( (lv_sorts_1_0= ruleASort ) ) (otherlv_2= ',' ( (lv_sorts_3_0= ruleASort ) ) )* ( ( ( 'Generators' )=>otherlv_4= 'Generators' ) ( (lv_generators_5_0= ruleOperation ) ) ( (lv_generators_6_0= ruleOperation ) )* ) ( ( ( 'Operations' )=>otherlv_7= 'Operations' ) ( (lv_operations_8_0= ruleOperation ) ) ( (lv_operations_9_0= ruleOperation ) )* )? ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1638:1: (otherlv_0= 'Sorts' ( (lv_sorts_1_0= ruleASort ) ) (otherlv_2= ',' ( (lv_sorts_3_0= ruleASort ) ) )* ( ( ( 'Generators' )=>otherlv_4= 'Generators' ) ( (lv_generators_5_0= ruleOperation ) ) ( (lv_generators_6_0= ruleOperation ) )* ) ( ( ( 'Operations' )=>otherlv_7= 'Operations' ) ( (lv_operations_8_0= ruleOperation ) ) ( (lv_operations_9_0= ruleOperation ) )* )? )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1638:1: (otherlv_0= 'Sorts' ( (lv_sorts_1_0= ruleASort ) ) (otherlv_2= ',' ( (lv_sorts_3_0= ruleASort ) ) )* ( ( ( 'Generators' )=>otherlv_4= 'Generators' ) ( (lv_generators_5_0= ruleOperation ) ) ( (lv_generators_6_0= ruleOperation ) )* ) ( ( ( 'Operations' )=>otherlv_7= 'Operations' ) ( (lv_operations_8_0= ruleOperation ) ) ( (lv_operations_9_0= ruleOperation ) )* )? )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1638:3: otherlv_0= 'Sorts' ( (lv_sorts_1_0= ruleASort ) ) (otherlv_2= ',' ( (lv_sorts_3_0= ruleASort ) ) )* ( ( ( 'Generators' )=>otherlv_4= 'Generators' ) ( (lv_generators_5_0= ruleOperation ) ) ( (lv_generators_6_0= ruleOperation ) )* ) ( ( ( 'Operations' )=>otherlv_7= 'Operations' ) ( (lv_operations_8_0= ruleOperation ) ) ( (lv_operations_9_0= ruleOperation ) )* )?
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleSignature3681); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSignatureAccess().getSortsKeyword_0());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1642:1: ( (lv_sorts_1_0= ruleASort ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1643:1: (lv_sorts_1_0= ruleASort )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1643:1: (lv_sorts_1_0= ruleASort )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1644:3: lv_sorts_1_0= ruleASort
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSignatureAccess().getSortsASortParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleASort_in_ruleSignature3702);
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

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1660:2: (otherlv_2= ',' ( (lv_sorts_3_0= ruleASort ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==18) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1660:4: otherlv_2= ',' ( (lv_sorts_3_0= ruleASort ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSignature3715); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSignatureAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1664:1: ( (lv_sorts_3_0= ruleASort ) )
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1665:1: (lv_sorts_3_0= ruleASort )
            	    {
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1665:1: (lv_sorts_3_0= ruleASort )
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1666:3: lv_sorts_3_0= ruleASort
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSignatureAccess().getSortsASortParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleASort_in_ruleSignature3736);
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
            	    break loop17;
                }
            } while (true);

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1682:4: ( ( ( 'Generators' )=>otherlv_4= 'Generators' ) ( (lv_generators_5_0= ruleOperation ) ) ( (lv_generators_6_0= ruleOperation ) )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1682:5: ( ( 'Generators' )=>otherlv_4= 'Generators' ) ( (lv_generators_5_0= ruleOperation ) ) ( (lv_generators_6_0= ruleOperation ) )*
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1682:5: ( ( 'Generators' )=>otherlv_4= 'Generators' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1682:6: ( 'Generators' )=>otherlv_4= 'Generators'
            {
            otherlv_4=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleSignature3759); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSignatureAccess().getGeneratorsKeyword_3_0());
                  
            }

            }

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1687:2: ( (lv_generators_5_0= ruleOperation ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1688:1: (lv_generators_5_0= ruleOperation )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1688:1: (lv_generators_5_0= ruleOperation )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1689:3: lv_generators_5_0= ruleOperation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSignatureAccess().getGeneratorsOperationParserRuleCall_3_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleSignature3781);
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

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1705:2: ( (lv_generators_6_0= ruleOperation ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1706:1: (lv_generators_6_0= ruleOperation )
            	    {
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1706:1: (lv_generators_6_0= ruleOperation )
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1707:3: lv_generators_6_0= ruleOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSignatureAccess().getGeneratorsOperationParserRuleCall_3_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleSignature3802);
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
            	    break loop18;
                }
            } while (true);


            }

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1723:4: ( ( ( 'Operations' )=>otherlv_7= 'Operations' ) ( (lv_operations_8_0= ruleOperation ) ) ( (lv_operations_9_0= ruleOperation ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) && (synpred5_InternalTransitionSystemDsl())) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1723:5: ( ( 'Operations' )=>otherlv_7= 'Operations' ) ( (lv_operations_8_0= ruleOperation ) ) ( (lv_operations_9_0= ruleOperation ) )*
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1723:5: ( ( 'Operations' )=>otherlv_7= 'Operations' )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1723:6: ( 'Operations' )=>otherlv_7= 'Operations'
                    {
                    otherlv_7=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleSignature3825); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getSignatureAccess().getOperationsKeyword_4_0());
                          
                    }

                    }

                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1728:2: ( (lv_operations_8_0= ruleOperation ) )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1729:1: (lv_operations_8_0= ruleOperation )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1729:1: (lv_operations_8_0= ruleOperation )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1730:3: lv_operations_8_0= ruleOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSignatureAccess().getOperationsOperationParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleSignature3847);
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

                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1746:2: ( (lv_operations_9_0= ruleOperation ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_ID) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1747:1: (lv_operations_9_0= ruleOperation )
                    	    {
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1747:1: (lv_operations_9_0= ruleOperation )
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1748:3: lv_operations_9_0= ruleOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSignatureAccess().getOperationsOperationParserRuleCall_4_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleSignature3868);
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
                    	    break loop19;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1772:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1773:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1774:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3907);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableDeclaration3917); if (state.failed) return current;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1781:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1784:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1785:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1785:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1785:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1785:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1786:1: (lv_name_0_0= RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1786:1: (lv_name_0_0= RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1787:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVariableDeclaration3959); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleVariableDeclaration3976); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVariableDeclarationAccess().getColonKeyword_1());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1807:1: ( (otherlv_2= RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1808:1: (otherlv_2= RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1808:1: (otherlv_2= RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1809:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVariableDeclaration3996); if (state.failed) return current;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1828:1: entryRuleEquation returns [EObject current=null] : iv_ruleEquation= ruleEquation EOF ;
    public final EObject entryRuleEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquation = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1829:2: (iv_ruleEquation= ruleEquation EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1830:2: iv_ruleEquation= ruleEquation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEquationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEquation_in_entryRuleEquation4032);
            iv_ruleEquation=ruleEquation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEquation4042); if (state.failed) return current;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1837:1: ruleEquation returns [EObject current=null] : ( ( (lv_leftHandTerm_0_0= ruleATerm ) ) otherlv_1= '=' ( (lv_rightHandTerm_2_0= ruleATerm ) ) ) ;
    public final EObject ruleEquation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftHandTerm_0_0 = null;

        EObject lv_rightHandTerm_2_0 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1840:28: ( ( ( (lv_leftHandTerm_0_0= ruleATerm ) ) otherlv_1= '=' ( (lv_rightHandTerm_2_0= ruleATerm ) ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1841:1: ( ( (lv_leftHandTerm_0_0= ruleATerm ) ) otherlv_1= '=' ( (lv_rightHandTerm_2_0= ruleATerm ) ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1841:1: ( ( (lv_leftHandTerm_0_0= ruleATerm ) ) otherlv_1= '=' ( (lv_rightHandTerm_2_0= ruleATerm ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1841:2: ( (lv_leftHandTerm_0_0= ruleATerm ) ) otherlv_1= '=' ( (lv_rightHandTerm_2_0= ruleATerm ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1841:2: ( (lv_leftHandTerm_0_0= ruleATerm ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1842:1: (lv_leftHandTerm_0_0= ruleATerm )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1842:1: (lv_leftHandTerm_0_0= ruleATerm )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1843:3: lv_leftHandTerm_0_0= ruleATerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEquationAccess().getLeftHandTermATermParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleATerm_in_ruleEquation4088);
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

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEquation4100); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEquationAccess().getEqualsSignKeyword_1());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1863:1: ( (lv_rightHandTerm_2_0= ruleATerm ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1864:1: (lv_rightHandTerm_2_0= ruleATerm )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1864:1: (lv_rightHandTerm_2_0= ruleATerm )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1865:3: lv_rightHandTerm_2_0= ruleATerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEquationAccess().getRightHandTermATermParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleATerm_in_ruleEquation4121);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1889:1: entryRuleRewriteRule returns [EObject current=null] : iv_ruleRewriteRule= ruleRewriteRule EOF ;
    public final EObject entryRuleRewriteRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRewriteRule = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1890:2: (iv_ruleRewriteRule= ruleRewriteRule EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1891:2: iv_ruleRewriteRule= ruleRewriteRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRewriteRuleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRewriteRule_in_entryRuleRewriteRule4157);
            iv_ruleRewriteRule=ruleRewriteRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRewriteRule; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRewriteRule4167); if (state.failed) return current;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1898:1: ruleRewriteRule returns [EObject current=null] : ( ( (lv_leftHandTerm_0_0= ruleATerm ) ) otherlv_1= '->' ( (lv_rightHandTerm_2_0= ruleATerm ) ) ) ;
    public final EObject ruleRewriteRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftHandTerm_0_0 = null;

        EObject lv_rightHandTerm_2_0 = null;


         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1901:28: ( ( ( (lv_leftHandTerm_0_0= ruleATerm ) ) otherlv_1= '->' ( (lv_rightHandTerm_2_0= ruleATerm ) ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1902:1: ( ( (lv_leftHandTerm_0_0= ruleATerm ) ) otherlv_1= '->' ( (lv_rightHandTerm_2_0= ruleATerm ) ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1902:1: ( ( (lv_leftHandTerm_0_0= ruleATerm ) ) otherlv_1= '->' ( (lv_rightHandTerm_2_0= ruleATerm ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1902:2: ( (lv_leftHandTerm_0_0= ruleATerm ) ) otherlv_1= '->' ( (lv_rightHandTerm_2_0= ruleATerm ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1902:2: ( (lv_leftHandTerm_0_0= ruleATerm ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1903:1: (lv_leftHandTerm_0_0= ruleATerm )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1903:1: (lv_leftHandTerm_0_0= ruleATerm )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1904:3: lv_leftHandTerm_0_0= ruleATerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRewriteRuleAccess().getLeftHandTermATermParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleATerm_in_ruleRewriteRule4213);
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

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleRewriteRule4225); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRewriteRuleAccess().getHyphenMinusGreaterThanSignKeyword_1());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1924:1: ( (lv_rightHandTerm_2_0= ruleATerm ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1925:1: (lv_rightHandTerm_2_0= ruleATerm )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1925:1: (lv_rightHandTerm_2_0= ruleATerm )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1926:3: lv_rightHandTerm_2_0= ruleATerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRewriteRuleAccess().getRightHandTermATermParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleATerm_in_ruleRewriteRule4246);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1950:1: entryRuleSubSort returns [EObject current=null] : iv_ruleSubSort= ruleSubSort EOF ;
    public final EObject entryRuleSubSort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubSort = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1951:2: (iv_ruleSubSort= ruleSubSort EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1952:2: iv_ruleSubSort= ruleSubSort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubSortRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubSort_in_entryRuleSubSort4282);
            iv_ruleSubSort=ruleSubSort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubSort; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubSort4292); if (state.failed) return current;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1959:1: ruleSubSort returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleSubSort() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1962:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1963:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1963:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1963:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (otherlv_2= RULE_ID ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1963:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1964:1: (lv_name_0_0= RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1964:1: (lv_name_0_0= RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1965:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSubSort4334); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleSubSort4351); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSubSortAccess().getLessThanSignKeyword_1());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1985:1: ( (otherlv_2= RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1986:1: (otherlv_2= RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1986:1: (otherlv_2= RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1987:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSubSortRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSubSort4371); if (state.failed) return current;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2006:1: entryRuleSort returns [EObject current=null] : iv_ruleSort= ruleSort EOF ;
    public final EObject entryRuleSort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSort = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2007:2: (iv_ruleSort= ruleSort EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2008:2: iv_ruleSort= ruleSort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSortRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSort_in_entryRuleSort4407);
            iv_ruleSort=ruleSort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSort; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSort4417); if (state.failed) return current;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2015:1: ruleSort returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSort() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2018:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2019:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2019:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2019:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2019:2: ()
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2020:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSortAccess().getSortAction_0(),
                          current);
                  
            }

            }

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2025:2: ( (lv_name_1_0= RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2026:1: (lv_name_1_0= RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2026:1: (lv_name_1_0= RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2027:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSort4468); if (state.failed) return current;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2051:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2052:2: (iv_ruleTerm= ruleTerm EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2053:2: iv_ruleTerm= ruleTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTerm_in_entryRuleTerm4509);
            iv_ruleTerm=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerm4519); if (state.failed) return current;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2060:1: ruleTerm returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_subterms_3_0= ruleATerm ) ) (otherlv_4= ',' ( (lv_subterms_5_0= ruleATerm ) ) )* otherlv_6= ')' )? ) ;
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
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2063:28: ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_subterms_3_0= ruleATerm ) ) (otherlv_4= ',' ( (lv_subterms_5_0= ruleATerm ) ) )* otherlv_6= ')' )? ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2064:1: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_subterms_3_0= ruleATerm ) ) (otherlv_4= ',' ( (lv_subterms_5_0= ruleATerm ) ) )* otherlv_6= ')' )? )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2064:1: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_subterms_3_0= ruleATerm ) ) (otherlv_4= ',' ( (lv_subterms_5_0= ruleATerm ) ) )* otherlv_6= ')' )? )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2064:2: () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_subterms_3_0= ruleATerm ) ) (otherlv_4= ',' ( (lv_subterms_5_0= ruleATerm ) ) )* otherlv_6= ')' )?
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2064:2: ()
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2065:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTermAccess().getTermAction_0(),
                          current);
                  
            }

            }

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2070:2: ( (otherlv_1= RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2071:1: (otherlv_1= RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2071:1: (otherlv_1= RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2072:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTermRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTerm4573); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getTermAccess().getOperationSymbolOperationCrossReference_1_0()); 
              	
            }

            }


            }

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2083:2: (otherlv_2= '(' ( (lv_subterms_3_0= ruleATerm ) ) (otherlv_4= ',' ( (lv_subterms_5_0= ruleATerm ) ) )* otherlv_6= ')' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==17) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2083:4: otherlv_2= '(' ( (lv_subterms_3_0= ruleATerm ) ) (otherlv_4= ',' ( (lv_subterms_5_0= ruleATerm ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTerm4586); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTermAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2087:1: ( (lv_subterms_3_0= ruleATerm ) )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2088:1: (lv_subterms_3_0= ruleATerm )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2088:1: (lv_subterms_3_0= ruleATerm )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2089:3: lv_subterms_3_0= ruleATerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTermAccess().getSubtermsATermParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleATerm_in_ruleTerm4607);
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

                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2105:2: (otherlv_4= ',' ( (lv_subterms_5_0= ruleATerm ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==18) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2105:4: otherlv_4= ',' ( (lv_subterms_5_0= ruleATerm ) )
                    	    {
                    	    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTerm4620); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getTermAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2109:1: ( (lv_subterms_5_0= ruleATerm ) )
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2110:1: (lv_subterms_5_0= ruleATerm )
                    	    {
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2110:1: (lv_subterms_5_0= ruleATerm )
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2111:3: lv_subterms_5_0= ruleATerm
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTermAccess().getSubtermsATermParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleATerm_in_ruleTerm4641);
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
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTerm4655); if (state.failed) return current;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2139:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2140:2: (iv_ruleVariable= ruleVariable EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2141:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable4693);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable4703); if (state.failed) return current;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2148:1: ruleVariable returns [EObject current=null] : ( () ( (otherlv_1= RULE_TERMVAR ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2151:28: ( ( () ( (otherlv_1= RULE_TERMVAR ) ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2152:1: ( () ( (otherlv_1= RULE_TERMVAR ) ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2152:1: ( () ( (otherlv_1= RULE_TERMVAR ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2152:2: () ( (otherlv_1= RULE_TERMVAR ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2152:2: ()
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2153:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVariableAccess().getVariableAction_0(),
                          current);
                  
            }

            }

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2158:2: ( (otherlv_1= RULE_TERMVAR ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2159:1: (otherlv_1= RULE_TERMVAR )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2159:1: (otherlv_1= RULE_TERMVAR )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2160:3: otherlv_1= RULE_TERMVAR
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_TERMVAR,FollowSets000.FOLLOW_RULE_TERMVAR_in_ruleVariable4757); if (state.failed) return current;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2179:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2180:2: (iv_ruleOperation= ruleOperation EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2181:2: iv_ruleOperation= ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_entryRuleOperation4793);
            iv_ruleOperation=ruleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperation4803); if (state.failed) return current;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2188:1: ruleOperation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '->' )? ( (otherlv_6= RULE_ID ) ) ) ;
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
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2191:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '->' )? ( (otherlv_6= RULE_ID ) ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2192:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '->' )? ( (otherlv_6= RULE_ID ) ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2192:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '->' )? ( (otherlv_6= RULE_ID ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2192:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '->' )? ( (otherlv_6= RULE_ID ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2192:2: ( (lv_name_0_0= RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2193:1: (lv_name_0_0= RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2193:1: (lv_name_0_0= RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2194:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleOperation4845); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleOperation4862); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getColonKeyword_1());
                  
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2214:1: ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '->' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==18||LA24_1==40) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2214:2: ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '->'
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2214:2: ( (otherlv_2= RULE_ID ) )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2215:1: (otherlv_2= RULE_ID )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2215:1: (otherlv_2= RULE_ID )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2216:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getOperationRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleOperation4883); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getFormalParametersASortCrossReference_2_0_0()); 
                      	
                    }

                    }


                    }

                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2227:2: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==18) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2227:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOperation4896); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2231:1: ( (otherlv_4= RULE_ID ) )
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2232:1: (otherlv_4= RULE_ID )
                    	    {
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2232:1: (otherlv_4= RULE_ID )
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2233:3: otherlv_4= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getOperationRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleOperation4916); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getFormalParametersASortCrossReference_2_1_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleOperation4930); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getOperationAccess().getHyphenMinusGreaterThanSignKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2248:3: ( (otherlv_6= RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2249:1: (otherlv_6= RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2249:1: (otherlv_6= RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2250:3: otherlv_6= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getOperationRule());
              	        }
                      
            }
            otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleOperation4952); if (state.failed) return current;
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
        // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:421:3: ( rulePredefStrats )
        // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:421:5: rulePredefStrats
        {
        pushFollow(FollowSets000.FOLLOW_rulePredefStrats_in_synpred1_InternalTransitionSystemDsl815);
        rulePredefStrats();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalTransitionSystemDsl

    // $ANTLR start synpred2_InternalTransitionSystemDsl
    public final void synpred2_InternalTransitionSystemDsl_fragment() throws RecognitionException {   
        // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1535:4: ( 'Axioms' )
        // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1535:6: 'Axioms'
        {
        match(input,34,FollowSets000.FOLLOW_34_in_synpred2_InternalTransitionSystemDsl3477); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalTransitionSystemDsl

    // $ANTLR start synpred3_InternalTransitionSystemDsl
    public final void synpred3_InternalTransitionSystemDsl_fragment() throws RecognitionException {   
        // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1576:7: ( 'Variables' )
        // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1576:9: 'Variables'
        {
        match(input,35,FollowSets000.FOLLOW_35_in_synpred3_InternalTransitionSystemDsl3544); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalTransitionSystemDsl

    // $ANTLR start synpred4_InternalTransitionSystemDsl
    public final void synpred4_InternalTransitionSystemDsl_fragment() throws RecognitionException {   
        // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1682:6: ( 'Generators' )
        // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1682:8: 'Generators'
        {
        match(input,37,FollowSets000.FOLLOW_37_in_synpred4_InternalTransitionSystemDsl3751); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalTransitionSystemDsl

    // $ANTLR start synpred5_InternalTransitionSystemDsl
    public final void synpred5_InternalTransitionSystemDsl_fragment() throws RecognitionException {   
        // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1723:6: ( 'Operations' )
        // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1723:8: 'Operations'
        {
        match(input,38,FollowSets000.FOLLOW_38_in_synpred5_InternalTransitionSystemDsl3817); if (state.failed) return ;

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
            return "421:1: ( ( ( rulePredefStrats )=>this_PredefStrats_0= rulePredefStrats ) | this_DeclaredStrategyInstance_1= ruleDeclaredStrategyInstance )";
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
        public static final BitSet FOLLOW_16_in_ruleTransitionSystem234 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleTransitionSystem255 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleTransitionSystem276 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition313 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransition323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTransition365 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTransition382 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_ruleNonVariableStrategy_in_ruleTransition403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAuxiliary_in_entryRuleAuxiliary439 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAuxiliary449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAuxiliary491 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_17_in_ruleAuxiliary509 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVariableStrategy_in_ruleAuxiliary530 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleAuxiliary543 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVariableStrategy_in_ruleAuxiliary564 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleAuxiliary578 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAuxiliary592 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_ruleNonVariableStrategy_in_ruleAuxiliary613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_entryRuleStrategy649 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStrategy659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNonVariableStrategy_in_ruleStrategy706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableStrategy_in_ruleStrategy733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNonVariableStrategy_in_entryRuleNonVariableStrategy768 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNonVariableStrategy778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredefStrats_in_ruleNonVariableStrategy831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaredStrategyInstance_in_ruleNonVariableStrategy859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredefStrats_in_entryRulePredefStrats894 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePredefStrats904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentity_in_rulePredefStrats951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFail_in_rulePredefStrats978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoice_in_rulePredefStrats1005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSequence_in_rulePredefStrats1032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFixpoint_in_rulePredefStrats1059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfThenElse_in_rulePredefStrats1086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNot_in_rulePredefStrats1113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleStrategy_in_rulePredefStrats1140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOne_in_rulePredefStrats1167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSaturation_in_rulePredefStrats1194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnion_in_rulePredefStrats1221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOne_in_entryRuleOne1256 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOne1266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleOne1303 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleOne1315 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleOne1336 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleOne1348 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleOne1365 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleOne1382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaredStrategyInstance_in_entryRuleDeclaredStrategyInstance1418 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaredStrategyInstance1428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDeclaredStrategyInstance1482 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleDeclaredStrategyInstance1494 = new BitSet(new long[]{0x00000000FEF80010L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleDeclaredStrategyInstance1516 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleDeclaredStrategyInstance1529 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleDeclaredStrategyInstance1550 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleDeclaredStrategyInstance1566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSaturation_in_entryRuleSaturation1602 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSaturation1612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleSaturation1649 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleSaturation1661 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleSaturation1682 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleSaturation1694 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleSaturation1711 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleSaturation1728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfThenElse_in_entryRuleIfThenElse1764 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIfThenElse1774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleIfThenElse1811 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleIfThenElse1823 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleIfThenElse1844 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleIfThenElse1856 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleIfThenElse1877 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleIfThenElse1889 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleIfThenElse1910 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleIfThenElse1922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleStrategy_in_entryRuleSimpleStrategy1958 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleStrategy1968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleSimpleStrategy2005 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleRewriteRule_in_ruleSimpleStrategy2026 = new BitSet(new long[]{0x0000000001040000L});
        public static final BitSet FOLLOW_18_in_ruleSimpleStrategy2039 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleRewriteRule_in_ruleSimpleStrategy2060 = new BitSet(new long[]{0x0000000001040000L});
        public static final BitSet FOLLOW_24_in_ruleSimpleStrategy2074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNot_in_entryRuleNot2110 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNot2120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleNot2157 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleNot2169 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleSimpleStrategy_in_ruleNot2190 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleNot2202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFixpoint_in_entryRuleFixpoint2238 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFixpoint2248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleFixpoint2285 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFixpoint2297 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleFixpoint2318 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleFixpoint2330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice2366 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChoice2376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleChoice2413 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleChoice2425 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleChoice2446 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleChoice2458 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleChoice2479 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleChoice2491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnion_in_entryRuleUnion2527 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnion2537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleUnion2574 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleUnion2586 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleUnion2607 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleUnion2619 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleUnion2640 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleUnion2652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence2688 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSequence2698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleSequence2735 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleSequence2747 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleSequence2768 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleSequence2780 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_ruleStrategy_in_ruleSequence2801 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleSequence2813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentity_in_entryRuleIdentity2849 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentity2859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleIdentity2896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFail_in_entryRuleFail2941 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFail2951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleFail2988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableStrategy_in_entryRuleVariableStrategy3033 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableStrategy3043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVariableStrategy3084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleATerm_in_entryRuleATerm3124 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleATerm3134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleATerm3181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleATerm3208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleASort_in_entryRuleASort3243 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleASort3253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubSort_in_ruleASort3300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSort_in_ruleASort3327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleADT_in_entryRuleADT3362 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleADT3372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleADT3409 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleADT3426 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleADT3443 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleSignature_in_ruleADT3464 = new BitSet(new long[]{0x0000000C00000002L});
        public static final BitSet FOLLOW_34_in_ruleADT3485 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleEquation_in_ruleADT3507 = new BitSet(new long[]{0x0000000800000052L});
        public static final BitSet FOLLOW_ruleEquation_in_ruleADT3528 = new BitSet(new long[]{0x0000000800000052L});
        public static final BitSet FOLLOW_35_in_ruleADT3552 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleADT3574 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleADT3595 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_ruleSignature_in_entryRuleSignature3634 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSignature3644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleSignature3681 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleASort_in_ruleSignature3702 = new BitSet(new long[]{0x0000002000040000L});
        public static final BitSet FOLLOW_18_in_ruleSignature3715 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleASort_in_ruleSignature3736 = new BitSet(new long[]{0x0000002000040000L});
        public static final BitSet FOLLOW_37_in_ruleSignature3759 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleSignature3781 = new BitSet(new long[]{0x0000004000000012L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleSignature3802 = new BitSet(new long[]{0x0000004000000012L});
        public static final BitSet FOLLOW_38_in_ruleSignature3825 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleSignature3847 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleSignature3868 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration3907 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration3917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration3959 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleVariableDeclaration3976 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration3996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEquation_in_entryRuleEquation4032 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEquation4042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleATerm_in_ruleEquation4088 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleEquation4100 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleATerm_in_ruleEquation4121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRewriteRule_in_entryRuleRewriteRule4157 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRewriteRule4167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleATerm_in_ruleRewriteRule4213 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleRewriteRule4225 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleATerm_in_ruleRewriteRule4246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubSort_in_entryRuleSubSort4282 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubSort4292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSubSort4334 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleSubSort4351 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSubSort4371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSort_in_entryRuleSort4407 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSort4417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSort4468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm4509 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerm4519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTerm4573 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_17_in_ruleTerm4586 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleATerm_in_ruleTerm4607 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleTerm4620 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_ruleATerm_in_ruleTerm4641 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleTerm4655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable4693 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable4703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_TERMVAR_in_ruleVariable4757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation4793 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperation4803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleOperation4845 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleOperation4862 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleOperation4883 = new BitSet(new long[]{0x0000010000040000L});
        public static final BitSet FOLLOW_18_in_ruleOperation4896 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleOperation4916 = new BitSet(new long[]{0x0000010000040000L});
        public static final BitSet FOLLOW_40_in_ruleOperation4930 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleOperation4952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredefStrats_in_synpred1_InternalTransitionSystemDsl815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_synpred2_InternalTransitionSystemDsl3477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_synpred3_InternalTransitionSystemDsl3544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_synpred4_InternalTransitionSystemDsl3751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_synpred5_InternalTransitionSystemDsl3817 = new BitSet(new long[]{0x0000000000000002L});
    }


}