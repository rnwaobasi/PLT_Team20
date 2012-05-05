// $ANTLR 3.4 Chronos.g 2012-05-05 17:13:17

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ChronosParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "BLOCK", "BREAK_T", "CHAR", "COMMENT", "COND", "COURSELIST_T", "COURSE_T", "DATETIME", "DATETIME_T", "DAY", "DAYBLOCK_T", "DAYS", "DECL", "DOUBLE_T", "ELSE_T", "EQ", "ESC_SEQ", "EXPONENT", "FLOAT", "FOREACH_T", "FUNC", "GEQ", "HEX_DIGIT", "ID", "IF_T", "INST", "INT", "INT_T", "IN_T", "LEQ", "MASTER_T", "NEQ", "NEW_T", "NOT", "OCTAL_ESC", "OR", "PARAMS", "SCHEDULE_T", "STRING", "STRING_T", "TIME", "TIMEBLOCK_T", "TIMES", "TIME_T", "UNICODE_ESC", "WS", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "';'", "'<'", "'='", "'>'", "'['", "']'", "'{'", "'}'", "'~'"
    };

    public static final int EOF=-1;
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
    public static final int INST=30;
    public static final int INT=31;
    public static final int INT_T=32;
    public static final int IN_T=33;
    public static final int LEQ=34;
    public static final int MASTER_T=35;
    public static final int NEQ=36;
    public static final int NEW_T=37;
    public static final int NOT=38;
    public static final int OCTAL_ESC=39;
    public static final int OR=40;
    public static final int PARAMS=41;
    public static final int SCHEDULE_T=42;
    public static final int STRING=43;
    public static final int STRING_T=44;
    public static final int TIME=45;
    public static final int TIMEBLOCK_T=46;
    public static final int TIMES=47;
    public static final int TIME_T=48;
    public static final int UNICODE_ESC=49;
    public static final int WS=50;

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
    // Chronos.g:24:1: program : ( line )+ EOF !;
    public final ChronosParser.program_return program() throws RecognitionException {
        ChronosParser.program_return retval = new ChronosParser.program_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF2=null;
        ChronosParser.line_return line1 =null;


        CommonTree EOF2_tree=null;

        try {
            // Chronos.g:25:2: ( ( line )+ EOF !)
            // Chronos.g:25:4: ( line )+ EOF !
            {
            root_0 = (CommonTree)adaptor.nil();


            // Chronos.g:25:4: ( line )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==BREAK_T||(LA1_0 >= COURSELIST_T && LA1_0 <= COURSE_T)||LA1_0==DATETIME_T||LA1_0==DAYBLOCK_T||LA1_0==DOUBLE_T||(LA1_0 >= FLOAT && LA1_0 <= FOREACH_T)||(LA1_0 >= ID && LA1_0 <= IF_T)||(LA1_0 >= INT && LA1_0 <= INT_T)||LA1_0==MASTER_T||LA1_0==NOT||(LA1_0 >= SCHEDULE_T && LA1_0 <= TIMEBLOCK_T)||LA1_0==TIME_T||LA1_0==51||LA1_0==59||LA1_0==63) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Chronos.g:25:4: line
            	    {
            	    pushFollow(FOLLOW_line_in_program85);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program88); 

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
    // Chronos.g:27:1: line : ( declarator ';' !| instantiator | stmt );
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
            // Chronos.g:28:2: ( declarator ';' !| instantiator | stmt )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0 >= COURSELIST_T && LA2_0 <= COURSE_T)||LA2_0==DATETIME_T||LA2_0==DAYBLOCK_T||LA2_0==DOUBLE_T||LA2_0==INT_T||LA2_0==SCHEDULE_T||LA2_0==STRING_T||LA2_0==TIMEBLOCK_T||LA2_0==TIME_T) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==ID) ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==59) ) {
                        alt2=1;
                    }
                    else if ( (LA2_3==61) ) {
                        alt2=2;
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
            else if ( (LA2_0==BREAK_T||(LA2_0 >= FLOAT && LA2_0 <= FOREACH_T)||(LA2_0 >= ID && LA2_0 <= IF_T)||LA2_0==INT||LA2_0==MASTER_T||LA2_0==NOT||LA2_0==STRING||LA2_0==TIME||LA2_0==51||LA2_0==59||LA2_0==63) ) {
                alt2=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // Chronos.g:28:4: declarator ';' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_declarator_in_line99);
                    declarator3=declarator();

                    state._fsp--;

                    adaptor.addChild(root_0, declarator3.getTree());

                    char_literal4=(Token)match(input,59,FOLLOW_59_in_line101); 

                    }
                    break;
                case 2 :
                    // Chronos.g:29:4: instantiator
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_instantiator_in_line107);
                    instantiator5=instantiator();

                    state._fsp--;

                    adaptor.addChild(root_0, instantiator5.getTree());

                    }
                    break;
                case 3 :
                    // Chronos.g:30:4: stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_stmt_in_line112);
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
    // Chronos.g:32:1: declarator : type_specifier ID -> ^( DECL type_specifier ID ) ;
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
            // Chronos.g:34:2: ( type_specifier ID -> ^( DECL type_specifier ID ) )
            // Chronos.g:34:4: type_specifier ID
            {
            pushFollow(FOLLOW_type_specifier_in_declarator123);
            type_specifier7=type_specifier();

            state._fsp--;

            stream_type_specifier.add(type_specifier7.getTree());

            ID8=(Token)match(input,ID,FOLLOW_ID_in_declarator125);  
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
            // 35:4: -> ^( DECL type_specifier ID )
            {
                // Chronos.g:35:7: ^( DECL type_specifier ID )
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
    // Chronos.g:37:1: instantiator : declarator '=' expr ';' -> ^( INST declarator ^( '=' ID expr ) ) ;
    public final ChronosParser.instantiator_return instantiator() throws RecognitionException {
        ChronosParser.instantiator_return retval = new ChronosParser.instantiator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal10=null;
        Token char_literal12=null;
        ChronosParser.declarator_return declarator9 =null;

        ChronosParser.expr_return expr11 =null;


        CommonTree char_literal10_tree=null;
        CommonTree char_literal12_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Chronos.g:39:2: ( declarator '=' expr ';' -> ^( INST declarator ^( '=' ID expr ) ) )
            // Chronos.g:39:4: declarator '=' expr ';'
            {
            pushFollow(FOLLOW_declarator_in_instantiator149);
            declarator9=declarator();

            state._fsp--;

            stream_declarator.add(declarator9.getTree());

            char_literal10=(Token)match(input,61,FOLLOW_61_in_instantiator151);  
            stream_61.add(char_literal10);


            pushFollow(FOLLOW_expr_in_instantiator153);
            expr11=expr();

            state._fsp--;

            stream_expr.add(expr11.getTree());

            char_literal12=(Token)match(input,59,FOLLOW_59_in_instantiator155);  
            stream_59.add(char_literal12);


            // AST REWRITE
            // elements: declarator, 61, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 40:4: -> ^( INST declarator ^( '=' ID expr ) )
            {
                // Chronos.g:40:7: ^( INST declarator ^( '=' ID expr ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(INST, "INST")
                , root_1);

                adaptor.addChild(root_1, stream_declarator.nextTree());

                // Chronos.g:40:25: ^( '=' ID expr )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_61.nextNode()
                , root_2);

                adaptor.addChild(root_2, 
                (CommonTree)adaptor.create(ID, "ID")
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
    // Chronos.g:42:1: stmt : ( expr ';' -> expr | selection_stmt | iteration_stmt | jump_stmt ';' -> jump_stmt | ';' !);
    public final ChronosParser.stmt_return stmt() throws RecognitionException {
        ChronosParser.stmt_return retval = new ChronosParser.stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal14=null;
        Token char_literal18=null;
        Token char_literal19=null;
        ChronosParser.expr_return expr13 =null;

        ChronosParser.selection_stmt_return selection_stmt15 =null;

        ChronosParser.iteration_stmt_return iteration_stmt16 =null;

        ChronosParser.jump_stmt_return jump_stmt17 =null;


        CommonTree char_literal14_tree=null;
        CommonTree char_literal18_tree=null;
        CommonTree char_literal19_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleSubtreeStream stream_jump_stmt=new RewriteRuleSubtreeStream(adaptor,"rule jump_stmt");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Chronos.g:42:5: ( expr ';' -> expr | selection_stmt | iteration_stmt | jump_stmt ';' -> jump_stmt | ';' !)
            int alt3=5;
            switch ( input.LA(1) ) {
            case FLOAT:
            case ID:
            case INT:
            case MASTER_T:
            case NOT:
            case STRING:
            case TIME:
            case 51:
            case 63:
                {
                alt3=1;
                }
                break;
            case IF_T:
                {
                alt3=2;
                }
                break;
            case FOREACH_T:
                {
                alt3=3;
                }
                break;
            case BREAK_T:
                {
                alt3=4;
                }
                break;
            case 59:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // Chronos.g:42:7: expr ';'
                    {
                    pushFollow(FOLLOW_expr_in_stmt182);
                    expr13=expr();

                    state._fsp--;

                    stream_expr.add(expr13.getTree());

                    char_literal14=(Token)match(input,59,FOLLOW_59_in_stmt183);  
                    stream_59.add(char_literal14);


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
                    // 42:15: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // Chronos.g:43:4: selection_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_selection_stmt_in_stmt192);
                    selection_stmt15=selection_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, selection_stmt15.getTree());

                    }
                    break;
                case 3 :
                    // Chronos.g:44:4: iteration_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_iteration_stmt_in_stmt197);
                    iteration_stmt16=iteration_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, iteration_stmt16.getTree());

                    }
                    break;
                case 4 :
                    // Chronos.g:45:4: jump_stmt ';'
                    {
                    pushFollow(FOLLOW_jump_stmt_in_stmt202);
                    jump_stmt17=jump_stmt();

                    state._fsp--;

                    stream_jump_stmt.add(jump_stmt17.getTree());

                    char_literal18=(Token)match(input,59,FOLLOW_59_in_stmt203);  
                    stream_59.add(char_literal18);


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
                    // 45:17: -> jump_stmt
                    {
                        adaptor.addChild(root_0, stream_jump_stmt.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // Chronos.g:46:4: ';' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal19=(Token)match(input,59,FOLLOW_59_in_stmt212); 

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
    // Chronos.g:48:1: selection_stmt : IF_T expr '{' (a= line )* '}' ( ELSE_T '{' (b= line )* '}' )? -> ^( COND ^( IF_T expr ( $a)* ) ( ^( ELSE_T ( $b)* ) )? ) ;
    public final ChronosParser.selection_stmt_return selection_stmt() throws RecognitionException {
        ChronosParser.selection_stmt_return retval = new ChronosParser.selection_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IF_T20=null;
        Token char_literal22=null;
        Token char_literal23=null;
        Token ELSE_T24=null;
        Token char_literal25=null;
        Token char_literal26=null;
        ChronosParser.line_return a =null;

        ChronosParser.line_return b =null;

        ChronosParser.expr_return expr21 =null;


        CommonTree IF_T20_tree=null;
        CommonTree char_literal22_tree=null;
        CommonTree char_literal23_tree=null;
        CommonTree ELSE_T24_tree=null;
        CommonTree char_literal25_tree=null;
        CommonTree char_literal26_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_IF_T=new RewriteRuleTokenStream(adaptor,"token IF_T");
        RewriteRuleTokenStream stream_ELSE_T=new RewriteRuleTokenStream(adaptor,"token ELSE_T");
        RewriteRuleSubtreeStream stream_line=new RewriteRuleSubtreeStream(adaptor,"rule line");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Chronos.g:50:2: ( IF_T expr '{' (a= line )* '}' ( ELSE_T '{' (b= line )* '}' )? -> ^( COND ^( IF_T expr ( $a)* ) ( ^( ELSE_T ( $b)* ) )? ) )
            // Chronos.g:50:4: IF_T expr '{' (a= line )* '}' ( ELSE_T '{' (b= line )* '}' )?
            {
            IF_T20=(Token)match(input,IF_T,FOLLOW_IF_T_in_selection_stmt224);  
            stream_IF_T.add(IF_T20);


            pushFollow(FOLLOW_expr_in_selection_stmt226);
            expr21=expr();

            state._fsp--;

            stream_expr.add(expr21.getTree());

            char_literal22=(Token)match(input,65,FOLLOW_65_in_selection_stmt228);  
            stream_65.add(char_literal22);


            // Chronos.g:50:17: (a= line )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==BREAK_T||(LA4_0 >= COURSELIST_T && LA4_0 <= COURSE_T)||LA4_0==DATETIME_T||LA4_0==DAYBLOCK_T||LA4_0==DOUBLE_T||(LA4_0 >= FLOAT && LA4_0 <= FOREACH_T)||(LA4_0 >= ID && LA4_0 <= IF_T)||(LA4_0 >= INT && LA4_0 <= INT_T)||LA4_0==MASTER_T||LA4_0==NOT||(LA4_0 >= SCHEDULE_T && LA4_0 <= TIMEBLOCK_T)||LA4_0==TIME_T||LA4_0==51||LA4_0==59||LA4_0==63) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Chronos.g:50:18: a= line
            	    {
            	    pushFollow(FOLLOW_line_in_selection_stmt232);
            	    a=line();

            	    state._fsp--;

            	    stream_line.add(a.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            char_literal23=(Token)match(input,66,FOLLOW_66_in_selection_stmt236);  
            stream_66.add(char_literal23);


            // Chronos.g:50:31: ( ELSE_T '{' (b= line )* '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ELSE_T) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Chronos.g:50:32: ELSE_T '{' (b= line )* '}'
                    {
                    ELSE_T24=(Token)match(input,ELSE_T,FOLLOW_ELSE_T_in_selection_stmt239);  
                    stream_ELSE_T.add(ELSE_T24);


                    char_literal25=(Token)match(input,65,FOLLOW_65_in_selection_stmt241);  
                    stream_65.add(char_literal25);


                    // Chronos.g:50:43: (b= line )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==BREAK_T||(LA5_0 >= COURSELIST_T && LA5_0 <= COURSE_T)||LA5_0==DATETIME_T||LA5_0==DAYBLOCK_T||LA5_0==DOUBLE_T||(LA5_0 >= FLOAT && LA5_0 <= FOREACH_T)||(LA5_0 >= ID && LA5_0 <= IF_T)||(LA5_0 >= INT && LA5_0 <= INT_T)||LA5_0==MASTER_T||LA5_0==NOT||(LA5_0 >= SCHEDULE_T && LA5_0 <= TIMEBLOCK_T)||LA5_0==TIME_T||LA5_0==51||LA5_0==59||LA5_0==63) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // Chronos.g:50:44: b= line
                    	    {
                    	    pushFollow(FOLLOW_line_in_selection_stmt246);
                    	    b=line();

                    	    state._fsp--;

                    	    stream_line.add(b.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    char_literal26=(Token)match(input,66,FOLLOW_66_in_selection_stmt250);  
                    stream_66.add(char_literal26);


                    }
                    break;

            }


            // AST REWRITE
            // elements: a, b, expr, IF_T, ELSE_T
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
            // 51:4: -> ^( COND ^( IF_T expr ( $a)* ) ( ^( ELSE_T ( $b)* ) )? )
            {
                // Chronos.g:51:7: ^( COND ^( IF_T expr ( $a)* ) ( ^( ELSE_T ( $b)* ) )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COND, "COND")
                , root_1);

                // Chronos.g:51:14: ^( IF_T expr ( $a)* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_IF_T.nextNode()
                , root_2);

                adaptor.addChild(root_2, stream_expr.nextTree());

                // Chronos.g:51:27: ( $a)*
                while ( stream_a.hasNext() ) {
                    adaptor.addChild(root_2, stream_a.nextTree());

                }
                stream_a.reset();

                adaptor.addChild(root_1, root_2);
                }

                // Chronos.g:51:31: ( ^( ELSE_T ( $b)* ) )?
                if ( stream_b.hasNext()||stream_ELSE_T.hasNext() ) {
                    // Chronos.g:51:31: ^( ELSE_T ( $b)* )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot(
                    stream_ELSE_T.nextNode()
                    , root_2);

                    // Chronos.g:51:41: ( $b)*
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
    // Chronos.g:53:1: iteration_stmt : FOREACH_T COURSE_T element= ID IN_T list= ID '{' ( line )* '}' -> ^( FOREACH_T ^( IN_T $element $list) ^( BLOCK ( line )* ) ) ;
    public final ChronosParser.iteration_stmt_return iteration_stmt() throws RecognitionException {
        ChronosParser.iteration_stmt_return retval = new ChronosParser.iteration_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token element=null;
        Token list=null;
        Token FOREACH_T27=null;
        Token COURSE_T28=null;
        Token IN_T29=null;
        Token char_literal30=null;
        Token char_literal32=null;
        ChronosParser.line_return line31 =null;


        CommonTree element_tree=null;
        CommonTree list_tree=null;
        CommonTree FOREACH_T27_tree=null;
        CommonTree COURSE_T28_tree=null;
        CommonTree IN_T29_tree=null;
        CommonTree char_literal30_tree=null;
        CommonTree char_literal32_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_COURSE_T=new RewriteRuleTokenStream(adaptor,"token COURSE_T");
        RewriteRuleTokenStream stream_FOREACH_T=new RewriteRuleTokenStream(adaptor,"token FOREACH_T");
        RewriteRuleTokenStream stream_IN_T=new RewriteRuleTokenStream(adaptor,"token IN_T");
        RewriteRuleSubtreeStream stream_line=new RewriteRuleSubtreeStream(adaptor,"rule line");
        try {
            // Chronos.g:55:2: ( FOREACH_T COURSE_T element= ID IN_T list= ID '{' ( line )* '}' -> ^( FOREACH_T ^( IN_T $element $list) ^( BLOCK ( line )* ) ) )
            // Chronos.g:55:4: FOREACH_T COURSE_T element= ID IN_T list= ID '{' ( line )* '}'
            {
            FOREACH_T27=(Token)match(input,FOREACH_T,FOLLOW_FOREACH_T_in_iteration_stmt292);  
            stream_FOREACH_T.add(FOREACH_T27);


            COURSE_T28=(Token)match(input,COURSE_T,FOLLOW_COURSE_T_in_iteration_stmt294);  
            stream_COURSE_T.add(COURSE_T28);


            element=(Token)match(input,ID,FOLLOW_ID_in_iteration_stmt298);  
            stream_ID.add(element);


            IN_T29=(Token)match(input,IN_T,FOLLOW_IN_T_in_iteration_stmt300);  
            stream_IN_T.add(IN_T29);


            list=(Token)match(input,ID,FOLLOW_ID_in_iteration_stmt304);  
            stream_ID.add(list);


            char_literal30=(Token)match(input,65,FOLLOW_65_in_iteration_stmt306);  
            stream_65.add(char_literal30);


            // Chronos.g:55:51: ( line )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==BREAK_T||(LA7_0 >= COURSELIST_T && LA7_0 <= COURSE_T)||LA7_0==DATETIME_T||LA7_0==DAYBLOCK_T||LA7_0==DOUBLE_T||(LA7_0 >= FLOAT && LA7_0 <= FOREACH_T)||(LA7_0 >= ID && LA7_0 <= IF_T)||(LA7_0 >= INT && LA7_0 <= INT_T)||LA7_0==MASTER_T||LA7_0==NOT||(LA7_0 >= SCHEDULE_T && LA7_0 <= TIMEBLOCK_T)||LA7_0==TIME_T||LA7_0==51||LA7_0==59||LA7_0==63) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Chronos.g:55:51: line
            	    {
            	    pushFollow(FOLLOW_line_in_iteration_stmt308);
            	    line31=line();

            	    state._fsp--;

            	    stream_line.add(line31.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            char_literal32=(Token)match(input,66,FOLLOW_66_in_iteration_stmt311);  
            stream_66.add(char_literal32);


            // AST REWRITE
            // elements: IN_T, line, list, FOREACH_T, element
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
            // 56:4: -> ^( FOREACH_T ^( IN_T $element $list) ^( BLOCK ( line )* ) )
            {
                // Chronos.g:56:7: ^( FOREACH_T ^( IN_T $element $list) ^( BLOCK ( line )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_FOREACH_T.nextNode()
                , root_1);

                // Chronos.g:56:19: ^( IN_T $element $list)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_IN_T.nextNode()
                , root_2);

                adaptor.addChild(root_2, stream_element.nextNode());

                adaptor.addChild(root_2, stream_list.nextNode());

                adaptor.addChild(root_1, root_2);
                }

                // Chronos.g:56:42: ^( BLOCK ( line )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(BLOCK, "BLOCK")
                , root_2);

                // Chronos.g:56:50: ( line )*
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
    // Chronos.g:58:1: jump_stmt : BREAK_T ;
    public final ChronosParser.jump_stmt_return jump_stmt() throws RecognitionException {
        ChronosParser.jump_stmt_return retval = new ChronosParser.jump_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BREAK_T33=null;

        CommonTree BREAK_T33_tree=null;

        try {
            // Chronos.g:60:2: ( BREAK_T )
            // Chronos.g:60:4: BREAK_T
            {
            root_0 = (CommonTree)adaptor.nil();


            BREAK_T33=(Token)match(input,BREAK_T,FOLLOW_BREAK_T_in_jump_stmt350); 
            BREAK_T33_tree = 
            (CommonTree)adaptor.create(BREAK_T33)
            ;
            adaptor.addChild(root_0, BREAK_T33_tree);


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
    // Chronos.g:62:1: expr : ( and_expr ( OR ^ and_expr )* | assignment_expr );
    public final ChronosParser.expr_return expr() throws RecognitionException {
        ChronosParser.expr_return retval = new ChronosParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token OR35=null;
        ChronosParser.and_expr_return and_expr34 =null;

        ChronosParser.and_expr_return and_expr36 =null;

        ChronosParser.assignment_expr_return assignment_expr37 =null;


        CommonTree OR35_tree=null;

        try {
            // Chronos.g:64:2: ( and_expr ( OR ^ and_expr )* | assignment_expr )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==AND||LA9_1==EQ||LA9_1==GEQ||LA9_1==LEQ||LA9_1==NEQ||LA9_1==OR||(LA9_1 >= 51 && LA9_1 <= 60)||LA9_1==62||LA9_1==65) ) {
                    alt9=1;
                }
                else if ( (LA9_1==61) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA9_0==FLOAT||LA9_0==INT||LA9_0==MASTER_T||LA9_0==NOT||LA9_0==STRING||LA9_0==TIME||LA9_0==51||LA9_0==63) ) {
                alt9=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // Chronos.g:64:4: and_expr ( OR ^ and_expr )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_and_expr_in_expr361);
                    and_expr34=and_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, and_expr34.getTree());

                    // Chronos.g:64:13: ( OR ^ and_expr )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==OR) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // Chronos.g:64:14: OR ^ and_expr
                    	    {
                    	    OR35=(Token)match(input,OR,FOLLOW_OR_in_expr364); 
                    	    OR35_tree = 
                    	    (CommonTree)adaptor.create(OR35)
                    	    ;
                    	    root_0 = (CommonTree)adaptor.becomeRoot(OR35_tree, root_0);


                    	    pushFollow(FOLLOW_and_expr_in_expr367);
                    	    and_expr36=and_expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, and_expr36.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Chronos.g:65:4: assignment_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_assignment_expr_in_expr374);
                    assignment_expr37=assignment_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment_expr37.getTree());

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
    // $ANTLR end "expr"


    public static class assignment_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment_expr"
    // Chronos.g:67:1: assignment_expr : ID '=' ^ expr ;
    public final ChronosParser.assignment_expr_return assignment_expr() throws RecognitionException {
        ChronosParser.assignment_expr_return retval = new ChronosParser.assignment_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID38=null;
        Token char_literal39=null;
        ChronosParser.expr_return expr40 =null;


        CommonTree ID38_tree=null;
        CommonTree char_literal39_tree=null;

        try {
            // Chronos.g:69:2: ( ID '=' ^ expr )
            // Chronos.g:69:4: ID '=' ^ expr
            {
            root_0 = (CommonTree)adaptor.nil();


            ID38=(Token)match(input,ID,FOLLOW_ID_in_assignment_expr385); 
            ID38_tree = 
            (CommonTree)adaptor.create(ID38)
            ;
            adaptor.addChild(root_0, ID38_tree);


            char_literal39=(Token)match(input,61,FOLLOW_61_in_assignment_expr387); 
            char_literal39_tree = 
            (CommonTree)adaptor.create(char_literal39)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(char_literal39_tree, root_0);


            pushFollow(FOLLOW_expr_in_assignment_expr390);
            expr40=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr40.getTree());

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
    // $ANTLR end "assignment_expr"


    public static class and_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "and_expr"
    // Chronos.g:71:1: and_expr : equiv_expr ( AND ^ equiv_expr )* ;
    public final ChronosParser.and_expr_return and_expr() throws RecognitionException {
        ChronosParser.and_expr_return retval = new ChronosParser.and_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AND42=null;
        ChronosParser.equiv_expr_return equiv_expr41 =null;

        ChronosParser.equiv_expr_return equiv_expr43 =null;


        CommonTree AND42_tree=null;

        try {
            // Chronos.g:73:2: ( equiv_expr ( AND ^ equiv_expr )* )
            // Chronos.g:73:4: equiv_expr ( AND ^ equiv_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_equiv_expr_in_and_expr401);
            equiv_expr41=equiv_expr();

            state._fsp--;

            adaptor.addChild(root_0, equiv_expr41.getTree());

            // Chronos.g:73:15: ( AND ^ equiv_expr )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==AND) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Chronos.g:73:16: AND ^ equiv_expr
            	    {
            	    AND42=(Token)match(input,AND,FOLLOW_AND_in_and_expr404); 
            	    AND42_tree = 
            	    (CommonTree)adaptor.create(AND42)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(AND42_tree, root_0);


            	    pushFollow(FOLLOW_equiv_expr_in_and_expr407);
            	    equiv_expr43=equiv_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, equiv_expr43.getTree());

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
    // Chronos.g:75:1: equiv_expr : rel_expr ( ( EQ ^| NEQ ^) rel_expr )* ;
    public final ChronosParser.equiv_expr_return equiv_expr() throws RecognitionException {
        ChronosParser.equiv_expr_return retval = new ChronosParser.equiv_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQ45=null;
        Token NEQ46=null;
        ChronosParser.rel_expr_return rel_expr44 =null;

        ChronosParser.rel_expr_return rel_expr47 =null;


        CommonTree EQ45_tree=null;
        CommonTree NEQ46_tree=null;

        try {
            // Chronos.g:77:2: ( rel_expr ( ( EQ ^| NEQ ^) rel_expr )* )
            // Chronos.g:77:4: rel_expr ( ( EQ ^| NEQ ^) rel_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_rel_expr_in_equiv_expr420);
            rel_expr44=rel_expr();

            state._fsp--;

            adaptor.addChild(root_0, rel_expr44.getTree());

            // Chronos.g:77:13: ( ( EQ ^| NEQ ^) rel_expr )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==EQ||LA12_0==NEQ) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Chronos.g:77:15: ( EQ ^| NEQ ^) rel_expr
            	    {
            	    // Chronos.g:77:15: ( EQ ^| NEQ ^)
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
            	            // Chronos.g:77:16: EQ ^
            	            {
            	            EQ45=(Token)match(input,EQ,FOLLOW_EQ_in_equiv_expr425); 
            	            EQ45_tree = 
            	            (CommonTree)adaptor.create(EQ45)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(EQ45_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // Chronos.g:77:22: NEQ ^
            	            {
            	            NEQ46=(Token)match(input,NEQ,FOLLOW_NEQ_in_equiv_expr430); 
            	            NEQ46_tree = 
            	            (CommonTree)adaptor.create(NEQ46)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(NEQ46_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_rel_expr_in_equiv_expr434);
            	    rel_expr47=rel_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, rel_expr47.getTree());

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
    // Chronos.g:79:1: rel_expr : ( math_expr ( ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr )* | datetime );
    public final ChronosParser.rel_expr_return rel_expr() throws RecognitionException {
        ChronosParser.rel_expr_return retval = new ChronosParser.rel_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal49=null;
        Token char_literal50=null;
        Token GEQ51=null;
        Token LEQ52=null;
        ChronosParser.math_expr_return math_expr48 =null;

        ChronosParser.math_expr_return math_expr53 =null;

        ChronosParser.datetime_return datetime54 =null;


        CommonTree char_literal49_tree=null;
        CommonTree char_literal50_tree=null;
        CommonTree GEQ51_tree=null;
        CommonTree LEQ52_tree=null;

        try {
            // Chronos.g:81:2: ( math_expr ( ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr )* | datetime )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==FLOAT||LA15_0==ID||LA15_0==INT||LA15_0==MASTER_T||LA15_0==NOT||LA15_0==STRING||LA15_0==TIME||LA15_0==51) ) {
                alt15=1;
            }
            else if ( (LA15_0==63) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // Chronos.g:81:4: math_expr ( ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_math_expr_in_rel_expr448);
                    math_expr48=math_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, math_expr48.getTree());

                    // Chronos.g:81:14: ( ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==GEQ||LA14_0==LEQ||LA14_0==60||LA14_0==62) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // Chronos.g:81:16: ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr
                    	    {
                    	    // Chronos.g:81:16: ( '<' ^| '>' ^| GEQ ^| LEQ ^)
                    	    int alt13=4;
                    	    switch ( input.LA(1) ) {
                    	    case 60:
                    	        {
                    	        alt13=1;
                    	        }
                    	        break;
                    	    case 62:
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
                    	            // Chronos.g:81:17: '<' ^
                    	            {
                    	            char_literal49=(Token)match(input,60,FOLLOW_60_in_rel_expr453); 
                    	            char_literal49_tree = 
                    	            (CommonTree)adaptor.create(char_literal49)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal49_tree, root_0);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // Chronos.g:81:24: '>' ^
                    	            {
                    	            char_literal50=(Token)match(input,62,FOLLOW_62_in_rel_expr458); 
                    	            char_literal50_tree = 
                    	            (CommonTree)adaptor.create(char_literal50)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal50_tree, root_0);


                    	            }
                    	            break;
                    	        case 3 :
                    	            // Chronos.g:81:31: GEQ ^
                    	            {
                    	            GEQ51=(Token)match(input,GEQ,FOLLOW_GEQ_in_rel_expr463); 
                    	            GEQ51_tree = 
                    	            (CommonTree)adaptor.create(GEQ51)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(GEQ51_tree, root_0);


                    	            }
                    	            break;
                    	        case 4 :
                    	            // Chronos.g:81:38: LEQ ^
                    	            {
                    	            LEQ52=(Token)match(input,LEQ,FOLLOW_LEQ_in_rel_expr468); 
                    	            LEQ52_tree = 
                    	            (CommonTree)adaptor.create(LEQ52)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(LEQ52_tree, root_0);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_math_expr_in_rel_expr472);
                    	    math_expr53=math_expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, math_expr53.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Chronos.g:82:4: datetime
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_datetime_in_rel_expr480);
                    datetime54=datetime();

                    state._fsp--;

                    adaptor.addChild(root_0, datetime54.getTree());

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
    // Chronos.g:84:1: math_expr : math_term ( ( '+' ^| '-' ^) math_term )* ;
    public final ChronosParser.math_expr_return math_expr() throws RecognitionException {
        ChronosParser.math_expr_return retval = new ChronosParser.math_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal56=null;
        Token char_literal57=null;
        ChronosParser.math_term_return math_term55 =null;

        ChronosParser.math_term_return math_term58 =null;


        CommonTree char_literal56_tree=null;
        CommonTree char_literal57_tree=null;

        try {
            // Chronos.g:86:2: ( math_term ( ( '+' ^| '-' ^) math_term )* )
            // Chronos.g:86:4: math_term ( ( '+' ^| '-' ^) math_term )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_math_term_in_math_expr491);
            math_term55=math_term();

            state._fsp--;

            adaptor.addChild(root_0, math_term55.getTree());

            // Chronos.g:86:14: ( ( '+' ^| '-' ^) math_term )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==54||LA17_0==56) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // Chronos.g:86:16: ( '+' ^| '-' ^) math_term
            	    {
            	    // Chronos.g:86:16: ( '+' ^| '-' ^)
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==54) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==56) ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // Chronos.g:86:17: '+' ^
            	            {
            	            char_literal56=(Token)match(input,54,FOLLOW_54_in_math_expr496); 
            	            char_literal56_tree = 
            	            (CommonTree)adaptor.create(char_literal56)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal56_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // Chronos.g:86:24: '-' ^
            	            {
            	            char_literal57=(Token)match(input,56,FOLLOW_56_in_math_expr501); 
            	            char_literal57_tree = 
            	            (CommonTree)adaptor.create(char_literal57)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal57_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_math_term_in_math_expr505);
            	    math_term58=math_term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, math_term58.getTree());

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
    // Chronos.g:88:1: math_term : ( unary_expr ( ( '*' ^| '/' ^) unary_expr )* | timeblock );
    public final ChronosParser.math_term_return math_term() throws RecognitionException {
        ChronosParser.math_term_return retval = new ChronosParser.math_term_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal60=null;
        Token char_literal61=null;
        ChronosParser.unary_expr_return unary_expr59 =null;

        ChronosParser.unary_expr_return unary_expr62 =null;

        ChronosParser.timeblock_return timeblock63 =null;


        CommonTree char_literal60_tree=null;
        CommonTree char_literal61_tree=null;

        try {
            // Chronos.g:90:2: ( unary_expr ( ( '*' ^| '/' ^) unary_expr )* | timeblock )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==FLOAT||LA20_0==ID||LA20_0==INT||LA20_0==MASTER_T||LA20_0==NOT||LA20_0==STRING||LA20_0==51) ) {
                alt20=1;
            }
            else if ( (LA20_0==TIME) ) {
                int LA20_2 = input.LA(2);

                if ( (LA20_2==67) ) {
                    alt20=2;
                }
                else if ( (LA20_2==AND||LA20_2==EQ||LA20_2==GEQ||LA20_2==LEQ||LA20_2==NEQ||LA20_2==OR||(LA20_2 >= 52 && LA20_2 <= 60)||LA20_2==62||LA20_2==65) ) {
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
                    // Chronos.g:90:4: unary_expr ( ( '*' ^| '/' ^) unary_expr )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_unary_expr_in_math_term519);
                    unary_expr59=unary_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, unary_expr59.getTree());

                    // Chronos.g:90:15: ( ( '*' ^| '/' ^) unary_expr )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==53||LA19_0==58) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // Chronos.g:90:17: ( '*' ^| '/' ^) unary_expr
                    	    {
                    	    // Chronos.g:90:17: ( '*' ^| '/' ^)
                    	    int alt18=2;
                    	    int LA18_0 = input.LA(1);

                    	    if ( (LA18_0==53) ) {
                    	        alt18=1;
                    	    }
                    	    else if ( (LA18_0==58) ) {
                    	        alt18=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 18, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt18) {
                    	        case 1 :
                    	            // Chronos.g:90:18: '*' ^
                    	            {
                    	            char_literal60=(Token)match(input,53,FOLLOW_53_in_math_term524); 
                    	            char_literal60_tree = 
                    	            (CommonTree)adaptor.create(char_literal60)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal60_tree, root_0);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // Chronos.g:90:25: '/' ^
                    	            {
                    	            char_literal61=(Token)match(input,58,FOLLOW_58_in_math_term529); 
                    	            char_literal61_tree = 
                    	            (CommonTree)adaptor.create(char_literal61)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal61_tree, root_0);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_unary_expr_in_math_term533);
                    	    unary_expr62=unary_expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, unary_expr62.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Chronos.g:91:4: timeblock
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_timeblock_in_math_term541);
                    timeblock63=timeblock();

                    state._fsp--;

                    adaptor.addChild(root_0, timeblock63.getTree());

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
    // Chronos.g:93:1: unary_expr : ( postfix_expr ( '.' ^ postfix_expr )* | NOT ^ postfix_expr );
    public final ChronosParser.unary_expr_return unary_expr() throws RecognitionException {
        ChronosParser.unary_expr_return retval = new ChronosParser.unary_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal65=null;
        Token NOT67=null;
        ChronosParser.postfix_expr_return postfix_expr64 =null;

        ChronosParser.postfix_expr_return postfix_expr66 =null;

        ChronosParser.postfix_expr_return postfix_expr68 =null;


        CommonTree char_literal65_tree=null;
        CommonTree NOT67_tree=null;

        try {
            // Chronos.g:94:2: ( postfix_expr ( '.' ^ postfix_expr )* | NOT ^ postfix_expr )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==FLOAT||LA22_0==ID||LA22_0==INT||LA22_0==MASTER_T||LA22_0==STRING||LA22_0==TIME||LA22_0==51) ) {
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
                    // Chronos.g:94:4: postfix_expr ( '.' ^ postfix_expr )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_postfix_expr_in_unary_expr551);
                    postfix_expr64=postfix_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, postfix_expr64.getTree());

                    // Chronos.g:94:17: ( '.' ^ postfix_expr )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==57) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // Chronos.g:94:18: '.' ^ postfix_expr
                    	    {
                    	    char_literal65=(Token)match(input,57,FOLLOW_57_in_unary_expr554); 
                    	    char_literal65_tree = 
                    	    (CommonTree)adaptor.create(char_literal65)
                    	    ;
                    	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal65_tree, root_0);


                    	    pushFollow(FOLLOW_postfix_expr_in_unary_expr557);
                    	    postfix_expr66=postfix_expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, postfix_expr66.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Chronos.g:95:4: NOT ^ postfix_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    NOT67=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expr564); 
                    NOT67_tree = 
                    (CommonTree)adaptor.create(NOT67)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(NOT67_tree, root_0);


                    pushFollow(FOLLOW_postfix_expr_in_unary_expr567);
                    postfix_expr68=postfix_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, postfix_expr68.getTree());

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
    // Chronos.g:97:1: postfix_expr : ( function | primary_expr );
    public final ChronosParser.postfix_expr_return postfix_expr() throws RecognitionException {
        ChronosParser.postfix_expr_return retval = new ChronosParser.postfix_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        ChronosParser.function_return function69 =null;

        ChronosParser.primary_expr_return primary_expr70 =null;



        try {
            // Chronos.g:99:2: ( function | primary_expr )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==51) ) {
                    alt23=1;
                }
                else if ( (LA23_1==AND||LA23_1==EQ||LA23_1==GEQ||LA23_1==LEQ||LA23_1==NEQ||LA23_1==OR||(LA23_1 >= 52 && LA23_1 <= 60)||LA23_1==62||LA23_1==65) ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA23_0==FLOAT||LA23_0==INT||LA23_0==MASTER_T||LA23_0==STRING||LA23_0==TIME||LA23_0==51) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // Chronos.g:99:4: function
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_function_in_postfix_expr578);
                    function69=function();

                    state._fsp--;

                    adaptor.addChild(root_0, function69.getTree());

                    }
                    break;
                case 2 :
                    // Chronos.g:100:4: primary_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_primary_expr_in_postfix_expr583);
                    primary_expr70=primary_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, primary_expr70.getTree());

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
    // Chronos.g:103:1: function : ID '(' ( argument_expr_list )? ')' -> ^( ID ^( PARAMS ( argument_expr_list )? ) ) ;
    public final ChronosParser.function_return function() throws RecognitionException {
        ChronosParser.function_return retval = new ChronosParser.function_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID71=null;
        Token char_literal72=null;
        Token char_literal74=null;
        ChronosParser.argument_expr_list_return argument_expr_list73 =null;


        CommonTree ID71_tree=null;
        CommonTree char_literal72_tree=null;
        CommonTree char_literal74_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_argument_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule argument_expr_list");
        try {
            // Chronos.g:104:2: ( ID '(' ( argument_expr_list )? ')' -> ^( ID ^( PARAMS ( argument_expr_list )? ) ) )
            // Chronos.g:104:4: ID '(' ( argument_expr_list )? ')'
            {
            ID71=(Token)match(input,ID,FOLLOW_ID_in_function595);  
            stream_ID.add(ID71);


            char_literal72=(Token)match(input,51,FOLLOW_51_in_function597);  
            stream_51.add(char_literal72);


            // Chronos.g:104:11: ( argument_expr_list )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==FLOAT||LA24_0==ID||LA24_0==INT||LA24_0==MASTER_T||LA24_0==NOT||LA24_0==STRING||LA24_0==TIME||LA24_0==51||LA24_0==63) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // Chronos.g:104:11: argument_expr_list
                    {
                    pushFollow(FOLLOW_argument_expr_list_in_function599);
                    argument_expr_list73=argument_expr_list();

                    state._fsp--;

                    stream_argument_expr_list.add(argument_expr_list73.getTree());

                    }
                    break;

            }


            char_literal74=(Token)match(input,52,FOLLOW_52_in_function602);  
            stream_52.add(char_literal74);


            // AST REWRITE
            // elements: ID, argument_expr_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 105:3: -> ^( ID ^( PARAMS ( argument_expr_list )? ) )
            {
                // Chronos.g:105:6: ^( ID ^( PARAMS ( argument_expr_list )? ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_ID.nextNode()
                , root_1);

                // Chronos.g:105:11: ^( PARAMS ( argument_expr_list )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PARAMS, "PARAMS")
                , root_2);

                // Chronos.g:105:20: ( argument_expr_list )?
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
    // Chronos.g:112:1: datetime : dayblock timeblock -> ^( DATETIME dayblock timeblock ) ;
    public final ChronosParser.datetime_return datetime() throws RecognitionException {
        ChronosParser.datetime_return retval = new ChronosParser.datetime_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        ChronosParser.dayblock_return dayblock75 =null;

        ChronosParser.timeblock_return timeblock76 =null;


        RewriteRuleSubtreeStream stream_timeblock=new RewriteRuleSubtreeStream(adaptor,"rule timeblock");
        RewriteRuleSubtreeStream stream_dayblock=new RewriteRuleSubtreeStream(adaptor,"rule dayblock");
        try {
            // Chronos.g:114:2: ( dayblock timeblock -> ^( DATETIME dayblock timeblock ) )
            // Chronos.g:114:4: dayblock timeblock
            {
            pushFollow(FOLLOW_dayblock_in_datetime630);
            dayblock75=dayblock();

            state._fsp--;

            stream_dayblock.add(dayblock75.getTree());

            pushFollow(FOLLOW_timeblock_in_datetime632);
            timeblock76=timeblock();

            state._fsp--;

            stream_timeblock.add(timeblock76.getTree());

            // AST REWRITE
            // elements: dayblock, timeblock
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 115:4: -> ^( DATETIME dayblock timeblock )
            {
                // Chronos.g:115:7: ^( DATETIME dayblock timeblock )
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
    // Chronos.g:117:1: timeblock : a= TIME '~' b= TIME -> ^( TIMES $a $b) ;
    public final ChronosParser.timeblock_return timeblock() throws RecognitionException {
        ChronosParser.timeblock_return retval = new ChronosParser.timeblock_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token a=null;
        Token b=null;
        Token char_literal77=null;

        CommonTree a_tree=null;
        CommonTree b_tree=null;
        CommonTree char_literal77_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_TIME=new RewriteRuleTokenStream(adaptor,"token TIME");

        try {
            // Chronos.g:119:2: (a= TIME '~' b= TIME -> ^( TIMES $a $b) )
            // Chronos.g:119:4: a= TIME '~' b= TIME
            {
            a=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock659);  
            stream_TIME.add(a);


            char_literal77=(Token)match(input,67,FOLLOW_67_in_timeblock661);  
            stream_67.add(char_literal77);


            b=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock665);  
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
            // 119:22: -> ^( TIMES $a $b)
            {
                // Chronos.g:119:25: ^( TIMES $a $b)
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
    // Chronos.g:121:1: dayblock : '[' DAY ( ',' DAY )* ']' -> ^( DAYS ( DAY )+ ) ;
    public final ChronosParser.dayblock_return dayblock() throws RecognitionException {
        ChronosParser.dayblock_return retval = new ChronosParser.dayblock_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal78=null;
        Token DAY79=null;
        Token char_literal80=null;
        Token DAY81=null;
        Token char_literal82=null;

        CommonTree char_literal78_tree=null;
        CommonTree DAY79_tree=null;
        CommonTree char_literal80_tree=null;
        CommonTree DAY81_tree=null;
        CommonTree char_literal82_tree=null;
        RewriteRuleTokenStream stream_DAY=new RewriteRuleTokenStream(adaptor,"token DAY");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");

        try {
            // Chronos.g:123:2: ( '[' DAY ( ',' DAY )* ']' -> ^( DAYS ( DAY )+ ) )
            // Chronos.g:123:4: '[' DAY ( ',' DAY )* ']'
            {
            char_literal78=(Token)match(input,63,FOLLOW_63_in_dayblock688);  
            stream_63.add(char_literal78);


            DAY79=(Token)match(input,DAY,FOLLOW_DAY_in_dayblock690);  
            stream_DAY.add(DAY79);


            // Chronos.g:123:12: ( ',' DAY )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==55) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // Chronos.g:123:14: ',' DAY
            	    {
            	    char_literal80=(Token)match(input,55,FOLLOW_55_in_dayblock694);  
            	    stream_55.add(char_literal80);


            	    DAY81=(Token)match(input,DAY,FOLLOW_DAY_in_dayblock696);  
            	    stream_DAY.add(DAY81);


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            char_literal82=(Token)match(input,64,FOLLOW_64_in_dayblock701);  
            stream_64.add(char_literal82);


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
            // 123:29: -> ^( DAYS ( DAY )+ )
            {
                // Chronos.g:123:32: ^( DAYS ( DAY )+ )
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
    // Chronos.g:125:1: primary_expr : ( INT | FLOAT | ID | STRING | TIME | MASTER_T | '(' expr ')' -> expr );
    public final ChronosParser.primary_expr_return primary_expr() throws RecognitionException {
        ChronosParser.primary_expr_return retval = new ChronosParser.primary_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INT83=null;
        Token FLOAT84=null;
        Token ID85=null;
        Token STRING86=null;
        Token TIME87=null;
        Token MASTER_T88=null;
        Token char_literal89=null;
        Token char_literal91=null;
        ChronosParser.expr_return expr90 =null;


        CommonTree INT83_tree=null;
        CommonTree FLOAT84_tree=null;
        CommonTree ID85_tree=null;
        CommonTree STRING86_tree=null;
        CommonTree TIME87_tree=null;
        CommonTree MASTER_T88_tree=null;
        CommonTree char_literal89_tree=null;
        CommonTree char_literal91_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Chronos.g:126:2: ( INT | FLOAT | ID | STRING | TIME | MASTER_T | '(' expr ')' -> expr )
            int alt26=7;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt26=1;
                }
                break;
            case FLOAT:
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
            case MASTER_T:
                {
                alt26=6;
                }
                break;
            case 51:
                {
                alt26=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // Chronos.g:126:4: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INT83=(Token)match(input,INT,FOLLOW_INT_in_primary_expr720); 
                    INT83_tree = 
                    (CommonTree)adaptor.create(INT83)
                    ;
                    adaptor.addChild(root_0, INT83_tree);


                    }
                    break;
                case 2 :
                    // Chronos.g:127:4: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    FLOAT84=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_primary_expr725); 
                    FLOAT84_tree = 
                    (CommonTree)adaptor.create(FLOAT84)
                    ;
                    adaptor.addChild(root_0, FLOAT84_tree);


                    }
                    break;
                case 3 :
                    // Chronos.g:128:4: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ID85=(Token)match(input,ID,FOLLOW_ID_in_primary_expr730); 
                    ID85_tree = 
                    (CommonTree)adaptor.create(ID85)
                    ;
                    adaptor.addChild(root_0, ID85_tree);


                    }
                    break;
                case 4 :
                    // Chronos.g:129:4: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    STRING86=(Token)match(input,STRING,FOLLOW_STRING_in_primary_expr736); 
                    STRING86_tree = 
                    (CommonTree)adaptor.create(STRING86)
                    ;
                    adaptor.addChild(root_0, STRING86_tree);


                    }
                    break;
                case 5 :
                    // Chronos.g:130:4: TIME
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    TIME87=(Token)match(input,TIME,FOLLOW_TIME_in_primary_expr741); 
                    TIME87_tree = 
                    (CommonTree)adaptor.create(TIME87)
                    ;
                    adaptor.addChild(root_0, TIME87_tree);


                    }
                    break;
                case 6 :
                    // Chronos.g:131:4: MASTER_T
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    MASTER_T88=(Token)match(input,MASTER_T,FOLLOW_MASTER_T_in_primary_expr746); 
                    MASTER_T88_tree = 
                    (CommonTree)adaptor.create(MASTER_T88)
                    ;
                    adaptor.addChild(root_0, MASTER_T88_tree);


                    }
                    break;
                case 7 :
                    // Chronos.g:132:4: '(' expr ')'
                    {
                    char_literal89=(Token)match(input,51,FOLLOW_51_in_primary_expr752);  
                    stream_51.add(char_literal89);


                    pushFollow(FOLLOW_expr_in_primary_expr753);
                    expr90=expr();

                    state._fsp--;

                    stream_expr.add(expr90.getTree());

                    char_literal91=(Token)match(input,52,FOLLOW_52_in_primary_expr754);  
                    stream_52.add(char_literal91);


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
                    // 132:15: -> expr
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
    // Chronos.g:134:1: argument_expr_list : ( expr ) ( ',' expr )* -> ( expr )+ ;
    public final ChronosParser.argument_expr_list_return argument_expr_list() throws RecognitionException {
        ChronosParser.argument_expr_list_return retval = new ChronosParser.argument_expr_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal93=null;
        ChronosParser.expr_return expr92 =null;

        ChronosParser.expr_return expr94 =null;


        CommonTree char_literal93_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Chronos.g:135:2: ( ( expr ) ( ',' expr )* -> ( expr )+ )
            // Chronos.g:135:4: ( expr ) ( ',' expr )*
            {
            // Chronos.g:135:4: ( expr )
            // Chronos.g:135:5: expr
            {
            pushFollow(FOLLOW_expr_in_argument_expr_list769);
            expr92=expr();

            state._fsp--;

            stream_expr.add(expr92.getTree());

            }


            // Chronos.g:135:11: ( ',' expr )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==55) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // Chronos.g:135:12: ',' expr
            	    {
            	    char_literal93=(Token)match(input,55,FOLLOW_55_in_argument_expr_list773);  
            	    stream_55.add(char_literal93);


            	    pushFollow(FOLLOW_expr_in_argument_expr_list775);
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
            // 135:23: -> ( expr )+
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
    // Chronos.g:137:1: type_specifier : ( INT_T | DOUBLE_T | DAYBLOCK_T | TIME_T | STRING_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T );
    public final ChronosParser.type_specifier_return type_specifier() throws RecognitionException {
        ChronosParser.type_specifier_return retval = new ChronosParser.type_specifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set95=null;

        CommonTree set95_tree=null;

        try {
            // Chronos.g:138:2: ( INT_T | DOUBLE_T | DAYBLOCK_T | TIME_T | STRING_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T )
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


 

    public static final BitSet FOLLOW_line_in_program85 = new BitSet(new long[]{0x88097C49B184AC40L});
    public static final BitSet FOLLOW_EOF_in_program88 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_line99 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_line101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instantiator_in_line107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_line112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_declarator123 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_declarator125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_instantiator149 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_instantiator151 = new BitSet(new long[]{0x8008284890800000L});
    public static final BitSet FOLLOW_expr_in_instantiator153 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_instantiator155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt182 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_stmt183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_stmt_in_stmt192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_stmt_in_stmt197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_stmt_in_stmt202 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_stmt203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_stmt212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_T_in_selection_stmt224 = new BitSet(new long[]{0x8008284890800000L});
    public static final BitSet FOLLOW_expr_in_selection_stmt226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_selection_stmt228 = new BitSet(new long[]{0x88097C49B184AC40L,0x0000000000000004L});
    public static final BitSet FOLLOW_line_in_selection_stmt232 = new BitSet(new long[]{0x88097C49B184AC40L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_selection_stmt236 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ELSE_T_in_selection_stmt239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_selection_stmt241 = new BitSet(new long[]{0x88097C49B184AC40L,0x0000000000000004L});
    public static final BitSet FOLLOW_line_in_selection_stmt246 = new BitSet(new long[]{0x88097C49B184AC40L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_selection_stmt250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREACH_T_in_iteration_stmt292 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COURSE_T_in_iteration_stmt294 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_iteration_stmt298 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_IN_T_in_iteration_stmt300 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_iteration_stmt304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_iteration_stmt306 = new BitSet(new long[]{0x88097C49B184AC40L,0x0000000000000004L});
    public static final BitSet FOLLOW_line_in_iteration_stmt308 = new BitSet(new long[]{0x88097C49B184AC40L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_iteration_stmt311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_T_in_jump_stmt350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_expr_in_expr361 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_OR_in_expr364 = new BitSet(new long[]{0x8008284890800000L});
    public static final BitSet FOLLOW_and_expr_in_expr367 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_assignment_expr_in_expr374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment_expr385 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_assignment_expr387 = new BitSet(new long[]{0x8008284890800000L});
    public static final BitSet FOLLOW_expr_in_assignment_expr390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equiv_expr_in_and_expr401 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_and_expr404 = new BitSet(new long[]{0x8008284890800000L});
    public static final BitSet FOLLOW_equiv_expr_in_and_expr407 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rel_expr_in_equiv_expr420 = new BitSet(new long[]{0x0000001000100002L});
    public static final BitSet FOLLOW_EQ_in_equiv_expr425 = new BitSet(new long[]{0x8008284890800000L});
    public static final BitSet FOLLOW_NEQ_in_equiv_expr430 = new BitSet(new long[]{0x8008284890800000L});
    public static final BitSet FOLLOW_rel_expr_in_equiv_expr434 = new BitSet(new long[]{0x0000001000100002L});
    public static final BitSet FOLLOW_math_expr_in_rel_expr448 = new BitSet(new long[]{0x5000000404000002L});
    public static final BitSet FOLLOW_60_in_rel_expr453 = new BitSet(new long[]{0x0008284890800000L});
    public static final BitSet FOLLOW_62_in_rel_expr458 = new BitSet(new long[]{0x0008284890800000L});
    public static final BitSet FOLLOW_GEQ_in_rel_expr463 = new BitSet(new long[]{0x0008284890800000L});
    public static final BitSet FOLLOW_LEQ_in_rel_expr468 = new BitSet(new long[]{0x0008284890800000L});
    public static final BitSet FOLLOW_math_expr_in_rel_expr472 = new BitSet(new long[]{0x5000000404000002L});
    public static final BitSet FOLLOW_datetime_in_rel_expr480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_math_term_in_math_expr491 = new BitSet(new long[]{0x0140000000000002L});
    public static final BitSet FOLLOW_54_in_math_expr496 = new BitSet(new long[]{0x0008284890800000L});
    public static final BitSet FOLLOW_56_in_math_expr501 = new BitSet(new long[]{0x0008284890800000L});
    public static final BitSet FOLLOW_math_term_in_math_expr505 = new BitSet(new long[]{0x0140000000000002L});
    public static final BitSet FOLLOW_unary_expr_in_math_term519 = new BitSet(new long[]{0x0420000000000002L});
    public static final BitSet FOLLOW_53_in_math_term524 = new BitSet(new long[]{0x0008284890800000L});
    public static final BitSet FOLLOW_58_in_math_term529 = new BitSet(new long[]{0x0008284890800000L});
    public static final BitSet FOLLOW_unary_expr_in_math_term533 = new BitSet(new long[]{0x0420000000000002L});
    public static final BitSet FOLLOW_timeblock_in_math_term541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_expr_in_unary_expr551 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_unary_expr554 = new BitSet(new long[]{0x0008280890800000L});
    public static final BitSet FOLLOW_postfix_expr_in_unary_expr557 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary_expr564 = new BitSet(new long[]{0x0008280890800000L});
    public static final BitSet FOLLOW_postfix_expr_in_unary_expr567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_postfix_expr578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_in_postfix_expr583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function595 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_function597 = new BitSet(new long[]{0x8018284890800000L});
    public static final BitSet FOLLOW_argument_expr_list_in_function599 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_function602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayblock_in_datetime630 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_timeblock_in_datetime632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_timeblock659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_timeblock661 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_TIME_in_timeblock665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_dayblock688 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DAY_in_dayblock690 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_55_in_dayblock694 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DAY_in_dayblock696 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_dayblock701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primary_expr720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_primary_expr725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primary_expr730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primary_expr736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_primary_expr741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MASTER_T_in_primary_expr746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_primary_expr752 = new BitSet(new long[]{0x8008284890800000L});
    public static final BitSet FOLLOW_expr_in_primary_expr753 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_primary_expr754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_argument_expr_list769 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_argument_expr_list773 = new BitSet(new long[]{0x8008284890800000L});
    public static final BitSet FOLLOW_expr_in_argument_expr_list775 = new BitSet(new long[]{0x0080000000000002L});

}