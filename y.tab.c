#ifndef lint
static char yysccsid[] = "@(#)yaccpar	1.8 (Berkeley) 01/20/90";
#endif
#define YYBYACC 1
#line 2 "parser.y"
/*import ChronosLexer.java;*/
import java.io.*;
/*import java.util.*;*/
#line 10 "y.tab.c"
#define IF_T 257
#define ELSE_T 258
#define NEW_T 259
#define FOREACH_T 260
#define IN_T 261
#define BREAK_T 262
#define SCHEDULE_T 263
#define COURSE_T 264
#define COURSELIST_T 265
#define INT_T 266
#define DOUBLE_T 267
#define TIME_T 268
#define DAY_T 269
#define STRING_T 270
#define AND_T 271
#define OR_T 272
#define NOT_T 273
#define LEQ_REL_OP 274
#define GEQ_REL_OP 275
#define NEQ_REL_OP 276
#define EQ_REL_OP 277
#define EQ_T 278
#define ID 279
#define NL 280
#define NUM 281
#define REL_OP 282
#define YYERRCODE 256
short yylhs[] = {                                        -1,
    0,    0,    1,    1,    2,    2,    3,    5,    5,    5,
    8,    8,   10,   10,   11,   11,   11,   11,   12,   12,
   12,   12,   12,   12,    9,    9,   13,   13,   14,   14,
   14,   15,   15,    7,    7,    7,   16,   16,   16,   17,
    4,    4,    4,    4,    4,    6,    6,    6,
};
short yylen[] = {                                         2,
    1,    2,    2,    2,    2,    4,    3,    1,    1,    1,
    3,    1,    3,    1,    1,    2,    3,    1,    3,    3,
    3,    3,    3,    3,    1,    1,    3,    3,    3,    3,
    3,    1,    3,    1,    4,    3,    1,    1,    1,    1,
    1,    1,    1,    1,    1,    1,    1,    1,
};
short yydefred[] = {                                      0,
    0,   46,   47,   48,   41,   42,   43,   44,    0,    1,
    0,    0,    0,   45,    0,    2,    3,    4,    0,    7,
    0,   39,    0,    0,   40,    0,    6,    0,    0,   10,
    0,   14,   18,    0,    0,   34,   37,    0,   16,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   22,   24,   20,   19,   21,   23,
   17,   36,   32,    0,    0,   13,    0,    0,   38,    0,
    0,    0,   35,    0,   33,
};
short yydgoto[] = {                                       9,
   10,   11,   12,   13,   27,   14,   28,   29,   30,   31,
   32,   33,   34,   35,   64,   36,   37,
};
short yysindex[] = {                                   -166,
 -179,    0,    0,    0,    0,    0,    0,    0, -166,    0,
  -31,  -29, -256,    0, -244,    0,    0,    0,   -5,    0,
  -36,    0,  -37,  -54,    0,  -37,    0,   22, -206,    0,
 -200,    0,    0,  -19,   45,    0,    0,  -54,    0, -190,
 -189, -188, -172, -171, -170,  -28,  -40,  -37,  -37,    0,
    0, -259, -259, -259,    0,    0,    0,    0,    0,    0,
    0,    0,    0,   10, -200,    0,   45,   45,    0,   22,
   22,   22,    0,  -36,    0,
};
short yyrindex[] = {                                      0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,   51,    0,
    0,    0,    0,  -25,    0,    0,    0,  -27,   35,    0,
  -34,    0,    0,   36,   37,    0,    0,  -23,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,  -32,    0,   24,   29,    0,   -4,
    5,   16,    0,    0,    0,
};
short yygindex[] = {                                      0,
  102,    0,    0,    0,  -45,  111,   52,   87,    0,   66,
  -18,    0,    0,   -6,    0,    0,    0,
};
#define YYTABLESIZE 249
short yytable[] = {                                      26,
   62,   63,   26,   26,   39,   44,   12,   45,   11,   12,
   22,   11,   61,    8,   38,   15,    8,   15,   15,   69,
   15,   25,   19,   50,   12,   51,   11,   17,   75,   18,
   66,    8,   29,   15,   20,   15,   29,   29,   29,   29,
   29,   30,   29,   67,   68,   30,   30,   30,   30,   30,
   73,   30,   31,   74,   29,   21,   31,   31,   31,   31,
   31,   47,   31,   30,   27,   48,   27,   27,   27,   28,
   49,   28,   28,   28,   31,    9,   25,   26,    9,   25,
   26,   54,   27,    2,    3,    4,   52,   28,   55,   56,
   57,   53,    1,    9,   25,   26,    2,    3,    4,    5,
    6,    7,    8,   70,   71,   72,   58,   59,   60,    5,
   16,   15,   46,   65,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,   40,
   41,   42,   43,    0,    0,    0,    0,    0,    0,   22,
    0,    0,   23,   22,    0,   23,   23,   12,   24,   11,
   25,   38,   24,   48,   25,   15,   15,   15,   15,
};
short yycheck[] = {                                      40,
   41,   47,   40,   40,   23,   60,   41,   62,   41,   44,
  270,   44,   41,   41,   40,   41,   44,   41,   44,  279,
   44,  281,  279,   43,   59,   45,   59,   59,   74,   59,
   49,   59,   37,   59,  279,   59,   41,   42,   43,   44,
   45,   37,   47,   50,   51,   41,   42,   43,   44,   45,
   41,   47,   37,   44,   59,   61,   41,   42,   43,   44,
   45,   40,   47,   59,   41,  272,   43,   44,   45,   41,
  271,   43,   44,   45,   59,   41,   41,   41,   44,   44,
   44,   37,   59,  263,  264,  265,   42,   59,  279,  279,
  279,   47,  259,   59,   59,   59,  263,  264,  265,  266,
  267,  268,  269,   52,   53,   54,  279,  279,  279,   59,
    9,    1,   26,   48,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,  274,
  275,  276,  277,   -1,   -1,   -1,   -1,   -1,   -1,  270,
   -1,   -1,  273,  270,   -1,  273,  273,  272,  279,  272,
  281,  279,  279,  272,  281,  271,  272,  271,  272,
};
#define YYFINAL 9
#ifndef YYDEBUG
#define YYDEBUG 0
#endif
#define YYMAXTOKEN 282
#if YYDEBUG
char *yyname[] = {
"end-of-file",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,"'%'",0,0,"'('","')'","'*'","'+'","','","'-'",0,"'/'",0,0,0,0,0,0,0,0,0,0,
0,"';'","'<'","'='","'>'",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,"IF_T","ELSE_T","NEW_T","FOREACH_T","IN_T","BREAK_T","SCHEDULE_T",
"COURSE_T","COURSELIST_T","INT_T","DOUBLE_T","TIME_T","DAY_T","STRING_T",
"AND_T","OR_T","NOT_T","LEQ_REL_OP","GEQ_REL_OP","NEQ_REL_OP","EQ_REL_OP",
"EQ_T","ID","NL","NUM","REL_OP",
};
char *yyrule[] = {
"$accept : declarator_list",
"declarator_list : declarator",
"declarator_list : declarator_list declarator",
"declarator : primitive_declarator ';'",
"declarator : derived_type_declarator ';'",
"primitive_declarator : type_specifier ID",
"primitive_declarator : type_specifier ID '=' assignment_expression",
"derived_type_declarator : NEW_T derived_type_specifier ID",
"assignment_expression : postfix_expression",
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
#endif
#ifndef YYSTYPE
typedef int YYSTYPE;
#endif
#define yyclearin (yychar=(-1))
#define yyerrok (yyerrflag=0)
#ifdef YYSTACKSIZE
#ifndef YYMAXDEPTH
#define YYMAXDEPTH YYSTACKSIZE
#endif
#else
#ifdef YYMAXDEPTH
#define YYSTACKSIZE YYMAXDEPTH
#else
#define YYSTACKSIZE 500
#define YYMAXDEPTH 500
#endif
#endif
int yydebug;
int yynerrs;
int yyerrflag;
int yychar;
short *yyssp;
YYSTYPE *yyvsp;
YYSTYPE yyval;
YYSTYPE yylval;
short yyss[YYSTACKSIZE];
YYSTYPE yyvs[YYSTACKSIZE];
#define yystacksize YYSTACKSIZE
#line 266 "parser.y"

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
#line 279 "y.tab.c"
#define YYABORT goto yyabort
#define YYACCEPT goto yyaccept
#define YYERROR goto yyerrlab
int
yyparse()
{
    register int yym, yyn, yystate;
#if YYDEBUG
    register char *yys;
    extern char *getenv();

    if (yys = getenv("YYDEBUG"))
    {
        yyn = *yys;
        if (yyn >= '0' && yyn <= '9')
            yydebug = yyn - '0';
    }
#endif

    yynerrs = 0;
    yyerrflag = 0;
    yychar = (-1);

    yyssp = yyss;
    yyvsp = yyvs;
    *yyssp = yystate = 0;

yyloop:
    if (yyn = yydefred[yystate]) goto yyreduce;
    if (yychar < 0)
    {
        if ((yychar = yylex()) < 0) yychar = 0;
#if YYDEBUG
        if (yydebug)
        {
            yys = 0;
            if (yychar <= YYMAXTOKEN) yys = yyname[yychar];
            if (!yys) yys = "illegal-symbol";
            printf("yydebug: state %d, reading %d (%s)\n", yystate,
                    yychar, yys);
        }
#endif
    }
    if ((yyn = yysindex[yystate]) && (yyn += yychar) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
    {
#if YYDEBUG
        if (yydebug)
            printf("yydebug: state %d, shifting to state %d (%s)\n",
                    yystate, yytable[yyn],yyrule[yyn]);
#endif
        if (yyssp >= yyss + yystacksize - 1)
        {
            goto yyoverflow;
        }
        *++yyssp = yystate = yytable[yyn];
        *++yyvsp = yylval;
        yychar = (-1);
        if (yyerrflag > 0)  --yyerrflag;
        goto yyloop;
    }
    if ((yyn = yyrindex[yystate]) && (yyn += yychar) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
    {
        yyn = yytable[yyn];
        goto yyreduce;
    }
    if (yyerrflag) goto yyinrecovery;
#ifdef lint
    goto yynewerror;
#endif
yynewerror:
    yyerror("syntax error");
#ifdef lint
    goto yyerrlab;
#endif
yyerrlab:
    ++yynerrs;
yyinrecovery:
    if (yyerrflag < 3)
    {
        yyerrflag = 3;
        for (;;)
        {
            if ((yyn = yysindex[*yyssp]) && (yyn += YYERRCODE) >= 0 &&
                    yyn <= YYTABLESIZE && yycheck[yyn] == YYERRCODE)
            {
#if YYDEBUG
                if (yydebug)
                    printf("yydebug: state %d, error recovery shifting\
 to state %d\n", *yyssp, yytable[yyn]);
#endif
                if (yyssp >= yyss + yystacksize - 1)
                {
                    goto yyoverflow;
                }
                *++yyssp = yystate = yytable[yyn];
                *++yyvsp = yylval;
                goto yyloop;
            }
            else
            {
#if YYDEBUG
                if (yydebug)
                    printf("yydebug: error recovery discarding state %d\n",
                            *yyssp);
#endif
                if (yyssp <= yyss) goto yyabort;
                --yyssp;
                --yyvsp;
            }
        }
    }
    else
    {
        if (yychar == 0) goto yyabort;
#if YYDEBUG
        if (yydebug)
        {
            yys = 0;
            if (yychar <= YYMAXTOKEN) yys = yyname[yychar];
            if (!yys) yys = "illegal-symbol";
            printf("yydebug: state %d, error recovery discards token %d (%s)\n",
                    yystate, yychar, yys);
        }
#endif
        yychar = (-1);
        goto yyloop;
    }
yyreduce:
#if YYDEBUG
    if (yydebug)
        printf("yydebug: state %d, reducing by rule %d (%s)\n",
                yystate, yyn, yyrule[yyn]);
#endif
    yym = yylen[yyn];
    yyval = yyvsp[1-yym];
    switch (yyn)
    {
    }
    yyssp -= yym;
    yystate = *yyssp;
    yyvsp -= yym;
    yym = yylhs[yyn];
    if (yystate == 0 && yym == 0)
    {
#if YYDEBUG
        if (yydebug)
            printf("yydebug: after reduction, shifting from state 0 to\
 state %d\n", YYFINAL);
#endif
        yystate = YYFINAL;
        *++yyssp = YYFINAL;
        *++yyvsp = yyval;
        if (yychar < 0)
        {
            if ((yychar = yylex()) < 0) yychar = 0;
#if YYDEBUG
            if (yydebug)
            {
                yys = 0;
                if (yychar <= YYMAXTOKEN) yys = yyname[yychar];
                if (!yys) yys = "illegal-symbol";
                printf("yydebug: state %d, reading %d (%s)\n",
                        YYFINAL, yychar, yys);
            }
#endif
        }
        if (yychar == 0) goto yyaccept;
        goto yyloop;
    }
    if ((yyn = yygindex[yym]) && (yyn += yystate) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yystate)
        yystate = yytable[yyn];
    else
        yystate = yydgoto[yym];
#if YYDEBUG
    if (yydebug)
        printf("yydebug: after reduction, shifting from state %d \
to state %d\n", *yyssp, yystate);
#endif
    if (yyssp >= yyss + yystacksize - 1)
    {
        goto yyoverflow;
    }
    *++yyssp = yystate;
    *++yyvsp = yyval;
    goto yyloop;
yyoverflow:
    yyerror("yacc stack overflow");
yyabort:
    return (1);
yyaccept:
    return (0);
}
