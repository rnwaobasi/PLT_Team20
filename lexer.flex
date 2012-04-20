/* JFlex example */
import java_cup.runtime.*;

%%

%class sio2lexer
%unicode
%byaccj
%char
%line
%column

%{
    private parser yyparser;
/* test comment */
    public Yylex(java.io.Reader r, parser yyparser) {
	this(r);
	this.yyparser = yyparser;
    }
%}

?*pattern definitions */
/* regular expr here cannot have ^, / or $ */
<<<<<<< HEAD
NUM 		= [0-9]+ ("." [0-9]+)?
NL 		= \n | \r | \r\n
IDENTIFIER 	= [:jletter:] [:jletterdigit:]*
COMMENT		= "/*" [^*] ~"*/" | "/*" "*"+ "/"

%%

"+" | 
"-" | 
"*" | 
"/" |
"^" | 
"(" | 
")" |		    { return (int)yycharat(0); }

if		{return Parser.IF_T;}
else		{return Parser.ELSE_T;}
new     	{return Parser.NEW_T;}
end		{return Parser.END_T;}
function	{return Parser.FUNCTION_T;}
"for each" 	{return Parser.FOREACH_T;}
break 		{return Parser.BREAK_T;}
=======
NUM = [0-9]+ ("." [0-9]+)?
NL = \n | \r | \r\n

%state STRING
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

>>>>>>> added states for strings and comments in lexer + update to grammar
schedule	{return Parser.SCHEDULE_T;}
course		{return Parser.COURSE_T;}
course list	{return Parser.COURSELIST_T;}
int 		{return Parser.INT_T;}
double 		{return Parser.DOUBLE_T;}
print 		{return Parser.PRINT_T;}
day		{return Parser.DAY_T;}
<<<<<<< HEAD
string		{return Parser.STRING_T;}
constant 	{return Parser.CONSTANT_T;}
"!"		{return Parser.NOT_T;}
"&&"		{return Parser.AND_T;}
"="		{return Parser.ASSIGN_OP; }
"="  |
"<=  |
"<=" |
"<"  |
">"  |		{return Parser.REL_OP; }
=======

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
>>>>>>> added states for strings and comments in lexer + update to grammar

{IDENTIFIER}	{return Parser.ID; }

{NL}	    	{ return Parser.NL; }

<<<<<<< HEAD
{NUM}	    	{ yyparser.yylval = new ParserVal(Double.parseDouble(yytext()));
	      	return parser.NUM; }
=======
/* need another number type for integers */

{NUM}	    { yyparser.yylval = new ParserVal(Double.parseDouble(yytext()));
	      return Parser.NUM; }
>>>>>>> added states for strings and comments in lexer + update to grammar

[ \t]+	    	{ }

\b	    	{ System.err.println("Sorry, backspace doesn't work"); }

[^]	    	{ System.err.println("Error: unexpected character '" + yytext() + "'");
	      	return -1; }
