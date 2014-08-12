package ch.unige.cui.smv.stratagem.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTransitionSystemDslLexer extends Lexer {
    public static final int T__40=40;
    public static final int RULE_ID=4;
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
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int T__15=15;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__35=35;
    public static final int T__17=17;
    public static final int T__36=36;
    public static final int T__12=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__14=14;
    public static final int T__39=39;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=10;

    // delegates
    // delegators

    public InternalTransitionSystemDslLexer() {;} 
    public InternalTransitionSystemDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTransitionSystemDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:11:7: ( 'TransitionSystem' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:11:9: 'TransitionSystem'
            {
            match("TransitionSystem"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:12:7: ( 'initialState' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:12:9: 'initialState'
            {
            match("initialState"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:13:7: ( '=' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:13:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:14:7: ( 'Strategies' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:14:9: 'Strategies'
            {
            match("Strategies"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:15:7: ( 'Transitions' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:15:9: 'Transitions'
            {
            match("Transitions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:16:7: ( '(' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:16:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:17:7: ( ',' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:17:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:18:7: ( ')' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:18:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:19:7: ( 'One' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:19:9: 'One'
            {
            match("One"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:20:7: ( 'Saturation' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:20:9: 'Saturation'
            {
            match("Saturation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:21:7: ( 'IfThenElse' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:21:9: 'IfThenElse'
            {
            match("IfThenElse"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:22:7: ( '{' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:22:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:23:7: ( '}' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:23:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:24:7: ( 'Not' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:24:9: 'Not'
            {
            match("Not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:25:7: ( 'Fixpoint' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:25:9: 'Fixpoint'
            {
            match("Fixpoint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:26:7: ( 'Choice' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:26:9: 'Choice'
            {
            match("Choice"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:27:7: ( 'Union' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:27:9: 'Union'
            {
            match("Union"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:28:7: ( 'Sequence' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:28:9: 'Sequence'
            {
            match("Sequence"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:29:7: ( 'Identity' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:29:9: 'Identity'
            {
            match("Identity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:30:7: ( 'Fail' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:30:9: 'Fail'
            {
            match("Fail"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:31:7: ( 'ADT' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:31:9: 'ADT'
            {
            match("ADT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:32:7: ( 'Signature' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:32:9: 'Signature'
            {
            match("Signature"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:33:7: ( 'Axioms' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:33:9: 'Axioms'
            {
            match("Axioms"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:34:7: ( 'Variables' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:34:9: 'Variables'
            {
            match("Variables"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:35:7: ( 'Sorts' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:35:9: 'Sorts'
            {
            match("Sorts"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:36:7: ( 'Generators' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:36:9: 'Generators'
            {
            match("Generators"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:37:7: ( 'Operations' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:37:9: 'Operations'
            {
            match("Operations"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:38:7: ( ':' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:38:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:39:7: ( '->' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:39:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:40:7: ( '<' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:40:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "RULE_TERMVAR"
    public final void mRULE_TERMVAR() throws RecognitionException {
        try {
            int _type = RULE_TERMVAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2283:14: ( '$' ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2283:16: '$' ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            match('$'); 
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2283:20: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2283:20: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2283:49: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TERMVAR"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2285:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2285:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2285:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2285:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2285:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2287:10: ( ( '0' .. '9' )+ )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2287:12: ( '0' .. '9' )+
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2287:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2287:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2289:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2289:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2289:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2289:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2289:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2289:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2289:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2289:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2289:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2289:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2289:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2291:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2291:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2291:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2291:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2293:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2293:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2293:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2293:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2293:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2293:41: ( '\\r' )? '\\n'
                    {
                    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2293:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2293:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2295:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2295:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2295:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2297:16: ( . )
            // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:2297:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_TERMVAR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=38;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:190: RULE_TERMVAR
                {
                mRULE_TERMVAR(); 

                }
                break;
            case 32 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:203: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 33 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:211: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 34 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:220: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 35 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:232: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 36 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:248: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 37 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:264: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 38 :
                // ../ch.unige.cui.smv.stratagem.xtext.ts/src-gen/ch/unige/cui/smv/stratagem/xtext/parser/antlr/internal/InternalTransitionSystemDsl.g:1:272: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\2\40\1\uffff\1\40\3\uffff\2\40\2\uffff\7\40\1\uffff\1\36"+
        "\1\uffff\2\36\2\uffff\3\36\2\uffff\1\40\1\uffff\1\40\1\uffff\5\40"+
        "\3\uffff\4\40\2\uffff\11\40\11\uffff\7\40\1\136\3\40\1\142\4\40"+
        "\1\147\12\40\1\uffff\3\40\1\uffff\1\40\1\166\2\40\1\uffff\11\40"+
        "\1\u0082\4\40\1\uffff\1\40\1\u0088\11\40\1\uffff\4\40\1\u0096\1"+
        "\uffff\1\u0097\14\40\2\uffff\6\40\1\u00aa\3\40\1\u00ae\1\u00af\6"+
        "\40\1\uffff\1\u00b6\2\40\2\uffff\1\u00b9\3\40\1\u00be\1\u00bf\1"+
        "\uffff\1\u00c0\1\u00c1\1\uffff\1\u00c2\1\40\1\u00c4\1\40\5\uffff"+
        "\1\40\1\uffff\1\u00c7\1\40\1\uffff\2\40\1\u00cb\1\uffff";
    static final String DFA14_eofS =
        "\u00cc\uffff";
    static final String DFA14_minS =
        "\1\0\1\162\1\156\1\uffff\1\141\3\uffff\1\156\1\144\2\uffff\1\157"+
        "\1\141\1\150\1\156\1\104\1\141\1\145\1\uffff\1\76\1\uffff\2\101"+
        "\2\uffff\2\0\1\52\2\uffff\1\141\1\uffff\1\151\1\uffff\1\162\1\164"+
        "\1\161\1\147\1\162\3\uffff\2\145\1\124\1\145\2\uffff\1\164\1\170"+
        "\1\151\1\157\1\151\1\124\1\151\1\162\1\156\11\uffff\1\156\1\164"+
        "\1\141\2\165\1\156\1\164\1\60\1\162\1\150\1\156\1\60\1\160\1\154"+
        "\1\151\1\157\1\60\1\157\1\151\1\145\1\163\1\151\1\164\1\162\1\145"+
        "\1\141\1\163\1\uffff\1\141\1\145\1\164\1\uffff\1\157\1\60\1\143"+
        "\1\156\1\uffff\1\155\1\141\1\162\1\151\1\141\1\145\1\141\1\156\1"+
        "\164\1\60\1\164\1\156\2\151\1\uffff\1\145\1\60\1\163\1\142\1\141"+
        "\1\164\1\154\1\147\1\164\1\143\1\165\1\uffff\1\151\1\105\1\164\1"+
        "\156\1\60\1\uffff\1\60\1\154\1\164\1\151\1\123\2\151\1\145\1\162"+
        "\1\157\1\154\1\171\1\164\2\uffff\1\145\2\157\1\164\1\145\1\157\1"+
        "\60\1\145\1\156\1\163\2\60\1\163\1\162\1\156\1\141\1\163\1\156\1"+
        "\uffff\1\60\1\163\1\145\2\uffff\1\60\1\163\1\123\1\164\2\60\1\uffff"+
        "\2\60\1\uffff\1\60\1\171\1\60\1\145\5\uffff\1\163\1\uffff\1\60\1"+
        "\164\1\uffff\1\145\1\155\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\162\1\156\1\uffff\1\164\3\uffff\1\160\1\146\2\uffff\1"+
        "\157\1\151\1\150\1\156\1\170\1\141\1\145\1\uffff\1\76\1\uffff\2"+
        "\172\2\uffff\2\uffff\1\57\2\uffff\1\141\1\uffff\1\151\1\uffff\1"+
        "\162\1\164\1\161\1\147\1\162\3\uffff\2\145\1\124\1\145\2\uffff\1"+
        "\164\1\170\1\151\1\157\1\151\1\124\1\151\1\162\1\156\11\uffff\1"+
        "\156\1\164\1\141\2\165\1\156\1\164\1\172\1\162\1\150\1\156\1\172"+
        "\1\160\1\154\1\151\1\157\1\172\1\157\1\151\1\145\1\163\1\151\1\164"+
        "\1\162\1\145\1\141\1\163\1\uffff\1\141\1\145\1\164\1\uffff\1\157"+
        "\1\172\1\143\1\156\1\uffff\1\155\1\141\1\162\1\151\1\141\1\145\1"+
        "\141\1\156\1\164\1\172\1\164\1\156\2\151\1\uffff\1\145\1\172\1\163"+
        "\1\142\1\141\1\164\1\154\1\147\1\164\1\143\1\165\1\uffff\1\151\1"+
        "\105\1\164\1\156\1\172\1\uffff\1\172\1\154\1\164\1\151\1\123\2\151"+
        "\1\145\1\162\1\157\1\154\1\171\1\164\2\uffff\1\145\2\157\1\164\1"+
        "\145\1\157\1\172\1\145\1\156\1\163\2\172\1\163\1\162\1\156\1\141"+
        "\1\163\1\156\1\uffff\1\172\1\163\1\145\2\uffff\1\172\2\163\1\164"+
        "\2\172\1\uffff\2\172\1\uffff\1\172\1\171\1\172\1\145\5\uffff\1\163"+
        "\1\uffff\1\172\1\164\1\uffff\1\145\1\155\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\3\uffff\1\3\1\uffff\1\6\1\7\1\10\2\uffff\1\14\1\15\7\uffff\1\34"+
        "\1\uffff\1\36\2\uffff\1\40\1\41\3\uffff\1\45\1\46\1\uffff\1\40\1"+
        "\uffff\1\3\5\uffff\1\6\1\7\1\10\4\uffff\1\14\1\15\11\uffff\1\34"+
        "\1\35\1\36\1\37\1\41\1\42\1\43\1\44\1\45\33\uffff\1\11\3\uffff\1"+
        "\16\4\uffff\1\25\16\uffff\1\24\13\uffff\1\31\5\uffff\1\21\15\uffff"+
        "\1\20\1\27\22\uffff\1\22\3\uffff\1\23\1\17\6\uffff\1\26\2\uffff"+
        "\1\30\4\uffff\1\4\1\12\1\33\1\13\1\32\1\uffff\1\5\2\uffff\1\2\3"+
        "\uffff\1\1";
    static final String DFA14_specialS =
        "\1\1\31\uffff\1\0\1\2\u00b0\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\36\2\35\2\36\1\35\22\36\1\35\1\36\1\32\1\36\1\26\2\36\1"+
            "\33\1\5\1\7\2\36\1\6\1\24\1\36\1\34\12\31\1\23\1\36\1\25\1\3"+
            "\3\36\1\20\1\30\1\16\2\30\1\15\1\22\1\30\1\11\4\30\1\14\1\10"+
            "\3\30\1\4\1\1\1\17\1\21\4\30\3\36\1\27\1\30\1\36\10\30\1\2\21"+
            "\30\1\12\1\36\1\13\uff82\36",
            "\1\37",
            "\1\41",
            "",
            "\1\44\3\uffff\1\45\3\uffff\1\46\5\uffff\1\47\4\uffff\1\43",
            "",
            "",
            "",
            "\1\53\1\uffff\1\54",
            "\1\56\1\uffff\1\55",
            "",
            "",
            "\1\61",
            "\1\63\7\uffff\1\62",
            "\1\64",
            "\1\65",
            "\1\66\63\uffff\1\67",
            "\1\70",
            "\1\71",
            "",
            "\1\73",
            "",
            "\32\75\3\uffff\2\75\1\uffff\32\75",
            "\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\0\77",
            "\0\77",
            "\1\100\4\uffff\1\101",
            "",
            "",
            "\1\103",
            "",
            "\1\104",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\137",
            "\1\140",
            "\1\141",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "",
            "\1\165",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\167",
            "\1\170",
            "",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "",
            "\1\u0087",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00b7",
            "\1\u00b8",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00ba",
            "\1\u00bb\37\uffff\1\u00bc",
            "\1\u00bd",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00c3",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00c5",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c6",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00c8",
            "",
            "\1\u00c9",
            "\1\u00ca",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    static class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_TERMVAR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_26 = input.LA(1);

                        s = -1;
                        if ( ((LA14_26>='\u0000' && LA14_26<='\uFFFF')) ) {s = 63;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='T') ) {s = 1;}

                        else if ( (LA14_0=='i') ) {s = 2;}

                        else if ( (LA14_0=='=') ) {s = 3;}

                        else if ( (LA14_0=='S') ) {s = 4;}

                        else if ( (LA14_0=='(') ) {s = 5;}

                        else if ( (LA14_0==',') ) {s = 6;}

                        else if ( (LA14_0==')') ) {s = 7;}

                        else if ( (LA14_0=='O') ) {s = 8;}

                        else if ( (LA14_0=='I') ) {s = 9;}

                        else if ( (LA14_0=='{') ) {s = 10;}

                        else if ( (LA14_0=='}') ) {s = 11;}

                        else if ( (LA14_0=='N') ) {s = 12;}

                        else if ( (LA14_0=='F') ) {s = 13;}

                        else if ( (LA14_0=='C') ) {s = 14;}

                        else if ( (LA14_0=='U') ) {s = 15;}

                        else if ( (LA14_0=='A') ) {s = 16;}

                        else if ( (LA14_0=='V') ) {s = 17;}

                        else if ( (LA14_0=='G') ) {s = 18;}

                        else if ( (LA14_0==':') ) {s = 19;}

                        else if ( (LA14_0=='-') ) {s = 20;}

                        else if ( (LA14_0=='<') ) {s = 21;}

                        else if ( (LA14_0=='$') ) {s = 22;}

                        else if ( (LA14_0=='^') ) {s = 23;}

                        else if ( (LA14_0=='B'||(LA14_0>='D' && LA14_0<='E')||LA14_0=='H'||(LA14_0>='J' && LA14_0<='M')||(LA14_0>='P' && LA14_0<='R')||(LA14_0>='W' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='z')) ) {s = 24;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 25;}

                        else if ( (LA14_0=='\"') ) {s = 26;}

                        else if ( (LA14_0=='\'') ) {s = 27;}

                        else if ( (LA14_0=='/') ) {s = 28;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 29;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||LA14_0=='#'||(LA14_0>='%' && LA14_0<='&')||(LA14_0>='*' && LA14_0<='+')||LA14_0=='.'||LA14_0==';'||(LA14_0>='>' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_27 = input.LA(1);

                        s = -1;
                        if ( ((LA14_27>='\u0000' && LA14_27<='\uFFFF')) ) {s = 63;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}