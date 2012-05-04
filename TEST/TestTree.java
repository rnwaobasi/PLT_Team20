// $ANTLR 3.4 /Users/shannonlee/PLT_Team20/TEST/TestTree.g 2012-05-04 15:43:13

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class TestTree extends DebugTreeParser {
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


public static final String[] ruleNames = new String[] {
    "invalidRule", "int_assignment", "line", "program", "print_function"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public TestTree(TreeNodeStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public TestTree(TreeNodeStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this, port, input.getTreeAdaptor());

        setDebugListener(proxy);
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
    }

public TestTree(TreeNodeStream input, DebugEventListener dbg) {
    super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

    public String[] getTokenNames() { return TestTree.tokenNames; }
    public String getGrammarFileName() { return "/Users/shannonlee/PLT_Team20/TEST/TestTree.g"; }



    // $ANTLR start "program"
    // /Users/shannonlee/PLT_Team20/TEST/TestTree.g:9:1: program : ( line )+ ;
    public final void program() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "program");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(9, 0);

        try {
            // /Users/shannonlee/PLT_Team20/TEST/TestTree.g:10:2: ( ( line )+ )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/TEST/TestTree.g:10:4: ( line )+
            {
            dbg.location(10,4);
            // /Users/shannonlee/PLT_Team20/TEST/TestTree.g:10:4: ( line )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==PRINT||LA1_0==20) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/shannonlee/PLT_Team20/TEST/TestTree.g:10:4: line
            	    {
            	    dbg.location(10,4);
            	    pushFollow(FOLLOW_line_in_program42);
            	    line();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
            } while (true);
            } finally {dbg.exitSubRule(1);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(11, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "program");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "program"



    // $ANTLR start "line"
    // /Users/shannonlee/PLT_Team20/TEST/TestTree.g:12:1: line : ( print_function | int_assignment );
    public final void line() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "line");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(12, 0);

        try {
            // /Users/shannonlee/PLT_Team20/TEST/TestTree.g:12:5: ( print_function | int_assignment )
            int alt2=2;
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/shannonlee/PLT_Team20/TEST/TestTree.g:12:7: print_function
                    {
                    dbg.location(12,7);
                    pushFollow(FOLLOW_print_function_in_line51);
                    print_function();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/shannonlee/PLT_Team20/TEST/TestTree.g:13:4: int_assignment
                    {
                    dbg.location(13,4);
                    pushFollow(FOLLOW_int_assignment_in_line56);
                    int_assignment();

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
        dbg.location(14, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "line");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "line"



    // $ANTLR start "print_function"
    // /Users/shannonlee/PLT_Team20/TEST/TestTree.g:15:1: print_function : ^( PRINT STRING ) ;
    public final void print_function() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "print_function");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(15, 0);

        try {
            // /Users/shannonlee/PLT_Team20/TEST/TestTree.g:16:2: ( ^( PRINT STRING ) )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/TEST/TestTree.g:16:4: ^( PRINT STRING )
            {
            dbg.location(16,4);
            dbg.location(16,6);
            match(input,PRINT,FOLLOW_PRINT_in_print_function67); 

            match(input, Token.DOWN, null); 
            dbg.location(16,12);
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
        dbg.location(17, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "print_function");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "print_function"



    // $ANTLR start "int_assignment"
    // /Users/shannonlee/PLT_Team20/TEST/TestTree.g:18:1: int_assignment : ^( '=' ID INT ) ;
    public final void int_assignment() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "int_assignment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(18, 0);

        try {
            // /Users/shannonlee/PLT_Team20/TEST/TestTree.g:19:2: ( ^( '=' ID INT ) )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/TEST/TestTree.g:19:4: ^( '=' ID INT )
            {
            dbg.location(19,4);
            dbg.location(19,6);
            match(input,20,FOLLOW_20_in_int_assignment81); 

            match(input, Token.DOWN, null); 
            dbg.location(19,10);
            match(input,ID,FOLLOW_ID_in_int_assignment83); 
            dbg.location(19,13);
            match(input,INT,FOLLOW_INT_in_int_assignment85); 

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
        dbg.location(20, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "int_assignment");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "int_assignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_line_in_program42 = new BitSet(new long[]{0x0000000000102002L});
    public static final BitSet FOLLOW_print_function_in_line51 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_assignment_in_line56 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_print_function67 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_print_function69 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_20_in_int_assignment81 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_int_assignment83 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_INT_in_int_assignment85 = new BitSet(new long[]{0x0000000000000008L});

}