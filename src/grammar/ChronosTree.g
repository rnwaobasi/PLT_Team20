tree grammar ChronosTree;

options {
	language = Java;
	tokenVocab = Chronos;
	ASTLabelType = CommonTree;
	filter=true;
}

@header {
  package tl.parser;
  import java.util.Map;
  import java.util.HashMap;
}

@members {
	private int toInt(CommonTree node) {
		int value = 0;
		String text = node.getText();
		try {
			value = Integer.parseInt(text);
		} catch (NumberFormatException e) {
			throw new RuntimeException("Cannot convert to int");
		}
		return value;
	}
	
	// shortcut general print method
	private void out(String str) {
		System.out.println(str);
	}

	// for print statements
	// gets rid of the surrounding quotes
	private void print(String str) {
		int oneBeforeEnd = str.length()-1;
		String noQuotes = str.substring(1,oneBeforeEnd);
		out(noQuotes);
	}
}

program
	:	line+
	;
line:	declarator
	|	stmt
	;
declarator
	:	^(DECL type_specifier ID)
	|	^(INST ^(DECL type_specifier ID) ^('=' ID expr))
	;
stmt:	expr
	|	selection_stmt
	|	iteration_stmt
	|	jump_stmt
	;
selection_stmt
	:	^(COND ^(IF_T expr a=line*) ^(ELSE_T b=line*))
	;
iteration_stmt
	:	^(FOREACH_T ^(IN_T element=ID list=ID) ^(BLOCK line*))
	;
jump_stmt
	:	BREAK_T
	;
/*expr:	^(OR expr expr)
	|	^(AND expr expr)
	;*/
expr:	^(OR expr expr)
	|	^('=' ID expr)
	|	^(AND expr expr)
	|	^(EQ expr expr)
	|	^(NEQ expr expr)
	|	^(GEQ expr expr)
	|	^(LEQ expr expr)
	|	^('<' expr expr)
	|	^('>' expr expr)
	|	^('+' expr expr)
	|	^('-' expr expr)
	|	^('*' expr expr)
	|	^('/' expr expr)
	|	^('.' expr expr)
	|	^(NOT expr)
	|	datetime
	|	timeblock
	|	dayblock
	|	MASTER_T
	|	^(primary_expr function_parens)
	;
primary_expr
	:	constant
	|	ID
	|	STRING
	|	TIME
	;
function_parens
// matches () and the params in a function call
	:	^(PARAMS argument_expr_list?)
	;
datetime
// matches [M,W] 10:00~11:00
	:	^(DATETIME dayblock timeblock)
	;
timeblock
// matches 13:00~14:00
	:	^(TIMES a=TIME b=TIME)
	;
dayblock
// matches [M,W,F] etc
	:	^(DAYS DAY+)
	;
argument_expr_list
	:	expr+
	;
constant
	:	INT
	|	FLOAT
	;
type_specifier
	:	INT_T
	|	DOUBLE_T
	|	DAYS_T
	|	TIME_T
	|	STRING_T
	|	SCHEDULE_T
	|	COURSE_T
	|	COURSELIST_T
	|	TIMEBLOCK_T
	|	DATETIME_T
	;