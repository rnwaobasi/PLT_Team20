//### This file created by BYACC 1.8(/Java extension  1.15)
//### Java capabilities added 7 Jan 97, Bob Jamison
//### Updated : 27 Nov 97  -- Bob Jamison, Joe Nieten
//###           01 Jan 98  -- Bob Jamison -- fixed generic semantic constructor
//###           01 Jun 99  -- Bob Jamison -- added Runnable support
//###           06 Aug 00  -- Bob Jamison -- made state variables class-global
//###           03 Jan 01  -- Bob Jamison -- improved flags, tracing
//###           16 May 01  -- Bob Jamison -- added custom stack sizing
//###           04 Mar 02  -- Yuval Oren  -- improved java performance, added options
//###           14 Mar 02  -- Tomas Hurka -- -d support, static initializer workaround
//### Please send bug reports to tom@hukatronic.cz
//### static char yysccsid[] = "@(#)yaccpar	1.8 (Berkeley) 01/20/90";






//#line 2 "/Users/shannonlee/PLT_Team20/parser.y"
/*import ChronosLexer.java;*/
import java.io.*;
/*import java.util.*;*/
//#line 21 "Parser.java"




public class Parser
{

boolean yydebug;        //do I want debug output?
int yynerrs;            //number of errors so far
int yyerrflag;          //was there an error?
int yychar;             //the current working character

//########## MESSAGES ##########
//###############################################################
// method: debug
//###############################################################
void debug(String msg)
{
  if (yydebug)
    System.out.println(msg);
}

//########## STATE STACK ##########
final static int YYSTACKSIZE = 500;  //maximum stack size
int statestk[] = new int[YYSTACKSIZE]; //state stack
int stateptr;
int stateptrmax;                     //highest index of stackptr
int statemax;                        //state when highest index reached
//###############################################################
// methods: state stack push,pop,drop,peek
//###############################################################
final void state_push(int state)
{
  try {
		stateptr++;
		statestk[stateptr]=state;
	 }
	 catch (ArrayIndexOutOfBoundsException e) {
     int oldsize = statestk.length;
     int newsize = oldsize * 2;
     int[] newstack = new int[newsize];
     System.arraycopy(statestk,0,newstack,0,oldsize);
     statestk = newstack;
     statestk[stateptr]=state;
  }
}
final int state_pop()
{
  return statestk[stateptr--];
}
final void state_drop(int cnt)
{
  stateptr -= cnt; 
}
final int state_peek(int relative)
{
  return statestk[stateptr-relative];
}
//###############################################################
// method: init_stacks : allocate and prepare stacks
//###############################################################
final boolean init_stacks()
{
  stateptr = -1;
  val_init();
  return true;
}
//###############################################################
// method: dump_stacks : show n levels of the stacks
//###############################################################
void dump_stacks(int count)
{
int i;
  System.out.println("=index==state====value=     s:"+stateptr+"  v:"+valptr);
  for (i=0;i<count;i++)
    System.out.println(" "+i+"    "+statestk[i]+"      "+valstk[i]);
  System.out.println("======================");
}


//########## SEMANTIC VALUES ##########
//public class ParserVal is defined in ParserVal.java


String   yytext;//user variable to return contextual strings
ParserVal yyval; //used to return semantic vals from action routines
ParserVal yylval;//the 'lval' (result) I got from yylex()
ParserVal valstk[];
int valptr;
//###############################################################
// methods: value stack push,pop,drop,peek.
//###############################################################
void val_init()
{
  valstk=new ParserVal[YYSTACKSIZE];
  yyval=new ParserVal();
  yylval=new ParserVal();
  valptr=-1;
}
void val_push(ParserVal val)
{
  if (valptr>=YYSTACKSIZE)
    return;
  valstk[++valptr]=val;
}
ParserVal val_pop()
{
  if (valptr<0)
    return new ParserVal();
  return valstk[valptr--];
}
void val_drop(int cnt)
{
int ptr;
  ptr=valptr-cnt;
  if (ptr<0)
    return;
  valptr = ptr;
}
ParserVal val_peek(int relative)
{
int ptr;
  ptr=valptr-relative;
  if (ptr<0)
    return new ParserVal();
  return valstk[ptr];
}
final ParserVal dup_yyval(ParserVal val)
{
  ParserVal dup = new ParserVal();
  dup.ival = val.ival;
  dup.dval = val.dval;
  dup.sval = val.sval;
  dup.obj = val.obj;
  return dup;
}
//#### end semantic value section ####
public final static short IF_T=257;
public final static short ELSE_T=258;
public final static short NEW_T=259;
public final static short FOREACH_T=260;
public final static short IN_T=261;
public final static short BREAK_T=262;
public final static short SCHEDULE_T=263;
public final static short COURSE_T=264;
public final static short COURSELIST_T=265;
public final static short INT_T=266;
public final static short DOUBLE_T=267;
public final static short TIME_T=268;
public final static short DAY_T=269;
public final static short STRING_T=270;
public final static short AND_T=271;
public final static short OR_T=272;
public final static short NOT_T=273;
public final static short LEQ_REL_OP=274;
public final static short GEQ_REL_OP=275;
public final static short NEQ_REL_OP=276;
public final static short EQ_REL_OP=277;
public final static short EQ_T=278;
public final static short ID=279;
public final static short NL=280;
public final static short NUM=281;
public final static short REL_OP=282;
public final static short YYERRCODE=256;
final static short yylhs[] = {                           -1,
    0,    0,    1,    1,    2,    2,    3,    5,    5,    7,
    7,    9,    9,   10,   10,   10,   10,   11,   11,   11,
   11,   11,   11,    8,    8,   12,   12,   13,   13,   13,
   15,   15,   14,   14,   14,   16,   16,   16,   17,    4,
    4,    4,    4,    4,    6,    6,    6,
};
final static short yylen[] = {                            2,
    1,    2,    3,    3,    2,    4,    3,    1,    1,    3,
    1,    3,    1,    1,    2,    3,    1,    3,    3,    3,
    3,    3,    3,    1,    1,    3,    3,    3,    3,    3,
    1,    3,    1,    4,    3,    1,    1,    1,    1,    1,
    1,    1,    1,    1,    1,    1,    1,
};
final static short yydefred[] = {                         0,
    0,   45,   46,   47,   40,   41,   42,   43,    0,    1,
    0,    0,    0,   44,    0,    2,    0,    0,    0,    7,
    3,    4,    0,    0,    0,    0,    6,    0,    9,    0,
   13,   17,    0,    0,   15,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,   21,
   23,   19,   18,   20,   22,   16,    0,   12,    0,    0,
   38,   37,   39,    0,   33,   36,    0,    0,    0,   35,
   31,    0,   34,    0,   32,
};
final static short yydgoto[] = {                          9,
   10,   11,   12,   13,   27,   14,   28,   29,   30,   31,
   32,   33,   34,   64,   72,   65,   66,
};
final static short yysindex[] = {                      -183,
 -194,    0,    0,    0,    0,    0,    0,    0, -183,    0,
  -55,  -22, -228,    0, -201,    0, -191, -189,   32,    0,
    0,    0,  -38,  -38,  -57,  -38,    0, -193,    0, -177,
    0,    0,   45,   50,    0, -184, -181, -180, -179, -178,
 -176,  -29,  -38,  -38,    0,    0, -207, -207, -207,    0,
    0,    0,    0,    0,    0,    0, -177,    0,   50,   50,
    0,    0,    0,   56,    0,    0,   56,   56,  -40,    0,
    0,   23,    0,  -38,    0,
};
final static short yyrindex[] = {                         0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,   43,    0,
    0,    0,    0,    0,  -35,    0,    0,   14,    0,  -34,
    0,    0,   16,   18,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  -30,    0,   -3,    9,
    0,    0,    0,  -24,    0,    0,  -11,    2,    0,    0,
    0,    0,    0,    0,    0,
};
final static short yygindex[] = {                         0,
   95,    0,    0,    0,  -47,  104,   80,    0,   64,  -16,
    0,    0,   20,  -33,    0,    0,    0,
};
final static int YYTABLESIZE=243;
static short yytable[];
static { yytable();}
static void yytable(){
yytable = new short[]{                         26,
   70,   26,   40,   17,   41,   14,   11,   35,   14,   11,
   10,   56,   28,   10,   67,   68,   28,   28,   28,   28,
   28,   71,   28,   14,   11,   29,   75,   58,   10,   29,
   29,   29,   29,   29,   28,   29,   18,   26,   30,   26,
   26,   26,   30,   30,   30,   30,   30,   29,   30,   27,
   19,   27,   27,   27,    8,   26,   24,    8,   25,   24,
   30,   25,   61,   73,   59,   60,   74,   27,    2,    3,
    4,   62,    8,   63,   24,    1,   25,   20,   43,    2,
    3,    4,    5,    6,    7,    8,   49,   45,   21,   46,
   22,   47,   23,   44,   50,   69,   48,   51,   52,   53,
   54,    5,   55,   16,   15,   42,   57,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,   36,   37,   38,   39,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,   24,    0,   24,   14,   14,   11,   25,    0,
   25,   10,   43,
};
}
static short yycheck[];
static { yycheck(); }
static void yycheck() {
yycheck = new short[] {                         40,
   41,   40,   60,   59,   62,   41,   41,   24,   44,   44,
   41,   41,   37,   44,   48,   49,   41,   42,   43,   44,
   45,   69,   47,   59,   59,   37,   74,   44,   59,   41,
   42,   43,   44,   45,   59,   47,   59,   41,   37,   43,
   44,   45,   41,   42,   43,   44,   45,   59,   47,   41,
  279,   43,   44,   45,   41,   59,   41,   44,   41,   44,
   59,   44,  270,   41,   45,   46,   44,   59,  263,  264,
  265,  279,   59,  281,   59,  259,   59,  279,  272,  263,
  264,  265,  266,  267,  268,  269,   37,   43,  280,   45,
  280,   42,   61,  271,  279,   40,   47,  279,  279,  279,
  279,   59,  279,    9,    1,   26,   43,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,  274,  275,  276,  277,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,  273,   -1,  273,  271,  272,  272,  279,   -1,
  279,  272,  272,
};
}
final static short YYFINAL=9;
final static short YYMAXTOKEN=282;
final static String yyname[] = {
"end-of-file",null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,"'%'",null,null,"'('","')'","'*'","'+'",
"','","'-'",null,"'/'",null,null,null,null,null,null,null,null,null,null,null,
"';'","'<'","'='","'>'",null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,"IF_T","ELSE_T","NEW_T","FOREACH_T","IN_T",
"BREAK_T","SCHEDULE_T","COURSE_T","COURSELIST_T","INT_T","DOUBLE_T","TIME_T",
"DAY_T","STRING_T","AND_T","OR_T","NOT_T","LEQ_REL_OP","GEQ_REL_OP",
"NEQ_REL_OP","EQ_REL_OP","EQ_T","ID","NL","NUM","REL_OP",
};
final static String yyrule[] = {
"$accept : declarator_list",
"declarator_list : declarator",
"declarator_list : declarator_list declarator",
"declarator : primitive_declarator ';' NL",
"declarator : derived_type_declarator ';' NL",
"primitive_declarator : type_specifier ID",
"primitive_declarator : type_specifier ID '=' assignment_expression",
"derived_type_declarator : NEW_T derived_type_specifier ID",
"assignment_expression : boolean_expression",
"assignment_expression : arithmetic_expression",
"boolean_expression : boolean_expression OR_T boolean_term",
"boolean_expression : boolean_term",
"boolean_term : boolean_term AND_T boolean_factor",
"boolean_term : boolean_factor",
"boolean_factor : ID",
"boolean_factor : NOT_T boolean_factor",
"boolean_factor : '(' boolean_expression ')'",
"boolean_factor : relational_expression",
"relational_expression : ID EQ_REL_OP ID",
"relational_expression : ID NEQ_REL_OP ID",
"relational_expression : ID '<' ID",
"relational_expression : ID LEQ_REL_OP ID",
"relational_expression : ID '>' ID",
"relational_expression : ID GEQ_REL_OP ID",
"arithmetic_expression : additive_expression",
"arithmetic_expression : multiplicative_expression",
"additive_expression : additive_expression '+' multiplicative_expression",
"additive_expression : additive_expression '-' multiplicative_expression",
"multiplicative_expression : multiplicative_expression '*' postfix_expression",
"multiplicative_expression : multiplicative_expression '/' postfix_expression",
"multiplicative_expression : multiplicative_expression '%' postfix_expression",
"argument_expression_list : assignment_expression",
"argument_expression_list : argument_expression_list ',' assignment_expression",
"postfix_expression : primary_expression",
"postfix_expression : postfix_expression '(' argument_expression_list ')'",
"postfix_expression : postfix_expression '(' ')'",
"primary_expression : constant",
"primary_expression : ID",
"primary_expression : STRING_T",
"constant : NUM",
"type_specifier : INT_T",
"type_specifier : DOUBLE_T",
"type_specifier : TIME_T",
"type_specifier : DAY_T",
"type_specifier : derived_type_specifier",
"derived_type_specifier : SCHEDULE_T",
"derived_type_specifier : COURSE_T",
"derived_type_specifier : COURSELIST_T",
};

//#line 272 "/Users/shannonlee/PLT_Team20/parser.y"

/* reference to lexer object */
//private Scanner lexer;
ChronosLexer lexer;
BufferedReader inputStream;

/* interface to lexer */
private int yylex() {
	int retVal = -1;
	try {
		retVal = lexer.yylex();
	} catch (IOException e) {
		System.err.println("IO Error:" + e);
	}
	return retVal;
}

/* error reporting */
public void yyerror(String error) {
	System.err.println("Error at line " + lexer.getLine() + ": " + error);
	System.err.println("String rejected");
}

/* constructor taking in file input */
public Parser(Reader r) {
	//lexer = new Scanner (r, this);
	//inputStream = new BufferedReader (r);
	lexer = new ChronosLexer(r, this);
}

public static void main(String[] args) throws IOException {
	Parser yyparser = new Parser(new FileReader(args[0]));
	yyparser.yyparse();
}

/*
String ins;
StringTokenizer st;

void yyerror(String s){
	System.out.println("par:"+s);
}

boolean newline;
int yylex(){
	String s;
	int tok;
	Double d;
	System.out.print("yylex ");
	if (!st.hasMoreTokens())
		if (!newline){
			newline = true;
			return '\n';
		} else return 0;
	s = st.nextToken();
	System.out.println("tok:"+s);
	try {
		d = Double.valueOf(s);
		yylval = new ParserVal(d.doubleValue());
		tok = NUM;
	}
	catch (Exception e) {
		tok = s.charAt(0);
	}
	return tok;
}



/* using Lex to produce yylex() */
/*
int main (void) {
	return yyparse();
}

int yyerror (char *msg) {
	return fprintf(stderr, "YACC: %s\n", msg);
}
*/
//#line 387 "Parser.java"
//###############################################################
// method: yylexdebug : check lexer state
//###############################################################
void yylexdebug(int state,int ch)
{
String s=null;
  if (ch < 0) ch=0;
  if (ch <= YYMAXTOKEN) //check index bounds
     s = yyname[ch];    //now get it
  if (s==null)
    s = "illegal-symbol";
  debug("state "+state+", reading "+ch+" ("+s+")");
}





//The following are now global, to aid in error reporting
int yyn;       //next next thing to do
int yym;       //
int yystate;   //current parsing state from state table
String yys;    //current token string


//###############################################################
// method: yyparse : parse input and execute indicated items
//###############################################################
int yyparse()
{
boolean doaction;
  init_stacks();
  yynerrs = 0;
  yyerrflag = 0;
  yychar = -1;          //impossible char forces a read
  yystate=0;            //initial state
  state_push(yystate);  //save it
  val_push(yylval);     //save empty value
  while (true) //until parsing is done, either correctly, or w/error
    {
    doaction=true;
    if (yydebug) debug("loop"); 
    //#### NEXT ACTION (from reduction table)
    for (yyn=yydefred[yystate];yyn==0;yyn=yydefred[yystate])
      {
      if (yydebug) debug("yyn:"+yyn+"  state:"+yystate+"  yychar:"+yychar);
      if (yychar < 0)      //we want a char?
        {
        yychar = yylex();  //get next token
        if (yydebug) debug(" next yychar:"+yychar);
        //#### ERROR CHECK ####
        if (yychar < 0)    //it it didn't work/error
          {
          yychar = 0;      //change it to default string (no -1!)
          if (yydebug)
            yylexdebug(yystate,yychar);
          }
        }//yychar<0
      yyn = yysindex[yystate];  //get amount to shift by (shift index)
      if ((yyn != 0) && (yyn += yychar) >= 0 &&
          yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
        {
        if (yydebug)
          debug("state "+yystate+", shifting to state "+yytable[yyn]);
        //#### NEXT STATE ####
        yystate = yytable[yyn];//we are in a new state
        state_push(yystate);   //save it
        val_push(yylval);      //push our lval as the input for next rule
        yychar = -1;           //since we have 'eaten' a token, say we need another
        if (yyerrflag > 0)     //have we recovered an error?
           --yyerrflag;        //give ourselves credit
        doaction=false;        //but don't process yet
        break;   //quit the yyn=0 loop
        }

    yyn = yyrindex[yystate];  //reduce
    if ((yyn !=0 ) && (yyn += yychar) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
      {   //we reduced!
      if (yydebug) debug("reduce");
      yyn = yytable[yyn];
      doaction=true; //get ready to execute
      break;         //drop down to actions
      }
    else //ERROR RECOVERY
      {
      if (yyerrflag==0)
        {
        yyerror("syntax error");
        yynerrs++;
        }
      if (yyerrflag < 3) //low error count?
        {
        yyerrflag = 3;
        while (true)   //do until break
          {
          if (stateptr<0)   //check for under & overflow here
            {
            yyerror("stack underflow. aborting...");  //note lower case 's'
            return 1;
            }
          yyn = yysindex[state_peek(0)];
          if ((yyn != 0) && (yyn += YYERRCODE) >= 0 &&
                    yyn <= YYTABLESIZE && yycheck[yyn] == YYERRCODE)
            {
            if (yydebug)
              debug("state "+state_peek(0)+", error recovery shifting to state "+yytable[yyn]+" ");
            yystate = yytable[yyn];
            state_push(yystate);
            val_push(yylval);
            doaction=false;
            break;
            }
          else
            {
            if (yydebug)
              debug("error recovery discarding state "+state_peek(0)+" ");
            if (stateptr<0)   //check for under & overflow here
              {
              yyerror("Stack underflow. aborting...");  //capital 'S'
              return 1;
              }
            state_pop();
            val_pop();
            }
          }
        }
      else            //discard this token
        {
        if (yychar == 0)
          return 1; //yyabort
        if (yydebug)
          {
          yys = null;
          if (yychar <= YYMAXTOKEN) yys = yyname[yychar];
          if (yys == null) yys = "illegal-symbol";
          debug("state "+yystate+", error recovery discards token "+yychar+" ("+yys+")");
          }
        yychar = -1;  //read another
        }
      }//end error recovery
    }//yyn=0 loop
    if (!doaction)   //any reason not to proceed?
      continue;      //skip action
    yym = yylen[yyn];          //get count of terminals on rhs
    if (yydebug)
      debug("state "+yystate+", reducing "+yym+" by rule "+yyn+" ("+yyrule[yyn]+")");
    if (yym>0)                 //if count of rhs not 'nil'
      yyval = val_peek(yym-1); //get current semantic value
    yyval = dup_yyval(yyval); //duplicate yyval if ParserVal is used as semantic value
    switch(yyn)
      {
//########## USER-SUPPLIED ACTIONS ##########
//########## END OF USER-SUPPLIED ACTIONS ##########
    }//switch
    //#### Now let's reduce... ####
    if (yydebug) debug("reduce");
    state_drop(yym);             //we just reduced yylen states
    yystate = state_peek(0);     //get new state
    val_drop(yym);               //corresponding value drop
    yym = yylhs[yyn];            //select next TERMINAL(on lhs)
    if (yystate == 0 && yym == 0)//done? 'rest' state and at first TERMINAL
      {
      if (yydebug) debug("After reduction, shifting from state 0 to state "+YYFINAL+"");
      yystate = YYFINAL;         //explicitly say we're done
      state_push(YYFINAL);       //and save it
      val_push(yyval);           //also save the semantic value of parsing
      if (yychar < 0)            //we want another character?
        {
        yychar = yylex();        //get next character
        if (yychar<0) yychar=0;  //clean, if necessary
        if (yydebug)
          yylexdebug(yystate,yychar);
        }
      if (yychar == 0)          //Good exit (if lex returns 0 ;-)
         break;                 //quit the loop--all DONE
      }//if yystate
    else                        //else not done yet
      {                         //get next state and push, for next yydefred[]
      yyn = yygindex[yym];      //find out where to go
      if ((yyn != 0) && (yyn += yystate) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yystate)
        yystate = yytable[yyn]; //get new state
      else
        yystate = yydgoto[yym]; //else go to new defred
      if (yydebug) debug("after reduction, shifting from state "+state_peek(0)+" to state "+yystate+"");
      state_push(yystate);     //going again, so push state & val...
      val_push(yyval);         //for next action
      }
    }//main loop
  return 0;//yyaccept!!
}
//## end of method parse() ######################################



//## run() --- for Thread #######################################
/**
 * A default run method, used for operating this parser
 * object in the background.  It is intended for extending Thread
 * or implementing Runnable.  Turn off with -Jnorun .
 */
public void run()
{
  yyparse();
}
//## end of method run() ########################################



//## Constructors ###############################################
/**
 * Default constructor.  Turn off with -Jnoconstruct .

 */
public Parser()
{
  //nothing to do
}


/**
 * Create a parser, setting the debug to true or false.
 * @param debugMe true for debugging, false for no debug.
 */
public Parser(boolean debugMe)
{
  yydebug=debugMe;
}
//###############################################################



}
//################### END OF CLASS ##############################
