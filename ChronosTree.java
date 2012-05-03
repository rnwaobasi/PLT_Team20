// $ANTLR 3.4 ChronosTree.g 2012-05-03 11:46:51

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
    // ChronosTree.g:89:1: declarator : ( ^( DECL type_specifier ID ) | ^( DECL type_specifier ID '=' expr ) );
    public final void declarator() throws RecognitionException {
        try {
            // ChronosTree.g:90:2: ( ^( DECL type_specifier ID ) | ^( DECL type_specifier ID '=' expr ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==DECL) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==DOWN) ) {
                    int LA3_2 = input.LA(3);

                    if ( ((LA3_2 >= COURSELIST_T && LA3_2 <= COURSE_T)||LA3_2==DATETIME_T||LA3_2==DAYS_T||LA3_2==DOUBLE_T||LA3_2==INT_T||LA3_2==SCHEDULE_T||LA3_2==STRING_T||LA3_2==TIMEBLOCK_T||LA3_2==TIME_T) ) {
                        int LA3_3 = input.LA(4);

                        if ( (LA3_3==ID) ) {
                            int LA3_4 = input.LA(5);

                            if ( (LA3_4==UP) ) {
                                alt3=1;
                            }
                            else if ( (LA3_4==59) ) {
                                alt3=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 4, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 3, input);

                            throw nvae;

                        }
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
                    // ChronosTree.g:90:4: ^( DECL type_specifier ID )
                    {
                    match(input,DECL,FOLLOW_DECL_in_declarator79); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_specifier_in_declarator81);
                    type_specifier();

                    state._fsp--;


                    match(input,ID,FOLLOW_ID_in_declarator83); 

                    match(input, Token.UP, null); 


                    }
                    break;
                case 2 :
                    // ChronosTree.g:91:4: ^( DECL type_specifier ID '=' expr )
                    {
                    match(input,DECL,FOLLOW_DECL_in_declarator90); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_specifier_in_declarator92);
                    type_specifier();

                    state._fsp--;


                    match(input,ID,FOLLOW_ID_in_declarator94); 

                    match(input,59,FOLLOW_59_in_declarator96); 

                    pushFollow(FOLLOW_expr_in_declarator98);
                    expr();

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
    // $ANTLR end "declarator"



    // $ANTLR start "stmt"
    // ChronosTree.g:93:1: stmt : expr ;
    public final void stmt() throws RecognitionException {
        try {
            // ChronosTree.g:93:5: ( expr )
            // ChronosTree.g:93:7: expr
            {
            pushFollow(FOLLOW_expr_in_stmt108);
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
    // ChronosTree.g:95:1: expr : ( ^( OR and_expr and_expr ) | assignment_expr );
    public final void expr() throws RecognitionException {
        try {
            // ChronosTree.g:95:5: ( ^( OR and_expr and_expr ) | assignment_expr )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==OR) ) {
                alt4=1;
            }
            else if ( (LA4_0==59) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // ChronosTree.g:95:7: ^( OR and_expr and_expr )
                    {
                    match(input,OR,FOLLOW_OR_in_expr117); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_and_expr_in_expr119);
                    and_expr();

                    state._fsp--;


                    pushFollow(FOLLOW_and_expr_in_expr121);
                    and_expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 2 :
                    // ChronosTree.g:96:4: assignment_expr
                    {
                    pushFollow(FOLLOW_assignment_expr_in_expr127);
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
    // ChronosTree.g:98:1: assignment_expr : ^( '=' ID expr ) ;
    public final void assignment_expr() throws RecognitionException {
        try {
            // ChronosTree.g:99:2: ( ^( '=' ID expr ) )
            // ChronosTree.g:99:4: ^( '=' ID expr )
            {
            match(input,59,FOLLOW_59_in_assignment_expr138); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_assignment_expr140); 

            pushFollow(FOLLOW_expr_in_assignment_expr142);
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
    // ChronosTree.g:101:1: and_expr : ( equiv_expr | ^( AND equiv_expr equiv_expr ) );
    public final void and_expr() throws RecognitionException {
        try {
            // ChronosTree.g:102:2: ( equiv_expr | ^( AND equiv_expr equiv_expr ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==DATETIME||LA5_0==EQ||LA5_0==FLOAT||LA5_0==GEQ||LA5_0==ID||LA5_0==INT||(LA5_0 >= LEQ && LA5_0 <= NEQ)||LA5_0==NOT||LA5_0==OR||LA5_0==STRING||LA5_0==TIME||LA5_0==TIMES||(LA5_0 >= 51 && LA5_0 <= 52)||(LA5_0 >= 54 && LA5_0 <= 56)||(LA5_0 >= 58 && LA5_0 <= 60)) ) {
                alt5=1;
            }
            else if ( (LA5_0==AND) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // ChronosTree.g:102:4: equiv_expr
                    {
                    pushFollow(FOLLOW_equiv_expr_in_and_expr153);
                    equiv_expr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // ChronosTree.g:103:4: ^( AND equiv_expr equiv_expr )
                    {
                    match(input,AND,FOLLOW_AND_in_and_expr159); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_equiv_expr_in_and_expr161);
                    equiv_expr();

                    state._fsp--;


                    pushFollow(FOLLOW_equiv_expr_in_and_expr163);
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
    // ChronosTree.g:105:1: equiv_expr : ( rel_expr | ^( ( EQ | NEQ ) rel_expr rel_expr ) );
    public final void equiv_expr() throws RecognitionException {
        try {
            // ChronosTree.g:106:2: ( rel_expr | ^( ( EQ | NEQ ) rel_expr rel_expr ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==DATETIME||LA6_0==FLOAT||LA6_0==GEQ||LA6_0==ID||LA6_0==INT||LA6_0==LEQ||LA6_0==NOT||LA6_0==OR||LA6_0==STRING||LA6_0==TIME||LA6_0==TIMES||(LA6_0 >= 51 && LA6_0 <= 52)||(LA6_0 >= 54 && LA6_0 <= 56)||(LA6_0 >= 58 && LA6_0 <= 60)) ) {
                alt6=1;
            }
            else if ( (LA6_0==EQ||LA6_0==NEQ) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // ChronosTree.g:106:4: rel_expr
                    {
                    pushFollow(FOLLOW_rel_expr_in_equiv_expr174);
                    rel_expr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // ChronosTree.g:107:4: ^( ( EQ | NEQ ) rel_expr rel_expr )
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
                    pushFollow(FOLLOW_rel_expr_in_equiv_expr188);
                    rel_expr();

                    state._fsp--;


                    pushFollow(FOLLOW_rel_expr_in_equiv_expr190);
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
    // ChronosTree.g:109:1: rel_expr : ( math_expr | ^( ( '<' | '>' | GEQ | LEQ ) math_expr math_expr ) | datetime );
    public final void rel_expr() throws RecognitionException {
        try {
            // ChronosTree.g:110:2: ( math_expr | ^( ( '<' | '>' | GEQ | LEQ ) math_expr math_expr ) | datetime )
            int alt7=3;
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
                alt7=1;
                }
                break;
            case GEQ:
            case LEQ:
            case 58:
            case 60:
                {
                alt7=2;
                }
                break;
            case DATETIME:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // ChronosTree.g:110:4: math_expr
                    {
                    pushFollow(FOLLOW_math_expr_in_rel_expr201);
                    math_expr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // ChronosTree.g:111:4: ^( ( '<' | '>' | GEQ | LEQ ) math_expr math_expr )
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
                    pushFollow(FOLLOW_math_expr_in_rel_expr223);
                    math_expr();

                    state._fsp--;


                    pushFollow(FOLLOW_math_expr_in_rel_expr225);
                    math_expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 3 :
                    // ChronosTree.g:112:4: datetime
                    {
                    pushFollow(FOLLOW_datetime_in_rel_expr231);
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
    // ChronosTree.g:114:1: math_expr : ( math_term | ^( ( '+' | '-' ) math_term math_term ) );
    public final void math_expr() throws RecognitionException {
        try {
            // ChronosTree.g:115:2: ( math_term | ^( ( '+' | '-' ) math_term math_term ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==FLOAT||LA8_0==ID||LA8_0==INT||LA8_0==NOT||LA8_0==OR||LA8_0==STRING||LA8_0==TIME||LA8_0==TIMES||LA8_0==51||(LA8_0 >= 55 && LA8_0 <= 56)||LA8_0==59) ) {
                alt8=1;
            }
            else if ( (LA8_0==52||LA8_0==54) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // ChronosTree.g:115:4: math_term
                    {
                    pushFollow(FOLLOW_math_term_in_math_expr241);
                    math_term();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // ChronosTree.g:116:4: ^( ( '+' | '-' ) math_term math_term )
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
                    pushFollow(FOLLOW_math_term_in_math_expr255);
                    math_term();

                    state._fsp--;


                    pushFollow(FOLLOW_math_term_in_math_expr257);
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
    // ChronosTree.g:118:1: math_term : ( unary_expr | ^( ( '*' | '/' ) unary_expr unary_expr ) | timeblock );
    public final void math_term() throws RecognitionException {
        try {
            // ChronosTree.g:119:2: ( unary_expr | ^( ( '*' | '/' ) unary_expr unary_expr ) | timeblock )
            int alt9=3;
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
                alt9=1;
                }
                break;
            case 51:
            case 56:
                {
                alt9=2;
                }
                break;
            case TIMES:
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
                    // ChronosTree.g:119:4: unary_expr
                    {
                    pushFollow(FOLLOW_unary_expr_in_math_term268);
                    unary_expr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // ChronosTree.g:120:4: ^( ( '*' | '/' ) unary_expr unary_expr )
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
                    pushFollow(FOLLOW_unary_expr_in_math_term282);
                    unary_expr();

                    state._fsp--;


                    pushFollow(FOLLOW_unary_expr_in_math_term284);
                    unary_expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 3 :
                    // ChronosTree.g:121:4: timeblock
                    {
                    pushFollow(FOLLOW_timeblock_in_math_term290);
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
    // ChronosTree.g:123:1: unary_expr : ( postfix_expr | ^( '.' postfix_expr postfix_expr ) | ^( NOT postfix_expr ) );
    public final void unary_expr() throws RecognitionException {
        try {
            // ChronosTree.g:124:2: ( postfix_expr | ^( '.' postfix_expr postfix_expr ) | ^( NOT postfix_expr ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case FLOAT:
            case ID:
            case INT:
            case OR:
            case STRING:
            case TIME:
            case 59:
                {
                alt10=1;
                }
                break;
            case 55:
                {
                alt10=2;
                }
                break;
            case NOT:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // ChronosTree.g:124:4: postfix_expr
                    {
                    pushFollow(FOLLOW_postfix_expr_in_unary_expr300);
                    postfix_expr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // ChronosTree.g:125:4: ^( '.' postfix_expr postfix_expr )
                    {
                    match(input,55,FOLLOW_55_in_unary_expr306); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_postfix_expr_in_unary_expr308);
                    postfix_expr();

                    state._fsp--;


                    pushFollow(FOLLOW_postfix_expr_in_unary_expr310);
                    postfix_expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 3 :
                    // ChronosTree.g:126:4: ^( NOT postfix_expr )
                    {
                    match(input,NOT,FOLLOW_NOT_in_unary_expr317); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_postfix_expr_in_unary_expr319);
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
    // ChronosTree.g:128:1: postfix_expr : ^( primary_expr ( function_parens )? ) ;
    public final void postfix_expr() throws RecognitionException {
        try {
            // ChronosTree.g:130:2: ( ^( primary_expr ( function_parens )? ) )
            // ChronosTree.g:130:4: ^( primary_expr ( function_parens )? )
            {
            pushFollow(FOLLOW_primary_expr_in_postfix_expr333);
            primary_expr();

            state._fsp--;


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // ChronosTree.g:130:19: ( function_parens )?
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==PARAMS) ) {
                    alt11=1;
                }
                switch (alt11) {
                    case 1 :
                        // ChronosTree.g:130:19: function_parens
                        {
                        pushFollow(FOLLOW_function_parens_in_postfix_expr335);
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
    // ChronosTree.g:132:1: function_parens : ^( PARAMS ( argument_expr_list )? ) ;
    public final void function_parens() throws RecognitionException {
        try {
            // ChronosTree.g:134:2: ( ^( PARAMS ( argument_expr_list )? ) )
            // ChronosTree.g:134:4: ^( PARAMS ( argument_expr_list )? )
            {
            match(input,PARAMS,FOLLOW_PARAMS_in_function_parens349); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // ChronosTree.g:134:13: ( argument_expr_list )?
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==OR||LA12_0==59) ) {
                    alt12=1;
                }
                switch (alt12) {
                    case 1 :
                        // ChronosTree.g:134:13: argument_expr_list
                        {
                        pushFollow(FOLLOW_argument_expr_list_in_function_parens351);
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
    // ChronosTree.g:136:1: datetime : ^( DATETIME dayblock timeblock ) ;
    public final void datetime() throws RecognitionException {
        try {
            // ChronosTree.g:138:2: ( ^( DATETIME dayblock timeblock ) )
            // ChronosTree.g:138:4: ^( DATETIME dayblock timeblock )
            {
            match(input,DATETIME,FOLLOW_DATETIME_in_datetime365); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_dayblock_in_datetime367);
            dayblock();

            state._fsp--;


            pushFollow(FOLLOW_timeblock_in_datetime369);
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
    // ChronosTree.g:140:1: timeblock : ^( TIMES a= TIME b= TIME ) ;
    public final void timeblock() throws RecognitionException {
        CommonTree a=null;
        CommonTree b=null;

        try {
            // ChronosTree.g:142:2: ( ^( TIMES a= TIME b= TIME ) )
            // ChronosTree.g:142:4: ^( TIMES a= TIME b= TIME )
            {
            match(input,TIMES,FOLLOW_TIMES_in_timeblock382); 

            match(input, Token.DOWN, null); 
            a=(CommonTree)match(input,TIME,FOLLOW_TIME_in_timeblock386); 

            b=(CommonTree)match(input,TIME,FOLLOW_TIME_in_timeblock390); 

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
    // ChronosTree.g:144:1: dayblock : ^( DAYS ( DAY )+ ) ;
    public final void dayblock() throws RecognitionException {
        try {
            // ChronosTree.g:146:2: ( ^( DAYS ( DAY )+ ) )
            // ChronosTree.g:146:4: ^( DAYS ( DAY )+ )
            {
            match(input,DAYS,FOLLOW_DAYS_in_dayblock403); 

            match(input, Token.DOWN, null); 
            // ChronosTree.g:146:11: ( DAY )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==DAY) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ChronosTree.g:146:11: DAY
            	    {
            	    match(input,DAY,FOLLOW_DAY_in_dayblock405); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
    // ChronosTree.g:148:1: primary_expr : ( constant | ID | STRING | TIME | expr );
    public final void primary_expr() throws RecognitionException {
        CommonTree ID1=null;

        try {
            // ChronosTree.g:149:2: ( constant | ID | STRING | TIME | expr )
            int alt14=5;
            switch ( input.LA(1) ) {
            case FLOAT:
            case INT:
                {
                alt14=1;
                }
                break;
            case ID:
                {
                alt14=2;
                }
                break;
            case STRING:
                {
                alt14=3;
                }
                break;
            case TIME:
                {
                alt14=4;
                }
                break;
            case OR:
            case 59:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // ChronosTree.g:149:4: constant
                    {
                    pushFollow(FOLLOW_constant_in_primary_expr417);
                    constant();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // ChronosTree.g:150:4: ID
                    {
                    ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_primary_expr422); 

                     out((ID1!=null?ID1.getText():null)); 

                    }
                    break;
                case 3 :
                    // ChronosTree.g:151:4: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_primary_expr429); 

                    }
                    break;
                case 4 :
                    // ChronosTree.g:152:4: TIME
                    {
                    match(input,TIME,FOLLOW_TIME_in_primary_expr434); 

                    }
                    break;
                case 5 :
                    // ChronosTree.g:153:4: expr
                    {
                    pushFollow(FOLLOW_expr_in_primary_expr439);
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
    // ChronosTree.g:155:1: argument_expr_list : ( expr )+ ;
    public final void argument_expr_list() throws RecognitionException {
        try {
            // ChronosTree.g:156:2: ( ( expr )+ )
            // ChronosTree.g:156:4: ( expr )+
            {
            // ChronosTree.g:156:4: ( expr )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==OR||LA15_0==59) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ChronosTree.g:156:4: expr
            	    {
            	    pushFollow(FOLLOW_expr_in_argument_expr_list449);
            	    expr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
    // ChronosTree.g:158:1: constant returns [double value] : ( INT | FLOAT );
    public final double constant() throws RecognitionException {
        double value = 0.0;


        CommonTree INT2=null;
        CommonTree FLOAT3=null;

        try {
            // ChronosTree.g:159:2: ( INT | FLOAT )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==INT) ) {
                alt16=1;
            }
            else if ( (LA16_0==FLOAT) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // ChronosTree.g:159:4: INT
                    {
                    INT2=(CommonTree)match(input,INT,FOLLOW_INT_in_constant464); 

                    value = toDouble(INT2);

                    }
                    break;
                case 2 :
                    // ChronosTree.g:160:4: FLOAT
                    {
                    FLOAT3=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_constant471); 

                    value = toDouble(FLOAT3);

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
    // ChronosTree.g:162:1: type_specifier returns [String type] : ( INT_T | DOUBLE_T | DAYS_T | TIME_T | STRING_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T );
    public final String type_specifier() throws RecognitionException {
        String type = null;


        try {
            // ChronosTree.g:163:2: ( INT_T | DOUBLE_T | DAYS_T | TIME_T | STRING_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T )
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
    public static final BitSet FOLLOW_ID_in_declarator83 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECL_in_declarator90 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_specifier_in_declarator92 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_declarator94 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_declarator96 = new BitSet(new long[]{0x0800004000000000L});
    public static final BitSet FOLLOW_expr_in_declarator98 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_stmt108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_expr117 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_and_expr_in_expr119 = new BitSet(new long[]{0x1DD82A5654901010L});
    public static final BitSet FOLLOW_and_expr_in_expr121 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_assignment_expr_in_expr127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_assignment_expr138 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_assignment_expr140 = new BitSet(new long[]{0x0800004000000000L});
    public static final BitSet FOLLOW_expr_in_assignment_expr142 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_equiv_expr_in_and_expr153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_and_expr159 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_equiv_expr_in_and_expr161 = new BitSet(new long[]{0x1DD82A5654901000L});
    public static final BitSet FOLLOW_equiv_expr_in_and_expr163 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_rel_expr_in_equiv_expr174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_equiv_expr180 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_rel_expr_in_equiv_expr188 = new BitSet(new long[]{0x1DD82A5254801000L});
    public static final BitSet FOLLOW_rel_expr_in_equiv_expr190 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_math_expr_in_rel_expr201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_rel_expr207 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_math_expr_in_rel_expr223 = new BitSet(new long[]{0x09D82A5050800000L});
    public static final BitSet FOLLOW_math_expr_in_rel_expr225 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_datetime_in_rel_expr231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_math_term_in_math_expr241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_math_expr247 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_math_term_in_math_expr255 = new BitSet(new long[]{0x09882A5050800000L});
    public static final BitSet FOLLOW_math_term_in_math_expr257 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_unary_expr_in_math_term268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_math_term274 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_unary_expr_in_math_term282 = new BitSet(new long[]{0x08800A5050800000L});
    public static final BitSet FOLLOW_unary_expr_in_math_term284 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_timeblock_in_math_term290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_expr_in_unary_expr300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_unary_expr306 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_postfix_expr_in_unary_expr308 = new BitSet(new long[]{0x08000A4050800000L});
    public static final BitSet FOLLOW_postfix_expr_in_unary_expr310 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_unary_expr317 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_postfix_expr_in_unary_expr319 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primary_expr_in_postfix_expr333 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_function_parens_in_postfix_expr335 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAMS_in_function_parens349 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_argument_expr_list_in_function_parens351 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DATETIME_in_datetime365 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_dayblock_in_datetime367 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_timeblock_in_datetime369 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMES_in_timeblock382 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TIME_in_timeblock386 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_TIME_in_timeblock390 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAYS_in_dayblock403 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DAY_in_dayblock405 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_constant_in_primary_expr417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primary_expr422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primary_expr429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_primary_expr434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_primary_expr439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_argument_expr_list449 = new BitSet(new long[]{0x0800004000000002L});
    public static final BitSet FOLLOW_INT_in_constant464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_constant471 = new BitSet(new long[]{0x0000000000000002L});

}