/* JFlex example */
//import java_cup.runtime.*;
import java.lang.*;

%%

%class ChronosLexer
%unicode
%byaccj
%line
%column
%debug

%{
    /* store a reference to the parser object */
    private Parser yyparser;

    /* constructor taking an additional parser */
    public ChronosLexer(java.io.Reader r, Parser yyparser) {
	this(r);
	this.yyparser = yyparser;
    }

    /* return the current line number */
    public int getLine() {
        return yyline;
    }

    public int getCol() {
	return yycolumn;
    }
%}

/* regular expr here cannot have ^, / or $ */
DOUBLE_NUM = [0-9]+ ("." [0-9]+)
INT_NUM = [0-9]+
NL = \n | \r | \r\n

%xstate STRING
%state COMMENT

%%

/* change state when reading comments or strings
   to avoid mistakenly matching a token */
<YYINITIAL>"/*"	    {yybegin(COMMENT);}
<YYINITIAL>"\""	    {yybegin(STRING);}
<COMMENT>"*/"	    {yybegin(YYINITIAL);}
<STRING>"\\\""	    {} /* reading quotes in strings is okay if they are escaped quotes */
<STRING>"\""	    {yybegin(YYINITIAL);}

if	{return Parser.IF_T;}
else	{return Parser.ELSE_T;}
new	{return Parser.NEW_T;}
foreach	{return Parser.FOREACH_T;}
in	{return Parser.IN_T;}
break	{return Parser.BREAK_T;}
//function	{return Parser.FUNCTION_T;} /* where do we use this keyword? */

schedule	{return Parser.SCHEDULE_T;}
course		{return Parser.COURSE_T;}
courselist	{return Parser.COURSELIST_T;}
int		{return Parser.INT_T;}
double		{return Parser.DOUBLE_T;}
time		{return Parser.TIME_T;}
day		{return Parser.DAY_T;}
//print 		{return Parser.PRINT_T;}

"&&"		{return Parser.AND_T;}
"||"		{return Parser.OR_T;}
"!"		{return Parser.NOT_T;}
"<="		{return Parser.LEQ_REL_OP;}
">="		{return Parser.GEQ_REL_OP;}
"!="		{return Parser.NEQ_REL_OP;}
"=="		{return Parser.EQ_REL_OP;}
"="			{return yycharat(0);}

\+ | \- | \* | \/ |
\; | \( | \)		{return (int)yycharat(0);}

[a-zA-Z][a-zA-Z0-9]*	{return Parser.ID;}

{NL}		{ }

/* need mechanism for reading and returning strings */

{DOUBLE_NUM}	{ yyparser.yylval = new ParserVal(Double.parseDouble(yytext()));
		  return Parser.DOUBLE_NUM; }
{INT_NUM}	{ yyparser.yylval = new ParserVal(Integer.parseInt(yytext()));
		  return Parser.INT_NUM; }

[ \t]+	    { }

\b	    { System.err.println("Sorry, backspace doesn't work"); }

[^]	    { System.err.println("Error: unexpected abc character '" + yytext() + "'");
	      return -1; }
