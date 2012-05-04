// $ANTLR 3.4 Test.g 2012-05-04 17:50:08

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class TestParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "COURSE", "ESC_SEQ", "EXPONENT", "FLOAT", "HEX_DIGIT", "ID", "INT", "OCTAL_ESC", "PRINT", "STRING", "UNICODE_ESC", "WS", "'('", "')'", "';'", "'='", "'new'"
    };

    public static final int EOF=-1;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int CHAR=4;
    public static final int COMMENT=5;
    public static final int COURSE=6;
    public static final int ESC_SEQ=7;
    public static final int EXPONENT=8;
    public static final int FLOAT=9;
    public static final int HEX_DIGIT=10;
    public static final int ID=11;
    public static final int INT=12;
    public static final int OCTAL_ESC=13;
    public static final int PRINT=14;
    public static final int STRING=15;
    public static final int UNICODE_ESC=16;
    public static final int WS=17;

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

                if ( (LA1_0==ID||LA1_0==PRINT||LA1_0==22) ) {
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
    // Test.g:11:1: line : ( print_function ';' !| int_assignment ';' !| declaration );
    public final TestParser.line_return line() throws RecognitionException {
        TestParser.line_return retval = new TestParser.line_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal4=null;
        Token char_literal6=null;
        TestParser.print_function_return print_function3 =null;

        TestParser.int_assignment_return int_assignment5 =null;

        TestParser.declaration_return declaration7 =null;


        CommonTree char_literal4_tree=null;
        CommonTree char_literal6_tree=null;

        try {
            // Test.g:11:5: ( print_function ';' !| int_assignment ';' !| declaration )
            int alt2=3;
            switch ( input.LA(1) ) {
            case PRINT:
                {
                alt2=1;
                }
                break;
            case ID:
                {
                alt2=2;
                }
                break;
            case 22:
                {
                alt2=3;
                }
                break;
            default:
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

                    char_literal4=(Token)match(input,20,FOLLOW_20_in_line46); 

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

                    char_literal6=(Token)match(input,20,FOLLOW_20_in_line54); 

                    }
                    break;
                case 3 :
                    // Test.g:13:4: declaration
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_line60);
                    declaration7=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration7.getTree());

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
    // Test.g:15:1: print_function : PRINT ^ '(' ! STRING ')' !;
    public final TestParser.print_function_return print_function() throws RecognitionException {
        TestParser.print_function_return retval = new TestParser.print_function_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PRINT8=null;
        Token char_literal9=null;
        Token STRING10=null;
        Token char_literal11=null;

        CommonTree PRINT8_tree=null;
        CommonTree char_literal9_tree=null;
        CommonTree STRING10_tree=null;
        CommonTree char_literal11_tree=null;

        try {
            // Test.g:16:2: ( PRINT ^ '(' ! STRING ')' !)
            // Test.g:16:4: PRINT ^ '(' ! STRING ')' !
            {
            root_0 = (CommonTree)adaptor.nil();


            PRINT8=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_function70); 
            PRINT8_tree = 
            (CommonTree)adaptor.create(PRINT8)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(PRINT8_tree, root_0);


            char_literal9=(Token)match(input,18,FOLLOW_18_in_print_function73); 

            STRING10=(Token)match(input,STRING,FOLLOW_STRING_in_print_function76); 
            STRING10_tree = 
            (CommonTree)adaptor.create(STRING10)
            ;
            adaptor.addChild(root_0, STRING10_tree);


            char_literal11=(Token)match(input,19,FOLLOW_19_in_print_function78); 

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
    // Test.g:18:1: int_assignment : ID '=' ^ INT ;
    public final TestParser.int_assignment_return int_assignment() throws RecognitionException {
        TestParser.int_assignment_return retval = new TestParser.int_assignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID12=null;
        Token char_literal13=null;
        Token INT14=null;

        CommonTree ID12_tree=null;
        CommonTree char_literal13_tree=null;
        CommonTree INT14_tree=null;

        try {
            // Test.g:19:2: ( ID '=' ^ INT )
            // Test.g:19:4: ID '=' ^ INT
            {
            root_0 = (CommonTree)adaptor.nil();


            ID12=(Token)match(input,ID,FOLLOW_ID_in_int_assignment89); 
            ID12_tree = 
            (CommonTree)adaptor.create(ID12)
            ;
            adaptor.addChild(root_0, ID12_tree);


            char_literal13=(Token)match(input,21,FOLLOW_21_in_int_assignment91); 
            char_literal13_tree = 
            (CommonTree)adaptor.create(char_literal13)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(char_literal13_tree, root_0);


            INT14=(Token)match(input,INT,FOLLOW_INT_in_int_assignment94); 
            INT14_tree = 
            (CommonTree)adaptor.create(INT14)
            ;
            adaptor.addChild(root_0, INT14_tree);


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


    public static class declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // Test.g:21:1: declaration : 'new' ^ COURSE ID ;
    public final TestParser.declaration_return declaration() throws RecognitionException {
        TestParser.declaration_return retval = new TestParser.declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal15=null;
        Token COURSE16=null;
        Token ID17=null;

        CommonTree string_literal15_tree=null;
        CommonTree COURSE16_tree=null;
        CommonTree ID17_tree=null;

        try {
            // Test.g:22:2: ( 'new' ^ COURSE ID )
            // Test.g:22:4: 'new' ^ COURSE ID
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal15=(Token)match(input,22,FOLLOW_22_in_declaration104); 
            string_literal15_tree = 
            (CommonTree)adaptor.create(string_literal15)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal15_tree, root_0);


            COURSE16=(Token)match(input,COURSE,FOLLOW_COURSE_in_declaration107); 
            COURSE16_tree = 
            (CommonTree)adaptor.create(COURSE16)
            ;
            adaptor.addChild(root_0, COURSE16_tree);


            ID17=(Token)match(input,ID,FOLLOW_ID_in_declaration109); 
            ID17_tree = 
            (CommonTree)adaptor.create(ID17)
            ;
            adaptor.addChild(root_0, ID17_tree);


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
    // $ANTLR end "declaration"

    // Delegated rules


 

    public static final BitSet FOLLOW_line_in_program32 = new BitSet(new long[]{0x0000000000404800L});
    public static final BitSet FOLLOW_EOF_in_program35 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_function_in_line44 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_line46 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_assignment_in_line52 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_line54 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_line60 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print_function70 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_print_function73 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_STRING_in_print_function76 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_print_function78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_int_assignment89 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_int_assignment91 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INT_in_int_assignment94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_declaration104 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COURSE_in_declaration107 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_declaration109 = new BitSet(new long[]{0x0000000000000002L});

}