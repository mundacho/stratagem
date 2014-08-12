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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_TERMVAR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TransitionSystem'", "'initialState'", "'='", "'Strategies'", "'Transitions'", "'('", "')'", "','", "'One'", "'Saturation'", "'IfThenElse'", "'{'", "'}'", "'Not'", "'Fixpoint'", "'Choice'", "'Union'", "'Sequence'", "'Identity'", "'Fail'", "'ADT'", "'Signature'", "'Axioms'", "'Variables'", "'Sorts'", "'Generators'", "'Operations'", "':'", "'->'", "'<'"
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


    // $ANTLR start "entryRuleChoice"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:425:1: entryRuleChoice : ruleChoice EOF ;
    public final void entryRuleChoice() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:426:1: ( ruleChoice EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:427:1: ruleChoice EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleChoice_in_entryRuleChoice847);
            ruleChoice();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChoiceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChoice854); if (state.failed) return ;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:434:1: ruleChoice : ( ( rule__Choice__Group__0 ) ) ;
    public final void ruleChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:438:2: ( ( ( rule__Choice__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:439:1: ( ( rule__Choice__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:439:1: ( ( rule__Choice__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:440:1: ( rule__Choice__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:441:1: ( rule__Choice__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:441:2: rule__Choice__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__0_in_ruleChoice880);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:453:1: entryRuleUnion : ruleUnion EOF ;
    public final void entryRuleUnion() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:454:1: ( ruleUnion EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:455:1: ruleUnion EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnion_in_entryRuleUnion907);
            ruleUnion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnion914); if (state.failed) return ;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:462:1: ruleUnion : ( ( rule__Union__Group__0 ) ) ;
    public final void ruleUnion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:466:2: ( ( ( rule__Union__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:467:1: ( ( rule__Union__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:467:1: ( ( rule__Union__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:468:1: ( rule__Union__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:469:1: ( rule__Union__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:469:2: rule__Union__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__0_in_ruleUnion940);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:481:1: entryRuleSequence : ruleSequence EOF ;
    public final void entryRuleSequence() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:482:1: ( ruleSequence EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:483:1: ruleSequence EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSequence_in_entryRuleSequence967);
            ruleSequence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSequence974); if (state.failed) return ;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:490:1: ruleSequence : ( ( rule__Sequence__Group__0 ) ) ;
    public final void ruleSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:494:2: ( ( ( rule__Sequence__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:495:1: ( ( rule__Sequence__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:495:1: ( ( rule__Sequence__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:496:1: ( rule__Sequence__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:497:1: ( rule__Sequence__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:497:2: rule__Sequence__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__0_in_ruleSequence1000);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:509:1: entryRuleIdentity : ruleIdentity EOF ;
    public final void entryRuleIdentity() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:510:1: ( ruleIdentity EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:511:1: ruleIdentity EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentityRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdentity_in_entryRuleIdentity1027);
            ruleIdentity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentityRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdentity1034); if (state.failed) return ;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:518:1: ruleIdentity : ( ( rule__Identity__Group__0 ) ) ;
    public final void ruleIdentity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:522:2: ( ( ( rule__Identity__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:523:1: ( ( rule__Identity__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:523:1: ( ( rule__Identity__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:524:1: ( rule__Identity__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentityAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:525:1: ( rule__Identity__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:525:2: rule__Identity__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identity__Group__0_in_ruleIdentity1060);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:537:1: entryRuleFail : ruleFail EOF ;
    public final void entryRuleFail() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:538:1: ( ruleFail EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:539:1: ruleFail EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFailRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFail_in_entryRuleFail1087);
            ruleFail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFailRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFail1094); if (state.failed) return ;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:546:1: ruleFail : ( ( rule__Fail__Group__0 ) ) ;
    public final void ruleFail() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:550:2: ( ( ( rule__Fail__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:551:1: ( ( rule__Fail__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:551:1: ( ( rule__Fail__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:552:1: ( rule__Fail__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFailAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:553:1: ( rule__Fail__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:553:2: rule__Fail__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fail__Group__0_in_ruleFail1120);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:565:1: entryRuleVariableStrategy : ruleVariableStrategy EOF ;
    public final void entryRuleVariableStrategy() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:566:1: ( ruleVariableStrategy EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:567:1: ruleVariableStrategy EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableStrategyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableStrategy_in_entryRuleVariableStrategy1147);
            ruleVariableStrategy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableStrategyRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableStrategy1154); if (state.failed) return ;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:574:1: ruleVariableStrategy : ( ( rule__VariableStrategy__NameAssignment ) ) ;
    public final void ruleVariableStrategy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:578:2: ( ( ( rule__VariableStrategy__NameAssignment ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:579:1: ( ( rule__VariableStrategy__NameAssignment ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:579:1: ( ( rule__VariableStrategy__NameAssignment ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:580:1: ( rule__VariableStrategy__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableStrategyAccess().getNameAssignment()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:581:1: ( rule__VariableStrategy__NameAssignment )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:581:2: rule__VariableStrategy__NameAssignment
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableStrategy__NameAssignment_in_ruleVariableStrategy1180);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:593:1: entryRuleATerm : ruleATerm EOF ;
    public final void entryRuleATerm() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:594:1: ( ruleATerm EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:595:1: ruleATerm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getATermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleATerm_in_entryRuleATerm1207);
            ruleATerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getATermRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleATerm1214); if (state.failed) return ;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:602:1: ruleATerm : ( ( rule__ATerm__Alternatives ) ) ;
    public final void ruleATerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:606:2: ( ( ( rule__ATerm__Alternatives ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:607:1: ( ( rule__ATerm__Alternatives ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:607:1: ( ( rule__ATerm__Alternatives ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:608:1: ( rule__ATerm__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getATermAccess().getAlternatives()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:609:1: ( rule__ATerm__Alternatives )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:609:2: rule__ATerm__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ATerm__Alternatives_in_ruleATerm1240);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:621:1: entryRuleASort : ruleASort EOF ;
    public final void entryRuleASort() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:622:1: ( ruleASort EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:623:1: ruleASort EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getASortRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleASort_in_entryRuleASort1267);
            ruleASort();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getASortRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleASort1274); if (state.failed) return ;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:630:1: ruleASort : ( ( rule__ASort__Alternatives ) ) ;
    public final void ruleASort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:634:2: ( ( ( rule__ASort__Alternatives ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:635:1: ( ( rule__ASort__Alternatives ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:635:1: ( ( rule__ASort__Alternatives ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:636:1: ( rule__ASort__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getASortAccess().getAlternatives()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:637:1: ( rule__ASort__Alternatives )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:637:2: rule__ASort__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ASort__Alternatives_in_ruleASort1300);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:649:1: entryRuleADT : ruleADT EOF ;
    public final void entryRuleADT() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:650:1: ( ruleADT EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:651:1: ruleADT EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleADT_in_entryRuleADT1327);
            ruleADT();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getADTRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleADT1334); if (state.failed) return ;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:658:1: ruleADT : ( ( rule__ADT__Group__0 ) ) ;
    public final void ruleADT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:662:2: ( ( ( rule__ADT__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:663:1: ( ( rule__ADT__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:663:1: ( ( rule__ADT__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:664:1: ( rule__ADT__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:665:1: ( rule__ADT__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:665:2: rule__ADT__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__0_in_ruleADT1360);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:677:1: entryRuleSignature : ruleSignature EOF ;
    public final void entryRuleSignature() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:678:1: ( ruleSignature EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:679:1: ruleSignature EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSignature_in_entryRuleSignature1387);
            ruleSignature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSignatureRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSignature1394); if (state.failed) return ;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:686:1: ruleSignature : ( ( rule__Signature__Group__0 ) ) ;
    public final void ruleSignature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:690:2: ( ( ( rule__Signature__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:691:1: ( ( rule__Signature__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:691:1: ( ( rule__Signature__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:692:1: ( rule__Signature__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:693:1: ( rule__Signature__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:693:2: rule__Signature__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group__0_in_ruleSignature1420);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:705:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:706:1: ( ruleVariableDeclaration EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:707:1: ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1447);
            ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableDeclaration1454); if (state.failed) return ;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:714:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:718:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:719:1: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:719:1: ( ( rule__VariableDeclaration__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:720:1: ( rule__VariableDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:721:1: ( rule__VariableDeclaration__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:721:2: rule__VariableDeclaration__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableDeclaration__Group__0_in_ruleVariableDeclaration1480);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:733:1: entryRuleEquation : ruleEquation EOF ;
    public final void entryRuleEquation() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:734:1: ( ruleEquation EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:735:1: ruleEquation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEquation_in_entryRuleEquation1507);
            ruleEquation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEquation1514); if (state.failed) return ;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:742:1: ruleEquation : ( ( rule__Equation__Group__0 ) ) ;
    public final void ruleEquation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:746:2: ( ( ( rule__Equation__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:747:1: ( ( rule__Equation__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:747:1: ( ( rule__Equation__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:748:1: ( rule__Equation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:749:1: ( rule__Equation__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:749:2: rule__Equation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equation__Group__0_in_ruleEquation1540);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:761:1: entryRuleRewriteRule : ruleRewriteRule EOF ;
    public final void entryRuleRewriteRule() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:762:1: ( ruleRewriteRule EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:763:1: ruleRewriteRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRewriteRuleRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRewriteRule_in_entryRuleRewriteRule1567);
            ruleRewriteRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRewriteRuleRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRewriteRule1574); if (state.failed) return ;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:770:1: ruleRewriteRule : ( ( rule__RewriteRule__Group__0 ) ) ;
    public final void ruleRewriteRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:774:2: ( ( ( rule__RewriteRule__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:775:1: ( ( rule__RewriteRule__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:775:1: ( ( rule__RewriteRule__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:776:1: ( rule__RewriteRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRewriteRuleAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:777:1: ( rule__RewriteRule__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:777:2: rule__RewriteRule__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RewriteRule__Group__0_in_ruleRewriteRule1600);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:789:1: entryRuleSubSort : ruleSubSort EOF ;
    public final void entryRuleSubSort() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:790:1: ( ruleSubSort EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:791:1: ruleSubSort EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubSortRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubSort_in_entryRuleSubSort1627);
            ruleSubSort();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubSortRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubSort1634); if (state.failed) return ;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:798:1: ruleSubSort : ( ( rule__SubSort__Group__0 ) ) ;
    public final void ruleSubSort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:802:2: ( ( ( rule__SubSort__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:803:1: ( ( rule__SubSort__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:803:1: ( ( rule__SubSort__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:804:1: ( rule__SubSort__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubSortAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:805:1: ( rule__SubSort__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:805:2: rule__SubSort__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubSort__Group__0_in_ruleSubSort1660);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:817:1: entryRuleSort : ruleSort EOF ;
    public final void entryRuleSort() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:818:1: ( ruleSort EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:819:1: ruleSort EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSortRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSort_in_entryRuleSort1687);
            ruleSort();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSortRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSort1694); if (state.failed) return ;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:826:1: ruleSort : ( ( rule__Sort__Group__0 ) ) ;
    public final void ruleSort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:830:2: ( ( ( rule__Sort__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:831:1: ( ( rule__Sort__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:831:1: ( ( rule__Sort__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:832:1: ( rule__Sort__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSortAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:833:1: ( rule__Sort__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:833:2: rule__Sort__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sort__Group__0_in_ruleSort1720);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:845:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:846:1: ( ruleTerm EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:847:1: ruleTerm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTerm_in_entryRuleTerm1747);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerm1754); if (state.failed) return ;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:854:1: ruleTerm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:858:2: ( ( ( rule__Term__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:859:1: ( ( rule__Term__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:859:1: ( ( rule__Term__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:860:1: ( rule__Term__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:861:1: ( rule__Term__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:861:2: rule__Term__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group__0_in_ruleTerm1780);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:873:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:874:1: ( ruleVariable EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:875:1: ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable1807);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable1814); if (state.failed) return ;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:882:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:886:2: ( ( ( rule__Variable__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:887:1: ( ( rule__Variable__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:887:1: ( ( rule__Variable__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:888:1: ( rule__Variable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:889:1: ( rule__Variable__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:889:2: rule__Variable__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__0_in_ruleVariable1840);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:901:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:902:1: ( ruleOperation EOF )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:903:1: ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_entryRuleOperation1867);
            ruleOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperation1874); if (state.failed) return ;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:910:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:914:2: ( ( ( rule__Operation__Group__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:915:1: ( ( rule__Operation__Group__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:915:1: ( ( rule__Operation__Group__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:916:1: ( rule__Operation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:917:1: ( rule__Operation__Group__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:917:2: rule__Operation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__0_in_ruleOperation1900);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:929:1: rule__Strategy__Alternatives : ( ( ruleNonVariableStrategy ) | ( ruleVariableStrategy ) );
    public final void rule__Strategy__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:933:1: ( ( ruleNonVariableStrategy ) | ( ruleVariableStrategy ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=20 && LA1_0<=23)||(LA1_0>=25 && LA1_0<=31)) ) {
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:934:1: ( ruleNonVariableStrategy )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:934:1: ( ruleNonVariableStrategy )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:935:1: ruleNonVariableStrategy
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStrategyAccess().getNonVariableStrategyParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNonVariableStrategy_in_rule__Strategy__Alternatives1936);
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:940:6: ( ruleVariableStrategy )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:940:6: ( ruleVariableStrategy )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:941:1: ruleVariableStrategy
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStrategyAccess().getVariableStrategyParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariableStrategy_in_rule__Strategy__Alternatives1953);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:951:1: rule__NonVariableStrategy__Alternatives : ( ( ( rulePredefStrats ) ) | ( ruleDeclaredStrategyInstance ) );
    public final void rule__NonVariableStrategy__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:955:1: ( ( ( rulePredefStrats ) ) | ( ruleDeclaredStrategyInstance ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=20 && LA2_0<=23)||(LA2_0>=25 && LA2_0<=31)) ) {
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:956:1: ( ( rulePredefStrats ) )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:956:1: ( ( rulePredefStrats ) )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:957:1: ( rulePredefStrats )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNonVariableStrategyAccess().getPredefStratsParserRuleCall_0()); 
                    }
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:958:1: ( rulePredefStrats )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:958:3: rulePredefStrats
                    {
                    pushFollow(FollowSets000.FOLLOW_rulePredefStrats_in_rule__NonVariableStrategy__Alternatives1986);
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:962:6: ( ruleDeclaredStrategyInstance )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:962:6: ( ruleDeclaredStrategyInstance )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:963:1: ruleDeclaredStrategyInstance
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNonVariableStrategyAccess().getDeclaredStrategyInstanceParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaredStrategyInstance_in_rule__NonVariableStrategy__Alternatives2004);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:973:1: rule__PredefStrats__Alternatives : ( ( ruleIdentity ) | ( ruleFail ) | ( ruleChoice ) | ( ruleSequence ) | ( ruleFixpoint ) | ( ruleIfThenElse ) | ( ruleNot ) | ( ruleSimpleStrategy ) | ( ruleOne ) | ( ruleSaturation ) | ( ruleUnion ) );
    public final void rule__PredefStrats__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:977:1: ( ( ruleIdentity ) | ( ruleFail ) | ( ruleChoice ) | ( ruleSequence ) | ( ruleFixpoint ) | ( ruleIfThenElse ) | ( ruleNot ) | ( ruleSimpleStrategy ) | ( ruleOne ) | ( ruleSaturation ) | ( ruleUnion ) )
            int alt3=11;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt3=1;
                }
                break;
            case 31:
                {
                alt3=2;
                }
                break;
            case 27:
                {
                alt3=3;
                }
                break;
            case 29:
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
            case 28:
                {
                alt3=11;
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:978:1: ( ruleIdentity )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:978:1: ( ruleIdentity )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:979:1: ruleIdentity
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredefStratsAccess().getIdentityParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIdentity_in_rule__PredefStrats__Alternatives2036);
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:984:6: ( ruleFail )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:984:6: ( ruleFail )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:985:1: ruleFail
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredefStratsAccess().getFailParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFail_in_rule__PredefStrats__Alternatives2053);
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:990:6: ( ruleChoice )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:990:6: ( ruleChoice )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:991:1: ruleChoice
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredefStratsAccess().getChoiceParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleChoice_in_rule__PredefStrats__Alternatives2070);
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:996:6: ( ruleSequence )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:996:6: ( ruleSequence )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:997:1: ruleSequence
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredefStratsAccess().getSequenceParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSequence_in_rule__PredefStrats__Alternatives2087);
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1002:6: ( ruleFixpoint )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1002:6: ( ruleFixpoint )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1003:1: ruleFixpoint
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredefStratsAccess().getFixpointParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFixpoint_in_rule__PredefStrats__Alternatives2104);
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1008:6: ( ruleIfThenElse )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1008:6: ( ruleIfThenElse )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1009:1: ruleIfThenElse
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredefStratsAccess().getIfThenElseParserRuleCall_5()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIfThenElse_in_rule__PredefStrats__Alternatives2121);
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1014:6: ( ruleNot )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1014:6: ( ruleNot )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1015:1: ruleNot
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredefStratsAccess().getNotParserRuleCall_6()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNot_in_rule__PredefStrats__Alternatives2138);
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1020:6: ( ruleSimpleStrategy )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1020:6: ( ruleSimpleStrategy )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1021:1: ruleSimpleStrategy
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredefStratsAccess().getSimpleStrategyParserRuleCall_7()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleStrategy_in_rule__PredefStrats__Alternatives2155);
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1026:6: ( ruleOne )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1026:6: ( ruleOne )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1027:1: ruleOne
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredefStratsAccess().getOneParserRuleCall_8()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleOne_in_rule__PredefStrats__Alternatives2172);
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1032:6: ( ruleSaturation )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1032:6: ( ruleSaturation )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1033:1: ruleSaturation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredefStratsAccess().getSaturationParserRuleCall_9()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSaturation_in_rule__PredefStrats__Alternatives2189);
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1038:6: ( ruleUnion )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1038:6: ( ruleUnion )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1039:1: ruleUnion
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredefStratsAccess().getUnionParserRuleCall_10()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnion_in_rule__PredefStrats__Alternatives2206);
                    ruleUnion();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredefStratsAccess().getUnionParserRuleCall_10()); 
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1049:1: rule__Not__SAlternatives_2_0 : ( ( ruleSimpleStrategy ) | ( ruleDeclaredStrategyInstance ) | ( ruleVariableStrategy ) );
    public final void rule__Not__SAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1053:1: ( ( ruleSimpleStrategy ) | ( ruleDeclaredStrategyInstance ) | ( ruleVariableStrategy ) )
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1054:1: ( ruleSimpleStrategy )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1054:1: ( ruleSimpleStrategy )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1055:1: ruleSimpleStrategy
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotAccess().getSSimpleStrategyParserRuleCall_2_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSimpleStrategy_in_rule__Not__SAlternatives_2_02238);
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1060:6: ( ruleDeclaredStrategyInstance )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1060:6: ( ruleDeclaredStrategyInstance )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1061:1: ruleDeclaredStrategyInstance
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotAccess().getSDeclaredStrategyInstanceParserRuleCall_2_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDeclaredStrategyInstance_in_rule__Not__SAlternatives_2_02255);
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1066:6: ( ruleVariableStrategy )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1066:6: ( ruleVariableStrategy )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1067:1: ruleVariableStrategy
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNotAccess().getSVariableStrategyParserRuleCall_2_0_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariableStrategy_in_rule__Not__SAlternatives_2_02272);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1077:1: rule__ATerm__Alternatives : ( ( ruleTerm ) | ( ruleVariable ) );
    public final void rule__ATerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1081:1: ( ( ruleTerm ) | ( ruleVariable ) )
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1082:1: ( ruleTerm )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1082:1: ( ruleTerm )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1083:1: ruleTerm
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getATermAccess().getTermParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTerm_in_rule__ATerm__Alternatives2304);
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1088:6: ( ruleVariable )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1088:6: ( ruleVariable )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1089:1: ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getATermAccess().getVariableParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_rule__ATerm__Alternatives2321);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1099:1: rule__ASort__Alternatives : ( ( ruleSubSort ) | ( ruleSort ) );
    public final void rule__ASort__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1103:1: ( ( ruleSubSort ) | ( ruleSort ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==41) ) {
                    alt6=1;
                }
                else if ( (LA6_1==EOF||LA6_1==19||LA6_1==37) ) {
                    alt6=2;
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1104:1: ( ruleSubSort )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1104:1: ( ruleSubSort )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1105:1: ruleSubSort
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getASortAccess().getSubSortParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSubSort_in_rule__ASort__Alternatives2353);
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1110:6: ( ruleSort )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1110:6: ( ruleSort )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1111:1: ruleSort
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getASortAccess().getSortParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSort_in_rule__ASort__Alternatives2370);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1123:1: rule__TransitionSystem__Group__0 : rule__TransitionSystem__Group__0__Impl rule__TransitionSystem__Group__1 ;
    public final void rule__TransitionSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1127:1: ( rule__TransitionSystem__Group__0__Impl rule__TransitionSystem__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1128:2: rule__TransitionSystem__Group__0__Impl rule__TransitionSystem__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__0__Impl_in_rule__TransitionSystem__Group__02400);
            rule__TransitionSystem__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__1_in_rule__TransitionSystem__Group__02403);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1135:1: rule__TransitionSystem__Group__0__Impl : ( 'TransitionSystem' ) ;
    public final void rule__TransitionSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1139:1: ( ( 'TransitionSystem' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1140:1: ( 'TransitionSystem' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1140:1: ( 'TransitionSystem' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1141:1: 'TransitionSystem'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getTransitionSystemKeyword_0()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__TransitionSystem__Group__0__Impl2431); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1154:1: rule__TransitionSystem__Group__1 : rule__TransitionSystem__Group__1__Impl rule__TransitionSystem__Group__2 ;
    public final void rule__TransitionSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1158:1: ( rule__TransitionSystem__Group__1__Impl rule__TransitionSystem__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1159:2: rule__TransitionSystem__Group__1__Impl rule__TransitionSystem__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__1__Impl_in_rule__TransitionSystem__Group__12462);
            rule__TransitionSystem__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__2_in_rule__TransitionSystem__Group__12465);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1166:1: rule__TransitionSystem__Group__1__Impl : ( ( rule__TransitionSystem__AdtAssignment_1 ) ) ;
    public final void rule__TransitionSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1170:1: ( ( ( rule__TransitionSystem__AdtAssignment_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1171:1: ( ( rule__TransitionSystem__AdtAssignment_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1171:1: ( ( rule__TransitionSystem__AdtAssignment_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1172:1: ( rule__TransitionSystem__AdtAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getAdtAssignment_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1173:1: ( rule__TransitionSystem__AdtAssignment_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1173:2: rule__TransitionSystem__AdtAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__AdtAssignment_1_in_rule__TransitionSystem__Group__1__Impl2492);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1183:1: rule__TransitionSystem__Group__2 : rule__TransitionSystem__Group__2__Impl rule__TransitionSystem__Group__3 ;
    public final void rule__TransitionSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1187:1: ( rule__TransitionSystem__Group__2__Impl rule__TransitionSystem__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1188:2: rule__TransitionSystem__Group__2__Impl rule__TransitionSystem__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__2__Impl_in_rule__TransitionSystem__Group__22522);
            rule__TransitionSystem__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__3_in_rule__TransitionSystem__Group__22525);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1195:1: rule__TransitionSystem__Group__2__Impl : ( 'initialState' ) ;
    public final void rule__TransitionSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1199:1: ( ( 'initialState' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1200:1: ( 'initialState' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1200:1: ( 'initialState' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1201:1: 'initialState'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getInitialStateKeyword_2()); 
            }
            match(input,13,FollowSets000.FOLLOW_13_in_rule__TransitionSystem__Group__2__Impl2553); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1214:1: rule__TransitionSystem__Group__3 : rule__TransitionSystem__Group__3__Impl rule__TransitionSystem__Group__4 ;
    public final void rule__TransitionSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1218:1: ( rule__TransitionSystem__Group__3__Impl rule__TransitionSystem__Group__4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1219:2: rule__TransitionSystem__Group__3__Impl rule__TransitionSystem__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__3__Impl_in_rule__TransitionSystem__Group__32584);
            rule__TransitionSystem__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__4_in_rule__TransitionSystem__Group__32587);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1226:1: rule__TransitionSystem__Group__3__Impl : ( '=' ) ;
    public final void rule__TransitionSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1230:1: ( ( '=' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1231:1: ( '=' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1231:1: ( '=' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1232:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getEqualsSignKeyword_3()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__TransitionSystem__Group__3__Impl2615); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1245:1: rule__TransitionSystem__Group__4 : rule__TransitionSystem__Group__4__Impl rule__TransitionSystem__Group__5 ;
    public final void rule__TransitionSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1249:1: ( rule__TransitionSystem__Group__4__Impl rule__TransitionSystem__Group__5 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1250:2: rule__TransitionSystem__Group__4__Impl rule__TransitionSystem__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__4__Impl_in_rule__TransitionSystem__Group__42646);
            rule__TransitionSystem__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__5_in_rule__TransitionSystem__Group__42649);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1257:1: rule__TransitionSystem__Group__4__Impl : ( ( rule__TransitionSystem__InitialStateAssignment_4 ) ) ;
    public final void rule__TransitionSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1261:1: ( ( ( rule__TransitionSystem__InitialStateAssignment_4 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1262:1: ( ( rule__TransitionSystem__InitialStateAssignment_4 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1262:1: ( ( rule__TransitionSystem__InitialStateAssignment_4 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1263:1: ( rule__TransitionSystem__InitialStateAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getInitialStateAssignment_4()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1264:1: ( rule__TransitionSystem__InitialStateAssignment_4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1264:2: rule__TransitionSystem__InitialStateAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__InitialStateAssignment_4_in_rule__TransitionSystem__Group__4__Impl2676);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1274:1: rule__TransitionSystem__Group__5 : rule__TransitionSystem__Group__5__Impl rule__TransitionSystem__Group__6 ;
    public final void rule__TransitionSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1278:1: ( rule__TransitionSystem__Group__5__Impl rule__TransitionSystem__Group__6 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1279:2: rule__TransitionSystem__Group__5__Impl rule__TransitionSystem__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__5__Impl_in_rule__TransitionSystem__Group__52706);
            rule__TransitionSystem__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__6_in_rule__TransitionSystem__Group__52709);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1286:1: rule__TransitionSystem__Group__5__Impl : ( 'Strategies' ) ;
    public final void rule__TransitionSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1290:1: ( ( 'Strategies' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1291:1: ( 'Strategies' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1291:1: ( 'Strategies' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1292:1: 'Strategies'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getStrategiesKeyword_5()); 
            }
            match(input,15,FollowSets000.FOLLOW_15_in_rule__TransitionSystem__Group__5__Impl2737); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1305:1: rule__TransitionSystem__Group__6 : rule__TransitionSystem__Group__6__Impl rule__TransitionSystem__Group__7 ;
    public final void rule__TransitionSystem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1309:1: ( rule__TransitionSystem__Group__6__Impl rule__TransitionSystem__Group__7 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1310:2: rule__TransitionSystem__Group__6__Impl rule__TransitionSystem__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__6__Impl_in_rule__TransitionSystem__Group__62768);
            rule__TransitionSystem__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__7_in_rule__TransitionSystem__Group__62771);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1317:1: rule__TransitionSystem__Group__6__Impl : ( ( rule__TransitionSystem__AuxiliaryAssignment_6 )* ) ;
    public final void rule__TransitionSystem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1321:1: ( ( ( rule__TransitionSystem__AuxiliaryAssignment_6 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1322:1: ( ( rule__TransitionSystem__AuxiliaryAssignment_6 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1322:1: ( ( rule__TransitionSystem__AuxiliaryAssignment_6 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1323:1: ( rule__TransitionSystem__AuxiliaryAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getAuxiliaryAssignment_6()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1324:1: ( rule__TransitionSystem__AuxiliaryAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1324:2: rule__TransitionSystem__AuxiliaryAssignment_6
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__AuxiliaryAssignment_6_in_rule__TransitionSystem__Group__6__Impl2798);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1334:1: rule__TransitionSystem__Group__7 : rule__TransitionSystem__Group__7__Impl rule__TransitionSystem__Group__8 ;
    public final void rule__TransitionSystem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1338:1: ( rule__TransitionSystem__Group__7__Impl rule__TransitionSystem__Group__8 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1339:2: rule__TransitionSystem__Group__7__Impl rule__TransitionSystem__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__7__Impl_in_rule__TransitionSystem__Group__72829);
            rule__TransitionSystem__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__8_in_rule__TransitionSystem__Group__72832);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1346:1: rule__TransitionSystem__Group__7__Impl : ( 'Transitions' ) ;
    public final void rule__TransitionSystem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1350:1: ( ( 'Transitions' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1351:1: ( 'Transitions' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1351:1: ( 'Transitions' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1352:1: 'Transitions'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getTransitionsKeyword_7()); 
            }
            match(input,16,FollowSets000.FOLLOW_16_in_rule__TransitionSystem__Group__7__Impl2860); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1365:1: rule__TransitionSystem__Group__8 : rule__TransitionSystem__Group__8__Impl ;
    public final void rule__TransitionSystem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1369:1: ( rule__TransitionSystem__Group__8__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1370:2: rule__TransitionSystem__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__8__Impl_in_rule__TransitionSystem__Group__82891);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1376:1: rule__TransitionSystem__Group__8__Impl : ( ( rule__TransitionSystem__TransitionsAssignment_8 )* ) ;
    public final void rule__TransitionSystem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1380:1: ( ( ( rule__TransitionSystem__TransitionsAssignment_8 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1381:1: ( ( rule__TransitionSystem__TransitionsAssignment_8 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1381:1: ( ( rule__TransitionSystem__TransitionsAssignment_8 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1382:1: ( rule__TransitionSystem__TransitionsAssignment_8 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getTransitionsAssignment_8()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1383:1: ( rule__TransitionSystem__TransitionsAssignment_8 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1383:2: rule__TransitionSystem__TransitionsAssignment_8
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__TransitionsAssignment_8_in_rule__TransitionSystem__Group__8__Impl2918);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1411:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1415:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1416:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__02967);
            rule__Transition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__02970);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1423:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__NameAssignment_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1427:1: ( ( ( rule__Transition__NameAssignment_0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1428:1: ( ( rule__Transition__NameAssignment_0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1428:1: ( ( rule__Transition__NameAssignment_0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1429:1: ( rule__Transition__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getNameAssignment_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1430:1: ( rule__Transition__NameAssignment_0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1430:2: rule__Transition__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__NameAssignment_0_in_rule__Transition__Group__0__Impl2997);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1440:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1444:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1445:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__13027);
            rule__Transition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__13030);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1452:1: rule__Transition__Group__1__Impl : ( '=' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1456:1: ( ( '=' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1457:1: ( '=' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1457:1: ( '=' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1458:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getEqualsSignKeyword_1()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Transition__Group__1__Impl3058); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1471:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1475:1: ( rule__Transition__Group__2__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1476:2: rule__Transition__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__23089);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1482:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__BodyAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1486:1: ( ( ( rule__Transition__BodyAssignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1487:1: ( ( rule__Transition__BodyAssignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1487:1: ( ( rule__Transition__BodyAssignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1488:1: ( rule__Transition__BodyAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getBodyAssignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1489:1: ( rule__Transition__BodyAssignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1489:2: rule__Transition__BodyAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__BodyAssignment_2_in_rule__Transition__Group__2__Impl3116);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1505:1: rule__Auxiliary__Group__0 : rule__Auxiliary__Group__0__Impl rule__Auxiliary__Group__1 ;
    public final void rule__Auxiliary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1509:1: ( rule__Auxiliary__Group__0__Impl rule__Auxiliary__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1510:2: rule__Auxiliary__Group__0__Impl rule__Auxiliary__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group__0__Impl_in_rule__Auxiliary__Group__03152);
            rule__Auxiliary__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group__1_in_rule__Auxiliary__Group__03155);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1517:1: rule__Auxiliary__Group__0__Impl : ( ( rule__Auxiliary__NameAssignment_0 ) ) ;
    public final void rule__Auxiliary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1521:1: ( ( ( rule__Auxiliary__NameAssignment_0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1522:1: ( ( rule__Auxiliary__NameAssignment_0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1522:1: ( ( rule__Auxiliary__NameAssignment_0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1523:1: ( rule__Auxiliary__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getNameAssignment_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1524:1: ( rule__Auxiliary__NameAssignment_0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1524:2: rule__Auxiliary__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__NameAssignment_0_in_rule__Auxiliary__Group__0__Impl3182);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1534:1: rule__Auxiliary__Group__1 : rule__Auxiliary__Group__1__Impl rule__Auxiliary__Group__2 ;
    public final void rule__Auxiliary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1538:1: ( rule__Auxiliary__Group__1__Impl rule__Auxiliary__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1539:2: rule__Auxiliary__Group__1__Impl rule__Auxiliary__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group__1__Impl_in_rule__Auxiliary__Group__13212);
            rule__Auxiliary__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group__2_in_rule__Auxiliary__Group__13215);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1546:1: rule__Auxiliary__Group__1__Impl : ( ( rule__Auxiliary__Group_1__0 )? ) ;
    public final void rule__Auxiliary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1550:1: ( ( ( rule__Auxiliary__Group_1__0 )? ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1551:1: ( ( rule__Auxiliary__Group_1__0 )? )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1551:1: ( ( rule__Auxiliary__Group_1__0 )? )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1552:1: ( rule__Auxiliary__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getGroup_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1553:1: ( rule__Auxiliary__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1553:2: rule__Auxiliary__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1__0_in_rule__Auxiliary__Group__1__Impl3242);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1563:1: rule__Auxiliary__Group__2 : rule__Auxiliary__Group__2__Impl rule__Auxiliary__Group__3 ;
    public final void rule__Auxiliary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1567:1: ( rule__Auxiliary__Group__2__Impl rule__Auxiliary__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1568:2: rule__Auxiliary__Group__2__Impl rule__Auxiliary__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group__2__Impl_in_rule__Auxiliary__Group__23273);
            rule__Auxiliary__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group__3_in_rule__Auxiliary__Group__23276);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1575:1: rule__Auxiliary__Group__2__Impl : ( '=' ) ;
    public final void rule__Auxiliary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1579:1: ( ( '=' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1580:1: ( '=' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1580:1: ( '=' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1581:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getEqualsSignKeyword_2()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Auxiliary__Group__2__Impl3304); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1594:1: rule__Auxiliary__Group__3 : rule__Auxiliary__Group__3__Impl ;
    public final void rule__Auxiliary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1598:1: ( rule__Auxiliary__Group__3__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1599:2: rule__Auxiliary__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group__3__Impl_in_rule__Auxiliary__Group__33335);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1605:1: rule__Auxiliary__Group__3__Impl : ( ( rule__Auxiliary__BodyAssignment_3 ) ) ;
    public final void rule__Auxiliary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1609:1: ( ( ( rule__Auxiliary__BodyAssignment_3 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1610:1: ( ( rule__Auxiliary__BodyAssignment_3 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1610:1: ( ( rule__Auxiliary__BodyAssignment_3 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1611:1: ( rule__Auxiliary__BodyAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getBodyAssignment_3()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1612:1: ( rule__Auxiliary__BodyAssignment_3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1612:2: rule__Auxiliary__BodyAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__BodyAssignment_3_in_rule__Auxiliary__Group__3__Impl3362);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1630:1: rule__Auxiliary__Group_1__0 : rule__Auxiliary__Group_1__0__Impl rule__Auxiliary__Group_1__1 ;
    public final void rule__Auxiliary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1634:1: ( rule__Auxiliary__Group_1__0__Impl rule__Auxiliary__Group_1__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1635:2: rule__Auxiliary__Group_1__0__Impl rule__Auxiliary__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1__0__Impl_in_rule__Auxiliary__Group_1__03400);
            rule__Auxiliary__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1__1_in_rule__Auxiliary__Group_1__03403);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1642:1: rule__Auxiliary__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Auxiliary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1646:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1647:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1647:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1648:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Auxiliary__Group_1__0__Impl3431); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1661:1: rule__Auxiliary__Group_1__1 : rule__Auxiliary__Group_1__1__Impl rule__Auxiliary__Group_1__2 ;
    public final void rule__Auxiliary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1665:1: ( rule__Auxiliary__Group_1__1__Impl rule__Auxiliary__Group_1__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1666:2: rule__Auxiliary__Group_1__1__Impl rule__Auxiliary__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1__1__Impl_in_rule__Auxiliary__Group_1__13462);
            rule__Auxiliary__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1__2_in_rule__Auxiliary__Group_1__13465);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1673:1: rule__Auxiliary__Group_1__1__Impl : ( ( rule__Auxiliary__FormalParamsAssignment_1_1 ) ) ;
    public final void rule__Auxiliary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1677:1: ( ( ( rule__Auxiliary__FormalParamsAssignment_1_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1678:1: ( ( rule__Auxiliary__FormalParamsAssignment_1_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1678:1: ( ( rule__Auxiliary__FormalParamsAssignment_1_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1679:1: ( rule__Auxiliary__FormalParamsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getFormalParamsAssignment_1_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1680:1: ( rule__Auxiliary__FormalParamsAssignment_1_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1680:2: rule__Auxiliary__FormalParamsAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__FormalParamsAssignment_1_1_in_rule__Auxiliary__Group_1__1__Impl3492);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1690:1: rule__Auxiliary__Group_1__2 : rule__Auxiliary__Group_1__2__Impl rule__Auxiliary__Group_1__3 ;
    public final void rule__Auxiliary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1694:1: ( rule__Auxiliary__Group_1__2__Impl rule__Auxiliary__Group_1__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1695:2: rule__Auxiliary__Group_1__2__Impl rule__Auxiliary__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1__2__Impl_in_rule__Auxiliary__Group_1__23522);
            rule__Auxiliary__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1__3_in_rule__Auxiliary__Group_1__23525);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1702:1: rule__Auxiliary__Group_1__2__Impl : ( ( rule__Auxiliary__Group_1_2__0 )* ) ;
    public final void rule__Auxiliary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1706:1: ( ( ( rule__Auxiliary__Group_1_2__0 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1707:1: ( ( rule__Auxiliary__Group_1_2__0 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1707:1: ( ( rule__Auxiliary__Group_1_2__0 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1708:1: ( rule__Auxiliary__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getGroup_1_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1709:1: ( rule__Auxiliary__Group_1_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1709:2: rule__Auxiliary__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1_2__0_in_rule__Auxiliary__Group_1__2__Impl3552);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1719:1: rule__Auxiliary__Group_1__3 : rule__Auxiliary__Group_1__3__Impl ;
    public final void rule__Auxiliary__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1723:1: ( rule__Auxiliary__Group_1__3__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1724:2: rule__Auxiliary__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1__3__Impl_in_rule__Auxiliary__Group_1__33583);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1730:1: rule__Auxiliary__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Auxiliary__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1734:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1735:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1735:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1736:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getRightParenthesisKeyword_1_3()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Auxiliary__Group_1__3__Impl3611); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1757:1: rule__Auxiliary__Group_1_2__0 : rule__Auxiliary__Group_1_2__0__Impl rule__Auxiliary__Group_1_2__1 ;
    public final void rule__Auxiliary__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1761:1: ( rule__Auxiliary__Group_1_2__0__Impl rule__Auxiliary__Group_1_2__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1762:2: rule__Auxiliary__Group_1_2__0__Impl rule__Auxiliary__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1_2__0__Impl_in_rule__Auxiliary__Group_1_2__03650);
            rule__Auxiliary__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1_2__1_in_rule__Auxiliary__Group_1_2__03653);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1769:1: rule__Auxiliary__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Auxiliary__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1773:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1774:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1774:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1775:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getCommaKeyword_1_2_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Auxiliary__Group_1_2__0__Impl3681); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1788:1: rule__Auxiliary__Group_1_2__1 : rule__Auxiliary__Group_1_2__1__Impl ;
    public final void rule__Auxiliary__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1792:1: ( rule__Auxiliary__Group_1_2__1__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1793:2: rule__Auxiliary__Group_1_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1_2__1__Impl_in_rule__Auxiliary__Group_1_2__13712);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1799:1: rule__Auxiliary__Group_1_2__1__Impl : ( ( rule__Auxiliary__FormalParamsAssignment_1_2_1 ) ) ;
    public final void rule__Auxiliary__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1803:1: ( ( ( rule__Auxiliary__FormalParamsAssignment_1_2_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1804:1: ( ( rule__Auxiliary__FormalParamsAssignment_1_2_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1804:1: ( ( rule__Auxiliary__FormalParamsAssignment_1_2_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1805:1: ( rule__Auxiliary__FormalParamsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getFormalParamsAssignment_1_2_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1806:1: ( rule__Auxiliary__FormalParamsAssignment_1_2_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1806:2: rule__Auxiliary__FormalParamsAssignment_1_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__FormalParamsAssignment_1_2_1_in_rule__Auxiliary__Group_1_2__1__Impl3739);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1820:1: rule__One__Group__0 : rule__One__Group__0__Impl rule__One__Group__1 ;
    public final void rule__One__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1824:1: ( rule__One__Group__0__Impl rule__One__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1825:2: rule__One__Group__0__Impl rule__One__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__0__Impl_in_rule__One__Group__03773);
            rule__One__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__1_in_rule__One__Group__03776);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1832:1: rule__One__Group__0__Impl : ( 'One' ) ;
    public final void rule__One__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1836:1: ( ( 'One' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1837:1: ( 'One' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1837:1: ( 'One' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1838:1: 'One'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneAccess().getOneKeyword_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__One__Group__0__Impl3804); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1851:1: rule__One__Group__1 : rule__One__Group__1__Impl rule__One__Group__2 ;
    public final void rule__One__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1855:1: ( rule__One__Group__1__Impl rule__One__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1856:2: rule__One__Group__1__Impl rule__One__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__1__Impl_in_rule__One__Group__13835);
            rule__One__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__2_in_rule__One__Group__13838);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1863:1: rule__One__Group__1__Impl : ( '(' ) ;
    public final void rule__One__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1867:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1868:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1868:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1869:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__One__Group__1__Impl3866); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1882:1: rule__One__Group__2 : rule__One__Group__2__Impl rule__One__Group__3 ;
    public final void rule__One__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1886:1: ( rule__One__Group__2__Impl rule__One__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1887:2: rule__One__Group__2__Impl rule__One__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__2__Impl_in_rule__One__Group__23897);
            rule__One__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__3_in_rule__One__Group__23900);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1894:1: rule__One__Group__2__Impl : ( ( rule__One__SAssignment_2 ) ) ;
    public final void rule__One__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1898:1: ( ( ( rule__One__SAssignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1899:1: ( ( rule__One__SAssignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1899:1: ( ( rule__One__SAssignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1900:1: ( rule__One__SAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneAccess().getSAssignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1901:1: ( rule__One__SAssignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1901:2: rule__One__SAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__One__SAssignment_2_in_rule__One__Group__2__Impl3927);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1911:1: rule__One__Group__3 : rule__One__Group__3__Impl rule__One__Group__4 ;
    public final void rule__One__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1915:1: ( rule__One__Group__3__Impl rule__One__Group__4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1916:2: rule__One__Group__3__Impl rule__One__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__3__Impl_in_rule__One__Group__33957);
            rule__One__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__4_in_rule__One__Group__33960);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1923:1: rule__One__Group__3__Impl : ( ',' ) ;
    public final void rule__One__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1927:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1928:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1928:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1929:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneAccess().getCommaKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__One__Group__3__Impl3988); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1942:1: rule__One__Group__4 : rule__One__Group__4__Impl rule__One__Group__5 ;
    public final void rule__One__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1946:1: ( rule__One__Group__4__Impl rule__One__Group__5 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1947:2: rule__One__Group__4__Impl rule__One__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__4__Impl_in_rule__One__Group__44019);
            rule__One__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__5_in_rule__One__Group__44022);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1954:1: rule__One__Group__4__Impl : ( ( rule__One__NAssignment_4 ) ) ;
    public final void rule__One__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1958:1: ( ( ( rule__One__NAssignment_4 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1959:1: ( ( rule__One__NAssignment_4 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1959:1: ( ( rule__One__NAssignment_4 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1960:1: ( rule__One__NAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneAccess().getNAssignment_4()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1961:1: ( rule__One__NAssignment_4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1961:2: rule__One__NAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__One__NAssignment_4_in_rule__One__Group__4__Impl4049);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1971:1: rule__One__Group__5 : rule__One__Group__5__Impl ;
    public final void rule__One__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1975:1: ( rule__One__Group__5__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1976:2: rule__One__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__5__Impl_in_rule__One__Group__54079);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1982:1: rule__One__Group__5__Impl : ( ')' ) ;
    public final void rule__One__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1986:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1987:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1987:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1988:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__One__Group__5__Impl4107); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2013:1: rule__DeclaredStrategyInstance__Group__0 : rule__DeclaredStrategyInstance__Group__0__Impl rule__DeclaredStrategyInstance__Group__1 ;
    public final void rule__DeclaredStrategyInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2017:1: ( rule__DeclaredStrategyInstance__Group__0__Impl rule__DeclaredStrategyInstance__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2018:2: rule__DeclaredStrategyInstance__Group__0__Impl rule__DeclaredStrategyInstance__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group__0__Impl_in_rule__DeclaredStrategyInstance__Group__04150);
            rule__DeclaredStrategyInstance__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group__1_in_rule__DeclaredStrategyInstance__Group__04153);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2025:1: rule__DeclaredStrategyInstance__Group__0__Impl : ( () ) ;
    public final void rule__DeclaredStrategyInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2029:1: ( ( () ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2030:1: ( () )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2030:1: ( () )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2031:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getDeclaredStrategyInstanceAction_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2032:1: ()
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2034:1: 
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2044:1: rule__DeclaredStrategyInstance__Group__1 : rule__DeclaredStrategyInstance__Group__1__Impl rule__DeclaredStrategyInstance__Group__2 ;
    public final void rule__DeclaredStrategyInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2048:1: ( rule__DeclaredStrategyInstance__Group__1__Impl rule__DeclaredStrategyInstance__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2049:2: rule__DeclaredStrategyInstance__Group__1__Impl rule__DeclaredStrategyInstance__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group__1__Impl_in_rule__DeclaredStrategyInstance__Group__14211);
            rule__DeclaredStrategyInstance__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group__2_in_rule__DeclaredStrategyInstance__Group__14214);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2056:1: rule__DeclaredStrategyInstance__Group__1__Impl : ( ( rule__DeclaredStrategyInstance__DeclarationAssignment_1 ) ) ;
    public final void rule__DeclaredStrategyInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2060:1: ( ( ( rule__DeclaredStrategyInstance__DeclarationAssignment_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2061:1: ( ( rule__DeclaredStrategyInstance__DeclarationAssignment_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2061:1: ( ( rule__DeclaredStrategyInstance__DeclarationAssignment_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2062:1: ( rule__DeclaredStrategyInstance__DeclarationAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getDeclarationAssignment_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2063:1: ( rule__DeclaredStrategyInstance__DeclarationAssignment_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2063:2: rule__DeclaredStrategyInstance__DeclarationAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__DeclarationAssignment_1_in_rule__DeclaredStrategyInstance__Group__1__Impl4241);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2073:1: rule__DeclaredStrategyInstance__Group__2 : rule__DeclaredStrategyInstance__Group__2__Impl rule__DeclaredStrategyInstance__Group__3 ;
    public final void rule__DeclaredStrategyInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2077:1: ( rule__DeclaredStrategyInstance__Group__2__Impl rule__DeclaredStrategyInstance__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2078:2: rule__DeclaredStrategyInstance__Group__2__Impl rule__DeclaredStrategyInstance__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group__2__Impl_in_rule__DeclaredStrategyInstance__Group__24271);
            rule__DeclaredStrategyInstance__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group__3_in_rule__DeclaredStrategyInstance__Group__24274);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2085:1: rule__DeclaredStrategyInstance__Group__2__Impl : ( '(' ) ;
    public final void rule__DeclaredStrategyInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2089:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2090:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2090:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2091:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__DeclaredStrategyInstance__Group__2__Impl4302); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2104:1: rule__DeclaredStrategyInstance__Group__3 : rule__DeclaredStrategyInstance__Group__3__Impl rule__DeclaredStrategyInstance__Group__4 ;
    public final void rule__DeclaredStrategyInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2108:1: ( rule__DeclaredStrategyInstance__Group__3__Impl rule__DeclaredStrategyInstance__Group__4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2109:2: rule__DeclaredStrategyInstance__Group__3__Impl rule__DeclaredStrategyInstance__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group__3__Impl_in_rule__DeclaredStrategyInstance__Group__34333);
            rule__DeclaredStrategyInstance__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group__4_in_rule__DeclaredStrategyInstance__Group__34336);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2116:1: rule__DeclaredStrategyInstance__Group__3__Impl : ( ( rule__DeclaredStrategyInstance__Group_3__0 )? ) ;
    public final void rule__DeclaredStrategyInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2120:1: ( ( ( rule__DeclaredStrategyInstance__Group_3__0 )? ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2121:1: ( ( rule__DeclaredStrategyInstance__Group_3__0 )? )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2121:1: ( ( rule__DeclaredStrategyInstance__Group_3__0 )? )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2122:1: ( rule__DeclaredStrategyInstance__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getGroup_3()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2123:1: ( rule__DeclaredStrategyInstance__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID||(LA11_0>=20 && LA11_0<=23)||(LA11_0>=25 && LA11_0<=31)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2123:2: rule__DeclaredStrategyInstance__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group_3__0_in_rule__DeclaredStrategyInstance__Group__3__Impl4363);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2133:1: rule__DeclaredStrategyInstance__Group__4 : rule__DeclaredStrategyInstance__Group__4__Impl ;
    public final void rule__DeclaredStrategyInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2137:1: ( rule__DeclaredStrategyInstance__Group__4__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2138:2: rule__DeclaredStrategyInstance__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group__4__Impl_in_rule__DeclaredStrategyInstance__Group__44394);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2144:1: rule__DeclaredStrategyInstance__Group__4__Impl : ( ')' ) ;
    public final void rule__DeclaredStrategyInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2148:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2149:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2149:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2150:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__DeclaredStrategyInstance__Group__4__Impl4422); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2173:1: rule__DeclaredStrategyInstance__Group_3__0 : rule__DeclaredStrategyInstance__Group_3__0__Impl rule__DeclaredStrategyInstance__Group_3__1 ;
    public final void rule__DeclaredStrategyInstance__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2177:1: ( rule__DeclaredStrategyInstance__Group_3__0__Impl rule__DeclaredStrategyInstance__Group_3__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2178:2: rule__DeclaredStrategyInstance__Group_3__0__Impl rule__DeclaredStrategyInstance__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group_3__0__Impl_in_rule__DeclaredStrategyInstance__Group_3__04463);
            rule__DeclaredStrategyInstance__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group_3__1_in_rule__DeclaredStrategyInstance__Group_3__04466);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2185:1: rule__DeclaredStrategyInstance__Group_3__0__Impl : ( ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0 ) ) ;
    public final void rule__DeclaredStrategyInstance__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2189:1: ( ( ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2190:1: ( ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2190:1: ( ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2191:1: ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getActualParamsAssignment_3_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2192:1: ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2192:2: rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0_in_rule__DeclaredStrategyInstance__Group_3__0__Impl4493);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2202:1: rule__DeclaredStrategyInstance__Group_3__1 : rule__DeclaredStrategyInstance__Group_3__1__Impl ;
    public final void rule__DeclaredStrategyInstance__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2206:1: ( rule__DeclaredStrategyInstance__Group_3__1__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2207:2: rule__DeclaredStrategyInstance__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group_3__1__Impl_in_rule__DeclaredStrategyInstance__Group_3__14523);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2213:1: rule__DeclaredStrategyInstance__Group_3__1__Impl : ( ( rule__DeclaredStrategyInstance__Group_3_1__0 )* ) ;
    public final void rule__DeclaredStrategyInstance__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2217:1: ( ( ( rule__DeclaredStrategyInstance__Group_3_1__0 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2218:1: ( ( rule__DeclaredStrategyInstance__Group_3_1__0 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2218:1: ( ( rule__DeclaredStrategyInstance__Group_3_1__0 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2219:1: ( rule__DeclaredStrategyInstance__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getGroup_3_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2220:1: ( rule__DeclaredStrategyInstance__Group_3_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2220:2: rule__DeclaredStrategyInstance__Group_3_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group_3_1__0_in_rule__DeclaredStrategyInstance__Group_3__1__Impl4550);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2234:1: rule__DeclaredStrategyInstance__Group_3_1__0 : rule__DeclaredStrategyInstance__Group_3_1__0__Impl rule__DeclaredStrategyInstance__Group_3_1__1 ;
    public final void rule__DeclaredStrategyInstance__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2238:1: ( rule__DeclaredStrategyInstance__Group_3_1__0__Impl rule__DeclaredStrategyInstance__Group_3_1__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2239:2: rule__DeclaredStrategyInstance__Group_3_1__0__Impl rule__DeclaredStrategyInstance__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group_3_1__0__Impl_in_rule__DeclaredStrategyInstance__Group_3_1__04585);
            rule__DeclaredStrategyInstance__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group_3_1__1_in_rule__DeclaredStrategyInstance__Group_3_1__04588);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2246:1: rule__DeclaredStrategyInstance__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__DeclaredStrategyInstance__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2250:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2251:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2251:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2252:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__DeclaredStrategyInstance__Group_3_1__0__Impl4616); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2265:1: rule__DeclaredStrategyInstance__Group_3_1__1 : rule__DeclaredStrategyInstance__Group_3_1__1__Impl ;
    public final void rule__DeclaredStrategyInstance__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2269:1: ( rule__DeclaredStrategyInstance__Group_3_1__1__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2270:2: rule__DeclaredStrategyInstance__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group_3_1__1__Impl_in_rule__DeclaredStrategyInstance__Group_3_1__14647);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2276:1: rule__DeclaredStrategyInstance__Group_3_1__1__Impl : ( ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1 ) ) ;
    public final void rule__DeclaredStrategyInstance__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2280:1: ( ( ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2281:1: ( ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2281:1: ( ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2282:1: ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getActualParamsAssignment_3_1_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2283:1: ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2283:2: rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1_in_rule__DeclaredStrategyInstance__Group_3_1__1__Impl4674);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2297:1: rule__Saturation__Group__0 : rule__Saturation__Group__0__Impl rule__Saturation__Group__1 ;
    public final void rule__Saturation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2301:1: ( rule__Saturation__Group__0__Impl rule__Saturation__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2302:2: rule__Saturation__Group__0__Impl rule__Saturation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__0__Impl_in_rule__Saturation__Group__04708);
            rule__Saturation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__1_in_rule__Saturation__Group__04711);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2309:1: rule__Saturation__Group__0__Impl : ( 'Saturation' ) ;
    public final void rule__Saturation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2313:1: ( ( 'Saturation' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2314:1: ( 'Saturation' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2314:1: ( 'Saturation' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2315:1: 'Saturation'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSaturationAccess().getSaturationKeyword_0()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Saturation__Group__0__Impl4739); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2328:1: rule__Saturation__Group__1 : rule__Saturation__Group__1__Impl rule__Saturation__Group__2 ;
    public final void rule__Saturation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2332:1: ( rule__Saturation__Group__1__Impl rule__Saturation__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2333:2: rule__Saturation__Group__1__Impl rule__Saturation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__1__Impl_in_rule__Saturation__Group__14770);
            rule__Saturation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__2_in_rule__Saturation__Group__14773);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2340:1: rule__Saturation__Group__1__Impl : ( '(' ) ;
    public final void rule__Saturation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2344:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2345:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2345:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2346:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSaturationAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Saturation__Group__1__Impl4801); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2359:1: rule__Saturation__Group__2 : rule__Saturation__Group__2__Impl rule__Saturation__Group__3 ;
    public final void rule__Saturation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2363:1: ( rule__Saturation__Group__2__Impl rule__Saturation__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2364:2: rule__Saturation__Group__2__Impl rule__Saturation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__2__Impl_in_rule__Saturation__Group__24832);
            rule__Saturation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__3_in_rule__Saturation__Group__24835);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2371:1: rule__Saturation__Group__2__Impl : ( ( rule__Saturation__SAssignment_2 ) ) ;
    public final void rule__Saturation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2375:1: ( ( ( rule__Saturation__SAssignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2376:1: ( ( rule__Saturation__SAssignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2376:1: ( ( rule__Saturation__SAssignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2377:1: ( rule__Saturation__SAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSaturationAccess().getSAssignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2378:1: ( rule__Saturation__SAssignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2378:2: rule__Saturation__SAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__SAssignment_2_in_rule__Saturation__Group__2__Impl4862);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2388:1: rule__Saturation__Group__3 : rule__Saturation__Group__3__Impl rule__Saturation__Group__4 ;
    public final void rule__Saturation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2392:1: ( rule__Saturation__Group__3__Impl rule__Saturation__Group__4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2393:2: rule__Saturation__Group__3__Impl rule__Saturation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__3__Impl_in_rule__Saturation__Group__34892);
            rule__Saturation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__4_in_rule__Saturation__Group__34895);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2400:1: rule__Saturation__Group__3__Impl : ( ',' ) ;
    public final void rule__Saturation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2404:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2405:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2405:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2406:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSaturationAccess().getCommaKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Saturation__Group__3__Impl4923); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2419:1: rule__Saturation__Group__4 : rule__Saturation__Group__4__Impl rule__Saturation__Group__5 ;
    public final void rule__Saturation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2423:1: ( rule__Saturation__Group__4__Impl rule__Saturation__Group__5 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2424:2: rule__Saturation__Group__4__Impl rule__Saturation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__4__Impl_in_rule__Saturation__Group__44954);
            rule__Saturation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__5_in_rule__Saturation__Group__44957);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2431:1: rule__Saturation__Group__4__Impl : ( ( rule__Saturation__NAssignment_4 ) ) ;
    public final void rule__Saturation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2435:1: ( ( ( rule__Saturation__NAssignment_4 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2436:1: ( ( rule__Saturation__NAssignment_4 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2436:1: ( ( rule__Saturation__NAssignment_4 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2437:1: ( rule__Saturation__NAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSaturationAccess().getNAssignment_4()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2438:1: ( rule__Saturation__NAssignment_4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2438:2: rule__Saturation__NAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__NAssignment_4_in_rule__Saturation__Group__4__Impl4984);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2448:1: rule__Saturation__Group__5 : rule__Saturation__Group__5__Impl ;
    public final void rule__Saturation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2452:1: ( rule__Saturation__Group__5__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2453:2: rule__Saturation__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__5__Impl_in_rule__Saturation__Group__55014);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2459:1: rule__Saturation__Group__5__Impl : ( ')' ) ;
    public final void rule__Saturation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2463:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2464:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2464:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2465:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSaturationAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Saturation__Group__5__Impl5042); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2490:1: rule__IfThenElse__Group__0 : rule__IfThenElse__Group__0__Impl rule__IfThenElse__Group__1 ;
    public final void rule__IfThenElse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2494:1: ( rule__IfThenElse__Group__0__Impl rule__IfThenElse__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2495:2: rule__IfThenElse__Group__0__Impl rule__IfThenElse__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__0__Impl_in_rule__IfThenElse__Group__05085);
            rule__IfThenElse__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__1_in_rule__IfThenElse__Group__05088);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2502:1: rule__IfThenElse__Group__0__Impl : ( 'IfThenElse' ) ;
    public final void rule__IfThenElse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2506:1: ( ( 'IfThenElse' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2507:1: ( 'IfThenElse' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2507:1: ( 'IfThenElse' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2508:1: 'IfThenElse'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getIfThenElseKeyword_0()); 
            }
            match(input,22,FollowSets000.FOLLOW_22_in_rule__IfThenElse__Group__0__Impl5116); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2521:1: rule__IfThenElse__Group__1 : rule__IfThenElse__Group__1__Impl rule__IfThenElse__Group__2 ;
    public final void rule__IfThenElse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2525:1: ( rule__IfThenElse__Group__1__Impl rule__IfThenElse__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2526:2: rule__IfThenElse__Group__1__Impl rule__IfThenElse__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__1__Impl_in_rule__IfThenElse__Group__15147);
            rule__IfThenElse__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__2_in_rule__IfThenElse__Group__15150);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2533:1: rule__IfThenElse__Group__1__Impl : ( '(' ) ;
    public final void rule__IfThenElse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2537:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2538:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2538:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2539:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__IfThenElse__Group__1__Impl5178); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2552:1: rule__IfThenElse__Group__2 : rule__IfThenElse__Group__2__Impl rule__IfThenElse__Group__3 ;
    public final void rule__IfThenElse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2556:1: ( rule__IfThenElse__Group__2__Impl rule__IfThenElse__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2557:2: rule__IfThenElse__Group__2__Impl rule__IfThenElse__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__2__Impl_in_rule__IfThenElse__Group__25209);
            rule__IfThenElse__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__3_in_rule__IfThenElse__Group__25212);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2564:1: rule__IfThenElse__Group__2__Impl : ( ( rule__IfThenElse__S1Assignment_2 ) ) ;
    public final void rule__IfThenElse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2568:1: ( ( ( rule__IfThenElse__S1Assignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2569:1: ( ( rule__IfThenElse__S1Assignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2569:1: ( ( rule__IfThenElse__S1Assignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2570:1: ( rule__IfThenElse__S1Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getS1Assignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2571:1: ( rule__IfThenElse__S1Assignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2571:2: rule__IfThenElse__S1Assignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__S1Assignment_2_in_rule__IfThenElse__Group__2__Impl5239);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2581:1: rule__IfThenElse__Group__3 : rule__IfThenElse__Group__3__Impl rule__IfThenElse__Group__4 ;
    public final void rule__IfThenElse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2585:1: ( rule__IfThenElse__Group__3__Impl rule__IfThenElse__Group__4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2586:2: rule__IfThenElse__Group__3__Impl rule__IfThenElse__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__3__Impl_in_rule__IfThenElse__Group__35269);
            rule__IfThenElse__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__4_in_rule__IfThenElse__Group__35272);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2593:1: rule__IfThenElse__Group__3__Impl : ( ',' ) ;
    public final void rule__IfThenElse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2597:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2598:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2598:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2599:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getCommaKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__IfThenElse__Group__3__Impl5300); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2612:1: rule__IfThenElse__Group__4 : rule__IfThenElse__Group__4__Impl rule__IfThenElse__Group__5 ;
    public final void rule__IfThenElse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2616:1: ( rule__IfThenElse__Group__4__Impl rule__IfThenElse__Group__5 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2617:2: rule__IfThenElse__Group__4__Impl rule__IfThenElse__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__4__Impl_in_rule__IfThenElse__Group__45331);
            rule__IfThenElse__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__5_in_rule__IfThenElse__Group__45334);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2624:1: rule__IfThenElse__Group__4__Impl : ( ( rule__IfThenElse__S2Assignment_4 ) ) ;
    public final void rule__IfThenElse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2628:1: ( ( ( rule__IfThenElse__S2Assignment_4 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2629:1: ( ( rule__IfThenElse__S2Assignment_4 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2629:1: ( ( rule__IfThenElse__S2Assignment_4 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2630:1: ( rule__IfThenElse__S2Assignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getS2Assignment_4()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2631:1: ( rule__IfThenElse__S2Assignment_4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2631:2: rule__IfThenElse__S2Assignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__S2Assignment_4_in_rule__IfThenElse__Group__4__Impl5361);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2641:1: rule__IfThenElse__Group__5 : rule__IfThenElse__Group__5__Impl rule__IfThenElse__Group__6 ;
    public final void rule__IfThenElse__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2645:1: ( rule__IfThenElse__Group__5__Impl rule__IfThenElse__Group__6 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2646:2: rule__IfThenElse__Group__5__Impl rule__IfThenElse__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__5__Impl_in_rule__IfThenElse__Group__55391);
            rule__IfThenElse__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__6_in_rule__IfThenElse__Group__55394);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2653:1: rule__IfThenElse__Group__5__Impl : ( ',' ) ;
    public final void rule__IfThenElse__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2657:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2658:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2658:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2659:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getCommaKeyword_5()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__IfThenElse__Group__5__Impl5422); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2672:1: rule__IfThenElse__Group__6 : rule__IfThenElse__Group__6__Impl rule__IfThenElse__Group__7 ;
    public final void rule__IfThenElse__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2676:1: ( rule__IfThenElse__Group__6__Impl rule__IfThenElse__Group__7 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2677:2: rule__IfThenElse__Group__6__Impl rule__IfThenElse__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__6__Impl_in_rule__IfThenElse__Group__65453);
            rule__IfThenElse__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__7_in_rule__IfThenElse__Group__65456);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2684:1: rule__IfThenElse__Group__6__Impl : ( ( rule__IfThenElse__S3Assignment_6 ) ) ;
    public final void rule__IfThenElse__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2688:1: ( ( ( rule__IfThenElse__S3Assignment_6 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2689:1: ( ( rule__IfThenElse__S3Assignment_6 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2689:1: ( ( rule__IfThenElse__S3Assignment_6 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2690:1: ( rule__IfThenElse__S3Assignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getS3Assignment_6()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2691:1: ( rule__IfThenElse__S3Assignment_6 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2691:2: rule__IfThenElse__S3Assignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__S3Assignment_6_in_rule__IfThenElse__Group__6__Impl5483);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2701:1: rule__IfThenElse__Group__7 : rule__IfThenElse__Group__7__Impl ;
    public final void rule__IfThenElse__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2705:1: ( rule__IfThenElse__Group__7__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2706:2: rule__IfThenElse__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__7__Impl_in_rule__IfThenElse__Group__75513);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2712:1: rule__IfThenElse__Group__7__Impl : ( ')' ) ;
    public final void rule__IfThenElse__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2716:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2717:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2717:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2718:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getRightParenthesisKeyword_7()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__IfThenElse__Group__7__Impl5541); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2747:1: rule__SimpleStrategy__Group__0 : rule__SimpleStrategy__Group__0__Impl rule__SimpleStrategy__Group__1 ;
    public final void rule__SimpleStrategy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2751:1: ( rule__SimpleStrategy__Group__0__Impl rule__SimpleStrategy__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2752:2: rule__SimpleStrategy__Group__0__Impl rule__SimpleStrategy__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group__0__Impl_in_rule__SimpleStrategy__Group__05588);
            rule__SimpleStrategy__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group__1_in_rule__SimpleStrategy__Group__05591);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2759:1: rule__SimpleStrategy__Group__0__Impl : ( '{' ) ;
    public final void rule__SimpleStrategy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2763:1: ( ( '{' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2764:1: ( '{' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2764:1: ( '{' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2765:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleStrategyAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__SimpleStrategy__Group__0__Impl5619); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2778:1: rule__SimpleStrategy__Group__1 : rule__SimpleStrategy__Group__1__Impl rule__SimpleStrategy__Group__2 ;
    public final void rule__SimpleStrategy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2782:1: ( rule__SimpleStrategy__Group__1__Impl rule__SimpleStrategy__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2783:2: rule__SimpleStrategy__Group__1__Impl rule__SimpleStrategy__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group__1__Impl_in_rule__SimpleStrategy__Group__15650);
            rule__SimpleStrategy__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group__2_in_rule__SimpleStrategy__Group__15653);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2790:1: rule__SimpleStrategy__Group__1__Impl : ( ( rule__SimpleStrategy__EquationsAssignment_1 ) ) ;
    public final void rule__SimpleStrategy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2794:1: ( ( ( rule__SimpleStrategy__EquationsAssignment_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2795:1: ( ( rule__SimpleStrategy__EquationsAssignment_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2795:1: ( ( rule__SimpleStrategy__EquationsAssignment_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2796:1: ( rule__SimpleStrategy__EquationsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleStrategyAccess().getEquationsAssignment_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2797:1: ( rule__SimpleStrategy__EquationsAssignment_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2797:2: rule__SimpleStrategy__EquationsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__EquationsAssignment_1_in_rule__SimpleStrategy__Group__1__Impl5680);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2807:1: rule__SimpleStrategy__Group__2 : rule__SimpleStrategy__Group__2__Impl rule__SimpleStrategy__Group__3 ;
    public final void rule__SimpleStrategy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2811:1: ( rule__SimpleStrategy__Group__2__Impl rule__SimpleStrategy__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2812:2: rule__SimpleStrategy__Group__2__Impl rule__SimpleStrategy__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group__2__Impl_in_rule__SimpleStrategy__Group__25710);
            rule__SimpleStrategy__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group__3_in_rule__SimpleStrategy__Group__25713);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2819:1: rule__SimpleStrategy__Group__2__Impl : ( ( rule__SimpleStrategy__Group_2__0 )* ) ;
    public final void rule__SimpleStrategy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2823:1: ( ( ( rule__SimpleStrategy__Group_2__0 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2824:1: ( ( rule__SimpleStrategy__Group_2__0 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2824:1: ( ( rule__SimpleStrategy__Group_2__0 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2825:1: ( rule__SimpleStrategy__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleStrategyAccess().getGroup_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2826:1: ( rule__SimpleStrategy__Group_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2826:2: rule__SimpleStrategy__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group_2__0_in_rule__SimpleStrategy__Group__2__Impl5740);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2836:1: rule__SimpleStrategy__Group__3 : rule__SimpleStrategy__Group__3__Impl ;
    public final void rule__SimpleStrategy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2840:1: ( rule__SimpleStrategy__Group__3__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2841:2: rule__SimpleStrategy__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group__3__Impl_in_rule__SimpleStrategy__Group__35771);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2847:1: rule__SimpleStrategy__Group__3__Impl : ( '}' ) ;
    public final void rule__SimpleStrategy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2851:1: ( ( '}' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2852:1: ( '}' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2852:1: ( '}' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2853:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleStrategyAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,24,FollowSets000.FOLLOW_24_in_rule__SimpleStrategy__Group__3__Impl5799); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2874:1: rule__SimpleStrategy__Group_2__0 : rule__SimpleStrategy__Group_2__0__Impl rule__SimpleStrategy__Group_2__1 ;
    public final void rule__SimpleStrategy__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2878:1: ( rule__SimpleStrategy__Group_2__0__Impl rule__SimpleStrategy__Group_2__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2879:2: rule__SimpleStrategy__Group_2__0__Impl rule__SimpleStrategy__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group_2__0__Impl_in_rule__SimpleStrategy__Group_2__05838);
            rule__SimpleStrategy__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group_2__1_in_rule__SimpleStrategy__Group_2__05841);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2886:1: rule__SimpleStrategy__Group_2__0__Impl : ( ',' ) ;
    public final void rule__SimpleStrategy__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2890:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2891:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2891:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2892:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleStrategyAccess().getCommaKeyword_2_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__SimpleStrategy__Group_2__0__Impl5869); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2905:1: rule__SimpleStrategy__Group_2__1 : rule__SimpleStrategy__Group_2__1__Impl ;
    public final void rule__SimpleStrategy__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2909:1: ( rule__SimpleStrategy__Group_2__1__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2910:2: rule__SimpleStrategy__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group_2__1__Impl_in_rule__SimpleStrategy__Group_2__15900);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2916:1: rule__SimpleStrategy__Group_2__1__Impl : ( ( rule__SimpleStrategy__EquationsAssignment_2_1 ) ) ;
    public final void rule__SimpleStrategy__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2920:1: ( ( ( rule__SimpleStrategy__EquationsAssignment_2_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2921:1: ( ( rule__SimpleStrategy__EquationsAssignment_2_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2921:1: ( ( rule__SimpleStrategy__EquationsAssignment_2_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2922:1: ( rule__SimpleStrategy__EquationsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleStrategyAccess().getEquationsAssignment_2_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2923:1: ( rule__SimpleStrategy__EquationsAssignment_2_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2923:2: rule__SimpleStrategy__EquationsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__EquationsAssignment_2_1_in_rule__SimpleStrategy__Group_2__1__Impl5927);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2937:1: rule__Not__Group__0 : rule__Not__Group__0__Impl rule__Not__Group__1 ;
    public final void rule__Not__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2941:1: ( rule__Not__Group__0__Impl rule__Not__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2942:2: rule__Not__Group__0__Impl rule__Not__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Not__Group__0__Impl_in_rule__Not__Group__05961);
            rule__Not__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Not__Group__1_in_rule__Not__Group__05964);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2949:1: rule__Not__Group__0__Impl : ( 'Not' ) ;
    public final void rule__Not__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2953:1: ( ( 'Not' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2954:1: ( 'Not' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2954:1: ( 'Not' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2955:1: 'Not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getNotKeyword_0()); 
            }
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Not__Group__0__Impl5992); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2968:1: rule__Not__Group__1 : rule__Not__Group__1__Impl rule__Not__Group__2 ;
    public final void rule__Not__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2972:1: ( rule__Not__Group__1__Impl rule__Not__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2973:2: rule__Not__Group__1__Impl rule__Not__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Not__Group__1__Impl_in_rule__Not__Group__16023);
            rule__Not__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Not__Group__2_in_rule__Not__Group__16026);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2980:1: rule__Not__Group__1__Impl : ( '(' ) ;
    public final void rule__Not__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2984:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2985:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2985:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2986:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Not__Group__1__Impl6054); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2999:1: rule__Not__Group__2 : rule__Not__Group__2__Impl rule__Not__Group__3 ;
    public final void rule__Not__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3003:1: ( rule__Not__Group__2__Impl rule__Not__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3004:2: rule__Not__Group__2__Impl rule__Not__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Not__Group__2__Impl_in_rule__Not__Group__26085);
            rule__Not__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Not__Group__3_in_rule__Not__Group__26088);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3011:1: rule__Not__Group__2__Impl : ( ( rule__Not__SAssignment_2 ) ) ;
    public final void rule__Not__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3015:1: ( ( ( rule__Not__SAssignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3016:1: ( ( rule__Not__SAssignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3016:1: ( ( rule__Not__SAssignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3017:1: ( rule__Not__SAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getSAssignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3018:1: ( rule__Not__SAssignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3018:2: rule__Not__SAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Not__SAssignment_2_in_rule__Not__Group__2__Impl6115);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3028:1: rule__Not__Group__3 : rule__Not__Group__3__Impl ;
    public final void rule__Not__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3032:1: ( rule__Not__Group__3__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3033:2: rule__Not__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Not__Group__3__Impl_in_rule__Not__Group__36145);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3039:1: rule__Not__Group__3__Impl : ( ')' ) ;
    public final void rule__Not__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3043:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3044:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3044:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3045:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Not__Group__3__Impl6173); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3066:1: rule__Fixpoint__Group__0 : rule__Fixpoint__Group__0__Impl rule__Fixpoint__Group__1 ;
    public final void rule__Fixpoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3070:1: ( rule__Fixpoint__Group__0__Impl rule__Fixpoint__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3071:2: rule__Fixpoint__Group__0__Impl rule__Fixpoint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fixpoint__Group__0__Impl_in_rule__Fixpoint__Group__06212);
            rule__Fixpoint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Fixpoint__Group__1_in_rule__Fixpoint__Group__06215);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3078:1: rule__Fixpoint__Group__0__Impl : ( 'Fixpoint' ) ;
    public final void rule__Fixpoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3082:1: ( ( 'Fixpoint' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3083:1: ( 'Fixpoint' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3083:1: ( 'Fixpoint' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3084:1: 'Fixpoint'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixpointAccess().getFixpointKeyword_0()); 
            }
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Fixpoint__Group__0__Impl6243); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3097:1: rule__Fixpoint__Group__1 : rule__Fixpoint__Group__1__Impl rule__Fixpoint__Group__2 ;
    public final void rule__Fixpoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3101:1: ( rule__Fixpoint__Group__1__Impl rule__Fixpoint__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3102:2: rule__Fixpoint__Group__1__Impl rule__Fixpoint__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fixpoint__Group__1__Impl_in_rule__Fixpoint__Group__16274);
            rule__Fixpoint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Fixpoint__Group__2_in_rule__Fixpoint__Group__16277);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3109:1: rule__Fixpoint__Group__1__Impl : ( '(' ) ;
    public final void rule__Fixpoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3113:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3114:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3114:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3115:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixpointAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Fixpoint__Group__1__Impl6305); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3128:1: rule__Fixpoint__Group__2 : rule__Fixpoint__Group__2__Impl rule__Fixpoint__Group__3 ;
    public final void rule__Fixpoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3132:1: ( rule__Fixpoint__Group__2__Impl rule__Fixpoint__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3133:2: rule__Fixpoint__Group__2__Impl rule__Fixpoint__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fixpoint__Group__2__Impl_in_rule__Fixpoint__Group__26336);
            rule__Fixpoint__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Fixpoint__Group__3_in_rule__Fixpoint__Group__26339);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3140:1: rule__Fixpoint__Group__2__Impl : ( ( rule__Fixpoint__SAssignment_2 ) ) ;
    public final void rule__Fixpoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3144:1: ( ( ( rule__Fixpoint__SAssignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3145:1: ( ( rule__Fixpoint__SAssignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3145:1: ( ( rule__Fixpoint__SAssignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3146:1: ( rule__Fixpoint__SAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixpointAccess().getSAssignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3147:1: ( rule__Fixpoint__SAssignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3147:2: rule__Fixpoint__SAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fixpoint__SAssignment_2_in_rule__Fixpoint__Group__2__Impl6366);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3157:1: rule__Fixpoint__Group__3 : rule__Fixpoint__Group__3__Impl ;
    public final void rule__Fixpoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3161:1: ( rule__Fixpoint__Group__3__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3162:2: rule__Fixpoint__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fixpoint__Group__3__Impl_in_rule__Fixpoint__Group__36396);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3168:1: rule__Fixpoint__Group__3__Impl : ( ')' ) ;
    public final void rule__Fixpoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3172:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3173:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3173:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3174:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixpointAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Fixpoint__Group__3__Impl6424); if (state.failed) return ;
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


    // $ANTLR start "rule__Choice__Group__0"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3195:1: rule__Choice__Group__0 : rule__Choice__Group__0__Impl rule__Choice__Group__1 ;
    public final void rule__Choice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3199:1: ( rule__Choice__Group__0__Impl rule__Choice__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3200:2: rule__Choice__Group__0__Impl rule__Choice__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__0__Impl_in_rule__Choice__Group__06463);
            rule__Choice__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__1_in_rule__Choice__Group__06466);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3207:1: rule__Choice__Group__0__Impl : ( 'Choice' ) ;
    public final void rule__Choice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3211:1: ( ( 'Choice' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3212:1: ( 'Choice' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3212:1: ( 'Choice' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3213:1: 'Choice'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getChoiceKeyword_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Choice__Group__0__Impl6494); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3226:1: rule__Choice__Group__1 : rule__Choice__Group__1__Impl rule__Choice__Group__2 ;
    public final void rule__Choice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3230:1: ( rule__Choice__Group__1__Impl rule__Choice__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3231:2: rule__Choice__Group__1__Impl rule__Choice__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__1__Impl_in_rule__Choice__Group__16525);
            rule__Choice__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__2_in_rule__Choice__Group__16528);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3238:1: rule__Choice__Group__1__Impl : ( '(' ) ;
    public final void rule__Choice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3242:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3243:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3243:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3244:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Choice__Group__1__Impl6556); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3257:1: rule__Choice__Group__2 : rule__Choice__Group__2__Impl rule__Choice__Group__3 ;
    public final void rule__Choice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3261:1: ( rule__Choice__Group__2__Impl rule__Choice__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3262:2: rule__Choice__Group__2__Impl rule__Choice__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__2__Impl_in_rule__Choice__Group__26587);
            rule__Choice__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__3_in_rule__Choice__Group__26590);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3269:1: rule__Choice__Group__2__Impl : ( ( rule__Choice__S1Assignment_2 ) ) ;
    public final void rule__Choice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3273:1: ( ( ( rule__Choice__S1Assignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3274:1: ( ( rule__Choice__S1Assignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3274:1: ( ( rule__Choice__S1Assignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3275:1: ( rule__Choice__S1Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getS1Assignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3276:1: ( rule__Choice__S1Assignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3276:2: rule__Choice__S1Assignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Choice__S1Assignment_2_in_rule__Choice__Group__2__Impl6617);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3286:1: rule__Choice__Group__3 : rule__Choice__Group__3__Impl rule__Choice__Group__4 ;
    public final void rule__Choice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3290:1: ( rule__Choice__Group__3__Impl rule__Choice__Group__4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3291:2: rule__Choice__Group__3__Impl rule__Choice__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__3__Impl_in_rule__Choice__Group__36647);
            rule__Choice__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__4_in_rule__Choice__Group__36650);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3298:1: rule__Choice__Group__3__Impl : ( ',' ) ;
    public final void rule__Choice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3302:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3303:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3303:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3304:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getCommaKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Choice__Group__3__Impl6678); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3317:1: rule__Choice__Group__4 : rule__Choice__Group__4__Impl rule__Choice__Group__5 ;
    public final void rule__Choice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3321:1: ( rule__Choice__Group__4__Impl rule__Choice__Group__5 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3322:2: rule__Choice__Group__4__Impl rule__Choice__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__4__Impl_in_rule__Choice__Group__46709);
            rule__Choice__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__5_in_rule__Choice__Group__46712);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3329:1: rule__Choice__Group__4__Impl : ( ( rule__Choice__S2Assignment_4 ) ) ;
    public final void rule__Choice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3333:1: ( ( ( rule__Choice__S2Assignment_4 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3334:1: ( ( rule__Choice__S2Assignment_4 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3334:1: ( ( rule__Choice__S2Assignment_4 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3335:1: ( rule__Choice__S2Assignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getS2Assignment_4()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3336:1: ( rule__Choice__S2Assignment_4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3336:2: rule__Choice__S2Assignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Choice__S2Assignment_4_in_rule__Choice__Group__4__Impl6739);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3346:1: rule__Choice__Group__5 : rule__Choice__Group__5__Impl ;
    public final void rule__Choice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3350:1: ( rule__Choice__Group__5__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3351:2: rule__Choice__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__5__Impl_in_rule__Choice__Group__56769);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3357:1: rule__Choice__Group__5__Impl : ( ')' ) ;
    public final void rule__Choice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3361:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3362:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3362:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3363:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Choice__Group__5__Impl6797); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3388:1: rule__Union__Group__0 : rule__Union__Group__0__Impl rule__Union__Group__1 ;
    public final void rule__Union__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3392:1: ( rule__Union__Group__0__Impl rule__Union__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3393:2: rule__Union__Group__0__Impl rule__Union__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__0__Impl_in_rule__Union__Group__06840);
            rule__Union__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__1_in_rule__Union__Group__06843);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3400:1: rule__Union__Group__0__Impl : ( 'Union' ) ;
    public final void rule__Union__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3404:1: ( ( 'Union' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3405:1: ( 'Union' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3405:1: ( 'Union' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3406:1: 'Union'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionAccess().getUnionKeyword_0()); 
            }
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Union__Group__0__Impl6871); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3419:1: rule__Union__Group__1 : rule__Union__Group__1__Impl rule__Union__Group__2 ;
    public final void rule__Union__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3423:1: ( rule__Union__Group__1__Impl rule__Union__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3424:2: rule__Union__Group__1__Impl rule__Union__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__1__Impl_in_rule__Union__Group__16902);
            rule__Union__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__2_in_rule__Union__Group__16905);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3431:1: rule__Union__Group__1__Impl : ( '(' ) ;
    public final void rule__Union__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3435:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3436:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3436:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3437:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Union__Group__1__Impl6933); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3450:1: rule__Union__Group__2 : rule__Union__Group__2__Impl rule__Union__Group__3 ;
    public final void rule__Union__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3454:1: ( rule__Union__Group__2__Impl rule__Union__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3455:2: rule__Union__Group__2__Impl rule__Union__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__2__Impl_in_rule__Union__Group__26964);
            rule__Union__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__3_in_rule__Union__Group__26967);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3462:1: rule__Union__Group__2__Impl : ( ( rule__Union__S1Assignment_2 ) ) ;
    public final void rule__Union__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3466:1: ( ( ( rule__Union__S1Assignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3467:1: ( ( rule__Union__S1Assignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3467:1: ( ( rule__Union__S1Assignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3468:1: ( rule__Union__S1Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionAccess().getS1Assignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3469:1: ( rule__Union__S1Assignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3469:2: rule__Union__S1Assignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Union__S1Assignment_2_in_rule__Union__Group__2__Impl6994);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3479:1: rule__Union__Group__3 : rule__Union__Group__3__Impl rule__Union__Group__4 ;
    public final void rule__Union__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3483:1: ( rule__Union__Group__3__Impl rule__Union__Group__4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3484:2: rule__Union__Group__3__Impl rule__Union__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__3__Impl_in_rule__Union__Group__37024);
            rule__Union__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__4_in_rule__Union__Group__37027);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3491:1: rule__Union__Group__3__Impl : ( ',' ) ;
    public final void rule__Union__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3495:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3496:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3496:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3497:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionAccess().getCommaKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Union__Group__3__Impl7055); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3510:1: rule__Union__Group__4 : rule__Union__Group__4__Impl rule__Union__Group__5 ;
    public final void rule__Union__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3514:1: ( rule__Union__Group__4__Impl rule__Union__Group__5 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3515:2: rule__Union__Group__4__Impl rule__Union__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__4__Impl_in_rule__Union__Group__47086);
            rule__Union__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__5_in_rule__Union__Group__47089);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3522:1: rule__Union__Group__4__Impl : ( ( rule__Union__S2Assignment_4 ) ) ;
    public final void rule__Union__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3526:1: ( ( ( rule__Union__S2Assignment_4 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3527:1: ( ( rule__Union__S2Assignment_4 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3527:1: ( ( rule__Union__S2Assignment_4 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3528:1: ( rule__Union__S2Assignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionAccess().getS2Assignment_4()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3529:1: ( rule__Union__S2Assignment_4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3529:2: rule__Union__S2Assignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Union__S2Assignment_4_in_rule__Union__Group__4__Impl7116);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3539:1: rule__Union__Group__5 : rule__Union__Group__5__Impl ;
    public final void rule__Union__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3543:1: ( rule__Union__Group__5__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3544:2: rule__Union__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__5__Impl_in_rule__Union__Group__57146);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3550:1: rule__Union__Group__5__Impl : ( ')' ) ;
    public final void rule__Union__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3554:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3555:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3555:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3556:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Union__Group__5__Impl7174); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3581:1: rule__Sequence__Group__0 : rule__Sequence__Group__0__Impl rule__Sequence__Group__1 ;
    public final void rule__Sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3585:1: ( rule__Sequence__Group__0__Impl rule__Sequence__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3586:2: rule__Sequence__Group__0__Impl rule__Sequence__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__07217);
            rule__Sequence__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__07220);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3593:1: rule__Sequence__Group__0__Impl : ( 'Sequence' ) ;
    public final void rule__Sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3597:1: ( ( 'Sequence' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3598:1: ( 'Sequence' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3598:1: ( 'Sequence' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3599:1: 'Sequence'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getSequenceKeyword_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Sequence__Group__0__Impl7248); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3612:1: rule__Sequence__Group__1 : rule__Sequence__Group__1__Impl rule__Sequence__Group__2 ;
    public final void rule__Sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3616:1: ( rule__Sequence__Group__1__Impl rule__Sequence__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3617:2: rule__Sequence__Group__1__Impl rule__Sequence__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__17279);
            rule__Sequence__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__17282);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3624:1: rule__Sequence__Group__1__Impl : ( '(' ) ;
    public final void rule__Sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3628:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3629:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3629:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3630:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Sequence__Group__1__Impl7310); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3643:1: rule__Sequence__Group__2 : rule__Sequence__Group__2__Impl rule__Sequence__Group__3 ;
    public final void rule__Sequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3647:1: ( rule__Sequence__Group__2__Impl rule__Sequence__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3648:2: rule__Sequence__Group__2__Impl rule__Sequence__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__27341);
            rule__Sequence__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__27344);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3655:1: rule__Sequence__Group__2__Impl : ( ( rule__Sequence__S1Assignment_2 ) ) ;
    public final void rule__Sequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3659:1: ( ( ( rule__Sequence__S1Assignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3660:1: ( ( rule__Sequence__S1Assignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3660:1: ( ( rule__Sequence__S1Assignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3661:1: ( rule__Sequence__S1Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getS1Assignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3662:1: ( rule__Sequence__S1Assignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3662:2: rule__Sequence__S1Assignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__S1Assignment_2_in_rule__Sequence__Group__2__Impl7371);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3672:1: rule__Sequence__Group__3 : rule__Sequence__Group__3__Impl rule__Sequence__Group__4 ;
    public final void rule__Sequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3676:1: ( rule__Sequence__Group__3__Impl rule__Sequence__Group__4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3677:2: rule__Sequence__Group__3__Impl rule__Sequence__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__37401);
            rule__Sequence__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__37404);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3684:1: rule__Sequence__Group__3__Impl : ( ',' ) ;
    public final void rule__Sequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3688:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3689:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3689:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3690:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getCommaKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Sequence__Group__3__Impl7432); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3703:1: rule__Sequence__Group__4 : rule__Sequence__Group__4__Impl rule__Sequence__Group__5 ;
    public final void rule__Sequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3707:1: ( rule__Sequence__Group__4__Impl rule__Sequence__Group__5 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3708:2: rule__Sequence__Group__4__Impl rule__Sequence__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__47463);
            rule__Sequence__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__5_in_rule__Sequence__Group__47466);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3715:1: rule__Sequence__Group__4__Impl : ( ( rule__Sequence__S2Assignment_4 ) ) ;
    public final void rule__Sequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3719:1: ( ( ( rule__Sequence__S2Assignment_4 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3720:1: ( ( rule__Sequence__S2Assignment_4 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3720:1: ( ( rule__Sequence__S2Assignment_4 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3721:1: ( rule__Sequence__S2Assignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getS2Assignment_4()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3722:1: ( rule__Sequence__S2Assignment_4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3722:2: rule__Sequence__S2Assignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__S2Assignment_4_in_rule__Sequence__Group__4__Impl7493);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3732:1: rule__Sequence__Group__5 : rule__Sequence__Group__5__Impl ;
    public final void rule__Sequence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3736:1: ( rule__Sequence__Group__5__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3737:2: rule__Sequence__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__5__Impl_in_rule__Sequence__Group__57523);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3743:1: rule__Sequence__Group__5__Impl : ( ')' ) ;
    public final void rule__Sequence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3747:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3748:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3748:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3749:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Sequence__Group__5__Impl7551); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3774:1: rule__Identity__Group__0 : rule__Identity__Group__0__Impl rule__Identity__Group__1 ;
    public final void rule__Identity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3778:1: ( rule__Identity__Group__0__Impl rule__Identity__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3779:2: rule__Identity__Group__0__Impl rule__Identity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identity__Group__0__Impl_in_rule__Identity__Group__07594);
            rule__Identity__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Identity__Group__1_in_rule__Identity__Group__07597);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3786:1: rule__Identity__Group__0__Impl : ( 'Identity' ) ;
    public final void rule__Identity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3790:1: ( ( 'Identity' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3791:1: ( 'Identity' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3791:1: ( 'Identity' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3792:1: 'Identity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentityAccess().getIdentityKeyword_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Identity__Group__0__Impl7625); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3805:1: rule__Identity__Group__1 : rule__Identity__Group__1__Impl ;
    public final void rule__Identity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3809:1: ( rule__Identity__Group__1__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3810:2: rule__Identity__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identity__Group__1__Impl_in_rule__Identity__Group__17656);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3816:1: rule__Identity__Group__1__Impl : ( () ) ;
    public final void rule__Identity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3820:1: ( ( () ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3821:1: ( () )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3821:1: ( () )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3822:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentityAccess().getIdentityAction_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3823:1: ()
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3825:1: 
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3839:1: rule__Fail__Group__0 : rule__Fail__Group__0__Impl rule__Fail__Group__1 ;
    public final void rule__Fail__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3843:1: ( rule__Fail__Group__0__Impl rule__Fail__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3844:2: rule__Fail__Group__0__Impl rule__Fail__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fail__Group__0__Impl_in_rule__Fail__Group__07718);
            rule__Fail__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Fail__Group__1_in_rule__Fail__Group__07721);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3851:1: rule__Fail__Group__0__Impl : ( 'Fail' ) ;
    public final void rule__Fail__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3855:1: ( ( 'Fail' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3856:1: ( 'Fail' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3856:1: ( 'Fail' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3857:1: 'Fail'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFailAccess().getFailKeyword_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Fail__Group__0__Impl7749); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3870:1: rule__Fail__Group__1 : rule__Fail__Group__1__Impl ;
    public final void rule__Fail__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3874:1: ( rule__Fail__Group__1__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3875:2: rule__Fail__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fail__Group__1__Impl_in_rule__Fail__Group__17780);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3881:1: rule__Fail__Group__1__Impl : ( () ) ;
    public final void rule__Fail__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3885:1: ( ( () ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3886:1: ( () )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3886:1: ( () )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3887:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFailAccess().getFailAction_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3888:1: ()
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3890:1: 
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3904:1: rule__ADT__Group__0 : rule__ADT__Group__0__Impl rule__ADT__Group__1 ;
    public final void rule__ADT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3908:1: ( rule__ADT__Group__0__Impl rule__ADT__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3909:2: rule__ADT__Group__0__Impl rule__ADT__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__0__Impl_in_rule__ADT__Group__07842);
            rule__ADT__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__1_in_rule__ADT__Group__07845);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3916:1: rule__ADT__Group__0__Impl : ( 'ADT' ) ;
    public final void rule__ADT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3920:1: ( ( 'ADT' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3921:1: ( 'ADT' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3921:1: ( 'ADT' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3922:1: 'ADT'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getADTKeyword_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__ADT__Group__0__Impl7873); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3935:1: rule__ADT__Group__1 : rule__ADT__Group__1__Impl rule__ADT__Group__2 ;
    public final void rule__ADT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3939:1: ( rule__ADT__Group__1__Impl rule__ADT__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3940:2: rule__ADT__Group__1__Impl rule__ADT__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__1__Impl_in_rule__ADT__Group__17904);
            rule__ADT__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__2_in_rule__ADT__Group__17907);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3947:1: rule__ADT__Group__1__Impl : ( ( rule__ADT__NameAssignment_1 ) ) ;
    public final void rule__ADT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3951:1: ( ( ( rule__ADT__NameAssignment_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3952:1: ( ( rule__ADT__NameAssignment_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3952:1: ( ( rule__ADT__NameAssignment_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3953:1: ( rule__ADT__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getNameAssignment_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3954:1: ( rule__ADT__NameAssignment_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3954:2: rule__ADT__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__NameAssignment_1_in_rule__ADT__Group__1__Impl7934);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3964:1: rule__ADT__Group__2 : rule__ADT__Group__2__Impl rule__ADT__Group__3 ;
    public final void rule__ADT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3968:1: ( rule__ADT__Group__2__Impl rule__ADT__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3969:2: rule__ADT__Group__2__Impl rule__ADT__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__2__Impl_in_rule__ADT__Group__27964);
            rule__ADT__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__3_in_rule__ADT__Group__27967);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3976:1: rule__ADT__Group__2__Impl : ( 'Signature' ) ;
    public final void rule__ADT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3980:1: ( ( 'Signature' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3981:1: ( 'Signature' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3981:1: ( 'Signature' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3982:1: 'Signature'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getSignatureKeyword_2()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__ADT__Group__2__Impl7995); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3995:1: rule__ADT__Group__3 : rule__ADT__Group__3__Impl rule__ADT__Group__4 ;
    public final void rule__ADT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3999:1: ( rule__ADT__Group__3__Impl rule__ADT__Group__4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4000:2: rule__ADT__Group__3__Impl rule__ADT__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__3__Impl_in_rule__ADT__Group__38026);
            rule__ADT__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__4_in_rule__ADT__Group__38029);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4007:1: rule__ADT__Group__3__Impl : ( ( rule__ADT__SignatureAssignment_3 ) ) ;
    public final void rule__ADT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4011:1: ( ( ( rule__ADT__SignatureAssignment_3 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4012:1: ( ( rule__ADT__SignatureAssignment_3 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4012:1: ( ( rule__ADT__SignatureAssignment_3 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4013:1: ( rule__ADT__SignatureAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getSignatureAssignment_3()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4014:1: ( rule__ADT__SignatureAssignment_3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4014:2: rule__ADT__SignatureAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__SignatureAssignment_3_in_rule__ADT__Group__3__Impl8056);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4024:1: rule__ADT__Group__4 : rule__ADT__Group__4__Impl rule__ADT__Group__5 ;
    public final void rule__ADT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4028:1: ( rule__ADT__Group__4__Impl rule__ADT__Group__5 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4029:2: rule__ADT__Group__4__Impl rule__ADT__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__4__Impl_in_rule__ADT__Group__48086);
            rule__ADT__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__5_in_rule__ADT__Group__48089);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4036:1: rule__ADT__Group__4__Impl : ( ( rule__ADT__Group_4__0 )? ) ;
    public final void rule__ADT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4040:1: ( ( ( rule__ADT__Group_4__0 )? ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4041:1: ( ( rule__ADT__Group_4__0 )? )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4041:1: ( ( rule__ADT__Group_4__0 )? )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4042:1: ( rule__ADT__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getGroup_4()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4043:1: ( rule__ADT__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4043:2: rule__ADT__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_4__0_in_rule__ADT__Group__4__Impl8116);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4053:1: rule__ADT__Group__5 : rule__ADT__Group__5__Impl ;
    public final void rule__ADT__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4057:1: ( rule__ADT__Group__5__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4058:2: rule__ADT__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__5__Impl_in_rule__ADT__Group__58147);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4064:1: rule__ADT__Group__5__Impl : ( ( rule__ADT__Group_5__0 )? ) ;
    public final void rule__ADT__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4068:1: ( ( ( rule__ADT__Group_5__0 )? ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4069:1: ( ( rule__ADT__Group_5__0 )? )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4069:1: ( ( rule__ADT__Group_5__0 )? )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4070:1: ( rule__ADT__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getGroup_5()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4071:1: ( rule__ADT__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4071:2: rule__ADT__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_5__0_in_rule__ADT__Group__5__Impl8174);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4093:1: rule__ADT__Group_4__0 : rule__ADT__Group_4__0__Impl rule__ADT__Group_4__1 ;
    public final void rule__ADT__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4097:1: ( rule__ADT__Group_4__0__Impl rule__ADT__Group_4__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4098:2: rule__ADT__Group_4__0__Impl rule__ADT__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_4__0__Impl_in_rule__ADT__Group_4__08217);
            rule__ADT__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_4__1_in_rule__ADT__Group_4__08220);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4105:1: rule__ADT__Group_4__0__Impl : ( ( 'Axioms' ) ) ;
    public final void rule__ADT__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4109:1: ( ( ( 'Axioms' ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4110:1: ( ( 'Axioms' ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4110:1: ( ( 'Axioms' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4111:1: ( 'Axioms' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getAxiomsKeyword_4_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4112:1: ( 'Axioms' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4113:2: 'Axioms'
            {
            match(input,34,FollowSets000.FOLLOW_34_in_rule__ADT__Group_4__0__Impl8249); if (state.failed) return ;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4124:1: rule__ADT__Group_4__1 : rule__ADT__Group_4__1__Impl rule__ADT__Group_4__2 ;
    public final void rule__ADT__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4128:1: ( rule__ADT__Group_4__1__Impl rule__ADT__Group_4__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4129:2: rule__ADT__Group_4__1__Impl rule__ADT__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_4__1__Impl_in_rule__ADT__Group_4__18281);
            rule__ADT__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_4__2_in_rule__ADT__Group_4__18284);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4136:1: rule__ADT__Group_4__1__Impl : ( ( rule__ADT__EquationsAssignment_4_1 ) ) ;
    public final void rule__ADT__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4140:1: ( ( ( rule__ADT__EquationsAssignment_4_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4141:1: ( ( rule__ADT__EquationsAssignment_4_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4141:1: ( ( rule__ADT__EquationsAssignment_4_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4142:1: ( rule__ADT__EquationsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getEquationsAssignment_4_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4143:1: ( rule__ADT__EquationsAssignment_4_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4143:2: rule__ADT__EquationsAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__EquationsAssignment_4_1_in_rule__ADT__Group_4__1__Impl8311);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4153:1: rule__ADT__Group_4__2 : rule__ADT__Group_4__2__Impl ;
    public final void rule__ADT__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4157:1: ( rule__ADT__Group_4__2__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4158:2: rule__ADT__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_4__2__Impl_in_rule__ADT__Group_4__28341);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4164:1: rule__ADT__Group_4__2__Impl : ( ( rule__ADT__EquationsAssignment_4_2 )* ) ;
    public final void rule__ADT__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4168:1: ( ( ( rule__ADT__EquationsAssignment_4_2 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4169:1: ( ( rule__ADT__EquationsAssignment_4_2 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4169:1: ( ( rule__ADT__EquationsAssignment_4_2 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4170:1: ( rule__ADT__EquationsAssignment_4_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getEquationsAssignment_4_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4171:1: ( rule__ADT__EquationsAssignment_4_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==RULE_TERMVAR) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4171:2: rule__ADT__EquationsAssignment_4_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ADT__EquationsAssignment_4_2_in_rule__ADT__Group_4__2__Impl8368);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4187:1: rule__ADT__Group_5__0 : rule__ADT__Group_5__0__Impl rule__ADT__Group_5__1 ;
    public final void rule__ADT__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4191:1: ( rule__ADT__Group_5__0__Impl rule__ADT__Group_5__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4192:2: rule__ADT__Group_5__0__Impl rule__ADT__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_5__0__Impl_in_rule__ADT__Group_5__08405);
            rule__ADT__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_5__1_in_rule__ADT__Group_5__08408);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4199:1: rule__ADT__Group_5__0__Impl : ( ( 'Variables' ) ) ;
    public final void rule__ADT__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4203:1: ( ( ( 'Variables' ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4204:1: ( ( 'Variables' ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4204:1: ( ( 'Variables' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4205:1: ( 'Variables' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getVariablesKeyword_5_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4206:1: ( 'Variables' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4207:2: 'Variables'
            {
            match(input,35,FollowSets000.FOLLOW_35_in_rule__ADT__Group_5__0__Impl8437); if (state.failed) return ;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4218:1: rule__ADT__Group_5__1 : rule__ADT__Group_5__1__Impl rule__ADT__Group_5__2 ;
    public final void rule__ADT__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4222:1: ( rule__ADT__Group_5__1__Impl rule__ADT__Group_5__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4223:2: rule__ADT__Group_5__1__Impl rule__ADT__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_5__1__Impl_in_rule__ADT__Group_5__18469);
            rule__ADT__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_5__2_in_rule__ADT__Group_5__18472);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4230:1: rule__ADT__Group_5__1__Impl : ( ( rule__ADT__VariablesAssignment_5_1 ) ) ;
    public final void rule__ADT__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4234:1: ( ( ( rule__ADT__VariablesAssignment_5_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4235:1: ( ( rule__ADT__VariablesAssignment_5_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4235:1: ( ( rule__ADT__VariablesAssignment_5_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4236:1: ( rule__ADT__VariablesAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getVariablesAssignment_5_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4237:1: ( rule__ADT__VariablesAssignment_5_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4237:2: rule__ADT__VariablesAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__VariablesAssignment_5_1_in_rule__ADT__Group_5__1__Impl8499);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4247:1: rule__ADT__Group_5__2 : rule__ADT__Group_5__2__Impl ;
    public final void rule__ADT__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4251:1: ( rule__ADT__Group_5__2__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4252:2: rule__ADT__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_5__2__Impl_in_rule__ADT__Group_5__28529);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4258:1: rule__ADT__Group_5__2__Impl : ( ( rule__ADT__VariablesAssignment_5_2 )* ) ;
    public final void rule__ADT__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4262:1: ( ( ( rule__ADT__VariablesAssignment_5_2 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4263:1: ( ( rule__ADT__VariablesAssignment_5_2 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4263:1: ( ( rule__ADT__VariablesAssignment_5_2 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4264:1: ( rule__ADT__VariablesAssignment_5_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getVariablesAssignment_5_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4265:1: ( rule__ADT__VariablesAssignment_5_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4265:2: rule__ADT__VariablesAssignment_5_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ADT__VariablesAssignment_5_2_in_rule__ADT__Group_5__2__Impl8556);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4281:1: rule__Signature__Group__0 : rule__Signature__Group__0__Impl rule__Signature__Group__1 ;
    public final void rule__Signature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4285:1: ( rule__Signature__Group__0__Impl rule__Signature__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4286:2: rule__Signature__Group__0__Impl rule__Signature__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group__0__Impl_in_rule__Signature__Group__08593);
            rule__Signature__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group__1_in_rule__Signature__Group__08596);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4293:1: rule__Signature__Group__0__Impl : ( 'Sorts' ) ;
    public final void rule__Signature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4297:1: ( ( 'Sorts' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4298:1: ( 'Sorts' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4298:1: ( 'Sorts' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4299:1: 'Sorts'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getSortsKeyword_0()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Signature__Group__0__Impl8624); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4312:1: rule__Signature__Group__1 : rule__Signature__Group__1__Impl rule__Signature__Group__2 ;
    public final void rule__Signature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4316:1: ( rule__Signature__Group__1__Impl rule__Signature__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4317:2: rule__Signature__Group__1__Impl rule__Signature__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group__1__Impl_in_rule__Signature__Group__18655);
            rule__Signature__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group__2_in_rule__Signature__Group__18658);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4324:1: rule__Signature__Group__1__Impl : ( ( rule__Signature__SortsAssignment_1 ) ) ;
    public final void rule__Signature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4328:1: ( ( ( rule__Signature__SortsAssignment_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4329:1: ( ( rule__Signature__SortsAssignment_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4329:1: ( ( rule__Signature__SortsAssignment_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4330:1: ( rule__Signature__SortsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getSortsAssignment_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4331:1: ( rule__Signature__SortsAssignment_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4331:2: rule__Signature__SortsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__SortsAssignment_1_in_rule__Signature__Group__1__Impl8685);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4341:1: rule__Signature__Group__2 : rule__Signature__Group__2__Impl rule__Signature__Group__3 ;
    public final void rule__Signature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4345:1: ( rule__Signature__Group__2__Impl rule__Signature__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4346:2: rule__Signature__Group__2__Impl rule__Signature__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group__2__Impl_in_rule__Signature__Group__28715);
            rule__Signature__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group__3_in_rule__Signature__Group__28718);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4353:1: rule__Signature__Group__2__Impl : ( ( rule__Signature__Group_2__0 )* ) ;
    public final void rule__Signature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4357:1: ( ( ( rule__Signature__Group_2__0 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4358:1: ( ( rule__Signature__Group_2__0 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4358:1: ( ( rule__Signature__Group_2__0 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4359:1: ( rule__Signature__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getGroup_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4360:1: ( rule__Signature__Group_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==19) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4360:2: rule__Signature__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_2__0_in_rule__Signature__Group__2__Impl8745);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4370:1: rule__Signature__Group__3 : rule__Signature__Group__3__Impl rule__Signature__Group__4 ;
    public final void rule__Signature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4374:1: ( rule__Signature__Group__3__Impl rule__Signature__Group__4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4375:2: rule__Signature__Group__3__Impl rule__Signature__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group__3__Impl_in_rule__Signature__Group__38776);
            rule__Signature__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group__4_in_rule__Signature__Group__38779);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4382:1: rule__Signature__Group__3__Impl : ( ( rule__Signature__Group_3__0 ) ) ;
    public final void rule__Signature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4386:1: ( ( ( rule__Signature__Group_3__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4387:1: ( ( rule__Signature__Group_3__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4387:1: ( ( rule__Signature__Group_3__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4388:1: ( rule__Signature__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getGroup_3()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4389:1: ( rule__Signature__Group_3__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4389:2: rule__Signature__Group_3__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_3__0_in_rule__Signature__Group__3__Impl8806);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4399:1: rule__Signature__Group__4 : rule__Signature__Group__4__Impl ;
    public final void rule__Signature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4403:1: ( rule__Signature__Group__4__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4404:2: rule__Signature__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group__4__Impl_in_rule__Signature__Group__48836);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4410:1: rule__Signature__Group__4__Impl : ( ( rule__Signature__Group_4__0 )? ) ;
    public final void rule__Signature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4414:1: ( ( ( rule__Signature__Group_4__0 )? ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4415:1: ( ( rule__Signature__Group_4__0 )? )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4415:1: ( ( rule__Signature__Group_4__0 )? )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4416:1: ( rule__Signature__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getGroup_4()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4417:1: ( rule__Signature__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4417:2: rule__Signature__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_4__0_in_rule__Signature__Group__4__Impl8863);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4437:1: rule__Signature__Group_2__0 : rule__Signature__Group_2__0__Impl rule__Signature__Group_2__1 ;
    public final void rule__Signature__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4441:1: ( rule__Signature__Group_2__0__Impl rule__Signature__Group_2__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4442:2: rule__Signature__Group_2__0__Impl rule__Signature__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_2__0__Impl_in_rule__Signature__Group_2__08904);
            rule__Signature__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_2__1_in_rule__Signature__Group_2__08907);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4449:1: rule__Signature__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Signature__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4453:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4454:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4454:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4455:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getCommaKeyword_2_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Signature__Group_2__0__Impl8935); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4468:1: rule__Signature__Group_2__1 : rule__Signature__Group_2__1__Impl ;
    public final void rule__Signature__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4472:1: ( rule__Signature__Group_2__1__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4473:2: rule__Signature__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_2__1__Impl_in_rule__Signature__Group_2__18966);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4479:1: rule__Signature__Group_2__1__Impl : ( ( rule__Signature__SortsAssignment_2_1 ) ) ;
    public final void rule__Signature__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4483:1: ( ( ( rule__Signature__SortsAssignment_2_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4484:1: ( ( rule__Signature__SortsAssignment_2_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4484:1: ( ( rule__Signature__SortsAssignment_2_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4485:1: ( rule__Signature__SortsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getSortsAssignment_2_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4486:1: ( rule__Signature__SortsAssignment_2_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4486:2: rule__Signature__SortsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__SortsAssignment_2_1_in_rule__Signature__Group_2__1__Impl8993);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4500:1: rule__Signature__Group_3__0 : rule__Signature__Group_3__0__Impl rule__Signature__Group_3__1 ;
    public final void rule__Signature__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4504:1: ( rule__Signature__Group_3__0__Impl rule__Signature__Group_3__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4505:2: rule__Signature__Group_3__0__Impl rule__Signature__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_3__0__Impl_in_rule__Signature__Group_3__09027);
            rule__Signature__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_3__1_in_rule__Signature__Group_3__09030);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4512:1: rule__Signature__Group_3__0__Impl : ( ( 'Generators' ) ) ;
    public final void rule__Signature__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4516:1: ( ( ( 'Generators' ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4517:1: ( ( 'Generators' ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4517:1: ( ( 'Generators' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4518:1: ( 'Generators' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getGeneratorsKeyword_3_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4519:1: ( 'Generators' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4520:2: 'Generators'
            {
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Signature__Group_3__0__Impl9059); if (state.failed) return ;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4531:1: rule__Signature__Group_3__1 : rule__Signature__Group_3__1__Impl rule__Signature__Group_3__2 ;
    public final void rule__Signature__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4535:1: ( rule__Signature__Group_3__1__Impl rule__Signature__Group_3__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4536:2: rule__Signature__Group_3__1__Impl rule__Signature__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_3__1__Impl_in_rule__Signature__Group_3__19091);
            rule__Signature__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_3__2_in_rule__Signature__Group_3__19094);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4543:1: rule__Signature__Group_3__1__Impl : ( ( rule__Signature__GeneratorsAssignment_3_1 ) ) ;
    public final void rule__Signature__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4547:1: ( ( ( rule__Signature__GeneratorsAssignment_3_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4548:1: ( ( rule__Signature__GeneratorsAssignment_3_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4548:1: ( ( rule__Signature__GeneratorsAssignment_3_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4549:1: ( rule__Signature__GeneratorsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getGeneratorsAssignment_3_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4550:1: ( rule__Signature__GeneratorsAssignment_3_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4550:2: rule__Signature__GeneratorsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__GeneratorsAssignment_3_1_in_rule__Signature__Group_3__1__Impl9121);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4560:1: rule__Signature__Group_3__2 : rule__Signature__Group_3__2__Impl ;
    public final void rule__Signature__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4564:1: ( rule__Signature__Group_3__2__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4565:2: rule__Signature__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_3__2__Impl_in_rule__Signature__Group_3__29151);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4571:1: rule__Signature__Group_3__2__Impl : ( ( rule__Signature__GeneratorsAssignment_3_2 )* ) ;
    public final void rule__Signature__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4575:1: ( ( ( rule__Signature__GeneratorsAssignment_3_2 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4576:1: ( ( rule__Signature__GeneratorsAssignment_3_2 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4576:1: ( ( rule__Signature__GeneratorsAssignment_3_2 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4577:1: ( rule__Signature__GeneratorsAssignment_3_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getGeneratorsAssignment_3_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4578:1: ( rule__Signature__GeneratorsAssignment_3_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4578:2: rule__Signature__GeneratorsAssignment_3_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Signature__GeneratorsAssignment_3_2_in_rule__Signature__Group_3__2__Impl9178);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4594:1: rule__Signature__Group_4__0 : rule__Signature__Group_4__0__Impl rule__Signature__Group_4__1 ;
    public final void rule__Signature__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4598:1: ( rule__Signature__Group_4__0__Impl rule__Signature__Group_4__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4599:2: rule__Signature__Group_4__0__Impl rule__Signature__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_4__0__Impl_in_rule__Signature__Group_4__09215);
            rule__Signature__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_4__1_in_rule__Signature__Group_4__09218);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4606:1: rule__Signature__Group_4__0__Impl : ( ( 'Operations' ) ) ;
    public final void rule__Signature__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4610:1: ( ( ( 'Operations' ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4611:1: ( ( 'Operations' ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4611:1: ( ( 'Operations' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4612:1: ( 'Operations' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getOperationsKeyword_4_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4613:1: ( 'Operations' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4614:2: 'Operations'
            {
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Signature__Group_4__0__Impl9247); if (state.failed) return ;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4625:1: rule__Signature__Group_4__1 : rule__Signature__Group_4__1__Impl rule__Signature__Group_4__2 ;
    public final void rule__Signature__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4629:1: ( rule__Signature__Group_4__1__Impl rule__Signature__Group_4__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4630:2: rule__Signature__Group_4__1__Impl rule__Signature__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_4__1__Impl_in_rule__Signature__Group_4__19279);
            rule__Signature__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_4__2_in_rule__Signature__Group_4__19282);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4637:1: rule__Signature__Group_4__1__Impl : ( ( rule__Signature__OperationsAssignment_4_1 ) ) ;
    public final void rule__Signature__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4641:1: ( ( ( rule__Signature__OperationsAssignment_4_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4642:1: ( ( rule__Signature__OperationsAssignment_4_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4642:1: ( ( rule__Signature__OperationsAssignment_4_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4643:1: ( rule__Signature__OperationsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getOperationsAssignment_4_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4644:1: ( rule__Signature__OperationsAssignment_4_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4644:2: rule__Signature__OperationsAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__OperationsAssignment_4_1_in_rule__Signature__Group_4__1__Impl9309);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4654:1: rule__Signature__Group_4__2 : rule__Signature__Group_4__2__Impl ;
    public final void rule__Signature__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4658:1: ( rule__Signature__Group_4__2__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4659:2: rule__Signature__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_4__2__Impl_in_rule__Signature__Group_4__29339);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4665:1: rule__Signature__Group_4__2__Impl : ( ( rule__Signature__OperationsAssignment_4_2 )* ) ;
    public final void rule__Signature__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4669:1: ( ( ( rule__Signature__OperationsAssignment_4_2 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4670:1: ( ( rule__Signature__OperationsAssignment_4_2 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4670:1: ( ( rule__Signature__OperationsAssignment_4_2 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4671:1: ( rule__Signature__OperationsAssignment_4_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getOperationsAssignment_4_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4672:1: ( rule__Signature__OperationsAssignment_4_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4672:2: rule__Signature__OperationsAssignment_4_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Signature__OperationsAssignment_4_2_in_rule__Signature__Group_4__2__Impl9366);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4688:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4692:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4693:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__09403);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__09406);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4700:1: rule__VariableDeclaration__Group__0__Impl : ( ( rule__VariableDeclaration__NameAssignment_0 ) ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4704:1: ( ( ( rule__VariableDeclaration__NameAssignment_0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4705:1: ( ( rule__VariableDeclaration__NameAssignment_0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4705:1: ( ( rule__VariableDeclaration__NameAssignment_0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4706:1: ( rule__VariableDeclaration__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4707:1: ( rule__VariableDeclaration__NameAssignment_0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4707:2: rule__VariableDeclaration__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableDeclaration__NameAssignment_0_in_rule__VariableDeclaration__Group__0__Impl9433);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4717:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4721:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4722:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__19463);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__19466);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4729:1: rule__VariableDeclaration__Group__1__Impl : ( ':' ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4733:1: ( ( ':' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4734:1: ( ':' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4734:1: ( ':' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4735:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getColonKeyword_1()); 
            }
            match(input,39,FollowSets000.FOLLOW_39_in_rule__VariableDeclaration__Group__1__Impl9494); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4748:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4752:1: ( rule__VariableDeclaration__Group__2__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4753:2: rule__VariableDeclaration__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__29525);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4759:1: rule__VariableDeclaration__Group__2__Impl : ( ( rule__VariableDeclaration__SortAssignment_2 ) ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4763:1: ( ( ( rule__VariableDeclaration__SortAssignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4764:1: ( ( rule__VariableDeclaration__SortAssignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4764:1: ( ( rule__VariableDeclaration__SortAssignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4765:1: ( rule__VariableDeclaration__SortAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getSortAssignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4766:1: ( rule__VariableDeclaration__SortAssignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4766:2: rule__VariableDeclaration__SortAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableDeclaration__SortAssignment_2_in_rule__VariableDeclaration__Group__2__Impl9552);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4782:1: rule__Equation__Group__0 : rule__Equation__Group__0__Impl rule__Equation__Group__1 ;
    public final void rule__Equation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4786:1: ( rule__Equation__Group__0__Impl rule__Equation__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4787:2: rule__Equation__Group__0__Impl rule__Equation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equation__Group__0__Impl_in_rule__Equation__Group__09588);
            rule__Equation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Equation__Group__1_in_rule__Equation__Group__09591);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4794:1: rule__Equation__Group__0__Impl : ( ( rule__Equation__LeftHandTermAssignment_0 ) ) ;
    public final void rule__Equation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4798:1: ( ( ( rule__Equation__LeftHandTermAssignment_0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4799:1: ( ( rule__Equation__LeftHandTermAssignment_0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4799:1: ( ( rule__Equation__LeftHandTermAssignment_0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4800:1: ( rule__Equation__LeftHandTermAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getLeftHandTermAssignment_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4801:1: ( rule__Equation__LeftHandTermAssignment_0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4801:2: rule__Equation__LeftHandTermAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equation__LeftHandTermAssignment_0_in_rule__Equation__Group__0__Impl9618);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4811:1: rule__Equation__Group__1 : rule__Equation__Group__1__Impl rule__Equation__Group__2 ;
    public final void rule__Equation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4815:1: ( rule__Equation__Group__1__Impl rule__Equation__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4816:2: rule__Equation__Group__1__Impl rule__Equation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equation__Group__1__Impl_in_rule__Equation__Group__19648);
            rule__Equation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Equation__Group__2_in_rule__Equation__Group__19651);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4823:1: rule__Equation__Group__1__Impl : ( '=' ) ;
    public final void rule__Equation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4827:1: ( ( '=' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4828:1: ( '=' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4828:1: ( '=' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4829:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getEqualsSignKeyword_1()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Equation__Group__1__Impl9679); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4842:1: rule__Equation__Group__2 : rule__Equation__Group__2__Impl ;
    public final void rule__Equation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4846:1: ( rule__Equation__Group__2__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4847:2: rule__Equation__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equation__Group__2__Impl_in_rule__Equation__Group__29710);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4853:1: rule__Equation__Group__2__Impl : ( ( rule__Equation__RightHandTermAssignment_2 ) ) ;
    public final void rule__Equation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4857:1: ( ( ( rule__Equation__RightHandTermAssignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4858:1: ( ( rule__Equation__RightHandTermAssignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4858:1: ( ( rule__Equation__RightHandTermAssignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4859:1: ( rule__Equation__RightHandTermAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getRightHandTermAssignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4860:1: ( rule__Equation__RightHandTermAssignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4860:2: rule__Equation__RightHandTermAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equation__RightHandTermAssignment_2_in_rule__Equation__Group__2__Impl9737);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4876:1: rule__RewriteRule__Group__0 : rule__RewriteRule__Group__0__Impl rule__RewriteRule__Group__1 ;
    public final void rule__RewriteRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4880:1: ( rule__RewriteRule__Group__0__Impl rule__RewriteRule__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4881:2: rule__RewriteRule__Group__0__Impl rule__RewriteRule__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RewriteRule__Group__0__Impl_in_rule__RewriteRule__Group__09773);
            rule__RewriteRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__RewriteRule__Group__1_in_rule__RewriteRule__Group__09776);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4888:1: rule__RewriteRule__Group__0__Impl : ( ( rule__RewriteRule__LeftHandTermAssignment_0 ) ) ;
    public final void rule__RewriteRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4892:1: ( ( ( rule__RewriteRule__LeftHandTermAssignment_0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4893:1: ( ( rule__RewriteRule__LeftHandTermAssignment_0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4893:1: ( ( rule__RewriteRule__LeftHandTermAssignment_0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4894:1: ( rule__RewriteRule__LeftHandTermAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRewriteRuleAccess().getLeftHandTermAssignment_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4895:1: ( rule__RewriteRule__LeftHandTermAssignment_0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4895:2: rule__RewriteRule__LeftHandTermAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RewriteRule__LeftHandTermAssignment_0_in_rule__RewriteRule__Group__0__Impl9803);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4905:1: rule__RewriteRule__Group__1 : rule__RewriteRule__Group__1__Impl rule__RewriteRule__Group__2 ;
    public final void rule__RewriteRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4909:1: ( rule__RewriteRule__Group__1__Impl rule__RewriteRule__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4910:2: rule__RewriteRule__Group__1__Impl rule__RewriteRule__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RewriteRule__Group__1__Impl_in_rule__RewriteRule__Group__19833);
            rule__RewriteRule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__RewriteRule__Group__2_in_rule__RewriteRule__Group__19836);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4917:1: rule__RewriteRule__Group__1__Impl : ( '->' ) ;
    public final void rule__RewriteRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4921:1: ( ( '->' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4922:1: ( '->' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4922:1: ( '->' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4923:1: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRewriteRuleAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            }
            match(input,40,FollowSets000.FOLLOW_40_in_rule__RewriteRule__Group__1__Impl9864); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4936:1: rule__RewriteRule__Group__2 : rule__RewriteRule__Group__2__Impl ;
    public final void rule__RewriteRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4940:1: ( rule__RewriteRule__Group__2__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4941:2: rule__RewriteRule__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RewriteRule__Group__2__Impl_in_rule__RewriteRule__Group__29895);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4947:1: rule__RewriteRule__Group__2__Impl : ( ( rule__RewriteRule__RightHandTermAssignment_2 ) ) ;
    public final void rule__RewriteRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4951:1: ( ( ( rule__RewriteRule__RightHandTermAssignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4952:1: ( ( rule__RewriteRule__RightHandTermAssignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4952:1: ( ( rule__RewriteRule__RightHandTermAssignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4953:1: ( rule__RewriteRule__RightHandTermAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRewriteRuleAccess().getRightHandTermAssignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4954:1: ( rule__RewriteRule__RightHandTermAssignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4954:2: rule__RewriteRule__RightHandTermAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RewriteRule__RightHandTermAssignment_2_in_rule__RewriteRule__Group__2__Impl9922);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4970:1: rule__SubSort__Group__0 : rule__SubSort__Group__0__Impl rule__SubSort__Group__1 ;
    public final void rule__SubSort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4974:1: ( rule__SubSort__Group__0__Impl rule__SubSort__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4975:2: rule__SubSort__Group__0__Impl rule__SubSort__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubSort__Group__0__Impl_in_rule__SubSort__Group__09958);
            rule__SubSort__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SubSort__Group__1_in_rule__SubSort__Group__09961);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4982:1: rule__SubSort__Group__0__Impl : ( ( rule__SubSort__NameAssignment_0 ) ) ;
    public final void rule__SubSort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4986:1: ( ( ( rule__SubSort__NameAssignment_0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4987:1: ( ( rule__SubSort__NameAssignment_0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4987:1: ( ( rule__SubSort__NameAssignment_0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4988:1: ( rule__SubSort__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubSortAccess().getNameAssignment_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4989:1: ( rule__SubSort__NameAssignment_0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4989:2: rule__SubSort__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubSort__NameAssignment_0_in_rule__SubSort__Group__0__Impl9988);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4999:1: rule__SubSort__Group__1 : rule__SubSort__Group__1__Impl rule__SubSort__Group__2 ;
    public final void rule__SubSort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5003:1: ( rule__SubSort__Group__1__Impl rule__SubSort__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5004:2: rule__SubSort__Group__1__Impl rule__SubSort__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubSort__Group__1__Impl_in_rule__SubSort__Group__110018);
            rule__SubSort__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SubSort__Group__2_in_rule__SubSort__Group__110021);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5011:1: rule__SubSort__Group__1__Impl : ( '<' ) ;
    public final void rule__SubSort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5015:1: ( ( '<' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5016:1: ( '<' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5016:1: ( '<' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5017:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubSortAccess().getLessThanSignKeyword_1()); 
            }
            match(input,41,FollowSets000.FOLLOW_41_in_rule__SubSort__Group__1__Impl10049); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5030:1: rule__SubSort__Group__2 : rule__SubSort__Group__2__Impl ;
    public final void rule__SubSort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5034:1: ( rule__SubSort__Group__2__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5035:2: rule__SubSort__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubSort__Group__2__Impl_in_rule__SubSort__Group__210080);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5041:1: rule__SubSort__Group__2__Impl : ( ( rule__SubSort__SuperSortAssignment_2 ) ) ;
    public final void rule__SubSort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5045:1: ( ( ( rule__SubSort__SuperSortAssignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5046:1: ( ( rule__SubSort__SuperSortAssignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5046:1: ( ( rule__SubSort__SuperSortAssignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5047:1: ( rule__SubSort__SuperSortAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubSortAccess().getSuperSortAssignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5048:1: ( rule__SubSort__SuperSortAssignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5048:2: rule__SubSort__SuperSortAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubSort__SuperSortAssignment_2_in_rule__SubSort__Group__2__Impl10107);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5064:1: rule__Sort__Group__0 : rule__Sort__Group__0__Impl rule__Sort__Group__1 ;
    public final void rule__Sort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5068:1: ( rule__Sort__Group__0__Impl rule__Sort__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5069:2: rule__Sort__Group__0__Impl rule__Sort__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sort__Group__0__Impl_in_rule__Sort__Group__010143);
            rule__Sort__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Sort__Group__1_in_rule__Sort__Group__010146);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5076:1: rule__Sort__Group__0__Impl : ( () ) ;
    public final void rule__Sort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5080:1: ( ( () ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5081:1: ( () )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5081:1: ( () )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5082:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSortAccess().getSortAction_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5083:1: ()
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5085:1: 
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5095:1: rule__Sort__Group__1 : rule__Sort__Group__1__Impl ;
    public final void rule__Sort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5099:1: ( rule__Sort__Group__1__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5100:2: rule__Sort__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sort__Group__1__Impl_in_rule__Sort__Group__110204);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5106:1: rule__Sort__Group__1__Impl : ( ( rule__Sort__NameAssignment_1 ) ) ;
    public final void rule__Sort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5110:1: ( ( ( rule__Sort__NameAssignment_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5111:1: ( ( rule__Sort__NameAssignment_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5111:1: ( ( rule__Sort__NameAssignment_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5112:1: ( rule__Sort__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSortAccess().getNameAssignment_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5113:1: ( rule__Sort__NameAssignment_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5113:2: rule__Sort__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sort__NameAssignment_1_in_rule__Sort__Group__1__Impl10231);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5127:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5131:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5132:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__010265);
            rule__Term__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group__1_in_rule__Term__Group__010268);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5139:1: rule__Term__Group__0__Impl : ( () ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5143:1: ( ( () ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5144:1: ( () )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5144:1: ( () )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5145:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getTermAction_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5146:1: ()
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5148:1: 
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5158:1: rule__Term__Group__1 : rule__Term__Group__1__Impl rule__Term__Group__2 ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5162:1: ( rule__Term__Group__1__Impl rule__Term__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5163:2: rule__Term__Group__1__Impl rule__Term__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__110326);
            rule__Term__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group__2_in_rule__Term__Group__110329);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5170:1: rule__Term__Group__1__Impl : ( ( rule__Term__OperationSymbolAssignment_1 ) ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5174:1: ( ( ( rule__Term__OperationSymbolAssignment_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5175:1: ( ( rule__Term__OperationSymbolAssignment_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5175:1: ( ( rule__Term__OperationSymbolAssignment_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5176:1: ( rule__Term__OperationSymbolAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getOperationSymbolAssignment_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5177:1: ( rule__Term__OperationSymbolAssignment_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5177:2: rule__Term__OperationSymbolAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__OperationSymbolAssignment_1_in_rule__Term__Group__1__Impl10356);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5187:1: rule__Term__Group__2 : rule__Term__Group__2__Impl ;
    public final void rule__Term__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5191:1: ( rule__Term__Group__2__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5192:2: rule__Term__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group__2__Impl_in_rule__Term__Group__210386);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5198:1: rule__Term__Group__2__Impl : ( ( rule__Term__Group_2__0 )? ) ;
    public final void rule__Term__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5202:1: ( ( ( rule__Term__Group_2__0 )? ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5203:1: ( ( rule__Term__Group_2__0 )? )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5203:1: ( ( rule__Term__Group_2__0 )? )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5204:1: ( rule__Term__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getGroup_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5205:1: ( rule__Term__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==17) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5205:2: rule__Term__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2__0_in_rule__Term__Group__2__Impl10413);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5221:1: rule__Term__Group_2__0 : rule__Term__Group_2__0__Impl rule__Term__Group_2__1 ;
    public final void rule__Term__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5225:1: ( rule__Term__Group_2__0__Impl rule__Term__Group_2__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5226:2: rule__Term__Group_2__0__Impl rule__Term__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2__0__Impl_in_rule__Term__Group_2__010450);
            rule__Term__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2__1_in_rule__Term__Group_2__010453);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5233:1: rule__Term__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Term__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5237:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5238:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5238:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5239:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Term__Group_2__0__Impl10481); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5252:1: rule__Term__Group_2__1 : rule__Term__Group_2__1__Impl rule__Term__Group_2__2 ;
    public final void rule__Term__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5256:1: ( rule__Term__Group_2__1__Impl rule__Term__Group_2__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5257:2: rule__Term__Group_2__1__Impl rule__Term__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2__1__Impl_in_rule__Term__Group_2__110512);
            rule__Term__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2__2_in_rule__Term__Group_2__110515);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5264:1: rule__Term__Group_2__1__Impl : ( ( rule__Term__SubtermsAssignment_2_1 ) ) ;
    public final void rule__Term__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5268:1: ( ( ( rule__Term__SubtermsAssignment_2_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5269:1: ( ( rule__Term__SubtermsAssignment_2_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5269:1: ( ( rule__Term__SubtermsAssignment_2_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5270:1: ( rule__Term__SubtermsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getSubtermsAssignment_2_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5271:1: ( rule__Term__SubtermsAssignment_2_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5271:2: rule__Term__SubtermsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__SubtermsAssignment_2_1_in_rule__Term__Group_2__1__Impl10542);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5281:1: rule__Term__Group_2__2 : rule__Term__Group_2__2__Impl rule__Term__Group_2__3 ;
    public final void rule__Term__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5285:1: ( rule__Term__Group_2__2__Impl rule__Term__Group_2__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5286:2: rule__Term__Group_2__2__Impl rule__Term__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2__2__Impl_in_rule__Term__Group_2__210572);
            rule__Term__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2__3_in_rule__Term__Group_2__210575);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5293:1: rule__Term__Group_2__2__Impl : ( ( rule__Term__Group_2_2__0 )* ) ;
    public final void rule__Term__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5297:1: ( ( ( rule__Term__Group_2_2__0 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5298:1: ( ( rule__Term__Group_2_2__0 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5298:1: ( ( rule__Term__Group_2_2__0 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5299:1: ( rule__Term__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getGroup_2_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5300:1: ( rule__Term__Group_2_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==19) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5300:2: rule__Term__Group_2_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2_2__0_in_rule__Term__Group_2__2__Impl10602);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5310:1: rule__Term__Group_2__3 : rule__Term__Group_2__3__Impl ;
    public final void rule__Term__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5314:1: ( rule__Term__Group_2__3__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5315:2: rule__Term__Group_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2__3__Impl_in_rule__Term__Group_2__310633);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5321:1: rule__Term__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Term__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5325:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5326:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5326:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5327:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Term__Group_2__3__Impl10661); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5348:1: rule__Term__Group_2_2__0 : rule__Term__Group_2_2__0__Impl rule__Term__Group_2_2__1 ;
    public final void rule__Term__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5352:1: ( rule__Term__Group_2_2__0__Impl rule__Term__Group_2_2__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5353:2: rule__Term__Group_2_2__0__Impl rule__Term__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2_2__0__Impl_in_rule__Term__Group_2_2__010700);
            rule__Term__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2_2__1_in_rule__Term__Group_2_2__010703);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5360:1: rule__Term__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Term__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5364:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5365:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5365:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5366:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Term__Group_2_2__0__Impl10731); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5379:1: rule__Term__Group_2_2__1 : rule__Term__Group_2_2__1__Impl ;
    public final void rule__Term__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5383:1: ( rule__Term__Group_2_2__1__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5384:2: rule__Term__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2_2__1__Impl_in_rule__Term__Group_2_2__110762);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5390:1: rule__Term__Group_2_2__1__Impl : ( ( rule__Term__SubtermsAssignment_2_2_1 ) ) ;
    public final void rule__Term__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5394:1: ( ( ( rule__Term__SubtermsAssignment_2_2_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5395:1: ( ( rule__Term__SubtermsAssignment_2_2_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5395:1: ( ( rule__Term__SubtermsAssignment_2_2_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5396:1: ( rule__Term__SubtermsAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getSubtermsAssignment_2_2_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5397:1: ( rule__Term__SubtermsAssignment_2_2_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5397:2: rule__Term__SubtermsAssignment_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__SubtermsAssignment_2_2_1_in_rule__Term__Group_2_2__1__Impl10789);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5411:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5415:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5416:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__010823);
            rule__Variable__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__010826);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5423:1: rule__Variable__Group__0__Impl : ( () ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5427:1: ( ( () ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5428:1: ( () )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5428:1: ( () )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5429:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getVariableAction_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5430:1: ()
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5432:1: 
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5442:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5446:1: ( rule__Variable__Group__1__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5447:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__110884);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5453:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__DeclarationAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5457:1: ( ( ( rule__Variable__DeclarationAssignment_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5458:1: ( ( rule__Variable__DeclarationAssignment_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5458:1: ( ( rule__Variable__DeclarationAssignment_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5459:1: ( rule__Variable__DeclarationAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getDeclarationAssignment_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5460:1: ( rule__Variable__DeclarationAssignment_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5460:2: rule__Variable__DeclarationAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__DeclarationAssignment_1_in_rule__Variable__Group__1__Impl10911);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5474:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5478:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5479:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__010945);
            rule__Operation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__010948);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5486:1: rule__Operation__Group__0__Impl : ( ( rule__Operation__NameAssignment_0 ) ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5490:1: ( ( ( rule__Operation__NameAssignment_0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5491:1: ( ( rule__Operation__NameAssignment_0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5491:1: ( ( rule__Operation__NameAssignment_0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5492:1: ( rule__Operation__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getNameAssignment_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5493:1: ( rule__Operation__NameAssignment_0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5493:2: rule__Operation__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__NameAssignment_0_in_rule__Operation__Group__0__Impl10975);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5503:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5507:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5508:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__111005);
            rule__Operation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__111008);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5515:1: rule__Operation__Group__1__Impl : ( ':' ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5519:1: ( ( ':' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5520:1: ( ':' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5520:1: ( ':' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5521:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getColonKeyword_1()); 
            }
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Operation__Group__1__Impl11036); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5534:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5538:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5539:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__211067);
            rule__Operation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__211070);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5546:1: rule__Operation__Group__2__Impl : ( ( rule__Operation__Group_2__0 )? ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5550:1: ( ( ( rule__Operation__Group_2__0 )? ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5551:1: ( ( rule__Operation__Group_2__0 )? )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5551:1: ( ( rule__Operation__Group_2__0 )? )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5552:1: ( rule__Operation__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5553:1: ( rule__Operation__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==19||LA24_1==40) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5553:2: rule__Operation__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_2__0_in_rule__Operation__Group__2__Impl11097);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5563:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5567:1: ( rule__Operation__Group__3__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5568:2: rule__Operation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__311128);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5574:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__ReturnTypeAssignment_3 ) ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5578:1: ( ( ( rule__Operation__ReturnTypeAssignment_3 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5579:1: ( ( rule__Operation__ReturnTypeAssignment_3 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5579:1: ( ( rule__Operation__ReturnTypeAssignment_3 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5580:1: ( rule__Operation__ReturnTypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getReturnTypeAssignment_3()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5581:1: ( rule__Operation__ReturnTypeAssignment_3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5581:2: rule__Operation__ReturnTypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__ReturnTypeAssignment_3_in_rule__Operation__Group__3__Impl11155);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5599:1: rule__Operation__Group_2__0 : rule__Operation__Group_2__0__Impl rule__Operation__Group_2__1 ;
    public final void rule__Operation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5603:1: ( rule__Operation__Group_2__0__Impl rule__Operation__Group_2__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5604:2: rule__Operation__Group_2__0__Impl rule__Operation__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_2__0__Impl_in_rule__Operation__Group_2__011193);
            rule__Operation__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_2__1_in_rule__Operation__Group_2__011196);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5611:1: rule__Operation__Group_2__0__Impl : ( ( rule__Operation__FormalParametersAssignment_2_0 ) ) ;
    public final void rule__Operation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5615:1: ( ( ( rule__Operation__FormalParametersAssignment_2_0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5616:1: ( ( rule__Operation__FormalParametersAssignment_2_0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5616:1: ( ( rule__Operation__FormalParametersAssignment_2_0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5617:1: ( rule__Operation__FormalParametersAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getFormalParametersAssignment_2_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5618:1: ( rule__Operation__FormalParametersAssignment_2_0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5618:2: rule__Operation__FormalParametersAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__FormalParametersAssignment_2_0_in_rule__Operation__Group_2__0__Impl11223);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5628:1: rule__Operation__Group_2__1 : rule__Operation__Group_2__1__Impl rule__Operation__Group_2__2 ;
    public final void rule__Operation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5632:1: ( rule__Operation__Group_2__1__Impl rule__Operation__Group_2__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5633:2: rule__Operation__Group_2__1__Impl rule__Operation__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_2__1__Impl_in_rule__Operation__Group_2__111253);
            rule__Operation__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_2__2_in_rule__Operation__Group_2__111256);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5640:1: rule__Operation__Group_2__1__Impl : ( ( rule__Operation__Group_2_1__0 )* ) ;
    public final void rule__Operation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5644:1: ( ( ( rule__Operation__Group_2_1__0 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5645:1: ( ( rule__Operation__Group_2_1__0 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5645:1: ( ( rule__Operation__Group_2_1__0 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5646:1: ( rule__Operation__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup_2_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5647:1: ( rule__Operation__Group_2_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==19) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5647:2: rule__Operation__Group_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_2_1__0_in_rule__Operation__Group_2__1__Impl11283);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5657:1: rule__Operation__Group_2__2 : rule__Operation__Group_2__2__Impl ;
    public final void rule__Operation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5661:1: ( rule__Operation__Group_2__2__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5662:2: rule__Operation__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_2__2__Impl_in_rule__Operation__Group_2__211314);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5668:1: rule__Operation__Group_2__2__Impl : ( '->' ) ;
    public final void rule__Operation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5672:1: ( ( '->' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5673:1: ( '->' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5673:1: ( '->' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5674:1: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getHyphenMinusGreaterThanSignKeyword_2_2()); 
            }
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Operation__Group_2__2__Impl11342); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5693:1: rule__Operation__Group_2_1__0 : rule__Operation__Group_2_1__0__Impl rule__Operation__Group_2_1__1 ;
    public final void rule__Operation__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5697:1: ( rule__Operation__Group_2_1__0__Impl rule__Operation__Group_2_1__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5698:2: rule__Operation__Group_2_1__0__Impl rule__Operation__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_2_1__0__Impl_in_rule__Operation__Group_2_1__011379);
            rule__Operation__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_2_1__1_in_rule__Operation__Group_2_1__011382);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5705:1: rule__Operation__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Operation__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5709:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5710:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5710:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5711:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Operation__Group_2_1__0__Impl11410); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5724:1: rule__Operation__Group_2_1__1 : rule__Operation__Group_2_1__1__Impl ;
    public final void rule__Operation__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5728:1: ( rule__Operation__Group_2_1__1__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5729:2: rule__Operation__Group_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_2_1__1__Impl_in_rule__Operation__Group_2_1__111441);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5735:1: rule__Operation__Group_2_1__1__Impl : ( ( rule__Operation__FormalParametersAssignment_2_1_1 ) ) ;
    public final void rule__Operation__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5739:1: ( ( ( rule__Operation__FormalParametersAssignment_2_1_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5740:1: ( ( rule__Operation__FormalParametersAssignment_2_1_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5740:1: ( ( rule__Operation__FormalParametersAssignment_2_1_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5741:1: ( rule__Operation__FormalParametersAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getFormalParametersAssignment_2_1_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5742:1: ( rule__Operation__FormalParametersAssignment_2_1_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5742:2: rule__Operation__FormalParametersAssignment_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__FormalParametersAssignment_2_1_1_in_rule__Operation__Group_2_1__1__Impl11468);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5757:1: rule__TransitionSystem__AdtAssignment_1 : ( ruleADT ) ;
    public final void rule__TransitionSystem__AdtAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5761:1: ( ( ruleADT ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5762:1: ( ruleADT )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5762:1: ( ruleADT )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5763:1: ruleADT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getAdtADTParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleADT_in_rule__TransitionSystem__AdtAssignment_111507);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5772:1: rule__TransitionSystem__InitialStateAssignment_4 : ( ruleTerm ) ;
    public final void rule__TransitionSystem__InitialStateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5776:1: ( ( ruleTerm ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5777:1: ( ruleTerm )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5777:1: ( ruleTerm )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5778:1: ruleTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getInitialStateTermParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTerm_in_rule__TransitionSystem__InitialStateAssignment_411538);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5787:1: rule__TransitionSystem__AuxiliaryAssignment_6 : ( ruleAuxiliary ) ;
    public final void rule__TransitionSystem__AuxiliaryAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5791:1: ( ( ruleAuxiliary ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5792:1: ( ruleAuxiliary )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5792:1: ( ruleAuxiliary )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5793:1: ruleAuxiliary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getAuxiliaryAuxiliaryParserRuleCall_6_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAuxiliary_in_rule__TransitionSystem__AuxiliaryAssignment_611569);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5802:1: rule__TransitionSystem__TransitionsAssignment_8 : ( ruleTransition ) ;
    public final void rule__TransitionSystem__TransitionsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5806:1: ( ( ruleTransition ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5807:1: ( ruleTransition )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5807:1: ( ruleTransition )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5808:1: ruleTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getTransitionsTransitionParserRuleCall_8_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_rule__TransitionSystem__TransitionsAssignment_811600);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5817:1: rule__Transition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Transition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5821:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5822:1: ( RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5822:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5823:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Transition__NameAssignment_011631); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5832:1: rule__Transition__BodyAssignment_2 : ( ruleNonVariableStrategy ) ;
    public final void rule__Transition__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5836:1: ( ( ruleNonVariableStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5837:1: ( ruleNonVariableStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5837:1: ( ruleNonVariableStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5838:1: ruleNonVariableStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getBodyNonVariableStrategyParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNonVariableStrategy_in_rule__Transition__BodyAssignment_211662);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5847:1: rule__Auxiliary__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Auxiliary__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5851:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5852:1: ( RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5852:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5853:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Auxiliary__NameAssignment_011693); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5862:1: rule__Auxiliary__FormalParamsAssignment_1_1 : ( ruleVariableStrategy ) ;
    public final void rule__Auxiliary__FormalParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5866:1: ( ( ruleVariableStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5867:1: ( ruleVariableStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5867:1: ( ruleVariableStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5868:1: ruleVariableStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getFormalParamsVariableStrategyParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableStrategy_in_rule__Auxiliary__FormalParamsAssignment_1_111724);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5877:1: rule__Auxiliary__FormalParamsAssignment_1_2_1 : ( ruleVariableStrategy ) ;
    public final void rule__Auxiliary__FormalParamsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5881:1: ( ( ruleVariableStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5882:1: ( ruleVariableStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5882:1: ( ruleVariableStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5883:1: ruleVariableStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getFormalParamsVariableStrategyParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableStrategy_in_rule__Auxiliary__FormalParamsAssignment_1_2_111755);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5892:1: rule__Auxiliary__BodyAssignment_3 : ( ruleNonVariableStrategy ) ;
    public final void rule__Auxiliary__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5896:1: ( ( ruleNonVariableStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5897:1: ( ruleNonVariableStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5897:1: ( ruleNonVariableStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5898:1: ruleNonVariableStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getBodyNonVariableStrategyParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNonVariableStrategy_in_rule__Auxiliary__BodyAssignment_311786);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5907:1: rule__One__SAssignment_2 : ( ruleStrategy ) ;
    public final void rule__One__SAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5911:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5912:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5912:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5913:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneAccess().getSStrategyParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__One__SAssignment_211817);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5922:1: rule__One__NAssignment_4 : ( RULE_INT ) ;
    public final void rule__One__NAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5926:1: ( ( RULE_INT ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5927:1: ( RULE_INT )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5927:1: ( RULE_INT )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5928:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneAccess().getNINTTerminalRuleCall_4_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__One__NAssignment_411848); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5937:1: rule__DeclaredStrategyInstance__DeclarationAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DeclaredStrategyInstance__DeclarationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5941:1: ( ( ( RULE_ID ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5942:1: ( ( RULE_ID ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5942:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5943:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getDeclarationDeclaredStrategyCrossReference_1_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5944:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5945:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getDeclarationDeclaredStrategyIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__DeclaredStrategyInstance__DeclarationAssignment_111883); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5956:1: rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0 : ( ruleStrategy ) ;
    public final void rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5960:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5961:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5961:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5962:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getActualParamsStrategyParserRuleCall_3_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__DeclaredStrategyInstance__ActualParamsAssignment_3_011918);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5971:1: rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1 : ( ruleStrategy ) ;
    public final void rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5975:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5976:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5976:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5977:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getActualParamsStrategyParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_111949);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5986:1: rule__Saturation__SAssignment_2 : ( ruleStrategy ) ;
    public final void rule__Saturation__SAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5990:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5991:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5991:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5992:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSaturationAccess().getSStrategyParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__Saturation__SAssignment_211980);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6001:1: rule__Saturation__NAssignment_4 : ( RULE_INT ) ;
    public final void rule__Saturation__NAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6005:1: ( ( RULE_INT ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6006:1: ( RULE_INT )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6006:1: ( RULE_INT )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6007:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSaturationAccess().getNINTTerminalRuleCall_4_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Saturation__NAssignment_412011); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6016:1: rule__IfThenElse__S1Assignment_2 : ( ruleStrategy ) ;
    public final void rule__IfThenElse__S1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6020:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6021:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6021:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6022:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getS1StrategyParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__IfThenElse__S1Assignment_212042);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6031:1: rule__IfThenElse__S2Assignment_4 : ( ruleStrategy ) ;
    public final void rule__IfThenElse__S2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6035:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6036:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6036:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6037:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getS2StrategyParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__IfThenElse__S2Assignment_412073);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6046:1: rule__IfThenElse__S3Assignment_6 : ( ruleStrategy ) ;
    public final void rule__IfThenElse__S3Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6050:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6051:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6051:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6052:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getS3StrategyParserRuleCall_6_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__IfThenElse__S3Assignment_612104);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6061:1: rule__SimpleStrategy__EquationsAssignment_1 : ( ruleRewriteRule ) ;
    public final void rule__SimpleStrategy__EquationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6065:1: ( ( ruleRewriteRule ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6066:1: ( ruleRewriteRule )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6066:1: ( ruleRewriteRule )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6067:1: ruleRewriteRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleStrategyAccess().getEquationsRewriteRuleParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRewriteRule_in_rule__SimpleStrategy__EquationsAssignment_112135);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6076:1: rule__SimpleStrategy__EquationsAssignment_2_1 : ( ruleRewriteRule ) ;
    public final void rule__SimpleStrategy__EquationsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6080:1: ( ( ruleRewriteRule ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6081:1: ( ruleRewriteRule )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6081:1: ( ruleRewriteRule )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6082:1: ruleRewriteRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleStrategyAccess().getEquationsRewriteRuleParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRewriteRule_in_rule__SimpleStrategy__EquationsAssignment_2_112166);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6091:1: rule__Not__SAssignment_2 : ( ( rule__Not__SAlternatives_2_0 ) ) ;
    public final void rule__Not__SAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6095:1: ( ( ( rule__Not__SAlternatives_2_0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6096:1: ( ( rule__Not__SAlternatives_2_0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6096:1: ( ( rule__Not__SAlternatives_2_0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6097:1: ( rule__Not__SAlternatives_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getSAlternatives_2_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6098:1: ( rule__Not__SAlternatives_2_0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6098:2: rule__Not__SAlternatives_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Not__SAlternatives_2_0_in_rule__Not__SAssignment_212197);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6107:1: rule__Fixpoint__SAssignment_2 : ( ruleStrategy ) ;
    public final void rule__Fixpoint__SAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6111:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6112:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6112:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6113:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixpointAccess().getSStrategyParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__Fixpoint__SAssignment_212230);
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


    // $ANTLR start "rule__Choice__S1Assignment_2"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6122:1: rule__Choice__S1Assignment_2 : ( ruleStrategy ) ;
    public final void rule__Choice__S1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6126:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6127:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6127:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6128:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getS1StrategyParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__Choice__S1Assignment_212261);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6137:1: rule__Choice__S2Assignment_4 : ( ruleStrategy ) ;
    public final void rule__Choice__S2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6141:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6142:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6142:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6143:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getS2StrategyParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__Choice__S2Assignment_412292);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6152:1: rule__Union__S1Assignment_2 : ( ruleStrategy ) ;
    public final void rule__Union__S1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6156:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6157:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6157:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6158:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionAccess().getS1StrategyParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__Union__S1Assignment_212323);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6167:1: rule__Union__S2Assignment_4 : ( ruleStrategy ) ;
    public final void rule__Union__S2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6171:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6172:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6172:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6173:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionAccess().getS2StrategyParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__Union__S2Assignment_412354);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6182:1: rule__Sequence__S1Assignment_2 : ( ruleStrategy ) ;
    public final void rule__Sequence__S1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6186:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6187:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6187:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6188:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getS1StrategyParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__Sequence__S1Assignment_212385);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6197:1: rule__Sequence__S2Assignment_4 : ( ruleStrategy ) ;
    public final void rule__Sequence__S2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6201:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6202:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6202:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6203:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getS2StrategyParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__Sequence__S2Assignment_412416);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6212:1: rule__VariableStrategy__NameAssignment : ( RULE_ID ) ;
    public final void rule__VariableStrategy__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6216:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6217:1: ( RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6217:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6218:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableStrategyAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__VariableStrategy__NameAssignment12447); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6227:1: rule__ADT__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ADT__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6231:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6232:1: ( RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6232:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6233:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ADT__NameAssignment_112478); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6242:1: rule__ADT__SignatureAssignment_3 : ( ruleSignature ) ;
    public final void rule__ADT__SignatureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6246:1: ( ( ruleSignature ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6247:1: ( ruleSignature )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6247:1: ( ruleSignature )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6248:1: ruleSignature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getSignatureSignatureParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSignature_in_rule__ADT__SignatureAssignment_312509);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6257:1: rule__ADT__EquationsAssignment_4_1 : ( ruleEquation ) ;
    public final void rule__ADT__EquationsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6261:1: ( ( ruleEquation ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6262:1: ( ruleEquation )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6262:1: ( ruleEquation )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6263:1: ruleEquation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getEquationsEquationParserRuleCall_4_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEquation_in_rule__ADT__EquationsAssignment_4_112540);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6272:1: rule__ADT__EquationsAssignment_4_2 : ( ruleEquation ) ;
    public final void rule__ADT__EquationsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6276:1: ( ( ruleEquation ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6277:1: ( ruleEquation )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6277:1: ( ruleEquation )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6278:1: ruleEquation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getEquationsEquationParserRuleCall_4_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEquation_in_rule__ADT__EquationsAssignment_4_212571);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6287:1: rule__ADT__VariablesAssignment_5_1 : ( ruleVariableDeclaration ) ;
    public final void rule__ADT__VariablesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6291:1: ( ( ruleVariableDeclaration ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6292:1: ( ruleVariableDeclaration )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6292:1: ( ruleVariableDeclaration )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6293:1: ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getVariablesVariableDeclarationParserRuleCall_5_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableDeclaration_in_rule__ADT__VariablesAssignment_5_112602);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6302:1: rule__ADT__VariablesAssignment_5_2 : ( ruleVariableDeclaration ) ;
    public final void rule__ADT__VariablesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6306:1: ( ( ruleVariableDeclaration ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6307:1: ( ruleVariableDeclaration )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6307:1: ( ruleVariableDeclaration )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6308:1: ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getVariablesVariableDeclarationParserRuleCall_5_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableDeclaration_in_rule__ADT__VariablesAssignment_5_212633);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6317:1: rule__Signature__SortsAssignment_1 : ( ruleASort ) ;
    public final void rule__Signature__SortsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6321:1: ( ( ruleASort ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6322:1: ( ruleASort )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6322:1: ( ruleASort )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6323:1: ruleASort
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getSortsASortParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleASort_in_rule__Signature__SortsAssignment_112664);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6332:1: rule__Signature__SortsAssignment_2_1 : ( ruleASort ) ;
    public final void rule__Signature__SortsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6336:1: ( ( ruleASort ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6337:1: ( ruleASort )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6337:1: ( ruleASort )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6338:1: ruleASort
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getSortsASortParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleASort_in_rule__Signature__SortsAssignment_2_112695);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6347:1: rule__Signature__GeneratorsAssignment_3_1 : ( ruleOperation ) ;
    public final void rule__Signature__GeneratorsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6351:1: ( ( ruleOperation ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6352:1: ( ruleOperation )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6352:1: ( ruleOperation )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6353:1: ruleOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getGeneratorsOperationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_rule__Signature__GeneratorsAssignment_3_112726);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6362:1: rule__Signature__GeneratorsAssignment_3_2 : ( ruleOperation ) ;
    public final void rule__Signature__GeneratorsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6366:1: ( ( ruleOperation ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6367:1: ( ruleOperation )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6367:1: ( ruleOperation )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6368:1: ruleOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getGeneratorsOperationParserRuleCall_3_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_rule__Signature__GeneratorsAssignment_3_212757);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6377:1: rule__Signature__OperationsAssignment_4_1 : ( ruleOperation ) ;
    public final void rule__Signature__OperationsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6381:1: ( ( ruleOperation ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6382:1: ( ruleOperation )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6382:1: ( ruleOperation )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6383:1: ruleOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getOperationsOperationParserRuleCall_4_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_rule__Signature__OperationsAssignment_4_112788);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6392:1: rule__Signature__OperationsAssignment_4_2 : ( ruleOperation ) ;
    public final void rule__Signature__OperationsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6396:1: ( ( ruleOperation ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6397:1: ( ruleOperation )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6397:1: ( ruleOperation )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6398:1: ruleOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getOperationsOperationParserRuleCall_4_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_rule__Signature__OperationsAssignment_4_212819);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6407:1: rule__VariableDeclaration__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6411:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6412:1: ( RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6412:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6413:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_012850); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6422:1: rule__VariableDeclaration__SortAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__VariableDeclaration__SortAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6426:1: ( ( ( RULE_ID ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6427:1: ( ( RULE_ID ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6427:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6428:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getSortASortCrossReference_2_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6429:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6430:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getSortASortIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__VariableDeclaration__SortAssignment_212885); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6441:1: rule__Equation__LeftHandTermAssignment_0 : ( ruleATerm ) ;
    public final void rule__Equation__LeftHandTermAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6445:1: ( ( ruleATerm ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6446:1: ( ruleATerm )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6446:1: ( ruleATerm )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6447:1: ruleATerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getLeftHandTermATermParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleATerm_in_rule__Equation__LeftHandTermAssignment_012920);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6456:1: rule__Equation__RightHandTermAssignment_2 : ( ruleATerm ) ;
    public final void rule__Equation__RightHandTermAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6460:1: ( ( ruleATerm ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6461:1: ( ruleATerm )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6461:1: ( ruleATerm )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6462:1: ruleATerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getRightHandTermATermParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleATerm_in_rule__Equation__RightHandTermAssignment_212951);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6471:1: rule__RewriteRule__LeftHandTermAssignment_0 : ( ruleATerm ) ;
    public final void rule__RewriteRule__LeftHandTermAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6475:1: ( ( ruleATerm ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6476:1: ( ruleATerm )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6476:1: ( ruleATerm )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6477:1: ruleATerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRewriteRuleAccess().getLeftHandTermATermParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleATerm_in_rule__RewriteRule__LeftHandTermAssignment_012982);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6486:1: rule__RewriteRule__RightHandTermAssignment_2 : ( ruleATerm ) ;
    public final void rule__RewriteRule__RightHandTermAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6490:1: ( ( ruleATerm ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6491:1: ( ruleATerm )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6491:1: ( ruleATerm )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6492:1: ruleATerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRewriteRuleAccess().getRightHandTermATermParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleATerm_in_rule__RewriteRule__RightHandTermAssignment_213013);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6501:1: rule__SubSort__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SubSort__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6505:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6506:1: ( RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6506:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6507:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubSortAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__SubSort__NameAssignment_013044); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6516:1: rule__SubSort__SuperSortAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__SubSort__SuperSortAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6520:1: ( ( ( RULE_ID ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6521:1: ( ( RULE_ID ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6521:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6522:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubSortAccess().getSuperSortASortCrossReference_2_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6523:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6524:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubSortAccess().getSuperSortASortIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__SubSort__SuperSortAssignment_213079); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6535:1: rule__Sort__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6539:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6540:1: ( RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6540:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6541:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSortAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Sort__NameAssignment_113114); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6550:1: rule__Term__OperationSymbolAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Term__OperationSymbolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6554:1: ( ( ( RULE_ID ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6555:1: ( ( RULE_ID ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6555:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6556:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getOperationSymbolOperationCrossReference_1_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6557:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6558:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getOperationSymbolOperationIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Term__OperationSymbolAssignment_113149); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6569:1: rule__Term__SubtermsAssignment_2_1 : ( ruleATerm ) ;
    public final void rule__Term__SubtermsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6573:1: ( ( ruleATerm ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6574:1: ( ruleATerm )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6574:1: ( ruleATerm )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6575:1: ruleATerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getSubtermsATermParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleATerm_in_rule__Term__SubtermsAssignment_2_113184);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6584:1: rule__Term__SubtermsAssignment_2_2_1 : ( ruleATerm ) ;
    public final void rule__Term__SubtermsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6588:1: ( ( ruleATerm ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6589:1: ( ruleATerm )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6589:1: ( ruleATerm )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6590:1: ruleATerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getSubtermsATermParserRuleCall_2_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleATerm_in_rule__Term__SubtermsAssignment_2_2_113215);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6599:1: rule__Variable__DeclarationAssignment_1 : ( ( RULE_TERMVAR ) ) ;
    public final void rule__Variable__DeclarationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6603:1: ( ( ( RULE_TERMVAR ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6604:1: ( ( RULE_TERMVAR ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6604:1: ( ( RULE_TERMVAR ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6605:1: ( RULE_TERMVAR )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getDeclarationVariableDeclarationCrossReference_1_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6606:1: ( RULE_TERMVAR )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6607:1: RULE_TERMVAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getDeclarationVariableDeclarationTERMVARTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_TERMVAR,FollowSets000.FOLLOW_RULE_TERMVAR_in_rule__Variable__DeclarationAssignment_113250); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6618:1: rule__Operation__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Operation__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6622:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6623:1: ( RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6623:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6624:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_013285); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6633:1: rule__Operation__FormalParametersAssignment_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__Operation__FormalParametersAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6637:1: ( ( ( RULE_ID ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6638:1: ( ( RULE_ID ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6638:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6639:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getFormalParametersASortCrossReference_2_0_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6640:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6641:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getFormalParametersASortIDTerminalRuleCall_2_0_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Operation__FormalParametersAssignment_2_013320); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6652:1: rule__Operation__FormalParametersAssignment_2_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Operation__FormalParametersAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6656:1: ( ( ( RULE_ID ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6657:1: ( ( RULE_ID ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6657:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6658:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getFormalParametersASortCrossReference_2_1_1_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6659:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6660:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getFormalParametersASortIDTerminalRuleCall_2_1_1_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Operation__FormalParametersAssignment_2_1_113359); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6671:1: rule__Operation__ReturnTypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Operation__ReturnTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6675:1: ( ( ( RULE_ID ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6676:1: ( ( RULE_ID ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6676:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6677:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getReturnTypeASortCrossReference_3_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6678:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6679:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getReturnTypeASortIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Operation__ReturnTypeAssignment_313398); if (state.failed) return ;
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
        public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice847 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChoice854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Choice__Group__0_in_ruleChoice880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnion_in_entryRuleUnion907 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnion914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Union__Group__0_in_ruleUnion940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence967 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSequence974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__0_in_ruleSequence1000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentity_in_entryRuleIdentity1027 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdentity1034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identity__Group__0_in_ruleIdentity1060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFail_in_entryRuleFail1087 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFail1094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fail__Group__0_in_ruleFail1120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableStrategy_in_entryRuleVariableStrategy1147 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableStrategy1154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableStrategy__NameAssignment_in_ruleVariableStrategy1180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleATerm_in_entryRuleATerm1207 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleATerm1214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ATerm__Alternatives_in_ruleATerm1240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleASort_in_entryRuleASort1267 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleASort1274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ASort__Alternatives_in_ruleASort1300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleADT_in_entryRuleADT1327 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleADT1334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group__0_in_ruleADT1360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignature_in_entryRuleSignature1387 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSignature1394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group__0_in_ruleSignature1420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1447 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration1454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0_in_ruleVariableDeclaration1480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEquation_in_entryRuleEquation1507 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEquation1514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equation__Group__0_in_ruleEquation1540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRewriteRule_in_entryRuleRewriteRule1567 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRewriteRule1574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RewriteRule__Group__0_in_ruleRewriteRule1600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubSort_in_entryRuleSubSort1627 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubSort1634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubSort__Group__0_in_ruleSubSort1660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSort_in_entryRuleSort1687 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSort1694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sort__Group__0_in_ruleSort1720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm1747 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerm1754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__Group__0_in_ruleTerm1780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1807 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable1814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__0_in_ruleVariable1840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation1867 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperation1874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__0_in_ruleOperation1900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNonVariableStrategy_in_rule__Strategy__Alternatives1936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableStrategy_in_rule__Strategy__Alternatives1953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredefStrats_in_rule__NonVariableStrategy__Alternatives1986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaredStrategyInstance_in_rule__NonVariableStrategy__Alternatives2004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdentity_in_rule__PredefStrats__Alternatives2036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFail_in_rule__PredefStrats__Alternatives2053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoice_in_rule__PredefStrats__Alternatives2070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSequence_in_rule__PredefStrats__Alternatives2087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFixpoint_in_rule__PredefStrats__Alternatives2104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfThenElse_in_rule__PredefStrats__Alternatives2121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNot_in_rule__PredefStrats__Alternatives2138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleStrategy_in_rule__PredefStrats__Alternatives2155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOne_in_rule__PredefStrats__Alternatives2172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSaturation_in_rule__PredefStrats__Alternatives2189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnion_in_rule__PredefStrats__Alternatives2206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleStrategy_in_rule__Not__SAlternatives_2_02238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaredStrategyInstance_in_rule__Not__SAlternatives_2_02255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableStrategy_in_rule__Not__SAlternatives_2_02272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerm_in_rule__ATerm__Alternatives2304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_rule__ATerm__Alternatives2321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubSort_in_rule__ASort__Alternatives2353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSort_in_rule__ASort__Alternatives2370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__0__Impl_in_rule__TransitionSystem__Group__02400 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__1_in_rule__TransitionSystem__Group__02403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__TransitionSystem__Group__0__Impl2431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__1__Impl_in_rule__TransitionSystem__Group__12462 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__2_in_rule__TransitionSystem__Group__12465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__AdtAssignment_1_in_rule__TransitionSystem__Group__1__Impl2492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__2__Impl_in_rule__TransitionSystem__Group__22522 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__3_in_rule__TransitionSystem__Group__22525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__TransitionSystem__Group__2__Impl2553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__3__Impl_in_rule__TransitionSystem__Group__32584 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__4_in_rule__TransitionSystem__Group__32587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__TransitionSystem__Group__3__Impl2615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__4__Impl_in_rule__TransitionSystem__Group__42646 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__5_in_rule__TransitionSystem__Group__42649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__InitialStateAssignment_4_in_rule__TransitionSystem__Group__4__Impl2676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__5__Impl_in_rule__TransitionSystem__Group__52706 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__6_in_rule__TransitionSystem__Group__52709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TransitionSystem__Group__5__Impl2737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__6__Impl_in_rule__TransitionSystem__Group__62768 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__7_in_rule__TransitionSystem__Group__62771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__AuxiliaryAssignment_6_in_rule__TransitionSystem__Group__6__Impl2798 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__7__Impl_in_rule__TransitionSystem__Group__72829 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__8_in_rule__TransitionSystem__Group__72832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TransitionSystem__Group__7__Impl2860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__8__Impl_in_rule__TransitionSystem__Group__82891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__TransitionsAssignment_8_in_rule__TransitionSystem__Group__8__Impl2918 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__02967 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__02970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__NameAssignment_0_in_rule__Transition__Group__0__Impl2997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__13027 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__13030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Transition__Group__1__Impl3058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__23089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__BodyAssignment_2_in_rule__Transition__Group__2__Impl3116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group__0__Impl_in_rule__Auxiliary__Group__03152 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group__1_in_rule__Auxiliary__Group__03155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__NameAssignment_0_in_rule__Auxiliary__Group__0__Impl3182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group__1__Impl_in_rule__Auxiliary__Group__13212 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group__2_in_rule__Auxiliary__Group__13215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1__0_in_rule__Auxiliary__Group__1__Impl3242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group__2__Impl_in_rule__Auxiliary__Group__23273 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group__3_in_rule__Auxiliary__Group__23276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Auxiliary__Group__2__Impl3304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group__3__Impl_in_rule__Auxiliary__Group__33335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__BodyAssignment_3_in_rule__Auxiliary__Group__3__Impl3362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1__0__Impl_in_rule__Auxiliary__Group_1__03400 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1__1_in_rule__Auxiliary__Group_1__03403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Auxiliary__Group_1__0__Impl3431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1__1__Impl_in_rule__Auxiliary__Group_1__13462 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1__2_in_rule__Auxiliary__Group_1__13465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__FormalParamsAssignment_1_1_in_rule__Auxiliary__Group_1__1__Impl3492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1__2__Impl_in_rule__Auxiliary__Group_1__23522 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1__3_in_rule__Auxiliary__Group_1__23525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1_2__0_in_rule__Auxiliary__Group_1__2__Impl3552 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1__3__Impl_in_rule__Auxiliary__Group_1__33583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Auxiliary__Group_1__3__Impl3611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1_2__0__Impl_in_rule__Auxiliary__Group_1_2__03650 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1_2__1_in_rule__Auxiliary__Group_1_2__03653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Auxiliary__Group_1_2__0__Impl3681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1_2__1__Impl_in_rule__Auxiliary__Group_1_2__13712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__FormalParamsAssignment_1_2_1_in_rule__Auxiliary__Group_1_2__1__Impl3739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__One__Group__0__Impl_in_rule__One__Group__03773 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__One__Group__1_in_rule__One__Group__03776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__One__Group__0__Impl3804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__One__Group__1__Impl_in_rule__One__Group__13835 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_rule__One__Group__2_in_rule__One__Group__13838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__One__Group__1__Impl3866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__One__Group__2__Impl_in_rule__One__Group__23897 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__One__Group__3_in_rule__One__Group__23900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__One__SAssignment_2_in_rule__One__Group__2__Impl3927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__One__Group__3__Impl_in_rule__One__Group__33957 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__One__Group__4_in_rule__One__Group__33960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__One__Group__3__Impl3988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__One__Group__4__Impl_in_rule__One__Group__44019 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__One__Group__5_in_rule__One__Group__44022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__One__NAssignment_4_in_rule__One__Group__4__Impl4049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__One__Group__5__Impl_in_rule__One__Group__54079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__One__Group__5__Impl4107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group__0__Impl_in_rule__DeclaredStrategyInstance__Group__04150 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group__1_in_rule__DeclaredStrategyInstance__Group__04153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group__1__Impl_in_rule__DeclaredStrategyInstance__Group__14211 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group__2_in_rule__DeclaredStrategyInstance__Group__14214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__DeclarationAssignment_1_in_rule__DeclaredStrategyInstance__Group__1__Impl4241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group__2__Impl_in_rule__DeclaredStrategyInstance__Group__24271 = new BitSet(new long[]{0x00000000FEF40010L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group__3_in_rule__DeclaredStrategyInstance__Group__24274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__DeclaredStrategyInstance__Group__2__Impl4302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group__3__Impl_in_rule__DeclaredStrategyInstance__Group__34333 = new BitSet(new long[]{0x00000000FEF40010L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group__4_in_rule__DeclaredStrategyInstance__Group__34336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group_3__0_in_rule__DeclaredStrategyInstance__Group__3__Impl4363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group__4__Impl_in_rule__DeclaredStrategyInstance__Group__44394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__DeclaredStrategyInstance__Group__4__Impl4422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group_3__0__Impl_in_rule__DeclaredStrategyInstance__Group_3__04463 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group_3__1_in_rule__DeclaredStrategyInstance__Group_3__04466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0_in_rule__DeclaredStrategyInstance__Group_3__0__Impl4493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group_3__1__Impl_in_rule__DeclaredStrategyInstance__Group_3__14523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group_3_1__0_in_rule__DeclaredStrategyInstance__Group_3__1__Impl4550 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group_3_1__0__Impl_in_rule__DeclaredStrategyInstance__Group_3_1__04585 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group_3_1__1_in_rule__DeclaredStrategyInstance__Group_3_1__04588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__DeclaredStrategyInstance__Group_3_1__0__Impl4616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group_3_1__1__Impl_in_rule__DeclaredStrategyInstance__Group_3_1__14647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1_in_rule__DeclaredStrategyInstance__Group_3_1__1__Impl4674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Saturation__Group__0__Impl_in_rule__Saturation__Group__04708 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Saturation__Group__1_in_rule__Saturation__Group__04711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Saturation__Group__0__Impl4739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Saturation__Group__1__Impl_in_rule__Saturation__Group__14770 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_rule__Saturation__Group__2_in_rule__Saturation__Group__14773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Saturation__Group__1__Impl4801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Saturation__Group__2__Impl_in_rule__Saturation__Group__24832 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Saturation__Group__3_in_rule__Saturation__Group__24835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Saturation__SAssignment_2_in_rule__Saturation__Group__2__Impl4862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Saturation__Group__3__Impl_in_rule__Saturation__Group__34892 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Saturation__Group__4_in_rule__Saturation__Group__34895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Saturation__Group__3__Impl4923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Saturation__Group__4__Impl_in_rule__Saturation__Group__44954 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Saturation__Group__5_in_rule__Saturation__Group__44957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Saturation__NAssignment_4_in_rule__Saturation__Group__4__Impl4984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Saturation__Group__5__Impl_in_rule__Saturation__Group__55014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Saturation__Group__5__Impl5042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__0__Impl_in_rule__IfThenElse__Group__05085 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__1_in_rule__IfThenElse__Group__05088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__IfThenElse__Group__0__Impl5116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__1__Impl_in_rule__IfThenElse__Group__15147 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__2_in_rule__IfThenElse__Group__15150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__IfThenElse__Group__1__Impl5178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__2__Impl_in_rule__IfThenElse__Group__25209 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__3_in_rule__IfThenElse__Group__25212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__S1Assignment_2_in_rule__IfThenElse__Group__2__Impl5239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__3__Impl_in_rule__IfThenElse__Group__35269 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__4_in_rule__IfThenElse__Group__35272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__IfThenElse__Group__3__Impl5300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__4__Impl_in_rule__IfThenElse__Group__45331 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__5_in_rule__IfThenElse__Group__45334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__S2Assignment_4_in_rule__IfThenElse__Group__4__Impl5361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__5__Impl_in_rule__IfThenElse__Group__55391 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__6_in_rule__IfThenElse__Group__55394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__IfThenElse__Group__5__Impl5422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__6__Impl_in_rule__IfThenElse__Group__65453 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__7_in_rule__IfThenElse__Group__65456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__S3Assignment_6_in_rule__IfThenElse__Group__6__Impl5483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__7__Impl_in_rule__IfThenElse__Group__75513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__IfThenElse__Group__7__Impl5541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group__0__Impl_in_rule__SimpleStrategy__Group__05588 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group__1_in_rule__SimpleStrategy__Group__05591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__SimpleStrategy__Group__0__Impl5619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group__1__Impl_in_rule__SimpleStrategy__Group__15650 = new BitSet(new long[]{0x0000000001080000L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group__2_in_rule__SimpleStrategy__Group__15653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__EquationsAssignment_1_in_rule__SimpleStrategy__Group__1__Impl5680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group__2__Impl_in_rule__SimpleStrategy__Group__25710 = new BitSet(new long[]{0x0000000001080000L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group__3_in_rule__SimpleStrategy__Group__25713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group_2__0_in_rule__SimpleStrategy__Group__2__Impl5740 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group__3__Impl_in_rule__SimpleStrategy__Group__35771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__SimpleStrategy__Group__3__Impl5799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group_2__0__Impl_in_rule__SimpleStrategy__Group_2__05838 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group_2__1_in_rule__SimpleStrategy__Group_2__05841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__SimpleStrategy__Group_2__0__Impl5869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group_2__1__Impl_in_rule__SimpleStrategy__Group_2__15900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__EquationsAssignment_2_1_in_rule__SimpleStrategy__Group_2__1__Impl5927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Not__Group__0__Impl_in_rule__Not__Group__05961 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Not__Group__1_in_rule__Not__Group__05964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Not__Group__0__Impl5992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Not__Group__1__Impl_in_rule__Not__Group__16023 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_rule__Not__Group__2_in_rule__Not__Group__16026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Not__Group__1__Impl6054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Not__Group__2__Impl_in_rule__Not__Group__26085 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Not__Group__3_in_rule__Not__Group__26088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Not__SAssignment_2_in_rule__Not__Group__2__Impl6115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Not__Group__3__Impl_in_rule__Not__Group__36145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Not__Group__3__Impl6173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fixpoint__Group__0__Impl_in_rule__Fixpoint__Group__06212 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Fixpoint__Group__1_in_rule__Fixpoint__Group__06215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Fixpoint__Group__0__Impl6243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fixpoint__Group__1__Impl_in_rule__Fixpoint__Group__16274 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_rule__Fixpoint__Group__2_in_rule__Fixpoint__Group__16277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Fixpoint__Group__1__Impl6305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fixpoint__Group__2__Impl_in_rule__Fixpoint__Group__26336 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Fixpoint__Group__3_in_rule__Fixpoint__Group__26339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fixpoint__SAssignment_2_in_rule__Fixpoint__Group__2__Impl6366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fixpoint__Group__3__Impl_in_rule__Fixpoint__Group__36396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Fixpoint__Group__3__Impl6424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Choice__Group__0__Impl_in_rule__Choice__Group__06463 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Choice__Group__1_in_rule__Choice__Group__06466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Choice__Group__0__Impl6494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Choice__Group__1__Impl_in_rule__Choice__Group__16525 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_rule__Choice__Group__2_in_rule__Choice__Group__16528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Choice__Group__1__Impl6556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Choice__Group__2__Impl_in_rule__Choice__Group__26587 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Choice__Group__3_in_rule__Choice__Group__26590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Choice__S1Assignment_2_in_rule__Choice__Group__2__Impl6617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Choice__Group__3__Impl_in_rule__Choice__Group__36647 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_rule__Choice__Group__4_in_rule__Choice__Group__36650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Choice__Group__3__Impl6678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Choice__Group__4__Impl_in_rule__Choice__Group__46709 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Choice__Group__5_in_rule__Choice__Group__46712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Choice__S2Assignment_4_in_rule__Choice__Group__4__Impl6739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Choice__Group__5__Impl_in_rule__Choice__Group__56769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Choice__Group__5__Impl6797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Union__Group__0__Impl_in_rule__Union__Group__06840 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Union__Group__1_in_rule__Union__Group__06843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Union__Group__0__Impl6871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Union__Group__1__Impl_in_rule__Union__Group__16902 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_rule__Union__Group__2_in_rule__Union__Group__16905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Union__Group__1__Impl6933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Union__Group__2__Impl_in_rule__Union__Group__26964 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Union__Group__3_in_rule__Union__Group__26967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Union__S1Assignment_2_in_rule__Union__Group__2__Impl6994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Union__Group__3__Impl_in_rule__Union__Group__37024 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_rule__Union__Group__4_in_rule__Union__Group__37027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Union__Group__3__Impl7055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Union__Group__4__Impl_in_rule__Union__Group__47086 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Union__Group__5_in_rule__Union__Group__47089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Union__S2Assignment_4_in_rule__Union__Group__4__Impl7116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Union__Group__5__Impl_in_rule__Union__Group__57146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Union__Group__5__Impl7174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__07217 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__07220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Sequence__Group__0__Impl7248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__17279 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__17282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Sequence__Group__1__Impl7310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__27341 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__27344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__S1Assignment_2_in_rule__Sequence__Group__2__Impl7371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__37401 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__37404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Sequence__Group__3__Impl7432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__47463 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Sequence__Group__5_in_rule__Sequence__Group__47466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__S2Assignment_4_in_rule__Sequence__Group__4__Impl7493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__5__Impl_in_rule__Sequence__Group__57523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Sequence__Group__5__Impl7551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identity__Group__0__Impl_in_rule__Identity__Group__07594 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_rule__Identity__Group__1_in_rule__Identity__Group__07597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Identity__Group__0__Impl7625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identity__Group__1__Impl_in_rule__Identity__Group__17656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fail__Group__0__Impl_in_rule__Fail__Group__07718 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_rule__Fail__Group__1_in_rule__Fail__Group__07721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Fail__Group__0__Impl7749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fail__Group__1__Impl_in_rule__Fail__Group__17780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group__0__Impl_in_rule__ADT__Group__07842 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__ADT__Group__1_in_rule__ADT__Group__07845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__ADT__Group__0__Impl7873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group__1__Impl_in_rule__ADT__Group__17904 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__ADT__Group__2_in_rule__ADT__Group__17907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__NameAssignment_1_in_rule__ADT__Group__1__Impl7934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group__2__Impl_in_rule__ADT__Group__27964 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__ADT__Group__3_in_rule__ADT__Group__27967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__ADT__Group__2__Impl7995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group__3__Impl_in_rule__ADT__Group__38026 = new BitSet(new long[]{0x0000000C00000000L});
        public static final BitSet FOLLOW_rule__ADT__Group__4_in_rule__ADT__Group__38029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__SignatureAssignment_3_in_rule__ADT__Group__3__Impl8056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group__4__Impl_in_rule__ADT__Group__48086 = new BitSet(new long[]{0x0000000C00000000L});
        public static final BitSet FOLLOW_rule__ADT__Group__5_in_rule__ADT__Group__48089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group_4__0_in_rule__ADT__Group__4__Impl8116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group__5__Impl_in_rule__ADT__Group__58147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group_5__0_in_rule__ADT__Group__5__Impl8174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group_4__0__Impl_in_rule__ADT__Group_4__08217 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__ADT__Group_4__1_in_rule__ADT__Group_4__08220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__ADT__Group_4__0__Impl8249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group_4__1__Impl_in_rule__ADT__Group_4__18281 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__ADT__Group_4__2_in_rule__ADT__Group_4__18284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__EquationsAssignment_4_1_in_rule__ADT__Group_4__1__Impl8311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group_4__2__Impl_in_rule__ADT__Group_4__28341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__EquationsAssignment_4_2_in_rule__ADT__Group_4__2__Impl8368 = new BitSet(new long[]{0x0000000000000052L});
        public static final BitSet FOLLOW_rule__ADT__Group_5__0__Impl_in_rule__ADT__Group_5__08405 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__ADT__Group_5__1_in_rule__ADT__Group_5__08408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__ADT__Group_5__0__Impl8437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group_5__1__Impl_in_rule__ADT__Group_5__18469 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__ADT__Group_5__2_in_rule__ADT__Group_5__18472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__VariablesAssignment_5_1_in_rule__ADT__Group_5__1__Impl8499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group_5__2__Impl_in_rule__ADT__Group_5__28529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__VariablesAssignment_5_2_in_rule__ADT__Group_5__2__Impl8556 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__Signature__Group__0__Impl_in_rule__Signature__Group__08593 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Signature__Group__1_in_rule__Signature__Group__08596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Signature__Group__0__Impl8624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group__1__Impl_in_rule__Signature__Group__18655 = new BitSet(new long[]{0x0000002000080000L});
        public static final BitSet FOLLOW_rule__Signature__Group__2_in_rule__Signature__Group__18658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__SortsAssignment_1_in_rule__Signature__Group__1__Impl8685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group__2__Impl_in_rule__Signature__Group__28715 = new BitSet(new long[]{0x0000002000080000L});
        public static final BitSet FOLLOW_rule__Signature__Group__3_in_rule__Signature__Group__28718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group_2__0_in_rule__Signature__Group__2__Impl8745 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Signature__Group__3__Impl_in_rule__Signature__Group__38776 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Signature__Group__4_in_rule__Signature__Group__38779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group_3__0_in_rule__Signature__Group__3__Impl8806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group__4__Impl_in_rule__Signature__Group__48836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group_4__0_in_rule__Signature__Group__4__Impl8863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group_2__0__Impl_in_rule__Signature__Group_2__08904 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Signature__Group_2__1_in_rule__Signature__Group_2__08907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Signature__Group_2__0__Impl8935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group_2__1__Impl_in_rule__Signature__Group_2__18966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__SortsAssignment_2_1_in_rule__Signature__Group_2__1__Impl8993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group_3__0__Impl_in_rule__Signature__Group_3__09027 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Signature__Group_3__1_in_rule__Signature__Group_3__09030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Signature__Group_3__0__Impl9059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group_3__1__Impl_in_rule__Signature__Group_3__19091 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Signature__Group_3__2_in_rule__Signature__Group_3__19094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__GeneratorsAssignment_3_1_in_rule__Signature__Group_3__1__Impl9121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group_3__2__Impl_in_rule__Signature__Group_3__29151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__GeneratorsAssignment_3_2_in_rule__Signature__Group_3__2__Impl9178 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__Signature__Group_4__0__Impl_in_rule__Signature__Group_4__09215 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Signature__Group_4__1_in_rule__Signature__Group_4__09218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Signature__Group_4__0__Impl9247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group_4__1__Impl_in_rule__Signature__Group_4__19279 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Signature__Group_4__2_in_rule__Signature__Group_4__19282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__OperationsAssignment_4_1_in_rule__Signature__Group_4__1__Impl9309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group_4__2__Impl_in_rule__Signature__Group_4__29339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__OperationsAssignment_4_2_in_rule__Signature__Group_4__2__Impl9366 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__09403 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__09406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableDeclaration__NameAssignment_0_in_rule__VariableDeclaration__Group__0__Impl9433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__19463 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__19466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__VariableDeclaration__Group__1__Impl9494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__29525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableDeclaration__SortAssignment_2_in_rule__VariableDeclaration__Group__2__Impl9552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equation__Group__0__Impl_in_rule__Equation__Group__09588 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Equation__Group__1_in_rule__Equation__Group__09591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equation__LeftHandTermAssignment_0_in_rule__Equation__Group__0__Impl9618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equation__Group__1__Impl_in_rule__Equation__Group__19648 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__Equation__Group__2_in_rule__Equation__Group__19651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Equation__Group__1__Impl9679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equation__Group__2__Impl_in_rule__Equation__Group__29710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equation__RightHandTermAssignment_2_in_rule__Equation__Group__2__Impl9737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RewriteRule__Group__0__Impl_in_rule__RewriteRule__Group__09773 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__RewriteRule__Group__1_in_rule__RewriteRule__Group__09776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RewriteRule__LeftHandTermAssignment_0_in_rule__RewriteRule__Group__0__Impl9803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RewriteRule__Group__1__Impl_in_rule__RewriteRule__Group__19833 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__RewriteRule__Group__2_in_rule__RewriteRule__Group__19836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__RewriteRule__Group__1__Impl9864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RewriteRule__Group__2__Impl_in_rule__RewriteRule__Group__29895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RewriteRule__RightHandTermAssignment_2_in_rule__RewriteRule__Group__2__Impl9922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubSort__Group__0__Impl_in_rule__SubSort__Group__09958 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__SubSort__Group__1_in_rule__SubSort__Group__09961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubSort__NameAssignment_0_in_rule__SubSort__Group__0__Impl9988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubSort__Group__1__Impl_in_rule__SubSort__Group__110018 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__SubSort__Group__2_in_rule__SubSort__Group__110021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__SubSort__Group__1__Impl10049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubSort__Group__2__Impl_in_rule__SubSort__Group__210080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubSort__SuperSortAssignment_2_in_rule__SubSort__Group__2__Impl10107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sort__Group__0__Impl_in_rule__Sort__Group__010143 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Sort__Group__1_in_rule__Sort__Group__010146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sort__Group__1__Impl_in_rule__Sort__Group__110204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sort__NameAssignment_1_in_rule__Sort__Group__1__Impl10231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__010265 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Term__Group__1_in_rule__Term__Group__010268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__110326 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Term__Group__2_in_rule__Term__Group__110329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__OperationSymbolAssignment_1_in_rule__Term__Group__1__Impl10356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__Group__2__Impl_in_rule__Term__Group__210386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__Group_2__0_in_rule__Term__Group__2__Impl10413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__Group_2__0__Impl_in_rule__Term__Group_2__010450 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__Term__Group_2__1_in_rule__Term__Group_2__010453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Term__Group_2__0__Impl10481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__Group_2__1__Impl_in_rule__Term__Group_2__110512 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__Term__Group_2__2_in_rule__Term__Group_2__110515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__SubtermsAssignment_2_1_in_rule__Term__Group_2__1__Impl10542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__Group_2__2__Impl_in_rule__Term__Group_2__210572 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__Term__Group_2__3_in_rule__Term__Group_2__210575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__Group_2_2__0_in_rule__Term__Group_2__2__Impl10602 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Term__Group_2__3__Impl_in_rule__Term__Group_2__310633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Term__Group_2__3__Impl10661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__Group_2_2__0__Impl_in_rule__Term__Group_2_2__010700 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__Term__Group_2_2__1_in_rule__Term__Group_2_2__010703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Term__Group_2_2__0__Impl10731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__Group_2_2__1__Impl_in_rule__Term__Group_2_2__110762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__SubtermsAssignment_2_2_1_in_rule__Term__Group_2_2__1__Impl10789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__010823 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__010826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__110884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__DeclarationAssignment_1_in_rule__Variable__Group__1__Impl10911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__010945 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__010948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__NameAssignment_0_in_rule__Operation__Group__0__Impl10975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__111005 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__111008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Operation__Group__1__Impl11036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__211067 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__211070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_2__0_in_rule__Operation__Group__2__Impl11097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__311128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__ReturnTypeAssignment_3_in_rule__Operation__Group__3__Impl11155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_2__0__Impl_in_rule__Operation__Group_2__011193 = new BitSet(new long[]{0x0000010000080000L});
        public static final BitSet FOLLOW_rule__Operation__Group_2__1_in_rule__Operation__Group_2__011196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__FormalParametersAssignment_2_0_in_rule__Operation__Group_2__0__Impl11223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_2__1__Impl_in_rule__Operation__Group_2__111253 = new BitSet(new long[]{0x0000010000080000L});
        public static final BitSet FOLLOW_rule__Operation__Group_2__2_in_rule__Operation__Group_2__111256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_2_1__0_in_rule__Operation__Group_2__1__Impl11283 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Operation__Group_2__2__Impl_in_rule__Operation__Group_2__211314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Operation__Group_2__2__Impl11342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_2_1__0__Impl_in_rule__Operation__Group_2_1__011379 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Operation__Group_2_1__1_in_rule__Operation__Group_2_1__011382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Operation__Group_2_1__0__Impl11410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_2_1__1__Impl_in_rule__Operation__Group_2_1__111441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__FormalParametersAssignment_2_1_1_in_rule__Operation__Group_2_1__1__Impl11468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleADT_in_rule__TransitionSystem__AdtAssignment_111507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerm_in_rule__TransitionSystem__InitialStateAssignment_411538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAuxiliary_in_rule__TransitionSystem__AuxiliaryAssignment_611569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_rule__TransitionSystem__TransitionsAssignment_811600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__NameAssignment_011631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNonVariableStrategy_in_rule__Transition__BodyAssignment_211662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Auxiliary__NameAssignment_011693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableStrategy_in_rule__Auxiliary__FormalParamsAssignment_1_111724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableStrategy_in_rule__Auxiliary__FormalParamsAssignment_1_2_111755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNonVariableStrategy_in_rule__Auxiliary__BodyAssignment_311786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__One__SAssignment_211817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__One__NAssignment_411848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__DeclaredStrategyInstance__DeclarationAssignment_111883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__DeclaredStrategyInstance__ActualParamsAssignment_3_011918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_111949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__Saturation__SAssignment_211980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Saturation__NAssignment_412011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__IfThenElse__S1Assignment_212042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__IfThenElse__S2Assignment_412073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__IfThenElse__S3Assignment_612104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRewriteRule_in_rule__SimpleStrategy__EquationsAssignment_112135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRewriteRule_in_rule__SimpleStrategy__EquationsAssignment_2_112166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Not__SAlternatives_2_0_in_rule__Not__SAssignment_212197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__Fixpoint__SAssignment_212230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__Choice__S1Assignment_212261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__Choice__S2Assignment_412292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__Union__S1Assignment_212323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__Union__S2Assignment_412354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__Sequence__S1Assignment_212385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__Sequence__S2Assignment_412416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__VariableStrategy__NameAssignment12447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ADT__NameAssignment_112478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignature_in_rule__ADT__SignatureAssignment_312509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEquation_in_rule__ADT__EquationsAssignment_4_112540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEquation_in_rule__ADT__EquationsAssignment_4_212571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__ADT__VariablesAssignment_5_112602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__ADT__VariablesAssignment_5_212633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleASort_in_rule__Signature__SortsAssignment_112664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleASort_in_rule__Signature__SortsAssignment_2_112695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_rule__Signature__GeneratorsAssignment_3_112726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_rule__Signature__GeneratorsAssignment_3_212757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_rule__Signature__OperationsAssignment_4_112788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_rule__Signature__OperationsAssignment_4_212819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_012850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__VariableDeclaration__SortAssignment_212885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleATerm_in_rule__Equation__LeftHandTermAssignment_012920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleATerm_in_rule__Equation__RightHandTermAssignment_212951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleATerm_in_rule__RewriteRule__LeftHandTermAssignment_012982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleATerm_in_rule__RewriteRule__RightHandTermAssignment_213013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__SubSort__NameAssignment_013044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__SubSort__SuperSortAssignment_213079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Sort__NameAssignment_113114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Term__OperationSymbolAssignment_113149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleATerm_in_rule__Term__SubtermsAssignment_2_113184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleATerm_in_rule__Term__SubtermsAssignment_2_2_113215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_TERMVAR_in_rule__Variable__DeclarationAssignment_113250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_013285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__FormalParametersAssignment_2_013320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__FormalParametersAssignment_2_1_113359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__ReturnTypeAssignment_313398 = new BitSet(new long[]{0x0000000000000002L});
    }


}