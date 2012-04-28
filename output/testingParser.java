// $ANTLR 3.4 /Users/shannonlee/PLT_Team20/testing.g 2012-04-28 16:37:27

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class testingParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "ESC_SEQ", "EXPONENT", "FLOAT", "HEX_DIGIT", "ID", "INT", "LIST", "OCTAL_ESC", "STRING", "UNICODE_ESC", "WS", "','"
    };

    public static final int EOF=-1;
    public static final int T__17=17;
    public static final int CHAR=4;
    public static final int COMMENT=5;
    public static final int ESC_SEQ=6;
    public static final int EXPONENT=7;
    public static final int FLOAT=8;
    public static final int HEX_DIGIT=9;
    public static final int ID=10;
    public static final int INT=11;
    public static final int LIST=12;
    public static final int OCTAL_ESC=13;
    public static final int STRING=14;
    public static final int UNICODE_ESC=15;
    public static final int WS=16;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "list"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public testingParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public testingParser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this,port,adaptor);
        setDebugListener(proxy);
        setTokenStream(new DebugTokenStream(input,proxy));
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);
        proxy.setTreeAdaptor(adap);
    }

public testingParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg);
     
    TreeAdaptor adap = new CommonTreeAdaptor();
    setTreeAdaptor(adap);


}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

protected DebugTreeAdaptor adaptor;
public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = new DebugTreeAdaptor(dbg,adaptor);


}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}

    public String[] getTokenNames() { return testingParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/shannonlee/PLT_Team20/testing.g"; }


    public static class list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "list"
    // /Users/shannonlee/PLT_Team20/testing.g:11:1: list : ID ( ',' ID )* -> ^( LIST ID ) ;
    public final testingParser.list_return list() throws RecognitionException {
        testingParser.list_return retval = new testingParser.list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID1=null;
        Token char_literal2=null;
        Token ID3=null;

        Object ID1_tree=null;
        Object char_literal2_tree=null;
        Object ID3_tree=null;
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try { dbg.enterRule(getGrammarFileName(), "list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(11, 0);

        try {
            // /Users/shannonlee/PLT_Team20/testing.g:11:5: ( ID ( ',' ID )* -> ^( LIST ID ) )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/testing.g:11:7: ID ( ',' ID )*
            {
            dbg.location(11,7);
            ID1=(Token)match(input,ID,FOLLOW_ID_in_list26);  
            stream_ID.add(ID1);

            dbg.location(11,10);
            // /Users/shannonlee/PLT_Team20/testing.g:11:10: ( ',' ID )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/shannonlee/PLT_Team20/testing.g:11:11: ',' ID
            	    {
            	    dbg.location(11,11);
            	    char_literal2=(Token)match(input,17,FOLLOW_17_in_list29);  
            	    stream_17.add(char_literal2);

            	    dbg.location(11,15);
            	    ID3=(Token)match(input,ID,FOLLOW_ID_in_list31);  
            	    stream_ID.add(ID3);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 11:20: -> ^( LIST ID )
            {
                dbg.location(11,23);
                // /Users/shannonlee/PLT_Team20/testing.g:11:23: ^( LIST ID )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(11,25);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(LIST, "LIST")
                , root_1);

                dbg.location(11,30);
                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(12, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "list"

    // Delegated rules


 

    public static final BitSet FOLLOW_ID_in_list26 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_list29 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_list31 = new BitSet(new long[]{0x0000000000020002L});

}