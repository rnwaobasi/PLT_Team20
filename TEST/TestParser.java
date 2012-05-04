// $ANTLR 3.4 Test.g 2012-05-04 18:26:53

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class TestParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "ESC_SEQ", "EXPONENT", "FLOAT", "HEX_DIGIT", "ID", "INT", "OCTAL_ESC", "PRINT", "STRING", "TIME", "TIMEBLOCK", "TIMES", "UNICODE_ESC", "WS", "'('", "')'", "';'", "'='", "'~'"
    };

    public static final int EOF=-1;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
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
    public static final int TIME=15;
    public static final int TIMEBLOCK=16;
    public static final int TIMES=17;
    public static final int UNICODE_ESC=18;
    public static final int WS=19;

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
    // Test.g:12:1: program : ( line )+ EOF !;
    public final TestParser.program_return program() throws RecognitionException {
        TestParser.program_return retval = new TestParser.program_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF2=null;
        TestParser.line_return line1 =null;


        CommonTree EOF2_tree=null;

        try {
            // Test.g:13:2: ( ( line )+ EOF !)
            // Test.g:13:4: ( line )+ EOF !
            {
            root_0 = (CommonTree)adaptor.nil();


            // Test.g:13:4: ( line )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||LA1_0==PRINT||LA1_0==TIMEBLOCK) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Test.g:13:4: line
            	    {
            	    pushFollow(FOLLOW_line_in_program41);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program44); 

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
    // Test.g:15:1: line : ( print_function ';' !| int_assignment ';' !| timeblock_inst ';' !);
    public final TestParser.line_return line() throws RecognitionException {
        TestParser.line_return retval = new TestParser.line_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal4=null;
        Token char_literal6=null;
        Token char_literal8=null;
        TestParser.print_function_return print_function3 =null;

        TestParser.int_assignment_return int_assignment5 =null;

        TestParser.timeblock_inst_return timeblock_inst7 =null;


        CommonTree char_literal4_tree=null;
        CommonTree char_literal6_tree=null;
        CommonTree char_literal8_tree=null;

        try {
            // Test.g:15:5: ( print_function ';' !| int_assignment ';' !| timeblock_inst ';' !)
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
            case TIMEBLOCK:
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
                    // Test.g:15:7: print_function ';' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_print_function_in_line53);
                    print_function3=print_function();

                    state._fsp--;

                    adaptor.addChild(root_0, print_function3.getTree());

                    char_literal4=(Token)match(input,22,FOLLOW_22_in_line55); 

                    }
                    break;
                case 2 :
                    // Test.g:16:4: int_assignment ';' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_int_assignment_in_line61);
                    int_assignment5=int_assignment();

                    state._fsp--;

                    adaptor.addChild(root_0, int_assignment5.getTree());

                    char_literal6=(Token)match(input,22,FOLLOW_22_in_line63); 

                    }
                    break;
                case 3 :
                    // Test.g:17:4: timeblock_inst ';' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_timeblock_inst_in_line69);
                    timeblock_inst7=timeblock_inst();

                    state._fsp--;

                    adaptor.addChild(root_0, timeblock_inst7.getTree());

                    char_literal8=(Token)match(input,22,FOLLOW_22_in_line71); 

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
    // Test.g:19:1: print_function : PRINT ^ '(' ! STRING ')' !;
    public final TestParser.print_function_return print_function() throws RecognitionException {
        TestParser.print_function_return retval = new TestParser.print_function_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PRINT9=null;
        Token char_literal10=null;
        Token STRING11=null;
        Token char_literal12=null;

        CommonTree PRINT9_tree=null;
        CommonTree char_literal10_tree=null;
        CommonTree STRING11_tree=null;
        CommonTree char_literal12_tree=null;

        try {
            // Test.g:20:2: ( PRINT ^ '(' ! STRING ')' !)
            // Test.g:20:4: PRINT ^ '(' ! STRING ')' !
            {
            root_0 = (CommonTree)adaptor.nil();


            PRINT9=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_function82); 
            PRINT9_tree = 
            (CommonTree)adaptor.create(PRINT9)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(PRINT9_tree, root_0);


            char_literal10=(Token)match(input,20,FOLLOW_20_in_print_function85); 

            STRING11=(Token)match(input,STRING,FOLLOW_STRING_in_print_function88); 
            STRING11_tree = 
            (CommonTree)adaptor.create(STRING11)
            ;
            adaptor.addChild(root_0, STRING11_tree);


            char_literal12=(Token)match(input,21,FOLLOW_21_in_print_function90); 

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
    // Test.g:22:1: int_assignment : ID '=' ^ INT ;
    public final TestParser.int_assignment_return int_assignment() throws RecognitionException {
        TestParser.int_assignment_return retval = new TestParser.int_assignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID13=null;
        Token char_literal14=null;
        Token INT15=null;

        CommonTree ID13_tree=null;
        CommonTree char_literal14_tree=null;
        CommonTree INT15_tree=null;

        try {
            // Test.g:23:2: ( ID '=' ^ INT )
            // Test.g:23:4: ID '=' ^ INT
            {
            root_0 = (CommonTree)adaptor.nil();


            ID13=(Token)match(input,ID,FOLLOW_ID_in_int_assignment101); 
            ID13_tree = 
            (CommonTree)adaptor.create(ID13)
            ;
            adaptor.addChild(root_0, ID13_tree);


            char_literal14=(Token)match(input,23,FOLLOW_23_in_int_assignment103); 
            char_literal14_tree = 
            (CommonTree)adaptor.create(char_literal14)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(char_literal14_tree, root_0);


            INT15=(Token)match(input,INT,FOLLOW_INT_in_int_assignment106); 
            INT15_tree = 
            (CommonTree)adaptor.create(INT15)
            ;
            adaptor.addChild(root_0, INT15_tree);


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


    public static class timeblock_inst_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "timeblock_inst"
    // Test.g:25:1: timeblock_inst : TIMEBLOCK ID '=' timeblock -> ^( '=' TIMEBLOCK ID timeblock ) ;
    public final TestParser.timeblock_inst_return timeblock_inst() throws RecognitionException {
        TestParser.timeblock_inst_return retval = new TestParser.timeblock_inst_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token TIMEBLOCK16=null;
        Token ID17=null;
        Token char_literal18=null;
        TestParser.timeblock_return timeblock19 =null;


        CommonTree TIMEBLOCK16_tree=null;
        CommonTree ID17_tree=null;
        CommonTree char_literal18_tree=null;
        RewriteRuleTokenStream stream_TIMEBLOCK=new RewriteRuleTokenStream(adaptor,"token TIMEBLOCK");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleSubtreeStream stream_timeblock=new RewriteRuleSubtreeStream(adaptor,"rule timeblock");
        try {
            // Test.g:26:2: ( TIMEBLOCK ID '=' timeblock -> ^( '=' TIMEBLOCK ID timeblock ) )
            // Test.g:26:4: TIMEBLOCK ID '=' timeblock
            {
            TIMEBLOCK16=(Token)match(input,TIMEBLOCK,FOLLOW_TIMEBLOCK_in_timeblock_inst116);  
            stream_TIMEBLOCK.add(TIMEBLOCK16);


            ID17=(Token)match(input,ID,FOLLOW_ID_in_timeblock_inst118);  
            stream_ID.add(ID17);


            char_literal18=(Token)match(input,23,FOLLOW_23_in_timeblock_inst120);  
            stream_23.add(char_literal18);


            pushFollow(FOLLOW_timeblock_in_timeblock_inst122);
            timeblock19=timeblock();

            state._fsp--;

            stream_timeblock.add(timeblock19.getTree());

            // AST REWRITE
            // elements: TIMEBLOCK, ID, timeblock, 23
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 26:31: -> ^( '=' TIMEBLOCK ID timeblock )
            {
                // Test.g:26:34: ^( '=' TIMEBLOCK ID timeblock )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_23.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_TIMEBLOCK.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_timeblock.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

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
    // $ANTLR end "timeblock_inst"


    public static class timeblock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "timeblock"
    // Test.g:28:1: timeblock : a= TIME '~' b= TIME -> ^( TIMES $a $b) ;
    public final TestParser.timeblock_return timeblock() throws RecognitionException {
        TestParser.timeblock_return retval = new TestParser.timeblock_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token a=null;
        Token b=null;
        Token char_literal20=null;

        CommonTree a_tree=null;
        CommonTree b_tree=null;
        CommonTree char_literal20_tree=null;
        RewriteRuleTokenStream stream_TIME=new RewriteRuleTokenStream(adaptor,"token TIME");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");

        try {
            // Test.g:29:2: (a= TIME '~' b= TIME -> ^( TIMES $a $b) )
            // Test.g:29:4: a= TIME '~' b= TIME
            {
            a=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock146);  
            stream_TIME.add(a);


            char_literal20=(Token)match(input,24,FOLLOW_24_in_timeblock148);  
            stream_24.add(char_literal20);


            b=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock152);  
            stream_TIME.add(b);


            // AST REWRITE
            // elements: b, a
            // token labels: b, a
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_b=new RewriteRuleTokenStream(adaptor,"token b",b);
            RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 29:22: -> ^( TIMES $a $b)
            {
                // Test.g:29:25: ^( TIMES $a $b)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TIMES, "TIMES")
                , root_1);

                adaptor.addChild(root_1, stream_a.nextNode());

                adaptor.addChild(root_1, stream_b.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

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
    // $ANTLR end "timeblock"

    // Delegated rules


 

    public static final BitSet FOLLOW_line_in_program41 = new BitSet(new long[]{0x0000000000012400L});
    public static final BitSet FOLLOW_EOF_in_program44 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_function_in_line53 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_line55 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_assignment_in_line61 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_line63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeblock_inst_in_line69 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_line71 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print_function82 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_print_function85 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_STRING_in_print_function88 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_print_function90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_int_assignment101 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_int_assignment103 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_INT_in_int_assignment106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMEBLOCK_in_timeblock_inst116 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_timeblock_inst118 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_timeblock_inst120 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_timeblock_in_timeblock_inst122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_timeblock146 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_timeblock148 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_TIME_in_timeblock152 = new BitSet(new long[]{0x0000000000000002L});

}