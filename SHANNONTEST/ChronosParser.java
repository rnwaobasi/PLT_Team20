// $ANTLR 3.4 Chronos.g 2012-05-08 23:36:42

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ChronosParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "BLOCK", "BREAK_T", "CHAR", "COMMENT", "COND", "COURSELIST_T", "COURSE_T", "DATETIME", "DATETIME_T", "DAY", "DAYBLOCK_T", "DAYS", "DECL", "DOUBLE", "DOUBLE_T", "ELSE_T", "EQ", "ESC_SEQ", "FOREACH_T", "FUNC", "GEQ", "HEX_DIGIT", "ID", "IF_T", "INST", "INT", "INT_T", "IN_T", "LEQ", "NEQ", "NEW_T", "NOT", "OCTAL_ESC", "OR", "PARAMS", "SCHEDULE_T", "STRING", "STRING_T", "THEN", "TIME", "TIMEBLOCK_T", "TIMES", "TIME_T", "UNICODE_ESC", "WS", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "';'", "'<'", "'='", "'>'", "'['", "']'", "'{'", "'}'", "'~'"
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
    public static final int DAYBLOCK_T=15;
    public static final int DAYS=16;
    public static final int DECL=17;
    public static final int DOUBLE=18;
    public static final int DOUBLE_T=19;
    public static final int ELSE_T=20;
    public static final int EQ=21;
    public static final int ESC_SEQ=22;
    public static final int FOREACH_T=23;
    public static final int FUNC=24;
    public static final int GEQ=25;
    public static final int HEX_DIGIT=26;
    public static final int ID=27;
    public static final int IF_T=28;
    public static final int INST=29;
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
    public static final int THEN=43;
    public static final int TIME=44;
    public static final int TIMEBLOCK_T=45;
    public static final int TIMES=46;
    public static final int TIME_T=47;
    public static final int UNICODE_ESC=48;
    public static final int WS=49;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ChronosParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ChronosParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return ChronosParser.tokenNames; }
    public String getGrammarFileName() { return "Chronos.g"; }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // Chronos.g:26:1: program : ( line )+ EOF !;
    public final ChronosParser.program_return program() throws RecognitionException {
        ChronosParser.program_return retval = new ChronosParser.program_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF2=null;
        ChronosParser.line_return line1 =null;


        CommonTree EOF2_tree=null;

        try {
            // Chronos.g:27:2: ( ( line )+ EOF !)
            // Chronos.g:27:4: ( line )+ EOF !
            {
            root_0 = (CommonTree)adaptor.nil();


            // Chronos.g:27:4: ( line )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==BREAK_T||(LA1_0 >= COURSELIST_T && LA1_0 <= COURSE_T)||LA1_0==DATETIME_T||LA1_0==DAYBLOCK_T||(LA1_0 >= DOUBLE && LA1_0 <= DOUBLE_T)||LA1_0==FOREACH_T||(LA1_0 >= ID && LA1_0 <= IF_T)||(LA1_0 >= INT && LA1_0 <= INT_T)||LA1_0==NOT||(LA1_0 >= SCHEDULE_T && LA1_0 <= STRING_T)||(LA1_0 >= TIME && LA1_0 <= TIMEBLOCK_T)||LA1_0==TIME_T||LA1_0==50||LA1_0==58||LA1_0==62) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Chronos.g:27:4: line
            	    {
            	    pushFollow(FOLLOW_line_in_program90);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program93); 

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
    // Chronos.g:29:1: line : ( declarator ';' !| instantiator | stmt );
    public final ChronosParser.line_return line() throws RecognitionException {
        ChronosParser.line_return retval = new ChronosParser.line_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal4=null;
        ChronosParser.declarator_return declarator3 =null;

        ChronosParser.instantiator_return instantiator5 =null;

        ChronosParser.stmt_return stmt6 =null;


        CommonTree char_literal4_tree=null;

        try {
            // Chronos.g:30:2: ( declarator ';' !| instantiator | stmt )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0 >= COURSELIST_T && LA2_0 <= COURSE_T)||LA2_0==DATETIME_T||LA2_0==DAYBLOCK_T||LA2_0==DOUBLE_T||LA2_0==INT_T||LA2_0==SCHEDULE_T||LA2_0==STRING_T||LA2_0==TIMEBLOCK_T||LA2_0==TIME_T) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==ID) ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==60) ) {
                        alt2=2;
                    }
                    else if ( (LA2_3==58) ) {
                        alt2=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA2_0==BREAK_T||LA2_0==DOUBLE||LA2_0==FOREACH_T||(LA2_0 >= ID && LA2_0 <= IF_T)||LA2_0==INT||LA2_0==NOT||LA2_0==STRING||LA2_0==TIME||LA2_0==50||LA2_0==58||LA2_0==62) ) {
                alt2=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // Chronos.g:30:4: declarator ';' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_declarator_in_line104);
                    declarator3=declarator();

                    state._fsp--;

                    adaptor.addChild(root_0, declarator3.getTree());

                    char_literal4=(Token)match(input,58,FOLLOW_58_in_line106); 

                    }
                    break;
                case 2 :
                    // Chronos.g:31:4: instantiator
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_instantiator_in_line112);
                    instantiator5=instantiator();

                    state._fsp--;

                    adaptor.addChild(root_0, instantiator5.getTree());

                    }
                    break;
                case 3 :
                    // Chronos.g:32:4: stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_stmt_in_line117);
                    stmt6=stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, stmt6.getTree());

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


    public static class declarator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declarator"
    // Chronos.g:34:1: declarator : type_specifier ID -> ^( DECL type_specifier ID ) ;
    public final ChronosParser.declarator_return declarator() throws RecognitionException {
        ChronosParser.declarator_return retval = new ChronosParser.declarator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID8=null;
        ChronosParser.type_specifier_return type_specifier7 =null;


        CommonTree ID8_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_type_specifier=new RewriteRuleSubtreeStream(adaptor,"rule type_specifier");
        try {
            // Chronos.g:36:2: ( type_specifier ID -> ^( DECL type_specifier ID ) )
            // Chronos.g:36:4: type_specifier ID
            {
            pushFollow(FOLLOW_type_specifier_in_declarator128);
            type_specifier7=type_specifier();

            state._fsp--;

            stream_type_specifier.add(type_specifier7.getTree());

            ID8=(Token)match(input,ID,FOLLOW_ID_in_declarator130);  
            stream_ID.add(ID8);


            // AST REWRITE
            // elements: type_specifier, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 37:4: -> ^( DECL type_specifier ID )
            {
                // Chronos.g:37:7: ^( DECL type_specifier ID )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DECL, "DECL")
                , root_1);

                adaptor.addChild(root_1, stream_type_specifier.nextTree());

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

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
    // $ANTLR end "declarator"


    public static class instantiator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instantiator"
    // Chronos.g:39:1: instantiator : type_specifier ID '=' expr ';' -> ^( INST ^( '=' ID expr ) ) ;
    public final ChronosParser.instantiator_return instantiator() throws RecognitionException {
        ChronosParser.instantiator_return retval = new ChronosParser.instantiator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID10=null;
        Token char_literal11=null;
        Token char_literal13=null;
        ChronosParser.type_specifier_return type_specifier9 =null;

        ChronosParser.expr_return expr12 =null;


        CommonTree ID10_tree=null;
        CommonTree char_literal11_tree=null;
        CommonTree char_literal13_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleSubtreeStream stream_type_specifier=new RewriteRuleSubtreeStream(adaptor,"rule type_specifier");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Chronos.g:41:2: ( type_specifier ID '=' expr ';' -> ^( INST ^( '=' ID expr ) ) )
            // Chronos.g:41:4: type_specifier ID '=' expr ';'
            {
            pushFollow(FOLLOW_type_specifier_in_instantiator154);
            type_specifier9=type_specifier();

            state._fsp--;

            stream_type_specifier.add(type_specifier9.getTree());

            ID10=(Token)match(input,ID,FOLLOW_ID_in_instantiator156);  
            stream_ID.add(ID10);


            char_literal11=(Token)match(input,60,FOLLOW_60_in_instantiator158);  
            stream_60.add(char_literal11);


            pushFollow(FOLLOW_expr_in_instantiator160);
            expr12=expr();

            state._fsp--;

            stream_expr.add(expr12.getTree());

            char_literal13=(Token)match(input,58,FOLLOW_58_in_instantiator162);  
            stream_58.add(char_literal13);


            // AST REWRITE
            // elements: ID, expr, 60
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 42:4: -> ^( INST ^( '=' ID expr ) )
            {
                // Chronos.g:42:7: ^( INST ^( '=' ID expr ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(INST, "INST")
                , root_1);

                // Chronos.g:42:14: ^( '=' ID expr )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_60.nextNode()
                , root_2);

                adaptor.addChild(root_2, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_2, stream_expr.nextTree());

                adaptor.addChild(root_1, root_2);
                }

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
    // $ANTLR end "instantiator"


    public static class stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt"
    // Chronos.g:44:1: stmt : ( expr ( '=' ^ expr )? ';' !| selection_stmt | iteration_stmt | jump_stmt ';' -> jump_stmt | ';' !);
    public final ChronosParser.stmt_return stmt() throws RecognitionException {
        ChronosParser.stmt_return retval = new ChronosParser.stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal15=null;
        Token char_literal17=null;
        Token char_literal21=null;
        Token char_literal22=null;
        ChronosParser.expr_return expr14 =null;

        ChronosParser.expr_return expr16 =null;

        ChronosParser.selection_stmt_return selection_stmt18 =null;

        ChronosParser.iteration_stmt_return iteration_stmt19 =null;

        ChronosParser.jump_stmt_return jump_stmt20 =null;


        CommonTree char_literal15_tree=null;
        CommonTree char_literal17_tree=null;
        CommonTree char_literal21_tree=null;
        CommonTree char_literal22_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleSubtreeStream stream_jump_stmt=new RewriteRuleSubtreeStream(adaptor,"rule jump_stmt");
        try {
            // Chronos.g:44:5: ( expr ( '=' ^ expr )? ';' !| selection_stmt | iteration_stmt | jump_stmt ';' -> jump_stmt | ';' !)
            int alt4=5;
            switch ( input.LA(1) ) {
            case DOUBLE:
            case ID:
            case INT:
            case NOT:
            case STRING:
            case TIME:
            case 50:
            case 62:
                {
                alt4=1;
                }
                break;
            case IF_T:
                {
                alt4=2;
                }
                break;
            case FOREACH_T:
                {
                alt4=3;
                }
                break;
            case BREAK_T:
                {
                alt4=4;
                }
                break;
            case 58:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // Chronos.g:44:7: expr ( '=' ^ expr )? ';' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_stmt187);
                    expr14=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr14.getTree());

                    // Chronos.g:44:12: ( '=' ^ expr )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==60) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // Chronos.g:44:13: '=' ^ expr
                            {
                            char_literal15=(Token)match(input,60,FOLLOW_60_in_stmt190); 
                            char_literal15_tree = 
                            (CommonTree)adaptor.create(char_literal15)
                            ;
                            root_0 = (CommonTree)adaptor.becomeRoot(char_literal15_tree, root_0);


                            pushFollow(FOLLOW_expr_in_stmt193);
                            expr16=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr16.getTree());

                            }
                            break;

                    }


                    char_literal17=(Token)match(input,58,FOLLOW_58_in_stmt197); 

                    }
                    break;
                case 2 :
                    // Chronos.g:45:4: selection_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_selection_stmt_in_stmt203);
                    selection_stmt18=selection_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, selection_stmt18.getTree());

                    }
                    break;
                case 3 :
                    // Chronos.g:46:4: iteration_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_iteration_stmt_in_stmt208);
                    iteration_stmt19=iteration_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, iteration_stmt19.getTree());

                    }
                    break;
                case 4 :
                    // Chronos.g:47:4: jump_stmt ';'
                    {
                    pushFollow(FOLLOW_jump_stmt_in_stmt213);
                    jump_stmt20=jump_stmt();

                    state._fsp--;

                    stream_jump_stmt.add(jump_stmt20.getTree());

                    char_literal21=(Token)match(input,58,FOLLOW_58_in_stmt214);  
                    stream_58.add(char_literal21);


                    // AST REWRITE
                    // elements: jump_stmt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 47:17: -> jump_stmt
                    {
                        adaptor.addChild(root_0, stream_jump_stmt.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // Chronos.g:48:4: ';' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal22=(Token)match(input,58,FOLLOW_58_in_stmt223); 

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
    // $ANTLR end "stmt"


    public static class selection_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selection_stmt"
    // Chronos.g:50:1: selection_stmt : IF_T expr '{' (a= line )* '}' ( else_stmt )? -> ^( COND expr ^( THEN ( $a)* ) else_stmt ) ;
    public final ChronosParser.selection_stmt_return selection_stmt() throws RecognitionException {
        ChronosParser.selection_stmt_return retval = new ChronosParser.selection_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IF_T23=null;
        Token char_literal25=null;
        Token char_literal26=null;
        ChronosParser.line_return a =null;

        ChronosParser.expr_return expr24 =null;

        ChronosParser.else_stmt_return else_stmt27 =null;


        CommonTree IF_T23_tree=null;
        CommonTree char_literal25_tree=null;
        CommonTree char_literal26_tree=null;
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_IF_T=new RewriteRuleTokenStream(adaptor,"token IF_T");
        RewriteRuleSubtreeStream stream_else_stmt=new RewriteRuleSubtreeStream(adaptor,"rule else_stmt");
        RewriteRuleSubtreeStream stream_line=new RewriteRuleSubtreeStream(adaptor,"rule line");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Chronos.g:52:2: ( IF_T expr '{' (a= line )* '}' ( else_stmt )? -> ^( COND expr ^( THEN ( $a)* ) else_stmt ) )
            // Chronos.g:54:4: IF_T expr '{' (a= line )* '}' ( else_stmt )?
            {
            IF_T23=(Token)match(input,IF_T,FOLLOW_IF_T_in_selection_stmt240);  
            stream_IF_T.add(IF_T23);


            pushFollow(FOLLOW_expr_in_selection_stmt242);
            expr24=expr();

            state._fsp--;

            stream_expr.add(expr24.getTree());

            char_literal25=(Token)match(input,64,FOLLOW_64_in_selection_stmt244);  
            stream_64.add(char_literal25);


            // Chronos.g:54:18: (a= line )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==BREAK_T||(LA5_0 >= COURSELIST_T && LA5_0 <= COURSE_T)||LA5_0==DATETIME_T||LA5_0==DAYBLOCK_T||(LA5_0 >= DOUBLE && LA5_0 <= DOUBLE_T)||LA5_0==FOREACH_T||(LA5_0 >= ID && LA5_0 <= IF_T)||(LA5_0 >= INT && LA5_0 <= INT_T)||LA5_0==NOT||(LA5_0 >= SCHEDULE_T && LA5_0 <= STRING_T)||(LA5_0 >= TIME && LA5_0 <= TIMEBLOCK_T)||LA5_0==TIME_T||LA5_0==50||LA5_0==58||LA5_0==62) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Chronos.g:54:19: a= line
            	    {
            	    pushFollow(FOLLOW_line_in_selection_stmt249);
            	    a=line();

            	    state._fsp--;

            	    stream_line.add(a.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            char_literal26=(Token)match(input,65,FOLLOW_65_in_selection_stmt253);  
            stream_65.add(char_literal26);


            // Chronos.g:54:32: ( else_stmt )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ELSE_T) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Chronos.g:54:32: else_stmt
                    {
                    pushFollow(FOLLOW_else_stmt_in_selection_stmt255);
                    else_stmt27=else_stmt();

                    state._fsp--;

                    stream_else_stmt.add(else_stmt27.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: else_stmt, a, expr
            // token labels: 
            // rule labels: retval, a
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 54:43: -> ^( COND expr ^( THEN ( $a)* ) else_stmt )
            {
                // Chronos.g:54:46: ^( COND expr ^( THEN ( $a)* ) else_stmt )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COND, "COND")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                // Chronos.g:54:58: ^( THEN ( $a)* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(THEN, "THEN")
                , root_2);

                // Chronos.g:54:66: ( $a)*
                while ( stream_a.hasNext() ) {
                    adaptor.addChild(root_2, stream_a.nextTree());

                }
                stream_a.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_else_stmt.nextTree());

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
    // $ANTLR end "selection_stmt"


    public static class then_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "then_stmt"
    // Chronos.g:56:1: then_stmt : IF_T expr '{' (a= line )* '}' -> ^( THEN ( $a)* ) ;
    public final ChronosParser.then_stmt_return then_stmt() throws RecognitionException {
        ChronosParser.then_stmt_return retval = new ChronosParser.then_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IF_T28=null;
        Token char_literal30=null;
        Token char_literal31=null;
        ChronosParser.line_return a =null;

        ChronosParser.expr_return expr29 =null;


        CommonTree IF_T28_tree=null;
        CommonTree char_literal30_tree=null;
        CommonTree char_literal31_tree=null;
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_IF_T=new RewriteRuleTokenStream(adaptor,"token IF_T");
        RewriteRuleSubtreeStream stream_line=new RewriteRuleSubtreeStream(adaptor,"rule line");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Chronos.g:57:2: ( IF_T expr '{' (a= line )* '}' -> ^( THEN ( $a)* ) )
            // Chronos.g:57:4: IF_T expr '{' (a= line )* '}'
            {
            IF_T28=(Token)match(input,IF_T,FOLLOW_IF_T_in_then_stmt284);  
            stream_IF_T.add(IF_T28);


            pushFollow(FOLLOW_expr_in_then_stmt286);
            expr29=expr();

            state._fsp--;

            stream_expr.add(expr29.getTree());

            char_literal30=(Token)match(input,64,FOLLOW_64_in_then_stmt288);  
            stream_64.add(char_literal30);


            // Chronos.g:57:17: (a= line )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==BREAK_T||(LA7_0 >= COURSELIST_T && LA7_0 <= COURSE_T)||LA7_0==DATETIME_T||LA7_0==DAYBLOCK_T||(LA7_0 >= DOUBLE && LA7_0 <= DOUBLE_T)||LA7_0==FOREACH_T||(LA7_0 >= ID && LA7_0 <= IF_T)||(LA7_0 >= INT && LA7_0 <= INT_T)||LA7_0==NOT||(LA7_0 >= SCHEDULE_T && LA7_0 <= STRING_T)||(LA7_0 >= TIME && LA7_0 <= TIMEBLOCK_T)||LA7_0==TIME_T||LA7_0==50||LA7_0==58||LA7_0==62) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Chronos.g:57:18: a= line
            	    {
            	    pushFollow(FOLLOW_line_in_then_stmt292);
            	    a=line();

            	    state._fsp--;

            	    stream_line.add(a.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            char_literal31=(Token)match(input,65,FOLLOW_65_in_then_stmt296);  
            stream_65.add(char_literal31);


            // AST REWRITE
            // elements: a
            // token labels: 
            // rule labels: retval, a
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 57:31: -> ^( THEN ( $a)* )
            {
                // Chronos.g:57:34: ^( THEN ( $a)* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(THEN, "THEN")
                , root_1);

                // Chronos.g:57:42: ( $a)*
                while ( stream_a.hasNext() ) {
                    adaptor.addChild(root_1, stream_a.nextTree());

                }
                stream_a.reset();

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
    // $ANTLR end "then_stmt"


    public static class else_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "else_stmt"
    // Chronos.g:59:1: else_stmt : ELSE_T '{' (b= line )* '}' -> ^( ELSE_T ( $b)* ) ;
    public final ChronosParser.else_stmt_return else_stmt() throws RecognitionException {
        ChronosParser.else_stmt_return retval = new ChronosParser.else_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ELSE_T32=null;
        Token char_literal33=null;
        Token char_literal34=null;
        ChronosParser.line_return b =null;


        CommonTree ELSE_T32_tree=null;
        CommonTree char_literal33_tree=null;
        CommonTree char_literal34_tree=null;
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_ELSE_T=new RewriteRuleTokenStream(adaptor,"token ELSE_T");
        RewriteRuleSubtreeStream stream_line=new RewriteRuleSubtreeStream(adaptor,"rule line");
        try {
            // Chronos.g:60:2: ( ELSE_T '{' (b= line )* '}' -> ^( ELSE_T ( $b)* ) )
            // Chronos.g:60:4: ELSE_T '{' (b= line )* '}'
            {
            ELSE_T32=(Token)match(input,ELSE_T,FOLLOW_ELSE_T_in_else_stmt316);  
            stream_ELSE_T.add(ELSE_T32);


            char_literal33=(Token)match(input,64,FOLLOW_64_in_else_stmt318);  
            stream_64.add(char_literal33);


            // Chronos.g:60:15: (b= line )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==BREAK_T||(LA8_0 >= COURSELIST_T && LA8_0 <= COURSE_T)||LA8_0==DATETIME_T||LA8_0==DAYBLOCK_T||(LA8_0 >= DOUBLE && LA8_0 <= DOUBLE_T)||LA8_0==FOREACH_T||(LA8_0 >= ID && LA8_0 <= IF_T)||(LA8_0 >= INT && LA8_0 <= INT_T)||LA8_0==NOT||(LA8_0 >= SCHEDULE_T && LA8_0 <= STRING_T)||(LA8_0 >= TIME && LA8_0 <= TIMEBLOCK_T)||LA8_0==TIME_T||LA8_0==50||LA8_0==58||LA8_0==62) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Chronos.g:60:16: b= line
            	    {
            	    pushFollow(FOLLOW_line_in_else_stmt323);
            	    b=line();

            	    state._fsp--;

            	    stream_line.add(b.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            char_literal34=(Token)match(input,65,FOLLOW_65_in_else_stmt327);  
            stream_65.add(char_literal34);


            // AST REWRITE
            // elements: b, ELSE_T
            // token labels: 
            // rule labels: retval, b
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 60:29: -> ^( ELSE_T ( $b)* )
            {
                // Chronos.g:60:32: ^( ELSE_T ( $b)* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_ELSE_T.nextNode()
                , root_1);

                // Chronos.g:60:42: ( $b)*
                while ( stream_b.hasNext() ) {
                    adaptor.addChild(root_1, stream_b.nextTree());

                }
                stream_b.reset();

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
    // $ANTLR end "else_stmt"


    public static class iteration_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "iteration_stmt"
    // Chronos.g:62:1: iteration_stmt : FOREACH_T COURSE_T element= ID IN_T list= ID '{' ( line )* '}' -> ^( FOREACH_T ^( IN_T $element $list) ^( BLOCK ( line )* ) ) ;
    public final ChronosParser.iteration_stmt_return iteration_stmt() throws RecognitionException {
        ChronosParser.iteration_stmt_return retval = new ChronosParser.iteration_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token element=null;
        Token list=null;
        Token FOREACH_T35=null;
        Token COURSE_T36=null;
        Token IN_T37=null;
        Token char_literal38=null;
        Token char_literal40=null;
        ChronosParser.line_return line39 =null;


        CommonTree element_tree=null;
        CommonTree list_tree=null;
        CommonTree FOREACH_T35_tree=null;
        CommonTree COURSE_T36_tree=null;
        CommonTree IN_T37_tree=null;
        CommonTree char_literal38_tree=null;
        CommonTree char_literal40_tree=null;
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_COURSE_T=new RewriteRuleTokenStream(adaptor,"token COURSE_T");
        RewriteRuleTokenStream stream_FOREACH_T=new RewriteRuleTokenStream(adaptor,"token FOREACH_T");
        RewriteRuleTokenStream stream_IN_T=new RewriteRuleTokenStream(adaptor,"token IN_T");
        RewriteRuleSubtreeStream stream_line=new RewriteRuleSubtreeStream(adaptor,"rule line");
        try {
            // Chronos.g:64:2: ( FOREACH_T COURSE_T element= ID IN_T list= ID '{' ( line )* '}' -> ^( FOREACH_T ^( IN_T $element $list) ^( BLOCK ( line )* ) ) )
            // Chronos.g:64:4: FOREACH_T COURSE_T element= ID IN_T list= ID '{' ( line )* '}'
            {
            FOREACH_T35=(Token)match(input,FOREACH_T,FOLLOW_FOREACH_T_in_iteration_stmt348);  
            stream_FOREACH_T.add(FOREACH_T35);


            COURSE_T36=(Token)match(input,COURSE_T,FOLLOW_COURSE_T_in_iteration_stmt350);  
            stream_COURSE_T.add(COURSE_T36);


            element=(Token)match(input,ID,FOLLOW_ID_in_iteration_stmt354);  
            stream_ID.add(element);


            IN_T37=(Token)match(input,IN_T,FOLLOW_IN_T_in_iteration_stmt356);  
            stream_IN_T.add(IN_T37);


            list=(Token)match(input,ID,FOLLOW_ID_in_iteration_stmt360);  
            stream_ID.add(list);


            char_literal38=(Token)match(input,64,FOLLOW_64_in_iteration_stmt362);  
            stream_64.add(char_literal38);


            // Chronos.g:64:51: ( line )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==BREAK_T||(LA9_0 >= COURSELIST_T && LA9_0 <= COURSE_T)||LA9_0==DATETIME_T||LA9_0==DAYBLOCK_T||(LA9_0 >= DOUBLE && LA9_0 <= DOUBLE_T)||LA9_0==FOREACH_T||(LA9_0 >= ID && LA9_0 <= IF_T)||(LA9_0 >= INT && LA9_0 <= INT_T)||LA9_0==NOT||(LA9_0 >= SCHEDULE_T && LA9_0 <= STRING_T)||(LA9_0 >= TIME && LA9_0 <= TIMEBLOCK_T)||LA9_0==TIME_T||LA9_0==50||LA9_0==58||LA9_0==62) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Chronos.g:64:51: line
            	    {
            	    pushFollow(FOLLOW_line_in_iteration_stmt364);
            	    line39=line();

            	    state._fsp--;

            	    stream_line.add(line39.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            char_literal40=(Token)match(input,65,FOLLOW_65_in_iteration_stmt367);  
            stream_65.add(char_literal40);


            // AST REWRITE
            // elements: list, element, line, IN_T, FOREACH_T
            // token labels: element, list
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_element=new RewriteRuleTokenStream(adaptor,"token element",element);
            RewriteRuleTokenStream stream_list=new RewriteRuleTokenStream(adaptor,"token list",list);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 65:4: -> ^( FOREACH_T ^( IN_T $element $list) ^( BLOCK ( line )* ) )
            {
                // Chronos.g:65:7: ^( FOREACH_T ^( IN_T $element $list) ^( BLOCK ( line )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_FOREACH_T.nextNode()
                , root_1);

                // Chronos.g:65:19: ^( IN_T $element $list)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_IN_T.nextNode()
                , root_2);

                adaptor.addChild(root_2, stream_element.nextNode());

                adaptor.addChild(root_2, stream_list.nextNode());

                adaptor.addChild(root_1, root_2);
                }

                // Chronos.g:65:42: ^( BLOCK ( line )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(BLOCK, "BLOCK")
                , root_2);

                // Chronos.g:65:50: ( line )*
                while ( stream_line.hasNext() ) {
                    adaptor.addChild(root_2, stream_line.nextTree());

                }
                stream_line.reset();

                adaptor.addChild(root_1, root_2);
                }

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
    // $ANTLR end "iteration_stmt"


    public static class jump_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "jump_stmt"
    // Chronos.g:67:1: jump_stmt : BREAK_T ;
    public final ChronosParser.jump_stmt_return jump_stmt() throws RecognitionException {
        ChronosParser.jump_stmt_return retval = new ChronosParser.jump_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BREAK_T41=null;

        CommonTree BREAK_T41_tree=null;

        try {
            // Chronos.g:69:2: ( BREAK_T )
            // Chronos.g:69:4: BREAK_T
            {
            root_0 = (CommonTree)adaptor.nil();


            BREAK_T41=(Token)match(input,BREAK_T,FOLLOW_BREAK_T_in_jump_stmt406); 
            BREAK_T41_tree = 
            (CommonTree)adaptor.create(BREAK_T41)
            ;
            adaptor.addChild(root_0, BREAK_T41_tree);


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
    // $ANTLR end "jump_stmt"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // Chronos.g:71:1: expr : and_expr ( OR ^ and_expr )* ;
    public final ChronosParser.expr_return expr() throws RecognitionException {
        ChronosParser.expr_return retval = new ChronosParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token OR43=null;
        ChronosParser.and_expr_return and_expr42 =null;

        ChronosParser.and_expr_return and_expr44 =null;


        CommonTree OR43_tree=null;

        try {
            // Chronos.g:73:2: ( and_expr ( OR ^ and_expr )* )
            // Chronos.g:73:4: and_expr ( OR ^ and_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_and_expr_in_expr417);
            and_expr42=and_expr();

            state._fsp--;

            adaptor.addChild(root_0, and_expr42.getTree());

            // Chronos.g:73:13: ( OR ^ and_expr )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==OR) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Chronos.g:73:14: OR ^ and_expr
            	    {
            	    OR43=(Token)match(input,OR,FOLLOW_OR_in_expr420); 
            	    OR43_tree = 
            	    (CommonTree)adaptor.create(OR43)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(OR43_tree, root_0);


            	    pushFollow(FOLLOW_and_expr_in_expr423);
            	    and_expr44=and_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, and_expr44.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


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
    // $ANTLR end "expr"


    public static class and_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "and_expr"
    // Chronos.g:76:1: and_expr : equiv_expr ( AND ^ equiv_expr )* ;
    public final ChronosParser.and_expr_return and_expr() throws RecognitionException {
        ChronosParser.and_expr_return retval = new ChronosParser.and_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AND46=null;
        ChronosParser.equiv_expr_return equiv_expr45 =null;

        ChronosParser.equiv_expr_return equiv_expr47 =null;


        CommonTree AND46_tree=null;

        try {
            // Chronos.g:78:2: ( equiv_expr ( AND ^ equiv_expr )* )
            // Chronos.g:78:4: equiv_expr ( AND ^ equiv_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_equiv_expr_in_and_expr438);
            equiv_expr45=equiv_expr();

            state._fsp--;

            adaptor.addChild(root_0, equiv_expr45.getTree());

            // Chronos.g:78:15: ( AND ^ equiv_expr )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==AND) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Chronos.g:78:16: AND ^ equiv_expr
            	    {
            	    AND46=(Token)match(input,AND,FOLLOW_AND_in_and_expr441); 
            	    AND46_tree = 
            	    (CommonTree)adaptor.create(AND46)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(AND46_tree, root_0);


            	    pushFollow(FOLLOW_equiv_expr_in_and_expr444);
            	    equiv_expr47=equiv_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, equiv_expr47.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


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
    // $ANTLR end "and_expr"


    public static class equiv_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equiv_expr"
    // Chronos.g:80:1: equiv_expr : rel_expr ( ( EQ ^| NEQ ^) rel_expr )* ;
    public final ChronosParser.equiv_expr_return equiv_expr() throws RecognitionException {
        ChronosParser.equiv_expr_return retval = new ChronosParser.equiv_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQ49=null;
        Token NEQ50=null;
        ChronosParser.rel_expr_return rel_expr48 =null;

        ChronosParser.rel_expr_return rel_expr51 =null;


        CommonTree EQ49_tree=null;
        CommonTree NEQ50_tree=null;

        try {
            // Chronos.g:82:2: ( rel_expr ( ( EQ ^| NEQ ^) rel_expr )* )
            // Chronos.g:82:4: rel_expr ( ( EQ ^| NEQ ^) rel_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_rel_expr_in_equiv_expr457);
            rel_expr48=rel_expr();

            state._fsp--;

            adaptor.addChild(root_0, rel_expr48.getTree());

            // Chronos.g:82:13: ( ( EQ ^| NEQ ^) rel_expr )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==EQ||LA13_0==NEQ) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Chronos.g:82:15: ( EQ ^| NEQ ^) rel_expr
            	    {
            	    // Chronos.g:82:15: ( EQ ^| NEQ ^)
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==EQ) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==NEQ) ) {
            	        alt12=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // Chronos.g:82:16: EQ ^
            	            {
            	            EQ49=(Token)match(input,EQ,FOLLOW_EQ_in_equiv_expr462); 
            	            EQ49_tree = 
            	            (CommonTree)adaptor.create(EQ49)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(EQ49_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // Chronos.g:82:22: NEQ ^
            	            {
            	            NEQ50=(Token)match(input,NEQ,FOLLOW_NEQ_in_equiv_expr467); 
            	            NEQ50_tree = 
            	            (CommonTree)adaptor.create(NEQ50)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(NEQ50_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_rel_expr_in_equiv_expr471);
            	    rel_expr51=rel_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, rel_expr51.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


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
    // $ANTLR end "equiv_expr"


    public static class rel_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rel_expr"
    // Chronos.g:84:1: rel_expr : ( math_expr ( ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr )* | datetime );
    public final ChronosParser.rel_expr_return rel_expr() throws RecognitionException {
        ChronosParser.rel_expr_return retval = new ChronosParser.rel_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal53=null;
        Token char_literal54=null;
        Token GEQ55=null;
        Token LEQ56=null;
        ChronosParser.math_expr_return math_expr52 =null;

        ChronosParser.math_expr_return math_expr57 =null;

        ChronosParser.datetime_return datetime58 =null;


        CommonTree char_literal53_tree=null;
        CommonTree char_literal54_tree=null;
        CommonTree GEQ55_tree=null;
        CommonTree LEQ56_tree=null;

        try {
            // Chronos.g:86:2: ( math_expr ( ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr )* | datetime )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==DOUBLE||LA16_0==ID||LA16_0==INT||LA16_0==NOT||LA16_0==STRING||LA16_0==TIME||LA16_0==50) ) {
                alt16=1;
            }
            else if ( (LA16_0==62) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // Chronos.g:86:4: math_expr ( ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_math_expr_in_rel_expr485);
                    math_expr52=math_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, math_expr52.getTree());

                    // Chronos.g:86:14: ( ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==GEQ||LA15_0==LEQ||LA15_0==59||LA15_0==61) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // Chronos.g:86:16: ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr
                    	    {
                    	    // Chronos.g:86:16: ( '<' ^| '>' ^| GEQ ^| LEQ ^)
                    	    int alt14=4;
                    	    switch ( input.LA(1) ) {
                    	    case 59:
                    	        {
                    	        alt14=1;
                    	        }
                    	        break;
                    	    case 61:
                    	        {
                    	        alt14=2;
                    	        }
                    	        break;
                    	    case GEQ:
                    	        {
                    	        alt14=3;
                    	        }
                    	        break;
                    	    case LEQ:
                    	        {
                    	        alt14=4;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 14, 0, input);

                    	        throw nvae;

                    	    }

                    	    switch (alt14) {
                    	        case 1 :
                    	            // Chronos.g:86:17: '<' ^
                    	            {
                    	            char_literal53=(Token)match(input,59,FOLLOW_59_in_rel_expr490); 
                    	            char_literal53_tree = 
                    	            (CommonTree)adaptor.create(char_literal53)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal53_tree, root_0);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // Chronos.g:86:24: '>' ^
                    	            {
                    	            char_literal54=(Token)match(input,61,FOLLOW_61_in_rel_expr495); 
                    	            char_literal54_tree = 
                    	            (CommonTree)adaptor.create(char_literal54)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal54_tree, root_0);


                    	            }
                    	            break;
                    	        case 3 :
                    	            // Chronos.g:86:31: GEQ ^
                    	            {
                    	            GEQ55=(Token)match(input,GEQ,FOLLOW_GEQ_in_rel_expr500); 
                    	            GEQ55_tree = 
                    	            (CommonTree)adaptor.create(GEQ55)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(GEQ55_tree, root_0);


                    	            }
                    	            break;
                    	        case 4 :
                    	            // Chronos.g:86:38: LEQ ^
                    	            {
                    	            LEQ56=(Token)match(input,LEQ,FOLLOW_LEQ_in_rel_expr505); 
                    	            LEQ56_tree = 
                    	            (CommonTree)adaptor.create(LEQ56)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(LEQ56_tree, root_0);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_math_expr_in_rel_expr509);
                    	    math_expr57=math_expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, math_expr57.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Chronos.g:87:4: datetime
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_datetime_in_rel_expr517);
                    datetime58=datetime();

                    state._fsp--;

                    adaptor.addChild(root_0, datetime58.getTree());

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
    // $ANTLR end "rel_expr"


    public static class math_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "math_expr"
    // Chronos.g:89:1: math_expr : math_term ( ( '+' ^| '-' ^) math_term )* ;
    public final ChronosParser.math_expr_return math_expr() throws RecognitionException {
        ChronosParser.math_expr_return retval = new ChronosParser.math_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal60=null;
        Token char_literal61=null;
        ChronosParser.math_term_return math_term59 =null;

        ChronosParser.math_term_return math_term62 =null;


        CommonTree char_literal60_tree=null;
        CommonTree char_literal61_tree=null;

        try {
            // Chronos.g:91:2: ( math_term ( ( '+' ^| '-' ^) math_term )* )
            // Chronos.g:91:4: math_term ( ( '+' ^| '-' ^) math_term )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_math_term_in_math_expr528);
            math_term59=math_term();

            state._fsp--;

            adaptor.addChild(root_0, math_term59.getTree());

            // Chronos.g:91:14: ( ( '+' ^| '-' ^) math_term )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==53||LA18_0==55) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // Chronos.g:91:16: ( '+' ^| '-' ^) math_term
            	    {
            	    // Chronos.g:91:16: ( '+' ^| '-' ^)
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==53) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==55) ) {
            	        alt17=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // Chronos.g:91:17: '+' ^
            	            {
            	            char_literal60=(Token)match(input,53,FOLLOW_53_in_math_expr533); 
            	            char_literal60_tree = 
            	            (CommonTree)adaptor.create(char_literal60)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal60_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // Chronos.g:91:24: '-' ^
            	            {
            	            char_literal61=(Token)match(input,55,FOLLOW_55_in_math_expr538); 
            	            char_literal61_tree = 
            	            (CommonTree)adaptor.create(char_literal61)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal61_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_math_term_in_math_expr542);
            	    math_term62=math_term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, math_term62.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


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
    // $ANTLR end "math_expr"


    public static class math_term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "math_term"
    // Chronos.g:93:1: math_term : ( unary_expr ( ( '*' ^| '/' ^) unary_expr )* | timeblock );
    public final ChronosParser.math_term_return math_term() throws RecognitionException {
        ChronosParser.math_term_return retval = new ChronosParser.math_term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal64=null;
        Token char_literal65=null;
        ChronosParser.unary_expr_return unary_expr63 =null;

        ChronosParser.unary_expr_return unary_expr66 =null;

        ChronosParser.timeblock_return timeblock67 =null;


        CommonTree char_literal64_tree=null;
        CommonTree char_literal65_tree=null;

        try {
            // Chronos.g:95:2: ( unary_expr ( ( '*' ^| '/' ^) unary_expr )* | timeblock )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==DOUBLE||LA21_0==ID||LA21_0==INT||LA21_0==NOT||LA21_0==STRING||LA21_0==50) ) {
                alt21=1;
            }
            else if ( (LA21_0==TIME) ) {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==66) ) {
                    alt21=2;
                }
                else if ( (LA21_2==AND||LA21_2==EQ||LA21_2==GEQ||(LA21_2 >= LEQ && LA21_2 <= NEQ)||LA21_2==OR||(LA21_2 >= 51 && LA21_2 <= 61)||LA21_2==64) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // Chronos.g:95:4: unary_expr ( ( '*' ^| '/' ^) unary_expr )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_unary_expr_in_math_term556);
                    unary_expr63=unary_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, unary_expr63.getTree());

                    // Chronos.g:95:15: ( ( '*' ^| '/' ^) unary_expr )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==52||LA20_0==57) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // Chronos.g:95:17: ( '*' ^| '/' ^) unary_expr
                    	    {
                    	    // Chronos.g:95:17: ( '*' ^| '/' ^)
                    	    int alt19=2;
                    	    int LA19_0 = input.LA(1);

                    	    if ( (LA19_0==52) ) {
                    	        alt19=1;
                    	    }
                    	    else if ( (LA19_0==57) ) {
                    	        alt19=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 19, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt19) {
                    	        case 1 :
                    	            // Chronos.g:95:18: '*' ^
                    	            {
                    	            char_literal64=(Token)match(input,52,FOLLOW_52_in_math_term561); 
                    	            char_literal64_tree = 
                    	            (CommonTree)adaptor.create(char_literal64)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal64_tree, root_0);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // Chronos.g:95:25: '/' ^
                    	            {
                    	            char_literal65=(Token)match(input,57,FOLLOW_57_in_math_term566); 
                    	            char_literal65_tree = 
                    	            (CommonTree)adaptor.create(char_literal65)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal65_tree, root_0);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_unary_expr_in_math_term570);
                    	    unary_expr66=unary_expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, unary_expr66.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Chronos.g:96:4: timeblock
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_timeblock_in_math_term578);
                    timeblock67=timeblock();

                    state._fsp--;

                    adaptor.addChild(root_0, timeblock67.getTree());

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
    // $ANTLR end "math_term"


    public static class unary_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary_expr"
    // Chronos.g:98:1: unary_expr : ( postfix_expr ( '.' ^ postfix_expr )* | NOT ^ postfix_expr );
    public final ChronosParser.unary_expr_return unary_expr() throws RecognitionException {
        ChronosParser.unary_expr_return retval = new ChronosParser.unary_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal69=null;
        Token NOT71=null;
        ChronosParser.postfix_expr_return postfix_expr68 =null;

        ChronosParser.postfix_expr_return postfix_expr70 =null;

        ChronosParser.postfix_expr_return postfix_expr72 =null;


        CommonTree char_literal69_tree=null;
        CommonTree NOT71_tree=null;

        try {
            // Chronos.g:99:2: ( postfix_expr ( '.' ^ postfix_expr )* | NOT ^ postfix_expr )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==DOUBLE||LA23_0==ID||LA23_0==INT||LA23_0==STRING||LA23_0==TIME||LA23_0==50) ) {
                alt23=1;
            }
            else if ( (LA23_0==NOT) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // Chronos.g:99:4: postfix_expr ( '.' ^ postfix_expr )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_postfix_expr_in_unary_expr588);
                    postfix_expr68=postfix_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, postfix_expr68.getTree());

                    // Chronos.g:99:17: ( '.' ^ postfix_expr )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==56) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // Chronos.g:99:18: '.' ^ postfix_expr
                    	    {
                    	    char_literal69=(Token)match(input,56,FOLLOW_56_in_unary_expr591); 
                    	    char_literal69_tree = 
                    	    (CommonTree)adaptor.create(char_literal69)
                    	    ;
                    	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal69_tree, root_0);


                    	    pushFollow(FOLLOW_postfix_expr_in_unary_expr594);
                    	    postfix_expr70=postfix_expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, postfix_expr70.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Chronos.g:100:4: NOT ^ postfix_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    NOT71=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expr601); 
                    NOT71_tree = 
                    (CommonTree)adaptor.create(NOT71)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(NOT71_tree, root_0);


                    pushFollow(FOLLOW_postfix_expr_in_unary_expr604);
                    postfix_expr72=postfix_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, postfix_expr72.getTree());

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
    // $ANTLR end "unary_expr"


    public static class postfix_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "postfix_expr"
    // Chronos.g:102:1: postfix_expr : ( function | primary_expr );
    public final ChronosParser.postfix_expr_return postfix_expr() throws RecognitionException {
        ChronosParser.postfix_expr_return retval = new ChronosParser.postfix_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        ChronosParser.function_return function73 =null;

        ChronosParser.primary_expr_return primary_expr74 =null;



        try {
            // Chronos.g:104:2: ( function | primary_expr )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==50) ) {
                    alt24=1;
                }
                else if ( (LA24_1==AND||LA24_1==EQ||LA24_1==GEQ||(LA24_1 >= LEQ && LA24_1 <= NEQ)||LA24_1==OR||(LA24_1 >= 51 && LA24_1 <= 61)||LA24_1==64) ) {
                    alt24=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA24_0==DOUBLE||LA24_0==INT||LA24_0==STRING||LA24_0==TIME||LA24_0==50) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // Chronos.g:104:4: function
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_function_in_postfix_expr615);
                    function73=function();

                    state._fsp--;

                    adaptor.addChild(root_0, function73.getTree());

                    }
                    break;
                case 2 :
                    // Chronos.g:105:4: primary_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_primary_expr_in_postfix_expr620);
                    primary_expr74=primary_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, primary_expr74.getTree());

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
    // $ANTLR end "postfix_expr"


    public static class function_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function"
    // Chronos.g:107:1: function : ID '(' ( argument_expr_list )? ')' -> ^( ID ^( PARAMS ( argument_expr_list )? ) ) ;
    public final ChronosParser.function_return function() throws RecognitionException {
        ChronosParser.function_return retval = new ChronosParser.function_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID75=null;
        Token char_literal76=null;
        Token char_literal78=null;
        ChronosParser.argument_expr_list_return argument_expr_list77 =null;


        CommonTree ID75_tree=null;
        CommonTree char_literal76_tree=null;
        CommonTree char_literal78_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_argument_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule argument_expr_list");
        try {
            // Chronos.g:108:2: ( ID '(' ( argument_expr_list )? ')' -> ^( ID ^( PARAMS ( argument_expr_list )? ) ) )
            // Chronos.g:108:4: ID '(' ( argument_expr_list )? ')'
            {
            ID75=(Token)match(input,ID,FOLLOW_ID_in_function630);  
            stream_ID.add(ID75);


            char_literal76=(Token)match(input,50,FOLLOW_50_in_function632);  
            stream_50.add(char_literal76);


            // Chronos.g:108:11: ( argument_expr_list )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==DOUBLE||LA25_0==ID||LA25_0==INT||LA25_0==NOT||LA25_0==STRING||LA25_0==TIME||LA25_0==50||LA25_0==62) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // Chronos.g:108:11: argument_expr_list
                    {
                    pushFollow(FOLLOW_argument_expr_list_in_function634);
                    argument_expr_list77=argument_expr_list();

                    state._fsp--;

                    stream_argument_expr_list.add(argument_expr_list77.getTree());

                    }
                    break;

            }


            char_literal78=(Token)match(input,51,FOLLOW_51_in_function637);  
            stream_51.add(char_literal78);


            // AST REWRITE
            // elements: argument_expr_list, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 109:3: -> ^( ID ^( PARAMS ( argument_expr_list )? ) )
            {
                // Chronos.g:109:6: ^( ID ^( PARAMS ( argument_expr_list )? ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_ID.nextNode()
                , root_1);

                // Chronos.g:109:11: ^( PARAMS ( argument_expr_list )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PARAMS, "PARAMS")
                , root_2);

                // Chronos.g:109:20: ( argument_expr_list )?
                if ( stream_argument_expr_list.hasNext() ) {
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
    // $ANTLR end "function"


    public static class datetime_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "datetime"
    // Chronos.g:111:1: datetime : dayblock timeblock -> ^( DATETIME dayblock timeblock ) ;
    public final ChronosParser.datetime_return datetime() throws RecognitionException {
        ChronosParser.datetime_return retval = new ChronosParser.datetime_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        ChronosParser.dayblock_return dayblock79 =null;

        ChronosParser.timeblock_return timeblock80 =null;


        RewriteRuleSubtreeStream stream_timeblock=new RewriteRuleSubtreeStream(adaptor,"rule timeblock");
        RewriteRuleSubtreeStream stream_dayblock=new RewriteRuleSubtreeStream(adaptor,"rule dayblock");
        try {
            // Chronos.g:113:2: ( dayblock timeblock -> ^( DATETIME dayblock timeblock ) )
            // Chronos.g:113:4: dayblock timeblock
            {
            pushFollow(FOLLOW_dayblock_in_datetime663);
            dayblock79=dayblock();

            state._fsp--;

            stream_dayblock.add(dayblock79.getTree());

            pushFollow(FOLLOW_timeblock_in_datetime665);
            timeblock80=timeblock();

            state._fsp--;

            stream_timeblock.add(timeblock80.getTree());

            // AST REWRITE
            // elements: timeblock, dayblock
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 114:4: -> ^( DATETIME dayblock timeblock )
            {
                // Chronos.g:114:7: ^( DATETIME dayblock timeblock )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DATETIME, "DATETIME")
                , root_1);

                adaptor.addChild(root_1, stream_dayblock.nextTree());

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
    // $ANTLR end "datetime"


    public static class timeblock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "timeblock"
    // Chronos.g:116:1: timeblock : a= TIME '~' b= TIME -> ^( TIMES $a $b) ;
    public final ChronosParser.timeblock_return timeblock() throws RecognitionException {
        ChronosParser.timeblock_return retval = new ChronosParser.timeblock_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token a=null;
        Token b=null;
        Token char_literal81=null;

        CommonTree a_tree=null;
        CommonTree b_tree=null;
        CommonTree char_literal81_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_TIME=new RewriteRuleTokenStream(adaptor,"token TIME");

        try {
            // Chronos.g:118:2: (a= TIME '~' b= TIME -> ^( TIMES $a $b) )
            // Chronos.g:118:4: a= TIME '~' b= TIME
            {
            a=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock692);  
            stream_TIME.add(a);


            char_literal81=(Token)match(input,66,FOLLOW_66_in_timeblock694);  
            stream_66.add(char_literal81);


            b=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock698);  
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
            // 118:22: -> ^( TIMES $a $b)
            {
                // Chronos.g:118:25: ^( TIMES $a $b)
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


    public static class dayblock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dayblock"
    // Chronos.g:120:1: dayblock : '[' DAY ( ',' DAY )* ']' -> ^( DAYS ( DAY )+ ) ;
    public final ChronosParser.dayblock_return dayblock() throws RecognitionException {
        ChronosParser.dayblock_return retval = new ChronosParser.dayblock_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal82=null;
        Token DAY83=null;
        Token char_literal84=null;
        Token DAY85=null;
        Token char_literal86=null;

        CommonTree char_literal82_tree=null;
        CommonTree DAY83_tree=null;
        CommonTree char_literal84_tree=null;
        CommonTree DAY85_tree=null;
        CommonTree char_literal86_tree=null;
        RewriteRuleTokenStream stream_DAY=new RewriteRuleTokenStream(adaptor,"token DAY");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");

        try {
            // Chronos.g:122:2: ( '[' DAY ( ',' DAY )* ']' -> ^( DAYS ( DAY )+ ) )
            // Chronos.g:122:4: '[' DAY ( ',' DAY )* ']'
            {
            char_literal82=(Token)match(input,62,FOLLOW_62_in_dayblock721);  
            stream_62.add(char_literal82);


            DAY83=(Token)match(input,DAY,FOLLOW_DAY_in_dayblock723);  
            stream_DAY.add(DAY83);


            // Chronos.g:122:12: ( ',' DAY )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==54) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // Chronos.g:122:14: ',' DAY
            	    {
            	    char_literal84=(Token)match(input,54,FOLLOW_54_in_dayblock727);  
            	    stream_54.add(char_literal84);


            	    DAY85=(Token)match(input,DAY,FOLLOW_DAY_in_dayblock729);  
            	    stream_DAY.add(DAY85);


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            char_literal86=(Token)match(input,63,FOLLOW_63_in_dayblock734);  
            stream_63.add(char_literal86);


            // AST REWRITE
            // elements: DAY
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 122:29: -> ^( DAYS ( DAY )+ )
            {
                // Chronos.g:122:32: ^( DAYS ( DAY )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DAYS, "DAYS")
                , root_1);

                if ( !(stream_DAY.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_DAY.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_DAY.nextNode()
                    );

                }
                stream_DAY.reset();

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
    // $ANTLR end "dayblock"


    public static class primary_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary_expr"
    // Chronos.g:124:1: primary_expr : ( INT | DOUBLE | ID | STRING | TIME | '(' expr ')' -> expr );
    public final ChronosParser.primary_expr_return primary_expr() throws RecognitionException {
        ChronosParser.primary_expr_return retval = new ChronosParser.primary_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INT87=null;
        Token DOUBLE88=null;
        Token ID89=null;
        Token STRING90=null;
        Token TIME91=null;
        Token char_literal92=null;
        Token char_literal94=null;
        ChronosParser.expr_return expr93 =null;


        CommonTree INT87_tree=null;
        CommonTree DOUBLE88_tree=null;
        CommonTree ID89_tree=null;
        CommonTree STRING90_tree=null;
        CommonTree TIME91_tree=null;
        CommonTree char_literal92_tree=null;
        CommonTree char_literal94_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Chronos.g:125:2: ( INT | DOUBLE | ID | STRING | TIME | '(' expr ')' -> expr )
            int alt27=6;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt27=1;
                }
                break;
            case DOUBLE:
                {
                alt27=2;
                }
                break;
            case ID:
                {
                alt27=3;
                }
                break;
            case STRING:
                {
                alt27=4;
                }
                break;
            case TIME:
                {
                alt27=5;
                }
                break;
            case 50:
                {
                alt27=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }

            switch (alt27) {
                case 1 :
                    // Chronos.g:125:4: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INT87=(Token)match(input,INT,FOLLOW_INT_in_primary_expr753); 
                    INT87_tree = 
                    (CommonTree)adaptor.create(INT87)
                    ;
                    adaptor.addChild(root_0, INT87_tree);


                    }
                    break;
                case 2 :
                    // Chronos.g:126:4: DOUBLE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    DOUBLE88=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_primary_expr758); 
                    DOUBLE88_tree = 
                    (CommonTree)adaptor.create(DOUBLE88)
                    ;
                    adaptor.addChild(root_0, DOUBLE88_tree);


                    }
                    break;
                case 3 :
                    // Chronos.g:127:4: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ID89=(Token)match(input,ID,FOLLOW_ID_in_primary_expr763); 
                    ID89_tree = 
                    (CommonTree)adaptor.create(ID89)
                    ;
                    adaptor.addChild(root_0, ID89_tree);


                    }
                    break;
                case 4 :
                    // Chronos.g:128:4: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    STRING90=(Token)match(input,STRING,FOLLOW_STRING_in_primary_expr769); 
                    STRING90_tree = 
                    (CommonTree)adaptor.create(STRING90)
                    ;
                    adaptor.addChild(root_0, STRING90_tree);


                    }
                    break;
                case 5 :
                    // Chronos.g:129:4: TIME
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    TIME91=(Token)match(input,TIME,FOLLOW_TIME_in_primary_expr774); 
                    TIME91_tree = 
                    (CommonTree)adaptor.create(TIME91)
                    ;
                    adaptor.addChild(root_0, TIME91_tree);


                    }
                    break;
                case 6 :
                    // Chronos.g:130:4: '(' expr ')'
                    {
                    char_literal92=(Token)match(input,50,FOLLOW_50_in_primary_expr779);  
                    stream_50.add(char_literal92);


                    pushFollow(FOLLOW_expr_in_primary_expr780);
                    expr93=expr();

                    state._fsp--;

                    stream_expr.add(expr93.getTree());

                    char_literal94=(Token)match(input,51,FOLLOW_51_in_primary_expr781);  
                    stream_51.add(char_literal94);


                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 130:15: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;

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
    // $ANTLR end "primary_expr"


    public static class argument_expr_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argument_expr_list"
    // Chronos.g:132:1: argument_expr_list : ( expr ) ( ',' expr )* -> ( expr )+ ;
    public final ChronosParser.argument_expr_list_return argument_expr_list() throws RecognitionException {
        ChronosParser.argument_expr_list_return retval = new ChronosParser.argument_expr_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal96=null;
        ChronosParser.expr_return expr95 =null;

        ChronosParser.expr_return expr97 =null;


        CommonTree char_literal96_tree=null;
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Chronos.g:133:2: ( ( expr ) ( ',' expr )* -> ( expr )+ )
            // Chronos.g:133:4: ( expr ) ( ',' expr )*
            {
            // Chronos.g:133:4: ( expr )
            // Chronos.g:133:5: expr
            {
            pushFollow(FOLLOW_expr_in_argument_expr_list796);
            expr95=expr();

            state._fsp--;

            stream_expr.add(expr95.getTree());

            }


            // Chronos.g:133:11: ( ',' expr )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==54) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // Chronos.g:133:12: ',' expr
            	    {
            	    char_literal96=(Token)match(input,54,FOLLOW_54_in_argument_expr_list800);  
            	    stream_54.add(char_literal96);


            	    pushFollow(FOLLOW_expr_in_argument_expr_list802);
            	    expr97=expr();

            	    state._fsp--;

            	    stream_expr.add(expr97.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 133:23: -> ( expr )+
            {
                if ( !(stream_expr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_0, stream_expr.nextTree());

                }
                stream_expr.reset();

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
    // $ANTLR end "argument_expr_list"


    public static class type_specifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_specifier"
    // Chronos.g:135:1: type_specifier : ( INT_T | DOUBLE_T | DAYBLOCK_T | TIME_T | STRING_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T );
    public final ChronosParser.type_specifier_return type_specifier() throws RecognitionException {
        ChronosParser.type_specifier_return retval = new ChronosParser.type_specifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set98=null;

        CommonTree set98_tree=null;

        try {
            // Chronos.g:136:2: ( INT_T | DOUBLE_T | DAYBLOCK_T | TIME_T | STRING_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T )
            // Chronos.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set98=(Token)input.LT(1);

            if ( (input.LA(1) >= COURSELIST_T && input.LA(1) <= COURSE_T)||input.LA(1)==DATETIME_T||input.LA(1)==DAYBLOCK_T||input.LA(1)==DOUBLE_T||input.LA(1)==INT_T||input.LA(1)==SCHEDULE_T||input.LA(1)==STRING_T||input.LA(1)==TIMEBLOCK_T||input.LA(1)==TIME_T ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set98)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "type_specifier"

    // Delegated rules


 

    public static final BitSet FOLLOW_line_in_program90 = new BitSet(new long[]{0x4404B710D88CAC40L});
    public static final BitSet FOLLOW_EOF_in_program93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_line104 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_line106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instantiator_in_line112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_line117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_declarator128 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_declarator130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_instantiator154 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_instantiator156 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_instantiator158 = new BitSet(new long[]{0x4004121048040000L});
    public static final BitSet FOLLOW_expr_in_instantiator160 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_instantiator162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt187 = new BitSet(new long[]{0x1400000000000000L});
    public static final BitSet FOLLOW_60_in_stmt190 = new BitSet(new long[]{0x4004121048040000L});
    public static final BitSet FOLLOW_expr_in_stmt193 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_stmt197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_stmt_in_stmt203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_stmt_in_stmt208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_stmt_in_stmt213 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_stmt214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_stmt223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_T_in_selection_stmt240 = new BitSet(new long[]{0x4004121048040000L});
    public static final BitSet FOLLOW_expr_in_selection_stmt242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_selection_stmt244 = new BitSet(new long[]{0x4404B710D88CAC40L,0x0000000000000002L});
    public static final BitSet FOLLOW_line_in_selection_stmt249 = new BitSet(new long[]{0x4404B710D88CAC40L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_selection_stmt253 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_else_stmt_in_selection_stmt255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_T_in_then_stmt284 = new BitSet(new long[]{0x4004121048040000L});
    public static final BitSet FOLLOW_expr_in_then_stmt286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_then_stmt288 = new BitSet(new long[]{0x4404B710D88CAC40L,0x0000000000000002L});
    public static final BitSet FOLLOW_line_in_then_stmt292 = new BitSet(new long[]{0x4404B710D88CAC40L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_then_stmt296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_T_in_else_stmt316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_else_stmt318 = new BitSet(new long[]{0x4404B710D88CAC40L,0x0000000000000002L});
    public static final BitSet FOLLOW_line_in_else_stmt323 = new BitSet(new long[]{0x4404B710D88CAC40L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_else_stmt327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREACH_T_in_iteration_stmt348 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COURSE_T_in_iteration_stmt350 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_iteration_stmt354 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_IN_T_in_iteration_stmt356 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_iteration_stmt360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_iteration_stmt362 = new BitSet(new long[]{0x4404B710D88CAC40L,0x0000000000000002L});
    public static final BitSet FOLLOW_line_in_iteration_stmt364 = new BitSet(new long[]{0x4404B710D88CAC40L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_iteration_stmt367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_T_in_jump_stmt406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_expr_in_expr417 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_OR_in_expr420 = new BitSet(new long[]{0x4004121048040000L});
    public static final BitSet FOLLOW_and_expr_in_expr423 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_equiv_expr_in_and_expr438 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_and_expr441 = new BitSet(new long[]{0x4004121048040000L});
    public static final BitSet FOLLOW_equiv_expr_in_and_expr444 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rel_expr_in_equiv_expr457 = new BitSet(new long[]{0x0000000400200002L});
    public static final BitSet FOLLOW_EQ_in_equiv_expr462 = new BitSet(new long[]{0x4004121048040000L});
    public static final BitSet FOLLOW_NEQ_in_equiv_expr467 = new BitSet(new long[]{0x4004121048040000L});
    public static final BitSet FOLLOW_rel_expr_in_equiv_expr471 = new BitSet(new long[]{0x0000000400200002L});
    public static final BitSet FOLLOW_math_expr_in_rel_expr485 = new BitSet(new long[]{0x2800000202000002L});
    public static final BitSet FOLLOW_59_in_rel_expr490 = new BitSet(new long[]{0x0004121048040000L});
    public static final BitSet FOLLOW_61_in_rel_expr495 = new BitSet(new long[]{0x0004121048040000L});
    public static final BitSet FOLLOW_GEQ_in_rel_expr500 = new BitSet(new long[]{0x0004121048040000L});
    public static final BitSet FOLLOW_LEQ_in_rel_expr505 = new BitSet(new long[]{0x0004121048040000L});
    public static final BitSet FOLLOW_math_expr_in_rel_expr509 = new BitSet(new long[]{0x2800000202000002L});
    public static final BitSet FOLLOW_datetime_in_rel_expr517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_math_term_in_math_expr528 = new BitSet(new long[]{0x00A0000000000002L});
    public static final BitSet FOLLOW_53_in_math_expr533 = new BitSet(new long[]{0x0004121048040000L});
    public static final BitSet FOLLOW_55_in_math_expr538 = new BitSet(new long[]{0x0004121048040000L});
    public static final BitSet FOLLOW_math_term_in_math_expr542 = new BitSet(new long[]{0x00A0000000000002L});
    public static final BitSet FOLLOW_unary_expr_in_math_term556 = new BitSet(new long[]{0x0210000000000002L});
    public static final BitSet FOLLOW_52_in_math_term561 = new BitSet(new long[]{0x0004121048040000L});
    public static final BitSet FOLLOW_57_in_math_term566 = new BitSet(new long[]{0x0004121048040000L});
    public static final BitSet FOLLOW_unary_expr_in_math_term570 = new BitSet(new long[]{0x0210000000000002L});
    public static final BitSet FOLLOW_timeblock_in_math_term578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_expr_in_unary_expr588 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_unary_expr591 = new BitSet(new long[]{0x0004120048040000L});
    public static final BitSet FOLLOW_postfix_expr_in_unary_expr594 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary_expr601 = new BitSet(new long[]{0x0004120048040000L});
    public static final BitSet FOLLOW_postfix_expr_in_unary_expr604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_postfix_expr615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_in_postfix_expr620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function630 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_function632 = new BitSet(new long[]{0x400C121048040000L});
    public static final BitSet FOLLOW_argument_expr_list_in_function634 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_function637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayblock_in_datetime663 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_timeblock_in_datetime665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_timeblock692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_timeblock694 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_TIME_in_timeblock698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_dayblock721 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DAY_in_dayblock723 = new BitSet(new long[]{0x8040000000000000L});
    public static final BitSet FOLLOW_54_in_dayblock727 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DAY_in_dayblock729 = new BitSet(new long[]{0x8040000000000000L});
    public static final BitSet FOLLOW_63_in_dayblock734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primary_expr753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_primary_expr758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primary_expr763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primary_expr769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_primary_expr774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_primary_expr779 = new BitSet(new long[]{0x4004121048040000L});
    public static final BitSet FOLLOW_expr_in_primary_expr780 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_primary_expr781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_argument_expr_list796 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_argument_expr_list800 = new BitSet(new long[]{0x4004121048040000L});
    public static final BitSet FOLLOW_expr_in_argument_expr_list802 = new BitSet(new long[]{0x0040000000000002L});

}