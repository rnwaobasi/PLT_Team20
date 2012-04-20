%{
import java.io.*;
%}

/* declarations of grammar tokens */
%token IF_T ELSE_T NEW_T FOREACH_T IN_T
%token SCHEDULE_T COURSE_T COURSELIST_T INT_T DOUBLE_T TIME_T DAY_T
%token AND_T OR_T NOT_T
%token REL_OP ASSIGN_OP
%token ID NL NUM


/* experimenting with union so it can recognize different yylvals */
/* %union
{
	int number;
	char *string;
}

%token <number> STATE
%token <string> WORD

/* precedence of ops */
%left REL_OP
%left AND_T OR_T
%left NOT_T
%left '+' '-'
%left '*' '/'

%%

/* grammar productions and semantic actions */

/* experimenting */
line	: expr '\n'
	;
expr	: expr '+' 		{ }
	;

	/* Actual Grammar */
translation_unit    :	declaration compound_statement
		    ;

declarator_list	    :	declarator
		    |	declarator_list declarator
		    ;

declarator	    :	primitive_declarator';'
		    |	derived type_declarator';'
		    ;

primitive_declarator	:   type_specifier identifier
			|   type_specifier identifier '=' initializer
			;

initializer	    :	assignment_expression
		    ;

derived_type_declarator	:   'new' derived_type_specifier identifier
			;

compound_statement	:   declarator_list statement_list
			|   statement_list
			;

statement_list		:   statement
			|   statement_list statement
			;

jump_statement		:   break
			;

selection_statement	:   if ( expression ) statement
 			|   if ( expression ) statement else statement
			;

iteration_statement	:   foreach course identifier in courselist '{'compound_statement'}'
			;

expression_statement	:   ';'
 			|   expression';'
			;

expression		:   assignment_expression
			|   expression',' assignment_expression
			;

assignment_expression_list  :	assignment_expression
			    |	assignment_expression_list',' assignment_expression
			    ;

assignment_expression	:   conditional_expression
 			|   '=' assignment_expression
			|   postfix_expression
			;

conditional_expression	:   logical_OR_expression
			;

logical_OR_expression	:   logical_AND_expression
			|   logical_OR_expression || logical_AND_expression
			;

logical_AND_expression	:   equality_expression
			|   logical_AND_expression && equality_expression
			;

equality_expression	:   relational_expression
			|   equality_expression == relational_expression
			|   equality_expression != relational_expression
			;

relational_expression	:   relational_expression < additive_expression
			|   relational_expression > additive_expression
			|   relational_expression <= additive_expression
			|   relational_expression >= additive_expression
			;

additive_expression	:   multiplicative_expression
			|   additive_expression + multiplicative_expression
			|   additive_expression - multiplicative_expression
			;

multiplicative_expression   :	multiplicative_expression * postfix_expression
			    |	multiplicative_expression / postfix_expression
			    |	multiplicative_expression % postfix_expression
			    ;

postfix_expression	    :	primary_expression
			    |	postfix_expression(argument_expression_list)
			    |	postfix_expression()
			    ;

primary_expression	:   constant
			|   identifier
			|   string
 			|   (expression)
			;

argument_expression_list    :	assignment_expression
			    |	assignment_expression_list',' assignment_expression
			    ;

type_specifier		:   int
			|   double
			|   time
			|   day
			|   derived-type-specifier
			;

derived_type_specifier	:   schedule
			|   course
			|   courselist
			;

%%

/* reference to lexer object */
private scanner lexer;

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
	lexer = new scanner (r, this);
}

public static void main(String[] args) throws IOException {
	Parser yyparser = new Parser(new FileReader(args[0]));
	yyparser.yyparse();
}

/*
String ins;
StringTokenizer st;

void yyerror(String s){
	System.out.println("par:"+s);
}

boolean newline;
int yylex(){
	String s;
	int tok;
	Double d;
	System.out.print("yylex ");
	if (!st.hasMoreTokens())
		if (!newline){
			newline = true;
			return '\n';
		} else return 0;
	s = st.nextToken();
	System.out.println("tok:"+s);
	try {
		d = Double.valueOf(s);
		yylval = new ParserVal(d.doubleValue());
		tok = NUM;
	}
	catch (Exception e) {
		tok = s.charAt(0);
	}
	return tok;
}



/* using Lex to produce yylex() */
/*
int main (void) {
	return yyparse();
}

int yyerror (char *msg) {
	return fprintf(stderr, "YACC: %s\n", msg);
}
*/
