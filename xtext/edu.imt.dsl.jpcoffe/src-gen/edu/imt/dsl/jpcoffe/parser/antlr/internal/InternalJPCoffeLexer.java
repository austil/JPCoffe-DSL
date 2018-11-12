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
    public static final int RULE_METRIC_UNIT=7;
    public static final int RULE_WORD=9;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_MAJ_WORD=8;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int RULE_TITLE_LINE=6;
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

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJPCoffe.g:11:7: ( 'use' )
            // InternalJPCoffe.g:11:9: 'use'
            {
            match("use"); 


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
            // InternalJPCoffe.g:12:7: ( 'recipe' )
            // InternalJPCoffe.g:12:9: 'recipe'
            {
            match("recipe"); 


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
            // InternalJPCoffe.g:13:7: ( 'in' )
            // InternalJPCoffe.g:13:9: 'in'
            {
            match("in"); 


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
            // InternalJPCoffe.g:14:7: ( 'Recipe' )
            // InternalJPCoffe.g:14:9: 'Recipe'
            {
            match("Recipe"); 


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
            // InternalJPCoffe.g:15:7: ( '{' )
            // InternalJPCoffe.g:15:9: '{'
            {
            match('{'); 

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
            // InternalJPCoffe.g:16:7: ( '}' )
            // InternalJPCoffe.g:16:9: '}'
            {
            match('}'); 

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
            // InternalJPCoffe.g:17:7: ( 'For' )
            // InternalJPCoffe.g:17:9: 'For'
            {
            match("For"); 


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
            // InternalJPCoffe.g:18:7: ( 'people' )
            // InternalJPCoffe.g:18:9: 'people'
            {
            match("people"); 


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
            // InternalJPCoffe.g:19:7: ( 'Ingredients' )
            // InternalJPCoffe.g:19:9: 'Ingredients'
            {
            match("Ingredients"); 


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
            // InternalJPCoffe.g:20:7: ( '*' )
            // InternalJPCoffe.g:20:9: '*'
            {
            match('*'); 

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
            // InternalJPCoffe.g:21:7: ( 'GROUP' )
            // InternalJPCoffe.g:21:9: 'GROUP'
            {
            match("GROUP"); 


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
            // InternalJPCoffe.g:22:7: ( '[' )
            // InternalJPCoffe.g:22:9: '['
            {
            match('['); 

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
            // InternalJPCoffe.g:23:7: ( ']' )
            // InternalJPCoffe.g:23:9: ']'
            {
            match(']'); 

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
            // InternalJPCoffe.g:24:7: ( 'OR' )
            // InternalJPCoffe.g:24:9: 'OR'
            {
            match("OR"); 


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
            // InternalJPCoffe.g:25:7: ( 'AS' )
            // InternalJPCoffe.g:25:9: 'AS'
            {
            match("AS"); 


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
            // InternalJPCoffe.g:26:7: ( 'Tools' )
            // InternalJPCoffe.g:26:9: 'Tools'
            {
            match("Tools"); 


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
            // InternalJPCoffe.g:27:7: ( 'Steps' )
            // InternalJPCoffe.g:27:9: 'Steps'
            {
            match("Steps"); 


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
            // InternalJPCoffe.g:28:7: ( ',' )
            // InternalJPCoffe.g:28:9: ','
            {
            match(','); 

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
            // InternalJPCoffe.g:29:7: ( '->' )
            // InternalJPCoffe.g:29:9: '->'
            {
            match("->"); 


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
            // InternalJPCoffe.g:30:7: ( '.' )
            // InternalJPCoffe.g:30:9: '.'
            {
            match('.'); 

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
            // InternalJPCoffe.g:31:7: ( 'IF' )
            // InternalJPCoffe.g:31:9: 'IF'
            {
            match("IF"); 


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
            // InternalJPCoffe.g:32:7: ( 'THEN' )
            // InternalJPCoffe.g:32:9: 'THEN'
            {
            match("THEN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "RULE_METRIC_UNIT"
    public final void mRULE_METRIC_UNIT() throws RecognitionException {
        try {
            int _type = RULE_METRIC_UNIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJPCoffe.g:1193:18: ( ( 'gr' | 'kg' | 'cl' | 'l' | 'g' ) )
            // InternalJPCoffe.g:1193:20: ( 'gr' | 'kg' | 'cl' | 'l' | 'g' )
            {
            // InternalJPCoffe.g:1193:20: ( 'gr' | 'kg' | 'cl' | 'l' | 'g' )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 'g':
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='r') ) {
                    alt1=1;
                }
                else {
                    alt1=5;}
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
                    // InternalJPCoffe.g:1193:21: 'gr'
                    {
                    match("gr"); 


                    }
                    break;
                case 2 :
                    // InternalJPCoffe.g:1193:26: 'kg'
                    {
                    match("kg"); 


                    }
                    break;
                case 3 :
                    // InternalJPCoffe.g:1193:31: 'cl'
                    {
                    match("cl"); 


                    }
                    break;
                case 4 :
                    // InternalJPCoffe.g:1193:36: 'l'
                    {
                    match('l'); 

                    }
                    break;
                case 5 :
                    // InternalJPCoffe.g:1193:40: 'g'
                    {
                    match('g'); 

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
            // InternalJPCoffe.g:1195:17: ( ( '-' )+ )
            // InternalJPCoffe.g:1195:19: ( '-' )+
            {
            // InternalJPCoffe.g:1195:19: ( '-' )+
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
            	    // InternalJPCoffe.g:1195:19: '-'
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
            // InternalJPCoffe.g:1197:15: ( 'A' .. 'Z' ( 'a' .. 'z' | '-' )* )
            // InternalJPCoffe.g:1197:17: 'A' .. 'Z' ( 'a' .. 'z' | '-' )*
            {
            matchRange('A','Z'); 
            // InternalJPCoffe.g:1197:26: ( 'a' .. 'z' | '-' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='-'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalJPCoffe.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "RULE_MAJ_WORD"

    // $ANTLR start "RULE_WORD"
    public final void mRULE_WORD() throws RecognitionException {
        try {
            int _type = RULE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalJPCoffe.g:1199:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '\\'' | ',' | '-' )+ )
            // InternalJPCoffe.g:1199:13: ( 'a' .. 'z' | 'A' .. 'Z' | '\\'' | ',' | '-' )+
            {
            // InternalJPCoffe.g:1199:13: ( 'a' .. 'z' | 'A' .. 'Z' | '\\'' | ',' | '-' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\''||(LA4_0>=',' && LA4_0<='-')||(LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalJPCoffe.g:
            	    {
            	    if ( input.LA(1)=='\''||(input.LA(1)>=',' && input.LA(1)<='-')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
            // InternalJPCoffe.g:1201:10: ( ( '0' .. '9' )+ )
            // InternalJPCoffe.g:1201:12: ( '0' .. '9' )+
            {
            // InternalJPCoffe.g:1201:12: ( '0' .. '9' )+
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
            	    // InternalJPCoffe.g:1201:13: '0' .. '9'
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
            // InternalJPCoffe.g:1203:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalJPCoffe.g:1203:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalJPCoffe.g:1203:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalJPCoffe.g:1203:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalJPCoffe.g:1203:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalJPCoffe.g:1203:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalJPCoffe.g:1203:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalJPCoffe.g:1203:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalJPCoffe.g:1203:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalJPCoffe.g:1203:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalJPCoffe.g:1203:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalJPCoffe.g:1205:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalJPCoffe.g:1205:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalJPCoffe.g:1205:24: ( options {greedy=false; } : . )*
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
            	    // InternalJPCoffe.g:1205:52: .
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
            // InternalJPCoffe.g:1207:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalJPCoffe.g:1207:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalJPCoffe.g:1207:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalJPCoffe.g:1207:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalJPCoffe.g:1207:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalJPCoffe.g:1207:41: ( '\\r' )? '\\n'
                    {
                    // InternalJPCoffe.g:1207:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalJPCoffe.g:1207:41: '\\r'
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
            // InternalJPCoffe.g:1209:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalJPCoffe.g:1209:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalJPCoffe.g:1209:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
        // InternalJPCoffe.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | RULE_METRIC_UNIT | RULE_TITLE_LINE | RULE_MAJ_WORD | RULE_WORD | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt14=31;
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
                // InternalJPCoffe.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalJPCoffe.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalJPCoffe.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalJPCoffe.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalJPCoffe.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalJPCoffe.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalJPCoffe.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalJPCoffe.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalJPCoffe.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalJPCoffe.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalJPCoffe.g:1:142: RULE_METRIC_UNIT
                {
                mRULE_METRIC_UNIT(); 

                }
                break;
            case 24 :
                // InternalJPCoffe.g:1:159: RULE_TITLE_LINE
                {
                mRULE_TITLE_LINE(); 

                }
                break;
            case 25 :
                // InternalJPCoffe.g:1:175: RULE_MAJ_WORD
                {
                mRULE_MAJ_WORD(); 

                }
                break;
            case 26 :
                // InternalJPCoffe.g:1:189: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;
            case 27 :
                // InternalJPCoffe.g:1:199: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 28 :
                // InternalJPCoffe.g:1:208: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 29 :
                // InternalJPCoffe.g:1:220: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 30 :
                // InternalJPCoffe.g:1:236: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 31 :
                // InternalJPCoffe.g:1:252: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\3\35\1\45\2\uffff\1\45\1\35\1\45\1\uffff\1\45\2\uffff\4\45\1\60\1\62\1\uffff\1\65\2\35\1\65\1\45\1\35\5\uffff\2\35\1\76\2\45\1\uffff\1\45\1\35\1\45\1\103\1\35\1\105\1\106\1\45\1\35\1\45\3\uffff\1\62\1\65\1\uffff\2\65\1\35\3\uffff\1\112\1\35\1\uffff\1\45\1\115\1\35\1\45\1\uffff\1\35\2\uffff\1\45\1\35\1\45\1\uffff\1\35\1\45\1\uffff\1\35\1\45\1\35\1\45\1\132\1\45\1\35\1\45\1\35\1\45\1\140\1\141\1\uffff\1\142\1\143\1\144\1\145\1\45\6\uffff\4\45\1\153\1\uffff";
    static final String DFA14_eofS =
        "\154\uffff";
    static final String DFA14_minS =
        "\1\11\1\163\1\145\1\156\1\47\2\uffff\1\47\1\145\1\47\1\uffff\1\47\2\uffff\6\47\1\uffff\1\47\1\147\1\154\2\47\1\0\3\uffff\1\52\1\uffff\1\145\1\143\3\47\1\uffff\1\47\1\157\2\47\1\117\3\47\1\105\1\47\3\uffff\2\47\1\uffff\2\47\1\0\3\uffff\1\47\1\151\1\uffff\2\47\1\160\1\47\1\uffff\1\125\2\uffff\1\47\1\116\1\47\1\uffff\1\160\1\47\1\uffff\1\154\1\47\1\120\3\47\1\145\1\47\1\145\3\47\1\uffff\5\47\6\uffff\5\47\1\uffff";
    static final String DFA14_maxS =
        "\1\175\1\163\1\145\1\156\1\172\2\uffff\1\172\1\145\1\172\1\uffff\1\172\2\uffff\6\172\1\uffff\1\172\1\147\1\154\2\172\1\uffff\3\uffff\1\57\1\uffff\1\145\1\143\3\172\1\uffff\1\172\1\157\2\172\1\117\3\172\1\105\1\172\3\uffff\2\172\1\uffff\2\172\1\uffff\3\uffff\1\172\1\151\1\uffff\2\172\1\160\1\172\1\uffff\1\125\2\uffff\1\172\1\116\1\172\1\uffff\1\160\1\172\1\uffff\1\154\1\172\1\120\3\172\1\145\1\172\1\145\3\172\1\uffff\5\172\6\uffff\5\172\1\uffff";
    static final String DFA14_acceptS =
        "\5\uffff\1\5\1\6\3\uffff\1\12\1\uffff\1\14\1\15\6\uffff\1\24\6\uffff\1\33\1\34\1\32\1\uffff\1\37\5\uffff\1\31\12\uffff\1\22\1\23\1\30\2\uffff\1\27\3\uffff\1\32\1\35\1\36\2\uffff\1\3\4\uffff\1\25\1\uffff\1\16\1\17\3\uffff\1\1\2\uffff\1\7\14\uffff\1\26\5\uffff\1\13\1\20\1\21\1\2\1\4\1\10\5\uffff\1\11";
    static final String DFA14_specialS =
        "\32\uffff\1\1\35\uffff\1\0\63\uffff}>";
    static final String[] DFA14_transitionS = {
            "\2\37\2\uffff\1\37\22\uffff\1\37\1\uffff\1\34\4\uffff\1\32\2\uffff\1\12\1\uffff\1\22\1\23\1\24\1\36\12\33\7\uffff\1\17\4\31\1\7\1\13\1\31\1\11\5\31\1\16\2\31\1\4\1\21\1\20\6\31\1\14\1\uffff\1\15\3\uffff\2\35\1\27\3\35\1\25\1\35\1\3\1\35\1\26\1\30\3\35\1\10\1\35\1\2\2\35\1\1\5\35\1\5\1\uffff\1\6",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\35\4\uffff\1\35\1\44\23\uffff\32\35\6\uffff\4\44\1\43\25\44",
            "",
            "",
            "\1\35\4\uffff\1\35\1\44\23\uffff\32\35\6\uffff\16\44\1\46\13\44",
            "\1\47",
            "\1\35\4\uffff\1\35\1\44\23\uffff\5\35\1\51\24\35\6\uffff\15\44\1\50\14\44",
            "",
            "\1\35\4\uffff\1\35\1\44\23\uffff\21\35\1\52\10\35\6\uffff\32\44",
            "",
            "",
            "\1\35\4\uffff\1\35\1\44\23\uffff\21\35\1\53\10\35\6\uffff\32\44",
            "\1\35\4\uffff\1\35\1\44\23\uffff\22\35\1\54\7\35\6\uffff\32\44",
            "\1\35\4\uffff\1\35\1\44\23\uffff\7\35\1\56\22\35\6\uffff\16\44\1\55\13\44",
            "\1\35\4\uffff\1\35\1\44\23\uffff\32\35\6\uffff\23\44\1\57\6\44",
            "\1\35\4\uffff\2\35\23\uffff\32\35\6\uffff\32\35",
            "\1\35\4\uffff\1\35\1\63\20\uffff\1\61\2\uffff\32\35\6\uffff\32\35",
            "",
            "\1\35\4\uffff\2\35\23\uffff\32\35\6\uffff\21\35\1\64\10\35",
            "\1\66",
            "\1\67",
            "\1\35\4\uffff\2\35\23\uffff\32\35\6\uffff\32\35",
            "\1\35\4\uffff\1\35\1\44\23\uffff\32\35\6\uffff\32\44",
            "\47\34\1\71\4\34\2\70\23\34\32\70\6\34\32\70\uff85\34",
            "",
            "",
            "",
            "\1\72\4\uffff\1\73",
            "",
            "\1\74",
            "\1\75",
            "\1\35\4\uffff\2\35\23\uffff\32\35\6\uffff\32\35",
            "\1\35\4\uffff\1\35\1\44\23\uffff\32\35\6\uffff\2\44\1\77\27\44",
            "\1\35\4\uffff\1\35\1\44\23\uffff\32\35\6\uffff\32\44",
            "",
            "\1\35\4\uffff\1\35\1\44\23\uffff\32\35\6\uffff\21\44\1\100\10\44",
            "\1\101",
            "\1\35\4\uffff\1\35\1\44\23\uffff\32\35\6\uffff\6\44\1\102\23\44",
            "\1\35\4\uffff\2\35\23\uffff\32\35\6\uffff\32\35",
            "\1\104",
            "\1\35\4\uffff\2\35\23\uffff\32\35\6\uffff\32\35",
            "\1\35\4\uffff\2\35\23\uffff\32\35\6\uffff\32\35",
            "\1\35\4\uffff\1\35\1\44\23\uffff\32\35\6\uffff\16\44\1\107\13\44",
            "\1\110",
            "\1\35\4\uffff\1\35\1\44\23\uffff\32\35\6\uffff\4\44\1\111\25\44",
            "",
            "",
            "",
            "\1\35\4\uffff\1\35\1\63\23\uffff\32\35\6\uffff\32\35",
            "\1\35\4\uffff\2\35\23\uffff\32\35\6\uffff\32\35",
            "",
            "\1\35\4\uffff\2\35\23\uffff\32\35\6\uffff\32\35",
            "\1\35\4\uffff\2\35\23\uffff\32\35\6\uffff\32\35",
            "\47\34\1\71\4\34\2\70\23\34\32\70\6\34\32\70\uff85\34",
            "",
            "",
            "",
            "\1\35\4\uffff\2\35\23\uffff\32\35\6\uffff\32\35",
            "\1\113",
            "",
            "\1\35\4\uffff\1\35\1\44\23\uffff\32\35\6\uffff\10\44\1\114\21\44",
            "\1\35\4\uffff\1\35\1\44\23\uffff\32\35\6\uffff\32\44",
            "\1\116",
            "\1\35\4\uffff\1\35\1\44\23\uffff\32\35\6\uffff\21\44\1\117\10\44",
            "",
            "\1\120",
            "",
            "",
            "\1\35\4\uffff\1\35\1\44\23\uffff\32\35\6\uffff\13\44\1\121\16\44",
            "\1\122",
            "\1\35\4\uffff\1\35\1\44\23\uffff\32\35\6\uffff\17\44\1\123\12\44",
            "",
            "\1\124",
            "\1\35\4\uffff\1\35\1\44\23\uffff\32\35\6\uffff\17\44\1\125\12\44",
            "",
            "\1\126",
            "\1\35\4\uffff\1\35\1\44\23\uffff\32\35\6\uffff\4\44\1\127\25\44",
            "\1\130",
            "\1\35\4\uffff\1\35\1\44\23\uffff\32\35\6\uffff\22\44\1\131\7\44",
            "\1\35\4\uffff\2\35\23\uffff\32\35\6\uffff\32\35",
            "\1\35\4\uffff\1\35\1\44\23\uffff\32\35\6\uffff\22\44\1\133\7\44",
            "\1\134",
            "\1\35\4\uffff\1\35\1\44\23\uffff\32\35\6\uffff\4\44\1\135\25\44",
            "\1\136",
            "\1\35\4\uffff\1\35\1\44\23\uffff\32\35\6\uffff\3\44\1\137\26\44",
            "\1\35\4\uffff\2\35\23\uffff\32\35\6\uffff\32\35",
            "\1\35\4\uffff\1\35\1\44\23\uffff\32\35\6\uffff\32\44",
            "",
            "\1\35\4\uffff\1\35\1\44\23\uffff\32\35\6\uffff\32\44",
            "\1\35\4\uffff\2\35\23\uffff\32\35\6\uffff\32\35",
            "\1\35\4\uffff\1\35\1\44\23\uffff\32\35\6\uffff\32\44",
            "\1\35\4\uffff\2\35\23\uffff\32\35\6\uffff\32\35",
            "\1\35\4\uffff\1\35\1\44\23\uffff\32\35\6\uffff\10\44\1\146\21\44",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\35\4\uffff\1\35\1\44\23\uffff\32\35\6\uffff\4\44\1\147\25\44",
            "\1\35\4\uffff\1\35\1\44\23\uffff\32\35\6\uffff\15\44\1\150\14\44",
            "\1\35\4\uffff\1\35\1\44\23\uffff\32\35\6\uffff\23\44\1\151\6\44",
            "\1\35\4\uffff\1\35\1\44\23\uffff\32\35\6\uffff\22\44\1\152\7\44",
            "\1\35\4\uffff\1\35\1\44\23\uffff\32\35\6\uffff\32\44",
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
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | RULE_METRIC_UNIT | RULE_TITLE_LINE | RULE_MAJ_WORD | RULE_WORD | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_56 = input.LA(1);

                        s = -1;
                        if ( (LA14_56=='\'') ) {s = 57;}

                        else if ( ((LA14_56>='\u0000' && LA14_56<='&')||(LA14_56>='(' && LA14_56<='+')||(LA14_56>='.' && LA14_56<='@')||(LA14_56>='[' && LA14_56<='`')||(LA14_56>='{' && LA14_56<='\uFFFF')) ) {s = 28;}

                        else if ( ((LA14_56>=',' && LA14_56<='-')||(LA14_56>='A' && LA14_56<='Z')||(LA14_56>='a' && LA14_56<='z')) ) {s = 56;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_26 = input.LA(1);

                        s = -1;
                        if ( ((LA14_26>='\u0000' && LA14_26<='&')||(LA14_26>='(' && LA14_26<='+')||(LA14_26>='.' && LA14_26<='@')||(LA14_26>='[' && LA14_26<='`')||(LA14_26>='{' && LA14_26<='\uFFFF')) ) {s = 28;}

                        else if ( ((LA14_26>=',' && LA14_26<='-')||(LA14_26>='A' && LA14_26<='Z')||(LA14_26>='a' && LA14_26<='z')) ) {s = 56;}

                        else if ( (LA14_26=='\'') ) {s = 57;}

                        else s = 29;

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