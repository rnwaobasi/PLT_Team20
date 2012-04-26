grammar chronos_antlr;

/*options {
	output = AST;
}

/* GRAMMAR */
translation_unit
	:	(declarator';')* (stmt)*
	;
declarator
	:	primitive_declarator
	|	derived_type_declarator
	;
primitive_declarator
	:	type_specifier ID
	|	type_specifier ID '=' assignment_expr
	;
derived_type_declarator
	:	NEW_T derived_type_specifier ID
	|	NEW_T derived_type_specifier ID '=' assignment_expr
	;
stmt:	assignment_expr';'
	|	selection_stmt
	|	iteration_stmt
	|	jump_stmt';'
	|	';'
	;
selection_stmt
	:	IF_T assignment_expr '{'stmt'}' (ELSE_T '{'stmt'}')?
	;
iteration_stmt
	:	FOREACH_T COURSE_T ID IN_T ID '{' (declarator';')* (stmt)* '}'
	; // iterations only exist for courses
jump_stmt
	:	BREAK_T
	;
assignment_expr
	:	cond_term (OR cond_term)*
	;
cond_term
	:	equiv_expr (AND equiv_expr)*
	;
equiv_expr
	:	rel_expr ( (EQ | NEQ) rel_expr )*
	;
rel_expr
	:	math_expr ( ('<' | '>' | GEQ | LEQ) math_expr )*
	;
math_expr
	:	math_term ( ('+' | '-') math_term )*
	;
math_term
	:	unary_expr ( ('*' | '/') unary_expr )*
	;
unary_expr
	:	(NOT)* postfix_expr
	;
postfix_expr
	:	(ID '.')? primary_expr ( '(' (argument_expr_list)? ')' )?
	; // doesn't accept postfix_expr.postfix_expr, only id.postfix_expr
primary_expr
	:	constant
	|	ID
	|	STRING
	|	'('assignment_expr')'
	; // does parser need to also recognize dates and times? i.e. MW 1:10-2:25
argument_expr_list
	:	(assignment_expr) (',' assignment_expr)*
	;
constant
	:	INT
	|	FLOAT
	;
type_specifier
	:	INT_T
	|	DOUBLE_T
	|	TIME_T
	|	DAY_T
	|	STRING_T
	;
derived_type_specifier
	:	SCHEDULE_T
	|	COURSE_T
	|	COURSELIST_T
	;
	
/* LEXER */
// keywords
IF_T 	:	'if'
		;
ELSE_T	:	'else'
		;
NEW_T 	:	'new'
		;
FOREACH_T :	'foreach'
		;
IN_T	:	'in'
		;
BREAK_T	:	'break'
		;
SCHEDULE_T:	'schedule'
		;
COURSE_T:	'course'
		;
COURSELIST_T:	'courselist'
		;
INT_T	:	'int'
		;
DOUBLE_T:	'double'
		;
TIME_T	:	'time'
		;
DAY_T	:	'day'
		;
STRING_T:	'string'
		;

// boolean and relational ops		
AND	:	'&&'
	;
OR	:	'||'
	;
NOT	:	'!'
	;
LEQ	:	'<='
	;
GEQ	:	'>='
	;
NEQ	:	'!='
	;
EQ	:	'=='
	;
		
WHITESPACE
	:	( '\t' | ' ' | '\r' | '\n'| '\u000C' )+�{$channel = HIDDEN;}
	;

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel = HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel = HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
