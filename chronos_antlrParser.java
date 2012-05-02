// $ANTLR 3.4 /Users/shannonlee/PLT_Team20/chronos_antlr.g 2012-05-02 13:51:50

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "BLOCK", "BREAK_T", "CHAR", "COMMENT", "COND", "COURSELIST_T", "COURSE_T", "DATETIME", "DATETIME_T", "DAY", "DAYS", "DAY_T", "DECL", "DOUBLE_T", "ELSE_T", "EQ", "ESC_SEQ", "EXPONENT", "FLOAT", "FOREACH_T", "FUNC", "GEQ", "HEX_DIGIT", "ID", "IF_T", "INT", "INT_T", "IN_T", "LEQ", "NEQ", "NEW_T", "NOT", "OCTAL_ESC", "OR", "PARAMS", "SCHEDULE_T", "STRING", "STRING_T", "TIME", "TIMEBLOCK_T", "TIMES", "TIME_T", "UNICODE_ESC", "WHITESPACE", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "';'", "'<'", "'='", "'>'", "'F'", "'M'", "'R'", "'T'", "'W'", "'['", "']'", "'{'", "'}'", "'~'"
    };

    public static final int EOF=-1;
    public static final int T__49=49;
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
    public static final int STRING=41;
    public static final int STRING_T=42;
    public static final int TIME=43;
    public static final int TIMEBLOCK_T=44;
    public static final int TIMES=45;
    public static final int TIME_T=46;
    public static final int UNICODE_ESC=47;
    public static final int WHITESPACE=48;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "primary_expr", "expr", "translation_unit", "unary_expr", 
    "daychar", "mult_expr", "derived_type_declarator", "rel_expr", "cond_term", 
    "postfix_expr", "stmt", "constant", "jump_stmt", "iteration_stmt", "add_expr", 
    "synpred1_chronos_antlr", "type_specifier", "dayblock", "function", 
    "primitive_declarator", "start_rule", "variable", "timeblock", "equiv_expr", 
    "datetime", "argument_expr_list", "declarator", "derived_type_specifier", 
    "selection_stmt"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false, false, false, 
        false, true, false, false, false, false, false, false, false, false, 
        false, false
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


    public static class start_rule_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start_rule"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:21:1: start_rule : translation_unit EOF ;
    public final chronos_antlrParser.start_rule_return start_rule() throws RecognitionException {
        chronos_antlrParser.start_rule_return retval = new chronos_antlrParser.start_rule_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF2=null;
        chronos_antlrParser.translation_unit_return translation_unit1 =null;


        CommonTree EOF2_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "start_rule");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(21, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:22:2: ( translation_unit EOF )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:22:4: translation_unit EOF
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(22,4);
            pushFollow(FOLLOW_translation_unit_in_start_rule79);
            translation_unit1=translation_unit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, translation_unit1.getTree());
            dbg.location(22,21);
            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_start_rule81); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EOF2_tree = 
            (CommonTree)adaptor.create(EOF2)
            ;
            adaptor.addChild(root_0, EOF2_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(23, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "start_rule");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "start_rule"


    public static class translation_unit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "translation_unit"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:25:1: translation_unit : ( declarator )* ( stmt )* ;
    public final chronos_antlrParser.translation_unit_return translation_unit() throws RecognitionException {
        chronos_antlrParser.translation_unit_return retval = new chronos_antlrParser.translation_unit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        chronos_antlrParser.declarator_return declarator3 =null;

        chronos_antlrParser.stmt_return stmt4 =null;



        try { dbg.enterRule(getGrammarFileName(), "translation_unit");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(25, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:26:2: ( ( declarator )* ( stmt )* )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:26:4: ( declarator )* ( stmt )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(26,4);
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:26:4: ( declarator )*
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

            	    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:26:4: declarator
            	    {
            	    dbg.location(26,4);
            	    pushFollow(FOLLOW_declarator_in_translation_unit93);
            	    declarator3=declarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, declarator3.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(26,16);
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:26:16: ( stmt )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==BREAK_T||(LA2_0 >= FLOAT && LA2_0 <= FOREACH_T)||(LA2_0 >= ID && LA2_0 <= INT)||LA2_0==NOT||LA2_0==STRING||LA2_0==TIME||LA2_0==49||LA2_0==57||LA2_0==66) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:26:16: stmt
            	    {
            	    dbg.location(26,16);
            	    pushFollow(FOLLOW_stmt_in_translation_unit96);
            	    stmt4=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt4.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);
            } finally {dbg.exitSubRule(2);}


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(27, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declarator"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:28:1: declarator : ( primitive_declarator ';' !| derived_type_declarator ';' !);
    public final chronos_antlrParser.declarator_return declarator() throws RecognitionException {
        chronos_antlrParser.declarator_return retval = new chronos_antlrParser.declarator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal6=null;
        Token char_literal8=null;
        chronos_antlrParser.primitive_declarator_return primitive_declarator5 =null;

        chronos_antlrParser.derived_type_declarator_return derived_type_declarator7 =null;


        CommonTree char_literal6_tree=null;
        CommonTree char_literal8_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "declarator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(28, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:29:2: ( primitive_declarator ';' !| derived_type_declarator ';' !)
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

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:29:4: primitive_declarator ';' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(29,4);
                    pushFollow(FOLLOW_primitive_declarator_in_declarator107);
                    primitive_declarator5=primitive_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitive_declarator5.getTree());
                    dbg.location(29,27);
                    char_literal6=(Token)match(input,57,FOLLOW_57_in_declarator108); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:30:4: derived_type_declarator ';' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(30,4);
                    pushFollow(FOLLOW_derived_type_declarator_in_declarator114);
                    derived_type_declarator7=derived_type_declarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, derived_type_declarator7.getTree());
                    dbg.location(30,30);
                    char_literal8=(Token)match(input,57,FOLLOW_57_in_declarator115); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(31, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primitive_declarator"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:32:1: primitive_declarator : ( type_specifier ID -> ^( DECL type_specifier ID ) | type_specifier ID '=' expr -> ^( '=' ^( DECL type_specifier ID ) expr ) );
    public final chronos_antlrParser.primitive_declarator_return primitive_declarator() throws RecognitionException {
        chronos_antlrParser.primitive_declarator_return retval = new chronos_antlrParser.primitive_declarator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID10=null;
        Token ID12=null;
        Token char_literal13=null;
        chronos_antlrParser.type_specifier_return type_specifier9 =null;

        chronos_antlrParser.type_specifier_return type_specifier11 =null;

        chronos_antlrParser.expr_return expr14 =null;


        CommonTree ID10_tree=null;
        CommonTree ID12_tree=null;
        CommonTree char_literal13_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_type_specifier=new RewriteRuleSubtreeStream(adaptor,"rule type_specifier");
        try { dbg.enterRule(getGrammarFileName(), "primitive_declarator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(32, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:33:2: ( type_specifier ID -> ^( DECL type_specifier ID ) | type_specifier ID '=' expr -> ^( '=' ^( DECL type_specifier ID ) expr ) )
            int alt4=2;
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==DAY_T||LA4_0==DOUBLE_T||LA4_0==INT_T||LA4_0==STRING_T||LA4_0==TIME_T) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==ID) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==59) ) {
                        alt4=2;
                    }
                    else if ( (LA4_2==57) ) {
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

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:33:4: type_specifier ID
                    {
                    dbg.location(33,4);
                    pushFollow(FOLLOW_type_specifier_in_primitive_declarator126);
                    type_specifier9=type_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_specifier.add(type_specifier9.getTree());
                    dbg.location(33,19);
                    ID10=(Token)match(input,ID,FOLLOW_ID_in_primitive_declarator128); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID10);


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

                    root_0 = (CommonTree)adaptor.nil();
                    // 34:4: -> ^( DECL type_specifier ID )
                    {
                        dbg.location(34,7);
                        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:34:7: ^( DECL type_specifier ID )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(34,9);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(DECL, "DECL")
                        , root_1);

                        dbg.location(34,14);
                        adaptor.addChild(root_1, stream_type_specifier.nextTree());
                        dbg.location(34,29);
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

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:35:4: type_specifier ID '=' expr
                    {
                    dbg.location(35,4);
                    pushFollow(FOLLOW_type_specifier_in_primitive_declarator147);
                    type_specifier11=type_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_specifier.add(type_specifier11.getTree());
                    dbg.location(35,19);
                    ID12=(Token)match(input,ID,FOLLOW_ID_in_primitive_declarator149); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID12);

                    dbg.location(35,22);
                    char_literal13=(Token)match(input,59,FOLLOW_59_in_primitive_declarator151); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_59.add(char_literal13);

                    dbg.location(35,26);
                    pushFollow(FOLLOW_expr_in_primitive_declarator153);
                    expr14=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr14.getTree());

                    // AST REWRITE
                    // elements: 59, expr, ID, type_specifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 36:4: -> ^( '=' ^( DECL type_specifier ID ) expr )
                    {
                        dbg.location(36,7);
                        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:36:7: ^( '=' ^( DECL type_specifier ID ) expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(36,9);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_59.nextNode()
                        , root_1);

                        dbg.location(36,13);
                        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:36:13: ^( DECL type_specifier ID )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        dbg.location(36,15);
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(DECL, "DECL")
                        , root_2);

                        dbg.location(36,20);
                        adaptor.addChild(root_2, stream_type_specifier.nextTree());
                        dbg.location(36,35);
                        adaptor.addChild(root_2, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(36,39);
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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(37, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "derived_type_declarator"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:38:1: derived_type_declarator : ( NEW_T derived_type_specifier ID -> ^( DECL derived_type_specifier ID ) | NEW_T derived_type_specifier ID '=' expr -> ^( '=' ^( DECL derived_type_specifier ID ) expr ) );
    public final chronos_antlrParser.derived_type_declarator_return derived_type_declarator() throws RecognitionException {
        chronos_antlrParser.derived_type_declarator_return retval = new chronos_antlrParser.derived_type_declarator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NEW_T15=null;
        Token ID17=null;
        Token NEW_T18=null;
        Token ID20=null;
        Token char_literal21=null;
        chronos_antlrParser.derived_type_specifier_return derived_type_specifier16 =null;

        chronos_antlrParser.derived_type_specifier_return derived_type_specifier19 =null;

        chronos_antlrParser.expr_return expr22 =null;


        CommonTree NEW_T15_tree=null;
        CommonTree ID17_tree=null;
        CommonTree NEW_T18_tree=null;
        CommonTree ID20_tree=null;
        CommonTree char_literal21_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_NEW_T=new RewriteRuleTokenStream(adaptor,"token NEW_T");
        RewriteRuleSubtreeStream stream_derived_type_specifier=new RewriteRuleSubtreeStream(adaptor,"rule derived_type_specifier");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "derived_type_declarator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(38, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:39:2: ( NEW_T derived_type_specifier ID -> ^( DECL derived_type_specifier ID ) | NEW_T derived_type_specifier ID '=' expr -> ^( '=' ^( DECL derived_type_specifier ID ) expr ) )
            int alt5=2;
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==NEW_T) ) {
                int LA5_1 = input.LA(2);

                if ( ((LA5_1 >= COURSELIST_T && LA5_1 <= COURSE_T)||LA5_1==DATETIME_T||LA5_1==SCHEDULE_T||LA5_1==TIMEBLOCK_T) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==ID) ) {
                        int LA5_3 = input.LA(4);

                        if ( (LA5_3==59) ) {
                            alt5=2;
                        }
                        else if ( (LA5_3==57) ) {
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

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:39:4: NEW_T derived_type_specifier ID
                    {
                    dbg.location(39,4);
                    NEW_T15=(Token)match(input,NEW_T,FOLLOW_NEW_T_in_derived_type_declarator183); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW_T.add(NEW_T15);

                    dbg.location(39,10);
                    pushFollow(FOLLOW_derived_type_specifier_in_derived_type_declarator185);
                    derived_type_specifier16=derived_type_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_derived_type_specifier.add(derived_type_specifier16.getTree());
                    dbg.location(39,33);
                    ID17=(Token)match(input,ID,FOLLOW_ID_in_derived_type_declarator187); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID17);


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

                    root_0 = (CommonTree)adaptor.nil();
                    // 40:4: -> ^( DECL derived_type_specifier ID )
                    {
                        dbg.location(40,7);
                        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:40:7: ^( DECL derived_type_specifier ID )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(40,9);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(DECL, "DECL")
                        , root_1);

                        dbg.location(40,14);
                        adaptor.addChild(root_1, stream_derived_type_specifier.nextTree());
                        dbg.location(40,37);
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

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:41:4: NEW_T derived_type_specifier ID '=' expr
                    {
                    dbg.location(41,4);
                    NEW_T18=(Token)match(input,NEW_T,FOLLOW_NEW_T_in_derived_type_declarator206); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW_T.add(NEW_T18);

                    dbg.location(41,10);
                    pushFollow(FOLLOW_derived_type_specifier_in_derived_type_declarator208);
                    derived_type_specifier19=derived_type_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_derived_type_specifier.add(derived_type_specifier19.getTree());
                    dbg.location(41,33);
                    ID20=(Token)match(input,ID,FOLLOW_ID_in_derived_type_declarator210); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID20);

                    dbg.location(41,36);
                    char_literal21=(Token)match(input,59,FOLLOW_59_in_derived_type_declarator212); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_59.add(char_literal21);

                    dbg.location(41,40);
                    pushFollow(FOLLOW_expr_in_derived_type_declarator214);
                    expr22=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr22.getTree());

                    // AST REWRITE
                    // elements: derived_type_specifier, expr, ID, 59
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 42:4: -> ^( '=' ^( DECL derived_type_specifier ID ) expr )
                    {
                        dbg.location(42,7);
                        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:42:7: ^( '=' ^( DECL derived_type_specifier ID ) expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(42,9);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_59.nextNode()
                        , root_1);

                        dbg.location(42,13);
                        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:42:13: ^( DECL derived_type_specifier ID )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        dbg.location(42,15);
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(DECL, "DECL")
                        , root_2);

                        dbg.location(42,20);
                        adaptor.addChild(root_2, stream_derived_type_specifier.nextTree());
                        dbg.location(42,43);
                        adaptor.addChild(root_2, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(42,47);
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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(43, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:44:1: stmt : ( expr ';' -> expr | selection_stmt | iteration_stmt | jump_stmt ';' -> jump_stmt | ';' !);
    public final chronos_antlrParser.stmt_return stmt() throws RecognitionException {
        chronos_antlrParser.stmt_return retval = new chronos_antlrParser.stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal24=null;
        Token char_literal28=null;
        Token char_literal29=null;
        chronos_antlrParser.expr_return expr23 =null;

        chronos_antlrParser.selection_stmt_return selection_stmt25 =null;

        chronos_antlrParser.iteration_stmt_return iteration_stmt26 =null;

        chronos_antlrParser.jump_stmt_return jump_stmt27 =null;


        CommonTree char_literal24_tree=null;
        CommonTree char_literal28_tree=null;
        CommonTree char_literal29_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleSubtreeStream stream_jump_stmt=new RewriteRuleSubtreeStream(adaptor,"rule jump_stmt");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(44, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:44:5: ( expr ';' -> expr | selection_stmt | iteration_stmt | jump_stmt ';' -> jump_stmt | ';' !)
            int alt6=5;
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            switch ( input.LA(1) ) {
            case FLOAT:
            case ID:
            case INT:
            case NOT:
            case STRING:
            case TIME:
            case 49:
            case 66:
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
            case 57:
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

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:44:7: expr ';'
                    {
                    dbg.location(44,7);
                    pushFollow(FOLLOW_expr_in_stmt242);
                    expr23=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr23.getTree());
                    dbg.location(44,11);
                    char_literal24=(Token)match(input,57,FOLLOW_57_in_stmt243); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(char_literal24);


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

                    root_0 = (CommonTree)adaptor.nil();
                    // 44:15: -> expr
                    {
                        dbg.location(44,18);
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:45:4: selection_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(45,4);
                    pushFollow(FOLLOW_selection_stmt_in_stmt252);
                    selection_stmt25=selection_stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, selection_stmt25.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:46:4: iteration_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(46,4);
                    pushFollow(FOLLOW_iteration_stmt_in_stmt257);
                    iteration_stmt26=iteration_stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iteration_stmt26.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:47:4: jump_stmt ';'
                    {
                    dbg.location(47,4);
                    pushFollow(FOLLOW_jump_stmt_in_stmt262);
                    jump_stmt27=jump_stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_jump_stmt.add(jump_stmt27.getTree());
                    dbg.location(47,13);
                    char_literal28=(Token)match(input,57,FOLLOW_57_in_stmt263); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(char_literal28);


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

                    root_0 = (CommonTree)adaptor.nil();
                    // 47:17: -> jump_stmt
                    {
                        dbg.location(47,20);
                        adaptor.addChild(root_0, stream_jump_stmt.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:48:4: ';' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(48,7);
                    char_literal29=(Token)match(input,57,FOLLOW_57_in_stmt272); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(49, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selection_stmt"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:50:1: selection_stmt : IF_T expr '{' a= translation_unit '}' ( ELSE_T '{' b= translation_unit '}' )? -> ^( COND ^( IF_T expr $a) ( ^( ELSE_T $b) )? ) ;
    public final chronos_antlrParser.selection_stmt_return selection_stmt() throws RecognitionException {
        chronos_antlrParser.selection_stmt_return retval = new chronos_antlrParser.selection_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IF_T30=null;
        Token char_literal32=null;
        Token char_literal33=null;
        Token ELSE_T34=null;
        Token char_literal35=null;
        Token char_literal36=null;
        chronos_antlrParser.translation_unit_return a =null;

        chronos_antlrParser.translation_unit_return b =null;

        chronos_antlrParser.expr_return expr31 =null;


        CommonTree IF_T30_tree=null;
        CommonTree char_literal32_tree=null;
        CommonTree char_literal33_tree=null;
        CommonTree ELSE_T34_tree=null;
        CommonTree char_literal35_tree=null;
        CommonTree char_literal36_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_IF_T=new RewriteRuleTokenStream(adaptor,"token IF_T");
        RewriteRuleTokenStream stream_ELSE_T=new RewriteRuleTokenStream(adaptor,"token ELSE_T");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_translation_unit=new RewriteRuleSubtreeStream(adaptor,"rule translation_unit");
        try { dbg.enterRule(getGrammarFileName(), "selection_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(50, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:51:2: ( IF_T expr '{' a= translation_unit '}' ( ELSE_T '{' b= translation_unit '}' )? -> ^( COND ^( IF_T expr $a) ( ^( ELSE_T $b) )? ) )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:51:4: IF_T expr '{' a= translation_unit '}' ( ELSE_T '{' b= translation_unit '}' )?
            {
            dbg.location(51,4);
            IF_T30=(Token)match(input,IF_T,FOLLOW_IF_T_in_selection_stmt283); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF_T.add(IF_T30);

            dbg.location(51,9);
            pushFollow(FOLLOW_expr_in_selection_stmt285);
            expr31=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr31.getTree());
            dbg.location(51,14);
            char_literal32=(Token)match(input,68,FOLLOW_68_in_selection_stmt287); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_68.add(char_literal32);

            dbg.location(51,18);
            pushFollow(FOLLOW_translation_unit_in_selection_stmt290);
            a=translation_unit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_translation_unit.add(a.getTree());
            dbg.location(51,36);
            char_literal33=(Token)match(input,69,FOLLOW_69_in_selection_stmt292); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_69.add(char_literal33);

            dbg.location(51,40);
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:51:40: ( ELSE_T '{' b= translation_unit '}' )?
            int alt7=2;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7, decisionCanBacktrack[7]);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==ELSE_T) ) {
                alt7=1;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:51:41: ELSE_T '{' b= translation_unit '}'
                    {
                    dbg.location(51,41);
                    ELSE_T34=(Token)match(input,ELSE_T,FOLLOW_ELSE_T_in_selection_stmt295); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE_T.add(ELSE_T34);

                    dbg.location(51,48);
                    char_literal35=(Token)match(input,68,FOLLOW_68_in_selection_stmt297); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_68.add(char_literal35);

                    dbg.location(51,53);
                    pushFollow(FOLLOW_translation_unit_in_selection_stmt301);
                    b=translation_unit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_translation_unit.add(b.getTree());
                    dbg.location(51,71);
                    char_literal36=(Token)match(input,69,FOLLOW_69_in_selection_stmt303); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_69.add(char_literal36);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}


            // AST REWRITE
            // elements: IF_T, b, expr, a, ELSE_T
            // token labels: 
            // rule labels: retval, b, a
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 52:4: -> ^( COND ^( IF_T expr $a) ( ^( ELSE_T $b) )? )
            {
                dbg.location(52,7);
                // /Users/shannonlee/PLT_Team20/chronos_antlr.g:52:7: ^( COND ^( IF_T expr $a) ( ^( ELSE_T $b) )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(52,9);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COND, "COND")
                , root_1);

                dbg.location(52,14);
                // /Users/shannonlee/PLT_Team20/chronos_antlr.g:52:14: ^( IF_T expr $a)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(52,16);
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_IF_T.nextNode()
                , root_2);

                dbg.location(52,21);
                adaptor.addChild(root_2, stream_expr.nextTree());
                dbg.location(52,27);
                adaptor.addChild(root_2, stream_a.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(52,30);
                // /Users/shannonlee/PLT_Team20/chronos_antlr.g:52:30: ( ^( ELSE_T $b) )?
                if ( stream_b.hasNext()||stream_ELSE_T.hasNext() ) {
                    dbg.location(52,30);
                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:52:30: ^( ELSE_T $b)
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    dbg.location(52,32);
                    root_2 = (CommonTree)adaptor.becomeRoot(
                    stream_ELSE_T.nextNode()
                    , root_2);

                    dbg.location(52,40);
                    adaptor.addChild(root_2, stream_b.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_b.reset();
                stream_ELSE_T.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(53, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "iteration_stmt"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:54:1: iteration_stmt : FOREACH_T COURSE_T element= ID IN_T list= ID '{' translation_unit '}' -> ^( FOREACH_T ^( IN_T $element $list) ^( BLOCK translation_unit ) ) ;
    public final chronos_antlrParser.iteration_stmt_return iteration_stmt() throws RecognitionException {
        chronos_antlrParser.iteration_stmt_return retval = new chronos_antlrParser.iteration_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token element=null;
        Token list=null;
        Token FOREACH_T37=null;
        Token COURSE_T38=null;
        Token IN_T39=null;
        Token char_literal40=null;
        Token char_literal42=null;
        chronos_antlrParser.translation_unit_return translation_unit41 =null;


        CommonTree element_tree=null;
        CommonTree list_tree=null;
        CommonTree FOREACH_T37_tree=null;
        CommonTree COURSE_T38_tree=null;
        CommonTree IN_T39_tree=null;
        CommonTree char_literal40_tree=null;
        CommonTree char_literal42_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COURSE_T=new RewriteRuleTokenStream(adaptor,"token COURSE_T");
        RewriteRuleTokenStream stream_FOREACH_T=new RewriteRuleTokenStream(adaptor,"token FOREACH_T");
        RewriteRuleTokenStream stream_IN_T=new RewriteRuleTokenStream(adaptor,"token IN_T");
        RewriteRuleSubtreeStream stream_translation_unit=new RewriteRuleSubtreeStream(adaptor,"rule translation_unit");
        try { dbg.enterRule(getGrammarFileName(), "iteration_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(54, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:55:2: ( FOREACH_T COURSE_T element= ID IN_T list= ID '{' translation_unit '}' -> ^( FOREACH_T ^( IN_T $element $list) ^( BLOCK translation_unit ) ) )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:55:4: FOREACH_T COURSE_T element= ID IN_T list= ID '{' translation_unit '}'
            {
            dbg.location(55,4);
            FOREACH_T37=(Token)match(input,FOREACH_T,FOLLOW_FOREACH_T_in_iteration_stmt342); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOREACH_T.add(FOREACH_T37);

            dbg.location(55,14);
            COURSE_T38=(Token)match(input,COURSE_T,FOLLOW_COURSE_T_in_iteration_stmt344); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COURSE_T.add(COURSE_T38);

            dbg.location(55,30);
            element=(Token)match(input,ID,FOLLOW_ID_in_iteration_stmt348); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(element);

            dbg.location(55,34);
            IN_T39=(Token)match(input,IN_T,FOLLOW_IN_T_in_iteration_stmt350); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IN_T.add(IN_T39);

            dbg.location(55,43);
            list=(Token)match(input,ID,FOLLOW_ID_in_iteration_stmt354); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(list);

            dbg.location(55,47);
            char_literal40=(Token)match(input,68,FOLLOW_68_in_iteration_stmt356); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_68.add(char_literal40);

            dbg.location(55,51);
            pushFollow(FOLLOW_translation_unit_in_iteration_stmt358);
            translation_unit41=translation_unit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_translation_unit.add(translation_unit41.getTree());
            dbg.location(55,68);
            char_literal42=(Token)match(input,69,FOLLOW_69_in_iteration_stmt360); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_69.add(char_literal42);


            // AST REWRITE
            // elements: FOREACH_T, list, element, translation_unit, IN_T
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

            root_0 = (CommonTree)adaptor.nil();
            // 56:4: -> ^( FOREACH_T ^( IN_T $element $list) ^( BLOCK translation_unit ) )
            {
                dbg.location(56,7);
                // /Users/shannonlee/PLT_Team20/chronos_antlr.g:56:7: ^( FOREACH_T ^( IN_T $element $list) ^( BLOCK translation_unit ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(56,9);
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_FOREACH_T.nextNode()
                , root_1);

                dbg.location(56,19);
                // /Users/shannonlee/PLT_Team20/chronos_antlr.g:56:19: ^( IN_T $element $list)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(56,21);
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_IN_T.nextNode()
                , root_2);

                dbg.location(56,27);
                adaptor.addChild(root_2, stream_element.nextNode());
                dbg.location(56,36);
                adaptor.addChild(root_2, stream_list.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(56,42);
                // /Users/shannonlee/PLT_Team20/chronos_antlr.g:56:42: ^( BLOCK translation_unit )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(56,44);
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(BLOCK, "BLOCK")
                , root_2);

                dbg.location(56,50);
                adaptor.addChild(root_2, stream_translation_unit.nextTree());

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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(57, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "jump_stmt"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:58:1: jump_stmt : BREAK_T ;
    public final chronos_antlrParser.jump_stmt_return jump_stmt() throws RecognitionException {
        chronos_antlrParser.jump_stmt_return retval = new chronos_antlrParser.jump_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BREAK_T43=null;

        CommonTree BREAK_T43_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "jump_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(58, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:59:2: ( BREAK_T )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:59:4: BREAK_T
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(59,4);
            BREAK_T43=(Token)match(input,BREAK_T,FOLLOW_BREAK_T_in_jump_stmt397); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BREAK_T43_tree = 
            (CommonTree)adaptor.create(BREAK_T43)
            ;
            adaptor.addChild(root_0, BREAK_T43_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(60, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:61:1: expr : ( cond_term ( OR ^ cond_term )* | ID '=' ^ expr );
    public final chronos_antlrParser.expr_return expr() throws RecognitionException {
        chronos_antlrParser.expr_return retval = new chronos_antlrParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token OR45=null;
        Token ID47=null;
        Token char_literal48=null;
        chronos_antlrParser.cond_term_return cond_term44 =null;

        chronos_antlrParser.cond_term_return cond_term46 =null;

        chronos_antlrParser.expr_return expr49 =null;


        CommonTree OR45_tree=null;
        CommonTree ID47_tree=null;
        CommonTree char_literal48_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(61, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:62:2: ( cond_term ( OR ^ cond_term )* | ID '=' ^ expr )
            int alt9=2;
            try { dbg.enterDecision(9, decisionCanBacktrack[9]);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==AND||LA9_1==EQ||LA9_1==GEQ||(LA9_1 >= LEQ && LA9_1 <= NEQ)||LA9_1==OR||(LA9_1 >= 49 && LA9_1 <= 58)||LA9_1==60||LA9_1==68) ) {
                    alt9=1;
                }
                else if ( (LA9_1==59) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA9_0==FLOAT||LA9_0==INT||LA9_0==NOT||LA9_0==STRING||LA9_0==TIME||LA9_0==49||LA9_0==66) ) {
                alt9=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:62:4: cond_term ( OR ^ cond_term )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(62,4);
                    pushFollow(FOLLOW_cond_term_in_expr407);
                    cond_term44=cond_term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cond_term44.getTree());
                    dbg.location(62,14);
                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:62:14: ( OR ^ cond_term )*
                    try { dbg.enterSubRule(8);

                    loop8:
                    do {
                        int alt8=2;
                        try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==OR) ) {
                            alt8=1;
                        }


                        } finally {dbg.exitDecision(8);}

                        switch (alt8) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:62:15: OR ^ cond_term
                    	    {
                    	    dbg.location(62,17);
                    	    OR45=(Token)match(input,OR,FOLLOW_OR_in_expr410); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    OR45_tree = 
                    	    (CommonTree)adaptor.create(OR45)
                    	    ;
                    	    root_0 = (CommonTree)adaptor.becomeRoot(OR45_tree, root_0);
                    	    }
                    	    dbg.location(62,19);
                    	    pushFollow(FOLLOW_cond_term_in_expr413);
                    	    cond_term46=cond_term();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, cond_term46.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(8);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:63:4: ID '=' ^ expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(63,4);
                    ID47=(Token)match(input,ID,FOLLOW_ID_in_expr420); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID47_tree = 
                    (CommonTree)adaptor.create(ID47)
                    ;
                    adaptor.addChild(root_0, ID47_tree);
                    }
                    dbg.location(63,10);
                    char_literal48=(Token)match(input,59,FOLLOW_59_in_expr422); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal48_tree = 
                    (CommonTree)adaptor.create(char_literal48)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal48_tree, root_0);
                    }
                    dbg.location(63,12);
                    pushFollow(FOLLOW_expr_in_expr425);
                    expr49=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr49.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(64, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cond_term"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:65:1: cond_term : equiv_expr ( AND ^ equiv_expr )* ;
    public final chronos_antlrParser.cond_term_return cond_term() throws RecognitionException {
        chronos_antlrParser.cond_term_return retval = new chronos_antlrParser.cond_term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AND51=null;
        chronos_antlrParser.equiv_expr_return equiv_expr50 =null;

        chronos_antlrParser.equiv_expr_return equiv_expr52 =null;


        CommonTree AND51_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cond_term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(65, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:66:2: ( equiv_expr ( AND ^ equiv_expr )* )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:66:4: equiv_expr ( AND ^ equiv_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(66,4);
            pushFollow(FOLLOW_equiv_expr_in_cond_term435);
            equiv_expr50=equiv_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equiv_expr50.getTree());
            dbg.location(66,15);
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:66:15: ( AND ^ equiv_expr )*
            try { dbg.enterSubRule(10);

            loop10:
            do {
                int alt10=2;
                try { dbg.enterDecision(10, decisionCanBacktrack[10]);

                int LA10_0 = input.LA(1);

                if ( (LA10_0==AND) ) {
                    alt10=1;
                }


                } finally {dbg.exitDecision(10);}

                switch (alt10) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:66:16: AND ^ equiv_expr
            	    {
            	    dbg.location(66,19);
            	    AND51=(Token)match(input,AND,FOLLOW_AND_in_cond_term438); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND51_tree = 
            	    (CommonTree)adaptor.create(AND51)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(AND51_tree, root_0);
            	    }
            	    dbg.location(66,21);
            	    pushFollow(FOLLOW_equiv_expr_in_cond_term441);
            	    equiv_expr52=equiv_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equiv_expr52.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);
            } finally {dbg.exitSubRule(10);}


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(67, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equiv_expr"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:68:1: equiv_expr : rel_expr ( ( EQ ^| NEQ ^) rel_expr )* ;
    public final chronos_antlrParser.equiv_expr_return equiv_expr() throws RecognitionException {
        chronos_antlrParser.equiv_expr_return retval = new chronos_antlrParser.equiv_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQ54=null;
        Token NEQ55=null;
        chronos_antlrParser.rel_expr_return rel_expr53 =null;

        chronos_antlrParser.rel_expr_return rel_expr56 =null;


        CommonTree EQ54_tree=null;
        CommonTree NEQ55_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "equiv_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(68, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:69:2: ( rel_expr ( ( EQ ^| NEQ ^) rel_expr )* )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:69:4: rel_expr ( ( EQ ^| NEQ ^) rel_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(69,4);
            pushFollow(FOLLOW_rel_expr_in_equiv_expr453);
            rel_expr53=rel_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rel_expr53.getTree());
            dbg.location(69,13);
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:69:13: ( ( EQ ^| NEQ ^) rel_expr )*
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                int LA12_0 = input.LA(1);

                if ( (LA12_0==EQ||LA12_0==NEQ) ) {
                    alt12=1;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:69:15: ( EQ ^| NEQ ^) rel_expr
            	    {
            	    dbg.location(69,15);
            	    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:69:15: ( EQ ^| NEQ ^)
            	    int alt11=2;
            	    try { dbg.enterSubRule(11);
            	    try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==EQ) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==NEQ) ) {
            	        alt11=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;

            	    }
            	    } finally {dbg.exitDecision(11);}

            	    switch (alt11) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:69:16: EQ ^
            	            {
            	            dbg.location(69,18);
            	            EQ54=(Token)match(input,EQ,FOLLOW_EQ_in_equiv_expr458); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            EQ54_tree = 
            	            (CommonTree)adaptor.create(EQ54)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(EQ54_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:69:22: NEQ ^
            	            {
            	            dbg.location(69,25);
            	            NEQ55=(Token)match(input,NEQ,FOLLOW_NEQ_in_equiv_expr463); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            NEQ55_tree = 
            	            (CommonTree)adaptor.create(NEQ55)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(NEQ55_tree, root_0);
            	            }

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(11);}

            	    dbg.location(69,28);
            	    pushFollow(FOLLOW_rel_expr_in_equiv_expr467);
            	    rel_expr56=rel_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rel_expr56.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);
            } finally {dbg.exitSubRule(12);}


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(70, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rel_expr"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:71:1: rel_expr : ( add_expr ( ( '<' ^| '>' ^| GEQ ^| LEQ ^) add_expr )* | datetime );
    public final chronos_antlrParser.rel_expr_return rel_expr() throws RecognitionException {
        chronos_antlrParser.rel_expr_return retval = new chronos_antlrParser.rel_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal58=null;
        Token char_literal59=null;
        Token GEQ60=null;
        Token LEQ61=null;
        chronos_antlrParser.add_expr_return add_expr57 =null;

        chronos_antlrParser.add_expr_return add_expr62 =null;

        chronos_antlrParser.datetime_return datetime63 =null;


        CommonTree char_literal58_tree=null;
        CommonTree char_literal59_tree=null;
        CommonTree GEQ60_tree=null;
        CommonTree LEQ61_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "rel_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(71, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:72:2: ( add_expr ( ( '<' ^| '>' ^| GEQ ^| LEQ ^) add_expr )* | datetime )
            int alt15=2;
            try { dbg.enterDecision(15, decisionCanBacktrack[15]);

            int LA15_0 = input.LA(1);

            if ( (LA15_0==FLOAT||LA15_0==ID||LA15_0==INT||LA15_0==NOT||LA15_0==STRING||LA15_0==TIME||LA15_0==49) ) {
                alt15=1;
            }
            else if ( (LA15_0==66) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:72:4: add_expr ( ( '<' ^| '>' ^| GEQ ^| LEQ ^) add_expr )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(72,4);
                    pushFollow(FOLLOW_add_expr_in_rel_expr480);
                    add_expr57=add_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, add_expr57.getTree());
                    dbg.location(72,13);
                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:72:13: ( ( '<' ^| '>' ^| GEQ ^| LEQ ^) add_expr )*
                    try { dbg.enterSubRule(14);

                    loop14:
                    do {
                        int alt14=2;
                        try { dbg.enterDecision(14, decisionCanBacktrack[14]);

                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==GEQ||LA14_0==LEQ||LA14_0==58||LA14_0==60) ) {
                            alt14=1;
                        }


                        } finally {dbg.exitDecision(14);}

                        switch (alt14) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:72:15: ( '<' ^| '>' ^| GEQ ^| LEQ ^) add_expr
                    	    {
                    	    dbg.location(72,15);
                    	    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:72:15: ( '<' ^| '>' ^| GEQ ^| LEQ ^)
                    	    int alt13=4;
                    	    try { dbg.enterSubRule(13);
                    	    try { dbg.enterDecision(13, decisionCanBacktrack[13]);

                    	    switch ( input.LA(1) ) {
                    	    case 58:
                    	        {
                    	        alt13=1;
                    	        }
                    	        break;
                    	    case 60:
                    	        {
                    	        alt13=2;
                    	        }
                    	        break;
                    	    case GEQ:
                    	        {
                    	        alt13=3;
                    	        }
                    	        break;
                    	    case LEQ:
                    	        {
                    	        alt13=4;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 13, 0, input);

                    	        dbg.recognitionException(nvae);
                    	        throw nvae;

                    	    }

                    	    } finally {dbg.exitDecision(13);}

                    	    switch (alt13) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:72:16: '<' ^
                    	            {
                    	            dbg.location(72,19);
                    	            char_literal58=(Token)match(input,58,FOLLOW_58_in_rel_expr485); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal58_tree = 
                    	            (CommonTree)adaptor.create(char_literal58)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal58_tree, root_0);
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            dbg.enterAlt(2);

                    	            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:72:23: '>' ^
                    	            {
                    	            dbg.location(72,26);
                    	            char_literal59=(Token)match(input,60,FOLLOW_60_in_rel_expr490); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal59_tree = 
                    	            (CommonTree)adaptor.create(char_literal59)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal59_tree, root_0);
                    	            }

                    	            }
                    	            break;
                    	        case 3 :
                    	            dbg.enterAlt(3);

                    	            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:72:30: GEQ ^
                    	            {
                    	            dbg.location(72,33);
                    	            GEQ60=(Token)match(input,GEQ,FOLLOW_GEQ_in_rel_expr495); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            GEQ60_tree = 
                    	            (CommonTree)adaptor.create(GEQ60)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(GEQ60_tree, root_0);
                    	            }

                    	            }
                    	            break;
                    	        case 4 :
                    	            dbg.enterAlt(4);

                    	            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:72:37: LEQ ^
                    	            {
                    	            dbg.location(72,40);
                    	            LEQ61=(Token)match(input,LEQ,FOLLOW_LEQ_in_rel_expr500); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            LEQ61_tree = 
                    	            (CommonTree)adaptor.create(LEQ61)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(LEQ61_tree, root_0);
                    	            }

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(13);}

                    	    dbg.location(72,43);
                    	    pushFollow(FOLLOW_add_expr_in_rel_expr504);
                    	    add_expr62=add_expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, add_expr62.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(14);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:73:4: datetime
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(73,4);
                    pushFollow(FOLLOW_datetime_in_rel_expr512);
                    datetime63=datetime();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, datetime63.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(74, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rel_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "rel_expr"


    public static class add_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "add_expr"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:75:1: add_expr : mult_expr ( ( '+' ^| '-' ^) mult_expr )* ;
    public final chronos_antlrParser.add_expr_return add_expr() throws RecognitionException {
        chronos_antlrParser.add_expr_return retval = new chronos_antlrParser.add_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal65=null;
        Token char_literal66=null;
        chronos_antlrParser.mult_expr_return mult_expr64 =null;

        chronos_antlrParser.mult_expr_return mult_expr67 =null;


        CommonTree char_literal65_tree=null;
        CommonTree char_literal66_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "add_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(75, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:76:2: ( mult_expr ( ( '+' ^| '-' ^) mult_expr )* )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:76:4: mult_expr ( ( '+' ^| '-' ^) mult_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(76,4);
            pushFollow(FOLLOW_mult_expr_in_add_expr522);
            mult_expr64=mult_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mult_expr64.getTree());
            dbg.location(76,14);
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:76:14: ( ( '+' ^| '-' ^) mult_expr )*
            try { dbg.enterSubRule(17);

            loop17:
            do {
                int alt17=2;
                try { dbg.enterDecision(17, decisionCanBacktrack[17]);

                int LA17_0 = input.LA(1);

                if ( (LA17_0==52||LA17_0==54) ) {
                    alt17=1;
                }


                } finally {dbg.exitDecision(17);}

                switch (alt17) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:76:16: ( '+' ^| '-' ^) mult_expr
            	    {
            	    dbg.location(76,16);
            	    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:76:16: ( '+' ^| '-' ^)
            	    int alt16=2;
            	    try { dbg.enterSubRule(16);
            	    try { dbg.enterDecision(16, decisionCanBacktrack[16]);

            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==52) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==54) ) {
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

            	            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:76:17: '+' ^
            	            {
            	            dbg.location(76,20);
            	            char_literal65=(Token)match(input,52,FOLLOW_52_in_add_expr527); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal65_tree = 
            	            (CommonTree)adaptor.create(char_literal65)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal65_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:76:24: '-' ^
            	            {
            	            dbg.location(76,27);
            	            char_literal66=(Token)match(input,54,FOLLOW_54_in_add_expr532); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal66_tree = 
            	            (CommonTree)adaptor.create(char_literal66)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal66_tree, root_0);
            	            }

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(16);}

            	    dbg.location(76,30);
            	    pushFollow(FOLLOW_mult_expr_in_add_expr536);
            	    mult_expr67=mult_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mult_expr67.getTree());

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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(77, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "add_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "add_expr"


    public static class mult_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mult_expr"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:78:1: mult_expr : ( unary_expr ( ( '*' ^| '/' ^) unary_expr )* | timeblock );
    public final chronos_antlrParser.mult_expr_return mult_expr() throws RecognitionException {
        chronos_antlrParser.mult_expr_return retval = new chronos_antlrParser.mult_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal69=null;
        Token char_literal70=null;
        chronos_antlrParser.unary_expr_return unary_expr68 =null;

        chronos_antlrParser.unary_expr_return unary_expr71 =null;

        chronos_antlrParser.timeblock_return timeblock72 =null;


        CommonTree char_literal69_tree=null;
        CommonTree char_literal70_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "mult_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(78, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:79:2: ( unary_expr ( ( '*' ^| '/' ^) unary_expr )* | timeblock )
            int alt20=2;
            try { dbg.enterDecision(20, decisionCanBacktrack[20]);

            int LA20_0 = input.LA(1);

            if ( (LA20_0==FLOAT||LA20_0==ID||LA20_0==INT||LA20_0==NOT||LA20_0==STRING||LA20_0==49) ) {
                alt20=1;
            }
            else if ( (LA20_0==TIME) ) {
                int LA20_2 = input.LA(2);

                if ( (LA20_2==70) ) {
                    alt20=2;
                }
                else if ( (LA20_2==AND||LA20_2==EQ||LA20_2==GEQ||(LA20_2 >= LEQ && LA20_2 <= NEQ)||LA20_2==OR||(LA20_2 >= 49 && LA20_2 <= 54)||(LA20_2 >= 56 && LA20_2 <= 58)||LA20_2==60||LA20_2==68) ) {
                    alt20=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
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

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:79:4: unary_expr ( ( '*' ^| '/' ^) unary_expr )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(79,4);
                    pushFollow(FOLLOW_unary_expr_in_mult_expr549);
                    unary_expr68=unary_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expr68.getTree());
                    dbg.location(79,15);
                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:79:15: ( ( '*' ^| '/' ^) unary_expr )*
                    try { dbg.enterSubRule(19);

                    loop19:
                    do {
                        int alt19=2;
                        try { dbg.enterDecision(19, decisionCanBacktrack[19]);

                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==51||LA19_0==56) ) {
                            alt19=1;
                        }


                        } finally {dbg.exitDecision(19);}

                        switch (alt19) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:79:17: ( '*' ^| '/' ^) unary_expr
                    	    {
                    	    dbg.location(79,17);
                    	    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:79:17: ( '*' ^| '/' ^)
                    	    int alt18=2;
                    	    try { dbg.enterSubRule(18);
                    	    try { dbg.enterDecision(18, decisionCanBacktrack[18]);

                    	    int LA18_0 = input.LA(1);

                    	    if ( (LA18_0==51) ) {
                    	        alt18=1;
                    	    }
                    	    else if ( (LA18_0==56) ) {
                    	        alt18=2;
                    	    }
                    	    else {
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

                    	            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:79:18: '*' ^
                    	            {
                    	            dbg.location(79,21);
                    	            char_literal69=(Token)match(input,51,FOLLOW_51_in_mult_expr554); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal69_tree = 
                    	            (CommonTree)adaptor.create(char_literal69)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal69_tree, root_0);
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            dbg.enterAlt(2);

                    	            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:79:25: '/' ^
                    	            {
                    	            dbg.location(79,28);
                    	            char_literal70=(Token)match(input,56,FOLLOW_56_in_mult_expr559); if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) {
                    	            char_literal70_tree = 
                    	            (CommonTree)adaptor.create(char_literal70)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal70_tree, root_0);
                    	            }

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(18);}

                    	    dbg.location(79,31);
                    	    pushFollow(FOLLOW_unary_expr_in_mult_expr563);
                    	    unary_expr71=unary_expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expr71.getTree());

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

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:80:4: timeblock
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(80,4);
                    pushFollow(FOLLOW_timeblock_in_mult_expr571);
                    timeblock72=timeblock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, timeblock72.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(81, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "mult_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "mult_expr"


    public static class unary_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary_expr"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:82:1: unary_expr : ( postfix_expr | NOT ^ postfix_expr );
    public final chronos_antlrParser.unary_expr_return unary_expr() throws RecognitionException {
        chronos_antlrParser.unary_expr_return retval = new chronos_antlrParser.unary_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NOT74=null;
        chronos_antlrParser.postfix_expr_return postfix_expr73 =null;

        chronos_antlrParser.postfix_expr_return postfix_expr75 =null;


        CommonTree NOT74_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "unary_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(82, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:83:2: ( postfix_expr | NOT ^ postfix_expr )
            int alt21=2;
            try { dbg.enterDecision(21, decisionCanBacktrack[21]);

            int LA21_0 = input.LA(1);

            if ( (LA21_0==FLOAT||LA21_0==ID||LA21_0==INT||LA21_0==STRING||LA21_0==TIME||LA21_0==49) ) {
                alt21=1;
            }
            else if ( (LA21_0==NOT) ) {
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

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:83:4: postfix_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(83,4);
                    pushFollow(FOLLOW_postfix_expr_in_unary_expr581);
                    postfix_expr73=postfix_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix_expr73.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:84:4: NOT ^ postfix_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(84,7);
                    NOT74=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expr586); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT74_tree = 
                    (CommonTree)adaptor.create(NOT74)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(NOT74_tree, root_0);
                    }
                    dbg.location(84,9);
                    pushFollow(FOLLOW_postfix_expr_in_unary_expr589);
                    postfix_expr75=postfix_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix_expr75.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(85, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "postfix_expr"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:86:1: postfix_expr : ( ( ( ID '.' )? primary_expr '(' ( argument_expr_list )? ')' )=> function | variable );
    public final chronos_antlrParser.postfix_expr_return postfix_expr() throws RecognitionException {
        chronos_antlrParser.postfix_expr_return retval = new chronos_antlrParser.postfix_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        chronos_antlrParser.function_return function76 =null;

        chronos_antlrParser.variable_return variable77 =null;



        try { dbg.enterRule(getGrammarFileName(), "postfix_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(86, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:87:2: ( ( ( ID '.' )? primary_expr '(' ( argument_expr_list )? ')' )=> function | variable )
            int alt22=2;
            try { dbg.enterDecision(22, decisionCanBacktrack[22]);

            switch ( input.LA(1) ) {
            case ID:
                {
                int LA22_1 = input.LA(2);

                if ( (synpred1_chronos_antlr()) ) {
                    alt22=1;
                }
                else if ( (true) ) {
                    alt22=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case FLOAT:
            case INT:
                {
                int LA22_2 = input.LA(2);

                if ( (synpred1_chronos_antlr()) ) {
                    alt22=1;
                }
                else if ( (true) ) {
                    alt22=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case STRING:
                {
                int LA22_3 = input.LA(2);

                if ( (synpred1_chronos_antlr()) ) {
                    alt22=1;
                }
                else if ( (true) ) {
                    alt22=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case TIME:
                {
                int LA22_4 = input.LA(2);

                if ( (synpred1_chronos_antlr()) ) {
                    alt22=1;
                }
                else if ( (true) ) {
                    alt22=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 49:
                {
                int LA22_5 = input.LA(2);

                if ( (synpred1_chronos_antlr()) ) {
                    alt22=1;
                }
                else if ( (true) ) {
                    alt22=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 5, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(22);}

            switch (alt22) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:87:4: ( ( ID '.' )? primary_expr '(' ( argument_expr_list )? ')' )=> function
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(87,61);
                    pushFollow(FOLLOW_function_in_postfix_expr620);
                    function76=function();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function76.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:88:4: variable
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(88,4);
                    pushFollow(FOLLOW_variable_in_postfix_expr625);
                    variable77=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable77.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(89, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:90:1: function : ( ID '.' primary_expr '(' ( argument_expr_list )? ')' -> ^( FUNC ^( '.' ID primary_expr ) ^( PARAMS ( argument_expr_list )? ) ) | primary_expr '(' ( argument_expr_list )? ')' -> ^( FUNC primary_expr ^( PARAMS ( argument_expr_list )? ) ) );
    public final chronos_antlrParser.function_return function() throws RecognitionException {
        chronos_antlrParser.function_return retval = new chronos_antlrParser.function_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

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


        CommonTree ID78_tree=null;
        CommonTree char_literal79_tree=null;
        CommonTree char_literal81_tree=null;
        CommonTree char_literal83_tree=null;
        CommonTree char_literal85_tree=null;
        CommonTree char_literal87_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_primary_expr=new RewriteRuleSubtreeStream(adaptor,"rule primary_expr");
        RewriteRuleSubtreeStream stream_argument_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule argument_expr_list");
        try { dbg.enterRule(getGrammarFileName(), "function");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(90, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:91:2: ( ID '.' primary_expr '(' ( argument_expr_list )? ')' -> ^( FUNC ^( '.' ID primary_expr ) ^( PARAMS ( argument_expr_list )? ) ) | primary_expr '(' ( argument_expr_list )? ')' -> ^( FUNC primary_expr ^( PARAMS ( argument_expr_list )? ) ) )
            int alt25=2;
            try { dbg.enterDecision(25, decisionCanBacktrack[25]);

            int LA25_0 = input.LA(1);

            if ( (LA25_0==ID) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==55) ) {
                    alt25=1;
                }
                else if ( (LA25_1==49) ) {
                    alt25=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA25_0==FLOAT||LA25_0==INT||LA25_0==STRING||LA25_0==TIME||LA25_0==49) ) {
                alt25=2;
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

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:91:4: ID '.' primary_expr '(' ( argument_expr_list )? ')'
                    {
                    dbg.location(91,4);
                    ID78=(Token)match(input,ID,FOLLOW_ID_in_function635); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID78);

                    dbg.location(91,7);
                    char_literal79=(Token)match(input,55,FOLLOW_55_in_function637); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal79);

                    dbg.location(91,11);
                    pushFollow(FOLLOW_primary_expr_in_function639);
                    primary_expr80=primary_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primary_expr.add(primary_expr80.getTree());
                    dbg.location(91,24);
                    char_literal81=(Token)match(input,49,FOLLOW_49_in_function641); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_49.add(char_literal81);

                    dbg.location(91,28);
                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:91:28: ( argument_expr_list )?
                    int alt23=2;
                    try { dbg.enterSubRule(23);
                    try { dbg.enterDecision(23, decisionCanBacktrack[23]);

                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==FLOAT||LA23_0==ID||LA23_0==INT||LA23_0==NOT||LA23_0==STRING||LA23_0==TIME||LA23_0==49||LA23_0==66) ) {
                        alt23=1;
                    }
                    } finally {dbg.exitDecision(23);}

                    switch (alt23) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:91:29: argument_expr_list
                            {
                            dbg.location(91,29);
                            pushFollow(FOLLOW_argument_expr_list_in_function644);
                            argument_expr_list82=argument_expr_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_argument_expr_list.add(argument_expr_list82.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(23);}

                    dbg.location(91,50);
                    char_literal83=(Token)match(input,50,FOLLOW_50_in_function648); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_50.add(char_literal83);


                    // AST REWRITE
                    // elements: primary_expr, 55, argument_expr_list, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 92:4: -> ^( FUNC ^( '.' ID primary_expr ) ^( PARAMS ( argument_expr_list )? ) )
                    {
                        dbg.location(92,7);
                        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:92:7: ^( FUNC ^( '.' ID primary_expr ) ^( PARAMS ( argument_expr_list )? ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(92,9);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(FUNC, "FUNC")
                        , root_1);

                        dbg.location(92,14);
                        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:92:14: ^( '.' ID primary_expr )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        dbg.location(92,16);
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        stream_55.nextNode()
                        , root_2);

                        dbg.location(92,20);
                        adaptor.addChild(root_2, 
                        stream_ID.nextNode()
                        );
                        dbg.location(92,23);
                        adaptor.addChild(root_2, stream_primary_expr.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(92,37);
                        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:92:37: ^( PARAMS ( argument_expr_list )? )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        dbg.location(92,39);
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(PARAMS, "PARAMS")
                        , root_2);

                        dbg.location(92,46);
                        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:92:46: ( argument_expr_list )?
                        if ( stream_argument_expr_list.hasNext() ) {
                            dbg.location(92,46);
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

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:94:4: primary_expr '(' ( argument_expr_list )? ')'
                    {
                    dbg.location(94,4);
                    pushFollow(FOLLOW_primary_expr_in_function681);
                    primary_expr84=primary_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primary_expr.add(primary_expr84.getTree());
                    dbg.location(94,17);
                    char_literal85=(Token)match(input,49,FOLLOW_49_in_function683); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_49.add(char_literal85);

                    dbg.location(94,21);
                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:94:21: ( argument_expr_list )?
                    int alt24=2;
                    try { dbg.enterSubRule(24);
                    try { dbg.enterDecision(24, decisionCanBacktrack[24]);

                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==FLOAT||LA24_0==ID||LA24_0==INT||LA24_0==NOT||LA24_0==STRING||LA24_0==TIME||LA24_0==49||LA24_0==66) ) {
                        alt24=1;
                    }
                    } finally {dbg.exitDecision(24);}

                    switch (alt24) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:94:22: argument_expr_list
                            {
                            dbg.location(94,22);
                            pushFollow(FOLLOW_argument_expr_list_in_function686);
                            argument_expr_list86=argument_expr_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_argument_expr_list.add(argument_expr_list86.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(24);}

                    dbg.location(94,43);
                    char_literal87=(Token)match(input,50,FOLLOW_50_in_function690); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_50.add(char_literal87);


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

                    root_0 = (CommonTree)adaptor.nil();
                    // 95:4: -> ^( FUNC primary_expr ^( PARAMS ( argument_expr_list )? ) )
                    {
                        dbg.location(95,7);
                        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:95:7: ^( FUNC primary_expr ^( PARAMS ( argument_expr_list )? ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(95,9);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(FUNC, "FUNC")
                        , root_1);

                        dbg.location(95,14);
                        adaptor.addChild(root_1, stream_primary_expr.nextTree());
                        dbg.location(95,27);
                        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:95:27: ^( PARAMS ( argument_expr_list )? )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        dbg.location(95,29);
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(PARAMS, "PARAMS")
                        , root_2);

                        dbg.location(95,36);
                        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:95:36: ( argument_expr_list )?
                        if ( stream_argument_expr_list.hasNext() ) {
                            dbg.location(95,36);
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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(97, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variable"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:98:1: variable : ( ID '.' primary_expr -> ^( '.' ID primary_expr ) | primary_expr );
    public final chronos_antlrParser.variable_return variable() throws RecognitionException {
        chronos_antlrParser.variable_return retval = new chronos_antlrParser.variable_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID88=null;
        Token char_literal89=null;
        chronos_antlrParser.primary_expr_return primary_expr90 =null;

        chronos_antlrParser.primary_expr_return primary_expr91 =null;


        CommonTree ID88_tree=null;
        CommonTree char_literal89_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_primary_expr=new RewriteRuleSubtreeStream(adaptor,"rule primary_expr");
        try { dbg.enterRule(getGrammarFileName(), "variable");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(98, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:99:2: ( ID '.' primary_expr -> ^( '.' ID primary_expr ) | primary_expr )
            int alt26=2;
            try { dbg.enterDecision(26, decisionCanBacktrack[26]);

            int LA26_0 = input.LA(1);

            if ( (LA26_0==ID) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==55) ) {
                    alt26=1;
                }
                else if ( (LA26_1==AND||LA26_1==EQ||LA26_1==GEQ||(LA26_1 >= LEQ && LA26_1 <= NEQ)||LA26_1==OR||(LA26_1 >= 50 && LA26_1 <= 54)||(LA26_1 >= 56 && LA26_1 <= 58)||LA26_1==60||LA26_1==68) ) {
                    alt26=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA26_0==FLOAT||LA26_0==INT||LA26_0==STRING||LA26_0==TIME||LA26_0==49) ) {
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

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:99:4: ID '.' primary_expr
                    {
                    dbg.location(99,4);
                    ID88=(Token)match(input,ID,FOLLOW_ID_in_variable722); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID88);

                    dbg.location(99,7);
                    char_literal89=(Token)match(input,55,FOLLOW_55_in_variable724); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_55.add(char_literal89);

                    dbg.location(99,11);
                    pushFollow(FOLLOW_primary_expr_in_variable726);
                    primary_expr90=primary_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primary_expr.add(primary_expr90.getTree());

                    // AST REWRITE
                    // elements: primary_expr, 55, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 99:24: -> ^( '.' ID primary_expr )
                    {
                        dbg.location(99,27);
                        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:99:27: ^( '.' ID primary_expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(99,29);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_55.nextNode()
                        , root_1);

                        dbg.location(99,33);
                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );
                        dbg.location(99,36);
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

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:101:4: primary_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(101,4);
                    pushFollow(FOLLOW_primary_expr_in_variable745);
                    primary_expr91=primary_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expr91.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(103, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "datetime"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:104:1: datetime : dayblock ( timeblock )? -> ^( DATETIME dayblock timeblock ) ;
    public final chronos_antlrParser.datetime_return datetime() throws RecognitionException {
        chronos_antlrParser.datetime_return retval = new chronos_antlrParser.datetime_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        chronos_antlrParser.dayblock_return dayblock92 =null;

        chronos_antlrParser.timeblock_return timeblock93 =null;


        RewriteRuleSubtreeStream stream_timeblock=new RewriteRuleSubtreeStream(adaptor,"rule timeblock");
        RewriteRuleSubtreeStream stream_dayblock=new RewriteRuleSubtreeStream(adaptor,"rule dayblock");
        try { dbg.enterRule(getGrammarFileName(), "datetime");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(104, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:105:2: ( dayblock ( timeblock )? -> ^( DATETIME dayblock timeblock ) )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:105:4: dayblock ( timeblock )?
            {
            dbg.location(105,4);
            pushFollow(FOLLOW_dayblock_in_datetime760);
            dayblock92=dayblock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dayblock.add(dayblock92.getTree());
            dbg.location(105,13);
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:105:13: ( timeblock )?
            int alt27=2;
            try { dbg.enterSubRule(27);
            try { dbg.enterDecision(27, decisionCanBacktrack[27]);

            int LA27_0 = input.LA(1);

            if ( (LA27_0==TIME) ) {
                alt27=1;
            }
            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:105:13: timeblock
                    {
                    dbg.location(105,13);
                    pushFollow(FOLLOW_timeblock_in_datetime762);
                    timeblock93=timeblock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_timeblock.add(timeblock93.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(27);}


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

            root_0 = (CommonTree)adaptor.nil();
            // 106:4: -> ^( DATETIME dayblock timeblock )
            {
                dbg.location(106,7);
                // /Users/shannonlee/PLT_Team20/chronos_antlr.g:106:7: ^( DATETIME dayblock timeblock )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(106,9);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DATETIME, "DATETIME")
                , root_1);

                dbg.location(106,18);
                adaptor.addChild(root_1, stream_dayblock.nextTree());
                dbg.location(106,27);
                adaptor.addChild(root_1, stream_timeblock.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(107, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "timeblock"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:108:1: timeblock : a= TIME '~' b= TIME -> ^( TIMES $a $b) ;
    public final chronos_antlrParser.timeblock_return timeblock() throws RecognitionException {
        chronos_antlrParser.timeblock_return retval = new chronos_antlrParser.timeblock_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token a=null;
        Token b=null;
        Token char_literal94=null;

        CommonTree a_tree=null;
        CommonTree b_tree=null;
        CommonTree char_literal94_tree=null;
        RewriteRuleTokenStream stream_TIME=new RewriteRuleTokenStream(adaptor,"token TIME");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");

        try { dbg.enterRule(getGrammarFileName(), "timeblock");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(108, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:109:2: (a= TIME '~' b= TIME -> ^( TIMES $a $b) )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:109:4: a= TIME '~' b= TIME
            {
            dbg.location(109,5);
            a=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock789); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TIME.add(a);

            dbg.location(109,11);
            char_literal94=(Token)match(input,70,FOLLOW_70_in_timeblock791); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_70.add(char_literal94);

            dbg.location(109,16);
            b=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock795); if (state.failed) return retval; 
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

            root_0 = (CommonTree)adaptor.nil();
            // 109:22: -> ^( TIMES $a $b)
            {
                dbg.location(109,25);
                // /Users/shannonlee/PLT_Team20/chronos_antlr.g:109:25: ^( TIMES $a $b)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(109,27);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TIMES, "TIMES")
                , root_1);

                dbg.location(109,34);
                adaptor.addChild(root_1, stream_a.nextNode());
                dbg.location(109,37);
                adaptor.addChild(root_1, stream_b.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(110, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dayblock"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:111:1: dayblock : '[' daychar ( ',' daychar )* ']' -> ^( DAYS ( daychar )+ ) ;
    public final chronos_antlrParser.dayblock_return dayblock() throws RecognitionException {
        chronos_antlrParser.dayblock_return retval = new chronos_antlrParser.dayblock_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal95=null;
        Token char_literal97=null;
        Token char_literal99=null;
        chronos_antlrParser.daychar_return daychar96 =null;

        chronos_antlrParser.daychar_return daychar98 =null;


        CommonTree char_literal95_tree=null;
        CommonTree char_literal97_tree=null;
        CommonTree char_literal99_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_daychar=new RewriteRuleSubtreeStream(adaptor,"rule daychar");
        try { dbg.enterRule(getGrammarFileName(), "dayblock");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(111, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:112:2: ( '[' daychar ( ',' daychar )* ']' -> ^( DAYS ( daychar )+ ) )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:112:4: '[' daychar ( ',' daychar )* ']'
            {
            dbg.location(112,4);
            char_literal95=(Token)match(input,66,FOLLOW_66_in_dayblock817); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_66.add(char_literal95);

            dbg.location(112,8);
            pushFollow(FOLLOW_daychar_in_dayblock819);
            daychar96=daychar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_daychar.add(daychar96.getTree());
            dbg.location(112,16);
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:112:16: ( ',' daychar )*
            try { dbg.enterSubRule(28);

            loop28:
            do {
                int alt28=2;
                try { dbg.enterDecision(28, decisionCanBacktrack[28]);

                int LA28_0 = input.LA(1);

                if ( (LA28_0==53) ) {
                    alt28=1;
                }


                } finally {dbg.exitDecision(28);}

                switch (alt28) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:112:18: ',' daychar
            	    {
            	    dbg.location(112,18);
            	    char_literal97=(Token)match(input,53,FOLLOW_53_in_dayblock823); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_53.add(char_literal97);

            	    dbg.location(112,22);
            	    pushFollow(FOLLOW_daychar_in_dayblock825);
            	    daychar98=daychar();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_daychar.add(daychar98.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);
            } finally {dbg.exitSubRule(28);}

            dbg.location(112,33);
            char_literal99=(Token)match(input,67,FOLLOW_67_in_dayblock830); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_67.add(char_literal99);


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

            root_0 = (CommonTree)adaptor.nil();
            // 112:37: -> ^( DAYS ( daychar )+ )
            {
                dbg.location(112,40);
                // /Users/shannonlee/PLT_Team20/chronos_antlr.g:112:40: ^( DAYS ( daychar )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(112,42);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DAYS, "DAYS")
                , root_1);

                dbg.location(112,47);
                if ( !(stream_daychar.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_daychar.hasNext() ) {
                    dbg.location(112,47);
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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(113, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "daychar"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:114:1: daychar : ( 'M' | 'T' | 'W' | 'R' | 'F' ) ;
    public final chronos_antlrParser.daychar_return daychar() throws RecognitionException {
        chronos_antlrParser.daychar_return retval = new chronos_antlrParser.daychar_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set100=null;

        CommonTree set100_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "daychar");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(114, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:115:2: ( ( 'M' | 'T' | 'W' | 'R' | 'F' ) )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(115,2);
            set100=(Token)input.LT(1);

            if ( (input.LA(1) >= 61 && input.LA(1) <= 65) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set100)
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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(116, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary_expr"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:117:1: primary_expr : ( constant | ID | STRING | TIME | '(' expr ')' -> expr );
    public final chronos_antlrParser.primary_expr_return primary_expr() throws RecognitionException {
        chronos_antlrParser.primary_expr_return retval = new chronos_antlrParser.primary_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID102=null;
        Token STRING103=null;
        Token TIME104=null;
        Token char_literal105=null;
        Token char_literal107=null;
        chronos_antlrParser.constant_return constant101 =null;

        chronos_antlrParser.expr_return expr106 =null;


        CommonTree ID102_tree=null;
        CommonTree STRING103_tree=null;
        CommonTree TIME104_tree=null;
        CommonTree char_literal105_tree=null;
        CommonTree char_literal107_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "primary_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(117, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:118:2: ( constant | ID | STRING | TIME | '(' expr ')' -> expr )
            int alt29=5;
            try { dbg.enterDecision(29, decisionCanBacktrack[29]);

            switch ( input.LA(1) ) {
            case FLOAT:
            case INT:
                {
                alt29=1;
                }
                break;
            case ID:
                {
                alt29=2;
                }
                break;
            case STRING:
                {
                alt29=3;
                }
                break;
            case TIME:
                {
                alt29=4;
                }
                break;
            case 49:
                {
                alt29=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(29);}

            switch (alt29) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:118:4: constant
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(118,4);
                    pushFollow(FOLLOW_constant_in_primary_expr869);
                    constant101=constant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant101.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:119:4: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(119,4);
                    ID102=(Token)match(input,ID,FOLLOW_ID_in_primary_expr874); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID102_tree = 
                    (CommonTree)adaptor.create(ID102)
                    ;
                    adaptor.addChild(root_0, ID102_tree);
                    }
                    dbg.location(119,7);
                    if ( state.backtracking==0 ) { System.out.println(ID); }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:120:4: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(120,4);
                    STRING103=(Token)match(input,STRING,FOLLOW_STRING_in_primary_expr881); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING103_tree = 
                    (CommonTree)adaptor.create(STRING103)
                    ;
                    adaptor.addChild(root_0, STRING103_tree);
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:121:4: TIME
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(121,4);
                    TIME104=(Token)match(input,TIME,FOLLOW_TIME_in_primary_expr886); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TIME104_tree = 
                    (CommonTree)adaptor.create(TIME104)
                    ;
                    adaptor.addChild(root_0, TIME104_tree);
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:122:4: '(' expr ')'
                    {
                    dbg.location(122,4);
                    char_literal105=(Token)match(input,49,FOLLOW_49_in_primary_expr891); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_49.add(char_literal105);

                    dbg.location(122,7);
                    pushFollow(FOLLOW_expr_in_primary_expr892);
                    expr106=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr106.getTree());
                    dbg.location(122,11);
                    char_literal107=(Token)match(input,50,FOLLOW_50_in_primary_expr893); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_50.add(char_literal107);


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

                    root_0 = (CommonTree)adaptor.nil();
                    // 122:15: -> expr
                    {
                        dbg.location(122,18);
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(123, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argument_expr_list"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:124:1: argument_expr_list : ( expr ) ( ',' expr )* -> ( expr )+ ;
    public final chronos_antlrParser.argument_expr_list_return argument_expr_list() throws RecognitionException {
        chronos_antlrParser.argument_expr_list_return retval = new chronos_antlrParser.argument_expr_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal109=null;
        chronos_antlrParser.expr_return expr108 =null;

        chronos_antlrParser.expr_return expr110 =null;


        CommonTree char_literal109_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "argument_expr_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(124, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:125:2: ( ( expr ) ( ',' expr )* -> ( expr )+ )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:125:4: ( expr ) ( ',' expr )*
            {
            dbg.location(125,4);
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:125:4: ( expr )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:125:5: expr
            {
            dbg.location(125,5);
            pushFollow(FOLLOW_expr_in_argument_expr_list908);
            expr108=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr108.getTree());

            }

            dbg.location(125,11);
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:125:11: ( ',' expr )*
            try { dbg.enterSubRule(30);

            loop30:
            do {
                int alt30=2;
                try { dbg.enterDecision(30, decisionCanBacktrack[30]);

                int LA30_0 = input.LA(1);

                if ( (LA30_0==53) ) {
                    alt30=1;
                }


                } finally {dbg.exitDecision(30);}

                switch (alt30) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:125:12: ',' expr
            	    {
            	    dbg.location(125,12);
            	    char_literal109=(Token)match(input,53,FOLLOW_53_in_argument_expr_list912); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_53.add(char_literal109);

            	    dbg.location(125,16);
            	    pushFollow(FOLLOW_expr_in_argument_expr_list914);
            	    expr110=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr110.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);
            } finally {dbg.exitSubRule(30);}


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

            root_0 = (CommonTree)adaptor.nil();
            // 125:23: -> ( expr )+
            {
                dbg.location(125,26);
                if ( !(stream_expr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expr.hasNext() ) {
                    dbg.location(125,26);
                    adaptor.addChild(root_0, stream_expr.nextTree());

                }
                stream_expr.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(126, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constant"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:127:1: constant : ( INT | FLOAT );
    public final chronos_antlrParser.constant_return constant() throws RecognitionException {
        chronos_antlrParser.constant_return retval = new chronos_antlrParser.constant_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set111=null;

        CommonTree set111_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "constant");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(127, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:128:2: ( INT | FLOAT )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(128,2);
            set111=(Token)input.LT(1);

            if ( input.LA(1)==FLOAT||input.LA(1)==INT ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set111)
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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(130, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_specifier"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:131:1: type_specifier : ( INT_T | DOUBLE_T | DAY_T | TIME_T | STRING_T );
    public final chronos_antlrParser.type_specifier_return type_specifier() throws RecognitionException {
        chronos_antlrParser.type_specifier_return retval = new chronos_antlrParser.type_specifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set112=null;

        CommonTree set112_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "type_specifier");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(131, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:132:2: ( INT_T | DOUBLE_T | DAY_T | TIME_T | STRING_T )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(132,2);
            set112=(Token)input.LT(1);

            if ( input.LA(1)==DAY_T||input.LA(1)==DOUBLE_T||input.LA(1)==INT_T||input.LA(1)==STRING_T||input.LA(1)==TIME_T ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set112)
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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(137, 1);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "derived_type_specifier"
    // /Users/shannonlee/PLT_Team20/chronos_antlr.g:138:1: derived_type_specifier : ( SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T );
    public final chronos_antlrParser.derived_type_specifier_return derived_type_specifier() throws RecognitionException {
        chronos_antlrParser.derived_type_specifier_return retval = new chronos_antlrParser.derived_type_specifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set113=null;

        CommonTree set113_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "derived_type_specifier");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(138, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:139:2: ( SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronos_antlr.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(139,2);
            set113=(Token)input.LT(1);

            if ( (input.LA(1) >= COURSELIST_T && input.LA(1) <= COURSE_T)||input.LA(1)==DATETIME_T||input.LA(1)==SCHEDULE_T||input.LA(1)==TIMEBLOCK_T ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set113)
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

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(144, 1);

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
        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:87:4: ( ( ID '.' )? primary_expr '(' ( argument_expr_list )? ')' )
        dbg.enterAlt(1);

        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:87:6: ( ID '.' )? primary_expr '(' ( argument_expr_list )? ')'
        {
        dbg.location(87,6);
        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:87:6: ( ID '.' )?
        int alt31=2;
        try { dbg.enterSubRule(31);
        try { dbg.enterDecision(31, decisionCanBacktrack[31]);

        int LA31_0 = input.LA(1);

        if ( (LA31_0==ID) ) {
            int LA31_1 = input.LA(2);

            if ( (LA31_1==55) ) {
                alt31=1;
            }
        }
        } finally {dbg.exitDecision(31);}

        switch (alt31) {
            case 1 :
                dbg.enterAlt(1);

                // /Users/shannonlee/PLT_Team20/chronos_antlr.g:87:7: ID '.'
                {
                dbg.location(87,7);
                match(input,ID,FOLLOW_ID_in_synpred1_chronos_antlr602); if (state.failed) return ;
                dbg.location(87,10);
                match(input,55,FOLLOW_55_in_synpred1_chronos_antlr604); if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(31);}

        dbg.location(87,16);
        pushFollow(FOLLOW_primary_expr_in_synpred1_chronos_antlr608);
        primary_expr();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(87,29);
        match(input,49,FOLLOW_49_in_synpred1_chronos_antlr610); if (state.failed) return ;
        dbg.location(87,33);
        // /Users/shannonlee/PLT_Team20/chronos_antlr.g:87:33: ( argument_expr_list )?
        int alt32=2;
        try { dbg.enterSubRule(32);
        try { dbg.enterDecision(32, decisionCanBacktrack[32]);

        int LA32_0 = input.LA(1);

        if ( (LA32_0==FLOAT||LA32_0==ID||LA32_0==INT||LA32_0==NOT||LA32_0==STRING||LA32_0==TIME||LA32_0==49||LA32_0==66) ) {
            alt32=1;
        }
        } finally {dbg.exitDecision(32);}

        switch (alt32) {
            case 1 :
                dbg.enterAlt(1);

                // /Users/shannonlee/PLT_Team20/chronos_antlr.g:87:33: argument_expr_list
                {
                dbg.location(87,33);
                pushFollow(FOLLOW_argument_expr_list_in_synpred1_chronos_antlr612);
                argument_expr_list();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(32);}

        dbg.location(87,53);
        match(input,50,FOLLOW_50_in_synpred1_chronos_antlr615); if (state.failed) return ;

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


 

    public static final BitSet FOLLOW_translation_unit_in_start_rule79 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start_rule81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_translation_unit93 = new BitSet(new long[]{0x02024E18F1850042L,0x0000000000000004L});
    public static final BitSet FOLLOW_stmt_in_translation_unit96 = new BitSet(new long[]{0x02020A1071800042L,0x0000000000000004L});
    public static final BitSet FOLLOW_primitive_declarator_in_declarator107 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_declarator108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_derived_type_declarator_in_declarator114 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_declarator115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_primitive_declarator126 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_primitive_declarator128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_primitive_declarator147 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_primitive_declarator149 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_primitive_declarator151 = new BitSet(new long[]{0x00020A1050800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_primitive_declarator153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_T_in_derived_type_declarator183 = new BitSet(new long[]{0x0000110000002C00L});
    public static final BitSet FOLLOW_derived_type_specifier_in_derived_type_declarator185 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_derived_type_declarator187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_T_in_derived_type_declarator206 = new BitSet(new long[]{0x0000110000002C00L});
    public static final BitSet FOLLOW_derived_type_specifier_in_derived_type_declarator208 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_derived_type_declarator210 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_derived_type_declarator212 = new BitSet(new long[]{0x00020A1050800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_derived_type_declarator214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt242 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_stmt243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_stmt_in_stmt252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_stmt_in_stmt257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_stmt_in_stmt262 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_stmt263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_stmt272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_T_in_selection_stmt283 = new BitSet(new long[]{0x00020A1050800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_selection_stmt285 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_selection_stmt287 = new BitSet(new long[]{0x02024E18F1850040L,0x0000000000000024L});
    public static final BitSet FOLLOW_translation_unit_in_selection_stmt290 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_selection_stmt292 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ELSE_T_in_selection_stmt295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_selection_stmt297 = new BitSet(new long[]{0x02024E18F1850040L,0x0000000000000024L});
    public static final BitSet FOLLOW_translation_unit_in_selection_stmt301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_selection_stmt303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREACH_T_in_iteration_stmt342 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COURSE_T_in_iteration_stmt344 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_iteration_stmt348 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_IN_T_in_iteration_stmt350 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_iteration_stmt354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_iteration_stmt356 = new BitSet(new long[]{0x02024E18F1850040L,0x0000000000000024L});
    public static final BitSet FOLLOW_translation_unit_in_iteration_stmt358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_iteration_stmt360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_T_in_jump_stmt397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cond_term_in_expr407 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_OR_in_expr410 = new BitSet(new long[]{0x00020A1050800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_cond_term_in_expr413 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ID_in_expr420 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_expr422 = new BitSet(new long[]{0x00020A1050800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equiv_expr_in_cond_term435 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_cond_term438 = new BitSet(new long[]{0x00020A1050800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_equiv_expr_in_cond_term441 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rel_expr_in_equiv_expr453 = new BitSet(new long[]{0x0000000400100002L});
    public static final BitSet FOLLOW_EQ_in_equiv_expr458 = new BitSet(new long[]{0x00020A1050800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_NEQ_in_equiv_expr463 = new BitSet(new long[]{0x00020A1050800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rel_expr_in_equiv_expr467 = new BitSet(new long[]{0x0000000400100002L});
    public static final BitSet FOLLOW_add_expr_in_rel_expr480 = new BitSet(new long[]{0x1400000204000002L});
    public static final BitSet FOLLOW_58_in_rel_expr485 = new BitSet(new long[]{0x00020A1050800000L});
    public static final BitSet FOLLOW_60_in_rel_expr490 = new BitSet(new long[]{0x00020A1050800000L});
    public static final BitSet FOLLOW_GEQ_in_rel_expr495 = new BitSet(new long[]{0x00020A1050800000L});
    public static final BitSet FOLLOW_LEQ_in_rel_expr500 = new BitSet(new long[]{0x00020A1050800000L});
    public static final BitSet FOLLOW_add_expr_in_rel_expr504 = new BitSet(new long[]{0x1400000204000002L});
    public static final BitSet FOLLOW_datetime_in_rel_expr512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr522 = new BitSet(new long[]{0x0050000000000002L});
    public static final BitSet FOLLOW_52_in_add_expr527 = new BitSet(new long[]{0x00020A1050800000L});
    public static final BitSet FOLLOW_54_in_add_expr532 = new BitSet(new long[]{0x00020A1050800000L});
    public static final BitSet FOLLOW_mult_expr_in_add_expr536 = new BitSet(new long[]{0x0050000000000002L});
    public static final BitSet FOLLOW_unary_expr_in_mult_expr549 = new BitSet(new long[]{0x0108000000000002L});
    public static final BitSet FOLLOW_51_in_mult_expr554 = new BitSet(new long[]{0x00020A1050800000L});
    public static final BitSet FOLLOW_56_in_mult_expr559 = new BitSet(new long[]{0x00020A1050800000L});
    public static final BitSet FOLLOW_unary_expr_in_mult_expr563 = new BitSet(new long[]{0x0108000000000002L});
    public static final BitSet FOLLOW_timeblock_in_mult_expr571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_expr_in_unary_expr581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary_expr586 = new BitSet(new long[]{0x00020A0050800000L});
    public static final BitSet FOLLOW_postfix_expr_in_unary_expr589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_postfix_expr620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_postfix_expr625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function635 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_function637 = new BitSet(new long[]{0x00020A0050800000L});
    public static final BitSet FOLLOW_primary_expr_in_function639 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_function641 = new BitSet(new long[]{0x00060A1050800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_argument_expr_list_in_function644 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_function648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_in_function681 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_function683 = new BitSet(new long[]{0x00060A1050800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_argument_expr_list_in_function686 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_function690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variable722 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_variable724 = new BitSet(new long[]{0x00020A0050800000L});
    public static final BitSet FOLLOW_primary_expr_in_variable726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_in_variable745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayblock_in_datetime760 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_timeblock_in_datetime762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_timeblock789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_timeblock791 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_TIME_in_timeblock795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_dayblock817 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_daychar_in_dayblock819 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_53_in_dayblock823 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_daychar_in_dayblock825 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_dayblock830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_primary_expr869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primary_expr874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primary_expr881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_primary_expr886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_primary_expr891 = new BitSet(new long[]{0x00020A1050800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_primary_expr892 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_primary_expr893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_argument_expr_list908 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_argument_expr_list912 = new BitSet(new long[]{0x00020A1050800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_argument_expr_list914 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred1_chronos_antlr602 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_synpred1_chronos_antlr604 = new BitSet(new long[]{0x00020A0050800000L});
    public static final BitSet FOLLOW_primary_expr_in_synpred1_chronos_antlr608 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_synpred1_chronos_antlr610 = new BitSet(new long[]{0x00060A1050800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_argument_expr_list_in_synpred1_chronos_antlr612 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_synpred1_chronos_antlr615 = new BitSet(new long[]{0x0000000000000002L});

}