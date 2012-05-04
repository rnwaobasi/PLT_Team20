import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        TestLexer lex = new TestLexer(new ANTLRFileStream("/Users/shannonlee/PLT_Team20/TEST/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);


        TestParser parser = new TestParser(tokens);
        TestParser.program_return r = parser.program();
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(r.getTree());


        TestTree walker = new TestTree(nodes);
        try {
            walker.program();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }

    }

}