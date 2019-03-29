import antlr.Java8Lexer;
import antlr.Java8Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {

    private static final List<String> ALLOWED_FILE_EXTENSIONS = Arrays.asList("java", "txt");
    private static final String OUTPUT_FILE_EXTENSION = ".csv";

    private static void analyzeFileStructure(String inputFilePath, String outputFilePath) {
        System.out.println("File: '" + inputFilePath + "':");
        try {
            CharStream charStream = CharStreams.fromFileName(inputFilePath);

            Java8Lexer java8Lexer = new Java8Lexer(charStream);

            CommonTokenStream tokens = new CommonTokenStream(java8Lexer);
            Java8Parser parser = new Java8Parser(tokens);
            ParseTree tree = parser.compilationUnit();

            Visitor visitor = new Visitor();
            visitor.setDirectoryPath(outputFilePath);
            visitor.visit(tree);

            System.out.println("\n\n");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        File inputFile = new File(args[0]);
        String outputFilePath = args[1];

        if (!Files.isDirectory(Paths.get(outputFilePath))) {
            if (!new File(outputFilePath).mkdirs()) {
                throw new SecurityException("Directory creation failed");
            }
        }
        parse(inputFile, outputFilePath);
    }

    private static void parse(File file, String outputFilePath) {
        if (file.isDirectory()) {
            File[] children = file.listFiles();
            if (children != null) {
                for (File child : children) {
                    if (child.isDirectory()) {
                        parseDirectory(child, outputFilePath);
                    } else {
                        parseFile(child, outputFilePath);
                    }
                }
            }
        } else {
            parseFile(file, outputFilePath);
        }
    }

    private static void parseDirectory(File file, String outputFilePath) {
        String directoryName = outputFilePath + "\\" + file.getName();
        Boolean directoryCreated = new File(directoryName).mkdirs();
        if (directoryCreated) {
            parse(file, directoryName);
        }
    }

    private static void parseFile(File file, String outputFilePath) {
        Optional<String> fileExtension = getFileExtension(file.getName());
        if (fileExtension.isPresent() && ALLOWED_FILE_EXTENSIONS.contains(fileExtension.get())) {
            analyzeFileStructure(file.getAbsolutePath(), outputFilePath + "\\" + file.getName().substring(0, file.getName().lastIndexOf(".")) + OUTPUT_FILE_EXTENSION);
        } else {
            System.out.println("Nieobslugiwane rozszerzenie pliku");
        }
    }

    private static Optional<String> getFileExtension(String filename) {
        return Optional.ofNullable(filename)
                .filter(f -> f.contains("."))
                .map(f -> f.substring(filename.lastIndexOf(".") + 1));
    }
}