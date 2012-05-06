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
	:	line+
	;
line:	print_function
	|	int_assignment {
				out("This line is about " + $int_assignment.text);
				out("int_assignment itself is " + $int_assignment.text);
				}
	|	timeblock_inst
	;
print_function
	:	^(PRINT STRING) {print($STRING.text);
						out("STRING is " + STRING);
						out(STRING + "AGAIN");}
	;
int_assignment returns [int result]
	:	^('=' ID INT){
					out($ID.text + " = " + $INT.text);
					$result = toInt($INT) + 1;
					out($ID.text + " + 1 = " + $result);
					out("INT is " + $INT);
					out("ID is " + $ID);
					}
	;
timeblock_inst
@init {
	int len = 0;
	int mark = input.mark();
}
@after {
	out("THIS IS LEN " + len);
	if (len < 5) {
		input.rewind(mark);
	}
}
	:	^('=' TIMEBLOCK ID timeblock) {
	len++;
	out("Timeblock = " + $timeblock.result);
	}
	;
timeblock returns [Timeblock result]
	:	^(TIMES a=TIME b=TIME) {
		try {
		$result = new Timeblock(new Time("5:00"), new Time("6:00"));
		} catch (Exception e) {
			out("fo real?");
		}
		}
	;