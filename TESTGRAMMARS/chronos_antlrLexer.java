// $ANTLR 3.4 chronos_antlr.g 2012-05-02 18:29:37

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class chronos_antlrLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int AND=4;
    public static final int BLOCK=5;
    public static final int BREAK_T=6;
    public static final int CHAR=7;
    public static final int COMMENT=8;
    public static final int COND=9;
    public static final int COURSELIST_T=10;
    public static final int COURSE_T=11;
    public static final int DATETIME=12;
    public static final int DATETIME_T=13;
    public static final int DAY=14;
    public static final int DAYS=15;
    public static final int DAY_T=16;
    public static final int DECL=17;
    public static final int DOUBLE_T=18;
    public static final int ELSE_T=19;
    public static final int EQ=20;
    public static final int ESC_SEQ=21;
    public static final int EXPONENT=22;
    public static final int FLOAT=23;
    public static final int FOREACH_T=24;
    public static final int FUNC=25;
    public static final int GEQ=26;
    public static final int HEX_DIGIT=27;
    public static final int ID=28;
    public static final int IF_T=29;
    public static final int INT=30;
    public static final int INT_T=31;
    public static final int IN_T=32;
    public static final int LEQ=33;
    public static final int NEQ=34;
    public static final int NEW_T=35;
    public static final int NOT=36;
    public static final int OCTAL_ESC=37;
    public static final int OR=38;
    public static final int PARAMS=39;
    public static final int SCHEDULE_T=40;
    public static final int STRING=41;
    public static final int STRING_T=42;
    public static final int TIME=43;
    public static final int TIMEBLOCK_T=44;
    public static final int TIMES=45;
    public static final int TIME_T=46;
    public static final int UNICODE_ESC=47;
    public static final int WHITESPACE=48;

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

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:7:7: ( '*' )
            // chronos_antlr.g:7:9: '*'
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
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:8:7: ( '+' )
            // chronos_antlr.g:8:9: '+'
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
    // $ANTLR end "T__50"

    // $ANTLR start "IF_T"
    public final void mIF_T() throws RecognitionException {
        try {
            int _type = IF_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:141:7: ( 'if' )
            // chronos_antlr.g:141:9: 'if'
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
            // chronos_antlr.g:143:8: ( 'else' )
            // chronos_antlr.g:143:10: 'else'
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
            // chronos_antlr.g:145:8: ( 'new' )
            // chronos_antlr.g:145:10: 'new'
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
            // chronos_antlr.g:147:11: ( 'foreach' )
            // chronos_antlr.g:147:13: 'foreach'
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
            // chronos_antlr.g:149:6: ( 'in' )
            // chronos_antlr.g:149:8: 'in'
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
            // chronos_antlr.g:151:9: ( 'break' )
            // chronos_antlr.g:151:11: 'break'
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
            // chronos_antlr.g:153:11: ( 'schedule' )
            // chronos_antlr.g:153:13: 'schedule'
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
            // chronos_antlr.g:155:9: ( 'course' )
            // chronos_antlr.g:155:11: 'course'
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
            // chronos_antlr.g:157:13: ( 'courselist' )
            // chronos_antlr.g:157:15: 'courselist'
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

    // $ANTLR start "TIMEBLOCK_T"
    public final void mTIMEBLOCK_T() throws RecognitionException {
        try {
            int _type = TIMEBLOCK_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:159:12: ( 'timeblock' )
            // chronos_antlr.g:159:14: 'timeblock'
            {
            match("timeblock"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TIMEBLOCK_T"

    // $ANTLR start "DATETIME_T"
    public final void mDATETIME_T() throws RecognitionException {
        try {
            int _type = DATETIME_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:161:11: ( 'datetime' )
            // chronos_antlr.g:161:14: 'datetime'
            {
            match("datetime"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DATETIME_T"

    // $ANTLR start "INT_T"
    public final void mINT_T() throws RecognitionException {
        try {
            int _type = INT_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:163:7: ( 'int' )
            // chronos_antlr.g:163:9: 'int'
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
            // chronos_antlr.g:165:9: ( 'double' )
            // chronos_antlr.g:165:11: 'double'
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

    // $ANTLR start "DAY_T"
    public final void mDAY_T() throws RecognitionException {
        try {
            int _type = DAY_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:167:7: ( 'day' )
            // chronos_antlr.g:167:9: 'day'
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

    // $ANTLR start "TIME_T"
    public final void mTIME_T() throws RecognitionException {
        try {
            int _type = TIME_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:169:8: ( 'time' )
            // chronos_antlr.g:169:10: 'time'
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

    // $ANTLR start "STRING_T"
    public final void mSTRING_T() throws RecognitionException {
        try {
            int _type = STRING_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:171:9: ( 'string' )
            // chronos_antlr.g:171:11: 'string'
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

    // $ANTLR start "TIME"
    public final void mTIME() throws RecognitionException {
        try {
            int _type = TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:175:2: ( ( '0' .. '2' )? ( '0' .. '9' ) ':' ( '0' .. '5' ) ( '0' .. '9' ) )
            // chronos_antlr.g:175:4: ( '0' .. '2' )? ( '0' .. '9' ) ':' ( '0' .. '5' ) ( '0' .. '9' )
            {
            // chronos_antlr.g:175:4: ( '0' .. '2' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0 >= '0' && LA1_0 <= '2')) ) {
                int LA1_1 = input.LA(2);

                if ( ((LA1_1 >= '0' && LA1_1 <= '9')) ) {
                    alt1=1;
                }
            }
            switch (alt1) {
                case 1 :
                    // chronos_antlr.g:
                    {
                    if ( (input.LA(1) >= '0' && input.LA(1) <= '2') ) {
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


            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            match(':'); 

            if ( (input.LA(1) >= '0' && input.LA(1) <= '5') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TIME"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // chronos_antlr.g:181:5: ( '&&' )
            // chronos_antlr.g:181:7: '&&'
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
            // chronos_antlr.g:183:4: ( '||' )
            // chronos_antlr.g:183:6: '||'
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
            // chronos_antlr.g:185:5: ( '!' )
            // chronos_antlr.g:185:7: '!'
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
            // chronos_antlr.g:187:5: ( '<=' )
            // chronos_antlr.g:187:7: '<='
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
            // chronos_antlr.g:189:5: ( '>=' )
            // chronos_antlr.g:189:7: '>='
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
            // chronos_antlr.g:191:5: ( '!=' )
            // chronos_antlr.g:191:7: '!='
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
            // chronos_antlr.g:193:4: ( '==' )
            // chronos_antlr.g:193:6: '=='
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
            // chronos_antlr.g:197:2: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // chronos_antlr.g:197:4: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // chronos_antlr.g:197:4: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '\t' && LA2_0 <= '\n')||(LA2_0 >= '\f' && LA2_0 <= '\r')||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
            // chronos_antlr.g:200:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // chronos_antlr.g:200:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // chronos_antlr.g:200:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
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
            	    break loop3;
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
            // chronos_antlr.g:203:5: ( ( '0' .. '9' )+ )
            // chronos_antlr.g:203:7: ( '0' .. '9' )+
            {
            // chronos_antlr.g:203:7: ( '0' .. '9' )+
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
            // chronos_antlr.g:207:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt11=3;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // chronos_antlr.g:207:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // chronos_antlr.g:207:9: ( '0' .. '9' )+
                    int cnt5=0;
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
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    match('.'); 

                    // chronos_antlr.g:207:25: ( '0' .. '9' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
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
                    	    break loop6;
                        }
                    } while (true);


                    // chronos_antlr.g:207:37: ( EXPONENT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='E'||LA7_0=='e') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // chronos_antlr.g:207:37: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // chronos_antlr.g:208:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 

                    // chronos_antlr.g:208:13: ( '0' .. '9' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
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
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    // chronos_antlr.g:208:25: ( EXPONENT )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='E'||LA9_0=='e') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // chronos_antlr.g:208:25: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // chronos_antlr.g:209:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // chronos_antlr.g:209:9: ( '0' .. '9' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
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
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
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
            // chronos_antlr.g:213:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='/') ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1=='/') ) {
                    alt15=1;
                }
                else if ( (LA15_1=='*') ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // chronos_antlr.g:213:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // chronos_antlr.g:213:14: (~ ( '\\n' | '\\r' ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0 >= '\u0000' && LA12_0 <= '\t')||(LA12_0 >= '\u000B' && LA12_0 <= '\f')||(LA12_0 >= '\u000E' && LA12_0 <= '\uFFFF')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
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
                    	    break loop12;
                        }
                    } while (true);


                    // chronos_antlr.g:213:28: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // chronos_antlr.g:213:28: '\\r'
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
                    // chronos_antlr.g:214:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // chronos_antlr.g:214:14: ( options {greedy=false; } : . )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='*') ) {
                            int LA14_1 = input.LA(2);

                            if ( (LA14_1=='/') ) {
                                alt14=2;
                            }
                            else if ( ((LA14_1 >= '\u0000' && LA14_1 <= '.')||(LA14_1 >= '0' && LA14_1 <= '\uFFFF')) ) {
                                alt14=1;
                            }


                        }
                        else if ( ((LA14_0 >= '\u0000' && LA14_0 <= ')')||(LA14_0 >= '+' && LA14_0 <= '\uFFFF')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // chronos_antlr.g:214:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
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
            // chronos_antlr.g:218:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // chronos_antlr.g:218:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // chronos_antlr.g:218:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop16:
            do {
                int alt16=3;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='\\') ) {
                    alt16=1;
                }
                else if ( ((LA16_0 >= '\u0000' && LA16_0 <= '!')||(LA16_0 >= '#' && LA16_0 <= '[')||(LA16_0 >= ']' && LA16_0 <= '\uFFFF')) ) {
                    alt16=2;
                }


                switch (alt16) {
            	case 1 :
            	    // chronos_antlr.g:218:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // chronos_antlr.g:218:24: ~ ( '\\\\' | '\"' )
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
            	    break loop16;
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
            // chronos_antlr.g:221:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
            // chronos_antlr.g:221:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 

            // chronos_antlr.g:221:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\\') ) {
                alt17=1;
            }
            else if ( ((LA17_0 >= '\u0000' && LA17_0 <= '&')||(LA17_0 >= '(' && LA17_0 <= '[')||(LA17_0 >= ']' && LA17_0 <= '\uFFFF')) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // chronos_antlr.g:221:15: ESC_SEQ
                    {
                    mESC_SEQ(); 


                    }
                    break;
                case 2 :
                    // chronos_antlr.g:221:25: ~ ( '\\'' | '\\\\' )
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

    // $ANTLR start "DAY"
    public final void mDAY() throws RecognitionException {
        try {
            // chronos_antlr.g:226:5: ( ( 'M' | 'T' | 'W' | 'R' | 'F' ) )
            // chronos_antlr.g:
            {
            if ( input.LA(1)=='F'||input.LA(1)=='M'||input.LA(1)=='R'||input.LA(1)=='T'||input.LA(1)=='W' ) {
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
    // $ANTLR end "DAY"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // chronos_antlr.g:230:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // chronos_antlr.g:230:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // chronos_antlr.g:230:22: ( '+' | '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='+'||LA18_0=='-') ) {
                alt18=1;
            }
            switch (alt18) {
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


            // chronos_antlr.g:230:33: ( '0' .. '9' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0 >= '0' && LA19_0 <= '9')) ) {
                    alt19=1;
                }


                switch (alt19) {
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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
            // chronos_antlr.g:233:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
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
            // chronos_antlr.g:237:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\\') ) {
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
                    alt20=1;
                    }
                    break;
                case 'u':
                    {
                    alt20=2;
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
                    alt20=3;
                    }
                    break;
                default:
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
                    // chronos_antlr.g:237:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // chronos_antlr.g:238:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // chronos_antlr.g:239:9: OCTAL_ESC
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
            // chronos_antlr.g:244:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\\') ) {
                int LA21_1 = input.LA(2);

                if ( ((LA21_1 >= '0' && LA21_1 <= '3')) ) {
                    int LA21_2 = input.LA(3);

                    if ( ((LA21_2 >= '0' && LA21_2 <= '7')) ) {
                        int LA21_4 = input.LA(4);

                        if ( ((LA21_4 >= '0' && LA21_4 <= '7')) ) {
                            alt21=1;
                        }
                        else {
                            alt21=2;
                        }
                    }
                    else {
                        alt21=3;
                    }
                }
                else if ( ((LA21_1 >= '4' && LA21_1 <= '7')) ) {
                    int LA21_3 = input.LA(3);

                    if ( ((LA21_3 >= '0' && LA21_3 <= '7')) ) {
                        alt21=2;
                    }
                    else {
                        alt21=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // chronos_antlr.g:244:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
                    // chronos_antlr.g:245:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
                    // chronos_antlr.g:246:9: '\\\\' ( '0' .. '7' )
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
            // chronos_antlr.g:251:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // chronos_antlr.g:251:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
        // chronos_antlr.g:1:8: ( T__49 | T__50 | IF_T | ELSE_T | NEW_T | FOREACH_T | IN_T | BREAK_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T | INT_T | DOUBLE_T | DAY_T | TIME_T | STRING_T | TIME | AND | OR | NOT | LEQ | GEQ | NEQ | EQ | WHITESPACE | ID | INT | FLOAT | COMMENT | STRING | CHAR )
        int alt22=33;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // chronos_antlr.g:1:10: T__49
                {
                mT__49(); 


                }
                break;
            case 2 :
                // chronos_antlr.g:1:16: T__50
                {
                mT__50(); 


                }
                break;
            case 3 :
                // chronos_antlr.g:1:22: IF_T
                {
                mIF_T(); 


                }
                break;
            case 4 :
                // chronos_antlr.g:1:27: ELSE_T
                {
                mELSE_T(); 


                }
                break;
            case 5 :
                // chronos_antlr.g:1:34: NEW_T
                {
                mNEW_T(); 


                }
                break;
            case 6 :
                // chronos_antlr.g:1:40: FOREACH_T
                {
                mFOREACH_T(); 


                }
                break;
            case 7 :
                // chronos_antlr.g:1:50: IN_T
                {
                mIN_T(); 


                }
                break;
            case 8 :
                // chronos_antlr.g:1:55: BREAK_T
                {
                mBREAK_T(); 


                }
                break;
            case 9 :
                // chronos_antlr.g:1:63: SCHEDULE_T
                {
                mSCHEDULE_T(); 


                }
                break;
            case 10 :
                // chronos_antlr.g:1:74: COURSE_T
                {
                mCOURSE_T(); 


                }
                break;
            case 11 :
                // chronos_antlr.g:1:83: COURSELIST_T
                {
                mCOURSELIST_T(); 


                }
                break;
            case 12 :
                // chronos_antlr.g:1:96: TIMEBLOCK_T
                {
                mTIMEBLOCK_T(); 


                }
                break;
            case 13 :
                // chronos_antlr.g:1:108: DATETIME_T
                {
                mDATETIME_T(); 


                }
                break;
            case 14 :
                // chronos_antlr.g:1:119: INT_T
                {
                mINT_T(); 


                }
                break;
            case 15 :
                // chronos_antlr.g:1:125: DOUBLE_T
                {
                mDOUBLE_T(); 


                }
                break;
            case 16 :
                // chronos_antlr.g:1:134: DAY_T
                {
                mDAY_T(); 


                }
                break;
            case 17 :
                // chronos_antlr.g:1:140: TIME_T
                {
                mTIME_T(); 


                }
                break;
            case 18 :
                // chronos_antlr.g:1:147: STRING_T
                {
                mSTRING_T(); 


                }
                break;
            case 19 :
                // chronos_antlr.g:1:156: TIME
                {
                mTIME(); 


                }
                break;
            case 20 :
                // chronos_antlr.g:1:161: AND
                {
                mAND(); 


                }
                break;
            case 21 :
                // chronos_antlr.g:1:165: OR
                {
                mOR(); 


                }
                break;
            case 22 :
                // chronos_antlr.g:1:168: NOT
                {
                mNOT(); 


                }
                break;
            case 23 :
                // chronos_antlr.g:1:172: LEQ
                {
                mLEQ(); 


                }
                break;
            case 24 :
                // chronos_antlr.g:1:176: GEQ
                {
                mGEQ(); 


                }
                break;
            case 25 :
                // chronos_antlr.g:1:180: NEQ
                {
                mNEQ(); 


                }
                break;
            case 26 :
                // chronos_antlr.g:1:184: EQ
                {
                mEQ(); 


                }
                break;
            case 27 :
                // chronos_antlr.g:1:187: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 28 :
                // chronos_antlr.g:1:198: ID
                {
                mID(); 


                }
                break;
            case 29 :
                // chronos_antlr.g:1:201: INT
                {
                mINT(); 


                }
                break;
            case 30 :
                // chronos_antlr.g:1:205: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 31 :
                // chronos_antlr.g:1:211: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 32 :
                // chronos_antlr.g:1:219: STRING
                {
                mSTRING(); 


                }
                break;
            case 33 :
                // chronos_antlr.g:1:226: CHAR
                {
                mCHAR(); 


                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA11_eotS =
        "\5\uffff";
    static final String DFA11_eofS =
        "\5\uffff";
    static final String DFA11_minS =
        "\2\56\3\uffff";
    static final String DFA11_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA11_specialS =
        "\5\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "206:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA22_eotS =
        "\3\uffff\11\25\2\47\2\uffff\1\52\11\uffff\1\53\1\55\12\25\2\uffff"+
        "\1\47\3\uffff\1\71\1\uffff\1\25\1\73\7\25\1\103\1\25\1\uffff\1\105"+
        "\1\uffff\5\25\1\114\1\25\1\uffff\1\25\1\uffff\1\25\1\120\4\25\1"+
        "\uffff\3\25\1\uffff\1\25\1\131\1\133\2\25\1\136\1\137\1\25\1\uffff"+
        "\1\25\1\uffff\2\25\2\uffff\1\144\2\25\1\147\1\uffff\1\25\1\151\1"+
        "\uffff\1\152\2\uffff";
    static final String DFA22_eofS =
        "\153\uffff";
    static final String DFA22_minS =
        "\1\11\2\uffff\1\146\1\154\1\145\1\157\1\162\1\143\1\157\1\151\1"+
        "\141\2\56\2\uffff\1\75\11\uffff\2\60\1\163\1\167\1\162\1\145\1\150"+
        "\1\162\1\165\1\155\1\164\1\165\2\uffff\1\56\3\uffff\1\60\1\uffff"+
        "\1\145\1\60\1\145\1\141\1\145\1\151\1\162\2\145\1\60\1\142\1\uffff"+
        "\1\60\1\uffff\1\141\1\153\1\144\1\156\1\163\1\60\1\164\1\uffff\1"+
        "\154\1\uffff\1\143\1\60\1\165\1\147\1\145\1\154\1\uffff\1\151\1"+
        "\145\1\150\1\uffff\1\154\2\60\1\157\1\155\2\60\1\145\1\uffff\1\151"+
        "\1\uffff\1\143\1\145\2\uffff\1\60\1\163\1\153\1\60\1\uffff\1\164"+
        "\1\60\1\uffff\1\60\2\uffff";
    static final String DFA22_maxS =
        "\1\174\2\uffff\1\156\1\154\1\145\1\157\1\162\1\164\1\157\1\151\1"+
        "\157\2\145\2\uffff\1\75\11\uffff\2\172\1\163\1\167\1\162\1\145\1"+
        "\150\1\162\1\165\1\155\1\171\1\165\2\uffff\1\145\3\uffff\1\172\1"+
        "\uffff\1\145\1\172\1\145\1\141\1\145\1\151\1\162\2\145\1\172\1\142"+
        "\1\uffff\1\172\1\uffff\1\141\1\153\1\144\1\156\1\163\1\172\1\164"+
        "\1\uffff\1\154\1\uffff\1\143\1\172\1\165\1\147\1\145\1\154\1\uffff"+
        "\1\151\1\145\1\150\1\uffff\1\154\2\172\1\157\1\155\2\172\1\145\1"+
        "\uffff\1\151\1\uffff\1\143\1\145\2\uffff\1\172\1\163\1\153\1\172"+
        "\1\uffff\1\164\1\172\1\uffff\1\172\2\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\1\1\2\13\uffff\1\24\1\25\1\uffff\1\27\1\30\1\32\1\33"+
        "\1\34\1\36\1\37\1\40\1\41\14\uffff\1\23\1\35\1\uffff\1\31\1\26\1"+
        "\3\1\uffff\1\7\13\uffff\1\16\1\uffff\1\5\7\uffff\1\20\1\uffff\1"+
        "\4\6\uffff\1\21\3\uffff\1\10\10\uffff\1\22\1\uffff\1\12\2\uffff"+
        "\1\17\1\6\4\uffff\1\11\2\uffff\1\15\1\uffff\1\14\1\13";
    static final String DFA22_specialS =
        "\153\uffff}>";
    static final String[] DFA22_transitionS = {
            "\2\24\1\uffff\2\24\22\uffff\1\24\1\20\1\30\3\uffff\1\16\1\31"+
            "\2\uffff\1\1\1\2\2\uffff\1\26\1\27\3\14\7\15\2\uffff\1\21\1"+
            "\23\1\22\2\uffff\32\25\4\uffff\1\25\1\uffff\1\25\1\7\1\11\1"+
            "\13\1\4\1\6\2\25\1\3\4\25\1\5\4\25\1\10\1\12\6\25\1\uffff\1"+
            "\17",
            "",
            "",
            "\1\32\7\uffff\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40\20\uffff\1\41",
            "\1\42",
            "\1\43",
            "\1\44\15\uffff\1\45",
            "\1\26\1\uffff\12\15\1\46\12\uffff\1\26\37\uffff\1\26",
            "\1\26\1\uffff\12\50\1\46\12\uffff\1\26\37\uffff\1\26",
            "",
            "",
            "\1\51",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\23\25\1\54\6\25",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66\4\uffff\1\67",
            "\1\70",
            "",
            "",
            "\1\26\1\uffff\12\50\13\uffff\1\26\37\uffff\1\26",
            "",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\72",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\104",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\1\25\1\113\30\25",
            "\1\115",
            "",
            "\1\116",
            "",
            "\1\117",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "",
            "\1\125",
            "\1\126",
            "\1\127",
            "",
            "\1\130",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\13\25\1\132\16\25",
            "\1\134",
            "\1\135",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\140",
            "",
            "\1\141",
            "",
            "\1\142",
            "\1\143",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\145",
            "\1\146",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\150",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__49 | T__50 | IF_T | ELSE_T | NEW_T | FOREACH_T | IN_T | BREAK_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T | INT_T | DOUBLE_T | DAY_T | TIME_T | STRING_T | TIME | AND | OR | NOT | LEQ | GEQ | NEQ | EQ | WHITESPACE | ID | INT | FLOAT | COMMENT | STRING | CHAR );";
        }
    }
 

}