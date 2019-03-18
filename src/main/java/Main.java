import antlr.Java8Lexer;
import antlr.Java8Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {
    private static final String inputDir = "src/main/resources/input/";

    private static void analyzeFileStructure(String filename) {
        System.out.println("File: '" + filename + "':");
        try {
            CharStream charStream = CharStreams.fromFileName(inputDir + filename);

            Java8Lexer java8Lexer = new Java8Lexer(charStream);

            CommonTokenStream tokens = new CommonTokenStream(java8Lexer);
            Java8Parser parser = new Java8Parser(tokens);
            ParseTree tree = parser.compilationUnit();

            Visitor visitor = new Visitor();
            visitor.visit(tree);

            System.out.println("\n\n");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        analyzeFileStructure("Main.java");
        analyzeFileStructure("NWD.java");
    }

}
