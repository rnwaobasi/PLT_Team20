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

    public Yylex(java.io.Reader r, parser yyparser) {
	this(r);
	this.yyparser = yyparser;
    }
%}

/* regular expr here cannot have ^, / or $ */
NUM = [0-9]+ ("." [0-9]+)?
NL = \n | \r | \r\n
ID = [:jletter:] [:jletterdigit:]*

%state STRING

%%

"+" | "-" | "*" | "/" |
"^" | "(" | ")"		    { return (int)yycharat(0); }

{NL}	    { return Parser.NL; }

{NUM}	    { yyparser.yylval = new ParserVal(Double.parseDouble(yytext()));
	      return parser.NUM; }

[ \t]+	    { }

\b	    { System.err.println("Sorry, backspace doesn't work"); }

[^]	    { System.err.println("Error: unexpected character '" + yytext() + "'");
	      return -1; }
