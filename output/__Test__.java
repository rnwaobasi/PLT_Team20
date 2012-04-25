import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;

import test.*;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        antlr_testLexer lex = new antlr_testLexer(new ANTLRFileStream("/Users/shannonlee/PLT_Team20/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        antlr_testParser g = new antlr_testParser(tokens, 49100, null);
        try {
            g.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}