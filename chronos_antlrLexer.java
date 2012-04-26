// $ANTLR 3.4 chronos_antlr.g 2012-04-25 23:18:15

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class chronos_antlrLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int AND=4;
    public static final int BREAK_T=5;
    public static final int CHAR=6;
    public static final int COMMENT=7;
    public static final int COURSELIST_T=8;
    public static final int COURSE_T=9;
    public static final int DAY_T=10;
    public static final int DOUBLE_T=11;
    public static final int ELSE_T=12;
    public static final int EQ=13;
    public static final int ESC_SEQ=14;
    public static final int EXPONENT=15;
    public static final int FLOAT=16;
    public static final int FOREACH_T=17;
    public static final int GEQ=18;
    public static final int HEX_DIGIT=19;
    public static final int ID=20;
    public static final int IF_T=21;
    public static final int INT=22;
    public static final int INT_T=23;
    public static final int IN_T=24;
    public static final int LEQ=25;
    public static final int NEQ=26;
    public static final int NEW_T=27;
    public static final int NOT=28;
    public static final int OCTAL_ESC=29;
    public static final int OR=30;
    public static final int SCHEDULE_T=31;
    public static final int STRING=32;
    public static final int STRING_T=33;
    public static final int TIME_T=34;
    public static final int UNICODE_ESC=35;
    public static final int WHITESPACE=36;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public chronos_antlrLexer() {} 
    public chronos_antlrLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public chronos_antlrLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "chronos_antlr.g"; }

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:2:7: ( '(' )
            // chronos_antlr.g:2:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:3:7: ( ')' )
            // chronos_antlr.g:3:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:4:7: ( '*' )
            // chronos_antlr.g:4:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:5:7: ( '+' )
            // chronos_antlr.g:5:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:6:7: ( ',' )
            // chronos_antlr.g:6:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:7:7: ( '-' )
            // chronos_antlr.g:7:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:8:7: ( '.' )
            // chronos_antlr.g:8:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:9:7: ( '/' )
            // chronos_antlr.g:9:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:10:7: ( ';' )
            // chronos_antlr.g:10:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:11:7: ( '<' )
            // chronos_antlr.g:11:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:12:7: ( '=' )
            // chronos_antlr.g:12:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:13:7: ( '>' )
            // chronos_antlr.g:13:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:14:7: ( '{' )
            // chronos_antlr.g:14:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:15:7: ( '}' )
            // chronos_antlr.g:15:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "IF_T"
    public final void mIF_T() throws RecognitionException {
        try {
            int _type = IF_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:88:7: ( 'if' )
            // chronos_antlr.g:88:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF_T"

    // $ANTLR start "ELSE_T"
    public final void mELSE_T() throws RecognitionException {
        try {
            int _type = ELSE_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:90:8: ( 'else' )
            // chronos_antlr.g:90:10: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE_T"

    // $ANTLR start "NEW_T"
    public final void mNEW_T() throws RecognitionException {
        try {
            int _type = NEW_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:92:8: ( 'new' )
            // chronos_antlr.g:92:10: 'new'
            {
            match("new"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEW_T"

    // $ANTLR start "FOREACH_T"
    public final void mFOREACH_T() throws RecognitionException {
        try {
            int _type = FOREACH_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:94:11: ( 'foreach' )
            // chronos_antlr.g:94:13: 'foreach'
            {
            match("foreach"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOREACH_T"

    // $ANTLR start "IN_T"
    public final void mIN_T() throws RecognitionException {
        try {
            int _type = IN_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:96:6: ( 'in' )
            // chronos_antlr.g:96:8: 'in'
            {
            match("in"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IN_T"

    // $ANTLR start "BREAK_T"
    public final void mBREAK_T() throws RecognitionException {
        try {
            int _type = BREAK_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:98:9: ( 'break' )
            // chronos_antlr.g:98:11: 'break'
            {
            match("break"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BREAK_T"

    // $ANTLR start "SCHEDULE_T"
    public final void mSCHEDULE_T() throws RecognitionException {
        try {
            int _type = SCHEDULE_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:100:11: ( 'schedule' )
            // chronos_antlr.g:100:13: 'schedule'
            {
            match("schedule"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SCHEDULE_T"

    // $ANTLR start "COURSE_T"
    public final void mCOURSE_T() throws RecognitionException {
        try {
            int _type = COURSE_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:102:9: ( 'course' )
            // chronos_antlr.g:102:11: 'course'
            {
            match("course"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COURSE_T"

    // $ANTLR start "COURSELIST_T"
    public final void mCOURSELIST_T() throws RecognitionException {
        try {
            int _type = COURSELIST_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:104:13: ( 'courselist' )
            // chronos_antlr.g:104:15: 'courselist'
            {
            match("courselist"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COURSELIST_T"

    // $ANTLR start "INT_T"
    public final void mINT_T() throws RecognitionException {
        try {
            int _type = INT_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:106:7: ( 'int' )
            // chronos_antlr.g:106:9: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT_T"

    // $ANTLR start "DOUBLE_T"
    public final void mDOUBLE_T() throws RecognitionException {
        try {
            int _type = DOUBLE_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:108:9: ( 'double' )
            // chronos_antlr.g:108:11: 'double'
            {
            match("double"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE_T"

    // $ANTLR start "TIME_T"
    public final void mTIME_T() throws RecognitionException {
        try {
            int _type = TIME_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:110:8: ( 'time' )
            // chronos_antlr.g:110:10: 'time'
            {
            match("time"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TIME_T"

    // $ANTLR start "DAY_T"
    public final void mDAY_T() throws RecognitionException {
        try {
            int _type = DAY_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:112:7: ( 'day' )
            // chronos_antlr.g:112:9: 'day'
            {
            match("day"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DAY_T"

    // $ANTLR start "STRING_T"
    public final void mSTRING_T() throws RecognitionException {
        try {
            int _type = STRING_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:114:9: ( 'string' )
            // chronos_antlr.g:114:11: 'string'
            {
            match("string"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_T"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:118:5: ( '&&' )
            // chronos_antlr.g:118:7: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:120:4: ( '||' )
            // chronos_antlr.g:120:6: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:122:5: ( '!' )
            // chronos_antlr.g:122:7: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "LEQ"
    public final void mLEQ() throws RecognitionException {
        try {
            int _type = LEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:124:5: ( '<=' )
            // chronos_antlr.g:124:7: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEQ"

    // $ANTLR start "GEQ"
    public final void mGEQ() throws RecognitionException {
        try {
            int _type = GEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:126:5: ( '>=' )
            // chronos_antlr.g:126:7: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GEQ"

    // $ANTLR start "NEQ"
    public final void mNEQ() throws RecognitionException {
        try {
            int _type = NEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:128:5: ( '!=' )
            // chronos_antlr.g:128:7: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEQ"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:130:4: ( '==' )
            // chronos_antlr.g:130:6: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:134:2: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // chronos_antlr.g:134:4: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // chronos_antlr.g:134:4: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||(LA1_0 >= '\f' && LA1_0 <= '\r')||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // chronos_antlr.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:137:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // chronos_antlr.g:137:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // chronos_antlr.g:137:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // chronos_antlr.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:140:5: ( ( '0' .. '9' )+ )
            // chronos_antlr.g:140:7: ( '0' .. '9' )+
            {
            // chronos_antlr.g:140:7: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // chronos_antlr.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:144:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt10=3;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // chronos_antlr.g:144:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // chronos_antlr.g:144:9: ( '0' .. '9' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // chronos_antlr.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


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


                    match('.'); 

                    // chronos_antlr.g:144:25: ( '0' .. '9' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // chronos_antlr.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    // chronos_antlr.g:144:37: ( EXPONENT )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='E'||LA6_0=='e') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // chronos_antlr.g:144:37: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // chronos_antlr.g:145:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 

                    // chronos_antlr.g:145:13: ( '0' .. '9' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // chronos_antlr.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    // chronos_antlr.g:145:25: ( EXPONENT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='E'||LA8_0=='e') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // chronos_antlr.g:145:25: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // chronos_antlr.g:146:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // chronos_antlr.g:146:9: ( '0' .. '9' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // chronos_antlr.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    mEXPONENT(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:150:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='/') ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1=='/') ) {
                    alt14=1;
                }
                else if ( (LA14_1=='*') ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // chronos_antlr.g:150:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // chronos_antlr.g:150:14: (~ ( '\\n' | '\\r' ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0 >= '\u0000' && LA11_0 <= '\t')||(LA11_0 >= '\u000B' && LA11_0 <= '\f')||(LA11_0 >= '\u000E' && LA11_0 <= '\uFFFF')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // chronos_antlr.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    // chronos_antlr.g:150:28: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // chronos_antlr.g:150:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel = HIDDEN;

                    }
                    break;
                case 2 :
                    // chronos_antlr.g:151:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // chronos_antlr.g:151:14: ( options {greedy=false; } : . )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='*') ) {
                            int LA13_1 = input.LA(2);

                            if ( (LA13_1=='/') ) {
                                alt13=2;
                            }
                            else if ( ((LA13_1 >= '\u0000' && LA13_1 <= '.')||(LA13_1 >= '0' && LA13_1 <= '\uFFFF')) ) {
                                alt13=1;
                            }


                        }
                        else if ( ((LA13_0 >= '\u0000' && LA13_0 <= ')')||(LA13_0 >= '+' && LA13_0 <= '\uFFFF')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // chronos_antlr.g:151:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    match("*/"); 



                    _channel = HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:155:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // chronos_antlr.g:155:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // chronos_antlr.g:155:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='\\') ) {
                    alt15=1;
                }
                else if ( ((LA15_0 >= '\u0000' && LA15_0 <= '!')||(LA15_0 >= '#' && LA15_0 <= '[')||(LA15_0 >= ']' && LA15_0 <= '\uFFFF')) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // chronos_antlr.g:155:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // chronos_antlr.g:155:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:158:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
            // chronos_antlr.g:158:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 

            // chronos_antlr.g:158:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\\') ) {
                alt16=1;
            }
            else if ( ((LA16_0 >= '\u0000' && LA16_0 <= '&')||(LA16_0 >= '(' && LA16_0 <= '[')||(LA16_0 >= ']' && LA16_0 <= '\uFFFF')) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // chronos_antlr.g:158:15: ESC_SEQ
                    {
                    mESC_SEQ(); 


                    }
                    break;
                case 2 :
                    // chronos_antlr.g:158:25: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // chronos_antlr.g:163:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // chronos_antlr.g:163:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // chronos_antlr.g:163:22: ( '+' | '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='+'||LA17_0=='-') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // chronos_antlr.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // chronos_antlr.g:163:33: ( '0' .. '9' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0 >= '0' && LA18_0 <= '9')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // chronos_antlr.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // chronos_antlr.g:166:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // chronos_antlr.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // chronos_antlr.g:170:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt19=1;
                    }
                    break;
                case 'u':
                    {
                    alt19=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt19=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // chronos_antlr.g:170:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 

                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // chronos_antlr.g:171:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // chronos_antlr.g:172:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // chronos_antlr.g:177:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\\') ) {
                int LA20_1 = input.LA(2);

                if ( ((LA20_1 >= '0' && LA20_1 <= '3')) ) {
                    int LA20_2 = input.LA(3);

                    if ( ((LA20_2 >= '0' && LA20_2 <= '7')) ) {
                        int LA20_4 = input.LA(4);

                        if ( ((LA20_4 >= '0' && LA20_4 <= '7')) ) {
                            alt20=1;
                        }
                        else {
                            alt20=2;
                        }
                    }
                    else {
                        alt20=3;
                    }
                }
                else if ( ((LA20_1 >= '4' && LA20_1 <= '7')) ) {
                    int LA20_3 = input.LA(3);

                    if ( ((LA20_3 >= '0' && LA20_3 <= '7')) ) {
                        alt20=2;
                    }
                    else {
                        alt20=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // chronos_antlr.g:177:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // chronos_antlr.g:178:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // chronos_antlr.g:179:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // chronos_antlr.g:184:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // chronos_antlr.g:184:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 

            match('u'); 

            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // chronos_antlr.g:1:8: ( T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | IF_T | ELSE_T | NEW_T | FOREACH_T | IN_T | BREAK_T | SCHEDULE_T | COURSE_T | COURSELIST_T | INT_T | DOUBLE_T | TIME_T | DAY_T | STRING_T | AND | OR | NOT | LEQ | GEQ | NEQ | EQ | WHITESPACE | ID | INT | FLOAT | COMMENT | STRING | CHAR )
        int alt21=42;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // chronos_antlr.g:1:10: T__37
                {
                mT__37(); 


                }
                break;
            case 2 :
                // chronos_antlr.g:1:16: T__38
                {
                mT__38(); 


                }
                break;
            case 3 :
                // chronos_antlr.g:1:22: T__39
                {
                mT__39(); 


                }
                break;
            case 4 :
                // chronos_antlr.g:1:28: T__40
                {
                mT__40(); 


                }
                break;
            case 5 :
                // chronos_antlr.g:1:34: T__41
                {
                mT__41(); 


                }
                break;
            case 6 :
                // chronos_antlr.g:1:40: T__42
                {
                mT__42(); 


                }
                break;
            case 7 :
                // chronos_antlr.g:1:46: T__43
                {
                mT__43(); 


                }
                break;
            case 8 :
                // chronos_antlr.g:1:52: T__44
                {
                mT__44(); 


                }
                break;
            case 9 :
                // chronos_antlr.g:1:58: T__45
                {
                mT__45(); 


                }
                break;
            case 10 :
                // chronos_antlr.g:1:64: T__46
                {
                mT__46(); 


                }
                break;
            case 11 :
                // chronos_antlr.g:1:70: T__47
                {
                mT__47(); 


                }
                break;
            case 12 :
                // chronos_antlr.g:1:76: T__48
                {
                mT__48(); 


                }
                break;
            case 13 :
                // chronos_antlr.g:1:82: T__49
                {
                mT__49(); 


                }
                break;
            case 14 :
                // chronos_antlr.g:1:88: T__50
                {
                mT__50(); 


                }
                break;
            case 15 :
                // chronos_antlr.g:1:94: IF_T
                {
                mIF_T(); 


                }
                break;
            case 16 :
                // chronos_antlr.g:1:99: ELSE_T
                {
                mELSE_T(); 


                }
                break;
            case 17 :
                // chronos_antlr.g:1:106: NEW_T
                {
                mNEW_T(); 


                }
                break;
            case 18 :
                // chronos_antlr.g:1:112: FOREACH_T
                {
                mFOREACH_T(); 


                }
                break;
            case 19 :
                // chronos_antlr.g:1:122: IN_T
                {
                mIN_T(); 


                }
                break;
            case 20 :
                // chronos_antlr.g:1:127: BREAK_T
                {
                mBREAK_T(); 


                }
                break;
            case 21 :
                // chronos_antlr.g:1:135: SCHEDULE_T
                {
                mSCHEDULE_T(); 


                }
                break;
            case 22 :
                // chronos_antlr.g:1:146: COURSE_T
                {
                mCOURSE_T(); 


                }
                break;
            case 23 :
                // chronos_antlr.g:1:155: COURSELIST_T
                {
                mCOURSELIST_T(); 


                }
                break;
            case 24 :
                // chronos_antlr.g:1:168: INT_T
                {
                mINT_T(); 


                }
                break;
            case 25 :
                // chronos_antlr.g:1:174: DOUBLE_T
                {
                mDOUBLE_T(); 


                }
                break;
            case 26 :
                // chronos_antlr.g:1:183: TIME_T
                {
                mTIME_T(); 


                }
                break;
            case 27 :
                // chronos_antlr.g:1:190: DAY_T
                {
                mDAY_T(); 


                }
                break;
            case 28 :
                // chronos_antlr.g:1:196: STRING_T
                {
                mSTRING_T(); 


                }
                break;
            case 29 :
                // chronos_antlr.g:1:205: AND
                {
                mAND(); 


                }
                break;
            case 30 :
                // chronos_antlr.g:1:209: OR
                {
                mOR(); 


                }
                break;
            case 31 :
                // chronos_antlr.g:1:212: NOT
                {
                mNOT(); 


                }
                break;
            case 32 :
                // chronos_antlr.g:1:216: LEQ
                {
                mLEQ(); 


                }
                break;
            case 33 :
                // chronos_antlr.g:1:220: GEQ
                {
                mGEQ(); 


                }
                break;
            case 34 :
                // chronos_antlr.g:1:224: NEQ
                {
                mNEQ(); 


                }
                break;
            case 35 :
                // chronos_antlr.g:1:228: EQ
                {
                mEQ(); 


                }
                break;
            case 36 :
                // chronos_antlr.g:1:231: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 37 :
                // chronos_antlr.g:1:242: ID
                {
                mID(); 


                }
                break;
            case 38 :
                // chronos_antlr.g:1:245: INT
                {
                mINT(); 


                }
                break;
            case 39 :
                // chronos_antlr.g:1:249: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 40 :
                // chronos_antlr.g:1:255: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 41 :
                // chronos_antlr.g:1:263: STRING
                {
                mSTRING(); 


                }
                break;
            case 42 :
                // chronos_antlr.g:1:270: CHAR
                {
                mCHAR(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA10_eotS =
        "\5\uffff";
    static final String DFA10_eofS =
        "\5\uffff";
    static final String DFA10_minS =
        "\2\56\3\uffff";
    static final String DFA10_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA10_specialS =
        "\5\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "143:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA21_eotS =
        "\7\uffff\1\40\1\43\1\uffff\1\45\1\47\1\51\2\uffff\11\34\2\uffff"+
        "\1\67\2\uffff\1\70\14\uffff\1\71\1\73\12\34\4\uffff\1\106\1\uffff"+
        "\1\34\1\110\6\34\1\117\1\34\1\uffff\1\121\1\uffff\6\34\1\uffff\1"+
        "\130\1\uffff\1\34\1\132\4\34\1\uffff\1\34\1\uffff\1\34\1\141\1\143"+
        "\1\144\1\145\1\34\1\uffff\1\34\3\uffff\1\150\1\34\1\uffff\1\34\1"+
        "\153\1\uffff";
    static final String DFA21_eofS =
        "\154\uffff";
    static final String DFA21_minS =
        "\1\11\6\uffff\1\60\1\52\1\uffff\3\75\2\uffff\1\146\1\154\1\145\1"+
        "\157\1\162\1\143\1\157\1\141\1\151\2\uffff\1\75\2\uffff\1\56\14"+
        "\uffff\2\60\1\163\1\167\1\162\1\145\1\150\1\162\2\165\1\171\1\155"+
        "\4\uffff\1\60\1\uffff\1\145\1\60\1\145\1\141\1\145\1\151\1\162\1"+
        "\142\1\60\1\145\1\uffff\1\60\1\uffff\1\141\1\153\1\144\1\156\1\163"+
        "\1\154\1\uffff\1\60\1\uffff\1\143\1\60\1\165\1\147\2\145\1\uffff"+
        "\1\150\1\uffff\1\154\4\60\1\145\1\uffff\1\151\3\uffff\1\60\1\163"+
        "\1\uffff\1\164\1\60\1\uffff";
    static final String DFA21_maxS =
        "\1\175\6\uffff\1\71\1\57\1\uffff\3\75\2\uffff\1\156\1\154\1\145"+
        "\1\157\1\162\1\164\2\157\1\151\2\uffff\1\75\2\uffff\1\145\14\uffff"+
        "\2\172\1\163\1\167\1\162\1\145\1\150\1\162\2\165\1\171\1\155\4\uffff"+
        "\1\172\1\uffff\1\145\1\172\1\145\1\141\1\145\1\151\1\162\1\142\1"+
        "\172\1\145\1\uffff\1\172\1\uffff\1\141\1\153\1\144\1\156\1\163\1"+
        "\154\1\uffff\1\172\1\uffff\1\143\1\172\1\165\1\147\2\145\1\uffff"+
        "\1\150\1\uffff\1\154\4\172\1\145\1\uffff\1\151\3\uffff\1\172\1\163"+
        "\1\uffff\1\164\1\172\1\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff\1\11\3\uffff\1\15\1\16"+
        "\11\uffff\1\35\1\36\1\uffff\1\44\1\45\1\uffff\1\51\1\52\1\7\1\47"+
        "\1\50\1\10\1\40\1\12\1\43\1\13\1\41\1\14\14\uffff\1\42\1\37\1\46"+
        "\1\17\1\uffff\1\23\12\uffff\1\30\1\uffff\1\21\6\uffff\1\33\1\uffff"+
        "\1\20\6\uffff\1\32\1\uffff\1\24\6\uffff\1\34\1\uffff\1\26\1\31\1"+
        "\22\2\uffff\1\25\2\uffff\1\27";
    static final String DFA21_specialS =
        "\154\uffff}>";
    static final String[] DFA21_transitionS = {
            "\2\33\1\uffff\2\33\22\uffff\1\33\1\32\1\36\3\uffff\1\30\1\37"+
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\12\35\1\uffff\1\11\1\12\1"+
            "\13\1\14\2\uffff\32\34\4\uffff\1\34\1\uffff\1\34\1\23\1\25\1"+
            "\26\1\20\1\22\2\34\1\17\4\34\1\21\4\34\1\24\1\27\6\34\1\15\1"+
            "\31\1\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\41",
            "\1\42\4\uffff\1\42",
            "",
            "\1\44",
            "\1\46",
            "\1\50",
            "",
            "",
            "\1\52\7\uffff\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60\20\uffff\1\61",
            "\1\62",
            "\1\64\15\uffff\1\63",
            "\1\65",
            "",
            "",
            "\1\66",
            "",
            "",
            "\1\41\1\uffff\12\35\13\uffff\1\41\37\uffff\1\41",
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
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\23\34\1\72\6\34",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "",
            "",
            "",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\107",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\120",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\131",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "",
            "\1\137",
            "",
            "\1\140",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\13\34\1\142\16\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\146",
            "",
            "\1\147",
            "",
            "",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\151",
            "",
            "\1\152",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | IF_T | ELSE_T | NEW_T | FOREACH_T | IN_T | BREAK_T | SCHEDULE_T | COURSE_T | COURSELIST_T | INT_T | DOUBLE_T | TIME_T | DAY_T | STRING_T | AND | OR | NOT | LEQ | GEQ | NEQ | EQ | WHITESPACE | ID | INT | FLOAT | COMMENT | STRING | CHAR );";
        }
    }
 

}