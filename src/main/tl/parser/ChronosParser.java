// $ANTLR 3.4 src/grammar/Chronos.g 2012-05-05 00:49:55
 
  package tl.parser; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ChronosParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "BLOCK", "BREAK_T", "CHAR", "COMMENT", "COND", "COURSELIST_T", "COURSE_T", "DATETIME", "DATETIME_T", "DAY", "DAYS", "DAYS_T", "DECL", "DOUBLE_T", "ELSE_T", "EQ", "ESC_SEQ", "EXPONENT", "FLOAT", "FOREACH_T", "FUNC", "GEQ", "HEX_DIGIT", "ID", "IF_T", "INST", "INT", "INT_T", "IN_T", "LEQ", "MASTER_T", "NEQ", "NEW_T", "NOT", "OCTAL_ESC", "OR", "PARAMS", "SCHEDULE_T", "STRING", "STRING_T", "TIME", "TIMEBLOCK_T", "TIMES", "TIME_T", "UNICODE_ESC", "WS", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "';'", "'<'", "'='", "'>'", "'['", "']'", "'{'", "'}'", "'~'"
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
    public static final int DAYS=15;
    public static final int DAYS_T=16;
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
    public String getGrammarFileName() { return "src/grammar/Chronos.g"; }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // src/grammar/Chronos.g:34:1: program : ( line )+ EOF !;
    public final ChronosParser.program_return program() throws RecognitionException {
        ChronosParser.program_return retval = new ChronosParser.program_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF2=null;
        ChronosParser.line_return line1 =null;


        CommonTree EOF2_tree=null;

        try {
            // src/grammar/Chronos.g:35:2: ( ( line )+ EOF !)
            // src/grammar/Chronos.g:35:4: ( line )+ EOF !
            {
            root_0 = (CommonTree)adaptor.nil();


            // src/grammar/Chronos.g:35:4: ( line )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==BREAK_T||(LA1_0 >= COURSELIST_T && LA1_0 <= COURSE_T)||LA1_0==DATETIME_T||LA1_0==DAYS_T||LA1_0==DOUBLE_T||(LA1_0 >= FLOAT && LA1_0 <= FOREACH_T)||(LA1_0 >= ID && LA1_0 <= IF_T)||(LA1_0 >= INT && LA1_0 <= INT_T)||LA1_0==NOT||(LA1_0 >= SCHEDULE_T && LA1_0 <= TIMEBLOCK_T)||LA1_0==TIME_T||LA1_0==51||LA1_0==59||LA1_0==63) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // src/grammar/Chronos.g:35:4: line
            	    {
            	    pushFollow(FOLLOW_line_in_program110);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program113); 

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
    // src/grammar/Chronos.g:37:1: line : ( declarator | stmt );
    public final ChronosParser.line_return line() throws RecognitionException {
        ChronosParser.line_return retval = new ChronosParser.line_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        ChronosParser.declarator_return declarator3 =null;

        ChronosParser.stmt_return stmt4 =null;



        try {
            // src/grammar/Chronos.g:38:2: ( declarator | stmt )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0 >= COURSELIST_T && LA2_0 <= COURSE_T)||LA2_0==DATETIME_T||LA2_0==DAYS_T||LA2_0==DOUBLE_T||LA2_0==INT_T||LA2_0==SCHEDULE_T||LA2_0==STRING_T||LA2_0==TIMEBLOCK_T||LA2_0==TIME_T) ) {
                alt2=1;
            }
            else if ( (LA2_0==BREAK_T||(LA2_0 >= FLOAT && LA2_0 <= FOREACH_T)||(LA2_0 >= ID && LA2_0 <= IF_T)||LA2_0==INT||LA2_0==NOT||LA2_0==STRING||LA2_0==TIME||LA2_0==51||LA2_0==59||LA2_0==63) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // src/grammar/Chronos.g:38:4: declarator
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_declarator_in_line124);
                    declarator3=declarator();

                    state._fsp--;

                    adaptor.addChild(root_0, declarator3.getTree());

                    }
                    break;
                case 2 :
                    // src/grammar/Chronos.g:39:4: stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_stmt_in_line129);
                    stmt4=stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, stmt4.getTree());

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
    // src/grammar/Chronos.g:41:1: declarator : ( type_specifier ID ';' -> ^( DECL type_specifier ID ) | type_specifier ID '=' expr ';' -> ^( INST ^( DECL type_specifier ID ) ^( '=' ID expr ) ) );
    public final ChronosParser.declarator_return declarator() throws RecognitionException {
        ChronosParser.declarator_return retval = new ChronosParser.declarator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID6=null;
        Token char_literal7=null;
        Token ID9=null;
        Token char_literal10=null;
        Token char_literal12=null;
        ChronosParser.type_specifier_return type_specifier5 =null;

        ChronosParser.type_specifier_return type_specifier8 =null;

        ChronosParser.expr_return expr11 =null;


        CommonTree ID6_tree=null;
        CommonTree char_literal7_tree=null;
        CommonTree ID9_tree=null;
        CommonTree char_literal10_tree=null;
        CommonTree char_literal12_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_type_specifier=new RewriteRuleSubtreeStream(adaptor,"rule type_specifier");
        try {
            // src/grammar/Chronos.g:43:2: ( type_specifier ID ';' -> ^( DECL type_specifier ID ) | type_specifier ID '=' expr ';' -> ^( INST ^( DECL type_specifier ID ) ^( '=' ID expr ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0 >= COURSELIST_T && LA3_0 <= COURSE_T)||LA3_0==DATETIME_T||LA3_0==DAYS_T||LA3_0==DOUBLE_T||LA3_0==INT_T||LA3_0==SCHEDULE_T||LA3_0==STRING_T||LA3_0==TIMEBLOCK_T||LA3_0==TIME_T) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==ID) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==59) ) {
                        alt3=1;
                    }
                    else if ( (LA3_2==61) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // src/grammar/Chronos.g:43:4: type_specifier ID ';'
                    {
                    pushFollow(FOLLOW_type_specifier_in_declarator140);
                    type_specifier5=type_specifier();

                    state._fsp--;

                    stream_type_specifier.add(type_specifier5.getTree());

                    ID6=(Token)match(input,ID,FOLLOW_ID_in_declarator142);  
                    stream_ID.add(ID6);


                    char_literal7=(Token)match(input,59,FOLLOW_59_in_declarator144);  
                    stream_59.add(char_literal7);


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
                    // 44:4: -> ^( DECL type_specifier ID )
                    {
                        // src/grammar/Chronos.g:44:7: ^( DECL type_specifier ID )
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
                    break;
                case 2 :
                    // src/grammar/Chronos.g:46:4: type_specifier ID '=' expr ';'
                    {
                    pushFollow(FOLLOW_type_specifier_in_declarator163);
                    type_specifier8=type_specifier();

                    state._fsp--;

                    stream_type_specifier.add(type_specifier8.getTree());

                    ID9=(Token)match(input,ID,FOLLOW_ID_in_declarator165);  
                    stream_ID.add(ID9);


                    char_literal10=(Token)match(input,61,FOLLOW_61_in_declarator167);  
                    stream_61.add(char_literal10);


                    pushFollow(FOLLOW_expr_in_declarator169);
                    expr11=expr();

                    state._fsp--;

                    stream_expr.add(expr11.getTree());

                    char_literal12=(Token)match(input,59,FOLLOW_59_in_declarator171);  
                    stream_59.add(char_literal12);


                    // AST REWRITE
                    // elements: ID, 61, type_specifier, expr, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 47:4: -> ^( INST ^( DECL type_specifier ID ) ^( '=' ID expr ) )
                    {
                        // src/grammar/Chronos.g:47:7: ^( INST ^( DECL type_specifier ID ) ^( '=' ID expr ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(INST, "INST")
                        , root_1);

                        // src/grammar/Chronos.g:47:14: ^( DECL type_specifier ID )
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

                        // src/grammar/Chronos.g:47:40: ^( '=' ID expr )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        stream_61.nextNode()
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
    // $ANTLR end "declarator"


    public static class stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt"
    // src/grammar/Chronos.g:49:1: stmt : ( expr ';' -> expr | selection_stmt | iteration_stmt | jump_stmt ';' -> jump_stmt | ';' !);
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
            // src/grammar/Chronos.g:49:5: ( expr ';' -> expr | selection_stmt | iteration_stmt | jump_stmt ';' -> jump_stmt | ';' !)
            int alt4=5;
            switch ( input.LA(1) ) {
            case FLOAT:
            case ID:
            case INT:
            case NOT:
            case STRING:
            case TIME:
            case 51:
            case 63:
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
            case 59:
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
                    // src/grammar/Chronos.g:49:7: expr ';'
                    {
                    pushFollow(FOLLOW_expr_in_stmt204);
                    expr13=expr();

                    state._fsp--;

                    stream_expr.add(expr13.getTree());

                    char_literal14=(Token)match(input,59,FOLLOW_59_in_stmt205);  
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
                    // 49:15: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // src/grammar/Chronos.g:50:4: selection_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_selection_stmt_in_stmt214);
                    selection_stmt15=selection_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, selection_stmt15.getTree());

                    }
                    break;
                case 3 :
                    // src/grammar/Chronos.g:51:4: iteration_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_iteration_stmt_in_stmt219);
                    iteration_stmt16=iteration_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, iteration_stmt16.getTree());

                    }
                    break;
                case 4 :
                    // src/grammar/Chronos.g:52:4: jump_stmt ';'
                    {
                    pushFollow(FOLLOW_jump_stmt_in_stmt224);
                    jump_stmt17=jump_stmt();

                    state._fsp--;

                    stream_jump_stmt.add(jump_stmt17.getTree());

                    char_literal18=(Token)match(input,59,FOLLOW_59_in_stmt225);  
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
                    // 52:17: -> jump_stmt
                    {
                        adaptor.addChild(root_0, stream_jump_stmt.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // src/grammar/Chronos.g:53:4: ';' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal19=(Token)match(input,59,FOLLOW_59_in_stmt234); 

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
    // src/grammar/Chronos.g:55:1: selection_stmt : IF_T expr '{' (a= line )* '}' ( ELSE_T '{' (b= line )* '}' )? -> ^( COND ^( IF_T expr ( $a)* ) ( ^( ELSE_T ( $b)* ) )? ) ;
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
            // src/grammar/Chronos.g:57:2: ( IF_T expr '{' (a= line )* '}' ( ELSE_T '{' (b= line )* '}' )? -> ^( COND ^( IF_T expr ( $a)* ) ( ^( ELSE_T ( $b)* ) )? ) )
            // src/grammar/Chronos.g:57:4: IF_T expr '{' (a= line )* '}' ( ELSE_T '{' (b= line )* '}' )?
            {
            IF_T20=(Token)match(input,IF_T,FOLLOW_IF_T_in_selection_stmt246);  
            stream_IF_T.add(IF_T20);


            pushFollow(FOLLOW_expr_in_selection_stmt248);
            expr21=expr();

            state._fsp--;

            stream_expr.add(expr21.getTree());

            char_literal22=(Token)match(input,65,FOLLOW_65_in_selection_stmt250);  
            stream_65.add(char_literal22);


            // src/grammar/Chronos.g:57:17: (a= line )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==BREAK_T||(LA5_0 >= COURSELIST_T && LA5_0 <= COURSE_T)||LA5_0==DATETIME_T||LA5_0==DAYS_T||LA5_0==DOUBLE_T||(LA5_0 >= FLOAT && LA5_0 <= FOREACH_T)||(LA5_0 >= ID && LA5_0 <= IF_T)||(LA5_0 >= INT && LA5_0 <= INT_T)||LA5_0==NOT||(LA5_0 >= SCHEDULE_T && LA5_0 <= TIMEBLOCK_T)||LA5_0==TIME_T||LA5_0==51||LA5_0==59||LA5_0==63) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // src/grammar/Chronos.g:57:18: a= line
            	    {
            	    pushFollow(FOLLOW_line_in_selection_stmt254);
            	    a=line();

            	    state._fsp--;

            	    stream_line.add(a.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            char_literal23=(Token)match(input,66,FOLLOW_66_in_selection_stmt258);  
            stream_66.add(char_literal23);


            // src/grammar/Chronos.g:57:31: ( ELSE_T '{' (b= line )* '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ELSE_T) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // src/grammar/Chronos.g:57:32: ELSE_T '{' (b= line )* '}'
                    {
                    ELSE_T24=(Token)match(input,ELSE_T,FOLLOW_ELSE_T_in_selection_stmt261);  
                    stream_ELSE_T.add(ELSE_T24);


                    char_literal25=(Token)match(input,65,FOLLOW_65_in_selection_stmt263);  
                    stream_65.add(char_literal25);


                    // src/grammar/Chronos.g:57:43: (b= line )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==BREAK_T||(LA6_0 >= COURSELIST_T && LA6_0 <= COURSE_T)||LA6_0==DATETIME_T||LA6_0==DAYS_T||LA6_0==DOUBLE_T||(LA6_0 >= FLOAT && LA6_0 <= FOREACH_T)||(LA6_0 >= ID && LA6_0 <= IF_T)||(LA6_0 >= INT && LA6_0 <= INT_T)||LA6_0==NOT||(LA6_0 >= SCHEDULE_T && LA6_0 <= TIMEBLOCK_T)||LA6_0==TIME_T||LA6_0==51||LA6_0==59||LA6_0==63) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // src/grammar/Chronos.g:57:44: b= line
                    	    {
                    	    pushFollow(FOLLOW_line_in_selection_stmt268);
                    	    b=line();

                    	    state._fsp--;

                    	    stream_line.add(b.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    char_literal26=(Token)match(input,66,FOLLOW_66_in_selection_stmt272);  
                    stream_66.add(char_literal26);


                    }
                    break;

            }


            // AST REWRITE
            // elements: IF_T, a, expr, ELSE_T, b
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
            // 58:4: -> ^( COND ^( IF_T expr ( $a)* ) ( ^( ELSE_T ( $b)* ) )? )
            {
                // src/grammar/Chronos.g:58:7: ^( COND ^( IF_T expr ( $a)* ) ( ^( ELSE_T ( $b)* ) )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COND, "COND")
                , root_1);

                // src/grammar/Chronos.g:58:14: ^( IF_T expr ( $a)* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_IF_T.nextNode()
                , root_2);

                adaptor.addChild(root_2, stream_expr.nextTree());

                // src/grammar/Chronos.g:58:27: ( $a)*
                while ( stream_a.hasNext() ) {
                    adaptor.addChild(root_2, stream_a.nextTree());

                }
                stream_a.reset();

                adaptor.addChild(root_1, root_2);
                }

                // src/grammar/Chronos.g:58:31: ( ^( ELSE_T ( $b)* ) )?
                if ( stream_ELSE_T.hasNext()||stream_b.hasNext() ) {
                    // src/grammar/Chronos.g:58:31: ^( ELSE_T ( $b)* )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot(
                    stream_ELSE_T.nextNode()
                    , root_2);

                    // src/grammar/Chronos.g:58:41: ( $b)*
                    while ( stream_b.hasNext() ) {
                        adaptor.addChild(root_2, stream_b.nextTree());

                    }
                    stream_b.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_ELSE_T.reset();
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
    // $ANTLR end "selection_stmt"


    public static class iteration_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "iteration_stmt"
    // src/grammar/Chronos.g:60:1: iteration_stmt : FOREACH_T COURSE_T element= ID IN_T list= ID '{' ( line )* '}' -> ^( FOREACH_T ^( IN_T $element $list) ^( BLOCK ( line )* ) ) ;
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
            // src/grammar/Chronos.g:62:2: ( FOREACH_T COURSE_T element= ID IN_T list= ID '{' ( line )* '}' -> ^( FOREACH_T ^( IN_T $element $list) ^( BLOCK ( line )* ) ) )
            // src/grammar/Chronos.g:62:4: FOREACH_T COURSE_T element= ID IN_T list= ID '{' ( line )* '}'
            {
            FOREACH_T27=(Token)match(input,FOREACH_T,FOLLOW_FOREACH_T_in_iteration_stmt314);  
            stream_FOREACH_T.add(FOREACH_T27);


            COURSE_T28=(Token)match(input,COURSE_T,FOLLOW_COURSE_T_in_iteration_stmt316);  
            stream_COURSE_T.add(COURSE_T28);


            element=(Token)match(input,ID,FOLLOW_ID_in_iteration_stmt320);  
            stream_ID.add(element);


            IN_T29=(Token)match(input,IN_T,FOLLOW_IN_T_in_iteration_stmt322);  
            stream_IN_T.add(IN_T29);


            list=(Token)match(input,ID,FOLLOW_ID_in_iteration_stmt326);  
            stream_ID.add(list);


            char_literal30=(Token)match(input,65,FOLLOW_65_in_iteration_stmt328);  
            stream_65.add(char_literal30);


            // src/grammar/Chronos.g:62:51: ( line )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==BREAK_T||(LA8_0 >= COURSELIST_T && LA8_0 <= COURSE_T)||LA8_0==DATETIME_T||LA8_0==DAYS_T||LA8_0==DOUBLE_T||(LA8_0 >= FLOAT && LA8_0 <= FOREACH_T)||(LA8_0 >= ID && LA8_0 <= IF_T)||(LA8_0 >= INT && LA8_0 <= INT_T)||LA8_0==NOT||(LA8_0 >= SCHEDULE_T && LA8_0 <= TIMEBLOCK_T)||LA8_0==TIME_T||LA8_0==51||LA8_0==59||LA8_0==63) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // src/grammar/Chronos.g:62:51: line
            	    {
            	    pushFollow(FOLLOW_line_in_iteration_stmt330);
            	    line31=line();

            	    state._fsp--;

            	    stream_line.add(line31.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            char_literal32=(Token)match(input,66,FOLLOW_66_in_iteration_stmt333);  
            stream_66.add(char_literal32);


            // AST REWRITE
            // elements: list, FOREACH_T, element, IN_T, line
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
            // 63:4: -> ^( FOREACH_T ^( IN_T $element $list) ^( BLOCK ( line )* ) )
            {
                // src/grammar/Chronos.g:63:7: ^( FOREACH_T ^( IN_T $element $list) ^( BLOCK ( line )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_FOREACH_T.nextNode()
                , root_1);

                // src/grammar/Chronos.g:63:19: ^( IN_T $element $list)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_IN_T.nextNode()
                , root_2);

                adaptor.addChild(root_2, stream_element.nextNode());

                adaptor.addChild(root_2, stream_list.nextNode());

                adaptor.addChild(root_1, root_2);
                }

                // src/grammar/Chronos.g:63:42: ^( BLOCK ( line )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(BLOCK, "BLOCK")
                , root_2);

                // src/grammar/Chronos.g:63:50: ( line )*
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
    // src/grammar/Chronos.g:65:1: jump_stmt : BREAK_T ;
    public final ChronosParser.jump_stmt_return jump_stmt() throws RecognitionException {
        ChronosParser.jump_stmt_return retval = new ChronosParser.jump_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BREAK_T33=null;

        CommonTree BREAK_T33_tree=null;

        try {
            // src/grammar/Chronos.g:67:2: ( BREAK_T )
            // src/grammar/Chronos.g:67:4: BREAK_T
            {
            root_0 = (CommonTree)adaptor.nil();


            BREAK_T33=(Token)match(input,BREAK_T,FOLLOW_BREAK_T_in_jump_stmt372); 
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
    // src/grammar/Chronos.g:69:1: expr : ( and_expr ( OR ^ and_expr )* | assignment_expr );
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
            // src/grammar/Chronos.g:71:2: ( and_expr ( OR ^ and_expr )* | assignment_expr )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==FLOAT||LA10_0==INT||LA10_0==NOT||LA10_0==STRING||LA10_0==TIME||LA10_0==51||LA10_0==63) ) {
                alt10=1;
            }
            else if ( (LA10_0==ID) ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==61) ) {
                    alt10=2;
                }
                else if ( (LA10_2==AND||LA10_2==EQ||LA10_2==GEQ||LA10_2==LEQ||LA10_2==NEQ||LA10_2==OR||(LA10_2 >= 51 && LA10_2 <= 60)||LA10_2==62||LA10_2==65) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // src/grammar/Chronos.g:71:4: and_expr ( OR ^ and_expr )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_and_expr_in_expr383);
                    and_expr34=and_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, and_expr34.getTree());

                    // src/grammar/Chronos.g:71:13: ( OR ^ and_expr )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==OR) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // src/grammar/Chronos.g:71:14: OR ^ and_expr
                    	    {
                    	    OR35=(Token)match(input,OR,FOLLOW_OR_in_expr386); 
                    	    OR35_tree = 
                    	    (CommonTree)adaptor.create(OR35)
                    	    ;
                    	    root_0 = (CommonTree)adaptor.becomeRoot(OR35_tree, root_0);


                    	    pushFollow(FOLLOW_and_expr_in_expr389);
                    	    and_expr36=and_expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, and_expr36.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // src/grammar/Chronos.g:72:4: assignment_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_assignment_expr_in_expr396);
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
    // src/grammar/Chronos.g:74:1: assignment_expr : ID '=' ^ expr ;
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
            // src/grammar/Chronos.g:76:2: ( ID '=' ^ expr )
            // src/grammar/Chronos.g:76:4: ID '=' ^ expr
            {
            root_0 = (CommonTree)adaptor.nil();


            ID38=(Token)match(input,ID,FOLLOW_ID_in_assignment_expr407); 
            ID38_tree = 
            (CommonTree)adaptor.create(ID38)
            ;
            adaptor.addChild(root_0, ID38_tree);


            char_literal39=(Token)match(input,61,FOLLOW_61_in_assignment_expr409); 
            char_literal39_tree = 
            (CommonTree)adaptor.create(char_literal39)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(char_literal39_tree, root_0);


            pushFollow(FOLLOW_expr_in_assignment_expr412);
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
    // src/grammar/Chronos.g:78:1: and_expr : equiv_expr ( AND ^ equiv_expr )* ;
    public final ChronosParser.and_expr_return and_expr() throws RecognitionException {
        ChronosParser.and_expr_return retval = new ChronosParser.and_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AND42=null;
        ChronosParser.equiv_expr_return equiv_expr41 =null;

        ChronosParser.equiv_expr_return equiv_expr43 =null;


        CommonTree AND42_tree=null;

        try {
            // src/grammar/Chronos.g:80:2: ( equiv_expr ( AND ^ equiv_expr )* )
            // src/grammar/Chronos.g:80:4: equiv_expr ( AND ^ equiv_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_equiv_expr_in_and_expr423);
            equiv_expr41=equiv_expr();

            state._fsp--;

            adaptor.addChild(root_0, equiv_expr41.getTree());

            // src/grammar/Chronos.g:80:15: ( AND ^ equiv_expr )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==AND) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // src/grammar/Chronos.g:80:16: AND ^ equiv_expr
            	    {
            	    AND42=(Token)match(input,AND,FOLLOW_AND_in_and_expr426); 
            	    AND42_tree = 
            	    (CommonTree)adaptor.create(AND42)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(AND42_tree, root_0);


            	    pushFollow(FOLLOW_equiv_expr_in_and_expr429);
            	    equiv_expr43=equiv_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, equiv_expr43.getTree());

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
    // src/grammar/Chronos.g:82:1: equiv_expr : rel_expr ( ( EQ ^| NEQ ^) rel_expr )* ;
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
            // src/grammar/Chronos.g:84:2: ( rel_expr ( ( EQ ^| NEQ ^) rel_expr )* )
            // src/grammar/Chronos.g:84:4: rel_expr ( ( EQ ^| NEQ ^) rel_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_rel_expr_in_equiv_expr442);
            rel_expr44=rel_expr();

            state._fsp--;

            adaptor.addChild(root_0, rel_expr44.getTree());

            // src/grammar/Chronos.g:84:13: ( ( EQ ^| NEQ ^) rel_expr )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==EQ||LA13_0==NEQ) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // src/grammar/Chronos.g:84:15: ( EQ ^| NEQ ^) rel_expr
            	    {
            	    // src/grammar/Chronos.g:84:15: ( EQ ^| NEQ ^)
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
            	            // src/grammar/Chronos.g:84:16: EQ ^
            	            {
            	            EQ45=(Token)match(input,EQ,FOLLOW_EQ_in_equiv_expr447); 
            	            EQ45_tree = 
            	            (CommonTree)adaptor.create(EQ45)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(EQ45_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/grammar/Chronos.g:84:22: NEQ ^
            	            {
            	            NEQ46=(Token)match(input,NEQ,FOLLOW_NEQ_in_equiv_expr452); 
            	            NEQ46_tree = 
            	            (CommonTree)adaptor.create(NEQ46)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(NEQ46_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_rel_expr_in_equiv_expr456);
            	    rel_expr47=rel_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, rel_expr47.getTree());

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
    // src/grammar/Chronos.g:86:1: rel_expr : ( math_expr ( ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr )* | datetime );
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
            // src/grammar/Chronos.g:88:2: ( math_expr ( ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr )* | datetime )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==FLOAT||LA16_0==ID||LA16_0==INT||LA16_0==NOT||LA16_0==STRING||LA16_0==TIME||LA16_0==51) ) {
                alt16=1;
            }
            else if ( (LA16_0==63) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // src/grammar/Chronos.g:88:4: math_expr ( ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_math_expr_in_rel_expr470);
                    math_expr48=math_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, math_expr48.getTree());

                    // src/grammar/Chronos.g:88:14: ( ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==GEQ||LA15_0==LEQ||LA15_0==60||LA15_0==62) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // src/grammar/Chronos.g:88:16: ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr
                    	    {
                    	    // src/grammar/Chronos.g:88:16: ( '<' ^| '>' ^| GEQ ^| LEQ ^)
                    	    int alt14=4;
                    	    switch ( input.LA(1) ) {
                    	    case 60:
                    	        {
                    	        alt14=1;
                    	        }
                    	        break;
                    	    case 62:
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
                    	            // src/grammar/Chronos.g:88:17: '<' ^
                    	            {
                    	            char_literal49=(Token)match(input,60,FOLLOW_60_in_rel_expr475); 
                    	            char_literal49_tree = 
                    	            (CommonTree)adaptor.create(char_literal49)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal49_tree, root_0);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // src/grammar/Chronos.g:88:24: '>' ^
                    	            {
                    	            char_literal50=(Token)match(input,62,FOLLOW_62_in_rel_expr480); 
                    	            char_literal50_tree = 
                    	            (CommonTree)adaptor.create(char_literal50)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal50_tree, root_0);


                    	            }
                    	            break;
                    	        case 3 :
                    	            // src/grammar/Chronos.g:88:31: GEQ ^
                    	            {
                    	            GEQ51=(Token)match(input,GEQ,FOLLOW_GEQ_in_rel_expr485); 
                    	            GEQ51_tree = 
                    	            (CommonTree)adaptor.create(GEQ51)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(GEQ51_tree, root_0);


                    	            }
                    	            break;
                    	        case 4 :
                    	            // src/grammar/Chronos.g:88:38: LEQ ^
                    	            {
                    	            LEQ52=(Token)match(input,LEQ,FOLLOW_LEQ_in_rel_expr490); 
                    	            LEQ52_tree = 
                    	            (CommonTree)adaptor.create(LEQ52)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(LEQ52_tree, root_0);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_math_expr_in_rel_expr494);
                    	    math_expr53=math_expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, math_expr53.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // src/grammar/Chronos.g:89:4: datetime
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_datetime_in_rel_expr502);
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
    // src/grammar/Chronos.g:91:1: math_expr : math_term ( ( '+' ^| '-' ^) math_term )* ;
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
            // src/grammar/Chronos.g:93:2: ( math_term ( ( '+' ^| '-' ^) math_term )* )
            // src/grammar/Chronos.g:93:4: math_term ( ( '+' ^| '-' ^) math_term )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_math_term_in_math_expr513);
            math_term55=math_term();

            state._fsp--;

            adaptor.addChild(root_0, math_term55.getTree());

            // src/grammar/Chronos.g:93:14: ( ( '+' ^| '-' ^) math_term )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==54||LA18_0==56) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // src/grammar/Chronos.g:93:16: ( '+' ^| '-' ^) math_term
            	    {
            	    // src/grammar/Chronos.g:93:16: ( '+' ^| '-' ^)
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==54) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==56) ) {
            	        alt17=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // src/grammar/Chronos.g:93:17: '+' ^
            	            {
            	            char_literal56=(Token)match(input,54,FOLLOW_54_in_math_expr518); 
            	            char_literal56_tree = 
            	            (CommonTree)adaptor.create(char_literal56)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal56_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // src/grammar/Chronos.g:93:24: '-' ^
            	            {
            	            char_literal57=(Token)match(input,56,FOLLOW_56_in_math_expr523); 
            	            char_literal57_tree = 
            	            (CommonTree)adaptor.create(char_literal57)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal57_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_math_term_in_math_expr527);
            	    math_term58=math_term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, math_term58.getTree());

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
    // src/grammar/Chronos.g:95:1: math_term : ( unary_expr ( ( '*' ^| '/' ^) unary_expr )* | timeblock );
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
            // src/grammar/Chronos.g:97:2: ( unary_expr ( ( '*' ^| '/' ^) unary_expr )* | timeblock )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==FLOAT||LA21_0==ID||LA21_0==INT||LA21_0==NOT||LA21_0==STRING||LA21_0==51) ) {
                alt21=1;
            }
            else if ( (LA21_0==TIME) ) {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==67) ) {
                    alt21=2;
                }
                else if ( (LA21_2==AND||LA21_2==EQ||LA21_2==GEQ||LA21_2==LEQ||LA21_2==NEQ||LA21_2==OR||(LA21_2 >= 51 && LA21_2 <= 60)||LA21_2==62||LA21_2==65) ) {
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
                    // src/grammar/Chronos.g:97:4: unary_expr ( ( '*' ^| '/' ^) unary_expr )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_unary_expr_in_math_term541);
                    unary_expr59=unary_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, unary_expr59.getTree());

                    // src/grammar/Chronos.g:97:15: ( ( '*' ^| '/' ^) unary_expr )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==53||LA20_0==58) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // src/grammar/Chronos.g:97:17: ( '*' ^| '/' ^) unary_expr
                    	    {
                    	    // src/grammar/Chronos.g:97:17: ( '*' ^| '/' ^)
                    	    int alt19=2;
                    	    int LA19_0 = input.LA(1);

                    	    if ( (LA19_0==53) ) {
                    	        alt19=1;
                    	    }
                    	    else if ( (LA19_0==58) ) {
                    	        alt19=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 19, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt19) {
                    	        case 1 :
                    	            // src/grammar/Chronos.g:97:18: '*' ^
                    	            {
                    	            char_literal60=(Token)match(input,53,FOLLOW_53_in_math_term546); 
                    	            char_literal60_tree = 
                    	            (CommonTree)adaptor.create(char_literal60)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal60_tree, root_0);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // src/grammar/Chronos.g:97:25: '/' ^
                    	            {
                    	            char_literal61=(Token)match(input,58,FOLLOW_58_in_math_term551); 
                    	            char_literal61_tree = 
                    	            (CommonTree)adaptor.create(char_literal61)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal61_tree, root_0);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_unary_expr_in_math_term555);
                    	    unary_expr62=unary_expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, unary_expr62.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // src/grammar/Chronos.g:98:4: timeblock
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_timeblock_in_math_term563);
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
    // src/grammar/Chronos.g:100:1: unary_expr : ( postfix_expr ( '.' ^ postfix_expr )* | NOT ^ postfix_expr );
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
            // src/grammar/Chronos.g:101:2: ( postfix_expr ( '.' ^ postfix_expr )* | NOT ^ postfix_expr )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==FLOAT||LA23_0==ID||LA23_0==INT||LA23_0==STRING||LA23_0==TIME||LA23_0==51) ) {
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
                    // src/grammar/Chronos.g:101:4: postfix_expr ( '.' ^ postfix_expr )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_postfix_expr_in_unary_expr573);
                    postfix_expr64=postfix_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, postfix_expr64.getTree());

                    // src/grammar/Chronos.g:101:17: ( '.' ^ postfix_expr )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==57) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // src/grammar/Chronos.g:101:18: '.' ^ postfix_expr
                    	    {
                    	    char_literal65=(Token)match(input,57,FOLLOW_57_in_unary_expr576); 
                    	    char_literal65_tree = 
                    	    (CommonTree)adaptor.create(char_literal65)
                    	    ;
                    	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal65_tree, root_0);


                    	    pushFollow(FOLLOW_postfix_expr_in_unary_expr579);
                    	    postfix_expr66=postfix_expr();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, postfix_expr66.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // src/grammar/Chronos.g:102:4: NOT ^ postfix_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    NOT67=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expr586); 
                    NOT67_tree = 
                    (CommonTree)adaptor.create(NOT67)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(NOT67_tree, root_0);


                    pushFollow(FOLLOW_postfix_expr_in_unary_expr589);
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
    // src/grammar/Chronos.g:104:1: postfix_expr : primary_expr ( function_parens )? -> ^( primary_expr ( function_parens )? ) ;
    public final ChronosParser.postfix_expr_return postfix_expr() throws RecognitionException {
        ChronosParser.postfix_expr_return retval = new ChronosParser.postfix_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        ChronosParser.primary_expr_return primary_expr69 =null;

        ChronosParser.function_parens_return function_parens70 =null;


        RewriteRuleSubtreeStream stream_function_parens=new RewriteRuleSubtreeStream(adaptor,"rule function_parens");
        RewriteRuleSubtreeStream stream_primary_expr=new RewriteRuleSubtreeStream(adaptor,"rule primary_expr");
        try {
            // src/grammar/Chronos.g:106:2: ( primary_expr ( function_parens )? -> ^( primary_expr ( function_parens )? ) )
            // src/grammar/Chronos.g:106:4: primary_expr ( function_parens )?
            {
            pushFollow(FOLLOW_primary_expr_in_postfix_expr600);
            primary_expr69=primary_expr();

            state._fsp--;

            stream_primary_expr.add(primary_expr69.getTree());

            // src/grammar/Chronos.g:106:17: ( function_parens )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==51) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // src/grammar/Chronos.g:106:17: function_parens
                    {
                    pushFollow(FOLLOW_function_parens_in_postfix_expr602);
                    function_parens70=function_parens();

                    state._fsp--;

                    stream_function_parens.add(function_parens70.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: primary_expr, function_parens
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 107:3: -> ^( primary_expr ( function_parens )? )
            {
                // src/grammar/Chronos.g:107:6: ^( primary_expr ( function_parens )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_primary_expr.nextNode(), root_1);

                // src/grammar/Chronos.g:107:21: ( function_parens )?
                if ( stream_function_parens.hasNext() ) {
                    adaptor.addChild(root_1, stream_function_parens.nextTree());

                }
                stream_function_parens.reset();

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
    // $ANTLR end "postfix_expr"


    public static class function_parens_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_parens"
    // src/grammar/Chronos.g:109:1: function_parens : '(' ( argument_expr_list )? ')' -> ^( PARAMS ( argument_expr_list )? ) ;
    public final ChronosParser.function_parens_return function_parens() throws RecognitionException {
        ChronosParser.function_parens_return retval = new ChronosParser.function_parens_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal71=null;
        Token char_literal73=null;
        ChronosParser.argument_expr_list_return argument_expr_list72 =null;


        CommonTree char_literal71_tree=null;
        CommonTree char_literal73_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_argument_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule argument_expr_list");
        try {
            // src/grammar/Chronos.g:111:2: ( '(' ( argument_expr_list )? ')' -> ^( PARAMS ( argument_expr_list )? ) )
            // src/grammar/Chronos.g:111:4: '(' ( argument_expr_list )? ')'
            {
            char_literal71=(Token)match(input,51,FOLLOW_51_in_function_parens625);  
            stream_51.add(char_literal71);


            // src/grammar/Chronos.g:111:8: ( argument_expr_list )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==FLOAT||LA25_0==ID||LA25_0==INT||LA25_0==NOT||LA25_0==STRING||LA25_0==TIME||LA25_0==51||LA25_0==63) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // src/grammar/Chronos.g:111:8: argument_expr_list
                    {
                    pushFollow(FOLLOW_argument_expr_list_in_function_parens627);
                    argument_expr_list72=argument_expr_list();

                    state._fsp--;

                    stream_argument_expr_list.add(argument_expr_list72.getTree());

                    }
                    break;

            }


            char_literal73=(Token)match(input,52,FOLLOW_52_in_function_parens630);  
            stream_52.add(char_literal73);


            // AST REWRITE
            // elements: argument_expr_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 112:3: -> ^( PARAMS ( argument_expr_list )? )
            {
                // src/grammar/Chronos.g:112:6: ^( PARAMS ( argument_expr_list )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // src/grammar/Chronos.g:112:15: ( argument_expr_list )?
                if ( stream_argument_expr_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_argument_expr_list.nextTree());

                }
                stream_argument_expr_list.reset();

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
    // $ANTLR end "function_parens"


    public static class datetime_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "datetime"
    // src/grammar/Chronos.g:114:1: datetime : dayblock timeblock -> ^( DATETIME dayblock timeblock ) ;
    public final ChronosParser.datetime_return datetime() throws RecognitionException {
        ChronosParser.datetime_return retval = new ChronosParser.datetime_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        ChronosParser.dayblock_return dayblock74 =null;

        ChronosParser.timeblock_return timeblock75 =null;


        RewriteRuleSubtreeStream stream_timeblock=new RewriteRuleSubtreeStream(adaptor,"rule timeblock");
        RewriteRuleSubtreeStream stream_dayblock=new RewriteRuleSubtreeStream(adaptor,"rule dayblock");
        try {
            // src/grammar/Chronos.g:116:2: ( dayblock timeblock -> ^( DATETIME dayblock timeblock ) )
            // src/grammar/Chronos.g:116:4: dayblock timeblock
            {
            pushFollow(FOLLOW_dayblock_in_datetime652);
            dayblock74=dayblock();

            state._fsp--;

            stream_dayblock.add(dayblock74.getTree());

            pushFollow(FOLLOW_timeblock_in_datetime654);
            timeblock75=timeblock();

            state._fsp--;

            stream_timeblock.add(timeblock75.getTree());

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
            // 117:4: -> ^( DATETIME dayblock timeblock )
            {
                // src/grammar/Chronos.g:117:7: ^( DATETIME dayblock timeblock )
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
    // src/grammar/Chronos.g:119:1: timeblock : a= TIME '~' b= TIME -> ^( TIMES $a $b) ;
    public final ChronosParser.timeblock_return timeblock() throws RecognitionException {
        ChronosParser.timeblock_return retval = new ChronosParser.timeblock_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token a=null;
        Token b=null;
        Token char_literal76=null;

        CommonTree a_tree=null;
        CommonTree b_tree=null;
        CommonTree char_literal76_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_TIME=new RewriteRuleTokenStream(adaptor,"token TIME");

        try {
            // src/grammar/Chronos.g:121:2: (a= TIME '~' b= TIME -> ^( TIMES $a $b) )
            // src/grammar/Chronos.g:121:4: a= TIME '~' b= TIME
            {
            a=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock681);  
            stream_TIME.add(a);


            char_literal76=(Token)match(input,67,FOLLOW_67_in_timeblock683);  
            stream_67.add(char_literal76);


            b=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock687);  
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
            // 121:22: -> ^( TIMES $a $b)
            {
                // src/grammar/Chronos.g:121:25: ^( TIMES $a $b)
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
    // src/grammar/Chronos.g:123:1: dayblock : '[' DAY ( ',' DAY )* ']' -> ^( DAYS ( DAY )+ ) ;
    public final ChronosParser.dayblock_return dayblock() throws RecognitionException {
        ChronosParser.dayblock_return retval = new ChronosParser.dayblock_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal77=null;
        Token DAY78=null;
        Token char_literal79=null;
        Token DAY80=null;
        Token char_literal81=null;

        CommonTree char_literal77_tree=null;
        CommonTree DAY78_tree=null;
        CommonTree char_literal79_tree=null;
        CommonTree DAY80_tree=null;
        CommonTree char_literal81_tree=null;
        RewriteRuleTokenStream stream_DAY=new RewriteRuleTokenStream(adaptor,"token DAY");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");

        try {
            // src/grammar/Chronos.g:125:2: ( '[' DAY ( ',' DAY )* ']' -> ^( DAYS ( DAY )+ ) )
            // src/grammar/Chronos.g:125:4: '[' DAY ( ',' DAY )* ']'
            {
            char_literal77=(Token)match(input,63,FOLLOW_63_in_dayblock710);  
            stream_63.add(char_literal77);


            DAY78=(Token)match(input,DAY,FOLLOW_DAY_in_dayblock712);  
            stream_DAY.add(DAY78);


            // src/grammar/Chronos.g:125:12: ( ',' DAY )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==55) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // src/grammar/Chronos.g:125:14: ',' DAY
            	    {
            	    char_literal79=(Token)match(input,55,FOLLOW_55_in_dayblock716);  
            	    stream_55.add(char_literal79);


            	    DAY80=(Token)match(input,DAY,FOLLOW_DAY_in_dayblock718);  
            	    stream_DAY.add(DAY80);


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            char_literal81=(Token)match(input,64,FOLLOW_64_in_dayblock723);  
            stream_64.add(char_literal81);


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
            // 125:29: -> ^( DAYS ( DAY )+ )
            {
                // src/grammar/Chronos.g:125:32: ^( DAYS ( DAY )+ )
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
    // src/grammar/Chronos.g:127:1: primary_expr : ( constant | ID | STRING | TIME | '(' expr ')' -> expr );
    public final ChronosParser.primary_expr_return primary_expr() throws RecognitionException {
        ChronosParser.primary_expr_return retval = new ChronosParser.primary_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID83=null;
        Token STRING84=null;
        Token TIME85=null;
        Token char_literal86=null;
        Token char_literal88=null;
        ChronosParser.constant_return constant82 =null;

        ChronosParser.expr_return expr87 =null;


        CommonTree ID83_tree=null;
        CommonTree STRING84_tree=null;
        CommonTree TIME85_tree=null;
        CommonTree char_literal86_tree=null;
        CommonTree char_literal88_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // src/grammar/Chronos.g:128:2: ( constant | ID | STRING | TIME | '(' expr ')' -> expr )
            int alt27=5;
            switch ( input.LA(1) ) {
            case FLOAT:
            case INT:
                {
                alt27=1;
                }
                break;
            case ID:
                {
                alt27=2;
                }
                break;
            case STRING:
                {
                alt27=3;
                }
                break;
            case TIME:
                {
                alt27=4;
                }
                break;
            case 51:
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
                    // src/grammar/Chronos.g:128:4: constant
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_constant_in_primary_expr742);
                    constant82=constant();

                    state._fsp--;

                    adaptor.addChild(root_0, constant82.getTree());

                    }
                    break;
                case 2 :
                    // src/grammar/Chronos.g:129:4: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ID83=(Token)match(input,ID,FOLLOW_ID_in_primary_expr747); 
                    ID83_tree = 
                    (CommonTree)adaptor.create(ID83)
                    ;
                    adaptor.addChild(root_0, ID83_tree);


                    }
                    break;
                case 3 :
                    // src/grammar/Chronos.g:130:4: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    STRING84=(Token)match(input,STRING,FOLLOW_STRING_in_primary_expr752); 
                    STRING84_tree = 
                    (CommonTree)adaptor.create(STRING84)
                    ;
                    adaptor.addChild(root_0, STRING84_tree);


                    }
                    break;
                case 4 :
                    // src/grammar/Chronos.g:131:4: TIME
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    TIME85=(Token)match(input,TIME,FOLLOW_TIME_in_primary_expr757); 
                    TIME85_tree = 
                    (CommonTree)adaptor.create(TIME85)
                    ;
                    adaptor.addChild(root_0, TIME85_tree);


                    }
                    break;
                case 5 :
                    // src/grammar/Chronos.g:132:4: '(' expr ')'
                    {
                    char_literal86=(Token)match(input,51,FOLLOW_51_in_primary_expr762);  
                    stream_51.add(char_literal86);


                    pushFollow(FOLLOW_expr_in_primary_expr763);
                    expr87=expr();

                    state._fsp--;

                    stream_expr.add(expr87.getTree());

                    char_literal88=(Token)match(input,52,FOLLOW_52_in_primary_expr764);  
                    stream_52.add(char_literal88);


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
    // src/grammar/Chronos.g:134:1: argument_expr_list : ( expr ) ( ',' expr )* -> ( expr )+ ;
    public final ChronosParser.argument_expr_list_return argument_expr_list() throws RecognitionException {
        ChronosParser.argument_expr_list_return retval = new ChronosParser.argument_expr_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal90=null;
        ChronosParser.expr_return expr89 =null;

        ChronosParser.expr_return expr91 =null;


        CommonTree char_literal90_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // src/grammar/Chronos.g:135:2: ( ( expr ) ( ',' expr )* -> ( expr )+ )
            // src/grammar/Chronos.g:135:4: ( expr ) ( ',' expr )*
            {
            // src/grammar/Chronos.g:135:4: ( expr )
            // src/grammar/Chronos.g:135:5: expr
            {
            pushFollow(FOLLOW_expr_in_argument_expr_list779);
            expr89=expr();

            state._fsp--;

            stream_expr.add(expr89.getTree());

            }


            // src/grammar/Chronos.g:135:11: ( ',' expr )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==55) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // src/grammar/Chronos.g:135:12: ',' expr
            	    {
            	    char_literal90=(Token)match(input,55,FOLLOW_55_in_argument_expr_list783);  
            	    stream_55.add(char_literal90);


            	    pushFollow(FOLLOW_expr_in_argument_expr_list785);
            	    expr91=expr();

            	    state._fsp--;

            	    stream_expr.add(expr91.getTree());

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


    public static class constant_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constant"
    // src/grammar/Chronos.g:137:1: constant : ( INT | FLOAT );
    public final ChronosParser.constant_return constant() throws RecognitionException {
        ChronosParser.constant_return retval = new ChronosParser.constant_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set92=null;

        CommonTree set92_tree=null;

        try {
            // src/grammar/Chronos.g:138:2: ( INT | FLOAT )
            // src/grammar/Chronos.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set92=(Token)input.LT(1);

            if ( input.LA(1)==FLOAT||input.LA(1)==INT ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set92)
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
    // $ANTLR end "constant"


    public static class type_specifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_specifier"
    // src/grammar/Chronos.g:141:1: type_specifier : ( INT_T | DOUBLE_T | DAYS_T | TIME_T | STRING_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T );
    public final ChronosParser.type_specifier_return type_specifier() throws RecognitionException {
        ChronosParser.type_specifier_return retval = new ChronosParser.type_specifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set93=null;

        CommonTree set93_tree=null;

        try {
            // src/grammar/Chronos.g:142:2: ( INT_T | DOUBLE_T | DAYS_T | TIME_T | STRING_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T )
            // src/grammar/Chronos.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set93=(Token)input.LT(1);

            if ( (input.LA(1) >= COURSELIST_T && input.LA(1) <= COURSE_T)||input.LA(1)==DATETIME_T||input.LA(1)==DAYS_T||input.LA(1)==DOUBLE_T||input.LA(1)==INT_T||input.LA(1)==SCHEDULE_T||input.LA(1)==STRING_T||input.LA(1)==TIMEBLOCK_T||input.LA(1)==TIME_T ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set93)
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


 

    public static final BitSet FOLLOW_line_in_program110 = new BitSet(new long[]{0x88097C41B1852C40L});
    public static final BitSet FOLLOW_EOF_in_program113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_line124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_line129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_declarator140 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_declarator142 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_declarator144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_declarator163 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_declarator165 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_declarator167 = new BitSet(new long[]{0x8008284090800000L});
    public static final BitSet FOLLOW_expr_in_declarator169 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_declarator171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt204 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_stmt205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_stmt_in_stmt214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_stmt_in_stmt219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_stmt_in_stmt224 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_stmt225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_stmt234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_T_in_selection_stmt246 = new BitSet(new long[]{0x8008284090800000L});
    public static final BitSet FOLLOW_expr_in_selection_stmt248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_selection_stmt250 = new BitSet(new long[]{0x88097C41B1852C40L,0x0000000000000004L});
    public static final BitSet FOLLOW_line_in_selection_stmt254 = new BitSet(new long[]{0x88097C41B1852C40L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_selection_stmt258 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ELSE_T_in_selection_stmt261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_selection_stmt263 = new BitSet(new long[]{0x88097C41B1852C40L,0x0000000000000004L});
    public static final BitSet FOLLOW_line_in_selection_stmt268 = new BitSet(new long[]{0x88097C41B1852C40L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_selection_stmt272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREACH_T_in_iteration_stmt314 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COURSE_T_in_iteration_stmt316 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_iteration_stmt320 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_IN_T_in_iteration_stmt322 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_iteration_stmt326 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_iteration_stmt328 = new BitSet(new long[]{0x88097C41B1852C40L,0x0000000000000004L});
    public static final BitSet FOLLOW_line_in_iteration_stmt330 = new BitSet(new long[]{0x88097C41B1852C40L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_iteration_stmt333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_T_in_jump_stmt372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_expr_in_expr383 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_OR_in_expr386 = new BitSet(new long[]{0x8008284090800000L});
    public static final BitSet FOLLOW_and_expr_in_expr389 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_assignment_expr_in_expr396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment_expr407 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_assignment_expr409 = new BitSet(new long[]{0x8008284090800000L});
    public static final BitSet FOLLOW_expr_in_assignment_expr412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equiv_expr_in_and_expr423 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_and_expr426 = new BitSet(new long[]{0x8008284090800000L});
    public static final BitSet FOLLOW_equiv_expr_in_and_expr429 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rel_expr_in_equiv_expr442 = new BitSet(new long[]{0x0000001000100002L});
    public static final BitSet FOLLOW_EQ_in_equiv_expr447 = new BitSet(new long[]{0x8008284090800000L});
    public static final BitSet FOLLOW_NEQ_in_equiv_expr452 = new BitSet(new long[]{0x8008284090800000L});
    public static final BitSet FOLLOW_rel_expr_in_equiv_expr456 = new BitSet(new long[]{0x0000001000100002L});
    public static final BitSet FOLLOW_math_expr_in_rel_expr470 = new BitSet(new long[]{0x5000000404000002L});
    public static final BitSet FOLLOW_60_in_rel_expr475 = new BitSet(new long[]{0x0008284090800000L});
    public static final BitSet FOLLOW_62_in_rel_expr480 = new BitSet(new long[]{0x0008284090800000L});
    public static final BitSet FOLLOW_GEQ_in_rel_expr485 = new BitSet(new long[]{0x0008284090800000L});
    public static final BitSet FOLLOW_LEQ_in_rel_expr490 = new BitSet(new long[]{0x0008284090800000L});
    public static final BitSet FOLLOW_math_expr_in_rel_expr494 = new BitSet(new long[]{0x5000000404000002L});
    public static final BitSet FOLLOW_datetime_in_rel_expr502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_math_term_in_math_expr513 = new BitSet(new long[]{0x0140000000000002L});
    public static final BitSet FOLLOW_54_in_math_expr518 = new BitSet(new long[]{0x0008284090800000L});
    public static final BitSet FOLLOW_56_in_math_expr523 = new BitSet(new long[]{0x0008284090800000L});
    public static final BitSet FOLLOW_math_term_in_math_expr527 = new BitSet(new long[]{0x0140000000000002L});
    public static final BitSet FOLLOW_unary_expr_in_math_term541 = new BitSet(new long[]{0x0420000000000002L});
    public static final BitSet FOLLOW_53_in_math_term546 = new BitSet(new long[]{0x0008284090800000L});
    public static final BitSet FOLLOW_58_in_math_term551 = new BitSet(new long[]{0x0008284090800000L});
    public static final BitSet FOLLOW_unary_expr_in_math_term555 = new BitSet(new long[]{0x0420000000000002L});
    public static final BitSet FOLLOW_timeblock_in_math_term563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_expr_in_unary_expr573 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_unary_expr576 = new BitSet(new long[]{0x0008280090800000L});
    public static final BitSet FOLLOW_postfix_expr_in_unary_expr579 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary_expr586 = new BitSet(new long[]{0x0008280090800000L});
    public static final BitSet FOLLOW_postfix_expr_in_unary_expr589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_in_postfix_expr600 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_function_parens_in_postfix_expr602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_function_parens625 = new BitSet(new long[]{0x8018284090800000L});
    public static final BitSet FOLLOW_argument_expr_list_in_function_parens627 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_function_parens630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayblock_in_datetime652 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_timeblock_in_datetime654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_timeblock681 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_timeblock683 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_TIME_in_timeblock687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_dayblock710 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DAY_in_dayblock712 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_55_in_dayblock716 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DAY_in_dayblock718 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_dayblock723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_primary_expr742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primary_expr747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primary_expr752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_primary_expr757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_primary_expr762 = new BitSet(new long[]{0x8008284090800000L});
    public static final BitSet FOLLOW_expr_in_primary_expr763 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_primary_expr764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_argument_expr_list779 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_argument_expr_list783 = new BitSet(new long[]{0x8008284090800000L});
    public static final BitSet FOLLOW_expr_in_argument_expr_list785 = new BitSet(new long[]{0x0080000000000002L});

}