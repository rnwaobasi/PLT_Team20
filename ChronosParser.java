// $ANTLR 3.4 Chronos.g 2012-05-04 13:43:49

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ChronosParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "BLOCK", "BREAK_T", "CHAR", "COMMENT", "COND", "COURSELIST_T", "COURSE_T", "DATETIME", "DATETIME_T", "DAY", "DAYS", "DAYS_T", "DECL", "DOUBLE_T", "ELSE_T", "EQ", "ESC_SEQ", "EXPONENT", "FLOAT", "FOREACH_T", "GEQ", "HEX_DIGIT", "ID", "IF_T", "INST", "INT", "INT_T", "IN_T", "LEQ", "NEQ", "NEW_T", "NOT", "OCTAL_ESC", "OR", "PARAMS", "SCHEDULE_T", "STRING", "STRING_T", "TIME", "TIMEBLOCK_T", "TIMES", "TIME_T", "UNICODE_ESC", "WHITESPACE", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "';'", "'<'", "'='", "'>'", "'['", "']'", "'{'", "'}'", "'~'"
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
    // Chronos.g:23:1: program : ( line )+ EOF !;
    public final ChronosParser.program_return program() throws RecognitionException {
        ChronosParser.program_return retval = new ChronosParser.program_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF2=null;
        ChronosParser.line_return line1 =null;


        CommonTree EOF2_tree=null;

        try {
            // Chronos.g:24:2: ( ( line )+ EOF !)
            // Chronos.g:24:4: ( line )+ EOF !
            {
            root_0 = (CommonTree)adaptor.nil();


            // Chronos.g:24:4: ( line )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==BREAK_T||(LA1_0 >= COURSELIST_T && LA1_0 <= COURSE_T)||LA1_0==DATETIME_T||LA1_0==DAYS_T||LA1_0==DOUBLE_T||(LA1_0 >= FLOAT && LA1_0 <= FOREACH_T)||(LA1_0 >= ID && LA1_0 <= IF_T)||(LA1_0 >= INT && LA1_0 <= INT_T)||LA1_0==NOT||(LA1_0 >= SCHEDULE_T && LA1_0 <= TIMEBLOCK_T)||LA1_0==TIME_T||LA1_0==49||LA1_0==57||LA1_0==61) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Chronos.g:24:4: line
            	    {
            	    pushFollow(FOLLOW_line_in_program81);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program84); 

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
    // Chronos.g:26:1: line : ( declarator | stmt );
    public final ChronosParser.line_return line() throws RecognitionException {
        ChronosParser.line_return retval = new ChronosParser.line_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        ChronosParser.declarator_return declarator3 =null;

        ChronosParser.stmt_return stmt4 =null;



        try {
            // Chronos.g:27:2: ( declarator | stmt )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0 >= COURSELIST_T && LA2_0 <= COURSE_T)||LA2_0==DATETIME_T||LA2_0==DAYS_T||LA2_0==DOUBLE_T||LA2_0==INT_T||LA2_0==SCHEDULE_T||LA2_0==STRING_T||LA2_0==TIMEBLOCK_T||LA2_0==TIME_T) ) {
                alt2=1;
            }
            else if ( (LA2_0==BREAK_T||(LA2_0 >= FLOAT && LA2_0 <= FOREACH_T)||(LA2_0 >= ID && LA2_0 <= IF_T)||LA2_0==INT||LA2_0==NOT||LA2_0==STRING||LA2_0==TIME||LA2_0==49||LA2_0==57||LA2_0==61) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // Chronos.g:27:4: declarator
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_declarator_in_line95);
                    declarator3=declarator();

                    state._fsp--;

                    adaptor.addChild(root_0, declarator3.getTree());

                    }
                    break;
                case 2 :
                    // Chronos.g:28:4: stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_stmt_in_line100);
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
    // Chronos.g:30:1: declarator : ( type_specifier ID ';' -> ^( DECL type_specifier ID ) | type_specifier ID '=' expr ';' -> ^( INST ^( DECL type_specifier ID ) ^( '=' ID expr ) ) );
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
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_type_specifier=new RewriteRuleSubtreeStream(adaptor,"rule type_specifier");
        try {
            // Chronos.g:32:2: ( type_specifier ID ';' -> ^( DECL type_specifier ID ) | type_specifier ID '=' expr ';' -> ^( INST ^( DECL type_specifier ID ) ^( '=' ID expr ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0 >= COURSELIST_T && LA3_0 <= COURSE_T)||LA3_0==DATETIME_T||LA3_0==DAYS_T||LA3_0==DOUBLE_T||LA3_0==INT_T||LA3_0==SCHEDULE_T||LA3_0==STRING_T||LA3_0==TIMEBLOCK_T||LA3_0==TIME_T) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==ID) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==57) ) {
                        alt3=1;
                    }
                    else if ( (LA3_2==59) ) {
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
                    // Chronos.g:32:4: type_specifier ID ';'
                    {
                    pushFollow(FOLLOW_type_specifier_in_declarator111);
                    type_specifier5=type_specifier();

                    state._fsp--;

                    stream_type_specifier.add(type_specifier5.getTree());

                    ID6=(Token)match(input,ID,FOLLOW_ID_in_declarator113);  
                    stream_ID.add(ID6);


                    char_literal7=(Token)match(input,57,FOLLOW_57_in_declarator115);  
                    stream_57.add(char_literal7);


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
                    // 33:4: -> ^( DECL type_specifier ID )
                    {
                        // Chronos.g:33:7: ^( DECL type_specifier ID )
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
                    // Chronos.g:35:4: type_specifier ID '=' expr ';'
                    {
                    pushFollow(FOLLOW_type_specifier_in_declarator134);
                    type_specifier8=type_specifier();

                    state._fsp--;

                    stream_type_specifier.add(type_specifier8.getTree());

                    ID9=(Token)match(input,ID,FOLLOW_ID_in_declarator136);  
                    stream_ID.add(ID9);


                    char_literal10=(Token)match(input,59,FOLLOW_59_in_declarator138);  
                    stream_59.add(char_literal10);


                    pushFollow(FOLLOW_expr_in_declarator140);
                    expr11=expr();

                    state._fsp--;

                    stream_expr.add(expr11.getTree());

                    char_literal12=(Token)match(input,57,FOLLOW_57_in_declarator142);  
                    stream_57.add(char_literal12);


                    // AST REWRITE
                    // elements: ID, expr, ID, type_specifier, 59
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 36:4: -> ^( INST ^( DECL type_specifier ID ) ^( '=' ID expr ) )
                    {
                        // Chronos.g:36:7: ^( INST ^( DECL type_specifier ID ) ^( '=' ID expr ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(INST, "INST")
                        , root_1);

                        // Chronos.g:36:14: ^( DECL type_specifier ID )
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

                        // Chronos.g:36:40: ^( '=' ID expr )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        stream_59.nextNode()
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
    // Chronos.g:38:1: stmt : ( expr ';' -> expr | selection_stmt | iteration_stmt | jump_stmt ';' -> jump_stmt | ';' !);
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
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleSubtreeStream stream_jump_stmt=new RewriteRuleSubtreeStream(adaptor,"rule jump_stmt");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Chronos.g:38:5: ( expr ';' -> expr | selection_stmt | iteration_stmt | jump_stmt ';' -> jump_stmt | ';' !)
            int alt4=5;
            switch ( input.LA(1) ) {
            case FLOAT:
            case ID:
            case INT:
            case NOT:
            case STRING:
            case TIME:
            case 49:
            case 61:
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
            case 57:
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
                    // Chronos.g:38:7: expr ';'
                    {
                    pushFollow(FOLLOW_expr_in_stmt175);
                    expr13=expr();

                    state._fsp--;

                    stream_expr.add(expr13.getTree());

                    char_literal14=(Token)match(input,57,FOLLOW_57_in_stmt176);  
                    stream_57.add(char_literal14);


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
                    // 38:15: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // Chronos.g:39:4: selection_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_selection_stmt_in_stmt185);
                    selection_stmt15=selection_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, selection_stmt15.getTree());

                    }
                    break;
                case 3 :
                    // Chronos.g:40:4: iteration_stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_iteration_stmt_in_stmt190);
                    iteration_stmt16=iteration_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, iteration_stmt16.getTree());

                    }
                    break;
                case 4 :
                    // Chronos.g:41:4: jump_stmt ';'
                    {
                    pushFollow(FOLLOW_jump_stmt_in_stmt195);
                    jump_stmt17=jump_stmt();

                    state._fsp--;

                    stream_jump_stmt.add(jump_stmt17.getTree());

                    char_literal18=(Token)match(input,57,FOLLOW_57_in_stmt196);  
                    stream_57.add(char_literal18);


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
                    // 41:17: -> jump_stmt
                    {
                        adaptor.addChild(root_0, stream_jump_stmt.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // Chronos.g:42:4: ';' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal19=(Token)match(input,57,FOLLOW_57_in_stmt205); 

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
    // Chronos.g:44:1: selection_stmt : IF_T expr '{' (a= line )* '}' ( ELSE_T '{' (b= line )* '}' )? -> ^( COND ^( IF_T expr ( $a)* ) ( ^( ELSE_T ( $b)* ) )? ) ;
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
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_IF_T=new RewriteRuleTokenStream(adaptor,"token IF_T");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_ELSE_T=new RewriteRuleTokenStream(adaptor,"token ELSE_T");
        RewriteRuleSubtreeStream stream_line=new RewriteRuleSubtreeStream(adaptor,"rule line");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Chronos.g:46:2: ( IF_T expr '{' (a= line )* '}' ( ELSE_T '{' (b= line )* '}' )? -> ^( COND ^( IF_T expr ( $a)* ) ( ^( ELSE_T ( $b)* ) )? ) )
            // Chronos.g:46:4: IF_T expr '{' (a= line )* '}' ( ELSE_T '{' (b= line )* '}' )?
            {
            IF_T20=(Token)match(input,IF_T,FOLLOW_IF_T_in_selection_stmt217);  
            stream_IF_T.add(IF_T20);


            pushFollow(FOLLOW_expr_in_selection_stmt219);
            expr21=expr();

            state._fsp--;

            stream_expr.add(expr21.getTree());

            char_literal22=(Token)match(input,63,FOLLOW_63_in_selection_stmt221);  
            stream_63.add(char_literal22);


            // Chronos.g:46:17: (a= line )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==BREAK_T||(LA5_0 >= COURSELIST_T && LA5_0 <= COURSE_T)||LA5_0==DATETIME_T||LA5_0==DAYS_T||LA5_0==DOUBLE_T||(LA5_0 >= FLOAT && LA5_0 <= FOREACH_T)||(LA5_0 >= ID && LA5_0 <= IF_T)||(LA5_0 >= INT && LA5_0 <= INT_T)||LA5_0==NOT||(LA5_0 >= SCHEDULE_T && LA5_0 <= TIMEBLOCK_T)||LA5_0==TIME_T||LA5_0==49||LA5_0==57||LA5_0==61) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Chronos.g:46:18: a= line
            	    {
            	    pushFollow(FOLLOW_line_in_selection_stmt225);
            	    a=line();

            	    state._fsp--;

            	    stream_line.add(a.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            char_literal23=(Token)match(input,64,FOLLOW_64_in_selection_stmt229);  
            stream_64.add(char_literal23);


            // Chronos.g:46:31: ( ELSE_T '{' (b= line )* '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ELSE_T) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Chronos.g:46:32: ELSE_T '{' (b= line )* '}'
                    {
                    ELSE_T24=(Token)match(input,ELSE_T,FOLLOW_ELSE_T_in_selection_stmt232);  
                    stream_ELSE_T.add(ELSE_T24);


                    char_literal25=(Token)match(input,63,FOLLOW_63_in_selection_stmt234);  
                    stream_63.add(char_literal25);


                    // Chronos.g:46:43: (b= line )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==BREAK_T||(LA6_0 >= COURSELIST_T && LA6_0 <= COURSE_T)||LA6_0==DATETIME_T||LA6_0==DAYS_T||LA6_0==DOUBLE_T||(LA6_0 >= FLOAT && LA6_0 <= FOREACH_T)||(LA6_0 >= ID && LA6_0 <= IF_T)||(LA6_0 >= INT && LA6_0 <= INT_T)||LA6_0==NOT||(LA6_0 >= SCHEDULE_T && LA6_0 <= TIMEBLOCK_T)||LA6_0==TIME_T||LA6_0==49||LA6_0==57||LA6_0==61) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // Chronos.g:46:44: b= line
                    	    {
                    	    pushFollow(FOLLOW_line_in_selection_stmt239);
                    	    b=line();

                    	    state._fsp--;

                    	    stream_line.add(b.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    char_literal26=(Token)match(input,64,FOLLOW_64_in_selection_stmt243);  
                    stream_64.add(char_literal26);


                    }
                    break;

            }


            // AST REWRITE
            // elements: ELSE_T, IF_T, expr, b, a
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
            // 47:4: -> ^( COND ^( IF_T expr ( $a)* ) ( ^( ELSE_T ( $b)* ) )? )
            {
                // Chronos.g:47:7: ^( COND ^( IF_T expr ( $a)* ) ( ^( ELSE_T ( $b)* ) )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COND, "COND")
                , root_1);

                // Chronos.g:47:14: ^( IF_T expr ( $a)* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_IF_T.nextNode()
                , root_2);

                adaptor.addChild(root_2, stream_expr.nextTree());

                // Chronos.g:47:27: ( $a)*
                while ( stream_a.hasNext() ) {
                    adaptor.addChild(root_2, stream_a.nextTree());

                }
                stream_a.reset();

                adaptor.addChild(root_1, root_2);
                }

                // Chronos.g:47:31: ( ^( ELSE_T ( $b)* ) )?
                if ( stream_ELSE_T.hasNext()||stream_b.hasNext() ) {
                    // Chronos.g:47:31: ^( ELSE_T ( $b)* )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot(
                    stream_ELSE_T.nextNode()
                    , root_2);

                    // Chronos.g:47:41: ( $b)*
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
    // Chronos.g:49:1: iteration_stmt : FOREACH_T COURSE_T element= ID IN_T list= ID '{' ( line )* '}' -> ^( FOREACH_T ^( IN_T $element $list) ^( BLOCK ( line )* ) ) ;
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
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_COURSE_T=new RewriteRuleTokenStream(adaptor,"token COURSE_T");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_FOREACH_T=new RewriteRuleTokenStream(adaptor,"token FOREACH_T");
        RewriteRuleTokenStream stream_IN_T=new RewriteRuleTokenStream(adaptor,"token IN_T");
        RewriteRuleSubtreeStream stream_line=new RewriteRuleSubtreeStream(adaptor,"rule line");
        try {
            // Chronos.g:51:2: ( FOREACH_T COURSE_T element= ID IN_T list= ID '{' ( line )* '}' -> ^( FOREACH_T ^( IN_T $element $list) ^( BLOCK ( line )* ) ) )
            // Chronos.g:51:4: FOREACH_T COURSE_T element= ID IN_T list= ID '{' ( line )* '}'
            {
            FOREACH_T27=(Token)match(input,FOREACH_T,FOLLOW_FOREACH_T_in_iteration_stmt285);  
            stream_FOREACH_T.add(FOREACH_T27);


            COURSE_T28=(Token)match(input,COURSE_T,FOLLOW_COURSE_T_in_iteration_stmt287);  
            stream_COURSE_T.add(COURSE_T28);


            element=(Token)match(input,ID,FOLLOW_ID_in_iteration_stmt291);  
            stream_ID.add(element);


            IN_T29=(Token)match(input,IN_T,FOLLOW_IN_T_in_iteration_stmt293);  
            stream_IN_T.add(IN_T29);


            list=(Token)match(input,ID,FOLLOW_ID_in_iteration_stmt297);  
            stream_ID.add(list);


            char_literal30=(Token)match(input,63,FOLLOW_63_in_iteration_stmt299);  
            stream_63.add(char_literal30);


            // Chronos.g:51:51: ( line )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==BREAK_T||(LA8_0 >= COURSELIST_T && LA8_0 <= COURSE_T)||LA8_0==DATETIME_T||LA8_0==DAYS_T||LA8_0==DOUBLE_T||(LA8_0 >= FLOAT && LA8_0 <= FOREACH_T)||(LA8_0 >= ID && LA8_0 <= IF_T)||(LA8_0 >= INT && LA8_0 <= INT_T)||LA8_0==NOT||(LA8_0 >= SCHEDULE_T && LA8_0 <= TIMEBLOCK_T)||LA8_0==TIME_T||LA8_0==49||LA8_0==57||LA8_0==61) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Chronos.g:51:51: line
            	    {
            	    pushFollow(FOLLOW_line_in_iteration_stmt301);
            	    line31=line();

            	    state._fsp--;

            	    stream_line.add(line31.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            char_literal32=(Token)match(input,64,FOLLOW_64_in_iteration_stmt304);  
            stream_64.add(char_literal32);


            // AST REWRITE
            // elements: element, line, IN_T, list, FOREACH_T
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
            // 52:4: -> ^( FOREACH_T ^( IN_T $element $list) ^( BLOCK ( line )* ) )
            {
                // Chronos.g:52:7: ^( FOREACH_T ^( IN_T $element $list) ^( BLOCK ( line )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_FOREACH_T.nextNode()
                , root_1);

                // Chronos.g:52:19: ^( IN_T $element $list)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_IN_T.nextNode()
                , root_2);

                adaptor.addChild(root_2, stream_element.nextNode());

                adaptor.addChild(root_2, stream_list.nextNode());

                adaptor.addChild(root_1, root_2);
                }

                // Chronos.g:52:42: ^( BLOCK ( line )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(BLOCK, "BLOCK")
                , root_2);

                // Chronos.g:52:50: ( line )*
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
    // Chronos.g:54:1: jump_stmt : BREAK_T ;
    public final ChronosParser.jump_stmt_return jump_stmt() throws RecognitionException {
        ChronosParser.jump_stmt_return retval = new ChronosParser.jump_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BREAK_T33=null;

        CommonTree BREAK_T33_tree=null;

        try {
            // Chronos.g:56:2: ( BREAK_T )
            // Chronos.g:56:4: BREAK_T
            {
            root_0 = (CommonTree)adaptor.nil();


            BREAK_T33=(Token)match(input,BREAK_T,FOLLOW_BREAK_T_in_jump_stmt343); 
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
    // Chronos.g:58:1: expr : ( and_expr ( OR ^ and_expr )* | assignment_expr );
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
            // Chronos.g:60:2: ( and_expr ( OR ^ and_expr )* | assignment_expr )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==FLOAT||LA10_0==INT||LA10_0==NOT||LA10_0==STRING||LA10_0==TIME||LA10_0==49||LA10_0==61) ) {
                alt10=1;
            }
            else if ( (LA10_0==ID) ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==59) ) {
                    alt10=2;
                }
                else if ( (LA10_2==AND||LA10_2==EQ||LA10_2==GEQ||(LA10_2 >= LEQ && LA10_2 <= NEQ)||LA10_2==OR||(LA10_2 >= 49 && LA10_2 <= 58)||LA10_2==60||LA10_2==63) ) {
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
                    // Chronos.g:60:4: and_expr ( OR ^ and_expr )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_and_expr_in_expr354);
                    and_expr34=and_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, and_expr34.getTree());

                    // Chronos.g:60:13: ( OR ^ and_expr )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==OR) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // Chronos.g:60:14: OR ^ and_expr
                    	    {
                    	    OR35=(Token)match(input,OR,FOLLOW_OR_in_expr357); 
                    	    OR35_tree = 
                    	    (CommonTree)adaptor.create(OR35)
                    	    ;
                    	    root_0 = (CommonTree)adaptor.becomeRoot(OR35_tree, root_0);


                    	    pushFollow(FOLLOW_and_expr_in_expr360);
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
                    // Chronos.g:61:4: assignment_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_assignment_expr_in_expr367);
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
    // Chronos.g:63:1: assignment_expr : ID '=' ^ expr ;
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
            // Chronos.g:65:2: ( ID '=' ^ expr )
            // Chronos.g:65:4: ID '=' ^ expr
            {
            root_0 = (CommonTree)adaptor.nil();


            ID38=(Token)match(input,ID,FOLLOW_ID_in_assignment_expr378); 
            ID38_tree = 
            (CommonTree)adaptor.create(ID38)
            ;
            adaptor.addChild(root_0, ID38_tree);


            char_literal39=(Token)match(input,59,FOLLOW_59_in_assignment_expr380); 
            char_literal39_tree = 
            (CommonTree)adaptor.create(char_literal39)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(char_literal39_tree, root_0);


            pushFollow(FOLLOW_expr_in_assignment_expr383);
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
    // Chronos.g:67:1: and_expr : equiv_expr ( AND ^ equiv_expr )* ;
    public final ChronosParser.and_expr_return and_expr() throws RecognitionException {
        ChronosParser.and_expr_return retval = new ChronosParser.and_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AND42=null;
        ChronosParser.equiv_expr_return equiv_expr41 =null;

        ChronosParser.equiv_expr_return equiv_expr43 =null;


        CommonTree AND42_tree=null;

        try {
            // Chronos.g:69:2: ( equiv_expr ( AND ^ equiv_expr )* )
            // Chronos.g:69:4: equiv_expr ( AND ^ equiv_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_equiv_expr_in_and_expr394);
            equiv_expr41=equiv_expr();

            state._fsp--;

            adaptor.addChild(root_0, equiv_expr41.getTree());

            // Chronos.g:69:15: ( AND ^ equiv_expr )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==AND) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Chronos.g:69:16: AND ^ equiv_expr
            	    {
            	    AND42=(Token)match(input,AND,FOLLOW_AND_in_and_expr397); 
            	    AND42_tree = 
            	    (CommonTree)adaptor.create(AND42)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(AND42_tree, root_0);


            	    pushFollow(FOLLOW_equiv_expr_in_and_expr400);
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
    // Chronos.g:71:1: equiv_expr : rel_expr ( ( EQ ^| NEQ ^) rel_expr )* ;
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
            // Chronos.g:73:2: ( rel_expr ( ( EQ ^| NEQ ^) rel_expr )* )
            // Chronos.g:73:4: rel_expr ( ( EQ ^| NEQ ^) rel_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_rel_expr_in_equiv_expr413);
            rel_expr44=rel_expr();

            state._fsp--;

            adaptor.addChild(root_0, rel_expr44.getTree());

            // Chronos.g:73:13: ( ( EQ ^| NEQ ^) rel_expr )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==EQ||LA13_0==NEQ) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Chronos.g:73:15: ( EQ ^| NEQ ^) rel_expr
            	    {
            	    // Chronos.g:73:15: ( EQ ^| NEQ ^)
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
            	            // Chronos.g:73:16: EQ ^
            	            {
            	            EQ45=(Token)match(input,EQ,FOLLOW_EQ_in_equiv_expr418); 
            	            EQ45_tree = 
            	            (CommonTree)adaptor.create(EQ45)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(EQ45_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // Chronos.g:73:22: NEQ ^
            	            {
            	            NEQ46=(Token)match(input,NEQ,FOLLOW_NEQ_in_equiv_expr423); 
            	            NEQ46_tree = 
            	            (CommonTree)adaptor.create(NEQ46)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(NEQ46_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_rel_expr_in_equiv_expr427);
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
    // Chronos.g:75:1: rel_expr : ( math_expr ( ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr )* | datetime );
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
            // Chronos.g:77:2: ( math_expr ( ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr )* | datetime )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==FLOAT||LA16_0==ID||LA16_0==INT||LA16_0==NOT||LA16_0==STRING||LA16_0==TIME||LA16_0==49) ) {
                alt16=1;
            }
            else if ( (LA16_0==61) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // Chronos.g:77:4: math_expr ( ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_math_expr_in_rel_expr441);
                    math_expr48=math_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, math_expr48.getTree());

                    // Chronos.g:77:14: ( ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==GEQ||LA15_0==LEQ||LA15_0==58||LA15_0==60) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // Chronos.g:77:16: ( '<' ^| '>' ^| GEQ ^| LEQ ^) math_expr
                    	    {
                    	    // Chronos.g:77:16: ( '<' ^| '>' ^| GEQ ^| LEQ ^)
                    	    int alt14=4;
                    	    switch ( input.LA(1) ) {
                    	    case 58:
                    	        {
                    	        alt14=1;
                    	        }
                    	        break;
                    	    case 60:
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
                    	            // Chronos.g:77:17: '<' ^
                    	            {
                    	            char_literal49=(Token)match(input,58,FOLLOW_58_in_rel_expr446); 
                    	            char_literal49_tree = 
                    	            (CommonTree)adaptor.create(char_literal49)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal49_tree, root_0);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // Chronos.g:77:24: '>' ^
                    	            {
                    	            char_literal50=(Token)match(input,60,FOLLOW_60_in_rel_expr451); 
                    	            char_literal50_tree = 
                    	            (CommonTree)adaptor.create(char_literal50)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal50_tree, root_0);


                    	            }
                    	            break;
                    	        case 3 :
                    	            // Chronos.g:77:31: GEQ ^
                    	            {
                    	            GEQ51=(Token)match(input,GEQ,FOLLOW_GEQ_in_rel_expr456); 
                    	            GEQ51_tree = 
                    	            (CommonTree)adaptor.create(GEQ51)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(GEQ51_tree, root_0);


                    	            }
                    	            break;
                    	        case 4 :
                    	            // Chronos.g:77:38: LEQ ^
                    	            {
                    	            LEQ52=(Token)match(input,LEQ,FOLLOW_LEQ_in_rel_expr461); 
                    	            LEQ52_tree = 
                    	            (CommonTree)adaptor.create(LEQ52)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(LEQ52_tree, root_0);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_math_expr_in_rel_expr465);
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
                    // Chronos.g:78:4: datetime
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_datetime_in_rel_expr473);
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
    // Chronos.g:80:1: math_expr : math_term ( ( '+' ^| '-' ^) math_term )* ;
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
            // Chronos.g:82:2: ( math_term ( ( '+' ^| '-' ^) math_term )* )
            // Chronos.g:82:4: math_term ( ( '+' ^| '-' ^) math_term )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_math_term_in_math_expr484);
            math_term55=math_term();

            state._fsp--;

            adaptor.addChild(root_0, math_term55.getTree());

            // Chronos.g:82:14: ( ( '+' ^| '-' ^) math_term )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==52||LA18_0==54) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // Chronos.g:82:16: ( '+' ^| '-' ^) math_term
            	    {
            	    // Chronos.g:82:16: ( '+' ^| '-' ^)
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==52) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==54) ) {
            	        alt17=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // Chronos.g:82:17: '+' ^
            	            {
            	            char_literal56=(Token)match(input,52,FOLLOW_52_in_math_expr489); 
            	            char_literal56_tree = 
            	            (CommonTree)adaptor.create(char_literal56)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal56_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // Chronos.g:82:24: '-' ^
            	            {
            	            char_literal57=(Token)match(input,54,FOLLOW_54_in_math_expr494); 
            	            char_literal57_tree = 
            	            (CommonTree)adaptor.create(char_literal57)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal57_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_math_term_in_math_expr498);
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
    // Chronos.g:84:1: math_term : ( unary_expr ( ( '*' ^| '/' ^) unary_expr )* | timeblock );
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
            // Chronos.g:86:2: ( unary_expr ( ( '*' ^| '/' ^) unary_expr )* | timeblock )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==FLOAT||LA21_0==ID||LA21_0==INT||LA21_0==NOT||LA21_0==STRING||LA21_0==49) ) {
                alt21=1;
            }
            else if ( (LA21_0==TIME) ) {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==65) ) {
                    alt21=2;
                }
                else if ( (LA21_2==AND||LA21_2==EQ||LA21_2==GEQ||(LA21_2 >= LEQ && LA21_2 <= NEQ)||LA21_2==OR||(LA21_2 >= 49 && LA21_2 <= 58)||LA21_2==60||LA21_2==63) ) {
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
                    // Chronos.g:86:4: unary_expr ( ( '*' ^| '/' ^) unary_expr )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_unary_expr_in_math_term512);
                    unary_expr59=unary_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, unary_expr59.getTree());

                    // Chronos.g:86:15: ( ( '*' ^| '/' ^) unary_expr )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==51||LA20_0==56) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // Chronos.g:86:17: ( '*' ^| '/' ^) unary_expr
                    	    {
                    	    // Chronos.g:86:17: ( '*' ^| '/' ^)
                    	    int alt19=2;
                    	    int LA19_0 = input.LA(1);

                    	    if ( (LA19_0==51) ) {
                    	        alt19=1;
                    	    }
                    	    else if ( (LA19_0==56) ) {
                    	        alt19=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 19, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt19) {
                    	        case 1 :
                    	            // Chronos.g:86:18: '*' ^
                    	            {
                    	            char_literal60=(Token)match(input,51,FOLLOW_51_in_math_term517); 
                    	            char_literal60_tree = 
                    	            (CommonTree)adaptor.create(char_literal60)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal60_tree, root_0);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // Chronos.g:86:25: '/' ^
                    	            {
                    	            char_literal61=(Token)match(input,56,FOLLOW_56_in_math_term522); 
                    	            char_literal61_tree = 
                    	            (CommonTree)adaptor.create(char_literal61)
                    	            ;
                    	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal61_tree, root_0);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_unary_expr_in_math_term526);
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
                    // Chronos.g:87:4: timeblock
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_timeblock_in_math_term534);
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
    // Chronos.g:89:1: unary_expr : ( postfix_expr ( '.' ^ postfix_expr )* | NOT ^ postfix_expr );
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
            // Chronos.g:90:2: ( postfix_expr ( '.' ^ postfix_expr )* | NOT ^ postfix_expr )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==FLOAT||LA23_0==ID||LA23_0==INT||LA23_0==STRING||LA23_0==TIME||LA23_0==49) ) {
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
                    // Chronos.g:90:4: postfix_expr ( '.' ^ postfix_expr )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_postfix_expr_in_unary_expr544);
                    postfix_expr64=postfix_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, postfix_expr64.getTree());

                    // Chronos.g:90:17: ( '.' ^ postfix_expr )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==55) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // Chronos.g:90:18: '.' ^ postfix_expr
                    	    {
                    	    char_literal65=(Token)match(input,55,FOLLOW_55_in_unary_expr547); 
                    	    char_literal65_tree = 
                    	    (CommonTree)adaptor.create(char_literal65)
                    	    ;
                    	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal65_tree, root_0);


                    	    pushFollow(FOLLOW_postfix_expr_in_unary_expr550);
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
                    // Chronos.g:91:4: NOT ^ postfix_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    NOT67=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expr557); 
                    NOT67_tree = 
                    (CommonTree)adaptor.create(NOT67)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(NOT67_tree, root_0);


                    pushFollow(FOLLOW_postfix_expr_in_unary_expr560);
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
    // Chronos.g:93:1: postfix_expr : primary_expr ( function_parens )? -> ^( primary_expr ( function_parens )? ) ;
    public final ChronosParser.postfix_expr_return postfix_expr() throws RecognitionException {
        ChronosParser.postfix_expr_return retval = new ChronosParser.postfix_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        ChronosParser.primary_expr_return primary_expr69 =null;

        ChronosParser.function_parens_return function_parens70 =null;


        RewriteRuleSubtreeStream stream_function_parens=new RewriteRuleSubtreeStream(adaptor,"rule function_parens");
        RewriteRuleSubtreeStream stream_primary_expr=new RewriteRuleSubtreeStream(adaptor,"rule primary_expr");
        try {
            // Chronos.g:95:2: ( primary_expr ( function_parens )? -> ^( primary_expr ( function_parens )? ) )
            // Chronos.g:95:4: primary_expr ( function_parens )?
            {
            pushFollow(FOLLOW_primary_expr_in_postfix_expr571);
            primary_expr69=primary_expr();

            state._fsp--;

            stream_primary_expr.add(primary_expr69.getTree());

            // Chronos.g:95:17: ( function_parens )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==49) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // Chronos.g:95:17: function_parens
                    {
                    pushFollow(FOLLOW_function_parens_in_postfix_expr573);
                    function_parens70=function_parens();

                    state._fsp--;

                    stream_function_parens.add(function_parens70.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: function_parens, primary_expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 96:3: -> ^( primary_expr ( function_parens )? )
            {
                // Chronos.g:96:6: ^( primary_expr ( function_parens )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_primary_expr.nextNode(), root_1);

                // Chronos.g:96:21: ( function_parens )?
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
    // Chronos.g:98:1: function_parens : '(' ( argument_expr_list )? ')' -> ^( PARAMS ( argument_expr_list )? ) ;
    public final ChronosParser.function_parens_return function_parens() throws RecognitionException {
        ChronosParser.function_parens_return retval = new ChronosParser.function_parens_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal71=null;
        Token char_literal73=null;
        ChronosParser.argument_expr_list_return argument_expr_list72 =null;


        CommonTree char_literal71_tree=null;
        CommonTree char_literal73_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_argument_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule argument_expr_list");
        try {
            // Chronos.g:100:2: ( '(' ( argument_expr_list )? ')' -> ^( PARAMS ( argument_expr_list )? ) )
            // Chronos.g:100:4: '(' ( argument_expr_list )? ')'
            {
            char_literal71=(Token)match(input,49,FOLLOW_49_in_function_parens596);  
            stream_49.add(char_literal71);


            // Chronos.g:100:8: ( argument_expr_list )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==FLOAT||LA25_0==ID||LA25_0==INT||LA25_0==NOT||LA25_0==STRING||LA25_0==TIME||LA25_0==49||LA25_0==61) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // Chronos.g:100:8: argument_expr_list
                    {
                    pushFollow(FOLLOW_argument_expr_list_in_function_parens598);
                    argument_expr_list72=argument_expr_list();

                    state._fsp--;

                    stream_argument_expr_list.add(argument_expr_list72.getTree());

                    }
                    break;

            }


            char_literal73=(Token)match(input,50,FOLLOW_50_in_function_parens601);  
            stream_50.add(char_literal73);


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
            // 101:3: -> ^( PARAMS ( argument_expr_list )? )
            {
                // Chronos.g:101:6: ^( PARAMS ( argument_expr_list )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // Chronos.g:101:15: ( argument_expr_list )?
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
    // Chronos.g:103:1: datetime : dayblock timeblock -> ^( DATETIME dayblock timeblock ) ;
    public final ChronosParser.datetime_return datetime() throws RecognitionException {
        ChronosParser.datetime_return retval = new ChronosParser.datetime_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        ChronosParser.dayblock_return dayblock74 =null;

        ChronosParser.timeblock_return timeblock75 =null;


        RewriteRuleSubtreeStream stream_timeblock=new RewriteRuleSubtreeStream(adaptor,"rule timeblock");
        RewriteRuleSubtreeStream stream_dayblock=new RewriteRuleSubtreeStream(adaptor,"rule dayblock");
        try {
            // Chronos.g:105:2: ( dayblock timeblock -> ^( DATETIME dayblock timeblock ) )
            // Chronos.g:105:4: dayblock timeblock
            {
            pushFollow(FOLLOW_dayblock_in_datetime623);
            dayblock74=dayblock();

            state._fsp--;

            stream_dayblock.add(dayblock74.getTree());

            pushFollow(FOLLOW_timeblock_in_datetime625);
            timeblock75=timeblock();

            state._fsp--;

            stream_timeblock.add(timeblock75.getTree());

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
            // 106:4: -> ^( DATETIME dayblock timeblock )
            {
                // Chronos.g:106:7: ^( DATETIME dayblock timeblock )
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
    // Chronos.g:108:1: timeblock : a= TIME '~' b= TIME -> ^( TIMES $a $b) ;
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
        RewriteRuleTokenStream stream_TIME=new RewriteRuleTokenStream(adaptor,"token TIME");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");

        try {
            // Chronos.g:110:2: (a= TIME '~' b= TIME -> ^( TIMES $a $b) )
            // Chronos.g:110:4: a= TIME '~' b= TIME
            {
            a=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock652);  
            stream_TIME.add(a);


            char_literal76=(Token)match(input,65,FOLLOW_65_in_timeblock654);  
            stream_65.add(char_literal76);


            b=(Token)match(input,TIME,FOLLOW_TIME_in_timeblock658);  
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
            // 110:22: -> ^( TIMES $a $b)
            {
                // Chronos.g:110:25: ^( TIMES $a $b)
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
    // Chronos.g:112:1: dayblock : '[' DAY ( ',' DAY )* ']' -> ^( DAYS ( DAY )+ ) ;
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
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");

        try {
            // Chronos.g:114:2: ( '[' DAY ( ',' DAY )* ']' -> ^( DAYS ( DAY )+ ) )
            // Chronos.g:114:4: '[' DAY ( ',' DAY )* ']'
            {
            char_literal77=(Token)match(input,61,FOLLOW_61_in_dayblock681);  
            stream_61.add(char_literal77);


            DAY78=(Token)match(input,DAY,FOLLOW_DAY_in_dayblock683);  
            stream_DAY.add(DAY78);


            // Chronos.g:114:12: ( ',' DAY )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==53) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // Chronos.g:114:14: ',' DAY
            	    {
            	    char_literal79=(Token)match(input,53,FOLLOW_53_in_dayblock687);  
            	    stream_53.add(char_literal79);


            	    DAY80=(Token)match(input,DAY,FOLLOW_DAY_in_dayblock689);  
            	    stream_DAY.add(DAY80);


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            char_literal81=(Token)match(input,62,FOLLOW_62_in_dayblock694);  
            stream_62.add(char_literal81);


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
            // 114:29: -> ^( DAYS ( DAY )+ )
            {
                // Chronos.g:114:32: ^( DAYS ( DAY )+ )
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
    // Chronos.g:116:1: primary_expr : ( constant | ID | STRING | TIME | '(' expr ')' -> expr );
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
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Chronos.g:117:2: ( constant | ID | STRING | TIME | '(' expr ')' -> expr )
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
            case 49:
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
                    // Chronos.g:117:4: constant
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_constant_in_primary_expr713);
                    constant82=constant();

                    state._fsp--;

                    adaptor.addChild(root_0, constant82.getTree());

                    }
                    break;
                case 2 :
                    // Chronos.g:118:4: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ID83=(Token)match(input,ID,FOLLOW_ID_in_primary_expr718); 
                    ID83_tree = 
                    (CommonTree)adaptor.create(ID83)
                    ;
                    adaptor.addChild(root_0, ID83_tree);


                    }
                    break;
                case 3 :
                    // Chronos.g:119:4: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    STRING84=(Token)match(input,STRING,FOLLOW_STRING_in_primary_expr723); 
                    STRING84_tree = 
                    (CommonTree)adaptor.create(STRING84)
                    ;
                    adaptor.addChild(root_0, STRING84_tree);


                    }
                    break;
                case 4 :
                    // Chronos.g:120:4: TIME
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    TIME85=(Token)match(input,TIME,FOLLOW_TIME_in_primary_expr728); 
                    TIME85_tree = 
                    (CommonTree)adaptor.create(TIME85)
                    ;
                    adaptor.addChild(root_0, TIME85_tree);


                    }
                    break;
                case 5 :
                    // Chronos.g:121:4: '(' expr ')'
                    {
                    char_literal86=(Token)match(input,49,FOLLOW_49_in_primary_expr733);  
                    stream_49.add(char_literal86);


                    pushFollow(FOLLOW_expr_in_primary_expr734);
                    expr87=expr();

                    state._fsp--;

                    stream_expr.add(expr87.getTree());

                    char_literal88=(Token)match(input,50,FOLLOW_50_in_primary_expr735);  
                    stream_50.add(char_literal88);


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
                    // 121:15: -> expr
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
    // Chronos.g:123:1: argument_expr_list : ( expr ) ( ',' expr )* -> ( expr )+ ;
    public final ChronosParser.argument_expr_list_return argument_expr_list() throws RecognitionException {
        ChronosParser.argument_expr_list_return retval = new ChronosParser.argument_expr_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal90=null;
        ChronosParser.expr_return expr89 =null;

        ChronosParser.expr_return expr91 =null;


        CommonTree char_literal90_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Chronos.g:124:2: ( ( expr ) ( ',' expr )* -> ( expr )+ )
            // Chronos.g:124:4: ( expr ) ( ',' expr )*
            {
            // Chronos.g:124:4: ( expr )
            // Chronos.g:124:5: expr
            {
            pushFollow(FOLLOW_expr_in_argument_expr_list750);
            expr89=expr();

            state._fsp--;

            stream_expr.add(expr89.getTree());

            }


            // Chronos.g:124:11: ( ',' expr )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==53) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // Chronos.g:124:12: ',' expr
            	    {
            	    char_literal90=(Token)match(input,53,FOLLOW_53_in_argument_expr_list754);  
            	    stream_53.add(char_literal90);


            	    pushFollow(FOLLOW_expr_in_argument_expr_list756);
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
            // 124:23: -> ( expr )+
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
    // Chronos.g:126:1: constant : ( INT | FLOAT );
    public final ChronosParser.constant_return constant() throws RecognitionException {
        ChronosParser.constant_return retval = new ChronosParser.constant_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set92=null;

        CommonTree set92_tree=null;

        try {
            // Chronos.g:127:2: ( INT | FLOAT )
            // Chronos.g:
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
    // Chronos.g:130:1: type_specifier : ( INT_T | DOUBLE_T | DAYS_T | TIME_T | STRING_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T );
    public final ChronosParser.type_specifier_return type_specifier() throws RecognitionException {
        ChronosParser.type_specifier_return retval = new ChronosParser.type_specifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set93=null;

        CommonTree set93_tree=null;

        try {
            // Chronos.g:131:2: ( INT_T | DOUBLE_T | DAYS_T | TIME_T | STRING_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T )
            // Chronos.g:
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


 

    public static final BitSet FOLLOW_line_in_program81 = new BitSet(new long[]{0x22025F10D9852C40L});
    public static final BitSet FOLLOW_EOF_in_program84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_line95 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_line100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_declarator111 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_declarator113 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_declarator115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_declarator134 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_declarator136 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_declarator138 = new BitSet(new long[]{0x20020A1048800000L});
    public static final BitSet FOLLOW_expr_in_declarator140 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_declarator142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt175 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_stmt176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_stmt_in_stmt185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_stmt_in_stmt190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_stmt_in_stmt195 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_stmt196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_stmt205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_T_in_selection_stmt217 = new BitSet(new long[]{0x20020A1048800000L});
    public static final BitSet FOLLOW_expr_in_selection_stmt219 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_selection_stmt221 = new BitSet(new long[]{0x22025F10D9852C40L,0x0000000000000001L});
    public static final BitSet FOLLOW_line_in_selection_stmt225 = new BitSet(new long[]{0x22025F10D9852C40L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_selection_stmt229 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ELSE_T_in_selection_stmt232 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_selection_stmt234 = new BitSet(new long[]{0x22025F10D9852C40L,0x0000000000000001L});
    public static final BitSet FOLLOW_line_in_selection_stmt239 = new BitSet(new long[]{0x22025F10D9852C40L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_selection_stmt243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREACH_T_in_iteration_stmt285 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COURSE_T_in_iteration_stmt287 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_iteration_stmt291 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_IN_T_in_iteration_stmt293 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_iteration_stmt297 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_iteration_stmt299 = new BitSet(new long[]{0x22025F10D9852C40L,0x0000000000000001L});
    public static final BitSet FOLLOW_line_in_iteration_stmt301 = new BitSet(new long[]{0x22025F10D9852C40L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_iteration_stmt304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_T_in_jump_stmt343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_expr_in_expr354 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_OR_in_expr357 = new BitSet(new long[]{0x20020A1048800000L});
    public static final BitSet FOLLOW_and_expr_in_expr360 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_assignment_expr_in_expr367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment_expr378 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_assignment_expr380 = new BitSet(new long[]{0x20020A1048800000L});
    public static final BitSet FOLLOW_expr_in_assignment_expr383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equiv_expr_in_and_expr394 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_and_expr397 = new BitSet(new long[]{0x20020A1048800000L});
    public static final BitSet FOLLOW_equiv_expr_in_and_expr400 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rel_expr_in_equiv_expr413 = new BitSet(new long[]{0x0000000400100002L});
    public static final BitSet FOLLOW_EQ_in_equiv_expr418 = new BitSet(new long[]{0x20020A1048800000L});
    public static final BitSet FOLLOW_NEQ_in_equiv_expr423 = new BitSet(new long[]{0x20020A1048800000L});
    public static final BitSet FOLLOW_rel_expr_in_equiv_expr427 = new BitSet(new long[]{0x0000000400100002L});
    public static final BitSet FOLLOW_math_expr_in_rel_expr441 = new BitSet(new long[]{0x1400000202000002L});
    public static final BitSet FOLLOW_58_in_rel_expr446 = new BitSet(new long[]{0x00020A1048800000L});
    public static final BitSet FOLLOW_60_in_rel_expr451 = new BitSet(new long[]{0x00020A1048800000L});
    public static final BitSet FOLLOW_GEQ_in_rel_expr456 = new BitSet(new long[]{0x00020A1048800000L});
    public static final BitSet FOLLOW_LEQ_in_rel_expr461 = new BitSet(new long[]{0x00020A1048800000L});
    public static final BitSet FOLLOW_math_expr_in_rel_expr465 = new BitSet(new long[]{0x1400000202000002L});
    public static final BitSet FOLLOW_datetime_in_rel_expr473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_math_term_in_math_expr484 = new BitSet(new long[]{0x0050000000000002L});
    public static final BitSet FOLLOW_52_in_math_expr489 = new BitSet(new long[]{0x00020A1048800000L});
    public static final BitSet FOLLOW_54_in_math_expr494 = new BitSet(new long[]{0x00020A1048800000L});
    public static final BitSet FOLLOW_math_term_in_math_expr498 = new BitSet(new long[]{0x0050000000000002L});
    public static final BitSet FOLLOW_unary_expr_in_math_term512 = new BitSet(new long[]{0x0108000000000002L});
    public static final BitSet FOLLOW_51_in_math_term517 = new BitSet(new long[]{0x00020A1048800000L});
    public static final BitSet FOLLOW_56_in_math_term522 = new BitSet(new long[]{0x00020A1048800000L});
    public static final BitSet FOLLOW_unary_expr_in_math_term526 = new BitSet(new long[]{0x0108000000000002L});
    public static final BitSet FOLLOW_timeblock_in_math_term534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_expr_in_unary_expr544 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_unary_expr547 = new BitSet(new long[]{0x00020A0048800000L});
    public static final BitSet FOLLOW_postfix_expr_in_unary_expr550 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary_expr557 = new BitSet(new long[]{0x00020A0048800000L});
    public static final BitSet FOLLOW_postfix_expr_in_unary_expr560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_in_postfix_expr571 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_function_parens_in_postfix_expr573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_function_parens596 = new BitSet(new long[]{0x20060A1048800000L});
    public static final BitSet FOLLOW_argument_expr_list_in_function_parens598 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_function_parens601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayblock_in_datetime623 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_timeblock_in_datetime625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_timeblock652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_timeblock654 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_TIME_in_timeblock658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_dayblock681 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DAY_in_dayblock683 = new BitSet(new long[]{0x4020000000000000L});
    public static final BitSet FOLLOW_53_in_dayblock687 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DAY_in_dayblock689 = new BitSet(new long[]{0x4020000000000000L});
    public static final BitSet FOLLOW_62_in_dayblock694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_primary_expr713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primary_expr718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primary_expr723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_primary_expr728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_primary_expr733 = new BitSet(new long[]{0x20020A1048800000L});
    public static final BitSet FOLLOW_expr_in_primary_expr734 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_primary_expr735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_argument_expr_list750 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_argument_expr_list754 = new BitSet(new long[]{0x20020A1048800000L});
    public static final BitSet FOLLOW_expr_in_argument_expr_list756 = new BitSet(new long[]{0x0020000000000002L});

}