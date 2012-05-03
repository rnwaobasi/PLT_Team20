// $ANTLR 3.4 chronos_antlr.g 2012-05-02 18:29:36

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class chronos_antlrParser extends Parser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public chronos_antlrParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public chronos_antlrParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return chronos_antlrParser.tokenNames; }
    public String getGrammarFileName() { return "chronos_antlr.g"; }


    public static class add_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "add_expr"
    // chronos_antlr.g:20:1: add_expr : mult_expr ( '+' ^ mult_expr )* ;
    public final chronos_antlrParser.add_expr_return add_expr() throws RecognitionException {
        chronos_antlrParser.add_expr_return retval = new chronos_antlrParser.add_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal2=null;
        chronos_antlrParser.mult_expr_return mult_expr1 =null;

        chronos_antlrParser.mult_expr_return mult_expr3 =null;


        CommonTree char_literal2_tree=null;

        try {
            // chronos_antlr.g:20:9: ( mult_expr ( '+' ^ mult_expr )* )
            // chronos_antlr.g:20:11: mult_expr ( '+' ^ mult_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_mult_expr_in_add_expr75);
            mult_expr1=mult_expr();

            state._fsp--;

            adaptor.addChild(root_0, mult_expr1.getTree());

            // chronos_antlr.g:20:21: ( '+' ^ mult_expr )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==50) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // chronos_antlr.g:20:22: '+' ^ mult_expr
            	    {
            	    char_literal2=(Token)match(input,50,FOLLOW_50_in_add_expr78); 
            	    char_literal2_tree = 
            	    (CommonTree)adaptor.create(char_literal2)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal2_tree, root_0);


            	    pushFollow(FOLLOW_mult_expr_in_add_expr81);
            	    mult_expr3=mult_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mult_expr3.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "add_expr"


    public static class mult_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mult_expr"
    // chronos_antlr.g:22:1: mult_expr : INT ( '*' ^ INT )* ;
    public final chronos_antlrParser.mult_expr_return mult_expr() throws RecognitionException {
        chronos_antlrParser.mult_expr_return retval = new chronos_antlrParser.mult_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INT4=null;
        Token char_literal5=null;
        Token INT6=null;

        CommonTree INT4_tree=null;
        CommonTree char_literal5_tree=null;
        CommonTree INT6_tree=null;

        try {
            // chronos_antlr.g:22:10: ( INT ( '*' ^ INT )* )
            // chronos_antlr.g:22:12: INT ( '*' ^ INT )*
            {
            root_0 = (CommonTree)adaptor.nil();


            INT4=(Token)match(input,INT,FOLLOW_INT_in_mult_expr91); 
            INT4_tree = 
            (CommonTree)adaptor.create(INT4)
            ;
            adaptor.addChild(root_0, INT4_tree);


            // chronos_antlr.g:22:16: ( '*' ^ INT )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==49) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // chronos_antlr.g:22:17: '*' ^ INT
            	    {
            	    char_literal5=(Token)match(input,49,FOLLOW_49_in_mult_expr94); 
            	    char_literal5_tree = 
            	    (CommonTree)adaptor.create(char_literal5)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal5_tree, root_0);


            	    INT6=(Token)match(input,INT,FOLLOW_INT_in_mult_expr97); 
            	    INT6_tree = 
            	    (CommonTree)adaptor.create(INT6)
            	    ;
            	    adaptor.addChild(root_0, INT6_tree);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mult_expr"

    // Delegated rules


 

    public static final BitSet FOLLOW_mult_expr_in_add_expr75 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_add_expr78 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr81 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_INT_in_mult_expr91 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_mult_expr94 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_INT_in_mult_expr97 = new BitSet(new long[]{0x0002000000000002L});

}