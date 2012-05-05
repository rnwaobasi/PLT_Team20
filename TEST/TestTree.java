// $ANTLR 3.4 TestTree.g 2012-05-04 18:58:06

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TestTree extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "ESC_SEQ", "EXPONENT", "FLOAT", "HEX_DIGIT", "ID", "INT", "OCTAL_ESC", "PRINT", "STRING", "TIME", "TIMEBLOCK", "TIMES", "UNICODE_ESC", "WS", "'&'", "'('", "')'", "';'", "'='", "'~'"
    };

    public static final int EOF=-1;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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

                if ( (LA1_0==PRINT||LA1_0==20||LA1_0==24) ) {
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
    // TestTree.g:37:1: line : ( print_function | int_assignment | timeblock_inst | and_stmt );
    public final void line() throws RecognitionException {
        int int_assignment1 =0;


        try {
            // TestTree.g:37:5: ( print_function | int_assignment | timeblock_inst | and_stmt )
            int alt2=4;
            switch ( input.LA(1) ) {
            case PRINT:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==DOWN) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==ID) ) {
                        alt2=2;
                    }
                    else if ( (LA2_4==TIMEBLOCK) ) {
                        alt2=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;

                }
                }
                break;
            case 20:
                {
                alt2=4;
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
                    // TestTree.g:39:4: timeblock_inst
                    {
                    pushFollow(FOLLOW_timeblock_inst_in_line61);
                    timeblock_inst();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // TestTree.g:40:4: and_stmt
                    {
                    pushFollow(FOLLOW_and_stmt_in_line66);
                    and_stmt();

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
    // TestTree.g:42:1: print_function : ^( PRINT STRING ) ;
    public final void print_function() throws RecognitionException {
        CommonTree STRING2=null;

        try {
            // TestTree.g:43:2: ( ^( PRINT STRING ) )
            // TestTree.g:43:4: ^( PRINT STRING )
            {
            match(input,PRINT,FOLLOW_PRINT_in_print_function77); 

            match(input, Token.DOWN, null); 
            STRING2=(CommonTree)match(input,STRING,FOLLOW_STRING_in_print_function79); 

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
    // TestTree.g:45:1: int_assignment returns [int result] : ^( '=' ID INT ) ;
    public final int int_assignment() throws RecognitionException {
        int result = 0;


        CommonTree ID3=null;
        CommonTree INT4=null;

        try {
            // TestTree.g:46:2: ( ^( '=' ID INT ) )
            // TestTree.g:46:4: ^( '=' ID INT )
            {
            match(input,24,FOLLOW_24_in_int_assignment97); 

            match(input, Token.DOWN, null); 
            ID3=(CommonTree)match(input,ID,FOLLOW_ID_in_int_assignment99); 

            INT4=(CommonTree)match(input,INT,FOLLOW_INT_in_int_assignment101); 

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



    // $ANTLR start "timeblock_inst"
    // TestTree.g:52:1: timeblock_inst : ^( '=' TIMEBLOCK ID timeblock ) ;
    public final void timeblock_inst() throws RecognitionException {
        Timeblock timeblock5 =null;


        try {
            // TestTree.g:53:2: ( ^( '=' TIMEBLOCK ID timeblock ) )
            // TestTree.g:53:4: ^( '=' TIMEBLOCK ID timeblock )
            {
            match(input,24,FOLLOW_24_in_timeblock_inst114); 

            match(input, Token.DOWN, null); 
            match(input,TIMEBLOCK,FOLLOW_TIMEBLOCK_in_timeblock_inst116); 

            match(input,ID,FOLLOW_ID_in_timeblock_inst118); 

            pushFollow(FOLLOW_timeblock_in_timeblock_inst120);
            timeblock5=timeblock();

            state._fsp--;


            match(input, Token.UP, null); 


            out("Timeblock = " + timeblock5);

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
    // $ANTLR end "timeblock_inst"



    // $ANTLR start "timeblock"
    // TestTree.g:55:1: timeblock returns [Timeblock result] : ^( TIMES a= TIME b= TIME ) ;
    public final Timeblock timeblock() throws RecognitionException {
        Timeblock result = null;


        CommonTree a=null;
        CommonTree b=null;

        try {
            // TestTree.g:56:2: ( ^( TIMES a= TIME b= TIME ) )
            // TestTree.g:56:4: ^( TIMES a= TIME b= TIME )
            {
            match(input,TIMES,FOLLOW_TIMES_in_timeblock138); 

            match(input, Token.DOWN, null); 
            a=(CommonTree)match(input,TIME,FOLLOW_TIME_in_timeblock142); 

            b=(CommonTree)match(input,TIME,FOLLOW_TIME_in_timeblock146); 

            match(input, Token.UP, null); 



            		result = new Timeblock((a!=null?a.getText():null), (b!=null?b.getText():null));
            		

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
    // $ANTLR end "timeblock"



    // $ANTLR start "and_stmt"
    // TestTree.g:60:1: and_stmt : ^( '&' ID ID ) ;
    public final void and_stmt() throws RecognitionException {
        try {
            // TestTree.g:61:2: ( ^( '&' ID ID ) )
            // TestTree.g:61:4: ^( '&' ID ID )
            {
            match(input,20,FOLLOW_20_in_and_stmt160); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_and_stmt162); 

            match(input,ID,FOLLOW_ID_in_and_stmt164); 

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
    // $ANTLR end "and_stmt"

    // Delegated rules


 

    public static final BitSet FOLLOW_line_in_program40 = new BitSet(new long[]{0x0000000001102002L});
    public static final BitSet FOLLOW_print_function_in_line49 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_assignment_in_line54 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeblock_inst_in_line61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_stmt_in_line66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print_function77 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_print_function79 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_24_in_int_assignment97 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_int_assignment99 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_INT_in_int_assignment101 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_24_in_timeblock_inst114 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TIMEBLOCK_in_timeblock_inst116 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_timeblock_inst118 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_timeblock_in_timeblock_inst120 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMES_in_timeblock138 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TIME_in_timeblock142 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_TIME_in_timeblock146 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_20_in_and_stmt160 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_and_stmt162 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_and_stmt164 = new BitSet(new long[]{0x0000000000000008L});

}