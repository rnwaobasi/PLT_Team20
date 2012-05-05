import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

public class Main {
	public static void main(String[] args) throws Exception {
		// create an instance of the lexer
		CharStream input = new ANTLRFileStream(args[0]);
		TestLexer lex = new TestLexer(input);
		// wrap a token-stream around the lexer
		CommonTokenStream tokens = new CommonTokenStream(lex);
		// create the parser
		TestParser parser = new TestParser(tokens);
		// invoke the entry point of the parser
		TestParser.program_return r = parser.program();
		System.out.println("tree="+((Tree)r.tree).toStringTree());
		//CommonTree tree = (CommonTree)r.getTree();
		// generate a DOT image of the tree
		//DOTTreeGenerator gen = new DOTTreeGenerator();
		//StringTemplate st = gen.toDOT(tree);
		//System.out.println(st);

		if ( parser.getNumberOfSyntaxErrors()>0 ) {
			// don't tree parse if has errors
			return;
		}
        	CommonTreeNodeStream nodes = new CommonTreeNodeStream((Tree)r.tree);
		nodes.setTokenStream(tokens);
		TestTree walker = new TestTree(nodes);
		walker.program();

	}
}
