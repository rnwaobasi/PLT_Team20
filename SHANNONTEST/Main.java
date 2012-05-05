import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

public class Main {
	public static void main(String[] args) throws Exception {
	
		Main getter = new Main();
		// create an instance of the lexer
		CharStream input = new ANTLRFileStream(args[0]);
		ChronosLexer lex = new ChronosLexer(input);
		// wrap a token-stream around the lexer
		CommonTokenStream tokens = new CommonTokenStream(lex);
		// create the parser
		ChronosParser grammar = new ChronosParser(tokens);

	
		final TreeAdaptor adaptor = new CommonTreeAdaptor() {
			public Object create(Token payload) {
				return new CommonTree(payload);
			}
		};
	
		grammar.setTreeAdaptor(adaptor);
		ChronosParser.program_return ret = grammar.program();
		CommonTree tree = (CommonTree)ret.getTree();
	
		getter.printTree(tree, 1);

	}//end of main


	public void printTree(CommonTree t, int indent) {
		if ( t != null ) {
			StringBuffer sb = new StringBuffer(indent);
			for ( int i = 0; i < indent; i++ )
				sb = sb.append("   ");
			for ( int i = 0; i < t.getChildCount(); i++ ) {
				System.out.println(sb.toString() + t.getChild(i).toString());
				printTree((CommonTree)t.getChild(i), indent+1);
			}
		}
	}
}//end of Main.java class
