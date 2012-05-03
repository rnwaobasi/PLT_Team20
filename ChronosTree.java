// $ANTLR 3.4 ChronosTree.g 2012-05-03 11:27:27

  import java.util.Map;
  import java.util.TreeMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ChronosTree extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "BLOCK", "BREAK_T", "CHAR", "COMMENT", "COND", "COURSELIST_T", "COURSE_T", "DATETIME", "DATETIME_T", "DAY", "DAYS", "DAYS_T", "DECL", "DOUBLE_T", "ELSE_T", "EQ", "ESC_SEQ", "EXPONENT", "FLOAT", "FOREACH_T", "FUNC", "GEQ", "HEX_DIGIT", "ID", "IF_T", "INT", "INT_T", "IN_T", "LEQ", "NEQ", "NEW_T", "NOT", "OCTAL_ESC", "OR", "PARAMS", "SCHEDULE_T", "STRING", "STRING_T", "TIME", "TIMEBLOCK_T", "TIMES", "TIME_T", "UNICODE_ESC", "WHITESPACE", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "';'", "'<'", "'='", "'>'", "'['", "']'", "'{'", "'}'", "'~'"
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
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public ChronosTree(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public ChronosTree(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return ChronosTree.tokenNames; }
    public String getGrammarFileName() { return "ChronosTree.g"; }


      /*private Map<String, Function> functionMap = new TreeMap<String, Function>();
      private Map<String, Double> variableMap = new TreeMap<String, Double>();
      
      private void define(Function function) {
      	functionMap.put(function.getName(), function);
      }
      
      // retreives a Course from function Map whose name
      // matches the text of a given AST tree node
      private Function getFunction(CommonTree nameNode) {
      	String name = nameNode.getText();
      	Function function = functionMap.get(name);
      	if (function == null) {
      		String msg = "The function \"" + name + "\" is not defined.";
      		throw new RuntimeException(msg);
      	}
      	return function;
      }
      
      // This evaluates a function whose name matches the text
      // of a given AST tree node for a given value.
      private double evalFunction(CommonTree nameNode, double value) {
        return getFunction(nameNode).getValue(value);
      }

      // This retrieves the value of a variable from our variable Map
      // whose name matches the text of a given AST tree node.
      private double getVariable(CommonTree nameNode) {
        String name = nameNode.getText();
        Double value = variableMap.get(name);
        if (value == null) {
          String msg = "The variable \"" + name + "\" is not set.";
          throw new RuntimeException(msg);
        }
        return value;
      }
    */
      // This just shortens the code for print calls.
      private static void out(Object obj) {
        System.out.print(obj);
      }
      
      // This just shortens the code for println calls.
      private static void outln(Object obj) {
        System.out.println(obj);
      }

      // This converts the text of a given AST node to a double.
      private double toDouble(CommonTree node) {
        double value = 0.0;
        String text = node.getText();
        try {
          value = Double.parseDouble(text);
        } catch (NumberFormatException e) {
          throw new RuntimeException("Cannot convert \"" + text + "\" to a double.");
        }
        return value;
      }
      
      // This replaces all escaped newline characters in a String
      // with unescaped newline characters.
      // It is used to allow newline characters to be placed in
      // literal Strings that are passed to the print command.
      private static String unescape(String text) {
        return text.replaceAll("\\\\n", "\n");
      }



    // $ANTLR start "program"
    // ChronosTree.g:83:1: program : ( line )+ ;
    public final void program() throws RecognitionException {
        try {
            // ChronosTree.g:84:2: ( ( line )+ )
            // ChronosTree.g:84:4: ( line )+
            {
            // ChronosTree.g:84:4: ( line )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DECL||LA1_0==OR||LA1_0==59) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ChronosTree.g:84:4: line
            	    {
            	    pushFollow(FOLLOW_line_in_program54);
            	    line();

            	    state._fsp--;


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
    // ChronosTree.g:86:1: line : ( declarator | stmt );
    public final void line() throws RecognitionException {
        try {
            // ChronosTree.g:86:5: ( declarator | stmt )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==DECL) ) {
                alt2=1;
            }
            else if ( (LA2_0==OR||LA2_0==59) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // ChronosTree.g:86:7: declarator
                    {
                    pushFollow(FOLLOW_declarator_in_line63);
                    declarator();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // ChronosTree.g:87:4: stmt
                    {
                    pushFollow(FOLLOW_stmt_in_line68);
                    stmt();

                    state._fsp--;


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
    // ChronosTree.g:89:1: declarator : ^( DECL type_specifier ID '=' expr ) ;
    public final void declarator() throws RecognitionException {
        try {
            // ChronosTree.g:90:2: ( ^( DECL type_specifier ID '=' expr ) )
            // ChronosTree.g:90:4: ^( DECL type_specifier ID '=' expr )
            {
            match(input,DECL,FOLLOW_DECL_in_declarator79); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_specifier_in_declarator81);
            type_specifier();

            state._fsp--;


            match(input,ID,FOLLOW_ID_in_declarator83); 

            match(input,59,FOLLOW_59_in_declarator85); 

            pushFollow(FOLLOW_expr_in_declarator87);
            expr();

            state._fsp--;


            match(input, Token.UP, null); 


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
    // ChronosTree.g:92:1: stmt : expr ;
    public final void stmt() throws RecognitionException {
        try {
            // ChronosTree.g:92:5: ( expr )
            // ChronosTree.g:92:7: expr
            {
            pushFollow(FOLLOW_expr_in_stmt97);
            expr();

            state._fsp--;


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



    // $ANTLR start "expr"
    // ChronosTree.g:94:1: expr : ( ^( OR and_expr and_expr ) | assignment_expr );
    public final void expr() throws RecognitionException {
        try {
            // ChronosTree.g:94:5: ( ^( OR and_expr and_expr ) | assignment_expr )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==OR) ) {
                alt3=1;
            }
            else if ( (LA3_0==59) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // ChronosTree.g:94:7: ^( OR and_expr and_expr )
                    {
                    match(input,OR,FOLLOW_OR_in_expr106); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_and_expr_in_expr108);
                    and_expr();

                    state._fsp--;


                    pushFollow(FOLLOW_and_expr_in_expr110);
                    and_expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 2 :
                    // ChronosTree.g:95:4: assignment_expr
                    {
                    pushFollow(FOLLOW_assignment_expr_in_expr116);
                    assignment_expr();

                    state._fsp--;


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



    // $ANTLR start "assignment_expr"
    // ChronosTree.g:97:1: assignment_expr : ^( '=' ID expr ) ;
    public final void assignment_expr() throws RecognitionException {
        try {
            // ChronosTree.g:98:2: ( ^( '=' ID expr ) )
            // ChronosTree.g:98:4: ^( '=' ID expr )
            {
            match(input,59,FOLLOW_59_in_assignment_expr127); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_assignment_expr129); 

            pushFollow(FOLLOW_expr_in_assignment_expr131);
            expr();

            state._fsp--;


            match(input, Token.UP, null); 


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
    // $ANTLR end "assignment_expr"



    // $ANTLR start "and_expr"
    // ChronosTree.g:100:1: and_expr : ( equiv_expr | ^( AND equiv_expr equiv_expr ) );
    public final void and_expr() throws RecognitionException {
        try {
            // ChronosTree.g:101:2: ( equiv_expr | ^( AND equiv_expr equiv_expr ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==DATETIME||LA4_0==EQ||LA4_0==FLOAT||LA4_0==GEQ||LA4_0==ID||LA4_0==INT||(LA4_0 >= LEQ && LA4_0 <= NEQ)||LA4_0==NOT||LA4_0==OR||LA4_0==STRING||LA4_0==TIME||LA4_0==TIMES||(LA4_0 >= 51 && LA4_0 <= 52)||(LA4_0 >= 54 && LA4_0 <= 56)||(LA4_0 >= 58 && LA4_0 <= 60)) ) {
                alt4=1;
            }
            else if ( (LA4_0==AND) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // ChronosTree.g:101:4: equiv_expr
                    {
                    pushFollow(FOLLOW_equiv_expr_in_and_expr142);
                    equiv_expr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // ChronosTree.g:102:4: ^( AND equiv_expr equiv_expr )
                    {
                    match(input,AND,FOLLOW_AND_in_and_expr148); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_equiv_expr_in_and_expr150);
                    equiv_expr();

                    state._fsp--;


                    pushFollow(FOLLOW_equiv_expr_in_and_expr152);
                    equiv_expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


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
    // $ANTLR end "and_expr"



    // $ANTLR start "equiv_expr"
    // ChronosTree.g:104:1: equiv_expr : ( rel_expr | ^( ( EQ | NEQ ) rel_expr rel_expr ) );
    public final void equiv_expr() throws RecognitionException {
        try {
            // ChronosTree.g:105:2: ( rel_expr | ^( ( EQ | NEQ ) rel_expr rel_expr ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==DATETIME||LA5_0==FLOAT||LA5_0==GEQ||LA5_0==ID||LA5_0==INT||LA5_0==LEQ||LA5_0==NOT||LA5_0==OR||LA5_0==STRING||LA5_0==TIME||LA5_0==TIMES||(LA5_0 >= 51 && LA5_0 <= 52)||(LA5_0 >= 54 && LA5_0 <= 56)||(LA5_0 >= 58 && LA5_0 <= 60)) ) {
                alt5=1;
            }
            else if ( (LA5_0==EQ||LA5_0==NEQ) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // ChronosTree.g:105:4: rel_expr
                    {
                    pushFollow(FOLLOW_rel_expr_in_equiv_expr163);
                    rel_expr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // ChronosTree.g:106:4: ^( ( EQ | NEQ ) rel_expr rel_expr )
                    {
                    if ( input.LA(1)==EQ||input.LA(1)==NEQ ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_rel_expr_in_equiv_expr177);
                    rel_expr();

                    state._fsp--;


                    pushFollow(FOLLOW_rel_expr_in_equiv_expr179);
                    rel_expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


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
    // $ANTLR end "equiv_expr"



    // $ANTLR start "rel_expr"
    // ChronosTree.g:108:1: rel_expr : ( math_expr | ^( ( '<' | '>' | GEQ | LEQ ) math_expr math_expr ) | datetime );
    public final void rel_expr() throws RecognitionException {
        try {
            // ChronosTree.g:109:2: ( math_expr | ^( ( '<' | '>' | GEQ | LEQ ) math_expr math_expr ) | datetime )
            int alt6=3;
            switch ( input.LA(1) ) {
            case FLOAT:
            case ID:
            case INT:
            case NOT:
            case OR:
            case STRING:
            case TIME:
            case TIMES:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 59:
                {
                alt6=1;
                }
                break;
            case GEQ:
            case LEQ:
            case 58:
            case 60:
                {
                alt6=2;
                }
                break;
            case DATETIME:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // ChronosTree.g:109:4: math_expr
                    {
                    pushFollow(FOLLOW_math_expr_in_rel_expr190);
                    math_expr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // ChronosTree.g:110:4: ^( ( '<' | '>' | GEQ | LEQ ) math_expr math_expr )
                    {
                    if ( input.LA(1)==GEQ||input.LA(1)==LEQ||input.LA(1)==58||input.LA(1)==60 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_math_expr_in_rel_expr212);
                    math_expr();

                    state._fsp--;


                    pushFollow(FOLLOW_math_expr_in_rel_expr214);
                    math_expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 3 :
                    // ChronosTree.g:111:4: datetime
                    {
                    pushFollow(FOLLOW_datetime_in_rel_expr220);
                    datetime();

                    state._fsp--;


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
    // $ANTLR end "rel_expr"



    // $ANTLR start "math_expr"
    // ChronosTree.g:113:1: math_expr : ( math_term | ^( ( '+' | '-' ) math_term math_term ) );
    public final void math_expr() throws RecognitionException {
        try {
            // ChronosTree.g:114:2: ( math_term | ^( ( '+' | '-' ) math_term math_term ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==FLOAT||LA7_0==ID||LA7_0==INT||LA7_0==NOT||LA7_0==OR||LA7_0==STRING||LA7_0==TIME||LA7_0==TIMES||LA7_0==51||(LA7_0 >= 55 && LA7_0 <= 56)||LA7_0==59) ) {
                alt7=1;
            }
            else if ( (LA7_0==52||LA7_0==54) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // ChronosTree.g:114:4: math_term
                    {
                    pushFollow(FOLLOW_math_term_in_math_expr230);
                    math_term();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // ChronosTree.g:115:4: ^( ( '+' | '-' ) math_term math_term )
                    {
                    if ( input.LA(1)==52||input.LA(1)==54 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_math_term_in_math_expr244);
                    math_term();

                    state._fsp--;


                    pushFollow(FOLLOW_math_term_in_math_expr246);
                    math_term();

                    state._fsp--;


                    match(input, Token.UP, null); 


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
    // $ANTLR end "math_expr"



    // $ANTLR start "math_term"
    // ChronosTree.g:117:1: math_term : ( unary_expr | ^( ( '*' | '/' ) unary_expr unary_expr ) | timeblock );
    public final void math_term() throws RecognitionException {
        try {
            // ChronosTree.g:118:2: ( unary_expr | ^( ( '*' | '/' ) unary_expr unary_expr ) | timeblock )
            int alt8=3;
            switch ( input.LA(1) ) {
            case FLOAT:
            case ID:
            case INT:
            case NOT:
            case OR:
            case STRING:
            case TIME:
            case 55:
            case 59:
                {
                alt8=1;
                }
                break;
            case 51:
            case 56:
                {
                alt8=2;
                }
                break;
            case TIMES:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // ChronosTree.g:118:4: unary_expr
                    {
                    pushFollow(FOLLOW_unary_expr_in_math_term257);
                    unary_expr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // ChronosTree.g:119:4: ^( ( '*' | '/' ) unary_expr unary_expr )
                    {
                    if ( input.LA(1)==51||input.LA(1)==56 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_unary_expr_in_math_term271);
                    unary_expr();

                    state._fsp--;


                    pushFollow(FOLLOW_unary_expr_in_math_term273);
                    unary_expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 3 :
                    // ChronosTree.g:120:4: timeblock
                    {
                    pushFollow(FOLLOW_timeblock_in_math_term279);
                    timeblock();

                    state._fsp--;


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
    // $ANTLR end "math_term"



    // $ANTLR start "unary_expr"
    // ChronosTree.g:122:1: unary_expr : ( postfix_expr | ^( '.' postfix_expr postfix_expr ) | ^( NOT postfix_expr ) );
    public final void unary_expr() throws RecognitionException {
        try {
            // ChronosTree.g:123:2: ( postfix_expr | ^( '.' postfix_expr postfix_expr ) | ^( NOT postfix_expr ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case FLOAT:
            case ID:
            case INT:
            case OR:
            case STRING:
            case TIME:
            case 59:
                {
                alt9=1;
                }
                break;
            case 55:
                {
                alt9=2;
                }
                break;
            case NOT:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // ChronosTree.g:123:4: postfix_expr
                    {
                    pushFollow(FOLLOW_postfix_expr_in_unary_expr289);
                    postfix_expr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // ChronosTree.g:124:4: ^( '.' postfix_expr postfix_expr )
                    {
                    match(input,55,FOLLOW_55_in_unary_expr295); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_postfix_expr_in_unary_expr297);
                    postfix_expr();

                    state._fsp--;


                    pushFollow(FOLLOW_postfix_expr_in_unary_expr299);
                    postfix_expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 3 :
                    // ChronosTree.g:125:4: ^( NOT postfix_expr )
                    {
                    match(input,NOT,FOLLOW_NOT_in_unary_expr306); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_postfix_expr_in_unary_expr308);
                    postfix_expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


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
    // $ANTLR end "unary_expr"



    // $ANTLR start "postfix_expr"
    // ChronosTree.g:127:1: postfix_expr : ^( primary_expr ( function_parens )? ) ;
    public final void postfix_expr() throws RecognitionException {
        try {
            // ChronosTree.g:129:2: ( ^( primary_expr ( function_parens )? ) )
            // ChronosTree.g:129:4: ^( primary_expr ( function_parens )? )
            {
            pushFollow(FOLLOW_primary_expr_in_postfix_expr322);
            primary_expr();

            state._fsp--;


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // ChronosTree.g:129:19: ( function_parens )?
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==PARAMS) ) {
                    alt10=1;
                }
                switch (alt10) {
                    case 1 :
                        // ChronosTree.g:129:19: function_parens
                        {
                        pushFollow(FOLLOW_function_parens_in_postfix_expr324);
                        function_parens();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
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
    // $ANTLR end "postfix_expr"



    // $ANTLR start "function_parens"
    // ChronosTree.g:131:1: function_parens : ^( PARAMS ( argument_expr_list )? ) ;
    public final void function_parens() throws RecognitionException {
        try {
            // ChronosTree.g:133:2: ( ^( PARAMS ( argument_expr_list )? ) )
            // ChronosTree.g:133:4: ^( PARAMS ( argument_expr_list )? )
            {
            match(input,PARAMS,FOLLOW_PARAMS_in_function_parens338); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // ChronosTree.g:133:13: ( argument_expr_list )?
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==OR||LA11_0==59) ) {
                    alt11=1;
                }
                switch (alt11) {
                    case 1 :
                        // ChronosTree.g:133:13: argument_expr_list
                        {
                        pushFollow(FOLLOW_argument_expr_list_in_function_parens340);
                        argument_expr_list();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
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
    // ChronosTree.g:135:1: datetime : ^( DATETIME dayblock timeblock ) ;
    public final void datetime() throws RecognitionException {
        try {
            // ChronosTree.g:137:2: ( ^( DATETIME dayblock timeblock ) )
            // ChronosTree.g:137:4: ^( DATETIME dayblock timeblock )
            {
            match(input,DATETIME,FOLLOW_DATETIME_in_datetime354); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_dayblock_in_datetime356);
            dayblock();

            state._fsp--;


            pushFollow(FOLLOW_timeblock_in_datetime358);
            timeblock();

            state._fsp--;


            match(input, Token.UP, null); 


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
    // ChronosTree.g:139:1: timeblock : ^( TIMES a= TIME b= TIME ) ;
    public final void timeblock() throws RecognitionException {
        CommonTree a=null;
        CommonTree b=null;

        try {
            // ChronosTree.g:141:2: ( ^( TIMES a= TIME b= TIME ) )
            // ChronosTree.g:141:4: ^( TIMES a= TIME b= TIME )
            {
            match(input,TIMES,FOLLOW_TIMES_in_timeblock371); 

            match(input, Token.DOWN, null); 
            a=(CommonTree)match(input,TIME,FOLLOW_TIME_in_timeblock375); 

            b=(CommonTree)match(input,TIME,FOLLOW_TIME_in_timeblock379); 

            match(input, Token.UP, null); 


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
    // ChronosTree.g:143:1: dayblock : ^( DAYS ( DAY )+ ) ;
    public final void dayblock() throws RecognitionException {
        try {
            // ChronosTree.g:145:2: ( ^( DAYS ( DAY )+ ) )
            // ChronosTree.g:145:4: ^( DAYS ( DAY )+ )
            {
            match(input,DAYS,FOLLOW_DAYS_in_dayblock392); 

            match(input, Token.DOWN, null); 
            // ChronosTree.g:145:11: ( DAY )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==DAY) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ChronosTree.g:145:11: DAY
            	    {
            	    match(input,DAY,FOLLOW_DAY_in_dayblock394); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            match(input, Token.UP, null); 


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



    // $ANTLR start "primary_expr"
    // ChronosTree.g:147:1: primary_expr : ( constant | ID | STRING | TIME | expr );
    public final void primary_expr() throws RecognitionException {
        try {
            // ChronosTree.g:148:2: ( constant | ID | STRING | TIME | expr )
            int alt13=5;
            switch ( input.LA(1) ) {
            case FLOAT:
            case INT:
                {
                alt13=1;
                }
                break;
            case ID:
                {
                alt13=2;
                }
                break;
            case STRING:
                {
                alt13=3;
                }
                break;
            case TIME:
                {
                alt13=4;
                }
                break;
            case OR:
            case 59:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // ChronosTree.g:148:4: constant
                    {
                    pushFollow(FOLLOW_constant_in_primary_expr406);
                    constant();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // ChronosTree.g:149:4: ID
                    {
                    match(input,ID,FOLLOW_ID_in_primary_expr411); 

                     out(ID); 

                    }
                    break;
                case 3 :
                    // ChronosTree.g:150:4: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_primary_expr418); 

                    }
                    break;
                case 4 :
                    // ChronosTree.g:151:4: TIME
                    {
                    match(input,TIME,FOLLOW_TIME_in_primary_expr423); 

                    }
                    break;
                case 5 :
                    // ChronosTree.g:152:4: expr
                    {
                    pushFollow(FOLLOW_expr_in_primary_expr428);
                    expr();

                    state._fsp--;


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



    // $ANTLR start "argument_expr_list"
    // ChronosTree.g:154:1: argument_expr_list : ( expr )+ ;
    public final void argument_expr_list() throws RecognitionException {
        try {
            // ChronosTree.g:155:2: ( ( expr )+ )
            // ChronosTree.g:155:4: ( expr )+
            {
            // ChronosTree.g:155:4: ( expr )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==OR||LA14_0==59) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ChronosTree.g:155:4: expr
            	    {
            	    pushFollow(FOLLOW_expr_in_argument_expr_list438);
            	    expr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
    // ChronosTree.g:157:1: constant returns [double value] : ( INT | FLOAT );
    public final double constant() throws RecognitionException {
        double value = 0.0;


        CommonTree INT1=null;
        CommonTree FLOAT2=null;

        try {
            // ChronosTree.g:158:2: ( INT | FLOAT )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==INT) ) {
                alt15=1;
            }
            else if ( (LA15_0==FLOAT) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // ChronosTree.g:158:4: INT
                    {
                    INT1=(CommonTree)match(input,INT,FOLLOW_INT_in_constant453); 

                    value = toDouble(INT1);

                    }
                    break;
                case 2 :
                    // ChronosTree.g:159:4: FLOAT
                    {
                    FLOAT2=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_constant460); 

                    value = toDouble(FLOAT2);

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
        return value;
    }
    // $ANTLR end "constant"



    // $ANTLR start "type_specifier"
    // ChronosTree.g:161:1: type_specifier returns [String type] : ( INT_T | DOUBLE_T | DAYS_T | TIME_T | STRING_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T );
    public final String type_specifier() throws RecognitionException {
        String type = null;


        try {
            // ChronosTree.g:162:2: ( INT_T | DOUBLE_T | DAYS_T | TIME_T | STRING_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T )
            // ChronosTree.g:
            {
            if ( (input.LA(1) >= COURSELIST_T && input.LA(1) <= COURSE_T)||input.LA(1)==DATETIME_T||input.LA(1)==DAYS_T||input.LA(1)==DOUBLE_T||input.LA(1)==INT_T||input.LA(1)==SCHEDULE_T||input.LA(1)==STRING_T||input.LA(1)==TIMEBLOCK_T||input.LA(1)==TIME_T ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
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
        return type;
    }
    // $ANTLR end "type_specifier"

    // Delegated rules


 

    public static final BitSet FOLLOW_line_in_program54 = new BitSet(new long[]{0x0800004000020002L});
    public static final BitSet FOLLOW_declarator_in_line63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_line68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECL_in_declarator79 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_specifier_in_declarator81 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_declarator83 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_declarator85 = new BitSet(new long[]{0x0800004000000000L});
    public static final BitSet FOLLOW_expr_in_declarator87 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_stmt97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_expr106 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_and_expr_in_expr108 = new BitSet(new long[]{0x1DD82A5654901010L});
    public static final BitSet FOLLOW_and_expr_in_expr110 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_assignment_expr_in_expr116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_assignment_expr127 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_assignment_expr129 = new BitSet(new long[]{0x0800004000000000L});
    public static final BitSet FOLLOW_expr_in_assignment_expr131 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_equiv_expr_in_and_expr142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_and_expr148 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_equiv_expr_in_and_expr150 = new BitSet(new long[]{0x1DD82A5654901000L});
    public static final BitSet FOLLOW_equiv_expr_in_and_expr152 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_rel_expr_in_equiv_expr163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_equiv_expr169 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_rel_expr_in_equiv_expr177 = new BitSet(new long[]{0x1DD82A5254801000L});
    public static final BitSet FOLLOW_rel_expr_in_equiv_expr179 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_math_expr_in_rel_expr190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_rel_expr196 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_math_expr_in_rel_expr212 = new BitSet(new long[]{0x09D82A5050800000L});
    public static final BitSet FOLLOW_math_expr_in_rel_expr214 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_datetime_in_rel_expr220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_math_term_in_math_expr230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_math_expr236 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_math_term_in_math_expr244 = new BitSet(new long[]{0x09882A5050800000L});
    public static final BitSet FOLLOW_math_term_in_math_expr246 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_unary_expr_in_math_term257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_math_term263 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_unary_expr_in_math_term271 = new BitSet(new long[]{0x08800A5050800000L});
    public static final BitSet FOLLOW_unary_expr_in_math_term273 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_timeblock_in_math_term279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_expr_in_unary_expr289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_unary_expr295 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_postfix_expr_in_unary_expr297 = new BitSet(new long[]{0x08000A4050800000L});
    public static final BitSet FOLLOW_postfix_expr_in_unary_expr299 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_unary_expr306 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_postfix_expr_in_unary_expr308 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primary_expr_in_postfix_expr322 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_function_parens_in_postfix_expr324 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAMS_in_function_parens338 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_argument_expr_list_in_function_parens340 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DATETIME_in_datetime354 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_dayblock_in_datetime356 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_timeblock_in_datetime358 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMES_in_timeblock371 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TIME_in_timeblock375 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_TIME_in_timeblock379 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAYS_in_dayblock392 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DAY_in_dayblock394 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_constant_in_primary_expr406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primary_expr411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primary_expr418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_primary_expr423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_primary_expr428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_argument_expr_list438 = new BitSet(new long[]{0x0800004000000002L});
    public static final BitSet FOLLOW_INT_in_constant453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_constant460 = new BitSet(new long[]{0x0000000000000002L});

}