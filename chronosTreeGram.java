// $ANTLR 3.4 chronosTreeGram.g 2012-05-02 18:27:26

  package a.b.c;
  import java.util.Map;
  import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class chronosTreeGram extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "BLOCK", "BREAK_T", "CHAR", "COMMENT", "COND", "COURSELIST_T", "COURSE_T", "DATETIME", "DATETIME_T", "DAY", "DAYS", "DAY_T", "DECL", "DOUBLE_T", "ELSE_T", "EQ", "ESC_SEQ", "EXPONENT", "FLOAT", "FOREACH_T", "FUNC", "GEQ", "HEX_DIGIT", "ID", "IF_T", "INT", "INT_T", "IN_T", "LEQ", "NEQ", "NEW_T", "NOT", "OCTAL_ESC", "OR", "PARAMS", "SCHEDULE_T", "STRING", "STRING_T", "TIME", "TIMEBLOCK_T", "TIMES", "TIME_T", "UNICODE_ESC", "WHITESPACE", "'*'", "'+'"
    };

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
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public chronosTreeGram(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public chronosTreeGram(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return chronosTreeGram.tokenNames; }
    public String getGrammarFileName() { return "chronosTreeGram.g"; }


      private Map<String, Integer> variables = new HashMap<String, Integer>();



    // $ANTLR start "add_expr"
    // chronosTreeGram.g:19:1: add_expr returns [int result] : ( ^( '+' op1= mult_expr op2= mult_expr ) |);
    public final int add_expr() throws RecognitionException {
        int result = 0;


        int op1 =0;

        int op2 =0;


        try {
            // chronosTreeGram.g:20:2: ( ^( '+' op1= mult_expr op2= mult_expr ) |)
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==50) ) {
                alt1=1;
            }
            else if ( (LA1_0==EOF) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // chronosTreeGram.g:20:4: ^( '+' op1= mult_expr op2= mult_expr )
                    {
                    match(input,50,FOLLOW_50_in_add_expr59); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_mult_expr_in_add_expr63);
                    op1=mult_expr();

                    state._fsp--;


                    pushFollow(FOLLOW_mult_expr_in_add_expr67);
                    op2=mult_expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    result = op1 + op2;

                    }
                    break;
                case 2 :
                    // chronosTreeGram.g:22:2: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "add_expr"



    // $ANTLR start "mult_expr"
    // chronosTreeGram.g:23:1: mult_expr returns [int result] : ^( '*' op1= INT op2= INT ) ;
    public final int mult_expr() throws RecognitionException {
        int result = 0;


        CommonTree op1=null;
        CommonTree op2=null;

        try {
            // chronosTreeGram.g:24:2: ( ^( '*' op1= INT op2= INT ) )
            // chronosTreeGram.g:24:4: ^( '*' op1= INT op2= INT )
            {
            match(input,49,FOLLOW_49_in_mult_expr89); 

            match(input, Token.DOWN, null); 
            op1=(CommonTree)match(input,INT,FOLLOW_INT_in_mult_expr93); 

            op2=(CommonTree)match(input,INT,FOLLOW_INT_in_mult_expr97); 

            match(input, Token.UP, null); 


            result = Integer.parseInt(op1.text) * Integer.parseInt(op2.text);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "mult_expr"

    // Delegated rules


 

    public static final BitSet FOLLOW_50_in_add_expr59 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr63 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr67 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_49_in_mult_expr89 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_mult_expr93 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_INT_in_mult_expr97 = new BitSet(new long[]{0x0000000000000008L});

}