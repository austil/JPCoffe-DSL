package edu.imt.dsl.jpcoffe.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJPCoffeLexer extends Lexer {
    public static final int RULE_METRIC_UNIT=9;
    public static final int RULE_WORD=5;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_WS=12;
    public static final int RULE_MAJ_WORD=4;
    public static final int RULE_INT=8;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int RULE_TITLE_LINE=6;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalJPCoffeLexer() {;} 
    public InternalJPCoffeLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalJPCoffeLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalJPCoffe.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJPCoffe.g:11:7: ( 'Recipe' )
            // InternalJPCoffe.g:11:9: 'Recipe'
            {
            match("Recipe"); 


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
            // InternalJPCoffe.g:12:7: ( '{' )
            // InternalJPCoffe.g:12:9: '{'
            {
            match('{'); 

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
            // InternalJPCoffe.g:13:7: ( '}' )
            // InternalJPCoffe.g:13:9: '}'
            {
            match('}'); 

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
            // InternalJPCoffe.g:14:7: ( 'For' )
            // InternalJPCoffe.g:14:9: 'For'
            {
            match("For"); 


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
            // InternalJPCoffe.g:15:7: ( 'people' )
            // InternalJPCoffe.g:15:9: 'people'
            {
            match("people"); 


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
            // InternalJPCoffe.g:16:7: ( 'Ingredients' )
            // InternalJPCoffe.g:16:9: 'Ingredients'
            {
            match("Ingredients"); 


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
            // InternalJPCoffe.g:17:7: ( '*' )
            // InternalJPCoffe.g:17:9: '*'
            {
            match('*'); 

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
            // InternalJPCoffe.g:18:7: ( 'Tools' )
            // InternalJPCoffe.g:18:9: 'Tools'
            {
            match("Tools"); 


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
            // InternalJPCoffe.g:19:7: ( 'Steps' )
            // InternalJPCoffe.g:19:9: 'Steps'
            {
            match("Steps"); 


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
            // InternalJPCoffe.g:20:7: ( '->' )
            // InternalJPCoffe.g:20:9: '->'
            {
            match("->"); 


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
            // InternalJPCoffe.g:21:7: ( '.' )
            // InternalJPCoffe.g:21:9: '.'
            {
            match('.'); 

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
            // InternalJPCoffe.g:22:7: ( ',' )
            // InternalJPCoffe.g:22:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "RULE_METRIC_UNIT"
    public final void mRULE_METRIC_UNIT() throws RecognitionException {
        try {
            int _type = RULE_METRIC_UNIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJPCoffe.g:1784:18: ( ( 'gr' | 'kg' | 'cl' | 'l' ) )
            // InternalJPCoffe.g:1784:20: ( 'gr' | 'kg' | 'cl' | 'l' )
            {
            // InternalJPCoffe.g:1784:20: ( 'gr' | 'kg' | 'cl' | 'l' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 'g':
                {
                alt1=1;
                }
                break;
            case 'k':
                {
                alt1=2;
                }
                break;
            case 'c':
                {
                alt1=3;
                }
                break;
            case 'l':
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalJPCoffe.g:1784:21: 'gr'
                    {
                    match("gr"); 


                    }
                    break;
                case 2 :
                    // InternalJPCoffe.g:1784:26: 'kg'
                    {
                    match("kg"); 


                    }
                    break;
                case 3 :
                    // InternalJPCoffe.g:1784:31: 'cl'
                    {
                    match("cl"); 


                    }
                    break;
                case 4 :
                    // InternalJPCoffe.g:1784:36: 'l'
                    {
                    match('l'); 

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
    // $ANTLR end "RULE_METRIC_UNIT"

    // $ANTLR start "RULE_TITLE_LINE"
    public final void mRULE_TITLE_LINE() throws RecognitionException {
        try {
            int _type = RULE_TITLE_LINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJPCoffe.g:1786:17: ( ( '-' )+ )
            // InternalJPCoffe.g:1786:19: ( '-' )+
            {
            // InternalJPCoffe.g:1786:19: ( '-' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='-') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalJPCoffe.g:1786:19: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TITLE_LINE"

    // $ANTLR start "RULE_MAJ_WORD"
    public final void mRULE_MAJ_WORD() throws RecognitionException {
        try {
            int _type = RULE_MAJ_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJPCoffe.g:1788:15: ( 'A' .. 'Z' ( 'a' .. 'z' )* )
            // InternalJPCoffe.g:1788:17: 'A' .. 'Z' ( 'a' .. 'z' )*
            {
            matchRange('A','Z'); 
            // InternalJPCoffe.g:1788:26: ( 'a' .. 'z' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalJPCoffe.g:1788:27: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MAJ_WORD"

    // $ANTLR start "RULE_WORD"
    public final void mRULE_WORD() throws RecognitionException {
        try {
            int _type = RULE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJPCoffe.g:1790:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '\\'' | ',' )+ )
            // InternalJPCoffe.g:1790:13: ( 'a' .. 'z' | 'A' .. 'Z' | '\\'' | ',' )+
            {
            // InternalJPCoffe.g:1790:13: ( 'a' .. 'z' | 'A' .. 'Z' | '\\'' | ',' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\''||LA4_0==','||(LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalJPCoffe.g:
            	    {
            	    if ( input.LA(1)=='\''||input.LA(1)==','||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WORD"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJPCoffe.g:1792:10: ( ( '0' .. '9' )+ )
            // InternalJPCoffe.g:1792:12: ( '0' .. '9' )+
            {
            // InternalJPCoffe.g:1792:12: ( '0' .. '9' )+
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
            	    // InternalJPCoffe.g:1792:13: '0' .. '9'
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
            // InternalJPCoffe.g:1794:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalJPCoffe.g:1794:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalJPCoffe.g:1794:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalJPCoffe.g:1794:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalJPCoffe.g:1794:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalJPCoffe.g:1794:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalJPCoffe.g:1794:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalJPCoffe.g:1794:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalJPCoffe.g:1794:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalJPCoffe.g:1794:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalJPCoffe.g:1794:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalJPCoffe.g:1796:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalJPCoffe.g:1796:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalJPCoffe.g:1796:24: ( options {greedy=false; } : . )*
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
            	    // InternalJPCoffe.g:1796:52: .
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
            // InternalJPCoffe.g:1798:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalJPCoffe.g:1798:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalJPCoffe.g:1798:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalJPCoffe.g:1798:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalJPCoffe.g:1798:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalJPCoffe.g:1798:41: ( '\\r' )? '\\n'
                    {
                    // InternalJPCoffe.g:1798:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalJPCoffe.g:1798:41: '\\r'
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
            // InternalJPCoffe.g:1800:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalJPCoffe.g:1800:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalJPCoffe.g:1800:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalJPCoffe.g:
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

    public void mTokens() throws RecognitionException {
        // InternalJPCoffe.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | RULE_METRIC_UNIT | RULE_TITLE_LINE | RULE_MAJ_WORD | RULE_WORD | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt14=21;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalJPCoffe.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalJPCoffe.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalJPCoffe.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalJPCoffe.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalJPCoffe.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalJPCoffe.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalJPCoffe.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalJPCoffe.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalJPCoffe.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalJPCoffe.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalJPCoffe.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalJPCoffe.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalJPCoffe.g:1:82: RULE_METRIC_UNIT
                {
                mRULE_METRIC_UNIT(); 

                }
                break;
            case 14 :
                // InternalJPCoffe.g:1:99: RULE_TITLE_LINE
                {
                mRULE_TITLE_LINE(); 

                }
                break;
            case 15 :
                // InternalJPCoffe.g:1:115: RULE_MAJ_WORD
                {
                mRULE_MAJ_WORD(); 

                }
                break;
            case 16 :
                // InternalJPCoffe.g:1:129: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;
            case 17 :
                // InternalJPCoffe.g:1:139: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 18 :
                // InternalJPCoffe.g:1:148: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 19 :
                // InternalJPCoffe.g:1:160: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 20 :
                // InternalJPCoffe.g:1:176: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 21 :
                // InternalJPCoffe.g:1:192: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\31\2\uffff\1\31\1\25\1\31\1\uffff\2\31\1\41\1\uffff\1\42\3\25\1\46\1\31\1\25\5\uffff\1\31\1\uffff\2\31\1\25\3\31\3\uffff\3\46\1\uffff\1\25\3\uffff\1\31\1\62\1\25\4\31\1\uffff\1\25\4\31\1\25\1\31\1\77\1\100\1\101\1\102\1\31\4\uffff\4\31\1\110\1\uffff";
    static final String DFA14_eofS =
        "\111\uffff";
    static final String DFA14_minS =
        "\1\11\1\47\2\uffff\1\47\1\145\1\47\1\uffff\2\47\1\76\1\uffff\1\47\1\162\1\147\1\154\2\47\1\0\3\uffff\1\52\1\uffff\1\47\1\uffff\2\47\1\157\3\47\3\uffff\3\47\1\uffff\1\0\3\uffff\2\47\1\160\4\47\1\uffff\1\154\4\47\1\145\6\47\4\uffff\5\47\1\uffff";
    static final String DFA14_maxS =
        "\1\175\1\172\2\uffff\1\172\1\145\1\172\1\uffff\2\172\1\76\1\uffff\1\172\1\162\1\147\1\154\2\172\1\uffff\3\uffff\1\57\1\uffff\1\172\1\uffff\2\172\1\157\3\172\3\uffff\3\172\1\uffff\1\uffff\3\uffff\2\172\1\160\4\172\1\uffff\1\154\4\172\1\145\6\172\4\uffff\5\172\1\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\3\3\uffff\1\7\3\uffff\1\13\7\uffff\1\21\1\22\1\20\1\uffff\1\25\1\uffff\1\17\6\uffff\1\12\1\16\1\14\3\uffff\1\15\1\uffff\1\20\1\23\1\24\7\uffff\1\4\14\uffff\1\10\1\11\1\1\1\5\5\uffff\1\6";
    static final String DFA14_specialS =
        "\22\uffff\1\0\24\uffff\1\1\41\uffff}>";
    static final String[] DFA14_transitionS = {
            "\2\27\2\uffff\1\27\22\uffff\1\27\1\uffff\1\24\4\uffff\1\22\2\uffff\1\7\1\uffff\1\14\1\12\1\13\1\26\12\23\7\uffff\5\21\1\4\2\21\1\6\10\21\1\1\1\11\1\10\6\21\6\uffff\2\25\1\17\3\25\1\15\3\25\1\16\1\20\3\25\1\5\12\25\1\2\1\uffff\1\3",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\4\32\1\30\25\32",
            "",
            "",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\16\32\1\33\13\32",
            "\1\34",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\15\32\1\35\14\32",
            "",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\16\32\1\36\13\32",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\23\32\1\37\6\32",
            "\1\40",
            "",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\32\25",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\32\25",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\32\32",
            "\47\24\1\50\4\24\1\47\24\24\32\47\6\24\32\47\uff85\24",
            "",
            "",
            "",
            "\1\51\4\uffff\1\52",
            "",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\2\32\1\53\27\32",
            "",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\32\32",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\21\32\1\54\10\32",
            "\1\55",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\6\32\1\56\23\32",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\16\32\1\57\13\32",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\4\32\1\60\25\32",
            "",
            "",
            "",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\32\25",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\32\25",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\32\25",
            "",
            "\47\24\1\50\4\24\1\47\24\24\32\47\6\24\32\47\uff85\24",
            "",
            "",
            "",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\10\32\1\61\21\32",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\32\32",
            "\1\63",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\21\32\1\64\10\32",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\13\32\1\65\16\32",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\17\32\1\66\12\32",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\17\32\1\67\12\32",
            "",
            "\1\70",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\4\32\1\71\25\32",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\22\32\1\72\7\32",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\22\32\1\73\7\32",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\4\32\1\74\25\32",
            "\1\75",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\3\32\1\76\26\32",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\32\32",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\32\32",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\32\32",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\32\25",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\10\32\1\103\21\32",
            "",
            "",
            "",
            "",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\4\32\1\104\25\32",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\15\32\1\105\14\32",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\23\32\1\106\6\32",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\22\32\1\107\7\32",
            "\1\25\4\uffff\1\25\24\uffff\32\25\6\uffff\32\32",
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

    class DFA14 extends DFA {

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
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | RULE_METRIC_UNIT | RULE_TITLE_LINE | RULE_MAJ_WORD | RULE_WORD | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_18 = input.LA(1);

                        s = -1;
                        if ( (LA14_18==','||(LA14_18>='A' && LA14_18<='Z')||(LA14_18>='a' && LA14_18<='z')) ) {s = 39;}

                        else if ( ((LA14_18>='\u0000' && LA14_18<='&')||(LA14_18>='(' && LA14_18<='+')||(LA14_18>='-' && LA14_18<='@')||(LA14_18>='[' && LA14_18<='`')||(LA14_18>='{' && LA14_18<='\uFFFF')) ) {s = 20;}

                        else if ( (LA14_18=='\'') ) {s = 40;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_39 = input.LA(1);

                        s = -1;
                        if ( (LA14_39=='\'') ) {s = 40;}

                        else if ( (LA14_39==','||(LA14_39>='A' && LA14_39<='Z')||(LA14_39>='a' && LA14_39<='z')) ) {s = 39;}

                        else if ( ((LA14_39>='\u0000' && LA14_39<='&')||(LA14_39>='(' && LA14_39<='+')||(LA14_39>='-' && LA14_39<='@')||(LA14_39>='[' && LA14_39<='`')||(LA14_39>='{' && LA14_39<='\uFFFF')) ) {s = 20;}

                        else s = 21;

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