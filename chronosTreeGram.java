// $ANTLR 3.4 /Users/shannonlee/PLT_Team20/chronosTreeGram.g 2012-05-03 08:56:31

  import java.util.Map;
  import java.util.TreeMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class chronosTreeGram extends DebugTreeParser {
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


public static final String[] ruleNames = new String[] {
    "invalidRule", "unary_expr", "primary_expr", "and_expr", "argument_expr_list", 
    "line", "type_specifier", "rel_expr", "stmt", "datetime", "declarator", 
    "function_parens", "equiv_expr", "dayblock", "expr", "timeblock", "math_expr", 
    "math_term", "postfix_expr", "assignment_expr", "constant", "program"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public chronosTreeGram(TreeNodeStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public chronosTreeGram(TreeNodeStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this, port, input.getTreeAdaptor());

        setDebugListener(proxy);
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
    }

public chronosTreeGram(TreeNodeStream input, DebugEventListener dbg) {
    super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

    public String[] getTokenNames() { return chronosTreeGram.tokenNames; }
    public String getGrammarFileName() { return "/Users/shannonlee/PLT_Team20/chronosTreeGram.g"; }


      private Map<String, Function> functionMap = new TreeMap<String, Function>();
      private Map<String, Double> variableMap = new TreeMap<String, Double>();
      
      private void define(Function function) {
      	functionMap.put(function.getName(), function);
      }
      
      // retreives a Function from functino Map whose name
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
    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:83:1: program : ( line )+ ;
    public final void program() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "program");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(83, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:84:2: ( ( line )+ )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:84:4: ( line )+
            {
            dbg.location(84,4);
            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:84:4: ( line )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==DECL||LA1_0==OR||LA1_0==59) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:84:4: line
            	    {
            	    dbg.location(84,4);
            	    pushFollow(FOLLOW_line_in_program54);
            	    line();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
            } while (true);
            } finally {dbg.exitSubRule(1);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(85, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "program");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "program"



    // $ANTLR start "line"
    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:86:1: line : ( declarator | stmt );
    public final void line() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "line");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(86, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:86:5: ( declarator | stmt )
            int alt2=2;
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:86:7: declarator
                    {
                    dbg.location(86,7);
                    pushFollow(FOLLOW_declarator_in_line63);
                    declarator();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:87:4: stmt
                    {
                    dbg.location(87,4);
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
        dbg.location(88, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "line");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "line"



    // $ANTLR start "declarator"
    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:89:1: declarator : ^( DECL type_specifier ID '=' expr ) ;
    public final void declarator() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "declarator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(89, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:90:2: ( ^( DECL type_specifier ID '=' expr ) )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:90:4: ^( DECL type_specifier ID '=' expr )
            {
            dbg.location(90,4);
            dbg.location(90,6);
            match(input,DECL,FOLLOW_DECL_in_declarator79); 

            match(input, Token.DOWN, null); 
            dbg.location(90,11);
            pushFollow(FOLLOW_type_specifier_in_declarator81);
            type_specifier();

            state._fsp--;

            dbg.location(90,26);
            match(input,ID,FOLLOW_ID_in_declarator83); 
            dbg.location(90,29);
            match(input,59,FOLLOW_59_in_declarator85); 
            dbg.location(90,33);
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
        dbg.location(91, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "declarator");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "declarator"



    // $ANTLR start "stmt"
    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:92:1: stmt : expr ;
    public final void stmt() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(92, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:92:5: ( expr )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:92:7: expr
            {
            dbg.location(92,7);
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
        dbg.location(93, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "stmt"



    // $ANTLR start "expr"
    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:94:1: expr : ( ^( OR and_expr and_expr ) | assignment_expr );
    public final void expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(94, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:94:5: ( ^( OR and_expr and_expr ) | assignment_expr )
            int alt3=2;
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:94:7: ^( OR and_expr and_expr )
                    {
                    dbg.location(94,7);
                    dbg.location(94,9);
                    match(input,OR,FOLLOW_OR_in_expr106); 

                    match(input, Token.DOWN, null); 
                    dbg.location(94,12);
                    pushFollow(FOLLOW_and_expr_in_expr108);
                    and_expr();

                    state._fsp--;

                    dbg.location(94,21);
                    pushFollow(FOLLOW_and_expr_in_expr110);
                    and_expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:95:4: assignment_expr
                    {
                    dbg.location(95,4);
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
        dbg.location(96, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "expr"



    // $ANTLR start "assignment_expr"
    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:97:1: assignment_expr : ^( '=' ID expr ) ;
    public final void assignment_expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "assignment_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(97, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:98:2: ( ^( '=' ID expr ) )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:98:4: ^( '=' ID expr )
            {
            dbg.location(98,4);
            dbg.location(98,6);
            match(input,59,FOLLOW_59_in_assignment_expr127); 

            match(input, Token.DOWN, null); 
            dbg.location(98,10);
            match(input,ID,FOLLOW_ID_in_assignment_expr129); 
            dbg.location(98,13);
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
        dbg.location(99, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assignment_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "assignment_expr"



    // $ANTLR start "and_expr"
    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:100:1: and_expr : ( equiv_expr | ^( AND equiv_expr equiv_expr ) );
    public final void and_expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "and_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(100, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:101:2: ( equiv_expr | ^( AND equiv_expr equiv_expr ) )
            int alt4=2;
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:101:4: equiv_expr
                    {
                    dbg.location(101,4);
                    pushFollow(FOLLOW_equiv_expr_in_and_expr142);
                    equiv_expr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:102:4: ^( AND equiv_expr equiv_expr )
                    {
                    dbg.location(102,4);
                    dbg.location(102,6);
                    match(input,AND,FOLLOW_AND_in_and_expr148); 

                    match(input, Token.DOWN, null); 
                    dbg.location(102,10);
                    pushFollow(FOLLOW_equiv_expr_in_and_expr150);
                    equiv_expr();

                    state._fsp--;

                    dbg.location(102,21);
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
        dbg.location(103, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "and_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "and_expr"



    // $ANTLR start "equiv_expr"
    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:104:1: equiv_expr : ( rel_expr | ^( ( EQ | NEQ ) rel_expr rel_expr ) );
    public final void equiv_expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "equiv_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(104, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:105:2: ( rel_expr | ^( ( EQ | NEQ ) rel_expr rel_expr ) )
            int alt5=2;
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:105:4: rel_expr
                    {
                    dbg.location(105,4);
                    pushFollow(FOLLOW_rel_expr_in_equiv_expr163);
                    rel_expr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:106:4: ^( ( EQ | NEQ ) rel_expr rel_expr )
                    {
                    dbg.location(106,4);
                    dbg.location(106,6);
                    if ( input.LA(1)==EQ||input.LA(1)==NEQ ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }


                    match(input, Token.DOWN, null); 
                    dbg.location(106,17);
                    pushFollow(FOLLOW_rel_expr_in_equiv_expr177);
                    rel_expr();

                    state._fsp--;

                    dbg.location(106,26);
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
        dbg.location(107, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "equiv_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "equiv_expr"



    // $ANTLR start "rel_expr"
    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:108:1: rel_expr : ( math_expr | ^( ( '<' | '>' | GEQ | LEQ ) math_expr math_expr ) | datetime );
    public final void rel_expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "rel_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(108, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:109:2: ( math_expr | ^( ( '<' | '>' | GEQ | LEQ ) math_expr math_expr ) | datetime )
            int alt6=3;
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:109:4: math_expr
                    {
                    dbg.location(109,4);
                    pushFollow(FOLLOW_math_expr_in_rel_expr190);
                    math_expr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:110:4: ^( ( '<' | '>' | GEQ | LEQ ) math_expr math_expr )
                    {
                    dbg.location(110,4);
                    dbg.location(110,6);
                    if ( input.LA(1)==GEQ||input.LA(1)==LEQ||input.LA(1)==58||input.LA(1)==60 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }


                    match(input, Token.DOWN, null); 
                    dbg.location(110,30);
                    pushFollow(FOLLOW_math_expr_in_rel_expr212);
                    math_expr();

                    state._fsp--;

                    dbg.location(110,40);
                    pushFollow(FOLLOW_math_expr_in_rel_expr214);
                    math_expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:111:4: datetime
                    {
                    dbg.location(111,4);
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
        dbg.location(112, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rel_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "rel_expr"



    // $ANTLR start "math_expr"
    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:113:1: math_expr : ( math_term | ^( ( '+' | '-' ) math_term math_term ) );
    public final void math_expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "math_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(113, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:114:2: ( math_term | ^( ( '+' | '-' ) math_term math_term ) )
            int alt7=2;
            try { dbg.enterDecision(7, decisionCanBacktrack[7]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:114:4: math_term
                    {
                    dbg.location(114,4);
                    pushFollow(FOLLOW_math_term_in_math_expr230);
                    math_term();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:115:4: ^( ( '+' | '-' ) math_term math_term )
                    {
                    dbg.location(115,4);
                    dbg.location(115,6);
                    if ( input.LA(1)==52||input.LA(1)==54 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }


                    match(input, Token.DOWN, null); 
                    dbg.location(115,18);
                    pushFollow(FOLLOW_math_term_in_math_expr244);
                    math_term();

                    state._fsp--;

                    dbg.location(115,28);
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
        dbg.location(116, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "math_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "math_expr"



    // $ANTLR start "math_term"
    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:117:1: math_term : ( unary_expr | ^( ( '*' | '/' ) unary_expr unary_expr ) | timeblock );
    public final void math_term() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "math_term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(117, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:118:2: ( unary_expr | ^( ( '*' | '/' ) unary_expr unary_expr ) | timeblock )
            int alt8=3;
            try { dbg.enterDecision(8, decisionCanBacktrack[8]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:118:4: unary_expr
                    {
                    dbg.location(118,4);
                    pushFollow(FOLLOW_unary_expr_in_math_term257);
                    unary_expr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:119:4: ^( ( '*' | '/' ) unary_expr unary_expr )
                    {
                    dbg.location(119,4);
                    dbg.location(119,6);
                    if ( input.LA(1)==51||input.LA(1)==56 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }


                    match(input, Token.DOWN, null); 
                    dbg.location(119,18);
                    pushFollow(FOLLOW_unary_expr_in_math_term271);
                    unary_expr();

                    state._fsp--;

                    dbg.location(119,29);
                    pushFollow(FOLLOW_unary_expr_in_math_term273);
                    unary_expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:120:4: timeblock
                    {
                    dbg.location(120,4);
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
        dbg.location(121, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "math_term");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "math_term"



    // $ANTLR start "unary_expr"
    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:122:1: unary_expr : ( postfix_expr | ^( '.' postfix_expr postfix_expr ) | ^( NOT postfix_expr ) );
    public final void unary_expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "unary_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(122, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:123:2: ( postfix_expr | ^( '.' postfix_expr postfix_expr ) | ^( NOT postfix_expr ) )
            int alt9=3;
            try { dbg.enterDecision(9, decisionCanBacktrack[9]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:123:4: postfix_expr
                    {
                    dbg.location(123,4);
                    pushFollow(FOLLOW_postfix_expr_in_unary_expr289);
                    postfix_expr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:124:4: ^( '.' postfix_expr postfix_expr )
                    {
                    dbg.location(124,4);
                    dbg.location(124,6);
                    match(input,55,FOLLOW_55_in_unary_expr295); 

                    match(input, Token.DOWN, null); 
                    dbg.location(124,10);
                    pushFollow(FOLLOW_postfix_expr_in_unary_expr297);
                    postfix_expr();

                    state._fsp--;

                    dbg.location(124,23);
                    pushFollow(FOLLOW_postfix_expr_in_unary_expr299);
                    postfix_expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:125:4: ^( NOT postfix_expr )
                    {
                    dbg.location(125,4);
                    dbg.location(125,6);
                    match(input,NOT,FOLLOW_NOT_in_unary_expr306); 

                    match(input, Token.DOWN, null); 
                    dbg.location(125,10);
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
        dbg.location(126, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "unary_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "unary_expr"



    // $ANTLR start "postfix_expr"
    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:127:1: postfix_expr : ^( primary_expr ( function_parens )? ) ;
    public final void postfix_expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "postfix_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(127, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:129:2: ( ^( primary_expr ( function_parens )? ) )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:129:4: ^( primary_expr ( function_parens )? )
            {
            dbg.location(129,4);
            dbg.location(129,6);
            pushFollow(FOLLOW_primary_expr_in_postfix_expr322);
            primary_expr();

            state._fsp--;


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                dbg.location(129,19);
                // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:129:19: ( function_parens )?
                int alt10=2;
                try { dbg.enterSubRule(10);
                try { dbg.enterDecision(10, decisionCanBacktrack[10]);

                int LA10_0 = input.LA(1);

                if ( (LA10_0==PARAMS) ) {
                    alt10=1;
                }
                } finally {dbg.exitDecision(10);}

                switch (alt10) {
                    case 1 :
                        dbg.enterAlt(1);

                        // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:129:19: function_parens
                        {
                        dbg.location(129,19);
                        pushFollow(FOLLOW_function_parens_in_postfix_expr324);
                        function_parens();

                        state._fsp--;


                        }
                        break;

                }
                } finally {dbg.exitSubRule(10);}


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
        dbg.location(130, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "postfix_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "postfix_expr"



    // $ANTLR start "function_parens"
    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:131:1: function_parens : ^( PARAMS ( argument_expr_list )? ) ;
    public final void function_parens() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "function_parens");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(131, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:133:2: ( ^( PARAMS ( argument_expr_list )? ) )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:133:4: ^( PARAMS ( argument_expr_list )? )
            {
            dbg.location(133,4);
            dbg.location(133,6);
            match(input,PARAMS,FOLLOW_PARAMS_in_function_parens338); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                dbg.location(133,13);
                // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:133:13: ( argument_expr_list )?
                int alt11=2;
                try { dbg.enterSubRule(11);
                try { dbg.enterDecision(11, decisionCanBacktrack[11]);

                int LA11_0 = input.LA(1);

                if ( (LA11_0==OR||LA11_0==59) ) {
                    alt11=1;
                }
                } finally {dbg.exitDecision(11);}

                switch (alt11) {
                    case 1 :
                        dbg.enterAlt(1);

                        // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:133:13: argument_expr_list
                        {
                        dbg.location(133,13);
                        pushFollow(FOLLOW_argument_expr_list_in_function_parens340);
                        argument_expr_list();

                        state._fsp--;


                        }
                        break;

                }
                } finally {dbg.exitSubRule(11);}


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
        dbg.location(134, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "function_parens");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "function_parens"



    // $ANTLR start "datetime"
    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:135:1: datetime : ^( DATETIME dayblock timeblock ) ;
    public final void datetime() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "datetime");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(135, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:137:2: ( ^( DATETIME dayblock timeblock ) )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:137:4: ^( DATETIME dayblock timeblock )
            {
            dbg.location(137,4);
            dbg.location(137,6);
            match(input,DATETIME,FOLLOW_DATETIME_in_datetime354); 

            match(input, Token.DOWN, null); 
            dbg.location(137,15);
            pushFollow(FOLLOW_dayblock_in_datetime356);
            dayblock();

            state._fsp--;

            dbg.location(137,24);
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
        dbg.location(138, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "datetime");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "datetime"



    // $ANTLR start "timeblock"
    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:139:1: timeblock : ^( TIMES a= TIME b= TIME ) ;
    public final void timeblock() throws RecognitionException {
        CommonTree a=null;
        CommonTree b=null;

        try { dbg.enterRule(getGrammarFileName(), "timeblock");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(139, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:141:2: ( ^( TIMES a= TIME b= TIME ) )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:141:4: ^( TIMES a= TIME b= TIME )
            {
            dbg.location(141,4);
            dbg.location(141,6);
            match(input,TIMES,FOLLOW_TIMES_in_timeblock371); 

            match(input, Token.DOWN, null); 
            dbg.location(141,13);
            a=(CommonTree)match(input,TIME,FOLLOW_TIME_in_timeblock375); 
            dbg.location(141,20);
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
        dbg.location(142, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "timeblock");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "timeblock"



    // $ANTLR start "dayblock"
    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:143:1: dayblock : ^( DAYS ( DAY )+ ) ;
    public final void dayblock() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "dayblock");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(143, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:145:2: ( ^( DAYS ( DAY )+ ) )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:145:4: ^( DAYS ( DAY )+ )
            {
            dbg.location(145,4);
            dbg.location(145,6);
            match(input,DAYS,FOLLOW_DAYS_in_dayblock392); 

            match(input, Token.DOWN, null); 
            dbg.location(145,11);
            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:145:11: ( DAY )+
            int cnt12=0;
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                int LA12_0 = input.LA(1);

                if ( (LA12_0==DAY) ) {
                    alt12=1;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:145:11: DAY
            	    {
            	    dbg.location(145,11);
            	    match(input,DAY,FOLLOW_DAY_in_dayblock394); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt12++;
            } while (true);
            } finally {dbg.exitSubRule(12);}


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
        dbg.location(146, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dayblock");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "dayblock"



    // $ANTLR start "primary_expr"
    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:147:1: primary_expr : ( constant | ID | STRING | TIME | expr );
    public final void primary_expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "primary_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(147, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:148:2: ( constant | ID | STRING | TIME | expr )
            int alt13=5;
            try { dbg.enterDecision(13, decisionCanBacktrack[13]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:148:4: constant
                    {
                    dbg.location(148,4);
                    pushFollow(FOLLOW_constant_in_primary_expr406);
                    constant();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:149:4: ID
                    {
                    dbg.location(149,4);
                    match(input,ID,FOLLOW_ID_in_primary_expr411); 
                    dbg.location(149,7);
                     out(ID); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:150:4: STRING
                    {
                    dbg.location(150,4);
                    match(input,STRING,FOLLOW_STRING_in_primary_expr418); 

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:151:4: TIME
                    {
                    dbg.location(151,4);
                    match(input,TIME,FOLLOW_TIME_in_primary_expr423); 

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:152:4: expr
                    {
                    dbg.location(152,4);
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
        dbg.location(153, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "primary_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "primary_expr"



    // $ANTLR start "argument_expr_list"
    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:154:1: argument_expr_list : ( expr )+ ;
    public final void argument_expr_list() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "argument_expr_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(154, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:155:2: ( ( expr )+ )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:155:4: ( expr )+
            {
            dbg.location(155,4);
            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:155:4: ( expr )+
            int cnt14=0;
            try { dbg.enterSubRule(14);

            loop14:
            do {
                int alt14=2;
                try { dbg.enterDecision(14, decisionCanBacktrack[14]);

                int LA14_0 = input.LA(1);

                if ( (LA14_0==OR||LA14_0==59) ) {
                    alt14=1;
                }


                } finally {dbg.exitDecision(14);}

                switch (alt14) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:155:4: expr
            	    {
            	    dbg.location(155,4);
            	    pushFollow(FOLLOW_expr_in_argument_expr_list438);
            	    expr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt14++;
            } while (true);
            } finally {dbg.exitSubRule(14);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(156, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "argument_expr_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "argument_expr_list"



    // $ANTLR start "constant"
    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:157:1: constant returns [double value] : ( INT | FLOAT );
    public final double constant() throws RecognitionException {
        double value = 0.0;


        CommonTree INT1=null;
        CommonTree FLOAT2=null;

        try { dbg.enterRule(getGrammarFileName(), "constant");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(157, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:158:2: ( INT | FLOAT )
            int alt15=2;
            try { dbg.enterDecision(15, decisionCanBacktrack[15]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:158:4: INT
                    {
                    dbg.location(158,4);
                    INT1=(CommonTree)match(input,INT,FOLLOW_INT_in_constant453); 
                    dbg.location(158,8);
                    value = toDouble(INT1);

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:159:4: FLOAT
                    {
                    dbg.location(159,4);
                    FLOAT2=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_constant460); 
                    dbg.location(159,10);
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
        dbg.location(160, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "constant");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end "constant"



    // $ANTLR start "type_specifier"
    // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:161:1: type_specifier : ( INT_T | DOUBLE_T | DAYS_T | TIME_T | STRING_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T );
    public final void type_specifier() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "type_specifier");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(161, 0);

        try {
            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:162:2: ( INT_T | DOUBLE_T | DAYS_T | TIME_T | STRING_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T )
            dbg.enterAlt(1);

            // /Users/shannonlee/PLT_Team20/chronosTreeGram.g:
            {
            dbg.location(162,2);
            if ( (input.LA(1) >= COURSELIST_T && input.LA(1) <= COURSE_T)||input.LA(1)==DATETIME_T||input.LA(1)==DAYS_T||input.LA(1)==DOUBLE_T||input.LA(1)==INT_T||input.LA(1)==SCHEDULE_T||input.LA(1)==STRING_T||input.LA(1)==TIMEBLOCK_T||input.LA(1)==TIME_T ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(172, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "type_specifier");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
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