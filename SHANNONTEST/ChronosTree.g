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
 	private Map<String, CVal> varMap = new TreeMap<String, CVal>();

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
		varMap.put($ID.text, null);
		}
	;
instantiator
	:	^(INST declarator assignment_expr) {
		// nothing needed here.
		// declarator and assignment_expr do all the work
		}
	;
stmt:	expr
	|	selection_stmt
	|	iteration_stmt
	|	jump_stmt
	;
selection_stmt // TO DO! LEARN ABOUT SCOPE?
	:	^(COND ^(IF_T expr a=line*) ^(ELSE_T b=line*))
	;
iteration_stmt // TO DO!
	:	^(FOREACH_T ^(IN_T element=ID list=ID) ^(BLOCK line*))
	;
jump_stmt // TO DO!
	:	BREAK_T
	;
assignment_expr
	:	^('=' ID expr) {
		/* if $ID.text is in varMap,
		set its value to $expr.result
		otherwise, ERROR */
			if (found($ID.text)) {
				//******** CREATE FOUND AND SET METHODS
				set($ID.text, $expr.result);
			}
			else {
				throw new NullPointerException("This ID doesn't exist");
			}
		}
	;
expr returns [Value result]
	:	assignment_expr // goes to assignment_expr rule
	// logical
	|	^(OR e1=expr e2=expr) {
			CVal val1 = new CVal($e1.result);
			CVal val2 = new CVal($e2.result);
			if (val1.isBool() && val2.isBool()) {
				$result = val1.value() || val2.value();
			}
			else {
				throw new MismatchedTypeException("Cannot perform \
				OR operation on non-boolean expressions");
			}
		}
	|	^(AND e1=expr e2=expr) {
			CVal val1 = new CVal($e1.result);
			CVal val2 = new CVal($e2.result);
			if (val1.isBool() && val2.isBool()) {
				$result = val1.value() && val2.value();
			}
			else {
				throw new MismatchedTypeException("Cannot perform \
				AND operation on non-boolean expressions");
			}
		}
	|	^(NOT e=expr) {
			Cval val = new CVal($e.result);
			if (val.isBool()) {
				$result = !val.value();
			}
			else {
				throw new MismatchedTypeException("Cannot perform \
				NOT operation on non-boolean expressions");
			}
		}
	// relative
	|	^(EQ e1=expr e2=expr) {
			CVal val1 = new CVal($e1.result);
			CVal val2 = new CVal($e2.result);
			$result = $val1.value() == $val2.value();
		}
	|	^(NEQ expr expr) {
			CVal val1 = new CVal($e1.result);
			CVal val2 = new CVal($e2.result);
			$result = $val1.value() != $val2.value();

		}
	|	^(GEQ expr expr) {
			CVal val1 = new CVal($e1.result);
			CVal val2 = new CVal($e2.result);
			$result = $val1.value() >= $val2.value();
		}
	|	^(LEQ expr expr) {
			CVal val1 = new CVal($e1.result);
			CVal val2 = new CVal($e2.result);
			$result = $val1.value() <= $val2.value();
		}
	|	^('<' expr expr) {
			CVal val1 = new CVal($e1.result);
			CVal val2 = new CVal($e2.result);
			$result = $val1.value() < $val2.value();
		}
	|	^('>' expr expr) {
			CVal val1 = new CVal($e1.result);
			CVal val2 = new CVal($e2.result);
			$result = $val1.value() > $val2.value();
		}
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
	|	MASTER_T //****** HOW TO RECONCILE THIS????
	// primary types
	|	INT
	|	DOUBLE
	|	ID
	|	STRING
	|	TIME
	;
function returns [Object result]
// i.e. print()
	:	^(PRINT_T print_target*)
	|	^(ID ^(PARAMS argument_expr_list?)) {
		$result = evalFunction($ID.text, $argument_expr_list.result);
		}
	;
print_target
	:	INT { out($INT); }
	|	DOUBLE { out($DOUBLE); }
	|	ID { if (found($ID.text)) { out(getVar($ID.text).value);} }
	|	function { out($function.result); }
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
		$result = new Timeblock(new Time($a.text), new Time($b.text));
		}
	;
dayblock returns [Dayblock result]
// i.e. [M,W,F]
@init { $result = new Dayblock(); }
	:	^( DAYBLOCK_T (DAY {
		char daychar = ($DAY.text).charAt(0);
		$result.add(daychar);
		})+ )
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