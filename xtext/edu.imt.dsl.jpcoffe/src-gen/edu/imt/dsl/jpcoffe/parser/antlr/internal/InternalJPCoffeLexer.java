package edu.imt.dsl.jpcoffe.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJPCoffeLexer extends Lexer {
    public static final int RULE_METRIC_UNIT=10;
    public static final int RULE_NAME=9;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_SPACE=8;
    public static final int EOF=-1;
    public static final int RULE_ID=12;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_NEW_LINE=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int RULE_TITLE_LINE=7;
    public static final int RULE_TEXT=11;
    public static final int T__24=24;
    public static final int T__25=25;
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

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJPCoffe.g:20:7: ( ',' )
            // InternalJPCoffe.g:20:9: ','
            {
            match(','); 

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
            // InternalJPCoffe.g:21:7: ( '->' )
            // InternalJPCoffe.g:21:9: '->'
            {
            match("->"); 


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
            // InternalJPCoffe.g:22:7: ( '.' )
            // InternalJPCoffe.g:22:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "RULE_METRIC_UNIT"
    public final void mRULE_METRIC_UNIT() throws RecognitionException {
        try {
            int _type = RULE_METRIC_UNIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJPCoffe.g:641:18: ( ( 'gr' | 'kg' | 'cl' | 'l' ) )
            // InternalJPCoffe.g:641:20: ( 'gr' | 'kg' | 'cl' | 'l' )
            {
            // InternalJPCoffe.g:641:20: ( 'gr' | 'kg' | 'cl' | 'l' )
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
                    // InternalJPCoffe.g:641:21: 'gr'
                    {
                    match("gr"); 


                    }
                    break;
                case 2 :
                    // InternalJPCoffe.g:641:26: 'kg'
                    {
                    match("kg"); 


                    }
                    break;
                case 3 :
                    // InternalJPCoffe.g:641:31: 'cl'
                    {
                    match("cl"); 


                    }
                    break;
                case 4 :
                    // InternalJPCoffe.g:641:36: 'l'
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
            // InternalJPCoffe.g:643:17: ( ( '-' )+ )
            // InternalJPCoffe.g:643:19: ( '-' )+
            {
            // InternalJPCoffe.g:643:19: ( '-' )+
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
            	    // InternalJPCoffe.g:643:19: '-'
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

    // $ANTLR start "RULE_NAME"
    public final void mRULE_NAME() throws RecognitionException {
        try {
            int _type = RULE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJPCoffe.g:645:11: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | RULE_SPACE )* )
            // InternalJPCoffe.g:645:13: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | RULE_SPACE )*
            {
            matchRange('A','Z'); 
            // InternalJPCoffe.g:645:22: ( 'a' .. 'z' | 'A' .. 'Z' | RULE_SPACE )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==' '||(LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalJPCoffe.g:
            	    {
            	    if ( input.LA(1)==' '||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
    // $ANTLR end "RULE_NAME"

    // $ANTLR start "RULE_NEW_LINE"
    public final void mRULE_NEW_LINE() throws RecognitionException {
        try {
            int _type = RULE_NEW_LINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJPCoffe.g:647:15: ( ( '\\n' | '\\r\\n' ) )
            // InternalJPCoffe.g:647:17: ( '\\n' | '\\r\\n' )
            {
            // InternalJPCoffe.g:647:17: ( '\\n' | '\\r\\n' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\n') ) {
                alt4=1;
            }
            else if ( (LA4_0=='\r') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalJPCoffe.g:647:18: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 2 :
                    // InternalJPCoffe.g:647:23: '\\r\\n'
                    {
                    match("\r\n"); 


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
    // $ANTLR end "RULE_NEW_LINE"

    // $ANTLR start "RULE_SPACE"
    public final void mRULE_SPACE() throws RecognitionException {
        try {
            int _type = RULE_SPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJPCoffe.g:649:12: ( ' ' )
            // InternalJPCoffe.g:649:14: ' '
            {
            match(' '); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SPACE"

    // $ANTLR start "RULE_TEXT"
    public final void mRULE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJPCoffe.g:651:11: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // InternalJPCoffe.g:651:13: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // InternalJPCoffe.g:651:13: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='A' && LA5_0<='Z')||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalJPCoffe.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
    // $ANTLR end "RULE_TEXT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJPCoffe.g:653:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalJPCoffe.g:653:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalJPCoffe.g:653:11: ( '^' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='^') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalJPCoffe.g:653:11: '^'
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

            // InternalJPCoffe.g:653:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalJPCoffe.g:
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
            	    break loop7;
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
            // InternalJPCoffe.g:655:10: ( ( '0' .. '9' )+ )
            // InternalJPCoffe.g:655:12: ( '0' .. '9' )+
            {
            // InternalJPCoffe.g:655:12: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalJPCoffe.g:655:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
            // InternalJPCoffe.g:657:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalJPCoffe.g:657:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalJPCoffe.g:657:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalJPCoffe.g:657:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalJPCoffe.g:657:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalJPCoffe.g:657:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalJPCoffe.g:657:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop9;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalJPCoffe.g:657:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalJPCoffe.g:657:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalJPCoffe.g:657:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalJPCoffe.g:657:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop10;
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
            // InternalJPCoffe.g:659:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalJPCoffe.g:659:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalJPCoffe.g:659:24: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalJPCoffe.g:659:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
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
            // InternalJPCoffe.g:661:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalJPCoffe.g:661:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalJPCoffe.g:661:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalJPCoffe.g:661:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop13;
                }
            } while (true);

            // InternalJPCoffe.g:661:40: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalJPCoffe.g:661:41: ( '\\r' )? '\\n'
                    {
                    // InternalJPCoffe.g:661:41: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalJPCoffe.g:661:41: '\\r'
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
            // InternalJPCoffe.g:663:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalJPCoffe.g:663:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalJPCoffe.g:663:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
            // InternalJPCoffe.g:665:16: ( . )
            // InternalJPCoffe.g:665:18: .
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
        // InternalJPCoffe.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | RULE_METRIC_UNIT | RULE_TITLE_LINE | RULE_NAME | RULE_NEW_LINE | RULE_SPACE | RULE_TEXT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt17=25;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalJPCoffe.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalJPCoffe.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalJPCoffe.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalJPCoffe.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalJPCoffe.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalJPCoffe.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // InternalJPCoffe.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // InternalJPCoffe.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // InternalJPCoffe.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // InternalJPCoffe.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // InternalJPCoffe.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // InternalJPCoffe.g:1:76: T__28
                {
                mT__28(); 

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
                // InternalJPCoffe.g:1:115: RULE_NAME
                {
                mRULE_NAME(); 

                }
                break;
            case 16 :
                // InternalJPCoffe.g:1:125: RULE_NEW_LINE
                {
                mRULE_NEW_LINE(); 

                }
                break;
            case 17 :
                // InternalJPCoffe.g:1:139: RULE_SPACE
                {
                mRULE_SPACE(); 

                }
                break;
            case 18 :
                // InternalJPCoffe.g:1:150: RULE_TEXT
                {
                mRULE_TEXT(); 

                }
                break;
            case 19 :
                // InternalJPCoffe.g:1:160: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 20 :
                // InternalJPCoffe.g:1:168: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 21 :
                // InternalJPCoffe.g:1:177: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 22 :
                // InternalJPCoffe.g:1:189: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 23 :
                // InternalJPCoffe.g:1:205: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 24 :
                // InternalJPCoffe.g:1:221: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 25 :
                // InternalJPCoffe.g:1:229: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\1\uffff\1\40\2\uffff\1\40\1\46\1\40\1\uffff\2\40\1\uffff\1\56\1\uffff\3\46\1\63\1\40\1\64\1\65\1\67\1\46\1\35\2\uffff\3\35\2\uffff\2\40\4\uffff\1\40\1\46\1\uffff\1\46\1\40\1\uffff\2\40\4\uffff\3\63\3\uffff\1\64\5\uffff\1\40\1\103\1\46\4\40\1\uffff\1\46\4\40\1\46\1\40\1\120\1\121\1\122\1\123\1\40\4\uffff\4\40\1\131\1\uffff";
    static final String DFA17_eofS =
        "\132\uffff";
    static final String DFA17_minS =
        "\1\0\1\60\2\uffff\3\60\1\uffff\2\60\1\uffff\1\76\1\uffff\5\60\1\11\1\12\1\11\1\60\1\101\2\uffff\2\0\1\52\2\uffff\2\60\4\uffff\2\60\1\uffff\2\60\1\uffff\2\60\4\uffff\3\60\3\uffff\1\11\5\uffff\1\60\1\40\5\60\1\uffff\7\60\3\40\2\60\4\uffff\4\60\1\40\1\uffff";
    static final String DFA17_maxS =
        "\1\uffff\1\172\2\uffff\3\172\1\uffff\2\172\1\uffff\1\76\1\uffff\5\172\1\40\1\12\1\40\2\172\2\uffff\2\uffff\1\57\2\uffff\2\172\4\uffff\2\172\1\uffff\2\172\1\uffff\2\172\4\uffff\3\172\3\uffff\1\40\5\uffff\7\172\1\uffff\14\172\4\uffff\5\172\1\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\1\3\3\uffff\1\7\2\uffff\1\12\1\uffff\1\14\12\uffff\1\23\1\24\3\uffff\1\30\1\31\2\uffff\1\17\1\23\1\2\1\3\2\uffff\1\22\2\uffff\1\7\2\uffff\1\12\1\13\1\16\1\14\3\uffff\1\15\1\20\1\30\1\uffff\1\21\1\24\1\25\1\26\1\27\7\uffff\1\4\14\uffff\1\10\1\11\1\1\1\5\5\uffff\1\6";
    static final String DFA17_specialS =
        "\1\1\30\uffff\1\2\1\0\77\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\35\1\34\1\22\2\35\1\23\22\35\1\24\1\35\1\31\4\35\1\32\2\35\1\7\1\35\1\12\1\13\1\14\1\33\12\30\7\35\5\21\1\4\2\21\1\6\10\21\1\1\1\11\1\10\6\21\3\35\1\26\1\27\1\35\2\25\1\17\3\25\1\15\3\25\1\16\1\20\3\25\1\5\12\25\1\2\1\35\1\3\uff82\35",
            "\12\41\7\uffff\32\37\4\uffff\1\41\1\uffff\4\37\1\36\25\37",
            "",
            "",
            "\12\41\7\uffff\32\37\4\uffff\1\41\1\uffff\16\37\1\44\13\37",
            "\12\41\7\uffff\32\47\4\uffff\1\41\1\uffff\4\47\1\45\25\47",
            "\12\41\7\uffff\32\37\4\uffff\1\41\1\uffff\15\37\1\50\14\37",
            "",
            "\12\41\7\uffff\32\37\4\uffff\1\41\1\uffff\16\37\1\52\13\37",
            "\12\41\7\uffff\32\37\4\uffff\1\41\1\uffff\23\37\1\53\6\37",
            "",
            "\1\55",
            "",
            "\12\41\7\uffff\32\47\4\uffff\1\41\1\uffff\21\47\1\60\10\47",
            "\12\41\7\uffff\32\47\4\uffff\1\41\1\uffff\6\47\1\61\23\47",
            "\12\41\7\uffff\32\47\4\uffff\1\41\1\uffff\13\47\1\62\16\47",
            "\12\41\7\uffff\32\47\4\uffff\1\41\1\uffff\32\47",
            "\12\41\7\uffff\32\37\4\uffff\1\41\1\uffff\32\37",
            "\2\65\2\uffff\1\65\22\uffff\1\65",
            "\1\66",
            "\2\65\2\uffff\1\65\22\uffff\1\65",
            "\12\41\7\uffff\32\47\4\uffff\1\41\1\uffff\32\47",
            "\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\0\71",
            "\0\71",
            "\1\72\4\uffff\1\73",
            "",
            "",
            "\12\41\7\uffff\32\37\4\uffff\1\41\1\uffff\2\37\1\74\27\37",
            "\12\41\7\uffff\32\37\4\uffff\1\41\1\uffff\32\37",
            "",
            "",
            "",
            "",
            "\12\41\7\uffff\32\37\4\uffff\1\41\1\uffff\21\37\1\75\10\37",
            "\12\41\7\uffff\32\47\4\uffff\1\41\1\uffff\16\47\1\76\13\47",
            "",
            "\12\41\7\uffff\32\47\4\uffff\1\41\1\uffff\32\47",
            "\12\41\7\uffff\32\37\4\uffff\1\41\1\uffff\6\37\1\77\23\37",
            "",
            "\12\41\7\uffff\32\37\4\uffff\1\41\1\uffff\16\37\1\100\13\37",
            "\12\41\7\uffff\32\37\4\uffff\1\41\1\uffff\4\37\1\101\25\37",
            "",
            "",
            "",
            "",
            "\12\41\7\uffff\32\47\4\uffff\1\41\1\uffff\32\47",
            "\12\41\7\uffff\32\47\4\uffff\1\41\1\uffff\32\47",
            "\12\41\7\uffff\32\47\4\uffff\1\41\1\uffff\32\47",
            "",
            "",
            "",
            "\2\65\2\uffff\1\65\22\uffff\1\65",
            "",
            "",
            "",
            "",
            "",
            "\12\41\7\uffff\32\37\4\uffff\1\41\1\uffff\10\37\1\102\21\37",
            "\1\40\17\uffff\12\41\7\uffff\32\37\4\uffff\1\41\1\uffff\32\37",
            "\12\41\7\uffff\32\47\4\uffff\1\41\1\uffff\17\47\1\104\12\47",
            "\12\41\7\uffff\32\37\4\uffff\1\41\1\uffff\21\37\1\105\10\37",
            "\12\41\7\uffff\32\37\4\uffff\1\41\1\uffff\13\37\1\106\16\37",
            "\12\41\7\uffff\32\37\4\uffff\1\41\1\uffff\17\37\1\107\12\37",
            "\12\41\7\uffff\32\37\4\uffff\1\41\1\uffff\17\37\1\110\12\37",
            "",
            "\12\41\7\uffff\32\47\4\uffff\1\41\1\uffff\13\47\1\111\16\47",
            "\12\41\7\uffff\32\37\4\uffff\1\41\1\uffff\4\37\1\112\25\37",
            "\12\41\7\uffff\32\37\4\uffff\1\41\1\uffff\22\37\1\113\7\37",
            "\12\41\7\uffff\32\37\4\uffff\1\41\1\uffff\22\37\1\114\7\37",
            "\12\41\7\uffff\32\37\4\uffff\1\41\1\uffff\4\37\1\115\25\37",
            "\12\41\7\uffff\32\47\4\uffff\1\41\1\uffff\4\47\1\116\25\47",
            "\12\41\7\uffff\32\37\4\uffff\1\41\1\uffff\3\37\1\117\26\37",
            "\1\40\17\uffff\12\41\7\uffff\32\37\4\uffff\1\41\1\uffff\32\37",
            "\1\40\17\uffff\12\41\7\uffff\32\37\4\uffff\1\41\1\uffff\32\37",
            "\1\40\17\uffff\12\41\7\uffff\32\37\4\uffff\1\41\1\uffff\32\37",
            "\12\41\7\uffff\32\47\4\uffff\1\41\1\uffff\32\47",
            "\12\41\7\uffff\32\37\4\uffff\1\41\1\uffff\10\37\1\124\21\37",
            "",
            "",
            "",
            "",
            "\12\41\7\uffff\32\37\4\uffff\1\41\1\uffff\4\37\1\125\25\37",
            "\12\41\7\uffff\32\37\4\uffff\1\41\1\uffff\15\37\1\126\14\37",
            "\12\41\7\uffff\32\37\4\uffff\1\41\1\uffff\23\37\1\127\6\37",
            "\12\41\7\uffff\32\37\4\uffff\1\41\1\uffff\22\37\1\130\7\37",
            "\1\40\17\uffff\12\41\7\uffff\32\37\4\uffff\1\41\1\uffff\32\37",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | RULE_METRIC_UNIT | RULE_TITLE_LINE | RULE_NAME | RULE_NEW_LINE | RULE_SPACE | RULE_TEXT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_26 = input.LA(1);

                        s = -1;
                        if ( ((LA17_26>='\u0000' && LA17_26<='\uFFFF')) ) {s = 57;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='R') ) {s = 1;}

                        else if ( (LA17_0=='{') ) {s = 2;}

                        else if ( (LA17_0=='}') ) {s = 3;}

                        else if ( (LA17_0=='F') ) {s = 4;}

                        else if ( (LA17_0=='p') ) {s = 5;}

                        else if ( (LA17_0=='I') ) {s = 6;}

                        else if ( (LA17_0=='*') ) {s = 7;}

                        else if ( (LA17_0=='T') ) {s = 8;}

                        else if ( (LA17_0=='S') ) {s = 9;}

                        else if ( (LA17_0==',') ) {s = 10;}

                        else if ( (LA17_0=='-') ) {s = 11;}

                        else if ( (LA17_0=='.') ) {s = 12;}

                        else if ( (LA17_0=='g') ) {s = 13;}

                        else if ( (LA17_0=='k') ) {s = 14;}

                        else if ( (LA17_0=='c') ) {s = 15;}

                        else if ( (LA17_0=='l') ) {s = 16;}

                        else if ( ((LA17_0>='A' && LA17_0<='E')||(LA17_0>='G' && LA17_0<='H')||(LA17_0>='J' && LA17_0<='Q')||(LA17_0>='U' && LA17_0<='Z')) ) {s = 17;}

                        else if ( (LA17_0=='\n') ) {s = 18;}

                        else if ( (LA17_0=='\r') ) {s = 19;}

                        else if ( (LA17_0==' ') ) {s = 20;}

                        else if ( ((LA17_0>='a' && LA17_0<='b')||(LA17_0>='d' && LA17_0<='f')||(LA17_0>='h' && LA17_0<='j')||(LA17_0>='m' && LA17_0<='o')||(LA17_0>='q' && LA17_0<='z')) ) {s = 21;}

                        else if ( (LA17_0=='^') ) {s = 22;}

                        else if ( (LA17_0=='_') ) {s = 23;}

                        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {s = 24;}

                        else if ( (LA17_0=='\"') ) {s = 25;}

                        else if ( (LA17_0=='\'') ) {s = 26;}

                        else if ( (LA17_0=='/') ) {s = 27;}

                        else if ( (LA17_0=='\t') ) {s = 28;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='#' && LA17_0<='&')||(LA17_0>='(' && LA17_0<=')')||LA17_0=='+'||(LA17_0>=':' && LA17_0<='@')||(LA17_0>='[' && LA17_0<=']')||LA17_0=='`'||LA17_0=='|'||(LA17_0>='~' && LA17_0<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_25 = input.LA(1);

                        s = -1;
                        if ( ((LA17_25>='\u0000' && LA17_25<='\uFFFF')) ) {s = 57;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}