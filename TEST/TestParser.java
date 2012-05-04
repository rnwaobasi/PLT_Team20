// $ANTLR 3.4 Test.g 2012-05-04 16:45:35

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class TestParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "ESC_SEQ", "EXPONENT", "FLOAT", "HEX_DIGIT", "ID", "INT", "OCTAL_ESC", "PRINT", "STRING", "UNICODE_ESC", "WS", "';'", "'='"
    };

    public static final int EOF=-1;
    public static final int T__17=17;
    public static final int T__18=18;
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
    // Test.g:8:1: program : ( line )+ EOF -> ( line )+ ;
    public final TestParser.program_return program() throws RecognitionException {
        TestParser.program_return retval = new TestParser.program_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF2=null;
        TestParser.line_return line1 =null;


        CommonTree EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_line=new RewriteRuleSubtreeStream(adaptor,"rule line");
        try {
            // Test.g:9:2: ( ( line )+ EOF -> ( line )+ )
            // Test.g:9:4: ( line )+ EOF
            {
            // Test.g:9:4: ( line )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Test.g:9:4: line
            	    {
            	    pushFollow(FOLLOW_line_in_program32);
            	    line1=line();

            	    state._fsp--;

            	    stream_line.add(line1.getTree());

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
            stream_EOF.add(EOF2);


            // AST REWRITE
            // elements: line
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 9:14: -> ( line )+
            {
                if ( !(stream_line.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_line.hasNext() ) {
                    adaptor.addChild(root_0, stream_line.nextTree());

                }
                stream_line.reset();

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
    // $ANTLR end "program"


    public static class line_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "line"
    // Test.g:11:1: line : int_assignment ';' -> int_assignment ;
    public final TestParser.line_return line() throws RecognitionException {
        TestParser.line_return retval = new TestParser.line_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal4=null;
        TestParser.int_assignment_return int_assignment3 =null;


        CommonTree char_literal4_tree=null;
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleSubtreeStream stream_int_assignment=new RewriteRuleSubtreeStream(adaptor,"rule int_assignment");
        try {
            // Test.g:11:5: ( int_assignment ';' -> int_assignment )
            // Test.g:12:6: int_assignment ';'
            {
            pushFollow(FOLLOW_int_assignment_in_line50);
            int_assignment3=int_assignment();

            state._fsp--;

            stream_int_assignment.add(int_assignment3.getTree());

            char_literal4=(Token)match(input,17,FOLLOW_17_in_line51);  
            stream_17.add(char_literal4);


            // AST REWRITE
            // elements: int_assignment
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 12:24: -> int_assignment
            {
                adaptor.addChild(root_0, stream_int_assignment.nextTree());

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
    // $ANTLR end "line"


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

        Token ID5=null;
        Token char_literal6=null;
        Token INT7=null;

        CommonTree ID5_tree=null;
        CommonTree char_literal6_tree=null;
        CommonTree INT7_tree=null;

        try {
            // Test.g:18:2: ( ID '=' ^ INT )
            // Test.g:18:4: ID '=' ^ INT
            {
            root_0 = (CommonTree)adaptor.nil();


            ID5=(Token)match(input,ID,FOLLOW_ID_in_int_assignment67); 
            ID5_tree = 
            (CommonTree)adaptor.create(ID5)
            ;
            adaptor.addChild(root_0, ID5_tree);


            char_literal6=(Token)match(input,18,FOLLOW_18_in_int_assignment69); 
            char_literal6_tree = 
            (CommonTree)adaptor.create(char_literal6)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(char_literal6_tree, root_0);


            INT7=(Token)match(input,INT,FOLLOW_INT_in_int_assignment72); 
            INT7_tree = 
            (CommonTree)adaptor.create(INT7)
            ;
            adaptor.addChild(root_0, INT7_tree);


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


 

    public static final BitSet FOLLOW_line_in_program32 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EOF_in_program35 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_assignment_in_line50 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_line51 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_int_assignment67 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_int_assignment69 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_INT_in_int_assignment72 = new BitSet(new long[]{0x0000000000000002L});

}