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
schedule	{return Parser.SCHEDULE_T;}
course		{return Parser.COURSE_T;}
course list	{return Parser.COURSELIST_T;}
int 		{return Parser.INT_T;}
double 		{return Parser.DOUBLE_T;}
print 		{return Parser.PRINT_T;}
day		{return Parser.DAY_T;}
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

{IDENTIFIER}	{return Parser.ID; }

{NL}	    	{ return Parser.NL; }

{NUM}	    	{ yyparser.yylval = new ParserVal(Double.parseDouble(yytext()));
	      	return parser.NUM; }

[ \t]+	    	{ }

\b	    	{ System.err.println("Sorry, backspace doesn't work"); }

[^]	    	{ System.err.println("Error: unexpected character '" + yytext() + "'");
	      	return -1; }
