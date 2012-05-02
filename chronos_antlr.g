grammar chronos_antlr;

options {
	language = Java;
	output = AST;
	ASTLabelType = CommonTree;
}

tokens {
	DECL;
	COND;
	BLOCK;
	DATETIME;
	DAYS;
	TIMES;
	FUNC;
	PARAMS;
}

/* GRAMMAR */
start_rule
	:	translation_unit EOF
	;
	
translation_unit
	:	declarator* stmt*
	;
declarator
	:	primitive_declarator';'!
	|	derived_type_declarator';'!
	;
primitive_declarator
	:	type_specifier ID 
			-> ^(DECL type_specifier ID)
	|	type_specifier ID '=' expr 
			-> ^('=' ^(DECL type_specifier ID) expr)
	;
derived_type_declarator
	:	NEW_T derived_type_specifier ID 
			-> ^(DECL derived_type_specifier ID)
	|	NEW_T derived_type_specifier ID '=' expr 
			-> ^('=' ^(DECL derived_type_specifier ID) expr)
	;
stmt:	expr';' -> expr
	|	selection_stmt
	|	iteration_stmt
	|	jump_stmt';' -> jump_stmt
	|	';'!
	;
selection_stmt
	:	IF_T expr '{'a=translation_unit '}' (ELSE_T '{' b=translation_unit '}')? 
			-> ^(COND ^(IF_T expr $a) ^(ELSE_T $b)?)
	;
iteration_stmt
	:	FOREACH_T COURSE_T element=ID IN_T list=ID '{' translation_unit '}' 
			-> ^(FOREACH_T ^(IN_T $element $list) ^(BLOCK translation_unit))
	; // iterations only exist for courses
jump_stmt
	:	BREAK_T
	;
expr
	:	cond_term (OR^ cond_term)*
	|	ID '='^ expr
	;
cond_term
	:	equiv_expr (AND^ equiv_expr)*
	;
equiv_expr
	:	rel_expr ( (EQ^ | NEQ^) rel_expr )*
	;
rel_expr
	:	add_expr ( ('<'^ | '>'^ | GEQ^ | LEQ^) add_expr )*
	|	datetime
	;
add_expr
	:	mult_expr ( ('+'^ | '-'^) mult_expr )*
	;
mult_expr
	:	unary_expr ( ('*'^ | '/'^) unary_expr )*
	|	timeblock
	;
unary_expr
	:	postfix_expr
	|	NOT^ postfix_expr
	;
postfix_expr
	:	( (ID '.')? primary_expr '(' argument_expr_list? ')' )=> function
	|	variable
	;
function
	:	ID '.' primary_expr '(' (argument_expr_list)? ')'
			-> ^(FUNC ^('.' ID primary_expr) ^(PARAMS argument_expr_list?))
			// function
	|	primary_expr '(' (argument_expr_list)? ')'
			-> ^(FUNC primary_expr ^(PARAMS argument_expr_list?))
			// function without a caller object
	;
variable
	:	ID '.' primary_expr -> ^('.' ID primary_expr)
			// not a function
	|	primary_expr
			// also not a function
	; // doesn't accept postfix_expr.postfix_expr, only id.postfix_expr
datetime
	:	dayblock timeblock? 
			-> ^(DATETIME dayblock timeblock)
	;
timeblock
	:	a=TIME '~' b=TIME -> ^(TIMES $a $b)
	;
dayblock
	:	'[' daychar ( ',' daychar )* ']' -> ^(DAYS daychar+)
	;
daychar
	:	('M'|'T'|'W'|'R'|'F')
	;
primary_expr
	:	constant
	|	ID { System.out.println(ID); }
	|	STRING
	|	TIME
	|	'('expr')' -> expr
	;
argument_expr_list
	:	(expr) (',' expr)* -> expr+
	;
constant
	:	INT
	|	FLOAT
	;
type_specifier
	:	INT_T
	|	DOUBLE_T
	|	DAY_T
	|	TIME_T
	|	STRING_T
	;
derived_type_specifier
	:	SCHEDULE_T
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
DAY_T	:	'day'
		;
TIME_T	:	'time'
		;
STRING_T:	'string'
		;

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
		
WHITESPACE
	:	( '\t' | ' ' | '\r' | '\n'| '\u000C' )+Ê{$channel = HIDDEN;}
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
DAY	:	('M' | 'T' | 'W' | 'R' | 'F')
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
