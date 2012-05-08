// $ANTLR 3.4 ChronosTree.g 2012-05-08 01:39:55

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
    	
    	// creates the master courselist from input file
    	private Courselist makeMasterList(String file) {
    		sch = new Scheduler(file);
    		return sch.courselist;
    	}
    	
    	// puts an object into the varMap
    	// gives some notification output
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
    	
    	// gets rid of surrounding quotes
    	private String dequote(String str) {
    		return str.substring(1,str.length()-1);
    	}
    	
    	// shortcut for System.out.print
    	private void print(Object obj) {
    		System.out.print(obj);
    	}



    // $ANTLR start "program"
    // ChronosTree.g:67:1: program : ( line )+ ;
    public final void program() throws RecognitionException {
         int num = 0; 
        try {
            // ChronosTree.g:69:2: ( ( line )+ )
            // ChronosTree.g:69:4: ( line )+
            {
            // ChronosTree.g:69:4: ( line )+
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
            	    // ChronosTree.g:69:4: line
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
    // ChronosTree.g:71:1: line : ( declarator | instantiator | stmt );
    public final ChronosTree.line_return line() throws RecognitionException {
        ChronosTree.line_return retval = new ChronosTree.line_return();
        retval.start = input.LT(1);


        try {
            // ChronosTree.g:71:5: ( declarator | instantiator | stmt )
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
                    // ChronosTree.g:71:7: declarator
                    {
                    pushFollow(FOLLOW_declarator_in_line68);
                    declarator();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // ChronosTree.g:72:4: instantiator
                    {
                    pushFollow(FOLLOW_instantiator_in_line73);
                    instantiator();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // ChronosTree.g:73:4: stmt
                    {
                    pushFollow(FOLLOW_stmt_in_line78);
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
    // ChronosTree.g:75:1: declarator : ^( DECL type_specifier ID ) ;
    public final void declarator() throws RecognitionException {
        CommonTree ID1=null;
        ChronosTree.type_specifier_return type_specifier2 =null;


        try {
            // ChronosTree.g:76:2: ( ^( DECL type_specifier ID ) )
            // ChronosTree.g:76:4: ^( DECL type_specifier ID )
            {
            match(input,DECL,FOLLOW_DECL_in_declarator89); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_specifier_in_declarator91);
            type_specifier2=type_specifier();

            state._fsp--;


            ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_declarator93); 

            match(input, Token.UP, null); 



            			if (varMap.containsKey((ID1!=null?ID1.getText():null))) {
            				// if it exists, can't declare again!
            				throw new RuntimeException("you've already declared " + (ID1!=null?ID1.getText():null));
            			}
            			else {
            				// with schedule and courselist,
            				// every declaration is an instantiator of an empty object
            				if ((type_specifier2!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(type_specifier2.start),input.getTreeAdaptor().getTokenStopIndex(type_specifier2.start))):null).equals("schedule")) {
            					put((ID1!=null?ID1.getText():null), new CVal(new Schedule((ID1!=null?ID1.getText():null))));
            				}
            				else if ((type_specifier2!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(type_specifier2.start),input.getTreeAdaptor().getTokenStopIndex(type_specifier2.start))):null).equals("courselist")) {
            					put((ID1!=null?ID1.getText():null), new CVal(new Courselist((ID1!=null?ID1.getText():null))));
            				}
            				// but with primitives, such as int, declarators are
            				// simply declarators (null value)
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
    // ChronosTree.g:98:1: instantiator : ^( INST ^( '=' ID expr ) ) ;
    public final void instantiator() throws RecognitionException {
        CommonTree ID3=null;
        ChronosTree.expr_return expr4 =null;


        try {
            // ChronosTree.g:99:2: ( ^( INST ^( '=' ID expr ) ) )
            // ChronosTree.g:99:4: ^( INST ^( '=' ID expr ) )
            {
            match(input,INST,FOLLOW_INST_in_instantiator107); 

            match(input, Token.DOWN, null); 
            match(input,59,FOLLOW_59_in_instantiator110); 

            match(input, Token.DOWN, null); 
            ID3=(CommonTree)match(input,ID,FOLLOW_ID_in_instantiator112); 

            pushFollow(FOLLOW_expr_in_instantiator114);
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
    // ChronosTree.g:109:1: stmt : ( expr | ^( '=' e1= expr e2= expr ) | selection_stmt | iteration_stmt | jump_stmt );
    public final void stmt() throws RecognitionException {
        ChronosTree.expr_return e1 =null;

        ChronosTree.expr_return e2 =null;

        ChronosTree.iteration_stmt_return iteration_stmt5 =null;


        try {
            // ChronosTree.g:109:5: ( expr | ^( '=' e1= expr e2= expr ) | selection_stmt | iteration_stmt | jump_stmt )
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
                    // ChronosTree.g:109:7: expr
                    {
                    pushFollow(FOLLOW_expr_in_stmt126);
                    expr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // ChronosTree.g:110:4: ^( '=' e1= expr e2= expr )
                    {
                    match(input,59,FOLLOW_59_in_stmt132); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_stmt136);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_stmt140);
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
                    // ChronosTree.g:124:4: selection_stmt
                    {
                    pushFollow(FOLLOW_selection_stmt_in_stmt148);
                    selection_stmt();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // ChronosTree.g:125:4: iteration_stmt
                    {
                    pushFollow(FOLLOW_iteration_stmt_in_stmt153);
                    iteration_stmt5=iteration_stmt();

                    state._fsp--;


                     out((iteration_stmt5!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(iteration_stmt5.start),input.getTreeAdaptor().getTokenStopIndex(iteration_stmt5.start))):null)); 

                    }
                    break;
                case 5 :
                    // ChronosTree.g:126:4: jump_stmt
                    {
                    pushFollow(FOLLOW_jump_stmt_in_stmt160);
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
    // ChronosTree.g:128:1: selection_stmt : ^( COND ^( IF_T expr (a= line )* ) ^( ELSE_T (b= line )* ) ) ;
    public final void selection_stmt() throws RecognitionException {
        ChronosTree.line_return a =null;

        ChronosTree.line_return b =null;

        ChronosTree.expr_return expr6 =null;


        try {
            // ChronosTree.g:129:2: ( ^( COND ^( IF_T expr (a= line )* ) ^( ELSE_T (b= line )* ) ) )
            // ChronosTree.g:129:4: ^( COND ^( IF_T expr (a= line )* ) ^( ELSE_T (b= line )* ) )
            {
            match(input,COND,FOLLOW_COND_in_selection_stmt172); 

            match(input, Token.DOWN, null); 
            match(input,IF_T,FOLLOW_IF_T_in_selection_stmt175); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_selection_stmt177);
            expr6=expr();

            state._fsp--;


            // ChronosTree.g:129:24: (a= line )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==AND||LA4_0==BREAK_T||LA4_0==COND||LA4_0==DATETIME||LA4_0==DAYBLOCK_T||(LA4_0 >= DECL && LA4_0 <= DOUBLE)||LA4_0==EQ||LA4_0==FOREACH_T||LA4_0==GEQ||LA4_0==ID||(LA4_0 >= INST && LA4_0 <= INT)||(LA4_0 >= LEQ && LA4_0 <= NEQ)||LA4_0==NOT||LA4_0==OR||LA4_0==STRING||LA4_0==TIME||LA4_0==TIMES||(LA4_0 >= 51 && LA4_0 <= 52)||(LA4_0 >= 54 && LA4_0 <= 56)||(LA4_0 >= 58 && LA4_0 <= 60)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ChronosTree.g:129:24: a= line
            	    {
            	    pushFollow(FOLLOW_line_in_selection_stmt181);
            	    a=line();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input, Token.UP, null); 


            match(input,ELSE_T,FOLLOW_ELSE_T_in_selection_stmt186); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // ChronosTree.g:129:42: (b= line )*
                loop5:
                do {
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==AND||LA5_0==BREAK_T||LA5_0==COND||LA5_0==DATETIME||LA5_0==DAYBLOCK_T||(LA5_0 >= DECL && LA5_0 <= DOUBLE)||LA5_0==EQ||LA5_0==FOREACH_T||LA5_0==GEQ||LA5_0==ID||(LA5_0 >= INST && LA5_0 <= INT)||(LA5_0 >= LEQ && LA5_0 <= NEQ)||LA5_0==NOT||LA5_0==OR||LA5_0==STRING||LA5_0==TIME||LA5_0==TIMES||(LA5_0 >= 51 && LA5_0 <= 52)||(LA5_0 >= 54 && LA5_0 <= 56)||(LA5_0 >= 58 && LA5_0 <= 60)) ) {
                        alt5=1;
                    }


                    switch (alt5) {
                	case 1 :
                	    // ChronosTree.g:129:42: b= line
                	    {
                	    pushFollow(FOLLOW_line_in_selection_stmt190);
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
    // ChronosTree.g:133:1: iteration_stmt returns [String result] : ^( FOREACH_T ^( IN_T element= ID list= ID ) ^( BLOCK (lines= line )* ) ) ;
    public final ChronosTree.iteration_stmt_return iteration_stmt() throws RecognitionException {
        ChronosTree.iteration_stmt_return retval = new ChronosTree.iteration_stmt_return();
        retval.start = input.LT(1);


        CommonTree element=null;
        CommonTree list=null;
        ChronosTree.line_return lines =null;




        try {
            // ChronosTree.g:143:2: ( ^( FOREACH_T ^( IN_T element= ID list= ID ) ^( BLOCK (lines= line )* ) ) )
            // ChronosTree.g:143:4: ^( FOREACH_T ^( IN_T element= ID list= ID ) ^( BLOCK (lines= line )* ) )
            {
            match(input,FOREACH_T,FOLLOW_FOREACH_T_in_iteration_stmt218); 

            match(input, Token.DOWN, null); 
            match(input,IN_T,FOLLOW_IN_T_in_iteration_stmt221); 

            match(input, Token.DOWN, null); 
            element=(CommonTree)match(input,ID,FOLLOW_ID_in_iteration_stmt225); 

            list=(CommonTree)match(input,ID,FOLLOW_ID_in_iteration_stmt229); 

            match(input, Token.UP, null); 


            match(input,BLOCK,FOLLOW_BLOCK_in_iteration_stmt233); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // ChronosTree.g:143:56: (lines= line )*
                loop6:
                do {
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==AND||LA6_0==BREAK_T||LA6_0==COND||LA6_0==DATETIME||LA6_0==DAYBLOCK_T||(LA6_0 >= DECL && LA6_0 <= DOUBLE)||LA6_0==EQ||LA6_0==FOREACH_T||LA6_0==GEQ||LA6_0==ID||(LA6_0 >= INST && LA6_0 <= INT)||(LA6_0 >= LEQ && LA6_0 <= NEQ)||LA6_0==NOT||LA6_0==OR||LA6_0==STRING||LA6_0==TIME||LA6_0==TIMES||(LA6_0 >= 51 && LA6_0 <= 52)||(LA6_0 >= 54 && LA6_0 <= 56)||(LA6_0 >= 58 && LA6_0 <= 60)) ) {
                        alt6=1;
                    }


                    switch (alt6) {
                	case 1 :
                	    // ChronosTree.g:143:56: lines= line
                	    {
                	    pushFollow(FOLLOW_line_in_iteration_stmt237);
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
    // ChronosTree.g:148:1: jump_stmt : BREAK_T ;
    public final void jump_stmt() throws RecognitionException {
        try {
            // ChronosTree.g:149:2: ( BREAK_T )
            // ChronosTree.g:149:4: BREAK_T
            {
            match(input,BREAK_T,FOLLOW_BREAK_T_in_jump_stmt253); 

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
    // ChronosTree.g:151:1: expr returns [CVal result] : ( ^( OR e1= expr e2= expr ) | ^( AND e1= expr e2= expr ) | ^( NOT e= expr ) | ^( EQ e1= expr e2= expr ) | ^( NEQ e1= expr e2= expr ) | ^( GEQ e1= expr e2= expr ) | ^( LEQ e1= expr e2= expr ) | ^( '<' e1= expr e2= expr ) | ^( '>' e1= expr e2= expr ) | ^( '+' e1= expr e2= expr ) | ^( '-' e1= expr e2= expr ) | ^( '*' e1= expr e2= expr ) | ^( '/' e1= expr e2= expr ) | ^( '.' e1= expr e2= expr ) | datetime | timeblock | dayblock | function | INT | DOUBLE | ID | STRING | TIME );
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
            // ChronosTree.g:155:2: ( ^( OR e1= expr e2= expr ) | ^( AND e1= expr e2= expr ) | ^( NOT e= expr ) | ^( EQ e1= expr e2= expr ) | ^( NEQ e1= expr e2= expr ) | ^( GEQ e1= expr e2= expr ) | ^( LEQ e1= expr e2= expr ) | ^( '<' e1= expr e2= expr ) | ^( '>' e1= expr e2= expr ) | ^( '+' e1= expr e2= expr ) | ^( '-' e1= expr e2= expr ) | ^( '*' e1= expr e2= expr ) | ^( '/' e1= expr e2= expr ) | ^( '.' e1= expr e2= expr ) | datetime | timeblock | dayblock | function | INT | DOUBLE | ID | STRING | TIME )
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
                    // ChronosTree.g:155:4: ^( OR e1= expr e2= expr )
                    {
                    match(input,OR,FOLLOW_OR_in_expr275); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr279);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr283);
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
                    // ChronosTree.g:168:4: ^( AND e1= expr e2= expr )
                    {
                    match(input,AND,FOLLOW_AND_in_expr292); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr296);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr300);
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
                    // ChronosTree.g:179:4: ^( NOT e= expr )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expr309); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr313);
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
                    // ChronosTree.g:190:4: ^( EQ e1= expr e2= expr )
                    {
                    match(input,EQ,FOLLOW_EQ_in_expr324); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr328);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr332);
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
                    // ChronosTree.g:197:4: ^( NEQ e1= expr e2= expr )
                    {
                    match(input,NEQ,FOLLOW_NEQ_in_expr341); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr345);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr349);
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
                    // ChronosTree.g:204:4: ^( GEQ e1= expr e2= expr )
                    {
                    match(input,GEQ,FOLLOW_GEQ_in_expr358); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr362);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr366);
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
                    // ChronosTree.g:211:4: ^( LEQ e1= expr e2= expr )
                    {
                    match(input,LEQ,FOLLOW_LEQ_in_expr375); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr379);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr383);
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
                    // ChronosTree.g:218:4: ^( '<' e1= expr e2= expr )
                    {
                    match(input,58,FOLLOW_58_in_expr392); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr396);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr400);
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
                    // ChronosTree.g:225:4: ^( '>' e1= expr e2= expr )
                    {
                    match(input,60,FOLLOW_60_in_expr409); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr413);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr417);
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
                    // ChronosTree.g:234:4: ^( '+' e1= expr e2= expr )
                    {
                    match(input,52,FOLLOW_52_in_expr430); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr434);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr438);
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
                    // ChronosTree.g:260:4: ^( '-' e1= expr e2= expr )
                    {
                    match(input,54,FOLLOW_54_in_expr447); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr451);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr455);
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
                    // ChronosTree.g:272:4: ^( '*' e1= expr e2= expr )
                    {
                    match(input,51,FOLLOW_51_in_expr464); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr468);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr472);
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
                    // ChronosTree.g:284:4: ^( '/' e1= expr e2= expr )
                    {
                    match(input,56,FOLLOW_56_in_expr481); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr485);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr489);
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
                    // ChronosTree.g:298:4: ^( '.' e1= expr e2= expr )
                    {
                    match(input,55,FOLLOW_55_in_expr502); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr506);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr510);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 



                    			// CHECK e1 (LEFT of dot)
                    			// Is e1 a CVal?
                    			CVal left = null; // left is the CVal equivalent of e1
                    			if ((e1!=null?e1.result:null) instanceof CVal) {
                    				left = (e1!=null?e1.result:null);
                    				// Is it also an ID? (in the varMap?)
                    				if ( varMap.containsKey((e1!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(e1.start),input.getTreeAdaptor().getTokenStopIndex(e1.start))):null)) ) {
                    					left = varMap.get((e1!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(e1.start),input.getTreeAdaptor().getTokenStopIndex(e1.start))):null));
                    				}
                    			}
                    			// or a func call? NEVER HAPPENS
                    			
                    			// CHECK e2 (RIGHT of dot)
                    			// Is e2 a function?
                    			if ((e2!=null?e2.result:null) != null && (e2!=null?e2.result:null).isFunction()) {
                    				Function rightf = (e2!=null?e2.result:null).asFunction();
                    				try {
                    					// get typename of left
                    					Class cls = Class.forName(left.typename());
                    					// get methods of left
                    					Method[] rightfMethods = cls.getMethods();
                    					for (Method m : rightfMethods) {
                    						if (m.getName().equals(rightf.name)) {
                    							// carry out function
                    							if (rightf.params != null)
                    								m.invoke(left.value(), rightf.params);
                    							else m.invoke(left.value());
                    						}
                    					}
                    				} catch (Exception excep) { excep.printStackTrace(); }
                    			}
                    			// If not, then e2 must be a field
                    			else {
                    				try {
                    					// get typename of left
                    					Class cls = Class.forName(left.typename());
                    					Field[] fs = cls.getDeclaredFields();
                    					for (Field f : fs) {
                    						if (f.getName().equals((e2!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(e2.start),input.getTreeAdaptor().getTokenStopIndex(e2.start))):null))) {
                    							retval.result = new CVal(f.get(left.value()));
                    						}
                    					}
                    				} catch (Exception excep) { excep.printStackTrace(); }
                    			}
                    		

                    }
                    break;
                case 15 :
                    // ChronosTree.g:346:4: datetime
                    {
                    pushFollow(FOLLOW_datetime_in_expr522);
                    datetime7=datetime();

                    state._fsp--;


                     retval.result = new CVal(datetime7); 

                    }
                    break;
                case 16 :
                    // ChronosTree.g:347:4: timeblock
                    {
                    pushFollow(FOLLOW_timeblock_in_expr529);
                    timeblock8=timeblock();

                    state._fsp--;


                     retval.result = new CVal(timeblock8); 

                    }
                    break;
                case 17 :
                    // ChronosTree.g:348:4: dayblock
                    {
                    pushFollow(FOLLOW_dayblock_in_expr536);
                    dayblock9=dayblock();

                    state._fsp--;


                     retval.result = new CVal(dayblock9); 

                    }
                    break;
                case 18 :
                    // ChronosTree.g:349:4: function
                    {
                    pushFollow(FOLLOW_function_in_expr543);
                    function10=function();

                    state._fsp--;



                    			Function func = function10;
                    			// PRINT FUNCTION
                    			/* using commas in between print params is equivalent
                    			to the + operator in java */ 
                    			if (func.params != null && func.name.equals("print")) {
                    				for (int i=0; i<func.params.size(); i++) {
                    					CVal c = func.params.get(i);
                    					print(c);
                    					if (i==func.params.size()-1)
                    						out(""); // end with newline
                    					else
                    						print(" "); // separator between print params
                    				}
                    			}
                    			// GENERATECOURSES FUNCTION
                    			if (func.name.contains("generateCourses")) {
                    				try {
                    					CVal filename = func.params.get(0);
                    					Courselist master = makeMasterList(filename.asString());
                    					retval.result = new CVal(master);
                    				} catch (NullPointerException exception) {
                    					throw new RuntimeException("No filename specified!");
                    				}
                    			}
                    			else { retval.result = new CVal(func); }
                    		

                    }
                    break;
                case 19 :
                    // ChronosTree.g:378:4: INT
                    {
                    INT11=(CommonTree)match(input,INT,FOLLOW_INT_in_expr555); 

                     retval.result = new CVal( Integer.parseInt((INT11!=null?INT11.getText():null)) ); 

                    }
                    break;
                case 20 :
                    // ChronosTree.g:379:4: DOUBLE
                    {
                    DOUBLE12=(CommonTree)match(input,DOUBLE,FOLLOW_DOUBLE_in_expr562); 

                     retval.result = new CVal( Double.parseDouble((DOUBLE12!=null?DOUBLE12.getText():null)) ); 

                    }
                    break;
                case 21 :
                    // ChronosTree.g:380:4: ID
                    {
                    ID13=(CommonTree)match(input,ID,FOLLOW_ID_in_expr569); 

                     retval.result = varMap.get((ID13!=null?ID13.getText():null)); 

                    }
                    break;
                case 22 :
                    // ChronosTree.g:381:4: STRING
                    {
                    STRING14=(CommonTree)match(input,STRING,FOLLOW_STRING_in_expr576); 

                     retval.result = new CVal( dequote((STRING14!=null?STRING14.getText():null)) ); 

                    }
                    break;
                case 23 :
                    // ChronosTree.g:382:4: TIME
                    {
                    TIME15=(CommonTree)match(input,TIME,FOLLOW_TIME_in_expr583); 

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
    // ChronosTree.g:384:1: function returns [Function result] : ^( ID ^( PARAMS ( argument_expr_list )? ) ) ;
    public final Function function() throws RecognitionException {
        Function result = null;


        CommonTree ID16=null;
        ArrayList<CVal> argument_expr_list17 =null;


        try {
            // ChronosTree.g:386:2: ( ^( ID ^( PARAMS ( argument_expr_list )? ) ) )
            // ChronosTree.g:386:4: ^( ID ^( PARAMS ( argument_expr_list )? ) )
            {
            ID16=(CommonTree)match(input,ID,FOLLOW_ID_in_function601); 

            match(input, Token.DOWN, null); 
            match(input,PARAMS,FOLLOW_PARAMS_in_function604); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // ChronosTree.g:386:18: ( argument_expr_list )?
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==AND||LA8_0==DATETIME||LA8_0==DAYBLOCK_T||LA8_0==DOUBLE||LA8_0==EQ||LA8_0==GEQ||LA8_0==ID||LA8_0==INT||(LA8_0 >= LEQ && LA8_0 <= NEQ)||LA8_0==NOT||LA8_0==OR||LA8_0==STRING||LA8_0==TIME||LA8_0==TIMES||(LA8_0 >= 51 && LA8_0 <= 52)||(LA8_0 >= 54 && LA8_0 <= 56)||LA8_0==58||LA8_0==60) ) {
                    alt8=1;
                }
                switch (alt8) {
                    case 1 :
                        // ChronosTree.g:386:18: argument_expr_list
                        {
                        pushFollow(FOLLOW_argument_expr_list_in_function606);
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
    // ChronosTree.g:390:1: datetime returns [Datetime result] : ^( DATETIME dayblock timeblock ) ;
    public final Datetime datetime() throws RecognitionException {
        Datetime result = null;


        Dayblock dayblock18 =null;

        Timeblock timeblock19 =null;


        try {
            // ChronosTree.g:392:2: ( ^( DATETIME dayblock timeblock ) )
            // ChronosTree.g:392:4: ^( DATETIME dayblock timeblock )
            {
            match(input,DATETIME,FOLLOW_DATETIME_in_datetime627); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_dayblock_in_datetime629);
            dayblock18=dayblock();

            state._fsp--;


            pushFollow(FOLLOW_timeblock_in_datetime631);
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
    // ChronosTree.g:396:1: timeblock returns [Timeblock result] : ^( TIMES a= TIME b= TIME ) ;
    public final Timeblock timeblock() throws RecognitionException {
        Timeblock result = null;


        CommonTree a=null;
        CommonTree b=null;

        try {
            // ChronosTree.g:398:2: ( ^( TIMES a= TIME b= TIME ) )
            // ChronosTree.g:398:4: ^( TIMES a= TIME b= TIME )
            {
            match(input,TIMES,FOLLOW_TIMES_in_timeblock650); 

            match(input, Token.DOWN, null); 
            a=(CommonTree)match(input,TIME,FOLLOW_TIME_in_timeblock654); 

            b=(CommonTree)match(input,TIME,FOLLOW_TIME_in_timeblock658); 

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
    // ChronosTree.g:402:1: dayblock returns [Dayblock result] : ^( DAYBLOCK_T ( DAY )+ ) ;
    public final Dayblock dayblock() throws RecognitionException {
        Dayblock result = null;


        CommonTree DAY20=null;

         result = new Dayblock(); 
        try {
            // ChronosTree.g:405:2: ( ^( DAYBLOCK_T ( DAY )+ ) )
            // ChronosTree.g:405:4: ^( DAYBLOCK_T ( DAY )+ )
            {
            match(input,DAYBLOCK_T,FOLLOW_DAYBLOCK_T_in_dayblock683); 

            match(input, Token.DOWN, null); 
            // ChronosTree.g:405:18: ( DAY )+
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
            	    // ChronosTree.g:405:19: DAY
            	    {
            	    DAY20=(CommonTree)match(input,DAY,FOLLOW_DAY_in_dayblock686); 


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
    // ChronosTree.g:411:1: argument_expr_list returns [ArrayList<CVal> result] : ( expr )+ ;
    public final ArrayList<CVal> argument_expr_list() throws RecognitionException {
        ArrayList<CVal> result = null;


        ChronosTree.expr_return expr21 =null;


         result = new ArrayList<CVal>(); 
        try {
            // ChronosTree.g:413:2: ( ( expr )+ )
            // ChronosTree.g:413:4: ( expr )+
            {
            // ChronosTree.g:413:4: ( expr )+
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
            	    // ChronosTree.g:413:5: expr
            	    {
            	    pushFollow(FOLLOW_expr_in_argument_expr_list712);
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
    // ChronosTree.g:415:1: type_specifier : ( INT_T | DOUBLE_T | DAYBLOCK_T | TIME_T | STRING_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T );
    public final ChronosTree.type_specifier_return type_specifier() throws RecognitionException {
        ChronosTree.type_specifier_return retval = new ChronosTree.type_specifier_return();
        retval.start = input.LT(1);


        try {
            // ChronosTree.g:416:2: ( INT_T | DOUBLE_T | DAYBLOCK_T | TIME_T | STRING_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T )
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
    public static final BitSet FOLLOW_declarator_in_line68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instantiator_in_line73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_line78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECL_in_declarator89 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_specifier_in_declarator91 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_declarator93 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INST_in_instantiator107 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_59_in_instantiator110 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_instantiator112 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_instantiator114 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_stmt126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_stmt132 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_stmt136 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_stmt140 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_selection_stmt_in_stmt148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_stmt_in_stmt153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_stmt_in_stmt160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COND_in_selection_stmt172 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IF_T_in_selection_stmt175 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_selection_stmt177 = new BitSet(new long[]{0x1DD82A566AA69258L});
    public static final BitSet FOLLOW_line_in_selection_stmt181 = new BitSet(new long[]{0x1DD82A566AA69258L});
    public static final BitSet FOLLOW_ELSE_T_in_selection_stmt186 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_line_in_selection_stmt190 = new BitSet(new long[]{0x1DD82A566AA69258L});
    public static final BitSet FOLLOW_FOREACH_T_in_iteration_stmt218 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IN_T_in_iteration_stmt221 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_iteration_stmt225 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_iteration_stmt229 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_iteration_stmt233 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_line_in_iteration_stmt237 = new BitSet(new long[]{0x1DD82A566AA69258L});
    public static final BitSet FOLLOW_BREAK_T_in_jump_stmt253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_expr275 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr279 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr283 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_expr292 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr296 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr300 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expr309 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr313 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQ_in_expr324 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr328 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr332 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEQ_in_expr341 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr345 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr349 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GEQ_in_expr358 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr362 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr366 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LEQ_in_expr375 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr379 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr383 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_58_in_expr392 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr396 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr400 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_60_in_expr409 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr413 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr417 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_52_in_expr430 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr434 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr438 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_54_in_expr447 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr451 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr455 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_51_in_expr464 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr468 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr472 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_56_in_expr481 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr485 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr489 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_55_in_expr502 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr506 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr510 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_datetime_in_expr522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeblock_in_expr529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayblock_in_expr536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_expr543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_expr555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_expr562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_expr576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_expr583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function601 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PARAMS_in_function604 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_argument_expr_list_in_function606 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DATETIME_in_datetime627 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_dayblock_in_datetime629 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_timeblock_in_datetime631 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMES_in_timeblock650 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TIME_in_timeblock654 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_TIME_in_timeblock658 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAYBLOCK_T_in_dayblock683 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DAY_in_dayblock686 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_expr_in_argument_expr_list712 = new BitSet(new long[]{0x15D82A564A249012L});

}