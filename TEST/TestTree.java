// $ANTLR 3.4 TestTree.g 2012-05-04 17:10:26

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TestTree extends TreeParser {
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
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public TestTree(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public TestTree(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return TestTree.tokenNames; }
    public String getGrammarFileName() { return "TestTree.g"; }


    	private int toInt(CommonTree node) {
    		int value = 0;
    		String text = node.getText();
    		try {
    			value = Integer.parseInt(text);
    		} catch (NumberFormatException e) {
    			throw new RuntimeException("Cannot convert to int");
    		}
    		return value;
    	}
    	
    	private void out(String str) {
    		System.out.println(str);
    	}



    // $ANTLR start "program"
    // TestTree.g:25:1: program : ( line )+ ;
    public final void program() throws RecognitionException {
        try {
            // TestTree.g:26:2: ( ( line )+ )
            // TestTree.g:26:4: ( line )+
            {
            // TestTree.g:26:4: ( line )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==PRINT||LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // TestTree.g:26:4: line
            	    {
            	    pushFollow(FOLLOW_line_in_program40);
            	    line();

            	    state._fsp--;


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


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "program"



    // $ANTLR start "line"
    // TestTree.g:28:1: line : ( print_function | int_assignment );
    public final void line() throws RecognitionException {
        int int_assignment1 =0;


        try {
            // TestTree.g:28:5: ( print_function | int_assignment )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==PRINT) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // TestTree.g:28:7: print_function
                    {
                    pushFollow(FOLLOW_print_function_in_line49);
                    print_function();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // TestTree.g:29:4: int_assignment
                    {
                    pushFollow(FOLLOW_int_assignment_in_line54);
                    int_assignment1=int_assignment();

                    state._fsp--;


                    out("This line is about " + int_assignment1);

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
        return ;
    }
    // $ANTLR end "line"



    // $ANTLR start "print_function"
    // TestTree.g:31:1: print_function : ^( PRINT STRING ) ;
    public final void print_function() throws RecognitionException {
        try {
            // TestTree.g:32:2: ( ^( PRINT STRING ) )
            // TestTree.g:32:4: ^( PRINT STRING )
            {
            match(input,PRINT,FOLLOW_PRINT_in_print_function67); 

            match(input, Token.DOWN, null); 
            match(input,STRING,FOLLOW_STRING_in_print_function69); 

            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "print_function"



    // $ANTLR start "int_assignment"
    // TestTree.g:34:1: int_assignment returns [int result] : ^( '=' ID INT ) ;
    public final int int_assignment() throws RecognitionException {
        int result = 0;


        CommonTree ID2=null;
        CommonTree INT3=null;

        try {
            // TestTree.g:35:2: ( ^( '=' ID INT ) )
            // TestTree.g:35:4: ^( '=' ID INT )
            {
            match(input,20,FOLLOW_20_in_int_assignment85); 

            match(input, Token.DOWN, null); 
            ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_int_assignment87); 

            INT3=(CommonTree)match(input,INT,FOLLOW_INT_in_int_assignment89); 

            match(input, Token.UP, null); 



            					out((ID2!=null?ID2.getText():null) + " = " + (INT3!=null?INT3.getText():null));
            					result = toInt(INT3) + 1;
            					out((ID2!=null?ID2.getText():null) + " + 1 = " + result);
            					

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
    // $ANTLR end "int_assignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_line_in_program40 = new BitSet(new long[]{0x0000000000102002L});
    public static final BitSet FOLLOW_print_function_in_line49 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_assignment_in_line54 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print_function67 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_print_function69 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_20_in_int_assignment85 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_int_assignment87 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_INT_in_int_assignment89 = new BitSet(new long[]{0x0000000000000008L});

}