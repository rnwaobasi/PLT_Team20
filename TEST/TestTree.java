// $ANTLR 3.4 TestTree.g 2012-05-04 16:45:35

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TestTree extends TreeParser {
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



    // $ANTLR start "program"
    // TestTree.g:8:1: program : ( line )+ ;
    public final void program() throws RecognitionException {
        try {
            // TestTree.g:9:2: ( ( line )+ )
            // TestTree.g:9:4: ( line )+
            {
            // TestTree.g:9:4: ( line )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // TestTree.g:9:4: line
            	    {
            	    pushFollow(FOLLOW_line_in_program34);
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
    // TestTree.g:11:1: line : int_assignment ;
    public final void line() throws RecognitionException {
        try {
            // TestTree.g:11:5: ( int_assignment )
            // TestTree.g:12:6: int_assignment
            {
            pushFollow(FOLLOW_int_assignment_in_line45);
            int_assignment();

            state._fsp--;


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



    // $ANTLR start "int_assignment"
    // TestTree.g:17:1: int_assignment : ^( '=' ID INT ) ;
    public final void int_assignment() throws RecognitionException {
        CommonTree ID1=null;

        try {
            // TestTree.g:18:2: ( ^( '=' ID INT ) )
            // TestTree.g:18:4: ^( '=' ID INT )
            {
            match(input,18,FOLLOW_18_in_int_assignment58); 

            match(input, Token.DOWN, null); 
            ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_int_assignment60); 

            match(input,INT,FOLLOW_INT_in_int_assignment62); 

            match(input, Token.UP, null); 


            System.out.println((ID1!=null?ID1.getText():null));

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
    // $ANTLR end "int_assignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_line_in_program34 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_int_assignment_in_line45 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_int_assignment58 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_int_assignment60 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_INT_in_int_assignment62 = new BitSet(new long[]{0x0000000000000008L});

}