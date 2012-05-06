// $ANTLR 3.4 src/grammar/Chronos.g 2012-05-06 11:14:30

	package chronos.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ChronosParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "BLOCK", "BREAK_T", "CHAR", "COMMENT", "COND", "COURSELIST_T", "COURSE_T", "DATETIME", "DATETIME_T", "DAY", "DAYBLOCK_T", "DAYS", "DECL", "DOUBLE", "DOUBLE_T", "ELSE_T", "EQ", "ESC_SEQ", "FOREACH_T", "FUNC", "GEQ", "HEX_DIGIT", "ID", "IF_T", "INST", "INT", "INT_T", "IN_T", "LEQ", "NEQ", "NEW_T", "NOT", "OCTAL_ESC", "OR", "PARAMS", "PRINT_T", "SCHEDULE_T", "STRING", "STRING_T", "TIME", "TIMEBLOCK_T", "TIMES", "TIME_T", "UNICODE_ESC", "WS", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "';'", "'<'", "'='", "'>'", "'['", "']'", "'{'", "'}'", "'~'"
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
    public static final int PRINT_T=40;
    public static final int SCHEDULE_T=41;
    public static final int STRING=42;
    public static final int STRING_T=43;
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
    public String getGrammarFileName() { return "src/grammar/Chronos.g"; }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // src/grammar/Chronos.g:32:1: program : ( line )+ EOF !;
    public final ChronosParser.program_return program() throws RecognitionException {
        ChronosParser.program_return retval = new ChronosParser.program_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF2=null;
        ChronosParser.line_return line1 =null;


        CommonTree EOF2_tree=null;

        try {
            // src/grammar/Chronos.g:33:2: ( ( line )+ EOF !)
            // src/grammar/Chronos.g:33:4: ( line )+ EOF !
            {
            root_0 = (CommonTree)adaptor.nil();


            // src/grammar/Chronos.g:33:4: ( line )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==BREAK_T||(LA1_0 >= COURSELIST_T && LA1_0 <= COURSE_T)||LA1_0==DATETIME_T||LA1_0==DAYBLOCK_T||(LA1_0 >= DOUBLE && LA1_0 <= DOUBLE_T)||LA1_0==FOREACH_T||(LA1_0 >= ID && LA1_0 <= IF_T)||(LA1_0 >= INT && LA1_0 <= INT_T)||LA1_0==NOT||(LA1_0 >= PRINT_T && LA1_0 <= TIMEBLOCK_T)||LA1_0==TIME_T||LA1_0==50||LA1_0==58||LA1_0==62) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // src/grammar/Chronos.g:33:4: line
            	    {
            	    pushFollow(FOLLOW_line_in_program103);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program106); 

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
    // src/grammar/Chronos.g:35:1: line : ( declarator ';' !| instantiator | stmt );
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
            // src/grammar/Chronos.g:36:2: ( declarator ';' !| instantiator | stmt )
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
            else if ( (LA2_0==BREAK_T||LA2_0==DOUBLE||LA2_0==FOREACH_T||(LA2_0 >= ID && LA2_0 <= IF_T)||LA2_0==INT||LA2_0==NOT||LA2_0==PRINT_T||LA2_0==STRING||LA2_0==TIME||LA2_0==50||LA2_0==58||LA2_0==62) ) {
                alt2=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // src/grammar/Chronos.g:36:4: declarator ';' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_declarator_in_line117);
                    declarator3=declarator();

                    state._fsp--;

                    adaptor.addChild(root_0, declarator3.getTree());

                    char_literal4=(Token)match(input,58,FOLLOW_58_in_line119); 

                    }
                    break;
                case 2 :
                    // src/grammar/Chronos.g:37:4: instantiator
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_instantiator_in_line125);
                    instantiator5=instantiator();

                    state._fsp--;

                    adaptor.addChild(root_0, instantiator5.getTree());

                    }
                    break;
                case 3 :
                    // src/grammar/Chronos.g:38:4: stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_stmt_in_line130);
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
    // src/grammar/Chronos.g:40:1: declarator : type_specifier ID -> ^( DECL type_specifier ID ) ;
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
            // src/grammar/Chronos.g:42:2: ( type_specifier ID -> ^( DECL type_specifier ID ) )
            // src/grammar/Chronos.g:42:4: type_specifier ID
            {
            pushFollow(FOLLOW_type_specifier_in_declarator141);
            type_specifier7=type_specifier();

            state._fsp--;

            stream_type_specifier.add(type_specifier7.getTree());

            ID8=(Token)match(input,ID,FOLLOW_ID_in_declarator143);  
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
            // 43:4: -> ^( DECL type_specifier ID )
            {
                // src/grammar/Chronos.g:43:7: ^( DECL type_specifier ID )
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
    // src/grammar/Chronos.g:45:1: instantiator : type_specifier ID '=' expr ';' -> ^( INST ^( DECL type_specifier ID ) ^( '=' ID expr ) ) ;
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
            // src/grammar/Chronos.g:47:2: ( type_specifier ID '=' expr ';' -> ^( INST ^( DECL type_specifier ID ) ^( '=' ID expr ) ) )
            // src/grammar/Chronos.g:47:4: type_specifier ID '=' expr ';'
            {
            pushFollow(FOLLOW_type_specifier_in_instantiator167);
            type_specifier9=type_specifier();

            state._fsp--;

            stream_type_specifier.add(type_specifier9.getTree());

            ID10=(Token)match(input,ID,FOLLOW_ID_in_instantiator169);  
            stream_ID.add(ID10);


            char_literal11=(Token)match(input,60,FOLLOW_60_in_instantiator171);  
            stream_60.add(char_literal11);


            pushFollow(FOLLOW_expr_in_instantiator173);
            expr12=expr();

            state._fsp--;

            stream_expr.add(expr12.getTree());

            char_literal13=(Token)match(input,58,FOLLOW_58_in_instantiator175);  
            stream_58.add(char_literal13);


            // AST REWRITE
            // elements: ID, expr, ID, 60, type_specifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 48:4: -> ^( INST ^( DECL type_specifier ID ) ^( '=' ID expr ) )
            {
                // src/grammar/Chronos.g:48:7: ^( INST ^( DECL type_specifier ID ) ^( '=' ID expr ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(INST, "INST")
                , root_1);

                // src/grammar/Chronos.g:48:14: ^( DECL type_specifier ID )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DECL, "DECL")
                , root_2);

                adaptor.addChild(root_2, stream_type_specifier.nextTree());

                adaptor.addChild(root_2, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, root_2);
                }

                // src/grammar/Chronos.g:48:40: ^( '=' ID expr )
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
    // src/grammar/Chronos.g:50:1: stmt : ( expr ( '=' ^ expr )? ';' | selection_stmt | iteration_stmt | jump_stmt ';' -> jump_stmt | ';' !);
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
            // src/grammar/Chronos.g:50:5: ( expr ( '=' ^ expr )? ';' | selection_stmt | iteration_stmt | jump_stmt ';' -> jump_stmt | ';' !)
            int alt4=5;
            switch ( input.LA(1) ) {
            case DOUBLE:
            case ID:
            case INT:
            case NOT:
            case PRINT_T:
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
                    // src/grammar/Chronos.g:50:7: expr ( '=' ^ expr )? ';'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_stmt208);
                    expr14=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr14.getTree());

                    // src/grammar/Chronos.g:50:12: ( '=' ^ expr )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==60) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // src/grammar/Chronos.g:50:13: '=' ^ expr
                            {
                            char_literal15=(Token)match(input,60,FOLLOW_60_in_stmt211); 
                            char_literal15_tree = 
                            (CommonTree)adaptor.create(char_literal15)
                            ;
                            root_0 = (CommonTree)adaptor.becomeRoot(char_literal15_tree, root_0);


                            pushFollow(FOLLOW_expr_in_stmt214);
                            expr16=expr();

                            state._fsp--;

                            adaptor.addChild(root_0, expr16.getTree());

                            }
                            break;

                    }


                    char_literal17=(Token)match(input,58,FOLLOW_58_in_stmt217); 
                    char_literal17_tree = 
                    (CommonTree)adaptor.create(char_literal17)
                    ;
                    adaptor.addChild(root_0, char_literal17_tree);


                    }
                    break;
                case 2 :
                    // src/grammar/Chronos.g:51:4: selection_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_selection_stmt_in_stmt222);
                    selection_stmt18=selection_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, selection_stmt18.getTree());

                    }
                    break;
                case 3 :
                    // src/grammar/Chronos.g:52:4: iteration_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_iteration_stmt_in_stmt227);
                    iteration_stmt19=iteration_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, iteration_stmt19.getTree());

                    }
                    break;
                case 4 :
                    // src/grammar/Chronos.g:53:4: jump_stmt ';'
                    {
                    pushFollow(FOLLOW_jump_stmt_in_stmt232);
                    jump_stmt20=jump_stmt();

                    state._fsp--;

                    stream_jump_stmt.add(jump_stmt20.getTree());

                    char_literal21=(Token)match(input,58,FOLLOW_58_in_stmt233);  
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
                    // 53:17: -> jump_stmt
                    {
                        adaptor.addChild(root_0, stream_jump_stmt.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // src/grammar/Chronos.g:54:4: ';' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal22=(Token)match(input,58,FOLLOW_58_in_stmt242); 

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
    // src/grammar/Chronos.g:56:1: selection_stmt : IF_T expr '{' (a= line )* '}' ( ELSE_T '{' (b= line )* '}' )? -> ^( COND ^( IF_T expr ( $a)* ) ( ^( ELSE_T ( $b)* ) )? ) ;
    public final ChronosParser.selection_stmt_return selection_stmt() throws RecognitionException {
        ChronosParser.selection_stmt_return retval = new ChronosParser.selection_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IF_T23=null;
        Token char_literal25=null;
        Token char_literal26=null;
        Token ELSE_T27=null;
        Token char_literal28=null;
        Token char_literal29=null;
        ChronosParser.line_return a =null;

        ChronosParser.line_return b =null;

        ChronosParser.expr_return expr24 =null;


        CommonTree IF_T23_tree=null;
        CommonTree char_literal25_tree=null;
        CommonTree char_literal26_tree=null;
        CommonTree ELSE_T27_tree=null;
        CommonTree char_literal28_tree=null;
        CommonTree char_literal29_tree=null;
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_IF_T=new RewriteRuleTokenStream(adaptor,"token IF_T");
        RewriteRuleTokenStream stream_ELSE_T=new RewriteRuleTokenStream(adaptor,"token ELSE_T");
        RewriteRuleSubtreeStream stream_line=new RewriteRuleSubtreeStream(adaptor,"rule line");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // src/grammar/Chronos.g:58:2: ( IF_T expr '{' (a= line )* '}' ( ELSE_T '{' (b= line )* '}' )? -> ^( COND ^( IF_T expr ( $a)* ) ( ^( ELSE_T ( $b)* ) )? ) )
            // src/grammar/Chronos.g:58:4: IF_T expr '{' (a= line )* '}' ( ELSE_T '{' (b= line )* '}' )?
            {
            IF_T23=(Token)match(input,IF_T,FOLLOW_IF_T_in_selection_stmt254);  
            stream_IF_T.add(IF_T23);


            pushFollow(FOLLOW_expr_in_selection_stmt256);
            expr24=expr();

            state._fsp--;

            stream_expr.add(expr24.getTree());

            char_literal25=(Token)match(input,64,FOLLOW_64_in_selection_stmt258);  
            stream_64.add(char_literal25);


            // src/grammar/Chronos.g:58:17: (a= line )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==BREAK_T||(LA5_0 >= COURSELIST_T && LA5_0 <= COURSE_T)||LA5_0==DATETIME_T||LA5_0==DAYBLOCK_T||(LA5_0 >= DOUBLE && LA5_0 <= DOUBLE_T)||LA5_0==FOREACH_T||(LA5_0 >= ID && LA5_0 <= IF_T)||(LA5_0 >= INT && LA5_0 <= INT_T)||LA5_0==NOT||(LA5_0 >= PRINT_T && LA5_0 <= TIMEBLOCK_T)||LA5_0==TIME_T||LA5_0==50||LA5_0==58||LA5_0==62) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // src/grammar/Chronos.g:58:18: a= line
            	    {
            	    pushFollow(FOLLOW_line_in_selection_stmt262);
            	    a=line();

            	    state._fsp--;

            	    stream_line.add(a.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            char_literal26=(Token)match(input,65,FOLLOW_65_in_selection_stmt266);  
            stream_65.add(char_literal26);


            // src/grammar/Chronos.g:58:31: ( ELSE_T '{' (b= line )* '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ELSE_T) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // src/grammar/Chronos.g:58:32: ELSE_T '{' (b= line )* '}'
                    {
                    ELSE_T27=(Token)match(input,ELSE_T,FOLLOW_ELSE_T_in_selection_stmt269);  
                    stream_ELSE_T.add(ELSE_T27);


                    char_literal28=(Token)match(input,64,FOLLOW_64_in_selection_stmt271);  
                    stream_64.add(char_literal28);


                    // src/grammar/Chronos.g:58:43: (b= line )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==BREAK_T||(LA6_0 >= COURSELIST_T && LA6_0 <= COURSE_T)||LA6_0==DATETIME_T||LA6_0==DAYBLOCK_T||(LA6_0 >= DOUBLE && LA6_0 <= DOUBLE_T)||LA6_0==FOREACH_T||(LA6_0 >= ID && LA6_0 <= IF_T)||(LA6_0 >= INT && LA6_0 <= INT_T)||LA6_0==NOT||(LA6_0 >= PRINT_T && LA6_0 <= TIMEBLOCK_T)||LA6_0==TIME_T||LA6_0==50||LA6_0==58||LA6_0==62) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // src/grammar/Chronos.g:58:44: b= line
                    	    {
                    	    pushFollow(FOLLOW_line_in_selection_stmt276);
                    	    b=line();

                    	    state._fsp--;

                    	    stream_line.add(b.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    char_literal29=(Token)match(input,65,FOLLOW_65_in_selection_stmt280);  
                    stream_65.add(char_literal29);


                    }
                    break;

            }


            // AST REWRITE
            // elements: b, ELSE_T, expr, a, IF_T
            // token labels: 
            // rule labels: retval, b, a
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 59:4: -> ^( COND ^( IF_T expr ( $a)* ) ( ^( ELSE_T ( $b)* ) )? )
            {
                // src/grammar/Chronos.g:59:7: ^( COND ^( IF_T expr ( $a)* ) ( ^( ELSE_T ( $b)* ) )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COND, "COND")
                , root_1);

                // src/grammar/Chronos.g:59:14: ^( IF_T expr ( $a)* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_IF_T.nextNode()
                , root_2);

                adaptor.addChild(root_2, stream_expr.nextTree());

                // src/grammar/Chronos.g:59:27: ( $a)*
                while ( stream_a.hasNext() ) {
                    adaptor.addChild(root_2, stream_a.nextTree());

                }
                stream_a.reset();

                adaptor.addChild(root_1, root_2);
                }

                // src/grammar/Chronos.g:59:31: ( ^( ELSE_T ( $b)* ) )?
                if ( stream_b.hasNext()||stream_ELSE_T.hasNext() ) {
                    // src/grammar/Chronos.g:59:31: ^( ELSE_T ( $b)* )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot(
                    stream_ELSE_T.nextNode()
                    , root_2);

                    // src/grammar/Chronos.g:59:41: ( $b)*
                    while ( stream_b.hasNext() ) {
                        adaptor.addChild(root_2, stream_b.nextTree());

                    }
                    stream_b.reset();

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


    public static class iteration_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "iteration_stmt"
    // src/grammar/Chronos.g:61:1: iteration_stmt : FOREACH_T COURSE_T element= ID IN_T list= ID '{' ( line )* '}' -> ^( FOREACH_T ^( IN_T $element $list) ^( BLOCK ( line )* ) ) ;
    public final ChronosParser.iteration_stmt_return iteration_stmt() throws RecognitionException {
        ChronosParser.iteration_stmt_return retval = new ChronosParser.iteration_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token element=null;
        Token list=null;
        Token FOREACH_T30=null;
        Token COURSE_T31=null;
        Token IN_T32=null;
        Token char_literal33=null;
        Token char_literal35=null;
        ChronosParser.line_return line34 =null;


        CommonTree element_tree=null;
        CommonTree list_tree=null;
        CommonTree FOREACH_T30_tree=null;
        CommonTree COURSE_T31_tree=null;
        CommonTree IN_T32_tree=null;
        CommonTree char_literal33_tree=null;
        CommonTree char_literal35_tree=null;
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_COURSE_T=new RewriteRuleTokenStream(adaptor,"token COURSE_T");
        RewriteRuleTokenStream stream_FOREACH_T=new RewriteRuleTokenStream(adaptor,"token FOREACH_T");
        RewriteRuleTokenStream stream_IN_T=new RewriteRuleTokenStream(adaptor,"token IN_T");
        RewriteRuleSubtreeStream stream_line=new RewriteRuleSubtreeStream(adaptor,"rule line");
        try {
            // src/grammar/Chronos.g:63:2: ( FOREACH_T COURSE_T element= ID IN_T list= ID '{' ( line )* '}' -> ^( FOREACH_T ^( IN_T $element $list) ^( BLOCK ( line )* ) ) )
            // src/grammar/Chronos.g:63:4: FOREACH_T COURSE_T element= ID IN_T list= ID '{' ( line )* '}'
            {
            FOREACH_T30=(Token)match(input,FOREACH_T,FOLLOW_FOREACH_T_in_iteration_stmt322);  
            stream_FOREACH_T.add(FOREACH_T30);


            COURSE_T31=(Token)match(input,COURSE_T,FOLLOW_COURSE_T_in_iteration_stmt324);  
            stream_COURSE_T.add(COURSE_T31);


            element=(Token)match(input,ID,FOLLOW_ID_in_iteration_stmt328);  
            stream_ID.add(element);


            IN_T32=(Token)match(input,IN_T,FOLLOW_IN_T_in_iteration_stmt330);  
            stream_IN_T.add(IN_T32);


            list=(Token)match(input,ID,FOLLOW_ID_in_iteration_stmt334);  
            stream_ID.add(list);


            char_literal33=(Token)match(input,64,FOLLOW_64_in_iteration_stmt336);  
            stream_64.add(char_literal33);


            // src/grammar/Chronos.g:63:51: ( line )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==BREAK_T||(LA8_0 >= COURSELIST_T && LA8_0 <= COURSE_T)||LA8_0==DATETIME_T||LA8_0==DAYBLOCK_T||(LA8_0 >= DOUBLE && LA8_0 <= DOUBLE_T)||LA8_0==FOREACH_T||(LA8_0 >= ID && LA8_0 <= IF_T)||(LA8_0 >= INT && LA8_0 <= INT_T)||LA8_0==NOT||(LA8_0 >= PRINT_T && LA8_0 <= TIMEBLOCK_T)||LA8_0==TIME_T||LA8_0==50||LA8_0==58||LA8_0==62) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // src/grammar/Chronos.g:63:51: line
            	    {
            	    pushFollow(FOLLOW_line_in_iteration_stmt338);
            	    line34=line();

            	    state._fsp--;

            	    stream_line.add(line34.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            char_literal35=(Token)match(input,65,FOLLOW_65_in_iteration_stmt341);  
            stream_65.add(char_literal35);


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
            // 64:4: -> ^( FOREACH_T ^( IN_T $element $list) ^( BLOCK ( line )* ) )
            {
                // src/grammar/Chronos.g:64:7: ^( FOREACH_T ^( IN_T $element $list) ^( BLOCK ( line )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_FOREACH_T.nextNode()
                , root_1);

                // src/grammar/Chronos.g:64:19: ^( IN_T $element $list)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_IN_T.nextNode()
                , root_2);

                adaptor.addChild(root_2, stream_element.nextNode());

                adaptor.addChild(root_2, stream_list.nextNode());

                adaptor.addChild(root_1, root_2);
                }

                // src/grammar/Chronos.g:64:42: ^( BLOCK ( line )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(BLOCK, "BLOCK")
                , root_2);

                // src/grammar/Chronos.g:64:50: ( line )*
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
    // src/grammar/Chronos.g:66:1: jump_stmt : BREAK_T ;
    public final ChronosParser.jump_stmt_return jump_stmt() throws RecognitionException {
        ChronosParser.jump_stmt_return retval = new ChronosParser.jump_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BREAK_T36=null;

        CommonTree BREAK_T36_tree=null;

        try {
            // src/grammar/Chronos.g:68:2: ( BREAK_T )
            // src/grammar/Chronos.g:68:4: BREAK_T
            {
            root_0 = (CommonTree)adaptor.nil();


            BREAK_T36=(Token)match(input,BREAK_T,FOLLOW_BREAK_T_in_jump_stmt380); 
            BREAK_T36_tree = 
            (CommonTree)adaptor.create(BREAK_T36)
            ;
            adaptor.addChild(root_0, BREAK_T36_tree);


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
    // src/grammar/Chronos.g:70:1: expr : and_expr ( OR ^ and_expr )* ;
    public final ChronosParser.expr_return expr() throws RecognitionException {
        ChronosParser.expr_return retval = new ChronosParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token OR38=null;
        ChronosParser.and_expr_return and_expr37 =null;

        ChronosParser.and_expr_return and_expr39 =null;


        CommonTree OR38_tree=null;

        try {
            // src/grammar/Chronos.g:72:2: ( and_expr ( OR ^ and_expr )* )
            // src/grammar/Chronos.g:72:4: and_expr ( OR ^ and_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_and_expr_in_expr391);
            and_expr37=and_expr();

            state._fsp--;

            adaptor.addChild(root_0, and_expr37.getTree());

            // src/grammar/Chronos.g:72:13: ( OR ^ and_expr )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==OR) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // src/grammar/Chronos.g:72:14: OR ^ and_expr
            	    {
            	    OR38=(Token)match(input,OR,FOLLOW_OR_in_expr394); 
            	    OR38_tree = 
            	    (CommonTree)adaptor.create(OR38)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(OR38_tree, root_0);


            	    pushFollow(FOLLOW_and_expr_in_expr397);
            	    and_expr39=and_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, and_expr39.getTree());

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
    // src/grammar/Chronos.g:79:1: and_expr : equiv_expr ( AND ^ equiv_expr )* ;
    public final ChronosParser.and_expr_return and_expr() throws RecognitionException {
        ChronosParser.and_expr_return retval = new ChronosParser.and_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AND41=null;
        ChronosParser.equiv_expr_return equiv_expr40 =null;

        ChronosParser.equiv_expr_return equiv_expr42 =null;


        CommonTree AND41_tree=null;

        try {
            // src/grammar/Chronos.g:81:2: ( equiv_expr ( AND ^ equiv_expr )* )
            // src/grammar/Chronos.g:81:4: equiv_expr ( AND ^ equiv_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_equiv_expr_in_and_expr414);
            equiv_expr40=equiv_expr();

            state._fsp--;

            adaptor.addChild(root_0, equiv_expr40.getTree());

            // src/grammar/Chronos.g:81:15: ( AND ^ equiv_expr )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==AND) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // src/grammar/Chronos.g:81:16: AND ^ equiv_expr
            	    {
            	    AND41=(Token)match(input,AND,FOLLOW_AND_in_and_expr417); 
            	    AND41_tree = 
            	    (CommonTree)adaptor.create(AND41)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(AND41_tree, root_0);


            	    pushFollow(FOLLOW_equiv_expr_in_and_expr420);
            	    equiv_expr42=equiv_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, equiv_expr42.getTree());

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
    // src/grammar/Chronos.g:83:1: equiv_expr : rel_expr ( ( EQ ^| NEQ ^) rel_expr )* ;
    public final ChronosParser.equiv_expr_return equiv_expr() throws RecognitionException {
        ChronosParser.equiv_expr_return retval = new ChronosParser.equiv_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQ44=null;
        Token NEQ45=null;
        ChronosParser.rel_expr_return rel_expr43 =null;

        ChronosParser.rel_expr_return rel_expr46 =null;


        CommonTree EQ44_tree=null;
        CommonTree NEQ45_tree=null;

        try {
            // src/grammar/Chronos.g:85:2: ( rel_expr ( ( EQ ^| NEQ ^) rel_expr )* )
            // src/grammar/Chronos.g:85:4: rel_expr ( ( EQ ^| NEQ ^) rel_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_rel_expr_in_equiv_expr433);
            rel_expr43=rel_expr();

            state._fsp--;

            adaptor.addChild(root_0, rel_expr43.getTree());

            // src/grammar/Chronos.g:85:13: ( ( EQ ^| NEQ ^) rel_expr )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==EQ||LA12_0==NEQ) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // src/grammar/Chronos.g:85:15: ( EQ ^| NEQ ^) rel_expr
            	    {
            	    // src/grammar/Chronos.g:85:15: ( EQ ^| NEQ ^)
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
            	            // src/grammar/Chronos.g:85:16: EQ ^
            	            {
            	            EQ44=(Token)match(input,EQ,FOLLOW_EQ_in_equiv_expr438); 
            	            EQ44_tree = 
            	            (CommonTree)adaptor.create(EQ44)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(EQ44_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/grammar/Chronos.g:85:22: NEQ ^
            	            {
            	            NEQ45=(Token)match(input,NEQ,FOLLOW_NEQ_in_equiv_expr443); 
            	            NEQ45_tree = 
            	            (CommonTree)adaptor.create(NEQ45)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(NEQ45_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_rel_expr_in_equiv_expr447);
            	    rel_expr46=rel_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, rel_expr46.getTree());

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
    // src/grammar/Chronos.g:87:1: rel_expr : ( math_expr ( ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr )* | datetime );
    public final ChronosParser.rel_expr_return rel_expr() throws RecognitionException {
        ChronosParser.rel_expr_return retval = new ChronosParser.rel_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal48=null;
        Token char_literal49=null;
        Token GEQ50=null;
        Token LEQ51=null;
        ChronosParser.math_expr_return math_expr47 =null;

        ChronosParser.math_expr_return math_expr52 =null;

        ChronosParser.datetime_return datetime53 =null;


        CommonTree char_literal48_tree=null;
        CommonTree char_literal49_tree=null;
        CommonTree GEQ50_tree=null;
        CommonTree LEQ51_tree=null;

        try {
            // src/grammar/Chronos.g:89:2: ( math_expr ( ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr )* | datetime )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==DOUBLE||LA15_0==ID||LA15_0==INT||LA15_0==NOT||LA15_0==PRINT_T||LA15_0==STRING||LA15_0==TIME||LA15_0==50) ) {
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
                    // src/grammar/Chronos.g:89:4: math_expr ( ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_math_expr_in_rel_expr461);
                    math_expr47=math_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, math_expr47.getTree());

                    // src/grammar/Chronos.g:89:14: ( ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==GEQ||LA14_0==LEQ||LA14_0==59||LA14_0==61) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // src/grammar/Chronos.g:89:16: ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr
                    	    {
                    	    // src/grammar/Chronos.g:89:16: ( '<' ^| '>' ^| GEQ ^| LEQ ^)
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
                    	            // src/grammar/Chronos.g:89:17: '<' ^
                    	            {
                    	            char_literal48=(Token)match(input,59,FOLLOW_59_in_rel_expr466); 
                    	            char_literal48_tree = 
                    	            (CommonTree)adaptor.create(char_literal48)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal48_tree, root_0);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // src/grammar/Chronos.g:89:24: '>' ^
                    	            {
                    	            char_literal49=(Token)match(input,61,FOLLOW_61_in_rel_expr471); 
                    	            char_literal49_tree = 
                    	            (CommonTree)adaptor.create(char_literal49)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal49_tree, root_0);


                    	            }
                    	            break;
                    	        case 3 :
                    	            // src/grammar/Chronos.g:89:31: GEQ ^
                    	            {
                    	            GEQ50=(Token)match(input,GEQ,FOLLOW_GEQ_in_rel_expr476); 
                    	            GEQ50_tree = 
                    	            (CommonTree)adaptor.create(GEQ50)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(GEQ50_tree, root_0);


                    	            }
                    	            break;
                    	        case 4 :
                    	            // src/grammar/Chronos.g:89:38: LEQ ^
                    	            {
                    	            LEQ51=(Token)match(input,LEQ,FOLLOW_LEQ_in_rel_expr481); 
                    	            LEQ51_tree = 
                    	            (CommonTree)adaptor.create(LEQ51)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(LEQ51_tree, root_0);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_math_expr_in_rel_expr485);
                    	    math_expr52=math_expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, math_expr52.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // src/grammar/Chronos.g:90:4: datetime
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_datetime_in_rel_expr493);
                    datetime53=datetime();

                    state._fsp--;

                    adaptor.addChild(root_0, datetime53.getTree());

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
    // src/grammar/Chronos.g:92:1: math_expr : math_term ( ( '+' ^| '-' ^) math_term )* ;
    public final ChronosParser.math_expr_return math_expr() throws RecognitionException {
        ChronosParser.math_expr_return retval = new ChronosParser.math_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal55=null;
        Token char_literal56=null;
        ChronosParser.math_term_return math_term54 =null;

        ChronosParser.math_term_return math_term57 =null;


        CommonTree char_literal55_tree=null;
        CommonTree char_literal56_tree=null;

        try {
            // src/grammar/Chronos.g:94:2: ( math_term ( ( '+' ^| '-' ^) math_term )* )
            // src/grammar/Chronos.g:94:4: math_term ( ( '+' ^| '-' ^) math_term )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_math_term_in_math_expr504);
            math_term54=math_term();

            state._fsp--;

            adaptor.addChild(root_0, math_term54.getTree());

            // src/grammar/Chronos.g:94:14: ( ( '+' ^| '-' ^) math_term )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==53||LA17_0==55) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // src/grammar/Chronos.g:94:16: ( '+' ^| '-' ^) math_term
            	    {
            	    // src/grammar/Chronos.g:94:16: ( '+' ^| '-' ^)
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
            	            // src/grammar/Chronos.g:94:17: '+' ^
            	            {
            	            char_literal55=(Token)match(input,53,FOLLOW_53_in_math_expr509); 
            	            char_literal55_tree = 
            	            (CommonTree)adaptor.create(char_literal55)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal55_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/grammar/Chronos.g:94:24: '-' ^
            	            {
            	            char_literal56=(Token)match(input,55,FOLLOW_55_in_math_expr514); 
            	            char_literal56_tree = 
            	            (CommonTree)adaptor.create(char_literal56)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal56_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_math_term_in_math_expr518);
            	    math_term57=math_term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, math_term57.getTree());

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
    // src/grammar/Chronos.g:96:1: math_term : ( unary_expr ( ( '*' ^| '/' ^) unary_expr )* | timeblock );
    public final ChronosParser.math_term_return math_term() throws RecognitionException {
        ChronosParser.math_term_return retval = new ChronosParser.math_term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal59=null;
        Token char_literal60=null;
        ChronosParser.unary_expr_return unary_expr58 =null;

        ChronosParser.unary_expr_return unary_expr61 =null;

        ChronosParser.timeblock_return timeblock62 =null;


        CommonTree char_literal59_tree=null;
        CommonTree char_literal60_tree=null;

        try {
            // src/grammar/Chronos.g:98:2: ( unary_expr ( ( '*' ^| '/' ^) unary_expr )* | timeblock )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==DOUBLE||LA20_0==ID||LA20_0==INT||LA20_0==NOT||LA20_0==PRINT_T||LA20_0==STRING||LA20_0==50) ) {
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
                    // src/grammar/Chronos.g:98:4: unary_expr ( ( '*' ^| '/' ^) unary_expr )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_unary_expr_in_math_term532);
                    unary_expr58=unary_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, unary_expr58.getTree());

                    // src/grammar/Chronos.g:98:15: ( ( '*' ^| '/' ^) unary_expr )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==52||LA19_0==57) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // src/grammar/Chronos.g:98:17: ( '*' ^| '/' ^) unary_expr
                    	    {
                    	    // src/grammar/Chronos.g:98:17: ( '*' ^| '/' ^)
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
                    	            // src/grammar/Chronos.g:98:18: '*' ^
                    	            {
                    	            char_literal59=(Token)match(input,52,FOLLOW_52_in_math_term537); 
                    	            char_literal59_tree = 
                    	            (CommonTree)adaptor.create(char_literal59)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal59_tree, root_0);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // src/grammar/Chronos.g:98:25: '/' ^
                    	            {
                    	            char_literal60=(Token)match(input,57,FOLLOW_57_in_math_term542); 
                    	            char_literal60_tree = 
                    	            (CommonTree)adaptor.create(char_literal60)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal60_tree, root_0);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_unary_expr_in_math_term546);
                    	    unary_expr61=unary_expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, unary_expr61.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // src/grammar/Chronos.g:99:4: timeblock
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_timeblock_in_math_term554);
                    timeblock62=timeblock();

                    state._fsp--;

                    adaptor.addChild(root_0, timeblock62.getTree());

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
    // src/grammar/Chronos.g:101:1: unary_expr : ( postfix_expr ( '.' ^ postfix_expr )* | NOT ^ postfix_expr );
    public final ChronosParser.unary_expr_return unary_expr() throws RecognitionException {
        ChronosParser.unary_expr_return retval = new ChronosParser.unary_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal64=null;
        Token NOT66=null;
        ChronosParser.postfix_expr_return postfix_expr63 =null;

        ChronosParser.postfix_expr_return postfix_expr65 =null;

        ChronosParser.postfix_expr_return postfix_expr67 =null;


        CommonTree char_literal64_tree=null;
        CommonTree NOT66_tree=null;

        try {
            // src/grammar/Chronos.g:102:2: ( postfix_expr ( '.' ^ postfix_expr )* | NOT ^ postfix_expr )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==DOUBLE||LA22_0==ID||LA22_0==INT||LA22_0==PRINT_T||LA22_0==STRING||LA22_0==TIME||LA22_0==50) ) {
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
                    // src/grammar/Chronos.g:102:4: postfix_expr ( '.' ^ postfix_expr )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_postfix_expr_in_unary_expr564);
                    postfix_expr63=postfix_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, postfix_expr63.getTree());

                    // src/grammar/Chronos.g:102:17: ( '.' ^ postfix_expr )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==56) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // src/grammar/Chronos.g:102:18: '.' ^ postfix_expr
                    	    {
                    	    char_literal64=(Token)match(input,56,FOLLOW_56_in_unary_expr567); 
                    	    char_literal64_tree = 
                    	    (CommonTree)adaptor.create(char_literal64)
                    	    ;
                    	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal64_tree, root_0);


                    	    pushFollow(FOLLOW_postfix_expr_in_unary_expr570);
                    	    postfix_expr65=postfix_expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, postfix_expr65.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // src/grammar/Chronos.g:103:4: NOT ^ postfix_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    NOT66=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expr577); 
                    NOT66_tree = 
                    (CommonTree)adaptor.create(NOT66)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(NOT66_tree, root_0);


                    pushFollow(FOLLOW_postfix_expr_in_unary_expr580);
                    postfix_expr67=postfix_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, postfix_expr67.getTree());

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
    // src/grammar/Chronos.g:105:1: postfix_expr : ( function | primary_expr );
    public final ChronosParser.postfix_expr_return postfix_expr() throws RecognitionException {
        ChronosParser.postfix_expr_return retval = new ChronosParser.postfix_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        ChronosParser.function_return function68 =null;

        ChronosParser.primary_expr_return primary_expr69 =null;



        try {
            // src/grammar/Chronos.g:107:2: ( function | primary_expr )
            int alt23=2;
            switch ( input.LA(1) ) {
            case PRINT_T:
                {
                alt23=1;
                }
                break;
            case ID:
                {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==50) ) {
                    alt23=1;
                }
                else if ( (LA23_2==AND||LA23_2==EQ||LA23_2==GEQ||(LA23_2 >= LEQ && LA23_2 <= NEQ)||LA23_2==OR||(LA23_2 >= 51 && LA23_2 <= 61)||LA23_2==64) ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 2, input);

                    throw nvae;

                }
                }
                break;
            case DOUBLE:
            case INT:
            case STRING:
            case TIME:
            case 50:
                {
                alt23=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // src/grammar/Chronos.g:107:4: function
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_function_in_postfix_expr591);
                    function68=function();

                    state._fsp--;

                    adaptor.addChild(root_0, function68.getTree());

                    }
                    break;
                case 2 :
                    // src/grammar/Chronos.g:108:4: primary_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_primary_expr_in_postfix_expr596);
                    primary_expr69=primary_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, primary_expr69.getTree());

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
    // src/grammar/Chronos.g:110:1: function : ( PRINT_T '(' ( print_target )* ')' | ID '(' ( argument_expr_list )? ')' -> ^( ID ^( PARAMS ( argument_expr_list )? ) ) );
    public final ChronosParser.function_return function() throws RecognitionException {
        ChronosParser.function_return retval = new ChronosParser.function_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PRINT_T70=null;
        Token char_literal71=null;
        Token char_literal73=null;
        Token ID74=null;
        Token char_literal75=null;
        Token char_literal77=null;
        ChronosParser.print_target_return print_target72 =null;

        ChronosParser.argument_expr_list_return argument_expr_list76 =null;


        CommonTree PRINT_T70_tree=null;
        CommonTree char_literal71_tree=null;
        CommonTree char_literal73_tree=null;
        CommonTree ID74_tree=null;
        CommonTree char_literal75_tree=null;
        CommonTree char_literal77_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_argument_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule argument_expr_list");
        try {
            // src/grammar/Chronos.g:111:2: ( PRINT_T '(' ( print_target )* ')' | ID '(' ( argument_expr_list )? ')' -> ^( ID ^( PARAMS ( argument_expr_list )? ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==PRINT_T) ) {
                alt26=1;
            }
            else if ( (LA26_0==ID) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // src/grammar/Chronos.g:111:4: PRINT_T '(' ( print_target )* ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    PRINT_T70=(Token)match(input,PRINT_T,FOLLOW_PRINT_T_in_function606); 
                    PRINT_T70_tree = 
                    (CommonTree)adaptor.create(PRINT_T70)
                    ;
                    adaptor.addChild(root_0, PRINT_T70_tree);


                    char_literal71=(Token)match(input,50,FOLLOW_50_in_function608); 
                    char_literal71_tree = 
                    (CommonTree)adaptor.create(char_literal71)
                    ;
                    adaptor.addChild(root_0, char_literal71_tree);


                    // src/grammar/Chronos.g:111:16: ( print_target )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==DOUBLE||LA24_0==ID||LA24_0==INT||LA24_0==PRINT_T||LA24_0==STRING) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // src/grammar/Chronos.g:111:16: print_target
                    	    {
                    	    pushFollow(FOLLOW_print_target_in_function610);
                    	    print_target72=print_target();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, print_target72.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    char_literal73=(Token)match(input,51,FOLLOW_51_in_function613); 
                    char_literal73_tree = 
                    (CommonTree)adaptor.create(char_literal73)
                    ;
                    adaptor.addChild(root_0, char_literal73_tree);


                    }
                    break;
                case 2 :
                    // src/grammar/Chronos.g:112:4: ID '(' ( argument_expr_list )? ')'
                    {
                    ID74=(Token)match(input,ID,FOLLOW_ID_in_function618);  
                    stream_ID.add(ID74);


                    char_literal75=(Token)match(input,50,FOLLOW_50_in_function620);  
                    stream_50.add(char_literal75);


                    // src/grammar/Chronos.g:112:11: ( argument_expr_list )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==DOUBLE||LA25_0==ID||LA25_0==INT||LA25_0==NOT||LA25_0==PRINT_T||LA25_0==STRING||LA25_0==TIME||LA25_0==50||LA25_0==62) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // src/grammar/Chronos.g:112:11: argument_expr_list
                            {
                            pushFollow(FOLLOW_argument_expr_list_in_function622);
                            argument_expr_list76=argument_expr_list();

                            state._fsp--;

                            stream_argument_expr_list.add(argument_expr_list76.getTree());

                            }
                            break;

                    }


                    char_literal77=(Token)match(input,51,FOLLOW_51_in_function625);  
                    stream_51.add(char_literal77);


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
                    // 113:3: -> ^( ID ^( PARAMS ( argument_expr_list )? ) )
                    {
                        // src/grammar/Chronos.g:113:6: ^( ID ^( PARAMS ( argument_expr_list )? ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_ID.nextNode()
                        , root_1);

                        // src/grammar/Chronos.g:113:11: ^( PARAMS ( argument_expr_list )? )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(PARAMS, "PARAMS")
                        , root_2);

                        // src/grammar/Chronos.g:113:20: ( argument_expr_list )?
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
    // $ANTLR end "function"


    public static class print_target_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "print_target"
    // src/grammar/Chronos.g:115:1: print_target : ( INT | DOUBLE | STRING | ID | function );
    public final ChronosParser.print_target_return print_target() throws RecognitionException {
        ChronosParser.print_target_return retval = new ChronosParser.print_target_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INT78=null;
        Token DOUBLE79=null;
        Token STRING80=null;
        Token ID81=null;
        ChronosParser.function_return function82 =null;


        CommonTree INT78_tree=null;
        CommonTree DOUBLE79_tree=null;
        CommonTree STRING80_tree=null;
        CommonTree ID81_tree=null;

        try {
            // src/grammar/Chronos.g:116:2: ( INT | DOUBLE | STRING | ID | function )
            int alt27=5;
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
            case STRING:
                {
                alt27=3;
                }
                break;
            case ID:
                {
                int LA27_4 = input.LA(2);

                if ( (LA27_4==50) ) {
                    alt27=5;
                }
                else if ( (LA27_4==DOUBLE||LA27_4==ID||LA27_4==INT||LA27_4==PRINT_T||LA27_4==STRING||LA27_4==51) ) {
                    alt27=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 4, input);

                    throw nvae;

                }
                }
                break;
            case PRINT_T:
                {
                alt27=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }

            switch (alt27) {
                case 1 :
                    // src/grammar/Chronos.g:116:4: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INT78=(Token)match(input,INT,FOLLOW_INT_in_print_target650); 
                    INT78_tree = 
                    (CommonTree)adaptor.create(INT78)
                    ;
                    adaptor.addChild(root_0, INT78_tree);


                    }
                    break;
                case 2 :
                    // src/grammar/Chronos.g:117:4: DOUBLE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    DOUBLE79=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_print_target655); 
                    DOUBLE79_tree = 
                    (CommonTree)adaptor.create(DOUBLE79)
                    ;
                    adaptor.addChild(root_0, DOUBLE79_tree);


                    }
                    break;
                case 3 :
                    // src/grammar/Chronos.g:118:4: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    STRING80=(Token)match(input,STRING,FOLLOW_STRING_in_print_target660); 
                    STRING80_tree = 
                    (CommonTree)adaptor.create(STRING80)
                    ;
                    adaptor.addChild(root_0, STRING80_tree);


                    }
                    break;
                case 4 :
                    // src/grammar/Chronos.g:119:4: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ID81=(Token)match(input,ID,FOLLOW_ID_in_print_target665); 
                    ID81_tree = 
                    (CommonTree)adaptor.create(ID81)
                    ;
                    adaptor.addChild(root_0, ID81_tree);


                    }
                    break;
                case 5 :
                    // src/grammar/Chronos.g:120:4: function
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_function_in_print_target670);
                    function82=function();

                    state._fsp--;

                    adaptor.addChild(root_0, function82.getTree());

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
    // $ANTLR end "print_target"


    public static class datetime_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "datetime"
    // src/grammar/Chronos.g:122:1: datetime : dayblock timeblock -> ^( DATETIME dayblock timeblock ) ;
    public final ChronosParser.datetime_return datetime() throws RecognitionException {
        ChronosParser.datetime_return retval = new ChronosParser.datetime_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        ChronosParser.dayblock_return dayblock83 =null;

        ChronosParser.timeblock_return timeblock84 =null;


        RewriteRuleSubtreeStream stream_timeblock=new RewriteRuleSubtreeStream(adaptor,"rule timeblock");
        RewriteRuleSubtreeStream stream_dayblock=new RewriteRuleSubtreeStream(adaptor,"rule dayblock");
        try {
            // src/grammar/Chronos.g:124:2: ( dayblock timeblock -> ^( DATETIME dayblock timeblock ) )
            // src/grammar/Chronos.g:124:4: dayblock timeblock
            {
            pushFollow(FOLLOW_dayblock_in_datetime681);
            dayblock83=dayblock();

            state._fsp--;

            stream_dayblock.add(dayblock83.getTree());

            pushFollow(FOLLOW_timeblock_in_datetime683);
            timeblock84=timeblock();

            state._fsp--;

            stream_timeblock.add(timeblock84.getTree());

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
            // 125:4: -> ^( DATETIME dayblock timeblock )
            {
                // src/grammar/Chronos.g:125:7: ^( DATETIME dayblock timeblock )
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
    // src/grammar/Chronos.g:127:1: timeblock : a= TIME '~' b= TIME -> ^( TIMES $a $b) ;
    public final ChronosParser.timeblock_return timeblock() throws RecognitionException {
        ChronosParser.timeblock_return retval = new ChronosParser.timeblock_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token a=null;
        Token b=null;
        Token char_literal85=null;

        CommonTree a_tree=null;
        CommonTree b_tree=null;
        CommonTree char_literal85_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_TIME=new RewriteRuleTokenStream(adaptor,"token TIME");

        try {
            // src/grammar/Chronos.g:129:2: (a= TIME '~' b= TIME -> ^( TIMES $a $b) )
            // src/grammar/Chronos.g:129:4: a= TIME '~' b= TIME
            {
            a=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock710);  
            stream_TIME.add(a);


            char_literal85=(Token)match(input,66,FOLLOW_66_in_timeblock712);  
            stream_66.add(char_literal85);


            b=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock716);  
            stream_TIME.add(b);


            // AST REWRITE
            // elements: a, b
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
            // 129:22: -> ^( TIMES $a $b)
            {
                // src/grammar/Chronos.g:129:25: ^( TIMES $a $b)
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
    // src/grammar/Chronos.g:131:1: dayblock : '[' DAY ( ',' DAY )* ']' -> ^( DAYS ( DAY )+ ) ;
    public final ChronosParser.dayblock_return dayblock() throws RecognitionException {
        ChronosParser.dayblock_return retval = new ChronosParser.dayblock_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal86=null;
        Token DAY87=null;
        Token char_literal88=null;
        Token DAY89=null;
        Token char_literal90=null;

        CommonTree char_literal86_tree=null;
        CommonTree DAY87_tree=null;
        CommonTree char_literal88_tree=null;
        CommonTree DAY89_tree=null;
        CommonTree char_literal90_tree=null;
        RewriteRuleTokenStream stream_DAY=new RewriteRuleTokenStream(adaptor,"token DAY");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");

        try {
            // src/grammar/Chronos.g:133:2: ( '[' DAY ( ',' DAY )* ']' -> ^( DAYS ( DAY )+ ) )
            // src/grammar/Chronos.g:133:4: '[' DAY ( ',' DAY )* ']'
            {
            char_literal86=(Token)match(input,62,FOLLOW_62_in_dayblock739);  
            stream_62.add(char_literal86);


            DAY87=(Token)match(input,DAY,FOLLOW_DAY_in_dayblock741);  
            stream_DAY.add(DAY87);


            // src/grammar/Chronos.g:133:12: ( ',' DAY )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==54) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // src/grammar/Chronos.g:133:14: ',' DAY
            	    {
            	    char_literal88=(Token)match(input,54,FOLLOW_54_in_dayblock745);  
            	    stream_54.add(char_literal88);


            	    DAY89=(Token)match(input,DAY,FOLLOW_DAY_in_dayblock747);  
            	    stream_DAY.add(DAY89);


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            char_literal90=(Token)match(input,63,FOLLOW_63_in_dayblock752);  
            stream_63.add(char_literal90);


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
            // 133:29: -> ^( DAYS ( DAY )+ )
            {
                // src/grammar/Chronos.g:133:32: ^( DAYS ( DAY )+ )
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
    // src/grammar/Chronos.g:135:1: primary_expr : ( INT | DOUBLE | ID | STRING | TIME | '(' expr ')' -> expr );
    public final ChronosParser.primary_expr_return primary_expr() throws RecognitionException {
        ChronosParser.primary_expr_return retval = new ChronosParser.primary_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INT91=null;
        Token DOUBLE92=null;
        Token ID93=null;
        Token STRING94=null;
        Token TIME95=null;
        Token char_literal96=null;
        Token char_literal98=null;
        ChronosParser.expr_return expr97 =null;


        CommonTree INT91_tree=null;
        CommonTree DOUBLE92_tree=null;
        CommonTree ID93_tree=null;
        CommonTree STRING94_tree=null;
        CommonTree TIME95_tree=null;
        CommonTree char_literal96_tree=null;
        CommonTree char_literal98_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // src/grammar/Chronos.g:136:2: ( INT | DOUBLE | ID | STRING | TIME | '(' expr ')' -> expr )
            int alt29=6;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt29=1;
                }
                break;
            case DOUBLE:
                {
                alt29=2;
                }
                break;
            case ID:
                {
                alt29=3;
                }
                break;
            case STRING:
                {
                alt29=4;
                }
                break;
            case TIME:
                {
                alt29=5;
                }
                break;
            case 50:
                {
                alt29=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }

            switch (alt29) {
                case 1 :
                    // src/grammar/Chronos.g:136:4: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INT91=(Token)match(input,INT,FOLLOW_INT_in_primary_expr771); 
                    INT91_tree = 
                    (CommonTree)adaptor.create(INT91)
                    ;
                    adaptor.addChild(root_0, INT91_tree);


                    }
                    break;
                case 2 :
                    // src/grammar/Chronos.g:137:4: DOUBLE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    DOUBLE92=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_primary_expr776); 
                    DOUBLE92_tree = 
                    (CommonTree)adaptor.create(DOUBLE92)
                    ;
                    adaptor.addChild(root_0, DOUBLE92_tree);


                    }
                    break;
                case 3 :
                    // src/grammar/Chronos.g:138:4: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ID93=(Token)match(input,ID,FOLLOW_ID_in_primary_expr781); 
                    ID93_tree = 
                    (CommonTree)adaptor.create(ID93)
                    ;
                    adaptor.addChild(root_0, ID93_tree);


                    }
                    break;
                case 4 :
                    // src/grammar/Chronos.g:139:4: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    STRING94=(Token)match(input,STRING,FOLLOW_STRING_in_primary_expr787); 
                    STRING94_tree = 
                    (CommonTree)adaptor.create(STRING94)
                    ;
                    adaptor.addChild(root_0, STRING94_tree);


                    }
                    break;
                case 5 :
                    // src/grammar/Chronos.g:140:4: TIME
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    TIME95=(Token)match(input,TIME,FOLLOW_TIME_in_primary_expr792); 
                    TIME95_tree = 
                    (CommonTree)adaptor.create(TIME95)
                    ;
                    adaptor.addChild(root_0, TIME95_tree);


                    }
                    break;
                case 6 :
                    // src/grammar/Chronos.g:141:4: '(' expr ')'
                    {
                    char_literal96=(Token)match(input,50,FOLLOW_50_in_primary_expr797);  
                    stream_50.add(char_literal96);


                    pushFollow(FOLLOW_expr_in_primary_expr798);
                    expr97=expr();

                    state._fsp--;

                    stream_expr.add(expr97.getTree());

                    char_literal98=(Token)match(input,51,FOLLOW_51_in_primary_expr799);  
                    stream_51.add(char_literal98);


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
                    // 141:15: -> expr
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
    // src/grammar/Chronos.g:143:1: argument_expr_list : ( expr ) ( ',' expr )* -> ( expr )+ ;
    public final ChronosParser.argument_expr_list_return argument_expr_list() throws RecognitionException {
        ChronosParser.argument_expr_list_return retval = new ChronosParser.argument_expr_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal100=null;
        ChronosParser.expr_return expr99 =null;

        ChronosParser.expr_return expr101 =null;


        CommonTree char_literal100_tree=null;
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // src/grammar/Chronos.g:144:2: ( ( expr ) ( ',' expr )* -> ( expr )+ )
            // src/grammar/Chronos.g:144:4: ( expr ) ( ',' expr )*
            {
            // src/grammar/Chronos.g:144:4: ( expr )
            // src/grammar/Chronos.g:144:5: expr
            {
            pushFollow(FOLLOW_expr_in_argument_expr_list814);
            expr99=expr();

            state._fsp--;

            stream_expr.add(expr99.getTree());

            }


            // src/grammar/Chronos.g:144:11: ( ',' expr )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==54) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // src/grammar/Chronos.g:144:12: ',' expr
            	    {
            	    char_literal100=(Token)match(input,54,FOLLOW_54_in_argument_expr_list818);  
            	    stream_54.add(char_literal100);


            	    pushFollow(FOLLOW_expr_in_argument_expr_list820);
            	    expr101=expr();

            	    state._fsp--;

            	    stream_expr.add(expr101.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
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
            // 144:23: -> ( expr )+
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
    // src/grammar/Chronos.g:146:1: type_specifier : ( INT_T | DOUBLE_T | DAYBLOCK_T | TIME_T | STRING_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T );
    public final ChronosParser.type_specifier_return type_specifier() throws RecognitionException {
        ChronosParser.type_specifier_return retval = new ChronosParser.type_specifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set102=null;

        CommonTree set102_tree=null;

        try {
            // src/grammar/Chronos.g:147:2: ( INT_T | DOUBLE_T | DAYBLOCK_T | TIME_T | STRING_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T )
            // src/grammar/Chronos.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set102=(Token)input.LT(1);

            if ( (input.LA(1) >= COURSELIST_T && input.LA(1) <= COURSE_T)||input.LA(1)==DATETIME_T||input.LA(1)==DAYBLOCK_T||input.LA(1)==DOUBLE_T||input.LA(1)==INT_T||input.LA(1)==SCHEDULE_T||input.LA(1)==STRING_T||input.LA(1)==TIMEBLOCK_T||input.LA(1)==TIME_T ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set102)
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


 

    public static final BitSet FOLLOW_line_in_program103 = new BitSet(new long[]{0x4404BF10D88CAC40L});
    public static final BitSet FOLLOW_EOF_in_program106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_line117 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_line119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instantiator_in_line125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_line130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_declarator141 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_declarator143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_instantiator167 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_instantiator169 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_instantiator171 = new BitSet(new long[]{0x4004151048040000L});
    public static final BitSet FOLLOW_expr_in_instantiator173 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_instantiator175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt208 = new BitSet(new long[]{0x1400000000000000L});
    public static final BitSet FOLLOW_60_in_stmt211 = new BitSet(new long[]{0x4004151048040000L});
    public static final BitSet FOLLOW_expr_in_stmt214 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_stmt217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_stmt_in_stmt222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_stmt_in_stmt227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_stmt_in_stmt232 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_stmt233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_stmt242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_T_in_selection_stmt254 = new BitSet(new long[]{0x4004151048040000L});
    public static final BitSet FOLLOW_expr_in_selection_stmt256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_selection_stmt258 = new BitSet(new long[]{0x4404BF10D88CAC40L,0x0000000000000002L});
    public static final BitSet FOLLOW_line_in_selection_stmt262 = new BitSet(new long[]{0x4404BF10D88CAC40L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_selection_stmt266 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ELSE_T_in_selection_stmt269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_selection_stmt271 = new BitSet(new long[]{0x4404BF10D88CAC40L,0x0000000000000002L});
    public static final BitSet FOLLOW_line_in_selection_stmt276 = new BitSet(new long[]{0x4404BF10D88CAC40L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_selection_stmt280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREACH_T_in_iteration_stmt322 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COURSE_T_in_iteration_stmt324 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_iteration_stmt328 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_IN_T_in_iteration_stmt330 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_iteration_stmt334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_iteration_stmt336 = new BitSet(new long[]{0x4404BF10D88CAC40L,0x0000000000000002L});
    public static final BitSet FOLLOW_line_in_iteration_stmt338 = new BitSet(new long[]{0x4404BF10D88CAC40L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_iteration_stmt341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_T_in_jump_stmt380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_expr_in_expr391 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_OR_in_expr394 = new BitSet(new long[]{0x4004151048040000L});
    public static final BitSet FOLLOW_and_expr_in_expr397 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_equiv_expr_in_and_expr414 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_and_expr417 = new BitSet(new long[]{0x4004151048040000L});
    public static final BitSet FOLLOW_equiv_expr_in_and_expr420 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rel_expr_in_equiv_expr433 = new BitSet(new long[]{0x0000000400200002L});
    public static final BitSet FOLLOW_EQ_in_equiv_expr438 = new BitSet(new long[]{0x4004151048040000L});
    public static final BitSet FOLLOW_NEQ_in_equiv_expr443 = new BitSet(new long[]{0x4004151048040000L});
    public static final BitSet FOLLOW_rel_expr_in_equiv_expr447 = new BitSet(new long[]{0x0000000400200002L});
    public static final BitSet FOLLOW_math_expr_in_rel_expr461 = new BitSet(new long[]{0x2800000202000002L});
    public static final BitSet FOLLOW_59_in_rel_expr466 = new BitSet(new long[]{0x0004151048040000L});
    public static final BitSet FOLLOW_61_in_rel_expr471 = new BitSet(new long[]{0x0004151048040000L});
    public static final BitSet FOLLOW_GEQ_in_rel_expr476 = new BitSet(new long[]{0x0004151048040000L});
    public static final BitSet FOLLOW_LEQ_in_rel_expr481 = new BitSet(new long[]{0x0004151048040000L});
    public static final BitSet FOLLOW_math_expr_in_rel_expr485 = new BitSet(new long[]{0x2800000202000002L});
    public static final BitSet FOLLOW_datetime_in_rel_expr493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_math_term_in_math_expr504 = new BitSet(new long[]{0x00A0000000000002L});
    public static final BitSet FOLLOW_53_in_math_expr509 = new BitSet(new long[]{0x0004151048040000L});
    public static final BitSet FOLLOW_55_in_math_expr514 = new BitSet(new long[]{0x0004151048040000L});
    public static final BitSet FOLLOW_math_term_in_math_expr518 = new BitSet(new long[]{0x00A0000000000002L});
    public static final BitSet FOLLOW_unary_expr_in_math_term532 = new BitSet(new long[]{0x0210000000000002L});
    public static final BitSet FOLLOW_52_in_math_term537 = new BitSet(new long[]{0x0004151048040000L});
    public static final BitSet FOLLOW_57_in_math_term542 = new BitSet(new long[]{0x0004151048040000L});
    public static final BitSet FOLLOW_unary_expr_in_math_term546 = new BitSet(new long[]{0x0210000000000002L});
    public static final BitSet FOLLOW_timeblock_in_math_term554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_expr_in_unary_expr564 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_unary_expr567 = new BitSet(new long[]{0x0004150048040000L});
    public static final BitSet FOLLOW_postfix_expr_in_unary_expr570 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary_expr577 = new BitSet(new long[]{0x0004150048040000L});
    public static final BitSet FOLLOW_postfix_expr_in_unary_expr580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_postfix_expr591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_in_postfix_expr596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_T_in_function606 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_function608 = new BitSet(new long[]{0x0008050048040000L});
    public static final BitSet FOLLOW_print_target_in_function610 = new BitSet(new long[]{0x0008050048040000L});
    public static final BitSet FOLLOW_51_in_function613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function618 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_function620 = new BitSet(new long[]{0x400C151048040000L});
    public static final BitSet FOLLOW_argument_expr_list_in_function622 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_function625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_print_target650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_print_target655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_print_target660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_print_target665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_print_target670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayblock_in_datetime681 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_timeblock_in_datetime683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_timeblock710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_timeblock712 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_TIME_in_timeblock716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_dayblock739 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DAY_in_dayblock741 = new BitSet(new long[]{0x8040000000000000L});
    public static final BitSet FOLLOW_54_in_dayblock745 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DAY_in_dayblock747 = new BitSet(new long[]{0x8040000000000000L});
    public static final BitSet FOLLOW_63_in_dayblock752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primary_expr771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_primary_expr776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primary_expr781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primary_expr787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_primary_expr792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_primary_expr797 = new BitSet(new long[]{0x4004151048040000L});
    public static final BitSet FOLLOW_expr_in_primary_expr798 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_primary_expr799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_argument_expr_list814 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_argument_expr_list818 = new BitSet(new long[]{0x4004151048040000L});
    public static final BitSet FOLLOW_expr_in_argument_expr_list820 = new BitSet(new long[]{0x0040000000000002L});

}