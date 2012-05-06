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
	
	// is the string a function call?
	private boolean isFunctionCall(String str) {
		return str.lastIndexOf(')') == str.length() - 1;
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
				$result = (val1.getBool() || val2.getBool())? new CVal(new Integer(1))
															: new CVal(new Integer(0));
			}
			else {
				throw new IllegalArgumentException("Cannot perform OR operation on non-boolean expressions");
			}
		}
	|	^(AND e1=expr e2=expr) {
			CVal val1 = new CVal($e1.result);
			CVal val2 = new CVal($e2.result);
			if (val1.isBool() && val2.isBool()) {
				$result = (val1.getBool() && val2.getBool())? new CVal(new Integer(1))
															: new CVal(new Integer(0));
			}
			else {
				throw new IllegalArgumentException("Cannot perform AND operation on non-boolean expressions");
			}
		}
	|	^(NOT e=expr) {
			CVal val = new CVal($e.result);
			if (val.isBool()) {
				$result = (!val.getBool())? new CVal(new Integer(1))
										  : new CVal(new Integer(0));
			}
			else {
				throw new IllegalArgumentException("Cannot perform NOT operation on non-boolean expressions");
			}
		}
	// relative; returns 1 or 0
	|	^(EQ e1=expr e2=expr) {
			CVal val1 = new CVal($e1.result);
			CVal val2 = new CVal($e2.result);
			if ( val1.compareTo(val2) == 0 )
				$result = new CVal(new Integer(1));
			else $result = new CVal(new Integer(0));
		}
	|	^(NEQ e1=expr e2=expr) {
			CVal val1 = new CVal($e1.result);
			CVal val2 = new CVal($e2.result);
		if ( val1.compareTo(val2) == 0 )
				$result = new CVal(new Integer(1));
			else $result = new CVal(new Integer(0));
		}
	|	^(GEQ e1=expr e2=expr) {
			CVal val1 = new CVal($e1.result);
			CVal val2 = new CVal($e2.result);
		if ( val1.compareTo(val2) == 0 || val1.compareTo(val2) == 1 )
				$result = new CVal(new Integer(1));
			else $result = new CVal(new Integer(0));
		}
	|	^(LEQ e1=expr e2=expr) {
			CVal val1 = new CVal($e1.result);
			CVal val2 = new CVal($e2.result);
			if ( val1.compareTo(val2) == 0 || val1.compareTo(val2) == -1 )
				$result = new CVal(new Integer(1));
			else $result = new CVal(new Integer(0));
		}
	|	^('<' e1=expr e2=expr) {
			CVal val1 = new CVal($e1.result);
			CVal val2 = new CVal($e2.result);
			if ( val1.compareTo(val2) < 0 )
				$result = new CVal(new Integer(1));
			else $result = new CVal(new Integer(0));
		}
	|	^('>' e1=expr e2=expr) {
			CVal val1 = new CVal($e1.result);
			CVal val2 = new CVal($e2.result);
			if ( val1.compareTo(val2) > 0 )
				$result = new CVal(new Integer(1));
			else $result = new CVal(new Integer(0));
		}
	// math; returns int or double
	// for '+' concatenation, also returns String
	|	^('+' e1=expr e2=expr) {
			CVal val1 = new CVal($e1.result);
			CVal val2 = new CVal($e2.result);
			if (val1.isInt() && val2.isInt()) {
				Integer temp = val1.asInt() + val2.asInt();
				$result = new CVal(temp);
			}
			if (val1.isDouble() && val2.isDouble()) {
				Double temp = val1.asDouble() + val2.asDouble();
				$result = new CVal(temp);
			}
			if (val1.isString() && val2.isString()) {
				String temp = val1.asString() + val2.asString();
				$result = new CVal(temp);
			}
		}
	|	^('-' e1=expr e2=expr) {
			CVal val1 = new CVal($e1.result);
			CVal val2 = new CVal($e2.result);
			if (val1.isInt() && val2.isInt()) {
				Integer temp = val1.asInt() - val2.asInt();
				$result = new CVal(temp);
			}
			if (val1.isDouble() && val2.isDouble()) {
				Double temp = val1.asDouble() - val2.asDouble();
				$result = new CVal(temp);
			}
		}
	|	^('*' e1=expr e2=expr) {
			CVal val1 = new CVal($e1.result);
			CVal val2 = new CVal($e2.result);
			if (val1.isInt() && val2.isInt()) {
				Integer temp = val1.asInt() * val2.asInt();
				$result = new CVal(temp);
			}
			if (val1.isDouble() && val2.isDouble()) {
				Double temp = val1.asDouble() * val2.asDouble();
				$result = new CVal(temp);
			}
		}
	|	^('/' e1=expr e2=expr) {
			CVal val1 = new CVal($e1.result);
			CVal val2 = new CVal($e2.result);
			if (val1.isInt() && val2.isInt()) {
				Integer temp = val1.asInt() / val2.asInt();
				$result = new CVal(temp);
			}
			if (val1.isDouble() && val2.isDouble()) {
				Double temp = val1.asDouble() / val2.asDouble();
				$result = new CVal(temp);
			}
		}
	
	// dot operator - car.color
	|	^('.' e1=expr e2=expr) {
			// Check e1
			// Is e1 a CVal?
			CVal left; // left is the CVal equivalent of the e1,
						// the left side of the . operator
			if ($e1 instanceof CVal) {
				left = $e1;
			}
			// or a function call?
			else if ( $e1.text.isFunctionCall() ) {
				// evalFunction()
				out($e1.text); // FIX LATER
			}
			// or an ID?
			else if ( varMap.containsKey($e1.text) ) {
				left = varMap.get($e1.text);
			}
			
			// Get typename of left
			String type = left.typename();
			
			
			/*
			if (varMap.containsKey($e1.text)) {
				CVal val = varMap.get($e1.text);
				String e2str = $e2.text; // e2str is the name of the attribute
				String e1type = val.typename(); // e1type is the 
				$result = new CVal( (val.value()).(e2str) );
			}
			if (!varMap.containsKey($e1.text)) {
				try {
					$result = ($e1.result).e1;
				} catch (Exception excep) {
					out("Dot expression error");
					excep.printStackTrace();
				}
			}*/
		}
	
	// derived types
	|	datetime { $result = new CVal($datetime.result); }
	|	timeblock { $result = new CVal($timeblock.result); }
	|	dayblock { $result = new CVal($dayblock.result); }
		
	// primary types
	|	INT { $result = new CVal( Integer.parseInt($INT.text) ); }
	|	DOUBLE { $result = new CVal( Double.parseDouble($DOUBLE.text) ); }
	|	ID { $result = varMap.get($ID.text); }
	|	STRING { $result = new CVal( $STRING.text ); }
	|	TIME { $result = new CVal( new Time($TIME.text) ); }
	;
function returns [String functionName, ArrayList<String>]
// i.e. print()
	:	^(PRINT_T print_target*)
	|	^(ID ^(PARAMS argument_expr_list?)) {
			$result = evalFunction($ID.text, $argument_expr_list.result);
		}
	;
print_target
	:	INT { out($INT); }
	|	DOUBLE { out($DOUBLE); }
	|	ID { if (varMap.containsKey($ID.text)) { out((varMap.get($ID.text)).value());} }
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