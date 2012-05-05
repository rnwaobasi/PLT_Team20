// $ANTLR 3.4 src/grammar/Chronos.g 2012-05-04 22:00:57

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ChronosLexer extends Lexer {
    public static final int EOF=-1;
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
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int AND=4;
    public static final int BLOCK=5;
    public static final int BREAK_T=6;
    public static final int CHAR=7;
    public static final int COMMENT=8;
    public static final int COND=9;
    public static final int CONST=10;
    public static final int COURSELIST_T=11;
    public static final int COURSE_T=12;
    public static final int DATETIME=13;
    public static final int DATETIME_T=14;
    public static final int DAY=15;
    public static final int DAYS=16;
    public static final int DAYS_T=17;
    public static final int DECL=18;
    public static final int DOUBLE_T=19;
    public static final int ELSE_T=20;
    public static final int EQ=21;
    public static final int ESC_SEQ=22;
    public static final int EXPONENT=23;
    public static final int EXPR=24;
    public static final int FLOAT=25;
    public static final int FOREACH_T=26;
    public static final int GEQ=27;
    public static final int HEX_DIGIT=28;
    public static final int ID=29;
    public static final int IDENT=30;
    public static final int IF_T=31;
    public static final int INST=32;
    public static final int INT=33;
    public static final int INT_T=34;
    public static final int IN_T=35;
    public static final int LEQ=36;
    public static final int NEQ=37;
    public static final int NEW_T=38;
    public static final int NOT=39;
    public static final int OCTAL_ESC=40;
    public static final int OR=41;
    public static final int PARAMS=42;
    public static final int PARENS=43;
    public static final int SCHEDULE_T=44;
    public static final int STR=45;
    public static final int STRING=46;
    public static final int STRING_T=47;
    public static final int TIM=48;
    public static final int TIME=49;
    public static final int TIMEBLOCK_T=50;
    public static final int TIMES=51;
    public static final int TIME_T=52;
    public static final int UNICODE_ESC=53;
    public static final int WHITESPACE=54;

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

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:7:7: ( '(' )
            // src/grammar/Chronos.g:7:9: '('
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
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:8:7: ( ')' )
            // src/grammar/Chronos.g:8:9: ')'
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
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:9:7: ( '*' )
            // src/grammar/Chronos.g:9:9: '*'
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
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:10:7: ( '+' )
            // src/grammar/Chronos.g:10:9: '+'
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
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:11:7: ( ',' )
            // src/grammar/Chronos.g:11:9: ','
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
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:12:7: ( '-' )
            // src/grammar/Chronos.g:12:9: '-'
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
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:13:7: ( '.' )
            // src/grammar/Chronos.g:13:9: '.'
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
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:14:7: ( '/' )
            // src/grammar/Chronos.g:14:9: '/'
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
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:15:7: ( ';' )
            // src/grammar/Chronos.g:15:9: ';'
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
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:16:7: ( '<' )
            // src/grammar/Chronos.g:16:9: '<'
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
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:17:7: ( '=' )
            // src/grammar/Chronos.g:17:9: '='
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
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:18:7: ( '>' )
            // src/grammar/Chronos.g:18:9: '>'
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
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:19:7: ( '[' )
            // src/grammar/Chronos.g:19:9: '['
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
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:20:7: ( ']' )
            // src/grammar/Chronos.g:20:9: ']'
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
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:21:7: ( '{' )
            // src/grammar/Chronos.g:21:9: '{'
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
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:22:7: ( '}' )
            // src/grammar/Chronos.g:22:9: '}'
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
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:23:7: ( '~' )
            // src/grammar/Chronos.g:23:9: '~'
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
    // $ANTLR end "T__71"

    // $ANTLR start "IF_T"
    public final void mIF_T() throws RecognitionException {
        try {
            int _type = IF_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:151:7: ( 'if' )
            // src/grammar/Chronos.g:151:9: 'if'
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
            // src/grammar/Chronos.g:153:8: ( 'else' )
            // src/grammar/Chronos.g:153:10: 'else'
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
            // src/grammar/Chronos.g:155:8: ( 'new' )
            // src/grammar/Chronos.g:155:10: 'new'
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
            // src/grammar/Chronos.g:157:11: ( 'foreach' )
            // src/grammar/Chronos.g:157:13: 'foreach'
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
            // src/grammar/Chronos.g:159:6: ( 'in' )
            // src/grammar/Chronos.g:159:8: 'in'
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
            // src/grammar/Chronos.g:161:9: ( 'break' )
            // src/grammar/Chronos.g:161:11: 'break'
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
            // src/grammar/Chronos.g:163:11: ( 'schedule' )
            // src/grammar/Chronos.g:163:13: 'schedule'
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
            // src/grammar/Chronos.g:165:9: ( 'course' )
            // src/grammar/Chronos.g:165:11: 'course'
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
            // src/grammar/Chronos.g:167:13: ( 'courselist' )
            // src/grammar/Chronos.g:167:15: 'courselist'
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
            // src/grammar/Chronos.g:169:12: ( 'timeblock' )
            // src/grammar/Chronos.g:169:14: 'timeblock'
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
            // src/grammar/Chronos.g:171:11: ( 'datetime' )
            // src/grammar/Chronos.g:171:14: 'datetime'
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
            // src/grammar/Chronos.g:173:7: ( 'int' )
            // src/grammar/Chronos.g:173:9: 'int'
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
            // src/grammar/Chronos.g:175:9: ( 'double' )
            // src/grammar/Chronos.g:175:11: 'double'
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

    // $ANTLR start "DAYS_T"
    public final void mDAYS_T() throws RecognitionException {
        try {
            int _type = DAYS_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:177:8: ( 'days' )
            // src/grammar/Chronos.g:177:10: 'days'
            {
            match("days"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DAYS_T"

    // $ANTLR start "TIME_T"
    public final void mTIME_T() throws RecognitionException {
        try {
            int _type = TIME_T;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/grammar/Chronos.g:179:8: ( 'time' )
            // src/grammar/Chronos.g:179:10: 'time'
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
            // src/grammar/Chronos.g:181:9: ( 'string' )
            // src/grammar/Chronos.g:181:11: 'string'
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
            // src/grammar/Chronos.g:185:2: ( ( '0' .. '2' )? ( '0' .. '9' ) ':' ( '0' .. '5' ) ( '0' .. '9' ) )
            // src/grammar/Chronos.g:185:4: ( '0' .. '2' )? ( '0' .. '9' ) ':' ( '0' .. '5' ) ( '0' .. '9' )
            {
            // src/grammar/Chronos.g:185:4: ( '0' .. '2' )?
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
            // src/grammar/Chronos.g:191:5: ( '&&' )
            // src/grammar/Chronos.g:191:7: '&&'
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
            // src/grammar/Chronos.g:193:4: ( '||' )
            // src/grammar/Chronos.g:193:6: '||'
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
            // src/grammar/Chronos.g:195:5: ( '!' )
            // src/grammar/Chronos.g:195:7: '!'
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
            // src/grammar/Chronos.g:197:5: ( '<=' )
            // src/grammar/Chronos.g:197:7: '<='
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
            // src/grammar/Chronos.g:199:5: ( '>=' )
            // src/grammar/Chronos.g:199:7: '>='
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
            // src/grammar/Chronos.g:201:5: ( '!=' )
            // src/grammar/Chronos.g:201:7: '!='
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
            // src/grammar/Chronos.g:203:4: ( '==' )
            // src/grammar/Chronos.g:203:6: '=='
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
            // src/grammar/Chronos.g:207:2: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // src/grammar/Chronos.g:207:4: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // src/grammar/Chronos.g:207:4: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
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
            	    // src/grammar/Chronos.g:
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
            // src/grammar/Chronos.g:210:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // src/grammar/Chronos.g:210:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // src/grammar/Chronos.g:210:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
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
            // src/grammar/Chronos.g:213:5: ( ( '0' .. '9' )+ )
            // src/grammar/Chronos.g:213:7: ( '0' .. '9' )+
            {
            // src/grammar/Chronos.g:213:7: ( '0' .. '9' )+
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
            // src/grammar/Chronos.g:217:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt11=3;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // src/grammar/Chronos.g:217:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // src/grammar/Chronos.g:217:9: ( '0' .. '9' )+
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
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    match('.'); 

                    // src/grammar/Chronos.g:217:25: ( '0' .. '9' )*
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
                    	    break loop6;
                        }
                    } while (true);


                    // src/grammar/Chronos.g:217:37: ( EXPONENT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='E'||LA7_0=='e') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // src/grammar/Chronos.g:217:37: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // src/grammar/Chronos.g:218:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 

                    // src/grammar/Chronos.g:218:13: ( '0' .. '9' )+
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
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    // src/grammar/Chronos.g:218:25: ( EXPONENT )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='E'||LA9_0=='e') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // src/grammar/Chronos.g:218:25: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // src/grammar/Chronos.g:219:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // src/grammar/Chronos.g:219:9: ( '0' .. '9' )+
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
            // src/grammar/Chronos.g:223:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
                    // src/grammar/Chronos.g:223:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // src/grammar/Chronos.g:223:14: (~ ( '\\n' | '\\r' ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0 >= '\u0000' && LA12_0 <= '\t')||(LA12_0 >= '\u000B' && LA12_0 <= '\f')||(LA12_0 >= '\u000E' && LA12_0 <= '\uFFFF')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
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
                    	    break loop12;
                        }
                    } while (true);


                    // src/grammar/Chronos.g:223:28: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // src/grammar/Chronos.g:223:28: '\\r'
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
                    // src/grammar/Chronos.g:224:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // src/grammar/Chronos.g:224:14: ( options {greedy=false; } : . )*
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
                    	    // src/grammar/Chronos.g:224:42: .
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
            // src/grammar/Chronos.g:228:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // src/grammar/Chronos.g:228:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // src/grammar/Chronos.g:228:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
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
            	    // src/grammar/Chronos.g:228:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // src/grammar/Chronos.g:228:24: ~ ( '\\\\' | '\"' )
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
            // src/grammar/Chronos.g:231:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
            // src/grammar/Chronos.g:231:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 

            // src/grammar/Chronos.g:231:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
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
                    // src/grammar/Chronos.g:231:15: ESC_SEQ
                    {
                    mESC_SEQ(); 


                    }
                    break;
                case 2 :
                    // src/grammar/Chronos.g:231:25: ~ ( '\\'' | '\\\\' )
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
            // src/grammar/Chronos.g:236:5: ( ( 'M' | 'T' | 'W' | 'R' | 'F' ) )
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

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // src/grammar/Chronos.g:240:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // src/grammar/Chronos.g:240:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // src/grammar/Chronos.g:240:22: ( '+' | '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='+'||LA18_0=='-') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // src/grammar/Chronos.g:
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


            // src/grammar/Chronos.g:240:33: ( '0' .. '9' )+
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
            // src/grammar/Chronos.g:243:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
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
            // src/grammar/Chronos.g:247:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
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
                    // src/grammar/Chronos.g:247:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // src/grammar/Chronos.g:248:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // src/grammar/Chronos.g:249:9: OCTAL_ESC
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
            // src/grammar/Chronos.g:254:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
                    // src/grammar/Chronos.g:254:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
                    // src/grammar/Chronos.g:255:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
                    // src/grammar/Chronos.g:256:9: '\\\\' ( '0' .. '7' )
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
            // src/grammar/Chronos.g:261:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // src/grammar/Chronos.g:261:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
        // src/grammar/Chronos.g:1:8: ( T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | IF_T | ELSE_T | NEW_T | FOREACH_T | IN_T | BREAK_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T | INT_T | DOUBLE_T | DAYS_T | TIME_T | STRING_T | TIME | AND | OR | NOT | LEQ | GEQ | NEQ | EQ | WHITESPACE | ID | INT | FLOAT | COMMENT | STRING | CHAR )
        int alt22=48;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // src/grammar/Chronos.g:1:10: T__55
                {
                mT__55(); 


                }
                break;
            case 2 :
                // src/grammar/Chronos.g:1:16: T__56
                {
                mT__56(); 


                }
                break;
            case 3 :
                // src/grammar/Chronos.g:1:22: T__57
                {
                mT__57(); 


                }
                break;
            case 4 :
                // src/grammar/Chronos.g:1:28: T__58
                {
                mT__58(); 


                }
                break;
            case 5 :
                // src/grammar/Chronos.g:1:34: T__59
                {
                mT__59(); 


                }
                break;
            case 6 :
                // src/grammar/Chronos.g:1:40: T__60
                {
                mT__60(); 


                }
                break;
            case 7 :
                // src/grammar/Chronos.g:1:46: T__61
                {
                mT__61(); 


                }
                break;
            case 8 :
                // src/grammar/Chronos.g:1:52: T__62
                {
                mT__62(); 


                }
                break;
            case 9 :
                // src/grammar/Chronos.g:1:58: T__63
                {
                mT__63(); 


                }
                break;
            case 10 :
                // src/grammar/Chronos.g:1:64: T__64
                {
                mT__64(); 


                }
                break;
            case 11 :
                // src/grammar/Chronos.g:1:70: T__65
                {
                mT__65(); 


                }
                break;
            case 12 :
                // src/grammar/Chronos.g:1:76: T__66
                {
                mT__66(); 


                }
                break;
            case 13 :
                // src/grammar/Chronos.g:1:82: T__67
                {
                mT__67(); 


                }
                break;
            case 14 :
                // src/grammar/Chronos.g:1:88: T__68
                {
                mT__68(); 


                }
                break;
            case 15 :
                // src/grammar/Chronos.g:1:94: T__69
                {
                mT__69(); 


                }
                break;
            case 16 :
                // src/grammar/Chronos.g:1:100: T__70
                {
                mT__70(); 


                }
                break;
            case 17 :
                // src/grammar/Chronos.g:1:106: T__71
                {
                mT__71(); 


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
                // src/grammar/Chronos.g:1:224: DAYS_T
                {
                mDAYS_T(); 


                }
                break;
            case 32 :
                // src/grammar/Chronos.g:1:231: TIME_T
                {
                mTIME_T(); 


                }
                break;
            case 33 :
                // src/grammar/Chronos.g:1:238: STRING_T
                {
                mSTRING_T(); 


                }
                break;
            case 34 :
                // src/grammar/Chronos.g:1:247: TIME
                {
                mTIME(); 


                }
                break;
            case 35 :
                // src/grammar/Chronos.g:1:252: AND
                {
                mAND(); 


                }
                break;
            case 36 :
                // src/grammar/Chronos.g:1:256: OR
                {
                mOR(); 


                }
                break;
            case 37 :
                // src/grammar/Chronos.g:1:259: NOT
                {
                mNOT(); 


                }
                break;
            case 38 :
                // src/grammar/Chronos.g:1:263: LEQ
                {
                mLEQ(); 


                }
                break;
            case 39 :
                // src/grammar/Chronos.g:1:267: GEQ
                {
                mGEQ(); 


                }
                break;
            case 40 :
                // src/grammar/Chronos.g:1:271: NEQ
                {
                mNEQ(); 


                }
                break;
            case 41 :
                // src/grammar/Chronos.g:1:275: EQ
                {
                mEQ(); 


                }
                break;
            case 42 :
                // src/grammar/Chronos.g:1:278: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 43 :
                // src/grammar/Chronos.g:1:289: ID
                {
                mID(); 


                }
                break;
            case 44 :
                // src/grammar/Chronos.g:1:292: INT
                {
                mINT(); 


                }
                break;
            case 45 :
                // src/grammar/Chronos.g:1:296: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 46 :
                // src/grammar/Chronos.g:1:302: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 47 :
                // src/grammar/Chronos.g:1:310: STRING
                {
                mSTRING(); 


                }
                break;
            case 48 :
                // src/grammar/Chronos.g:1:317: CHAR
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
            return "216:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA22_eotS =
        "\7\uffff\1\44\1\47\1\uffff\1\51\1\53\1\55\5\uffff\11\41\2\73\2\uffff"+
        "\1\76\16\uffff\1\77\1\101\12\41\2\uffff\1\73\3\uffff\1\115\1\uffff"+
        "\1\41\1\117\11\41\1\uffff\1\131\1\uffff\5\41\1\140\1\41\1\142\1"+
        "\41\1\uffff\1\41\1\145\4\41\1\uffff\1\41\1\uffff\2\41\1\uffff\1"+
        "\41\1\156\1\160\2\41\1\163\1\164\1\41\1\uffff\1\41\1\uffff\2\41"+
        "\2\uffff\1\171\2\41\1\174\1\uffff\1\41\1\176\1\uffff\1\177\2\uffff";
    static final String DFA22_eofS =
        "\u0080\uffff";
    static final String DFA22_minS =
        "\1\11\6\uffff\1\60\1\52\1\uffff\3\75\5\uffff\1\146\1\154\1\145\1"+
        "\157\1\162\1\143\1\157\1\151\1\141\2\56\2\uffff\1\75\16\uffff\2"+
        "\60\1\163\1\167\1\162\1\145\1\150\1\162\1\165\1\155\1\164\1\165"+
        "\2\uffff\1\56\3\uffff\1\60\1\uffff\1\145\1\60\1\145\1\141\1\145"+
        "\1\151\1\162\2\145\1\163\1\142\1\uffff\1\60\1\uffff\1\141\1\153"+
        "\1\144\1\156\1\163\1\60\1\164\1\60\1\154\1\uffff\1\143\1\60\1\165"+
        "\1\147\1\145\1\154\1\uffff\1\151\1\uffff\1\145\1\150\1\uffff\1\154"+
        "\2\60\1\157\1\155\2\60\1\145\1\uffff\1\151\1\uffff\1\143\1\145\2"+
        "\uffff\1\60\1\163\1\153\1\60\1\uffff\1\164\1\60\1\uffff\1\60\2\uffff";
    static final String DFA22_maxS =
        "\1\176\6\uffff\1\71\1\57\1\uffff\3\75\5\uffff\1\156\1\154\1\145"+
        "\1\157\1\162\1\164\1\157\1\151\1\157\2\145\2\uffff\1\75\16\uffff"+
        "\2\172\1\163\1\167\1\162\1\145\1\150\1\162\1\165\1\155\1\171\1\165"+
        "\2\uffff\1\145\3\uffff\1\172\1\uffff\1\145\1\172\1\145\1\141\1\145"+
        "\1\151\1\162\2\145\1\163\1\142\1\uffff\1\172\1\uffff\1\141\1\153"+
        "\1\144\1\156\1\163\1\172\1\164\1\172\1\154\1\uffff\1\143\1\172\1"+
        "\165\1\147\1\145\1\154\1\uffff\1\151\1\uffff\1\145\1\150\1\uffff"+
        "\1\154\2\172\1\157\1\155\2\172\1\145\1\uffff\1\151\1\uffff\1\143"+
        "\1\145\2\uffff\1\172\1\163\1\153\1\172\1\uffff\1\164\1\172\1\uffff"+
        "\1\172\2\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff\1\11\3\uffff\1\15\1\16"+
        "\1\17\1\20\1\21\13\uffff\1\43\1\44\1\uffff\1\52\1\53\1\57\1\60\1"+
        "\7\1\55\1\56\1\10\1\46\1\12\1\51\1\13\1\47\1\14\14\uffff\1\42\1"+
        "\54\1\uffff\1\50\1\45\1\22\1\uffff\1\26\13\uffff\1\35\1\uffff\1"+
        "\24\11\uffff\1\23\6\uffff\1\40\1\uffff\1\37\2\uffff\1\27\10\uffff"+
        "\1\41\1\uffff\1\31\2\uffff\1\36\1\25\4\uffff\1\30\2\uffff\1\34\1"+
        "\uffff\1\33\1\32";
    static final String DFA22_specialS =
        "\u0080\uffff}>";
    static final String[] DFA22_transitionS = {
            "\2\40\1\uffff\2\40\22\uffff\1\40\1\37\1\42\3\uffff\1\35\1\43"+
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\3\33\7\34\1\uffff\1\11\1\12"+
            "\1\13\1\14\2\uffff\32\41\1\15\1\uffff\1\16\1\uffff\1\41\1\uffff"+
            "\1\41\1\26\1\30\1\32\1\23\1\25\2\41\1\22\4\41\1\24\4\41\1\27"+
            "\1\31\6\41\1\17\1\36\1\20\1\21",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\45",
            "\1\46\4\uffff\1\46",
            "",
            "\1\50",
            "\1\52",
            "\1\54",
            "",
            "",
            "",
            "",
            "",
            "\1\56\7\uffff\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64\20\uffff\1\65",
            "\1\66",
            "\1\67",
            "\1\70\15\uffff\1\71",
            "\1\45\1\uffff\12\34\1\72\12\uffff\1\45\37\uffff\1\45",
            "\1\45\1\uffff\12\74\1\72\12\uffff\1\45\37\uffff\1\45",
            "",
            "",
            "\1\75",
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
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\23\41\1\100\6\41",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112\4\uffff\1\113",
            "\1\114",
            "",
            "",
            "\1\45\1\uffff\12\74\13\uffff\1\45\37\uffff\1\45",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\116",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\1\41\1\137\30\41",
            "\1\141",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\143",
            "",
            "\1\144",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "",
            "\1\152",
            "",
            "\1\153",
            "\1\154",
            "",
            "\1\155",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\13\41\1\157\16\41",
            "\1\161",
            "\1\162",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\165",
            "",
            "\1\166",
            "",
            "\1\167",
            "\1\170",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\172",
            "\1\173",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\175",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
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
            return "1:1: Tokens : ( T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | IF_T | ELSE_T | NEW_T | FOREACH_T | IN_T | BREAK_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T | INT_T | DOUBLE_T | DAYS_T | TIME_T | STRING_T | TIME | AND | OR | NOT | LEQ | GEQ | NEQ | EQ | WHITESPACE | ID | INT | FLOAT | COMMENT | STRING | CHAR );";
        }
    }
 

}