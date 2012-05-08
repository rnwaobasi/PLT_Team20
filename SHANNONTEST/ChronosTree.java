// $ANTLR 3.4 ChronosTree.g 2012-05-07 23:21:39

  import java.util.Map;
  import java.util.TreeMap;
  import java.lang.reflect.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ChronosTree extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "BLOCK", "BREAK_T", "CHAR", "COMMENT", "COND", "COURSELIST_T", "COURSE_T", "DATETIME", "DATETIME_T", "DAY", "DAYBLOCK_T", "DAYS", "DECL", "DOUBLE", "DOUBLE_T", "ELSE_T", "EQ", "ESC_SEQ", "FOREACH_T", "FUNC", "GEQ", "HEX_DIGIT", "ID", "IF_T", "INST", "INT", "INT_T", "IN_T", "LEQ", "NEQ", "NEW_T", "NOT", "OCTAL_ESC", "OR", "PARAMS", "SCHEDULE_T", "STRING", "STRING_T", "TIME", "TIMEBLOCK_T", "TIMES", "TIME_T", "UNICODE_ESC", "WS", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "';'", "'<'", "'='", "'>'", "'['", "']'", "'{'", "'}'", "'~'"
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
    public static final int TIME=43;
    public static final int TIMEBLOCK_T=44;
    public static final int TIMES=45;
    public static final int TIME_T=46;
    public static final int UNICODE_ESC=47;
    public static final int WS=48;

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


    	// TreeMap for storing our variables
     	private Map<String, CVal> varMap = new TreeMap<String, CVal>();
     	private Scheduler sch;

    	/* function for evaluating functions!
    	private Object evalFunction(String funcName, ArrayList<String> params) {
    		
    	}*/
    	
    	private void makeMasterList(String file) {
    		out("tryina make the master");
    		sch = new Scheduler(file);
    	}
    	
    	private void put(String name, CVal obj) {
    		varMap.put(name, obj);
    		out("Put " + name + " in the map with value " + obj);
    	}
    	
    	// shortcut for System.out.println
    	private void out(Object obj) {
    		System.out.println(obj);
    	}
    	
    	// shortcut for System.err.println
    	private void err(String str) {
    		System.err.println(str);
    	}
    	
    	// shortcut for getting the string of info about an object
    	private String info(String str, CVal obj) {
    		String s = str + " = " + obj;
    		return s;
    	}

    	// prints Strings
    	// gets rid of the surrounding quotes
    	private void printString(String str) {
    		String noQuotes = str.substring(1,str.length()-1);
    		System.out.print(noQuotes);
    	}
    	
    	// shortuct for System.out.print
    	private void print(Object obj) {
    		System.out.print(obj);
    	}



    // $ANTLR start "program"
    // ChronosTree.g:64:1: program : ( line )+ ;
    public final void program() throws RecognitionException {
         int num = 0; 
        try {
            // ChronosTree.g:66:2: ( ( line )+ )
            // ChronosTree.g:66:4: ( line )+
            {
            // ChronosTree.g:66:4: ( line )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==AND||LA1_0==BREAK_T||LA1_0==COND||LA1_0==DATETIME||LA1_0==DAYBLOCK_T||(LA1_0 >= DECL && LA1_0 <= DOUBLE)||LA1_0==EQ||LA1_0==FOREACH_T||LA1_0==GEQ||LA1_0==ID||(LA1_0 >= INST && LA1_0 <= INT)||(LA1_0 >= LEQ && LA1_0 <= NEQ)||LA1_0==NOT||LA1_0==OR||LA1_0==STRING||LA1_0==TIME||LA1_0==TIMES||(LA1_0 >= 51 && LA1_0 <= 52)||(LA1_0 >= 54 && LA1_0 <= 56)||(LA1_0 >= 58 && LA1_0 <= 60)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ChronosTree.g:66:4: line
            	    {
            	    pushFollow(FOLLOW_line_in_program59);
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


    public static class line_return extends TreeRuleReturnScope {
    };


    // $ANTLR start "line"
    // ChronosTree.g:68:1: line : ( declarator | instantiator | stmt );
    public final ChronosTree.line_return line() throws RecognitionException {
        ChronosTree.line_return retval = new ChronosTree.line_return();
        retval.start = input.LT(1);


        try {
            // ChronosTree.g:68:5: ( declarator | instantiator | stmt )
            int alt2=3;
            switch ( input.LA(1) ) {
            case DECL:
                {
                alt2=1;
                }
                break;
            case INST:
                {
                alt2=2;
                }
                break;
            case AND:
            case BREAK_T:
            case COND:
            case DATETIME:
            case DAYBLOCK_T:
            case DOUBLE:
            case EQ:
            case FOREACH_T:
            case GEQ:
            case ID:
            case INT:
            case LEQ:
            case NEQ:
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
            case 58:
            case 59:
            case 60:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // ChronosTree.g:68:7: declarator
                    {
                    pushFollow(FOLLOW_declarator_in_line69);
                    declarator();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // ChronosTree.g:69:4: instantiator
                    {
                    pushFollow(FOLLOW_instantiator_in_line75);
                    instantiator();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // ChronosTree.g:70:4: stmt
                    {
                    pushFollow(FOLLOW_stmt_in_line81);
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
        return retval;
    }
    // $ANTLR end "line"



    // $ANTLR start "declarator"
    // ChronosTree.g:72:1: declarator : ^( DECL type_specifier ID ) ;
    public final void declarator() throws RecognitionException {
        CommonTree ID1=null;
        ChronosTree.type_specifier_return type_specifier2 =null;


        try {
            // ChronosTree.g:73:2: ( ^( DECL type_specifier ID ) )
            // ChronosTree.g:73:4: ^( DECL type_specifier ID )
            {
            match(input,DECL,FOLLOW_DECL_in_declarator92); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_specifier_in_declarator94);
            type_specifier2=type_specifier();

            state._fsp--;


            ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_declarator96); 

            match(input, Token.UP, null); 



            			if (varMap.containsKey((ID1!=null?ID1.getText():null))) {
            				// if it exists, can't declare again!
            				throw new RuntimeException("you've already declared " + (ID1!=null?ID1.getText():null));
            			}
            			else {
            				if ((type_specifier2!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(type_specifier2.start),input.getTreeAdaptor().getTokenStopIndex(type_specifier2.start))):null).equals("schedule")) {
            					put((ID1!=null?ID1.getText():null), new CVal(new Schedule((ID1!=null?ID1.getText():null))));
            				}
            				else {
            					put((ID1!=null?ID1.getText():null), null);
            				}
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
    // $ANTLR end "declarator"



    // $ANTLR start "instantiator"
    // ChronosTree.g:88:1: instantiator : ^( INST ^( '=' ID expr ) ) ;
    public final void instantiator() throws RecognitionException {
        CommonTree ID3=null;
        ChronosTree.expr_return expr4 =null;


        try {
            // ChronosTree.g:89:2: ( ^( INST ^( '=' ID expr ) ) )
            // ChronosTree.g:89:4: ^( INST ^( '=' ID expr ) )
            {
            match(input,INST,FOLLOW_INST_in_instantiator110); 

            match(input, Token.DOWN, null); 
            match(input,59,FOLLOW_59_in_instantiator113); 

            match(input, Token.DOWN, null); 
            ID3=(CommonTree)match(input,ID,FOLLOW_ID_in_instantiator115); 

            pushFollow(FOLLOW_expr_in_instantiator117);
            expr4=expr();

            state._fsp--;


            match(input, Token.UP, null); 


            match(input, Token.UP, null); 



            			if (varMap.containsKey((ID3!=null?ID3.getText():null))) {
            				// if it exists, can't instantiate (or declare) again!
            				throw new RuntimeException("you've already declared " + (ID3!=null?ID3.getText():null));
            			}
            			else {
            				put((ID3!=null?ID3.getText():null), (expr4!=null?expr4.result:null));
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
    // $ANTLR end "instantiator"



    // $ANTLR start "stmt"
    // ChronosTree.g:99:1: stmt : ( expr | ^( '=' e1= expr e2= expr ) | selection_stmt | iteration_stmt | jump_stmt );
    public final void stmt() throws RecognitionException {
        ChronosTree.expr_return e1 =null;

        ChronosTree.expr_return e2 =null;

        ChronosTree.iteration_stmt_return iteration_stmt5 =null;


        try {
            // ChronosTree.g:99:5: ( expr | ^( '=' e1= expr e2= expr ) | selection_stmt | iteration_stmt | jump_stmt )
            int alt3=5;
            switch ( input.LA(1) ) {
            case AND:
            case DATETIME:
            case DAYBLOCK_T:
            case DOUBLE:
            case EQ:
            case GEQ:
            case ID:
            case INT:
            case LEQ:
            case NEQ:
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
            case 58:
            case 60:
                {
                alt3=1;
                }
                break;
            case 59:
                {
                alt3=2;
                }
                break;
            case COND:
                {
                alt3=3;
                }
                break;
            case FOREACH_T:
                {
                alt3=4;
                }
                break;
            case BREAK_T:
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
                    // ChronosTree.g:99:7: expr
                    {
                    pushFollow(FOLLOW_expr_in_stmt129);
                    expr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // ChronosTree.g:100:4: ^( '=' e1= expr e2= expr )
                    {
                    match(input,59,FOLLOW_59_in_stmt135); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_stmt139);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_stmt143);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 



                    			// if e1 has a dot function:		
                    			if ((e1!=null?e1.result:null) instanceof CVal) {
                    				CVal val1 = (e1!=null?e1.result:null); // e1.result is a CVal already
                    				CVal val2 = (e2!=null?e2.result:null);
                    				// *****check if typenames of e1 and e2 are the same?
                    				if (varMap.containsKey((e1!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(e1.start),input.getTreeAdaptor().getTokenStopIndex(e1.start))):null))) { // look for it in varMap
                    					put((e1!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(e1.start),input.getTreeAdaptor().getTokenStopIndex(e1.start))):null), (e2!=null?e2.result:null)); // put in its value
                    				}
                    			}
                    			else {
                    				throw new RuntimeException("illegal expression: not declared");
                    			}
                    		

                    }
                    break;
                case 3 :
                    // ChronosTree.g:114:4: selection_stmt
                    {
                    pushFollow(FOLLOW_selection_stmt_in_stmt151);
                    selection_stmt();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // ChronosTree.g:115:4: iteration_stmt
                    {
                    pushFollow(FOLLOW_iteration_stmt_in_stmt156);
                    iteration_stmt5=iteration_stmt();

                    state._fsp--;


                     out((iteration_stmt5!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(iteration_stmt5.start),input.getTreeAdaptor().getTokenStopIndex(iteration_stmt5.start))):null)); 

                    }
                    break;
                case 5 :
                    // ChronosTree.g:116:4: jump_stmt
                    {
                    pushFollow(FOLLOW_jump_stmt_in_stmt163);
                    jump_stmt();

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
    // $ANTLR end "stmt"



    // $ANTLR start "selection_stmt"
    // ChronosTree.g:118:1: selection_stmt : ^( COND ^( IF_T expr (a= line )* ) ^( ELSE_T (b= line )* ) ) ;
    public final void selection_stmt() throws RecognitionException {
        ChronosTree.line_return a =null;

        ChronosTree.line_return b =null;

        ChronosTree.expr_return expr6 =null;


        try {
            // ChronosTree.g:119:2: ( ^( COND ^( IF_T expr (a= line )* ) ^( ELSE_T (b= line )* ) ) )
            // ChronosTree.g:119:4: ^( COND ^( IF_T expr (a= line )* ) ^( ELSE_T (b= line )* ) )
            {
            match(input,COND,FOLLOW_COND_in_selection_stmt175); 

            match(input, Token.DOWN, null); 
            match(input,IF_T,FOLLOW_IF_T_in_selection_stmt178); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_selection_stmt180);
            expr6=expr();

            state._fsp--;


            // ChronosTree.g:119:24: (a= line )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==AND||LA4_0==BREAK_T||LA4_0==COND||LA4_0==DATETIME||LA4_0==DAYBLOCK_T||(LA4_0 >= DECL && LA4_0 <= DOUBLE)||LA4_0==EQ||LA4_0==FOREACH_T||LA4_0==GEQ||LA4_0==ID||(LA4_0 >= INST && LA4_0 <= INT)||(LA4_0 >= LEQ && LA4_0 <= NEQ)||LA4_0==NOT||LA4_0==OR||LA4_0==STRING||LA4_0==TIME||LA4_0==TIMES||(LA4_0 >= 51 && LA4_0 <= 52)||(LA4_0 >= 54 && LA4_0 <= 56)||(LA4_0 >= 58 && LA4_0 <= 60)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ChronosTree.g:119:24: a= line
            	    {
            	    pushFollow(FOLLOW_line_in_selection_stmt184);
            	    a=line();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input, Token.UP, null); 


            match(input,ELSE_T,FOLLOW_ELSE_T_in_selection_stmt189); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // ChronosTree.g:119:42: (b= line )*
                loop5:
                do {
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==AND||LA5_0==BREAK_T||LA5_0==COND||LA5_0==DATETIME||LA5_0==DAYBLOCK_T||(LA5_0 >= DECL && LA5_0 <= DOUBLE)||LA5_0==EQ||LA5_0==FOREACH_T||LA5_0==GEQ||LA5_0==ID||(LA5_0 >= INST && LA5_0 <= INT)||(LA5_0 >= LEQ && LA5_0 <= NEQ)||LA5_0==NOT||LA5_0==OR||LA5_0==STRING||LA5_0==TIME||LA5_0==TIMES||(LA5_0 >= 51 && LA5_0 <= 52)||(LA5_0 >= 54 && LA5_0 <= 56)||(LA5_0 >= 58 && LA5_0 <= 60)) ) {
                        alt5=1;
                    }


                    switch (alt5) {
                	case 1 :
                	    // ChronosTree.g:119:42: b= line
                	    {
                	    pushFollow(FOLLOW_line_in_selection_stmt193);
                	    b=line();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop5;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            match(input, Token.UP, null); 



            			/*if ((expr6!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(expr6.start),input.getTreeAdaptor().getTokenStopIndex(expr6.start))):null)) {(a!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(a.start),input.getTreeAdaptor().getTokenStopIndex(a.start))):null)*} else {(b!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(b.start),input.getTreeAdaptor().getTokenStopIndex(b.start))):null)*};*/
            		

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


    public static class iteration_stmt_return extends TreeRuleReturnScope {
        public String result;
    };


    // $ANTLR start "iteration_stmt"
    // ChronosTree.g:123:1: iteration_stmt returns [String result] : ^( FOREACH_T ^( IN_T element= ID list= ID ) ^( BLOCK (lines= line )* ) ) ;
    public final ChronosTree.iteration_stmt_return iteration_stmt() throws RecognitionException {
        ChronosTree.iteration_stmt_return retval = new ChronosTree.iteration_stmt_return();
        retval.start = input.LT(1);


        CommonTree element=null;
        CommonTree list=null;
        ChronosTree.line_return lines =null;




        try {
            // ChronosTree.g:133:2: ( ^( FOREACH_T ^( IN_T element= ID list= ID ) ^( BLOCK (lines= line )* ) ) )
            // ChronosTree.g:133:4: ^( FOREACH_T ^( IN_T element= ID list= ID ) ^( BLOCK (lines= line )* ) )
            {
            match(input,FOREACH_T,FOLLOW_FOREACH_T_in_iteration_stmt221); 

            match(input, Token.DOWN, null); 
            match(input,IN_T,FOLLOW_IN_T_in_iteration_stmt224); 

            match(input, Token.DOWN, null); 
            element=(CommonTree)match(input,ID,FOLLOW_ID_in_iteration_stmt228); 

            list=(CommonTree)match(input,ID,FOLLOW_ID_in_iteration_stmt232); 

            match(input, Token.UP, null); 


            match(input,BLOCK,FOLLOW_BLOCK_in_iteration_stmt236); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // ChronosTree.g:133:56: (lines= line )*
                loop6:
                do {
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==AND||LA6_0==BREAK_T||LA6_0==COND||LA6_0==DATETIME||LA6_0==DAYBLOCK_T||(LA6_0 >= DECL && LA6_0 <= DOUBLE)||LA6_0==EQ||LA6_0==FOREACH_T||LA6_0==GEQ||LA6_0==ID||(LA6_0 >= INST && LA6_0 <= INT)||(LA6_0 >= LEQ && LA6_0 <= NEQ)||LA6_0==NOT||LA6_0==OR||LA6_0==STRING||LA6_0==TIME||LA6_0==TIMES||(LA6_0 >= 51 && LA6_0 <= 52)||(LA6_0 >= 54 && LA6_0 <= 56)||(LA6_0 >= 58 && LA6_0 <= 60)) ) {
                        alt6=1;
                    }


                    switch (alt6) {
                	case 1 :
                	    // ChronosTree.g:133:56: lines= line
                	    {
                	    pushFollow(FOLLOW_line_in_iteration_stmt240);
                	    lines=line();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop6;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            match(input, Token.UP, null); 



            			retval.result = "for ( Course " + (element!=null?element.getText():null) + " : " + list +
            			" ) {\n" + lines + "}";
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "iteration_stmt"



    // $ANTLR start "jump_stmt"
    // ChronosTree.g:138:1: jump_stmt : BREAK_T ;
    public final void jump_stmt() throws RecognitionException {
        try {
            // ChronosTree.g:139:2: ( BREAK_T )
            // ChronosTree.g:139:4: BREAK_T
            {
            match(input,BREAK_T,FOLLOW_BREAK_T_in_jump_stmt256); 

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


    public static class expr_return extends TreeRuleReturnScope {
        public CVal result;
    };


    // $ANTLR start "expr"
    // ChronosTree.g:141:1: expr returns [CVal result] : ( ^( OR e1= expr e2= expr ) | ^( AND e1= expr e2= expr ) | ^( NOT e= expr ) | ^( EQ e1= expr e2= expr ) | ^( NEQ e1= expr e2= expr ) | ^( GEQ e1= expr e2= expr ) | ^( LEQ e1= expr e2= expr ) | ^( '<' e1= expr e2= expr ) | ^( '>' e1= expr e2= expr ) | ^( '+' e1= expr e2= expr ) | ^( '-' e1= expr e2= expr ) | ^( '*' e1= expr e2= expr ) | ^( '/' e1= expr e2= expr ) | ^( '.' e1= expr e2= expr ) | datetime | timeblock | dayblock | function | INT | DOUBLE | ID | STRING | TIME );
    public final ChronosTree.expr_return expr() throws RecognitionException {
        ChronosTree.expr_return retval = new ChronosTree.expr_return();
        retval.start = input.LT(1);


        CommonTree INT11=null;
        CommonTree DOUBLE12=null;
        CommonTree ID13=null;
        CommonTree STRING14=null;
        CommonTree TIME15=null;
        ChronosTree.expr_return e1 =null;

        ChronosTree.expr_return e2 =null;

        ChronosTree.expr_return e =null;

        Datetime datetime7 =null;

        Timeblock timeblock8 =null;

        Dayblock dayblock9 =null;

        Function function10 =null;


        try {
            // ChronosTree.g:145:2: ( ^( OR e1= expr e2= expr ) | ^( AND e1= expr e2= expr ) | ^( NOT e= expr ) | ^( EQ e1= expr e2= expr ) | ^( NEQ e1= expr e2= expr ) | ^( GEQ e1= expr e2= expr ) | ^( LEQ e1= expr e2= expr ) | ^( '<' e1= expr e2= expr ) | ^( '>' e1= expr e2= expr ) | ^( '+' e1= expr e2= expr ) | ^( '-' e1= expr e2= expr ) | ^( '*' e1= expr e2= expr ) | ^( '/' e1= expr e2= expr ) | ^( '.' e1= expr e2= expr ) | datetime | timeblock | dayblock | function | INT | DOUBLE | ID | STRING | TIME )
            int alt7=23;
            switch ( input.LA(1) ) {
            case OR:
                {
                alt7=1;
                }
                break;
            case AND:
                {
                alt7=2;
                }
                break;
            case NOT:
                {
                alt7=3;
                }
                break;
            case EQ:
                {
                alt7=4;
                }
                break;
            case NEQ:
                {
                alt7=5;
                }
                break;
            case GEQ:
                {
                alt7=6;
                }
                break;
            case LEQ:
                {
                alt7=7;
                }
                break;
            case 58:
                {
                alt7=8;
                }
                break;
            case 60:
                {
                alt7=9;
                }
                break;
            case 52:
                {
                alt7=10;
                }
                break;
            case 54:
                {
                alt7=11;
                }
                break;
            case 51:
                {
                alt7=12;
                }
                break;
            case 56:
                {
                alt7=13;
                }
                break;
            case 55:
                {
                alt7=14;
                }
                break;
            case DATETIME:
                {
                alt7=15;
                }
                break;
            case TIMES:
                {
                alt7=16;
                }
                break;
            case DAYBLOCK_T:
                {
                alt7=17;
                }
                break;
            case ID:
                {
                int LA7_18 = input.LA(2);

                if ( (LA7_18==DOWN) ) {
                    alt7=18;
                }
                else if ( (LA7_18==EOF||(LA7_18 >= UP && LA7_18 <= AND)||LA7_18==BREAK_T||LA7_18==COND||LA7_18==DATETIME||LA7_18==DAYBLOCK_T||(LA7_18 >= DECL && LA7_18 <= DOUBLE)||LA7_18==EQ||LA7_18==FOREACH_T||LA7_18==GEQ||LA7_18==ID||(LA7_18 >= INST && LA7_18 <= INT)||(LA7_18 >= LEQ && LA7_18 <= NEQ)||LA7_18==NOT||LA7_18==OR||LA7_18==STRING||LA7_18==TIME||LA7_18==TIMES||(LA7_18 >= 51 && LA7_18 <= 52)||(LA7_18 >= 54 && LA7_18 <= 56)||(LA7_18 >= 58 && LA7_18 <= 60)) ) {
                    alt7=21;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 18, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt7=19;
                }
                break;
            case DOUBLE:
                {
                alt7=20;
                }
                break;
            case STRING:
                {
                alt7=22;
                }
                break;
            case TIME:
                {
                alt7=23;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // ChronosTree.g:145:4: ^( OR e1= expr e2= expr )
                    {
                    match(input,OR,FOLLOW_OR_in_expr278); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr282);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr286);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 



                    			CVal val1 = (e1!=null?e1.result:null);
                    			CVal val2 = (e2!=null?e2.result:null);
                    			/* if e1 and e2 are boolean expressions, 
                    			then this operation is legal */
                    			if (val1.isBool() && val2.isBool()) {
                    				retval.result = (val1.getBool() || val2.getBool())? new CVal(new Integer(1))
                    															: new CVal(new Integer(0));
                    			}
                    			else {
                    				throw new RuntimeException("Cannot perform OR operation on non-boolean expressions");
                    			}
                    		

                    }
                    break;
                case 2 :
                    // ChronosTree.g:158:4: ^( AND e1= expr e2= expr )
                    {
                    match(input,AND,FOLLOW_AND_in_expr295); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr299);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr303);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 



                    			CVal val1 = (e1!=null?e1.result:null);
                    			CVal val2 = (e2!=null?e2.result:null);
                    			if (val1.isBool() && val2.isBool()) {
                    				retval.result = (val1.getBool() && val2.getBool())? new CVal(new Integer(1))
                    															: new CVal(new Integer(0));
                    			}
                    			else {
                    				throw new RuntimeException("Cannot perform AND operation on non-boolean expressions");
                    			}
                    		

                    }
                    break;
                case 3 :
                    // ChronosTree.g:169:4: ^( NOT e= expr )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expr312); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr316);
                    e=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 



                    			CVal val = (e!=null?e.result:null);
                    			if (val.isBool()) {
                    				retval.result = (!val.getBool())? new CVal(new Integer(1))
                    										  : new CVal(new Integer(0));
                    			}
                    			else {
                    				throw new RuntimeException("Cannot perform NOT operation on non-boolean expressions");
                    			}
                    		

                    }
                    break;
                case 4 :
                    // ChronosTree.g:180:4: ^( EQ e1= expr e2= expr )
                    {
                    match(input,EQ,FOLLOW_EQ_in_expr327); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr331);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr335);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 



                    			CVal val1 = (e1!=null?e1.result:null);
                    			CVal val2 = (e2!=null?e2.result:null);
                    			if ( val1.compareTo(val2) == 0 )
                    				retval.result = new CVal(new Integer(1));
                    			else retval.result = new CVal(new Integer(0));
                    		

                    }
                    break;
                case 5 :
                    // ChronosTree.g:187:4: ^( NEQ e1= expr e2= expr )
                    {
                    match(input,NEQ,FOLLOW_NEQ_in_expr344); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr348);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr352);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 



                    			CVal val1 = (e1!=null?e1.result:null);
                    			CVal val2 = (e2!=null?e2.result:null);
                    		if ( val1.compareTo(val2) == 0 )
                    				retval.result = new CVal(new Integer(1));
                    			else retval.result = new CVal(new Integer(0));
                    		

                    }
                    break;
                case 6 :
                    // ChronosTree.g:194:4: ^( GEQ e1= expr e2= expr )
                    {
                    match(input,GEQ,FOLLOW_GEQ_in_expr361); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr365);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr369);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 



                    			CVal val1 = (e1!=null?e1.result:null);
                    			CVal val2 = (e2!=null?e2.result:null);
                    		if ( val1.compareTo(val2) == 0 || val1.compareTo(val2) == 1 )
                    				retval.result = new CVal(new Integer(1));
                    			else retval.result = new CVal(new Integer(0));
                    		

                    }
                    break;
                case 7 :
                    // ChronosTree.g:201:4: ^( LEQ e1= expr e2= expr )
                    {
                    match(input,LEQ,FOLLOW_LEQ_in_expr378); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr382);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr386);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 



                    			CVal val1 = (e1!=null?e1.result:null);
                    			CVal val2 = (e2!=null?e2.result:null);
                    			if ( val1.compareTo(val2) == 0 || val1.compareTo(val2) == -1 )
                    				retval.result = new CVal(new Integer(1));
                    			else retval.result = new CVal(new Integer(0));
                    		

                    }
                    break;
                case 8 :
                    // ChronosTree.g:208:4: ^( '<' e1= expr e2= expr )
                    {
                    match(input,58,FOLLOW_58_in_expr395); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr399);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr403);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 



                    			CVal val1 = (e1!=null?e1.result:null);
                    			CVal val2 = (e2!=null?e2.result:null);
                    			if ( val1.compareTo(val2) < 0 )
                    				retval.result = new CVal(new Integer(1));
                    			else retval.result = new CVal(new Integer(0));
                    		

                    }
                    break;
                case 9 :
                    // ChronosTree.g:215:4: ^( '>' e1= expr e2= expr )
                    {
                    match(input,60,FOLLOW_60_in_expr412); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr416);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr420);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 



                    			CVal val1 = (e1!=null?e1.result:null);
                    			CVal val2 = (e2!=null?e2.result:null);
                    			if ( val1.compareTo(val2) > 0 )
                    				retval.result = new CVal(new Integer(1));
                    			else retval.result = new CVal(new Integer(0));
                    		

                    }
                    break;
                case 10 :
                    // ChronosTree.g:224:4: ^( '+' e1= expr e2= expr )
                    {
                    match(input,52,FOLLOW_52_in_expr433); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr437);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr441);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 



                    			CVal val1 = (e1!=null?e1.result:null);
                    			CVal val2 = (e2!=null?e2.result:null);
                    			out( "ADDING: " + info((e1!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(e1.start),input.getTreeAdaptor().getTokenStopIndex(e1.start))):null), val1) + " ; " + info((e2!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(e2.start),input.getTreeAdaptor().getTokenStopIndex(e2.start))):null), val2) );
                    			if (val1.isInt() && val2.isInt()) {
                    				Integer temp = val1.asInt() + val2.asInt();
                    				retval.result = new CVal(temp);
                    			}
                    			if (val1.isDouble() && val2.isDouble()) {
                    				Double temp = val1.asDouble() + val2.asDouble();
                    				retval.result = new CVal(temp);
                    			}
                    			if (val1.isString() && val2.isString()) {
                    				String temp = val1.asString() + val2.asString();
                    				retval.result = new CVal(temp);
                    			}
                    			// convert other object to string if one term is already a string
                    			if (val1.isString()) {
                    				String temp = val1.asString() + val2.toString();
                    				retval.result = new CVal(temp);
                    			}
                    			if (val2.isString()) {
                    				String temp = val1.toString() + val2.asString();
                    				retval.result = new CVal(temp);
                    			}
                    		

                    }
                    break;
                case 11 :
                    // ChronosTree.g:250:4: ^( '-' e1= expr e2= expr )
                    {
                    match(input,54,FOLLOW_54_in_expr450); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr454);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr458);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 



                    			CVal val1 = (e1!=null?e1.result:null);
                    			CVal val2 = (e2!=null?e2.result:null);
                    			if (val1.isInt() && val2.isInt()) {
                    				Integer temp = val1.asInt() - val2.asInt();
                    				retval.result = new CVal(temp);
                    			}
                    			if (val1.isDouble() && val2.isDouble()) {
                    				Double temp = val1.asDouble() - val2.asDouble();
                    				retval.result = new CVal(temp);
                    			}
                    		

                    }
                    break;
                case 12 :
                    // ChronosTree.g:262:4: ^( '*' e1= expr e2= expr )
                    {
                    match(input,51,FOLLOW_51_in_expr467); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr471);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr475);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 



                    			CVal val1 = (e1!=null?e1.result:null);
                    			CVal val2 = (e2!=null?e2.result:null);
                    			if (val1.isInt() && val2.isInt()) {
                    				Integer temp = val1.asInt() * val2.asInt();
                    				retval.result = new CVal(temp);
                    			}
                    			if (val1.isDouble() && val2.isDouble()) {
                    				Double temp = val1.asDouble() * val2.asDouble();
                    				retval.result = new CVal(temp);
                    			}
                    		

                    }
                    break;
                case 13 :
                    // ChronosTree.g:274:4: ^( '/' e1= expr e2= expr )
                    {
                    match(input,56,FOLLOW_56_in_expr484); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr488);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr492);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 



                    			CVal val1 = (e1!=null?e1.result:null);
                    			CVal val2 = (e2!=null?e2.result:null);
                    			if (val1.isInt() && val2.isInt()) {
                    				Integer temp = val1.asInt() / val2.asInt();
                    				retval.result = new CVal(temp);
                    			}
                    			if (val1.isDouble() && val2.isDouble()) {
                    				Double temp = val1.asDouble() / val2.asDouble();
                    				retval.result = new CVal(temp);
                    			}
                    		

                    }
                    break;
                case 14 :
                    // ChronosTree.g:288:4: ^( '.' e1= expr e2= expr )
                    {
                    match(input,55,FOLLOW_55_in_expr505); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr509);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr513);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 



                    			// CHECK e1 (LEFT of dot)
                    			// Is e1 a CVal?
                    			CVal left = null; // left is the CVal equivalent of e1,
                    			if ((e1!=null?e1.result:null) instanceof CVal) {
                    				out("ITS AN INSTANCE OF CVAL");
                    				left = (e1!=null?e1.result:null);
                    			}
                    			// or a function call? NEVER HAPPENS!
                    			// or an ID?
                    			else if ( varMap.containsKey((e1!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(e1.start),input.getTreeAdaptor().getTokenStopIndex(e1.start))):null)) ) {
                    				out("DEARIES< WE FOUND IT");
                    				left = varMap.get((e1!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(e1.start),input.getTreeAdaptor().getTokenStopIndex(e1.start))):null));
                    			}
                    			
                    			// CHECK e2 (RIGHT of dot)
                    			// Is e2 a function?
                    			if ((e2!=null?e2.result:null).isFunction()) {
                    				out("I SEE A FUNCTION ON THE RIGHT SIDE FO THE DOT");
                    				out("It looks like this: " + (e2!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(e2.start),input.getTreeAdaptor().getTokenStopIndex(e2.start))):null));
                    				// get methods of left
                    				Function rightf = (e2!=null?e2.result:null).asFunction();
                    				//out("FUNCITON IS: " + rightf);
                    				try {
                    					// Get typename of left
                    					Class cls = Class.forName(left.typename());
                    					out("THE TYPE ISWSSSS " + cls);
                    					Method[] rightfMethods = cls.getMethods();
                    					for (Method m : rightfMethods) {
                    						if (m.getName().equals(rightf.name)) {
                    							m.invoke(left, rightf.params);
                    						}
                    					}
                    				} catch (Exception excep) { excep.printStackTrace(); }
                    				// evalFunction()
                    			}
                    			// If not, then e2 must be a field
                    			else {
                    				// get fields of left
                    			}
                    		

                    }
                    break;
                case 15 :
                    // ChronosTree.g:331:4: datetime
                    {
                    pushFollow(FOLLOW_datetime_in_expr525);
                    datetime7=datetime();

                    state._fsp--;


                     retval.result = new CVal(datetime7); 

                    }
                    break;
                case 16 :
                    // ChronosTree.g:332:4: timeblock
                    {
                    pushFollow(FOLLOW_timeblock_in_expr532);
                    timeblock8=timeblock();

                    state._fsp--;


                     retval.result = new CVal(timeblock8); 

                    }
                    break;
                case 17 :
                    // ChronosTree.g:333:4: dayblock
                    {
                    pushFollow(FOLLOW_dayblock_in_expr539);
                    dayblock9=dayblock();

                    state._fsp--;


                     retval.result = new CVal(dayblock9); 

                    }
                    break;
                case 18 :
                    // ChronosTree.g:334:4: function
                    {
                    pushFollow(FOLLOW_function_in_expr546);
                    function10=function();

                    state._fsp--;



                    			Function func = function10;
                    			if (func.name.equals("print")) {
                    				for (int i=0; i<func.params.size(); i++) {
                    					CVal c = func.params.get(i);
                    					if (c.isString()) {
                    						printString(c.asString());
                    					}
                    					else print(c);
                    					if (i==func.params.size()-1) {
                    						out("");
                    					} else {
                    						print(" ");
                    					}
                    				}
                    			}
                    			if (func.name.contains("generateCourses")) {
                    				// call read to input file
                    				try {
                    					CVal filename = func.params.get(0);
                    					makeMasterList(filename.asString());
                    				} catch (NullPointerException exception) {
                    					throw new RuntimeException("No filename specified!");
                    				}
                    			}
                    			retval.result = new CVal(func);
                    		

                    }
                    break;
                case 19 :
                    // ChronosTree.g:363:4: INT
                    {
                    INT11=(CommonTree)match(input,INT,FOLLOW_INT_in_expr558); 

                     retval.result = new CVal( Integer.parseInt((INT11!=null?INT11.getText():null)) ); 

                    }
                    break;
                case 20 :
                    // ChronosTree.g:364:4: DOUBLE
                    {
                    DOUBLE12=(CommonTree)match(input,DOUBLE,FOLLOW_DOUBLE_in_expr565); 

                     retval.result = new CVal( Double.parseDouble((DOUBLE12!=null?DOUBLE12.getText():null)) ); 

                    }
                    break;
                case 21 :
                    // ChronosTree.g:365:4: ID
                    {
                    ID13=(CommonTree)match(input,ID,FOLLOW_ID_in_expr572); 

                     retval.result = varMap.get((ID13!=null?ID13.getText():null)); 

                    }
                    break;
                case 22 :
                    // ChronosTree.g:366:4: STRING
                    {
                    STRING14=(CommonTree)match(input,STRING,FOLLOW_STRING_in_expr579); 

                     retval.result = new CVal( (STRING14!=null?STRING14.getText():null) ); 

                    }
                    break;
                case 23 :
                    // ChronosTree.g:367:4: TIME
                    {
                    TIME15=(CommonTree)match(input,TIME,FOLLOW_TIME_in_expr586); 

                     retval.result = new CVal( new Time((TIME15!=null?TIME15.getText():null)) ); 

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
        return retval;
    }
    // $ANTLR end "expr"



    // $ANTLR start "function"
    // ChronosTree.g:369:1: function returns [Function result] : ^( ID ^( PARAMS ( argument_expr_list )? ) ) ;
    public final Function function() throws RecognitionException {
        Function result = null;


        CommonTree ID16=null;
        ArrayList<CVal> argument_expr_list17 =null;


        try {
            // ChronosTree.g:371:2: ( ^( ID ^( PARAMS ( argument_expr_list )? ) ) )
            // ChronosTree.g:372:6: ^( ID ^( PARAMS ( argument_expr_list )? ) )
            {
            ID16=(CommonTree)match(input,ID,FOLLOW_ID_in_function606); 

            match(input, Token.DOWN, null); 
            match(input,PARAMS,FOLLOW_PARAMS_in_function609); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // ChronosTree.g:372:20: ( argument_expr_list )?
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==AND||LA8_0==DATETIME||LA8_0==DAYBLOCK_T||LA8_0==DOUBLE||LA8_0==EQ||LA8_0==GEQ||LA8_0==ID||LA8_0==INT||(LA8_0 >= LEQ && LA8_0 <= NEQ)||LA8_0==NOT||LA8_0==OR||LA8_0==STRING||LA8_0==TIME||LA8_0==TIMES||(LA8_0 >= 51 && LA8_0 <= 52)||(LA8_0 >= 54 && LA8_0 <= 56)||LA8_0==58||LA8_0==60) ) {
                    alt8=1;
                }
                switch (alt8) {
                    case 1 :
                        // ChronosTree.g:372:20: argument_expr_list
                        {
                        pushFollow(FOLLOW_argument_expr_list_in_function611);
                        argument_expr_list17=argument_expr_list();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input, Token.UP, null); 



            			result = new Function((ID16!=null?ID16.getText():null), argument_expr_list17);
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "function"



    // $ANTLR start "datetime"
    // ChronosTree.g:383:1: datetime returns [Datetime result] : ^( DATETIME dayblock timeblock ) ;
    public final Datetime datetime() throws RecognitionException {
        Datetime result = null;


        Dayblock dayblock18 =null;

        Timeblock timeblock19 =null;


        try {
            // ChronosTree.g:385:2: ( ^( DATETIME dayblock timeblock ) )
            // ChronosTree.g:385:4: ^( DATETIME dayblock timeblock )
            {
            match(input,DATETIME,FOLLOW_DATETIME_in_datetime634); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_dayblock_in_datetime636);
            dayblock18=dayblock();

            state._fsp--;


            pushFollow(FOLLOW_timeblock_in_datetime638);
            timeblock19=timeblock();

            state._fsp--;


            match(input, Token.UP, null); 



            		result = new Datetime(dayblock18, timeblock19);
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "datetime"



    // $ANTLR start "timeblock"
    // ChronosTree.g:389:1: timeblock returns [Timeblock result] : ^( TIMES a= TIME b= TIME ) ;
    public final Timeblock timeblock() throws RecognitionException {
        Timeblock result = null;


        CommonTree a=null;
        CommonTree b=null;

        try {
            // ChronosTree.g:391:2: ( ^( TIMES a= TIME b= TIME ) )
            // ChronosTree.g:391:4: ^( TIMES a= TIME b= TIME )
            {
            match(input,TIMES,FOLLOW_TIMES_in_timeblock657); 

            match(input, Token.DOWN, null); 
            a=(CommonTree)match(input,TIME,FOLLOW_TIME_in_timeblock661); 

            b=(CommonTree)match(input,TIME,FOLLOW_TIME_in_timeblock665); 

            match(input, Token.UP, null); 



            			result = new Timeblock(new Time((a!=null?a.getText():null)), new Time((b!=null?b.getText():null)));
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "timeblock"



    // $ANTLR start "dayblock"
    // ChronosTree.g:395:1: dayblock returns [Dayblock result] : ^( DAYBLOCK_T ( DAY )+ ) ;
    public final Dayblock dayblock() throws RecognitionException {
        Dayblock result = null;


        CommonTree DAY20=null;

         result = new Dayblock(); 
        try {
            // ChronosTree.g:398:2: ( ^( DAYBLOCK_T ( DAY )+ ) )
            // ChronosTree.g:398:4: ^( DAYBLOCK_T ( DAY )+ )
            {
            match(input,DAYBLOCK_T,FOLLOW_DAYBLOCK_T_in_dayblock690); 

            match(input, Token.DOWN, null); 
            // ChronosTree.g:398:18: ( DAY )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==DAY) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ChronosTree.g:398:19: DAY
            	    {
            	    DAY20=(CommonTree)match(input,DAY,FOLLOW_DAY_in_dayblock693); 


            	    			char daychar = ((DAY20!=null?DAY20.getText():null)).charAt(0);
            	    			try{result.add(daychar);}
            	    			catch (Exception e1) {out("Can't add this day");}
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
        return result;
    }
    // $ANTLR end "dayblock"



    // $ANTLR start "argument_expr_list"
    // ChronosTree.g:404:1: argument_expr_list returns [ArrayList<CVal> result] : ( expr )+ ;
    public final ArrayList<CVal> argument_expr_list() throws RecognitionException {
        ArrayList<CVal> result = null;


        ChronosTree.expr_return expr21 =null;


         result = new ArrayList<CVal>(); 
        try {
            // ChronosTree.g:406:2: ( ( expr )+ )
            // ChronosTree.g:406:4: ( expr )+
            {
            // ChronosTree.g:406:4: ( expr )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==AND||LA10_0==DATETIME||LA10_0==DAYBLOCK_T||LA10_0==DOUBLE||LA10_0==EQ||LA10_0==GEQ||LA10_0==ID||LA10_0==INT||(LA10_0 >= LEQ && LA10_0 <= NEQ)||LA10_0==NOT||LA10_0==OR||LA10_0==STRING||LA10_0==TIME||LA10_0==TIMES||(LA10_0 >= 51 && LA10_0 <= 52)||(LA10_0 >= 54 && LA10_0 <= 56)||LA10_0==58||LA10_0==60) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ChronosTree.g:406:5: expr
            	    {
            	    pushFollow(FOLLOW_expr_in_argument_expr_list719);
            	    expr21=expr();

            	    state._fsp--;


            	    result.add((expr21!=null?expr21.result:null));

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
        return result;
    }
    // $ANTLR end "argument_expr_list"


    public static class type_specifier_return extends TreeRuleReturnScope {
    };


    // $ANTLR start "type_specifier"
    // ChronosTree.g:408:1: type_specifier : ( INT_T | DOUBLE_T | DAYBLOCK_T | TIME_T | STRING_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T );
    public final ChronosTree.type_specifier_return type_specifier() throws RecognitionException {
        ChronosTree.type_specifier_return retval = new ChronosTree.type_specifier_return();
        retval.start = input.LT(1);


        try {
            // ChronosTree.g:409:2: ( INT_T | DOUBLE_T | DAYBLOCK_T | TIME_T | STRING_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T )
            // ChronosTree.g:
            {
            if ( (input.LA(1) >= COURSELIST_T && input.LA(1) <= COURSE_T)||input.LA(1)==DATETIME_T||input.LA(1)==DAYBLOCK_T||input.LA(1)==DOUBLE_T||input.LA(1)==INT_T||input.LA(1)==SCHEDULE_T||input.LA(1)==STRING_T||input.LA(1)==TIMEBLOCK_T||input.LA(1)==TIME_T ) {
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
        return retval;
    }
    // $ANTLR end "type_specifier"

    // Delegated rules


 

    public static final BitSet FOLLOW_line_in_program59 = new BitSet(new long[]{0x1DD82A566AA69252L});
    public static final BitSet FOLLOW_declarator_in_line69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instantiator_in_line75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_line81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECL_in_declarator92 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_specifier_in_declarator94 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_declarator96 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INST_in_instantiator110 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_59_in_instantiator113 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_instantiator115 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_instantiator117 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_stmt129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_stmt135 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_stmt139 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_stmt143 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_selection_stmt_in_stmt151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_stmt_in_stmt156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_stmt_in_stmt163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COND_in_selection_stmt175 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IF_T_in_selection_stmt178 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_selection_stmt180 = new BitSet(new long[]{0x1DD82A566AA69258L});
    public static final BitSet FOLLOW_line_in_selection_stmt184 = new BitSet(new long[]{0x1DD82A566AA69258L});
    public static final BitSet FOLLOW_ELSE_T_in_selection_stmt189 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_line_in_selection_stmt193 = new BitSet(new long[]{0x1DD82A566AA69258L});
    public static final BitSet FOLLOW_FOREACH_T_in_iteration_stmt221 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IN_T_in_iteration_stmt224 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_iteration_stmt228 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_iteration_stmt232 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_iteration_stmt236 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_line_in_iteration_stmt240 = new BitSet(new long[]{0x1DD82A566AA69258L});
    public static final BitSet FOLLOW_BREAK_T_in_jump_stmt256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_expr278 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr282 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr286 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_expr295 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr299 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr303 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expr312 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr316 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQ_in_expr327 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr331 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr335 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEQ_in_expr344 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr348 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr352 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GEQ_in_expr361 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr365 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr369 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LEQ_in_expr378 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr382 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr386 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_58_in_expr395 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr399 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr403 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_60_in_expr412 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr416 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr420 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_52_in_expr433 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr437 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr441 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_54_in_expr450 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr454 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr458 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_51_in_expr467 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr471 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr475 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_56_in_expr484 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr488 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr492 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_55_in_expr505 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr509 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr513 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_datetime_in_expr525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeblock_in_expr532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayblock_in_expr539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_expr546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_expr558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_expr565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_expr579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_expr586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function606 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PARAMS_in_function609 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_argument_expr_list_in_function611 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DATETIME_in_datetime634 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_dayblock_in_datetime636 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_timeblock_in_datetime638 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMES_in_timeblock657 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TIME_in_timeblock661 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_TIME_in_timeblock665 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAYBLOCK_T_in_dayblock690 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DAY_in_dayblock693 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_expr_in_argument_expr_list719 = new BitSet(new long[]{0x15D82A564A249012L});

}