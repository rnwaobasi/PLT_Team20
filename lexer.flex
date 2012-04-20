/* JFlex example */
import java_cup.runtime.*;

%%

%class ChronosLexer
%unicode
%byacc
%line
%column

%{
    /* store a reference to the parser object */
    private Parser yyparser;

    /* constructor taking an additional parser */
    public Yylex(java.io.Reader r, Parser yyparser) {
	this(r);
	this.yyparser = yyparser;
    }

    /* return the current line number */
    public int getLine() {
        return yyline;
    }
%}

/* regular expr here cannot have ^, / or $ */
NUM = [0-9]+ ("." [0-9]+)?
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
//function	{return Parser.FUNCTION_T;}

schedule	{return Parser.SCHEDULE_T;}
course		{return Parser.COURSE_T;}
courselist	{return Parser.COURSELIST_T;}
int		{return Parser.INT_T;}
double		{return Parser.DOUBLE_T;}
time		{return Parser.TIME_T;}
day		{return Parser.DAY_T;}
//print 		{return Parser.PRINT_T;}

/* do we want to create tokens for these symbols or rely on charAt?
need to know especially when there are multiple symbols per token */
"&&"		{return Parser.AND_T;}
"||"		{return Parser.OR_T;}
"!"		{return Parser.NOT_T;}
"<" | ">" | "<=" | ">=" {return Parser.REL_OP;}
"="		{return Parser.ASSIGN_OP;} /* do we want to use this or charAt? */
"!=" | "=="	{return Parser.EQUIV_OP;}

\+ | \- | \* | \/ |
\; | \( | \)		{return (int)yycharat(0);}

[a-zA-Z][a-zA-Z0-9]*	{return Parser.ID;}

{NL}	    {return Parser.NL;}

/* need another number type for integers */

{NUM}	    { yyparser.yylval = new ParserVal(Double.parseDouble(yytext()));
	      return Parser.NUM; }

[ \t]+	    { }

\b	    { System.err.println("Sorry, backspace doesn't work"); }

[^]	    { System.err.println("Error: unexpected character '" + yytext() + "'");
	      return -1; }
