// $ANTLR 3.4 ChronosTree.g 2012-05-08 18:19:18

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
     	
     	// for tracking foreach statements
     	private int count = 0;
    	
    	// creates the master courselist from input file
    	private Courselist makeMasterList(String file) {
    		sch = new Scheduler(file);
    		return sch.courselist;
    	}
    	
    	// puts an object into the varMap
    	private void put(String name, CVal obj) {
    		varMap.put(name, obj);
    		//debug("Put " + name + " in the map with value " + obj);
    	}
    	
    	// removes an object from the varMap
    	private void rem(String name) {
    		varMap.remove(name);
    		//debug("Removed " + name + " from the map");
    	}
    	
    	// debug output
    	private void debug(String str) {
    		out(str);
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
    	
    	// gets rid of surrounding quotes
    	private String dequote(String str) {
    		return str.substring(1,str.length()-1);
    	}
    	
    	// shortcut for System.out.print
    	private void print(Object obj) {
    		System.out.print(obj);
    	}



    // $ANTLR start "program"
    // ChronosTree.g:73:1: program : ( line )+ ;
    public final void program() throws RecognitionException {
        try {
            // ChronosTree.g:74:2: ( ( line )+ )
            // ChronosTree.g:74:4: ( line )+
            {
            // ChronosTree.g:74:4: ( line )+
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
            	    // ChronosTree.g:74:4: line
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
    // ChronosTree.g:76:1: line : ( declarator | instantiator | stmt );
    public final void line() throws RecognitionException {
        try {
            // ChronosTree.g:76:5: ( declarator | instantiator | stmt )
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
                    // ChronosTree.g:76:7: declarator
                    {
                    pushFollow(FOLLOW_declarator_in_line63);
                    declarator();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // ChronosTree.g:77:4: instantiator
                    {
                    pushFollow(FOLLOW_instantiator_in_line68);
                    instantiator();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // ChronosTree.g:78:4: stmt
                    {
                    pushFollow(FOLLOW_stmt_in_line73);
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
    // ChronosTree.g:80:1: declarator : ^( DECL type_specifier ID ) ;
    public final void declarator() throws RecognitionException {
        CommonTree ID1=null;
        ChronosTree.type_specifier_return type_specifier2 =null;


        try {
            // ChronosTree.g:81:2: ( ^( DECL type_specifier ID ) )
            // ChronosTree.g:81:4: ^( DECL type_specifier ID )
            {
            match(input,DECL,FOLLOW_DECL_in_declarator84); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_specifier_in_declarator86);
            type_specifier2=type_specifier();

            state._fsp--;


            ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_declarator88); 

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
    // ChronosTree.g:103:1: instantiator : ^( INST ^( '=' ID expr ) ) ;
    public final void instantiator() throws RecognitionException {
        CommonTree ID3=null;
        ChronosTree.expr_return expr4 =null;


        try {
            // ChronosTree.g:104:2: ( ^( INST ^( '=' ID expr ) ) )
            // ChronosTree.g:104:4: ^( INST ^( '=' ID expr ) )
            {
            match(input,INST,FOLLOW_INST_in_instantiator102); 

            match(input, Token.DOWN, null); 
            match(input,59,FOLLOW_59_in_instantiator105); 

            match(input, Token.DOWN, null); 
            ID3=(CommonTree)match(input,ID,FOLLOW_ID_in_instantiator107); 

            pushFollow(FOLLOW_expr_in_instantiator109);
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
    // ChronosTree.g:114:1: stmt : ( expr | ^( '=' e1= expr e2= expr ) | selection_stmt | iteration_stmt | jump_stmt );
    public final void stmt() throws RecognitionException {
        ChronosTree.expr_return e1 =null;

        ChronosTree.expr_return e2 =null;


        try {
            // ChronosTree.g:114:5: ( expr | ^( '=' e1= expr e2= expr ) | selection_stmt | iteration_stmt | jump_stmt )
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
                    // ChronosTree.g:114:7: expr
                    {
                    pushFollow(FOLLOW_expr_in_stmt121);
                    expr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // ChronosTree.g:115:4: ^( '=' e1= expr e2= expr )
                    {
                    match(input,59,FOLLOW_59_in_stmt127); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_stmt131);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_stmt135);
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
                    // ChronosTree.g:129:4: selection_stmt
                    {
                    pushFollow(FOLLOW_selection_stmt_in_stmt143);
                    selection_stmt();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // ChronosTree.g:130:4: iteration_stmt
                    {
                    pushFollow(FOLLOW_iteration_stmt_in_stmt148);
                    iteration_stmt();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // ChronosTree.g:131:4: jump_stmt
                    {
                    pushFollow(FOLLOW_jump_stmt_in_stmt153);
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
    // ChronosTree.g:133:1: selection_stmt : ^( COND ^( IF_T conditional= expr (a= line )* ) ( ^( ELSE_T (b= line )* ) )? ) ;
    public final void selection_stmt() throws RecognitionException {
        ChronosTree.expr_return conditional =null;



        	boolean condIsTrue = false;
        	int ifBlockStart;
        	int elseBlockStart;

        try {
            // ChronosTree.g:139:2: ( ^( COND ^( IF_T conditional= expr (a= line )* ) ( ^( ELSE_T (b= line )* ) )? ) )
            // ChronosTree.g:139:4: ^( COND ^( IF_T conditional= expr (a= line )* ) ( ^( ELSE_T (b= line )* ) )? )
            {
            match(input,COND,FOLLOW_COND_in_selection_stmt169); 

            match(input, Token.DOWN, null); 
            match(input,IF_T,FOLLOW_IF_T_in_selection_stmt172); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_selection_stmt176);
            conditional=expr();

            state._fsp--;



            			debug("IS this statment true? " + (conditional!=null?conditional.result:null).getBool());
            			if (!(conditional!=null?conditional.result:null).getBool()) {
            				input.seek(86);
            			}
            		

            // ChronosTree.g:144:6: (a= line )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==AND||LA4_0==BREAK_T||LA4_0==COND||LA4_0==DATETIME||LA4_0==DAYBLOCK_T||(LA4_0 >= DECL && LA4_0 <= DOUBLE)||LA4_0==EQ||LA4_0==FOREACH_T||LA4_0==GEQ||LA4_0==ID||(LA4_0 >= INST && LA4_0 <= INT)||(LA4_0 >= LEQ && LA4_0 <= NEQ)||LA4_0==NOT||LA4_0==OR||LA4_0==STRING||LA4_0==TIME||LA4_0==TIMES||(LA4_0 >= 51 && LA4_0 <= 52)||(LA4_0 >= 54 && LA4_0 <= 56)||(LA4_0 >= 58 && LA4_0 <= 60)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ChronosTree.g:144:6: a= line
            	    {
            	    pushFollow(FOLLOW_line_in_selection_stmt182);
            	    line();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input, Token.UP, null); 



            			debug("LA 2 ahead is: " + input.LA(2));
            			debug("Else starts at: " + input.index()); 
            			if ((conditional!=null?conditional.result:null).getBool()) {
            				input.seek(input.LA(2));
            			}
            		

            // ChronosTree.g:151:3: ( ^( ELSE_T (b= line )* ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ELSE_T) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ChronosTree.g:151:5: ^( ELSE_T (b= line )* )
                    {
                    debug("AT ELSE"); 

                    match(input,ELSE_T,FOLLOW_ELSE_T_in_selection_stmt196); 

                     debug("AT B LINES"); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // ChronosTree.g:151:61: (b= line )*
                        loop5:
                        do {
                            int alt5=2;
                            int LA5_0 = input.LA(1);

                            if ( (LA5_0==AND||LA5_0==BREAK_T||LA5_0==COND||LA5_0==DATETIME||LA5_0==DAYBLOCK_T||(LA5_0 >= DECL && LA5_0 <= DOUBLE)||LA5_0==EQ||LA5_0==FOREACH_T||LA5_0==GEQ||LA5_0==ID||(LA5_0 >= INST && LA5_0 <= INT)||(LA5_0 >= LEQ && LA5_0 <= NEQ)||LA5_0==NOT||LA5_0==OR||LA5_0==STRING||LA5_0==TIME||LA5_0==TIMES||(LA5_0 >= 51 && LA5_0 <= 52)||(LA5_0 >= 54 && LA5_0 <= 56)||(LA5_0 >= 58 && LA5_0 <= 60)) ) {
                                alt5=1;
                            }


                            switch (alt5) {
                        	case 1 :
                        	    // ChronosTree.g:151:61: b= line
                        	    {
                        	    pushFollow(FOLLOW_line_in_selection_stmt201);
                        	    line();

                        	    state._fsp--;


                        	    }
                        	    break;

                        	default :
                        	    break loop5;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }


                    }
                    break;

            }



            			debug("End of this stmt is at: " + input.index());
            		

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
    // $ANTLR end "selection_stmt"



    // $ANTLR start "iteration_stmt"
    // ChronosTree.g:156:1: iteration_stmt : ^( FOREACH_T ^( IN_T element= ID list= ID ) ^( BLOCK (lines= line )* ) ) ;
    public final void iteration_stmt() throws RecognitionException {
        CommonTree element=null;
        CommonTree list=null;


        	int mark = input.mark();
        	int length;
        	String c;

        try {
            // ChronosTree.g:173:2: ( ^( FOREACH_T ^( IN_T element= ID list= ID ) ^( BLOCK (lines= line )* ) ) )
            // ChronosTree.g:173:4: ^( FOREACH_T ^( IN_T element= ID list= ID ) ^( BLOCK (lines= line )* ) )
            {
            match(input,FOREACH_T,FOLLOW_FOREACH_T_in_iteration_stmt233); 

            match(input, Token.DOWN, null); 
            match(input,IN_T,FOLLOW_IN_T_in_iteration_stmt236); 

            match(input, Token.DOWN, null); 
            element=(CommonTree)match(input,ID,FOLLOW_ID_in_iteration_stmt240); 

            list=(CommonTree)match(input,ID,FOLLOW_ID_in_iteration_stmt244); 

            match(input, Token.UP, null); 



            			// get length of list
            			CVal listval = varMap.get((list!=null?list.getText():null));
            			Courselist mylist = listval.asCourselist();
            			length = mylist.numCourses();
            			// get the current course object as a CVal
            			CVal courseval = new CVal(mylist.courses.get(count));
            			// put this course CVal into the varMap under the temp name element
            			c = (element!=null?element.getText():null);
            			put(c, courseval);
            			// increment count
            			count += 1;
            		

            match(input,BLOCK,FOLLOW_BLOCK_in_iteration_stmt252); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // ChronosTree.g:186:16: (lines= line )*
                loop7:
                do {
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==AND||LA7_0==BREAK_T||LA7_0==COND||LA7_0==DATETIME||LA7_0==DAYBLOCK_T||(LA7_0 >= DECL && LA7_0 <= DOUBLE)||LA7_0==EQ||LA7_0==FOREACH_T||LA7_0==GEQ||LA7_0==ID||(LA7_0 >= INST && LA7_0 <= INT)||(LA7_0 >= LEQ && LA7_0 <= NEQ)||LA7_0==NOT||LA7_0==OR||LA7_0==STRING||LA7_0==TIME||LA7_0==TIMES||(LA7_0 >= 51 && LA7_0 <= 52)||(LA7_0 >= 54 && LA7_0 <= 56)||(LA7_0 >= 58 && LA7_0 <= 60)) ) {
                        alt7=1;
                    }


                    switch (alt7) {
                	case 1 :
                	    // ChronosTree.g:186:16: lines= line
                	    {
                	    pushFollow(FOLLOW_line_in_iteration_stmt256);
                	    line();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop7;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            match(input, Token.UP, null); 


            }


            	// compare length with count
            	if (count < length) {
            		input.seek(mark);
            	}
            	else {
            		// remove the temp var c from the varMap
            		rem(c);
            		count = 0;
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
    // ChronosTree.g:188:1: jump_stmt : BREAK_T ;
    public final void jump_stmt() throws RecognitionException {
        try {
            // ChronosTree.g:189:2: ( BREAK_T )
            // ChronosTree.g:189:4: BREAK_T
            {
            match(input,BREAK_T,FOLLOW_BREAK_T_in_jump_stmt270); 

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
    // ChronosTree.g:191:1: expr returns [CVal result] : ( ^( OR e1= expr e2= expr ) | ^( AND e1= expr e2= expr ) | ^( NOT e= expr ) | ^( EQ e1= expr e2= expr ) | ^( NEQ e1= expr e2= expr ) | ^( GEQ e1= expr e2= expr ) | ^( LEQ e1= expr e2= expr ) | ^( '<' e1= expr e2= expr ) | ^( '>' e1= expr e2= expr ) | ^( '+' e1= expr e2= expr ) | ^( '-' e1= expr e2= expr ) | ^( '*' e1= expr e2= expr ) | ^( '/' e1= expr e2= expr ) | ^( '.' e1= expr e2= expr ) | datetime | timeblock | dayblock | function | INT | DOUBLE | ID | STRING | TIME );
    public final ChronosTree.expr_return expr() throws RecognitionException {
        ChronosTree.expr_return retval = new ChronosTree.expr_return();
        retval.start = input.LT(1);


        CommonTree INT9=null;
        CommonTree DOUBLE10=null;
        CommonTree ID11=null;
        CommonTree STRING12=null;
        CommonTree TIME13=null;
        ChronosTree.expr_return e1 =null;

        ChronosTree.expr_return e2 =null;

        ChronosTree.expr_return e =null;

        Datetime datetime5 =null;

        Timeblock timeblock6 =null;

        Dayblock dayblock7 =null;

        Function function8 =null;


        try {
            // ChronosTree.g:193:2: ( ^( OR e1= expr e2= expr ) | ^( AND e1= expr e2= expr ) | ^( NOT e= expr ) | ^( EQ e1= expr e2= expr ) | ^( NEQ e1= expr e2= expr ) | ^( GEQ e1= expr e2= expr ) | ^( LEQ e1= expr e2= expr ) | ^( '<' e1= expr e2= expr ) | ^( '>' e1= expr e2= expr ) | ^( '+' e1= expr e2= expr ) | ^( '-' e1= expr e2= expr ) | ^( '*' e1= expr e2= expr ) | ^( '/' e1= expr e2= expr ) | ^( '.' e1= expr e2= expr ) | datetime | timeblock | dayblock | function | INT | DOUBLE | ID | STRING | TIME )
            int alt8=23;
            switch ( input.LA(1) ) {
            case OR:
                {
                alt8=1;
                }
                break;
            case AND:
                {
                alt8=2;
                }
                break;
            case NOT:
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
            case 58:
                {
                alt8=8;
                }
                break;
            case 60:
                {
                alt8=9;
                }
                break;
            case 52:
                {
                alt8=10;
                }
                break;
            case 54:
                {
                alt8=11;
                }
                break;
            case 51:
                {
                alt8=12;
                }
                break;
            case 56:
                {
                alt8=13;
                }
                break;
            case 55:
                {
                alt8=14;
                }
                break;
            case DATETIME:
                {
                alt8=15;
                }
                break;
            case TIMES:
                {
                alt8=16;
                }
                break;
            case DAYBLOCK_T:
                {
                alt8=17;
                }
                break;
            case ID:
                {
                int LA8_18 = input.LA(2);

                if ( (LA8_18==DOWN) ) {
                    alt8=18;
                }
                else if ( (LA8_18==EOF||(LA8_18 >= UP && LA8_18 <= AND)||LA8_18==BREAK_T||LA8_18==COND||LA8_18==DATETIME||LA8_18==DAYBLOCK_T||(LA8_18 >= DECL && LA8_18 <= DOUBLE)||LA8_18==EQ||LA8_18==FOREACH_T||LA8_18==GEQ||LA8_18==ID||(LA8_18 >= INST && LA8_18 <= INT)||(LA8_18 >= LEQ && LA8_18 <= NEQ)||LA8_18==NOT||LA8_18==OR||LA8_18==STRING||LA8_18==TIME||LA8_18==TIMES||(LA8_18 >= 51 && LA8_18 <= 52)||(LA8_18 >= 54 && LA8_18 <= 56)||(LA8_18 >= 58 && LA8_18 <= 60)) ) {
                    alt8=21;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 18, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt8=19;
                }
                break;
            case DOUBLE:
                {
                alt8=20;
                }
                break;
            case STRING:
                {
                alt8=22;
                }
                break;
            case TIME:
                {
                alt8=23;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // ChronosTree.g:193:4: ^( OR e1= expr e2= expr )
                    {
                    match(input,OR,FOLLOW_OR_in_expr288); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr292);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr296);
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
                    // ChronosTree.g:206:4: ^( AND e1= expr e2= expr )
                    {
                    match(input,AND,FOLLOW_AND_in_expr305); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr309);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr313);
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
                    // ChronosTree.g:217:4: ^( NOT e= expr )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expr322); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr326);
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
                    // ChronosTree.g:228:4: ^( EQ e1= expr e2= expr )
                    {
                    match(input,EQ,FOLLOW_EQ_in_expr337); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr341);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr345);
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
                    // ChronosTree.g:235:4: ^( NEQ e1= expr e2= expr )
                    {
                    match(input,NEQ,FOLLOW_NEQ_in_expr354); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr358);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr362);
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
                    // ChronosTree.g:242:4: ^( GEQ e1= expr e2= expr )
                    {
                    match(input,GEQ,FOLLOW_GEQ_in_expr371); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr375);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr379);
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
                    // ChronosTree.g:249:4: ^( LEQ e1= expr e2= expr )
                    {
                    match(input,LEQ,FOLLOW_LEQ_in_expr388); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr392);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr396);
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
                    // ChronosTree.g:256:4: ^( '<' e1= expr e2= expr )
                    {
                    match(input,58,FOLLOW_58_in_expr405); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr409);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr413);
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
                    // ChronosTree.g:263:4: ^( '>' e1= expr e2= expr )
                    {
                    match(input,60,FOLLOW_60_in_expr422); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr426);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr430);
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
                    // ChronosTree.g:272:4: ^( '+' e1= expr e2= expr )
                    {
                    match(input,52,FOLLOW_52_in_expr443); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr447);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr451);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 



                    			CVal val1 = (e1!=null?e1.result:null);
                    			CVal val2 = (e2!=null?e2.result:null);
                    			debug( "ADDING: " + info((e1!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(e1.start),input.getTreeAdaptor().getTokenStopIndex(e1.start))):null), val1) + " ; " + info((e2!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(e2.start),input.getTreeAdaptor().getTokenStopIndex(e2.start))):null), val2) );
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
                    // ChronosTree.g:298:4: ^( '-' e1= expr e2= expr )
                    {
                    match(input,54,FOLLOW_54_in_expr460); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr464);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr468);
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
                    // ChronosTree.g:310:4: ^( '*' e1= expr e2= expr )
                    {
                    match(input,51,FOLLOW_51_in_expr477); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr481);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr485);
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
                    // ChronosTree.g:322:4: ^( '/' e1= expr e2= expr )
                    {
                    match(input,56,FOLLOW_56_in_expr494); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr498);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr502);
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
                    // ChronosTree.g:336:4: ^( '.' e1= expr e2= expr )
                    {
                    match(input,55,FOLLOW_55_in_expr515); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr519);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr523);
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
                    // ChronosTree.g:384:4: datetime
                    {
                    pushFollow(FOLLOW_datetime_in_expr535);
                    datetime5=datetime();

                    state._fsp--;


                     retval.result = new CVal(datetime5); 

                    }
                    break;
                case 16 :
                    // ChronosTree.g:385:4: timeblock
                    {
                    pushFollow(FOLLOW_timeblock_in_expr542);
                    timeblock6=timeblock();

                    state._fsp--;


                     retval.result = new CVal(timeblock6); 

                    }
                    break;
                case 17 :
                    // ChronosTree.g:386:4: dayblock
                    {
                    pushFollow(FOLLOW_dayblock_in_expr549);
                    dayblock7=dayblock();

                    state._fsp--;


                     retval.result = new CVal(dayblock7); 

                    }
                    break;
                case 18 :
                    // ChronosTree.g:387:4: function
                    {
                    pushFollow(FOLLOW_function_in_expr556);
                    function8=function();

                    state._fsp--;



                    			Function func = function8;
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
                    // ChronosTree.g:416:4: INT
                    {
                    INT9=(CommonTree)match(input,INT,FOLLOW_INT_in_expr568); 

                     retval.result = new CVal( Integer.parseInt((INT9!=null?INT9.getText():null)) ); 

                    }
                    break;
                case 20 :
                    // ChronosTree.g:417:4: DOUBLE
                    {
                    DOUBLE10=(CommonTree)match(input,DOUBLE,FOLLOW_DOUBLE_in_expr575); 

                     retval.result = new CVal( Double.parseDouble((DOUBLE10!=null?DOUBLE10.getText():null)) ); 

                    }
                    break;
                case 21 :
                    // ChronosTree.g:418:4: ID
                    {
                    ID11=(CommonTree)match(input,ID,FOLLOW_ID_in_expr582); 

                     retval.result = varMap.get((ID11!=null?ID11.getText():null)); 

                    }
                    break;
                case 22 :
                    // ChronosTree.g:419:4: STRING
                    {
                    STRING12=(CommonTree)match(input,STRING,FOLLOW_STRING_in_expr589); 

                     retval.result = new CVal( dequote((STRING12!=null?STRING12.getText():null)) ); 

                    }
                    break;
                case 23 :
                    // ChronosTree.g:420:4: TIME
                    {
                    TIME13=(CommonTree)match(input,TIME,FOLLOW_TIME_in_expr596); 

                     retval.result = new CVal( new Time((TIME13!=null?TIME13.getText():null)) ); 

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
    // ChronosTree.g:422:1: function returns [Function result] : ^( ID ^( PARAMS ( argument_expr_list )? ) ) ;
    public final Function function() throws RecognitionException {
        Function result = null;


        CommonTree ID14=null;
        ArrayList<CVal> argument_expr_list15 =null;


        try {
            // ChronosTree.g:424:2: ( ^( ID ^( PARAMS ( argument_expr_list )? ) ) )
            // ChronosTree.g:424:4: ^( ID ^( PARAMS ( argument_expr_list )? ) )
            {
            ID14=(CommonTree)match(input,ID,FOLLOW_ID_in_function614); 

            match(input, Token.DOWN, null); 
            match(input,PARAMS,FOLLOW_PARAMS_in_function617); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // ChronosTree.g:424:18: ( argument_expr_list )?
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==AND||LA9_0==DATETIME||LA9_0==DAYBLOCK_T||LA9_0==DOUBLE||LA9_0==EQ||LA9_0==GEQ||LA9_0==ID||LA9_0==INT||(LA9_0 >= LEQ && LA9_0 <= NEQ)||LA9_0==NOT||LA9_0==OR||LA9_0==STRING||LA9_0==TIME||LA9_0==TIMES||(LA9_0 >= 51 && LA9_0 <= 52)||(LA9_0 >= 54 && LA9_0 <= 56)||LA9_0==58||LA9_0==60) ) {
                    alt9=1;
                }
                switch (alt9) {
                    case 1 :
                        // ChronosTree.g:424:18: argument_expr_list
                        {
                        pushFollow(FOLLOW_argument_expr_list_in_function619);
                        argument_expr_list15=argument_expr_list();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input, Token.UP, null); 



            			result = new Function((ID14!=null?ID14.getText():null), argument_expr_list15);
            		

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
    // ChronosTree.g:428:1: datetime returns [Datetime result] : ^( DATETIME dayblock timeblock ) ;
    public final Datetime datetime() throws RecognitionException {
        Datetime result = null;


        Dayblock dayblock16 =null;

        Timeblock timeblock17 =null;


        try {
            // ChronosTree.g:430:2: ( ^( DATETIME dayblock timeblock ) )
            // ChronosTree.g:430:4: ^( DATETIME dayblock timeblock )
            {
            match(input,DATETIME,FOLLOW_DATETIME_in_datetime640); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_dayblock_in_datetime642);
            dayblock16=dayblock();

            state._fsp--;


            pushFollow(FOLLOW_timeblock_in_datetime644);
            timeblock17=timeblock();

            state._fsp--;


            match(input, Token.UP, null); 



            		result = new Datetime(dayblock16, timeblock17);
            		

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
    // ChronosTree.g:434:1: timeblock returns [Timeblock result] : ^( TIMES a= TIME b= TIME ) ;
    public final Timeblock timeblock() throws RecognitionException {
        Timeblock result = null;


        CommonTree a=null;
        CommonTree b=null;

        try {
            // ChronosTree.g:436:2: ( ^( TIMES a= TIME b= TIME ) )
            // ChronosTree.g:436:4: ^( TIMES a= TIME b= TIME )
            {
            match(input,TIMES,FOLLOW_TIMES_in_timeblock663); 

            match(input, Token.DOWN, null); 
            a=(CommonTree)match(input,TIME,FOLLOW_TIME_in_timeblock667); 

            b=(CommonTree)match(input,TIME,FOLLOW_TIME_in_timeblock671); 

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
    // ChronosTree.g:440:1: dayblock returns [Dayblock result] : ^( DAYBLOCK_T ( DAY )+ ) ;
    public final Dayblock dayblock() throws RecognitionException {
        Dayblock result = null;


        CommonTree DAY18=null;

         result = new Dayblock(); 
        try {
            // ChronosTree.g:443:2: ( ^( DAYBLOCK_T ( DAY )+ ) )
            // ChronosTree.g:443:4: ^( DAYBLOCK_T ( DAY )+ )
            {
            match(input,DAYBLOCK_T,FOLLOW_DAYBLOCK_T_in_dayblock696); 

            match(input, Token.DOWN, null); 
            // ChronosTree.g:443:18: ( DAY )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==DAY) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ChronosTree.g:443:19: DAY
            	    {
            	    DAY18=(CommonTree)match(input,DAY,FOLLOW_DAY_in_dayblock699); 


            	    			char daychar = ((DAY18!=null?DAY18.getText():null)).charAt(0);
            	    			try{result.add(daychar);}
            	    			catch (Exception e1) {out("Can't add this day");}
            	    		

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
    // ChronosTree.g:449:1: argument_expr_list returns [ArrayList<CVal> result] : ( expr )+ ;
    public final ArrayList<CVal> argument_expr_list() throws RecognitionException {
        ArrayList<CVal> result = null;


        ChronosTree.expr_return expr19 =null;


         result = new ArrayList<CVal>(); 
        try {
            // ChronosTree.g:451:2: ( ( expr )+ )
            // ChronosTree.g:451:4: ( expr )+
            {
            // ChronosTree.g:451:4: ( expr )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==AND||LA11_0==DATETIME||LA11_0==DAYBLOCK_T||LA11_0==DOUBLE||LA11_0==EQ||LA11_0==GEQ||LA11_0==ID||LA11_0==INT||(LA11_0 >= LEQ && LA11_0 <= NEQ)||LA11_0==NOT||LA11_0==OR||LA11_0==STRING||LA11_0==TIME||LA11_0==TIMES||(LA11_0 >= 51 && LA11_0 <= 52)||(LA11_0 >= 54 && LA11_0 <= 56)||LA11_0==58||LA11_0==60) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ChronosTree.g:451:5: expr
            	    {
            	    pushFollow(FOLLOW_expr_in_argument_expr_list725);
            	    expr19=expr();

            	    state._fsp--;


            	    result.add((expr19!=null?expr19.result:null));

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
    // ChronosTree.g:453:1: type_specifier : ( INT_T | DOUBLE_T | DAYBLOCK_T | TIME_T | STRING_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T );
    public final ChronosTree.type_specifier_return type_specifier() throws RecognitionException {
        ChronosTree.type_specifier_return retval = new ChronosTree.type_specifier_return();
        retval.start = input.LT(1);


        try {
            // ChronosTree.g:454:2: ( INT_T | DOUBLE_T | DAYBLOCK_T | TIME_T | STRING_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T )
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


 

    public static final BitSet FOLLOW_line_in_program54 = new BitSet(new long[]{0x1DD82A566AA69252L});
    public static final BitSet FOLLOW_declarator_in_line63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instantiator_in_line68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_line73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECL_in_declarator84 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_specifier_in_declarator86 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_declarator88 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INST_in_instantiator102 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_59_in_instantiator105 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_instantiator107 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_instantiator109 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_stmt121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_stmt127 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_stmt131 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_stmt135 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_selection_stmt_in_stmt143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_stmt_in_stmt148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_stmt_in_stmt153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COND_in_selection_stmt169 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IF_T_in_selection_stmt172 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_selection_stmt176 = new BitSet(new long[]{0x1DD82A566AA69258L});
    public static final BitSet FOLLOW_line_in_selection_stmt182 = new BitSet(new long[]{0x1DD82A566AA69258L});
    public static final BitSet FOLLOW_ELSE_T_in_selection_stmt196 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_line_in_selection_stmt201 = new BitSet(new long[]{0x1DD82A566AA69258L});
    public static final BitSet FOLLOW_FOREACH_T_in_iteration_stmt233 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IN_T_in_iteration_stmt236 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_iteration_stmt240 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_iteration_stmt244 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_iteration_stmt252 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_line_in_iteration_stmt256 = new BitSet(new long[]{0x1DD82A566AA69258L});
    public static final BitSet FOLLOW_BREAK_T_in_jump_stmt270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_expr288 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr292 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr296 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_expr305 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr309 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr313 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expr322 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr326 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQ_in_expr337 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr341 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr345 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEQ_in_expr354 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr358 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr362 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GEQ_in_expr371 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr375 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr379 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LEQ_in_expr388 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr392 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr396 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_58_in_expr405 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr409 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr413 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_60_in_expr422 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr426 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr430 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_52_in_expr443 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr447 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr451 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_54_in_expr460 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr464 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr468 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_51_in_expr477 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr481 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr485 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_56_in_expr494 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr498 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr502 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_55_in_expr515 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr519 = new BitSet(new long[]{0x15D82A564A249010L});
    public static final BitSet FOLLOW_expr_in_expr523 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_datetime_in_expr535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeblock_in_expr542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayblock_in_expr549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_expr556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_expr568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_expr575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_expr589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_expr596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function614 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PARAMS_in_function617 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_argument_expr_list_in_function619 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DATETIME_in_datetime640 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_dayblock_in_datetime642 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_timeblock_in_datetime644 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMES_in_timeblock663 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TIME_in_timeblock667 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_TIME_in_timeblock671 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAYBLOCK_T_in_dayblock696 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DAY_in_dayblock699 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_expr_in_argument_expr_list725 = new BitSet(new long[]{0x15D82A564A249012L});

}