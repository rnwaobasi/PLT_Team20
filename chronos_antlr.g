grammar chronos_antlr;

/* GRAMMAR */
translation_unit
	:	declarator_list compound_stmt
	;
declarator_list
	:	(declarator) (declarator)*
	;
declarator
	:	primitive_declarator';'
	|	derived_type_declarator';'
	;
primitive_declarator
	:	type_specifier ID
	|	type_specifier ID '=' assignment_expr
	;
derived_type_declarator
	:	NEW_T derived_type_specifier ID
	;
compound_stmt
	:	declarator_list stmt_list
	|	stmt_list
	;
stmt_list
	:	(stmt) (stmt)*
	;
stmt:	expr_stmt
	|	jump_stmt
	;
expr_stmt
	:	';'
	|	assignment_expr
	;
jump_stmt
	:	BREAK_T';'
	;
assignment_expr
	:	conditional_expr
	|	postfix_expr
	;
conditional_expr
	:	postfix_expr OR postfix_expr
	;
postfix_expr
	:	(primary_expr) ('('argument_expr_list')' | '('')')*
	;
primary_expr
	:	constant
	|	ID
	|	STRING
	;
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
PRINT_T :	'print'
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
