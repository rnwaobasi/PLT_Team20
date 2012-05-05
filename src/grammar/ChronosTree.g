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
  import java.util.TreeMap;
}

@members {
	// maps for storing our stuff
 	private Map<String, Function> functionMap = new TreeMap<String, Function>();
 	private Map<String, Double> variableMap = new TreeMap<String, Double>();

	// convert node to an int
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
	
	// shortcut for general print method
	private void out(String str) {
		System.out.println(str);
	}

	// prints Strings
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
expr:	^('=' ID expr) // assignment
	// logical
	|	^(OR expr expr)
	|	^(AND expr expr)
	|	^(NOT expr)
	// relative
	|	^(EQ expr expr)
	|	^(NEQ expr expr)
	|	^(GEQ expr expr)
	|	^(LEQ expr expr)
	|	^('<' expr expr)
	|	^('>' expr expr)
	// math
	|	^('+' expr expr)
	|	^('-' expr expr)
	|	^('*' expr expr)
	|	^('/' expr expr)
	// dot operator - car.color
	|	^('.' expr expr)
	// functions - print()
	|	^(ID function_parens)
	// derived types
	|	datetime
	|	timeblock
	|	dayblock
	// master courselist - made from input file
	|	MASTER_T
	;
primary_expr
	:	constant
	|	ID
	|	STRING
	|	TIME
	;
function_parens
	:	^(PARAMS argument_expr_list?)
	;
datetime returns [Datetime result]
// i.e. [M,W] 10:00~11:00
	:	^(DATETIME dayblock timeblock) {
		$result = new Datetime(dayblock, timeblock);
		}
	;
timeblock returns [Timeblock result]
// i.e. 13:00~14:00
	:	^(TIMES a=TIME b=TIME) {
		$result = new Timeblock($a.text, $b.text);
		}
	;
dayblock returns [Dayblock result]
// i.e. [M,W,F]
@init { $daysAL = new ArrayList<Day>(); }
	:	^(DAYS (DAY {$daysAL.add($DAY.text);})+)
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