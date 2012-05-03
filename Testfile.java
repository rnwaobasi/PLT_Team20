import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenStream;

public class Testfile {
	public static void main(String[] args) {
		CharStream charStream = new ANTLRStringStream("new schedule sched;");
		chronos_antlrLexer lexer = new chronos_antlrLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		chronos_antlrParser parser = new chronos_antlrParser(tokenStream);
		try {
		parser.start_rule();
		} catch (Exception e) {
				System.out.println("Fail");
		}
		System.out.println("done!");
	}
}
