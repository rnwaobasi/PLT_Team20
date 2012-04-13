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

{ws}        {/* no action and no return */}
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
{number}    {
	    yylval = (int)installNum()
	    return(NUMBER);
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
