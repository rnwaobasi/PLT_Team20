/* JFlex example */
import java_cup.runtime.*;

%%

%class ChronosLexer
%unicode
%byaccj
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

%state STRING

%%

if	{return Parser.IF_T;}
else	{return Parser.ELSE_T;}
new	{return Parser.NEW_T;}
foreach	{return Parser.FOREACH_T;}
in	{return Parser.IN_T;}

schedule	{return Parser.SCHEDULE_T;}
course		{return Parser.COURSE_T;}
courselist	{return Parser.COURSELIST_T;}
int		{return Parser.INT_T;}
double		{return Parser.DOUBLE_T;}
time		{return Parser.TIME_T;}
day		{return Parser.DAY_T;}

"&&"		{return Parser.AND_T;}
"||"		{return Parser.OR_T;}
"!"		{return Parser.NOT_T;}
"<" | ">" |
"<=" | ">=" 	{return Parser.REL_OP;}
"="		{return Parser.ASSIGN_OP;}
"!="
"=="

\+ | \- | \* | \/ |
\; | \( | \)		{return (int)yycharat(0);}

[a-zA-Z][a-zA-Z0-9]*	{return Parser.ID;}

{NL}	    {return Parser.NL;}

{NUM}	    { yyparser.yylval = new ParserVal(Double.parseDouble(yytext()));
	      return Parser.NUM; }

[ \t]+	    { }

\b	    { System.err.println("Sorry, backspace doesn't work"); }

[^]	    { System.err.println("Error: unexpected character '" + yytext() + "'");
	      return -1; }
