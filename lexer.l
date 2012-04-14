%{
    /* C declarations and includes */
    #include <string.h>
    #include <y.tab.h>
    extern YYSTYPE yylval;
    int count = 0;
    int count2 = 0;
    
%}

/* Lex macro definitions and directives */

delim   [ \t\n]
ws      {delim}+
letter  [A-Za-z]
digit   [0-9]
id      {letter}({letter}|{digit})*
number  {digit}+(\.{digit}+)

%%

// /* Lex spec in the form of pattern/action statements */

{ws}        {/* eat whitespace */}
if	    {
	    return(IF);
	    printf("if");
	    }
else	    {
	    return(ELSE);
	    printf("else");
	    }
{id}        {
	    yylval = (int)installID();
	    return(ID);
	    }
{number}    { /* yylval.number for using %union in the yacc file */
	    yylval.number = (int)installNum();
	    return(NUMBER);
	    }
.	    { /* matches all single otherwise unmatched chars */
	    return (int) yytext[0];
	    }

%%

/* C Program */

/* 
** yylval = more information about lexeme?
** yytext = ptr to beginning of lexeme
** yyleng = length of lexeme found
*/

int installID() {
    return count++;
}

int installNum(){
    return count2++;
}

yylex();
return 0;
