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

                if ( (LA1_2==17) ) {
                    alt1=1;
                }
                else if ( (LA1_2==EOF||(LA1_2>=18 && LA1_2<=19)) ) {
                    alt1=2;
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


    // $ANTLR start "rule__ATerm__Alternatives"
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1049:1: rule__ATerm__Alternatives : ( ( ruleTerm ) | ( ruleVariable ) );
    public final void rule__ATerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1053:1: ( ( ruleTerm ) | ( ruleVariable ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_TERMVAR) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1054:1: ( ruleTerm )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1054:1: ( ruleTerm )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1055:1: ruleTerm
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getATermAccess().getTermParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTerm_in_rule__ATerm__Alternatives2238);
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1060:6: ( ruleVariable )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1060:6: ( ruleVariable )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1061:1: ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getATermAccess().getVariableParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_rule__ATerm__Alternatives2255);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1071:1: rule__ASort__Alternatives : ( ( ruleSubSort ) | ( ruleSort ) );
    public final void rule__ASort__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1075:1: ( ( ruleSubSort ) | ( ruleSort ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||LA5_1==19||LA5_1==37) ) {
                    alt5=2;
                }
                else if ( (LA5_1==41) ) {
                    alt5=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1076:1: ( ruleSubSort )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1076:1: ( ruleSubSort )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1077:1: ruleSubSort
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getASortAccess().getSubSortParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSubSort_in_rule__ASort__Alternatives2287);
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
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1082:6: ( ruleSort )
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1082:6: ( ruleSort )
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1083:1: ruleSort
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getASortAccess().getSortParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSort_in_rule__ASort__Alternatives2304);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1095:1: rule__TransitionSystem__Group__0 : rule__TransitionSystem__Group__0__Impl rule__TransitionSystem__Group__1 ;
    public final void rule__TransitionSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1099:1: ( rule__TransitionSystem__Group__0__Impl rule__TransitionSystem__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1100:2: rule__TransitionSystem__Group__0__Impl rule__TransitionSystem__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__0__Impl_in_rule__TransitionSystem__Group__02334);
            rule__TransitionSystem__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__1_in_rule__TransitionSystem__Group__02337);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1107:1: rule__TransitionSystem__Group__0__Impl : ( 'TransitionSystem' ) ;
    public final void rule__TransitionSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1111:1: ( ( 'TransitionSystem' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1112:1: ( 'TransitionSystem' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1112:1: ( 'TransitionSystem' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1113:1: 'TransitionSystem'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getTransitionSystemKeyword_0()); 
            }
            match(input,12,FollowSets000.FOLLOW_12_in_rule__TransitionSystem__Group__0__Impl2365); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1126:1: rule__TransitionSystem__Group__1 : rule__TransitionSystem__Group__1__Impl rule__TransitionSystem__Group__2 ;
    public final void rule__TransitionSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1130:1: ( rule__TransitionSystem__Group__1__Impl rule__TransitionSystem__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1131:2: rule__TransitionSystem__Group__1__Impl rule__TransitionSystem__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__1__Impl_in_rule__TransitionSystem__Group__12396);
            rule__TransitionSystem__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__2_in_rule__TransitionSystem__Group__12399);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1138:1: rule__TransitionSystem__Group__1__Impl : ( ( rule__TransitionSystem__AdtAssignment_1 ) ) ;
    public final void rule__TransitionSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1142:1: ( ( ( rule__TransitionSystem__AdtAssignment_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1143:1: ( ( rule__TransitionSystem__AdtAssignment_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1143:1: ( ( rule__TransitionSystem__AdtAssignment_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1144:1: ( rule__TransitionSystem__AdtAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getAdtAssignment_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1145:1: ( rule__TransitionSystem__AdtAssignment_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1145:2: rule__TransitionSystem__AdtAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__AdtAssignment_1_in_rule__TransitionSystem__Group__1__Impl2426);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1155:1: rule__TransitionSystem__Group__2 : rule__TransitionSystem__Group__2__Impl rule__TransitionSystem__Group__3 ;
    public final void rule__TransitionSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1159:1: ( rule__TransitionSystem__Group__2__Impl rule__TransitionSystem__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1160:2: rule__TransitionSystem__Group__2__Impl rule__TransitionSystem__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__2__Impl_in_rule__TransitionSystem__Group__22456);
            rule__TransitionSystem__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__3_in_rule__TransitionSystem__Group__22459);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1167:1: rule__TransitionSystem__Group__2__Impl : ( 'initialState' ) ;
    public final void rule__TransitionSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1171:1: ( ( 'initialState' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1172:1: ( 'initialState' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1172:1: ( 'initialState' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1173:1: 'initialState'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getInitialStateKeyword_2()); 
            }
            match(input,13,FollowSets000.FOLLOW_13_in_rule__TransitionSystem__Group__2__Impl2487); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1186:1: rule__TransitionSystem__Group__3 : rule__TransitionSystem__Group__3__Impl rule__TransitionSystem__Group__4 ;
    public final void rule__TransitionSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1190:1: ( rule__TransitionSystem__Group__3__Impl rule__TransitionSystem__Group__4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1191:2: rule__TransitionSystem__Group__3__Impl rule__TransitionSystem__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__3__Impl_in_rule__TransitionSystem__Group__32518);
            rule__TransitionSystem__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__4_in_rule__TransitionSystem__Group__32521);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1198:1: rule__TransitionSystem__Group__3__Impl : ( '=' ) ;
    public final void rule__TransitionSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1202:1: ( ( '=' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1203:1: ( '=' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1203:1: ( '=' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1204:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getEqualsSignKeyword_3()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__TransitionSystem__Group__3__Impl2549); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1217:1: rule__TransitionSystem__Group__4 : rule__TransitionSystem__Group__4__Impl rule__TransitionSystem__Group__5 ;
    public final void rule__TransitionSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1221:1: ( rule__TransitionSystem__Group__4__Impl rule__TransitionSystem__Group__5 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1222:2: rule__TransitionSystem__Group__4__Impl rule__TransitionSystem__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__4__Impl_in_rule__TransitionSystem__Group__42580);
            rule__TransitionSystem__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__5_in_rule__TransitionSystem__Group__42583);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1229:1: rule__TransitionSystem__Group__4__Impl : ( ( rule__TransitionSystem__InitialStateAssignment_4 ) ) ;
    public final void rule__TransitionSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1233:1: ( ( ( rule__TransitionSystem__InitialStateAssignment_4 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1234:1: ( ( rule__TransitionSystem__InitialStateAssignment_4 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1234:1: ( ( rule__TransitionSystem__InitialStateAssignment_4 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1235:1: ( rule__TransitionSystem__InitialStateAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getInitialStateAssignment_4()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1236:1: ( rule__TransitionSystem__InitialStateAssignment_4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1236:2: rule__TransitionSystem__InitialStateAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__InitialStateAssignment_4_in_rule__TransitionSystem__Group__4__Impl2610);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1246:1: rule__TransitionSystem__Group__5 : rule__TransitionSystem__Group__5__Impl rule__TransitionSystem__Group__6 ;
    public final void rule__TransitionSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1250:1: ( rule__TransitionSystem__Group__5__Impl rule__TransitionSystem__Group__6 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1251:2: rule__TransitionSystem__Group__5__Impl rule__TransitionSystem__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__5__Impl_in_rule__TransitionSystem__Group__52640);
            rule__TransitionSystem__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__6_in_rule__TransitionSystem__Group__52643);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1258:1: rule__TransitionSystem__Group__5__Impl : ( 'Strategies' ) ;
    public final void rule__TransitionSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1262:1: ( ( 'Strategies' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1263:1: ( 'Strategies' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1263:1: ( 'Strategies' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1264:1: 'Strategies'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getStrategiesKeyword_5()); 
            }
            match(input,15,FollowSets000.FOLLOW_15_in_rule__TransitionSystem__Group__5__Impl2671); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1277:1: rule__TransitionSystem__Group__6 : rule__TransitionSystem__Group__6__Impl rule__TransitionSystem__Group__7 ;
    public final void rule__TransitionSystem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1281:1: ( rule__TransitionSystem__Group__6__Impl rule__TransitionSystem__Group__7 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1282:2: rule__TransitionSystem__Group__6__Impl rule__TransitionSystem__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__6__Impl_in_rule__TransitionSystem__Group__62702);
            rule__TransitionSystem__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__7_in_rule__TransitionSystem__Group__62705);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1289:1: rule__TransitionSystem__Group__6__Impl : ( ( rule__TransitionSystem__AuxiliaryAssignment_6 )* ) ;
    public final void rule__TransitionSystem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1293:1: ( ( ( rule__TransitionSystem__AuxiliaryAssignment_6 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1294:1: ( ( rule__TransitionSystem__AuxiliaryAssignment_6 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1294:1: ( ( rule__TransitionSystem__AuxiliaryAssignment_6 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1295:1: ( rule__TransitionSystem__AuxiliaryAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getAuxiliaryAssignment_6()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1296:1: ( rule__TransitionSystem__AuxiliaryAssignment_6 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1296:2: rule__TransitionSystem__AuxiliaryAssignment_6
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__AuxiliaryAssignment_6_in_rule__TransitionSystem__Group__6__Impl2732);
            	    rule__TransitionSystem__AuxiliaryAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1306:1: rule__TransitionSystem__Group__7 : rule__TransitionSystem__Group__7__Impl rule__TransitionSystem__Group__8 ;
    public final void rule__TransitionSystem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1310:1: ( rule__TransitionSystem__Group__7__Impl rule__TransitionSystem__Group__8 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1311:2: rule__TransitionSystem__Group__7__Impl rule__TransitionSystem__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__7__Impl_in_rule__TransitionSystem__Group__72763);
            rule__TransitionSystem__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__8_in_rule__TransitionSystem__Group__72766);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1318:1: rule__TransitionSystem__Group__7__Impl : ( 'Transitions' ) ;
    public final void rule__TransitionSystem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1322:1: ( ( 'Transitions' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1323:1: ( 'Transitions' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1323:1: ( 'Transitions' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1324:1: 'Transitions'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getTransitionsKeyword_7()); 
            }
            match(input,16,FollowSets000.FOLLOW_16_in_rule__TransitionSystem__Group__7__Impl2794); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1337:1: rule__TransitionSystem__Group__8 : rule__TransitionSystem__Group__8__Impl ;
    public final void rule__TransitionSystem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1341:1: ( rule__TransitionSystem__Group__8__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1342:2: rule__TransitionSystem__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__Group__8__Impl_in_rule__TransitionSystem__Group__82825);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1348:1: rule__TransitionSystem__Group__8__Impl : ( ( rule__TransitionSystem__TransitionsAssignment_8 )* ) ;
    public final void rule__TransitionSystem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1352:1: ( ( ( rule__TransitionSystem__TransitionsAssignment_8 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1353:1: ( ( rule__TransitionSystem__TransitionsAssignment_8 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1353:1: ( ( rule__TransitionSystem__TransitionsAssignment_8 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1354:1: ( rule__TransitionSystem__TransitionsAssignment_8 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getTransitionsAssignment_8()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1355:1: ( rule__TransitionSystem__TransitionsAssignment_8 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1355:2: rule__TransitionSystem__TransitionsAssignment_8
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TransitionSystem__TransitionsAssignment_8_in_rule__TransitionSystem__Group__8__Impl2852);
            	    rule__TransitionSystem__TransitionsAssignment_8();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1383:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1387:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1388:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__02901);
            rule__Transition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__02904);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1395:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__NameAssignment_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1399:1: ( ( ( rule__Transition__NameAssignment_0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1400:1: ( ( rule__Transition__NameAssignment_0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1400:1: ( ( rule__Transition__NameAssignment_0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1401:1: ( rule__Transition__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getNameAssignment_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1402:1: ( rule__Transition__NameAssignment_0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1402:2: rule__Transition__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__NameAssignment_0_in_rule__Transition__Group__0__Impl2931);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1412:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1416:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1417:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__12961);
            rule__Transition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__12964);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1424:1: rule__Transition__Group__1__Impl : ( '=' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1428:1: ( ( '=' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1429:1: ( '=' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1429:1: ( '=' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1430:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getEqualsSignKeyword_1()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Transition__Group__1__Impl2992); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1443:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1447:1: ( rule__Transition__Group__2__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1448:2: rule__Transition__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__23023);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1454:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__BodyAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1458:1: ( ( ( rule__Transition__BodyAssignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1459:1: ( ( rule__Transition__BodyAssignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1459:1: ( ( rule__Transition__BodyAssignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1460:1: ( rule__Transition__BodyAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getBodyAssignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1461:1: ( rule__Transition__BodyAssignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1461:2: rule__Transition__BodyAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Transition__BodyAssignment_2_in_rule__Transition__Group__2__Impl3050);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1477:1: rule__Auxiliary__Group__0 : rule__Auxiliary__Group__0__Impl rule__Auxiliary__Group__1 ;
    public final void rule__Auxiliary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1481:1: ( rule__Auxiliary__Group__0__Impl rule__Auxiliary__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1482:2: rule__Auxiliary__Group__0__Impl rule__Auxiliary__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group__0__Impl_in_rule__Auxiliary__Group__03086);
            rule__Auxiliary__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group__1_in_rule__Auxiliary__Group__03089);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1489:1: rule__Auxiliary__Group__0__Impl : ( ( rule__Auxiliary__NameAssignment_0 ) ) ;
    public final void rule__Auxiliary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1493:1: ( ( ( rule__Auxiliary__NameAssignment_0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1494:1: ( ( rule__Auxiliary__NameAssignment_0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1494:1: ( ( rule__Auxiliary__NameAssignment_0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1495:1: ( rule__Auxiliary__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getNameAssignment_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1496:1: ( rule__Auxiliary__NameAssignment_0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1496:2: rule__Auxiliary__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__NameAssignment_0_in_rule__Auxiliary__Group__0__Impl3116);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1506:1: rule__Auxiliary__Group__1 : rule__Auxiliary__Group__1__Impl rule__Auxiliary__Group__2 ;
    public final void rule__Auxiliary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1510:1: ( rule__Auxiliary__Group__1__Impl rule__Auxiliary__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1511:2: rule__Auxiliary__Group__1__Impl rule__Auxiliary__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group__1__Impl_in_rule__Auxiliary__Group__13146);
            rule__Auxiliary__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group__2_in_rule__Auxiliary__Group__13149);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1518:1: rule__Auxiliary__Group__1__Impl : ( ( rule__Auxiliary__Group_1__0 )? ) ;
    public final void rule__Auxiliary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1522:1: ( ( ( rule__Auxiliary__Group_1__0 )? ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1523:1: ( ( rule__Auxiliary__Group_1__0 )? )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1523:1: ( ( rule__Auxiliary__Group_1__0 )? )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1524:1: ( rule__Auxiliary__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getGroup_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1525:1: ( rule__Auxiliary__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1525:2: rule__Auxiliary__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1__0_in_rule__Auxiliary__Group__1__Impl3176);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1535:1: rule__Auxiliary__Group__2 : rule__Auxiliary__Group__2__Impl rule__Auxiliary__Group__3 ;
    public final void rule__Auxiliary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1539:1: ( rule__Auxiliary__Group__2__Impl rule__Auxiliary__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1540:2: rule__Auxiliary__Group__2__Impl rule__Auxiliary__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group__2__Impl_in_rule__Auxiliary__Group__23207);
            rule__Auxiliary__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group__3_in_rule__Auxiliary__Group__23210);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1547:1: rule__Auxiliary__Group__2__Impl : ( '=' ) ;
    public final void rule__Auxiliary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1551:1: ( ( '=' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1552:1: ( '=' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1552:1: ( '=' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1553:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getEqualsSignKeyword_2()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Auxiliary__Group__2__Impl3238); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1566:1: rule__Auxiliary__Group__3 : rule__Auxiliary__Group__3__Impl ;
    public final void rule__Auxiliary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1570:1: ( rule__Auxiliary__Group__3__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1571:2: rule__Auxiliary__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group__3__Impl_in_rule__Auxiliary__Group__33269);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1577:1: rule__Auxiliary__Group__3__Impl : ( ( rule__Auxiliary__BodyAssignment_3 ) ) ;
    public final void rule__Auxiliary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1581:1: ( ( ( rule__Auxiliary__BodyAssignment_3 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1582:1: ( ( rule__Auxiliary__BodyAssignment_3 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1582:1: ( ( rule__Auxiliary__BodyAssignment_3 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1583:1: ( rule__Auxiliary__BodyAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getBodyAssignment_3()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1584:1: ( rule__Auxiliary__BodyAssignment_3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1584:2: rule__Auxiliary__BodyAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__BodyAssignment_3_in_rule__Auxiliary__Group__3__Impl3296);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1602:1: rule__Auxiliary__Group_1__0 : rule__Auxiliary__Group_1__0__Impl rule__Auxiliary__Group_1__1 ;
    public final void rule__Auxiliary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1606:1: ( rule__Auxiliary__Group_1__0__Impl rule__Auxiliary__Group_1__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1607:2: rule__Auxiliary__Group_1__0__Impl rule__Auxiliary__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1__0__Impl_in_rule__Auxiliary__Group_1__03334);
            rule__Auxiliary__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1__1_in_rule__Auxiliary__Group_1__03337);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1614:1: rule__Auxiliary__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Auxiliary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1618:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1619:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1619:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1620:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Auxiliary__Group_1__0__Impl3365); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1633:1: rule__Auxiliary__Group_1__1 : rule__Auxiliary__Group_1__1__Impl rule__Auxiliary__Group_1__2 ;
    public final void rule__Auxiliary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1637:1: ( rule__Auxiliary__Group_1__1__Impl rule__Auxiliary__Group_1__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1638:2: rule__Auxiliary__Group_1__1__Impl rule__Auxiliary__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1__1__Impl_in_rule__Auxiliary__Group_1__13396);
            rule__Auxiliary__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1__2_in_rule__Auxiliary__Group_1__13399);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1645:1: rule__Auxiliary__Group_1__1__Impl : ( ( rule__Auxiliary__FormalParamsAssignment_1_1 ) ) ;
    public final void rule__Auxiliary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1649:1: ( ( ( rule__Auxiliary__FormalParamsAssignment_1_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1650:1: ( ( rule__Auxiliary__FormalParamsAssignment_1_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1650:1: ( ( rule__Auxiliary__FormalParamsAssignment_1_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1651:1: ( rule__Auxiliary__FormalParamsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getFormalParamsAssignment_1_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1652:1: ( rule__Auxiliary__FormalParamsAssignment_1_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1652:2: rule__Auxiliary__FormalParamsAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__FormalParamsAssignment_1_1_in_rule__Auxiliary__Group_1__1__Impl3426);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1662:1: rule__Auxiliary__Group_1__2 : rule__Auxiliary__Group_1__2__Impl rule__Auxiliary__Group_1__3 ;
    public final void rule__Auxiliary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1666:1: ( rule__Auxiliary__Group_1__2__Impl rule__Auxiliary__Group_1__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1667:2: rule__Auxiliary__Group_1__2__Impl rule__Auxiliary__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1__2__Impl_in_rule__Auxiliary__Group_1__23456);
            rule__Auxiliary__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1__3_in_rule__Auxiliary__Group_1__23459);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1674:1: rule__Auxiliary__Group_1__2__Impl : ( ( rule__Auxiliary__Group_1_2__0 )* ) ;
    public final void rule__Auxiliary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1678:1: ( ( ( rule__Auxiliary__Group_1_2__0 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1679:1: ( ( rule__Auxiliary__Group_1_2__0 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1679:1: ( ( rule__Auxiliary__Group_1_2__0 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1680:1: ( rule__Auxiliary__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getGroup_1_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1681:1: ( rule__Auxiliary__Group_1_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1681:2: rule__Auxiliary__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1_2__0_in_rule__Auxiliary__Group_1__2__Impl3486);
            	    rule__Auxiliary__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1691:1: rule__Auxiliary__Group_1__3 : rule__Auxiliary__Group_1__3__Impl ;
    public final void rule__Auxiliary__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1695:1: ( rule__Auxiliary__Group_1__3__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1696:2: rule__Auxiliary__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1__3__Impl_in_rule__Auxiliary__Group_1__33517);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1702:1: rule__Auxiliary__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Auxiliary__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1706:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1707:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1707:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1708:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getRightParenthesisKeyword_1_3()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Auxiliary__Group_1__3__Impl3545); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1729:1: rule__Auxiliary__Group_1_2__0 : rule__Auxiliary__Group_1_2__0__Impl rule__Auxiliary__Group_1_2__1 ;
    public final void rule__Auxiliary__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1733:1: ( rule__Auxiliary__Group_1_2__0__Impl rule__Auxiliary__Group_1_2__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1734:2: rule__Auxiliary__Group_1_2__0__Impl rule__Auxiliary__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1_2__0__Impl_in_rule__Auxiliary__Group_1_2__03584);
            rule__Auxiliary__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1_2__1_in_rule__Auxiliary__Group_1_2__03587);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1741:1: rule__Auxiliary__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Auxiliary__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1745:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1746:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1746:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1747:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getCommaKeyword_1_2_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Auxiliary__Group_1_2__0__Impl3615); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1760:1: rule__Auxiliary__Group_1_2__1 : rule__Auxiliary__Group_1_2__1__Impl ;
    public final void rule__Auxiliary__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1764:1: ( rule__Auxiliary__Group_1_2__1__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1765:2: rule__Auxiliary__Group_1_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__Group_1_2__1__Impl_in_rule__Auxiliary__Group_1_2__13646);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1771:1: rule__Auxiliary__Group_1_2__1__Impl : ( ( rule__Auxiliary__FormalParamsAssignment_1_2_1 ) ) ;
    public final void rule__Auxiliary__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1775:1: ( ( ( rule__Auxiliary__FormalParamsAssignment_1_2_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1776:1: ( ( rule__Auxiliary__FormalParamsAssignment_1_2_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1776:1: ( ( rule__Auxiliary__FormalParamsAssignment_1_2_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1777:1: ( rule__Auxiliary__FormalParamsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getFormalParamsAssignment_1_2_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1778:1: ( rule__Auxiliary__FormalParamsAssignment_1_2_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1778:2: rule__Auxiliary__FormalParamsAssignment_1_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Auxiliary__FormalParamsAssignment_1_2_1_in_rule__Auxiliary__Group_1_2__1__Impl3673);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1792:1: rule__One__Group__0 : rule__One__Group__0__Impl rule__One__Group__1 ;
    public final void rule__One__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1796:1: ( rule__One__Group__0__Impl rule__One__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1797:2: rule__One__Group__0__Impl rule__One__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__0__Impl_in_rule__One__Group__03707);
            rule__One__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__1_in_rule__One__Group__03710);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1804:1: rule__One__Group__0__Impl : ( 'One' ) ;
    public final void rule__One__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1808:1: ( ( 'One' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1809:1: ( 'One' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1809:1: ( 'One' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1810:1: 'One'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneAccess().getOneKeyword_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__One__Group__0__Impl3738); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1823:1: rule__One__Group__1 : rule__One__Group__1__Impl rule__One__Group__2 ;
    public final void rule__One__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1827:1: ( rule__One__Group__1__Impl rule__One__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1828:2: rule__One__Group__1__Impl rule__One__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__1__Impl_in_rule__One__Group__13769);
            rule__One__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__2_in_rule__One__Group__13772);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1835:1: rule__One__Group__1__Impl : ( '(' ) ;
    public final void rule__One__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1839:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1840:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1840:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1841:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__One__Group__1__Impl3800); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1854:1: rule__One__Group__2 : rule__One__Group__2__Impl rule__One__Group__3 ;
    public final void rule__One__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1858:1: ( rule__One__Group__2__Impl rule__One__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1859:2: rule__One__Group__2__Impl rule__One__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__2__Impl_in_rule__One__Group__23831);
            rule__One__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__3_in_rule__One__Group__23834);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1866:1: rule__One__Group__2__Impl : ( ( rule__One__SAssignment_2 ) ) ;
    public final void rule__One__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1870:1: ( ( ( rule__One__SAssignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1871:1: ( ( rule__One__SAssignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1871:1: ( ( rule__One__SAssignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1872:1: ( rule__One__SAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneAccess().getSAssignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1873:1: ( rule__One__SAssignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1873:2: rule__One__SAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__One__SAssignment_2_in_rule__One__Group__2__Impl3861);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1883:1: rule__One__Group__3 : rule__One__Group__3__Impl rule__One__Group__4 ;
    public final void rule__One__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1887:1: ( rule__One__Group__3__Impl rule__One__Group__4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1888:2: rule__One__Group__3__Impl rule__One__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__3__Impl_in_rule__One__Group__33891);
            rule__One__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__4_in_rule__One__Group__33894);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1895:1: rule__One__Group__3__Impl : ( ',' ) ;
    public final void rule__One__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1899:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1900:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1900:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1901:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneAccess().getCommaKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__One__Group__3__Impl3922); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1914:1: rule__One__Group__4 : rule__One__Group__4__Impl rule__One__Group__5 ;
    public final void rule__One__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1918:1: ( rule__One__Group__4__Impl rule__One__Group__5 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1919:2: rule__One__Group__4__Impl rule__One__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__4__Impl_in_rule__One__Group__43953);
            rule__One__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__5_in_rule__One__Group__43956);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1926:1: rule__One__Group__4__Impl : ( ( rule__One__NAssignment_4 ) ) ;
    public final void rule__One__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1930:1: ( ( ( rule__One__NAssignment_4 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1931:1: ( ( rule__One__NAssignment_4 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1931:1: ( ( rule__One__NAssignment_4 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1932:1: ( rule__One__NAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneAccess().getNAssignment_4()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1933:1: ( rule__One__NAssignment_4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1933:2: rule__One__NAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__One__NAssignment_4_in_rule__One__Group__4__Impl3983);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1943:1: rule__One__Group__5 : rule__One__Group__5__Impl ;
    public final void rule__One__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1947:1: ( rule__One__Group__5__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1948:2: rule__One__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__One__Group__5__Impl_in_rule__One__Group__54013);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1954:1: rule__One__Group__5__Impl : ( ')' ) ;
    public final void rule__One__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1958:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1959:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1959:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1960:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__One__Group__5__Impl4041); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1985:1: rule__DeclaredStrategyInstance__Group__0 : rule__DeclaredStrategyInstance__Group__0__Impl rule__DeclaredStrategyInstance__Group__1 ;
    public final void rule__DeclaredStrategyInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1989:1: ( rule__DeclaredStrategyInstance__Group__0__Impl rule__DeclaredStrategyInstance__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1990:2: rule__DeclaredStrategyInstance__Group__0__Impl rule__DeclaredStrategyInstance__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group__0__Impl_in_rule__DeclaredStrategyInstance__Group__04084);
            rule__DeclaredStrategyInstance__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group__1_in_rule__DeclaredStrategyInstance__Group__04087);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:1997:1: rule__DeclaredStrategyInstance__Group__0__Impl : ( () ) ;
    public final void rule__DeclaredStrategyInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2001:1: ( ( () ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2002:1: ( () )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2002:1: ( () )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2003:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getDeclaredStrategyInstanceAction_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2004:1: ()
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2006:1: 
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2016:1: rule__DeclaredStrategyInstance__Group__1 : rule__DeclaredStrategyInstance__Group__1__Impl rule__DeclaredStrategyInstance__Group__2 ;
    public final void rule__DeclaredStrategyInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2020:1: ( rule__DeclaredStrategyInstance__Group__1__Impl rule__DeclaredStrategyInstance__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2021:2: rule__DeclaredStrategyInstance__Group__1__Impl rule__DeclaredStrategyInstance__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group__1__Impl_in_rule__DeclaredStrategyInstance__Group__14145);
            rule__DeclaredStrategyInstance__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group__2_in_rule__DeclaredStrategyInstance__Group__14148);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2028:1: rule__DeclaredStrategyInstance__Group__1__Impl : ( ( rule__DeclaredStrategyInstance__DeclarationAssignment_1 ) ) ;
    public final void rule__DeclaredStrategyInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2032:1: ( ( ( rule__DeclaredStrategyInstance__DeclarationAssignment_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2033:1: ( ( rule__DeclaredStrategyInstance__DeclarationAssignment_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2033:1: ( ( rule__DeclaredStrategyInstance__DeclarationAssignment_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2034:1: ( rule__DeclaredStrategyInstance__DeclarationAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getDeclarationAssignment_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2035:1: ( rule__DeclaredStrategyInstance__DeclarationAssignment_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2035:2: rule__DeclaredStrategyInstance__DeclarationAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__DeclarationAssignment_1_in_rule__DeclaredStrategyInstance__Group__1__Impl4175);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2045:1: rule__DeclaredStrategyInstance__Group__2 : rule__DeclaredStrategyInstance__Group__2__Impl rule__DeclaredStrategyInstance__Group__3 ;
    public final void rule__DeclaredStrategyInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2049:1: ( rule__DeclaredStrategyInstance__Group__2__Impl rule__DeclaredStrategyInstance__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2050:2: rule__DeclaredStrategyInstance__Group__2__Impl rule__DeclaredStrategyInstance__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group__2__Impl_in_rule__DeclaredStrategyInstance__Group__24205);
            rule__DeclaredStrategyInstance__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group__3_in_rule__DeclaredStrategyInstance__Group__24208);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2057:1: rule__DeclaredStrategyInstance__Group__2__Impl : ( '(' ) ;
    public final void rule__DeclaredStrategyInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2061:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2062:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2062:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2063:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__DeclaredStrategyInstance__Group__2__Impl4236); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2076:1: rule__DeclaredStrategyInstance__Group__3 : rule__DeclaredStrategyInstance__Group__3__Impl rule__DeclaredStrategyInstance__Group__4 ;
    public final void rule__DeclaredStrategyInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2080:1: ( rule__DeclaredStrategyInstance__Group__3__Impl rule__DeclaredStrategyInstance__Group__4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2081:2: rule__DeclaredStrategyInstance__Group__3__Impl rule__DeclaredStrategyInstance__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group__3__Impl_in_rule__DeclaredStrategyInstance__Group__34267);
            rule__DeclaredStrategyInstance__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group__4_in_rule__DeclaredStrategyInstance__Group__34270);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2088:1: rule__DeclaredStrategyInstance__Group__3__Impl : ( ( rule__DeclaredStrategyInstance__Group_3__0 )? ) ;
    public final void rule__DeclaredStrategyInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2092:1: ( ( ( rule__DeclaredStrategyInstance__Group_3__0 )? ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2093:1: ( ( rule__DeclaredStrategyInstance__Group_3__0 )? )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2093:1: ( ( rule__DeclaredStrategyInstance__Group_3__0 )? )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2094:1: ( rule__DeclaredStrategyInstance__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getGroup_3()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2095:1: ( rule__DeclaredStrategyInstance__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||(LA10_0>=20 && LA10_0<=23)||(LA10_0>=25 && LA10_0<=31)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2095:2: rule__DeclaredStrategyInstance__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group_3__0_in_rule__DeclaredStrategyInstance__Group__3__Impl4297);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2105:1: rule__DeclaredStrategyInstance__Group__4 : rule__DeclaredStrategyInstance__Group__4__Impl ;
    public final void rule__DeclaredStrategyInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2109:1: ( rule__DeclaredStrategyInstance__Group__4__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2110:2: rule__DeclaredStrategyInstance__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group__4__Impl_in_rule__DeclaredStrategyInstance__Group__44328);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2116:1: rule__DeclaredStrategyInstance__Group__4__Impl : ( ')' ) ;
    public final void rule__DeclaredStrategyInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2120:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2121:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2121:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2122:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__DeclaredStrategyInstance__Group__4__Impl4356); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2145:1: rule__DeclaredStrategyInstance__Group_3__0 : rule__DeclaredStrategyInstance__Group_3__0__Impl rule__DeclaredStrategyInstance__Group_3__1 ;
    public final void rule__DeclaredStrategyInstance__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2149:1: ( rule__DeclaredStrategyInstance__Group_3__0__Impl rule__DeclaredStrategyInstance__Group_3__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2150:2: rule__DeclaredStrategyInstance__Group_3__0__Impl rule__DeclaredStrategyInstance__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group_3__0__Impl_in_rule__DeclaredStrategyInstance__Group_3__04397);
            rule__DeclaredStrategyInstance__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group_3__1_in_rule__DeclaredStrategyInstance__Group_3__04400);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2157:1: rule__DeclaredStrategyInstance__Group_3__0__Impl : ( ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0 ) ) ;
    public final void rule__DeclaredStrategyInstance__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2161:1: ( ( ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2162:1: ( ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2162:1: ( ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2163:1: ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getActualParamsAssignment_3_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2164:1: ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2164:2: rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0_in_rule__DeclaredStrategyInstance__Group_3__0__Impl4427);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2174:1: rule__DeclaredStrategyInstance__Group_3__1 : rule__DeclaredStrategyInstance__Group_3__1__Impl ;
    public final void rule__DeclaredStrategyInstance__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2178:1: ( rule__DeclaredStrategyInstance__Group_3__1__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2179:2: rule__DeclaredStrategyInstance__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group_3__1__Impl_in_rule__DeclaredStrategyInstance__Group_3__14457);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2185:1: rule__DeclaredStrategyInstance__Group_3__1__Impl : ( ( rule__DeclaredStrategyInstance__Group_3_1__0 )* ) ;
    public final void rule__DeclaredStrategyInstance__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2189:1: ( ( ( rule__DeclaredStrategyInstance__Group_3_1__0 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2190:1: ( ( rule__DeclaredStrategyInstance__Group_3_1__0 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2190:1: ( ( rule__DeclaredStrategyInstance__Group_3_1__0 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2191:1: ( rule__DeclaredStrategyInstance__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getGroup_3_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2192:1: ( rule__DeclaredStrategyInstance__Group_3_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2192:2: rule__DeclaredStrategyInstance__Group_3_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group_3_1__0_in_rule__DeclaredStrategyInstance__Group_3__1__Impl4484);
            	    rule__DeclaredStrategyInstance__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2206:1: rule__DeclaredStrategyInstance__Group_3_1__0 : rule__DeclaredStrategyInstance__Group_3_1__0__Impl rule__DeclaredStrategyInstance__Group_3_1__1 ;
    public final void rule__DeclaredStrategyInstance__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2210:1: ( rule__DeclaredStrategyInstance__Group_3_1__0__Impl rule__DeclaredStrategyInstance__Group_3_1__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2211:2: rule__DeclaredStrategyInstance__Group_3_1__0__Impl rule__DeclaredStrategyInstance__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group_3_1__0__Impl_in_rule__DeclaredStrategyInstance__Group_3_1__04519);
            rule__DeclaredStrategyInstance__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group_3_1__1_in_rule__DeclaredStrategyInstance__Group_3_1__04522);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2218:1: rule__DeclaredStrategyInstance__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__DeclaredStrategyInstance__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2222:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2223:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2223:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2224:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__DeclaredStrategyInstance__Group_3_1__0__Impl4550); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2237:1: rule__DeclaredStrategyInstance__Group_3_1__1 : rule__DeclaredStrategyInstance__Group_3_1__1__Impl ;
    public final void rule__DeclaredStrategyInstance__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2241:1: ( rule__DeclaredStrategyInstance__Group_3_1__1__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2242:2: rule__DeclaredStrategyInstance__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__Group_3_1__1__Impl_in_rule__DeclaredStrategyInstance__Group_3_1__14581);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2248:1: rule__DeclaredStrategyInstance__Group_3_1__1__Impl : ( ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1 ) ) ;
    public final void rule__DeclaredStrategyInstance__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2252:1: ( ( ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2253:1: ( ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2253:1: ( ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2254:1: ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getActualParamsAssignment_3_1_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2255:1: ( rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2255:2: rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1_in_rule__DeclaredStrategyInstance__Group_3_1__1__Impl4608);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2269:1: rule__Saturation__Group__0 : rule__Saturation__Group__0__Impl rule__Saturation__Group__1 ;
    public final void rule__Saturation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2273:1: ( rule__Saturation__Group__0__Impl rule__Saturation__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2274:2: rule__Saturation__Group__0__Impl rule__Saturation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__0__Impl_in_rule__Saturation__Group__04642);
            rule__Saturation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__1_in_rule__Saturation__Group__04645);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2281:1: rule__Saturation__Group__0__Impl : ( 'Saturation' ) ;
    public final void rule__Saturation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2285:1: ( ( 'Saturation' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2286:1: ( 'Saturation' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2286:1: ( 'Saturation' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2287:1: 'Saturation'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSaturationAccess().getSaturationKeyword_0()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Saturation__Group__0__Impl4673); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2300:1: rule__Saturation__Group__1 : rule__Saturation__Group__1__Impl rule__Saturation__Group__2 ;
    public final void rule__Saturation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2304:1: ( rule__Saturation__Group__1__Impl rule__Saturation__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2305:2: rule__Saturation__Group__1__Impl rule__Saturation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__1__Impl_in_rule__Saturation__Group__14704);
            rule__Saturation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__2_in_rule__Saturation__Group__14707);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2312:1: rule__Saturation__Group__1__Impl : ( '(' ) ;
    public final void rule__Saturation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2316:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2317:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2317:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2318:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSaturationAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Saturation__Group__1__Impl4735); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2331:1: rule__Saturation__Group__2 : rule__Saturation__Group__2__Impl rule__Saturation__Group__3 ;
    public final void rule__Saturation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2335:1: ( rule__Saturation__Group__2__Impl rule__Saturation__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2336:2: rule__Saturation__Group__2__Impl rule__Saturation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__2__Impl_in_rule__Saturation__Group__24766);
            rule__Saturation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__3_in_rule__Saturation__Group__24769);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2343:1: rule__Saturation__Group__2__Impl : ( ( rule__Saturation__SAssignment_2 ) ) ;
    public final void rule__Saturation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2347:1: ( ( ( rule__Saturation__SAssignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2348:1: ( ( rule__Saturation__SAssignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2348:1: ( ( rule__Saturation__SAssignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2349:1: ( rule__Saturation__SAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSaturationAccess().getSAssignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2350:1: ( rule__Saturation__SAssignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2350:2: rule__Saturation__SAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__SAssignment_2_in_rule__Saturation__Group__2__Impl4796);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2360:1: rule__Saturation__Group__3 : rule__Saturation__Group__3__Impl rule__Saturation__Group__4 ;
    public final void rule__Saturation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2364:1: ( rule__Saturation__Group__3__Impl rule__Saturation__Group__4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2365:2: rule__Saturation__Group__3__Impl rule__Saturation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__3__Impl_in_rule__Saturation__Group__34826);
            rule__Saturation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__4_in_rule__Saturation__Group__34829);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2372:1: rule__Saturation__Group__3__Impl : ( ',' ) ;
    public final void rule__Saturation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2376:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2377:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2377:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2378:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSaturationAccess().getCommaKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Saturation__Group__3__Impl4857); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2391:1: rule__Saturation__Group__4 : rule__Saturation__Group__4__Impl rule__Saturation__Group__5 ;
    public final void rule__Saturation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2395:1: ( rule__Saturation__Group__4__Impl rule__Saturation__Group__5 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2396:2: rule__Saturation__Group__4__Impl rule__Saturation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__4__Impl_in_rule__Saturation__Group__44888);
            rule__Saturation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__5_in_rule__Saturation__Group__44891);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2403:1: rule__Saturation__Group__4__Impl : ( ( rule__Saturation__NAssignment_4 ) ) ;
    public final void rule__Saturation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2407:1: ( ( ( rule__Saturation__NAssignment_4 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2408:1: ( ( rule__Saturation__NAssignment_4 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2408:1: ( ( rule__Saturation__NAssignment_4 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2409:1: ( rule__Saturation__NAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSaturationAccess().getNAssignment_4()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2410:1: ( rule__Saturation__NAssignment_4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2410:2: rule__Saturation__NAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__NAssignment_4_in_rule__Saturation__Group__4__Impl4918);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2420:1: rule__Saturation__Group__5 : rule__Saturation__Group__5__Impl ;
    public final void rule__Saturation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2424:1: ( rule__Saturation__Group__5__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2425:2: rule__Saturation__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Saturation__Group__5__Impl_in_rule__Saturation__Group__54948);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2431:1: rule__Saturation__Group__5__Impl : ( ')' ) ;
    public final void rule__Saturation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2435:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2436:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2436:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2437:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSaturationAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Saturation__Group__5__Impl4976); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2462:1: rule__IfThenElse__Group__0 : rule__IfThenElse__Group__0__Impl rule__IfThenElse__Group__1 ;
    public final void rule__IfThenElse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2466:1: ( rule__IfThenElse__Group__0__Impl rule__IfThenElse__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2467:2: rule__IfThenElse__Group__0__Impl rule__IfThenElse__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__0__Impl_in_rule__IfThenElse__Group__05019);
            rule__IfThenElse__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__1_in_rule__IfThenElse__Group__05022);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2474:1: rule__IfThenElse__Group__0__Impl : ( 'IfThenElse' ) ;
    public final void rule__IfThenElse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2478:1: ( ( 'IfThenElse' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2479:1: ( 'IfThenElse' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2479:1: ( 'IfThenElse' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2480:1: 'IfThenElse'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getIfThenElseKeyword_0()); 
            }
            match(input,22,FollowSets000.FOLLOW_22_in_rule__IfThenElse__Group__0__Impl5050); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2493:1: rule__IfThenElse__Group__1 : rule__IfThenElse__Group__1__Impl rule__IfThenElse__Group__2 ;
    public final void rule__IfThenElse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2497:1: ( rule__IfThenElse__Group__1__Impl rule__IfThenElse__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2498:2: rule__IfThenElse__Group__1__Impl rule__IfThenElse__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__1__Impl_in_rule__IfThenElse__Group__15081);
            rule__IfThenElse__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__2_in_rule__IfThenElse__Group__15084);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2505:1: rule__IfThenElse__Group__1__Impl : ( '(' ) ;
    public final void rule__IfThenElse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2509:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2510:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2510:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2511:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__IfThenElse__Group__1__Impl5112); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2524:1: rule__IfThenElse__Group__2 : rule__IfThenElse__Group__2__Impl rule__IfThenElse__Group__3 ;
    public final void rule__IfThenElse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2528:1: ( rule__IfThenElse__Group__2__Impl rule__IfThenElse__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2529:2: rule__IfThenElse__Group__2__Impl rule__IfThenElse__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__2__Impl_in_rule__IfThenElse__Group__25143);
            rule__IfThenElse__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__3_in_rule__IfThenElse__Group__25146);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2536:1: rule__IfThenElse__Group__2__Impl : ( ( rule__IfThenElse__S1Assignment_2 ) ) ;
    public final void rule__IfThenElse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2540:1: ( ( ( rule__IfThenElse__S1Assignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2541:1: ( ( rule__IfThenElse__S1Assignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2541:1: ( ( rule__IfThenElse__S1Assignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2542:1: ( rule__IfThenElse__S1Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getS1Assignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2543:1: ( rule__IfThenElse__S1Assignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2543:2: rule__IfThenElse__S1Assignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__S1Assignment_2_in_rule__IfThenElse__Group__2__Impl5173);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2553:1: rule__IfThenElse__Group__3 : rule__IfThenElse__Group__3__Impl rule__IfThenElse__Group__4 ;
    public final void rule__IfThenElse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2557:1: ( rule__IfThenElse__Group__3__Impl rule__IfThenElse__Group__4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2558:2: rule__IfThenElse__Group__3__Impl rule__IfThenElse__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__3__Impl_in_rule__IfThenElse__Group__35203);
            rule__IfThenElse__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__4_in_rule__IfThenElse__Group__35206);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2565:1: rule__IfThenElse__Group__3__Impl : ( ',' ) ;
    public final void rule__IfThenElse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2569:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2570:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2570:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2571:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getCommaKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__IfThenElse__Group__3__Impl5234); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2584:1: rule__IfThenElse__Group__4 : rule__IfThenElse__Group__4__Impl rule__IfThenElse__Group__5 ;
    public final void rule__IfThenElse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2588:1: ( rule__IfThenElse__Group__4__Impl rule__IfThenElse__Group__5 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2589:2: rule__IfThenElse__Group__4__Impl rule__IfThenElse__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__4__Impl_in_rule__IfThenElse__Group__45265);
            rule__IfThenElse__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__5_in_rule__IfThenElse__Group__45268);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2596:1: rule__IfThenElse__Group__4__Impl : ( ( rule__IfThenElse__S2Assignment_4 ) ) ;
    public final void rule__IfThenElse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2600:1: ( ( ( rule__IfThenElse__S2Assignment_4 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2601:1: ( ( rule__IfThenElse__S2Assignment_4 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2601:1: ( ( rule__IfThenElse__S2Assignment_4 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2602:1: ( rule__IfThenElse__S2Assignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getS2Assignment_4()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2603:1: ( rule__IfThenElse__S2Assignment_4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2603:2: rule__IfThenElse__S2Assignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__S2Assignment_4_in_rule__IfThenElse__Group__4__Impl5295);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2613:1: rule__IfThenElse__Group__5 : rule__IfThenElse__Group__5__Impl rule__IfThenElse__Group__6 ;
    public final void rule__IfThenElse__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2617:1: ( rule__IfThenElse__Group__5__Impl rule__IfThenElse__Group__6 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2618:2: rule__IfThenElse__Group__5__Impl rule__IfThenElse__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__5__Impl_in_rule__IfThenElse__Group__55325);
            rule__IfThenElse__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__6_in_rule__IfThenElse__Group__55328);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2625:1: rule__IfThenElse__Group__5__Impl : ( ',' ) ;
    public final void rule__IfThenElse__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2629:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2630:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2630:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2631:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getCommaKeyword_5()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__IfThenElse__Group__5__Impl5356); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2644:1: rule__IfThenElse__Group__6 : rule__IfThenElse__Group__6__Impl rule__IfThenElse__Group__7 ;
    public final void rule__IfThenElse__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2648:1: ( rule__IfThenElse__Group__6__Impl rule__IfThenElse__Group__7 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2649:2: rule__IfThenElse__Group__6__Impl rule__IfThenElse__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__6__Impl_in_rule__IfThenElse__Group__65387);
            rule__IfThenElse__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__7_in_rule__IfThenElse__Group__65390);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2656:1: rule__IfThenElse__Group__6__Impl : ( ( rule__IfThenElse__S3Assignment_6 ) ) ;
    public final void rule__IfThenElse__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2660:1: ( ( ( rule__IfThenElse__S3Assignment_6 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2661:1: ( ( rule__IfThenElse__S3Assignment_6 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2661:1: ( ( rule__IfThenElse__S3Assignment_6 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2662:1: ( rule__IfThenElse__S3Assignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getS3Assignment_6()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2663:1: ( rule__IfThenElse__S3Assignment_6 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2663:2: rule__IfThenElse__S3Assignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__S3Assignment_6_in_rule__IfThenElse__Group__6__Impl5417);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2673:1: rule__IfThenElse__Group__7 : rule__IfThenElse__Group__7__Impl ;
    public final void rule__IfThenElse__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2677:1: ( rule__IfThenElse__Group__7__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2678:2: rule__IfThenElse__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__IfThenElse__Group__7__Impl_in_rule__IfThenElse__Group__75447);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2684:1: rule__IfThenElse__Group__7__Impl : ( ')' ) ;
    public final void rule__IfThenElse__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2688:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2689:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2689:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2690:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getRightParenthesisKeyword_7()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__IfThenElse__Group__7__Impl5475); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2719:1: rule__SimpleStrategy__Group__0 : rule__SimpleStrategy__Group__0__Impl rule__SimpleStrategy__Group__1 ;
    public final void rule__SimpleStrategy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2723:1: ( rule__SimpleStrategy__Group__0__Impl rule__SimpleStrategy__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2724:2: rule__SimpleStrategy__Group__0__Impl rule__SimpleStrategy__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group__0__Impl_in_rule__SimpleStrategy__Group__05522);
            rule__SimpleStrategy__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group__1_in_rule__SimpleStrategy__Group__05525);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2731:1: rule__SimpleStrategy__Group__0__Impl : ( '{' ) ;
    public final void rule__SimpleStrategy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2735:1: ( ( '{' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2736:1: ( '{' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2736:1: ( '{' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2737:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleStrategyAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__SimpleStrategy__Group__0__Impl5553); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2750:1: rule__SimpleStrategy__Group__1 : rule__SimpleStrategy__Group__1__Impl rule__SimpleStrategy__Group__2 ;
    public final void rule__SimpleStrategy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2754:1: ( rule__SimpleStrategy__Group__1__Impl rule__SimpleStrategy__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2755:2: rule__SimpleStrategy__Group__1__Impl rule__SimpleStrategy__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group__1__Impl_in_rule__SimpleStrategy__Group__15584);
            rule__SimpleStrategy__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group__2_in_rule__SimpleStrategy__Group__15587);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2762:1: rule__SimpleStrategy__Group__1__Impl : ( ( rule__SimpleStrategy__EquationsAssignment_1 ) ) ;
    public final void rule__SimpleStrategy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2766:1: ( ( ( rule__SimpleStrategy__EquationsAssignment_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2767:1: ( ( rule__SimpleStrategy__EquationsAssignment_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2767:1: ( ( rule__SimpleStrategy__EquationsAssignment_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2768:1: ( rule__SimpleStrategy__EquationsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleStrategyAccess().getEquationsAssignment_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2769:1: ( rule__SimpleStrategy__EquationsAssignment_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2769:2: rule__SimpleStrategy__EquationsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__EquationsAssignment_1_in_rule__SimpleStrategy__Group__1__Impl5614);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2779:1: rule__SimpleStrategy__Group__2 : rule__SimpleStrategy__Group__2__Impl rule__SimpleStrategy__Group__3 ;
    public final void rule__SimpleStrategy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2783:1: ( rule__SimpleStrategy__Group__2__Impl rule__SimpleStrategy__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2784:2: rule__SimpleStrategy__Group__2__Impl rule__SimpleStrategy__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group__2__Impl_in_rule__SimpleStrategy__Group__25644);
            rule__SimpleStrategy__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group__3_in_rule__SimpleStrategy__Group__25647);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2791:1: rule__SimpleStrategy__Group__2__Impl : ( ( rule__SimpleStrategy__Group_2__0 )* ) ;
    public final void rule__SimpleStrategy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2795:1: ( ( ( rule__SimpleStrategy__Group_2__0 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2796:1: ( ( rule__SimpleStrategy__Group_2__0 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2796:1: ( ( rule__SimpleStrategy__Group_2__0 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2797:1: ( rule__SimpleStrategy__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleStrategyAccess().getGroup_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2798:1: ( rule__SimpleStrategy__Group_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2798:2: rule__SimpleStrategy__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group_2__0_in_rule__SimpleStrategy__Group__2__Impl5674);
            	    rule__SimpleStrategy__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2808:1: rule__SimpleStrategy__Group__3 : rule__SimpleStrategy__Group__3__Impl ;
    public final void rule__SimpleStrategy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2812:1: ( rule__SimpleStrategy__Group__3__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2813:2: rule__SimpleStrategy__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group__3__Impl_in_rule__SimpleStrategy__Group__35705);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2819:1: rule__SimpleStrategy__Group__3__Impl : ( '}' ) ;
    public final void rule__SimpleStrategy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2823:1: ( ( '}' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2824:1: ( '}' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2824:1: ( '}' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2825:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleStrategyAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,24,FollowSets000.FOLLOW_24_in_rule__SimpleStrategy__Group__3__Impl5733); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2846:1: rule__SimpleStrategy__Group_2__0 : rule__SimpleStrategy__Group_2__0__Impl rule__SimpleStrategy__Group_2__1 ;
    public final void rule__SimpleStrategy__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2850:1: ( rule__SimpleStrategy__Group_2__0__Impl rule__SimpleStrategy__Group_2__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2851:2: rule__SimpleStrategy__Group_2__0__Impl rule__SimpleStrategy__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group_2__0__Impl_in_rule__SimpleStrategy__Group_2__05772);
            rule__SimpleStrategy__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group_2__1_in_rule__SimpleStrategy__Group_2__05775);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2858:1: rule__SimpleStrategy__Group_2__0__Impl : ( ',' ) ;
    public final void rule__SimpleStrategy__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2862:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2863:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2863:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2864:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleStrategyAccess().getCommaKeyword_2_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__SimpleStrategy__Group_2__0__Impl5803); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2877:1: rule__SimpleStrategy__Group_2__1 : rule__SimpleStrategy__Group_2__1__Impl ;
    public final void rule__SimpleStrategy__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2881:1: ( rule__SimpleStrategy__Group_2__1__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2882:2: rule__SimpleStrategy__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__Group_2__1__Impl_in_rule__SimpleStrategy__Group_2__15834);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2888:1: rule__SimpleStrategy__Group_2__1__Impl : ( ( rule__SimpleStrategy__EquationsAssignment_2_1 ) ) ;
    public final void rule__SimpleStrategy__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2892:1: ( ( ( rule__SimpleStrategy__EquationsAssignment_2_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2893:1: ( ( rule__SimpleStrategy__EquationsAssignment_2_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2893:1: ( ( rule__SimpleStrategy__EquationsAssignment_2_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2894:1: ( rule__SimpleStrategy__EquationsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleStrategyAccess().getEquationsAssignment_2_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2895:1: ( rule__SimpleStrategy__EquationsAssignment_2_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2895:2: rule__SimpleStrategy__EquationsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SimpleStrategy__EquationsAssignment_2_1_in_rule__SimpleStrategy__Group_2__1__Impl5861);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2909:1: rule__Not__Group__0 : rule__Not__Group__0__Impl rule__Not__Group__1 ;
    public final void rule__Not__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2913:1: ( rule__Not__Group__0__Impl rule__Not__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2914:2: rule__Not__Group__0__Impl rule__Not__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Not__Group__0__Impl_in_rule__Not__Group__05895);
            rule__Not__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Not__Group__1_in_rule__Not__Group__05898);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2921:1: rule__Not__Group__0__Impl : ( 'Not' ) ;
    public final void rule__Not__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2925:1: ( ( 'Not' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2926:1: ( 'Not' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2926:1: ( 'Not' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2927:1: 'Not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getNotKeyword_0()); 
            }
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Not__Group__0__Impl5926); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2940:1: rule__Not__Group__1 : rule__Not__Group__1__Impl rule__Not__Group__2 ;
    public final void rule__Not__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2944:1: ( rule__Not__Group__1__Impl rule__Not__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2945:2: rule__Not__Group__1__Impl rule__Not__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Not__Group__1__Impl_in_rule__Not__Group__15957);
            rule__Not__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Not__Group__2_in_rule__Not__Group__15960);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2952:1: rule__Not__Group__1__Impl : ( '(' ) ;
    public final void rule__Not__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2956:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2957:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2957:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2958:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Not__Group__1__Impl5988); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2971:1: rule__Not__Group__2 : rule__Not__Group__2__Impl rule__Not__Group__3 ;
    public final void rule__Not__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2975:1: ( rule__Not__Group__2__Impl rule__Not__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2976:2: rule__Not__Group__2__Impl rule__Not__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Not__Group__2__Impl_in_rule__Not__Group__26019);
            rule__Not__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Not__Group__3_in_rule__Not__Group__26022);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2983:1: rule__Not__Group__2__Impl : ( ( rule__Not__SAssignment_2 ) ) ;
    public final void rule__Not__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2987:1: ( ( ( rule__Not__SAssignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2988:1: ( ( rule__Not__SAssignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2988:1: ( ( rule__Not__SAssignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2989:1: ( rule__Not__SAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getSAssignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2990:1: ( rule__Not__SAssignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:2990:2: rule__Not__SAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Not__SAssignment_2_in_rule__Not__Group__2__Impl6049);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3000:1: rule__Not__Group__3 : rule__Not__Group__3__Impl ;
    public final void rule__Not__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3004:1: ( rule__Not__Group__3__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3005:2: rule__Not__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Not__Group__3__Impl_in_rule__Not__Group__36079);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3011:1: rule__Not__Group__3__Impl : ( ')' ) ;
    public final void rule__Not__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3015:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3016:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3016:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3017:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Not__Group__3__Impl6107); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3038:1: rule__Fixpoint__Group__0 : rule__Fixpoint__Group__0__Impl rule__Fixpoint__Group__1 ;
    public final void rule__Fixpoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3042:1: ( rule__Fixpoint__Group__0__Impl rule__Fixpoint__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3043:2: rule__Fixpoint__Group__0__Impl rule__Fixpoint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fixpoint__Group__0__Impl_in_rule__Fixpoint__Group__06146);
            rule__Fixpoint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Fixpoint__Group__1_in_rule__Fixpoint__Group__06149);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3050:1: rule__Fixpoint__Group__0__Impl : ( 'Fixpoint' ) ;
    public final void rule__Fixpoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3054:1: ( ( 'Fixpoint' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3055:1: ( 'Fixpoint' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3055:1: ( 'Fixpoint' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3056:1: 'Fixpoint'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixpointAccess().getFixpointKeyword_0()); 
            }
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Fixpoint__Group__0__Impl6177); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3069:1: rule__Fixpoint__Group__1 : rule__Fixpoint__Group__1__Impl rule__Fixpoint__Group__2 ;
    public final void rule__Fixpoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3073:1: ( rule__Fixpoint__Group__1__Impl rule__Fixpoint__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3074:2: rule__Fixpoint__Group__1__Impl rule__Fixpoint__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fixpoint__Group__1__Impl_in_rule__Fixpoint__Group__16208);
            rule__Fixpoint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Fixpoint__Group__2_in_rule__Fixpoint__Group__16211);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3081:1: rule__Fixpoint__Group__1__Impl : ( '(' ) ;
    public final void rule__Fixpoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3085:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3086:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3086:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3087:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixpointAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Fixpoint__Group__1__Impl6239); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3100:1: rule__Fixpoint__Group__2 : rule__Fixpoint__Group__2__Impl rule__Fixpoint__Group__3 ;
    public final void rule__Fixpoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3104:1: ( rule__Fixpoint__Group__2__Impl rule__Fixpoint__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3105:2: rule__Fixpoint__Group__2__Impl rule__Fixpoint__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fixpoint__Group__2__Impl_in_rule__Fixpoint__Group__26270);
            rule__Fixpoint__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Fixpoint__Group__3_in_rule__Fixpoint__Group__26273);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3112:1: rule__Fixpoint__Group__2__Impl : ( ( rule__Fixpoint__SAssignment_2 ) ) ;
    public final void rule__Fixpoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3116:1: ( ( ( rule__Fixpoint__SAssignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3117:1: ( ( rule__Fixpoint__SAssignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3117:1: ( ( rule__Fixpoint__SAssignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3118:1: ( rule__Fixpoint__SAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixpointAccess().getSAssignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3119:1: ( rule__Fixpoint__SAssignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3119:2: rule__Fixpoint__SAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fixpoint__SAssignment_2_in_rule__Fixpoint__Group__2__Impl6300);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3129:1: rule__Fixpoint__Group__3 : rule__Fixpoint__Group__3__Impl ;
    public final void rule__Fixpoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3133:1: ( rule__Fixpoint__Group__3__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3134:2: rule__Fixpoint__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fixpoint__Group__3__Impl_in_rule__Fixpoint__Group__36330);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3140:1: rule__Fixpoint__Group__3__Impl : ( ')' ) ;
    public final void rule__Fixpoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3144:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3145:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3145:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3146:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixpointAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Fixpoint__Group__3__Impl6358); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3167:1: rule__Choice__Group__0 : rule__Choice__Group__0__Impl rule__Choice__Group__1 ;
    public final void rule__Choice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3171:1: ( rule__Choice__Group__0__Impl rule__Choice__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3172:2: rule__Choice__Group__0__Impl rule__Choice__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__0__Impl_in_rule__Choice__Group__06397);
            rule__Choice__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__1_in_rule__Choice__Group__06400);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3179:1: rule__Choice__Group__0__Impl : ( 'Choice' ) ;
    public final void rule__Choice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3183:1: ( ( 'Choice' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3184:1: ( 'Choice' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3184:1: ( 'Choice' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3185:1: 'Choice'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getChoiceKeyword_0()); 
            }
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Choice__Group__0__Impl6428); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3198:1: rule__Choice__Group__1 : rule__Choice__Group__1__Impl rule__Choice__Group__2 ;
    public final void rule__Choice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3202:1: ( rule__Choice__Group__1__Impl rule__Choice__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3203:2: rule__Choice__Group__1__Impl rule__Choice__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__1__Impl_in_rule__Choice__Group__16459);
            rule__Choice__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__2_in_rule__Choice__Group__16462);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3210:1: rule__Choice__Group__1__Impl : ( '(' ) ;
    public final void rule__Choice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3214:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3215:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3215:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3216:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Choice__Group__1__Impl6490); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3229:1: rule__Choice__Group__2 : rule__Choice__Group__2__Impl rule__Choice__Group__3 ;
    public final void rule__Choice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3233:1: ( rule__Choice__Group__2__Impl rule__Choice__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3234:2: rule__Choice__Group__2__Impl rule__Choice__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__2__Impl_in_rule__Choice__Group__26521);
            rule__Choice__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__3_in_rule__Choice__Group__26524);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3241:1: rule__Choice__Group__2__Impl : ( ( rule__Choice__S1Assignment_2 ) ) ;
    public final void rule__Choice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3245:1: ( ( ( rule__Choice__S1Assignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3246:1: ( ( rule__Choice__S1Assignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3246:1: ( ( rule__Choice__S1Assignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3247:1: ( rule__Choice__S1Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getS1Assignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3248:1: ( rule__Choice__S1Assignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3248:2: rule__Choice__S1Assignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Choice__S1Assignment_2_in_rule__Choice__Group__2__Impl6551);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3258:1: rule__Choice__Group__3 : rule__Choice__Group__3__Impl rule__Choice__Group__4 ;
    public final void rule__Choice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3262:1: ( rule__Choice__Group__3__Impl rule__Choice__Group__4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3263:2: rule__Choice__Group__3__Impl rule__Choice__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__3__Impl_in_rule__Choice__Group__36581);
            rule__Choice__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__4_in_rule__Choice__Group__36584);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3270:1: rule__Choice__Group__3__Impl : ( ',' ) ;
    public final void rule__Choice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3274:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3275:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3275:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3276:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getCommaKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Choice__Group__3__Impl6612); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3289:1: rule__Choice__Group__4 : rule__Choice__Group__4__Impl rule__Choice__Group__5 ;
    public final void rule__Choice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3293:1: ( rule__Choice__Group__4__Impl rule__Choice__Group__5 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3294:2: rule__Choice__Group__4__Impl rule__Choice__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__4__Impl_in_rule__Choice__Group__46643);
            rule__Choice__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__5_in_rule__Choice__Group__46646);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3301:1: rule__Choice__Group__4__Impl : ( ( rule__Choice__S2Assignment_4 ) ) ;
    public final void rule__Choice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3305:1: ( ( ( rule__Choice__S2Assignment_4 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3306:1: ( ( rule__Choice__S2Assignment_4 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3306:1: ( ( rule__Choice__S2Assignment_4 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3307:1: ( rule__Choice__S2Assignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getS2Assignment_4()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3308:1: ( rule__Choice__S2Assignment_4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3308:2: rule__Choice__S2Assignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Choice__S2Assignment_4_in_rule__Choice__Group__4__Impl6673);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3318:1: rule__Choice__Group__5 : rule__Choice__Group__5__Impl ;
    public final void rule__Choice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3322:1: ( rule__Choice__Group__5__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3323:2: rule__Choice__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Choice__Group__5__Impl_in_rule__Choice__Group__56703);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3329:1: rule__Choice__Group__5__Impl : ( ')' ) ;
    public final void rule__Choice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3333:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3334:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3334:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3335:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Choice__Group__5__Impl6731); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3360:1: rule__Union__Group__0 : rule__Union__Group__0__Impl rule__Union__Group__1 ;
    public final void rule__Union__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3364:1: ( rule__Union__Group__0__Impl rule__Union__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3365:2: rule__Union__Group__0__Impl rule__Union__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__0__Impl_in_rule__Union__Group__06774);
            rule__Union__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__1_in_rule__Union__Group__06777);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3372:1: rule__Union__Group__0__Impl : ( 'Union' ) ;
    public final void rule__Union__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3376:1: ( ( 'Union' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3377:1: ( 'Union' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3377:1: ( 'Union' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3378:1: 'Union'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionAccess().getUnionKeyword_0()); 
            }
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Union__Group__0__Impl6805); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3391:1: rule__Union__Group__1 : rule__Union__Group__1__Impl rule__Union__Group__2 ;
    public final void rule__Union__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3395:1: ( rule__Union__Group__1__Impl rule__Union__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3396:2: rule__Union__Group__1__Impl rule__Union__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__1__Impl_in_rule__Union__Group__16836);
            rule__Union__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__2_in_rule__Union__Group__16839);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3403:1: rule__Union__Group__1__Impl : ( '(' ) ;
    public final void rule__Union__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3407:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3408:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3408:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3409:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Union__Group__1__Impl6867); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3422:1: rule__Union__Group__2 : rule__Union__Group__2__Impl rule__Union__Group__3 ;
    public final void rule__Union__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3426:1: ( rule__Union__Group__2__Impl rule__Union__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3427:2: rule__Union__Group__2__Impl rule__Union__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__2__Impl_in_rule__Union__Group__26898);
            rule__Union__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__3_in_rule__Union__Group__26901);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3434:1: rule__Union__Group__2__Impl : ( ( rule__Union__S1Assignment_2 ) ) ;
    public final void rule__Union__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3438:1: ( ( ( rule__Union__S1Assignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3439:1: ( ( rule__Union__S1Assignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3439:1: ( ( rule__Union__S1Assignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3440:1: ( rule__Union__S1Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionAccess().getS1Assignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3441:1: ( rule__Union__S1Assignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3441:2: rule__Union__S1Assignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Union__S1Assignment_2_in_rule__Union__Group__2__Impl6928);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3451:1: rule__Union__Group__3 : rule__Union__Group__3__Impl rule__Union__Group__4 ;
    public final void rule__Union__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3455:1: ( rule__Union__Group__3__Impl rule__Union__Group__4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3456:2: rule__Union__Group__3__Impl rule__Union__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__3__Impl_in_rule__Union__Group__36958);
            rule__Union__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__4_in_rule__Union__Group__36961);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3463:1: rule__Union__Group__3__Impl : ( ',' ) ;
    public final void rule__Union__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3467:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3468:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3468:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3469:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionAccess().getCommaKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Union__Group__3__Impl6989); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3482:1: rule__Union__Group__4 : rule__Union__Group__4__Impl rule__Union__Group__5 ;
    public final void rule__Union__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3486:1: ( rule__Union__Group__4__Impl rule__Union__Group__5 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3487:2: rule__Union__Group__4__Impl rule__Union__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__4__Impl_in_rule__Union__Group__47020);
            rule__Union__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__5_in_rule__Union__Group__47023);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3494:1: rule__Union__Group__4__Impl : ( ( rule__Union__S2Assignment_4 ) ) ;
    public final void rule__Union__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3498:1: ( ( ( rule__Union__S2Assignment_4 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3499:1: ( ( rule__Union__S2Assignment_4 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3499:1: ( ( rule__Union__S2Assignment_4 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3500:1: ( rule__Union__S2Assignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionAccess().getS2Assignment_4()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3501:1: ( rule__Union__S2Assignment_4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3501:2: rule__Union__S2Assignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Union__S2Assignment_4_in_rule__Union__Group__4__Impl7050);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3511:1: rule__Union__Group__5 : rule__Union__Group__5__Impl ;
    public final void rule__Union__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3515:1: ( rule__Union__Group__5__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3516:2: rule__Union__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Union__Group__5__Impl_in_rule__Union__Group__57080);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3522:1: rule__Union__Group__5__Impl : ( ')' ) ;
    public final void rule__Union__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3526:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3527:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3527:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3528:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Union__Group__5__Impl7108); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3553:1: rule__Sequence__Group__0 : rule__Sequence__Group__0__Impl rule__Sequence__Group__1 ;
    public final void rule__Sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3557:1: ( rule__Sequence__Group__0__Impl rule__Sequence__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3558:2: rule__Sequence__Group__0__Impl rule__Sequence__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__07151);
            rule__Sequence__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__07154);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3565:1: rule__Sequence__Group__0__Impl : ( 'Sequence' ) ;
    public final void rule__Sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3569:1: ( ( 'Sequence' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3570:1: ( 'Sequence' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3570:1: ( 'Sequence' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3571:1: 'Sequence'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getSequenceKeyword_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Sequence__Group__0__Impl7182); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3584:1: rule__Sequence__Group__1 : rule__Sequence__Group__1__Impl rule__Sequence__Group__2 ;
    public final void rule__Sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3588:1: ( rule__Sequence__Group__1__Impl rule__Sequence__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3589:2: rule__Sequence__Group__1__Impl rule__Sequence__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__17213);
            rule__Sequence__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__17216);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3596:1: rule__Sequence__Group__1__Impl : ( '(' ) ;
    public final void rule__Sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3600:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3601:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3601:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3602:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Sequence__Group__1__Impl7244); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3615:1: rule__Sequence__Group__2 : rule__Sequence__Group__2__Impl rule__Sequence__Group__3 ;
    public final void rule__Sequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3619:1: ( rule__Sequence__Group__2__Impl rule__Sequence__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3620:2: rule__Sequence__Group__2__Impl rule__Sequence__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__27275);
            rule__Sequence__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__27278);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3627:1: rule__Sequence__Group__2__Impl : ( ( rule__Sequence__S1Assignment_2 ) ) ;
    public final void rule__Sequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3631:1: ( ( ( rule__Sequence__S1Assignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3632:1: ( ( rule__Sequence__S1Assignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3632:1: ( ( rule__Sequence__S1Assignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3633:1: ( rule__Sequence__S1Assignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getS1Assignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3634:1: ( rule__Sequence__S1Assignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3634:2: rule__Sequence__S1Assignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__S1Assignment_2_in_rule__Sequence__Group__2__Impl7305);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3644:1: rule__Sequence__Group__3 : rule__Sequence__Group__3__Impl rule__Sequence__Group__4 ;
    public final void rule__Sequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3648:1: ( rule__Sequence__Group__3__Impl rule__Sequence__Group__4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3649:2: rule__Sequence__Group__3__Impl rule__Sequence__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__37335);
            rule__Sequence__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__37338);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3656:1: rule__Sequence__Group__3__Impl : ( ',' ) ;
    public final void rule__Sequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3660:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3661:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3661:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3662:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getCommaKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Sequence__Group__3__Impl7366); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3675:1: rule__Sequence__Group__4 : rule__Sequence__Group__4__Impl rule__Sequence__Group__5 ;
    public final void rule__Sequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3679:1: ( rule__Sequence__Group__4__Impl rule__Sequence__Group__5 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3680:2: rule__Sequence__Group__4__Impl rule__Sequence__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__47397);
            rule__Sequence__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__5_in_rule__Sequence__Group__47400);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3687:1: rule__Sequence__Group__4__Impl : ( ( rule__Sequence__S2Assignment_4 ) ) ;
    public final void rule__Sequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3691:1: ( ( ( rule__Sequence__S2Assignment_4 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3692:1: ( ( rule__Sequence__S2Assignment_4 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3692:1: ( ( rule__Sequence__S2Assignment_4 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3693:1: ( rule__Sequence__S2Assignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getS2Assignment_4()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3694:1: ( rule__Sequence__S2Assignment_4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3694:2: rule__Sequence__S2Assignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__S2Assignment_4_in_rule__Sequence__Group__4__Impl7427);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3704:1: rule__Sequence__Group__5 : rule__Sequence__Group__5__Impl ;
    public final void rule__Sequence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3708:1: ( rule__Sequence__Group__5__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3709:2: rule__Sequence__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__5__Impl_in_rule__Sequence__Group__57457);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3715:1: rule__Sequence__Group__5__Impl : ( ')' ) ;
    public final void rule__Sequence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3719:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3720:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3720:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3721:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Sequence__Group__5__Impl7485); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3746:1: rule__Identity__Group__0 : rule__Identity__Group__0__Impl rule__Identity__Group__1 ;
    public final void rule__Identity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3750:1: ( rule__Identity__Group__0__Impl rule__Identity__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3751:2: rule__Identity__Group__0__Impl rule__Identity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identity__Group__0__Impl_in_rule__Identity__Group__07528);
            rule__Identity__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Identity__Group__1_in_rule__Identity__Group__07531);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3758:1: rule__Identity__Group__0__Impl : ( 'Identity' ) ;
    public final void rule__Identity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3762:1: ( ( 'Identity' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3763:1: ( 'Identity' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3763:1: ( 'Identity' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3764:1: 'Identity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentityAccess().getIdentityKeyword_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Identity__Group__0__Impl7559); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3777:1: rule__Identity__Group__1 : rule__Identity__Group__1__Impl ;
    public final void rule__Identity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3781:1: ( rule__Identity__Group__1__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3782:2: rule__Identity__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Identity__Group__1__Impl_in_rule__Identity__Group__17590);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3788:1: rule__Identity__Group__1__Impl : ( () ) ;
    public final void rule__Identity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3792:1: ( ( () ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3793:1: ( () )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3793:1: ( () )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3794:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentityAccess().getIdentityAction_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3795:1: ()
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3797:1: 
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3811:1: rule__Fail__Group__0 : rule__Fail__Group__0__Impl rule__Fail__Group__1 ;
    public final void rule__Fail__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3815:1: ( rule__Fail__Group__0__Impl rule__Fail__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3816:2: rule__Fail__Group__0__Impl rule__Fail__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fail__Group__0__Impl_in_rule__Fail__Group__07652);
            rule__Fail__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Fail__Group__1_in_rule__Fail__Group__07655);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3823:1: rule__Fail__Group__0__Impl : ( 'Fail' ) ;
    public final void rule__Fail__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3827:1: ( ( 'Fail' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3828:1: ( 'Fail' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3828:1: ( 'Fail' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3829:1: 'Fail'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFailAccess().getFailKeyword_0()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Fail__Group__0__Impl7683); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3842:1: rule__Fail__Group__1 : rule__Fail__Group__1__Impl ;
    public final void rule__Fail__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3846:1: ( rule__Fail__Group__1__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3847:2: rule__Fail__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fail__Group__1__Impl_in_rule__Fail__Group__17714);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3853:1: rule__Fail__Group__1__Impl : ( () ) ;
    public final void rule__Fail__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3857:1: ( ( () ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3858:1: ( () )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3858:1: ( () )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3859:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFailAccess().getFailAction_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3860:1: ()
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3862:1: 
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3876:1: rule__ADT__Group__0 : rule__ADT__Group__0__Impl rule__ADT__Group__1 ;
    public final void rule__ADT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3880:1: ( rule__ADT__Group__0__Impl rule__ADT__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3881:2: rule__ADT__Group__0__Impl rule__ADT__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__0__Impl_in_rule__ADT__Group__07776);
            rule__ADT__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__1_in_rule__ADT__Group__07779);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3888:1: rule__ADT__Group__0__Impl : ( 'ADT' ) ;
    public final void rule__ADT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3892:1: ( ( 'ADT' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3893:1: ( 'ADT' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3893:1: ( 'ADT' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3894:1: 'ADT'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getADTKeyword_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__ADT__Group__0__Impl7807); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3907:1: rule__ADT__Group__1 : rule__ADT__Group__1__Impl rule__ADT__Group__2 ;
    public final void rule__ADT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3911:1: ( rule__ADT__Group__1__Impl rule__ADT__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3912:2: rule__ADT__Group__1__Impl rule__ADT__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__1__Impl_in_rule__ADT__Group__17838);
            rule__ADT__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__2_in_rule__ADT__Group__17841);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3919:1: rule__ADT__Group__1__Impl : ( ( rule__ADT__NameAssignment_1 ) ) ;
    public final void rule__ADT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3923:1: ( ( ( rule__ADT__NameAssignment_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3924:1: ( ( rule__ADT__NameAssignment_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3924:1: ( ( rule__ADT__NameAssignment_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3925:1: ( rule__ADT__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getNameAssignment_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3926:1: ( rule__ADT__NameAssignment_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3926:2: rule__ADT__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__NameAssignment_1_in_rule__ADT__Group__1__Impl7868);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3936:1: rule__ADT__Group__2 : rule__ADT__Group__2__Impl rule__ADT__Group__3 ;
    public final void rule__ADT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3940:1: ( rule__ADT__Group__2__Impl rule__ADT__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3941:2: rule__ADT__Group__2__Impl rule__ADT__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__2__Impl_in_rule__ADT__Group__27898);
            rule__ADT__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__3_in_rule__ADT__Group__27901);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3948:1: rule__ADT__Group__2__Impl : ( 'Signature' ) ;
    public final void rule__ADT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3952:1: ( ( 'Signature' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3953:1: ( 'Signature' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3953:1: ( 'Signature' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3954:1: 'Signature'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getSignatureKeyword_2()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__ADT__Group__2__Impl7929); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3967:1: rule__ADT__Group__3 : rule__ADT__Group__3__Impl rule__ADT__Group__4 ;
    public final void rule__ADT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3971:1: ( rule__ADT__Group__3__Impl rule__ADT__Group__4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3972:2: rule__ADT__Group__3__Impl rule__ADT__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__3__Impl_in_rule__ADT__Group__37960);
            rule__ADT__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__4_in_rule__ADT__Group__37963);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3979:1: rule__ADT__Group__3__Impl : ( ( rule__ADT__SignatureAssignment_3 ) ) ;
    public final void rule__ADT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3983:1: ( ( ( rule__ADT__SignatureAssignment_3 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3984:1: ( ( rule__ADT__SignatureAssignment_3 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3984:1: ( ( rule__ADT__SignatureAssignment_3 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3985:1: ( rule__ADT__SignatureAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getSignatureAssignment_3()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3986:1: ( rule__ADT__SignatureAssignment_3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3986:2: rule__ADT__SignatureAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__SignatureAssignment_3_in_rule__ADT__Group__3__Impl7990);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:3996:1: rule__ADT__Group__4 : rule__ADT__Group__4__Impl rule__ADT__Group__5 ;
    public final void rule__ADT__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4000:1: ( rule__ADT__Group__4__Impl rule__ADT__Group__5 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4001:2: rule__ADT__Group__4__Impl rule__ADT__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__4__Impl_in_rule__ADT__Group__48020);
            rule__ADT__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__5_in_rule__ADT__Group__48023);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4008:1: rule__ADT__Group__4__Impl : ( ( rule__ADT__Group_4__0 )? ) ;
    public final void rule__ADT__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4012:1: ( ( ( rule__ADT__Group_4__0 )? ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4013:1: ( ( rule__ADT__Group_4__0 )? )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4013:1: ( ( rule__ADT__Group_4__0 )? )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4014:1: ( rule__ADT__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getGroup_4()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4015:1: ( rule__ADT__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4015:2: rule__ADT__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_4__0_in_rule__ADT__Group__4__Impl8050);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4025:1: rule__ADT__Group__5 : rule__ADT__Group__5__Impl ;
    public final void rule__ADT__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4029:1: ( rule__ADT__Group__5__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4030:2: rule__ADT__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group__5__Impl_in_rule__ADT__Group__58081);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4036:1: rule__ADT__Group__5__Impl : ( ( rule__ADT__Group_5__0 )? ) ;
    public final void rule__ADT__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4040:1: ( ( ( rule__ADT__Group_5__0 )? ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4041:1: ( ( rule__ADT__Group_5__0 )? )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4041:1: ( ( rule__ADT__Group_5__0 )? )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4042:1: ( rule__ADT__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getGroup_5()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4043:1: ( rule__ADT__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4043:2: rule__ADT__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_5__0_in_rule__ADT__Group__5__Impl8108);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4065:1: rule__ADT__Group_4__0 : rule__ADT__Group_4__0__Impl rule__ADT__Group_4__1 ;
    public final void rule__ADT__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4069:1: ( rule__ADT__Group_4__0__Impl rule__ADT__Group_4__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4070:2: rule__ADT__Group_4__0__Impl rule__ADT__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_4__0__Impl_in_rule__ADT__Group_4__08151);
            rule__ADT__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_4__1_in_rule__ADT__Group_4__08154);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4077:1: rule__ADT__Group_4__0__Impl : ( ( 'Axioms' ) ) ;
    public final void rule__ADT__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4081:1: ( ( ( 'Axioms' ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4082:1: ( ( 'Axioms' ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4082:1: ( ( 'Axioms' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4083:1: ( 'Axioms' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getAxiomsKeyword_4_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4084:1: ( 'Axioms' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4085:2: 'Axioms'
            {
            match(input,34,FollowSets000.FOLLOW_34_in_rule__ADT__Group_4__0__Impl8183); if (state.failed) return ;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4096:1: rule__ADT__Group_4__1 : rule__ADT__Group_4__1__Impl rule__ADT__Group_4__2 ;
    public final void rule__ADT__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4100:1: ( rule__ADT__Group_4__1__Impl rule__ADT__Group_4__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4101:2: rule__ADT__Group_4__1__Impl rule__ADT__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_4__1__Impl_in_rule__ADT__Group_4__18215);
            rule__ADT__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_4__2_in_rule__ADT__Group_4__18218);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4108:1: rule__ADT__Group_4__1__Impl : ( ( rule__ADT__EquationsAssignment_4_1 ) ) ;
    public final void rule__ADT__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4112:1: ( ( ( rule__ADT__EquationsAssignment_4_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4113:1: ( ( rule__ADT__EquationsAssignment_4_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4113:1: ( ( rule__ADT__EquationsAssignment_4_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4114:1: ( rule__ADT__EquationsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getEquationsAssignment_4_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4115:1: ( rule__ADT__EquationsAssignment_4_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4115:2: rule__ADT__EquationsAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__EquationsAssignment_4_1_in_rule__ADT__Group_4__1__Impl8245);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4125:1: rule__ADT__Group_4__2 : rule__ADT__Group_4__2__Impl ;
    public final void rule__ADT__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4129:1: ( rule__ADT__Group_4__2__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4130:2: rule__ADT__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_4__2__Impl_in_rule__ADT__Group_4__28275);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4136:1: rule__ADT__Group_4__2__Impl : ( ( rule__ADT__EquationsAssignment_4_2 )* ) ;
    public final void rule__ADT__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4140:1: ( ( ( rule__ADT__EquationsAssignment_4_2 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4141:1: ( ( rule__ADT__EquationsAssignment_4_2 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4141:1: ( ( rule__ADT__EquationsAssignment_4_2 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4142:1: ( rule__ADT__EquationsAssignment_4_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getEquationsAssignment_4_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4143:1: ( rule__ADT__EquationsAssignment_4_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==RULE_TERMVAR) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4143:2: rule__ADT__EquationsAssignment_4_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ADT__EquationsAssignment_4_2_in_rule__ADT__Group_4__2__Impl8302);
            	    rule__ADT__EquationsAssignment_4_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4159:1: rule__ADT__Group_5__0 : rule__ADT__Group_5__0__Impl rule__ADT__Group_5__1 ;
    public final void rule__ADT__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4163:1: ( rule__ADT__Group_5__0__Impl rule__ADT__Group_5__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4164:2: rule__ADT__Group_5__0__Impl rule__ADT__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_5__0__Impl_in_rule__ADT__Group_5__08339);
            rule__ADT__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_5__1_in_rule__ADT__Group_5__08342);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4171:1: rule__ADT__Group_5__0__Impl : ( ( 'Variables' ) ) ;
    public final void rule__ADT__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4175:1: ( ( ( 'Variables' ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4176:1: ( ( 'Variables' ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4176:1: ( ( 'Variables' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4177:1: ( 'Variables' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getVariablesKeyword_5_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4178:1: ( 'Variables' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4179:2: 'Variables'
            {
            match(input,35,FollowSets000.FOLLOW_35_in_rule__ADT__Group_5__0__Impl8371); if (state.failed) return ;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4190:1: rule__ADT__Group_5__1 : rule__ADT__Group_5__1__Impl rule__ADT__Group_5__2 ;
    public final void rule__ADT__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4194:1: ( rule__ADT__Group_5__1__Impl rule__ADT__Group_5__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4195:2: rule__ADT__Group_5__1__Impl rule__ADT__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_5__1__Impl_in_rule__ADT__Group_5__18403);
            rule__ADT__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_5__2_in_rule__ADT__Group_5__18406);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4202:1: rule__ADT__Group_5__1__Impl : ( ( rule__ADT__VariablesAssignment_5_1 ) ) ;
    public final void rule__ADT__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4206:1: ( ( ( rule__ADT__VariablesAssignment_5_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4207:1: ( ( rule__ADT__VariablesAssignment_5_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4207:1: ( ( rule__ADT__VariablesAssignment_5_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4208:1: ( rule__ADT__VariablesAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getVariablesAssignment_5_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4209:1: ( rule__ADT__VariablesAssignment_5_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4209:2: rule__ADT__VariablesAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__VariablesAssignment_5_1_in_rule__ADT__Group_5__1__Impl8433);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4219:1: rule__ADT__Group_5__2 : rule__ADT__Group_5__2__Impl ;
    public final void rule__ADT__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4223:1: ( rule__ADT__Group_5__2__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4224:2: rule__ADT__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ADT__Group_5__2__Impl_in_rule__ADT__Group_5__28463);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4230:1: rule__ADT__Group_5__2__Impl : ( ( rule__ADT__VariablesAssignment_5_2 )* ) ;
    public final void rule__ADT__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4234:1: ( ( ( rule__ADT__VariablesAssignment_5_2 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4235:1: ( ( rule__ADT__VariablesAssignment_5_2 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4235:1: ( ( rule__ADT__VariablesAssignment_5_2 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4236:1: ( rule__ADT__VariablesAssignment_5_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getVariablesAssignment_5_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4237:1: ( rule__ADT__VariablesAssignment_5_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4237:2: rule__ADT__VariablesAssignment_5_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ADT__VariablesAssignment_5_2_in_rule__ADT__Group_5__2__Impl8490);
            	    rule__ADT__VariablesAssignment_5_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4253:1: rule__Signature__Group__0 : rule__Signature__Group__0__Impl rule__Signature__Group__1 ;
    public final void rule__Signature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4257:1: ( rule__Signature__Group__0__Impl rule__Signature__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4258:2: rule__Signature__Group__0__Impl rule__Signature__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group__0__Impl_in_rule__Signature__Group__08527);
            rule__Signature__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group__1_in_rule__Signature__Group__08530);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4265:1: rule__Signature__Group__0__Impl : ( 'Sorts' ) ;
    public final void rule__Signature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4269:1: ( ( 'Sorts' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4270:1: ( 'Sorts' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4270:1: ( 'Sorts' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4271:1: 'Sorts'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getSortsKeyword_0()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Signature__Group__0__Impl8558); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4284:1: rule__Signature__Group__1 : rule__Signature__Group__1__Impl rule__Signature__Group__2 ;
    public final void rule__Signature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4288:1: ( rule__Signature__Group__1__Impl rule__Signature__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4289:2: rule__Signature__Group__1__Impl rule__Signature__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group__1__Impl_in_rule__Signature__Group__18589);
            rule__Signature__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group__2_in_rule__Signature__Group__18592);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4296:1: rule__Signature__Group__1__Impl : ( ( rule__Signature__SortsAssignment_1 ) ) ;
    public final void rule__Signature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4300:1: ( ( ( rule__Signature__SortsAssignment_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4301:1: ( ( rule__Signature__SortsAssignment_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4301:1: ( ( rule__Signature__SortsAssignment_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4302:1: ( rule__Signature__SortsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getSortsAssignment_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4303:1: ( rule__Signature__SortsAssignment_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4303:2: rule__Signature__SortsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__SortsAssignment_1_in_rule__Signature__Group__1__Impl8619);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4313:1: rule__Signature__Group__2 : rule__Signature__Group__2__Impl rule__Signature__Group__3 ;
    public final void rule__Signature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4317:1: ( rule__Signature__Group__2__Impl rule__Signature__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4318:2: rule__Signature__Group__2__Impl rule__Signature__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group__2__Impl_in_rule__Signature__Group__28649);
            rule__Signature__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group__3_in_rule__Signature__Group__28652);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4325:1: rule__Signature__Group__2__Impl : ( ( rule__Signature__Group_2__0 )* ) ;
    public final void rule__Signature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4329:1: ( ( ( rule__Signature__Group_2__0 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4330:1: ( ( rule__Signature__Group_2__0 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4330:1: ( ( rule__Signature__Group_2__0 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4331:1: ( rule__Signature__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getGroup_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4332:1: ( rule__Signature__Group_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==19) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4332:2: rule__Signature__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_2__0_in_rule__Signature__Group__2__Impl8679);
            	    rule__Signature__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4342:1: rule__Signature__Group__3 : rule__Signature__Group__3__Impl rule__Signature__Group__4 ;
    public final void rule__Signature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4346:1: ( rule__Signature__Group__3__Impl rule__Signature__Group__4 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4347:2: rule__Signature__Group__3__Impl rule__Signature__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group__3__Impl_in_rule__Signature__Group__38710);
            rule__Signature__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group__4_in_rule__Signature__Group__38713);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4354:1: rule__Signature__Group__3__Impl : ( ( rule__Signature__Group_3__0 ) ) ;
    public final void rule__Signature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4358:1: ( ( ( rule__Signature__Group_3__0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4359:1: ( ( rule__Signature__Group_3__0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4359:1: ( ( rule__Signature__Group_3__0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4360:1: ( rule__Signature__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getGroup_3()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4361:1: ( rule__Signature__Group_3__0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4361:2: rule__Signature__Group_3__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_3__0_in_rule__Signature__Group__3__Impl8740);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4371:1: rule__Signature__Group__4 : rule__Signature__Group__4__Impl ;
    public final void rule__Signature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4375:1: ( rule__Signature__Group__4__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4376:2: rule__Signature__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group__4__Impl_in_rule__Signature__Group__48770);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4382:1: rule__Signature__Group__4__Impl : ( ( rule__Signature__Group_4__0 )? ) ;
    public final void rule__Signature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4386:1: ( ( ( rule__Signature__Group_4__0 )? ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4387:1: ( ( rule__Signature__Group_4__0 )? )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4387:1: ( ( rule__Signature__Group_4__0 )? )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4388:1: ( rule__Signature__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getGroup_4()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4389:1: ( rule__Signature__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4389:2: rule__Signature__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_4__0_in_rule__Signature__Group__4__Impl8797);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4409:1: rule__Signature__Group_2__0 : rule__Signature__Group_2__0__Impl rule__Signature__Group_2__1 ;
    public final void rule__Signature__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4413:1: ( rule__Signature__Group_2__0__Impl rule__Signature__Group_2__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4414:2: rule__Signature__Group_2__0__Impl rule__Signature__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_2__0__Impl_in_rule__Signature__Group_2__08838);
            rule__Signature__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_2__1_in_rule__Signature__Group_2__08841);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4421:1: rule__Signature__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Signature__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4425:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4426:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4426:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4427:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getCommaKeyword_2_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Signature__Group_2__0__Impl8869); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4440:1: rule__Signature__Group_2__1 : rule__Signature__Group_2__1__Impl ;
    public final void rule__Signature__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4444:1: ( rule__Signature__Group_2__1__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4445:2: rule__Signature__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_2__1__Impl_in_rule__Signature__Group_2__18900);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4451:1: rule__Signature__Group_2__1__Impl : ( ( rule__Signature__SortsAssignment_2_1 ) ) ;
    public final void rule__Signature__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4455:1: ( ( ( rule__Signature__SortsAssignment_2_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4456:1: ( ( rule__Signature__SortsAssignment_2_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4456:1: ( ( rule__Signature__SortsAssignment_2_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4457:1: ( rule__Signature__SortsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getSortsAssignment_2_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4458:1: ( rule__Signature__SortsAssignment_2_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4458:2: rule__Signature__SortsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__SortsAssignment_2_1_in_rule__Signature__Group_2__1__Impl8927);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4472:1: rule__Signature__Group_3__0 : rule__Signature__Group_3__0__Impl rule__Signature__Group_3__1 ;
    public final void rule__Signature__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4476:1: ( rule__Signature__Group_3__0__Impl rule__Signature__Group_3__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4477:2: rule__Signature__Group_3__0__Impl rule__Signature__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_3__0__Impl_in_rule__Signature__Group_3__08961);
            rule__Signature__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_3__1_in_rule__Signature__Group_3__08964);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4484:1: rule__Signature__Group_3__0__Impl : ( ( 'Generators' ) ) ;
    public final void rule__Signature__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4488:1: ( ( ( 'Generators' ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4489:1: ( ( 'Generators' ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4489:1: ( ( 'Generators' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4490:1: ( 'Generators' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getGeneratorsKeyword_3_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4491:1: ( 'Generators' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4492:2: 'Generators'
            {
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Signature__Group_3__0__Impl8993); if (state.failed) return ;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4503:1: rule__Signature__Group_3__1 : rule__Signature__Group_3__1__Impl rule__Signature__Group_3__2 ;
    public final void rule__Signature__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4507:1: ( rule__Signature__Group_3__1__Impl rule__Signature__Group_3__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4508:2: rule__Signature__Group_3__1__Impl rule__Signature__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_3__1__Impl_in_rule__Signature__Group_3__19025);
            rule__Signature__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_3__2_in_rule__Signature__Group_3__19028);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4515:1: rule__Signature__Group_3__1__Impl : ( ( rule__Signature__GeneratorsAssignment_3_1 ) ) ;
    public final void rule__Signature__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4519:1: ( ( ( rule__Signature__GeneratorsAssignment_3_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4520:1: ( ( rule__Signature__GeneratorsAssignment_3_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4520:1: ( ( rule__Signature__GeneratorsAssignment_3_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4521:1: ( rule__Signature__GeneratorsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getGeneratorsAssignment_3_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4522:1: ( rule__Signature__GeneratorsAssignment_3_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4522:2: rule__Signature__GeneratorsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__GeneratorsAssignment_3_1_in_rule__Signature__Group_3__1__Impl9055);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4532:1: rule__Signature__Group_3__2 : rule__Signature__Group_3__2__Impl ;
    public final void rule__Signature__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4536:1: ( rule__Signature__Group_3__2__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4537:2: rule__Signature__Group_3__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_3__2__Impl_in_rule__Signature__Group_3__29085);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4543:1: rule__Signature__Group_3__2__Impl : ( ( rule__Signature__GeneratorsAssignment_3_2 )* ) ;
    public final void rule__Signature__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4547:1: ( ( ( rule__Signature__GeneratorsAssignment_3_2 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4548:1: ( ( rule__Signature__GeneratorsAssignment_3_2 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4548:1: ( ( rule__Signature__GeneratorsAssignment_3_2 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4549:1: ( rule__Signature__GeneratorsAssignment_3_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getGeneratorsAssignment_3_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4550:1: ( rule__Signature__GeneratorsAssignment_3_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4550:2: rule__Signature__GeneratorsAssignment_3_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Signature__GeneratorsAssignment_3_2_in_rule__Signature__Group_3__2__Impl9112);
            	    rule__Signature__GeneratorsAssignment_3_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4566:1: rule__Signature__Group_4__0 : rule__Signature__Group_4__0__Impl rule__Signature__Group_4__1 ;
    public final void rule__Signature__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4570:1: ( rule__Signature__Group_4__0__Impl rule__Signature__Group_4__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4571:2: rule__Signature__Group_4__0__Impl rule__Signature__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_4__0__Impl_in_rule__Signature__Group_4__09149);
            rule__Signature__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_4__1_in_rule__Signature__Group_4__09152);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4578:1: rule__Signature__Group_4__0__Impl : ( ( 'Operations' ) ) ;
    public final void rule__Signature__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4582:1: ( ( ( 'Operations' ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4583:1: ( ( 'Operations' ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4583:1: ( ( 'Operations' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4584:1: ( 'Operations' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getOperationsKeyword_4_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4585:1: ( 'Operations' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4586:2: 'Operations'
            {
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Signature__Group_4__0__Impl9181); if (state.failed) return ;

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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4597:1: rule__Signature__Group_4__1 : rule__Signature__Group_4__1__Impl rule__Signature__Group_4__2 ;
    public final void rule__Signature__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4601:1: ( rule__Signature__Group_4__1__Impl rule__Signature__Group_4__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4602:2: rule__Signature__Group_4__1__Impl rule__Signature__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_4__1__Impl_in_rule__Signature__Group_4__19213);
            rule__Signature__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_4__2_in_rule__Signature__Group_4__19216);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4609:1: rule__Signature__Group_4__1__Impl : ( ( rule__Signature__OperationsAssignment_4_1 ) ) ;
    public final void rule__Signature__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4613:1: ( ( ( rule__Signature__OperationsAssignment_4_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4614:1: ( ( rule__Signature__OperationsAssignment_4_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4614:1: ( ( rule__Signature__OperationsAssignment_4_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4615:1: ( rule__Signature__OperationsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getOperationsAssignment_4_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4616:1: ( rule__Signature__OperationsAssignment_4_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4616:2: rule__Signature__OperationsAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__OperationsAssignment_4_1_in_rule__Signature__Group_4__1__Impl9243);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4626:1: rule__Signature__Group_4__2 : rule__Signature__Group_4__2__Impl ;
    public final void rule__Signature__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4630:1: ( rule__Signature__Group_4__2__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4631:2: rule__Signature__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Signature__Group_4__2__Impl_in_rule__Signature__Group_4__29273);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4637:1: rule__Signature__Group_4__2__Impl : ( ( rule__Signature__OperationsAssignment_4_2 )* ) ;
    public final void rule__Signature__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4641:1: ( ( ( rule__Signature__OperationsAssignment_4_2 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4642:1: ( ( rule__Signature__OperationsAssignment_4_2 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4642:1: ( ( rule__Signature__OperationsAssignment_4_2 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4643:1: ( rule__Signature__OperationsAssignment_4_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getOperationsAssignment_4_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4644:1: ( rule__Signature__OperationsAssignment_4_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4644:2: rule__Signature__OperationsAssignment_4_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Signature__OperationsAssignment_4_2_in_rule__Signature__Group_4__2__Impl9300);
            	    rule__Signature__OperationsAssignment_4_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4660:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4664:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4665:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__09337);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__09340);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4672:1: rule__VariableDeclaration__Group__0__Impl : ( ( rule__VariableDeclaration__NameAssignment_0 ) ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4676:1: ( ( ( rule__VariableDeclaration__NameAssignment_0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4677:1: ( ( rule__VariableDeclaration__NameAssignment_0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4677:1: ( ( rule__VariableDeclaration__NameAssignment_0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4678:1: ( rule__VariableDeclaration__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4679:1: ( rule__VariableDeclaration__NameAssignment_0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4679:2: rule__VariableDeclaration__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableDeclaration__NameAssignment_0_in_rule__VariableDeclaration__Group__0__Impl9367);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4689:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4693:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4694:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__19397);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__19400);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4701:1: rule__VariableDeclaration__Group__1__Impl : ( ':' ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4705:1: ( ( ':' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4706:1: ( ':' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4706:1: ( ':' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4707:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getColonKeyword_1()); 
            }
            match(input,39,FollowSets000.FOLLOW_39_in_rule__VariableDeclaration__Group__1__Impl9428); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4720:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4724:1: ( rule__VariableDeclaration__Group__2__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4725:2: rule__VariableDeclaration__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__29459);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4731:1: rule__VariableDeclaration__Group__2__Impl : ( ( rule__VariableDeclaration__SortAssignment_2 ) ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4735:1: ( ( ( rule__VariableDeclaration__SortAssignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4736:1: ( ( rule__VariableDeclaration__SortAssignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4736:1: ( ( rule__VariableDeclaration__SortAssignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4737:1: ( rule__VariableDeclaration__SortAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getSortAssignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4738:1: ( rule__VariableDeclaration__SortAssignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4738:2: rule__VariableDeclaration__SortAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__VariableDeclaration__SortAssignment_2_in_rule__VariableDeclaration__Group__2__Impl9486);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4754:1: rule__Equation__Group__0 : rule__Equation__Group__0__Impl rule__Equation__Group__1 ;
    public final void rule__Equation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4758:1: ( rule__Equation__Group__0__Impl rule__Equation__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4759:2: rule__Equation__Group__0__Impl rule__Equation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equation__Group__0__Impl_in_rule__Equation__Group__09522);
            rule__Equation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Equation__Group__1_in_rule__Equation__Group__09525);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4766:1: rule__Equation__Group__0__Impl : ( ( rule__Equation__LeftHandTermAssignment_0 ) ) ;
    public final void rule__Equation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4770:1: ( ( ( rule__Equation__LeftHandTermAssignment_0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4771:1: ( ( rule__Equation__LeftHandTermAssignment_0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4771:1: ( ( rule__Equation__LeftHandTermAssignment_0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4772:1: ( rule__Equation__LeftHandTermAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getLeftHandTermAssignment_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4773:1: ( rule__Equation__LeftHandTermAssignment_0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4773:2: rule__Equation__LeftHandTermAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equation__LeftHandTermAssignment_0_in_rule__Equation__Group__0__Impl9552);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4783:1: rule__Equation__Group__1 : rule__Equation__Group__1__Impl rule__Equation__Group__2 ;
    public final void rule__Equation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4787:1: ( rule__Equation__Group__1__Impl rule__Equation__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4788:2: rule__Equation__Group__1__Impl rule__Equation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equation__Group__1__Impl_in_rule__Equation__Group__19582);
            rule__Equation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Equation__Group__2_in_rule__Equation__Group__19585);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4795:1: rule__Equation__Group__1__Impl : ( '=' ) ;
    public final void rule__Equation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4799:1: ( ( '=' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4800:1: ( '=' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4800:1: ( '=' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4801:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getEqualsSignKeyword_1()); 
            }
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Equation__Group__1__Impl9613); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4814:1: rule__Equation__Group__2 : rule__Equation__Group__2__Impl ;
    public final void rule__Equation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4818:1: ( rule__Equation__Group__2__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4819:2: rule__Equation__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equation__Group__2__Impl_in_rule__Equation__Group__29644);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4825:1: rule__Equation__Group__2__Impl : ( ( rule__Equation__RightHandTermAssignment_2 ) ) ;
    public final void rule__Equation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4829:1: ( ( ( rule__Equation__RightHandTermAssignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4830:1: ( ( rule__Equation__RightHandTermAssignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4830:1: ( ( rule__Equation__RightHandTermAssignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4831:1: ( rule__Equation__RightHandTermAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getRightHandTermAssignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4832:1: ( rule__Equation__RightHandTermAssignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4832:2: rule__Equation__RightHandTermAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Equation__RightHandTermAssignment_2_in_rule__Equation__Group__2__Impl9671);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4848:1: rule__RewriteRule__Group__0 : rule__RewriteRule__Group__0__Impl rule__RewriteRule__Group__1 ;
    public final void rule__RewriteRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4852:1: ( rule__RewriteRule__Group__0__Impl rule__RewriteRule__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4853:2: rule__RewriteRule__Group__0__Impl rule__RewriteRule__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RewriteRule__Group__0__Impl_in_rule__RewriteRule__Group__09707);
            rule__RewriteRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__RewriteRule__Group__1_in_rule__RewriteRule__Group__09710);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4860:1: rule__RewriteRule__Group__0__Impl : ( ( rule__RewriteRule__LeftHandTermAssignment_0 ) ) ;
    public final void rule__RewriteRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4864:1: ( ( ( rule__RewriteRule__LeftHandTermAssignment_0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4865:1: ( ( rule__RewriteRule__LeftHandTermAssignment_0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4865:1: ( ( rule__RewriteRule__LeftHandTermAssignment_0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4866:1: ( rule__RewriteRule__LeftHandTermAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRewriteRuleAccess().getLeftHandTermAssignment_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4867:1: ( rule__RewriteRule__LeftHandTermAssignment_0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4867:2: rule__RewriteRule__LeftHandTermAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RewriteRule__LeftHandTermAssignment_0_in_rule__RewriteRule__Group__0__Impl9737);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4877:1: rule__RewriteRule__Group__1 : rule__RewriteRule__Group__1__Impl rule__RewriteRule__Group__2 ;
    public final void rule__RewriteRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4881:1: ( rule__RewriteRule__Group__1__Impl rule__RewriteRule__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4882:2: rule__RewriteRule__Group__1__Impl rule__RewriteRule__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RewriteRule__Group__1__Impl_in_rule__RewriteRule__Group__19767);
            rule__RewriteRule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__RewriteRule__Group__2_in_rule__RewriteRule__Group__19770);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4889:1: rule__RewriteRule__Group__1__Impl : ( '->' ) ;
    public final void rule__RewriteRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4893:1: ( ( '->' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4894:1: ( '->' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4894:1: ( '->' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4895:1: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRewriteRuleAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            }
            match(input,40,FollowSets000.FOLLOW_40_in_rule__RewriteRule__Group__1__Impl9798); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4908:1: rule__RewriteRule__Group__2 : rule__RewriteRule__Group__2__Impl ;
    public final void rule__RewriteRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4912:1: ( rule__RewriteRule__Group__2__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4913:2: rule__RewriteRule__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RewriteRule__Group__2__Impl_in_rule__RewriteRule__Group__29829);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4919:1: rule__RewriteRule__Group__2__Impl : ( ( rule__RewriteRule__RightHandTermAssignment_2 ) ) ;
    public final void rule__RewriteRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4923:1: ( ( ( rule__RewriteRule__RightHandTermAssignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4924:1: ( ( rule__RewriteRule__RightHandTermAssignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4924:1: ( ( rule__RewriteRule__RightHandTermAssignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4925:1: ( rule__RewriteRule__RightHandTermAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRewriteRuleAccess().getRightHandTermAssignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4926:1: ( rule__RewriteRule__RightHandTermAssignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4926:2: rule__RewriteRule__RightHandTermAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RewriteRule__RightHandTermAssignment_2_in_rule__RewriteRule__Group__2__Impl9856);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4942:1: rule__SubSort__Group__0 : rule__SubSort__Group__0__Impl rule__SubSort__Group__1 ;
    public final void rule__SubSort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4946:1: ( rule__SubSort__Group__0__Impl rule__SubSort__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4947:2: rule__SubSort__Group__0__Impl rule__SubSort__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubSort__Group__0__Impl_in_rule__SubSort__Group__09892);
            rule__SubSort__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SubSort__Group__1_in_rule__SubSort__Group__09895);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4954:1: rule__SubSort__Group__0__Impl : ( ( rule__SubSort__NameAssignment_0 ) ) ;
    public final void rule__SubSort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4958:1: ( ( ( rule__SubSort__NameAssignment_0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4959:1: ( ( rule__SubSort__NameAssignment_0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4959:1: ( ( rule__SubSort__NameAssignment_0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4960:1: ( rule__SubSort__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubSortAccess().getNameAssignment_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4961:1: ( rule__SubSort__NameAssignment_0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4961:2: rule__SubSort__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubSort__NameAssignment_0_in_rule__SubSort__Group__0__Impl9922);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4971:1: rule__SubSort__Group__1 : rule__SubSort__Group__1__Impl rule__SubSort__Group__2 ;
    public final void rule__SubSort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4975:1: ( rule__SubSort__Group__1__Impl rule__SubSort__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4976:2: rule__SubSort__Group__1__Impl rule__SubSort__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubSort__Group__1__Impl_in_rule__SubSort__Group__19952);
            rule__SubSort__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SubSort__Group__2_in_rule__SubSort__Group__19955);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4983:1: rule__SubSort__Group__1__Impl : ( '<' ) ;
    public final void rule__SubSort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4987:1: ( ( '<' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4988:1: ( '<' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4988:1: ( '<' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:4989:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubSortAccess().getLessThanSignKeyword_1()); 
            }
            match(input,41,FollowSets000.FOLLOW_41_in_rule__SubSort__Group__1__Impl9983); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5002:1: rule__SubSort__Group__2 : rule__SubSort__Group__2__Impl ;
    public final void rule__SubSort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5006:1: ( rule__SubSort__Group__2__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5007:2: rule__SubSort__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubSort__Group__2__Impl_in_rule__SubSort__Group__210014);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5013:1: rule__SubSort__Group__2__Impl : ( ( rule__SubSort__SuperSortAssignment_2 ) ) ;
    public final void rule__SubSort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5017:1: ( ( ( rule__SubSort__SuperSortAssignment_2 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5018:1: ( ( rule__SubSort__SuperSortAssignment_2 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5018:1: ( ( rule__SubSort__SuperSortAssignment_2 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5019:1: ( rule__SubSort__SuperSortAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubSortAccess().getSuperSortAssignment_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5020:1: ( rule__SubSort__SuperSortAssignment_2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5020:2: rule__SubSort__SuperSortAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SubSort__SuperSortAssignment_2_in_rule__SubSort__Group__2__Impl10041);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5036:1: rule__Sort__Group__0 : rule__Sort__Group__0__Impl rule__Sort__Group__1 ;
    public final void rule__Sort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5040:1: ( rule__Sort__Group__0__Impl rule__Sort__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5041:2: rule__Sort__Group__0__Impl rule__Sort__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sort__Group__0__Impl_in_rule__Sort__Group__010077);
            rule__Sort__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Sort__Group__1_in_rule__Sort__Group__010080);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5048:1: rule__Sort__Group__0__Impl : ( () ) ;
    public final void rule__Sort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5052:1: ( ( () ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5053:1: ( () )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5053:1: ( () )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5054:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSortAccess().getSortAction_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5055:1: ()
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5057:1: 
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5067:1: rule__Sort__Group__1 : rule__Sort__Group__1__Impl ;
    public final void rule__Sort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5071:1: ( rule__Sort__Group__1__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5072:2: rule__Sort__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sort__Group__1__Impl_in_rule__Sort__Group__110138);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5078:1: rule__Sort__Group__1__Impl : ( ( rule__Sort__NameAssignment_1 ) ) ;
    public final void rule__Sort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5082:1: ( ( ( rule__Sort__NameAssignment_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5083:1: ( ( rule__Sort__NameAssignment_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5083:1: ( ( rule__Sort__NameAssignment_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5084:1: ( rule__Sort__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSortAccess().getNameAssignment_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5085:1: ( rule__Sort__NameAssignment_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5085:2: rule__Sort__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sort__NameAssignment_1_in_rule__Sort__Group__1__Impl10165);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5099:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5103:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5104:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__010199);
            rule__Term__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group__1_in_rule__Term__Group__010202);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5111:1: rule__Term__Group__0__Impl : ( () ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5115:1: ( ( () ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5116:1: ( () )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5116:1: ( () )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5117:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getTermAction_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5118:1: ()
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5120:1: 
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5130:1: rule__Term__Group__1 : rule__Term__Group__1__Impl rule__Term__Group__2 ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5134:1: ( rule__Term__Group__1__Impl rule__Term__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5135:2: rule__Term__Group__1__Impl rule__Term__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__110260);
            rule__Term__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group__2_in_rule__Term__Group__110263);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5142:1: rule__Term__Group__1__Impl : ( ( rule__Term__OperationSymbolAssignment_1 ) ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5146:1: ( ( ( rule__Term__OperationSymbolAssignment_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5147:1: ( ( rule__Term__OperationSymbolAssignment_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5147:1: ( ( rule__Term__OperationSymbolAssignment_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5148:1: ( rule__Term__OperationSymbolAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getOperationSymbolAssignment_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5149:1: ( rule__Term__OperationSymbolAssignment_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5149:2: rule__Term__OperationSymbolAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__OperationSymbolAssignment_1_in_rule__Term__Group__1__Impl10290);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5159:1: rule__Term__Group__2 : rule__Term__Group__2__Impl ;
    public final void rule__Term__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5163:1: ( rule__Term__Group__2__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5164:2: rule__Term__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group__2__Impl_in_rule__Term__Group__210320);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5170:1: rule__Term__Group__2__Impl : ( ( rule__Term__Group_2__0 )? ) ;
    public final void rule__Term__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5174:1: ( ( ( rule__Term__Group_2__0 )? ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5175:1: ( ( rule__Term__Group_2__0 )? )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5175:1: ( ( rule__Term__Group_2__0 )? )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5176:1: ( rule__Term__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getGroup_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5177:1: ( rule__Term__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==17) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5177:2: rule__Term__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2__0_in_rule__Term__Group__2__Impl10347);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5193:1: rule__Term__Group_2__0 : rule__Term__Group_2__0__Impl rule__Term__Group_2__1 ;
    public final void rule__Term__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5197:1: ( rule__Term__Group_2__0__Impl rule__Term__Group_2__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5198:2: rule__Term__Group_2__0__Impl rule__Term__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2__0__Impl_in_rule__Term__Group_2__010384);
            rule__Term__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2__1_in_rule__Term__Group_2__010387);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5205:1: rule__Term__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Term__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5209:1: ( ( '(' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5210:1: ( '(' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5210:1: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5211:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Term__Group_2__0__Impl10415); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5224:1: rule__Term__Group_2__1 : rule__Term__Group_2__1__Impl rule__Term__Group_2__2 ;
    public final void rule__Term__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5228:1: ( rule__Term__Group_2__1__Impl rule__Term__Group_2__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5229:2: rule__Term__Group_2__1__Impl rule__Term__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2__1__Impl_in_rule__Term__Group_2__110446);
            rule__Term__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2__2_in_rule__Term__Group_2__110449);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5236:1: rule__Term__Group_2__1__Impl : ( ( rule__Term__SubtermsAssignment_2_1 ) ) ;
    public final void rule__Term__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5240:1: ( ( ( rule__Term__SubtermsAssignment_2_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5241:1: ( ( rule__Term__SubtermsAssignment_2_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5241:1: ( ( rule__Term__SubtermsAssignment_2_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5242:1: ( rule__Term__SubtermsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getSubtermsAssignment_2_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5243:1: ( rule__Term__SubtermsAssignment_2_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5243:2: rule__Term__SubtermsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__SubtermsAssignment_2_1_in_rule__Term__Group_2__1__Impl10476);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5253:1: rule__Term__Group_2__2 : rule__Term__Group_2__2__Impl rule__Term__Group_2__3 ;
    public final void rule__Term__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5257:1: ( rule__Term__Group_2__2__Impl rule__Term__Group_2__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5258:2: rule__Term__Group_2__2__Impl rule__Term__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2__2__Impl_in_rule__Term__Group_2__210506);
            rule__Term__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2__3_in_rule__Term__Group_2__210509);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5265:1: rule__Term__Group_2__2__Impl : ( ( rule__Term__Group_2_2__0 )* ) ;
    public final void rule__Term__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5269:1: ( ( ( rule__Term__Group_2_2__0 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5270:1: ( ( rule__Term__Group_2_2__0 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5270:1: ( ( rule__Term__Group_2_2__0 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5271:1: ( rule__Term__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getGroup_2_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5272:1: ( rule__Term__Group_2_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==19) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5272:2: rule__Term__Group_2_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2_2__0_in_rule__Term__Group_2__2__Impl10536);
            	    rule__Term__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5282:1: rule__Term__Group_2__3 : rule__Term__Group_2__3__Impl ;
    public final void rule__Term__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5286:1: ( rule__Term__Group_2__3__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5287:2: rule__Term__Group_2__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2__3__Impl_in_rule__Term__Group_2__310567);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5293:1: rule__Term__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Term__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5297:1: ( ( ')' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5298:1: ( ')' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5298:1: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5299:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Term__Group_2__3__Impl10595); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5320:1: rule__Term__Group_2_2__0 : rule__Term__Group_2_2__0__Impl rule__Term__Group_2_2__1 ;
    public final void rule__Term__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5324:1: ( rule__Term__Group_2_2__0__Impl rule__Term__Group_2_2__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5325:2: rule__Term__Group_2_2__0__Impl rule__Term__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2_2__0__Impl_in_rule__Term__Group_2_2__010634);
            rule__Term__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2_2__1_in_rule__Term__Group_2_2__010637);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5332:1: rule__Term__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Term__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5336:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5337:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5337:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5338:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Term__Group_2_2__0__Impl10665); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5351:1: rule__Term__Group_2_2__1 : rule__Term__Group_2_2__1__Impl ;
    public final void rule__Term__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5355:1: ( rule__Term__Group_2_2__1__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5356:2: rule__Term__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__Group_2_2__1__Impl_in_rule__Term__Group_2_2__110696);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5362:1: rule__Term__Group_2_2__1__Impl : ( ( rule__Term__SubtermsAssignment_2_2_1 ) ) ;
    public final void rule__Term__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5366:1: ( ( ( rule__Term__SubtermsAssignment_2_2_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5367:1: ( ( rule__Term__SubtermsAssignment_2_2_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5367:1: ( ( rule__Term__SubtermsAssignment_2_2_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5368:1: ( rule__Term__SubtermsAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getSubtermsAssignment_2_2_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5369:1: ( rule__Term__SubtermsAssignment_2_2_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5369:2: rule__Term__SubtermsAssignment_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Term__SubtermsAssignment_2_2_1_in_rule__Term__Group_2_2__1__Impl10723);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5383:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5387:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5388:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__010757);
            rule__Variable__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__010760);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5395:1: rule__Variable__Group__0__Impl : ( () ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5399:1: ( ( () ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5400:1: ( () )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5400:1: ( () )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5401:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getVariableAction_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5402:1: ()
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5404:1: 
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5414:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5418:1: ( rule__Variable__Group__1__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5419:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__110818);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5425:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__DeclarationAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5429:1: ( ( ( rule__Variable__DeclarationAssignment_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5430:1: ( ( rule__Variable__DeclarationAssignment_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5430:1: ( ( rule__Variable__DeclarationAssignment_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5431:1: ( rule__Variable__DeclarationAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getDeclarationAssignment_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5432:1: ( rule__Variable__DeclarationAssignment_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5432:2: rule__Variable__DeclarationAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Variable__DeclarationAssignment_1_in_rule__Variable__Group__1__Impl10845);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5446:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5450:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5451:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__010879);
            rule__Operation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__010882);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5458:1: rule__Operation__Group__0__Impl : ( ( rule__Operation__NameAssignment_0 ) ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5462:1: ( ( ( rule__Operation__NameAssignment_0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5463:1: ( ( rule__Operation__NameAssignment_0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5463:1: ( ( rule__Operation__NameAssignment_0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5464:1: ( rule__Operation__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getNameAssignment_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5465:1: ( rule__Operation__NameAssignment_0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5465:2: rule__Operation__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__NameAssignment_0_in_rule__Operation__Group__0__Impl10909);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5475:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5479:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5480:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__110939);
            rule__Operation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__110942);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5487:1: rule__Operation__Group__1__Impl : ( ':' ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5491:1: ( ( ':' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5492:1: ( ':' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5492:1: ( ':' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5493:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getColonKeyword_1()); 
            }
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Operation__Group__1__Impl10970); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5506:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5510:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5511:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__211001);
            rule__Operation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__211004);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5518:1: rule__Operation__Group__2__Impl : ( ( rule__Operation__Group_2__0 )? ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5522:1: ( ( ( rule__Operation__Group_2__0 )? ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5523:1: ( ( rule__Operation__Group_2__0 )? )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5523:1: ( ( rule__Operation__Group_2__0 )? )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5524:1: ( rule__Operation__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup_2()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5525:1: ( rule__Operation__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==19||LA23_1==40) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5525:2: rule__Operation__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_2__0_in_rule__Operation__Group__2__Impl11031);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5535:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5539:1: ( rule__Operation__Group__3__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5540:2: rule__Operation__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__311062);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5546:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__ReturnTypeAssignment_3 ) ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5550:1: ( ( ( rule__Operation__ReturnTypeAssignment_3 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5551:1: ( ( rule__Operation__ReturnTypeAssignment_3 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5551:1: ( ( rule__Operation__ReturnTypeAssignment_3 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5552:1: ( rule__Operation__ReturnTypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getReturnTypeAssignment_3()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5553:1: ( rule__Operation__ReturnTypeAssignment_3 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5553:2: rule__Operation__ReturnTypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__ReturnTypeAssignment_3_in_rule__Operation__Group__3__Impl11089);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5571:1: rule__Operation__Group_2__0 : rule__Operation__Group_2__0__Impl rule__Operation__Group_2__1 ;
    public final void rule__Operation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5575:1: ( rule__Operation__Group_2__0__Impl rule__Operation__Group_2__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5576:2: rule__Operation__Group_2__0__Impl rule__Operation__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_2__0__Impl_in_rule__Operation__Group_2__011127);
            rule__Operation__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_2__1_in_rule__Operation__Group_2__011130);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5583:1: rule__Operation__Group_2__0__Impl : ( ( rule__Operation__FormalParametersAssignment_2_0 ) ) ;
    public final void rule__Operation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5587:1: ( ( ( rule__Operation__FormalParametersAssignment_2_0 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5588:1: ( ( rule__Operation__FormalParametersAssignment_2_0 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5588:1: ( ( rule__Operation__FormalParametersAssignment_2_0 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5589:1: ( rule__Operation__FormalParametersAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getFormalParametersAssignment_2_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5590:1: ( rule__Operation__FormalParametersAssignment_2_0 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5590:2: rule__Operation__FormalParametersAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__FormalParametersAssignment_2_0_in_rule__Operation__Group_2__0__Impl11157);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5600:1: rule__Operation__Group_2__1 : rule__Operation__Group_2__1__Impl rule__Operation__Group_2__2 ;
    public final void rule__Operation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5604:1: ( rule__Operation__Group_2__1__Impl rule__Operation__Group_2__2 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5605:2: rule__Operation__Group_2__1__Impl rule__Operation__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_2__1__Impl_in_rule__Operation__Group_2__111187);
            rule__Operation__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_2__2_in_rule__Operation__Group_2__111190);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5612:1: rule__Operation__Group_2__1__Impl : ( ( rule__Operation__Group_2_1__0 )* ) ;
    public final void rule__Operation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5616:1: ( ( ( rule__Operation__Group_2_1__0 )* ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5617:1: ( ( rule__Operation__Group_2_1__0 )* )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5617:1: ( ( rule__Operation__Group_2_1__0 )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5618:1: ( rule__Operation__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup_2_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5619:1: ( rule__Operation__Group_2_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==19) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5619:2: rule__Operation__Group_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_2_1__0_in_rule__Operation__Group_2__1__Impl11217);
            	    rule__Operation__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5629:1: rule__Operation__Group_2__2 : rule__Operation__Group_2__2__Impl ;
    public final void rule__Operation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5633:1: ( rule__Operation__Group_2__2__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5634:2: rule__Operation__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_2__2__Impl_in_rule__Operation__Group_2__211248);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5640:1: rule__Operation__Group_2__2__Impl : ( '->' ) ;
    public final void rule__Operation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5644:1: ( ( '->' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5645:1: ( '->' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5645:1: ( '->' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5646:1: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getHyphenMinusGreaterThanSignKeyword_2_2()); 
            }
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Operation__Group_2__2__Impl11276); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5665:1: rule__Operation__Group_2_1__0 : rule__Operation__Group_2_1__0__Impl rule__Operation__Group_2_1__1 ;
    public final void rule__Operation__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5669:1: ( rule__Operation__Group_2_1__0__Impl rule__Operation__Group_2_1__1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5670:2: rule__Operation__Group_2_1__0__Impl rule__Operation__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_2_1__0__Impl_in_rule__Operation__Group_2_1__011313);
            rule__Operation__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_2_1__1_in_rule__Operation__Group_2_1__011316);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5677:1: rule__Operation__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Operation__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5681:1: ( ( ',' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5682:1: ( ',' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5682:1: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5683:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Operation__Group_2_1__0__Impl11344); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5696:1: rule__Operation__Group_2_1__1 : rule__Operation__Group_2_1__1__Impl ;
    public final void rule__Operation__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5700:1: ( rule__Operation__Group_2_1__1__Impl )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5701:2: rule__Operation__Group_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__Group_2_1__1__Impl_in_rule__Operation__Group_2_1__111375);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5707:1: rule__Operation__Group_2_1__1__Impl : ( ( rule__Operation__FormalParametersAssignment_2_1_1 ) ) ;
    public final void rule__Operation__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5711:1: ( ( ( rule__Operation__FormalParametersAssignment_2_1_1 ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5712:1: ( ( rule__Operation__FormalParametersAssignment_2_1_1 ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5712:1: ( ( rule__Operation__FormalParametersAssignment_2_1_1 ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5713:1: ( rule__Operation__FormalParametersAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getFormalParametersAssignment_2_1_1()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5714:1: ( rule__Operation__FormalParametersAssignment_2_1_1 )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5714:2: rule__Operation__FormalParametersAssignment_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Operation__FormalParametersAssignment_2_1_1_in_rule__Operation__Group_2_1__1__Impl11402);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5729:1: rule__TransitionSystem__AdtAssignment_1 : ( ruleADT ) ;
    public final void rule__TransitionSystem__AdtAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5733:1: ( ( ruleADT ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5734:1: ( ruleADT )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5734:1: ( ruleADT )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5735:1: ruleADT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getAdtADTParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleADT_in_rule__TransitionSystem__AdtAssignment_111441);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5744:1: rule__TransitionSystem__InitialStateAssignment_4 : ( ruleTerm ) ;
    public final void rule__TransitionSystem__InitialStateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5748:1: ( ( ruleTerm ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5749:1: ( ruleTerm )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5749:1: ( ruleTerm )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5750:1: ruleTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getInitialStateTermParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTerm_in_rule__TransitionSystem__InitialStateAssignment_411472);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5759:1: rule__TransitionSystem__AuxiliaryAssignment_6 : ( ruleAuxiliary ) ;
    public final void rule__TransitionSystem__AuxiliaryAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5763:1: ( ( ruleAuxiliary ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5764:1: ( ruleAuxiliary )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5764:1: ( ruleAuxiliary )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5765:1: ruleAuxiliary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getAuxiliaryAuxiliaryParserRuleCall_6_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAuxiliary_in_rule__TransitionSystem__AuxiliaryAssignment_611503);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5774:1: rule__TransitionSystem__TransitionsAssignment_8 : ( ruleTransition ) ;
    public final void rule__TransitionSystem__TransitionsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5778:1: ( ( ruleTransition ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5779:1: ( ruleTransition )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5779:1: ( ruleTransition )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5780:1: ruleTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionSystemAccess().getTransitionsTransitionParserRuleCall_8_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_rule__TransitionSystem__TransitionsAssignment_811534);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5789:1: rule__Transition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Transition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5793:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5794:1: ( RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5794:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5795:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Transition__NameAssignment_011565); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5804:1: rule__Transition__BodyAssignment_2 : ( ruleNonVariableStrategy ) ;
    public final void rule__Transition__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5808:1: ( ( ruleNonVariableStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5809:1: ( ruleNonVariableStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5809:1: ( ruleNonVariableStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5810:1: ruleNonVariableStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getBodyNonVariableStrategyParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNonVariableStrategy_in_rule__Transition__BodyAssignment_211596);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5819:1: rule__Auxiliary__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Auxiliary__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5823:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5824:1: ( RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5824:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5825:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Auxiliary__NameAssignment_011627); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5834:1: rule__Auxiliary__FormalParamsAssignment_1_1 : ( ruleVariableStrategy ) ;
    public final void rule__Auxiliary__FormalParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5838:1: ( ( ruleVariableStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5839:1: ( ruleVariableStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5839:1: ( ruleVariableStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5840:1: ruleVariableStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getFormalParamsVariableStrategyParserRuleCall_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableStrategy_in_rule__Auxiliary__FormalParamsAssignment_1_111658);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5849:1: rule__Auxiliary__FormalParamsAssignment_1_2_1 : ( ruleVariableStrategy ) ;
    public final void rule__Auxiliary__FormalParamsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5853:1: ( ( ruleVariableStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5854:1: ( ruleVariableStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5854:1: ( ruleVariableStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5855:1: ruleVariableStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getFormalParamsVariableStrategyParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableStrategy_in_rule__Auxiliary__FormalParamsAssignment_1_2_111689);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5864:1: rule__Auxiliary__BodyAssignment_3 : ( ruleNonVariableStrategy ) ;
    public final void rule__Auxiliary__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5868:1: ( ( ruleNonVariableStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5869:1: ( ruleNonVariableStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5869:1: ( ruleNonVariableStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5870:1: ruleNonVariableStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuxiliaryAccess().getBodyNonVariableStrategyParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNonVariableStrategy_in_rule__Auxiliary__BodyAssignment_311720);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5879:1: rule__One__SAssignment_2 : ( ruleStrategy ) ;
    public final void rule__One__SAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5883:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5884:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5884:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5885:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneAccess().getSStrategyParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__One__SAssignment_211751);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5894:1: rule__One__NAssignment_4 : ( RULE_INT ) ;
    public final void rule__One__NAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5898:1: ( ( RULE_INT ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5899:1: ( RULE_INT )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5899:1: ( RULE_INT )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5900:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOneAccess().getNINTTerminalRuleCall_4_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__One__NAssignment_411782); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5909:1: rule__DeclaredStrategyInstance__DeclarationAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DeclaredStrategyInstance__DeclarationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5913:1: ( ( ( RULE_ID ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5914:1: ( ( RULE_ID ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5914:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5915:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getDeclarationDeclaredStrategyCrossReference_1_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5916:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5917:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getDeclarationDeclaredStrategyIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__DeclaredStrategyInstance__DeclarationAssignment_111817); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5928:1: rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0 : ( ruleStrategy ) ;
    public final void rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5932:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5933:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5933:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5934:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getActualParamsStrategyParserRuleCall_3_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__DeclaredStrategyInstance__ActualParamsAssignment_3_011852);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5943:1: rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1 : ( ruleStrategy ) ;
    public final void rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5947:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5948:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5948:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5949:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclaredStrategyInstanceAccess().getActualParamsStrategyParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_111883);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5958:1: rule__Saturation__SAssignment_2 : ( ruleStrategy ) ;
    public final void rule__Saturation__SAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5962:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5963:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5963:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5964:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSaturationAccess().getSStrategyParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__Saturation__SAssignment_211914);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5973:1: rule__Saturation__NAssignment_4 : ( RULE_INT ) ;
    public final void rule__Saturation__NAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5977:1: ( ( RULE_INT ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5978:1: ( RULE_INT )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5978:1: ( RULE_INT )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5979:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSaturationAccess().getNINTTerminalRuleCall_4_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Saturation__NAssignment_411945); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5988:1: rule__IfThenElse__S1Assignment_2 : ( ruleStrategy ) ;
    public final void rule__IfThenElse__S1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5992:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5993:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5993:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:5994:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getS1StrategyParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__IfThenElse__S1Assignment_211976);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6003:1: rule__IfThenElse__S2Assignment_4 : ( ruleStrategy ) ;
    public final void rule__IfThenElse__S2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6007:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6008:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6008:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6009:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getS2StrategyParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__IfThenElse__S2Assignment_412007);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6018:1: rule__IfThenElse__S3Assignment_6 : ( ruleStrategy ) ;
    public final void rule__IfThenElse__S3Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6022:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6023:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6023:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6024:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getS3StrategyParserRuleCall_6_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__IfThenElse__S3Assignment_612038);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6033:1: rule__SimpleStrategy__EquationsAssignment_1 : ( ruleRewriteRule ) ;
    public final void rule__SimpleStrategy__EquationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6037:1: ( ( ruleRewriteRule ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6038:1: ( ruleRewriteRule )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6038:1: ( ruleRewriteRule )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6039:1: ruleRewriteRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleStrategyAccess().getEquationsRewriteRuleParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRewriteRule_in_rule__SimpleStrategy__EquationsAssignment_112069);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6048:1: rule__SimpleStrategy__EquationsAssignment_2_1 : ( ruleRewriteRule ) ;
    public final void rule__SimpleStrategy__EquationsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6052:1: ( ( ruleRewriteRule ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6053:1: ( ruleRewriteRule )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6053:1: ( ruleRewriteRule )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6054:1: ruleRewriteRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleStrategyAccess().getEquationsRewriteRuleParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRewriteRule_in_rule__SimpleStrategy__EquationsAssignment_2_112100);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6063:1: rule__Not__SAssignment_2 : ( ruleSimpleStrategy ) ;
    public final void rule__Not__SAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6067:1: ( ( ruleSimpleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6068:1: ( ruleSimpleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6068:1: ( ruleSimpleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6069:1: ruleSimpleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getSSimpleStrategyParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSimpleStrategy_in_rule__Not__SAssignment_212131);
            ruleSimpleStrategy();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotAccess().getSSimpleStrategyParserRuleCall_2_0()); 
            }

            }


            }

        }
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6078:1: rule__Fixpoint__SAssignment_2 : ( ruleStrategy ) ;
    public final void rule__Fixpoint__SAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6082:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6083:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6083:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6084:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFixpointAccess().getSStrategyParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__Fixpoint__SAssignment_212162);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6093:1: rule__Choice__S1Assignment_2 : ( ruleStrategy ) ;
    public final void rule__Choice__S1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6097:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6098:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6098:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6099:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getS1StrategyParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__Choice__S1Assignment_212193);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6108:1: rule__Choice__S2Assignment_4 : ( ruleStrategy ) ;
    public final void rule__Choice__S2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6112:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6113:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6113:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6114:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChoiceAccess().getS2StrategyParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__Choice__S2Assignment_412224);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6123:1: rule__Union__S1Assignment_2 : ( ruleStrategy ) ;
    public final void rule__Union__S1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6127:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6128:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6128:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6129:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionAccess().getS1StrategyParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__Union__S1Assignment_212255);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6138:1: rule__Union__S2Assignment_4 : ( ruleStrategy ) ;
    public final void rule__Union__S2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6142:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6143:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6143:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6144:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnionAccess().getS2StrategyParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__Union__S2Assignment_412286);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6153:1: rule__Sequence__S1Assignment_2 : ( ruleStrategy ) ;
    public final void rule__Sequence__S1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6157:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6158:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6158:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6159:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getS1StrategyParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__Sequence__S1Assignment_212317);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6168:1: rule__Sequence__S2Assignment_4 : ( ruleStrategy ) ;
    public final void rule__Sequence__S2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6172:1: ( ( ruleStrategy ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6173:1: ( ruleStrategy )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6173:1: ( ruleStrategy )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6174:1: ruleStrategy
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getS2StrategyParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStrategy_in_rule__Sequence__S2Assignment_412348);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6183:1: rule__VariableStrategy__NameAssignment : ( RULE_ID ) ;
    public final void rule__VariableStrategy__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6187:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6188:1: ( RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6188:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6189:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableStrategyAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__VariableStrategy__NameAssignment12379); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6198:1: rule__ADT__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ADT__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6202:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6203:1: ( RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6203:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6204:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ADT__NameAssignment_112410); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6213:1: rule__ADT__SignatureAssignment_3 : ( ruleSignature ) ;
    public final void rule__ADT__SignatureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6217:1: ( ( ruleSignature ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6218:1: ( ruleSignature )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6218:1: ( ruleSignature )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6219:1: ruleSignature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getSignatureSignatureParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSignature_in_rule__ADT__SignatureAssignment_312441);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6228:1: rule__ADT__EquationsAssignment_4_1 : ( ruleEquation ) ;
    public final void rule__ADT__EquationsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6232:1: ( ( ruleEquation ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6233:1: ( ruleEquation )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6233:1: ( ruleEquation )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6234:1: ruleEquation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getEquationsEquationParserRuleCall_4_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEquation_in_rule__ADT__EquationsAssignment_4_112472);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6243:1: rule__ADT__EquationsAssignment_4_2 : ( ruleEquation ) ;
    public final void rule__ADT__EquationsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6247:1: ( ( ruleEquation ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6248:1: ( ruleEquation )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6248:1: ( ruleEquation )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6249:1: ruleEquation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getEquationsEquationParserRuleCall_4_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEquation_in_rule__ADT__EquationsAssignment_4_212503);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6258:1: rule__ADT__VariablesAssignment_5_1 : ( ruleVariableDeclaration ) ;
    public final void rule__ADT__VariablesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6262:1: ( ( ruleVariableDeclaration ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6263:1: ( ruleVariableDeclaration )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6263:1: ( ruleVariableDeclaration )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6264:1: ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getVariablesVariableDeclarationParserRuleCall_5_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableDeclaration_in_rule__ADT__VariablesAssignment_5_112534);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6273:1: rule__ADT__VariablesAssignment_5_2 : ( ruleVariableDeclaration ) ;
    public final void rule__ADT__VariablesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6277:1: ( ( ruleVariableDeclaration ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6278:1: ( ruleVariableDeclaration )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6278:1: ( ruleVariableDeclaration )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6279:1: ruleVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getADTAccess().getVariablesVariableDeclarationParserRuleCall_5_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableDeclaration_in_rule__ADT__VariablesAssignment_5_212565);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6288:1: rule__Signature__SortsAssignment_1 : ( ruleASort ) ;
    public final void rule__Signature__SortsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6292:1: ( ( ruleASort ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6293:1: ( ruleASort )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6293:1: ( ruleASort )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6294:1: ruleASort
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getSortsASortParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleASort_in_rule__Signature__SortsAssignment_112596);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6303:1: rule__Signature__SortsAssignment_2_1 : ( ruleASort ) ;
    public final void rule__Signature__SortsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6307:1: ( ( ruleASort ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6308:1: ( ruleASort )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6308:1: ( ruleASort )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6309:1: ruleASort
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getSortsASortParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleASort_in_rule__Signature__SortsAssignment_2_112627);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6318:1: rule__Signature__GeneratorsAssignment_3_1 : ( ruleOperation ) ;
    public final void rule__Signature__GeneratorsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6322:1: ( ( ruleOperation ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6323:1: ( ruleOperation )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6323:1: ( ruleOperation )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6324:1: ruleOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getGeneratorsOperationParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_rule__Signature__GeneratorsAssignment_3_112658);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6333:1: rule__Signature__GeneratorsAssignment_3_2 : ( ruleOperation ) ;
    public final void rule__Signature__GeneratorsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6337:1: ( ( ruleOperation ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6338:1: ( ruleOperation )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6338:1: ( ruleOperation )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6339:1: ruleOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getGeneratorsOperationParserRuleCall_3_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_rule__Signature__GeneratorsAssignment_3_212689);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6348:1: rule__Signature__OperationsAssignment_4_1 : ( ruleOperation ) ;
    public final void rule__Signature__OperationsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6352:1: ( ( ruleOperation ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6353:1: ( ruleOperation )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6353:1: ( ruleOperation )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6354:1: ruleOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getOperationsOperationParserRuleCall_4_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_rule__Signature__OperationsAssignment_4_112720);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6363:1: rule__Signature__OperationsAssignment_4_2 : ( ruleOperation ) ;
    public final void rule__Signature__OperationsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6367:1: ( ( ruleOperation ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6368:1: ( ruleOperation )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6368:1: ( ruleOperation )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6369:1: ruleOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSignatureAccess().getOperationsOperationParserRuleCall_4_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_rule__Signature__OperationsAssignment_4_212751);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6378:1: rule__VariableDeclaration__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6382:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6383:1: ( RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6383:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6384:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_012782); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6393:1: rule__VariableDeclaration__SortAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__VariableDeclaration__SortAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6397:1: ( ( ( RULE_ID ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6398:1: ( ( RULE_ID ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6398:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6399:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getSortASortCrossReference_2_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6400:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6401:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getSortASortIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__VariableDeclaration__SortAssignment_212817); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6412:1: rule__Equation__LeftHandTermAssignment_0 : ( ruleATerm ) ;
    public final void rule__Equation__LeftHandTermAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6416:1: ( ( ruleATerm ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6417:1: ( ruleATerm )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6417:1: ( ruleATerm )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6418:1: ruleATerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getLeftHandTermATermParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleATerm_in_rule__Equation__LeftHandTermAssignment_012852);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6427:1: rule__Equation__RightHandTermAssignment_2 : ( ruleATerm ) ;
    public final void rule__Equation__RightHandTermAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6431:1: ( ( ruleATerm ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6432:1: ( ruleATerm )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6432:1: ( ruleATerm )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6433:1: ruleATerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquationAccess().getRightHandTermATermParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleATerm_in_rule__Equation__RightHandTermAssignment_212883);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6442:1: rule__RewriteRule__LeftHandTermAssignment_0 : ( ruleATerm ) ;
    public final void rule__RewriteRule__LeftHandTermAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6446:1: ( ( ruleATerm ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6447:1: ( ruleATerm )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6447:1: ( ruleATerm )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6448:1: ruleATerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRewriteRuleAccess().getLeftHandTermATermParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleATerm_in_rule__RewriteRule__LeftHandTermAssignment_012914);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6457:1: rule__RewriteRule__RightHandTermAssignment_2 : ( ruleATerm ) ;
    public final void rule__RewriteRule__RightHandTermAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6461:1: ( ( ruleATerm ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6462:1: ( ruleATerm )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6462:1: ( ruleATerm )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6463:1: ruleATerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRewriteRuleAccess().getRightHandTermATermParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleATerm_in_rule__RewriteRule__RightHandTermAssignment_212945);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6472:1: rule__SubSort__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SubSort__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6476:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6477:1: ( RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6477:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6478:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubSortAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__SubSort__NameAssignment_012976); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6487:1: rule__SubSort__SuperSortAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__SubSort__SuperSortAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6491:1: ( ( ( RULE_ID ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6492:1: ( ( RULE_ID ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6492:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6493:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubSortAccess().getSuperSortASortCrossReference_2_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6494:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6495:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubSortAccess().getSuperSortASortIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__SubSort__SuperSortAssignment_213011); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6506:1: rule__Sort__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6510:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6511:1: ( RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6511:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6512:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSortAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Sort__NameAssignment_113046); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6521:1: rule__Term__OperationSymbolAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Term__OperationSymbolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6525:1: ( ( ( RULE_ID ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6526:1: ( ( RULE_ID ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6526:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6527:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getOperationSymbolOperationCrossReference_1_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6528:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6529:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getOperationSymbolOperationIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Term__OperationSymbolAssignment_113081); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6540:1: rule__Term__SubtermsAssignment_2_1 : ( ruleATerm ) ;
    public final void rule__Term__SubtermsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6544:1: ( ( ruleATerm ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6545:1: ( ruleATerm )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6545:1: ( ruleATerm )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6546:1: ruleATerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getSubtermsATermParserRuleCall_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleATerm_in_rule__Term__SubtermsAssignment_2_113116);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6555:1: rule__Term__SubtermsAssignment_2_2_1 : ( ruleATerm ) ;
    public final void rule__Term__SubtermsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6559:1: ( ( ruleATerm ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6560:1: ( ruleATerm )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6560:1: ( ruleATerm )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6561:1: ruleATerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getSubtermsATermParserRuleCall_2_2_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleATerm_in_rule__Term__SubtermsAssignment_2_2_113147);
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6570:1: rule__Variable__DeclarationAssignment_1 : ( ( RULE_TERMVAR ) ) ;
    public final void rule__Variable__DeclarationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6574:1: ( ( ( RULE_TERMVAR ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6575:1: ( ( RULE_TERMVAR ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6575:1: ( ( RULE_TERMVAR ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6576:1: ( RULE_TERMVAR )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getDeclarationVariableDeclarationCrossReference_1_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6577:1: ( RULE_TERMVAR )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6578:1: RULE_TERMVAR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getDeclarationVariableDeclarationTERMVARTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_TERMVAR,FollowSets000.FOLLOW_RULE_TERMVAR_in_rule__Variable__DeclarationAssignment_113182); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6589:1: rule__Operation__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Operation__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6593:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6594:1: ( RULE_ID )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6594:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6595:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_013217); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6604:1: rule__Operation__FormalParametersAssignment_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__Operation__FormalParametersAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6608:1: ( ( ( RULE_ID ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6609:1: ( ( RULE_ID ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6609:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6610:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getFormalParametersASortCrossReference_2_0_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6611:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6612:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getFormalParametersASortIDTerminalRuleCall_2_0_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Operation__FormalParametersAssignment_2_013252); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6623:1: rule__Operation__FormalParametersAssignment_2_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Operation__FormalParametersAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6627:1: ( ( ( RULE_ID ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6628:1: ( ( RULE_ID ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6628:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6629:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getFormalParametersASortCrossReference_2_1_1_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6630:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6631:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getFormalParametersASortIDTerminalRuleCall_2_1_1_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Operation__FormalParametersAssignment_2_1_113291); if (state.failed) return ;
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
    // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6642:1: rule__Operation__ReturnTypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Operation__ReturnTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6646:1: ( ( ( RULE_ID ) ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6647:1: ( ( RULE_ID ) )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6647:1: ( ( RULE_ID ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6648:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getReturnTypeASortCrossReference_3_0()); 
            }
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6649:1: ( RULE_ID )
            // ../ch.unige.cui.smv.stratagem.xtext.ts.ui/src-gen/ch/unige/cui/smv/stratagem/xtext/ui/contentassist/antlr/internal/InternalTransitionSystemDsl.g:6650:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getReturnTypeASortIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Operation__ReturnTypeAssignment_313330); if (state.failed) return ;
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
        public static final BitSet FOLLOW_ruleTerm_in_rule__ATerm__Alternatives2238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_rule__ATerm__Alternatives2255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubSort_in_rule__ASort__Alternatives2287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSort_in_rule__ASort__Alternatives2304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__0__Impl_in_rule__TransitionSystem__Group__02334 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__1_in_rule__TransitionSystem__Group__02337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__TransitionSystem__Group__0__Impl2365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__1__Impl_in_rule__TransitionSystem__Group__12396 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__2_in_rule__TransitionSystem__Group__12399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__AdtAssignment_1_in_rule__TransitionSystem__Group__1__Impl2426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__2__Impl_in_rule__TransitionSystem__Group__22456 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__3_in_rule__TransitionSystem__Group__22459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__TransitionSystem__Group__2__Impl2487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__3__Impl_in_rule__TransitionSystem__Group__32518 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__4_in_rule__TransitionSystem__Group__32521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__TransitionSystem__Group__3__Impl2549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__4__Impl_in_rule__TransitionSystem__Group__42580 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__5_in_rule__TransitionSystem__Group__42583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__InitialStateAssignment_4_in_rule__TransitionSystem__Group__4__Impl2610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__5__Impl_in_rule__TransitionSystem__Group__52640 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__6_in_rule__TransitionSystem__Group__52643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__TransitionSystem__Group__5__Impl2671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__6__Impl_in_rule__TransitionSystem__Group__62702 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__7_in_rule__TransitionSystem__Group__62705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__AuxiliaryAssignment_6_in_rule__TransitionSystem__Group__6__Impl2732 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__7__Impl_in_rule__TransitionSystem__Group__72763 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__8_in_rule__TransitionSystem__Group__72766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TransitionSystem__Group__7__Impl2794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__Group__8__Impl_in_rule__TransitionSystem__Group__82825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TransitionSystem__TransitionsAssignment_8_in_rule__TransitionSystem__Group__8__Impl2852 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__02901 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__02904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__NameAssignment_0_in_rule__Transition__Group__0__Impl2931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__12961 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__12964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Transition__Group__1__Impl2992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__23023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Transition__BodyAssignment_2_in_rule__Transition__Group__2__Impl3050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group__0__Impl_in_rule__Auxiliary__Group__03086 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group__1_in_rule__Auxiliary__Group__03089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__NameAssignment_0_in_rule__Auxiliary__Group__0__Impl3116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group__1__Impl_in_rule__Auxiliary__Group__13146 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group__2_in_rule__Auxiliary__Group__13149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1__0_in_rule__Auxiliary__Group__1__Impl3176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group__2__Impl_in_rule__Auxiliary__Group__23207 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group__3_in_rule__Auxiliary__Group__23210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Auxiliary__Group__2__Impl3238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group__3__Impl_in_rule__Auxiliary__Group__33269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__BodyAssignment_3_in_rule__Auxiliary__Group__3__Impl3296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1__0__Impl_in_rule__Auxiliary__Group_1__03334 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1__1_in_rule__Auxiliary__Group_1__03337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Auxiliary__Group_1__0__Impl3365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1__1__Impl_in_rule__Auxiliary__Group_1__13396 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1__2_in_rule__Auxiliary__Group_1__13399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__FormalParamsAssignment_1_1_in_rule__Auxiliary__Group_1__1__Impl3426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1__2__Impl_in_rule__Auxiliary__Group_1__23456 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1__3_in_rule__Auxiliary__Group_1__23459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1_2__0_in_rule__Auxiliary__Group_1__2__Impl3486 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1__3__Impl_in_rule__Auxiliary__Group_1__33517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Auxiliary__Group_1__3__Impl3545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1_2__0__Impl_in_rule__Auxiliary__Group_1_2__03584 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1_2__1_in_rule__Auxiliary__Group_1_2__03587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Auxiliary__Group_1_2__0__Impl3615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__Group_1_2__1__Impl_in_rule__Auxiliary__Group_1_2__13646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Auxiliary__FormalParamsAssignment_1_2_1_in_rule__Auxiliary__Group_1_2__1__Impl3673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__One__Group__0__Impl_in_rule__One__Group__03707 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__One__Group__1_in_rule__One__Group__03710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__One__Group__0__Impl3738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__One__Group__1__Impl_in_rule__One__Group__13769 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_rule__One__Group__2_in_rule__One__Group__13772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__One__Group__1__Impl3800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__One__Group__2__Impl_in_rule__One__Group__23831 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__One__Group__3_in_rule__One__Group__23834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__One__SAssignment_2_in_rule__One__Group__2__Impl3861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__One__Group__3__Impl_in_rule__One__Group__33891 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__One__Group__4_in_rule__One__Group__33894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__One__Group__3__Impl3922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__One__Group__4__Impl_in_rule__One__Group__43953 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__One__Group__5_in_rule__One__Group__43956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__One__NAssignment_4_in_rule__One__Group__4__Impl3983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__One__Group__5__Impl_in_rule__One__Group__54013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__One__Group__5__Impl4041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group__0__Impl_in_rule__DeclaredStrategyInstance__Group__04084 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group__1_in_rule__DeclaredStrategyInstance__Group__04087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group__1__Impl_in_rule__DeclaredStrategyInstance__Group__14145 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group__2_in_rule__DeclaredStrategyInstance__Group__14148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__DeclarationAssignment_1_in_rule__DeclaredStrategyInstance__Group__1__Impl4175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group__2__Impl_in_rule__DeclaredStrategyInstance__Group__24205 = new BitSet(new long[]{0x00000000FEF40010L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group__3_in_rule__DeclaredStrategyInstance__Group__24208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__DeclaredStrategyInstance__Group__2__Impl4236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group__3__Impl_in_rule__DeclaredStrategyInstance__Group__34267 = new BitSet(new long[]{0x00000000FEF40010L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group__4_in_rule__DeclaredStrategyInstance__Group__34270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group_3__0_in_rule__DeclaredStrategyInstance__Group__3__Impl4297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group__4__Impl_in_rule__DeclaredStrategyInstance__Group__44328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__DeclaredStrategyInstance__Group__4__Impl4356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group_3__0__Impl_in_rule__DeclaredStrategyInstance__Group_3__04397 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group_3__1_in_rule__DeclaredStrategyInstance__Group_3__04400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__ActualParamsAssignment_3_0_in_rule__DeclaredStrategyInstance__Group_3__0__Impl4427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group_3__1__Impl_in_rule__DeclaredStrategyInstance__Group_3__14457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group_3_1__0_in_rule__DeclaredStrategyInstance__Group_3__1__Impl4484 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group_3_1__0__Impl_in_rule__DeclaredStrategyInstance__Group_3_1__04519 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group_3_1__1_in_rule__DeclaredStrategyInstance__Group_3_1__04522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__DeclaredStrategyInstance__Group_3_1__0__Impl4550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__Group_3_1__1__Impl_in_rule__DeclaredStrategyInstance__Group_3_1__14581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_1_in_rule__DeclaredStrategyInstance__Group_3_1__1__Impl4608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Saturation__Group__0__Impl_in_rule__Saturation__Group__04642 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Saturation__Group__1_in_rule__Saturation__Group__04645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Saturation__Group__0__Impl4673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Saturation__Group__1__Impl_in_rule__Saturation__Group__14704 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_rule__Saturation__Group__2_in_rule__Saturation__Group__14707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Saturation__Group__1__Impl4735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Saturation__Group__2__Impl_in_rule__Saturation__Group__24766 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Saturation__Group__3_in_rule__Saturation__Group__24769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Saturation__SAssignment_2_in_rule__Saturation__Group__2__Impl4796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Saturation__Group__3__Impl_in_rule__Saturation__Group__34826 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Saturation__Group__4_in_rule__Saturation__Group__34829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Saturation__Group__3__Impl4857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Saturation__Group__4__Impl_in_rule__Saturation__Group__44888 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Saturation__Group__5_in_rule__Saturation__Group__44891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Saturation__NAssignment_4_in_rule__Saturation__Group__4__Impl4918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Saturation__Group__5__Impl_in_rule__Saturation__Group__54948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Saturation__Group__5__Impl4976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__0__Impl_in_rule__IfThenElse__Group__05019 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__1_in_rule__IfThenElse__Group__05022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__IfThenElse__Group__0__Impl5050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__1__Impl_in_rule__IfThenElse__Group__15081 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__2_in_rule__IfThenElse__Group__15084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__IfThenElse__Group__1__Impl5112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__2__Impl_in_rule__IfThenElse__Group__25143 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__3_in_rule__IfThenElse__Group__25146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__S1Assignment_2_in_rule__IfThenElse__Group__2__Impl5173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__3__Impl_in_rule__IfThenElse__Group__35203 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__4_in_rule__IfThenElse__Group__35206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__IfThenElse__Group__3__Impl5234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__4__Impl_in_rule__IfThenElse__Group__45265 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__5_in_rule__IfThenElse__Group__45268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__S2Assignment_4_in_rule__IfThenElse__Group__4__Impl5295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__5__Impl_in_rule__IfThenElse__Group__55325 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__6_in_rule__IfThenElse__Group__55328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__IfThenElse__Group__5__Impl5356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__6__Impl_in_rule__IfThenElse__Group__65387 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__7_in_rule__IfThenElse__Group__65390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__S3Assignment_6_in_rule__IfThenElse__Group__6__Impl5417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__IfThenElse__Group__7__Impl_in_rule__IfThenElse__Group__75447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__IfThenElse__Group__7__Impl5475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group__0__Impl_in_rule__SimpleStrategy__Group__05522 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group__1_in_rule__SimpleStrategy__Group__05525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__SimpleStrategy__Group__0__Impl5553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group__1__Impl_in_rule__SimpleStrategy__Group__15584 = new BitSet(new long[]{0x0000000001080000L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group__2_in_rule__SimpleStrategy__Group__15587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__EquationsAssignment_1_in_rule__SimpleStrategy__Group__1__Impl5614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group__2__Impl_in_rule__SimpleStrategy__Group__25644 = new BitSet(new long[]{0x0000000001080000L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group__3_in_rule__SimpleStrategy__Group__25647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group_2__0_in_rule__SimpleStrategy__Group__2__Impl5674 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group__3__Impl_in_rule__SimpleStrategy__Group__35705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__SimpleStrategy__Group__3__Impl5733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group_2__0__Impl_in_rule__SimpleStrategy__Group_2__05772 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group_2__1_in_rule__SimpleStrategy__Group_2__05775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__SimpleStrategy__Group_2__0__Impl5803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__Group_2__1__Impl_in_rule__SimpleStrategy__Group_2__15834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SimpleStrategy__EquationsAssignment_2_1_in_rule__SimpleStrategy__Group_2__1__Impl5861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Not__Group__0__Impl_in_rule__Not__Group__05895 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Not__Group__1_in_rule__Not__Group__05898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Not__Group__0__Impl5926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Not__Group__1__Impl_in_rule__Not__Group__15957 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Not__Group__2_in_rule__Not__Group__15960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Not__Group__1__Impl5988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Not__Group__2__Impl_in_rule__Not__Group__26019 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Not__Group__3_in_rule__Not__Group__26022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Not__SAssignment_2_in_rule__Not__Group__2__Impl6049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Not__Group__3__Impl_in_rule__Not__Group__36079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Not__Group__3__Impl6107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fixpoint__Group__0__Impl_in_rule__Fixpoint__Group__06146 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Fixpoint__Group__1_in_rule__Fixpoint__Group__06149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Fixpoint__Group__0__Impl6177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fixpoint__Group__1__Impl_in_rule__Fixpoint__Group__16208 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_rule__Fixpoint__Group__2_in_rule__Fixpoint__Group__16211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Fixpoint__Group__1__Impl6239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fixpoint__Group__2__Impl_in_rule__Fixpoint__Group__26270 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Fixpoint__Group__3_in_rule__Fixpoint__Group__26273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fixpoint__SAssignment_2_in_rule__Fixpoint__Group__2__Impl6300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fixpoint__Group__3__Impl_in_rule__Fixpoint__Group__36330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Fixpoint__Group__3__Impl6358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Choice__Group__0__Impl_in_rule__Choice__Group__06397 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Choice__Group__1_in_rule__Choice__Group__06400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Choice__Group__0__Impl6428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Choice__Group__1__Impl_in_rule__Choice__Group__16459 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_rule__Choice__Group__2_in_rule__Choice__Group__16462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Choice__Group__1__Impl6490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Choice__Group__2__Impl_in_rule__Choice__Group__26521 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Choice__Group__3_in_rule__Choice__Group__26524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Choice__S1Assignment_2_in_rule__Choice__Group__2__Impl6551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Choice__Group__3__Impl_in_rule__Choice__Group__36581 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_rule__Choice__Group__4_in_rule__Choice__Group__36584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Choice__Group__3__Impl6612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Choice__Group__4__Impl_in_rule__Choice__Group__46643 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Choice__Group__5_in_rule__Choice__Group__46646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Choice__S2Assignment_4_in_rule__Choice__Group__4__Impl6673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Choice__Group__5__Impl_in_rule__Choice__Group__56703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Choice__Group__5__Impl6731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Union__Group__0__Impl_in_rule__Union__Group__06774 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Union__Group__1_in_rule__Union__Group__06777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Union__Group__0__Impl6805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Union__Group__1__Impl_in_rule__Union__Group__16836 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_rule__Union__Group__2_in_rule__Union__Group__16839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Union__Group__1__Impl6867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Union__Group__2__Impl_in_rule__Union__Group__26898 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Union__Group__3_in_rule__Union__Group__26901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Union__S1Assignment_2_in_rule__Union__Group__2__Impl6928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Union__Group__3__Impl_in_rule__Union__Group__36958 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_rule__Union__Group__4_in_rule__Union__Group__36961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Union__Group__3__Impl6989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Union__Group__4__Impl_in_rule__Union__Group__47020 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Union__Group__5_in_rule__Union__Group__47023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Union__S2Assignment_4_in_rule__Union__Group__4__Impl7050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Union__Group__5__Impl_in_rule__Union__Group__57080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Union__Group__5__Impl7108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__07151 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__07154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Sequence__Group__0__Impl7182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__17213 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__17216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Sequence__Group__1__Impl7244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__27275 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__27278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__S1Assignment_2_in_rule__Sequence__Group__2__Impl7305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__37335 = new BitSet(new long[]{0x00000000FEF00010L});
        public static final BitSet FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__37338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Sequence__Group__3__Impl7366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__47397 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Sequence__Group__5_in_rule__Sequence__Group__47400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__S2Assignment_4_in_rule__Sequence__Group__4__Impl7427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__5__Impl_in_rule__Sequence__Group__57457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Sequence__Group__5__Impl7485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identity__Group__0__Impl_in_rule__Identity__Group__07528 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_rule__Identity__Group__1_in_rule__Identity__Group__07531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Identity__Group__0__Impl7559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Identity__Group__1__Impl_in_rule__Identity__Group__17590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fail__Group__0__Impl_in_rule__Fail__Group__07652 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_rule__Fail__Group__1_in_rule__Fail__Group__07655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Fail__Group__0__Impl7683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fail__Group__1__Impl_in_rule__Fail__Group__17714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group__0__Impl_in_rule__ADT__Group__07776 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__ADT__Group__1_in_rule__ADT__Group__07779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__ADT__Group__0__Impl7807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group__1__Impl_in_rule__ADT__Group__17838 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__ADT__Group__2_in_rule__ADT__Group__17841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__NameAssignment_1_in_rule__ADT__Group__1__Impl7868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group__2__Impl_in_rule__ADT__Group__27898 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__ADT__Group__3_in_rule__ADT__Group__27901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__ADT__Group__2__Impl7929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group__3__Impl_in_rule__ADT__Group__37960 = new BitSet(new long[]{0x0000000C00000000L});
        public static final BitSet FOLLOW_rule__ADT__Group__4_in_rule__ADT__Group__37963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__SignatureAssignment_3_in_rule__ADT__Group__3__Impl7990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group__4__Impl_in_rule__ADT__Group__48020 = new BitSet(new long[]{0x0000000C00000000L});
        public static final BitSet FOLLOW_rule__ADT__Group__5_in_rule__ADT__Group__48023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group_4__0_in_rule__ADT__Group__4__Impl8050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group__5__Impl_in_rule__ADT__Group__58081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group_5__0_in_rule__ADT__Group__5__Impl8108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group_4__0__Impl_in_rule__ADT__Group_4__08151 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__ADT__Group_4__1_in_rule__ADT__Group_4__08154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__ADT__Group_4__0__Impl8183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group_4__1__Impl_in_rule__ADT__Group_4__18215 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__ADT__Group_4__2_in_rule__ADT__Group_4__18218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__EquationsAssignment_4_1_in_rule__ADT__Group_4__1__Impl8245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group_4__2__Impl_in_rule__ADT__Group_4__28275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__EquationsAssignment_4_2_in_rule__ADT__Group_4__2__Impl8302 = new BitSet(new long[]{0x0000000000000052L});
        public static final BitSet FOLLOW_rule__ADT__Group_5__0__Impl_in_rule__ADT__Group_5__08339 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__ADT__Group_5__1_in_rule__ADT__Group_5__08342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__ADT__Group_5__0__Impl8371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group_5__1__Impl_in_rule__ADT__Group_5__18403 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__ADT__Group_5__2_in_rule__ADT__Group_5__18406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__VariablesAssignment_5_1_in_rule__ADT__Group_5__1__Impl8433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__Group_5__2__Impl_in_rule__ADT__Group_5__28463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ADT__VariablesAssignment_5_2_in_rule__ADT__Group_5__2__Impl8490 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__Signature__Group__0__Impl_in_rule__Signature__Group__08527 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Signature__Group__1_in_rule__Signature__Group__08530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Signature__Group__0__Impl8558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group__1__Impl_in_rule__Signature__Group__18589 = new BitSet(new long[]{0x0000002000080000L});
        public static final BitSet FOLLOW_rule__Signature__Group__2_in_rule__Signature__Group__18592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__SortsAssignment_1_in_rule__Signature__Group__1__Impl8619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group__2__Impl_in_rule__Signature__Group__28649 = new BitSet(new long[]{0x0000002000080000L});
        public static final BitSet FOLLOW_rule__Signature__Group__3_in_rule__Signature__Group__28652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group_2__0_in_rule__Signature__Group__2__Impl8679 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Signature__Group__3__Impl_in_rule__Signature__Group__38710 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Signature__Group__4_in_rule__Signature__Group__38713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group_3__0_in_rule__Signature__Group__3__Impl8740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group__4__Impl_in_rule__Signature__Group__48770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group_4__0_in_rule__Signature__Group__4__Impl8797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group_2__0__Impl_in_rule__Signature__Group_2__08838 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Signature__Group_2__1_in_rule__Signature__Group_2__08841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Signature__Group_2__0__Impl8869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group_2__1__Impl_in_rule__Signature__Group_2__18900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__SortsAssignment_2_1_in_rule__Signature__Group_2__1__Impl8927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group_3__0__Impl_in_rule__Signature__Group_3__08961 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Signature__Group_3__1_in_rule__Signature__Group_3__08964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Signature__Group_3__0__Impl8993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group_3__1__Impl_in_rule__Signature__Group_3__19025 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Signature__Group_3__2_in_rule__Signature__Group_3__19028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__GeneratorsAssignment_3_1_in_rule__Signature__Group_3__1__Impl9055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group_3__2__Impl_in_rule__Signature__Group_3__29085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__GeneratorsAssignment_3_2_in_rule__Signature__Group_3__2__Impl9112 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__Signature__Group_4__0__Impl_in_rule__Signature__Group_4__09149 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Signature__Group_4__1_in_rule__Signature__Group_4__09152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Signature__Group_4__0__Impl9181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group_4__1__Impl_in_rule__Signature__Group_4__19213 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Signature__Group_4__2_in_rule__Signature__Group_4__19216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__OperationsAssignment_4_1_in_rule__Signature__Group_4__1__Impl9243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__Group_4__2__Impl_in_rule__Signature__Group_4__29273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Signature__OperationsAssignment_4_2_in_rule__Signature__Group_4__2__Impl9300 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__09337 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__09340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableDeclaration__NameAssignment_0_in_rule__VariableDeclaration__Group__0__Impl9367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__19397 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__19400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__VariableDeclaration__Group__1__Impl9428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__29459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__VariableDeclaration__SortAssignment_2_in_rule__VariableDeclaration__Group__2__Impl9486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equation__Group__0__Impl_in_rule__Equation__Group__09522 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Equation__Group__1_in_rule__Equation__Group__09525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equation__LeftHandTermAssignment_0_in_rule__Equation__Group__0__Impl9552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equation__Group__1__Impl_in_rule__Equation__Group__19582 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__Equation__Group__2_in_rule__Equation__Group__19585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Equation__Group__1__Impl9613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equation__Group__2__Impl_in_rule__Equation__Group__29644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Equation__RightHandTermAssignment_2_in_rule__Equation__Group__2__Impl9671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RewriteRule__Group__0__Impl_in_rule__RewriteRule__Group__09707 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__RewriteRule__Group__1_in_rule__RewriteRule__Group__09710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RewriteRule__LeftHandTermAssignment_0_in_rule__RewriteRule__Group__0__Impl9737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RewriteRule__Group__1__Impl_in_rule__RewriteRule__Group__19767 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__RewriteRule__Group__2_in_rule__RewriteRule__Group__19770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__RewriteRule__Group__1__Impl9798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RewriteRule__Group__2__Impl_in_rule__RewriteRule__Group__29829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RewriteRule__RightHandTermAssignment_2_in_rule__RewriteRule__Group__2__Impl9856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubSort__Group__0__Impl_in_rule__SubSort__Group__09892 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_rule__SubSort__Group__1_in_rule__SubSort__Group__09895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubSort__NameAssignment_0_in_rule__SubSort__Group__0__Impl9922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubSort__Group__1__Impl_in_rule__SubSort__Group__19952 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__SubSort__Group__2_in_rule__SubSort__Group__19955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__SubSort__Group__1__Impl9983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubSort__Group__2__Impl_in_rule__SubSort__Group__210014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SubSort__SuperSortAssignment_2_in_rule__SubSort__Group__2__Impl10041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sort__Group__0__Impl_in_rule__Sort__Group__010077 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Sort__Group__1_in_rule__Sort__Group__010080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sort__Group__1__Impl_in_rule__Sort__Group__110138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sort__NameAssignment_1_in_rule__Sort__Group__1__Impl10165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__010199 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Term__Group__1_in_rule__Term__Group__010202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__110260 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Term__Group__2_in_rule__Term__Group__110263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__OperationSymbolAssignment_1_in_rule__Term__Group__1__Impl10290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__Group__2__Impl_in_rule__Term__Group__210320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__Group_2__0_in_rule__Term__Group__2__Impl10347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__Group_2__0__Impl_in_rule__Term__Group_2__010384 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__Term__Group_2__1_in_rule__Term__Group_2__010387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Term__Group_2__0__Impl10415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__Group_2__1__Impl_in_rule__Term__Group_2__110446 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__Term__Group_2__2_in_rule__Term__Group_2__110449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__SubtermsAssignment_2_1_in_rule__Term__Group_2__1__Impl10476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__Group_2__2__Impl_in_rule__Term__Group_2__210506 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__Term__Group_2__3_in_rule__Term__Group_2__210509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__Group_2_2__0_in_rule__Term__Group_2__2__Impl10536 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Term__Group_2__3__Impl_in_rule__Term__Group_2__310567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Term__Group_2__3__Impl10595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__Group_2_2__0__Impl_in_rule__Term__Group_2_2__010634 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__Term__Group_2_2__1_in_rule__Term__Group_2_2__010637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Term__Group_2_2__0__Impl10665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__Group_2_2__1__Impl_in_rule__Term__Group_2_2__110696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Term__SubtermsAssignment_2_2_1_in_rule__Term__Group_2_2__1__Impl10723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__0__Impl_in_rule__Variable__Group__010757 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_rule__Variable__Group__1_in_rule__Variable__Group__010760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__Group__1__Impl_in_rule__Variable__Group__110818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Variable__DeclarationAssignment_1_in_rule__Variable__Group__1__Impl10845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__010879 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__010882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__NameAssignment_0_in_rule__Operation__Group__0__Impl10909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__110939 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__110942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Operation__Group__1__Impl10970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__211001 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__211004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_2__0_in_rule__Operation__Group__2__Impl11031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__311062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__ReturnTypeAssignment_3_in_rule__Operation__Group__3__Impl11089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_2__0__Impl_in_rule__Operation__Group_2__011127 = new BitSet(new long[]{0x0000010000080000L});
        public static final BitSet FOLLOW_rule__Operation__Group_2__1_in_rule__Operation__Group_2__011130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__FormalParametersAssignment_2_0_in_rule__Operation__Group_2__0__Impl11157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_2__1__Impl_in_rule__Operation__Group_2__111187 = new BitSet(new long[]{0x0000010000080000L});
        public static final BitSet FOLLOW_rule__Operation__Group_2__2_in_rule__Operation__Group_2__111190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_2_1__0_in_rule__Operation__Group_2__1__Impl11217 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Operation__Group_2__2__Impl_in_rule__Operation__Group_2__211248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Operation__Group_2__2__Impl11276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_2_1__0__Impl_in_rule__Operation__Group_2_1__011313 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Operation__Group_2_1__1_in_rule__Operation__Group_2_1__011316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Operation__Group_2_1__0__Impl11344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__Group_2_1__1__Impl_in_rule__Operation__Group_2_1__111375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Operation__FormalParametersAssignment_2_1_1_in_rule__Operation__Group_2_1__1__Impl11402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleADT_in_rule__TransitionSystem__AdtAssignment_111441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerm_in_rule__TransitionSystem__InitialStateAssignment_411472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAuxiliary_in_rule__TransitionSystem__AuxiliaryAssignment_611503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_rule__TransitionSystem__TransitionsAssignment_811534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__NameAssignment_011565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNonVariableStrategy_in_rule__Transition__BodyAssignment_211596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Auxiliary__NameAssignment_011627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableStrategy_in_rule__Auxiliary__FormalParamsAssignment_1_111658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableStrategy_in_rule__Auxiliary__FormalParamsAssignment_1_2_111689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNonVariableStrategy_in_rule__Auxiliary__BodyAssignment_311720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__One__SAssignment_211751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__One__NAssignment_411782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__DeclaredStrategyInstance__DeclarationAssignment_111817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__DeclaredStrategyInstance__ActualParamsAssignment_3_011852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__DeclaredStrategyInstance__ActualParamsAssignment_3_1_111883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__Saturation__SAssignment_211914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Saturation__NAssignment_411945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__IfThenElse__S1Assignment_211976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__IfThenElse__S2Assignment_412007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__IfThenElse__S3Assignment_612038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRewriteRule_in_rule__SimpleStrategy__EquationsAssignment_112069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRewriteRule_in_rule__SimpleStrategy__EquationsAssignment_2_112100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSimpleStrategy_in_rule__Not__SAssignment_212131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__Fixpoint__SAssignment_212162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__Choice__S1Assignment_212193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__Choice__S2Assignment_412224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__Union__S1Assignment_212255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__Union__S2Assignment_412286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__Sequence__S1Assignment_212317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStrategy_in_rule__Sequence__S2Assignment_412348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__VariableStrategy__NameAssignment12379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ADT__NameAssignment_112410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignature_in_rule__ADT__SignatureAssignment_312441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEquation_in_rule__ADT__EquationsAssignment_4_112472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEquation_in_rule__ADT__EquationsAssignment_4_212503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__ADT__VariablesAssignment_5_112534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__ADT__VariablesAssignment_5_212565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleASort_in_rule__Signature__SortsAssignment_112596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleASort_in_rule__Signature__SortsAssignment_2_112627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_rule__Signature__GeneratorsAssignment_3_112658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_rule__Signature__GeneratorsAssignment_3_212689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_rule__Signature__OperationsAssignment_4_112720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_rule__Signature__OperationsAssignment_4_212751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_012782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__VariableDeclaration__SortAssignment_212817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleATerm_in_rule__Equation__LeftHandTermAssignment_012852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleATerm_in_rule__Equation__RightHandTermAssignment_212883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleATerm_in_rule__RewriteRule__LeftHandTermAssignment_012914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleATerm_in_rule__RewriteRule__RightHandTermAssignment_212945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__SubSort__NameAssignment_012976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__SubSort__SuperSortAssignment_213011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Sort__NameAssignment_113046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Term__OperationSymbolAssignment_113081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleATerm_in_rule__Term__SubtermsAssignment_2_113116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleATerm_in_rule__Term__SubtermsAssignment_2_2_113147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_TERMVAR_in_rule__Variable__DeclarationAssignment_113182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_013217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__FormalParametersAssignment_2_013252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__FormalParametersAssignment_2_1_113291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__ReturnTypeAssignment_313330 = new BitSet(new long[]{0x0000000000000002L});
    }


}