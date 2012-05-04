tree grammar ChronosTree;

options {
	language = Java;
	tokenVocab = Chronos;
	ASTLabelType = CommonTree;
}

@header {
  import java.util.Map;
  import java.util.HashMap;
}

@members {
  /*private Map<String, Function> functionMap = new TreeMap<String, Function>();
  private Map<String, Double> variableMap = new TreeMap<String, Double>();
  
  private void define(Function function) {
  	functionMap.put(function.getName(), function);
  }
  
  // retreives a Course from function Map whose name
  // matches the text of a given AST tree node
  private Function getFunction(CommonTree nameNode) {
  	String name = nameNode.getText();
  	Function function = functionMap.get(name);
  	if (function == null) {
  		String msg = "The function \"" + name + "\" is not defined.";
  		throw new RuntimeException(msg);
  	}
  	return function;
  }
  
  // This evaluates a function whose name matches the text
  // of a given AST tree node for a given value.
  private double evalFunction(CommonTree nameNode, double value) {
    return getFunction(nameNode).getValue(value);
  }

  // This retrieves the value of a variable from our variable Map
  // whose name matches the text of a given AST tree node.
  private double getVariable(CommonTree nameNode) {
    String name = nameNode.getText();
    Double value = variableMap.get(name);
    if (value == null) {
      String msg = "The variable \"" + name + "\" is not set.";
      throw new RuntimeException(msg);
    }
    return value;
  }
*/
  // This just shortens the code for print calls.
  private static void out(Object obj) {
    System.out.print(obj);
  }
  
  // This just shortens the code for println calls.
  private static void outln(Object obj) {
    System.out.println(obj);
  }

  // This converts the text of a given AST node to a double.
  private double toDouble(CommonTree node) {
    double value = 0.0;
    String text = node.getText();
    try {
      value = Double.parseDouble(text);
    } catch (NumberFormatException e) {
      throw new RuntimeException("Cannot convert \"" + text + "\" to a double.");
    }
    return value;
  }
  
  // This replaces all escaped newline characters in a String
  // with unescaped newline characters.
  // It is used to allow newline characters to be placed in
  // literal Strings that are passed to the print command.
  private static String unescape(String text) {
    return text.replaceAll("\\\\n", "\n");
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
	;
expr:	^(OR and_expr and_expr)
	|	assignment_expr
	;
assignment_expr
	:	^('=' ID expr)
	;
and_expr
	:	equiv_expr
	|	^(AND equiv_expr equiv_expr)
	;
equiv_expr
	:	rel_expr
	|	^((EQ | NEQ) rel_expr rel_expr)
	;
rel_expr
	:	math_expr
	|	^(('<' | '>' | GEQ | LEQ) math_expr math_expr)
	|	datetime
	;
math_expr
	:	math_term
	|	^(('+' | '-') math_term math_term)
	;
math_term
	:	unary_expr
	|	^(('*' | '/') unary_expr unary_expr)
	|	timeblock
	;
unary_expr
	:	postfix_expr
	|	^('.' postfix_expr postfix_expr)
	|	^(NOT postfix_expr)
	;
postfix_expr //returns [int result]
// matches functions or variables
	:	^(primary_expr function_parens?)
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
primary_expr
	:	constant
	|	ID { out($ID.text); }
	|	STRING
	|	TIME
	|	expr
	;
argument_expr_list
	:	expr+
	;
constant returns [double value]
	:	INT {$value = toDouble($INT);}
	|	FLOAT {$value = toDouble($FLOAT);}
	;
type_specifier returns [String type]
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