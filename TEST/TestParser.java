// $ANTLR 3.4 Test.g 2012-05-04 17:10:25

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class TestParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "ESC_SEQ", "EXPONENT", "FLOAT", "HEX_DIGIT", "ID", "INT", "OCTAL_ESC", "PRINT", "STRING", "UNICODE_ESC", "WS", "'('", "')'", "';'", "'='"
    };

    public static final int EOF=-1;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int CHAR=4;
    public static final int COMMENT=5;
    public static final int ESC_SEQ=6;
    public static final int EXPONENT=7;
    public static final int FLOAT=8;
    public static final int HEX_DIGIT=9;
    public static final int ID=10;
    public static final int INT=11;
    public static final int OCTAL_ESC=12;
    public static final int PRINT=13;
    public static final int STRING=14;
    public static final int UNICODE_ESC=15;
    public static final int WS=16;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public TestParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public TestParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return TestParser.tokenNames; }
    public String getGrammarFileName() { return "Test.g"; }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // Test.g:8:1: program : ( line )+ EOF !;
    public final TestParser.program_return program() throws RecognitionException {
        TestParser.program_return retval = new TestParser.program_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF2=null;
        TestParser.line_return line1 =null;


        CommonTree EOF2_tree=null;

        try {
            // Test.g:9:2: ( ( line )+ EOF !)
            // Test.g:9:4: ( line )+ EOF !
            {
            root_0 = (CommonTree)adaptor.nil();


            // Test.g:9:4: ( line )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||LA1_0==PRINT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Test.g:9:4: line
            	    {
            	    pushFollow(FOLLOW_line_in_program32);
            	    line1=line();

            	    state._fsp--;

            	    adaptor.addChild(root_0, line1.getTree());

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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program35); 

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
    // $ANTLR end "program"


    public static class line_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "line"
    // Test.g:11:1: line : ( print_function ';' !| int_assignment ';' !);
    public final TestParser.line_return line() throws RecognitionException {
        TestParser.line_return retval = new TestParser.line_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal4=null;
        Token char_literal6=null;
        TestParser.print_function_return print_function3 =null;

        TestParser.int_assignment_return int_assignment5 =null;


        CommonTree char_literal4_tree=null;
        CommonTree char_literal6_tree=null;

        try {
            // Test.g:11:5: ( print_function ';' !| int_assignment ';' !)
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==PRINT) ) {
                alt2=1;
            }
            else if ( (LA2_0==ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // Test.g:11:7: print_function ';' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_print_function_in_line44);
                    print_function3=print_function();

                    state._fsp--;

                    adaptor.addChild(root_0, print_function3.getTree());

                    char_literal4=(Token)match(input,19,FOLLOW_19_in_line46); 

                    }
                    break;
                case 2 :
                    // Test.g:12:4: int_assignment ';' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_int_assignment_in_line52);
                    int_assignment5=int_assignment();

                    state._fsp--;

                    adaptor.addChild(root_0, int_assignment5.getTree());

                    char_literal6=(Token)match(input,19,FOLLOW_19_in_line54); 

                    }
                    break;

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
    // $ANTLR end "line"


    public static class print_function_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "print_function"
    // Test.g:14:1: print_function : PRINT ^ '(' ! STRING ')' !;
    public final TestParser.print_function_return print_function() throws RecognitionException {
        TestParser.print_function_return retval = new TestParser.print_function_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PRINT7=null;
        Token char_literal8=null;
        Token STRING9=null;
        Token char_literal10=null;

        CommonTree PRINT7_tree=null;
        CommonTree char_literal8_tree=null;
        CommonTree STRING9_tree=null;
        CommonTree char_literal10_tree=null;

        try {
            // Test.g:15:2: ( PRINT ^ '(' ! STRING ')' !)
            // Test.g:15:4: PRINT ^ '(' ! STRING ')' !
            {
            root_0 = (CommonTree)adaptor.nil();


            PRINT7=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_function65); 
            PRINT7_tree = 
            (CommonTree)adaptor.create(PRINT7)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(PRINT7_tree, root_0);


            char_literal8=(Token)match(input,17,FOLLOW_17_in_print_function68); 

            STRING9=(Token)match(input,STRING,FOLLOW_STRING_in_print_function71); 
            STRING9_tree = 
            (CommonTree)adaptor.create(STRING9)
            ;
            adaptor.addChild(root_0, STRING9_tree);


            char_literal10=(Token)match(input,18,FOLLOW_18_in_print_function73); 

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
    // $ANTLR end "print_function"


    public static class int_assignment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "int_assignment"
    // Test.g:17:1: int_assignment : ID '=' ^ INT ;
    public final TestParser.int_assignment_return int_assignment() throws RecognitionException {
        TestParser.int_assignment_return retval = new TestParser.int_assignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID11=null;
        Token char_literal12=null;
        Token INT13=null;

        CommonTree ID11_tree=null;
        CommonTree char_literal12_tree=null;
        CommonTree INT13_tree=null;

        try {
            // Test.g:18:2: ( ID '=' ^ INT )
            // Test.g:18:4: ID '=' ^ INT
            {
            root_0 = (CommonTree)adaptor.nil();


            ID11=(Token)match(input,ID,FOLLOW_ID_in_int_assignment84); 
            ID11_tree = 
            (CommonTree)adaptor.create(ID11)
            ;
            adaptor.addChild(root_0, ID11_tree);


            char_literal12=(Token)match(input,20,FOLLOW_20_in_int_assignment86); 
            char_literal12_tree = 
            (CommonTree)adaptor.create(char_literal12)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(char_literal12_tree, root_0);


            INT13=(Token)match(input,INT,FOLLOW_INT_in_int_assignment89); 
            INT13_tree = 
            (CommonTree)adaptor.create(INT13)
            ;
            adaptor.addChild(root_0, INT13_tree);


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
    // $ANTLR end "int_assignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_line_in_program32 = new BitSet(new long[]{0x0000000000002400L});
    public static final BitSet FOLLOW_EOF_in_program35 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_function_in_line44 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_line46 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_assignment_in_line52 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_line54 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print_function65 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_print_function68 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_STRING_in_print_function71 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_print_function73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_int_assignment84 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_int_assignment86 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_INT_in_int_assignment89 = new BitSet(new long[]{0x0000000000000002L});

}