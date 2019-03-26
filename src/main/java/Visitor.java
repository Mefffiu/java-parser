import antlr.Java8BaseVisitor;
import antlr.Java8Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;

public class Visitor extends Java8BaseVisitor<String> {

    private static Map<String, Class> structures = new HashMap<>();

    static {
        structures.put("Class", Java8Parser.ClassDeclarationContext.class);
        structures.put("Method", Java8Parser.MethodDeclarationContext.class);
    }

    private static String processContext(ParseTree ctx) {
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
            builder.append(processContext(ctx.getChild(i)));
        }

        return builder.toString();
    }


    private static String getCodeFragment(ParseTree ctx, String label) {
        DataRow dataRow = new DataRow();

        ParseTree parent = ctx.getParent();
        String parentLabel = null;
        while (parent != null) {
//            System.out.println("    Node: " + parent.getClass().getName());
            Class clazz = Java8Parser.ClassDeclarationContext.class;

            for (String structure : structures.keySet()) {
                if (parent.getClass().equals(structures.get(structure))) {
//                    System.out.println("   >Context found: " + parent.getText());
                    parentLabel = structure;
                    break;
                }
            }

            if (parentLabel != null) break;

            parent = parent.getParent();
        }

        String codeFragment = processContext(ctx).trim();

        dataRow.setLabel(label);
        dataRow.setContext(parentLabel);
        dataRow.setCodeFragment(codeFragment);
        System.out.println("    " + dataRow.toString());

        return codeFragment;
    }

    @Override
    public String visitMethodDeclaration(Java8Parser.MethodDeclarationContext ctx) {
        System.out.println("Method: '" + getCodeFragment(ctx, "Method") + "'");
        return super.visitMethodDeclaration(ctx);
    }

    //    @Override
//    public String visitClassDeclaration(Java8Parser.ClassDeclarationContext ctx) {
//        System.out.println("Class: '" + getCodeFragment(ctx) + "'");
//        return super.visitClassDeclaration(ctx);
//    }
//
    @Override
    public String visitMethodInvocation(Java8Parser.MethodInvocationContext ctx) {
        System.out.println("MethodInvocation: '" + getCodeFragment(ctx, "MethodInvocation") + "'");
        return super.visitMethodInvocation(ctx);
    }

    @Override
    public String visitImportDeclaration(Java8Parser.ImportDeclarationContext ctx) {
        System.out.println("Import: '" + getCodeFragment(ctx, "Class") + "'");
        return super.visitImportDeclaration(ctx);
    }

//    @Override
//    public String visitTryStatement(Java8Parser.TryStatementContext ctx) {
//        System.out.println("Try: '" + getCodeFragment(ctx) + "'");
//        return super.visitTryStatement(ctx);
//    }
//
//    @Override
//    public String visitIfThenStatement(Java8Parser.IfThenStatementContext ctx) {
//        System.out.println("If: '" + getCodeFragment(ctx) + "'");
//        return super.visitIfThenStatement(ctx);
//    }
//
//    @Override
//    public String visitForStatement(Java8Parser.ForStatementContext ctx) {
//        System.out.println("For loop: '" + getCodeFragment(ctx) + "'");
//        return super.visitForStatement(ctx);
//    }
//
//    @Override
//    public String visitWhileStatement(Java8Parser.WhileStatementContext ctx) {
//        System.out.println("While loop: '" + getCodeFragment(ctx) + "'");
//        return super.visitWhileStatement(ctx);
//    }
//
//    @Override
//    public String visitSwitchStatement(Java8Parser.SwitchStatementContext ctx) {
//        System.out.println("Switch: '" + getCodeFragment(ctx) + "'");
//        return super.visitSwitchStatement(ctx);
//    }
//
//    @Override
//    public String visitReturnStatement(Java8Parser.ReturnStatementContext ctx) {
//        System.out.println("Return: '" + getCodeFragment(ctx) + "'");
//        return super.visitReturnStatement(ctx);
//    }

}
