tree grammar TestTree;

options {
	tokenVocab = Test;
	ASTLabelType = CommonTree;
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
	
	private void out(String str) {
		System.out.println(str);
	}
}

program
	:	line+
	;
line:	print_function
	|	int_assignment {out("This line is about " + $int_assignment.result);}
	;
print_function
	:	^(PRINT STRING)
	;
int_assignment returns [int result]
	:	^('=' ID INT){
					out($ID.text + " = " + $INT.text);
					$result = toInt($INT) + 1;
					out($ID.text + " + 1 = " + $result);
					}
	;