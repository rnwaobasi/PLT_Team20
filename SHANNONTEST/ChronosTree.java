// $ANTLR 3.4 ChronosTree.g 2012-05-08 23:36:44

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "BLOCK", "BREAK_T", "CHAR", "COMMENT", "COND", "COURSELIST_T", "COURSE_T", "DATETIME", "DATETIME_T", "DAY", "DAYBLOCK_T", "DAYS", "DECL", "DOUBLE", "DOUBLE_T", "ELSE_T", "EQ", "ESC_SEQ", "FOREACH_T", "FUNC", "GEQ", "HEX_DIGIT", "ID", "IF_T", "INST", "INT", "INT_T", "IN_T", "LEQ", "NEQ", "NEW_T", "NOT", "OCTAL_ESC", "OR", "PARAMS", "SCHEDULE_T", "STRING", "STRING_T", "THEN", "TIME", "TIMEBLOCK_T", "TIMES", "TIME_T", "UNICODE_ESC", "WS", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "';'", "'<'", "'='", "'>'", "'['", "']'", "'{'", "'}'", "'~'"
    };

    public static final int EOF=-1;
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
    public static final int T__66=66;
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
    public static final int THEN=43;
    public static final int TIME=44;
    public static final int TIMEBLOCK_T=45;
    public static final int TIMES=46;
    public static final int TIME_T=47;
    public static final int UNICODE_ESC=48;
    public static final int WS=49;

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

                if ( (LA1_0==AND||LA1_0==BREAK_T||LA1_0==COND||LA1_0==DATETIME||LA1_0==DAYBLOCK_T||(LA1_0 >= DECL && LA1_0 <= DOUBLE)||LA1_0==EQ||LA1_0==FOREACH_T||LA1_0==GEQ||LA1_0==ID||(LA1_0 >= INST && LA1_0 <= INT)||(LA1_0 >= LEQ && LA1_0 <= NEQ)||LA1_0==NOT||LA1_0==OR||LA1_0==STRING||LA1_0==TIME||LA1_0==TIMES||(LA1_0 >= 52 && LA1_0 <= 53)||(LA1_0 >= 55 && LA1_0 <= 57)||(LA1_0 >= 59 && LA1_0 <= 61)) ) {
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
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 59:
            case 60:
            case 61:
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
            match(input,60,FOLLOW_60_in_instantiator105); 

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
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 59:
            case 61:
                {
                alt3=1;
                }
                break;
            case 60:
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
                    match(input,60,FOLLOW_60_in_stmt127); 

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
    // ChronosTree.g:133:1: selection_stmt : ^( COND expr . . ) ;
    public final void selection_stmt() throws RecognitionException {
        ChronosTree.expr_return expr5 =null;



        	int t = 0;
        	int e = 0;
        	CommonTreeNodeStream stream = (CommonTreeNodeStream)input;
        	boolean condIsTrue;

        try {
            // ChronosTree.g:151:2: ( ^( COND expr . . ) )
            // ChronosTree.g:151:4: ^( COND expr . . )
            {
            match(input,COND,FOLLOW_COND_in_selection_stmt173); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_selection_stmt175);
            expr5=expr();

            state._fsp--;



            			condIsTrue = (expr5!=null?expr5.result:null).getBool();
            		

             t = input.mark(); 

            matchAny(input); 

             e = input.mark(); 

            matchAny(input); 

            match(input, Token.UP, null); 


            }


            	if (condIsTrue) {
            		stream.push(t);
            		then_stmt();
            	}
            	else {
            		stream.push(e);
            		else_stmt();
            	}
            	stream.pop();

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



    // $ANTLR start "then_stmt"
    // ChronosTree.g:157:1: then_stmt : ^( THEN ( line )* ) ;
    public final void then_stmt() throws RecognitionException {
        try {
            // ChronosTree.g:158:2: ( ^( THEN ( line )* ) )
            // ChronosTree.g:158:4: ^( THEN ( line )* )
            {
            match(input,THEN,FOLLOW_THEN_in_then_stmt200); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // ChronosTree.g:158:11: ( line )*
                loop4:
                do {
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==AND||LA4_0==BREAK_T||LA4_0==COND||LA4_0==DATETIME||LA4_0==DAYBLOCK_T||(LA4_0 >= DECL && LA4_0 <= DOUBLE)||LA4_0==EQ||LA4_0==FOREACH_T||LA4_0==GEQ||LA4_0==ID||(LA4_0 >= INST && LA4_0 <= INT)||(LA4_0 >= LEQ && LA4_0 <= NEQ)||LA4_0==NOT||LA4_0==OR||LA4_0==STRING||LA4_0==TIME||LA4_0==TIMES||(LA4_0 >= 52 && LA4_0 <= 53)||(LA4_0 >= 55 && LA4_0 <= 57)||(LA4_0 >= 59 && LA4_0 <= 61)) ) {
                        alt4=1;
                    }


                    switch (alt4) {
                	case 1 :
                	    // ChronosTree.g:158:11: line
                	    {
                	    pushFollow(FOLLOW_line_in_then_stmt202);
                	    line();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop4;
                    }
                } while (true);


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
    // $ANTLR end "then_stmt"



    // $ANTLR start "else_stmt"
    // ChronosTree.g:160:1: else_stmt : ^( ELSE_T ( line )* ) ;
    public final void else_stmt() throws RecognitionException {
        try {
            // ChronosTree.g:161:2: ( ^( ELSE_T ( line )* ) )
            // ChronosTree.g:161:4: ^( ELSE_T ( line )* )
            {
            match(input,ELSE_T,FOLLOW_ELSE_T_in_else_stmt215); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // ChronosTree.g:161:13: ( line )*
                loop5:
                do {
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==AND||LA5_0==BREAK_T||LA5_0==COND||LA5_0==DATETIME||LA5_0==DAYBLOCK_T||(LA5_0 >= DECL && LA5_0 <= DOUBLE)||LA5_0==EQ||LA5_0==FOREACH_T||LA5_0==GEQ||LA5_0==ID||(LA5_0 >= INST && LA5_0 <= INT)||(LA5_0 >= LEQ && LA5_0 <= NEQ)||LA5_0==NOT||LA5_0==OR||LA5_0==STRING||LA5_0==TIME||LA5_0==TIMES||(LA5_0 >= 52 && LA5_0 <= 53)||(LA5_0 >= 55 && LA5_0 <= 57)||(LA5_0 >= 59 && LA5_0 <= 61)) ) {
                        alt5=1;
                    }


                    switch (alt5) {
                	case 1 :
                	    // ChronosTree.g:161:13: line
                	    {
                	    pushFollow(FOLLOW_line_in_else_stmt217);
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
    // $ANTLR end "else_stmt"



    // $ANTLR start "iteration_stmt"
    // ChronosTree.g:163:1: iteration_stmt : ^( FOREACH_T ^( IN_T element= ID list= ID ) ^( BLOCK (lines= line )* ) ) ;
    public final void iteration_stmt() throws RecognitionException {
        CommonTree element=null;
        CommonTree list=null;


        	int mark = input.mark();
        	int length;
        	String c;

        try {
            // ChronosTree.g:180:2: ( ^( FOREACH_T ^( IN_T element= ID list= ID ) ^( BLOCK (lines= line )* ) ) )
            // ChronosTree.g:180:4: ^( FOREACH_T ^( IN_T element= ID list= ID ) ^( BLOCK (lines= line )* ) )
            {
            match(input,FOREACH_T,FOLLOW_FOREACH_T_in_iteration_stmt241); 

            match(input, Token.DOWN, null); 
            match(input,IN_T,FOLLOW_IN_T_in_iteration_stmt244); 

            match(input, Token.DOWN, null); 
            element=(CommonTree)match(input,ID,FOLLOW_ID_in_iteration_stmt248); 

            list=(CommonTree)match(input,ID,FOLLOW_ID_in_iteration_stmt252); 

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
            		

            match(input,BLOCK,FOLLOW_BLOCK_in_iteration_stmt260); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // ChronosTree.g:193:16: (lines= line )*
                loop6:
                do {
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==AND||LA6_0==BREAK_T||LA6_0==COND||LA6_0==DATETIME||LA6_0==DAYBLOCK_T||(LA6_0 >= DECL && LA6_0 <= DOUBLE)||LA6_0==EQ||LA6_0==FOREACH_T||LA6_0==GEQ||LA6_0==ID||(LA6_0 >= INST && LA6_0 <= INT)||(LA6_0 >= LEQ && LA6_0 <= NEQ)||LA6_0==NOT||LA6_0==OR||LA6_0==STRING||LA6_0==TIME||LA6_0==TIMES||(LA6_0 >= 52 && LA6_0 <= 53)||(LA6_0 >= 55 && LA6_0 <= 57)||(LA6_0 >= 59 && LA6_0 <= 61)) ) {
                        alt6=1;
                    }


                    switch (alt6) {
                	case 1 :
                	    // ChronosTree.g:193:16: lines= line
                	    {
                	    pushFollow(FOLLOW_line_in_iteration_stmt264);
                	    line();

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
    // ChronosTree.g:195:1: jump_stmt : BREAK_T ;
    public final void jump_stmt() throws RecognitionException {
        try {
            // ChronosTree.g:196:2: ( BREAK_T )
            // ChronosTree.g:196:4: BREAK_T
            {
            match(input,BREAK_T,FOLLOW_BREAK_T_in_jump_stmt278); 

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
    // ChronosTree.g:198:1: expr returns [CVal result] : ( ^( OR e1= expr e2= expr ) | ^( AND e1= expr e2= expr ) | ^( NOT e= expr ) | ^( EQ e1= expr e2= expr ) | ^( NEQ e1= expr e2= expr ) | ^( GEQ e1= expr e2= expr ) | ^( LEQ e1= expr e2= expr ) | ^( '<' e1= expr e2= expr ) | ^( '>' e1= expr e2= expr ) | ^( '+' e1= expr e2= expr ) | ^( '-' e1= expr e2= expr ) | ^( '*' e1= expr e2= expr ) | ^( '/' e1= expr e2= expr ) | ^( '.' e1= expr e2= expr ) | datetime | timeblock | dayblock | function | INT | DOUBLE | ID | STRING | TIME );
    public final ChronosTree.expr_return expr() throws RecognitionException {
        ChronosTree.expr_return retval = new ChronosTree.expr_return();
        retval.start = input.LT(1);


        CommonTree INT10=null;
        CommonTree DOUBLE11=null;
        CommonTree ID12=null;
        CommonTree STRING13=null;
        CommonTree TIME14=null;
        ChronosTree.expr_return e1 =null;

        ChronosTree.expr_return e2 =null;

        ChronosTree.expr_return e =null;

        Datetime datetime6 =null;

        Timeblock timeblock7 =null;

        Dayblock dayblock8 =null;

        Function function9 =null;


        try {
            // ChronosTree.g:200:2: ( ^( OR e1= expr e2= expr ) | ^( AND e1= expr e2= expr ) | ^( NOT e= expr ) | ^( EQ e1= expr e2= expr ) | ^( NEQ e1= expr e2= expr ) | ^( GEQ e1= expr e2= expr ) | ^( LEQ e1= expr e2= expr ) | ^( '<' e1= expr e2= expr ) | ^( '>' e1= expr e2= expr ) | ^( '+' e1= expr e2= expr ) | ^( '-' e1= expr e2= expr ) | ^( '*' e1= expr e2= expr ) | ^( '/' e1= expr e2= expr ) | ^( '.' e1= expr e2= expr ) | datetime | timeblock | dayblock | function | INT | DOUBLE | ID | STRING | TIME )
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
            case 59:
                {
                alt7=8;
                }
                break;
            case 61:
                {
                alt7=9;
                }
                break;
            case 53:
                {
                alt7=10;
                }
                break;
            case 55:
                {
                alt7=11;
                }
                break;
            case 52:
                {
                alt7=12;
                }
                break;
            case 57:
                {
                alt7=13;
                }
                break;
            case 56:
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
                else if ( (LA7_18==EOF||(LA7_18 >= UP && LA7_18 <= 66)) ) {
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
                    // ChronosTree.g:200:4: ^( OR e1= expr e2= expr )
                    {
                    match(input,OR,FOLLOW_OR_in_expr296); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr300);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr304);
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
                    // ChronosTree.g:213:4: ^( AND e1= expr e2= expr )
                    {
                    match(input,AND,FOLLOW_AND_in_expr313); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr317);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr321);
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
                    // ChronosTree.g:224:4: ^( NOT e= expr )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expr330); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr334);
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
                    // ChronosTree.g:235:4: ^( EQ e1= expr e2= expr )
                    {
                    match(input,EQ,FOLLOW_EQ_in_expr345); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr349);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr353);
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
                    // ChronosTree.g:242:4: ^( NEQ e1= expr e2= expr )
                    {
                    match(input,NEQ,FOLLOW_NEQ_in_expr362); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr366);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr370);
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
                    // ChronosTree.g:249:4: ^( GEQ e1= expr e2= expr )
                    {
                    match(input,GEQ,FOLLOW_GEQ_in_expr379); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr383);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr387);
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
                    // ChronosTree.g:256:4: ^( LEQ e1= expr e2= expr )
                    {
                    match(input,LEQ,FOLLOW_LEQ_in_expr396); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr400);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr404);
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
                    // ChronosTree.g:263:4: ^( '<' e1= expr e2= expr )
                    {
                    match(input,59,FOLLOW_59_in_expr413); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr417);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr421);
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
                    // ChronosTree.g:270:4: ^( '>' e1= expr e2= expr )
                    {
                    match(input,61,FOLLOW_61_in_expr430); 

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
                    			if ( val1.compareTo(val2) > 0 )
                    				retval.result = new CVal(new Integer(1));
                    			else retval.result = new CVal(new Integer(0));
                    		

                    }
                    break;
                case 10 :
                    // ChronosTree.g:279:4: ^( '+' e1= expr e2= expr )
                    {
                    match(input,53,FOLLOW_53_in_expr451); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr455);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr459);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 



                    			CVal val1 = (e1!=null?e1.result:null);
                    			CVal val2 = (e2!=null?e2.result:null);
                    			//debug( "ADDING: " + info((e1!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(e1.start),input.getTreeAdaptor().getTokenStopIndex(e1.start))):null), val1) + " ; " + info((e2!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(e2.start),input.getTreeAdaptor().getTokenStopIndex(e2.start))):null), val2) );
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
                    // ChronosTree.g:305:4: ^( '-' e1= expr e2= expr )
                    {
                    match(input,55,FOLLOW_55_in_expr468); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr472);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr476);
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
                    // ChronosTree.g:317:4: ^( '*' e1= expr e2= expr )
                    {
                    match(input,52,FOLLOW_52_in_expr485); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr489);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr493);
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
                    // ChronosTree.g:329:4: ^( '/' e1= expr e2= expr )
                    {
                    match(input,57,FOLLOW_57_in_expr502); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr506);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr510);
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
                    // ChronosTree.g:343:4: ^( '.' e1= expr e2= expr )
                    {
                    match(input,56,FOLLOW_56_in_expr523); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr527);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr531);
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
                    							if (rightf.params != null) { // has params
                    								retval.result = new CVal(m.invoke(left.value(), rightf.params));
                    							}
                    							else retval.result = new CVal(m.invoke(left.value())); // no params
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
                    // ChronosTree.g:392:4: datetime
                    {
                    pushFollow(FOLLOW_datetime_in_expr543);
                    datetime6=datetime();

                    state._fsp--;


                     retval.result = new CVal(datetime6); 

                    }
                    break;
                case 16 :
                    // ChronosTree.g:393:4: timeblock
                    {
                    pushFollow(FOLLOW_timeblock_in_expr550);
                    timeblock7=timeblock();

                    state._fsp--;


                     retval.result = new CVal(timeblock7); 

                    }
                    break;
                case 17 :
                    // ChronosTree.g:394:4: dayblock
                    {
                    pushFollow(FOLLOW_dayblock_in_expr557);
                    dayblock8=dayblock();

                    state._fsp--;


                     retval.result = new CVal(dayblock8); 

                    }
                    break;
                case 18 :
                    // ChronosTree.g:395:4: function
                    {
                    pushFollow(FOLLOW_function_in_expr564);
                    function9=function();

                    state._fsp--;



                    			Function func = function9;
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
                    // ChronosTree.g:424:4: INT
                    {
                    INT10=(CommonTree)match(input,INT,FOLLOW_INT_in_expr576); 

                     retval.result = new CVal( Integer.parseInt((INT10!=null?INT10.getText():null)) ); 

                    }
                    break;
                case 20 :
                    // ChronosTree.g:425:4: DOUBLE
                    {
                    DOUBLE11=(CommonTree)match(input,DOUBLE,FOLLOW_DOUBLE_in_expr583); 

                     retval.result = new CVal( Double.parseDouble((DOUBLE11!=null?DOUBLE11.getText():null)) ); 

                    }
                    break;
                case 21 :
                    // ChronosTree.g:426:4: ID
                    {
                    ID12=(CommonTree)match(input,ID,FOLLOW_ID_in_expr590); 

                     retval.result = varMap.get((ID12!=null?ID12.getText():null)); 

                    }
                    break;
                case 22 :
                    // ChronosTree.g:427:4: STRING
                    {
                    STRING13=(CommonTree)match(input,STRING,FOLLOW_STRING_in_expr597); 

                     retval.result = new CVal( dequote((STRING13!=null?STRING13.getText():null)) ); 

                    }
                    break;
                case 23 :
                    // ChronosTree.g:428:4: TIME
                    {
                    TIME14=(CommonTree)match(input,TIME,FOLLOW_TIME_in_expr604); 

                     retval.result = new CVal( new Time((TIME14!=null?TIME14.getText():null)) ); 

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
    // ChronosTree.g:430:1: function returns [Function result] : ^( ID ^( PARAMS ( argument_expr_list )? ) ) ;
    public final Function function() throws RecognitionException {
        Function result = null;


        CommonTree ID15=null;
        ArrayList<CVal> argument_expr_list16 =null;


        try {
            // ChronosTree.g:432:2: ( ^( ID ^( PARAMS ( argument_expr_list )? ) ) )
            // ChronosTree.g:432:4: ^( ID ^( PARAMS ( argument_expr_list )? ) )
            {
            ID15=(CommonTree)match(input,ID,FOLLOW_ID_in_function622); 

            match(input, Token.DOWN, null); 
            match(input,PARAMS,FOLLOW_PARAMS_in_function625); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // ChronosTree.g:432:18: ( argument_expr_list )?
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==AND||LA8_0==DATETIME||LA8_0==DAYBLOCK_T||LA8_0==DOUBLE||LA8_0==EQ||LA8_0==GEQ||LA8_0==ID||LA8_0==INT||(LA8_0 >= LEQ && LA8_0 <= NEQ)||LA8_0==NOT||LA8_0==OR||LA8_0==STRING||LA8_0==TIME||LA8_0==TIMES||(LA8_0 >= 52 && LA8_0 <= 53)||(LA8_0 >= 55 && LA8_0 <= 57)||LA8_0==59||LA8_0==61) ) {
                    alt8=1;
                }
                switch (alt8) {
                    case 1 :
                        // ChronosTree.g:432:18: argument_expr_list
                        {
                        pushFollow(FOLLOW_argument_expr_list_in_function627);
                        argument_expr_list16=argument_expr_list();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input, Token.UP, null); 



            			result = new Function((ID15!=null?ID15.getText():null), argument_expr_list16);
            		

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
    // ChronosTree.g:436:1: datetime returns [Datetime result] : ^( DATETIME dayblock timeblock ) ;
    public final Datetime datetime() throws RecognitionException {
        Datetime result = null;


        Dayblock dayblock17 =null;

        Timeblock timeblock18 =null;


        try {
            // ChronosTree.g:438:2: ( ^( DATETIME dayblock timeblock ) )
            // ChronosTree.g:438:4: ^( DATETIME dayblock timeblock )
            {
            match(input,DATETIME,FOLLOW_DATETIME_in_datetime648); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_dayblock_in_datetime650);
            dayblock17=dayblock();

            state._fsp--;


            pushFollow(FOLLOW_timeblock_in_datetime652);
            timeblock18=timeblock();

            state._fsp--;


            match(input, Token.UP, null); 



            		result = new Datetime(dayblock17, timeblock18);
            		

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
    // ChronosTree.g:442:1: timeblock returns [Timeblock result] : ^( TIMES a= TIME b= TIME ) ;
    public final Timeblock timeblock() throws RecognitionException {
        Timeblock result = null;


        CommonTree a=null;
        CommonTree b=null;

        try {
            // ChronosTree.g:444:2: ( ^( TIMES a= TIME b= TIME ) )
            // ChronosTree.g:444:4: ^( TIMES a= TIME b= TIME )
            {
            match(input,TIMES,FOLLOW_TIMES_in_timeblock671); 

            match(input, Token.DOWN, null); 
            a=(CommonTree)match(input,TIME,FOLLOW_TIME_in_timeblock675); 

            b=(CommonTree)match(input,TIME,FOLLOW_TIME_in_timeblock679); 

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
    // ChronosTree.g:448:1: dayblock returns [Dayblock result] : ^( DAYBLOCK_T ( DAY )+ ) ;
    public final Dayblock dayblock() throws RecognitionException {
        Dayblock result = null;


        CommonTree DAY19=null;

         result = new Dayblock(); 
        try {
            // ChronosTree.g:451:2: ( ^( DAYBLOCK_T ( DAY )+ ) )
            // ChronosTree.g:451:4: ^( DAYBLOCK_T ( DAY )+ )
            {
            match(input,DAYBLOCK_T,FOLLOW_DAYBLOCK_T_in_dayblock704); 

            match(input, Token.DOWN, null); 
            // ChronosTree.g:451:18: ( DAY )+
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
            	    // ChronosTree.g:451:19: DAY
            	    {
            	    DAY19=(CommonTree)match(input,DAY,FOLLOW_DAY_in_dayblock707); 


            	    			char daychar = ((DAY19!=null?DAY19.getText():null)).charAt(0);
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
    // ChronosTree.g:457:1: argument_expr_list returns [ArrayList<CVal> result] : ( expr )+ ;
    public final ArrayList<CVal> argument_expr_list() throws RecognitionException {
        ArrayList<CVal> result = null;


        ChronosTree.expr_return expr20 =null;


         result = new ArrayList<CVal>(); 
        try {
            // ChronosTree.g:459:2: ( ( expr )+ )
            // ChronosTree.g:459:4: ( expr )+
            {
            // ChronosTree.g:459:4: ( expr )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==AND||LA10_0==DATETIME||LA10_0==DAYBLOCK_T||LA10_0==DOUBLE||LA10_0==EQ||LA10_0==GEQ||LA10_0==ID||LA10_0==INT||(LA10_0 >= LEQ && LA10_0 <= NEQ)||LA10_0==NOT||LA10_0==OR||LA10_0==STRING||LA10_0==TIME||LA10_0==TIMES||(LA10_0 >= 52 && LA10_0 <= 53)||(LA10_0 >= 55 && LA10_0 <= 57)||LA10_0==59||LA10_0==61) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ChronosTree.g:459:5: expr
            	    {
            	    pushFollow(FOLLOW_expr_in_argument_expr_list733);
            	    expr20=expr();

            	    state._fsp--;


            	    result.add((expr20!=null?expr20.result:null));

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
    // ChronosTree.g:461:1: type_specifier : ( INT_T | DOUBLE_T | DAYBLOCK_T | TIME_T | STRING_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T );
    public final ChronosTree.type_specifier_return type_specifier() throws RecognitionException {
        ChronosTree.type_specifier_return retval = new ChronosTree.type_specifier_return();
        retval.start = input.LT(1);


        try {
            // ChronosTree.g:462:2: ( INT_T | DOUBLE_T | DAYBLOCK_T | TIME_T | STRING_T | SCHEDULE_T | COURSE_T | COURSELIST_T | TIMEBLOCK_T | DATETIME_T )
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


 

    public static final BitSet FOLLOW_line_in_program54 = new BitSet(new long[]{0x3BB052566AA69252L});
    public static final BitSet FOLLOW_declarator_in_line63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instantiator_in_line68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_line73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECL_in_declarator84 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_specifier_in_declarator86 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_declarator88 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INST_in_instantiator102 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_60_in_instantiator105 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_instantiator107 = new BitSet(new long[]{0x2BB052564A249010L});
    public static final BitSet FOLLOW_expr_in_instantiator109 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_stmt121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_stmt127 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_stmt131 = new BitSet(new long[]{0x2BB052564A249010L});
    public static final BitSet FOLLOW_expr_in_stmt135 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_selection_stmt_in_stmt143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_stmt_in_stmt148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_stmt_in_stmt153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COND_in_selection_stmt173 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_selection_stmt175 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000000000000007L});
    public static final BitSet FOLLOW_THEN_in_then_stmt200 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_line_in_then_stmt202 = new BitSet(new long[]{0x3BB052566AA69258L});
    public static final BitSet FOLLOW_ELSE_T_in_else_stmt215 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_line_in_else_stmt217 = new BitSet(new long[]{0x3BB052566AA69258L});
    public static final BitSet FOLLOW_FOREACH_T_in_iteration_stmt241 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IN_T_in_iteration_stmt244 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_iteration_stmt248 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ID_in_iteration_stmt252 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_iteration_stmt260 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_line_in_iteration_stmt264 = new BitSet(new long[]{0x3BB052566AA69258L});
    public static final BitSet FOLLOW_BREAK_T_in_jump_stmt278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_expr296 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr300 = new BitSet(new long[]{0x2BB052564A249010L});
    public static final BitSet FOLLOW_expr_in_expr304 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_expr313 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr317 = new BitSet(new long[]{0x2BB052564A249010L});
    public static final BitSet FOLLOW_expr_in_expr321 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expr330 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr334 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQ_in_expr345 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr349 = new BitSet(new long[]{0x2BB052564A249010L});
    public static final BitSet FOLLOW_expr_in_expr353 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEQ_in_expr362 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr366 = new BitSet(new long[]{0x2BB052564A249010L});
    public static final BitSet FOLLOW_expr_in_expr370 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GEQ_in_expr379 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr383 = new BitSet(new long[]{0x2BB052564A249010L});
    public static final BitSet FOLLOW_expr_in_expr387 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LEQ_in_expr396 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr400 = new BitSet(new long[]{0x2BB052564A249010L});
    public static final BitSet FOLLOW_expr_in_expr404 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_59_in_expr413 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr417 = new BitSet(new long[]{0x2BB052564A249010L});
    public static final BitSet FOLLOW_expr_in_expr421 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_61_in_expr430 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr434 = new BitSet(new long[]{0x2BB052564A249010L});
    public static final BitSet FOLLOW_expr_in_expr438 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_53_in_expr451 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr455 = new BitSet(new long[]{0x2BB052564A249010L});
    public static final BitSet FOLLOW_expr_in_expr459 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_55_in_expr468 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr472 = new BitSet(new long[]{0x2BB052564A249010L});
    public static final BitSet FOLLOW_expr_in_expr476 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_52_in_expr485 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr489 = new BitSet(new long[]{0x2BB052564A249010L});
    public static final BitSet FOLLOW_expr_in_expr493 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_57_in_expr502 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr506 = new BitSet(new long[]{0x2BB052564A249010L});
    public static final BitSet FOLLOW_expr_in_expr510 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_56_in_expr523 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr527 = new BitSet(new long[]{0x2BB052564A249010L});
    public static final BitSet FOLLOW_expr_in_expr531 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_datetime_in_expr543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timeblock_in_expr550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dayblock_in_expr557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_expr564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_expr576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_expr583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_expr597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_in_expr604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_function622 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PARAMS_in_function625 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_argument_expr_list_in_function627 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DATETIME_in_datetime648 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_dayblock_in_datetime650 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_timeblock_in_datetime652 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMES_in_timeblock671 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TIME_in_timeblock675 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_TIME_in_timeblock679 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DAYBLOCK_T_in_dayblock704 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DAY_in_dayblock707 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_expr_in_argument_expr_list733 = new BitSet(new long[]{0x2BB052564A249012L});

}