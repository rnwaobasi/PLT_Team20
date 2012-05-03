import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class Main {
	public static void main(String[] args) throws Exception {
		CharStream input = new ANTLRFileStream(args[0]);
		ChronosLexer lex = new ChronosLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lex);
		System.out.println("tokens="+tokens);
		ChronosParser parser = new ChronosParser(tokens);
		ChronosParser.program_return r = parser.program();
		System.out.println("tree="+((Tree)r.tree).toStringTree());

		if ( parser.getNumberOfSyntaxErrors()>0 ) {
			// don't tree parse if has errors
			return;
		}
        	CommonTreeNodeStream nodes = new CommonTreeNodeStream((Tree)r.tree);
		nodes.setTokenStream(tokens);
		ChronosTree walker = new ChronosTree(nodes);
		walker.program();

	}
}
