import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        chronos_antlrLexer lex = new chronos_antlrLexer(new ANTLRFileStream("/Users/shannonlee/PLT_Team20/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        chronos_antlrParser g = new chronos_antlrParser(tokens, 49100, null);
        try {
            g.start_rule();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}