tree grammar ChronosTree;

options {
	language = Java;
	tokenVocab = Chronos;
	ASTLabelType = CommonTree;
	filter=true;
}

@header {
  import java.util.Map;
  import java.util.TreeMap;
}

@members {
	// maps for storing our stuff
 	//private Map<String, Function> functionMap = new TreeMap<String, Function>();
 	//private Map<String, Double> variableMap = new TreeMap<String, Double>();

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
	|	instantiator
	|	stmt
	;
declarator
	:	^(DECL type_specifier ID) {
		/* if $type_specifier.text == such and such, then
		construct the type and put it in varMap? */
		}
	;
instantiator
	:	^(INST declarator assignment_expr) {
		// nothing needed here?
		}
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
assignment_expr
	:	^('=' ID expr) {
		/* if $ID.text is in varMap,
		set its value to $expr.result
		otherwise, ERROR */
		}
	;
expr returns [Value result]
	//:	^('=' ID expr) // assignment
	:	assignment_expr
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
	// derived types
	|	datetime
	|	timeblock
	|	dayblock
	// master courselist - made from input file
	|	MASTER_T
	// primary types
	|	INT
	|	FLOAT
	|	ID
	|	STRING
	|	TIME
	;
function returns [Object result]
// i.e. print()
	:	^(ID ^(PARAMS argument_expr_list?)) {
		$result = evalFunction($ID.text, $argument_expr_list.result);
		}
	;
datetime returns [Datetime result]
// i.e. [M,W] 10:00~11:00
	:	^(DATETIME dayblock timeblock) {
		$result = new Datetime($dayblock.result, $timeblock.result);
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
@init { $result = new ArrayList<String>(); }
	:	^( DAYBLOCK_T (DAY {$result.add($DAY.text);})+ )
	;
argument_expr_list returns [ExprList result]
@init { $result = new ArrayList<String>(); }
	:	(expr {$result.add($expr.text);})+
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