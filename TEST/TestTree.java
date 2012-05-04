// $ANTLR 3.4 TestTree.g 2012-05-04 17:50:08

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TestTree extends TreeParser {
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
    	
    	// shortcut general print method
    	private void out(String str) {
    		System.out.println(str);
    	}

    	// for print statements
    	// gets rid of the surrounding quotes
    	private void print(String str) {
    		int oneBeforeEnd = str.length()-1;
    		String noQuotes = str.substring(1,oneBeforeEnd);
    		out(noQuotes);
    	}



    // $ANTLR start "program"
    // TestTree.g:34:1: program : ( line )+ ;
    public final void program() throws RecognitionException {
        try {
            // TestTree.g:35:2: ( ( line )+ )
            // TestTree.g:35:4: ( line )+
            {
            // TestTree.g:35:4: ( line )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==PRINT||(LA1_0 >= 21 && LA1_0 <= 22)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // TestTree.g:35:4: line
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
    // TestTree.g:37:1: line : ( print_function | int_assignment | declaration );
    public final void line() throws RecognitionException {
        int int_assignment1 =0;


        try {
            // TestTree.g:37:5: ( print_function | int_assignment | declaration )
            int alt2=3;
            switch ( input.LA(1) ) {
            case PRINT:
                {
                alt2=1;
                }
                break;
            case 21:
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
                    // TestTree.g:37:7: print_function
                    {
                    pushFollow(FOLLOW_print_function_in_line49);
                    print_function();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // TestTree.g:38:4: int_assignment
                    {
                    pushFollow(FOLLOW_int_assignment_in_line54);
                    int_assignment1=int_assignment();

                    state._fsp--;


                    out("This line is about " + int_assignment1);

                    }
                    break;
                case 3 :
                    // TestTree.g:39:4: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_line61);
                    declaration();

                    state._fsp--;


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
    // TestTree.g:41:1: print_function : ^( PRINT STRING ) ;
    public final void print_function() throws RecognitionException {
        CommonTree STRING2=null;

        try {
            // TestTree.g:42:2: ( ^( PRINT STRING ) )
            // TestTree.g:42:4: ^( PRINT STRING )
            {
            match(input,PRINT,FOLLOW_PRINT_in_print_function72); 

            match(input, Token.DOWN, null); 
            STRING2=(CommonTree)match(input,STRING,FOLLOW_STRING_in_print_function74); 

            match(input, Token.UP, null); 


            print((STRING2!=null?STRING2.getText():null));

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
    // TestTree.g:44:1: int_assignment returns [int result] : ^( '=' ID INT ) ;
    public final int int_assignment() throws RecognitionException {
        int result = 0;


        CommonTree ID3=null;
        CommonTree INT4=null;

        try {
            // TestTree.g:45:2: ( ^( '=' ID INT ) )
            // TestTree.g:45:4: ^( '=' ID INT )
            {
            match(input,21,FOLLOW_21_in_int_assignment92); 

            match(input, Token.DOWN, null); 
            ID3=(CommonTree)match(input,ID,FOLLOW_ID_in_int_assignment94); 

            INT4=(CommonTree)match(input,INT,FOLLOW_INT_in_int_assignment96); 

            match(input, Token.UP, null); 



            					out((ID3!=null?ID3.getText():null) + " = " + (INT4!=null?INT4.getText():null));
            					result = toInt(INT4) + 1;
            					out((ID3!=null?ID3.getText():null) + " + 1 = " + result);
            					

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



    // $ANTLR start "declaration"
    // TestTree.g:51:1: declaration : ^( 'new' COURSE ID ) ;
    public final void declaration() throws RecognitionException {
        try {
            // TestTree.g:52:2: ( ^( 'new' COURSE ID ) )
            // TestTree.g:52:4: ^( 'new' COURSE ID )
            {
            match(input,22,FOLLOW_22_in_declaration109); 

            match(input, Token.DOWN, null); 
            match(input,COURSE,FOLLOW_COURSE_in_declaration111); 

            match(input,ID,FOLLOW_ID_in_declaration113); 

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
    // $ANTLR end "declaration"

    // Delegated rules


 

    public static final BitSet FOLLOW_line_in_program40 = new BitSet(new long[]{0x0000000000604002L});
    public static final BitSet FOLLOW_print_function_in_line49 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_assignment_in_line54 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_line61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print_function72 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_print_function74 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_21_in_int_assignment92 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_int_assignment94 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INT_in_int_assignment96 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_22_in_declaration109 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_COURSE_in_declaration111 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_declaration113 = new BitSet(new long[]{0x0000000000000008L});

}