%{
/* ordinary C declarations for 2nd and 3rd sections */
#include <ctype.h>
#include "lex.yy.c"
%}

/* declarations of grammar tokens */
%token DIGIT NAME NUMBER

/* experimenting with union so it can recognize different yylvals */
%union
{
	int number;
	char *string;
}

%token <number> STATE
%token <string> WORD

/* precedence of ops */
%left '+' '-'
%right '*' '/'

%%

/* grammar productions and semantic actions */

line	: expr '\n'
	;
expr	: expr '+' 		{ 
				}
	;

%%

/* supporting C routines */

/* using Lex to produce yylex() */

int main (void) {
	return yyparse();
}

int yyerror (char *msg) {
	return fprintf(stderr, "YACC: %s\n", msg);
}

