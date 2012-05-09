tree grammar ChronosTree;

options {
	language = Java;
	tokenVocab = Chronos;
	ASTLabelType = CommonTree;
}

@header {
  import java.util.Map;
  import java.util.TreeMap;
  import java.lang.reflect.*;
  import java.lang.*;
}

@members {
	// TreeMap for storing our variables
 	private Map<String, CVal> varMap = new TreeMap<String, CVal>();
 	private Scheduler sch;
 	
 	// for tracking foreach statements
 	private int count = 0;
	
	// creates the master courselist from input file
	private Courselist makeMasterList(String file) {
		sch = new Scheduler(file);
		return sch.courselist;
	}
	
	// puts an object into the varMap
	private void put(String name, CVal obj) {
		varMap.put(name, obj);
		//debug("Put " + name + " in the map with value " + obj);
		//debug(varMap.toString());
	}
	
	// removes an object from the varMap
	private void rem(String name) {
		varMap.remove(name);
		//debug("Removed " + name + " from the map");
	}
	
	// debug output
	private void debug(String str) {
		out(str);
	}
	
	// shortcut for System.out.println
	private void out(Object obj) {
		System.out.println(obj);
	}
	
	// shortcut for System.err.println
	private void err(String str) {
		System.err.println(str);
	}
	
	// shortcut for getting the string of info about an object
	private String info(String str, CVal obj) {
		String s = str + " = " + obj;
		return s;
	}
	
	// gets rid of surrounding quotes
	private String dequote(String str) {
		return str.substring(1,str.length()-1);
	}
	
	// shortcut for System.out.print
	private void print(Object obj) {
		System.out.print(obj);
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
			if (varMap.containsKey($ID.text)) {
				// if it exists, can't declare again!
				throw new RuntimeException("you've already declared " + $ID.text);
			}
			else {
				// with schedule and courselist,
				// every declaration is an instantiator of an empty object
				if ($type_specifier.text.equals("schedule")) {
					put($ID.text, new CVal(new Schedule($ID.text)));
				}
				else if ($type_specifier.text.equals("courselist")) {
					put($ID.text, new CVal(new Courselist($ID.text)));
				}
				// but with primitives, such as int, declarators are
				// simply declarators (null value)
				else {
					put($ID.text, null);
				}
			}
		}
	;
instantiator
	:	^(INST ^('=' ID expr)) {
			if (varMap.containsKey($ID.text)) {
				// if it exists, can't instantiate (or declare) again!
				throw new RuntimeException("you've already declared " + $ID.text);
			}
			else {
				put($ID.text, $expr.result);
			}
		}
	;
stmt:	expr
	|	^('=' e1=expr e2=expr) {
			// if e1 has a dot function:		
			if ($e1.result instanceof CVal ||
				$e1.result == null) {
				CVal val1 = $e1.result; // e1.result is a CVal already
				CVal val2 = $e2.result;
				// *****check if typenames of e1 and e2 are the same?
				if (varMap.containsKey($e1.text)) { // look for it in varMap
					put($e1.text, $e2.result); // put in its value
				}
				else {
					throw new RuntimeException($e1.text + " is not declared");
				}
			}
			else {
				throw new RuntimeException("invalid left hand side expression");
			}
		}
	|	selection_stmt
	|	iteration_stmt
	|	jump_stmt
	;
selection_stmt
@init{
	int t = 0;
	int e = 0;
	int end = 0;
	CommonTreeNodeStream stream = (CommonTreeNodeStream)input;
	boolean condIsTrue;
}
@after {
	if (condIsTrue) {
		stream.push(t);
		//debug(stream.toString(t, end));
		then_stmt();
		//stream.pop();
		//stream.push(end);
	}
	else {
		stream.push(e);
		else_stmt();
	}
	stream.pop();
}
	:	^(COND expr {
			condIsTrue = $expr.result.getBool();
		}
		{ t = input.mark(); }.
		{ e = input.mark(); }. )
	;
then_stmt
	:	^(THEN (line)*)
	;
else_stmt
	:	^(ELSE_T line*)
	;
iteration_stmt // only works on Courses!
@init {
	int mark = input.mark();
	int length;
	String c;
}
@after {
	// compare length with count
	if (count < length) {
		input.seek(mark);
	}
	else {
		// remove the temp var c from the varMap
		rem(c);
		count = 0;
	}
}
	:	^(FOREACH_T ^(IN_T element=ID list=ID) {
			// get length of list
			CVal listval = varMap.get($list.text);
			Courselist mylist = listval.asCourselist();
			length = mylist.numCourses();
			// get the current course object as a CVal
			CVal courseval = new CVal(mylist.courses.get(count));
			// put this course CVal into the varMap under the temp name $element
			c = $element.text;
			put(c, courseval);
			// increment count
			count += 1;
		}
		^(BLOCK lines=line*))
	;
jump_stmt // TO DO!
	:	BREAK_T //{ break; } // this is my break
	;
expr returns [CVal result]
	// logical; returns 1 or 0
	:	^(OR e1=expr e2=expr) {
			CVal val1 = $e1.result;
			CVal val2 = $e2.result;
			/* if e1 and e2 are boolean expressions, 
			then this operation is legal */
			if (val1.isBool() && val2.isBool()) {
				$result = (val1.getBool() || val2.getBool())? new CVal(new Integer(1))
															: new CVal(new Integer(0));
			}
			else {
				throw new RuntimeException("Cannot perform OR operation on non-boolean expressions");
			}
		}
	|	^(AND e1=expr e2=expr) {
			CVal val1 = $e1.result;
			CVal val2 = $e2.result;
			if (val1.isBool() && val2.isBool()) {
				$result = (val1.getBool() && val2.getBool())? new CVal(new Integer(1))
															: new CVal(new Integer(0));
			}
			else {
				throw new RuntimeException("Cannot perform AND operation on non-boolean expressions");
			}
		}
	|	^(NOT e=expr) {
			CVal val = $e.result;
			if (val.isBool()) {
				$result = (!val.getBool())? new CVal(new Integer(1))
										  : new CVal(new Integer(0));
			}
			else {
				throw new RuntimeException("Cannot perform NOT operation on non-boolean expressions");
			}
		}
	// relative; returns 1 or 0
	|	^(EQ e1=expr e2=expr) {
			CVal val1 = $e1.result;
			CVal val2 = $e2.result;
			if ( val1.compareTo(val2) == 0 )
				$result = new CVal(new Integer(1));
			else $result = new CVal(new Integer(0));
		}
	|	^(NEQ e1=expr e2=expr) {
			CVal val1 = $e1.result;
			CVal val2 = $e2.result;
		if ( val1.compareTo(val2) == 0 )
				$result = new CVal(new Integer(1));
			else $result = new CVal(new Integer(0));
		}
	|	^(GEQ e1=expr e2=expr) {
			CVal val1 = $e1.result;
			CVal val2 = $e2.result;
		if ( val1.compareTo(val2) == 0 || val1.compareTo(val2) == 1 )
				$result = new CVal(new Integer(1));
			else $result = new CVal(new Integer(0));
		}
	|	^(LEQ e1=expr e2=expr) {
			CVal val1 = $e1.result;
			CVal val2 = $e2.result;
			if ( val1.compareTo(val2) == 0 || val1.compareTo(val2) == -1 )
				$result = new CVal(new Integer(1));
			else $result = new CVal(new Integer(0));
		}
	|	^('<' e1=expr e2=expr) {
			CVal val1 = $e1.result;
			CVal val2 = $e2.result;
			if ( val1.compareTo(val2) < 0 )
				$result = new CVal(new Integer(1));
			else $result = new CVal(new Integer(0));
		}
	|	^('>' e1=expr e2=expr) {
			CVal val1 = $e1.result;
			CVal val2 = $e2.result;
			if ( val1.compareTo(val2) > 0 )
				$result = new CVal(new Integer(1));
			else $result = new CVal(new Integer(0));
		}
	// math; returns int or double
	// for '+' concatenation, also returns String
	|	^('+' e1=expr e2=expr) {
			CVal val1 = $e1.result;
			CVal val2 = $e2.result;
			//debug( "ADDING: " + info($e1.text, val1) + " ; " + info($e2.text, val2) );
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
			// convert other object to string if one term is already a string
			if (val1.isString()) {
				String temp = val1.asString() + val2.toString();
				$result = new CVal(temp);
			}
			if (val2.isString()) {
				String temp = val1.toString() + val2.asString();
				$result = new CVal(temp);
			}
		}
	|	^('-' e1=expr e2=expr) {
			CVal val1 = $e1.result;
			CVal val2 = $e2.result;
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
			CVal val1 = $e1.result;
			CVal val2 = $e2.result;
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
			CVal val1 = $e1.result;
			CVal val2 = $e2.result;
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
			// CHECK e1 (LEFT of dot)
			// Is e1 a CVal?
			CVal left = null; // left is the CVal equivalent of e1
			if ($e1.result instanceof CVal) {
				left = $e1.result;
				// Is it also an ID? (in the varMap?)
				if ( varMap.containsKey($e1.text) ) {
					left = varMap.get($e1.text);
				}
			}
			// or a func call? NEVER HAPPENS
			
			// CHECK e2 (RIGHT of dot)
			// Is e2 a function?
			if ($e2.result != null && $e2.result.isFunction()) {
				Function rightf = $e2.result.asFunction();
				try {
					// get typename of left
					Class cls = Class.forName(left.typename());
					// get methods of left
					if (rightf.params != null) { 
						Class[] classparams = new Class[rightf.params.size()];
						for (int i = 0; i < classparams.length; i++) {
							String type = rightf.params.get(i).typename();
							if (!type.equals("String")) {
								classparams[i] = Class.forName(type);
								//debug("The param currently is " + classparams[i]);
							}
							else {
								classparams[i] = Class.forName("java.lang.String");
							}
						}
						Method m = cls.getMethod(rightf.name, classparams);
						//debug(m.toGenericString());
						
						$result = new CVal(m.invoke(left.value(), rightf.params.get(0).value()));
					}
					else {
						Method m = cls.getMethod(rightf.name, new Class[0]);
						$result = new CVal(m.invoke(left.value())); // no params
					}
				} catch (Exception excep) { excep.printStackTrace(); }
			}
			// If not, then e2 must be a field
			else {
				try {
					// get typename of left
					Class cls = Class.forName(left.typename());
					Field[] fs = cls.getDeclaredFields();
					for (Field f : fs) {
						if (f.getName().equals($e2.text)) {
							$result = new CVal(f.get(left.value()));
						}
					}
				} catch (Exception excep) { excep.printStackTrace(); }
			}
		}
	
	// derived types
	|	datetime { $result = new CVal($datetime.result); }
	|	timeblock { $result = new CVal($timeblock.result); }
	|	dayblock { $result = new CVal($dayblock.result); }
	|	function {
			Function func = $function.result;
			// PRINT FUNCTION
			/* using commas in between print params is equivalent
			to the + operator in java */ 
			if (func.params != null && func.name.equals("print")) {
				for (int i=0; i<func.params.size(); i++) {
					CVal c = func.params.get(i);
					print(c);
					if (i==func.params.size()-1)
						out(""); // end with newline
					else
						print(" "); // separator between print params
				}
			}
			// GENERATECOURSES FUNCTION
			if (func.name.contains("generateCourses")) {
				try {
					CVal filename = func.params.get(0);
					Courselist master = makeMasterList(filename.asString());
					$result = new CVal(master);
				} catch (NullPointerException exception) {
					throw new RuntimeException("No filename specified!");
				}
			}
			else { $result = new CVal(func); }
		}
		
	// primary types
	|	INT { $result = new CVal( Integer.parseInt($INT.text) ); }
	|	DOUBLE { $result = new CVal( Double.parseDouble($DOUBLE.text) ); }
	|	ID { $result = varMap.get($ID.text); }
	|	STRING { $result = new CVal( dequote($STRING.text) ); }
	|	TIME { $result = new CVal( new Time($TIME.text) ); }
	;
function returns [Function result]
// i.e. print()
	:	^(ID ^(PARAMS argument_expr_list?)) {
			$result = new Function($ID.text, $argument_expr_list.result);
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
			$result = new Timeblock(new Time($a.text), new Time($b.text));
		}
	;
dayblock returns [Dayblock result]
// i.e. [M,W,F]
@init { $result = new Dayblock(); }
	:	^( DAYBLOCK_T (DAY {
			char daychar = ($DAY.text).charAt(0);
			try{$result.add(daychar);}
			catch (Exception e1) {out("Can't add this day");}
		})+ )
	;
argument_expr_list returns [ArrayList<CVal> result]
@init { $result = new ArrayList<CVal>(); }
	:	(expr {$result.add($expr.result);})+
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
