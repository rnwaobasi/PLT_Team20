// $ANTLR 3.4 Chronos.g 2012-05-09 09:16:57

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
            // elements: ID, type_specifier
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
            // elements: expr, ID, 60
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
    // Chronos.g:50:1: selection_stmt : IF_T expr '{' ( line )* '}' ( else_stmt )? -> ^( COND expr ^( THEN ( line )* ) ( else_stmt )? ) ;
    public final ChronosParser.selection_stmt_return selection_stmt() throws RecognitionException {
        ChronosParser.selection_stmt_return retval = new ChronosParser.selection_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IF_T23=null;
        Token char_literal25=null;
        Token char_literal27=null;
        ChronosParser.expr_return expr24 =null;

        ChronosParser.line_return line26 =null;

        ChronosParser.else_stmt_return else_stmt28 =null;


        CommonTree IF_T23_tree=null;
        CommonTree char_literal25_tree=null;
        CommonTree char_literal27_tree=null;
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_IF_T=new RewriteRuleTokenStream(adaptor,"token IF_T");
        RewriteRuleSubtreeStream stream_else_stmt=new RewriteRuleSubtreeStream(adaptor,"rule else_stmt");
        RewriteRuleSubtreeStream stream_line=new RewriteRuleSubtreeStream(adaptor,"rule line");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Chronos.g:52:2: ( IF_T expr '{' ( line )* '}' ( else_stmt )? -> ^( COND expr ^( THEN ( line )* ) ( else_stmt )? ) )
            // Chronos.g:52:4: IF_T expr '{' ( line )* '}' ( else_stmt )?
            {
            IF_T23=(Token)match(input,IF_T,FOLLOW_IF_T_in_selection_stmt235);  
            stream_IF_T.add(IF_T23);


            pushFollow(FOLLOW_expr_in_selection_stmt237);
            expr24=expr();

            state._fsp--;

            stream_expr.add(expr24.getTree());

            char_literal25=(Token)match(input,64,FOLLOW_64_in_selection_stmt239);  
            stream_64.add(char_literal25);


            // Chronos.g:52:18: ( line )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==BREAK_T||(LA5_0 >= COURSELIST_T && LA5_0 <= COURSE_T)||LA5_0==DATETIME_T||LA5_0==DAYBLOCK_T||(LA5_0 >= DOUBLE && LA5_0 <= DOUBLE_T)||LA5_0==FOREACH_T||(LA5_0 >= ID && LA5_0 <= IF_T)||(LA5_0 >= INT && LA5_0 <= INT_T)||LA5_0==NOT||(LA5_0 >= SCHEDULE_T && LA5_0 <= STRING_T)||(LA5_0 >= TIME && LA5_0 <= TIMEBLOCK_T)||LA5_0==TIME_T||LA5_0==50||LA5_0==58||LA5_0==62) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Chronos.g:52:18: line
            	    {
            	    pushFollow(FOLLOW_line_in_selection_stmt241);
            	    line26=line();

            	    state._fsp--;

            	    stream_line.add(line26.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            char_literal27=(Token)match(input,65,FOLLOW_65_in_selection_stmt244);  
            stream_65.add(char_literal27);


            // Chronos.g:52:28: ( else_stmt )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ELSE_T) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Chronos.g:52:28: else_stmt
                    {
                    pushFollow(FOLLOW_else_stmt_in_selection_stmt246);
                    else_stmt28=else_stmt();

                    state._fsp--;

                    stream_else_stmt.add(else_stmt28.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: else_stmt, expr, line
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 52:39: -> ^( COND expr ^( THEN ( line )* ) ( else_stmt )? )
            {
                // Chronos.g:52:42: ^( COND expr ^( THEN ( line )* ) ( else_stmt )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COND, "COND")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                // Chronos.g:52:55: ^( THEN ( line )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(THEN, "THEN")
                , root_2);

                // Chronos.g:52:62: ( line )*
                while ( stream_line.hasNext() ) {
                    adaptor.addChild(root_2, stream_line.nextTree());

                }
                stream_line.reset();

                adaptor.addChild(root_1, root_2);
                }

                // Chronos.g:52:69: ( else_stmt )?
                if ( stream_else_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_else_stmt.nextTree());

                }
                stream_else_stmt.reset();

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


    public static class else_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "else_stmt"
    // Chronos.g:58:1: else_stmt : ELSE_T '{' (b= line )* '}' -> ^( ELSE_T ( $b)* ) ;
    public final ChronosParser.else_stmt_return else_stmt() throws RecognitionException {
        ChronosParser.else_stmt_return retval = new ChronosParser.else_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ELSE_T29=null;
        Token char_literal30=null;
        Token char_literal31=null;
        ChronosParser.line_return b =null;


        CommonTree ELSE_T29_tree=null;
        CommonTree char_literal30_tree=null;
        CommonTree char_literal31_tree=null;
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_ELSE_T=new RewriteRuleTokenStream(adaptor,"token ELSE_T");
        RewriteRuleSubtreeStream stream_line=new RewriteRuleSubtreeStream(adaptor,"rule line");
        try {
            // Chronos.g:59:2: ( ELSE_T '{' (b= line )* '}' -> ^( ELSE_T ( $b)* ) )
            // Chronos.g:59:4: ELSE_T '{' (b= line )* '}'
            {
            ELSE_T29=(Token)match(input,ELSE_T,FOLLOW_ELSE_T_in_else_stmt282);  
            stream_ELSE_T.add(ELSE_T29);


            char_literal30=(Token)match(input,64,FOLLOW_64_in_else_stmt284);  
            stream_64.add(char_literal30);


            // Chronos.g:59:15: (b= line )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==BREAK_T||(LA7_0 >= COURSELIST_T && LA7_0 <= COURSE_T)||LA7_0==DATETIME_T||LA7_0==DAYBLOCK_T||(LA7_0 >= DOUBLE && LA7_0 <= DOUBLE_T)||LA7_0==FOREACH_T||(LA7_0 >= ID && LA7_0 <= IF_T)||(LA7_0 >= INT && LA7_0 <= INT_T)||LA7_0==NOT||(LA7_0 >= SCHEDULE_T && LA7_0 <= STRING_T)||(LA7_0 >= TIME && LA7_0 <= TIMEBLOCK_T)||LA7_0==TIME_T||LA7_0==50||LA7_0==58||LA7_0==62) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Chronos.g:59:16: b= line
            	    {
            	    pushFollow(FOLLOW_line_in_else_stmt289);
            	    b=line();

            	    state._fsp--;

            	    stream_line.add(b.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            char_literal31=(Token)match(input,65,FOLLOW_65_in_else_stmt293);  
            stream_65.add(char_literal31);


            // AST REWRITE
            // elements: ELSE_T, b
            // token labels: 
            // rule labels: retval, b
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 59:29: -> ^( ELSE_T ( $b)* )
            {
                // Chronos.g:59:32: ^( ELSE_T ( $b)* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_ELSE_T.nextNode()
                , root_1);

                // Chronos.g:59:42: ( $b)*
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
    // Chronos.g:61:1: iteration_stmt : FOREACH_T COURSE_T element= ID IN_T list= ID '{' ( line )* '}' -> ^( FOREACH_T ^( IN_T $element $list) ^( BLOCK ( line )* ) ) ;
    public final ChronosParser.iteration_stmt_return iteration_stmt() throws RecognitionException {
        ChronosParser.iteration_stmt_return retval = new ChronosParser.iteration_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token element=null;
        Token list=null;
        Token FOREACH_T32=null;
        Token COURSE_T33=null;
        Token IN_T34=null;
        Token char_literal35=null;
        Token char_literal37=null;
        ChronosParser.line_return line36 =null;


        CommonTree element_tree=null;
        CommonTree list_tree=null;
        CommonTree FOREACH_T32_tree=null;
        CommonTree COURSE_T33_tree=null;
        CommonTree IN_T34_tree=null;
        CommonTree char_literal35_tree=null;
        CommonTree char_literal37_tree=null;
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_COURSE_T=new RewriteRuleTokenStream(adaptor,"token COURSE_T");
        RewriteRuleTokenStream stream_FOREACH_T=new RewriteRuleTokenStream(adaptor,"token FOREACH_T");
        RewriteRuleTokenStream stream_IN_T=new RewriteRuleTokenStream(adaptor,"token IN_T");
        RewriteRuleSubtreeStream stream_line=new RewriteRuleSubtreeStream(adaptor,"rule line");
        try {
            // Chronos.g:63:2: ( FOREACH_T COURSE_T element= ID IN_T list= ID '{' ( line )* '}' -> ^( FOREACH_T ^( IN_T $element $list) ^( BLOCK ( line )* ) ) )
            // Chronos.g:63:4: FOREACH_T COURSE_T element= ID IN_T list= ID '{' ( line )* '}'
            {
            FOREACH_T32=(Token)match(input,FOREACH_T,FOLLOW_FOREACH_T_in_iteration_stmt314);  
            stream_FOREACH_T.add(FOREACH_T32);


            COURSE_T33=(Token)match(input,COURSE_T,FOLLOW_COURSE_T_in_iteration_stmt316);  
            stream_COURSE_T.add(COURSE_T33);


            element=(Token)match(input,ID,FOLLOW_ID_in_iteration_stmt320);  
            stream_ID.add(element);


            IN_T34=(Token)match(input,IN_T,FOLLOW_IN_T_in_iteration_stmt322);  
            stream_IN_T.add(IN_T34);


            list=(Token)match(input,ID,FOLLOW_ID_in_iteration_stmt326);  
            stream_ID.add(list);


            char_literal35=(Token)match(input,64,FOLLOW_64_in_iteration_stmt328);  
            stream_64.add(char_literal35);


            // Chronos.g:63:51: ( line )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==BREAK_T||(LA8_0 >= COURSELIST_T && LA8_0 <= COURSE_T)||LA8_0==DATETIME_T||LA8_0==DAYBLOCK_T||(LA8_0 >= DOUBLE && LA8_0 <= DOUBLE_T)||LA8_0==FOREACH_T||(LA8_0 >= ID && LA8_0 <= IF_T)||(LA8_0 >= INT && LA8_0 <= INT_T)||LA8_0==NOT||(LA8_0 >= SCHEDULE_T && LA8_0 <= STRING_T)||(LA8_0 >= TIME && LA8_0 <= TIMEBLOCK_T)||LA8_0==TIME_T||LA8_0==50||LA8_0==58||LA8_0==62) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Chronos.g:63:51: line
            	    {
            	    pushFollow(FOLLOW_line_in_iteration_stmt330);
            	    line36=line();

            	    state._fsp--;

            	    stream_line.add(line36.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            char_literal37=(Token)match(input,65,FOLLOW_65_in_iteration_stmt333);  
            stream_65.add(char_literal37);


            // AST REWRITE
            // elements: line, IN_T, FOREACH_T, element, list
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
            // 64:4: -> ^( FOREACH_T ^( IN_T $element $list) ^( BLOCK ( line )* ) )
            {
                // Chronos.g:64:7: ^( FOREACH_T ^( IN_T $element $list) ^( BLOCK ( line )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_FOREACH_T.nextNode()
                , root_1);

                // Chronos.g:64:19: ^( IN_T $element $list)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_IN_T.nextNode()
                , root_2);

                adaptor.addChild(root_2, stream_element.nextNode());

                adaptor.addChild(root_2, stream_list.nextNode());

                adaptor.addChild(root_1, root_2);
                }

                // Chronos.g:64:42: ^( BLOCK ( line )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(BLOCK, "BLOCK")
                , root_2);

                // Chronos.g:64:50: ( line )*
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
    // Chronos.g:66:1: jump_stmt : BREAK_T ;
    public final ChronosParser.jump_stmt_return jump_stmt() throws RecognitionException {
        ChronosParser.jump_stmt_return retval = new ChronosParser.jump_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BREAK_T38=null;

        CommonTree BREAK_T38_tree=null;

        try {
            // Chronos.g:68:2: ( BREAK_T )
            // Chronos.g:68:4: BREAK_T
            {
            root_0 = (CommonTree)adaptor.nil();


            BREAK_T38=(Token)match(input,BREAK_T,FOLLOW_BREAK_T_in_jump_stmt372); 
            BREAK_T38_tree = 
            (CommonTree)adaptor.create(BREAK_T38)
            ;
            adaptor.addChild(root_0, BREAK_T38_tree);


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
    // Chronos.g:70:1: expr : and_expr ( OR ^ and_expr )* ;
    public final ChronosParser.expr_return expr() throws RecognitionException {
        ChronosParser.expr_return retval = new ChronosParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token OR40=null;
        ChronosParser.and_expr_return and_expr39 =null;

        ChronosParser.and_expr_return and_expr41 =null;


        CommonTree OR40_tree=null;

        try {
            // Chronos.g:72:2: ( and_expr ( OR ^ and_expr )* )
            // Chronos.g:72:4: and_expr ( OR ^ and_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_and_expr_in_expr383);
            and_expr39=and_expr();

            state._fsp--;

            adaptor.addChild(root_0, and_expr39.getTree());

            // Chronos.g:72:13: ( OR ^ and_expr )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==OR) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Chronos.g:72:14: OR ^ and_expr
            	    {
            	    OR40=(Token)match(input,OR,FOLLOW_OR_in_expr386); 
            	    OR40_tree = 
            	    (CommonTree)adaptor.create(OR40)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(OR40_tree, root_0);


            	    pushFollow(FOLLOW_and_expr_in_expr389);
            	    and_expr41=and_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, and_expr41.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // Chronos.g:75:1: and_expr : equiv_expr ( AND ^ equiv_expr )* ;
    public final ChronosParser.and_expr_return and_expr() throws RecognitionException {
        ChronosParser.and_expr_return retval = new ChronosParser.and_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AND43=null;
        ChronosParser.equiv_expr_return equiv_expr42 =null;

        ChronosParser.equiv_expr_return equiv_expr44 =null;


        CommonTree AND43_tree=null;

        try {
            // Chronos.g:77:2: ( equiv_expr ( AND ^ equiv_expr )* )
            // Chronos.g:77:4: equiv_expr ( AND ^ equiv_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_equiv_expr_in_and_expr404);
            equiv_expr42=equiv_expr();

            state._fsp--;

            adaptor.addChild(root_0, equiv_expr42.getTree());

            // Chronos.g:77:15: ( AND ^ equiv_expr )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==AND) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Chronos.g:77:16: AND ^ equiv_expr
            	    {
            	    AND43=(Token)match(input,AND,FOLLOW_AND_in_and_expr407); 
            	    AND43_tree = 
            	    (CommonTree)adaptor.create(AND43)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(AND43_tree, root_0);


            	    pushFollow(FOLLOW_equiv_expr_in_and_expr410);
            	    equiv_expr44=equiv_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, equiv_expr44.getTree());

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
    // $ANTLR end "and_expr"


    public static class equiv_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equiv_expr"
    // Chronos.g:79:1: equiv_expr : rel_expr ( ( EQ ^| NEQ ^) rel_expr )* ;
    public final ChronosParser.equiv_expr_return equiv_expr() throws RecognitionException {
        ChronosParser.equiv_expr_return retval = new ChronosParser.equiv_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQ46=null;
        Token NEQ47=null;
        ChronosParser.rel_expr_return rel_expr45 =null;

        ChronosParser.rel_expr_return rel_expr48 =null;


        CommonTree EQ46_tree=null;
        CommonTree NEQ47_tree=null;

        try {
            // Chronos.g:81:2: ( rel_expr ( ( EQ ^| NEQ ^) rel_expr )* )
            // Chronos.g:81:4: rel_expr ( ( EQ ^| NEQ ^) rel_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_rel_expr_in_equiv_expr423);
            rel_expr45=rel_expr();

            state._fsp--;

            adaptor.addChild(root_0, rel_expr45.getTree());

            // Chronos.g:81:13: ( ( EQ ^| NEQ ^) rel_expr )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==EQ||LA12_0==NEQ) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Chronos.g:81:15: ( EQ ^| NEQ ^) rel_expr
            	    {
            	    // Chronos.g:81:15: ( EQ ^| NEQ ^)
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==EQ) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==NEQ) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // Chronos.g:81:16: EQ ^
            	            {
            	            EQ46=(Token)match(input,EQ,FOLLOW_EQ_in_equiv_expr428); 
            	            EQ46_tree = 
            	            (CommonTree)adaptor.create(EQ46)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(EQ46_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // Chronos.g:81:22: NEQ ^
            	            {
            	            NEQ47=(Token)match(input,NEQ,FOLLOW_NEQ_in_equiv_expr433); 
            	            NEQ47_tree = 
            	            (CommonTree)adaptor.create(NEQ47)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(NEQ47_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_rel_expr_in_equiv_expr437);
            	    rel_expr48=rel_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, rel_expr48.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // Chronos.g:83:1: rel_expr : ( math_expr ( ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr )* | datetime );
    public final ChronosParser.rel_expr_return rel_expr() throws RecognitionException {
        ChronosParser.rel_expr_return retval = new ChronosParser.rel_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal50=null;
        Token char_literal51=null;
        Token GEQ52=null;
        Token LEQ53=null;
        ChronosParser.math_expr_return math_expr49 =null;

        ChronosParser.math_expr_return math_expr54 =null;

        ChronosParser.datetime_return datetime55 =null;


        CommonTree char_literal50_tree=null;
        CommonTree char_literal51_tree=null;
        CommonTree GEQ52_tree=null;
        CommonTree LEQ53_tree=null;

        try {
            // Chronos.g:85:2: ( math_expr ( ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr )* | datetime )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==DOUBLE||LA15_0==ID||LA15_0==INT||LA15_0==NOT||LA15_0==STRING||LA15_0==TIME||LA15_0==50) ) {
                alt15=1;
            }
            else if ( (LA15_0==62) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // Chronos.g:85:4: math_expr ( ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_math_expr_in_rel_expr451);
                    math_expr49=math_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, math_expr49.getTree());

                    // Chronos.g:85:14: ( ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==GEQ||LA14_0==LEQ||LA14_0==59||LA14_0==61) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // Chronos.g:85:16: ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr
                    	    {
                    	    // Chronos.g:85:16: ( '<' ^| '>' ^| GEQ ^| LEQ ^)
                    	    int alt13=4;
                    	    switch ( input.LA(1) ) {
                    	    case 59:
                    	        {
                    	        alt13=1;
                    	        }
                    	        break;
                    	    case 61:
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
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 13, 0, input);

                    	        throw nvae;

                    	    }

                    	    switch (alt13) {
                    	        case 1 :
                    	            // Chronos.g:85:17: '<' ^
                    	            {
                    	            char_literal50=(Token)match(input,59,FOLLOW_59_in_rel_expr456); 
                    	            char_literal50_tree = 
                    	            (CommonTree)adaptor.create(char_literal50)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal50_tree, root_0);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // Chronos.g:85:24: '>' ^
                    	            {
                    	            char_literal51=(Token)match(input,61,FOLLOW_61_in_rel_expr461); 
                    	            char_literal51_tree = 
                    	            (CommonTree)adaptor.create(char_literal51)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal51_tree, root_0);


                    	            }
                    	            break;
                    	        case 3 :
                    	            // Chronos.g:85:31: GEQ ^
                    	            {
                    	            GEQ52=(Token)match(input,GEQ,FOLLOW_GEQ_in_rel_expr466); 
                    	            GEQ52_tree = 
                    	            (CommonTree)adaptor.create(GEQ52)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(GEQ52_tree, root_0);


                    	            }
                    	            break;
                    	        case 4 :
                    	            // Chronos.g:85:38: LEQ ^
                    	            {
                    	            LEQ53=(Token)match(input,LEQ,FOLLOW_LEQ_in_rel_expr471); 
                    	            LEQ53_tree = 
                    	            (CommonTree)adaptor.create(LEQ53)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(LEQ53_tree, root_0);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_math_expr_in_rel_expr475);
                    	    math_expr54=math_expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, math_expr54.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Chronos.g:86:4: datetime
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_datetime_in_rel_expr483);
                    datetime55=datetime();

                    state._fsp--;

                    adaptor.addChild(root_0, datetime55.getTree());

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
    // Chronos.g:88:1: math_expr : math_term ( ( '+' ^| '-' ^) math_term )* ;
    public final ChronosParser.math_expr_return math_expr() throws RecognitionException {
        ChronosParser.math_expr_return retval = new ChronosParser.math_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal57=null;
        Token char_literal58=null;
        ChronosParser.math_term_return math_term56 =null;

        ChronosParser.math_term_return math_term59 =null;


        CommonTree char_literal57_tree=null;
        CommonTree char_literal58_tree=null;

        try {
            // Chronos.g:90:2: ( math_term ( ( '+' ^| '-' ^) math_term )* )
            // Chronos.g:90:4: math_term ( ( '+' ^| '-' ^) math_term )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_math_term_in_math_expr494);
            math_term56=math_term();

            state._fsp--;

            adaptor.addChild(root_0, math_term56.getTree());

            // Chronos.g:90:14: ( ( '+' ^| '-' ^) math_term )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==53||LA17_0==55) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // Chronos.g:90:16: ( '+' ^| '-' ^) math_term
            	    {
            	    // Chronos.g:90:16: ( '+' ^| '-' ^)
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==53) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==55) ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // Chronos.g:90:17: '+' ^
            	            {
            	            char_literal57=(Token)match(input,53,FOLLOW_53_in_math_expr499); 
            	            char_literal57_tree = 
            	            (CommonTree)adaptor.create(char_literal57)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal57_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // Chronos.g:90:24: '-' ^
            	            {
            	            char_literal58=(Token)match(input,55,FOLLOW_55_in_math_expr504); 
            	            char_literal58_tree = 
            	            (CommonTree)adaptor.create(char_literal58)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal58_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_math_term_in_math_expr508);
            	    math_term59=math_term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, math_term59.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // Chronos.g:92:1: math_term : ( unary_expr ( ( '*' ^| '/' ^) unary_expr )* | timeblock );
    public final ChronosParser.math_term_return math_term() throws RecognitionException {
        ChronosParser.math_term_return retval = new ChronosParser.math_term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal61=null;
        Token char_literal62=null;
        ChronosParser.unary_expr_return unary_expr60 =null;

        ChronosParser.unary_expr_return unary_expr63 =null;

        ChronosParser.timeblock_return timeblock64 =null;


        CommonTree char_literal61_tree=null;
        CommonTree char_literal62_tree=null;

        try {
            // Chronos.g:94:2: ( unary_expr ( ( '*' ^| '/' ^) unary_expr )* | timeblock )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==DOUBLE||LA20_0==ID||LA20_0==INT||LA20_0==NOT||LA20_0==STRING||LA20_0==50) ) {
                alt20=1;
            }
            else if ( (LA20_0==TIME) ) {
                int LA20_2 = input.LA(2);

                if ( (LA20_2==66) ) {
                    alt20=2;
                }
                else if ( (LA20_2==AND||LA20_2==EQ||LA20_2==GEQ||(LA20_2 >= LEQ && LA20_2 <= NEQ)||LA20_2==OR||(LA20_2 >= 51 && LA20_2 <= 61)||LA20_2==64) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // Chronos.g:94:4: unary_expr ( ( '*' ^| '/' ^) unary_expr )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_unary_expr_in_math_term522);
                    unary_expr60=unary_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, unary_expr60.getTree());

                    // Chronos.g:94:15: ( ( '*' ^| '/' ^) unary_expr )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==52||LA19_0==57) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // Chronos.g:94:17: ( '*' ^| '/' ^) unary_expr
                    	    {
                    	    // Chronos.g:94:17: ( '*' ^| '/' ^)
                    	    int alt18=2;
                    	    int LA18_0 = input.LA(1);

                    	    if ( (LA18_0==52) ) {
                    	        alt18=1;
                    	    }
                    	    else if ( (LA18_0==57) ) {
                    	        alt18=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 18, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt18) {
                    	        case 1 :
                    	            // Chronos.g:94:18: '*' ^
                    	            {
                    	            char_literal61=(Token)match(input,52,FOLLOW_52_in_math_term527); 
                    	            char_literal61_tree = 
                    	            (CommonTree)adaptor.create(char_literal61)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal61_tree, root_0);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // Chronos.g:94:25: '/' ^
                    	            {
                    	            char_literal62=(Token)match(input,57,FOLLOW_57_in_math_term532); 
                    	            char_literal62_tree = 
                    	            (CommonTree)adaptor.create(char_literal62)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal62_tree, root_0);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_unary_expr_in_math_term536);
                    	    unary_expr63=unary_expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, unary_expr63.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Chronos.g:95:4: timeblock
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_timeblock_in_math_term544);
                    timeblock64=timeblock();

                    state._fsp--;

                    adaptor.addChild(root_0, timeblock64.getTree());

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
    // Chronos.g:97:1: unary_expr : ( postfix_expr ( '.' ^ postfix_expr )* | NOT ^ postfix_expr );
    public final ChronosParser.unary_expr_return unary_expr() throws RecognitionException {
        ChronosParser.unary_expr_return retval = new ChronosParser.unary_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal66=null;
        Token NOT68=null;
        ChronosParser.postfix_expr_return postfix_expr65 =null;

        ChronosParser.postfix_expr_return postfix_expr67 =null;

        ChronosParser.postfix_expr_return postfix_expr69 =null;


        CommonTree char_literal66_tree=null;
        CommonTree NOT68_tree=null;

        try {
            // Chronos.g:98:2: ( postfix_expr ( '.' ^ postfix_expr )* | NOT ^ postfix_expr )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==DOUBLE||LA22_0==ID||LA22_0==INT||LA22_0==STRING||LA22_0==TIME||LA22_0==50) ) {
                alt22=1;
            }
            else if ( (LA22_0==NOT) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // Chronos.g:98:4: postfix_expr ( '.' ^ postfix_expr )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_postfix_expr_in_unary_expr554);
                    postfix_expr65=postfix_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, postfix_expr65.getTree());

                    // Chronos.g:98:17: ( '.' ^ postfix_expr )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==56) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // Chronos.g:98:18: '.' ^ postfix_expr
                    	    {
                    	    char_literal66=(Token)match(input,56,FOLLOW_56_in_unary_expr557); 
                    	    char_literal66_tree = 
                    	    (CommonTree)adaptor.create(char_literal66)
                    	    ;
                    	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal66_tree, root_0);


                    	    pushFollow(FOLLOW_postfix_expr_in_unary_expr560);
                    	    postfix_expr67=postfix_expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, postfix_expr67.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Chronos.g:99:4: NOT ^ postfix_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    NOT68=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expr567); 
                    NOT68_tree = 
                    (CommonTree)adaptor.create(NOT68)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(NOT68_tree, root_0);


                    pushFollow(FOLLOW_postfix_expr_in_unary_expr570);
                    postfix_expr69=postfix_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, postfix_expr69.getTree());

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
    // Chronos.g:101:1: postfix_expr : ( function | primary_expr );
    public final ChronosParser.postfix_expr_return postfix_expr() throws RecognitionException {
        ChronosParser.postfix_expr_return retval = new ChronosParser.postfix_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        ChronosParser.function_return function70 =null;

        ChronosParser.primary_expr_return primary_expr71 =null;



        try {
            // Chronos.g:103:2: ( function | primary_expr )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==50) ) {
                    alt23=1;
                }
                else if ( (LA23_1==AND||LA23_1==EQ||LA23_1==GEQ||(LA23_1 >= LEQ && LA23_1 <= NEQ)||LA23_1==OR||(LA23_1 >= 51 && LA23_1 <= 61)||LA23_1==64) ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA23_0==DOUBLE||LA23_0==INT||LA23_0==STRING||LA23_0==TIME||LA23_0==50) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // Chronos.g:103:4: function
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_function_in_postfix_expr581);
                    function70=function();

                    state._fsp--;

                    adaptor.addChild(root_0, function70.getTree());

                    }
                    break;
                case 2 :
                    // Chronos.g:104:4: primary_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_primary_expr_in_postfix_expr586);
                    primary_expr71=primary_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, primary_expr71.getTree());

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
    // Chronos.g:106:1: function : ID '(' ( argument_expr_list )? ')' -> ^( ID ^( PARAMS ( argument_expr_list )? ) ) ;
    public final ChronosParser.function_return function() throws RecognitionException {
        ChronosParser.function_return retval = new ChronosParser.function_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID72=null;
        Token char_literal73=null;
        Token char_literal75=null;
        ChronosParser.argument_expr_list_return argument_expr_list74 =null;


        CommonTree ID72_tree=null;
        CommonTree char_literal73_tree=null;
        CommonTree char_literal75_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_argument_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule argument_expr_list");
        try {
            // Chronos.g:107:2: ( ID '(' ( argument_expr_list )? ')' -> ^( ID ^( PARAMS ( argument_expr_list )? ) ) )
            // Chronos.g:107:4: ID '(' ( argument_expr_list )? ')'
            {
            ID72=(Token)match(input,ID,FOLLOW_ID_in_function596);  
            stream_ID.add(ID72);


            char_literal73=(Token)match(input,50,FOLLOW_50_in_function598);  
            stream_50.add(char_literal73);


            // Chronos.g:107:11: ( argument_expr_list )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==DOUBLE||LA24_0==ID||LA24_0==INT||LA24_0==NOT||LA24_0==STRING||LA24_0==TIME||LA24_0==50||LA24_0==62) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // Chronos.g:107:11: argument_expr_list
                    {
                    pushFollow(FOLLOW_argument_expr_list_in_function600);
                    argument_expr_list74=argument_expr_list();

                    state._fsp--;

                    stream_argument_expr_list.add(argument_expr_list74.getTree());

                    }
                    break;

            }


            char_literal75=(Token)match(input,51,FOLLOW_51_in_function603);  
            stream_51.add(char_literal75);


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
            // 108:3: -> ^( ID ^( PARAMS ( argument_expr_list )? ) )
            {
                // Chronos.g:108:6: ^( ID ^( PARAMS ( argument_expr_list )? ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_ID.nextNode()
                , root_1);

                // Chronos.g:108:11: ^( PARAMS ( argument_expr_list )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PARAMS, "PARAMS")
                , root_2);

                // Chronos.g:108:20: ( argument_expr_list )?
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
    // Chronos.g:110:1: datetime : dayblock timeblock -> ^( DATETIME dayblock timeblock ) ;
    public final ChronosParser.datetime_return datetime() throws RecognitionException {
        ChronosParser.datetime_return retval = new ChronosParser.datetime_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        ChronosParser.dayblock_return dayblock76 =null;

        ChronosParser.timeblock_return timeblock77 =null;


        RewriteRuleSubtreeStream stream_timeblock=new RewriteRuleSubtreeStream(adaptor,"rule timeblock");
        RewriteRuleSubtreeStream stream_dayblock=new RewriteRuleSubtreeStream(adaptor,"rule dayblock");
        try {
            // Chronos.g:112:2: ( dayblock timeblock -> ^( DATETIME dayblock timeblock ) )
            // Chronos.g:112:4: dayblock timeblock
            {
            pushFollow(FOLLOW_dayblock_in_datetime629);
            dayblock76=dayblock();

            state._fsp--;

            stream_dayblock.add(dayblock76.getTree());

            pushFollow(FOLLOW_timeblock_in_datetime631);
            timeblock77=timeblock();

            state._fsp--;

            stream_timeblock.add(timeblock77.getTree());

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
            // 113:4: -> ^( DATETIME dayblock timeblock )
            {
                // Chronos.g:113:7: ^( DATETIME dayblock timeblock )
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
    // Chronos.g:115:1: timeblock : a= TIME '~' b= TIME -> ^( TIMES $a $b) ;
    public final ChronosParser.timeblock_return timeblock() throws RecognitionException {
        ChronosParser.timeblock_return retval = new ChronosParser.timeblock_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token a=null;
        Token b=null;
        Token char_literal78=null;

        CommonTree a_tree=null;
        CommonTree b_tree=null;
        CommonTree char_literal78_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_TIME=new RewriteRuleTokenStream(adaptor,"token TIME");

        try {
            // Chronos.g:117:2: (a= TIME '~' b= TIME -> ^( TIMES $a $b) )
            // Chronos.g:117:4: a= TIME '~' b= TIME
            {
            a=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock658);  
            stream_TIME.add(a);


            char_literal78=(Token)match(input,66,FOLLOW_66_in_timeblock660);  
            stream_66.add(char_literal78);


            b=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock664);  
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
            // 117:22: -> ^( TIMES $a $b)
            {
                // Chronos.g:117:25: ^( TIMES $a $b)
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
    // Chronos.g:119:1: dayblock : '[' DAY ( ',' DAY )* ']' -> ^( DAYS ( DAY )+ ) ;
    public final ChronosParser.dayblock_return dayblock() throws RecognitionException {
        ChronosParser.dayblock_return retval = new ChronosParser.dayblock_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal79=null;
        Token DAY80=null;
        Token char_literal81=null;
        Token DAY82=null;
        Token char_literal83=null;

        CommonTree char_literal79_tree=null;
        CommonTree DAY80_tree=null;
        CommonTree char_literal81_tree=null;
        CommonTree DAY82_tree=null;
        CommonTree char_literal83_tree=null;
        RewriteRuleTokenStream stream_DAY=new RewriteRuleTokenStream(adaptor,"token DAY");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");

        try {
            // Chronos.g:121:2: ( '[' DAY ( ',' DAY )* ']' -> ^( DAYS ( DAY )+ ) )
            // Chronos.g:121:4: '[' DAY ( ',' DAY )* ']'
            {
            char_literal79=(Token)match(input,62,FOLLOW_62_in_dayblock687);  
            stream_62.add(char_literal79);


            DAY80=(Token)match(input,DAY,FOLLOW_DAY_in_dayblock689);  
            stream_DAY.add(DAY80);


            // Chronos.g:121:12: ( ',' DAY )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==54) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // Chronos.g:121:14: ',' DAY
            	    {
            	    char_literal81=(Token)match(input,54,FOLLOW_54_in_dayblock693);  
            	    stream_54.add(char_literal81);


            	    DAY82=(Token)match(input,DAY,FOLLOW_DAY_in_dayblock695);  
            	    stream_DAY.add(DAY82);


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            char_literal83=(Token)match(input,63,FOLLOW_63_in_dayblock700);  
            stream_63.add(char_literal83);


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
            // 121:29: -> ^( DAYS ( DAY )+ )
            {
                // Chronos.g:121:32: ^( DAYS ( DAY )+ )
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
    // Chronos.g:123:1: primary_expr : ( INT | DOUBLE | ID | STRING | TIME | '(' expr ')' -> expr );
    public final ChronosParser.primary_expr_return primary_expr() throws RecognitionException {
        ChronosParser.primary_expr_return retval = new ChronosParser.primary_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INT84=null;
        Token DOUBLE85=null;
        Token ID86=null;
        Token STRING87=null;
        Token TIME88=null;
        Token char_literal89=null;
        Token char_literal91=null;
        ChronosParser.expr_return expr90 =null;


        CommonTree INT84_tree=null;
        CommonTree DOUBLE85_tree=null;
        CommonTree ID86_tree=null;
        CommonTree STRING87_tree=null;
        CommonTree TIME88_tree=null;
        CommonTree char_literal89_tree=null;
        CommonTree char_literal91_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Chronos.g:124:2: ( INT | DOUBLE | ID | STRING | TIME | '(' expr ')' -> expr )
            int alt26=6;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt26=1;
                }
                break;
            case DOUBLE:
                {
                alt26=2;
                }
                break;
            case ID:
                {
                alt26=3;
                }
                break;
            case STRING:
                {
                alt26=4;
                }
                break;
            case TIME:
                {
                alt26=5;
                }
                break;
            case 50:
                {
                alt26=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // Chronos.g:124:4: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INT84=(Token)match(input,INT,FOLLOW_INT_in_primary_expr719); 
                    INT84_tree = 
                    (CommonTree)adaptor.create(INT84)
                    ;
                    adaptor.addChild(root_0, INT84_tree);


                    }
                    break;
                case 2 :
                    // Chronos.g:125:4: DOUBLE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    DOUBLE85=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_primary_expr724); 
                    DOUBLE85_tree = 
                    (CommonTree)adaptor.create(DOUBLE85)
                    ;
                    adaptor.addChild(root_0, DOUBLE85_tree);


                    }
                    break;
                case 3 :
                    // Chronos.g:126:4: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ID86=(Token)match(input,ID,FOLLOW_ID_in_primary_expr729); 
                    ID86_tree = 
                    (CommonTree)adaptor.create(ID86)
                    ;
                    adaptor.addChild(root_0, ID86_tree);


                    }
                    break;
                case 4 :
                    // Chronos.g:127:4: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    STRING87=(Token)match(input,STRING,FOLLOW_STRING_in_primary_expr735); 
                    STRING87_tree = 
                    (CommonTree)adaptor.create(STRING87)
                    ;
                    adaptor.addChild(root_0, STRING87_tree);


                    }
                    break;
                case 5 :
                    // Chronos.g:128:4: TIME
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    TIME88=(Token)match(input,TIME,FOLLOW_TIME_in_primary_expr740); 
                    TIME88_tree = 
                    (CommonTree)adaptor.create(TIME88)
                    ;
                    adaptor.addChild(root_0, TIME88_tree);


                    }
                    break;
                case 6 :
                    // Chronos.g:129:4: '(' expr ')'
                    {
                    char_literal89=(Token)match(input,50,FOLLOW_50_in_primary_expr745);  
                    stream_50.add(char_literal89);


                    pushFollow(FOLLOW_expr_in_primary_expr746);
                    expr90=expr();

                    state._fsp--;

                    stream_expr.add(expr90.getTree());

                    char_literal91=(Token)match(input,51,FOLLOW_51_in_primary_expr747);  
                    stream_51.add(char_literal91);


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
                    // 129:15: -> expr
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
    // Chronos.g:131:1: argument_expr_list : ( expr ) ( ',' expr )* -> ( expr )+ ;
    public final ChronosParser.argument_expr_list_return argument_expr_list() throws RecognitionException {
        ChronosParser.argument_expr_list_return retval = new ChronosParser.argument_expr_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal93=null;
        ChronosParser.expr_return expr92 =null;

        ChronosParser.expr_return expr94 =null;


        CommonTree char_literal93_tree=null;
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Chronos.g:132:2: ( ( expr ) ( ',' expr )* -> ( expr )+ )
            // Chronos.g:132:4: ( expr ) ( ',' expr )*
            {
            // Chronos.g:132:4: ( expr )
            // Chronos.g:132:5: expr
            {
            pushFollow(FOLLOW_expr_in_argument_expr_list762);
            expr92=expr();

            state._fsp--;

            stream_expr.add(expr92.getTree());

            }


            // Chronos.g:132:11: ( ',' expr )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==54) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // Chronos.g:132:12: ',' expr
            	    {
            	    char_literal93=(Token)match(input,54,FOLLOW_54_in_argument_expr_list766);  
            	    stream_54.add(char_literal93);


            	    pushFollow(FOLLOW_expr_in_argument_expr_list768);
            	    expr94=expr();

            	    state._fsp--;

            	    stream_expr.add(expr94.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
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
            // 132:23: -> ( expr )+
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
    // Chronos.g:134:1: type_specifier : ( INT_T | DOUBLE_T | DAYBLOCK_T | TIME_T | STRING_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T );
    public final ChronosParser.type_specifier_return type_specifier() throws RecognitionException {
        ChronosParser.type_specifier_return retval = new ChronosParser.type_specifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set95=null;

        CommonTree set95_tree=null;

        try {
            // Chronos.g:135:2: ( INT_T | DOUBLE_T | DAYBLOCK_T | TIME_T | STRING_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T )
            // Chronos.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set95=(Token)input.LT(1);

            if ( (input.LA(1) >= COURSELIST_T && input.LA(1) <= COURSE_T)||input.LA(1)==DATETIME_T||input.LA(1)==DAYBLOCK_T||input.LA(1)==DOUBLE_T||input.LA(1)==INT_T||input.LA(1)==SCHEDULE_T||input.LA(1)==STRING_T||input.LA(1)==TIMEBLOCK_T||input.LA(1)==TIME_T ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set95)
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
    public static final BitSet FOLLOW_IF_T_in_selection_stmt235 = new BitSet(new long[]{0x4004121048040000L});
    public static final BitSet FOLLOW_expr_in_selection_stmt237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_selection_stmt239 = new BitSet(new long[]{0x4404B710D88CAC40L,0x0000000000000002L});
    public static final BitSet FOLLOW_line_in_selection_stmt241 = new BitSet(new long[]{0x4404B710D88CAC40L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_selection_stmt244 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_else_stmt_in_selection_stmt246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_T_in_else_stmt282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_else_stmt284 = new BitSet(new long[]{0x4404B710D88CAC40L,0x0000000000000002L});
    public static final BitSet FOLLOW_line_in_else_stmt289 = new BitSet(new long[]{0x4404B710D88CAC40L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_else_stmt293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREACH_T_in_iteration_stmt314 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COURSE_T_in_iteration_stmt316 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_iteration_stmt320 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_IN_T_in_iteration_stmt322 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_iteration_stmt326 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_iteration_stmt328 = new BitSet(new long[]{0x4404B710D88CAC40L,0x0000000000000002L});
    public static final BitSet FOLLOW_line_in_iteration_stmt330 = new BitSet(new long[]{0x4404B710D88CAC40L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_iteration_stmt333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_T_in_jump_stmt372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_expr_in_expr383 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_OR_in_expr386 = new BitSet(new long[]{0x4004121048040000L});
    public static final BitSet FOLLOW_and_expr_in_expr389 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_equiv_expr_in_and_expr404 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_and_expr407 = new BitSet(new long[]{0x4004121048040000L});
    public static final BitSet FOLLOW_equiv_expr_in_and_expr410 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rel_expr_in_equiv_expr423 = new BitSet(new long[]{0x0000000400200002L});
    public static final BitSet FOLLOW_EQ_in_equiv_expr428 = new BitSet(new long[]{0x4004121048040000L});
    public static final BitSet FOLLOW_NEQ_in_equiv_expr433 = new BitSet(new long[]{0x4004121048040000L});
    public static final BitSet FOLLOW_rel_expr_in_equiv_expr437 = new BitSet(new long[]{0x0000000400200002L});
    public static final BitSet FOLLOW_math_expr_in_rel_expr451 = new BitSet(new long[]{0x2800000202000002L});
    public static final BitSet FOLLOW_59_in_rel_expr456 = new BitSet(new long[]{0x0004121048040000L});
    public static final BitSet FOLLOW_61_in_rel_expr461 = new BitSet(new long[]{0x0004121048040000L});
    public static final BitSet FOLLOW_GEQ_in_rel_expr466 = new BitSet(new long[]{0x0004121048040000L});
    public static final BitSet FOLLOW_LEQ_in_rel_expr471 = new BitSet(new long[]{0x0004121048040000L});
    public static final BitSet FOLLOW_math_expr_in_rel_expr475 = new BitSet(new long[]{0x2800000202000002L});
    public static final BitSet FOLLOW_datetime_in_rel_expr483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_math_term_in_math_expr494 = new BitSet(new long[]{0x00A0000000000002L});
    public static final BitSet FOLLOW_53_in_math_expr499 = new BitSet(new long[]{0x0004121048040000L});
    public static final BitSet FOLLOW_55_in_math_expr504 = new BitSet(new long[]{0x0004121048040000L});
    public static final BitSet FOLLOW_math_term_in_math_expr508 = new BitSet(new long[]{0x00A0000000000002L});
    public static final BitSet FOLLOW_unary_expr_in_math_term522 = new BitSet(new long[]{0x0210000000000002L});
    public static final BitSet FOLLOW_52_in_math_term527 = new BitSet(new long[]{0x0004121048040000L});
    public static final BitSet FOLLOW_57_in_math_term532 = new BitSet(new long[]{0x0004121048040000L});
    public static final BitSet FOLLOW_unary_expr_in_math_term536 = new BitSet(new long[]{0x0210000000000002L});
    public static final BitSet FOLLOW_timeblock_in_math_term544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_expr_in_unary_expr554 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_unary_expr557 = new BitSet(new long[]{0x0004120048040000L});
    public static final BitSet FOLLOW_postfix_expr_in_unary_expr560 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary_expr567 = new BitSet(new long[]{0x0004120048040000L});
    public static final BitSet FOLLOW_postfix_expr_in_unary_expr570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_postfix_expr581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_in_postfix_expr586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function596 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_function598 = new BitSet(new long[]{0x400C121048040000L});
    public static final BitSet FOLLOW_argument_expr_list_in_function600 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_function603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayblock_in_datetime629 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_timeblock_in_datetime631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_timeblock658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_timeblock660 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_TIME_in_timeblock664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_dayblock687 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DAY_in_dayblock689 = new BitSet(new long[]{0x8040000000000000L});
    public static final BitSet FOLLOW_54_in_dayblock693 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DAY_in_dayblock695 = new BitSet(new long[]{0x8040000000000000L});
    public static final BitSet FOLLOW_63_in_dayblock700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primary_expr719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_primary_expr724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primary_expr729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primary_expr735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_primary_expr740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_primary_expr745 = new BitSet(new long[]{0x4004121048040000L});
    public static final BitSet FOLLOW_expr_in_primary_expr746 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_primary_expr747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_argument_expr_list762 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_argument_expr_list766 = new BitSet(new long[]{0x4004121048040000L});
    public static final BitSet FOLLOW_expr_in_argument_expr_list768 = new BitSet(new long[]{0x0040000000000002L});

}