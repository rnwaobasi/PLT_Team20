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
	
	// shortcut general print method
	private void out(String str) {
		System.out.println(str);
	}

	// for print statements
	// gets rid of the surrounding quotes
	private void print(String str) {
		int oneBeforeEnd = str.length()-1;
		String noQuotes = str.substring(1,oneBeforeEnd);
		out(noQuotes);
	}
}

program
	:	lines+=line+ {out($lines+.text);}
	;
line:	print_function
	|	int_assignment {out("This line is about " + $int_assignment.result);}
	|	timeblock_inst
	|	and_stmt
	;
print_function
	:	^(PRINT STRING) {print($STRING.text);}
	;
int_assignment returns [int result]
	:	^('=' ID INT){
					out($ID.text + " = " + $INT.text);
					$result = toInt($INT) + 1;
					out($ID.text + " + 1 = " + $result);
					}
	;
timeblock_inst
	:	^('=' TIMEBLOCK ID timeblock) {out("Timeblock = " + $timeblock.result);}
	;
timeblock returns [Timeblock result]
	:	^(TIMES a=TIME b=TIME) {
		$result = new Timeblock($a.text, $b.text);
		}
	;
and_stmt
	:	^('&' ID ID)
	;
