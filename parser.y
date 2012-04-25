%{
//import ChronosLexer.java;
import java.io.*;
//import java.util.*;
%}

/* declarations of grammar tokens */
%token IF_T ELSE_T NEW_T FOREACH_T IN_T BREAK_T
%token SCHEDULE_T COURSE_T COURSELIST_T INT_T DOUBLE_T TIME_T DAY_T STRING_T
%token AND_T OR_T NOT_T
%token LEQ_REL_OP GEQ_REL_OP NEQ_REL_OP EQ_REL_OP EQ_T
%token ID NL INT_NUM DOUBLE_NUM

/* precedence of ops */
%left REL_OP
%left AND_T OR_T
%left NOT_T
%left '+' '-'
%left '*' '/'

%%

/* grammar productions and semantic actions */

/***************** PARTIAL GRAMMAR FOR TESTING ******************/

declarator_list		:   declarator_list primitive_declarator
			|   primitive_declarator
			;

primitive_declarator	:   type_specifier ID';'
			|   type_specifier ID '=' constant';'
			;

/*primary_expression	:   constant
			|   ID
			;
*/
constant		:   INT_NUM
			|   DOUBLE_NUM
			;

type_specifier		:   INT_T
			|   DOUBLE_T
			;

/********************* ACTUAL GRAMMAR BELOW *********************/
    /*
translation_unit    :	declarator_list compound_statement
		    ;

declarator_list	    :	declarator
		    |	declarator_list declarator
		    ;

declarator	    :	primitive_declarator';'
		    |	derived_type_declarator';'
		    ;

primitive_declarator	:   type_specifier ID
			|   type_specifier ID '=' initializer
			;

initializer	    :	assignment_expression
		    ;

derived_type_declarator	:   NEW_T derived_type_specifier ID
			;

			
statement_list		:   statement
			|   statement_list statement
			;
			
statement		:   compound_statement
			|   selection_statement
			|   iteration_statement
			|   expression_statement
			|   jump_statement
			;
			
compound_statement	:   declarator_list statement_list
			|   statement_list
			;

jump_statement		:   BREAK_T // do we need a semi-colon here?
			;

selection_statement	:   IF_T '(' expression ')' statement
 			|   IF_T '(' expression ')' statement ELSE_T statement
			;

iteration_statement	:   FOREACH_T COURSE_T ID IN_T COURSELIST_T '{'compound_statement'}'
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
			|   logical_OR_expression OR_T logical_AND_expression
			;

logical_AND_expression	:   equality_expression
			|   logical_AND_expression AND_T equality_expression
			;

equality_expression	:   relational_expression
			|   equality_expression '==' relational_expression
			|   equality_expression '!=' relational_expression
			;

relational_expression	:   relational_expression '<' additive_expression
			|   relational_expression '>' additive_expression
			|   relational_expression '<=' additive_expression
			|   relational_expression '>=' additive_expression
			;

additive_expression	:   multiplicative_expression
			|   additive_expression '+' multiplicative_expression
			|   additive_expression '-' multiplicative_expression
			;

multiplicative_expression   :	multiplicative_expression '*' postfix_expression
			    |	multiplicative_expression '/' postfix_expression
			    |	multiplicative_expression '%' postfix_expression // do we need mod?
			    ;

postfix_expression	    :	primary_expression
			    |	postfix_expression'('argument_expression_list')'
			    |	postfix_expression'('')'
			    ;

primary_expression	:   constant
			|   ID
			|   STRING_T
 			|   '('expression')'
			;

argument_expression_list    :	assignment_expression
			    |	assignment_expression_list',' assignment_expression
			    ;

constant		:   NUM // do we need both int and double?
			;

type_specifier		:   INT_T
			|   DOUBLE_T
			|   TIME_T
			|   DAY_T
			|   derived_type_specifier
			;

derived_type_specifier	:   SCHEDULE_T
			|   COURSE_T
			|   COURSELIST_T
			;
		*/	
/********************* END OF ACTUAL GRAMMAR *********************/


%%

/* reference to lexer object */
//private Scanner lexer;
ChronosLexer lexer;
BufferedReader inputStream;

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
	System.err.println("Error at line " + lexer.getLine() +
		" column " + lexer.getCol() + ": " + error);
	System.err.println("String rejected");
}

/* constructor taking in file input */
public Parser(Reader r) {
	//lexer = new Scanner (r, this);
	//inputStream = new BufferedReader (r);
	lexer = new ChronosLexer(r, this);
}

public static void main(String[] args) throws IOException {
	Parser yyparser = new Parser(new FileReader(args[0]));
	yyparser.yyparse();
}
