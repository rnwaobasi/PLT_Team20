tree grammar chronosTreeGram;

options {
	language = Java;
	tokenVocab = chronos_antlr;
	ASTLabelType = CommonTree;
}

@header {
  package a.b.c;
  import java.util.Map;
  import java.util.HashMap;
}

@members {
  private Map<String, Integer> variables = new HashMap<String, Integer>();
}

add_expr returns [int result]
	:	^('+' op1=mult_expr op2=mult_expr) {result = op1 + op2;}
	|	
	;
mult_expr returns [int result]
	:	^('*' op1=INT op2=INT) {result = Integer.parseInt(op1.text) * Integer.parseInt(op2.text);}
	;

/*start_rule returns [int result]
	:	translation_unit EOF
	;
	
translation_unit returns [int result]
	:	^(DECL type_specifier ID)
	;
	
declarator
	:	^(DECL type_specifier ID)
	;*/
