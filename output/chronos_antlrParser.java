// $ANTLR 3.4 /Users/shannonlee/PLT_Team20/chronos_antlr.g 2012-04-29 10:19:54

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class chronos_antlrParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "BLOCK", "BREAK_T", "CHAR", "COMMENT", "COND", "COURSELIST_T", "COURSE_T", "DATETIME", "DATETIME_T", "DAY", "DAYS", "DAY_T", "DECL", "DOUBLE_T", "ELSE_T", "EQ", "ESC_SEQ", "EXPONENT", "FLOAT", "FOREACH_T", "FUNC", "GEQ", "HEX_DIGIT", "ID", "IF_T", "INT", "INT_T", "IN_T", "LEQ", "NEQ", "NEW_T", "NOT", "OCTAL_ESC", "OR", "PARAMS", "SCHEDULE_T", "SOURCE_PROGRAM", "STRING", "STRING_T", "TIME", "TIMEBLOCK_T", "TIMES", "TIME_T", "UNICODE_ESC", "WHITESPACE", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "';'", "'<'", "'='", "'>'", "'F'", "'M'", "'R'", "'T'", "'W'", "'['", "']'", "'{'", "'}'", "'~'"
    };

    public static final int EOF=-1;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int AND=4;
    public static final int BLOCK=5;
    public static final int BREAK_T=6;
    public static final int CHAR=7;
    public static final int COMMENT=8;
    public static final int COND=9;
    public static final int COURSELIST_T=10;
    public static final int COURSE_T=11;
    public static final int DATETIME=12;
    public static final int DATETIME_T=13;
    public static final int DAY=14;
    public static final int DAYS=15;
    public static final int DAY_T=16;
    public static final int DECL=17;
    public static final int DOUBLE_T=18;
    public static final int ELSE_T=19;
    public static final int EQ=20;
    public static final int ESC_SEQ=21;
    public static final int EXPONENT=22;
    public static final int FLOAT=23;
    public static final int FOREACH_T=24;
    public static final int FUNC=25;
    public static final int GEQ=26;
    public static final int HEX_DIGIT=27;
    public static final int ID=28;
    public static final int IF_T=29;
    public static final int INT=30;
    public static final int INT_T=31;
    public static final int IN_T=32;
    public static final int LEQ=33;
    public static final int NEQ=34;
    public static final int NEW_T=35;
    public static final int NOT=36;
    public static final int OCTAL_ESC=37;
    public static final int OR=38;
    public static final int PARAMS=39;
    public static final int SCHEDULE_T=40;
    public static final int SOURCE_PROGRAM=41;
    public static final int STRING=42;
    public static final int STRING_T=43;
    public static final int TIME=44;
    public static final int TIMEBLOCK_T=45;
    public static final int TIMES=46;
    public static final int TIME_T=47;
    public static final int UNICODE_ESC=48;
    public static final int WHITESPACE=49;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "iteration_stmt", "derived_type_declarator", "type_specifier", 
    "dayblock", "primary_expr", "primitive_declarator", "stmt", "math_term", 
    "postfix_expr", "expr", "equiv_expr", "declarator", "datetime", "argument_expr_list", 
    "cond_term", "timeblock", "synpred1_chronos_antlr", "constant", "daychar", 
    "selection_stmt", "variable", "rel_expr", "unary_expr", "translation_unit", 
    "derived_type_specifier", "jump_stmt", "function", "math_expr"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, true, false, false, false, 
        false, false, false, false, false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public chronos_antlrParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public chronos_antlrParser(TokenStream input, int port, RecognizerSharedState state) {
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

public chronos_antlrParser(TokenStream input, DebugEventListener dbg) {
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

    public String[] getTokenNames() { return chronos_antlrParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/shannonlee/PLT_Team20/chronos_antlr.g"; }


    public static class translation_unit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "translation_unit"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:20:1: translation_unit : ( declarator )* ( stmt )* -> ^( SOURCE_PROGRAM ( declarator )* ( stmt )* ) ;
    public final chronos_antlrParser.translation_unit_return translation_unit() throws RecognitionException {
        chronos_antlrParser.translation_unit_return retval = new chronos_antlrParser.translation_unit_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        chronos_antlrParser.declarator_return declarator1 =null;

        chronos_antlrParser.stmt_return stmt2 =null;


        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try { dbg.enterRule(getGrammarFileName(), "translation_unit");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(20, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:21:2: ( ( declarator )* ( stmt )* -> ^( SOURCE_PROGRAM ( declarator )* ( stmt )* ) )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:21:4: ( declarator )* ( stmt )*
            {
            dbg.location(21,4);
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:21:4: ( declarator )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==DAY_T||LA1_0==DOUBLE_T||LA1_0==INT_T||LA1_0==NEW_T||LA1_0==STRING_T||LA1_0==TIME_T) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:21:4: declarator
            	    {
            	    dbg.location(21,4);
            	    pushFollow(FOLLOW_declarator_in_translation_unit67);
            	    declarator1=declarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declarator.add(declarator1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(21,16);
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:21:16: ( stmt )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==BREAK_T||(LA2_0 >= FLOAT && LA2_0 <= FOREACH_T)||(LA2_0 >= ID && LA2_0 <= INT)||LA2_0==NOT||LA2_0==STRING||LA2_0==TIME||LA2_0==50||LA2_0==58||LA2_0==67) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:21:16: stmt
            	    {
            	    dbg.location(21,16);
            	    pushFollow(FOLLOW_stmt_in_translation_unit70);
            	    stmt2=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stmt.add(stmt2.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);
            } finally {dbg.exitSubRule(2);}


            // AST REWRITE
            // elements: stmt, declarator
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 22:4: -> ^( SOURCE_PROGRAM ( declarator )* ( stmt )* )
            {
                dbg.location(22,7);
                // /Users/shannonlee/PLT_Team20/chronos_antlr.g:22:7: ^( SOURCE_PROGRAM ( declarator )* ( stmt )* )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(22,9);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SOURCE_PROGRAM, "SOURCE_PROGRAM")
                , root_1);

                dbg.location(22,24);
                // /Users/shannonlee/PLT_Team20/chronos_antlr.g:22:24: ( declarator )*
                while ( stream_declarator.hasNext() ) {
                    dbg.location(22,24);
                    adaptor.addChild(root_1, stream_declarator.nextTree());

                }
                stream_declarator.reset();
                dbg.location(22,36);
                // /Users/shannonlee/PLT_Team20/chronos_antlr.g:22:36: ( stmt )*
                while ( stream_stmt.hasNext() ) {
                    dbg.location(22,36);
                    adaptor.addChild(root_1, stream_stmt.nextTree());

                }
                stream_stmt.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(23, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "translation_unit");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "translation_unit"


    public static class declarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declarator"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:24:1: declarator : ( primitive_declarator ';' !| derived_type_declarator ';' !);
    public final chronos_antlrParser.declarator_return declarator() throws RecognitionException {
        chronos_antlrParser.declarator_return retval = new chronos_antlrParser.declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal4=null;
        Token char_literal6=null;
        chronos_antlrParser.primitive_declarator_return primitive_declarator3 =null;

        chronos_antlrParser.derived_type_declarator_return derived_type_declarator5 =null;


        Object char_literal4_tree=null;
        Object char_literal6_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "declarator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(24, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:25:2: ( primitive_declarator ';' !| derived_type_declarator ';' !)
            int alt3=2;
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            int LA3_0 = input.LA(1);

            if ( (LA3_0==DAY_T||LA3_0==DOUBLE_T||LA3_0==INT_T||LA3_0==STRING_T||LA3_0==TIME_T) ) {
                alt3=1;
            }
            else if ( (LA3_0==NEW_T) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:25:4: primitive_declarator ';' !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(25,4);
                    pushFollow(FOLLOW_primitive_declarator_in_declarator97);
                    primitive_declarator3=primitive_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitive_declarator3.getTree());
                    dbg.location(25,27);
                    char_literal4=(Token)match(input,58,FOLLOW_58_in_declarator98); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:26:4: derived_type_declarator ';' !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(26,4);
                    pushFollow(FOLLOW_derived_type_declarator_in_declarator104);
                    derived_type_declarator5=derived_type_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, derived_type_declarator5.getTree());
                    dbg.location(26,30);
                    char_literal6=(Token)match(input,58,FOLLOW_58_in_declarator105); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(27, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "declarator");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "declarator"


    public static class primitive_declarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primitive_declarator"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:28:1: primitive_declarator : ( type_specifier ID -> ^( DECL type_specifier ID ) | type_specifier ID '=' expr -> ^( '=' ^( DECL type_specifier ID ) expr ) );
    public final chronos_antlrParser.primitive_declarator_return primitive_declarator() throws RecognitionException {
        chronos_antlrParser.primitive_declarator_return retval = new chronos_antlrParser.primitive_declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID8=null;
        Token ID10=null;
        Token char_literal11=null;
        chronos_antlrParser.type_specifier_return type_specifier7 =null;

        chronos_antlrParser.type_specifier_return type_specifier9 =null;

        chronos_antlrParser.expr_return expr12 =null;


        Object ID8_tree=null;
        Object ID10_tree=null;
        Object char_literal11_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_type_specifier=new RewriteRuleSubtreeStream(adaptor,"rule type_specifier");
        try { dbg.enterRule(getGrammarFileName(), "primitive_declarator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(28, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:29:2: ( type_specifier ID -> ^( DECL type_specifier ID ) | type_specifier ID '=' expr -> ^( '=' ^( DECL type_specifier ID ) expr ) )
            int alt4=2;
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==DAY_T||LA4_0==DOUBLE_T||LA4_0==INT_T||LA4_0==STRING_T||LA4_0==TIME_T) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==ID) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==60) ) {
                        alt4=2;
                    }
                    else if ( (LA4_2==58) ) {
                        alt4=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:29:4: type_specifier ID
                    {
                    dbg.location(29,4);
                    pushFollow(FOLLOW_type_specifier_in_primitive_declarator116);
                    type_specifier7=type_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_specifier.add(type_specifier7.getTree());
                    dbg.location(29,19);
                    ID8=(Token)match(input,ID,FOLLOW_ID_in_primitive_declarator118); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID8);


                    // AST REWRITE
                    // elements: type_specifier, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 30:4: -> ^( DECL type_specifier ID )
                    {
                        dbg.location(30,7);
                        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:30:7: ^( DECL type_specifier ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(30,9);
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECL, "DECL")
                        , root_1);

                        dbg.location(30,14);
                        adaptor.addChild(root_1, stream_type_specifier.nextTree());
                        dbg.location(30,29);
                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:31:4: type_specifier ID '=' expr
                    {
                    dbg.location(31,4);
                    pushFollow(FOLLOW_type_specifier_in_primitive_declarator137);
                    type_specifier9=type_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_specifier.add(type_specifier9.getTree());
                    dbg.location(31,19);
                    ID10=(Token)match(input,ID,FOLLOW_ID_in_primitive_declarator139); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID10);

                    dbg.location(31,22);
                    char_literal11=(Token)match(input,60,FOLLOW_60_in_primitive_declarator141); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_60.add(char_literal11);

                    dbg.location(31,26);
                    pushFollow(FOLLOW_expr_in_primitive_declarator143);
                    expr12=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr12.getTree());

                    // AST REWRITE
                    // elements: ID, 60, expr, type_specifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 32:4: -> ^( '=' ^( DECL type_specifier ID ) expr )
                    {
                        dbg.location(32,7);
                        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:32:7: ^( '=' ^( DECL type_specifier ID ) expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(32,9);
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_60.nextNode()
                        , root_1);

                        dbg.location(32,13);
                        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:32:13: ^( DECL type_specifier ID )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(32,15);
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECL, "DECL")
                        , root_2);

                        dbg.location(32,20);
                        adaptor.addChild(root_2, stream_type_specifier.nextTree());
                        dbg.location(32,35);
                        adaptor.addChild(root_2, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(32,39);
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(33, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "primitive_declarator");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "primitive_declarator"


    public static class derived_type_declarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "derived_type_declarator"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:34:1: derived_type_declarator : ( NEW_T derived_type_specifier ID -> ^( DECL derived_type_specifier ID ) | NEW_T derived_type_specifier ID '=' expr -> ^( '=' ^( DECL derived_type_specifier ID ) expr ) );
    public final chronos_antlrParser.derived_type_declarator_return derived_type_declarator() throws RecognitionException {
        chronos_antlrParser.derived_type_declarator_return retval = new chronos_antlrParser.derived_type_declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NEW_T13=null;
        Token ID15=null;
        Token NEW_T16=null;
        Token ID18=null;
        Token char_literal19=null;
        chronos_antlrParser.derived_type_specifier_return derived_type_specifier14 =null;

        chronos_antlrParser.derived_type_specifier_return derived_type_specifier17 =null;

        chronos_antlrParser.expr_return expr20 =null;


        Object NEW_T13_tree=null;
        Object ID15_tree=null;
        Object NEW_T16_tree=null;
        Object ID18_tree=null;
        Object char_literal19_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_NEW_T=new RewriteRuleTokenStream(adaptor,"token NEW_T");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleSubtreeStream stream_derived_type_specifier=new RewriteRuleSubtreeStream(adaptor,"rule derived_type_specifier");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "derived_type_declarator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(34, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:35:2: ( NEW_T derived_type_specifier ID -> ^( DECL derived_type_specifier ID ) | NEW_T derived_type_specifier ID '=' expr -> ^( '=' ^( DECL derived_type_specifier ID ) expr ) )
            int alt5=2;
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==NEW_T) ) {
                int LA5_1 = input.LA(2);

                if ( ((LA5_1 >= COURSELIST_T && LA5_1 <= COURSE_T)||LA5_1==DATETIME_T||LA5_1==SCHEDULE_T||LA5_1==TIMEBLOCK_T) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==ID) ) {
                        int LA5_3 = input.LA(4);

                        if ( (LA5_3==60) ) {
                            alt5=2;
                        }
                        else if ( (LA5_3==58) ) {
                            alt5=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 3, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:35:4: NEW_T derived_type_specifier ID
                    {
                    dbg.location(35,4);
                    NEW_T13=(Token)match(input,NEW_T,FOLLOW_NEW_T_in_derived_type_declarator173); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW_T.add(NEW_T13);

                    dbg.location(35,10);
                    pushFollow(FOLLOW_derived_type_specifier_in_derived_type_declarator175);
                    derived_type_specifier14=derived_type_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_derived_type_specifier.add(derived_type_specifier14.getTree());
                    dbg.location(35,33);
                    ID15=(Token)match(input,ID,FOLLOW_ID_in_derived_type_declarator177); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID15);


                    // AST REWRITE
                    // elements: ID, derived_type_specifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 36:4: -> ^( DECL derived_type_specifier ID )
                    {
                        dbg.location(36,7);
                        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:36:7: ^( DECL derived_type_specifier ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(36,9);
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECL, "DECL")
                        , root_1);

                        dbg.location(36,14);
                        adaptor.addChild(root_1, stream_derived_type_specifier.nextTree());
                        dbg.location(36,37);
                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:37:4: NEW_T derived_type_specifier ID '=' expr
                    {
                    dbg.location(37,4);
                    NEW_T16=(Token)match(input,NEW_T,FOLLOW_NEW_T_in_derived_type_declarator196); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW_T.add(NEW_T16);

                    dbg.location(37,10);
                    pushFollow(FOLLOW_derived_type_specifier_in_derived_type_declarator198);
                    derived_type_specifier17=derived_type_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_derived_type_specifier.add(derived_type_specifier17.getTree());
                    dbg.location(37,33);
                    ID18=(Token)match(input,ID,FOLLOW_ID_in_derived_type_declarator200); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID18);

                    dbg.location(37,36);
                    char_literal19=(Token)match(input,60,FOLLOW_60_in_derived_type_declarator202); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_60.add(char_literal19);

                    dbg.location(37,40);
                    pushFollow(FOLLOW_expr_in_derived_type_declarator204);
                    expr20=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr20.getTree());

                    // AST REWRITE
                    // elements: derived_type_specifier, expr, ID, 60
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 38:4: -> ^( '=' ^( DECL derived_type_specifier ID ) expr )
                    {
                        dbg.location(38,7);
                        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:38:7: ^( '=' ^( DECL derived_type_specifier ID ) expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(38,9);
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_60.nextNode()
                        , root_1);

                        dbg.location(38,13);
                        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:38:13: ^( DECL derived_type_specifier ID )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(38,15);
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECL, "DECL")
                        , root_2);

                        dbg.location(38,20);
                        adaptor.addChild(root_2, stream_derived_type_specifier.nextTree());
                        dbg.location(38,43);
                        adaptor.addChild(root_2, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(38,47);
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(39, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "derived_type_declarator");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "derived_type_declarator"


    public static class stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:40:1: stmt : ( expr ';' -> expr | selection_stmt | iteration_stmt | jump_stmt ';' -> jump_stmt | ';' !);
    public final chronos_antlrParser.stmt_return stmt() throws RecognitionException {
        chronos_antlrParser.stmt_return retval = new chronos_antlrParser.stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal22=null;
        Token char_literal26=null;
        Token char_literal27=null;
        chronos_antlrParser.expr_return expr21 =null;

        chronos_antlrParser.selection_stmt_return selection_stmt23 =null;

        chronos_antlrParser.iteration_stmt_return iteration_stmt24 =null;

        chronos_antlrParser.jump_stmt_return jump_stmt25 =null;


        Object char_literal22_tree=null;
        Object char_literal26_tree=null;
        Object char_literal27_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleSubtreeStream stream_jump_stmt=new RewriteRuleSubtreeStream(adaptor,"rule jump_stmt");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(40, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:40:5: ( expr ';' -> expr | selection_stmt | iteration_stmt | jump_stmt ';' -> jump_stmt | ';' !)
            int alt6=5;
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            switch ( input.LA(1) ) {
            case FLOAT:
            case ID:
            case INT:
            case NOT:
            case STRING:
            case TIME:
            case 50:
            case 67:
                {
                alt6=1;
                }
                break;
            case IF_T:
                {
                alt6=2;
                }
                break;
            case FOREACH_T:
                {
                alt6=3;
                }
                break;
            case BREAK_T:
                {
                alt6=4;
                }
                break;
            case 58:
                {
                alt6=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:40:7: expr ';'
                    {
                    dbg.location(40,7);
                    pushFollow(FOLLOW_expr_in_stmt232);
                    expr21=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr21.getTree());
                    dbg.location(40,11);
                    char_literal22=(Token)match(input,58,FOLLOW_58_in_stmt233); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_58.add(char_literal22);


                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 40:15: -> expr
                    {
                        dbg.location(40,18);
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:41:4: selection_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(41,4);
                    pushFollow(FOLLOW_selection_stmt_in_stmt242);
                    selection_stmt23=selection_stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, selection_stmt23.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:42:4: iteration_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(42,4);
                    pushFollow(FOLLOW_iteration_stmt_in_stmt247);
                    iteration_stmt24=iteration_stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iteration_stmt24.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:43:4: jump_stmt ';'
                    {
                    dbg.location(43,4);
                    pushFollow(FOLLOW_jump_stmt_in_stmt252);
                    jump_stmt25=jump_stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_jump_stmt.add(jump_stmt25.getTree());
                    dbg.location(43,13);
                    char_literal26=(Token)match(input,58,FOLLOW_58_in_stmt253); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_58.add(char_literal26);


                    // AST REWRITE
                    // elements: jump_stmt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 43:17: -> jump_stmt
                    {
                        dbg.location(43,20);
                        adaptor.addChild(root_0, stream_jump_stmt.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:44:4: ';' !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(44,7);
                    char_literal27=(Token)match(input,58,FOLLOW_58_in_stmt262); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(45, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "stmt"


    public static class selection_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selection_stmt"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:46:1: selection_stmt : IF_T expr '{' (a= declarator )* (b= stmt )* '}' ( ELSE_T '{' (c= stmt )* '}' )? -> ^( COND ^( IF_T expr ( $a)* ( $b)* ) ( ^( ELSE_T ( $c)* ) )? ) ;
    public final chronos_antlrParser.selection_stmt_return selection_stmt() throws RecognitionException {
        chronos_antlrParser.selection_stmt_return retval = new chronos_antlrParser.selection_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF_T28=null;
        Token char_literal30=null;
        Token char_literal31=null;
        Token ELSE_T32=null;
        Token char_literal33=null;
        Token char_literal34=null;
        chronos_antlrParser.declarator_return a =null;

        chronos_antlrParser.stmt_return b =null;

        chronos_antlrParser.stmt_return c =null;

        chronos_antlrParser.expr_return expr29 =null;


        Object IF_T28_tree=null;
        Object char_literal30_tree=null;
        Object char_literal31_tree=null;
        Object ELSE_T32_tree=null;
        Object char_literal33_tree=null;
        Object char_literal34_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_IF_T=new RewriteRuleTokenStream(adaptor,"token IF_T");
        RewriteRuleTokenStream stream_ELSE_T=new RewriteRuleTokenStream(adaptor,"token ELSE_T");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "selection_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(46, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:47:2: ( IF_T expr '{' (a= declarator )* (b= stmt )* '}' ( ELSE_T '{' (c= stmt )* '}' )? -> ^( COND ^( IF_T expr ( $a)* ( $b)* ) ( ^( ELSE_T ( $c)* ) )? ) )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:47:4: IF_T expr '{' (a= declarator )* (b= stmt )* '}' ( ELSE_T '{' (c= stmt )* '}' )?
            {
            dbg.location(47,4);
            IF_T28=(Token)match(input,IF_T,FOLLOW_IF_T_in_selection_stmt273); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF_T.add(IF_T28);

            dbg.location(47,9);
            pushFollow(FOLLOW_expr_in_selection_stmt275);
            expr29=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr29.getTree());
            dbg.location(47,14);
            char_literal30=(Token)match(input,69,FOLLOW_69_in_selection_stmt277); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_69.add(char_literal30);

            dbg.location(47,17);
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:47:17: (a= declarator )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==DAY_T||LA7_0==DOUBLE_T||LA7_0==INT_T||LA7_0==NEW_T||LA7_0==STRING_T||LA7_0==TIME_T) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:47:18: a= declarator
            	    {
            	    dbg.location(47,19);
            	    pushFollow(FOLLOW_declarator_in_selection_stmt281);
            	    a=declarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declarator.add(a.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);
            } finally {dbg.exitSubRule(7);}

            dbg.location(47,33);
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:47:33: (b= stmt )*
            try { dbg.enterSubRule(8);

            loop8:
            do {
                int alt8=2;
                try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                int LA8_0 = input.LA(1);

                if ( (LA8_0==BREAK_T||(LA8_0 >= FLOAT && LA8_0 <= FOREACH_T)||(LA8_0 >= ID && LA8_0 <= INT)||LA8_0==NOT||LA8_0==STRING||LA8_0==TIME||LA8_0==50||LA8_0==58||LA8_0==67) ) {
                    alt8=1;
                }


                } finally {dbg.exitDecision(8);}

                switch (alt8) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:47:34: b= stmt
            	    {
            	    dbg.location(47,35);
            	    pushFollow(FOLLOW_stmt_in_selection_stmt288);
            	    b=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stmt.add(b.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);
            } finally {dbg.exitSubRule(8);}

            dbg.location(47,42);
            char_literal31=(Token)match(input,70,FOLLOW_70_in_selection_stmt291); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_70.add(char_literal31);

            dbg.location(47,46);
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:47:46: ( ELSE_T '{' (c= stmt )* '}' )?
            int alt10=2;
            try { dbg.enterSubRule(10);
            try { dbg.enterDecision(10, decisionCanBacktrack[10]);

            int LA10_0 = input.LA(1);

            if ( (LA10_0==ELSE_T) ) {
                alt10=1;
            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:47:47: ELSE_T '{' (c= stmt )* '}'
                    {
                    dbg.location(47,47);
                    ELSE_T32=(Token)match(input,ELSE_T,FOLLOW_ELSE_T_in_selection_stmt294); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE_T.add(ELSE_T32);

                    dbg.location(47,54);
                    char_literal33=(Token)match(input,69,FOLLOW_69_in_selection_stmt296); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_69.add(char_literal33);

                    dbg.location(47,57);
                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:47:57: (c= stmt )*
                    try { dbg.enterSubRule(9);

                    loop9:
                    do {
                        int alt9=2;
                        try { dbg.enterDecision(9, decisionCanBacktrack[9]);

                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==BREAK_T||(LA9_0 >= FLOAT && LA9_0 <= FOREACH_T)||(LA9_0 >= ID && LA9_0 <= INT)||LA9_0==NOT||LA9_0==STRING||LA9_0==TIME||LA9_0==50||LA9_0==58||LA9_0==67) ) {
                            alt9=1;
                        }


                        } finally {dbg.exitDecision(9);}

                        switch (alt9) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:47:58: c= stmt
                    	    {
                    	    dbg.location(47,59);
                    	    pushFollow(FOLLOW_stmt_in_selection_stmt300);
                    	    c=stmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_stmt.add(c.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(9);}

                    dbg.location(47,66);
                    char_literal34=(Token)match(input,70,FOLLOW_70_in_selection_stmt303); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_70.add(char_literal34);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(10);}


            // AST REWRITE
            // elements: expr, ELSE_T, c, a, b, IF_T
            // token labels: 
            // rule labels: retval, b, c, a
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
            RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

            root_0 = (Object)adaptor.nil();
            // 48:4: -> ^( COND ^( IF_T expr ( $a)* ( $b)* ) ( ^( ELSE_T ( $c)* ) )? )
            {
                dbg.location(48,7);
                // /Users/shannonlee/PLT_Team20/chronos_antlr.g:48:7: ^( COND ^( IF_T expr ( $a)* ( $b)* ) ( ^( ELSE_T ( $c)* ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(48,9);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COND, "COND")
                , root_1);

                dbg.location(48,14);
                // /Users/shannonlee/PLT_Team20/chronos_antlr.g:48:14: ^( IF_T expr ( $a)* ( $b)* )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(48,16);
                root_2 = (Object)adaptor.becomeRoot(
                stream_IF_T.nextNode()
                , root_2);

                dbg.location(48,21);
                adaptor.addChild(root_2, stream_expr.nextTree());
                dbg.location(48,27);
                // /Users/shannonlee/PLT_Team20/chronos_antlr.g:48:27: ( $a)*
                while ( stream_a.hasNext() ) {
                    dbg.location(48,27);
                    adaptor.addChild(root_2, stream_a.nextTree());

                }
                stream_a.reset();
                dbg.location(48,31);
                // /Users/shannonlee/PLT_Team20/chronos_antlr.g:48:31: ( $b)*
                while ( stream_b.hasNext() ) {
                    dbg.location(48,31);
                    adaptor.addChild(root_2, stream_b.nextTree());

                }
                stream_b.reset();

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(48,35);
                // /Users/shannonlee/PLT_Team20/chronos_antlr.g:48:35: ( ^( ELSE_T ( $c)* ) )?
                if ( stream_ELSE_T.hasNext()||stream_c.hasNext() ) {
                    dbg.location(48,35);
                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:48:35: ^( ELSE_T ( $c)* )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    dbg.location(48,37);
                    root_2 = (Object)adaptor.becomeRoot(
                    stream_ELSE_T.nextNode()
                    , root_2);

                    dbg.location(48,45);
                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:48:45: ( $c)*
                    while ( stream_c.hasNext() ) {
                        dbg.location(48,45);
                        adaptor.addChild(root_2, stream_c.nextTree());

                    }
                    stream_c.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_ELSE_T.reset();
                stream_c.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(49, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "selection_stmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "selection_stmt"


    public static class iteration_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "iteration_stmt"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:50:1: iteration_stmt : FOREACH_T COURSE_T element= ID IN_T list= ID '{' ( declarator ';' )* ( stmt )* '}' -> ^( FOREACH_T ^( IN_T $element $list) ^( BLOCK ( declarator )* ( stmt )* ) ) ;
    public final chronos_antlrParser.iteration_stmt_return iteration_stmt() throws RecognitionException {
        chronos_antlrParser.iteration_stmt_return retval = new chronos_antlrParser.iteration_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token element=null;
        Token list=null;
        Token FOREACH_T35=null;
        Token COURSE_T36=null;
        Token IN_T37=null;
        Token char_literal38=null;
        Token char_literal40=null;
        Token char_literal42=null;
        chronos_antlrParser.declarator_return declarator39 =null;

        chronos_antlrParser.stmt_return stmt41 =null;


        Object element_tree=null;
        Object list_tree=null;
        Object FOREACH_T35_tree=null;
        Object COURSE_T36_tree=null;
        Object IN_T37_tree=null;
        Object char_literal38_tree=null;
        Object char_literal40_tree=null;
        Object char_literal42_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_COURSE_T=new RewriteRuleTokenStream(adaptor,"token COURSE_T");
        RewriteRuleTokenStream stream_FOREACH_T=new RewriteRuleTokenStream(adaptor,"token FOREACH_T");
        RewriteRuleTokenStream stream_IN_T=new RewriteRuleTokenStream(adaptor,"token IN_T");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try { dbg.enterRule(getGrammarFileName(), "iteration_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(50, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:51:2: ( FOREACH_T COURSE_T element= ID IN_T list= ID '{' ( declarator ';' )* ( stmt )* '}' -> ^( FOREACH_T ^( IN_T $element $list) ^( BLOCK ( declarator )* ( stmt )* ) ) )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:51:4: FOREACH_T COURSE_T element= ID IN_T list= ID '{' ( declarator ';' )* ( stmt )* '}'
            {
            dbg.location(51,4);
            FOREACH_T35=(Token)match(input,FOREACH_T,FOLLOW_FOREACH_T_in_iteration_stmt348); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOREACH_T.add(FOREACH_T35);

            dbg.location(51,14);
            COURSE_T36=(Token)match(input,COURSE_T,FOLLOW_COURSE_T_in_iteration_stmt350); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COURSE_T.add(COURSE_T36);

            dbg.location(51,30);
            element=(Token)match(input,ID,FOLLOW_ID_in_iteration_stmt354); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(element);

            dbg.location(51,34);
            IN_T37=(Token)match(input,IN_T,FOLLOW_IN_T_in_iteration_stmt356); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IN_T.add(IN_T37);

            dbg.location(51,43);
            list=(Token)match(input,ID,FOLLOW_ID_in_iteration_stmt360); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(list);

            dbg.location(51,47);
            char_literal38=(Token)match(input,69,FOLLOW_69_in_iteration_stmt362); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_69.add(char_literal38);

            dbg.location(51,51);
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:51:51: ( declarator ';' )*
            try { dbg.enterSubRule(11);

            loop11:
            do {
                int alt11=2;
                try { dbg.enterDecision(11, decisionCanBacktrack[11]);

                int LA11_0 = input.LA(1);

                if ( (LA11_0==DAY_T||LA11_0==DOUBLE_T||LA11_0==INT_T||LA11_0==NEW_T||LA11_0==STRING_T||LA11_0==TIME_T) ) {
                    alt11=1;
                }


                } finally {dbg.exitDecision(11);}

                switch (alt11) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:51:52: declarator ';'
            	    {
            	    dbg.location(51,52);
            	    pushFollow(FOLLOW_declarator_in_iteration_stmt365);
            	    declarator39=declarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declarator.add(declarator39.getTree());
            	    dbg.location(51,62);
            	    char_literal40=(Token)match(input,58,FOLLOW_58_in_iteration_stmt366); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_58.add(char_literal40);


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);
            } finally {dbg.exitSubRule(11);}

            dbg.location(51,68);
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:51:68: ( stmt )*
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                int LA12_0 = input.LA(1);

                if ( (LA12_0==BREAK_T||(LA12_0 >= FLOAT && LA12_0 <= FOREACH_T)||(LA12_0 >= ID && LA12_0 <= INT)||LA12_0==NOT||LA12_0==STRING||LA12_0==TIME||LA12_0==50||LA12_0==58||LA12_0==67) ) {
                    alt12=1;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:51:69: stmt
            	    {
            	    dbg.location(51,69);
            	    pushFollow(FOLLOW_stmt_in_iteration_stmt371);
            	    stmt41=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_stmt.add(stmt41.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);
            } finally {dbg.exitSubRule(12);}

            dbg.location(51,76);
            char_literal42=(Token)match(input,70,FOLLOW_70_in_iteration_stmt375); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_70.add(char_literal42);


            // AST REWRITE
            // elements: declarator, IN_T, element, stmt, FOREACH_T, list
            // token labels: element, list
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_element=new RewriteRuleTokenStream(adaptor,"token element",element);
            RewriteRuleTokenStream stream_list=new RewriteRuleTokenStream(adaptor,"token list",list);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 52:4: -> ^( FOREACH_T ^( IN_T $element $list) ^( BLOCK ( declarator )* ( stmt )* ) )
            {
                dbg.location(52,7);
                // /Users/shannonlee/PLT_Team20/chronos_antlr.g:52:7: ^( FOREACH_T ^( IN_T $element $list) ^( BLOCK ( declarator )* ( stmt )* ) )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(52,9);
                root_1 = (Object)adaptor.becomeRoot(
                stream_FOREACH_T.nextNode()
                , root_1);

                dbg.location(52,19);
                // /Users/shannonlee/PLT_Team20/chronos_antlr.g:52:19: ^( IN_T $element $list)
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(52,21);
                root_2 = (Object)adaptor.becomeRoot(
                stream_IN_T.nextNode()
                , root_2);

                dbg.location(52,27);
                adaptor.addChild(root_2, stream_element.nextNode());
                dbg.location(52,36);
                adaptor.addChild(root_2, stream_list.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(52,42);
                // /Users/shannonlee/PLT_Team20/chronos_antlr.g:52:42: ^( BLOCK ( declarator )* ( stmt )* )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(52,44);
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BLOCK, "BLOCK")
                , root_2);

                dbg.location(52,50);
                // /Users/shannonlee/PLT_Team20/chronos_antlr.g:52:50: ( declarator )*
                while ( stream_declarator.hasNext() ) {
                    dbg.location(52,51);
                    adaptor.addChild(root_2, stream_declarator.nextTree());

                }
                stream_declarator.reset();
                dbg.location(52,64);
                // /Users/shannonlee/PLT_Team20/chronos_antlr.g:52:64: ( stmt )*
                while ( stream_stmt.hasNext() ) {
                    dbg.location(52,65);
                    adaptor.addChild(root_2, stream_stmt.nextTree());

                }
                stream_stmt.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(53, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "iteration_stmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "iteration_stmt"


    public static class jump_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "jump_stmt"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:54:1: jump_stmt : BREAK_T ;
    public final chronos_antlrParser.jump_stmt_return jump_stmt() throws RecognitionException {
        chronos_antlrParser.jump_stmt_return retval = new chronos_antlrParser.jump_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BREAK_T43=null;

        Object BREAK_T43_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "jump_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(54, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:55:2: ( BREAK_T )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:55:4: BREAK_T
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(55,4);
            BREAK_T43=(Token)match(input,BREAK_T,FOLLOW_BREAK_T_in_jump_stmt421); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BREAK_T43_tree = 
            (Object)adaptor.create(BREAK_T43)
            ;
            adaptor.addChild(root_0, BREAK_T43_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(56, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "jump_stmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "jump_stmt"


    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:57:1: expr : ( cond_term ( OR ^ cond_term )* | ID '=' ^ expr );
    public final chronos_antlrParser.expr_return expr() throws RecognitionException {
        chronos_antlrParser.expr_return retval = new chronos_antlrParser.expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OR45=null;
        Token ID47=null;
        Token char_literal48=null;
        chronos_antlrParser.cond_term_return cond_term44 =null;

        chronos_antlrParser.cond_term_return cond_term46 =null;

        chronos_antlrParser.expr_return expr49 =null;


        Object OR45_tree=null;
        Object ID47_tree=null;
        Object char_literal48_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(57, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:58:2: ( cond_term ( OR ^ cond_term )* | ID '=' ^ expr )
            int alt14=2;
            try { dbg.enterDecision(14, decisionCanBacktrack[14]);

            int LA14_0 = input.LA(1);

            if ( (LA14_0==ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==AND||LA14_1==EQ||LA14_1==GEQ||(LA14_1 >= LEQ && LA14_1 <= NEQ)||LA14_1==OR||(LA14_1 >= 50 && LA14_1 <= 59)||LA14_1==61||LA14_1==69) ) {
                    alt14=1;
                }
                else if ( (LA14_1==60) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA14_0==FLOAT||LA14_0==INT||LA14_0==NOT||LA14_0==STRING||LA14_0==TIME||LA14_0==50||LA14_0==67) ) {
                alt14=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:58:4: cond_term ( OR ^ cond_term )*
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(58,4);
                    pushFollow(FOLLOW_cond_term_in_expr431);
                    cond_term44=cond_term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cond_term44.getTree());
                    dbg.location(58,14);
                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:58:14: ( OR ^ cond_term )*
                    try { dbg.enterSubRule(13);

                    loop13:
                    do {
                        int alt13=2;
                        try { dbg.enterDecision(13, decisionCanBacktrack[13]);

                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==OR) ) {
                            alt13=1;
                        }


                        } finally {dbg.exitDecision(13);}

                        switch (alt13) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:58:15: OR ^ cond_term
                    	    {
                    	    dbg.location(58,17);
                    	    OR45=(Token)match(input,OR,FOLLOW_OR_in_expr434); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    OR45_tree = 
                    	    (Object)adaptor.create(OR45)
                    	    ;
                    	    root_0 = (Object)adaptor.becomeRoot(OR45_tree, root_0);
                    	    }
                    	    dbg.location(58,19);
                    	    pushFollow(FOLLOW_cond_term_in_expr437);
                    	    cond_term46=cond_term();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, cond_term46.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(13);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:59:4: ID '=' ^ expr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(59,4);
                    ID47=(Token)match(input,ID,FOLLOW_ID_in_expr444); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID47_tree = 
                    (Object)adaptor.create(ID47)
                    ;
                    adaptor.addChild(root_0, ID47_tree);
                    }
                    dbg.location(59,10);
                    char_literal48=(Token)match(input,60,FOLLOW_60_in_expr446); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal48_tree = 
                    (Object)adaptor.create(char_literal48)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(char_literal48_tree, root_0);
                    }
                    dbg.location(59,12);
                    pushFollow(FOLLOW_expr_in_expr449);
                    expr49=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr49.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(60, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expr"


    public static class cond_term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cond_term"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:61:1: cond_term : equiv_expr ( AND ^ equiv_expr )* ;
    public final chronos_antlrParser.cond_term_return cond_term() throws RecognitionException {
        chronos_antlrParser.cond_term_return retval = new chronos_antlrParser.cond_term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AND51=null;
        chronos_antlrParser.equiv_expr_return equiv_expr50 =null;

        chronos_antlrParser.equiv_expr_return equiv_expr52 =null;


        Object AND51_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cond_term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(61, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:62:2: ( equiv_expr ( AND ^ equiv_expr )* )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:62:4: equiv_expr ( AND ^ equiv_expr )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(62,4);
            pushFollow(FOLLOW_equiv_expr_in_cond_term459);
            equiv_expr50=equiv_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equiv_expr50.getTree());
            dbg.location(62,15);
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:62:15: ( AND ^ equiv_expr )*
            try { dbg.enterSubRule(15);

            loop15:
            do {
                int alt15=2;
                try { dbg.enterDecision(15, decisionCanBacktrack[15]);

                int LA15_0 = input.LA(1);

                if ( (LA15_0==AND) ) {
                    alt15=1;
                }


                } finally {dbg.exitDecision(15);}

                switch (alt15) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:62:16: AND ^ equiv_expr
            	    {
            	    dbg.location(62,19);
            	    AND51=(Token)match(input,AND,FOLLOW_AND_in_cond_term462); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND51_tree = 
            	    (Object)adaptor.create(AND51)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(AND51_tree, root_0);
            	    }
            	    dbg.location(62,21);
            	    pushFollow(FOLLOW_equiv_expr_in_cond_term465);
            	    equiv_expr52=equiv_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equiv_expr52.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);
            } finally {dbg.exitSubRule(15);}


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(63, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cond_term");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "cond_term"


    public static class equiv_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equiv_expr"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:64:1: equiv_expr : rel_expr ( ( EQ ^| NEQ ^) rel_expr )* ;
    public final chronos_antlrParser.equiv_expr_return equiv_expr() throws RecognitionException {
        chronos_antlrParser.equiv_expr_return retval = new chronos_antlrParser.equiv_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQ54=null;
        Token NEQ55=null;
        chronos_antlrParser.rel_expr_return rel_expr53 =null;

        chronos_antlrParser.rel_expr_return rel_expr56 =null;


        Object EQ54_tree=null;
        Object NEQ55_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "equiv_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(64, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:65:2: ( rel_expr ( ( EQ ^| NEQ ^) rel_expr )* )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:65:4: rel_expr ( ( EQ ^| NEQ ^) rel_expr )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(65,4);
            pushFollow(FOLLOW_rel_expr_in_equiv_expr477);
            rel_expr53=rel_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rel_expr53.getTree());
            dbg.location(65,13);
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:65:13: ( ( EQ ^| NEQ ^) rel_expr )*
            try { dbg.enterSubRule(17);

            loop17:
            do {
                int alt17=2;
                try { dbg.enterDecision(17, decisionCanBacktrack[17]);

                int LA17_0 = input.LA(1);

                if ( (LA17_0==EQ||LA17_0==NEQ) ) {
                    alt17=1;
                }


                } finally {dbg.exitDecision(17);}

                switch (alt17) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:65:15: ( EQ ^| NEQ ^) rel_expr
            	    {
            	    dbg.location(65,15);
            	    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:65:15: ( EQ ^| NEQ ^)
            	    int alt16=2;
            	    try { dbg.enterSubRule(16);
            	    try { dbg.enterDecision(16, decisionCanBacktrack[16]);

            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==EQ) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==NEQ) ) {
            	        alt16=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;

            	    }
            	    } finally {dbg.exitDecision(16);}

            	    switch (alt16) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:65:16: EQ ^
            	            {
            	            dbg.location(65,18);
            	            EQ54=(Token)match(input,EQ,FOLLOW_EQ_in_equiv_expr482); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            EQ54_tree = 
            	            (Object)adaptor.create(EQ54)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(EQ54_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:65:22: NEQ ^
            	            {
            	            dbg.location(65,25);
            	            NEQ55=(Token)match(input,NEQ,FOLLOW_NEQ_in_equiv_expr487); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            NEQ55_tree = 
            	            (Object)adaptor.create(NEQ55)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(NEQ55_tree, root_0);
            	            }

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(16);}

            	    dbg.location(65,28);
            	    pushFollow(FOLLOW_rel_expr_in_equiv_expr491);
            	    rel_expr56=rel_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rel_expr56.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);
            } finally {dbg.exitSubRule(17);}


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(66, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "equiv_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "equiv_expr"


    public static class rel_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rel_expr"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:67:1: rel_expr : ( math_expr ( ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr )* | datetime );
    public final chronos_antlrParser.rel_expr_return rel_expr() throws RecognitionException {
        chronos_antlrParser.rel_expr_return retval = new chronos_antlrParser.rel_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal58=null;
        Token char_literal59=null;
        Token GEQ60=null;
        Token LEQ61=null;
        chronos_antlrParser.math_expr_return math_expr57 =null;

        chronos_antlrParser.math_expr_return math_expr62 =null;

        chronos_antlrParser.datetime_return datetime63 =null;


        Object char_literal58_tree=null;
        Object char_literal59_tree=null;
        Object GEQ60_tree=null;
        Object LEQ61_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rel_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(67, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:68:2: ( math_expr ( ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr )* | datetime )
            int alt20=2;
            try { dbg.enterDecision(20, decisionCanBacktrack[20]);

            int LA20_0 = input.LA(1);

            if ( (LA20_0==FLOAT||LA20_0==ID||LA20_0==INT||LA20_0==NOT||LA20_0==STRING||LA20_0==TIME||LA20_0==50) ) {
                alt20=1;
            }
            else if ( (LA20_0==67) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(20);}

            switch (alt20) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:68:4: math_expr ( ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr )*
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(68,4);
                    pushFollow(FOLLOW_math_expr_in_rel_expr504);
                    math_expr57=math_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, math_expr57.getTree());
                    dbg.location(68,14);
                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:68:14: ( ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr )*
                    try { dbg.enterSubRule(19);

                    loop19:
                    do {
                        int alt19=2;
                        try { dbg.enterDecision(19, decisionCanBacktrack[19]);

                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==GEQ||LA19_0==LEQ||LA19_0==59||LA19_0==61) ) {
                            alt19=1;
                        }


                        } finally {dbg.exitDecision(19);}

                        switch (alt19) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:68:16: ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr
                    	    {
                    	    dbg.location(68,16);
                    	    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:68:16: ( '<' ^| '>' ^| GEQ ^| LEQ ^)
                    	    int alt18=4;
                    	    try { dbg.enterSubRule(18);
                    	    try { dbg.enterDecision(18, decisionCanBacktrack[18]);

                    	    switch ( input.LA(1) ) {
                    	    case 59:
                    	        {
                    	        alt18=1;
                    	        }
                    	        break;
                    	    case 61:
                    	        {
                    	        alt18=2;
                    	        }
                    	        break;
                    	    case GEQ:
                    	        {
                    	        alt18=3;
                    	        }
                    	        break;
                    	    case LEQ:
                    	        {
                    	        alt18=4;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 18, 0, input);

                    	        dbg.recognitionException(nvae);
                    	        throw nvae;

                    	    }

                    	    } finally {dbg.exitDecision(18);}

                    	    switch (alt18) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:68:17: '<' ^
                    	            {
                    	            dbg.location(68,20);
                    	            char_literal58=(Token)match(input,59,FOLLOW_59_in_rel_expr509); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal58_tree = 
                    	            (Object)adaptor.create(char_literal58)
                    	            ;
                    	            root_0 = (Object)adaptor.becomeRoot(char_literal58_tree, root_0);
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            dbg.enterAlt(2);

                    	            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:68:24: '>' ^
                    	            {
                    	            dbg.location(68,27);
                    	            char_literal59=(Token)match(input,61,FOLLOW_61_in_rel_expr514); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal59_tree = 
                    	            (Object)adaptor.create(char_literal59)
                    	            ;
                    	            root_0 = (Object)adaptor.becomeRoot(char_literal59_tree, root_0);
                    	            }

                    	            }
                    	            break;
                    	        case 3 :
                    	            dbg.enterAlt(3);

                    	            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:68:31: GEQ ^
                    	            {
                    	            dbg.location(68,34);
                    	            GEQ60=(Token)match(input,GEQ,FOLLOW_GEQ_in_rel_expr519); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            GEQ60_tree = 
                    	            (Object)adaptor.create(GEQ60)
                    	            ;
                    	            root_0 = (Object)adaptor.becomeRoot(GEQ60_tree, root_0);
                    	            }

                    	            }
                    	            break;
                    	        case 4 :
                    	            dbg.enterAlt(4);

                    	            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:68:38: LEQ ^
                    	            {
                    	            dbg.location(68,41);
                    	            LEQ61=(Token)match(input,LEQ,FOLLOW_LEQ_in_rel_expr524); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            LEQ61_tree = 
                    	            (Object)adaptor.create(LEQ61)
                    	            ;
                    	            root_0 = (Object)adaptor.becomeRoot(LEQ61_tree, root_0);
                    	            }

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(18);}

                    	    dbg.location(68,44);
                    	    pushFollow(FOLLOW_math_expr_in_rel_expr528);
                    	    math_expr62=math_expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, math_expr62.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(19);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:69:4: datetime
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(69,4);
                    pushFollow(FOLLOW_datetime_in_rel_expr536);
                    datetime63=datetime();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, datetime63.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(70, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rel_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "rel_expr"


    public static class math_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "math_expr"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:71:1: math_expr : math_term ( ( '+' ^| '-' ^) math_term )* ;
    public final chronos_antlrParser.math_expr_return math_expr() throws RecognitionException {
        chronos_antlrParser.math_expr_return retval = new chronos_antlrParser.math_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal65=null;
        Token char_literal66=null;
        chronos_antlrParser.math_term_return math_term64 =null;

        chronos_antlrParser.math_term_return math_term67 =null;


        Object char_literal65_tree=null;
        Object char_literal66_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "math_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(71, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:72:2: ( math_term ( ( '+' ^| '-' ^) math_term )* )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:72:4: math_term ( ( '+' ^| '-' ^) math_term )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(72,4);
            pushFollow(FOLLOW_math_term_in_math_expr546);
            math_term64=math_term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, math_term64.getTree());
            dbg.location(72,14);
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:72:14: ( ( '+' ^| '-' ^) math_term )*
            try { dbg.enterSubRule(22);

            loop22:
            do {
                int alt22=2;
                try { dbg.enterDecision(22, decisionCanBacktrack[22]);

                int LA22_0 = input.LA(1);

                if ( (LA22_0==53||LA22_0==55) ) {
                    alt22=1;
                }


                } finally {dbg.exitDecision(22);}

                switch (alt22) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:72:16: ( '+' ^| '-' ^) math_term
            	    {
            	    dbg.location(72,16);
            	    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:72:16: ( '+' ^| '-' ^)
            	    int alt21=2;
            	    try { dbg.enterSubRule(21);
            	    try { dbg.enterDecision(21, decisionCanBacktrack[21]);

            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==53) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==55) ) {
            	        alt21=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;

            	    }
            	    } finally {dbg.exitDecision(21);}

            	    switch (alt21) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:72:17: '+' ^
            	            {
            	            dbg.location(72,20);
            	            char_literal65=(Token)match(input,53,FOLLOW_53_in_math_expr551); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal65_tree = 
            	            (Object)adaptor.create(char_literal65)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal65_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:72:24: '-' ^
            	            {
            	            dbg.location(72,27);
            	            char_literal66=(Token)match(input,55,FOLLOW_55_in_math_expr556); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal66_tree = 
            	            (Object)adaptor.create(char_literal66)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal66_tree, root_0);
            	            }

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(21);}

            	    dbg.location(72,30);
            	    pushFollow(FOLLOW_math_term_in_math_expr560);
            	    math_term67=math_term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, math_term67.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);
            } finally {dbg.exitSubRule(22);}


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(73, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "math_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "math_expr"


    public static class math_term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "math_term"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:74:1: math_term : ( unary_expr ( ( '*' ^| '/' ^) unary_expr )* | timeblock );
    public final chronos_antlrParser.math_term_return math_term() throws RecognitionException {
        chronos_antlrParser.math_term_return retval = new chronos_antlrParser.math_term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal69=null;
        Token char_literal70=null;
        chronos_antlrParser.unary_expr_return unary_expr68 =null;

        chronos_antlrParser.unary_expr_return unary_expr71 =null;

        chronos_antlrParser.timeblock_return timeblock72 =null;


        Object char_literal69_tree=null;
        Object char_literal70_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "math_term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(74, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:75:2: ( unary_expr ( ( '*' ^| '/' ^) unary_expr )* | timeblock )
            int alt25=2;
            try { dbg.enterDecision(25, decisionCanBacktrack[25]);

            int LA25_0 = input.LA(1);

            if ( (LA25_0==FLOAT||LA25_0==ID||LA25_0==INT||LA25_0==NOT||LA25_0==STRING||LA25_0==50) ) {
                alt25=1;
            }
            else if ( (LA25_0==TIME) ) {
                int LA25_2 = input.LA(2);

                if ( (LA25_2==71) ) {
                    alt25=2;
                }
                else if ( (LA25_2==AND||LA25_2==EQ||LA25_2==GEQ||(LA25_2 >= LEQ && LA25_2 <= NEQ)||LA25_2==OR||(LA25_2 >= 50 && LA25_2 <= 55)||(LA25_2 >= 57 && LA25_2 <= 59)||LA25_2==61||LA25_2==69) ) {
                    alt25=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(25);}

            switch (alt25) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:75:4: unary_expr ( ( '*' ^| '/' ^) unary_expr )*
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(75,4);
                    pushFollow(FOLLOW_unary_expr_in_math_term573);
                    unary_expr68=unary_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expr68.getTree());
                    dbg.location(75,15);
                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:75:15: ( ( '*' ^| '/' ^) unary_expr )*
                    try { dbg.enterSubRule(24);

                    loop24:
                    do {
                        int alt24=2;
                        try { dbg.enterDecision(24, decisionCanBacktrack[24]);

                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==52||LA24_0==57) ) {
                            alt24=1;
                        }


                        } finally {dbg.exitDecision(24);}

                        switch (alt24) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:75:17: ( '*' ^| '/' ^) unary_expr
                    	    {
                    	    dbg.location(75,17);
                    	    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:75:17: ( '*' ^| '/' ^)
                    	    int alt23=2;
                    	    try { dbg.enterSubRule(23);
                    	    try { dbg.enterDecision(23, decisionCanBacktrack[23]);

                    	    int LA23_0 = input.LA(1);

                    	    if ( (LA23_0==52) ) {
                    	        alt23=1;
                    	    }
                    	    else if ( (LA23_0==57) ) {
                    	        alt23=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 23, 0, input);

                    	        dbg.recognitionException(nvae);
                    	        throw nvae;

                    	    }
                    	    } finally {dbg.exitDecision(23);}

                    	    switch (alt23) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:75:18: '*' ^
                    	            {
                    	            dbg.location(75,21);
                    	            char_literal69=(Token)match(input,52,FOLLOW_52_in_math_term578); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal69_tree = 
                    	            (Object)adaptor.create(char_literal69)
                    	            ;
                    	            root_0 = (Object)adaptor.becomeRoot(char_literal69_tree, root_0);
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            dbg.enterAlt(2);

                    	            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:75:25: '/' ^
                    	            {
                    	            dbg.location(75,28);
                    	            char_literal70=(Token)match(input,57,FOLLOW_57_in_math_term583); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal70_tree = 
                    	            (Object)adaptor.create(char_literal70)
                    	            ;
                    	            root_0 = (Object)adaptor.becomeRoot(char_literal70_tree, root_0);
                    	            }

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(23);}

                    	    dbg.location(75,31);
                    	    pushFollow(FOLLOW_unary_expr_in_math_term587);
                    	    unary_expr71=unary_expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expr71.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(24);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:76:4: timeblock
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(76,4);
                    pushFollow(FOLLOW_timeblock_in_math_term595);
                    timeblock72=timeblock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeblock72.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(77, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "math_term");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "math_term"


    public static class unary_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary_expr"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:78:1: unary_expr : ( postfix_expr | NOT ^ postfix_expr );
    public final chronos_antlrParser.unary_expr_return unary_expr() throws RecognitionException {
        chronos_antlrParser.unary_expr_return retval = new chronos_antlrParser.unary_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NOT74=null;
        chronos_antlrParser.postfix_expr_return postfix_expr73 =null;

        chronos_antlrParser.postfix_expr_return postfix_expr75 =null;


        Object NOT74_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "unary_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(78, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:79:2: ( postfix_expr | NOT ^ postfix_expr )
            int alt26=2;
            try { dbg.enterDecision(26, decisionCanBacktrack[26]);

            int LA26_0 = input.LA(1);

            if ( (LA26_0==FLOAT||LA26_0==ID||LA26_0==INT||LA26_0==STRING||LA26_0==TIME||LA26_0==50) ) {
                alt26=1;
            }
            else if ( (LA26_0==NOT) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(26);}

            switch (alt26) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:79:4: postfix_expr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(79,4);
                    pushFollow(FOLLOW_postfix_expr_in_unary_expr605);
                    postfix_expr73=postfix_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix_expr73.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:80:4: NOT ^ postfix_expr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(80,7);
                    NOT74=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expr610); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT74_tree = 
                    (Object)adaptor.create(NOT74)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(NOT74_tree, root_0);
                    }
                    dbg.location(80,9);
                    pushFollow(FOLLOW_postfix_expr_in_unary_expr613);
                    postfix_expr75=postfix_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix_expr75.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(81, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "unary_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "unary_expr"


    public static class postfix_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "postfix_expr"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:82:1: postfix_expr : ( ( ( ID '.' )? primary_expr '(' ( argument_expr_list )? ')' )=> function | variable );
    public final chronos_antlrParser.postfix_expr_return postfix_expr() throws RecognitionException {
        chronos_antlrParser.postfix_expr_return retval = new chronos_antlrParser.postfix_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        chronos_antlrParser.function_return function76 =null;

        chronos_antlrParser.variable_return variable77 =null;



        try { dbg.enterRule(getGrammarFileName(), "postfix_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(82, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:83:2: ( ( ( ID '.' )? primary_expr '(' ( argument_expr_list )? ')' )=> function | variable )
            int alt27=2;
            try { dbg.enterDecision(27, decisionCanBacktrack[27]);

            switch ( input.LA(1) ) {
            case ID:
                {
                int LA27_1 = input.LA(2);

                if ( (synpred1_chronos_antlr()) ) {
                    alt27=1;
                }
                else if ( (true) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case FLOAT:
            case INT:
                {
                int LA27_2 = input.LA(2);

                if ( (synpred1_chronos_antlr()) ) {
                    alt27=1;
                }
                else if ( (true) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case STRING:
                {
                int LA27_3 = input.LA(2);

                if ( (synpred1_chronos_antlr()) ) {
                    alt27=1;
                }
                else if ( (true) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case TIME:
                {
                int LA27_4 = input.LA(2);

                if ( (synpred1_chronos_antlr()) ) {
                    alt27=1;
                }
                else if ( (true) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 50:
                {
                int LA27_5 = input.LA(2);

                if ( (synpred1_chronos_antlr()) ) {
                    alt27=1;
                }
                else if ( (true) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 5, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:83:4: ( ( ID '.' )? primary_expr '(' ( argument_expr_list )? ')' )=> function
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(83,61);
                    pushFollow(FOLLOW_function_in_postfix_expr644);
                    function76=function();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function76.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:84:4: variable
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(84,4);
                    pushFollow(FOLLOW_variable_in_postfix_expr649);
                    variable77=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable77.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(85, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "postfix_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "postfix_expr"


    public static class function_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:86:1: function : ( ID '.' primary_expr '(' ( argument_expr_list )? ')' -> ^( FUNC ^( '.' ID primary_expr ) ^( PARAMS ( argument_expr_list )? ) ) | primary_expr '(' ( argument_expr_list )? ')' -> ^( FUNC primary_expr ^( PARAMS ( argument_expr_list )? ) ) );
    public final chronos_antlrParser.function_return function() throws RecognitionException {
        chronos_antlrParser.function_return retval = new chronos_antlrParser.function_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID78=null;
        Token char_literal79=null;
        Token char_literal81=null;
        Token char_literal83=null;
        Token char_literal85=null;
        Token char_literal87=null;
        chronos_antlrParser.primary_expr_return primary_expr80 =null;

        chronos_antlrParser.argument_expr_list_return argument_expr_list82 =null;

        chronos_antlrParser.primary_expr_return primary_expr84 =null;

        chronos_antlrParser.argument_expr_list_return argument_expr_list86 =null;


        Object ID78_tree=null;
        Object char_literal79_tree=null;
        Object char_literal81_tree=null;
        Object char_literal83_tree=null;
        Object char_literal85_tree=null;
        Object char_literal87_tree=null;
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_primary_expr=new RewriteRuleSubtreeStream(adaptor,"rule primary_expr");
        RewriteRuleSubtreeStream stream_argument_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule argument_expr_list");
        try { dbg.enterRule(getGrammarFileName(), "function");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(86, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:87:2: ( ID '.' primary_expr '(' ( argument_expr_list )? ')' -> ^( FUNC ^( '.' ID primary_expr ) ^( PARAMS ( argument_expr_list )? ) ) | primary_expr '(' ( argument_expr_list )? ')' -> ^( FUNC primary_expr ^( PARAMS ( argument_expr_list )? ) ) )
            int alt30=2;
            try { dbg.enterDecision(30, decisionCanBacktrack[30]);

            int LA30_0 = input.LA(1);

            if ( (LA30_0==ID) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==56) ) {
                    alt30=1;
                }
                else if ( (LA30_1==50) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA30_0==FLOAT||LA30_0==INT||LA30_0==STRING||LA30_0==TIME||LA30_0==50) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(30);}

            switch (alt30) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:87:4: ID '.' primary_expr '(' ( argument_expr_list )? ')'
                    {
                    dbg.location(87,4);
                    ID78=(Token)match(input,ID,FOLLOW_ID_in_function659); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID78);

                    dbg.location(87,7);
                    char_literal79=(Token)match(input,56,FOLLOW_56_in_function661); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_56.add(char_literal79);

                    dbg.location(87,11);
                    pushFollow(FOLLOW_primary_expr_in_function663);
                    primary_expr80=primary_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primary_expr.add(primary_expr80.getTree());
                    dbg.location(87,24);
                    char_literal81=(Token)match(input,50,FOLLOW_50_in_function665); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_50.add(char_literal81);

                    dbg.location(87,28);
                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:87:28: ( argument_expr_list )?
                    int alt28=2;
                    try { dbg.enterSubRule(28);
                    try { dbg.enterDecision(28, decisionCanBacktrack[28]);

                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==FLOAT||LA28_0==ID||LA28_0==INT||LA28_0==NOT||LA28_0==STRING||LA28_0==TIME||LA28_0==50||LA28_0==67) ) {
                        alt28=1;
                    }
                    } finally {dbg.exitDecision(28);}

                    switch (alt28) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:87:29: argument_expr_list
                            {
                            dbg.location(87,29);
                            pushFollow(FOLLOW_argument_expr_list_in_function668);
                            argument_expr_list82=argument_expr_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_argument_expr_list.add(argument_expr_list82.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(28);}

                    dbg.location(87,50);
                    char_literal83=(Token)match(input,51,FOLLOW_51_in_function672); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_51.add(char_literal83);


                    // AST REWRITE
                    // elements: primary_expr, argument_expr_list, 56, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 88:4: -> ^( FUNC ^( '.' ID primary_expr ) ^( PARAMS ( argument_expr_list )? ) )
                    {
                        dbg.location(88,7);
                        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:88:7: ^( FUNC ^( '.' ID primary_expr ) ^( PARAMS ( argument_expr_list )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(88,9);
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FUNC, "FUNC")
                        , root_1);

                        dbg.location(88,14);
                        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:88:14: ^( '.' ID primary_expr )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(88,16);
                        root_2 = (Object)adaptor.becomeRoot(
                        stream_56.nextNode()
                        , root_2);

                        dbg.location(88,20);
                        adaptor.addChild(root_2, 
                        stream_ID.nextNode()
                        );
                        dbg.location(88,23);
                        adaptor.addChild(root_2, stream_primary_expr.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(88,37);
                        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:88:37: ^( PARAMS ( argument_expr_list )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(88,39);
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PARAMS, "PARAMS")
                        , root_2);

                        dbg.location(88,46);
                        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:88:46: ( argument_expr_list )?
                        if ( stream_argument_expr_list.hasNext() ) {
                            dbg.location(88,46);
                            adaptor.addChild(root_2, stream_argument_expr_list.nextTree());

                        }
                        stream_argument_expr_list.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:90:4: primary_expr '(' ( argument_expr_list )? ')'
                    {
                    dbg.location(90,4);
                    pushFollow(FOLLOW_primary_expr_in_function705);
                    primary_expr84=primary_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primary_expr.add(primary_expr84.getTree());
                    dbg.location(90,17);
                    char_literal85=(Token)match(input,50,FOLLOW_50_in_function707); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_50.add(char_literal85);

                    dbg.location(90,21);
                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:90:21: ( argument_expr_list )?
                    int alt29=2;
                    try { dbg.enterSubRule(29);
                    try { dbg.enterDecision(29, decisionCanBacktrack[29]);

                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==FLOAT||LA29_0==ID||LA29_0==INT||LA29_0==NOT||LA29_0==STRING||LA29_0==TIME||LA29_0==50||LA29_0==67) ) {
                        alt29=1;
                    }
                    } finally {dbg.exitDecision(29);}

                    switch (alt29) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:90:22: argument_expr_list
                            {
                            dbg.location(90,22);
                            pushFollow(FOLLOW_argument_expr_list_in_function710);
                            argument_expr_list86=argument_expr_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_argument_expr_list.add(argument_expr_list86.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(29);}

                    dbg.location(90,43);
                    char_literal87=(Token)match(input,51,FOLLOW_51_in_function714); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_51.add(char_literal87);


                    // AST REWRITE
                    // elements: primary_expr, argument_expr_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 91:4: -> ^( FUNC primary_expr ^( PARAMS ( argument_expr_list )? ) )
                    {
                        dbg.location(91,7);
                        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:91:7: ^( FUNC primary_expr ^( PARAMS ( argument_expr_list )? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(91,9);
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FUNC, "FUNC")
                        , root_1);

                        dbg.location(91,14);
                        adaptor.addChild(root_1, stream_primary_expr.nextTree());
                        dbg.location(91,27);
                        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:91:27: ^( PARAMS ( argument_expr_list )? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(91,29);
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PARAMS, "PARAMS")
                        , root_2);

                        dbg.location(91,36);
                        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:91:36: ( argument_expr_list )?
                        if ( stream_argument_expr_list.hasNext() ) {
                            dbg.location(91,36);
                            adaptor.addChild(root_2, stream_argument_expr_list.nextTree());

                        }
                        stream_argument_expr_list.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(93, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "function");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "function"


    public static class variable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variable"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:94:1: variable : ( ID '.' primary_expr -> ^( '.' ID primary_expr ) | primary_expr );
    public final chronos_antlrParser.variable_return variable() throws RecognitionException {
        chronos_antlrParser.variable_return retval = new chronos_antlrParser.variable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID88=null;
        Token char_literal89=null;
        chronos_antlrParser.primary_expr_return primary_expr90 =null;

        chronos_antlrParser.primary_expr_return primary_expr91 =null;


        Object ID88_tree=null;
        Object char_literal89_tree=null;
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_primary_expr=new RewriteRuleSubtreeStream(adaptor,"rule primary_expr");
        try { dbg.enterRule(getGrammarFileName(), "variable");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(94, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:95:2: ( ID '.' primary_expr -> ^( '.' ID primary_expr ) | primary_expr )
            int alt31=2;
            try { dbg.enterDecision(31, decisionCanBacktrack[31]);

            int LA31_0 = input.LA(1);

            if ( (LA31_0==ID) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==56) ) {
                    alt31=1;
                }
                else if ( (LA31_1==AND||LA31_1==EQ||LA31_1==GEQ||(LA31_1 >= LEQ && LA31_1 <= NEQ)||LA31_1==OR||(LA31_1 >= 51 && LA31_1 <= 55)||(LA31_1 >= 57 && LA31_1 <= 59)||LA31_1==61||LA31_1==69) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA31_0==FLOAT||LA31_0==INT||LA31_0==STRING||LA31_0==TIME||LA31_0==50) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(31);}

            switch (alt31) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:95:4: ID '.' primary_expr
                    {
                    dbg.location(95,4);
                    ID88=(Token)match(input,ID,FOLLOW_ID_in_variable746); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID88);

                    dbg.location(95,7);
                    char_literal89=(Token)match(input,56,FOLLOW_56_in_variable748); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_56.add(char_literal89);

                    dbg.location(95,11);
                    pushFollow(FOLLOW_primary_expr_in_variable750);
                    primary_expr90=primary_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primary_expr.add(primary_expr90.getTree());

                    // AST REWRITE
                    // elements: ID, primary_expr, 56
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 95:24: -> ^( '.' ID primary_expr )
                    {
                        dbg.location(95,27);
                        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:95:27: ^( '.' ID primary_expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(95,29);
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_56.nextNode()
                        , root_1);

                        dbg.location(95,33);
                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );
                        dbg.location(95,36);
                        adaptor.addChild(root_1, stream_primary_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:97:4: primary_expr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(97,4);
                    pushFollow(FOLLOW_primary_expr_in_variable769);
                    primary_expr91=primary_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expr91.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(99, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "variable");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "variable"


    public static class datetime_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "datetime"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:100:1: datetime : dayblock ( timeblock )? -> ^( DATETIME dayblock timeblock ) ;
    public final chronos_antlrParser.datetime_return datetime() throws RecognitionException {
        chronos_antlrParser.datetime_return retval = new chronos_antlrParser.datetime_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        chronos_antlrParser.dayblock_return dayblock92 =null;

        chronos_antlrParser.timeblock_return timeblock93 =null;


        RewriteRuleSubtreeStream stream_timeblock=new RewriteRuleSubtreeStream(adaptor,"rule timeblock");
        RewriteRuleSubtreeStream stream_dayblock=new RewriteRuleSubtreeStream(adaptor,"rule dayblock");
        try { dbg.enterRule(getGrammarFileName(), "datetime");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(100, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:101:2: ( dayblock ( timeblock )? -> ^( DATETIME dayblock timeblock ) )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:101:4: dayblock ( timeblock )?
            {
            dbg.location(101,4);
            pushFollow(FOLLOW_dayblock_in_datetime784);
            dayblock92=dayblock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dayblock.add(dayblock92.getTree());
            dbg.location(101,13);
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:101:13: ( timeblock )?
            int alt32=2;
            try { dbg.enterSubRule(32);
            try { dbg.enterDecision(32, decisionCanBacktrack[32]);

            int LA32_0 = input.LA(1);

            if ( (LA32_0==TIME) ) {
                alt32=1;
            }
            } finally {dbg.exitDecision(32);}

            switch (alt32) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:101:13: timeblock
                    {
                    dbg.location(101,13);
                    pushFollow(FOLLOW_timeblock_in_datetime786);
                    timeblock93=timeblock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_timeblock.add(timeblock93.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(32);}


            // AST REWRITE
            // elements: timeblock, dayblock
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 102:4: -> ^( DATETIME dayblock timeblock )
            {
                dbg.location(102,7);
                // /Users/shannonlee/PLT_Team20/chronos_antlr.g:102:7: ^( DATETIME dayblock timeblock )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(102,9);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DATETIME, "DATETIME")
                , root_1);

                dbg.location(102,18);
                adaptor.addChild(root_1, stream_dayblock.nextTree());
                dbg.location(102,27);
                adaptor.addChild(root_1, stream_timeblock.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(103, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "datetime");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "datetime"


    public static class timeblock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "timeblock"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:104:1: timeblock : a= TIME '~' b= TIME -> ^( TIMES $a $b) ;
    public final chronos_antlrParser.timeblock_return timeblock() throws RecognitionException {
        chronos_antlrParser.timeblock_return retval = new chronos_antlrParser.timeblock_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token a=null;
        Token b=null;
        Token char_literal94=null;

        Object a_tree=null;
        Object b_tree=null;
        Object char_literal94_tree=null;
        RewriteRuleTokenStream stream_TIME=new RewriteRuleTokenStream(adaptor,"token TIME");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");

        try { dbg.enterRule(getGrammarFileName(), "timeblock");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(104, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:105:2: (a= TIME '~' b= TIME -> ^( TIMES $a $b) )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:105:4: a= TIME '~' b= TIME
            {
            dbg.location(105,5);
            a=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock813); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TIME.add(a);

            dbg.location(105,11);
            char_literal94=(Token)match(input,71,FOLLOW_71_in_timeblock815); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_71.add(char_literal94);

            dbg.location(105,16);
            b=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock819); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TIME.add(b);


            // AST REWRITE
            // elements: b, a
            // token labels: b, a
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_b=new RewriteRuleTokenStream(adaptor,"token b",b);
            RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 105:22: -> ^( TIMES $a $b)
            {
                dbg.location(105,25);
                // /Users/shannonlee/PLT_Team20/chronos_antlr.g:105:25: ^( TIMES $a $b)
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(105,27);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TIMES, "TIMES")
                , root_1);

                dbg.location(105,34);
                adaptor.addChild(root_1, stream_a.nextNode());
                dbg.location(105,37);
                adaptor.addChild(root_1, stream_b.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(106, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "timeblock");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "timeblock"


    public static class dayblock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dayblock"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:107:1: dayblock : '[' daychar ( ',' daychar )* ']' -> ^( DAYS ( daychar )+ ) ;
    public final chronos_antlrParser.dayblock_return dayblock() throws RecognitionException {
        chronos_antlrParser.dayblock_return retval = new chronos_antlrParser.dayblock_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal95=null;
        Token char_literal97=null;
        Token char_literal99=null;
        chronos_antlrParser.daychar_return daychar96 =null;

        chronos_antlrParser.daychar_return daychar98 =null;


        Object char_literal95_tree=null;
        Object char_literal97_tree=null;
        Object char_literal99_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_daychar=new RewriteRuleSubtreeStream(adaptor,"rule daychar");
        try { dbg.enterRule(getGrammarFileName(), "dayblock");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(107, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:108:2: ( '[' daychar ( ',' daychar )* ']' -> ^( DAYS ( daychar )+ ) )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:108:4: '[' daychar ( ',' daychar )* ']'
            {
            dbg.location(108,4);
            char_literal95=(Token)match(input,67,FOLLOW_67_in_dayblock841); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_67.add(char_literal95);

            dbg.location(108,8);
            pushFollow(FOLLOW_daychar_in_dayblock843);
            daychar96=daychar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_daychar.add(daychar96.getTree());
            dbg.location(108,16);
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:108:16: ( ',' daychar )*
            try { dbg.enterSubRule(33);

            loop33:
            do {
                int alt33=2;
                try { dbg.enterDecision(33, decisionCanBacktrack[33]);

                int LA33_0 = input.LA(1);

                if ( (LA33_0==54) ) {
                    alt33=1;
                }


                } finally {dbg.exitDecision(33);}

                switch (alt33) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:108:18: ',' daychar
            	    {
            	    dbg.location(108,18);
            	    char_literal97=(Token)match(input,54,FOLLOW_54_in_dayblock847); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_54.add(char_literal97);

            	    dbg.location(108,22);
            	    pushFollow(FOLLOW_daychar_in_dayblock849);
            	    daychar98=daychar();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_daychar.add(daychar98.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);
            } finally {dbg.exitSubRule(33);}

            dbg.location(108,33);
            char_literal99=(Token)match(input,68,FOLLOW_68_in_dayblock854); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_68.add(char_literal99);


            // AST REWRITE
            // elements: daychar
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 108:37: -> ^( DAYS ( daychar )+ )
            {
                dbg.location(108,40);
                // /Users/shannonlee/PLT_Team20/chronos_antlr.g:108:40: ^( DAYS ( daychar )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(108,42);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DAYS, "DAYS")
                , root_1);

                dbg.location(108,47);
                if ( !(stream_daychar.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_daychar.hasNext() ) {
                    dbg.location(108,47);
                    adaptor.addChild(root_1, stream_daychar.nextTree());

                }
                stream_daychar.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(109, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dayblock");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dayblock"


    public static class daychar_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "daychar"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:110:1: daychar : ( 'M' | 'T' | 'W' | 'R' | 'F' ) ;
    public final chronos_antlrParser.daychar_return daychar() throws RecognitionException {
        chronos_antlrParser.daychar_return retval = new chronos_antlrParser.daychar_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set100=null;

        Object set100_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "daychar");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(110, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:111:2: ( ( 'M' | 'T' | 'W' | 'R' | 'F' ) )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(111,2);
            set100=(Token)input.LT(1);

            if ( (input.LA(1) >= 62 && input.LA(1) <= 66) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set100)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(112, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "daychar");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "daychar"


    public static class primary_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary_expr"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:113:1: primary_expr : ( constant | ID | STRING | TIME | '(' expr ')' -> expr );
    public final chronos_antlrParser.primary_expr_return primary_expr() throws RecognitionException {
        chronos_antlrParser.primary_expr_return retval = new chronos_antlrParser.primary_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID102=null;
        Token STRING103=null;
        Token TIME104=null;
        Token char_literal105=null;
        Token char_literal107=null;
        chronos_antlrParser.constant_return constant101 =null;

        chronos_antlrParser.expr_return expr106 =null;


        Object ID102_tree=null;
        Object STRING103_tree=null;
        Object TIME104_tree=null;
        Object char_literal105_tree=null;
        Object char_literal107_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "primary_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(113, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:114:2: ( constant | ID | STRING | TIME | '(' expr ')' -> expr )
            int alt34=5;
            try { dbg.enterDecision(34, decisionCanBacktrack[34]);

            switch ( input.LA(1) ) {
            case FLOAT:
            case INT:
                {
                alt34=1;
                }
                break;
            case ID:
                {
                alt34=2;
                }
                break;
            case STRING:
                {
                alt34=3;
                }
                break;
            case TIME:
                {
                alt34=4;
                }
                break;
            case 50:
                {
                alt34=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(34);}

            switch (alt34) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:114:4: constant
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(114,4);
                    pushFollow(FOLLOW_constant_in_primary_expr893);
                    constant101=constant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant101.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:115:4: ID
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(115,4);
                    ID102=(Token)match(input,ID,FOLLOW_ID_in_primary_expr898); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID102_tree = 
                    (Object)adaptor.create(ID102)
                    ;
                    adaptor.addChild(root_0, ID102_tree);
                    }
                    dbg.location(115,7);
                    if ( state.backtracking==0 ) { System.out.println(ID); }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:116:4: STRING
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(116,4);
                    STRING103=(Token)match(input,STRING,FOLLOW_STRING_in_primary_expr905); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING103_tree = 
                    (Object)adaptor.create(STRING103)
                    ;
                    adaptor.addChild(root_0, STRING103_tree);
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:117:4: TIME
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(117,4);
                    TIME104=(Token)match(input,TIME,FOLLOW_TIME_in_primary_expr910); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TIME104_tree = 
                    (Object)adaptor.create(TIME104)
                    ;
                    adaptor.addChild(root_0, TIME104_tree);
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:118:4: '(' expr ')'
                    {
                    dbg.location(118,4);
                    char_literal105=(Token)match(input,50,FOLLOW_50_in_primary_expr915); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_50.add(char_literal105);

                    dbg.location(118,7);
                    pushFollow(FOLLOW_expr_in_primary_expr916);
                    expr106=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr106.getTree());
                    dbg.location(118,11);
                    char_literal107=(Token)match(input,51,FOLLOW_51_in_primary_expr917); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_51.add(char_literal107);


                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 118:15: -> expr
                    {
                        dbg.location(118,18);
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(119, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "primary_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "primary_expr"


    public static class argument_expr_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argument_expr_list"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:120:1: argument_expr_list : ( expr ) ( ',' expr )* -> ( expr )+ ;
    public final chronos_antlrParser.argument_expr_list_return argument_expr_list() throws RecognitionException {
        chronos_antlrParser.argument_expr_list_return retval = new chronos_antlrParser.argument_expr_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal109=null;
        chronos_antlrParser.expr_return expr108 =null;

        chronos_antlrParser.expr_return expr110 =null;


        Object char_literal109_tree=null;
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "argument_expr_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(120, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:121:2: ( ( expr ) ( ',' expr )* -> ( expr )+ )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:121:4: ( expr ) ( ',' expr )*
            {
            dbg.location(121,4);
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:121:4: ( expr )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:121:5: expr
            {
            dbg.location(121,5);
            pushFollow(FOLLOW_expr_in_argument_expr_list932);
            expr108=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr108.getTree());

            }

            dbg.location(121,11);
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:121:11: ( ',' expr )*
            try { dbg.enterSubRule(35);

            loop35:
            do {
                int alt35=2;
                try { dbg.enterDecision(35, decisionCanBacktrack[35]);

                int LA35_0 = input.LA(1);

                if ( (LA35_0==54) ) {
                    alt35=1;
                }


                } finally {dbg.exitDecision(35);}

                switch (alt35) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:121:12: ',' expr
            	    {
            	    dbg.location(121,12);
            	    char_literal109=(Token)match(input,54,FOLLOW_54_in_argument_expr_list936); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_54.add(char_literal109);

            	    dbg.location(121,16);
            	    pushFollow(FOLLOW_expr_in_argument_expr_list938);
            	    expr110=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr110.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);
            } finally {dbg.exitSubRule(35);}


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 121:23: -> ( expr )+
            {
                dbg.location(121,26);
                if ( !(stream_expr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expr.hasNext() ) {
                    dbg.location(121,26);
                    adaptor.addChild(root_0, stream_expr.nextTree());

                }
                stream_expr.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(122, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "argument_expr_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "argument_expr_list"


    public static class constant_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constant"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:123:1: constant : ( INT | FLOAT );
    public final chronos_antlrParser.constant_return constant() throws RecognitionException {
        chronos_antlrParser.constant_return retval = new chronos_antlrParser.constant_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set111=null;

        Object set111_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "constant");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(123, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:124:2: ( INT | FLOAT )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(124,2);
            set111=(Token)input.LT(1);

            if ( input.LA(1)==FLOAT||input.LA(1)==INT ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set111)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(126, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "constant");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "constant"


    public static class type_specifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_specifier"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:127:1: type_specifier : ( INT_T | DOUBLE_T | DAY_T | TIME_T | STRING_T );
    public final chronos_antlrParser.type_specifier_return type_specifier() throws RecognitionException {
        chronos_antlrParser.type_specifier_return retval = new chronos_antlrParser.type_specifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set112=null;

        Object set112_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "type_specifier");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(127, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:128:2: ( INT_T | DOUBLE_T | DAY_T | TIME_T | STRING_T )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(128,2);
            set112=(Token)input.LT(1);

            if ( input.LA(1)==DAY_T||input.LA(1)==DOUBLE_T||input.LA(1)==INT_T||input.LA(1)==STRING_T||input.LA(1)==TIME_T ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set112)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(133, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "type_specifier");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "type_specifier"


    public static class derived_type_specifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "derived_type_specifier"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:134:1: derived_type_specifier : ( SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T );
    public final chronos_antlrParser.derived_type_specifier_return derived_type_specifier() throws RecognitionException {
        chronos_antlrParser.derived_type_specifier_return retval = new chronos_antlrParser.derived_type_specifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set113=null;

        Object set113_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "derived_type_specifier");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(134, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:135:2: ( SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(135,2);
            set113=(Token)input.LT(1);

            if ( (input.LA(1) >= COURSELIST_T && input.LA(1) <= COURSE_T)||input.LA(1)==DATETIME_T||input.LA(1)==SCHEDULE_T||input.LA(1)==TIMEBLOCK_T ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set113)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(140, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "derived_type_specifier");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "derived_type_specifier"

    // $ANTLR start synpred1_chronos_antlr
    public final void synpred1_chronos_antlr_fragment() throws RecognitionException {
        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:83:4: ( ( ID '.' )? primary_expr '(' ( argument_expr_list )? ')' )
        dbg.enterAlt(1);

        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:83:6: ( ID '.' )? primary_expr '(' ( argument_expr_list )? ')'
        {
        dbg.location(83,6);
        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:83:6: ( ID '.' )?
        int alt36=2;
        try { dbg.enterSubRule(36);
        try { dbg.enterDecision(36, decisionCanBacktrack[36]);

        int LA36_0 = input.LA(1);

        if ( (LA36_0==ID) ) {
            int LA36_1 = input.LA(2);

            if ( (LA36_1==56) ) {
                alt36=1;
            }
        }
        } finally {dbg.exitDecision(36);}

        switch (alt36) {
            case 1 :
                dbg.enterAlt(1);

                // /Users/shannonlee/PLT_Team20/chronos_antlr.g:83:7: ID '.'
                {
                dbg.location(83,7);
                match(input,ID,FOLLOW_ID_in_synpred1_chronos_antlr626); if (state.failed) return ;
                dbg.location(83,10);
                match(input,56,FOLLOW_56_in_synpred1_chronos_antlr628); if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(36);}

        dbg.location(83,16);
        pushFollow(FOLLOW_primary_expr_in_synpred1_chronos_antlr632);
        primary_expr();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(83,29);
        match(input,50,FOLLOW_50_in_synpred1_chronos_antlr634); if (state.failed) return ;
        dbg.location(83,33);
        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:83:33: ( argument_expr_list )?
        int alt37=2;
        try { dbg.enterSubRule(37);
        try { dbg.enterDecision(37, decisionCanBacktrack[37]);

        int LA37_0 = input.LA(1);

        if ( (LA37_0==FLOAT||LA37_0==ID||LA37_0==INT||LA37_0==NOT||LA37_0==STRING||LA37_0==TIME||LA37_0==50||LA37_0==67) ) {
            alt37=1;
        }
        } finally {dbg.exitDecision(37);}

        switch (alt37) {
            case 1 :
                dbg.enterAlt(1);

                // /Users/shannonlee/PLT_Team20/chronos_antlr.g:83:33: argument_expr_list
                {
                dbg.location(83,33);
                pushFollow(FOLLOW_argument_expr_list_in_synpred1_chronos_antlr636);
                argument_expr_list();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(37);}

        dbg.location(83,53);
        match(input,51,FOLLOW_51_in_synpred1_chronos_antlr639); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_chronos_antlr

    // Delegated rules

    public final boolean synpred1_chronos_antlr() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred1_chronos_antlr_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_declarator_in_translation_unit67 = new BitSet(new long[]{0x04049C18F1850042L,0x0000000000000008L});
    public static final BitSet FOLLOW_stmt_in_translation_unit70 = new BitSet(new long[]{0x0404141071800042L,0x0000000000000008L});
    public static final BitSet FOLLOW_primitive_declarator_in_declarator97 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_declarator98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_derived_type_declarator_in_declarator104 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_declarator105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_primitive_declarator116 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_primitive_declarator118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_primitive_declarator137 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_primitive_declarator139 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_primitive_declarator141 = new BitSet(new long[]{0x0004141050800000L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_primitive_declarator143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_T_in_derived_type_declarator173 = new BitSet(new long[]{0x0000210000002C00L});
    public static final BitSet FOLLOW_derived_type_specifier_in_derived_type_declarator175 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_derived_type_declarator177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_T_in_derived_type_declarator196 = new BitSet(new long[]{0x0000210000002C00L});
    public static final BitSet FOLLOW_derived_type_specifier_in_derived_type_declarator198 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_derived_type_declarator200 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_derived_type_declarator202 = new BitSet(new long[]{0x0004141050800000L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_derived_type_declarator204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt232 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_stmt233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_stmt_in_stmt242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_stmt_in_stmt247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_stmt_in_stmt252 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_stmt253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_stmt262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_T_in_selection_stmt273 = new BitSet(new long[]{0x0004141050800000L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_selection_stmt275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_selection_stmt277 = new BitSet(new long[]{0x04049C18F1850040L,0x0000000000000048L});
    public static final BitSet FOLLOW_declarator_in_selection_stmt281 = new BitSet(new long[]{0x04049C18F1850040L,0x0000000000000048L});
    public static final BitSet FOLLOW_stmt_in_selection_stmt288 = new BitSet(new long[]{0x0404141071800040L,0x0000000000000048L});
    public static final BitSet FOLLOW_70_in_selection_stmt291 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ELSE_T_in_selection_stmt294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_selection_stmt296 = new BitSet(new long[]{0x0404141071800040L,0x0000000000000048L});
    public static final BitSet FOLLOW_stmt_in_selection_stmt300 = new BitSet(new long[]{0x0404141071800040L,0x0000000000000048L});
    public static final BitSet FOLLOW_70_in_selection_stmt303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREACH_T_in_iteration_stmt348 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COURSE_T_in_iteration_stmt350 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_iteration_stmt354 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_IN_T_in_iteration_stmt356 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_iteration_stmt360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_iteration_stmt362 = new BitSet(new long[]{0x04049C18F1850040L,0x0000000000000048L});
    public static final BitSet FOLLOW_declarator_in_iteration_stmt365 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_iteration_stmt366 = new BitSet(new long[]{0x04049C18F1850040L,0x0000000000000048L});
    public static final BitSet FOLLOW_stmt_in_iteration_stmt371 = new BitSet(new long[]{0x0404141071800040L,0x0000000000000048L});
    public static final BitSet FOLLOW_70_in_iteration_stmt375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_T_in_jump_stmt421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cond_term_in_expr431 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_OR_in_expr434 = new BitSet(new long[]{0x0004141050800000L,0x0000000000000008L});
    public static final BitSet FOLLOW_cond_term_in_expr437 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ID_in_expr444 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_expr446 = new BitSet(new long[]{0x0004141050800000L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_expr449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equiv_expr_in_cond_term459 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_cond_term462 = new BitSet(new long[]{0x0004141050800000L,0x0000000000000008L});
    public static final BitSet FOLLOW_equiv_expr_in_cond_term465 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rel_expr_in_equiv_expr477 = new BitSet(new long[]{0x0000000400100002L});
    public static final BitSet FOLLOW_EQ_in_equiv_expr482 = new BitSet(new long[]{0x0004141050800000L,0x0000000000000008L});
    public static final BitSet FOLLOW_NEQ_in_equiv_expr487 = new BitSet(new long[]{0x0004141050800000L,0x0000000000000008L});
    public static final BitSet FOLLOW_rel_expr_in_equiv_expr491 = new BitSet(new long[]{0x0000000400100002L});
    public static final BitSet FOLLOW_math_expr_in_rel_expr504 = new BitSet(new long[]{0x2800000204000002L});
    public static final BitSet FOLLOW_59_in_rel_expr509 = new BitSet(new long[]{0x0004141050800000L});
    public static final BitSet FOLLOW_61_in_rel_expr514 = new BitSet(new long[]{0x0004141050800000L});
    public static final BitSet FOLLOW_GEQ_in_rel_expr519 = new BitSet(new long[]{0x0004141050800000L});
    public static final BitSet FOLLOW_LEQ_in_rel_expr524 = new BitSet(new long[]{0x0004141050800000L});
    public static final BitSet FOLLOW_math_expr_in_rel_expr528 = new BitSet(new long[]{0x2800000204000002L});
    public static final BitSet FOLLOW_datetime_in_rel_expr536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_math_term_in_math_expr546 = new BitSet(new long[]{0x00A0000000000002L});
    public static final BitSet FOLLOW_53_in_math_expr551 = new BitSet(new long[]{0x0004141050800000L});
    public static final BitSet FOLLOW_55_in_math_expr556 = new BitSet(new long[]{0x0004141050800000L});
    public static final BitSet FOLLOW_math_term_in_math_expr560 = new BitSet(new long[]{0x00A0000000000002L});
    public static final BitSet FOLLOW_unary_expr_in_math_term573 = new BitSet(new long[]{0x0210000000000002L});
    public static final BitSet FOLLOW_52_in_math_term578 = new BitSet(new long[]{0x0004141050800000L});
    public static final BitSet FOLLOW_57_in_math_term583 = new BitSet(new long[]{0x0004141050800000L});
    public static final BitSet FOLLOW_unary_expr_in_math_term587 = new BitSet(new long[]{0x0210000000000002L});
    public static final BitSet FOLLOW_timeblock_in_math_term595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_expr_in_unary_expr605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary_expr610 = new BitSet(new long[]{0x0004140050800000L});
    public static final BitSet FOLLOW_postfix_expr_in_unary_expr613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_postfix_expr644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_postfix_expr649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function659 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_function661 = new BitSet(new long[]{0x0004140050800000L});
    public static final BitSet FOLLOW_primary_expr_in_function663 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_function665 = new BitSet(new long[]{0x000C141050800000L,0x0000000000000008L});
    public static final BitSet FOLLOW_argument_expr_list_in_function668 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_function672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_in_function705 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_function707 = new BitSet(new long[]{0x000C141050800000L,0x0000000000000008L});
    public static final BitSet FOLLOW_argument_expr_list_in_function710 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_function714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable746 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_variable748 = new BitSet(new long[]{0x0004140050800000L});
    public static final BitSet FOLLOW_primary_expr_in_variable750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_in_variable769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayblock_in_datetime784 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_timeblock_in_datetime786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_timeblock813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_timeblock815 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_TIME_in_timeblock819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_dayblock841 = new BitSet(new long[]{0xC000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_daychar_in_dayblock843 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_54_in_dayblock847 = new BitSet(new long[]{0xC000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_daychar_in_dayblock849 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_dayblock854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_primary_expr893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primary_expr898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primary_expr905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_primary_expr910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_primary_expr915 = new BitSet(new long[]{0x0004141050800000L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_primary_expr916 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_primary_expr917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_argument_expr_list932 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_argument_expr_list936 = new BitSet(new long[]{0x0004141050800000L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_argument_expr_list938 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred1_chronos_antlr626 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_synpred1_chronos_antlr628 = new BitSet(new long[]{0x0004140050800000L});
    public static final BitSet FOLLOW_primary_expr_in_synpred1_chronos_antlr632 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_synpred1_chronos_antlr634 = new BitSet(new long[]{0x000C141050800000L,0x0000000000000008L});
    public static final BitSet FOLLOW_argument_expr_list_in_synpred1_chronos_antlr636 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_synpred1_chronos_antlr639 = new BitSet(new long[]{0x0000000000000002L});

}