import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        ChronosLexer lex = new ChronosLexer(new ANTLRFileStream("/Users/shannonlee/PLT_Team20/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);


        ChronosParser parser = new ChronosParser(tokens);
        ChronosParser.program_return r = parser.program();
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(r.getTree());


        ChronosTree walker = new ChronosTree(nodes);
        try {
            walker.program();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }

    }

}