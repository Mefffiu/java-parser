import antlr.Java8Lexer;
import antlr.Java8Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

public class FileExplorer {
    private final Logger log = LoggerFactory.getLogger(getClass());

    private String inputDirectoryPath;
    private String outputFilePath;
    private DataWriter dataWriter;
    private int parsedFiles;
    private long foundStructures;

    public FileExplorer(String[] args) throws Exception {
        setInputDirectoryPath(args);
        setOutputFilePath(args);
        dataWriter = new DataWriter(this.outputFilePath);
        parsedFiles = 0;
        foundStructures = 0;
    }

    private void setInputDirectoryPath(String[] args) throws Exception {
        if (args.length < 1) {
            throw new Exception("Input directory path is missing.");
        }
        Path inputDirectoryPath = Paths.get(args[0]);
        if (!Files.isDirectory(inputDirectoryPath)) {
            throw new Exception("'" + inputDirectoryPath + "' is not a directory. Please provide valid directory path.");
        }
        this.inputDirectoryPath = inputDirectoryPath.toAbsolutePath().normalize().toString();
    }

    private void setOutputFilePath(String[] args) throws Exception {
        Path outputFilePath;
        if (args.length < 2) {
            // set to default, current location:
            outputFilePath = Paths.get(Paths.get(".").toString(), "output.csv");
        } else {
            outputFilePath = Paths.get(args[1]);
        }
        String normalizedPath = outputFilePath.toAbsolutePath().normalize().toString();
        boolean haveCSVExtension = normalizedPath.endsWith(".csv");
        this.outputFilePath = haveCSVExtension ? normalizedPath : normalizedPath + ".csv";

        try {
            // create not existing directories from path
            Path pathToFile = Paths.get(this.outputFilePath);
            Files.createDirectories(pathToFile.getParent());
        } catch (IOException e) {
            throw new Exception("Cannot create file '" + this.outputFilePath + "'");
        }
    }

    public void parseRepository() {
        log.info("Parsed directory: '" + this.inputDirectoryPath + "'");
        log.info("Output file:      '" + this.outputFilePath + "'");

        exploreDirectory(new File(inputDirectoryPath));

        log.info("Parsed " + parsedFiles + " files");
        log.info("Found " + foundStructures + " structures");
    }

    private void exploreDirectory(File directory) {
        File[] files = Optional.ofNullable(directory.listFiles()).orElse(new File[]{});

        for (File file : files) {
            if (file.isDirectory()) {
                exploreDirectory(file);
            } else {
                parseFile(file);
            }
        }
    }

    private void parseFile(File file) {
        String fileExtension = Optional.of(file.getName())
                .filter(f -> f.contains("."))
                .map(f -> f.substring(file.getName().lastIndexOf(".") + 1).toLowerCase())
                .orElse("");

        boolean isJavaFile = fileExtension.equals("java");

        if (isJavaFile) {
            analyzeFileStructure(file);
        }
    }

    private void analyzeFileStructure(File file) {
        String absolutePath = file.getAbsolutePath();
        log.info("Parse file: '" + absolutePath + "'");
        try {
            CharStream charStream = CharStreams.fromFileName(absolutePath);

            Java8Lexer java8Lexer = new Java8Lexer(charStream);

            CommonTokenStream tokens = new CommonTokenStream(java8Lexer);
            Java8Parser parser = new Java8Parser(tokens);
            ParseTree tree = parser.compilationUnit();

            DataCollector dataCollector = new DataCollector();
            Visitor visitor = new Visitor(dataCollector);
            visitor.visit(tree);

            List<DataRow> dataRows = dataCollector.getDataRows();

            dataWriter.writeData(dataRows);
            parsedFiles++;
            foundStructures += dataRows.size();
        } catch (IOException e) {
            log.warn("Cannot open file: '" + absolutePath + "'");
        }
    }

}
