import antlr.Java8BaseVisitor;
import antlr.Java8Parser;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Visitor extends Java8BaseVisitor<String> {

    private String getCode(ParseTree ctx) {
        if (ctx instanceof TerminalNode) {
            TerminalNode node = (TerminalNode) ctx;

            int start = node.getSymbol().getStartIndex();
            int stop = node.getSymbol().getStopIndex();

            TokenSource tokenSource = node.getSymbol().getTokenSource();
            String tokenContext = tokenSource.getInputStream().getText(new Interval(start, stop + 1));

            String text = ctx.getText();
            char next = tokenContext.charAt(tokenContext.length() - 1);
            if (next == ' ') text = text + " ";

            return text;
        }

        if (ctx.getChildCount() == 0) {
            // if my reasoning is correct this should never be called
            throw new Error("Unexpected error!");
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            builder.append(getCode(ctx.getChild(i)));
        }

        return builder.toString();
    }

    @Override
    public String visitMethodDeclaration(Java8Parser.MethodDeclarationContext ctx) {
        System.out.println("Method: '" + ctx.getText() + '\'');
        System.out.println("      : '" + getCode(ctx) + '\'');
        System.out.println('\n');

        return super.visitMethodDeclaration(ctx);
    }

    @Override
    public String visitClassDeclaration(Java8Parser.ClassDeclarationContext ctx) {
        System.out.println("Class: '" + ctx.getText() + '\'');
        System.out.println("     : '" + getCode(ctx) + '\'');
        System.out.println('\n');

        return super.visitClassDeclaration(ctx);
    }

    @Override
    public String visitStatement(Java8Parser.StatementContext ctx) {
        System.out.println("Statement: '" + ctx.getText() + '\'');
        System.out.println("         : '" + getCode(ctx) + '\'');
        System.out.println('\n');

        return super.visitStatement(ctx);
    }

}
