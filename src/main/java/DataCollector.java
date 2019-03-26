import antlr.Java8Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;

public class DataCollector {

    private static final Map<Class, String> structures = new HashMap<>();

    static {
        // todo: map all recognizable structures
        structures.put(Java8Parser.ClassDeclarationContext.class, "class_declaration");
        structures.put(Java8Parser.MethodDeclarationContext.class, "method_declaration");
        structures.put(Java8Parser.MethodInvocationContext.class, "method_invocation");
        structures.put(Java8Parser.ImportDeclarationContext.class, "import_declaration");
        structures.put(Java8Parser.IfThenStatementContext.class, "if_then_statement");
        structures.put(Java8Parser.ForStatementContext.class, "for_statement");
        structures.put(Java8Parser.TryStatementContext.class, "try_statement");
        structures.put(Java8Parser.WhileStatementContext.class, "while_statement");
    }


    private static String findCodeFragment(ParseTree ctx) {
        if (ctx instanceof TerminalNode) {
            TerminalNode node = (TerminalNode) ctx;

            int nextCharIndex = node.getSymbol().getStopIndex() + 1;

            String text = ctx.getText();
            TokenSource tokenSource = node.getSymbol().getTokenSource();
            CharStream charStream = tokenSource.getInputStream();
            String nextChars = charStream.getText(new Interval(nextCharIndex, nextCharIndex));
            char nextChar = nextChars.length() > 0 ? nextChars.charAt(0) : '_';

            return Character.isWhitespace(nextChar) ? text + " " : text;
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            builder.append(findCodeFragment(ctx.getChild(i)));
        }

        return builder.toString();
    }

    private static String findContext(ParseTree ctx) {
        for (ParseTree node = ctx.getParent(); node != null; node = node.getParent()) {
            for (Class structureClass : structures.keySet()) {
                if (node.getClass().equals(structureClass)) {
                    return structures.get(structureClass);
                }
            }
        }
        return null;
    }

    public void saveDataRow(Class structureClass, ParseTree ctx) {
        DataRow dataRow = new DataRow();
        dataRow.setLabel(structures.get(structureClass));
        dataRow.setContext(findContext(ctx));
        dataRow.setCodeFragment(findCodeFragment(ctx).trim());

        // todo: save to file, collection
        System.out.println(dataRow.toString());
    }

}
