// $ANTLR 3.4 src/grammar/Chronos.g 2012-05-06 11:52:41

	package chronos.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ChronosLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
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
    public static final int DAYBLOCK_T=15;
    public static final int DAYS=16;
    public static final int DECL=17;
    public static final int DOUBLE=18;
    public static final int DOUBLE_T=19;
    public static final int ELSE_T=20;
    public static final int EQ=21;
    public static final int ESC_SEQ=22;
    public static final int FOREACH_T=23;
    public static final int FUNC=24;
    public static final int GEQ=25;
    public static final int HEX_DIGIT=26;
    public static final int ID=27;
    public static final int IF_T=28;
    public static final int INST=29;
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
    public static final int PRINT_T=40;
    public static final int SCHEDULE_T=41;
    public static final int STRING=42;
    public static final int STRING_T=43;
    public static final int TIME=44;
    public static final int TIMEBLOCK_T=45;
    public static final int TIMES=46;
    public static final int TIME_T=47;
    public static final int UNICODE_ESC=48;
    public static final int WS=49;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ChronosLexer() {} 
    public ChronosLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ChronosLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "src/grammar/Chronos.g"; }

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:11:7: ( '(' )
            // src/grammar/Chronos.g:11:9: '('
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
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:12:7: ( ')' )
            // src/grammar/Chronos.g:12:9: ')'
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
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:13:7: ( '*' )
            // src/grammar/Chronos.g:13:9: '*'
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
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:14:7: ( '+' )
            // src/grammar/Chronos.g:14:9: '+'
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
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:15:7: ( ',' )
            // src/grammar/Chronos.g:15:9: ','
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
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:16:7: ( '-' )
            // src/grammar/Chronos.g:16:9: '-'
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
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:17:7: ( '.' )
            // src/grammar/Chronos.g:17:9: '.'
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
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:18:7: ( '/' )
            // src/grammar/Chronos.g:18:9: '/'
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
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:19:7: ( ';' )
            // src/grammar/Chronos.g:19:9: ';'
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
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:20:7: ( '<' )
            // src/grammar/Chronos.g:20:9: '<'
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
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:21:7: ( '=' )
            // src/grammar/Chronos.g:21:9: '='
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
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:22:7: ( '>' )
            // src/grammar/Chronos.g:22:9: '>'
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
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:23:7: ( '[' )
            // src/grammar/Chronos.g:23:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:24:7: ( ']' )
            // src/grammar/Chronos.g:24:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:25:7: ( '{' )
            // src/grammar/Chronos.g:25:9: '{'
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
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:26:7: ( '}' )
            // src/grammar/Chronos.g:26:9: '}'
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
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:27:7: ( '~' )
            // src/grammar/Chronos.g:27:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "IF_T"
    public final void mIF_T() throws RecognitionException {
        try {
            int _type = IF_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:161:7: ( 'if' )
            // src/grammar/Chronos.g:161:9: 'if'
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
            // src/grammar/Chronos.g:163:8: ( 'else' )
            // src/grammar/Chronos.g:163:10: 'else'
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
            // src/grammar/Chronos.g:165:8: ( 'new' )
            // src/grammar/Chronos.g:165:10: 'new'
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
            // src/grammar/Chronos.g:167:11: ( 'foreach' )
            // src/grammar/Chronos.g:167:13: 'foreach'
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
            // src/grammar/Chronos.g:169:6: ( 'in' )
            // src/grammar/Chronos.g:169:8: 'in'
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
            // src/grammar/Chronos.g:171:9: ( 'break' )
            // src/grammar/Chronos.g:171:11: 'break'
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
            // src/grammar/Chronos.g:173:11: ( 'schedule' )
            // src/grammar/Chronos.g:173:13: 'schedule'
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
            // src/grammar/Chronos.g:175:9: ( 'course' )
            // src/grammar/Chronos.g:175:11: 'course'
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
            // src/grammar/Chronos.g:177:13: ( 'courselist' )
            // src/grammar/Chronos.g:177:15: 'courselist'
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
            // src/grammar/Chronos.g:179:12: ( 'timeblock' )
            // src/grammar/Chronos.g:179:14: 'timeblock'
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
            // src/grammar/Chronos.g:181:11: ( 'datetime' )
            // src/grammar/Chronos.g:181:14: 'datetime'
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
            // src/grammar/Chronos.g:183:7: ( 'int' )
            // src/grammar/Chronos.g:183:9: 'int'
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
            // src/grammar/Chronos.g:185:9: ( 'double' )
            // src/grammar/Chronos.g:185:11: 'double'
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

    // $ANTLR start "DAYBLOCK_T"
    public final void mDAYBLOCK_T() throws RecognitionException {
        try {
            int _type = DAYBLOCK_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:187:12: ( 'dayblock' )
            // src/grammar/Chronos.g:187:14: 'dayblock'
            {
            match("dayblock"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DAYBLOCK_T"

    // $ANTLR start "TIME_T"
    public final void mTIME_T() throws RecognitionException {
        try {
            int _type = TIME_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:189:8: ( 'time' )
            // src/grammar/Chronos.g:189:10: 'time'
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
            // src/grammar/Chronos.g:191:9: ( 'string' )
            // src/grammar/Chronos.g:191:11: 'string'
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

    // $ANTLR start "PRINT_T"
    public final void mPRINT_T() throws RecognitionException {
        try {
            int _type = PRINT_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:193:8: ( 'print' )
            // src/grammar/Chronos.g:193:10: 'print'
            {
            match("print"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRINT_T"

    // $ANTLR start "TIME"
    public final void mTIME() throws RecognitionException {
        try {
            int _type = TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:196:2: ( ( '0' .. '2' )? ( '0' .. '9' ) ':' ( '0' .. '5' ) ( '0' .. '9' ) )
            // src/grammar/Chronos.g:196:4: ( '0' .. '2' )? ( '0' .. '9' ) ':' ( '0' .. '5' ) ( '0' .. '9' )
            {
            // src/grammar/Chronos.g:196:4: ( '0' .. '2' )?
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
                    // src/grammar/Chronos.g:
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
            // src/grammar/Chronos.g:202:5: ( '&&' )
            // src/grammar/Chronos.g:202:7: '&&'
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
            // src/grammar/Chronos.g:204:4: ( '||' )
            // src/grammar/Chronos.g:204:6: '||'
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
            // src/grammar/Chronos.g:206:5: ( '!' )
            // src/grammar/Chronos.g:206:7: '!'
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
            // src/grammar/Chronos.g:208:5: ( '<=' )
            // src/grammar/Chronos.g:208:7: '<='
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
            // src/grammar/Chronos.g:210:5: ( '>=' )
            // src/grammar/Chronos.g:210:7: '>='
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
            // src/grammar/Chronos.g:212:5: ( '!=' )
            // src/grammar/Chronos.g:212:7: '!='
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
            // src/grammar/Chronos.g:214:4: ( '==' )
            // src/grammar/Chronos.g:214:6: '=='
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

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:217:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // src/grammar/Chronos.g:217:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // src/grammar/Chronos.g:217:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // src/grammar/Chronos.g:
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
            // src/grammar/Chronos.g:220:5: ( ( '0' .. '9' )+ )
            // src/grammar/Chronos.g:220:7: ( '0' .. '9' )+
            {
            // src/grammar/Chronos.g:220:7: ( '0' .. '9' )+
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
            	    // src/grammar/Chronos.g:
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

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:224:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // src/grammar/Chronos.g:224:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
                    {
                    // src/grammar/Chronos.g:224:9: ( '0' .. '9' )+
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
                    	    // src/grammar/Chronos.g:
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

                    // src/grammar/Chronos.g:224:25: ( '0' .. '9' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // src/grammar/Chronos.g:
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


                    }
                    break;
                case 2 :
                    // src/grammar/Chronos.g:225:9: '.' ( '0' .. '9' )+
                    {
                    match('.'); 

                    // src/grammar/Chronos.g:225:13: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // src/grammar/Chronos.g:
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
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // src/grammar/Chronos.g:226:9: ( '0' .. '9' )+
                    {
                    // src/grammar/Chronos.g:226:9: ( '0' .. '9' )+
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
                    	    // src/grammar/Chronos.g:
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
    // $ANTLR end "DOUBLE"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:230:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='/') ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1=='/') ) {
                    alt12=1;
                }
                else if ( (LA12_1=='*') ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // src/grammar/Chronos.g:230:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // src/grammar/Chronos.g:230:14: (~ ( '\\n' | '\\r' ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||(LA9_0 >= '\u000B' && LA9_0 <= '\f')||(LA9_0 >= '\u000E' && LA9_0 <= '\uFFFF')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // src/grammar/Chronos.g:
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
                    	    break loop9;
                        }
                    } while (true);


                    // src/grammar/Chronos.g:230:28: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // src/grammar/Chronos.g:230:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // src/grammar/Chronos.g:231:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // src/grammar/Chronos.g:231:14: ( options {greedy=false; } : . )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='*') ) {
                            int LA11_1 = input.LA(2);

                            if ( (LA11_1=='/') ) {
                                alt11=2;
                            }
                            else if ( ((LA11_1 >= '\u0000' && LA11_1 <= '.')||(LA11_1 >= '0' && LA11_1 <= '\uFFFF')) ) {
                                alt11=1;
                            }


                        }
                        else if ( ((LA11_0 >= '\u0000' && LA11_0 <= ')')||(LA11_0 >= '+' && LA11_0 <= '\uFFFF')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // src/grammar/Chronos.g:231:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:234:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // src/grammar/Chronos.g:234:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:242:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // src/grammar/Chronos.g:242:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // src/grammar/Chronos.g:242:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='\\') ) {
                    alt13=1;
                }
                else if ( ((LA13_0 >= '\u0000' && LA13_0 <= '!')||(LA13_0 >= '#' && LA13_0 <= '[')||(LA13_0 >= ']' && LA13_0 <= '\uFFFF')) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // src/grammar/Chronos.g:242:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // src/grammar/Chronos.g:242:24: ~ ( '\\\\' | '\"' )
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
            	    break loop13;
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
            // src/grammar/Chronos.g:245:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
            // src/grammar/Chronos.g:245:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 

            // src/grammar/Chronos.g:245:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\\') ) {
                alt14=1;
            }
            else if ( ((LA14_0 >= '\u0000' && LA14_0 <= '&')||(LA14_0 >= '(' && LA14_0 <= '[')||(LA14_0 >= ']' && LA14_0 <= '\uFFFF')) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // src/grammar/Chronos.g:245:15: ESC_SEQ
                    {
                    mESC_SEQ(); 


                    }
                    break;
                case 2 :
                    // src/grammar/Chronos.g:245:25: ~ ( '\\'' | '\\\\' )
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
            // src/grammar/Chronos.g:250:5: ( ( 'M' | 'T' | 'W' | 'R' | 'F' ) )
            // src/grammar/Chronos.g:
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

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // src/grammar/Chronos.g:254:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // src/grammar/Chronos.g:
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
            // src/grammar/Chronos.g:258:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\\') ) {
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
                    alt15=1;
                    }
                    break;
                case 'u':
                    {
                    alt15=2;
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
                    alt15=3;
                    }
                    break;
                default:
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
                    // src/grammar/Chronos.g:258:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // src/grammar/Chronos.g:259:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // src/grammar/Chronos.g:260:9: OCTAL_ESC
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
            // src/grammar/Chronos.g:265:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\\') ) {
                int LA16_1 = input.LA(2);

                if ( ((LA16_1 >= '0' && LA16_1 <= '3')) ) {
                    int LA16_2 = input.LA(3);

                    if ( ((LA16_2 >= '0' && LA16_2 <= '7')) ) {
                        int LA16_4 = input.LA(4);

                        if ( ((LA16_4 >= '0' && LA16_4 <= '7')) ) {
                            alt16=1;
                        }
                        else {
                            alt16=2;
                        }
                    }
                    else {
                        alt16=3;
                    }
                }
                else if ( ((LA16_1 >= '4' && LA16_1 <= '7')) ) {
                    int LA16_3 = input.LA(3);

                    if ( ((LA16_3 >= '0' && LA16_3 <= '7')) ) {
                        alt16=2;
                    }
                    else {
                        alt16=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // src/grammar/Chronos.g:265:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
                    // src/grammar/Chronos.g:266:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
                    // src/grammar/Chronos.g:267:9: '\\\\' ( '0' .. '7' )
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
            // src/grammar/Chronos.g:272:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // src/grammar/Chronos.g:272:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
        // src/grammar/Chronos.g:1:8: ( T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | IF_T | ELSE_T | NEW_T | FOREACH_T | IN_T | BREAK_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T | INT_T | DOUBLE_T | DAYBLOCK_T | TIME_T | STRING_T | PRINT_T | TIME | AND | OR | NOT | LEQ | GEQ | NEQ | EQ | ID | INT | DOUBLE | COMMENT | WS | STRING | CHAR )
        int alt17=49;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // src/grammar/Chronos.g:1:10: T__50
                {
                mT__50(); 


                }
                break;
            case 2 :
                // src/grammar/Chronos.g:1:16: T__51
                {
                mT__51(); 


                }
                break;
            case 3 :
                // src/grammar/Chronos.g:1:22: T__52
                {
                mT__52(); 


                }
                break;
            case 4 :
                // src/grammar/Chronos.g:1:28: T__53
                {
                mT__53(); 


                }
                break;
            case 5 :
                // src/grammar/Chronos.g:1:34: T__54
                {
                mT__54(); 


                }
                break;
            case 6 :
                // src/grammar/Chronos.g:1:40: T__55
                {
                mT__55(); 


                }
                break;
            case 7 :
                // src/grammar/Chronos.g:1:46: T__56
                {
                mT__56(); 


                }
                break;
            case 8 :
                // src/grammar/Chronos.g:1:52: T__57
                {
                mT__57(); 


                }
                break;
            case 9 :
                // src/grammar/Chronos.g:1:58: T__58
                {
                mT__58(); 


                }
                break;
            case 10 :
                // src/grammar/Chronos.g:1:64: T__59
                {
                mT__59(); 


                }
                break;
            case 11 :
                // src/grammar/Chronos.g:1:70: T__60
                {
                mT__60(); 


                }
                break;
            case 12 :
                // src/grammar/Chronos.g:1:76: T__61
                {
                mT__61(); 


                }
                break;
            case 13 :
                // src/grammar/Chronos.g:1:82: T__62
                {
                mT__62(); 


                }
                break;
            case 14 :
                // src/grammar/Chronos.g:1:88: T__63
                {
                mT__63(); 


                }
                break;
            case 15 :
                // src/grammar/Chronos.g:1:94: T__64
                {
                mT__64(); 


                }
                break;
            case 16 :
                // src/grammar/Chronos.g:1:100: T__65
                {
                mT__65(); 


                }
                break;
            case 17 :
                // src/grammar/Chronos.g:1:106: T__66
                {
                mT__66(); 


                }
                break;
            case 18 :
                // src/grammar/Chronos.g:1:112: IF_T
                {
                mIF_T(); 


                }
                break;
            case 19 :
                // src/grammar/Chronos.g:1:117: ELSE_T
                {
                mELSE_T(); 


                }
                break;
            case 20 :
                // src/grammar/Chronos.g:1:124: NEW_T
                {
                mNEW_T(); 


                }
                break;
            case 21 :
                // src/grammar/Chronos.g:1:130: FOREACH_T
                {
                mFOREACH_T(); 


                }
                break;
            case 22 :
                // src/grammar/Chronos.g:1:140: IN_T
                {
                mIN_T(); 


                }
                break;
            case 23 :
                // src/grammar/Chronos.g:1:145: BREAK_T
                {
                mBREAK_T(); 


                }
                break;
            case 24 :
                // src/grammar/Chronos.g:1:153: SCHEDULE_T
                {
                mSCHEDULE_T(); 


                }
                break;
            case 25 :
                // src/grammar/Chronos.g:1:164: COURSE_T
                {
                mCOURSE_T(); 


                }
                break;
            case 26 :
                // src/grammar/Chronos.g:1:173: COURSELIST_T
                {
                mCOURSELIST_T(); 


                }
                break;
            case 27 :
                // src/grammar/Chronos.g:1:186: TIMEBLOCK_T
                {
                mTIMEBLOCK_T(); 


                }
                break;
            case 28 :
                // src/grammar/Chronos.g:1:198: DATETIME_T
                {
                mDATETIME_T(); 


                }
                break;
            case 29 :
                // src/grammar/Chronos.g:1:209: INT_T
                {
                mINT_T(); 


                }
                break;
            case 30 :
                // src/grammar/Chronos.g:1:215: DOUBLE_T
                {
                mDOUBLE_T(); 


                }
                break;
            case 31 :
                // src/grammar/Chronos.g:1:224: DAYBLOCK_T
                {
                mDAYBLOCK_T(); 


                }
                break;
            case 32 :
                // src/grammar/Chronos.g:1:235: TIME_T
                {
                mTIME_T(); 


                }
                break;
            case 33 :
                // src/grammar/Chronos.g:1:242: STRING_T
                {
                mSTRING_T(); 


                }
                break;
            case 34 :
                // src/grammar/Chronos.g:1:251: PRINT_T
                {
                mPRINT_T(); 


                }
                break;
            case 35 :
                // src/grammar/Chronos.g:1:259: TIME
                {
                mTIME(); 


                }
                break;
            case 36 :
                // src/grammar/Chronos.g:1:264: AND
                {
                mAND(); 


                }
                break;
            case 37 :
                // src/grammar/Chronos.g:1:268: OR
                {
                mOR(); 


                }
                break;
            case 38 :
                // src/grammar/Chronos.g:1:271: NOT
                {
                mNOT(); 


                }
                break;
            case 39 :
                // src/grammar/Chronos.g:1:275: LEQ
                {
                mLEQ(); 


                }
                break;
            case 40 :
                // src/grammar/Chronos.g:1:279: GEQ
                {
                mGEQ(); 


                }
                break;
            case 41 :
                // src/grammar/Chronos.g:1:283: NEQ
                {
                mNEQ(); 


                }
                break;
            case 42 :
                // src/grammar/Chronos.g:1:287: EQ
                {
                mEQ(); 


                }
                break;
            case 43 :
                // src/grammar/Chronos.g:1:290: ID
                {
                mID(); 


                }
                break;
            case 44 :
                // src/grammar/Chronos.g:1:293: INT
                {
                mINT(); 


                }
                break;
            case 45 :
                // src/grammar/Chronos.g:1:297: DOUBLE
                {
                mDOUBLE(); 


                }
                break;
            case 46 :
                // src/grammar/Chronos.g:1:304: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 47 :
                // src/grammar/Chronos.g:1:312: WS
                {
                mWS(); 


                }
                break;
            case 48 :
                // src/grammar/Chronos.g:1:315: STRING
                {
                mSTRING(); 


                }
                break;
            case 49 :
                // src/grammar/Chronos.g:1:322: CHAR
                {
                mCHAR(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA8_eotS =
        "\1\uffff\1\4\3\uffff";
    static final String DFA8_eofS =
        "\5\uffff";
    static final String DFA8_minS =
        "\2\56\3\uffff";
    static final String DFA8_maxS =
        "\2\71\3\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA8_specialS =
        "\5\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "223:1: DOUBLE : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ );";
        }
    }
    static final String DFA17_eotS =
        "\7\uffff\1\45\1\50\1\uffff\1\52\1\54\1\56\5\uffff\12\41\2\75\2\uffff"+
        "\1\100\16\uffff\1\101\1\103\13\41\2\uffff\1\75\3\uffff\1\120\1\uffff"+
        "\1\41\1\122\12\41\1\uffff\1\135\1\uffff\5\41\1\144\4\41\1\uffff"+
        "\1\41\1\152\4\41\1\uffff\3\41\1\162\1\41\1\uffff\1\41\1\165\1\167"+
        "\3\41\1\173\1\uffff\1\174\1\41\1\uffff\1\41\1\uffff\3\41\2\uffff"+
        "\1\u0082\2\41\1\u0085\1\u0086\1\uffff\1\41\1\u0088\2\uffff\1\u0089"+
        "\2\uffff";
    static final String DFA17_eofS =
        "\u008a\uffff";
    static final String DFA17_minS =
        "\1\11\6\uffff\1\60\1\52\1\uffff\3\75\5\uffff\1\146\1\154\1\145\1"+
        "\157\1\162\1\143\1\157\1\151\1\141\1\162\2\56\2\uffff\1\75\16\uffff"+
        "\2\60\1\163\1\167\1\162\1\145\1\150\1\162\1\165\1\155\1\164\1\165"+
        "\1\151\2\uffff\1\56\3\uffff\1\60\1\uffff\1\145\1\60\1\145\1\141"+
        "\1\145\1\151\1\162\2\145\2\142\1\156\1\uffff\1\60\1\uffff\1\141"+
        "\1\153\1\144\1\156\1\163\1\60\1\164\2\154\1\164\1\uffff\1\143\1"+
        "\60\1\165\1\147\1\145\1\154\1\uffff\1\151\1\157\1\145\1\60\1\150"+
        "\1\uffff\1\154\2\60\1\157\1\155\1\143\1\60\1\uffff\1\60\1\145\1"+
        "\uffff\1\151\1\uffff\1\143\1\145\1\153\2\uffff\1\60\1\163\1\153"+
        "\2\60\1\uffff\1\164\1\60\2\uffff\1\60\2\uffff";
    static final String DFA17_maxS =
        "\1\176\6\uffff\1\71\1\57\1\uffff\3\75\5\uffff\1\156\1\154\1\145"+
        "\1\157\1\162\1\164\1\157\1\151\1\157\1\162\2\72\2\uffff\1\75\16"+
        "\uffff\2\172\1\163\1\167\1\162\1\145\1\150\1\162\1\165\1\155\1\171"+
        "\1\165\1\151\2\uffff\1\71\3\uffff\1\172\1\uffff\1\145\1\172\1\145"+
        "\1\141\1\145\1\151\1\162\2\145\2\142\1\156\1\uffff\1\172\1\uffff"+
        "\1\141\1\153\1\144\1\156\1\163\1\172\1\164\2\154\1\164\1\uffff\1"+
        "\143\1\172\1\165\1\147\1\145\1\154\1\uffff\1\151\1\157\1\145\1\172"+
        "\1\150\1\uffff\1\154\2\172\1\157\1\155\1\143\1\172\1\uffff\1\172"+
        "\1\145\1\uffff\1\151\1\uffff\1\143\1\145\1\153\2\uffff\1\172\1\163"+
        "\1\153\2\172\1\uffff\1\164\1\172\2\uffff\1\172\2\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff\1\11\3\uffff\1\15\1\16"+
        "\1\17\1\20\1\21\14\uffff\1\44\1\45\1\uffff\1\53\1\57\1\60\1\61\1"+
        "\7\1\55\1\56\1\10\1\47\1\12\1\52\1\13\1\50\1\14\15\uffff\1\43\1"+
        "\54\1\uffff\1\51\1\46\1\22\1\uffff\1\26\14\uffff\1\35\1\uffff\1"+
        "\24\12\uffff\1\23\6\uffff\1\40\5\uffff\1\27\7\uffff\1\42\2\uffff"+
        "\1\41\1\uffff\1\31\3\uffff\1\36\1\25\5\uffff\1\30\2\uffff\1\34\1"+
        "\37\1\uffff\1\33\1\32";
    static final String DFA17_specialS =
        "\u008a\uffff}>";
    static final String[] DFA17_transitionS = {
            "\2\42\2\uffff\1\42\22\uffff\1\42\1\40\1\43\3\uffff\1\36\1\44"+
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\3\34\7\35\1\uffff\1\11\1\12"+
            "\1\13\1\14\2\uffff\32\41\1\15\1\uffff\1\16\1\uffff\1\41\1\uffff"+
            "\1\41\1\26\1\30\1\32\1\23\1\25\2\41\1\22\4\41\1\24\1\41\1\33"+
            "\2\41\1\27\1\31\6\41\1\17\1\37\1\20\1\21",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\46",
            "\1\47\4\uffff\1\47",
            "",
            "\1\51",
            "\1\53",
            "\1\55",
            "",
            "",
            "",
            "",
            "",
            "\1\57\7\uffff\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65\20\uffff\1\66",
            "\1\67",
            "\1\70",
            "\1\71\15\uffff\1\72",
            "\1\73",
            "\1\46\1\uffff\12\35\1\74",
            "\1\46\1\uffff\12\76\1\74",
            "",
            "",
            "\1\77",
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
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\23\41\1\102\6\41",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114\4\uffff\1\115",
            "\1\116",
            "\1\117",
            "",
            "",
            "\1\46\1\uffff\12\76",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\121",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\1\41\1\143\30\41",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "",
            "\1\151",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\163",
            "",
            "\1\164",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\13\41\1\166\16\41",
            "\1\170",
            "\1\171",
            "\1\172",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\175",
            "",
            "\1\176",
            "",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0083",
            "\1\u0084",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u0087",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
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
            return "1:1: Tokens : ( T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | IF_T | ELSE_T | NEW_T | FOREACH_T | IN_T | BREAK_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T | INT_T | DOUBLE_T | DAYBLOCK_T | TIME_T | STRING_T | PRINT_T | TIME | AND | OR | NOT | LEQ | GEQ | NEQ | EQ | ID | INT | DOUBLE | COMMENT | WS | STRING | CHAR );";
        }
    }
 

}