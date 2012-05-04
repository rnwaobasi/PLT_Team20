tree grammar TestTree;

options {
	tokenVocab = Test;
	ASTLabelType = CommonTree;
}

program
	:	line+
	;
line:	/*print_function ';'
	|*/	int_assignment
	;
/*print_function
	:	^(PRINT STRING)
	;*/
int_assignment
	:	^('=' ID INT){System.out.println($ID.text);}
	;