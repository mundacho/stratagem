package ch.unige.cui.smv.stratagem.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import ch.unige.cui.smv.stratagem.xtext.services.TransitionSystemDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTransitionSystemDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_TERMVAR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TransitionSystem'", "'initialState'", "'='", "'Strategies'", "'Transitions'", "'('", "')'", "','", "'One'", "'Saturation'", "'IfThenElse'", "'{'", "'}'", "'Not'", "'Fixpoint'", "'All'", "'Choice'", "'Union'", "'Sequence'", "'Identity'", "'Fail'", "'ADT'", "'Signature'", "'Axioms'", "'Variables'", "'Sorts'", "'Generators'", "'Operations'", "':'", "'->'", "'<'"
    };
    public static final int T__42=42;
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
    public String getGrammarFileName() { return "../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g"; }


     
     	private TransitionSystemDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(TransitionSystemDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleTransitionSystem"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:61:1: entryRuleTransitionSystem : ruleTransitionSystem EOF ;
    public final void entryRuleTransitionSystem() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:62:1: ( ruleTransitionSystem EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:63:1: ruleTransitionSystem EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransitionSystem_in_entryRuleTransitionSystem67);
            ruleTransitionSystem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionSystemRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransitionSystem74); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransitionSystem"


    // $ANTLR start "ruleTransitionSystem"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:70:1: ruleTransitionSystem : ( ( rule__TransitionSystem__Group__0 ) ) ;
    public final void ruleTransitionSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:74:2: ( ( ( rule__TransitionSystem__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:75:1: ( ( rule__TransitionSystem__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:75:1: ( ( rule__TransitionSystem__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:76:1: ( rule__TransitionSystem__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:77:1: ( rule__TransitionSystem__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:77:2: rule__TransitionSystem__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__0_in_ruleTransitionSystem100);
            rule__TransitionSystem__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionSystemAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransitionSystem"


    // $ANTLR start "entryRuleTransition"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:89:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:90:1: ( ruleTransition EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:91:1: ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_entryRuleTransition127);
            ruleTransition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransition134); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:98:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:102:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:103:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:103:1: ( ( rule__Transition__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:104:1: ( rule__Transition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:105:1: ( rule__Transition__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:105:2: rule__Transition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__0_in_ruleTransition160);
            rule__Transition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleAuxiliary"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:117:1: entryRuleAuxiliary : ruleAuxiliary EOF ;
    public final void entryRuleAuxiliary() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:118:1: ( ruleAuxiliary EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:119:1: ruleAuxiliary EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAuxiliary_in_entryRuleAuxiliary187);
            ruleAuxiliary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuxiliaryRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAuxiliary194); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAuxiliary"


    // $ANTLR start "ruleAuxiliary"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:126:1: ruleAuxiliary : ( ( rule__Auxiliary__Group__0 ) ) ;
    public final void ruleAuxiliary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:130:2: ( ( ( rule__Auxiliary__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:131:1: ( ( rule__Auxiliary__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:131:1: ( ( rule__Auxiliary__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:132:1: ( rule__Auxiliary__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:133:1: ( rule__Auxiliary__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:133:2: rule__Auxiliary__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group__0_in_ruleAuxiliary220);
            rule__Auxiliary__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuxiliaryAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAuxiliary"


    // $ANTLR start "entryRuleStrategy"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:145:1: entryRuleStrategy : ruleStrategy EOF ;
    public final void entryRuleStrategy() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:146:1: ( ruleStrategy EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:147:1: ruleStrategy EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrategyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_entryRuleStrategy247);
            ruleStrategy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrategyRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStrategy254); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStrategy"


    // $ANTLR start "ruleStrategy"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:154:1: ruleStrategy : ( ( rule__Strategy__Alternatives ) ) ;
    public final void ruleStrategy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:158:2: ( ( ( rule__Strategy__Alternatives ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:159:1: ( ( rule__Strategy__Alternatives ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:159:1: ( ( rule__Strategy__Alternatives ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:160:1: ( rule__Strategy__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrategyAccess().getAlternatives()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:161:1: ( rule__Strategy__Alternatives )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:161:2: rule__Strategy__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Strategy__Alternatives_in_ruleStrategy280);
            rule__Strategy__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrategyAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStrategy"


    // $ANTLR start "entryRuleNonVariableStrategy"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:173:1: entryRuleNonVariableStrategy : ruleNonVariableStrategy EOF ;
    public final void entryRuleNonVariableStrategy() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:174:1: ( ruleNonVariableStrategy EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:175:1: ruleNonVariableStrategy EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonVariableStrategyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNonVariableStrategy_in_entryRuleNonVariableStrategy307);
            ruleNonVariableStrategy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonVariableStrategyRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNonVariableStrategy314); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNonVariableStrategy"


    // $ANTLR start "ruleNonVariableStrategy"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:182:1: ruleNonVariableStrategy : ( ( rule__NonVariableStrategy__Alternatives ) ) ;
    public final void ruleNonVariableStrategy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:186:2: ( ( ( rule__NonVariableStrategy__Alternatives ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:187:1: ( ( rule__NonVariableStrategy__Alternatives ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:187:1: ( ( rule__NonVariableStrategy__Alternatives ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:188:1: ( rule__NonVariableStrategy__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonVariableStrategyAccess().getAlternatives()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:189:1: ( rule__NonVariableStrategy__Alternatives )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:189:2: rule__NonVariableStrategy__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__NonVariableStrategy__Alternatives_in_ruleNonVariableStrategy340);
            rule__NonVariableStrategy__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonVariableStrategyAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNonVariableStrategy"


    // $ANTLR start "entryRulePredefStrats"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:201:1: entryRulePredefStrats : rulePredefStrats EOF ;
    public final void entryRulePredefStrats() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:202:1: ( rulePredefStrats EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:203:1: rulePredefStrats EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredefStratsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePredefStrats_in_entryRulePredefStrats367);
            rulePredefStrats();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredefStratsRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePredefStrats374); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePredefStrats"


    // $ANTLR start "rulePredefStrats"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:210:1: rulePredefStrats : ( ( rule__PredefStrats__Alternatives ) ) ;
    public final void rulePredefStrats() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:214:2: ( ( ( rule__PredefStrats__Alternatives ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:215:1: ( ( rule__PredefStrats__Alternatives ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:215:1: ( ( rule__PredefStrats__Alternatives ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:216:1: ( rule__PredefStrats__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredefStratsAccess().getAlternatives()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:217:1: ( rule__PredefStrats__Alternatives )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:217:2: rule__PredefStrats__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__PredefStrats__Alternatives_in_rulePredefStrats400);
            rule__PredefStrats__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredefStratsAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredefStrats"


    // $ANTLR start "entryRuleOne"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:229:1: entryRuleOne : ruleOne EOF ;
    public final void entryRuleOne() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:230:1: ( ruleOne EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:231:1: ruleOne EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOne_in_entryRuleOne427);
            ruleOne();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOne434); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOne"


    // $ANTLR start "ruleOne"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:238:1: ruleOne : ( ( rule__One__Group__0 ) ) ;
    public final void ruleOne() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:242:2: ( ( ( rule__One__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:243:1: ( ( rule__One__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:243:1: ( ( rule__One__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:244:1: ( rule__One__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:245:1: ( rule__One__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:245:2: rule__One__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__0_in_ruleOne460);
            rule__One__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOne"


    // $ANTLR start "entryRuleDeclaredStrategyInstance"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:257:1: entryRuleDeclaredStrategyInstance : ruleDeclaredStrategyInstance EOF ;
    public final void entryRuleDeclaredStrategyInstance() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:258:1: ( ruleDeclaredStrategyInstance EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:259:1: ruleDeclaredStrategyInstance EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclaredStrategyInstance_in_entryRuleDeclaredStrategyInstance487);
            ruleDeclaredStrategyInstance();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredStrategyInstanceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaredStrategyInstance494); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclaredStrategyInstance"


    // $ANTLR start "ruleDeclaredStrategyInstance"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:266:1: ruleDeclaredStrategyInstance : ( ( rule__DeclaredStrategyInstance__Group__0 ) ) ;
    public final void ruleDeclaredStrategyInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:270:2: ( ( ( rule__DeclaredStrategyInstance__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:271:1: ( ( rule__DeclaredStrategyInstance__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:271:1: ( ( rule__DeclaredStrategyInstance__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:272:1: ( rule__DeclaredStrategyInstance__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:273:1: ( rule__DeclaredStrategyInstance__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:273:2: rule__DeclaredStrategyInstance__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group__0_in_ruleDeclaredStrategyInstance520);
            rule__DeclaredStrategyInstance__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredStrategyInstanceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaredStrategyInstance"


    // $ANTLR start "entryRuleSaturation"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:285:1: entryRuleSaturation : ruleSaturation EOF ;
    public final void entryRuleSaturation() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:286:1: ( ruleSaturation EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:287:1: ruleSaturation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSaturationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSaturation_in_entryRuleSaturation547);
            ruleSaturation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSaturationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSaturation554); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSaturation"


    // $ANTLR start "ruleSaturation"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:294:1: ruleSaturation : ( ( rule__Saturation__Group__0 ) ) ;
    public final void ruleSaturation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:298:2: ( ( ( rule__Saturation__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:299:1: ( ( rule__Saturation__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:299:1: ( ( rule__Saturation__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:300:1: ( rule__Saturation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSaturationAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:301:1: ( rule__Saturation__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:301:2: rule__Saturation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__0_in_ruleSaturation580);
            rule__Saturation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSaturationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSaturation"


    // $ANTLR start "entryRuleIfThenElse"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:313:1: entryRuleIfThenElse : ruleIfThenElse EOF ;
    public final void entryRuleIfThenElse() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:314:1: ( ruleIfThenElse EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:315:1: ruleIfThenElse EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIfThenElse_in_entryRuleIfThenElse607);
            ruleIfThenElse();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIfThenElse614); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIfThenElse"


    // $ANTLR start "ruleIfThenElse"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:322:1: ruleIfThenElse : ( ( rule__IfThenElse__Group__0 ) ) ;
    public final void ruleIfThenElse() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:326:2: ( ( ( rule__IfThenElse__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:327:1: ( ( rule__IfThenElse__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:327:1: ( ( rule__IfThenElse__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:328:1: ( rule__IfThenElse__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:329:1: ( rule__IfThenElse__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:329:2: rule__IfThenElse__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__0_in_ruleIfThenElse640);
            rule__IfThenElse__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfThenElse"


    // $ANTLR start "entryRuleSimpleStrategy"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:341:1: entryRuleSimpleStrategy : ruleSimpleStrategy EOF ;
    public final void entryRuleSimpleStrategy() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:342:1: ( ruleSimpleStrategy EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:343:1: ruleSimpleStrategy EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleStrategyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSimpleStrategy_in_entryRuleSimpleStrategy667);
            ruleSimpleStrategy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleStrategyRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleStrategy674); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleStrategy"


    // $ANTLR start "ruleSimpleStrategy"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:350:1: ruleSimpleStrategy : ( ( rule__SimpleStrategy__Group__0 ) ) ;
    public final void ruleSimpleStrategy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:354:2: ( ( ( rule__SimpleStrategy__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:355:1: ( ( rule__SimpleStrategy__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:355:1: ( ( rule__SimpleStrategy__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:356:1: ( rule__SimpleStrategy__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleStrategyAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:357:1: ( rule__SimpleStrategy__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:357:2: rule__SimpleStrategy__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group__0_in_ruleSimpleStrategy700);
            rule__SimpleStrategy__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleStrategyAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleStrategy"


    // $ANTLR start "entryRuleNot"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:369:1: entryRuleNot : ruleNot EOF ;
    public final void entryRuleNot() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:370:1: ( ruleNot EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:371:1: ruleNot EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNot_in_entryRuleNot727);
            ruleNot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNot734); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:378:1: ruleNot : ( ( rule__Not__Group__0 ) ) ;
    public final void ruleNot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:382:2: ( ( ( rule__Not__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:383:1: ( ( rule__Not__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:383:1: ( ( rule__Not__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:384:1: ( rule__Not__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:385:1: ( rule__Not__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:385:2: rule__Not__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Not__Group__0_in_ruleNot760);
            rule__Not__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleFixpoint"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:397:1: entryRuleFixpoint : ruleFixpoint EOF ;
    public final void entryRuleFixpoint() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:398:1: ( ruleFixpoint EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:399:1: ruleFixpoint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixpointRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFixpoint_in_entryRuleFixpoint787);
            ruleFixpoint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFixpointRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFixpoint794); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFixpoint"


    // $ANTLR start "ruleFixpoint"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:406:1: ruleFixpoint : ( ( rule__Fixpoint__Group__0 ) ) ;
    public final void ruleFixpoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:410:2: ( ( ( rule__Fixpoint__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:411:1: ( ( rule__Fixpoint__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:411:1: ( ( rule__Fixpoint__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:412:1: ( rule__Fixpoint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixpointAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:413:1: ( rule__Fixpoint__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:413:2: rule__Fixpoint__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fixpoint__Group__0_in_ruleFixpoint820);
            rule__Fixpoint__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFixpointAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFixpoint"


    // $ANTLR start "entryRuleAll"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:425:1: entryRuleAll : ruleAll EOF ;
    public final void entryRuleAll() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:426:1: ( ruleAll EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:427:1: ruleAll EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAllRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAll_in_entryRuleAll847);
            ruleAll();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAllRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAll854); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAll"


    // $ANTLR start "ruleAll"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:434:1: ruleAll : ( ( rule__All__Group__0 ) ) ;
    public final void ruleAll() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:438:2: ( ( ( rule__All__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:439:1: ( ( rule__All__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:439:1: ( ( rule__All__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:440:1: ( rule__All__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAllAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:441:1: ( rule__All__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:441:2: rule__All__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__All__Group__0_in_ruleAll880);
            rule__All__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAllAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAll"


    // $ANTLR start "entryRuleChoice"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:453:1: entryRuleChoice : ruleChoice EOF ;
    public final void entryRuleChoice() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:454:1: ( ruleChoice EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:455:1: ruleChoice EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleChoice_in_entryRuleChoice907);
            ruleChoice();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChoiceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChoice914); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChoice"


    // $ANTLR start "ruleChoice"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:462:1: ruleChoice : ( ( rule__Choice__Group__0 ) ) ;
    public final void ruleChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:466:2: ( ( ( rule__Choice__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:467:1: ( ( rule__Choice__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:467:1: ( ( rule__Choice__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:468:1: ( rule__Choice__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:469:1: ( rule__Choice__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:469:2: rule__Choice__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__0_in_ruleChoice940);
            rule__Choice__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChoiceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChoice"


    // $ANTLR start "entryRuleUnion"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:481:1: entryRuleUnion : ruleUnion EOF ;
    public final void entryRuleUnion() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:482:1: ( ruleUnion EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:483:1: ruleUnion EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnion_in_entryRuleUnion967);
            ruleUnion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnion974); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnion"


    // $ANTLR start "ruleUnion"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:490:1: ruleUnion : ( ( rule__Union__Group__0 ) ) ;
    public final void ruleUnion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:494:2: ( ( ( rule__Union__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:495:1: ( ( rule__Union__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:495:1: ( ( rule__Union__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:496:1: ( rule__Union__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:497:1: ( rule__Union__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:497:2: rule__Union__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__0_in_ruleUnion1000);
            rule__Union__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnion"


    // $ANTLR start "entryRuleSequence"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:509:1: entryRuleSequence : ruleSequence EOF ;
    public final void entryRuleSequence() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:510:1: ( ruleSequence EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:511:1: ruleSequence EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSequence_in_entryRuleSequence1027);
            ruleSequence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSequence1034); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:518:1: ruleSequence : ( ( rule__Sequence__Group__0 ) ) ;
    public final void ruleSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:522:2: ( ( ( rule__Sequence__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:523:1: ( ( rule__Sequence__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:523:1: ( ( rule__Sequence__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:524:1: ( rule__Sequence__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:525:1: ( rule__Sequence__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:525:2: rule__Sequence__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__0_in_ruleSequence1060);
            rule__Sequence__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSequence"


    // $ANTLR start "entryRuleIdentity"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:537:1: entryRuleIdentity : ruleIdentity EOF ;
    public final void entryRuleIdentity() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:538:1: ( ruleIdentity EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:539:1: ruleIdentity EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentityRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentity_in_entryRuleIdentity1087);
            ruleIdentity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentityRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentity1094); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIdentity"


    // $ANTLR start "ruleIdentity"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:546:1: ruleIdentity : ( ( rule__Identity__Group__0 ) ) ;
    public final void ruleIdentity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:550:2: ( ( ( rule__Identity__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:551:1: ( ( rule__Identity__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:551:1: ( ( rule__Identity__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:552:1: ( rule__Identity__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentityAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:553:1: ( rule__Identity__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:553:2: rule__Identity__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identity__Group__0_in_ruleIdentity1120);
            rule__Identity__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentityAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdentity"


    // $ANTLR start "entryRuleFail"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:565:1: entryRuleFail : ruleFail EOF ;
    public final void entryRuleFail() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:566:1: ( ruleFail EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:567:1: ruleFail EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFailRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFail_in_entryRuleFail1147);
            ruleFail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFailRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFail1154); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFail"


    // $ANTLR start "ruleFail"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:574:1: ruleFail : ( ( rule__Fail__Group__0 ) ) ;
    public final void ruleFail() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:578:2: ( ( ( rule__Fail__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:579:1: ( ( rule__Fail__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:579:1: ( ( rule__Fail__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:580:1: ( rule__Fail__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFailAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:581:1: ( rule__Fail__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:581:2: rule__Fail__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fail__Group__0_in_ruleFail1180);
            rule__Fail__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFailAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFail"


    // $ANTLR start "entryRuleVariableStrategy"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:593:1: entryRuleVariableStrategy : ruleVariableStrategy EOF ;
    public final void entryRuleVariableStrategy() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:594:1: ( ruleVariableStrategy EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:595:1: ruleVariableStrategy EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableStrategyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableStrategy_in_entryRuleVariableStrategy1207);
            ruleVariableStrategy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableStrategyRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableStrategy1214); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableStrategy"


    // $ANTLR start "ruleVariableStrategy"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:602:1: ruleVariableStrategy : ( ( rule__VariableStrategy__NameAssignment ) ) ;
    public final void ruleVariableStrategy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:606:2: ( ( ( rule__VariableStrategy__NameAssignment ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:607:1: ( ( rule__VariableStrategy__NameAssignment ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:607:1: ( ( rule__VariableStrategy__NameAssignment ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:608:1: ( rule__VariableStrategy__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableStrategyAccess().getNameAssignment()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:609:1: ( rule__VariableStrategy__NameAssignment )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:609:2: rule__VariableStrategy__NameAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableStrategy__NameAssignment_in_ruleVariableStrategy1240);
            rule__VariableStrategy__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableStrategyAccess().getNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableStrategy"


    // $ANTLR start "entryRuleATerm"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:621:1: entryRuleATerm : ruleATerm EOF ;
    public final void entryRuleATerm() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:622:1: ( ruleATerm EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:623:1: ruleATerm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getATermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleATerm_in_entryRuleATerm1267);
            ruleATerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getATermRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleATerm1274); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleATerm"


    // $ANTLR start "ruleATerm"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:630:1: ruleATerm : ( ( rule__ATerm__Alternatives ) ) ;
    public final void ruleATerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:634:2: ( ( ( rule__ATerm__Alternatives ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:635:1: ( ( rule__ATerm__Alternatives ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:635:1: ( ( rule__ATerm__Alternatives ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:636:1: ( rule__ATerm__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getATermAccess().getAlternatives()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:637:1: ( rule__ATerm__Alternatives )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:637:2: rule__ATerm__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ATerm__Alternatives_in_ruleATerm1300);
            rule__ATerm__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getATermAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleATerm"


    // $ANTLR start "entryRuleASort"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:649:1: entryRuleASort : ruleASort EOF ;
    public final void entryRuleASort() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:650:1: ( ruleASort EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:651:1: ruleASort EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getASortRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleASort_in_entryRuleASort1327);
            ruleASort();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getASortRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleASort1334); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleASort"


    // $ANTLR start "ruleASort"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:658:1: ruleASort : ( ( rule__ASort__Alternatives ) ) ;
    public final void ruleASort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:662:2: ( ( ( rule__ASort__Alternatives ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:663:1: ( ( rule__ASort__Alternatives ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:663:1: ( ( rule__ASort__Alternatives ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:664:1: ( rule__ASort__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getASortAccess().getAlternatives()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:665:1: ( rule__ASort__Alternatives )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:665:2: rule__ASort__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ASort__Alternatives_in_ruleASort1360);
            rule__ASort__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getASortAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleASort"


    // $ANTLR start "entryRuleADT"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:677:1: entryRuleADT : ruleADT EOF ;
    public final void entryRuleADT() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:678:1: ( ruleADT EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:679:1: ruleADT EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleADT_in_entryRuleADT1387);
            ruleADT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getADTRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleADT1394); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleADT"


    // $ANTLR start "ruleADT"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:686:1: ruleADT : ( ( rule__ADT__Group__0 ) ) ;
    public final void ruleADT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:690:2: ( ( ( rule__ADT__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:691:1: ( ( rule__ADT__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:691:1: ( ( rule__ADT__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:692:1: ( rule__ADT__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:693:1: ( rule__ADT__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:693:2: rule__ADT__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__0_in_ruleADT1420);
            rule__ADT__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getADTAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleADT"


    // $ANTLR start "entryRuleSignature"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:705:1: entryRuleSignature : ruleSignature EOF ;
    public final void entryRuleSignature() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:706:1: ( ruleSignature EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:707:1: ruleSignature EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSignature_in_entryRuleSignature1447);
            ruleSignature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSignature1454); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:714:1: ruleSignature : ( ( rule__Signature__Group__0 ) ) ;
    public final void ruleSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:718:2: ( ( ( rule__Signature__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:719:1: ( ( rule__Signature__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:719:1: ( ( rule__Signature__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:720:1: ( rule__Signature__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:721:1: ( rule__Signature__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:721:2: rule__Signature__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group__0_in_ruleSignature1480);
            rule__Signature__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:733:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:734:1: ( ruleVariableDeclaration EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:735:1: ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1507);
            ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableDeclaration1514); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:742:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:746:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:747:1: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:747:1: ( ( rule__VariableDeclaration__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:748:1: ( rule__VariableDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:749:1: ( rule__VariableDeclaration__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:749:2: rule__VariableDeclaration__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableDeclaration__Group__0_in_ruleVariableDeclaration1540);
            rule__VariableDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleEquation"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:761:1: entryRuleEquation : ruleEquation EOF ;
    public final void entryRuleEquation() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:762:1: ( ruleEquation EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:763:1: ruleEquation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEquation_in_entryRuleEquation1567);
            ruleEquation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEquation1574); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEquation"


    // $ANTLR start "ruleEquation"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:770:1: ruleEquation : ( ( rule__Equation__Group__0 ) ) ;
    public final void ruleEquation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:774:2: ( ( ( rule__Equation__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:775:1: ( ( rule__Equation__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:775:1: ( ( rule__Equation__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:776:1: ( rule__Equation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:777:1: ( rule__Equation__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:777:2: rule__Equation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equation__Group__0_in_ruleEquation1600);
            rule__Equation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEquation"


    // $ANTLR start "entryRuleRewriteRule"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:789:1: entryRuleRewriteRule : ruleRewriteRule EOF ;
    public final void entryRuleRewriteRule() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:790:1: ( ruleRewriteRule EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:791:1: ruleRewriteRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRewriteRuleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRewriteRule_in_entryRuleRewriteRule1627);
            ruleRewriteRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRewriteRuleRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRewriteRule1634); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRewriteRule"


    // $ANTLR start "ruleRewriteRule"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:798:1: ruleRewriteRule : ( ( rule__RewriteRule__Group__0 ) ) ;
    public final void ruleRewriteRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:802:2: ( ( ( rule__RewriteRule__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:803:1: ( ( rule__RewriteRule__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:803:1: ( ( rule__RewriteRule__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:804:1: ( rule__RewriteRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRewriteRuleAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:805:1: ( rule__RewriteRule__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:805:2: rule__RewriteRule__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RewriteRule__Group__0_in_ruleRewriteRule1660);
            rule__RewriteRule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRewriteRuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRewriteRule"


    // $ANTLR start "entryRuleSubSort"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:817:1: entryRuleSubSort : ruleSubSort EOF ;
    public final void entryRuleSubSort() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:818:1: ( ruleSubSort EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:819:1: ruleSubSort EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubSortRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubSort_in_entryRuleSubSort1687);
            ruleSubSort();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubSortRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubSort1694); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubSort"


    // $ANTLR start "ruleSubSort"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:826:1: ruleSubSort : ( ( rule__SubSort__Group__0 ) ) ;
    public final void ruleSubSort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:830:2: ( ( ( rule__SubSort__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:831:1: ( ( rule__SubSort__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:831:1: ( ( rule__SubSort__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:832:1: ( rule__SubSort__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubSortAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:833:1: ( rule__SubSort__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:833:2: rule__SubSort__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubSort__Group__0_in_ruleSubSort1720);
            rule__SubSort__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubSortAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubSort"


    // $ANTLR start "entryRuleSort"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:845:1: entryRuleSort : ruleSort EOF ;
    public final void entryRuleSort() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:846:1: ( ruleSort EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:847:1: ruleSort EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSortRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSort_in_entryRuleSort1747);
            ruleSort();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSortRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSort1754); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSort"


    // $ANTLR start "ruleSort"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:854:1: ruleSort : ( ( rule__Sort__Group__0 ) ) ;
    public final void ruleSort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:858:2: ( ( ( rule__Sort__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:859:1: ( ( rule__Sort__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:859:1: ( ( rule__Sort__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:860:1: ( rule__Sort__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSortAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:861:1: ( rule__Sort__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:861:2: rule__Sort__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sort__Group__0_in_ruleSort1780);
            rule__Sort__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSortAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSort"


    // $ANTLR start "entryRuleTerm"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:873:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:874:1: ( ruleTerm EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:875:1: ruleTerm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTerm_in_entryRuleTerm1807);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerm1814); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:882:1: ruleTerm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:886:2: ( ( ( rule__Term__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:887:1: ( ( rule__Term__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:887:1: ( ( rule__Term__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:888:1: ( rule__Term__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:889:1: ( rule__Term__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:889:2: rule__Term__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group__0_in_ruleTerm1840);
            rule__Term__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleVariable"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:901:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:902:1: ( ruleVariable EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:903:1: ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable1867);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable1874); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:910:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:914:2: ( ( ( rule__Variable__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:915:1: ( ( rule__Variable__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:915:1: ( ( rule__Variable__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:916:1: ( rule__Variable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:917:1: ( rule__Variable__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:917:2: rule__Variable__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__0_in_ruleVariable1900);
            rule__Variable__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleOperation"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:929:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:930:1: ( ruleOperation EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:931:1: ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_entryRuleOperation1927);
            ruleOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperation1934); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:938:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:942:2: ( ( ( rule__Operation__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:943:1: ( ( rule__Operation__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:943:1: ( ( rule__Operation__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:944:1: ( rule__Operation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:945:1: ( rule__Operation__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:945:2: rule__Operation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__0_in_ruleOperation1960);
            rule__Operation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "rule__Strategy__Alternatives"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:957:1: rule__Strategy__Alternatives : ( ( ruleNonVariableStrategy ) | ( ruleVariableStrategy ) );
    public final void rule__Strategy__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:961:1: ( ( ruleNonVariableStrategy ) | ( ruleVariableStrategy ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=20 && LA1_0<=23)||(LA1_0>=25 && LA1_0<=32)) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==EOF||(LA1_2>=18 && LA1_2<=19)) ) {
                    alt1=2;
                }
                else if ( (LA1_2==17) ) {
                    alt1=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:962:1: ( ruleNonVariableStrategy )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:962:1: ( ruleNonVariableStrategy )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:963:1: ruleNonVariableStrategy
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStrategyAccess().getNonVariableStrategyParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNonVariableStrategy_in_rule__Strategy__Alternatives1996);
                    ruleNonVariableStrategy();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStrategyAccess().getNonVariableStrategyParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:968:6: ( ruleVariableStrategy )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:968:6: ( ruleVariableStrategy )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:969:1: ruleVariableStrategy
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStrategyAccess().getVariableStrategyParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariableStrategy_in_rule__Strategy__Alternatives2013);
                    ruleVariableStrategy();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStrategyAccess().getVariableStrategyParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy__Alternatives"


    // $ANTLR start "rule__NonVariableStrategy__Alternatives"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:979:1: rule__NonVariableStrategy__Alternatives : ( ( ( rulePredefStrats ) ) | ( ruleDeclaredStrategyInstance ) );
    public final void rule__NonVariableStrategy__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:983:1: ( ( ( rulePredefStrats ) ) | ( ruleDeclaredStrategyInstance ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=20 && LA2_0<=23)||(LA2_0>=25 && LA2_0<=32)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:984:1: ( ( rulePredefStrats ) )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:984:1: ( ( rulePredefStrats ) )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:985:1: ( rulePredefStrats )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNonVariableStrategyAccess().getPredefStratsParserRuleCall_0()); 
                    }
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:986:1: ( rulePredefStrats )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:986:3: rulePredefStrats
                    {
                    pushFollow(FollowSets000.FOLLOW_rulePredefStrats_in_rule__NonVariableStrategy__Alternatives2046);
                    rulePredefStrats();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNonVariableStrategyAccess().getPredefStratsParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:990:6: ( ruleDeclaredStrategyInstance )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:990:6: ( ruleDeclaredStrategyInstance )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:991:1: ruleDeclaredStrategyInstance
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNonVariableStrategyAccess().getDeclaredStrategyInstanceParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaredStrategyInstance_in_rule__NonVariableStrategy__Alternatives2064);
                    ruleDeclaredStrategyInstance();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNonVariableStrategyAccess().getDeclaredStrategyInstanceParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonVariableStrategy__Alternatives"


    // $ANTLR start "rule__PredefStrats__Alternatives"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1001:1: rule__PredefStrats__Alternatives : ( ( ruleIdentity ) | ( ruleFail ) | ( ruleChoice ) | ( ruleSequence ) | ( ruleFixpoint ) | ( ruleIfThenElse ) | ( ruleNot ) | ( ruleSimpleStrategy ) | ( ruleOne ) | ( ruleSaturation ) | ( ruleUnion ) | ( ruleAll ) );
    public final void rule__PredefStrats__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1005:1: ( ( ruleIdentity ) | ( ruleFail ) | ( ruleChoice ) | ( ruleSequence ) | ( ruleFixpoint ) | ( ruleIfThenElse ) | ( ruleNot ) | ( ruleSimpleStrategy ) | ( ruleOne ) | ( ruleSaturation ) | ( ruleUnion ) | ( ruleAll ) )
            int alt3=12;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt3=1;
                }
                break;
            case 32:
                {
                alt3=2;
                }
                break;
            case 28:
                {
                alt3=3;
                }
                break;
            case 30:
                {
                alt3=4;
                }
                break;
            case 26:
                {
                alt3=5;
                }
                break;
            case 22:
                {
                alt3=6;
                }
                break;
            case 25:
                {
                alt3=7;
                }
                break;
            case 23:
                {
                alt3=8;
                }
                break;
            case 20:
                {
                alt3=9;
                }
                break;
            case 21:
                {
                alt3=10;
                }
                break;
            case 29:
                {
                alt3=11;
                }
                break;
            case 27:
                {
                alt3=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1006:1: ( ruleIdentity )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1006:1: ( ruleIdentity )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1007:1: ruleIdentity
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredefStratsAccess().getIdentityParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIdentity_in_rule__PredefStrats__Alternatives2096);
                    ruleIdentity();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredefStratsAccess().getIdentityParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1012:6: ( ruleFail )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1012:6: ( ruleFail )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1013:1: ruleFail
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredefStratsAccess().getFailParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFail_in_rule__PredefStrats__Alternatives2113);
                    ruleFail();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredefStratsAccess().getFailParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1018:6: ( ruleChoice )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1018:6: ( ruleChoice )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1019:1: ruleChoice
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredefStratsAccess().getChoiceParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleChoice_in_rule__PredefStrats__Alternatives2130);
                    ruleChoice();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredefStratsAccess().getChoiceParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1024:6: ( ruleSequence )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1024:6: ( ruleSequence )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1025:1: ruleSequence
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredefStratsAccess().getSequenceParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSequence_in_rule__PredefStrats__Alternatives2147);
                    ruleSequence();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredefStratsAccess().getSequenceParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1030:6: ( ruleFixpoint )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1030:6: ( ruleFixpoint )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1031:1: ruleFixpoint
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredefStratsAccess().getFixpointParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFixpoint_in_rule__PredefStrats__Alternatives2164);
                    ruleFixpoint();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredefStratsAccess().getFixpointParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1036:6: ( ruleIfThenElse )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1036:6: ( ruleIfThenElse )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1037:1: ruleIfThenElse
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredefStratsAccess().getIfThenElseParserRuleCall_5()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIfThenElse_in_rule__PredefStrats__Alternatives2181);
                    ruleIfThenElse();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredefStratsAccess().getIfThenElseParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1042:6: ( ruleNot )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1042:6: ( ruleNot )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1043:1: ruleNot
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredefStratsAccess().getNotParserRuleCall_6()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNot_in_rule__PredefStrats__Alternatives2198);
                    ruleNot();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredefStratsAccess().getNotParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1048:6: ( ruleSimpleStrategy )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1048:6: ( ruleSimpleStrategy )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1049:1: ruleSimpleStrategy
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredefStratsAccess().getSimpleStrategyParserRuleCall_7()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleStrategy_in_rule__PredefStrats__Alternatives2215);
                    ruleSimpleStrategy();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredefStratsAccess().getSimpleStrategyParserRuleCall_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1054:6: ( ruleOne )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1054:6: ( ruleOne )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1055:1: ruleOne
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredefStratsAccess().getOneParserRuleCall_8()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleOne_in_rule__PredefStrats__Alternatives2232);
                    ruleOne();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredefStratsAccess().getOneParserRuleCall_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1060:6: ( ruleSaturation )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1060:6: ( ruleSaturation )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1061:1: ruleSaturation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredefStratsAccess().getSaturationParserRuleCall_9()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSaturation_in_rule__PredefStrats__Alternatives2249);
                    ruleSaturation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredefStratsAccess().getSaturationParserRuleCall_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1066:6: ( ruleUnion )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1066:6: ( ruleUnion )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1067:1: ruleUnion
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredefStratsAccess().getUnionParserRuleCall_10()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnion_in_rule__PredefStrats__Alternatives2266);
                    ruleUnion();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredefStratsAccess().getUnionParserRuleCall_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1072:6: ( ruleAll )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1072:6: ( ruleAll )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1073:1: ruleAll
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredefStratsAccess().getAllParserRuleCall_11()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAll_in_rule__PredefStrats__Alternatives2283);
                    ruleAll();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredefStratsAccess().getAllParserRuleCall_11()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredefStrats__Alternatives"


    // $ANTLR start "rule__Not__SAlternatives_2_0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1083:1: rule__Not__SAlternatives_2_0 : ( ( ruleSimpleStrategy ) | ( ruleDeclaredStrategyInstance ) | ( ruleVariableStrategy ) );
    public final void rule__Not__SAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1087:1: ( ( ruleSimpleStrategy ) | ( ruleDeclaredStrategyInstance ) | ( ruleVariableStrategy ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==17) ) {
                    alt4=2;
                }
                else if ( (LA4_2==18) ) {
                    alt4=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1088:1: ( ruleSimpleStrategy )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1088:1: ( ruleSimpleStrategy )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1089:1: ruleSimpleStrategy
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotAccess().getSSimpleStrategyParserRuleCall_2_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleStrategy_in_rule__Not__SAlternatives_2_02315);
                    ruleSimpleStrategy();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNotAccess().getSSimpleStrategyParserRuleCall_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1094:6: ( ruleDeclaredStrategyInstance )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1094:6: ( ruleDeclaredStrategyInstance )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1095:1: ruleDeclaredStrategyInstance
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotAccess().getSDeclaredStrategyInstanceParserRuleCall_2_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaredStrategyInstance_in_rule__Not__SAlternatives_2_02332);
                    ruleDeclaredStrategyInstance();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNotAccess().getSDeclaredStrategyInstanceParserRuleCall_2_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1100:6: ( ruleVariableStrategy )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1100:6: ( ruleVariableStrategy )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1101:1: ruleVariableStrategy
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotAccess().getSVariableStrategyParserRuleCall_2_0_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariableStrategy_in_rule__Not__SAlternatives_2_02349);
                    ruleVariableStrategy();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNotAccess().getSVariableStrategyParserRuleCall_2_0_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__SAlternatives_2_0"


    // $ANTLR start "rule__ATerm__Alternatives"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1111:1: rule__ATerm__Alternatives : ( ( ruleTerm ) | ( ruleVariable ) );
    public final void rule__ATerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1115:1: ( ( ruleTerm ) | ( ruleVariable ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_TERMVAR) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1116:1: ( ruleTerm )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1116:1: ( ruleTerm )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1117:1: ruleTerm
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getATermAccess().getTermParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTerm_in_rule__ATerm__Alternatives2381);
                    ruleTerm();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getATermAccess().getTermParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1122:6: ( ruleVariable )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1122:6: ( ruleVariable )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1123:1: ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getATermAccess().getVariableParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_rule__ATerm__Alternatives2398);
                    ruleVariable();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getATermAccess().getVariableParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ATerm__Alternatives"


    // $ANTLR start "rule__ASort__Alternatives"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1133:1: rule__ASort__Alternatives : ( ( ruleSubSort ) | ( ruleSort ) );
    public final void rule__ASort__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1137:1: ( ( ruleSubSort ) | ( ruleSort ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF||LA6_1==19||LA6_1==38) ) {
                    alt6=2;
                }
                else if ( (LA6_1==42) ) {
                    alt6=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1138:1: ( ruleSubSort )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1138:1: ( ruleSubSort )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1139:1: ruleSubSort
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getASortAccess().getSubSortParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSubSort_in_rule__ASort__Alternatives2430);
                    ruleSubSort();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getASortAccess().getSubSortParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1144:6: ( ruleSort )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1144:6: ( ruleSort )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1145:1: ruleSort
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getASortAccess().getSortParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSort_in_rule__ASort__Alternatives2447);
                    ruleSort();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getASortAccess().getSortParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASort__Alternatives"


    // $ANTLR start "rule__TransitionSystem__Group__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1157:1: rule__TransitionSystem__Group__0 : rule__TransitionSystem__Group__0__Impl rule__TransitionSystem__Group__1 ;
    public final void rule__TransitionSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1161:1: ( rule__TransitionSystem__Group__0__Impl rule__TransitionSystem__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1162:2: rule__TransitionSystem__Group__0__Impl rule__TransitionSystem__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__0__Impl_in_rule__TransitionSystem__Group__02477);
            rule__TransitionSystem__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__1_in_rule__TransitionSystem__Group__02480);
            rule__TransitionSystem__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionSystem__Group__0"


    // $ANTLR start "rule__TransitionSystem__Group__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1169:1: rule__TransitionSystem__Group__0__Impl : ( 'TransitionSystem' ) ;
    public final void rule__TransitionSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1173:1: ( ( 'TransitionSystem' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1174:1: ( 'TransitionSystem' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1174:1: ( 'TransitionSystem' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1175:1: 'TransitionSystem'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getTransitionSystemKeyword_0()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__TransitionSystem__Group__0__Impl2508); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionSystemAccess().getTransitionSystemKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionSystem__Group__0__Impl"


    // $ANTLR start "rule__TransitionSystem__Group__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1188:1: rule__TransitionSystem__Group__1 : rule__TransitionSystem__Group__1__Impl rule__TransitionSystem__Group__2 ;
    public final void rule__TransitionSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1192:1: ( rule__TransitionSystem__Group__1__Impl rule__TransitionSystem__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1193:2: rule__TransitionSystem__Group__1__Impl rule__TransitionSystem__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__1__Impl_in_rule__TransitionSystem__Group__12539);
            rule__TransitionSystem__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__2_in_rule__TransitionSystem__Group__12542);
            rule__TransitionSystem__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionSystem__Group__1"


    // $ANTLR start "rule__TransitionSystem__Group__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1200:1: rule__TransitionSystem__Group__1__Impl : ( ( rule__TransitionSystem__AdtAssignment_1 ) ) ;
    public final void rule__TransitionSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1204:1: ( ( ( rule__TransitionSystem__AdtAssignment_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1205:1: ( ( rule__TransitionSystem__AdtAssignment_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1205:1: ( ( rule__TransitionSystem__AdtAssignment_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1206:1: ( rule__TransitionSystem__AdtAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getAdtAssignment_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1207:1: ( rule__TransitionSystem__AdtAssignment_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1207:2: rule__TransitionSystem__AdtAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__AdtAssignment_1_in_rule__TransitionSystem__Group__1__Impl2569);
            rule__TransitionSystem__AdtAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionSystemAccess().getAdtAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionSystem__Group__1__Impl"


    // $ANTLR start "rule__TransitionSystem__Group__2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1217:1: rule__TransitionSystem__Group__2 : rule__TransitionSystem__Group__2__Impl rule__TransitionSystem__Group__3 ;
    public final void rule__TransitionSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1221:1: ( rule__TransitionSystem__Group__2__Impl rule__TransitionSystem__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1222:2: rule__TransitionSystem__Group__2__Impl rule__TransitionSystem__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__2__Impl_in_rule__TransitionSystem__Group__22599);
            rule__TransitionSystem__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__3_in_rule__TransitionSystem__Group__22602);
            rule__TransitionSystem__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionSystem__Group__2"


    // $ANTLR start "rule__TransitionSystem__Group__2__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1229:1: rule__TransitionSystem__Group__2__Impl : ( 'initialState' ) ;
    public final void rule__TransitionSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1233:1: ( ( 'initialState' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1234:1: ( 'initialState' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1234:1: ( 'initialState' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1235:1: 'initialState'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getInitialStateKeyword_2()); 
            }
            match(input,13,FollowSets000.FOLLOW_13_in_rule__TransitionSystem__Group__2__Impl2630); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionSystemAccess().getInitialStateKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionSystem__Group__2__Impl"


    // $ANTLR start "rule__TransitionSystem__Group__3"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1248:1: rule__TransitionSystem__Group__3 : rule__TransitionSystem__Group__3__Impl rule__TransitionSystem__Group__4 ;
    public final void rule__TransitionSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1252:1: ( rule__TransitionSystem__Group__3__Impl rule__TransitionSystem__Group__4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1253:2: rule__TransitionSystem__Group__3__Impl rule__TransitionSystem__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__3__Impl_in_rule__TransitionSystem__Group__32661);
            rule__TransitionSystem__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__4_in_rule__TransitionSystem__Group__32664);
            rule__TransitionSystem__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionSystem__Group__3"


    // $ANTLR start "rule__TransitionSystem__Group__3__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1260:1: rule__TransitionSystem__Group__3__Impl : ( '=' ) ;
    public final void rule__TransitionSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1264:1: ( ( '=' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1265:1: ( '=' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1265:1: ( '=' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1266:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getEqualsSignKeyword_3()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__TransitionSystem__Group__3__Impl2692); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionSystemAccess().getEqualsSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionSystem__Group__3__Impl"


    // $ANTLR start "rule__TransitionSystem__Group__4"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1279:1: rule__TransitionSystem__Group__4 : rule__TransitionSystem__Group__4__Impl rule__TransitionSystem__Group__5 ;
    public final void rule__TransitionSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1283:1: ( rule__TransitionSystem__Group__4__Impl rule__TransitionSystem__Group__5 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1284:2: rule__TransitionSystem__Group__4__Impl rule__TransitionSystem__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__4__Impl_in_rule__TransitionSystem__Group__42723);
            rule__TransitionSystem__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__5_in_rule__TransitionSystem__Group__42726);
            rule__TransitionSystem__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionSystem__Group__4"


    // $ANTLR start "rule__TransitionSystem__Group__4__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1291:1: rule__TransitionSystem__Group__4__Impl : ( ( rule__TransitionSystem__InitialStateAssignment_4 ) ) ;
    public final void rule__TransitionSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1295:1: ( ( ( rule__TransitionSystem__InitialStateAssignment_4 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1296:1: ( ( rule__TransitionSystem__InitialStateAssignment_4 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1296:1: ( ( rule__TransitionSystem__InitialStateAssignment_4 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1297:1: ( rule__TransitionSystem__InitialStateAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getInitialStateAssignment_4()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1298:1: ( rule__TransitionSystem__InitialStateAssignment_4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1298:2: rule__TransitionSystem__InitialStateAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__InitialStateAssignment_4_in_rule__TransitionSystem__Group__4__Impl2753);
            rule__TransitionSystem__InitialStateAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionSystemAccess().getInitialStateAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionSystem__Group__4__Impl"


    // $ANTLR start "rule__TransitionSystem__Group__5"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1308:1: rule__TransitionSystem__Group__5 : rule__TransitionSystem__Group__5__Impl rule__TransitionSystem__Group__6 ;
    public final void rule__TransitionSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1312:1: ( rule__TransitionSystem__Group__5__Impl rule__TransitionSystem__Group__6 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1313:2: rule__TransitionSystem__Group__5__Impl rule__TransitionSystem__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__5__Impl_in_rule__TransitionSystem__Group__52783);
            rule__TransitionSystem__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__6_in_rule__TransitionSystem__Group__52786);
            rule__TransitionSystem__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionSystem__Group__5"


    // $ANTLR start "rule__TransitionSystem__Group__5__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1320:1: rule__TransitionSystem__Group__5__Impl : ( 'Strategies' ) ;
    public final void rule__TransitionSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1324:1: ( ( 'Strategies' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1325:1: ( 'Strategies' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1325:1: ( 'Strategies' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1326:1: 'Strategies'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getStrategiesKeyword_5()); 
            }
            match(input,15,FollowSets000.FOLLOW_15_in_rule__TransitionSystem__Group__5__Impl2814); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionSystemAccess().getStrategiesKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionSystem__Group__5__Impl"


    // $ANTLR start "rule__TransitionSystem__Group__6"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1339:1: rule__TransitionSystem__Group__6 : rule__TransitionSystem__Group__6__Impl rule__TransitionSystem__Group__7 ;
    public final void rule__TransitionSystem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1343:1: ( rule__TransitionSystem__Group__6__Impl rule__TransitionSystem__Group__7 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1344:2: rule__TransitionSystem__Group__6__Impl rule__TransitionSystem__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__6__Impl_in_rule__TransitionSystem__Group__62845);
            rule__TransitionSystem__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__7_in_rule__TransitionSystem__Group__62848);
            rule__TransitionSystem__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionSystem__Group__6"


    // $ANTLR start "rule__TransitionSystem__Group__6__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1351:1: rule__TransitionSystem__Group__6__Impl : ( ( rule__TransitionSystem__AuxiliaryAssignment_6 )* ) ;
    public final void rule__TransitionSystem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1355:1: ( ( ( rule__TransitionSystem__AuxiliaryAssignment_6 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1356:1: ( ( rule__TransitionSystem__AuxiliaryAssignment_6 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1356:1: ( ( rule__TransitionSystem__AuxiliaryAssignment_6 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1357:1: ( rule__TransitionSystem__AuxiliaryAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getAuxiliaryAssignment_6()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1358:1: ( rule__TransitionSystem__AuxiliaryAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1358:2: rule__TransitionSystem__AuxiliaryAssignment_6
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__AuxiliaryAssignment_6_in_rule__TransitionSystem__Group__6__Impl2875);
            	    rule__TransitionSystem__AuxiliaryAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionSystemAccess().getAuxiliaryAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionSystem__Group__6__Impl"


    // $ANTLR start "rule__TransitionSystem__Group__7"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1368:1: rule__TransitionSystem__Group__7 : rule__TransitionSystem__Group__7__Impl rule__TransitionSystem__Group__8 ;
    public final void rule__TransitionSystem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1372:1: ( rule__TransitionSystem__Group__7__Impl rule__TransitionSystem__Group__8 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1373:2: rule__TransitionSystem__Group__7__Impl rule__TransitionSystem__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__7__Impl_in_rule__TransitionSystem__Group__72906);
            rule__TransitionSystem__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__8_in_rule__TransitionSystem__Group__72909);
            rule__TransitionSystem__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionSystem__Group__7"


    // $ANTLR start "rule__TransitionSystem__Group__7__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1380:1: rule__TransitionSystem__Group__7__Impl : ( 'Transitions' ) ;
    public final void rule__TransitionSystem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1384:1: ( ( 'Transitions' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1385:1: ( 'Transitions' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1385:1: ( 'Transitions' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1386:1: 'Transitions'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getTransitionsKeyword_7()); 
            }
            match(input,16,FollowSets000.FOLLOW_16_in_rule__TransitionSystem__Group__7__Impl2937); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionSystemAccess().getTransitionsKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionSystem__Group__7__Impl"


    // $ANTLR start "rule__TransitionSystem__Group__8"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1399:1: rule__TransitionSystem__Group__8 : rule__TransitionSystem__Group__8__Impl ;
    public final void rule__TransitionSystem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1403:1: ( rule__TransitionSystem__Group__8__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1404:2: rule__TransitionSystem__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__8__Impl_in_rule__TransitionSystem__Group__82968);
            rule__TransitionSystem__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionSystem__Group__8"


    // $ANTLR start "rule__TransitionSystem__Group__8__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1410:1: rule__TransitionSystem__Group__8__Impl : ( ( rule__TransitionSystem__TransitionsAssignment_8 )* ) ;
    public final void rule__TransitionSystem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1414:1: ( ( ( rule__TransitionSystem__TransitionsAssignment_8 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1415:1: ( ( rule__TransitionSystem__TransitionsAssignment_8 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1415:1: ( ( rule__TransitionSystem__TransitionsAssignment_8 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1416:1: ( rule__TransitionSystem__TransitionsAssignment_8 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getTransitionsAssignment_8()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1417:1: ( rule__TransitionSystem__TransitionsAssignment_8 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1417:2: rule__TransitionSystem__TransitionsAssignment_8
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__TransitionsAssignment_8_in_rule__TransitionSystem__Group__8__Impl2995);
            	    rule__TransitionSystem__TransitionsAssignment_8();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionSystemAccess().getTransitionsAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionSystem__Group__8__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1445:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1449:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1450:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__03044);
            rule__Transition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__03047);
            rule__Transition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1457:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__NameAssignment_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1461:1: ( ( ( rule__Transition__NameAssignment_0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1462:1: ( ( rule__Transition__NameAssignment_0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1462:1: ( ( rule__Transition__NameAssignment_0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1463:1: ( rule__Transition__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getNameAssignment_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1464:1: ( rule__Transition__NameAssignment_0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1464:2: rule__Transition__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__NameAssignment_0_in_rule__Transition__Group__0__Impl3074);
            rule__Transition__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1474:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1478:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1479:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__13104);
            rule__Transition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__13107);
            rule__Transition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1486:1: rule__Transition__Group__1__Impl : ( '=' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1490:1: ( ( '=' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1491:1: ( '=' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1491:1: ( '=' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1492:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getEqualsSignKeyword_1()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Transition__Group__1__Impl3135); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1505:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1509:1: ( rule__Transition__Group__2__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1510:2: rule__Transition__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__23166);
            rule__Transition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1516:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__BodyAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1520:1: ( ( ( rule__Transition__BodyAssignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1521:1: ( ( rule__Transition__BodyAssignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1521:1: ( ( rule__Transition__BodyAssignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1522:1: ( rule__Transition__BodyAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getBodyAssignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1523:1: ( rule__Transition__BodyAssignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1523:2: rule__Transition__BodyAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__BodyAssignment_2_in_rule__Transition__Group__2__Impl3193);
            rule__Transition__BodyAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getBodyAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Auxiliary__Group__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1539:1: rule__Auxiliary__Group__0 : rule__Auxiliary__Group__0__Impl rule__Auxiliary__Group__1 ;
    public final void rule__Auxiliary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1543:1: ( rule__Auxiliary__Group__0__Impl rule__Auxiliary__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1544:2: rule__Auxiliary__Group__0__Impl rule__Auxiliary__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group__0__Impl_in_rule__Auxiliary__Group__03229);
            rule__Auxiliary__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group__1_in_rule__Auxiliary__Group__03232);
            rule__Auxiliary__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auxiliary__Group__0"


    // $ANTLR start "rule__Auxiliary__Group__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1551:1: rule__Auxiliary__Group__0__Impl : ( ( rule__Auxiliary__NameAssignment_0 ) ) ;
    public final void rule__Auxiliary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1555:1: ( ( ( rule__Auxiliary__NameAssignment_0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1556:1: ( ( rule__Auxiliary__NameAssignment_0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1556:1: ( ( rule__Auxiliary__NameAssignment_0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1557:1: ( rule__Auxiliary__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getNameAssignment_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1558:1: ( rule__Auxiliary__NameAssignment_0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1558:2: rule__Auxiliary__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__NameAssignment_0_in_rule__Auxiliary__Group__0__Impl3259);
            rule__Auxiliary__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuxiliaryAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auxiliary__Group__0__Impl"


    // $ANTLR start "rule__Auxiliary__Group__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1568:1: rule__Auxiliary__Group__1 : rule__Auxiliary__Group__1__Impl rule__Auxiliary__Group__2 ;
    public final void rule__Auxiliary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1572:1: ( rule__Auxiliary__Group__1__Impl rule__Auxiliary__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1573:2: rule__Auxiliary__Group__1__Impl rule__Auxiliary__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group__1__Impl_in_rule__Auxiliary__Group__13289);
            rule__Auxiliary__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group__2_in_rule__Auxiliary__Group__13292);
            rule__Auxiliary__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auxiliary__Group__1"


    // $ANTLR start "rule__Auxiliary__Group__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1580:1: rule__Auxiliary__Group__1__Impl : ( ( rule__Auxiliary__Group_1__0 )? ) ;
    public final void rule__Auxiliary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1584:1: ( ( ( rule__Auxiliary__Group_1__0 )? ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1585:1: ( ( rule__Auxiliary__Group_1__0 )? )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1585:1: ( ( rule__Auxiliary__Group_1__0 )? )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1586:1: ( rule__Auxiliary__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getGroup_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1587:1: ( rule__Auxiliary__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1587:2: rule__Auxiliary__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1__0_in_rule__Auxiliary__Group__1__Impl3319);
                    rule__Auxiliary__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuxiliaryAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auxiliary__Group__1__Impl"


    // $ANTLR start "rule__Auxiliary__Group__2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1597:1: rule__Auxiliary__Group__2 : rule__Auxiliary__Group__2__Impl rule__Auxiliary__Group__3 ;
    public final void rule__Auxiliary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1601:1: ( rule__Auxiliary__Group__2__Impl rule__Auxiliary__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1602:2: rule__Auxiliary__Group__2__Impl rule__Auxiliary__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group__2__Impl_in_rule__Auxiliary__Group__23350);
            rule__Auxiliary__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group__3_in_rule__Auxiliary__Group__23353);
            rule__Auxiliary__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auxiliary__Group__2"


    // $ANTLR start "rule__Auxiliary__Group__2__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1609:1: rule__Auxiliary__Group__2__Impl : ( '=' ) ;
    public final void rule__Auxiliary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1613:1: ( ( '=' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1614:1: ( '=' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1614:1: ( '=' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1615:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getEqualsSignKeyword_2()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Auxiliary__Group__2__Impl3381); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuxiliaryAccess().getEqualsSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auxiliary__Group__2__Impl"


    // $ANTLR start "rule__Auxiliary__Group__3"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1628:1: rule__Auxiliary__Group__3 : rule__Auxiliary__Group__3__Impl ;
    public final void rule__Auxiliary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1632:1: ( rule__Auxiliary__Group__3__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1633:2: rule__Auxiliary__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group__3__Impl_in_rule__Auxiliary__Group__33412);
            rule__Auxiliary__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auxiliary__Group__3"


    // $ANTLR start "rule__Auxiliary__Group__3__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1639:1: rule__Auxiliary__Group__3__Impl : ( ( rule__Auxiliary__BodyAssignment_3 ) ) ;
    public final void rule__Auxiliary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1643:1: ( ( ( rule__Auxiliary__BodyAssignment_3 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1644:1: ( ( rule__Auxiliary__BodyAssignment_3 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1644:1: ( ( rule__Auxiliary__BodyAssignment_3 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1645:1: ( rule__Auxiliary__BodyAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getBodyAssignment_3()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1646:1: ( rule__Auxiliary__BodyAssignment_3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1646:2: rule__Auxiliary__BodyAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__BodyAssignment_3_in_rule__Auxiliary__Group__3__Impl3439);
            rule__Auxiliary__BodyAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuxiliaryAccess().getBodyAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auxiliary__Group__3__Impl"


    // $ANTLR start "rule__Auxiliary__Group_1__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1664:1: rule__Auxiliary__Group_1__0 : rule__Auxiliary__Group_1__0__Impl rule__Auxiliary__Group_1__1 ;
    public final void rule__Auxiliary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1668:1: ( rule__Auxiliary__Group_1__0__Impl rule__Auxiliary__Group_1__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1669:2: rule__Auxiliary__Group_1__0__Impl rule__Auxiliary__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1__0__Impl_in_rule__Auxiliary__Group_1__03477);
            rule__Auxiliary__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1__1_in_rule__Auxiliary__Group_1__03480);
            rule__Auxiliary__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auxiliary__Group_1__0"


    // $ANTLR start "rule__Auxiliary__Group_1__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1676:1: rule__Auxiliary__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Auxiliary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1680:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1681:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1681:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1682:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Auxiliary__Group_1__0__Impl3508); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuxiliaryAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auxiliary__Group_1__0__Impl"


    // $ANTLR start "rule__Auxiliary__Group_1__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1695:1: rule__Auxiliary__Group_1__1 : rule__Auxiliary__Group_1__1__Impl rule__Auxiliary__Group_1__2 ;
    public final void rule__Auxiliary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1699:1: ( rule__Auxiliary__Group_1__1__Impl rule__Auxiliary__Group_1__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1700:2: rule__Auxiliary__Group_1__1__Impl rule__Auxiliary__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1__1__Impl_in_rule__Auxiliary__Group_1__13539);
            rule__Auxiliary__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1__2_in_rule__Auxiliary__Group_1__13542);
            rule__Auxiliary__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auxiliary__Group_1__1"


    // $ANTLR start "rule__Auxiliary__Group_1__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1707:1: rule__Auxiliary__Group_1__1__Impl : ( ( rule__Auxiliary__FormalParamsAssignment_1_1 ) ) ;
    public final void rule__Auxiliary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1711:1: ( ( ( rule__Auxiliary__FormalParamsAssignment_1_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1712:1: ( ( rule__Auxiliary__FormalParamsAssignment_1_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1712:1: ( ( rule__Auxiliary__FormalParamsAssignment_1_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1713:1: ( rule__Auxiliary__FormalParamsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getFormalParamsAssignment_1_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1714:1: ( rule__Auxiliary__FormalParamsAssignment_1_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1714:2: rule__Auxiliary__FormalParamsAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__FormalParamsAssignment_1_1_in_rule__Auxiliary__Group_1__1__Impl3569);
            rule__Auxiliary__FormalParamsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuxiliaryAccess().getFormalParamsAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auxiliary__Group_1__1__Impl"


    // $ANTLR start "rule__Auxiliary__Group_1__2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1724:1: rule__Auxiliary__Group_1__2 : rule__Auxiliary__Group_1__2__Impl rule__Auxiliary__Group_1__3 ;
    public final void rule__Auxiliary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1728:1: ( rule__Auxiliary__Group_1__2__Impl rule__Auxiliary__Group_1__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1729:2: rule__Auxiliary__Group_1__2__Impl rule__Auxiliary__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1__2__Impl_in_rule__Auxiliary__Group_1__23599);
            rule__Auxiliary__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1__3_in_rule__Auxiliary__Group_1__23602);
            rule__Auxiliary__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auxiliary__Group_1__2"


    // $ANTLR start "rule__Auxiliary__Group_1__2__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1736:1: rule__Auxiliary__Group_1__2__Impl : ( ( rule__Auxiliary__Group_1_2__0 )* ) ;
    public final void rule__Auxiliary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1740:1: ( ( ( rule__Auxiliary__Group_1_2__0 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1741:1: ( ( rule__Auxiliary__Group_1_2__0 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1741:1: ( ( rule__Auxiliary__Group_1_2__0 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1742:1: ( rule__Auxiliary__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getGroup_1_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1743:1: ( rule__Auxiliary__Group_1_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1743:2: rule__Auxiliary__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1_2__0_in_rule__Auxiliary__Group_1__2__Impl3629);
            	    rule__Auxiliary__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuxiliaryAccess().getGroup_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auxiliary__Group_1__2__Impl"


    // $ANTLR start "rule__Auxiliary__Group_1__3"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1753:1: rule__Auxiliary__Group_1__3 : rule__Auxiliary__Group_1__3__Impl ;
    public final void rule__Auxiliary__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1757:1: ( rule__Auxiliary__Group_1__3__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1758:2: rule__Auxiliary__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1__3__Impl_in_rule__Auxiliary__Group_1__33660);
            rule__Auxiliary__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auxiliary__Group_1__3"


    // $ANTLR start "rule__Auxiliary__Group_1__3__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1764:1: rule__Auxiliary__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Auxiliary__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1768:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1769:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1769:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1770:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getRightParenthesisKeyword_1_3()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Auxiliary__Group_1__3__Impl3688); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuxiliaryAccess().getRightParenthesisKeyword_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auxiliary__Group_1__3__Impl"


    // $ANTLR start "rule__Auxiliary__Group_1_2__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1791:1: rule__Auxiliary__Group_1_2__0 : rule__Auxiliary__Group_1_2__0__Impl rule__Auxiliary__Group_1_2__1 ;
    public final void rule__Auxiliary__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1795:1: ( rule__Auxiliary__Group_1_2__0__Impl rule__Auxiliary__Group_1_2__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1796:2: rule__Auxiliary__Group_1_2__0__Impl rule__Auxiliary__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1_2__0__Impl_in_rule__Auxiliary__Group_1_2__03727);
            rule__Auxiliary__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1_2__1_in_rule__Auxiliary__Group_1_2__03730);
            rule__Auxiliary__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auxiliary__Group_1_2__0"


    // $ANTLR start "rule__Auxiliary__Group_1_2__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1803:1: rule__Auxiliary__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Auxiliary__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1807:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1808:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1808:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1809:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getCommaKeyword_1_2_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Auxiliary__Group_1_2__0__Impl3758); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuxiliaryAccess().getCommaKeyword_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auxiliary__Group_1_2__0__Impl"


    // $ANTLR start "rule__Auxiliary__Group_1_2__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1822:1: rule__Auxiliary__Group_1_2__1 : rule__Auxiliary__Group_1_2__1__Impl ;
    public final void rule__Auxiliary__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1826:1: ( rule__Auxiliary__Group_1_2__1__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1827:2: rule__Auxiliary__Group_1_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1_2__1__Impl_in_rule__Auxiliary__Group_1_2__13789);
            rule__Auxiliary__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auxiliary__Group_1_2__1"


    // $ANTLR start "rule__Auxiliary__Group_1_2__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1833:1: rule__Auxiliary__Group_1_2__1__Impl : ( ( rule__Auxiliary__FormalParamsAssignment_1_2_1 ) ) ;
    public final void rule__Auxiliary__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1837:1: ( ( ( rule__Auxiliary__FormalParamsAssignment_1_2_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1838:1: ( ( rule__Auxiliary__FormalParamsAssignment_1_2_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1838:1: ( ( rule__Auxiliary__FormalParamsAssignment_1_2_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1839:1: ( rule__Auxiliary__FormalParamsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getFormalParamsAssignment_1_2_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1840:1: ( rule__Auxiliary__FormalParamsAssignment_1_2_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1840:2: rule__Auxiliary__FormalParamsAssignment_1_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__FormalParamsAssignment_1_2_1_in_rule__Auxiliary__Group_1_2__1__Impl3816);
            rule__Auxiliary__FormalParamsAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuxiliaryAccess().getFormalParamsAssignment_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auxiliary__Group_1_2__1__Impl"


    // $ANTLR start "rule__One__Group__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1854:1: rule__One__Group__0 : rule__One__Group__0__Impl rule__One__Group__1 ;
    public final void rule__One__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1858:1: ( rule__One__Group__0__Impl rule__One__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1859:2: rule__One__Group__0__Impl rule__One__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__0__Impl_in_rule__One__Group__03850);
            rule__One__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__1_in_rule__One__Group__03853);
            rule__One__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__One__Group__0"


    // $ANTLR start "rule__One__Group__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1866:1: rule__One__Group__0__Impl : ( 'One' ) ;
    public final void rule__One__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1870:1: ( ( 'One' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1871:1: ( 'One' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1871:1: ( 'One' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1872:1: 'One'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneAccess().getOneKeyword_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__One__Group__0__Impl3881); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneAccess().getOneKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__One__Group__0__Impl"


    // $ANTLR start "rule__One__Group__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1885:1: rule__One__Group__1 : rule__One__Group__1__Impl rule__One__Group__2 ;
    public final void rule__One__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1889:1: ( rule__One__Group__1__Impl rule__One__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1890:2: rule__One__Group__1__Impl rule__One__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__1__Impl_in_rule__One__Group__13912);
            rule__One__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__2_in_rule__One__Group__13915);
            rule__One__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__One__Group__1"


    // $ANTLR start "rule__One__Group__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1897:1: rule__One__Group__1__Impl : ( '(' ) ;
    public final void rule__One__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1901:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1902:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1902:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1903:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__One__Group__1__Impl3943); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__One__Group__1__Impl"


    // $ANTLR start "rule__One__Group__2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1916:1: rule__One__Group__2 : rule__One__Group__2__Impl rule__One__Group__3 ;
    public final void rule__One__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1920:1: ( rule__One__Group__2__Impl rule__One__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1921:2: rule__One__Group__2__Impl rule__One__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__2__Impl_in_rule__One__Group__23974);
            rule__One__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__3_in_rule__One__Group__23977);
            rule__One__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__One__Group__2"


    // $ANTLR start "rule__One__Group__2__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1928:1: rule__One__Group__2__Impl : ( ( rule__One__SAssignment_2 ) ) ;
    public final void rule__One__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1932:1: ( ( ( rule__One__SAssignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1933:1: ( ( rule__One__SAssignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1933:1: ( ( rule__One__SAssignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1934:1: ( rule__One__SAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneAccess().getSAssignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1935:1: ( rule__One__SAssignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1935:2: rule__One__SAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__One__SAssignment_2_in_rule__One__Group__2__Impl4004);
            rule__One__SAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneAccess().getSAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__One__Group__2__Impl"


    // $ANTLR start "rule__One__Group__3"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1945:1: rule__One__Group__3 : rule__One__Group__3__Impl rule__One__Group__4 ;
    public final void rule__One__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1949:1: ( rule__One__Group__3__Impl rule__One__Group__4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1950:2: rule__One__Group__3__Impl rule__One__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__3__Impl_in_rule__One__Group__34034);
            rule__One__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__4_in_rule__One__Group__34037);
            rule__One__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__One__Group__3"


    // $ANTLR start "rule__One__Group__3__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1957:1: rule__One__Group__3__Impl : ( ',' ) ;
    public final void rule__One__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1961:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1962:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1962:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1963:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneAccess().getCommaKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__One__Group__3__Impl4065); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneAccess().getCommaKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__One__Group__3__Impl"


    // $ANTLR start "rule__One__Group__4"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1976:1: rule__One__Group__4 : rule__One__Group__4__Impl rule__One__Group__5 ;
    public final void rule__One__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1980:1: ( rule__One__Group__4__Impl rule__One__Group__5 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1981:2: rule__One__Group__4__Impl rule__One__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__4__Impl_in_rule__One__Group__44096);
            rule__One__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__5_in_rule__One__Group__44099);
            rule__One__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__One__Group__4"


    // $ANTLR start "rule__One__Group__4__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1988:1: rule__One__Group__4__Impl : ( ( rule__One__NAssignment_4 ) ) ;
    public final void rule__One__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1992:1: ( ( ( rule__One__NAssignment_4 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1993:1: ( ( rule__One__NAssignment_4 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1993:1: ( ( rule__One__NAssignment_4 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1994:1: ( rule__One__NAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneAccess().getNAssignment_4()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1995:1: ( rule__One__NAssignment_4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1995:2: rule__One__NAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__One__NAssignment_4_in_rule__One__Group__4__Impl4126);
            rule__One__NAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneAccess().getNAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__One__Group__4__Impl"


    // $ANTLR start "rule__One__Group__5"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2005:1: rule__One__Group__5 : rule__One__Group__5__Impl ;
    public final void rule__One__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2009:1: ( rule__One__Group__5__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2010:2: rule__One__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__5__Impl_in_rule__One__Group__54156);
            rule__One__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__One__Group__5"


    // $ANTLR start "rule__One__Group__5__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2016:1: rule__One__Group__5__Impl : ( ')' ) ;
    public final void rule__One__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2020:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2021:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2021:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2022:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__One__Group__5__Impl4184); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__One__Group__5__Impl"


    // $ANTLR start "rule__DeclaredStrategyInstance__Group__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2047:1: rule__DeclaredStrategyInstance__Group__0 : rule__DeclaredStrategyInstance__Group__0__Impl rule__DeclaredStrategyInstance__Group__1 ;
    public final void rule__DeclaredStrategyInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2051:1: ( rule__DeclaredStrategyInstance__Group__0__Impl rule__DeclaredStrategyInstance__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2052:2: rule__DeclaredStrategyInstance__Group__0__Impl rule__DeclaredStrategyInstance__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group__0__Impl_in_rule__DeclaredStrategyInstance__Group__04227);
            rule__DeclaredStrategyInstance__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group__1_in_rule__DeclaredStrategyInstance__Group__04230);
            rule__DeclaredStrategyInstance__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredStrategyInstance__Group__0"


    // $ANTLR start "rule__DeclaredStrategyInstance__Group__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2059:1: rule__DeclaredStrategyInstance__Group__0__Impl : ( () ) ;
    public final void rule__DeclaredStrategyInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2063:1: ( ( () ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2064:1: ( () )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2064:1: ( () )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2065:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getDeclaredStrategyInstanceAction_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2066:1: ()
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2068:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredStrategyInstanceAccess().getDeclaredStrategyInstanceAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredStrategyInstance__Group__0__Impl"


    // $ANTLR start "rule__DeclaredStrategyInstance__Group__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2078:1: rule__DeclaredStrategyInstance__Group__1 : rule__DeclaredStrategyInstance__Group__1__Impl rule__DeclaredStrategyInstance__Group__2 ;
    public final void rule__DeclaredStrategyInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2082:1: ( rule__DeclaredStrategyInstance__Group__1__Impl rule__DeclaredStrategyInstance__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2083:2: rule__DeclaredStrategyInstance__Group__1__Impl rule__DeclaredStrategyInstance__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group__1__Impl_in_rule__DeclaredStrategyInstance__Group__14288);
            rule__DeclaredStrategyInstance__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group__2_in_rule__DeclaredStrategyInstance__Group__14291);
            rule__DeclaredStrategyInstance__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredStrategyInstance__Group__1"


    // $ANTLR start "rule__DeclaredStrategyInstance__Group__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2090:1: rule__DeclaredStrategyInstance__Group__1__Impl : ( ( rule__DeclaredStrategyInstance__DeclarationAssignment_1 ) ) ;
    public final void rule__DeclaredStrategyInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2094:1: ( ( ( rule__DeclaredStrategyInstance__DeclarationAssignment_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2095:1: ( ( rule__DeclaredStrategyInstance__DeclarationAssignment_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2095:1: ( ( rule__DeclaredStrategyInstance__DeclarationAssignment_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2096:1: ( rule__DeclaredStrategyInstance__DeclarationAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getDeclarationAssignment_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2097:1: ( rule__DeclaredStrategyInstance__DeclarationAssignment_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2097:2: rule__DeclaredStrategyInstance__DeclarationAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__DeclarationAssignment_1_in_rule__DeclaredStrategyInstance__Group__1__Impl4318);
            rule__DeclaredStrategyInstance__DeclarationAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredStrategyInstanceAccess().getDeclarationAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredStrategyInstance__Group__1__Impl"


    // $ANTLR start "rule__DeclaredStrategyInstance__Group__2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2107:1: rule__DeclaredStrategyInstance__Group__2 : rule__DeclaredStrategyInstance__Group__2__Impl rule__DeclaredStrategyInstance__Group__3 ;
    public final void rule__DeclaredStrategyInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2111:1: ( rule__DeclaredStrategyInstance__Group__2__Impl rule__DeclaredStrategyInstance__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2112:2: rule__DeclaredStrategyInstance__Group__2__Impl rule__DeclaredStrategyInstance__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group__2__Impl_in_rule__DeclaredStrategyInstance__Group__24348);
            rule__DeclaredStrategyInstance__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group__3_in_rule__DeclaredStrategyInstance__Group__24351);
            rule__DeclaredStrategyInstance__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredStrategyInstance__Group__2"


    // $ANTLR start "rule__DeclaredStrategyInstance__Group__2__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2119:1: rule__DeclaredStrategyInstance__Group__2__Impl : ( '(' ) ;
    public final void rule__DeclaredStrategyInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2123:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2124:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2124:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2125:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__DeclaredStrategyInstance__Group__2__Impl4379); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredStrategyInstanceAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredStrategyInstance__Group__2__Impl"


    // $ANTLR start "rule__DeclaredStrategyInstance__Group__3"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2138:1: rule__DeclaredStrategyInstance__Group__3 : rule__DeclaredStrategyInstance__Group__3__Impl rule__DeclaredStrategyInstance__Group__4 ;
    public final void rule__DeclaredStrategyInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2142:1: ( rule__DeclaredStrategyInstance__Group__3__Impl rule__DeclaredStrategyInstance__Group__4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2143:2: rule__DeclaredStrategyInstance__Group__3__Impl rule__DeclaredStrategyInstance__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group__3__Impl_in_rule__DeclaredStrategyInstance__Group__34410);
            rule__DeclaredStrategyInstance__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group__4_in_rule__DeclaredStrategyInstance__Group__34413);
            rule__DeclaredStrategyInstance__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredStrategyInstance__Group__3"


    // $ANTLR start "rule__DeclaredStrategyInstance__Group__3__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2150:1: rule__DeclaredStrategyInstance__Group__3__Impl : ( ( rule__DeclaredStrategyInstance__Group_3__0 )? ) ;
    public final void rule__DeclaredStrategyInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2154:1: ( ( ( rule__DeclaredStrategyInstance__Group_3__0 )? ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2155:1: ( ( rule__DeclaredStrategyInstance__Group_3__0 )? )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2155:1: ( ( rule__DeclaredStrategyInstance__Group_3__0 )? )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2156:1: ( rule__DeclaredStrategyInstance__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getGroup_3()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2157:1: ( rule__DeclaredStrategyInstance__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID||(LA11_0>=20 && LA11_0<=23)||(LA11_0>=25 && LA11_0<=32)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2157:2: rule__DeclaredStrategyInstance__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group_3__0_in_rule__DeclaredStrategyInstance__Group__3__Impl4440);
                    rule__DeclaredStrategyInstance__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredStrategyInstanceAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredStrategyInstance__Group__3__Impl"


    // $ANTLR start "rule__DeclaredStrategyInstance__Group__4"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2167:1: rule__DeclaredStrategyInstance__Group__4 : rule__DeclaredStrategyInstance__Group__4__Impl ;
    public final void rule__DeclaredStrategyInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2171:1: ( rule__DeclaredStrategyInstance__Group__4__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2172:2: rule__DeclaredStrategyInstance__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group__4__Impl_in_rule__DeclaredStrategyInstance__Group__44471);
            rule__DeclaredStrategyInstance__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredStrategyInstance__Group__4"


    // $ANTLR start "rule__DeclaredStrategyInstance__Group__4__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2178:1: rule__DeclaredStrategyInstance__Group__4__Impl : ( ')' ) ;
    public final void rule__DeclaredStrategyInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2182:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2183:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2183:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2184:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__DeclaredStrategyInstance__Group__4__Impl4499); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredStrategyInstanceAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredStrategyInstance__Group__4__Impl"


    // $ANTLR start "rule__DeclaredStrategyInstance__Group_3__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2207:1: rule__DeclaredStrategyInstance__Group_3__0 : rule__DeclaredStrategyInstance__Group_3__0__Impl rule__DeclaredStrategyInstance__Group_3__1 ;
    public final void rule__DeclaredStrategyInstance__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2211:1: ( rule__DeclaredStrategyInstance__Group_3__0__Impl rule__DeclaredStrategyInstance__Group_3__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2212:2: rule__DeclaredStrategyInstance__Group_3__0__Impl rule__DeclaredStrategyInstance__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group_3__0__Impl_in_rule__DeclaredStrategyInstance__Group_3__04540);
            rule__DeclaredStrategyInstance__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group_3__1_in_rule__DeclaredStrategyInstance__Group_3__04543);
            rule__DeclaredStrategyInstance__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredStrategyInstance__Group_3__0"


    // $ANTLR start "rule__DeclaredStrategyInstance__Group_3__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2219:1: rule__DeclaredStrategyInstance__Group_3__0__Impl : ( ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0 ) ) ;
    public final void rule__DeclaredStrategyInstance__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2223:1: ( ( ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2224:1: ( ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2224:1: ( ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2225:1: ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getActualParamsAssignment_3_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2226:1: ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2226:2: rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0_in_rule__DeclaredStrategyInstance__Group_3__0__Impl4570);
            rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredStrategyInstanceAccess().getActualParamsAssignment_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredStrategyInstance__Group_3__0__Impl"


    // $ANTLR start "rule__DeclaredStrategyInstance__Group_3__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2236:1: rule__DeclaredStrategyInstance__Group_3__1 : rule__DeclaredStrategyInstance__Group_3__1__Impl ;
    public final void rule__DeclaredStrategyInstance__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2240:1: ( rule__DeclaredStrategyInstance__Group_3__1__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2241:2: rule__DeclaredStrategyInstance__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group_3__1__Impl_in_rule__DeclaredStrategyInstance__Group_3__14600);
            rule__DeclaredStrategyInstance__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredStrategyInstance__Group_3__1"


    // $ANTLR start "rule__DeclaredStrategyInstance__Group_3__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2247:1: rule__DeclaredStrategyInstance__Group_3__1__Impl : ( ( rule__DeclaredStrategyInstance__Group_3_1__0 )* ) ;
    public final void rule__DeclaredStrategyInstance__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2251:1: ( ( ( rule__DeclaredStrategyInstance__Group_3_1__0 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2252:1: ( ( rule__DeclaredStrategyInstance__Group_3_1__0 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2252:1: ( ( rule__DeclaredStrategyInstance__Group_3_1__0 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2253:1: ( rule__DeclaredStrategyInstance__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getGroup_3_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2254:1: ( rule__DeclaredStrategyInstance__Group_3_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2254:2: rule__DeclaredStrategyInstance__Group_3_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group_3_1__0_in_rule__DeclaredStrategyInstance__Group_3__1__Impl4627);
            	    rule__DeclaredStrategyInstance__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredStrategyInstanceAccess().getGroup_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredStrategyInstance__Group_3__1__Impl"


    // $ANTLR start "rule__DeclaredStrategyInstance__Group_3_1__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2268:1: rule__DeclaredStrategyInstance__Group_3_1__0 : rule__DeclaredStrategyInstance__Group_3_1__0__Impl rule__DeclaredStrategyInstance__Group_3_1__1 ;
    public final void rule__DeclaredStrategyInstance__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2272:1: ( rule__DeclaredStrategyInstance__Group_3_1__0__Impl rule__DeclaredStrategyInstance__Group_3_1__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2273:2: rule__DeclaredStrategyInstance__Group_3_1__0__Impl rule__DeclaredStrategyInstance__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group_3_1__0__Impl_in_rule__DeclaredStrategyInstance__Group_3_1__04662);
            rule__DeclaredStrategyInstance__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group_3_1__1_in_rule__DeclaredStrategyInstance__Group_3_1__04665);
            rule__DeclaredStrategyInstance__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredStrategyInstance__Group_3_1__0"


    // $ANTLR start "rule__DeclaredStrategyInstance__Group_3_1__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2280:1: rule__DeclaredStrategyInstance__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__DeclaredStrategyInstance__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2284:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2285:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2285:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2286:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__DeclaredStrategyInstance__Group_3_1__0__Impl4693); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredStrategyInstanceAccess().getCommaKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredStrategyInstance__Group_3_1__0__Impl"


    // $ANTLR start "rule__DeclaredStrategyInstance__Group_3_1__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2299:1: rule__DeclaredStrategyInstance__Group_3_1__1 : rule__DeclaredStrategyInstance__Group_3_1__1__Impl ;
    public final void rule__DeclaredStrategyInstance__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2303:1: ( rule__DeclaredStrategyInstance__Group_3_1__1__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2304:2: rule__DeclaredStrategyInstance__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group_3_1__1__Impl_in_rule__DeclaredStrategyInstance__Group_3_1__14724);
            rule__DeclaredStrategyInstance__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredStrategyInstance__Group_3_1__1"


    // $ANTLR start "rule__DeclaredStrategyInstance__Group_3_1__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2310:1: rule__DeclaredStrategyInstance__Group_3_1__1__Impl : ( ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1 ) ) ;
    public final void rule__DeclaredStrategyInstance__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2314:1: ( ( ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2315:1: ( ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2315:1: ( ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2316:1: ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getActualParamsAssignment_3_1_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2317:1: ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2317:2: rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1_in_rule__DeclaredStrategyInstance__Group_3_1__1__Impl4751);
            rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredStrategyInstanceAccess().getActualParamsAssignment_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredStrategyInstance__Group_3_1__1__Impl"


    // $ANTLR start "rule__Saturation__Group__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2331:1: rule__Saturation__Group__0 : rule__Saturation__Group__0__Impl rule__Saturation__Group__1 ;
    public final void rule__Saturation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2335:1: ( rule__Saturation__Group__0__Impl rule__Saturation__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2336:2: rule__Saturation__Group__0__Impl rule__Saturation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__0__Impl_in_rule__Saturation__Group__04785);
            rule__Saturation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__1_in_rule__Saturation__Group__04788);
            rule__Saturation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saturation__Group__0"


    // $ANTLR start "rule__Saturation__Group__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2343:1: rule__Saturation__Group__0__Impl : ( 'Saturation' ) ;
    public final void rule__Saturation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2347:1: ( ( 'Saturation' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2348:1: ( 'Saturation' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2348:1: ( 'Saturation' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2349:1: 'Saturation'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSaturationAccess().getSaturationKeyword_0()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Saturation__Group__0__Impl4816); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSaturationAccess().getSaturationKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saturation__Group__0__Impl"


    // $ANTLR start "rule__Saturation__Group__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2362:1: rule__Saturation__Group__1 : rule__Saturation__Group__1__Impl rule__Saturation__Group__2 ;
    public final void rule__Saturation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2366:1: ( rule__Saturation__Group__1__Impl rule__Saturation__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2367:2: rule__Saturation__Group__1__Impl rule__Saturation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__1__Impl_in_rule__Saturation__Group__14847);
            rule__Saturation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__2_in_rule__Saturation__Group__14850);
            rule__Saturation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saturation__Group__1"


    // $ANTLR start "rule__Saturation__Group__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2374:1: rule__Saturation__Group__1__Impl : ( '(' ) ;
    public final void rule__Saturation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2378:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2379:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2379:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2380:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSaturationAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Saturation__Group__1__Impl4878); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSaturationAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saturation__Group__1__Impl"


    // $ANTLR start "rule__Saturation__Group__2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2393:1: rule__Saturation__Group__2 : rule__Saturation__Group__2__Impl rule__Saturation__Group__3 ;
    public final void rule__Saturation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2397:1: ( rule__Saturation__Group__2__Impl rule__Saturation__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2398:2: rule__Saturation__Group__2__Impl rule__Saturation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__2__Impl_in_rule__Saturation__Group__24909);
            rule__Saturation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__3_in_rule__Saturation__Group__24912);
            rule__Saturation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saturation__Group__2"


    // $ANTLR start "rule__Saturation__Group__2__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2405:1: rule__Saturation__Group__2__Impl : ( ( rule__Saturation__SAssignment_2 ) ) ;
    public final void rule__Saturation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2409:1: ( ( ( rule__Saturation__SAssignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2410:1: ( ( rule__Saturation__SAssignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2410:1: ( ( rule__Saturation__SAssignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2411:1: ( rule__Saturation__SAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSaturationAccess().getSAssignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2412:1: ( rule__Saturation__SAssignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2412:2: rule__Saturation__SAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__SAssignment_2_in_rule__Saturation__Group__2__Impl4939);
            rule__Saturation__SAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSaturationAccess().getSAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saturation__Group__2__Impl"


    // $ANTLR start "rule__Saturation__Group__3"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2422:1: rule__Saturation__Group__3 : rule__Saturation__Group__3__Impl rule__Saturation__Group__4 ;
    public final void rule__Saturation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2426:1: ( rule__Saturation__Group__3__Impl rule__Saturation__Group__4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2427:2: rule__Saturation__Group__3__Impl rule__Saturation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__3__Impl_in_rule__Saturation__Group__34969);
            rule__Saturation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__4_in_rule__Saturation__Group__34972);
            rule__Saturation__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saturation__Group__3"


    // $ANTLR start "rule__Saturation__Group__3__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2434:1: rule__Saturation__Group__3__Impl : ( ',' ) ;
    public final void rule__Saturation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2438:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2439:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2439:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2440:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSaturationAccess().getCommaKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Saturation__Group__3__Impl5000); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSaturationAccess().getCommaKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saturation__Group__3__Impl"


    // $ANTLR start "rule__Saturation__Group__4"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2453:1: rule__Saturation__Group__4 : rule__Saturation__Group__4__Impl rule__Saturation__Group__5 ;
    public final void rule__Saturation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2457:1: ( rule__Saturation__Group__4__Impl rule__Saturation__Group__5 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2458:2: rule__Saturation__Group__4__Impl rule__Saturation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__4__Impl_in_rule__Saturation__Group__45031);
            rule__Saturation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__5_in_rule__Saturation__Group__45034);
            rule__Saturation__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saturation__Group__4"


    // $ANTLR start "rule__Saturation__Group__4__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2465:1: rule__Saturation__Group__4__Impl : ( ( rule__Saturation__NAssignment_4 ) ) ;
    public final void rule__Saturation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2469:1: ( ( ( rule__Saturation__NAssignment_4 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2470:1: ( ( rule__Saturation__NAssignment_4 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2470:1: ( ( rule__Saturation__NAssignment_4 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2471:1: ( rule__Saturation__NAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSaturationAccess().getNAssignment_4()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2472:1: ( rule__Saturation__NAssignment_4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2472:2: rule__Saturation__NAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__NAssignment_4_in_rule__Saturation__Group__4__Impl5061);
            rule__Saturation__NAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSaturationAccess().getNAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saturation__Group__4__Impl"


    // $ANTLR start "rule__Saturation__Group__5"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2482:1: rule__Saturation__Group__5 : rule__Saturation__Group__5__Impl ;
    public final void rule__Saturation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2486:1: ( rule__Saturation__Group__5__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2487:2: rule__Saturation__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__5__Impl_in_rule__Saturation__Group__55091);
            rule__Saturation__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saturation__Group__5"


    // $ANTLR start "rule__Saturation__Group__5__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2493:1: rule__Saturation__Group__5__Impl : ( ')' ) ;
    public final void rule__Saturation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2497:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2498:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2498:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2499:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSaturationAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Saturation__Group__5__Impl5119); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSaturationAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saturation__Group__5__Impl"


    // $ANTLR start "rule__IfThenElse__Group__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2524:1: rule__IfThenElse__Group__0 : rule__IfThenElse__Group__0__Impl rule__IfThenElse__Group__1 ;
    public final void rule__IfThenElse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2528:1: ( rule__IfThenElse__Group__0__Impl rule__IfThenElse__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2529:2: rule__IfThenElse__Group__0__Impl rule__IfThenElse__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__0__Impl_in_rule__IfThenElse__Group__05162);
            rule__IfThenElse__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__1_in_rule__IfThenElse__Group__05165);
            rule__IfThenElse__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__0"


    // $ANTLR start "rule__IfThenElse__Group__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2536:1: rule__IfThenElse__Group__0__Impl : ( 'IfThenElse' ) ;
    public final void rule__IfThenElse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2540:1: ( ( 'IfThenElse' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2541:1: ( 'IfThenElse' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2541:1: ( 'IfThenElse' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2542:1: 'IfThenElse'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getIfThenElseKeyword_0()); 
            }
            match(input,22,FollowSets000.FOLLOW_22_in_rule__IfThenElse__Group__0__Impl5193); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getIfThenElseKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__0__Impl"


    // $ANTLR start "rule__IfThenElse__Group__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2555:1: rule__IfThenElse__Group__1 : rule__IfThenElse__Group__1__Impl rule__IfThenElse__Group__2 ;
    public final void rule__IfThenElse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2559:1: ( rule__IfThenElse__Group__1__Impl rule__IfThenElse__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2560:2: rule__IfThenElse__Group__1__Impl rule__IfThenElse__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__1__Impl_in_rule__IfThenElse__Group__15224);
            rule__IfThenElse__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__2_in_rule__IfThenElse__Group__15227);
            rule__IfThenElse__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__1"


    // $ANTLR start "rule__IfThenElse__Group__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2567:1: rule__IfThenElse__Group__1__Impl : ( '(' ) ;
    public final void rule__IfThenElse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2571:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2572:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2572:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2573:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__IfThenElse__Group__1__Impl5255); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__1__Impl"


    // $ANTLR start "rule__IfThenElse__Group__2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2586:1: rule__IfThenElse__Group__2 : rule__IfThenElse__Group__2__Impl rule__IfThenElse__Group__3 ;
    public final void rule__IfThenElse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2590:1: ( rule__IfThenElse__Group__2__Impl rule__IfThenElse__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2591:2: rule__IfThenElse__Group__2__Impl rule__IfThenElse__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__2__Impl_in_rule__IfThenElse__Group__25286);
            rule__IfThenElse__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__3_in_rule__IfThenElse__Group__25289);
            rule__IfThenElse__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__2"


    // $ANTLR start "rule__IfThenElse__Group__2__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2598:1: rule__IfThenElse__Group__2__Impl : ( ( rule__IfThenElse__S1Assignment_2 ) ) ;
    public final void rule__IfThenElse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2602:1: ( ( ( rule__IfThenElse__S1Assignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2603:1: ( ( rule__IfThenElse__S1Assignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2603:1: ( ( rule__IfThenElse__S1Assignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2604:1: ( rule__IfThenElse__S1Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getS1Assignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2605:1: ( rule__IfThenElse__S1Assignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2605:2: rule__IfThenElse__S1Assignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__S1Assignment_2_in_rule__IfThenElse__Group__2__Impl5316);
            rule__IfThenElse__S1Assignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getS1Assignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__2__Impl"


    // $ANTLR start "rule__IfThenElse__Group__3"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2615:1: rule__IfThenElse__Group__3 : rule__IfThenElse__Group__3__Impl rule__IfThenElse__Group__4 ;
    public final void rule__IfThenElse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2619:1: ( rule__IfThenElse__Group__3__Impl rule__IfThenElse__Group__4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2620:2: rule__IfThenElse__Group__3__Impl rule__IfThenElse__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__3__Impl_in_rule__IfThenElse__Group__35346);
            rule__IfThenElse__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__4_in_rule__IfThenElse__Group__35349);
            rule__IfThenElse__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__3"


    // $ANTLR start "rule__IfThenElse__Group__3__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2627:1: rule__IfThenElse__Group__3__Impl : ( ',' ) ;
    public final void rule__IfThenElse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2631:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2632:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2632:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2633:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getCommaKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__IfThenElse__Group__3__Impl5377); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getCommaKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__3__Impl"


    // $ANTLR start "rule__IfThenElse__Group__4"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2646:1: rule__IfThenElse__Group__4 : rule__IfThenElse__Group__4__Impl rule__IfThenElse__Group__5 ;
    public final void rule__IfThenElse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2650:1: ( rule__IfThenElse__Group__4__Impl rule__IfThenElse__Group__5 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2651:2: rule__IfThenElse__Group__4__Impl rule__IfThenElse__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__4__Impl_in_rule__IfThenElse__Group__45408);
            rule__IfThenElse__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__5_in_rule__IfThenElse__Group__45411);
            rule__IfThenElse__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__4"


    // $ANTLR start "rule__IfThenElse__Group__4__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2658:1: rule__IfThenElse__Group__4__Impl : ( ( rule__IfThenElse__S2Assignment_4 ) ) ;
    public final void rule__IfThenElse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2662:1: ( ( ( rule__IfThenElse__S2Assignment_4 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2663:1: ( ( rule__IfThenElse__S2Assignment_4 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2663:1: ( ( rule__IfThenElse__S2Assignment_4 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2664:1: ( rule__IfThenElse__S2Assignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getS2Assignment_4()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2665:1: ( rule__IfThenElse__S2Assignment_4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2665:2: rule__IfThenElse__S2Assignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__S2Assignment_4_in_rule__IfThenElse__Group__4__Impl5438);
            rule__IfThenElse__S2Assignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getS2Assignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__4__Impl"


    // $ANTLR start "rule__IfThenElse__Group__5"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2675:1: rule__IfThenElse__Group__5 : rule__IfThenElse__Group__5__Impl rule__IfThenElse__Group__6 ;
    public final void rule__IfThenElse__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2679:1: ( rule__IfThenElse__Group__5__Impl rule__IfThenElse__Group__6 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2680:2: rule__IfThenElse__Group__5__Impl rule__IfThenElse__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__5__Impl_in_rule__IfThenElse__Group__55468);
            rule__IfThenElse__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__6_in_rule__IfThenElse__Group__55471);
            rule__IfThenElse__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__5"


    // $ANTLR start "rule__IfThenElse__Group__5__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2687:1: rule__IfThenElse__Group__5__Impl : ( ',' ) ;
    public final void rule__IfThenElse__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2691:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2692:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2692:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2693:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getCommaKeyword_5()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__IfThenElse__Group__5__Impl5499); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getCommaKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__5__Impl"


    // $ANTLR start "rule__IfThenElse__Group__6"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2706:1: rule__IfThenElse__Group__6 : rule__IfThenElse__Group__6__Impl rule__IfThenElse__Group__7 ;
    public final void rule__IfThenElse__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2710:1: ( rule__IfThenElse__Group__6__Impl rule__IfThenElse__Group__7 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2711:2: rule__IfThenElse__Group__6__Impl rule__IfThenElse__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__6__Impl_in_rule__IfThenElse__Group__65530);
            rule__IfThenElse__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__7_in_rule__IfThenElse__Group__65533);
            rule__IfThenElse__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__6"


    // $ANTLR start "rule__IfThenElse__Group__6__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2718:1: rule__IfThenElse__Group__6__Impl : ( ( rule__IfThenElse__S3Assignment_6 ) ) ;
    public final void rule__IfThenElse__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2722:1: ( ( ( rule__IfThenElse__S3Assignment_6 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2723:1: ( ( rule__IfThenElse__S3Assignment_6 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2723:1: ( ( rule__IfThenElse__S3Assignment_6 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2724:1: ( rule__IfThenElse__S3Assignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getS3Assignment_6()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2725:1: ( rule__IfThenElse__S3Assignment_6 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2725:2: rule__IfThenElse__S3Assignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__S3Assignment_6_in_rule__IfThenElse__Group__6__Impl5560);
            rule__IfThenElse__S3Assignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getS3Assignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__6__Impl"


    // $ANTLR start "rule__IfThenElse__Group__7"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2735:1: rule__IfThenElse__Group__7 : rule__IfThenElse__Group__7__Impl ;
    public final void rule__IfThenElse__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2739:1: ( rule__IfThenElse__Group__7__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2740:2: rule__IfThenElse__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__7__Impl_in_rule__IfThenElse__Group__75590);
            rule__IfThenElse__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__7"


    // $ANTLR start "rule__IfThenElse__Group__7__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2746:1: rule__IfThenElse__Group__7__Impl : ( ')' ) ;
    public final void rule__IfThenElse__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2750:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2751:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2751:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2752:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getRightParenthesisKeyword_7()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__IfThenElse__Group__7__Impl5618); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getRightParenthesisKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__7__Impl"


    // $ANTLR start "rule__SimpleStrategy__Group__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2781:1: rule__SimpleStrategy__Group__0 : rule__SimpleStrategy__Group__0__Impl rule__SimpleStrategy__Group__1 ;
    public final void rule__SimpleStrategy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2785:1: ( rule__SimpleStrategy__Group__0__Impl rule__SimpleStrategy__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2786:2: rule__SimpleStrategy__Group__0__Impl rule__SimpleStrategy__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group__0__Impl_in_rule__SimpleStrategy__Group__05665);
            rule__SimpleStrategy__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group__1_in_rule__SimpleStrategy__Group__05668);
            rule__SimpleStrategy__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStrategy__Group__0"


    // $ANTLR start "rule__SimpleStrategy__Group__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2793:1: rule__SimpleStrategy__Group__0__Impl : ( '{' ) ;
    public final void rule__SimpleStrategy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2797:1: ( ( '{' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2798:1: ( '{' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2798:1: ( '{' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2799:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleStrategyAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__SimpleStrategy__Group__0__Impl5696); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleStrategyAccess().getLeftCurlyBracketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStrategy__Group__0__Impl"


    // $ANTLR start "rule__SimpleStrategy__Group__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2812:1: rule__SimpleStrategy__Group__1 : rule__SimpleStrategy__Group__1__Impl rule__SimpleStrategy__Group__2 ;
    public final void rule__SimpleStrategy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2816:1: ( rule__SimpleStrategy__Group__1__Impl rule__SimpleStrategy__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2817:2: rule__SimpleStrategy__Group__1__Impl rule__SimpleStrategy__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group__1__Impl_in_rule__SimpleStrategy__Group__15727);
            rule__SimpleStrategy__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group__2_in_rule__SimpleStrategy__Group__15730);
            rule__SimpleStrategy__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStrategy__Group__1"


    // $ANTLR start "rule__SimpleStrategy__Group__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2824:1: rule__SimpleStrategy__Group__1__Impl : ( ( rule__SimpleStrategy__EquationsAssignment_1 ) ) ;
    public final void rule__SimpleStrategy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2828:1: ( ( ( rule__SimpleStrategy__EquationsAssignment_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2829:1: ( ( rule__SimpleStrategy__EquationsAssignment_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2829:1: ( ( rule__SimpleStrategy__EquationsAssignment_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2830:1: ( rule__SimpleStrategy__EquationsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleStrategyAccess().getEquationsAssignment_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2831:1: ( rule__SimpleStrategy__EquationsAssignment_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2831:2: rule__SimpleStrategy__EquationsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__EquationsAssignment_1_in_rule__SimpleStrategy__Group__1__Impl5757);
            rule__SimpleStrategy__EquationsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleStrategyAccess().getEquationsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStrategy__Group__1__Impl"


    // $ANTLR start "rule__SimpleStrategy__Group__2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2841:1: rule__SimpleStrategy__Group__2 : rule__SimpleStrategy__Group__2__Impl rule__SimpleStrategy__Group__3 ;
    public final void rule__SimpleStrategy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2845:1: ( rule__SimpleStrategy__Group__2__Impl rule__SimpleStrategy__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2846:2: rule__SimpleStrategy__Group__2__Impl rule__SimpleStrategy__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group__2__Impl_in_rule__SimpleStrategy__Group__25787);
            rule__SimpleStrategy__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group__3_in_rule__SimpleStrategy__Group__25790);
            rule__SimpleStrategy__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStrategy__Group__2"


    // $ANTLR start "rule__SimpleStrategy__Group__2__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2853:1: rule__SimpleStrategy__Group__2__Impl : ( ( rule__SimpleStrategy__Group_2__0 )* ) ;
    public final void rule__SimpleStrategy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2857:1: ( ( ( rule__SimpleStrategy__Group_2__0 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2858:1: ( ( rule__SimpleStrategy__Group_2__0 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2858:1: ( ( rule__SimpleStrategy__Group_2__0 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2859:1: ( rule__SimpleStrategy__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleStrategyAccess().getGroup_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2860:1: ( rule__SimpleStrategy__Group_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2860:2: rule__SimpleStrategy__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group_2__0_in_rule__SimpleStrategy__Group__2__Impl5817);
            	    rule__SimpleStrategy__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleStrategyAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStrategy__Group__2__Impl"


    // $ANTLR start "rule__SimpleStrategy__Group__3"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2870:1: rule__SimpleStrategy__Group__3 : rule__SimpleStrategy__Group__3__Impl ;
    public final void rule__SimpleStrategy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2874:1: ( rule__SimpleStrategy__Group__3__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2875:2: rule__SimpleStrategy__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group__3__Impl_in_rule__SimpleStrategy__Group__35848);
            rule__SimpleStrategy__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStrategy__Group__3"


    // $ANTLR start "rule__SimpleStrategy__Group__3__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2881:1: rule__SimpleStrategy__Group__3__Impl : ( '}' ) ;
    public final void rule__SimpleStrategy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2885:1: ( ( '}' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2886:1: ( '}' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2886:1: ( '}' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2887:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleStrategyAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,24,FollowSets000.FOLLOW_24_in_rule__SimpleStrategy__Group__3__Impl5876); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleStrategyAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStrategy__Group__3__Impl"


    // $ANTLR start "rule__SimpleStrategy__Group_2__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2908:1: rule__SimpleStrategy__Group_2__0 : rule__SimpleStrategy__Group_2__0__Impl rule__SimpleStrategy__Group_2__1 ;
    public final void rule__SimpleStrategy__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2912:1: ( rule__SimpleStrategy__Group_2__0__Impl rule__SimpleStrategy__Group_2__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2913:2: rule__SimpleStrategy__Group_2__0__Impl rule__SimpleStrategy__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group_2__0__Impl_in_rule__SimpleStrategy__Group_2__05915);
            rule__SimpleStrategy__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group_2__1_in_rule__SimpleStrategy__Group_2__05918);
            rule__SimpleStrategy__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStrategy__Group_2__0"


    // $ANTLR start "rule__SimpleStrategy__Group_2__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2920:1: rule__SimpleStrategy__Group_2__0__Impl : ( ',' ) ;
    public final void rule__SimpleStrategy__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2924:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2925:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2925:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2926:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleStrategyAccess().getCommaKeyword_2_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__SimpleStrategy__Group_2__0__Impl5946); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleStrategyAccess().getCommaKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStrategy__Group_2__0__Impl"


    // $ANTLR start "rule__SimpleStrategy__Group_2__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2939:1: rule__SimpleStrategy__Group_2__1 : rule__SimpleStrategy__Group_2__1__Impl ;
    public final void rule__SimpleStrategy__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2943:1: ( rule__SimpleStrategy__Group_2__1__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2944:2: rule__SimpleStrategy__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group_2__1__Impl_in_rule__SimpleStrategy__Group_2__15977);
            rule__SimpleStrategy__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStrategy__Group_2__1"


    // $ANTLR start "rule__SimpleStrategy__Group_2__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2950:1: rule__SimpleStrategy__Group_2__1__Impl : ( ( rule__SimpleStrategy__EquationsAssignment_2_1 ) ) ;
    public final void rule__SimpleStrategy__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2954:1: ( ( ( rule__SimpleStrategy__EquationsAssignment_2_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2955:1: ( ( rule__SimpleStrategy__EquationsAssignment_2_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2955:1: ( ( rule__SimpleStrategy__EquationsAssignment_2_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2956:1: ( rule__SimpleStrategy__EquationsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleStrategyAccess().getEquationsAssignment_2_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2957:1: ( rule__SimpleStrategy__EquationsAssignment_2_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2957:2: rule__SimpleStrategy__EquationsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__EquationsAssignment_2_1_in_rule__SimpleStrategy__Group_2__1__Impl6004);
            rule__SimpleStrategy__EquationsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleStrategyAccess().getEquationsAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStrategy__Group_2__1__Impl"


    // $ANTLR start "rule__Not__Group__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2971:1: rule__Not__Group__0 : rule__Not__Group__0__Impl rule__Not__Group__1 ;
    public final void rule__Not__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2975:1: ( rule__Not__Group__0__Impl rule__Not__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2976:2: rule__Not__Group__0__Impl rule__Not__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Not__Group__0__Impl_in_rule__Not__Group__06038);
            rule__Not__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Not__Group__1_in_rule__Not__Group__06041);
            rule__Not__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__0"


    // $ANTLR start "rule__Not__Group__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2983:1: rule__Not__Group__0__Impl : ( 'Not' ) ;
    public final void rule__Not__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2987:1: ( ( 'Not' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2988:1: ( 'Not' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2988:1: ( 'Not' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2989:1: 'Not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getNotKeyword_0()); 
            }
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Not__Group__0__Impl6069); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotAccess().getNotKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__0__Impl"


    // $ANTLR start "rule__Not__Group__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3002:1: rule__Not__Group__1 : rule__Not__Group__1__Impl rule__Not__Group__2 ;
    public final void rule__Not__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3006:1: ( rule__Not__Group__1__Impl rule__Not__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3007:2: rule__Not__Group__1__Impl rule__Not__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Not__Group__1__Impl_in_rule__Not__Group__16100);
            rule__Not__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Not__Group__2_in_rule__Not__Group__16103);
            rule__Not__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__1"


    // $ANTLR start "rule__Not__Group__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3014:1: rule__Not__Group__1__Impl : ( '(' ) ;
    public final void rule__Not__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3018:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3019:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3019:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3020:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Not__Group__1__Impl6131); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__1__Impl"


    // $ANTLR start "rule__Not__Group__2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3033:1: rule__Not__Group__2 : rule__Not__Group__2__Impl rule__Not__Group__3 ;
    public final void rule__Not__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3037:1: ( rule__Not__Group__2__Impl rule__Not__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3038:2: rule__Not__Group__2__Impl rule__Not__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Not__Group__2__Impl_in_rule__Not__Group__26162);
            rule__Not__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Not__Group__3_in_rule__Not__Group__26165);
            rule__Not__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__2"


    // $ANTLR start "rule__Not__Group__2__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3045:1: rule__Not__Group__2__Impl : ( ( rule__Not__SAssignment_2 ) ) ;
    public final void rule__Not__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3049:1: ( ( ( rule__Not__SAssignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3050:1: ( ( rule__Not__SAssignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3050:1: ( ( rule__Not__SAssignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3051:1: ( rule__Not__SAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getSAssignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3052:1: ( rule__Not__SAssignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3052:2: rule__Not__SAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Not__SAssignment_2_in_rule__Not__Group__2__Impl6192);
            rule__Not__SAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotAccess().getSAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__2__Impl"


    // $ANTLR start "rule__Not__Group__3"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3062:1: rule__Not__Group__3 : rule__Not__Group__3__Impl ;
    public final void rule__Not__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3066:1: ( rule__Not__Group__3__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3067:2: rule__Not__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Not__Group__3__Impl_in_rule__Not__Group__36222);
            rule__Not__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__3"


    // $ANTLR start "rule__Not__Group__3__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3073:1: rule__Not__Group__3__Impl : ( ')' ) ;
    public final void rule__Not__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3077:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3078:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3078:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3079:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Not__Group__3__Impl6250); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__3__Impl"


    // $ANTLR start "rule__Fixpoint__Group__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3100:1: rule__Fixpoint__Group__0 : rule__Fixpoint__Group__0__Impl rule__Fixpoint__Group__1 ;
    public final void rule__Fixpoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3104:1: ( rule__Fixpoint__Group__0__Impl rule__Fixpoint__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3105:2: rule__Fixpoint__Group__0__Impl rule__Fixpoint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fixpoint__Group__0__Impl_in_rule__Fixpoint__Group__06289);
            rule__Fixpoint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Fixpoint__Group__1_in_rule__Fixpoint__Group__06292);
            rule__Fixpoint__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fixpoint__Group__0"


    // $ANTLR start "rule__Fixpoint__Group__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3112:1: rule__Fixpoint__Group__0__Impl : ( 'Fixpoint' ) ;
    public final void rule__Fixpoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3116:1: ( ( 'Fixpoint' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3117:1: ( 'Fixpoint' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3117:1: ( 'Fixpoint' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3118:1: 'Fixpoint'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixpointAccess().getFixpointKeyword_0()); 
            }
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Fixpoint__Group__0__Impl6320); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFixpointAccess().getFixpointKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fixpoint__Group__0__Impl"


    // $ANTLR start "rule__Fixpoint__Group__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3131:1: rule__Fixpoint__Group__1 : rule__Fixpoint__Group__1__Impl rule__Fixpoint__Group__2 ;
    public final void rule__Fixpoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3135:1: ( rule__Fixpoint__Group__1__Impl rule__Fixpoint__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3136:2: rule__Fixpoint__Group__1__Impl rule__Fixpoint__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fixpoint__Group__1__Impl_in_rule__Fixpoint__Group__16351);
            rule__Fixpoint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Fixpoint__Group__2_in_rule__Fixpoint__Group__16354);
            rule__Fixpoint__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fixpoint__Group__1"


    // $ANTLR start "rule__Fixpoint__Group__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3143:1: rule__Fixpoint__Group__1__Impl : ( '(' ) ;
    public final void rule__Fixpoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3147:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3148:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3148:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3149:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixpointAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Fixpoint__Group__1__Impl6382); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFixpointAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fixpoint__Group__1__Impl"


    // $ANTLR start "rule__Fixpoint__Group__2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3162:1: rule__Fixpoint__Group__2 : rule__Fixpoint__Group__2__Impl rule__Fixpoint__Group__3 ;
    public final void rule__Fixpoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3166:1: ( rule__Fixpoint__Group__2__Impl rule__Fixpoint__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3167:2: rule__Fixpoint__Group__2__Impl rule__Fixpoint__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fixpoint__Group__2__Impl_in_rule__Fixpoint__Group__26413);
            rule__Fixpoint__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Fixpoint__Group__3_in_rule__Fixpoint__Group__26416);
            rule__Fixpoint__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fixpoint__Group__2"


    // $ANTLR start "rule__Fixpoint__Group__2__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3174:1: rule__Fixpoint__Group__2__Impl : ( ( rule__Fixpoint__SAssignment_2 ) ) ;
    public final void rule__Fixpoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3178:1: ( ( ( rule__Fixpoint__SAssignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3179:1: ( ( rule__Fixpoint__SAssignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3179:1: ( ( rule__Fixpoint__SAssignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3180:1: ( rule__Fixpoint__SAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixpointAccess().getSAssignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3181:1: ( rule__Fixpoint__SAssignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3181:2: rule__Fixpoint__SAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fixpoint__SAssignment_2_in_rule__Fixpoint__Group__2__Impl6443);
            rule__Fixpoint__SAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFixpointAccess().getSAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fixpoint__Group__2__Impl"


    // $ANTLR start "rule__Fixpoint__Group__3"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3191:1: rule__Fixpoint__Group__3 : rule__Fixpoint__Group__3__Impl ;
    public final void rule__Fixpoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3195:1: ( rule__Fixpoint__Group__3__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3196:2: rule__Fixpoint__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fixpoint__Group__3__Impl_in_rule__Fixpoint__Group__36473);
            rule__Fixpoint__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fixpoint__Group__3"


    // $ANTLR start "rule__Fixpoint__Group__3__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3202:1: rule__Fixpoint__Group__3__Impl : ( ')' ) ;
    public final void rule__Fixpoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3206:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3207:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3207:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3208:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixpointAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Fixpoint__Group__3__Impl6501); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFixpointAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fixpoint__Group__3__Impl"


    // $ANTLR start "rule__All__Group__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3229:1: rule__All__Group__0 : rule__All__Group__0__Impl rule__All__Group__1 ;
    public final void rule__All__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3233:1: ( rule__All__Group__0__Impl rule__All__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3234:2: rule__All__Group__0__Impl rule__All__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__All__Group__0__Impl_in_rule__All__Group__06540);
            rule__All__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__All__Group__1_in_rule__All__Group__06543);
            rule__All__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__All__Group__0"


    // $ANTLR start "rule__All__Group__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3241:1: rule__All__Group__0__Impl : ( 'All' ) ;
    public final void rule__All__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3245:1: ( ( 'All' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3246:1: ( 'All' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3246:1: ( 'All' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3247:1: 'All'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAllAccess().getAllKeyword_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_27_in_rule__All__Group__0__Impl6571); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAllAccess().getAllKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__All__Group__0__Impl"


    // $ANTLR start "rule__All__Group__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3260:1: rule__All__Group__1 : rule__All__Group__1__Impl rule__All__Group__2 ;
    public final void rule__All__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3264:1: ( rule__All__Group__1__Impl rule__All__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3265:2: rule__All__Group__1__Impl rule__All__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__All__Group__1__Impl_in_rule__All__Group__16602);
            rule__All__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__All__Group__2_in_rule__All__Group__16605);
            rule__All__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__All__Group__1"


    // $ANTLR start "rule__All__Group__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3272:1: rule__All__Group__1__Impl : ( '(' ) ;
    public final void rule__All__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3276:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3277:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3277:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3278:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAllAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__All__Group__1__Impl6633); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAllAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__All__Group__1__Impl"


    // $ANTLR start "rule__All__Group__2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3291:1: rule__All__Group__2 : rule__All__Group__2__Impl rule__All__Group__3 ;
    public final void rule__All__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3295:1: ( rule__All__Group__2__Impl rule__All__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3296:2: rule__All__Group__2__Impl rule__All__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__All__Group__2__Impl_in_rule__All__Group__26664);
            rule__All__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__All__Group__3_in_rule__All__Group__26667);
            rule__All__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__All__Group__2"


    // $ANTLR start "rule__All__Group__2__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3303:1: rule__All__Group__2__Impl : ( ( rule__All__SAssignment_2 ) ) ;
    public final void rule__All__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3307:1: ( ( ( rule__All__SAssignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3308:1: ( ( rule__All__SAssignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3308:1: ( ( rule__All__SAssignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3309:1: ( rule__All__SAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAllAccess().getSAssignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3310:1: ( rule__All__SAssignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3310:2: rule__All__SAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__All__SAssignment_2_in_rule__All__Group__2__Impl6694);
            rule__All__SAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAllAccess().getSAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__All__Group__2__Impl"


    // $ANTLR start "rule__All__Group__3"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3320:1: rule__All__Group__3 : rule__All__Group__3__Impl ;
    public final void rule__All__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3324:1: ( rule__All__Group__3__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3325:2: rule__All__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__All__Group__3__Impl_in_rule__All__Group__36724);
            rule__All__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__All__Group__3"


    // $ANTLR start "rule__All__Group__3__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3331:1: rule__All__Group__3__Impl : ( ')' ) ;
    public final void rule__All__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3335:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3336:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3336:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3337:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAllAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__All__Group__3__Impl6752); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAllAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__All__Group__3__Impl"


    // $ANTLR start "rule__Choice__Group__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3358:1: rule__Choice__Group__0 : rule__Choice__Group__0__Impl rule__Choice__Group__1 ;
    public final void rule__Choice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3362:1: ( rule__Choice__Group__0__Impl rule__Choice__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3363:2: rule__Choice__Group__0__Impl rule__Choice__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__0__Impl_in_rule__Choice__Group__06791);
            rule__Choice__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__1_in_rule__Choice__Group__06794);
            rule__Choice__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__0"


    // $ANTLR start "rule__Choice__Group__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3370:1: rule__Choice__Group__0__Impl : ( 'Choice' ) ;
    public final void rule__Choice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3374:1: ( ( 'Choice' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3375:1: ( 'Choice' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3375:1: ( 'Choice' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3376:1: 'Choice'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getChoiceKeyword_0()); 
            }
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Choice__Group__0__Impl6822); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChoiceAccess().getChoiceKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__0__Impl"


    // $ANTLR start "rule__Choice__Group__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3389:1: rule__Choice__Group__1 : rule__Choice__Group__1__Impl rule__Choice__Group__2 ;
    public final void rule__Choice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3393:1: ( rule__Choice__Group__1__Impl rule__Choice__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3394:2: rule__Choice__Group__1__Impl rule__Choice__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__1__Impl_in_rule__Choice__Group__16853);
            rule__Choice__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__2_in_rule__Choice__Group__16856);
            rule__Choice__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__1"


    // $ANTLR start "rule__Choice__Group__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3401:1: rule__Choice__Group__1__Impl : ( '(' ) ;
    public final void rule__Choice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3405:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3406:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3406:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3407:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Choice__Group__1__Impl6884); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChoiceAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__1__Impl"


    // $ANTLR start "rule__Choice__Group__2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3420:1: rule__Choice__Group__2 : rule__Choice__Group__2__Impl rule__Choice__Group__3 ;
    public final void rule__Choice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3424:1: ( rule__Choice__Group__2__Impl rule__Choice__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3425:2: rule__Choice__Group__2__Impl rule__Choice__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__2__Impl_in_rule__Choice__Group__26915);
            rule__Choice__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__3_in_rule__Choice__Group__26918);
            rule__Choice__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__2"


    // $ANTLR start "rule__Choice__Group__2__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3432:1: rule__Choice__Group__2__Impl : ( ( rule__Choice__S1Assignment_2 ) ) ;
    public final void rule__Choice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3436:1: ( ( ( rule__Choice__S1Assignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3437:1: ( ( rule__Choice__S1Assignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3437:1: ( ( rule__Choice__S1Assignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3438:1: ( rule__Choice__S1Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getS1Assignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3439:1: ( rule__Choice__S1Assignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3439:2: rule__Choice__S1Assignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Choice__S1Assignment_2_in_rule__Choice__Group__2__Impl6945);
            rule__Choice__S1Assignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChoiceAccess().getS1Assignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__2__Impl"


    // $ANTLR start "rule__Choice__Group__3"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3449:1: rule__Choice__Group__3 : rule__Choice__Group__3__Impl rule__Choice__Group__4 ;
    public final void rule__Choice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3453:1: ( rule__Choice__Group__3__Impl rule__Choice__Group__4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3454:2: rule__Choice__Group__3__Impl rule__Choice__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__3__Impl_in_rule__Choice__Group__36975);
            rule__Choice__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__4_in_rule__Choice__Group__36978);
            rule__Choice__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__3"


    // $ANTLR start "rule__Choice__Group__3__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3461:1: rule__Choice__Group__3__Impl : ( ',' ) ;
    public final void rule__Choice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3465:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3466:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3466:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3467:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getCommaKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Choice__Group__3__Impl7006); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChoiceAccess().getCommaKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__3__Impl"


    // $ANTLR start "rule__Choice__Group__4"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3480:1: rule__Choice__Group__4 : rule__Choice__Group__4__Impl rule__Choice__Group__5 ;
    public final void rule__Choice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3484:1: ( rule__Choice__Group__4__Impl rule__Choice__Group__5 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3485:2: rule__Choice__Group__4__Impl rule__Choice__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__4__Impl_in_rule__Choice__Group__47037);
            rule__Choice__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__5_in_rule__Choice__Group__47040);
            rule__Choice__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__4"


    // $ANTLR start "rule__Choice__Group__4__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3492:1: rule__Choice__Group__4__Impl : ( ( rule__Choice__S2Assignment_4 ) ) ;
    public final void rule__Choice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3496:1: ( ( ( rule__Choice__S2Assignment_4 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3497:1: ( ( rule__Choice__S2Assignment_4 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3497:1: ( ( rule__Choice__S2Assignment_4 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3498:1: ( rule__Choice__S2Assignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getS2Assignment_4()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3499:1: ( rule__Choice__S2Assignment_4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3499:2: rule__Choice__S2Assignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Choice__S2Assignment_4_in_rule__Choice__Group__4__Impl7067);
            rule__Choice__S2Assignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChoiceAccess().getS2Assignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__4__Impl"


    // $ANTLR start "rule__Choice__Group__5"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3509:1: rule__Choice__Group__5 : rule__Choice__Group__5__Impl ;
    public final void rule__Choice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3513:1: ( rule__Choice__Group__5__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3514:2: rule__Choice__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__5__Impl_in_rule__Choice__Group__57097);
            rule__Choice__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__5"


    // $ANTLR start "rule__Choice__Group__5__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3520:1: rule__Choice__Group__5__Impl : ( ')' ) ;
    public final void rule__Choice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3524:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3525:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3525:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3526:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Choice__Group__5__Impl7125); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChoiceAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__5__Impl"


    // $ANTLR start "rule__Union__Group__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3551:1: rule__Union__Group__0 : rule__Union__Group__0__Impl rule__Union__Group__1 ;
    public final void rule__Union__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3555:1: ( rule__Union__Group__0__Impl rule__Union__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3556:2: rule__Union__Group__0__Impl rule__Union__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__0__Impl_in_rule__Union__Group__07168);
            rule__Union__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__1_in_rule__Union__Group__07171);
            rule__Union__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Union__Group__0"


    // $ANTLR start "rule__Union__Group__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3563:1: rule__Union__Group__0__Impl : ( 'Union' ) ;
    public final void rule__Union__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3567:1: ( ( 'Union' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3568:1: ( 'Union' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3568:1: ( 'Union' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3569:1: 'Union'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionAccess().getUnionKeyword_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Union__Group__0__Impl7199); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnionAccess().getUnionKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Union__Group__0__Impl"


    // $ANTLR start "rule__Union__Group__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3582:1: rule__Union__Group__1 : rule__Union__Group__1__Impl rule__Union__Group__2 ;
    public final void rule__Union__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3586:1: ( rule__Union__Group__1__Impl rule__Union__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3587:2: rule__Union__Group__1__Impl rule__Union__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__1__Impl_in_rule__Union__Group__17230);
            rule__Union__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__2_in_rule__Union__Group__17233);
            rule__Union__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Union__Group__1"


    // $ANTLR start "rule__Union__Group__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3594:1: rule__Union__Group__1__Impl : ( '(' ) ;
    public final void rule__Union__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3598:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3599:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3599:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3600:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Union__Group__1__Impl7261); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnionAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Union__Group__1__Impl"


    // $ANTLR start "rule__Union__Group__2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3613:1: rule__Union__Group__2 : rule__Union__Group__2__Impl rule__Union__Group__3 ;
    public final void rule__Union__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3617:1: ( rule__Union__Group__2__Impl rule__Union__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3618:2: rule__Union__Group__2__Impl rule__Union__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__2__Impl_in_rule__Union__Group__27292);
            rule__Union__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__3_in_rule__Union__Group__27295);
            rule__Union__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Union__Group__2"


    // $ANTLR start "rule__Union__Group__2__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3625:1: rule__Union__Group__2__Impl : ( ( rule__Union__S1Assignment_2 ) ) ;
    public final void rule__Union__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3629:1: ( ( ( rule__Union__S1Assignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3630:1: ( ( rule__Union__S1Assignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3630:1: ( ( rule__Union__S1Assignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3631:1: ( rule__Union__S1Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionAccess().getS1Assignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3632:1: ( rule__Union__S1Assignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3632:2: rule__Union__S1Assignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Union__S1Assignment_2_in_rule__Union__Group__2__Impl7322);
            rule__Union__S1Assignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnionAccess().getS1Assignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Union__Group__2__Impl"


    // $ANTLR start "rule__Union__Group__3"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3642:1: rule__Union__Group__3 : rule__Union__Group__3__Impl rule__Union__Group__4 ;
    public final void rule__Union__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3646:1: ( rule__Union__Group__3__Impl rule__Union__Group__4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3647:2: rule__Union__Group__3__Impl rule__Union__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__3__Impl_in_rule__Union__Group__37352);
            rule__Union__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__4_in_rule__Union__Group__37355);
            rule__Union__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Union__Group__3"


    // $ANTLR start "rule__Union__Group__3__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3654:1: rule__Union__Group__3__Impl : ( ',' ) ;
    public final void rule__Union__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3658:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3659:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3659:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3660:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionAccess().getCommaKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Union__Group__3__Impl7383); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnionAccess().getCommaKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Union__Group__3__Impl"


    // $ANTLR start "rule__Union__Group__4"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3673:1: rule__Union__Group__4 : rule__Union__Group__4__Impl rule__Union__Group__5 ;
    public final void rule__Union__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3677:1: ( rule__Union__Group__4__Impl rule__Union__Group__5 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3678:2: rule__Union__Group__4__Impl rule__Union__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__4__Impl_in_rule__Union__Group__47414);
            rule__Union__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__5_in_rule__Union__Group__47417);
            rule__Union__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Union__Group__4"


    // $ANTLR start "rule__Union__Group__4__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3685:1: rule__Union__Group__4__Impl : ( ( rule__Union__S2Assignment_4 ) ) ;
    public final void rule__Union__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3689:1: ( ( ( rule__Union__S2Assignment_4 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3690:1: ( ( rule__Union__S2Assignment_4 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3690:1: ( ( rule__Union__S2Assignment_4 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3691:1: ( rule__Union__S2Assignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionAccess().getS2Assignment_4()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3692:1: ( rule__Union__S2Assignment_4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3692:2: rule__Union__S2Assignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Union__S2Assignment_4_in_rule__Union__Group__4__Impl7444);
            rule__Union__S2Assignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnionAccess().getS2Assignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Union__Group__4__Impl"


    // $ANTLR start "rule__Union__Group__5"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3702:1: rule__Union__Group__5 : rule__Union__Group__5__Impl ;
    public final void rule__Union__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3706:1: ( rule__Union__Group__5__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3707:2: rule__Union__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__5__Impl_in_rule__Union__Group__57474);
            rule__Union__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Union__Group__5"


    // $ANTLR start "rule__Union__Group__5__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3713:1: rule__Union__Group__5__Impl : ( ')' ) ;
    public final void rule__Union__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3717:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3718:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3718:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3719:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Union__Group__5__Impl7502); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnionAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Union__Group__5__Impl"


    // $ANTLR start "rule__Sequence__Group__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3744:1: rule__Sequence__Group__0 : rule__Sequence__Group__0__Impl rule__Sequence__Group__1 ;
    public final void rule__Sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3748:1: ( rule__Sequence__Group__0__Impl rule__Sequence__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3749:2: rule__Sequence__Group__0__Impl rule__Sequence__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__07545);
            rule__Sequence__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__07548);
            rule__Sequence__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__0"


    // $ANTLR start "rule__Sequence__Group__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3756:1: rule__Sequence__Group__0__Impl : ( 'Sequence' ) ;
    public final void rule__Sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3760:1: ( ( 'Sequence' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3761:1: ( 'Sequence' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3761:1: ( 'Sequence' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3762:1: 'Sequence'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getSequenceKeyword_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Sequence__Group__0__Impl7576); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getSequenceKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__0__Impl"


    // $ANTLR start "rule__Sequence__Group__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3775:1: rule__Sequence__Group__1 : rule__Sequence__Group__1__Impl rule__Sequence__Group__2 ;
    public final void rule__Sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3779:1: ( rule__Sequence__Group__1__Impl rule__Sequence__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3780:2: rule__Sequence__Group__1__Impl rule__Sequence__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__17607);
            rule__Sequence__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__17610);
            rule__Sequence__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__1"


    // $ANTLR start "rule__Sequence__Group__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3787:1: rule__Sequence__Group__1__Impl : ( '(' ) ;
    public final void rule__Sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3791:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3792:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3792:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3793:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Sequence__Group__1__Impl7638); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__1__Impl"


    // $ANTLR start "rule__Sequence__Group__2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3806:1: rule__Sequence__Group__2 : rule__Sequence__Group__2__Impl rule__Sequence__Group__3 ;
    public final void rule__Sequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3810:1: ( rule__Sequence__Group__2__Impl rule__Sequence__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3811:2: rule__Sequence__Group__2__Impl rule__Sequence__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__27669);
            rule__Sequence__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__27672);
            rule__Sequence__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__2"


    // $ANTLR start "rule__Sequence__Group__2__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3818:1: rule__Sequence__Group__2__Impl : ( ( rule__Sequence__S1Assignment_2 ) ) ;
    public final void rule__Sequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3822:1: ( ( ( rule__Sequence__S1Assignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3823:1: ( ( rule__Sequence__S1Assignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3823:1: ( ( rule__Sequence__S1Assignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3824:1: ( rule__Sequence__S1Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getS1Assignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3825:1: ( rule__Sequence__S1Assignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3825:2: rule__Sequence__S1Assignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__S1Assignment_2_in_rule__Sequence__Group__2__Impl7699);
            rule__Sequence__S1Assignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getS1Assignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__2__Impl"


    // $ANTLR start "rule__Sequence__Group__3"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3835:1: rule__Sequence__Group__3 : rule__Sequence__Group__3__Impl rule__Sequence__Group__4 ;
    public final void rule__Sequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3839:1: ( rule__Sequence__Group__3__Impl rule__Sequence__Group__4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3840:2: rule__Sequence__Group__3__Impl rule__Sequence__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__37729);
            rule__Sequence__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__37732);
            rule__Sequence__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__3"


    // $ANTLR start "rule__Sequence__Group__3__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3847:1: rule__Sequence__Group__3__Impl : ( ',' ) ;
    public final void rule__Sequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3851:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3852:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3852:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3853:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getCommaKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Sequence__Group__3__Impl7760); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getCommaKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__3__Impl"


    // $ANTLR start "rule__Sequence__Group__4"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3866:1: rule__Sequence__Group__4 : rule__Sequence__Group__4__Impl rule__Sequence__Group__5 ;
    public final void rule__Sequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3870:1: ( rule__Sequence__Group__4__Impl rule__Sequence__Group__5 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3871:2: rule__Sequence__Group__4__Impl rule__Sequence__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__47791);
            rule__Sequence__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__5_in_rule__Sequence__Group__47794);
            rule__Sequence__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__4"


    // $ANTLR start "rule__Sequence__Group__4__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3878:1: rule__Sequence__Group__4__Impl : ( ( rule__Sequence__S2Assignment_4 ) ) ;
    public final void rule__Sequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3882:1: ( ( ( rule__Sequence__S2Assignment_4 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3883:1: ( ( rule__Sequence__S2Assignment_4 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3883:1: ( ( rule__Sequence__S2Assignment_4 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3884:1: ( rule__Sequence__S2Assignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getS2Assignment_4()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3885:1: ( rule__Sequence__S2Assignment_4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3885:2: rule__Sequence__S2Assignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__S2Assignment_4_in_rule__Sequence__Group__4__Impl7821);
            rule__Sequence__S2Assignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getS2Assignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__4__Impl"


    // $ANTLR start "rule__Sequence__Group__5"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3895:1: rule__Sequence__Group__5 : rule__Sequence__Group__5__Impl ;
    public final void rule__Sequence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3899:1: ( rule__Sequence__Group__5__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3900:2: rule__Sequence__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__5__Impl_in_rule__Sequence__Group__57851);
            rule__Sequence__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__5"


    // $ANTLR start "rule__Sequence__Group__5__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3906:1: rule__Sequence__Group__5__Impl : ( ')' ) ;
    public final void rule__Sequence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3910:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3911:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3911:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3912:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Sequence__Group__5__Impl7879); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__5__Impl"


    // $ANTLR start "rule__Identity__Group__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3937:1: rule__Identity__Group__0 : rule__Identity__Group__0__Impl rule__Identity__Group__1 ;
    public final void rule__Identity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3941:1: ( rule__Identity__Group__0__Impl rule__Identity__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3942:2: rule__Identity__Group__0__Impl rule__Identity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identity__Group__0__Impl_in_rule__Identity__Group__07922);
            rule__Identity__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Identity__Group__1_in_rule__Identity__Group__07925);
            rule__Identity__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identity__Group__0"


    // $ANTLR start "rule__Identity__Group__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3949:1: rule__Identity__Group__0__Impl : ( 'Identity' ) ;
    public final void rule__Identity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3953:1: ( ( 'Identity' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3954:1: ( 'Identity' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3954:1: ( 'Identity' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3955:1: 'Identity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentityAccess().getIdentityKeyword_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Identity__Group__0__Impl7953); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentityAccess().getIdentityKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identity__Group__0__Impl"


    // $ANTLR start "rule__Identity__Group__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3968:1: rule__Identity__Group__1 : rule__Identity__Group__1__Impl ;
    public final void rule__Identity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3972:1: ( rule__Identity__Group__1__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3973:2: rule__Identity__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identity__Group__1__Impl_in_rule__Identity__Group__17984);
            rule__Identity__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identity__Group__1"


    // $ANTLR start "rule__Identity__Group__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3979:1: rule__Identity__Group__1__Impl : ( () ) ;
    public final void rule__Identity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3983:1: ( ( () ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3984:1: ( () )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3984:1: ( () )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3985:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentityAccess().getIdentityAction_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3986:1: ()
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3988:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentityAccess().getIdentityAction_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identity__Group__1__Impl"


    // $ANTLR start "rule__Fail__Group__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4002:1: rule__Fail__Group__0 : rule__Fail__Group__0__Impl rule__Fail__Group__1 ;
    public final void rule__Fail__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4006:1: ( rule__Fail__Group__0__Impl rule__Fail__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4007:2: rule__Fail__Group__0__Impl rule__Fail__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fail__Group__0__Impl_in_rule__Fail__Group__08046);
            rule__Fail__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Fail__Group__1_in_rule__Fail__Group__08049);
            rule__Fail__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fail__Group__0"


    // $ANTLR start "rule__Fail__Group__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4014:1: rule__Fail__Group__0__Impl : ( 'Fail' ) ;
    public final void rule__Fail__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4018:1: ( ( 'Fail' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4019:1: ( 'Fail' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4019:1: ( 'Fail' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4020:1: 'Fail'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFailAccess().getFailKeyword_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Fail__Group__0__Impl8077); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFailAccess().getFailKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fail__Group__0__Impl"


    // $ANTLR start "rule__Fail__Group__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4033:1: rule__Fail__Group__1 : rule__Fail__Group__1__Impl ;
    public final void rule__Fail__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4037:1: ( rule__Fail__Group__1__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4038:2: rule__Fail__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fail__Group__1__Impl_in_rule__Fail__Group__18108);
            rule__Fail__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fail__Group__1"


    // $ANTLR start "rule__Fail__Group__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4044:1: rule__Fail__Group__1__Impl : ( () ) ;
    public final void rule__Fail__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4048:1: ( ( () ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4049:1: ( () )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4049:1: ( () )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4050:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFailAccess().getFailAction_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4051:1: ()
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4053:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFailAccess().getFailAction_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fail__Group__1__Impl"


    // $ANTLR start "rule__ADT__Group__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4067:1: rule__ADT__Group__0 : rule__ADT__Group__0__Impl rule__ADT__Group__1 ;
    public final void rule__ADT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4071:1: ( rule__ADT__Group__0__Impl rule__ADT__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4072:2: rule__ADT__Group__0__Impl rule__ADT__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__0__Impl_in_rule__ADT__Group__08170);
            rule__ADT__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__1_in_rule__ADT__Group__08173);
            rule__ADT__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADT__Group__0"


    // $ANTLR start "rule__ADT__Group__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4079:1: rule__ADT__Group__0__Impl : ( 'ADT' ) ;
    public final void rule__ADT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4083:1: ( ( 'ADT' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4084:1: ( 'ADT' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4084:1: ( 'ADT' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4085:1: 'ADT'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getADTKeyword_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__ADT__Group__0__Impl8201); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getADTAccess().getADTKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADT__Group__0__Impl"


    // $ANTLR start "rule__ADT__Group__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4098:1: rule__ADT__Group__1 : rule__ADT__Group__1__Impl rule__ADT__Group__2 ;
    public final void rule__ADT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4102:1: ( rule__ADT__Group__1__Impl rule__ADT__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4103:2: rule__ADT__Group__1__Impl rule__ADT__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__1__Impl_in_rule__ADT__Group__18232);
            rule__ADT__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__2_in_rule__ADT__Group__18235);
            rule__ADT__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADT__Group__1"


    // $ANTLR start "rule__ADT__Group__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4110:1: rule__ADT__Group__1__Impl : ( ( rule__ADT__NameAssignment_1 ) ) ;
    public final void rule__ADT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4114:1: ( ( ( rule__ADT__NameAssignment_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4115:1: ( ( rule__ADT__NameAssignment_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4115:1: ( ( rule__ADT__NameAssignment_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4116:1: ( rule__ADT__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getNameAssignment_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4117:1: ( rule__ADT__NameAssignment_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4117:2: rule__ADT__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__NameAssignment_1_in_rule__ADT__Group__1__Impl8262);
            rule__ADT__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getADTAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADT__Group__1__Impl"


    // $ANTLR start "rule__ADT__Group__2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4127:1: rule__ADT__Group__2 : rule__ADT__Group__2__Impl rule__ADT__Group__3 ;
    public final void rule__ADT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4131:1: ( rule__ADT__Group__2__Impl rule__ADT__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4132:2: rule__ADT__Group__2__Impl rule__ADT__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__2__Impl_in_rule__ADT__Group__28292);
            rule__ADT__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__3_in_rule__ADT__Group__28295);
            rule__ADT__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADT__Group__2"


    // $ANTLR start "rule__ADT__Group__2__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4139:1: rule__ADT__Group__2__Impl : ( 'Signature' ) ;
    public final void rule__ADT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4143:1: ( ( 'Signature' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4144:1: ( 'Signature' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4144:1: ( 'Signature' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4145:1: 'Signature'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getSignatureKeyword_2()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__ADT__Group__2__Impl8323); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getADTAccess().getSignatureKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADT__Group__2__Impl"


    // $ANTLR start "rule__ADT__Group__3"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4158:1: rule__ADT__Group__3 : rule__ADT__Group__3__Impl rule__ADT__Group__4 ;
    public final void rule__ADT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4162:1: ( rule__ADT__Group__3__Impl rule__ADT__Group__4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4163:2: rule__ADT__Group__3__Impl rule__ADT__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__3__Impl_in_rule__ADT__Group__38354);
            rule__ADT__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__4_in_rule__ADT__Group__38357);
            rule__ADT__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADT__Group__3"


    // $ANTLR start "rule__ADT__Group__3__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4170:1: rule__ADT__Group__3__Impl : ( ( rule__ADT__SignatureAssignment_3 ) ) ;
    public final void rule__ADT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4174:1: ( ( ( rule__ADT__SignatureAssignment_3 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4175:1: ( ( rule__ADT__SignatureAssignment_3 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4175:1: ( ( rule__ADT__SignatureAssignment_3 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4176:1: ( rule__ADT__SignatureAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getSignatureAssignment_3()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4177:1: ( rule__ADT__SignatureAssignment_3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4177:2: rule__ADT__SignatureAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__SignatureAssignment_3_in_rule__ADT__Group__3__Impl8384);
            rule__ADT__SignatureAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getADTAccess().getSignatureAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADT__Group__3__Impl"


    // $ANTLR start "rule__ADT__Group__4"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4187:1: rule__ADT__Group__4 : rule__ADT__Group__4__Impl rule__ADT__Group__5 ;
    public final void rule__ADT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4191:1: ( rule__ADT__Group__4__Impl rule__ADT__Group__5 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4192:2: rule__ADT__Group__4__Impl rule__ADT__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__4__Impl_in_rule__ADT__Group__48414);
            rule__ADT__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__5_in_rule__ADT__Group__48417);
            rule__ADT__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADT__Group__4"


    // $ANTLR start "rule__ADT__Group__4__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4199:1: rule__ADT__Group__4__Impl : ( ( rule__ADT__Group_4__0 )? ) ;
    public final void rule__ADT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4203:1: ( ( ( rule__ADT__Group_4__0 )? ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4204:1: ( ( rule__ADT__Group_4__0 )? )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4204:1: ( ( rule__ADT__Group_4__0 )? )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4205:1: ( rule__ADT__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getGroup_4()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4206:1: ( rule__ADT__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4206:2: rule__ADT__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_4__0_in_rule__ADT__Group__4__Impl8444);
                    rule__ADT__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getADTAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADT__Group__4__Impl"


    // $ANTLR start "rule__ADT__Group__5"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4216:1: rule__ADT__Group__5 : rule__ADT__Group__5__Impl ;
    public final void rule__ADT__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4220:1: ( rule__ADT__Group__5__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4221:2: rule__ADT__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__5__Impl_in_rule__ADT__Group__58475);
            rule__ADT__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADT__Group__5"


    // $ANTLR start "rule__ADT__Group__5__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4227:1: rule__ADT__Group__5__Impl : ( ( rule__ADT__Group_5__0 )? ) ;
    public final void rule__ADT__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4231:1: ( ( ( rule__ADT__Group_5__0 )? ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4232:1: ( ( rule__ADT__Group_5__0 )? )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4232:1: ( ( rule__ADT__Group_5__0 )? )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4233:1: ( rule__ADT__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getGroup_5()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4234:1: ( rule__ADT__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4234:2: rule__ADT__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_5__0_in_rule__ADT__Group__5__Impl8502);
                    rule__ADT__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getADTAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADT__Group__5__Impl"


    // $ANTLR start "rule__ADT__Group_4__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4256:1: rule__ADT__Group_4__0 : rule__ADT__Group_4__0__Impl rule__ADT__Group_4__1 ;
    public final void rule__ADT__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4260:1: ( rule__ADT__Group_4__0__Impl rule__ADT__Group_4__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4261:2: rule__ADT__Group_4__0__Impl rule__ADT__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_4__0__Impl_in_rule__ADT__Group_4__08545);
            rule__ADT__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_4__1_in_rule__ADT__Group_4__08548);
            rule__ADT__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADT__Group_4__0"


    // $ANTLR start "rule__ADT__Group_4__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4268:1: rule__ADT__Group_4__0__Impl : ( ( 'Axioms' ) ) ;
    public final void rule__ADT__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4272:1: ( ( ( 'Axioms' ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4273:1: ( ( 'Axioms' ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4273:1: ( ( 'Axioms' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4274:1: ( 'Axioms' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getAxiomsKeyword_4_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4275:1: ( 'Axioms' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4276:2: 'Axioms'
            {
            match(input,35,FollowSets000.FOLLOW_35_in_rule__ADT__Group_4__0__Impl8577); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getADTAccess().getAxiomsKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADT__Group_4__0__Impl"


    // $ANTLR start "rule__ADT__Group_4__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4287:1: rule__ADT__Group_4__1 : rule__ADT__Group_4__1__Impl rule__ADT__Group_4__2 ;
    public final void rule__ADT__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4291:1: ( rule__ADT__Group_4__1__Impl rule__ADT__Group_4__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4292:2: rule__ADT__Group_4__1__Impl rule__ADT__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_4__1__Impl_in_rule__ADT__Group_4__18609);
            rule__ADT__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_4__2_in_rule__ADT__Group_4__18612);
            rule__ADT__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADT__Group_4__1"


    // $ANTLR start "rule__ADT__Group_4__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4299:1: rule__ADT__Group_4__1__Impl : ( ( rule__ADT__EquationsAssignment_4_1 ) ) ;
    public final void rule__ADT__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4303:1: ( ( ( rule__ADT__EquationsAssignment_4_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4304:1: ( ( rule__ADT__EquationsAssignment_4_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4304:1: ( ( rule__ADT__EquationsAssignment_4_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4305:1: ( rule__ADT__EquationsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getEquationsAssignment_4_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4306:1: ( rule__ADT__EquationsAssignment_4_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4306:2: rule__ADT__EquationsAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__EquationsAssignment_4_1_in_rule__ADT__Group_4__1__Impl8639);
            rule__ADT__EquationsAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getADTAccess().getEquationsAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADT__Group_4__1__Impl"


    // $ANTLR start "rule__ADT__Group_4__2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4316:1: rule__ADT__Group_4__2 : rule__ADT__Group_4__2__Impl ;
    public final void rule__ADT__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4320:1: ( rule__ADT__Group_4__2__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4321:2: rule__ADT__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_4__2__Impl_in_rule__ADT__Group_4__28669);
            rule__ADT__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADT__Group_4__2"


    // $ANTLR start "rule__ADT__Group_4__2__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4327:1: rule__ADT__Group_4__2__Impl : ( ( rule__ADT__EquationsAssignment_4_2 )* ) ;
    public final void rule__ADT__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4331:1: ( ( ( rule__ADT__EquationsAssignment_4_2 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4332:1: ( ( rule__ADT__EquationsAssignment_4_2 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4332:1: ( ( rule__ADT__EquationsAssignment_4_2 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4333:1: ( rule__ADT__EquationsAssignment_4_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getEquationsAssignment_4_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4334:1: ( rule__ADT__EquationsAssignment_4_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==RULE_TERMVAR) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4334:2: rule__ADT__EquationsAssignment_4_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ADT__EquationsAssignment_4_2_in_rule__ADT__Group_4__2__Impl8696);
            	    rule__ADT__EquationsAssignment_4_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getADTAccess().getEquationsAssignment_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADT__Group_4__2__Impl"


    // $ANTLR start "rule__ADT__Group_5__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4350:1: rule__ADT__Group_5__0 : rule__ADT__Group_5__0__Impl rule__ADT__Group_5__1 ;
    public final void rule__ADT__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4354:1: ( rule__ADT__Group_5__0__Impl rule__ADT__Group_5__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4355:2: rule__ADT__Group_5__0__Impl rule__ADT__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_5__0__Impl_in_rule__ADT__Group_5__08733);
            rule__ADT__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_5__1_in_rule__ADT__Group_5__08736);
            rule__ADT__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADT__Group_5__0"


    // $ANTLR start "rule__ADT__Group_5__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4362:1: rule__ADT__Group_5__0__Impl : ( ( 'Variables' ) ) ;
    public final void rule__ADT__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4366:1: ( ( ( 'Variables' ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4367:1: ( ( 'Variables' ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4367:1: ( ( 'Variables' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4368:1: ( 'Variables' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getVariablesKeyword_5_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4369:1: ( 'Variables' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4370:2: 'Variables'
            {
            match(input,36,FollowSets000.FOLLOW_36_in_rule__ADT__Group_5__0__Impl8765); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getADTAccess().getVariablesKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADT__Group_5__0__Impl"


    // $ANTLR start "rule__ADT__Group_5__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4381:1: rule__ADT__Group_5__1 : rule__ADT__Group_5__1__Impl rule__ADT__Group_5__2 ;
    public final void rule__ADT__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4385:1: ( rule__ADT__Group_5__1__Impl rule__ADT__Group_5__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4386:2: rule__ADT__Group_5__1__Impl rule__ADT__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_5__1__Impl_in_rule__ADT__Group_5__18797);
            rule__ADT__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_5__2_in_rule__ADT__Group_5__18800);
            rule__ADT__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADT__Group_5__1"


    // $ANTLR start "rule__ADT__Group_5__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4393:1: rule__ADT__Group_5__1__Impl : ( ( rule__ADT__VariablesAssignment_5_1 ) ) ;
    public final void rule__ADT__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4397:1: ( ( ( rule__ADT__VariablesAssignment_5_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4398:1: ( ( rule__ADT__VariablesAssignment_5_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4398:1: ( ( rule__ADT__VariablesAssignment_5_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4399:1: ( rule__ADT__VariablesAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getVariablesAssignment_5_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4400:1: ( rule__ADT__VariablesAssignment_5_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4400:2: rule__ADT__VariablesAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__VariablesAssignment_5_1_in_rule__ADT__Group_5__1__Impl8827);
            rule__ADT__VariablesAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getADTAccess().getVariablesAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADT__Group_5__1__Impl"


    // $ANTLR start "rule__ADT__Group_5__2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4410:1: rule__ADT__Group_5__2 : rule__ADT__Group_5__2__Impl ;
    public final void rule__ADT__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4414:1: ( rule__ADT__Group_5__2__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4415:2: rule__ADT__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_5__2__Impl_in_rule__ADT__Group_5__28857);
            rule__ADT__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADT__Group_5__2"


    // $ANTLR start "rule__ADT__Group_5__2__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4421:1: rule__ADT__Group_5__2__Impl : ( ( rule__ADT__VariablesAssignment_5_2 )* ) ;
    public final void rule__ADT__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4425:1: ( ( ( rule__ADT__VariablesAssignment_5_2 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4426:1: ( ( rule__ADT__VariablesAssignment_5_2 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4426:1: ( ( rule__ADT__VariablesAssignment_5_2 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4427:1: ( rule__ADT__VariablesAssignment_5_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getVariablesAssignment_5_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4428:1: ( rule__ADT__VariablesAssignment_5_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4428:2: rule__ADT__VariablesAssignment_5_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ADT__VariablesAssignment_5_2_in_rule__ADT__Group_5__2__Impl8884);
            	    rule__ADT__VariablesAssignment_5_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getADTAccess().getVariablesAssignment_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADT__Group_5__2__Impl"


    // $ANTLR start "rule__Signature__Group__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4444:1: rule__Signature__Group__0 : rule__Signature__Group__0__Impl rule__Signature__Group__1 ;
    public final void rule__Signature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4448:1: ( rule__Signature__Group__0__Impl rule__Signature__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4449:2: rule__Signature__Group__0__Impl rule__Signature__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group__0__Impl_in_rule__Signature__Group__08921);
            rule__Signature__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group__1_in_rule__Signature__Group__08924);
            rule__Signature__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__0"


    // $ANTLR start "rule__Signature__Group__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4456:1: rule__Signature__Group__0__Impl : ( 'Sorts' ) ;
    public final void rule__Signature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4460:1: ( ( 'Sorts' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4461:1: ( 'Sorts' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4461:1: ( 'Sorts' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4462:1: 'Sorts'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getSortsKeyword_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Signature__Group__0__Impl8952); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getSortsKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__0__Impl"


    // $ANTLR start "rule__Signature__Group__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4475:1: rule__Signature__Group__1 : rule__Signature__Group__1__Impl rule__Signature__Group__2 ;
    public final void rule__Signature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4479:1: ( rule__Signature__Group__1__Impl rule__Signature__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4480:2: rule__Signature__Group__1__Impl rule__Signature__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group__1__Impl_in_rule__Signature__Group__18983);
            rule__Signature__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group__2_in_rule__Signature__Group__18986);
            rule__Signature__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__1"


    // $ANTLR start "rule__Signature__Group__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4487:1: rule__Signature__Group__1__Impl : ( ( rule__Signature__SortsAssignment_1 ) ) ;
    public final void rule__Signature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4491:1: ( ( ( rule__Signature__SortsAssignment_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4492:1: ( ( rule__Signature__SortsAssignment_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4492:1: ( ( rule__Signature__SortsAssignment_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4493:1: ( rule__Signature__SortsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getSortsAssignment_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4494:1: ( rule__Signature__SortsAssignment_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4494:2: rule__Signature__SortsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__SortsAssignment_1_in_rule__Signature__Group__1__Impl9013);
            rule__Signature__SortsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getSortsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__1__Impl"


    // $ANTLR start "rule__Signature__Group__2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4504:1: rule__Signature__Group__2 : rule__Signature__Group__2__Impl rule__Signature__Group__3 ;
    public final void rule__Signature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4508:1: ( rule__Signature__Group__2__Impl rule__Signature__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4509:2: rule__Signature__Group__2__Impl rule__Signature__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group__2__Impl_in_rule__Signature__Group__29043);
            rule__Signature__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group__3_in_rule__Signature__Group__29046);
            rule__Signature__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__2"


    // $ANTLR start "rule__Signature__Group__2__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4516:1: rule__Signature__Group__2__Impl : ( ( rule__Signature__Group_2__0 )* ) ;
    public final void rule__Signature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4520:1: ( ( ( rule__Signature__Group_2__0 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4521:1: ( ( rule__Signature__Group_2__0 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4521:1: ( ( rule__Signature__Group_2__0 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4522:1: ( rule__Signature__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getGroup_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4523:1: ( rule__Signature__Group_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==19) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4523:2: rule__Signature__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_2__0_in_rule__Signature__Group__2__Impl9073);
            	    rule__Signature__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__2__Impl"


    // $ANTLR start "rule__Signature__Group__3"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4533:1: rule__Signature__Group__3 : rule__Signature__Group__3__Impl rule__Signature__Group__4 ;
    public final void rule__Signature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4537:1: ( rule__Signature__Group__3__Impl rule__Signature__Group__4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4538:2: rule__Signature__Group__3__Impl rule__Signature__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group__3__Impl_in_rule__Signature__Group__39104);
            rule__Signature__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group__4_in_rule__Signature__Group__39107);
            rule__Signature__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__3"


    // $ANTLR start "rule__Signature__Group__3__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4545:1: rule__Signature__Group__3__Impl : ( ( rule__Signature__Group_3__0 ) ) ;
    public final void rule__Signature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4549:1: ( ( ( rule__Signature__Group_3__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4550:1: ( ( rule__Signature__Group_3__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4550:1: ( ( rule__Signature__Group_3__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4551:1: ( rule__Signature__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getGroup_3()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4552:1: ( rule__Signature__Group_3__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4552:2: rule__Signature__Group_3__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_3__0_in_rule__Signature__Group__3__Impl9134);
            rule__Signature__Group_3__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__3__Impl"


    // $ANTLR start "rule__Signature__Group__4"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4562:1: rule__Signature__Group__4 : rule__Signature__Group__4__Impl ;
    public final void rule__Signature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4566:1: ( rule__Signature__Group__4__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4567:2: rule__Signature__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group__4__Impl_in_rule__Signature__Group__49164);
            rule__Signature__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__4"


    // $ANTLR start "rule__Signature__Group__4__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4573:1: rule__Signature__Group__4__Impl : ( ( rule__Signature__Group_4__0 )? ) ;
    public final void rule__Signature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4577:1: ( ( ( rule__Signature__Group_4__0 )? ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4578:1: ( ( rule__Signature__Group_4__0 )? )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4578:1: ( ( rule__Signature__Group_4__0 )? )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4579:1: ( rule__Signature__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getGroup_4()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4580:1: ( rule__Signature__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==39) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4580:2: rule__Signature__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_4__0_in_rule__Signature__Group__4__Impl9191);
                    rule__Signature__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group__4__Impl"


    // $ANTLR start "rule__Signature__Group_2__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4600:1: rule__Signature__Group_2__0 : rule__Signature__Group_2__0__Impl rule__Signature__Group_2__1 ;
    public final void rule__Signature__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4604:1: ( rule__Signature__Group_2__0__Impl rule__Signature__Group_2__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4605:2: rule__Signature__Group_2__0__Impl rule__Signature__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_2__0__Impl_in_rule__Signature__Group_2__09232);
            rule__Signature__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_2__1_in_rule__Signature__Group_2__09235);
            rule__Signature__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_2__0"


    // $ANTLR start "rule__Signature__Group_2__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4612:1: rule__Signature__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Signature__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4616:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4617:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4617:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4618:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getCommaKeyword_2_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Signature__Group_2__0__Impl9263); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getCommaKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_2__0__Impl"


    // $ANTLR start "rule__Signature__Group_2__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4631:1: rule__Signature__Group_2__1 : rule__Signature__Group_2__1__Impl ;
    public final void rule__Signature__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4635:1: ( rule__Signature__Group_2__1__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4636:2: rule__Signature__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_2__1__Impl_in_rule__Signature__Group_2__19294);
            rule__Signature__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_2__1"


    // $ANTLR start "rule__Signature__Group_2__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4642:1: rule__Signature__Group_2__1__Impl : ( ( rule__Signature__SortsAssignment_2_1 ) ) ;
    public final void rule__Signature__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4646:1: ( ( ( rule__Signature__SortsAssignment_2_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4647:1: ( ( rule__Signature__SortsAssignment_2_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4647:1: ( ( rule__Signature__SortsAssignment_2_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4648:1: ( rule__Signature__SortsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getSortsAssignment_2_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4649:1: ( rule__Signature__SortsAssignment_2_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4649:2: rule__Signature__SortsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__SortsAssignment_2_1_in_rule__Signature__Group_2__1__Impl9321);
            rule__Signature__SortsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getSortsAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_2__1__Impl"


    // $ANTLR start "rule__Signature__Group_3__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4663:1: rule__Signature__Group_3__0 : rule__Signature__Group_3__0__Impl rule__Signature__Group_3__1 ;
    public final void rule__Signature__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4667:1: ( rule__Signature__Group_3__0__Impl rule__Signature__Group_3__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4668:2: rule__Signature__Group_3__0__Impl rule__Signature__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_3__0__Impl_in_rule__Signature__Group_3__09355);
            rule__Signature__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_3__1_in_rule__Signature__Group_3__09358);
            rule__Signature__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_3__0"


    // $ANTLR start "rule__Signature__Group_3__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4675:1: rule__Signature__Group_3__0__Impl : ( ( 'Generators' ) ) ;
    public final void rule__Signature__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4679:1: ( ( ( 'Generators' ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4680:1: ( ( 'Generators' ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4680:1: ( ( 'Generators' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4681:1: ( 'Generators' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getGeneratorsKeyword_3_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4682:1: ( 'Generators' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4683:2: 'Generators'
            {
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Signature__Group_3__0__Impl9387); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getGeneratorsKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_3__0__Impl"


    // $ANTLR start "rule__Signature__Group_3__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4694:1: rule__Signature__Group_3__1 : rule__Signature__Group_3__1__Impl rule__Signature__Group_3__2 ;
    public final void rule__Signature__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4698:1: ( rule__Signature__Group_3__1__Impl rule__Signature__Group_3__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4699:2: rule__Signature__Group_3__1__Impl rule__Signature__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_3__1__Impl_in_rule__Signature__Group_3__19419);
            rule__Signature__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_3__2_in_rule__Signature__Group_3__19422);
            rule__Signature__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_3__1"


    // $ANTLR start "rule__Signature__Group_3__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4706:1: rule__Signature__Group_3__1__Impl : ( ( rule__Signature__GeneratorsAssignment_3_1 ) ) ;
    public final void rule__Signature__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4710:1: ( ( ( rule__Signature__GeneratorsAssignment_3_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4711:1: ( ( rule__Signature__GeneratorsAssignment_3_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4711:1: ( ( rule__Signature__GeneratorsAssignment_3_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4712:1: ( rule__Signature__GeneratorsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getGeneratorsAssignment_3_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4713:1: ( rule__Signature__GeneratorsAssignment_3_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4713:2: rule__Signature__GeneratorsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__GeneratorsAssignment_3_1_in_rule__Signature__Group_3__1__Impl9449);
            rule__Signature__GeneratorsAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getGeneratorsAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_3__1__Impl"


    // $ANTLR start "rule__Signature__Group_3__2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4723:1: rule__Signature__Group_3__2 : rule__Signature__Group_3__2__Impl ;
    public final void rule__Signature__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4727:1: ( rule__Signature__Group_3__2__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4728:2: rule__Signature__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_3__2__Impl_in_rule__Signature__Group_3__29479);
            rule__Signature__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_3__2"


    // $ANTLR start "rule__Signature__Group_3__2__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4734:1: rule__Signature__Group_3__2__Impl : ( ( rule__Signature__GeneratorsAssignment_3_2 )* ) ;
    public final void rule__Signature__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4738:1: ( ( ( rule__Signature__GeneratorsAssignment_3_2 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4739:1: ( ( rule__Signature__GeneratorsAssignment_3_2 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4739:1: ( ( rule__Signature__GeneratorsAssignment_3_2 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4740:1: ( rule__Signature__GeneratorsAssignment_3_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getGeneratorsAssignment_3_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4741:1: ( rule__Signature__GeneratorsAssignment_3_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4741:2: rule__Signature__GeneratorsAssignment_3_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Signature__GeneratorsAssignment_3_2_in_rule__Signature__Group_3__2__Impl9506);
            	    rule__Signature__GeneratorsAssignment_3_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getGeneratorsAssignment_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_3__2__Impl"


    // $ANTLR start "rule__Signature__Group_4__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4757:1: rule__Signature__Group_4__0 : rule__Signature__Group_4__0__Impl rule__Signature__Group_4__1 ;
    public final void rule__Signature__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4761:1: ( rule__Signature__Group_4__0__Impl rule__Signature__Group_4__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4762:2: rule__Signature__Group_4__0__Impl rule__Signature__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_4__0__Impl_in_rule__Signature__Group_4__09543);
            rule__Signature__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_4__1_in_rule__Signature__Group_4__09546);
            rule__Signature__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_4__0"


    // $ANTLR start "rule__Signature__Group_4__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4769:1: rule__Signature__Group_4__0__Impl : ( ( 'Operations' ) ) ;
    public final void rule__Signature__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4773:1: ( ( ( 'Operations' ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4774:1: ( ( 'Operations' ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4774:1: ( ( 'Operations' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4775:1: ( 'Operations' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getOperationsKeyword_4_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4776:1: ( 'Operations' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4777:2: 'Operations'
            {
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Signature__Group_4__0__Impl9575); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getOperationsKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_4__0__Impl"


    // $ANTLR start "rule__Signature__Group_4__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4788:1: rule__Signature__Group_4__1 : rule__Signature__Group_4__1__Impl rule__Signature__Group_4__2 ;
    public final void rule__Signature__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4792:1: ( rule__Signature__Group_4__1__Impl rule__Signature__Group_4__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4793:2: rule__Signature__Group_4__1__Impl rule__Signature__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_4__1__Impl_in_rule__Signature__Group_4__19607);
            rule__Signature__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_4__2_in_rule__Signature__Group_4__19610);
            rule__Signature__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_4__1"


    // $ANTLR start "rule__Signature__Group_4__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4800:1: rule__Signature__Group_4__1__Impl : ( ( rule__Signature__OperationsAssignment_4_1 ) ) ;
    public final void rule__Signature__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4804:1: ( ( ( rule__Signature__OperationsAssignment_4_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4805:1: ( ( rule__Signature__OperationsAssignment_4_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4805:1: ( ( rule__Signature__OperationsAssignment_4_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4806:1: ( rule__Signature__OperationsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getOperationsAssignment_4_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4807:1: ( rule__Signature__OperationsAssignment_4_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4807:2: rule__Signature__OperationsAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__OperationsAssignment_4_1_in_rule__Signature__Group_4__1__Impl9637);
            rule__Signature__OperationsAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getOperationsAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_4__1__Impl"


    // $ANTLR start "rule__Signature__Group_4__2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4817:1: rule__Signature__Group_4__2 : rule__Signature__Group_4__2__Impl ;
    public final void rule__Signature__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4821:1: ( rule__Signature__Group_4__2__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4822:2: rule__Signature__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_4__2__Impl_in_rule__Signature__Group_4__29667);
            rule__Signature__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_4__2"


    // $ANTLR start "rule__Signature__Group_4__2__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4828:1: rule__Signature__Group_4__2__Impl : ( ( rule__Signature__OperationsAssignment_4_2 )* ) ;
    public final void rule__Signature__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4832:1: ( ( ( rule__Signature__OperationsAssignment_4_2 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4833:1: ( ( rule__Signature__OperationsAssignment_4_2 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4833:1: ( ( rule__Signature__OperationsAssignment_4_2 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4834:1: ( rule__Signature__OperationsAssignment_4_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getOperationsAssignment_4_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4835:1: ( rule__Signature__OperationsAssignment_4_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4835:2: rule__Signature__OperationsAssignment_4_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Signature__OperationsAssignment_4_2_in_rule__Signature__Group_4__2__Impl9694);
            	    rule__Signature__OperationsAssignment_4_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getOperationsAssignment_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__Group_4__2__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4851:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4855:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4856:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__09731);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__09734);
            rule__VariableDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0"


    // $ANTLR start "rule__VariableDeclaration__Group__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4863:1: rule__VariableDeclaration__Group__0__Impl : ( ( rule__VariableDeclaration__NameAssignment_0 ) ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4867:1: ( ( ( rule__VariableDeclaration__NameAssignment_0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4868:1: ( ( rule__VariableDeclaration__NameAssignment_0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4868:1: ( ( rule__VariableDeclaration__NameAssignment_0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4869:1: ( rule__VariableDeclaration__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4870:1: ( rule__VariableDeclaration__NameAssignment_0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4870:2: rule__VariableDeclaration__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableDeclaration__NameAssignment_0_in_rule__VariableDeclaration__Group__0__Impl9761);
            rule__VariableDeclaration__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4880:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4884:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4885:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__19791);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__19794);
            rule__VariableDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1"


    // $ANTLR start "rule__VariableDeclaration__Group__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4892:1: rule__VariableDeclaration__Group__1__Impl : ( ':' ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4896:1: ( ( ':' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4897:1: ( ':' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4897:1: ( ':' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4898:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getColonKeyword_1()); 
            }
            match(input,40,FollowSets000.FOLLOW_40_in_rule__VariableDeclaration__Group__1__Impl9822); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4911:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4915:1: ( rule__VariableDeclaration__Group__2__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4916:2: rule__VariableDeclaration__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__29853);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2"


    // $ANTLR start "rule__VariableDeclaration__Group__2__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4922:1: rule__VariableDeclaration__Group__2__Impl : ( ( rule__VariableDeclaration__SortAssignment_2 ) ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4926:1: ( ( ( rule__VariableDeclaration__SortAssignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4927:1: ( ( rule__VariableDeclaration__SortAssignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4927:1: ( ( rule__VariableDeclaration__SortAssignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4928:1: ( rule__VariableDeclaration__SortAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getSortAssignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4929:1: ( rule__VariableDeclaration__SortAssignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4929:2: rule__VariableDeclaration__SortAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableDeclaration__SortAssignment_2_in_rule__VariableDeclaration__Group__2__Impl9880);
            rule__VariableDeclaration__SortAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getSortAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__Equation__Group__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4945:1: rule__Equation__Group__0 : rule__Equation__Group__0__Impl rule__Equation__Group__1 ;
    public final void rule__Equation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4949:1: ( rule__Equation__Group__0__Impl rule__Equation__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4950:2: rule__Equation__Group__0__Impl rule__Equation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equation__Group__0__Impl_in_rule__Equation__Group__09916);
            rule__Equation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Equation__Group__1_in_rule__Equation__Group__09919);
            rule__Equation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__0"


    // $ANTLR start "rule__Equation__Group__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4957:1: rule__Equation__Group__0__Impl : ( ( rule__Equation__LeftHandTermAssignment_0 ) ) ;
    public final void rule__Equation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4961:1: ( ( ( rule__Equation__LeftHandTermAssignment_0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4962:1: ( ( rule__Equation__LeftHandTermAssignment_0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4962:1: ( ( rule__Equation__LeftHandTermAssignment_0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4963:1: ( rule__Equation__LeftHandTermAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getLeftHandTermAssignment_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4964:1: ( rule__Equation__LeftHandTermAssignment_0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4964:2: rule__Equation__LeftHandTermAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equation__LeftHandTermAssignment_0_in_rule__Equation__Group__0__Impl9946);
            rule__Equation__LeftHandTermAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquationAccess().getLeftHandTermAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__0__Impl"


    // $ANTLR start "rule__Equation__Group__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4974:1: rule__Equation__Group__1 : rule__Equation__Group__1__Impl rule__Equation__Group__2 ;
    public final void rule__Equation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4978:1: ( rule__Equation__Group__1__Impl rule__Equation__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4979:2: rule__Equation__Group__1__Impl rule__Equation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equation__Group__1__Impl_in_rule__Equation__Group__19976);
            rule__Equation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Equation__Group__2_in_rule__Equation__Group__19979);
            rule__Equation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__1"


    // $ANTLR start "rule__Equation__Group__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4986:1: rule__Equation__Group__1__Impl : ( '=' ) ;
    public final void rule__Equation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4990:1: ( ( '=' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4991:1: ( '=' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4991:1: ( '=' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4992:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getEqualsSignKeyword_1()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Equation__Group__1__Impl10007); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquationAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__1__Impl"


    // $ANTLR start "rule__Equation__Group__2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5005:1: rule__Equation__Group__2 : rule__Equation__Group__2__Impl ;
    public final void rule__Equation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5009:1: ( rule__Equation__Group__2__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5010:2: rule__Equation__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equation__Group__2__Impl_in_rule__Equation__Group__210038);
            rule__Equation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__2"


    // $ANTLR start "rule__Equation__Group__2__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5016:1: rule__Equation__Group__2__Impl : ( ( rule__Equation__RightHandTermAssignment_2 ) ) ;
    public final void rule__Equation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5020:1: ( ( ( rule__Equation__RightHandTermAssignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5021:1: ( ( rule__Equation__RightHandTermAssignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5021:1: ( ( rule__Equation__RightHandTermAssignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5022:1: ( rule__Equation__RightHandTermAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getRightHandTermAssignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5023:1: ( rule__Equation__RightHandTermAssignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5023:2: rule__Equation__RightHandTermAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equation__RightHandTermAssignment_2_in_rule__Equation__Group__2__Impl10065);
            rule__Equation__RightHandTermAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquationAccess().getRightHandTermAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__Group__2__Impl"


    // $ANTLR start "rule__RewriteRule__Group__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5039:1: rule__RewriteRule__Group__0 : rule__RewriteRule__Group__0__Impl rule__RewriteRule__Group__1 ;
    public final void rule__RewriteRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5043:1: ( rule__RewriteRule__Group__0__Impl rule__RewriteRule__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5044:2: rule__RewriteRule__Group__0__Impl rule__RewriteRule__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RewriteRule__Group__0__Impl_in_rule__RewriteRule__Group__010101);
            rule__RewriteRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__RewriteRule__Group__1_in_rule__RewriteRule__Group__010104);
            rule__RewriteRule__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewriteRule__Group__0"


    // $ANTLR start "rule__RewriteRule__Group__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5051:1: rule__RewriteRule__Group__0__Impl : ( ( rule__RewriteRule__LeftHandTermAssignment_0 ) ) ;
    public final void rule__RewriteRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5055:1: ( ( ( rule__RewriteRule__LeftHandTermAssignment_0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5056:1: ( ( rule__RewriteRule__LeftHandTermAssignment_0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5056:1: ( ( rule__RewriteRule__LeftHandTermAssignment_0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5057:1: ( rule__RewriteRule__LeftHandTermAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRewriteRuleAccess().getLeftHandTermAssignment_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5058:1: ( rule__RewriteRule__LeftHandTermAssignment_0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5058:2: rule__RewriteRule__LeftHandTermAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RewriteRule__LeftHandTermAssignment_0_in_rule__RewriteRule__Group__0__Impl10131);
            rule__RewriteRule__LeftHandTermAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRewriteRuleAccess().getLeftHandTermAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewriteRule__Group__0__Impl"


    // $ANTLR start "rule__RewriteRule__Group__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5068:1: rule__RewriteRule__Group__1 : rule__RewriteRule__Group__1__Impl rule__RewriteRule__Group__2 ;
    public final void rule__RewriteRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5072:1: ( rule__RewriteRule__Group__1__Impl rule__RewriteRule__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5073:2: rule__RewriteRule__Group__1__Impl rule__RewriteRule__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RewriteRule__Group__1__Impl_in_rule__RewriteRule__Group__110161);
            rule__RewriteRule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__RewriteRule__Group__2_in_rule__RewriteRule__Group__110164);
            rule__RewriteRule__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewriteRule__Group__1"


    // $ANTLR start "rule__RewriteRule__Group__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5080:1: rule__RewriteRule__Group__1__Impl : ( '->' ) ;
    public final void rule__RewriteRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5084:1: ( ( '->' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5085:1: ( '->' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5085:1: ( '->' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5086:1: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRewriteRuleAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            }
            match(input,41,FollowSets000.FOLLOW_41_in_rule__RewriteRule__Group__1__Impl10192); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRewriteRuleAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewriteRule__Group__1__Impl"


    // $ANTLR start "rule__RewriteRule__Group__2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5099:1: rule__RewriteRule__Group__2 : rule__RewriteRule__Group__2__Impl ;
    public final void rule__RewriteRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5103:1: ( rule__RewriteRule__Group__2__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5104:2: rule__RewriteRule__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RewriteRule__Group__2__Impl_in_rule__RewriteRule__Group__210223);
            rule__RewriteRule__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewriteRule__Group__2"


    // $ANTLR start "rule__RewriteRule__Group__2__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5110:1: rule__RewriteRule__Group__2__Impl : ( ( rule__RewriteRule__RightHandTermAssignment_2 ) ) ;
    public final void rule__RewriteRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5114:1: ( ( ( rule__RewriteRule__RightHandTermAssignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5115:1: ( ( rule__RewriteRule__RightHandTermAssignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5115:1: ( ( rule__RewriteRule__RightHandTermAssignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5116:1: ( rule__RewriteRule__RightHandTermAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRewriteRuleAccess().getRightHandTermAssignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5117:1: ( rule__RewriteRule__RightHandTermAssignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5117:2: rule__RewriteRule__RightHandTermAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RewriteRule__RightHandTermAssignment_2_in_rule__RewriteRule__Group__2__Impl10250);
            rule__RewriteRule__RightHandTermAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRewriteRuleAccess().getRightHandTermAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewriteRule__Group__2__Impl"


    // $ANTLR start "rule__SubSort__Group__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5133:1: rule__SubSort__Group__0 : rule__SubSort__Group__0__Impl rule__SubSort__Group__1 ;
    public final void rule__SubSort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5137:1: ( rule__SubSort__Group__0__Impl rule__SubSort__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5138:2: rule__SubSort__Group__0__Impl rule__SubSort__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubSort__Group__0__Impl_in_rule__SubSort__Group__010286);
            rule__SubSort__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SubSort__Group__1_in_rule__SubSort__Group__010289);
            rule__SubSort__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSort__Group__0"


    // $ANTLR start "rule__SubSort__Group__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5145:1: rule__SubSort__Group__0__Impl : ( ( rule__SubSort__NameAssignment_0 ) ) ;
    public final void rule__SubSort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5149:1: ( ( ( rule__SubSort__NameAssignment_0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5150:1: ( ( rule__SubSort__NameAssignment_0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5150:1: ( ( rule__SubSort__NameAssignment_0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5151:1: ( rule__SubSort__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubSortAccess().getNameAssignment_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5152:1: ( rule__SubSort__NameAssignment_0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5152:2: rule__SubSort__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubSort__NameAssignment_0_in_rule__SubSort__Group__0__Impl10316);
            rule__SubSort__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubSortAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSort__Group__0__Impl"


    // $ANTLR start "rule__SubSort__Group__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5162:1: rule__SubSort__Group__1 : rule__SubSort__Group__1__Impl rule__SubSort__Group__2 ;
    public final void rule__SubSort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5166:1: ( rule__SubSort__Group__1__Impl rule__SubSort__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5167:2: rule__SubSort__Group__1__Impl rule__SubSort__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubSort__Group__1__Impl_in_rule__SubSort__Group__110346);
            rule__SubSort__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SubSort__Group__2_in_rule__SubSort__Group__110349);
            rule__SubSort__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSort__Group__1"


    // $ANTLR start "rule__SubSort__Group__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5174:1: rule__SubSort__Group__1__Impl : ( '<' ) ;
    public final void rule__SubSort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5178:1: ( ( '<' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5179:1: ( '<' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5179:1: ( '<' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5180:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubSortAccess().getLessThanSignKeyword_1()); 
            }
            match(input,42,FollowSets000.FOLLOW_42_in_rule__SubSort__Group__1__Impl10377); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubSortAccess().getLessThanSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSort__Group__1__Impl"


    // $ANTLR start "rule__SubSort__Group__2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5193:1: rule__SubSort__Group__2 : rule__SubSort__Group__2__Impl ;
    public final void rule__SubSort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5197:1: ( rule__SubSort__Group__2__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5198:2: rule__SubSort__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubSort__Group__2__Impl_in_rule__SubSort__Group__210408);
            rule__SubSort__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSort__Group__2"


    // $ANTLR start "rule__SubSort__Group__2__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5204:1: rule__SubSort__Group__2__Impl : ( ( rule__SubSort__SuperSortAssignment_2 ) ) ;
    public final void rule__SubSort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5208:1: ( ( ( rule__SubSort__SuperSortAssignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5209:1: ( ( rule__SubSort__SuperSortAssignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5209:1: ( ( rule__SubSort__SuperSortAssignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5210:1: ( rule__SubSort__SuperSortAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubSortAccess().getSuperSortAssignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5211:1: ( rule__SubSort__SuperSortAssignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5211:2: rule__SubSort__SuperSortAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubSort__SuperSortAssignment_2_in_rule__SubSort__Group__2__Impl10435);
            rule__SubSort__SuperSortAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubSortAccess().getSuperSortAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSort__Group__2__Impl"


    // $ANTLR start "rule__Sort__Group__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5227:1: rule__Sort__Group__0 : rule__Sort__Group__0__Impl rule__Sort__Group__1 ;
    public final void rule__Sort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5231:1: ( rule__Sort__Group__0__Impl rule__Sort__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5232:2: rule__Sort__Group__0__Impl rule__Sort__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sort__Group__0__Impl_in_rule__Sort__Group__010471);
            rule__Sort__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Sort__Group__1_in_rule__Sort__Group__010474);
            rule__Sort__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sort__Group__0"


    // $ANTLR start "rule__Sort__Group__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5239:1: rule__Sort__Group__0__Impl : ( () ) ;
    public final void rule__Sort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5243:1: ( ( () ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5244:1: ( () )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5244:1: ( () )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5245:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSortAccess().getSortAction_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5246:1: ()
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5248:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSortAccess().getSortAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sort__Group__0__Impl"


    // $ANTLR start "rule__Sort__Group__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5258:1: rule__Sort__Group__1 : rule__Sort__Group__1__Impl ;
    public final void rule__Sort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5262:1: ( rule__Sort__Group__1__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5263:2: rule__Sort__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sort__Group__1__Impl_in_rule__Sort__Group__110532);
            rule__Sort__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sort__Group__1"


    // $ANTLR start "rule__Sort__Group__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5269:1: rule__Sort__Group__1__Impl : ( ( rule__Sort__NameAssignment_1 ) ) ;
    public final void rule__Sort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5273:1: ( ( ( rule__Sort__NameAssignment_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5274:1: ( ( rule__Sort__NameAssignment_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5274:1: ( ( rule__Sort__NameAssignment_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5275:1: ( rule__Sort__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSortAccess().getNameAssignment_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5276:1: ( rule__Sort__NameAssignment_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5276:2: rule__Sort__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sort__NameAssignment_1_in_rule__Sort__Group__1__Impl10559);
            rule__Sort__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSortAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sort__Group__1__Impl"


    // $ANTLR start "rule__Term__Group__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5290:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5294:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5295:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__010593);
            rule__Term__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group__1_in_rule__Term__Group__010596);
            rule__Term__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__0"


    // $ANTLR start "rule__Term__Group__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5302:1: rule__Term__Group__0__Impl : ( () ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5306:1: ( ( () ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5307:1: ( () )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5307:1: ( () )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5308:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getTermAction_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5309:1: ()
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5311:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getTermAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__0__Impl"


    // $ANTLR start "rule__Term__Group__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5321:1: rule__Term__Group__1 : rule__Term__Group__1__Impl rule__Term__Group__2 ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5325:1: ( rule__Term__Group__1__Impl rule__Term__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5326:2: rule__Term__Group__1__Impl rule__Term__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__110654);
            rule__Term__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group__2_in_rule__Term__Group__110657);
            rule__Term__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__1"


    // $ANTLR start "rule__Term__Group__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5333:1: rule__Term__Group__1__Impl : ( ( rule__Term__OperationSymbolAssignment_1 ) ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5337:1: ( ( ( rule__Term__OperationSymbolAssignment_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5338:1: ( ( rule__Term__OperationSymbolAssignment_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5338:1: ( ( rule__Term__OperationSymbolAssignment_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5339:1: ( rule__Term__OperationSymbolAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getOperationSymbolAssignment_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5340:1: ( rule__Term__OperationSymbolAssignment_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5340:2: rule__Term__OperationSymbolAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__OperationSymbolAssignment_1_in_rule__Term__Group__1__Impl10684);
            rule__Term__OperationSymbolAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getOperationSymbolAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__1__Impl"


    // $ANTLR start "rule__Term__Group__2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5350:1: rule__Term__Group__2 : rule__Term__Group__2__Impl ;
    public final void rule__Term__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5354:1: ( rule__Term__Group__2__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5355:2: rule__Term__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group__2__Impl_in_rule__Term__Group__210714);
            rule__Term__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__2"


    // $ANTLR start "rule__Term__Group__2__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5361:1: rule__Term__Group__2__Impl : ( ( rule__Term__Group_2__0 )? ) ;
    public final void rule__Term__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5365:1: ( ( ( rule__Term__Group_2__0 )? ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5366:1: ( ( rule__Term__Group_2__0 )? )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5366:1: ( ( rule__Term__Group_2__0 )? )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5367:1: ( rule__Term__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getGroup_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5368:1: ( rule__Term__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==17) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5368:2: rule__Term__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2__0_in_rule__Term__Group__2__Impl10741);
                    rule__Term__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__2__Impl"


    // $ANTLR start "rule__Term__Group_2__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5384:1: rule__Term__Group_2__0 : rule__Term__Group_2__0__Impl rule__Term__Group_2__1 ;
    public final void rule__Term__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5388:1: ( rule__Term__Group_2__0__Impl rule__Term__Group_2__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5389:2: rule__Term__Group_2__0__Impl rule__Term__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2__0__Impl_in_rule__Term__Group_2__010778);
            rule__Term__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2__1_in_rule__Term__Group_2__010781);
            rule__Term__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_2__0"


    // $ANTLR start "rule__Term__Group_2__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5396:1: rule__Term__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Term__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5400:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5401:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5401:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5402:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Term__Group_2__0__Impl10809); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getLeftParenthesisKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_2__0__Impl"


    // $ANTLR start "rule__Term__Group_2__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5415:1: rule__Term__Group_2__1 : rule__Term__Group_2__1__Impl rule__Term__Group_2__2 ;
    public final void rule__Term__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5419:1: ( rule__Term__Group_2__1__Impl rule__Term__Group_2__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5420:2: rule__Term__Group_2__1__Impl rule__Term__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2__1__Impl_in_rule__Term__Group_2__110840);
            rule__Term__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2__2_in_rule__Term__Group_2__110843);
            rule__Term__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_2__1"


    // $ANTLR start "rule__Term__Group_2__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5427:1: rule__Term__Group_2__1__Impl : ( ( rule__Term__SubtermsAssignment_2_1 ) ) ;
    public final void rule__Term__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5431:1: ( ( ( rule__Term__SubtermsAssignment_2_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5432:1: ( ( rule__Term__SubtermsAssignment_2_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5432:1: ( ( rule__Term__SubtermsAssignment_2_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5433:1: ( rule__Term__SubtermsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getSubtermsAssignment_2_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5434:1: ( rule__Term__SubtermsAssignment_2_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5434:2: rule__Term__SubtermsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__SubtermsAssignment_2_1_in_rule__Term__Group_2__1__Impl10870);
            rule__Term__SubtermsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getSubtermsAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_2__1__Impl"


    // $ANTLR start "rule__Term__Group_2__2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5444:1: rule__Term__Group_2__2 : rule__Term__Group_2__2__Impl rule__Term__Group_2__3 ;
    public final void rule__Term__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5448:1: ( rule__Term__Group_2__2__Impl rule__Term__Group_2__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5449:2: rule__Term__Group_2__2__Impl rule__Term__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2__2__Impl_in_rule__Term__Group_2__210900);
            rule__Term__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2__3_in_rule__Term__Group_2__210903);
            rule__Term__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_2__2"


    // $ANTLR start "rule__Term__Group_2__2__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5456:1: rule__Term__Group_2__2__Impl : ( ( rule__Term__Group_2_2__0 )* ) ;
    public final void rule__Term__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5460:1: ( ( ( rule__Term__Group_2_2__0 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5461:1: ( ( rule__Term__Group_2_2__0 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5461:1: ( ( rule__Term__Group_2_2__0 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5462:1: ( rule__Term__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getGroup_2_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5463:1: ( rule__Term__Group_2_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==19) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5463:2: rule__Term__Group_2_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2_2__0_in_rule__Term__Group_2__2__Impl10930);
            	    rule__Term__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getGroup_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_2__2__Impl"


    // $ANTLR start "rule__Term__Group_2__3"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5473:1: rule__Term__Group_2__3 : rule__Term__Group_2__3__Impl ;
    public final void rule__Term__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5477:1: ( rule__Term__Group_2__3__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5478:2: rule__Term__Group_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2__3__Impl_in_rule__Term__Group_2__310961);
            rule__Term__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_2__3"


    // $ANTLR start "rule__Term__Group_2__3__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5484:1: rule__Term__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Term__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5488:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5489:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5489:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5490:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Term__Group_2__3__Impl10989); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getRightParenthesisKeyword_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_2__3__Impl"


    // $ANTLR start "rule__Term__Group_2_2__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5511:1: rule__Term__Group_2_2__0 : rule__Term__Group_2_2__0__Impl rule__Term__Group_2_2__1 ;
    public final void rule__Term__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5515:1: ( rule__Term__Group_2_2__0__Impl rule__Term__Group_2_2__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5516:2: rule__Term__Group_2_2__0__Impl rule__Term__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2_2__0__Impl_in_rule__Term__Group_2_2__011028);
            rule__Term__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2_2__1_in_rule__Term__Group_2_2__011031);
            rule__Term__Group_2_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_2_2__0"


    // $ANTLR start "rule__Term__Group_2_2__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5523:1: rule__Term__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Term__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5527:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5528:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5528:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5529:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Term__Group_2_2__0__Impl11059); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getCommaKeyword_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_2_2__0__Impl"


    // $ANTLR start "rule__Term__Group_2_2__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5542:1: rule__Term__Group_2_2__1 : rule__Term__Group_2_2__1__Impl ;
    public final void rule__Term__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5546:1: ( rule__Term__Group_2_2__1__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5547:2: rule__Term__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2_2__1__Impl_in_rule__Term__Group_2_2__111090);
            rule__Term__Group_2_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_2_2__1"


    // $ANTLR start "rule__Term__Group_2_2__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5553:1: rule__Term__Group_2_2__1__Impl : ( ( rule__Term__SubtermsAssignment_2_2_1 ) ) ;
    public final void rule__Term__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5557:1: ( ( ( rule__Term__SubtermsAssignment_2_2_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5558:1: ( ( rule__Term__SubtermsAssignment_2_2_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5558:1: ( ( rule__Term__SubtermsAssignment_2_2_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5559:1: ( rule__Term__SubtermsAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getSubtermsAssignment_2_2_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5560:1: ( rule__Term__SubtermsAssignment_2_2_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5560:2: rule__Term__SubtermsAssignment_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__SubtermsAssignment_2_2_1_in_rule__Term__Group_2_2__1__Impl11117);
            rule__Term__SubtermsAssignment_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getSubtermsAssignment_2_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_2_2__1__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5574:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5578:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5579:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__011151);
            rule__Variable__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__011154);
            rule__Variable__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5586:1: rule__Variable__Group__0__Impl : ( () ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5590:1: ( ( () ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5591:1: ( () )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5591:1: ( () )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5592:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getVariableAction_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5593:1: ()
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5595:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getVariableAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5605:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5609:1: ( rule__Variable__Group__1__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5610:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__111212);
            rule__Variable__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5616:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__DeclarationAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5620:1: ( ( ( rule__Variable__DeclarationAssignment_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5621:1: ( ( rule__Variable__DeclarationAssignment_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5621:1: ( ( rule__Variable__DeclarationAssignment_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5622:1: ( rule__Variable__DeclarationAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getDeclarationAssignment_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5623:1: ( rule__Variable__DeclarationAssignment_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5623:2: rule__Variable__DeclarationAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__DeclarationAssignment_1_in_rule__Variable__Group__1__Impl11239);
            rule__Variable__DeclarationAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getDeclarationAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5637:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5641:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5642:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__011273);
            rule__Operation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__011276);
            rule__Operation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5649:1: rule__Operation__Group__0__Impl : ( ( rule__Operation__NameAssignment_0 ) ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5653:1: ( ( ( rule__Operation__NameAssignment_0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5654:1: ( ( rule__Operation__NameAssignment_0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5654:1: ( ( rule__Operation__NameAssignment_0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5655:1: ( rule__Operation__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getNameAssignment_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5656:1: ( rule__Operation__NameAssignment_0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5656:2: rule__Operation__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__NameAssignment_0_in_rule__Operation__Group__0__Impl11303);
            rule__Operation__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5666:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5670:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5671:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__111333);
            rule__Operation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__111336);
            rule__Operation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5678:1: rule__Operation__Group__1__Impl : ( ':' ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5682:1: ( ( ':' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5683:1: ( ':' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5683:1: ( ':' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5684:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getColonKeyword_1()); 
            }
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Operation__Group__1__Impl11364); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5697:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5701:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5702:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__211395);
            rule__Operation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__211398);
            rule__Operation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2"


    // $ANTLR start "rule__Operation__Group__2__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5709:1: rule__Operation__Group__2__Impl : ( ( rule__Operation__Group_2__0 )? ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5713:1: ( ( ( rule__Operation__Group_2__0 )? ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5714:1: ( ( rule__Operation__Group_2__0 )? )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5714:1: ( ( rule__Operation__Group_2__0 )? )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5715:1: ( rule__Operation__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5716:1: ( rule__Operation__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==19||LA24_1==41) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5716:2: rule__Operation__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_2__0_in_rule__Operation__Group__2__Impl11425);
                    rule__Operation__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2__Impl"


    // $ANTLR start "rule__Operation__Group__3"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5726:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5730:1: ( rule__Operation__Group__3__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5731:2: rule__Operation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__311456);
            rule__Operation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3"


    // $ANTLR start "rule__Operation__Group__3__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5737:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__ReturnTypeAssignment_3 ) ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5741:1: ( ( ( rule__Operation__ReturnTypeAssignment_3 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5742:1: ( ( rule__Operation__ReturnTypeAssignment_3 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5742:1: ( ( rule__Operation__ReturnTypeAssignment_3 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5743:1: ( rule__Operation__ReturnTypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getReturnTypeAssignment_3()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5744:1: ( rule__Operation__ReturnTypeAssignment_3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5744:2: rule__Operation__ReturnTypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__ReturnTypeAssignment_3_in_rule__Operation__Group__3__Impl11483);
            rule__Operation__ReturnTypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getReturnTypeAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3__Impl"


    // $ANTLR start "rule__Operation__Group_2__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5762:1: rule__Operation__Group_2__0 : rule__Operation__Group_2__0__Impl rule__Operation__Group_2__1 ;
    public final void rule__Operation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5766:1: ( rule__Operation__Group_2__0__Impl rule__Operation__Group_2__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5767:2: rule__Operation__Group_2__0__Impl rule__Operation__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_2__0__Impl_in_rule__Operation__Group_2__011521);
            rule__Operation__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_2__1_in_rule__Operation__Group_2__011524);
            rule__Operation__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_2__0"


    // $ANTLR start "rule__Operation__Group_2__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5774:1: rule__Operation__Group_2__0__Impl : ( ( rule__Operation__FormalParametersAssignment_2_0 ) ) ;
    public final void rule__Operation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5778:1: ( ( ( rule__Operation__FormalParametersAssignment_2_0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5779:1: ( ( rule__Operation__FormalParametersAssignment_2_0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5779:1: ( ( rule__Operation__FormalParametersAssignment_2_0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5780:1: ( rule__Operation__FormalParametersAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getFormalParametersAssignment_2_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5781:1: ( rule__Operation__FormalParametersAssignment_2_0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5781:2: rule__Operation__FormalParametersAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__FormalParametersAssignment_2_0_in_rule__Operation__Group_2__0__Impl11551);
            rule__Operation__FormalParametersAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getFormalParametersAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_2__0__Impl"


    // $ANTLR start "rule__Operation__Group_2__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5791:1: rule__Operation__Group_2__1 : rule__Operation__Group_2__1__Impl rule__Operation__Group_2__2 ;
    public final void rule__Operation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5795:1: ( rule__Operation__Group_2__1__Impl rule__Operation__Group_2__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5796:2: rule__Operation__Group_2__1__Impl rule__Operation__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_2__1__Impl_in_rule__Operation__Group_2__111581);
            rule__Operation__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_2__2_in_rule__Operation__Group_2__111584);
            rule__Operation__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_2__1"


    // $ANTLR start "rule__Operation__Group_2__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5803:1: rule__Operation__Group_2__1__Impl : ( ( rule__Operation__Group_2_1__0 )* ) ;
    public final void rule__Operation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5807:1: ( ( ( rule__Operation__Group_2_1__0 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5808:1: ( ( rule__Operation__Group_2_1__0 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5808:1: ( ( rule__Operation__Group_2_1__0 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5809:1: ( rule__Operation__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup_2_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5810:1: ( rule__Operation__Group_2_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==19) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5810:2: rule__Operation__Group_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_2_1__0_in_rule__Operation__Group_2__1__Impl11611);
            	    rule__Operation__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_2__1__Impl"


    // $ANTLR start "rule__Operation__Group_2__2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5820:1: rule__Operation__Group_2__2 : rule__Operation__Group_2__2__Impl ;
    public final void rule__Operation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5824:1: ( rule__Operation__Group_2__2__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5825:2: rule__Operation__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_2__2__Impl_in_rule__Operation__Group_2__211642);
            rule__Operation__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_2__2"


    // $ANTLR start "rule__Operation__Group_2__2__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5831:1: rule__Operation__Group_2__2__Impl : ( '->' ) ;
    public final void rule__Operation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5835:1: ( ( '->' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5836:1: ( '->' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5836:1: ( '->' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5837:1: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getHyphenMinusGreaterThanSignKeyword_2_2()); 
            }
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Operation__Group_2__2__Impl11670); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getHyphenMinusGreaterThanSignKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_2__2__Impl"


    // $ANTLR start "rule__Operation__Group_2_1__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5856:1: rule__Operation__Group_2_1__0 : rule__Operation__Group_2_1__0__Impl rule__Operation__Group_2_1__1 ;
    public final void rule__Operation__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5860:1: ( rule__Operation__Group_2_1__0__Impl rule__Operation__Group_2_1__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5861:2: rule__Operation__Group_2_1__0__Impl rule__Operation__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_2_1__0__Impl_in_rule__Operation__Group_2_1__011707);
            rule__Operation__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_2_1__1_in_rule__Operation__Group_2_1__011710);
            rule__Operation__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_2_1__0"


    // $ANTLR start "rule__Operation__Group_2_1__0__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5868:1: rule__Operation__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Operation__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5872:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5873:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5873:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5874:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Operation__Group_2_1__0__Impl11738); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getCommaKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_2_1__0__Impl"


    // $ANTLR start "rule__Operation__Group_2_1__1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5887:1: rule__Operation__Group_2_1__1 : rule__Operation__Group_2_1__1__Impl ;
    public final void rule__Operation__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5891:1: ( rule__Operation__Group_2_1__1__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5892:2: rule__Operation__Group_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_2_1__1__Impl_in_rule__Operation__Group_2_1__111769);
            rule__Operation__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_2_1__1"


    // $ANTLR start "rule__Operation__Group_2_1__1__Impl"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5898:1: rule__Operation__Group_2_1__1__Impl : ( ( rule__Operation__FormalParametersAssignment_2_1_1 ) ) ;
    public final void rule__Operation__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5902:1: ( ( ( rule__Operation__FormalParametersAssignment_2_1_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5903:1: ( ( rule__Operation__FormalParametersAssignment_2_1_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5903:1: ( ( rule__Operation__FormalParametersAssignment_2_1_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5904:1: ( rule__Operation__FormalParametersAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getFormalParametersAssignment_2_1_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5905:1: ( rule__Operation__FormalParametersAssignment_2_1_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5905:2: rule__Operation__FormalParametersAssignment_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__FormalParametersAssignment_2_1_1_in_rule__Operation__Group_2_1__1__Impl11796);
            rule__Operation__FormalParametersAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getFormalParametersAssignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_2_1__1__Impl"


    // $ANTLR start "rule__TransitionSystem__AdtAssignment_1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5920:1: rule__TransitionSystem__AdtAssignment_1 : ( ruleADT ) ;
    public final void rule__TransitionSystem__AdtAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5924:1: ( ( ruleADT ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5925:1: ( ruleADT )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5925:1: ( ruleADT )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5926:1: ruleADT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getAdtADTParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleADT_in_rule__TransitionSystem__AdtAssignment_111835);
            ruleADT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionSystemAccess().getAdtADTParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionSystem__AdtAssignment_1"


    // $ANTLR start "rule__TransitionSystem__InitialStateAssignment_4"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5935:1: rule__TransitionSystem__InitialStateAssignment_4 : ( ruleTerm ) ;
    public final void rule__TransitionSystem__InitialStateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5939:1: ( ( ruleTerm ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5940:1: ( ruleTerm )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5940:1: ( ruleTerm )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5941:1: ruleTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getInitialStateTermParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTerm_in_rule__TransitionSystem__InitialStateAssignment_411866);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionSystemAccess().getInitialStateTermParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionSystem__InitialStateAssignment_4"


    // $ANTLR start "rule__TransitionSystem__AuxiliaryAssignment_6"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5950:1: rule__TransitionSystem__AuxiliaryAssignment_6 : ( ruleAuxiliary ) ;
    public final void rule__TransitionSystem__AuxiliaryAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5954:1: ( ( ruleAuxiliary ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5955:1: ( ruleAuxiliary )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5955:1: ( ruleAuxiliary )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5956:1: ruleAuxiliary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getAuxiliaryAuxiliaryParserRuleCall_6_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAuxiliary_in_rule__TransitionSystem__AuxiliaryAssignment_611897);
            ruleAuxiliary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionSystemAccess().getAuxiliaryAuxiliaryParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionSystem__AuxiliaryAssignment_6"


    // $ANTLR start "rule__TransitionSystem__TransitionsAssignment_8"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5965:1: rule__TransitionSystem__TransitionsAssignment_8 : ( ruleTransition ) ;
    public final void rule__TransitionSystem__TransitionsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5969:1: ( ( ruleTransition ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5970:1: ( ruleTransition )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5970:1: ( ruleTransition )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5971:1: ruleTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getTransitionsTransitionParserRuleCall_8_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_rule__TransitionSystem__TransitionsAssignment_811928);
            ruleTransition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionSystemAccess().getTransitionsTransitionParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionSystem__TransitionsAssignment_8"


    // $ANTLR start "rule__Transition__NameAssignment_0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5980:1: rule__Transition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Transition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5984:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5985:1: ( RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5985:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5986:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Transition__NameAssignment_011959); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__NameAssignment_0"


    // $ANTLR start "rule__Transition__BodyAssignment_2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5995:1: rule__Transition__BodyAssignment_2 : ( ruleNonVariableStrategy ) ;
    public final void rule__Transition__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5999:1: ( ( ruleNonVariableStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6000:1: ( ruleNonVariableStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6000:1: ( ruleNonVariableStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6001:1: ruleNonVariableStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getBodyNonVariableStrategyParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNonVariableStrategy_in_rule__Transition__BodyAssignment_211990);
            ruleNonVariableStrategy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getBodyNonVariableStrategyParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__BodyAssignment_2"


    // $ANTLR start "rule__Auxiliary__NameAssignment_0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6010:1: rule__Auxiliary__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Auxiliary__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6014:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6015:1: ( RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6015:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6016:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Auxiliary__NameAssignment_012021); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuxiliaryAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auxiliary__NameAssignment_0"


    // $ANTLR start "rule__Auxiliary__FormalParamsAssignment_1_1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6025:1: rule__Auxiliary__FormalParamsAssignment_1_1 : ( ruleVariableStrategy ) ;
    public final void rule__Auxiliary__FormalParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6029:1: ( ( ruleVariableStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6030:1: ( ruleVariableStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6030:1: ( ruleVariableStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6031:1: ruleVariableStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getFormalParamsVariableStrategyParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableStrategy_in_rule__Auxiliary__FormalParamsAssignment_1_112052);
            ruleVariableStrategy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuxiliaryAccess().getFormalParamsVariableStrategyParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auxiliary__FormalParamsAssignment_1_1"


    // $ANTLR start "rule__Auxiliary__FormalParamsAssignment_1_2_1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6040:1: rule__Auxiliary__FormalParamsAssignment_1_2_1 : ( ruleVariableStrategy ) ;
    public final void rule__Auxiliary__FormalParamsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6044:1: ( ( ruleVariableStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6045:1: ( ruleVariableStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6045:1: ( ruleVariableStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6046:1: ruleVariableStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getFormalParamsVariableStrategyParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableStrategy_in_rule__Auxiliary__FormalParamsAssignment_1_2_112083);
            ruleVariableStrategy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuxiliaryAccess().getFormalParamsVariableStrategyParserRuleCall_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auxiliary__FormalParamsAssignment_1_2_1"


    // $ANTLR start "rule__Auxiliary__BodyAssignment_3"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6055:1: rule__Auxiliary__BodyAssignment_3 : ( ruleNonVariableStrategy ) ;
    public final void rule__Auxiliary__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6059:1: ( ( ruleNonVariableStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6060:1: ( ruleNonVariableStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6060:1: ( ruleNonVariableStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6061:1: ruleNonVariableStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getBodyNonVariableStrategyParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNonVariableStrategy_in_rule__Auxiliary__BodyAssignment_312114);
            ruleNonVariableStrategy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuxiliaryAccess().getBodyNonVariableStrategyParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Auxiliary__BodyAssignment_3"


    // $ANTLR start "rule__One__SAssignment_2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6070:1: rule__One__SAssignment_2 : ( ruleStrategy ) ;
    public final void rule__One__SAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6074:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6075:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6075:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6076:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneAccess().getSStrategyParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__One__SAssignment_212145);
            ruleStrategy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneAccess().getSStrategyParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__One__SAssignment_2"


    // $ANTLR start "rule__One__NAssignment_4"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6085:1: rule__One__NAssignment_4 : ( RULE_INT ) ;
    public final void rule__One__NAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6089:1: ( ( RULE_INT ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6090:1: ( RULE_INT )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6090:1: ( RULE_INT )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6091:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneAccess().getNINTTerminalRuleCall_4_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__One__NAssignment_412176); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOneAccess().getNINTTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__One__NAssignment_4"


    // $ANTLR start "rule__DeclaredStrategyInstance__DeclarationAssignment_1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6100:1: rule__DeclaredStrategyInstance__DeclarationAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DeclaredStrategyInstance__DeclarationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6104:1: ( ( ( RULE_ID ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6105:1: ( ( RULE_ID ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6105:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6106:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getDeclarationDeclaredStrategyCrossReference_1_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6107:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6108:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getDeclarationDeclaredStrategyIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__DeclaredStrategyInstance__DeclarationAssignment_112211); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredStrategyInstanceAccess().getDeclarationDeclaredStrategyIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredStrategyInstanceAccess().getDeclarationDeclaredStrategyCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredStrategyInstance__DeclarationAssignment_1"


    // $ANTLR start "rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6119:1: rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0 : ( ruleStrategy ) ;
    public final void rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6123:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6124:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6124:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6125:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getActualParamsStrategyParserRuleCall_3_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__DeclaredStrategyInstance__ActualParamsAssignment_3_012246);
            ruleStrategy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredStrategyInstanceAccess().getActualParamsStrategyParserRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0"


    // $ANTLR start "rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6134:1: rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1 : ( ruleStrategy ) ;
    public final void rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6138:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6139:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6139:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6140:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getActualParamsStrategyParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_112277);
            ruleStrategy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclaredStrategyInstanceAccess().getActualParamsStrategyParserRuleCall_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1"


    // $ANTLR start "rule__Saturation__SAssignment_2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6149:1: rule__Saturation__SAssignment_2 : ( ruleStrategy ) ;
    public final void rule__Saturation__SAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6153:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6154:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6154:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6155:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSaturationAccess().getSStrategyParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__Saturation__SAssignment_212308);
            ruleStrategy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSaturationAccess().getSStrategyParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saturation__SAssignment_2"


    // $ANTLR start "rule__Saturation__NAssignment_4"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6164:1: rule__Saturation__NAssignment_4 : ( RULE_INT ) ;
    public final void rule__Saturation__NAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6168:1: ( ( RULE_INT ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6169:1: ( RULE_INT )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6169:1: ( RULE_INT )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6170:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSaturationAccess().getNINTTerminalRuleCall_4_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Saturation__NAssignment_412339); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSaturationAccess().getNINTTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saturation__NAssignment_4"


    // $ANTLR start "rule__IfThenElse__S1Assignment_2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6179:1: rule__IfThenElse__S1Assignment_2 : ( ruleStrategy ) ;
    public final void rule__IfThenElse__S1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6183:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6184:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6184:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6185:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getS1StrategyParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__IfThenElse__S1Assignment_212370);
            ruleStrategy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getS1StrategyParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__S1Assignment_2"


    // $ANTLR start "rule__IfThenElse__S2Assignment_4"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6194:1: rule__IfThenElse__S2Assignment_4 : ( ruleStrategy ) ;
    public final void rule__IfThenElse__S2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6198:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6199:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6199:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6200:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getS2StrategyParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__IfThenElse__S2Assignment_412401);
            ruleStrategy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getS2StrategyParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__S2Assignment_4"


    // $ANTLR start "rule__IfThenElse__S3Assignment_6"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6209:1: rule__IfThenElse__S3Assignment_6 : ( ruleStrategy ) ;
    public final void rule__IfThenElse__S3Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6213:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6214:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6214:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6215:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getS3StrategyParserRuleCall_6_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__IfThenElse__S3Assignment_612432);
            ruleStrategy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getS3StrategyParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__S3Assignment_6"


    // $ANTLR start "rule__SimpleStrategy__EquationsAssignment_1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6224:1: rule__SimpleStrategy__EquationsAssignment_1 : ( ruleRewriteRule ) ;
    public final void rule__SimpleStrategy__EquationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6228:1: ( ( ruleRewriteRule ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6229:1: ( ruleRewriteRule )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6229:1: ( ruleRewriteRule )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6230:1: ruleRewriteRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleStrategyAccess().getEquationsRewriteRuleParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRewriteRule_in_rule__SimpleStrategy__EquationsAssignment_112463);
            ruleRewriteRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleStrategyAccess().getEquationsRewriteRuleParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStrategy__EquationsAssignment_1"


    // $ANTLR start "rule__SimpleStrategy__EquationsAssignment_2_1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6239:1: rule__SimpleStrategy__EquationsAssignment_2_1 : ( ruleRewriteRule ) ;
    public final void rule__SimpleStrategy__EquationsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6243:1: ( ( ruleRewriteRule ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6244:1: ( ruleRewriteRule )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6244:1: ( ruleRewriteRule )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6245:1: ruleRewriteRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleStrategyAccess().getEquationsRewriteRuleParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRewriteRule_in_rule__SimpleStrategy__EquationsAssignment_2_112494);
            ruleRewriteRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleStrategyAccess().getEquationsRewriteRuleParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleStrategy__EquationsAssignment_2_1"


    // $ANTLR start "rule__Not__SAssignment_2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6254:1: rule__Not__SAssignment_2 : ( ( rule__Not__SAlternatives_2_0 ) ) ;
    public final void rule__Not__SAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6258:1: ( ( ( rule__Not__SAlternatives_2_0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6259:1: ( ( rule__Not__SAlternatives_2_0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6259:1: ( ( rule__Not__SAlternatives_2_0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6260:1: ( rule__Not__SAlternatives_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getSAlternatives_2_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6261:1: ( rule__Not__SAlternatives_2_0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6261:2: rule__Not__SAlternatives_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Not__SAlternatives_2_0_in_rule__Not__SAssignment_212525);
            rule__Not__SAlternatives_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotAccess().getSAlternatives_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__SAssignment_2"


    // $ANTLR start "rule__Fixpoint__SAssignment_2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6270:1: rule__Fixpoint__SAssignment_2 : ( ruleStrategy ) ;
    public final void rule__Fixpoint__SAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6274:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6275:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6275:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6276:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixpointAccess().getSStrategyParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__Fixpoint__SAssignment_212558);
            ruleStrategy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFixpointAccess().getSStrategyParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fixpoint__SAssignment_2"


    // $ANTLR start "rule__All__SAssignment_2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6285:1: rule__All__SAssignment_2 : ( ruleStrategy ) ;
    public final void rule__All__SAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6289:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6290:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6290:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6291:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAllAccess().getSStrategyParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__All__SAssignment_212589);
            ruleStrategy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAllAccess().getSStrategyParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__All__SAssignment_2"


    // $ANTLR start "rule__Choice__S1Assignment_2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6300:1: rule__Choice__S1Assignment_2 : ( ruleStrategy ) ;
    public final void rule__Choice__S1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6304:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6305:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6305:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6306:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getS1StrategyParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__Choice__S1Assignment_212620);
            ruleStrategy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChoiceAccess().getS1StrategyParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__S1Assignment_2"


    // $ANTLR start "rule__Choice__S2Assignment_4"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6315:1: rule__Choice__S2Assignment_4 : ( ruleStrategy ) ;
    public final void rule__Choice__S2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6319:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6320:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6320:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6321:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getS2StrategyParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__Choice__S2Assignment_412651);
            ruleStrategy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChoiceAccess().getS2StrategyParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__S2Assignment_4"


    // $ANTLR start "rule__Union__S1Assignment_2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6330:1: rule__Union__S1Assignment_2 : ( ruleStrategy ) ;
    public final void rule__Union__S1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6334:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6335:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6335:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6336:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionAccess().getS1StrategyParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__Union__S1Assignment_212682);
            ruleStrategy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnionAccess().getS1StrategyParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Union__S1Assignment_2"


    // $ANTLR start "rule__Union__S2Assignment_4"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6345:1: rule__Union__S2Assignment_4 : ( ruleStrategy ) ;
    public final void rule__Union__S2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6349:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6350:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6350:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6351:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionAccess().getS2StrategyParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__Union__S2Assignment_412713);
            ruleStrategy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnionAccess().getS2StrategyParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Union__S2Assignment_4"


    // $ANTLR start "rule__Sequence__S1Assignment_2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6360:1: rule__Sequence__S1Assignment_2 : ( ruleStrategy ) ;
    public final void rule__Sequence__S1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6364:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6365:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6365:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6366:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getS1StrategyParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__Sequence__S1Assignment_212744);
            ruleStrategy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getS1StrategyParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__S1Assignment_2"


    // $ANTLR start "rule__Sequence__S2Assignment_4"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6375:1: rule__Sequence__S2Assignment_4 : ( ruleStrategy ) ;
    public final void rule__Sequence__S2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6379:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6380:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6380:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6381:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getS2StrategyParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__Sequence__S2Assignment_412775);
            ruleStrategy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getS2StrategyParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__S2Assignment_4"


    // $ANTLR start "rule__VariableStrategy__NameAssignment"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6390:1: rule__VariableStrategy__NameAssignment : ( RULE_ID ) ;
    public final void rule__VariableStrategy__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6394:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6395:1: ( RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6395:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6396:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableStrategyAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__VariableStrategy__NameAssignment12806); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableStrategyAccess().getNameIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableStrategy__NameAssignment"


    // $ANTLR start "rule__ADT__NameAssignment_1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6405:1: rule__ADT__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ADT__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6409:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6410:1: ( RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6410:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6411:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ADT__NameAssignment_112837); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getADTAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADT__NameAssignment_1"


    // $ANTLR start "rule__ADT__SignatureAssignment_3"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6420:1: rule__ADT__SignatureAssignment_3 : ( ruleSignature ) ;
    public final void rule__ADT__SignatureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6424:1: ( ( ruleSignature ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6425:1: ( ruleSignature )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6425:1: ( ruleSignature )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6426:1: ruleSignature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getSignatureSignatureParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSignature_in_rule__ADT__SignatureAssignment_312868);
            ruleSignature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getADTAccess().getSignatureSignatureParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADT__SignatureAssignment_3"


    // $ANTLR start "rule__ADT__EquationsAssignment_4_1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6435:1: rule__ADT__EquationsAssignment_4_1 : ( ruleEquation ) ;
    public final void rule__ADT__EquationsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6439:1: ( ( ruleEquation ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6440:1: ( ruleEquation )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6440:1: ( ruleEquation )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6441:1: ruleEquation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getEquationsEquationParserRuleCall_4_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEquation_in_rule__ADT__EquationsAssignment_4_112899);
            ruleEquation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getADTAccess().getEquationsEquationParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADT__EquationsAssignment_4_1"


    // $ANTLR start "rule__ADT__EquationsAssignment_4_2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6450:1: rule__ADT__EquationsAssignment_4_2 : ( ruleEquation ) ;
    public final void rule__ADT__EquationsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6454:1: ( ( ruleEquation ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6455:1: ( ruleEquation )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6455:1: ( ruleEquation )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6456:1: ruleEquation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getEquationsEquationParserRuleCall_4_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEquation_in_rule__ADT__EquationsAssignment_4_212930);
            ruleEquation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getADTAccess().getEquationsEquationParserRuleCall_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADT__EquationsAssignment_4_2"


    // $ANTLR start "rule__ADT__VariablesAssignment_5_1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6465:1: rule__ADT__VariablesAssignment_5_1 : ( ruleVariableDeclaration ) ;
    public final void rule__ADT__VariablesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6469:1: ( ( ruleVariableDeclaration ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6470:1: ( ruleVariableDeclaration )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6470:1: ( ruleVariableDeclaration )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6471:1: ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getVariablesVariableDeclarationParserRuleCall_5_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableDeclaration_in_rule__ADT__VariablesAssignment_5_112961);
            ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getADTAccess().getVariablesVariableDeclarationParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADT__VariablesAssignment_5_1"


    // $ANTLR start "rule__ADT__VariablesAssignment_5_2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6480:1: rule__ADT__VariablesAssignment_5_2 : ( ruleVariableDeclaration ) ;
    public final void rule__ADT__VariablesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6484:1: ( ( ruleVariableDeclaration ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6485:1: ( ruleVariableDeclaration )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6485:1: ( ruleVariableDeclaration )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6486:1: ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getVariablesVariableDeclarationParserRuleCall_5_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableDeclaration_in_rule__ADT__VariablesAssignment_5_212992);
            ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getADTAccess().getVariablesVariableDeclarationParserRuleCall_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ADT__VariablesAssignment_5_2"


    // $ANTLR start "rule__Signature__SortsAssignment_1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6495:1: rule__Signature__SortsAssignment_1 : ( ruleASort ) ;
    public final void rule__Signature__SortsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6499:1: ( ( ruleASort ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6500:1: ( ruleASort )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6500:1: ( ruleASort )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6501:1: ruleASort
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getSortsASortParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleASort_in_rule__Signature__SortsAssignment_113023);
            ruleASort();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getSortsASortParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__SortsAssignment_1"


    // $ANTLR start "rule__Signature__SortsAssignment_2_1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6510:1: rule__Signature__SortsAssignment_2_1 : ( ruleASort ) ;
    public final void rule__Signature__SortsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6514:1: ( ( ruleASort ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6515:1: ( ruleASort )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6515:1: ( ruleASort )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6516:1: ruleASort
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getSortsASortParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleASort_in_rule__Signature__SortsAssignment_2_113054);
            ruleASort();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getSortsASortParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__SortsAssignment_2_1"


    // $ANTLR start "rule__Signature__GeneratorsAssignment_3_1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6525:1: rule__Signature__GeneratorsAssignment_3_1 : ( ruleOperation ) ;
    public final void rule__Signature__GeneratorsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6529:1: ( ( ruleOperation ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6530:1: ( ruleOperation )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6530:1: ( ruleOperation )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6531:1: ruleOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getGeneratorsOperationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_rule__Signature__GeneratorsAssignment_3_113085);
            ruleOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getGeneratorsOperationParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__GeneratorsAssignment_3_1"


    // $ANTLR start "rule__Signature__GeneratorsAssignment_3_2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6540:1: rule__Signature__GeneratorsAssignment_3_2 : ( ruleOperation ) ;
    public final void rule__Signature__GeneratorsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6544:1: ( ( ruleOperation ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6545:1: ( ruleOperation )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6545:1: ( ruleOperation )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6546:1: ruleOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getGeneratorsOperationParserRuleCall_3_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_rule__Signature__GeneratorsAssignment_3_213116);
            ruleOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getGeneratorsOperationParserRuleCall_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__GeneratorsAssignment_3_2"


    // $ANTLR start "rule__Signature__OperationsAssignment_4_1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6555:1: rule__Signature__OperationsAssignment_4_1 : ( ruleOperation ) ;
    public final void rule__Signature__OperationsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6559:1: ( ( ruleOperation ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6560:1: ( ruleOperation )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6560:1: ( ruleOperation )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6561:1: ruleOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getOperationsOperationParserRuleCall_4_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_rule__Signature__OperationsAssignment_4_113147);
            ruleOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getOperationsOperationParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__OperationsAssignment_4_1"


    // $ANTLR start "rule__Signature__OperationsAssignment_4_2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6570:1: rule__Signature__OperationsAssignment_4_2 : ( ruleOperation ) ;
    public final void rule__Signature__OperationsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6574:1: ( ( ruleOperation ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6575:1: ( ruleOperation )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6575:1: ( ruleOperation )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6576:1: ruleOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getOperationsOperationParserRuleCall_4_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_rule__Signature__OperationsAssignment_4_213178);
            ruleOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureAccess().getOperationsOperationParserRuleCall_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signature__OperationsAssignment_4_2"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment_0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6585:1: rule__VariableDeclaration__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6589:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6590:1: ( RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6590:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6591:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_013209); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__NameAssignment_0"


    // $ANTLR start "rule__VariableDeclaration__SortAssignment_2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6600:1: rule__VariableDeclaration__SortAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__VariableDeclaration__SortAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6604:1: ( ( ( RULE_ID ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6605:1: ( ( RULE_ID ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6605:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6606:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getSortASortCrossReference_2_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6607:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6608:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getSortASortIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__VariableDeclaration__SortAssignment_213244); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getSortASortIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getSortASortCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__SortAssignment_2"


    // $ANTLR start "rule__Equation__LeftHandTermAssignment_0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6619:1: rule__Equation__LeftHandTermAssignment_0 : ( ruleATerm ) ;
    public final void rule__Equation__LeftHandTermAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6623:1: ( ( ruleATerm ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6624:1: ( ruleATerm )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6624:1: ( ruleATerm )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6625:1: ruleATerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getLeftHandTermATermParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleATerm_in_rule__Equation__LeftHandTermAssignment_013279);
            ruleATerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquationAccess().getLeftHandTermATermParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__LeftHandTermAssignment_0"


    // $ANTLR start "rule__Equation__RightHandTermAssignment_2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6634:1: rule__Equation__RightHandTermAssignment_2 : ( ruleATerm ) ;
    public final void rule__Equation__RightHandTermAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6638:1: ( ( ruleATerm ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6639:1: ( ruleATerm )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6639:1: ( ruleATerm )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6640:1: ruleATerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getRightHandTermATermParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleATerm_in_rule__Equation__RightHandTermAssignment_213310);
            ruleATerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquationAccess().getRightHandTermATermParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equation__RightHandTermAssignment_2"


    // $ANTLR start "rule__RewriteRule__LeftHandTermAssignment_0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6649:1: rule__RewriteRule__LeftHandTermAssignment_0 : ( ruleATerm ) ;
    public final void rule__RewriteRule__LeftHandTermAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6653:1: ( ( ruleATerm ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6654:1: ( ruleATerm )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6654:1: ( ruleATerm )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6655:1: ruleATerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRewriteRuleAccess().getLeftHandTermATermParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleATerm_in_rule__RewriteRule__LeftHandTermAssignment_013341);
            ruleATerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRewriteRuleAccess().getLeftHandTermATermParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewriteRule__LeftHandTermAssignment_0"


    // $ANTLR start "rule__RewriteRule__RightHandTermAssignment_2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6664:1: rule__RewriteRule__RightHandTermAssignment_2 : ( ruleATerm ) ;
    public final void rule__RewriteRule__RightHandTermAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6668:1: ( ( ruleATerm ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6669:1: ( ruleATerm )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6669:1: ( ruleATerm )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6670:1: ruleATerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRewriteRuleAccess().getRightHandTermATermParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleATerm_in_rule__RewriteRule__RightHandTermAssignment_213372);
            ruleATerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRewriteRuleAccess().getRightHandTermATermParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RewriteRule__RightHandTermAssignment_2"


    // $ANTLR start "rule__SubSort__NameAssignment_0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6679:1: rule__SubSort__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SubSort__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6683:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6684:1: ( RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6684:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6685:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubSortAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__SubSort__NameAssignment_013403); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubSortAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSort__NameAssignment_0"


    // $ANTLR start "rule__SubSort__SuperSortAssignment_2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6694:1: rule__SubSort__SuperSortAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__SubSort__SuperSortAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6698:1: ( ( ( RULE_ID ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6699:1: ( ( RULE_ID ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6699:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6700:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubSortAccess().getSuperSortASortCrossReference_2_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6701:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6702:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubSortAccess().getSuperSortASortIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__SubSort__SuperSortAssignment_213438); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubSortAccess().getSuperSortASortIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubSortAccess().getSuperSortASortCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSort__SuperSortAssignment_2"


    // $ANTLR start "rule__Sort__NameAssignment_1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6713:1: rule__Sort__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6717:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6718:1: ( RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6718:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6719:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSortAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Sort__NameAssignment_113473); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSortAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sort__NameAssignment_1"


    // $ANTLR start "rule__Term__OperationSymbolAssignment_1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6728:1: rule__Term__OperationSymbolAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Term__OperationSymbolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6732:1: ( ( ( RULE_ID ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6733:1: ( ( RULE_ID ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6733:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6734:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getOperationSymbolOperationCrossReference_1_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6735:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6736:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getOperationSymbolOperationIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Term__OperationSymbolAssignment_113508); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getOperationSymbolOperationIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getOperationSymbolOperationCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__OperationSymbolAssignment_1"


    // $ANTLR start "rule__Term__SubtermsAssignment_2_1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6747:1: rule__Term__SubtermsAssignment_2_1 : ( ruleATerm ) ;
    public final void rule__Term__SubtermsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6751:1: ( ( ruleATerm ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6752:1: ( ruleATerm )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6752:1: ( ruleATerm )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6753:1: ruleATerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getSubtermsATermParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleATerm_in_rule__Term__SubtermsAssignment_2_113543);
            ruleATerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getSubtermsATermParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__SubtermsAssignment_2_1"


    // $ANTLR start "rule__Term__SubtermsAssignment_2_2_1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6762:1: rule__Term__SubtermsAssignment_2_2_1 : ( ruleATerm ) ;
    public final void rule__Term__SubtermsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6766:1: ( ( ruleATerm ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6767:1: ( ruleATerm )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6767:1: ( ruleATerm )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6768:1: ruleATerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getSubtermsATermParserRuleCall_2_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleATerm_in_rule__Term__SubtermsAssignment_2_2_113574);
            ruleATerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getSubtermsATermParserRuleCall_2_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__SubtermsAssignment_2_2_1"


    // $ANTLR start "rule__Variable__DeclarationAssignment_1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6777:1: rule__Variable__DeclarationAssignment_1 : ( ( RULE_TERMVAR ) ) ;
    public final void rule__Variable__DeclarationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6781:1: ( ( ( RULE_TERMVAR ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6782:1: ( ( RULE_TERMVAR ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6782:1: ( ( RULE_TERMVAR ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6783:1: ( RULE_TERMVAR )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getDeclarationVariableDeclarationCrossReference_1_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6784:1: ( RULE_TERMVAR )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6785:1: RULE_TERMVAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getDeclarationVariableDeclarationTERMVARTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_TERMVAR,FollowSets000.FOLLOW_RULE_TERMVAR_in_rule__Variable__DeclarationAssignment_113609); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getDeclarationVariableDeclarationTERMVARTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getDeclarationVariableDeclarationCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__DeclarationAssignment_1"


    // $ANTLR start "rule__Operation__NameAssignment_0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6796:1: rule__Operation__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Operation__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6800:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6801:1: ( RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6801:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6802:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_013644); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__NameAssignment_0"


    // $ANTLR start "rule__Operation__FormalParametersAssignment_2_0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6811:1: rule__Operation__FormalParametersAssignment_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__Operation__FormalParametersAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6815:1: ( ( ( RULE_ID ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6816:1: ( ( RULE_ID ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6816:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6817:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getFormalParametersASortCrossReference_2_0_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6818:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6819:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getFormalParametersASortIDTerminalRuleCall_2_0_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Operation__FormalParametersAssignment_2_013679); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getFormalParametersASortIDTerminalRuleCall_2_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getFormalParametersASortCrossReference_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__FormalParametersAssignment_2_0"


    // $ANTLR start "rule__Operation__FormalParametersAssignment_2_1_1"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6830:1: rule__Operation__FormalParametersAssignment_2_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Operation__FormalParametersAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6834:1: ( ( ( RULE_ID ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6835:1: ( ( RULE_ID ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6835:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6836:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getFormalParametersASortCrossReference_2_1_1_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6837:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6838:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getFormalParametersASortIDTerminalRuleCall_2_1_1_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Operation__FormalParametersAssignment_2_1_113718); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getFormalParametersASortIDTerminalRuleCall_2_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getFormalParametersASortCrossReference_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__FormalParametersAssignment_2_1_1"


    // $ANTLR start "rule__Operation__ReturnTypeAssignment_3"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6849:1: rule__Operation__ReturnTypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Operation__ReturnTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6853:1: ( ( ( RULE_ID ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6854:1: ( ( RULE_ID ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6854:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6855:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getReturnTypeASortCrossReference_3_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6856:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6857:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getReturnTypeASortIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Operation__ReturnTypeAssignment_313757); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getReturnTypeASortIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getReturnTypeASortCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ReturnTypeAssignment_3"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleTransitionSystem_in_entryRuleTransitionSystem67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransitionSystem74 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__0_in_ruleTransitionSystem100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition127 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransition134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAuxiliary_in_entryRuleAuxiliary187 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAuxiliary194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group__0_in_ruleAuxiliary220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_entryRuleStrategy247 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStrategy254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Strategy__Alternatives_in_ruleStrategy280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNonVariableStrategy_in_entryRuleNonVariableStrategy307 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNonVariableStrategy314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__NonVariableStrategy__Alternatives_in_ruleNonVariableStrategy340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredefStrats_in_entryRulePredefStrats367 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePredefStrats374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PredefStrats__Alternatives_in_rulePredefStrats400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOne_in_entryRuleOne427 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOne434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__One__Group__0_in_ruleOne460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaredStrategyInstance_in_entryRuleDeclaredStrategyInstance487 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaredStrategyInstance494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group__0_in_ruleDeclaredStrategyInstance520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSaturation_in_entryRuleSaturation547 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSaturation554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Saturation__Group__0_in_ruleSaturation580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfThenElse_in_entryRuleIfThenElse607 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIfThenElse614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__0_in_ruleIfThenElse640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleStrategy_in_entryRuleSimpleStrategy667 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleStrategy674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group__0_in_ruleSimpleStrategy700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNot_in_entryRuleNot727 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNot734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Not__Group__0_in_ruleNot760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFixpoint_in_entryRuleFixpoint787 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFixpoint794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fixpoint__Group__0_in_ruleFixpoint820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAll_in_entryRuleAll847 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAll854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__All__Group__0_in_ruleAll880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice907 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChoice914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Choice__Group__0_in_ruleChoice940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnion_in_entryRuleUnion967 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnion974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Union__Group__0_in_ruleUnion1000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence1027 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSequence1034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__0_in_ruleSequence1060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentity_in_entryRuleIdentity1087 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentity1094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identity__Group__0_in_ruleIdentity1120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFail_in_entryRuleFail1147 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFail1154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fail__Group__0_in_ruleFail1180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableStrategy_in_entryRuleVariableStrategy1207 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableStrategy1214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableStrategy__NameAssignment_in_ruleVariableStrategy1240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleATerm_in_entryRuleATerm1267 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleATerm1274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ATerm__Alternatives_in_ruleATerm1300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleASort_in_entryRuleASort1327 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleASort1334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ASort__Alternatives_in_ruleASort1360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleADT_in_entryRuleADT1387 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleADT1394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group__0_in_ruleADT1420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignature_in_entryRuleSignature1447 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSignature1454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group__0_in_ruleSignature1480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1507 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration1514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0_in_ruleVariableDeclaration1540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEquation_in_entryRuleEquation1567 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEquation1574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equation__Group__0_in_ruleEquation1600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRewriteRule_in_entryRuleRewriteRule1627 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRewriteRule1634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RewriteRule__Group__0_in_ruleRewriteRule1660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubSort_in_entryRuleSubSort1687 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubSort1694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubSort__Group__0_in_ruleSubSort1720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSort_in_entryRuleSort1747 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSort1754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sort__Group__0_in_ruleSort1780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm1807 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerm1814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__Group__0_in_ruleTerm1840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1867 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable1874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__0_in_ruleVariable1900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation1927 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperation1934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__0_in_ruleOperation1960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNonVariableStrategy_in_rule__Strategy__Alternatives1996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableStrategy_in_rule__Strategy__Alternatives2013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredefStrats_in_rule__NonVariableStrategy__Alternatives2046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaredStrategyInstance_in_rule__NonVariableStrategy__Alternatives2064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentity_in_rule__PredefStrats__Alternatives2096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFail_in_rule__PredefStrats__Alternatives2113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoice_in_rule__PredefStrats__Alternatives2130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSequence_in_rule__PredefStrats__Alternatives2147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFixpoint_in_rule__PredefStrats__Alternatives2164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfThenElse_in_rule__PredefStrats__Alternatives2181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNot_in_rule__PredefStrats__Alternatives2198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleStrategy_in_rule__PredefStrats__Alternatives2215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOne_in_rule__PredefStrats__Alternatives2232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSaturation_in_rule__PredefStrats__Alternatives2249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnion_in_rule__PredefStrats__Alternatives2266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAll_in_rule__PredefStrats__Alternatives2283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleStrategy_in_rule__Not__SAlternatives_2_02315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaredStrategyInstance_in_rule__Not__SAlternatives_2_02332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableStrategy_in_rule__Not__SAlternatives_2_02349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerm_in_rule__ATerm__Alternatives2381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_rule__ATerm__Alternatives2398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubSort_in_rule__ASort__Alternatives2430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSort_in_rule__ASort__Alternatives2447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__0__Impl_in_rule__TransitionSystem__Group__02477 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__1_in_rule__TransitionSystem__Group__02480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__TransitionSystem__Group__0__Impl2508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__1__Impl_in_rule__TransitionSystem__Group__12539 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__2_in_rule__TransitionSystem__Group__12542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__AdtAssignment_1_in_rule__TransitionSystem__Group__1__Impl2569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__2__Impl_in_rule__TransitionSystem__Group__22599 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__3_in_rule__TransitionSystem__Group__22602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__TransitionSystem__Group__2__Impl2630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__3__Impl_in_rule__TransitionSystem__Group__32661 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__4_in_rule__TransitionSystem__Group__32664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__TransitionSystem__Group__3__Impl2692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__4__Impl_in_rule__TransitionSystem__Group__42723 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__5_in_rule__TransitionSystem__Group__42726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__InitialStateAssignment_4_in_rule__TransitionSystem__Group__4__Impl2753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__5__Impl_in_rule__TransitionSystem__Group__52783 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__6_in_rule__TransitionSystem__Group__52786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TransitionSystem__Group__5__Impl2814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__6__Impl_in_rule__TransitionSystem__Group__62845 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__7_in_rule__TransitionSystem__Group__62848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__AuxiliaryAssignment_6_in_rule__TransitionSystem__Group__6__Impl2875 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__7__Impl_in_rule__TransitionSystem__Group__72906 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__8_in_rule__TransitionSystem__Group__72909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TransitionSystem__Group__7__Impl2937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__8__Impl_in_rule__TransitionSystem__Group__82968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__TransitionsAssignment_8_in_rule__TransitionSystem__Group__8__Impl2995 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__03044 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__03047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__NameAssignment_0_in_rule__Transition__Group__0__Impl3074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__13104 = new BitSet(new long[]{0x00000001FEF00010L});
        public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__13107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Transition__Group__1__Impl3135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__23166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__BodyAssignment_2_in_rule__Transition__Group__2__Impl3193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group__0__Impl_in_rule__Auxiliary__Group__03229 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group__1_in_rule__Auxiliary__Group__03232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__NameAssignment_0_in_rule__Auxiliary__Group__0__Impl3259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group__1__Impl_in_rule__Auxiliary__Group__13289 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group__2_in_rule__Auxiliary__Group__13292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1__0_in_rule__Auxiliary__Group__1__Impl3319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group__2__Impl_in_rule__Auxiliary__Group__23350 = new BitSet(new long[]{0x00000001FEF00010L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group__3_in_rule__Auxiliary__Group__23353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Auxiliary__Group__2__Impl3381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group__3__Impl_in_rule__Auxiliary__Group__33412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__BodyAssignment_3_in_rule__Auxiliary__Group__3__Impl3439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1__0__Impl_in_rule__Auxiliary__Group_1__03477 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1__1_in_rule__Auxiliary__Group_1__03480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Auxiliary__Group_1__0__Impl3508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1__1__Impl_in_rule__Auxiliary__Group_1__13539 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1__2_in_rule__Auxiliary__Group_1__13542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__FormalParamsAssignment_1_1_in_rule__Auxiliary__Group_1__1__Impl3569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1__2__Impl_in_rule__Auxiliary__Group_1__23599 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1__3_in_rule__Auxiliary__Group_1__23602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1_2__0_in_rule__Auxiliary__Group_1__2__Impl3629 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1__3__Impl_in_rule__Auxiliary__Group_1__33660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Auxiliary__Group_1__3__Impl3688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1_2__0__Impl_in_rule__Auxiliary__Group_1_2__03727 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1_2__1_in_rule__Auxiliary__Group_1_2__03730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Auxiliary__Group_1_2__0__Impl3758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1_2__1__Impl_in_rule__Auxiliary__Group_1_2__13789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__FormalParamsAssignment_1_2_1_in_rule__Auxiliary__Group_1_2__1__Impl3816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__One__Group__0__Impl_in_rule__One__Group__03850 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__One__Group__1_in_rule__One__Group__03853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__One__Group__0__Impl3881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__One__Group__1__Impl_in_rule__One__Group__13912 = new BitSet(new long[]{0x00000001FEF00010L});
        public static final BitSet FOLLOW_rule__One__Group__2_in_rule__One__Group__13915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__One__Group__1__Impl3943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__One__Group__2__Impl_in_rule__One__Group__23974 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__One__Group__3_in_rule__One__Group__23977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__One__SAssignment_2_in_rule__One__Group__2__Impl4004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__One__Group__3__Impl_in_rule__One__Group__34034 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__One__Group__4_in_rule__One__Group__34037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__One__Group__3__Impl4065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__One__Group__4__Impl_in_rule__One__Group__44096 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__One__Group__5_in_rule__One__Group__44099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__One__NAssignment_4_in_rule__One__Group__4__Impl4126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__One__Group__5__Impl_in_rule__One__Group__54156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__One__Group__5__Impl4184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group__0__Impl_in_rule__DeclaredStrategyInstance__Group__04227 = new BitSet(new long[]{0x00000001FEF00010L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group__1_in_rule__DeclaredStrategyInstance__Group__04230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group__1__Impl_in_rule__DeclaredStrategyInstance__Group__14288 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group__2_in_rule__DeclaredStrategyInstance__Group__14291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__DeclarationAssignment_1_in_rule__DeclaredStrategyInstance__Group__1__Impl4318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group__2__Impl_in_rule__DeclaredStrategyInstance__Group__24348 = new BitSet(new long[]{0x00000001FEF40010L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group__3_in_rule__DeclaredStrategyInstance__Group__24351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__DeclaredStrategyInstance__Group__2__Impl4379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group__3__Impl_in_rule__DeclaredStrategyInstance__Group__34410 = new BitSet(new long[]{0x00000001FEF40010L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group__4_in_rule__DeclaredStrategyInstance__Group__34413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group_3__0_in_rule__DeclaredStrategyInstance__Group__3__Impl4440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group__4__Impl_in_rule__DeclaredStrategyInstance__Group__44471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__DeclaredStrategyInstance__Group__4__Impl4499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group_3__0__Impl_in_rule__DeclaredStrategyInstance__Group_3__04540 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group_3__1_in_rule__DeclaredStrategyInstance__Group_3__04543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0_in_rule__DeclaredStrategyInstance__Group_3__0__Impl4570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group_3__1__Impl_in_rule__DeclaredStrategyInstance__Group_3__14600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group_3_1__0_in_rule__DeclaredStrategyInstance__Group_3__1__Impl4627 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group_3_1__0__Impl_in_rule__DeclaredStrategyInstance__Group_3_1__04662 = new BitSet(new long[]{0x00000001FEF00010L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group_3_1__1_in_rule__DeclaredStrategyInstance__Group_3_1__04665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__DeclaredStrategyInstance__Group_3_1__0__Impl4693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group_3_1__1__Impl_in_rule__DeclaredStrategyInstance__Group_3_1__14724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1_in_rule__DeclaredStrategyInstance__Group_3_1__1__Impl4751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Saturation__Group__0__Impl_in_rule__Saturation__Group__04785 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Saturation__Group__1_in_rule__Saturation__Group__04788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Saturation__Group__0__Impl4816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Saturation__Group__1__Impl_in_rule__Saturation__Group__14847 = new BitSet(new long[]{0x00000001FEF00010L});
        public static final BitSet FOLLOW_rule__Saturation__Group__2_in_rule__Saturation__Group__14850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Saturation__Group__1__Impl4878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Saturation__Group__2__Impl_in_rule__Saturation__Group__24909 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Saturation__Group__3_in_rule__Saturation__Group__24912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Saturation__SAssignment_2_in_rule__Saturation__Group__2__Impl4939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Saturation__Group__3__Impl_in_rule__Saturation__Group__34969 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Saturation__Group__4_in_rule__Saturation__Group__34972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Saturation__Group__3__Impl5000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Saturation__Group__4__Impl_in_rule__Saturation__Group__45031 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Saturation__Group__5_in_rule__Saturation__Group__45034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Saturation__NAssignment_4_in_rule__Saturation__Group__4__Impl5061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Saturation__Group__5__Impl_in_rule__Saturation__Group__55091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Saturation__Group__5__Impl5119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__0__Impl_in_rule__IfThenElse__Group__05162 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__1_in_rule__IfThenElse__Group__05165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__IfThenElse__Group__0__Impl5193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__1__Impl_in_rule__IfThenElse__Group__15224 = new BitSet(new long[]{0x00000001FEF00010L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__2_in_rule__IfThenElse__Group__15227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__IfThenElse__Group__1__Impl5255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__2__Impl_in_rule__IfThenElse__Group__25286 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__3_in_rule__IfThenElse__Group__25289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__S1Assignment_2_in_rule__IfThenElse__Group__2__Impl5316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__3__Impl_in_rule__IfThenElse__Group__35346 = new BitSet(new long[]{0x00000001FEF00010L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__4_in_rule__IfThenElse__Group__35349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__IfThenElse__Group__3__Impl5377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__4__Impl_in_rule__IfThenElse__Group__45408 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__5_in_rule__IfThenElse__Group__45411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__S2Assignment_4_in_rule__IfThenElse__Group__4__Impl5438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__5__Impl_in_rule__IfThenElse__Group__55468 = new BitSet(new long[]{0x00000001FEF00010L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__6_in_rule__IfThenElse__Group__55471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__IfThenElse__Group__5__Impl5499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__6__Impl_in_rule__IfThenElse__Group__65530 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__7_in_rule__IfThenElse__Group__65533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__S3Assignment_6_in_rule__IfThenElse__Group__6__Impl5560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__7__Impl_in_rule__IfThenElse__Group__75590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__IfThenElse__Group__7__Impl5618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group__0__Impl_in_rule__SimpleStrategy__Group__05665 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group__1_in_rule__SimpleStrategy__Group__05668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__SimpleStrategy__Group__0__Impl5696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group__1__Impl_in_rule__SimpleStrategy__Group__15727 = new BitSet(new long[]{0x0000000001080000L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group__2_in_rule__SimpleStrategy__Group__15730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__EquationsAssignment_1_in_rule__SimpleStrategy__Group__1__Impl5757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group__2__Impl_in_rule__SimpleStrategy__Group__25787 = new BitSet(new long[]{0x0000000001080000L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group__3_in_rule__SimpleStrategy__Group__25790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group_2__0_in_rule__SimpleStrategy__Group__2__Impl5817 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group__3__Impl_in_rule__SimpleStrategy__Group__35848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__SimpleStrategy__Group__3__Impl5876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group_2__0__Impl_in_rule__SimpleStrategy__Group_2__05915 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group_2__1_in_rule__SimpleStrategy__Group_2__05918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__SimpleStrategy__Group_2__0__Impl5946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group_2__1__Impl_in_rule__SimpleStrategy__Group_2__15977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__EquationsAssignment_2_1_in_rule__SimpleStrategy__Group_2__1__Impl6004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Not__Group__0__Impl_in_rule__Not__Group__06038 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Not__Group__1_in_rule__Not__Group__06041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Not__Group__0__Impl6069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Not__Group__1__Impl_in_rule__Not__Group__16100 = new BitSet(new long[]{0x00000001FEF00010L});
        public static final BitSet FOLLOW_rule__Not__Group__2_in_rule__Not__Group__16103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Not__Group__1__Impl6131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Not__Group__2__Impl_in_rule__Not__Group__26162 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Not__Group__3_in_rule__Not__Group__26165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Not__SAssignment_2_in_rule__Not__Group__2__Impl6192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Not__Group__3__Impl_in_rule__Not__Group__36222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Not__Group__3__Impl6250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fixpoint__Group__0__Impl_in_rule__Fixpoint__Group__06289 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Fixpoint__Group__1_in_rule__Fixpoint__Group__06292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Fixpoint__Group__0__Impl6320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fixpoint__Group__1__Impl_in_rule__Fixpoint__Group__16351 = new BitSet(new long[]{0x00000001FEF00010L});
        public static final BitSet FOLLOW_rule__Fixpoint__Group__2_in_rule__Fixpoint__Group__16354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Fixpoint__Group__1__Impl6382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fixpoint__Group__2__Impl_in_rule__Fixpoint__Group__26413 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Fixpoint__Group__3_in_rule__Fixpoint__Group__26416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fixpoint__SAssignment_2_in_rule__Fixpoint__Group__2__Impl6443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fixpoint__Group__3__Impl_in_rule__Fixpoint__Group__36473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Fixpoint__Group__3__Impl6501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__All__Group__0__Impl_in_rule__All__Group__06540 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__All__Group__1_in_rule__All__Group__06543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__All__Group__0__Impl6571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__All__Group__1__Impl_in_rule__All__Group__16602 = new BitSet(new long[]{0x00000001FEF00010L});
        public static final BitSet FOLLOW_rule__All__Group__2_in_rule__All__Group__16605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__All__Group__1__Impl6633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__All__Group__2__Impl_in_rule__All__Group__26664 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__All__Group__3_in_rule__All__Group__26667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__All__SAssignment_2_in_rule__All__Group__2__Impl6694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__All__Group__3__Impl_in_rule__All__Group__36724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__All__Group__3__Impl6752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Choice__Group__0__Impl_in_rule__Choice__Group__06791 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Choice__Group__1_in_rule__Choice__Group__06794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Choice__Group__0__Impl6822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Choice__Group__1__Impl_in_rule__Choice__Group__16853 = new BitSet(new long[]{0x00000001FEF00010L});
        public static final BitSet FOLLOW_rule__Choice__Group__2_in_rule__Choice__Group__16856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Choice__Group__1__Impl6884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Choice__Group__2__Impl_in_rule__Choice__Group__26915 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Choice__Group__3_in_rule__Choice__Group__26918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Choice__S1Assignment_2_in_rule__Choice__Group__2__Impl6945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Choice__Group__3__Impl_in_rule__Choice__Group__36975 = new BitSet(new long[]{0x00000001FEF00010L});
        public static final BitSet FOLLOW_rule__Choice__Group__4_in_rule__Choice__Group__36978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Choice__Group__3__Impl7006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Choice__Group__4__Impl_in_rule__Choice__Group__47037 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Choice__Group__5_in_rule__Choice__Group__47040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Choice__S2Assignment_4_in_rule__Choice__Group__4__Impl7067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Choice__Group__5__Impl_in_rule__Choice__Group__57097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Choice__Group__5__Impl7125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Union__Group__0__Impl_in_rule__Union__Group__07168 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Union__Group__1_in_rule__Union__Group__07171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Union__Group__0__Impl7199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Union__Group__1__Impl_in_rule__Union__Group__17230 = new BitSet(new long[]{0x00000001FEF00010L});
        public static final BitSet FOLLOW_rule__Union__Group__2_in_rule__Union__Group__17233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Union__Group__1__Impl7261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Union__Group__2__Impl_in_rule__Union__Group__27292 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Union__Group__3_in_rule__Union__Group__27295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Union__S1Assignment_2_in_rule__Union__Group__2__Impl7322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Union__Group__3__Impl_in_rule__Union__Group__37352 = new BitSet(new long[]{0x00000001FEF00010L});
        public static final BitSet FOLLOW_rule__Union__Group__4_in_rule__Union__Group__37355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Union__Group__3__Impl7383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Union__Group__4__Impl_in_rule__Union__Group__47414 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Union__Group__5_in_rule__Union__Group__47417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Union__S2Assignment_4_in_rule__Union__Group__4__Impl7444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Union__Group__5__Impl_in_rule__Union__Group__57474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Union__Group__5__Impl7502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__07545 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__07548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Sequence__Group__0__Impl7576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__17607 = new BitSet(new long[]{0x00000001FEF00010L});
        public static final BitSet FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__17610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Sequence__Group__1__Impl7638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__27669 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__27672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__S1Assignment_2_in_rule__Sequence__Group__2__Impl7699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__37729 = new BitSet(new long[]{0x00000001FEF00010L});
        public static final BitSet FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__37732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Sequence__Group__3__Impl7760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__47791 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Sequence__Group__5_in_rule__Sequence__Group__47794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__S2Assignment_4_in_rule__Sequence__Group__4__Impl7821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__5__Impl_in_rule__Sequence__Group__57851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Sequence__Group__5__Impl7879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identity__Group__0__Impl_in_rule__Identity__Group__07922 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_rule__Identity__Group__1_in_rule__Identity__Group__07925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Identity__Group__0__Impl7953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identity__Group__1__Impl_in_rule__Identity__Group__17984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fail__Group__0__Impl_in_rule__Fail__Group__08046 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_rule__Fail__Group__1_in_rule__Fail__Group__08049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Fail__Group__0__Impl8077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fail__Group__1__Impl_in_rule__Fail__Group__18108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group__0__Impl_in_rule__ADT__Group__08170 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__ADT__Group__1_in_rule__ADT__Group__08173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__ADT__Group__0__Impl8201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group__1__Impl_in_rule__ADT__Group__18232 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__ADT__Group__2_in_rule__ADT__Group__18235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__NameAssignment_1_in_rule__ADT__Group__1__Impl8262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group__2__Impl_in_rule__ADT__Group__28292 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__ADT__Group__3_in_rule__ADT__Group__28295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__ADT__Group__2__Impl8323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group__3__Impl_in_rule__ADT__Group__38354 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_rule__ADT__Group__4_in_rule__ADT__Group__38357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__SignatureAssignment_3_in_rule__ADT__Group__3__Impl8384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group__4__Impl_in_rule__ADT__Group__48414 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_rule__ADT__Group__5_in_rule__ADT__Group__48417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group_4__0_in_rule__ADT__Group__4__Impl8444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group__5__Impl_in_rule__ADT__Group__58475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group_5__0_in_rule__ADT__Group__5__Impl8502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group_4__0__Impl_in_rule__ADT__Group_4__08545 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__ADT__Group_4__1_in_rule__ADT__Group_4__08548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__ADT__Group_4__0__Impl8577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group_4__1__Impl_in_rule__ADT__Group_4__18609 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__ADT__Group_4__2_in_rule__ADT__Group_4__18612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__EquationsAssignment_4_1_in_rule__ADT__Group_4__1__Impl8639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group_4__2__Impl_in_rule__ADT__Group_4__28669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__EquationsAssignment_4_2_in_rule__ADT__Group_4__2__Impl8696 = new BitSet(new long[]{0x0000000000000052L});
        public static final BitSet FOLLOW_rule__ADT__Group_5__0__Impl_in_rule__ADT__Group_5__08733 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__ADT__Group_5__1_in_rule__ADT__Group_5__08736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__ADT__Group_5__0__Impl8765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group_5__1__Impl_in_rule__ADT__Group_5__18797 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__ADT__Group_5__2_in_rule__ADT__Group_5__18800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__VariablesAssignment_5_1_in_rule__ADT__Group_5__1__Impl8827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group_5__2__Impl_in_rule__ADT__Group_5__28857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__VariablesAssignment_5_2_in_rule__ADT__Group_5__2__Impl8884 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__Signature__Group__0__Impl_in_rule__Signature__Group__08921 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Signature__Group__1_in_rule__Signature__Group__08924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Signature__Group__0__Impl8952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group__1__Impl_in_rule__Signature__Group__18983 = new BitSet(new long[]{0x0000004000080000L});
        public static final BitSet FOLLOW_rule__Signature__Group__2_in_rule__Signature__Group__18986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__SortsAssignment_1_in_rule__Signature__Group__1__Impl9013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group__2__Impl_in_rule__Signature__Group__29043 = new BitSet(new long[]{0x0000004000080000L});
        public static final BitSet FOLLOW_rule__Signature__Group__3_in_rule__Signature__Group__29046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group_2__0_in_rule__Signature__Group__2__Impl9073 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Signature__Group__3__Impl_in_rule__Signature__Group__39104 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__Signature__Group__4_in_rule__Signature__Group__39107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group_3__0_in_rule__Signature__Group__3__Impl9134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group__4__Impl_in_rule__Signature__Group__49164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group_4__0_in_rule__Signature__Group__4__Impl9191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group_2__0__Impl_in_rule__Signature__Group_2__09232 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Signature__Group_2__1_in_rule__Signature__Group_2__09235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Signature__Group_2__0__Impl9263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group_2__1__Impl_in_rule__Signature__Group_2__19294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__SortsAssignment_2_1_in_rule__Signature__Group_2__1__Impl9321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group_3__0__Impl_in_rule__Signature__Group_3__09355 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Signature__Group_3__1_in_rule__Signature__Group_3__09358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Signature__Group_3__0__Impl9387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group_3__1__Impl_in_rule__Signature__Group_3__19419 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Signature__Group_3__2_in_rule__Signature__Group_3__19422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__GeneratorsAssignment_3_1_in_rule__Signature__Group_3__1__Impl9449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group_3__2__Impl_in_rule__Signature__Group_3__29479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__GeneratorsAssignment_3_2_in_rule__Signature__Group_3__2__Impl9506 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__Signature__Group_4__0__Impl_in_rule__Signature__Group_4__09543 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Signature__Group_4__1_in_rule__Signature__Group_4__09546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Signature__Group_4__0__Impl9575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group_4__1__Impl_in_rule__Signature__Group_4__19607 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Signature__Group_4__2_in_rule__Signature__Group_4__19610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__OperationsAssignment_4_1_in_rule__Signature__Group_4__1__Impl9637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group_4__2__Impl_in_rule__Signature__Group_4__29667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__OperationsAssignment_4_2_in_rule__Signature__Group_4__2__Impl9694 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__09731 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__09734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableDeclaration__NameAssignment_0_in_rule__VariableDeclaration__Group__0__Impl9761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__19791 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__19794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__VariableDeclaration__Group__1__Impl9822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__29853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableDeclaration__SortAssignment_2_in_rule__VariableDeclaration__Group__2__Impl9880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equation__Group__0__Impl_in_rule__Equation__Group__09916 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Equation__Group__1_in_rule__Equation__Group__09919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equation__LeftHandTermAssignment_0_in_rule__Equation__Group__0__Impl9946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equation__Group__1__Impl_in_rule__Equation__Group__19976 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__Equation__Group__2_in_rule__Equation__Group__19979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Equation__Group__1__Impl10007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equation__Group__2__Impl_in_rule__Equation__Group__210038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equation__RightHandTermAssignment_2_in_rule__Equation__Group__2__Impl10065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RewriteRule__Group__0__Impl_in_rule__RewriteRule__Group__010101 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__RewriteRule__Group__1_in_rule__RewriteRule__Group__010104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RewriteRule__LeftHandTermAssignment_0_in_rule__RewriteRule__Group__0__Impl10131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RewriteRule__Group__1__Impl_in_rule__RewriteRule__Group__110161 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__RewriteRule__Group__2_in_rule__RewriteRule__Group__110164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__RewriteRule__Group__1__Impl10192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RewriteRule__Group__2__Impl_in_rule__RewriteRule__Group__210223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RewriteRule__RightHandTermAssignment_2_in_rule__RewriteRule__Group__2__Impl10250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubSort__Group__0__Impl_in_rule__SubSort__Group__010286 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__SubSort__Group__1_in_rule__SubSort__Group__010289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubSort__NameAssignment_0_in_rule__SubSort__Group__0__Impl10316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubSort__Group__1__Impl_in_rule__SubSort__Group__110346 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__SubSort__Group__2_in_rule__SubSort__Group__110349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__SubSort__Group__1__Impl10377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubSort__Group__2__Impl_in_rule__SubSort__Group__210408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubSort__SuperSortAssignment_2_in_rule__SubSort__Group__2__Impl10435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sort__Group__0__Impl_in_rule__Sort__Group__010471 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Sort__Group__1_in_rule__Sort__Group__010474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sort__Group__1__Impl_in_rule__Sort__Group__110532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sort__NameAssignment_1_in_rule__Sort__Group__1__Impl10559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__010593 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Term__Group__1_in_rule__Term__Group__010596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__110654 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Term__Group__2_in_rule__Term__Group__110657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__OperationSymbolAssignment_1_in_rule__Term__Group__1__Impl10684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__Group__2__Impl_in_rule__Term__Group__210714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__Group_2__0_in_rule__Term__Group__2__Impl10741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__Group_2__0__Impl_in_rule__Term__Group_2__010778 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__Term__Group_2__1_in_rule__Term__Group_2__010781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Term__Group_2__0__Impl10809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__Group_2__1__Impl_in_rule__Term__Group_2__110840 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__Term__Group_2__2_in_rule__Term__Group_2__110843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__SubtermsAssignment_2_1_in_rule__Term__Group_2__1__Impl10870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__Group_2__2__Impl_in_rule__Term__Group_2__210900 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__Term__Group_2__3_in_rule__Term__Group_2__210903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__Group_2_2__0_in_rule__Term__Group_2__2__Impl10930 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Term__Group_2__3__Impl_in_rule__Term__Group_2__310961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Term__Group_2__3__Impl10989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__Group_2_2__0__Impl_in_rule__Term__Group_2_2__011028 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__Term__Group_2_2__1_in_rule__Term__Group_2_2__011031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Term__Group_2_2__0__Impl11059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__Group_2_2__1__Impl_in_rule__Term__Group_2_2__111090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__SubtermsAssignment_2_2_1_in_rule__Term__Group_2_2__1__Impl11117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__011151 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__011154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__111212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__DeclarationAssignment_1_in_rule__Variable__Group__1__Impl11239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__011273 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__011276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__NameAssignment_0_in_rule__Operation__Group__0__Impl11303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__111333 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__111336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Operation__Group__1__Impl11364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__211395 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__211398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_2__0_in_rule__Operation__Group__2__Impl11425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__311456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__ReturnTypeAssignment_3_in_rule__Operation__Group__3__Impl11483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_2__0__Impl_in_rule__Operation__Group_2__011521 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_rule__Operation__Group_2__1_in_rule__Operation__Group_2__011524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__FormalParametersAssignment_2_0_in_rule__Operation__Group_2__0__Impl11551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_2__1__Impl_in_rule__Operation__Group_2__111581 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_rule__Operation__Group_2__2_in_rule__Operation__Group_2__111584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_2_1__0_in_rule__Operation__Group_2__1__Impl11611 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Operation__Group_2__2__Impl_in_rule__Operation__Group_2__211642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Operation__Group_2__2__Impl11670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_2_1__0__Impl_in_rule__Operation__Group_2_1__011707 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Operation__Group_2_1__1_in_rule__Operation__Group_2_1__011710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Operation__Group_2_1__0__Impl11738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_2_1__1__Impl_in_rule__Operation__Group_2_1__111769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__FormalParametersAssignment_2_1_1_in_rule__Operation__Group_2_1__1__Impl11796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleADT_in_rule__TransitionSystem__AdtAssignment_111835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerm_in_rule__TransitionSystem__InitialStateAssignment_411866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAuxiliary_in_rule__TransitionSystem__AuxiliaryAssignment_611897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_rule__TransitionSystem__TransitionsAssignment_811928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__NameAssignment_011959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNonVariableStrategy_in_rule__Transition__BodyAssignment_211990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Auxiliary__NameAssignment_012021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableStrategy_in_rule__Auxiliary__FormalParamsAssignment_1_112052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableStrategy_in_rule__Auxiliary__FormalParamsAssignment_1_2_112083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNonVariableStrategy_in_rule__Auxiliary__BodyAssignment_312114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__One__SAssignment_212145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__One__NAssignment_412176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__DeclaredStrategyInstance__DeclarationAssignment_112211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__DeclaredStrategyInstance__ActualParamsAssignment_3_012246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_112277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__Saturation__SAssignment_212308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Saturation__NAssignment_412339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__IfThenElse__S1Assignment_212370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__IfThenElse__S2Assignment_412401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__IfThenElse__S3Assignment_612432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRewriteRule_in_rule__SimpleStrategy__EquationsAssignment_112463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRewriteRule_in_rule__SimpleStrategy__EquationsAssignment_2_112494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Not__SAlternatives_2_0_in_rule__Not__SAssignment_212525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__Fixpoint__SAssignment_212558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__All__SAssignment_212589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__Choice__S1Assignment_212620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__Choice__S2Assignment_412651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__Union__S1Assignment_212682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__Union__S2Assignment_412713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__Sequence__S1Assignment_212744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__Sequence__S2Assignment_412775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__VariableStrategy__NameAssignment12806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ADT__NameAssignment_112837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignature_in_rule__ADT__SignatureAssignment_312868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEquation_in_rule__ADT__EquationsAssignment_4_112899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEquation_in_rule__ADT__EquationsAssignment_4_212930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__ADT__VariablesAssignment_5_112961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__ADT__VariablesAssignment_5_212992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleASort_in_rule__Signature__SortsAssignment_113023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleASort_in_rule__Signature__SortsAssignment_2_113054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_rule__Signature__GeneratorsAssignment_3_113085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_rule__Signature__GeneratorsAssignment_3_213116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_rule__Signature__OperationsAssignment_4_113147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_rule__Signature__OperationsAssignment_4_213178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_013209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__VariableDeclaration__SortAssignment_213244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleATerm_in_rule__Equation__LeftHandTermAssignment_013279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleATerm_in_rule__Equation__RightHandTermAssignment_213310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleATerm_in_rule__RewriteRule__LeftHandTermAssignment_013341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleATerm_in_rule__RewriteRule__RightHandTermAssignment_213372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__SubSort__NameAssignment_013403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__SubSort__SuperSortAssignment_213438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Sort__NameAssignment_113473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Term__OperationSymbolAssignment_113508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleATerm_in_rule__Term__SubtermsAssignment_2_113543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleATerm_in_rule__Term__SubtermsAssignment_2_2_113574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_TERMVAR_in_rule__Variable__DeclarationAssignment_113609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_013644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__FormalParametersAssignment_2_013679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__FormalParametersAssignment_2_1_113718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__ReturnTypeAssignment_313757 = new BitSet(new long[]{0x0000000000000002L});
    }


}