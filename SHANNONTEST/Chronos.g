grammar Chronos;

options {
	language = Java;
	output = AST;
	ASTLabelType = CommonTree;
}

tokens {
// extra tokens (invisible nodes) for AST
	DECL;
	INST;
	COND;
	BLOCK;
	DATETIME;
	DAYS;
	TIMES;
	PARAMS;
	FUNC;
	THEN;
}


/* *** GRAMMAR *** */
// starting rule
program
	:	line+ EOF!
	;
line
	:	declarator ';'!
	|	instantiator
	|	stmt
	;
declarator
// matches int x
	:	type_specifier ID
			-> ^(DECL type_specifier ID)
	;
instantiator
// matches int x = 5;
	:	type_specifier ID '=' expr ';'
			-> ^(INST ^('=' ID expr))
	;
stmt:	expr ('='^ expr)? ';'!
	|	selection_stmt
	|	iteration_stmt
	|	jump_stmt';' -> jump_stmt
	|	';'!
	;
selection_stmt
// matches if and if/else statements
	:	IF_T expr '{' line* '}' else_stmt? -> ^( COND expr ^(THEN line*) else_stmt? )
	;
else_stmt
	:	ELSE_T '{' (b=line)* '}' -> ^(ELSE_T $b*)
	;
iteration_stmt
// matches foreach statements
	:	FOREACH_T COURSE_T element=ID IN_T list=ID '{' line* '}' 
			-> ^(FOREACH_T ^(IN_T $element $list) ^(BLOCK line*))
	; // iterations only exist for courses
jump_stmt
// matches break
	:	BREAK_T
	;
expr
// matches OR statements or assignment expressions
	:	and_expr (OR^ and_expr)*
	;
and_expr
// matches AND statements
	:	equiv_expr (AND^ equiv_expr)*
	;
equiv_expr
// matches equivalence relations
	:	rel_expr ( (EQ^ | NEQ^) rel_expr )*
	;
rel_expr
// matches other relations
	:	math_expr ( ('<'^ | '>'^ | GEQ^ | LEQ^) math_expr )*
	|	datetime
	;
math_expr
// matches add/subtract expr
	:	math_term ( ('+'^ | '-'^) math_term )*
	;
math_term
// matches mult/division expr
	:	unary_expr ( ('*'^ | '/'^) unary_expr )*
	|	timeblock
	;
unary_expr
	:	postfix_expr ('.'^ postfix_expr)*
	|	NOT^ postfix_expr
	;
postfix_expr
// matches functions or variables
	:	function
	|	primary_expr
	;
function
	:	ID '(' argument_expr_list? ')'
		-> ^(ID ^(PARAMS argument_expr_list?))
	;
datetime
// matches [M,W] 10:00~11:00
	:	dayblock timeblock 
			-> ^(DATETIME dayblock timeblock)
	;
timeblock
// matches 13:00~14:00
	:	a=TIME '~' b=TIME -> ^(TIMES $a $b)
	;
dayblock
// matches [M,W,F] etc
	:	'[' DAY ( ',' DAY )* ']' -> ^(DAYS DAY+)
	;
primary_expr
	:	INT
	|	DOUBLE
	|	ID 
	|	STRING
	|	TIME
	|	'('expr')' -> expr
	;
argument_expr_list
	:	(expr) (',' expr)* -> expr+
	;
type_specifier
	:	INT_T
	|	DOUBLE_T
	|	DAYBLOCK_T
	|	TIME_T
	|	STRING_T
	|	SCHEDULE_T
	|	COURSE_T
	|	COURSELIST_T
	|	TIMEBLOCK_T
	|	DATETIME_T
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
TIMEBLOCK_T:	'timeblock'
		;
DATETIME_T:		'datetime'
		;
INT_T	:	'int'
		;
DOUBLE_T:	'double'
		;
DAYBLOCK_T	:	'dayblock'
		;
TIME_T	:	'time'
		;
STRING_T:	'string'
		;
//PRINT_T:	'print'
	//;
TIME
	:	('0'..'2')? ('0'..'9') ':' ('0'..'5')('0'..'9')
	;
	// military format for time
	// hours can have 1 or 2 digits

/* boolean and relational ops */	
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

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

DOUBLE
    :   ('0'..'9')+ '.' ('0'..'9')*
    |   '.' ('0'..'9')+
    |   ('0'..'9')+
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;
    
fragment
DAY	:	('M' | 'T' | 'W' | 'R' | 'F')
	;

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