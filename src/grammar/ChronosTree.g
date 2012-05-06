tree grammar ChronosTree;

options {
	language = Java;
	tokenVocab = Chronos;
	ASTLabelType = CommonTree;
	filter=true;
}

@header {
  package chronos.parser;

  import java.util.Map;
  import java.util.TreeMap;
  import chronos.nodes.*;
}

@members {
	// TreeMap for storing our variables
 	private Map<String, CVal> varMap = new TreeMap<String, CVal>();

	// function for evaluating functions!
	private Object evalFunction(String funcName, ArrayList<String> params) {
		
	}
	
	// shortcut for System.out.println
	private void out(Object obj) {
		System.out.println(obj);
	}

	// prints Strings
	// gets rid of the surrounding quotes
	private void print(String str) {
		String noQuotes = str.substring(1,str.length()-1);
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
	:	^(INST declarator ^('=' ID expr)) {
			if (varMap.containsKey($ID.text)) {
				varMap.put($ID.text, $expr.result);
			}
			else {
				throw new NullPointerException("This ID doesn't exist");
			}
		}
	;
stmt:	expr
	|	^('=' e1=expr e2=expr) {
			// if e1 is an ID:
			if (varMap.containsKey($e1.text)) { // look for it in varMap
				varMap.put($e1.text, $e2.result); // put in its value
			}
			// if e1 has a dot function:
			else {
				CVal val1 = $e1.result; // e1.result is a CVal already
				CVal val2 = $e2.result;
				val1 = val2; // set e2 to the value of e1
			}
		}
	|	selection_stmt
	|	iteration_stmt { out($iteration_stmt.text); }
	|	jump_stmt
	;
selection_stmt // TO DO! LEARN ABOUT SCOPE?
	:	^(COND ^(IF_T expr a=line*) ^(ELSE_T b=line*)) {
			/*if ($expr.text) {$a.text*} else {$b.text*};*/
		}
	;
iteration_stmt returns [String result] // only works on Courses
@init {
}
/*@after {
	len++;
	ArrayList<Course> ourList = varMap.get($list.text);
	if (len < ourList.size()) {
		input.Rewind(mark);
	}
}*/
	:	^(FOREACH_T ^(IN_T element=ID list=ID) ^(BLOCK lines=line*)) {
			$result = "for ( Course " + $element.text + " : " + $list +
			" ) {\n" + lines + "}";
		}
	;
jump_stmt // TO DO!
	:	BREAK_T //{ break; } // this is my break
	;
expr returns [CVal result]
	// goes to assignment_expr rule
	//	assignment_expr
	// logical; returns 1 or 0
	:	^(OR e1=expr e2=expr) {
			CVal val1 = new CVal($e1.result);
			CVal val2 = new CVal($e2.result);
			/* if e1 and e2 are boolean expressions, 
			then this operation is legal */
			if (val1.isBool() && val2.isBool()) {
				try {
				$result = (val1.value() || val2.value())? 1:0;
				}
				catch (Exception e) {
				out("Can't do OR on objects");
				}
			}
			else {
				throw new IllegalArgumentException("Cannot perform OR operation on non-boolean expressions");
			}
		}
	|	^(AND e1=expr e2=expr) {
			CVal val1 = new CVal($e1.result);
			CVal val2 = new CVal($e2.result);
			if (val1.isBool() && val2.isBool()) {
			try{
				$result = (val1.value() && val2.value())? 1:0;
				}
				catch (Exception e) {
				out("Can't do OR on objects");
				}
			}
			else {
				throw new IllegalArgumentException("Cannot perform AND operation on non-boolean expressions");
			}
		}
	|	^(NOT e=expr) {
			CVal val = new CVal($e.result);
			if (val.isBool()) {
			try {
				$result = (!val.value())? 1:0;
				}
				catch (Exception excep) {
				out("Can't do OR on objects");
				}
			}
			else {
				throw new IllegalArgumentException("Cannot perform NOT operation on non-boolean expressions");
			}
		}
	// relative; returns 1 or 0
	|	^(EQ e1=expr e2=expr) {
			CVal val1 = new CVal($e1.result);
			CVal val2 = new CVal($e2.result);
			$result = ( val1.compareTo(val2) == 0 )? 1:0;
		}
	|	^(NEQ e1=expr e2=expr) {
			CVal val1 = new CVal($e1.result);
			CVal val2 = new CVal($e2.result);
			$result = ( val1.compareTo(val2) != 0 )? 1:0;
		}
	|	^(GEQ e1=expr e2=expr) {
			CVal val1 = new CVal($e1.result);
			CVal val2 = new CVal($e2.result);
			$result = ( val1.compareTo(val2) == 1
			|| val1.compareTo(val2) == 0 )? 1:0;
		}
	|	^(LEQ e1=expr e2=expr) {
			CVal val1 = new CVal($e1.result);
			CVal val2 = new CVal($e2.result);
			$result = ( val1.compareTo(val2) == -1
			|| val1.compareTo(val2) == 0 )? 1:0;
		}
	|	^('<' e1=expr e2=expr) {
			CVal val1 = new CVal($e1.result);
			CVal val2 = new CVal($e2.result);
			$result = ( val1.compareTo(val2) == -1 )? 1:0;
		}
	|	^('>' e1=expr e2=expr) {
			CVal val1 = new CVal($e1.result);
			CVal val2 = new CVal($e2.result);
			$result = ( val1.compareTo(val2) == 1 )? 1:0;
		}
	// math; returns int or double
	// for '+' concatenation, also returns String
	|	^('+' e1=expr e2=expr) {
			CVal val1 = new CVal($e1.result);
			CVal val2 = new CVal($e2.result);
			if (val1.isNumber() && val2.isNumber() 
			 || val1.isString() && val2.isString()) {
				$result = (Number)val1.value() + (Number)val2.value();
			}
		}
	|	^('-' e1=expr e2=expr) {
			CVal val1 = new CVal($e1.result);
			CVal val2 = new CVal($e2.result);
			if (val1.isNumber() && val2.isNumber()) {
				$result = (Number)val1.value() - (Number)val2.value();
			}		}
	|	^('*' e1=expr e2=expr) {
			CVal val1 = new CVal($e1.result);
			CVal val2 = new CVal($e2.result);
			if (val1.isNumber() && val2.isNumber()) {
				$result = (Number)val1.value() * (Number)val2.value();
			}
		}
	|	^('/' e1=expr e2=expr) {
			CVal val1 = new CVal($e1.result);
			CVal val2 = new CVal($e2.result);
			if (val1.isNumber() && val2.isNumber()) {
				$result = (Number)val1.value() / (Number)val2.value();
			}
		}
	
	// dot operator - car.color
	|	^('.' e1=expr e2=expr) {
			/* 	If varMap has e1.text, then it is an ID,
			and we can call the function on the value of
			the matching CVal.
				If the varMap does not have e1.text, then it may be
			a return value of a function. in this case we simply
			call the function on the return object.
				If neither of these work, then there is an error.*/
			if (varMap.containsKey($e1.text)) {
				CVal val = varMap.get($e1.text);
				$result = (val.value()).e2;
			}
			if (!varMap.containsKey($e1.text)) {
				try {
					$result = ($e1.result).e1;
				} catch (Exception e) {
					out("Dot expression error");
					e.printStackTrace();
				}
			}
		}
	
	// derived types
	|	datetime { $result = $datetime.result; }
	|	timeblock { $result = $timeblock.result; }
	|	dayblock { $result = $dayblock.result; }
		
	// primary types
	|	INT { $result = new CVal( Integer.parseInt($INT.text) ); }
	|	DOUBLE { $result = new CVal( Double.parseDouble($DOUBLE.text) ); }
	|	ID { $result = varMap.get($ID.text); }
	|	STRING { $result = new CVal( $STRING.text ); }
	|	TIME { $result = new CVal( new Time($TIME.text) ); }
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
	|	ID { if (varMap.containsKey($ID.text)) { out((varMap.get($ID.text)).value);} }
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
argument_expr_list returns [ArrayList<String> result]
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