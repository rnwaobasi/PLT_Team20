// $ANTLR 3.4 C:\\Academics\\COMS W4115\\project\\ChronosTree.g 2012-05-04 21:43:06

  import java.util.Map;
  import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ChronosTree extends TreeFilter {
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
    public TreeFilter[] getDelegates() {
        return new TreeFilter[] {};
    }

    // delegators


    public ChronosTree(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public ChronosTree(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return ChronosTree.tokenNames; }
    public String getGrammarFileName() { return "C:\\Academics\\COMS W4115\\project\\ChronosTree.g"; }


    	private int toInt(CommonTree node) {
    		int value = 0;
    		String text = node.getText();
    		try {
    			value = Integer.parseInt(text);
    		} catch (NumberFormatException e) {
    			throw new RuntimeException("Cannot convert to int");
    		}
    		return value;
    	}
    	
    	// shortcut general print method
    	private void out(String str) {
    		System.out.println(str);
    	}

    	// for print statements
    	// gets rid of the surrounding quotes
    	private void print(String str) {
    		int oneBeforeEnd = str.length()-1;
    		String noQuotes = str.substring(1,oneBeforeEnd);
    		out(noQuotes);
    	}



    // $ANTLR start "program"
    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:41:1: program : ( line )+ ;
    public final void program() throws RecognitionException {
        try {
            // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:42:2: ( ( line )+ )
            // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:42:4: ( line )+
            {
            // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:42:4: ( line )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==AND||LA1_0==BREAK_T||LA1_0==COND||LA1_0==DATETIME||LA1_0==DAYS||LA1_0==DECL||LA1_0==EQ||(LA1_0 >= FLOAT && LA1_0 <= FOREACH_T)||LA1_0==GEQ||LA1_0==ID||(LA1_0 >= INST && LA1_0 <= INT)||(LA1_0 >= LEQ && LA1_0 <= NEQ)||LA1_0==NOT||LA1_0==OR||LA1_0==STRING||LA1_0==TIME||LA1_0==TIMES||(LA1_0 >= 53 && LA1_0 <= 54)||(LA1_0 >= 56 && LA1_0 <= 58)||(LA1_0 >= 60 && LA1_0 <= 62)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:42:4: line
            	    {
            	    pushFollow(FOLLOW_line_in_program60);
            	    line();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "program"



    // $ANTLR start "line"
    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:44:1: line : ( declarator | stmt );
    public final void line() throws RecognitionException {
        try {
            // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:44:5: ( declarator | stmt )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==DECL||LA2_0==INST) ) {
                alt2=1;
            }
            else if ( (LA2_0==AND||LA2_0==BREAK_T||LA2_0==COND||LA2_0==DATETIME||LA2_0==DAYS||LA2_0==EQ||(LA2_0 >= FLOAT && LA2_0 <= FOREACH_T)||LA2_0==GEQ||LA2_0==ID||LA2_0==INT||(LA2_0 >= LEQ && LA2_0 <= NEQ)||LA2_0==NOT||LA2_0==OR||LA2_0==STRING||LA2_0==TIME||LA2_0==TIMES||(LA2_0 >= 53 && LA2_0 <= 54)||(LA2_0 >= 56 && LA2_0 <= 58)||(LA2_0 >= 60 && LA2_0 <= 62)) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:44:7: declarator
                    {
                    pushFollow(FOLLOW_declarator_in_line69);
                    declarator();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:45:4: stmt
                    {
                    pushFollow(FOLLOW_stmt_in_line74);
                    stmt();

                    state._fsp--;
                    if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "line"



    // $ANTLR start "declarator"
    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:47:1: declarator : ( ^( DECL type_specifier ID ) | ^( INST ^( DECL type_specifier ID ) ^( '=' ID expr ) ) );
    public final void declarator() throws RecognitionException {
        try {
            // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:48:2: ( ^( DECL type_specifier ID ) | ^( INST ^( DECL type_specifier ID ) ^( '=' ID expr ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==DECL) ) {
                alt3=1;
            }
            else if ( (LA3_0==INST) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:48:4: ^( DECL type_specifier ID )
                    {
                    match(input,DECL,FOLLOW_DECL_in_declarator85); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_type_specifier_in_declarator87);
                    type_specifier();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,ID,FOLLOW_ID_in_declarator89); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:49:4: ^( INST ^( DECL type_specifier ID ) ^( '=' ID expr ) )
                    {
                    match(input,INST,FOLLOW_INST_in_declarator96); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,DECL,FOLLOW_DECL_in_declarator99); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_type_specifier_in_declarator101);
                    type_specifier();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,ID,FOLLOW_ID_in_declarator103); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    match(input,61,FOLLOW_61_in_declarator107); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,ID,FOLLOW_ID_in_declarator109); if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_declarator111);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    match(input, Token.UP, null); if (state.failed) return ;


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
        return ;
    }
    // $ANTLR end "declarator"



    // $ANTLR start "stmt"
    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:51:1: stmt : ( expr | selection_stmt | iteration_stmt | jump_stmt );
    public final void stmt() throws RecognitionException {
        try {
            // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:51:5: ( expr | selection_stmt | iteration_stmt | jump_stmt )
            int alt4=4;
            switch ( input.LA(1) ) {
            case AND:
            case DATETIME:
            case DAYS:
            case EQ:
            case FLOAT:
            case GEQ:
            case ID:
            case INT:
            case LEQ:
            case MASTER_T:
            case NEQ:
            case NOT:
            case OR:
            case STRING:
            case TIME:
            case TIMES:
            case 53:
            case 54:
            case 56:
            case 57:
            case 58:
            case 60:
            case 61:
            case 62:
                {
                alt4=1;
                }
                break;
            case COND:
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
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:51:7: expr
                    {
                    pushFollow(FOLLOW_expr_in_stmt121);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:52:4: selection_stmt
                    {
                    pushFollow(FOLLOW_selection_stmt_in_stmt126);
                    selection_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:53:4: iteration_stmt
                    {
                    pushFollow(FOLLOW_iteration_stmt_in_stmt131);
                    iteration_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:54:4: jump_stmt
                    {
                    pushFollow(FOLLOW_jump_stmt_in_stmt136);
                    jump_stmt();

                    state._fsp--;
                    if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "stmt"



    // $ANTLR start "selection_stmt"
    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:56:1: selection_stmt : ^( COND ^( IF_T expr (a= line )* ) ^( ELSE_T (b= line )* ) ) ;
    public final void selection_stmt() throws RecognitionException {
        try {
            // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:57:2: ( ^( COND ^( IF_T expr (a= line )* ) ^( ELSE_T (b= line )* ) ) )
            // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:57:4: ^( COND ^( IF_T expr (a= line )* ) ^( ELSE_T (b= line )* ) )
            {
            match(input,COND,FOLLOW_COND_in_selection_stmt147); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,IF_T,FOLLOW_IF_T_in_selection_stmt150); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_selection_stmt152);
            expr();

            state._fsp--;
            if (state.failed) return ;

            // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:57:24: (a= line )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==AND||LA5_0==BREAK_T||LA5_0==COND||LA5_0==DATETIME||LA5_0==DAYS||LA5_0==DECL||LA5_0==EQ||(LA5_0 >= FLOAT && LA5_0 <= FOREACH_T)||LA5_0==GEQ||LA5_0==ID||(LA5_0 >= INST && LA5_0 <= INT)||(LA5_0 >= LEQ && LA5_0 <= NEQ)||LA5_0==NOT||LA5_0==OR||LA5_0==STRING||LA5_0==TIME||LA5_0==TIMES||(LA5_0 >= 53 && LA5_0 <= 54)||(LA5_0 >= 56 && LA5_0 <= 58)||(LA5_0 >= 60 && LA5_0 <= 62)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:57:24: a= line
            	    {
            	    pushFollow(FOLLOW_line_in_selection_stmt156);
            	    line();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            match(input,ELSE_T,FOLLOW_ELSE_T_in_selection_stmt161); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:57:42: (b= line )*
                loop6:
                do {
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==AND||LA6_0==BREAK_T||LA6_0==COND||LA6_0==DATETIME||LA6_0==DAYS||LA6_0==DECL||LA6_0==EQ||(LA6_0 >= FLOAT && LA6_0 <= FOREACH_T)||LA6_0==GEQ||LA6_0==ID||(LA6_0 >= INST && LA6_0 <= INT)||(LA6_0 >= LEQ && LA6_0 <= NEQ)||LA6_0==NOT||LA6_0==OR||LA6_0==STRING||LA6_0==TIME||LA6_0==TIMES||(LA6_0 >= 53 && LA6_0 <= 54)||(LA6_0 >= 56 && LA6_0 <= 58)||(LA6_0 >= 60 && LA6_0 <= 62)) ) {
                        alt6=1;
                    }


                    switch (alt6) {
                	case 1 :
                	    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:57:42: b= line
                	    {
                	    pushFollow(FOLLOW_line_in_selection_stmt165);
                	    line();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop6;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "selection_stmt"



    // $ANTLR start "iteration_stmt"
    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:59:1: iteration_stmt : ^( FOREACH_T ^( IN_T element= ID list= ID ) ^( BLOCK ( line )* ) ) ;
    public final void iteration_stmt() throws RecognitionException {
        CommonTree element=null;
        CommonTree list=null;

        try {
            // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:60:2: ( ^( FOREACH_T ^( IN_T element= ID list= ID ) ^( BLOCK ( line )* ) ) )
            // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:60:4: ^( FOREACH_T ^( IN_T element= ID list= ID ) ^( BLOCK ( line )* ) )
            {
            match(input,FOREACH_T,FOLLOW_FOREACH_T_in_iteration_stmt179); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,IN_T,FOLLOW_IN_T_in_iteration_stmt182); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            element=(CommonTree)match(input,ID,FOLLOW_ID_in_iteration_stmt186); if (state.failed) return ;

            list=(CommonTree)match(input,ID,FOLLOW_ID_in_iteration_stmt190); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            match(input,BLOCK,FOLLOW_BLOCK_in_iteration_stmt194); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:60:51: ( line )*
                loop7:
                do {
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==AND||LA7_0==BREAK_T||LA7_0==COND||LA7_0==DATETIME||LA7_0==DAYS||LA7_0==DECL||LA7_0==EQ||(LA7_0 >= FLOAT && LA7_0 <= FOREACH_T)||LA7_0==GEQ||LA7_0==ID||(LA7_0 >= INST && LA7_0 <= INT)||(LA7_0 >= LEQ && LA7_0 <= NEQ)||LA7_0==NOT||LA7_0==OR||LA7_0==STRING||LA7_0==TIME||LA7_0==TIMES||(LA7_0 >= 53 && LA7_0 <= 54)||(LA7_0 >= 56 && LA7_0 <= 58)||(LA7_0 >= 60 && LA7_0 <= 62)) ) {
                        alt7=1;
                    }


                    switch (alt7) {
                	case 1 :
                	    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:60:51: line
                	    {
                	    pushFollow(FOLLOW_line_in_iteration_stmt196);
                	    line();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop7;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "iteration_stmt"



    // $ANTLR start "jump_stmt"
    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:62:1: jump_stmt : BREAK_T ;
    public final void jump_stmt() throws RecognitionException {
        try {
            // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:63:2: ( BREAK_T )
            // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:63:4: BREAK_T
            {
            match(input,BREAK_T,FOLLOW_BREAK_T_in_jump_stmt209); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "jump_stmt"



    // $ANTLR start "expr"
    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:68:1: expr : ( ^( OR expr expr ) | ^( '=' ID expr ) | ^( AND expr expr ) | ^( EQ expr expr ) | ^( NEQ expr expr ) | ^( GEQ expr expr ) | ^( LEQ expr expr ) | ^( '<' expr expr ) | ^( '>' expr expr ) | ^( '+' expr expr ) | ^( '-' expr expr ) | ^( '*' expr expr ) | ^( '/' expr expr ) | ^( '.' expr expr ) | ^( NOT expr ) | datetime | timeblock | dayblock | MASTER_T | ^( primary_expr function_parens ) );
    public final void expr() throws RecognitionException {
        try {
            // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:68:5: ( ^( OR expr expr ) | ^( '=' ID expr ) | ^( AND expr expr ) | ^( EQ expr expr ) | ^( NEQ expr expr ) | ^( GEQ expr expr ) | ^( LEQ expr expr ) | ^( '<' expr expr ) | ^( '>' expr expr ) | ^( '+' expr expr ) | ^( '-' expr expr ) | ^( '*' expr expr ) | ^( '/' expr expr ) | ^( '.' expr expr ) | ^( NOT expr ) | datetime | timeblock | dayblock | MASTER_T | ^( primary_expr function_parens ) )
            int alt8=20;
            switch ( input.LA(1) ) {
            case OR:
                {
                alt8=1;
                }
                break;
            case 61:
                {
                alt8=2;
                }
                break;
            case AND:
                {
                alt8=3;
                }
                break;
            case EQ:
                {
                alt8=4;
                }
                break;
            case NEQ:
                {
                alt8=5;
                }
                break;
            case GEQ:
                {
                alt8=6;
                }
                break;
            case LEQ:
                {
                alt8=7;
                }
                break;
            case 60:
                {
                alt8=8;
                }
                break;
            case 62:
                {
                alt8=9;
                }
                break;
            case 54:
                {
                alt8=10;
                }
                break;
            case 56:
                {
                alt8=11;
                }
                break;
            case 53:
                {
                alt8=12;
                }
                break;
            case 58:
                {
                alt8=13;
                }
                break;
            case 57:
                {
                alt8=14;
                }
                break;
            case NOT:
                {
                alt8=15;
                }
                break;
            case DATETIME:
                {
                alt8=16;
                }
                break;
            case TIMES:
                {
                alt8=17;
                }
                break;
            case DAYS:
                {
                alt8=18;
                }
                break;
            case MASTER_T:
                {
                alt8=19;
                }
                break;
            case FLOAT:
            case ID:
            case INT:
            case STRING:
            case TIME:
                {
                alt8=20;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:68:7: ^( OR expr expr )
                    {
                    match(input,OR,FOLLOW_OR_in_expr220); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr222);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr224);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:69:4: ^( '=' ID expr )
                    {
                    match(input,61,FOLLOW_61_in_expr231); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    match(input,ID,FOLLOW_ID_in_expr233); if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr235);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:70:4: ^( AND expr expr )
                    {
                    match(input,AND,FOLLOW_AND_in_expr242); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr244);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr246);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:71:4: ^( EQ expr expr )
                    {
                    match(input,EQ,FOLLOW_EQ_in_expr253); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr255);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr257);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 5 :
                    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:72:4: ^( NEQ expr expr )
                    {
                    match(input,NEQ,FOLLOW_NEQ_in_expr264); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr266);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr268);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 6 :
                    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:73:4: ^( GEQ expr expr )
                    {
                    match(input,GEQ,FOLLOW_GEQ_in_expr275); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr277);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr279);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 7 :
                    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:74:4: ^( LEQ expr expr )
                    {
                    match(input,LEQ,FOLLOW_LEQ_in_expr286); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr288);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr290);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 8 :
                    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:75:4: ^( '<' expr expr )
                    {
                    match(input,60,FOLLOW_60_in_expr297); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr299);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr301);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 9 :
                    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:76:4: ^( '>' expr expr )
                    {
                    match(input,62,FOLLOW_62_in_expr308); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr310);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr312);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 10 :
                    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:77:4: ^( '+' expr expr )
                    {
                    match(input,54,FOLLOW_54_in_expr319); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr321);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr323);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 11 :
                    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:78:4: ^( '-' expr expr )
                    {
                    match(input,56,FOLLOW_56_in_expr330); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr332);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr334);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 12 :
                    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:79:4: ^( '*' expr expr )
                    {
                    match(input,53,FOLLOW_53_in_expr341); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr343);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr345);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 13 :
                    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:80:4: ^( '/' expr expr )
                    {
                    match(input,58,FOLLOW_58_in_expr352); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr354);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr356);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 14 :
                    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:81:4: ^( '.' expr expr )
                    {
                    match(input,57,FOLLOW_57_in_expr363); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr365);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_expr367);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 15 :
                    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:82:4: ^( NOT expr )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expr374); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_expr376);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;
                case 16 :
                    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:83:4: datetime
                    {
                    pushFollow(FOLLOW_datetime_in_expr382);
                    datetime();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 17 :
                    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:84:4: timeblock
                    {
                    pushFollow(FOLLOW_timeblock_in_expr387);
                    timeblock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 18 :
                    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:85:4: dayblock
                    {
                    pushFollow(FOLLOW_dayblock_in_expr392);
                    dayblock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 19 :
                    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:86:4: MASTER_T
                    {
                    match(input,MASTER_T,FOLLOW_MASTER_T_in_expr397); if (state.failed) return ;

                    }
                    break;
                case 20 :
                    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:87:4: ^( primary_expr function_parens )
                    {
                    pushFollow(FOLLOW_primary_expr_in_expr403);
                    primary_expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    pushFollow(FOLLOW_function_parens_in_expr405);
                    function_parens();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


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
        return ;
    }
    // $ANTLR end "expr"



    // $ANTLR start "primary_expr"
    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:93:1: primary_expr : ( constant | ID | STRING | TIME );
    public final void primary_expr() throws RecognitionException {
        try {
            // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:94:2: ( constant | ID | STRING | TIME )
            int alt9=4;
            switch ( input.LA(1) ) {
            case FLOAT:
            case INT:
                {
                alt9=1;
                }
                break;
            case ID:
                {
                alt9=2;
                }
                break;
            case STRING:
                {
                alt9=3;
                }
                break;
            case TIME:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:94:4: constant
                    {
                    pushFollow(FOLLOW_constant_in_primary_expr419);
                    constant();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:95:4: ID
                    {
                    match(input,ID,FOLLOW_ID_in_primary_expr424); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:96:4: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_primary_expr429); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:97:4: TIME
                    {
                    match(input,TIME,FOLLOW_TIME_in_primary_expr434); if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "primary_expr"



    // $ANTLR start "function_parens"
    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:100:1: function_parens : ^( PARAMS ( argument_expr_list )? ) ;
    public final void function_parens() throws RecognitionException {
        try {
            // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:102:2: ( ^( PARAMS ( argument_expr_list )? ) )
            // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:102:4: ^( PARAMS ( argument_expr_list )? )
            {
            match(input,PARAMS,FOLLOW_PARAMS_in_function_parens447); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:102:13: ( argument_expr_list )?
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==AND||LA10_0==DATETIME||LA10_0==DAYS||LA10_0==EQ||LA10_0==FLOAT||LA10_0==GEQ||LA10_0==ID||LA10_0==INT||(LA10_0 >= LEQ && LA10_0 <= NEQ)||LA10_0==NOT||LA10_0==OR||LA10_0==STRING||LA10_0==TIME||LA10_0==TIMES||(LA10_0 >= 53 && LA10_0 <= 54)||(LA10_0 >= 56 && LA10_0 <= 58)||(LA10_0 >= 60 && LA10_0 <= 62)) ) {
                    alt10=1;
                }
                switch (alt10) {
                    case 1 :
                        // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:102:13: argument_expr_list
                        {
                        pushFollow(FOLLOW_argument_expr_list_in_function_parens449);
                        argument_expr_list();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return ;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "function_parens"



    // $ANTLR start "datetime"
    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:104:1: datetime : ^( DATETIME dayblock timeblock ) ;
    public final void datetime() throws RecognitionException {
        try {
            // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:106:2: ( ^( DATETIME dayblock timeblock ) )
            // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:106:4: ^( DATETIME dayblock timeblock )
            {
            match(input,DATETIME,FOLLOW_DATETIME_in_datetime463); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_dayblock_in_datetime465);
            dayblock();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_timeblock_in_datetime467);
            timeblock();

            state._fsp--;
            if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "datetime"



    // $ANTLR start "timeblock"
    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:108:1: timeblock : ^( TIMES a= TIME b= TIME ) ;
    public final void timeblock() throws RecognitionException {
        CommonTree a=null;
        CommonTree b=null;

        try {
            // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:110:2: ( ^( TIMES a= TIME b= TIME ) )
            // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:110:4: ^( TIMES a= TIME b= TIME )
            {
            match(input,TIMES,FOLLOW_TIMES_in_timeblock480); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            a=(CommonTree)match(input,TIME,FOLLOW_TIME_in_timeblock484); if (state.failed) return ;

            b=(CommonTree)match(input,TIME,FOLLOW_TIME_in_timeblock488); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "timeblock"



    // $ANTLR start "dayblock"
    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:112:1: dayblock : ^( DAYS ( DAY )+ ) ;
    public final void dayblock() throws RecognitionException {
        try {
            // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:114:2: ( ^( DAYS ( DAY )+ ) )
            // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:114:4: ^( DAYS ( DAY )+ )
            {
            match(input,DAYS,FOLLOW_DAYS_in_dayblock501); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:114:11: ( DAY )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==DAY) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:114:11: DAY
            	    {
            	    match(input,DAY,FOLLOW_DAY_in_dayblock503); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "dayblock"



    // $ANTLR start "argument_expr_list"
    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:124:1: argument_expr_list : ( expr )+ ;
    public final void argument_expr_list() throws RecognitionException {
        try {
            // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:125:2: ( ( expr )+ )
            // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:125:4: ( expr )+
            {
            // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:125:4: ( expr )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==AND||LA12_0==DATETIME||LA12_0==DAYS||LA12_0==EQ||LA12_0==FLOAT||LA12_0==GEQ||LA12_0==ID||LA12_0==INT||(LA12_0 >= LEQ && LA12_0 <= NEQ)||LA12_0==NOT||LA12_0==OR||LA12_0==STRING||LA12_0==TIME||LA12_0==TIMES||(LA12_0 >= 53 && LA12_0 <= 54)||(LA12_0 >= 56 && LA12_0 <= 58)||(LA12_0 >= 60 && LA12_0 <= 62)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:125:4: expr
            	    {
            	    pushFollow(FOLLOW_expr_in_argument_expr_list517);
            	    expr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "argument_expr_list"



    // $ANTLR start "constant"
    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:127:1: constant : ( INT | FLOAT );
    public final void constant() throws RecognitionException {
        try {
            // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:128:2: ( INT | FLOAT )
            // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:
            {
            if ( input.LA(1)==FLOAT||input.LA(1)==INT ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "constant"



    // $ANTLR start "type_specifier"
    // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:131:1: type_specifier : ( INT_T | DOUBLE_T | DAYS_T | TIME_T | STRING_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T );
    public final void type_specifier() throws RecognitionException {
        try {
            // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:132:2: ( INT_T | DOUBLE_T | DAYS_T | TIME_T | STRING_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T )
            // C:\\Academics\\COMS W4115\\project\\ChronosTree.g:
            {
            if ( (input.LA(1) >= COURSELIST_T && input.LA(1) <= COURSE_T)||input.LA(1)==DATETIME_T||input.LA(1)==DAYS_T||input.LA(1)==DOUBLE_T||input.LA(1)==INT_T||input.LA(1)==SCHEDULE_T||input.LA(1)==STRING_T||input.LA(1)==TIMEBLOCK_T||input.LA(1)==TIME_T ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "type_specifier"

    // Delegated rules


 

    public static final BitSet FOLLOW_line_in_program60 = new BitSet(new long[]{0x7760A95CD5929252L});
    public static final BitSet FOLLOW_declarator_in_line69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_line74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECL_in_declarator85 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_specifier_in_declarator87 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_declarator89 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INST_in_declarator96 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DECL_in_declarator99 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_specifier_in_declarator101 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_declarator103 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_61_in_declarator107 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_declarator109 = new BitSet(new long[]{0x7760A95C94909010L});
    public static final BitSet FOLLOW_expr_in_declarator111 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_stmt121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_stmt_in_stmt126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_stmt_in_stmt131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_stmt_in_stmt136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COND_in_selection_stmt147 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IF_T_in_selection_stmt150 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_selection_stmt152 = new BitSet(new long[]{0x7760A95CD5929258L});
    public static final BitSet FOLLOW_line_in_selection_stmt156 = new BitSet(new long[]{0x7760A95CD5929258L});
    public static final BitSet FOLLOW_ELSE_T_in_selection_stmt161 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_line_in_selection_stmt165 = new BitSet(new long[]{0x7760A95CD5929258L});
    public static final BitSet FOLLOW_FOREACH_T_in_iteration_stmt179 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IN_T_in_iteration_stmt182 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_iteration_stmt186 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_iteration_stmt190 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_iteration_stmt194 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_line_in_iteration_stmt196 = new BitSet(new long[]{0x7760A95CD5929258L});
    public static final BitSet FOLLOW_BREAK_T_in_jump_stmt209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_expr220 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr222 = new BitSet(new long[]{0x7760A95C94909010L});
    public static final BitSet FOLLOW_expr_in_expr224 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_61_in_expr231 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expr233 = new BitSet(new long[]{0x7760A95C94909010L});
    public static final BitSet FOLLOW_expr_in_expr235 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_expr242 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr244 = new BitSet(new long[]{0x7760A95C94909010L});
    public static final BitSet FOLLOW_expr_in_expr246 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQ_in_expr253 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr255 = new BitSet(new long[]{0x7760A95C94909010L});
    public static final BitSet FOLLOW_expr_in_expr257 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEQ_in_expr264 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr266 = new BitSet(new long[]{0x7760A95C94909010L});
    public static final BitSet FOLLOW_expr_in_expr268 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GEQ_in_expr275 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr277 = new BitSet(new long[]{0x7760A95C94909010L});
    public static final BitSet FOLLOW_expr_in_expr279 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LEQ_in_expr286 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr288 = new BitSet(new long[]{0x7760A95C94909010L});
    public static final BitSet FOLLOW_expr_in_expr290 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_60_in_expr297 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr299 = new BitSet(new long[]{0x7760A95C94909010L});
    public static final BitSet FOLLOW_expr_in_expr301 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_62_in_expr308 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr310 = new BitSet(new long[]{0x7760A95C94909010L});
    public static final BitSet FOLLOW_expr_in_expr312 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_54_in_expr319 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr321 = new BitSet(new long[]{0x7760A95C94909010L});
    public static final BitSet FOLLOW_expr_in_expr323 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_56_in_expr330 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr332 = new BitSet(new long[]{0x7760A95C94909010L});
    public static final BitSet FOLLOW_expr_in_expr334 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_53_in_expr341 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr343 = new BitSet(new long[]{0x7760A95C94909010L});
    public static final BitSet FOLLOW_expr_in_expr345 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_58_in_expr352 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr354 = new BitSet(new long[]{0x7760A95C94909010L});
    public static final BitSet FOLLOW_expr_in_expr356 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_57_in_expr363 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr365 = new BitSet(new long[]{0x7760A95C94909010L});
    public static final BitSet FOLLOW_expr_in_expr367 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expr374 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr376 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_datetime_in_expr382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeblock_in_expr387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayblock_in_expr392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MASTER_T_in_expr397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expr_in_expr403 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_function_parens_in_expr405 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_constant_in_primary_expr419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primary_expr424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primary_expr429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_primary_expr434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARAMS_in_function_parens447 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_argument_expr_list_in_function_parens449 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DATETIME_in_datetime463 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_dayblock_in_datetime465 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_timeblock_in_datetime467 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMES_in_timeblock480 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TIME_in_timeblock484 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_TIME_in_timeblock488 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAYS_in_dayblock501 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DAY_in_dayblock503 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_expr_in_argument_expr_list517 = new BitSet(new long[]{0x7760A95C94909012L});

}