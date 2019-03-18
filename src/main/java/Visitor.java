import antlr.Java8BaseVisitor;
import antlr.Java8Parser;

public class Visitor extends Java8BaseVisitor<String> {

    @Override
    public String visitMethodDeclaration(Java8Parser.MethodDeclarationContext ctx) {
        System.out.println("Method: " + ctx.getText());
        return super.visitMethodDeclaration(ctx);
    }

    @Override
    public String visitClassDeclaration(Java8Parser.ClassDeclarationContext ctx) {
        System.out.println("Class: " + ctx.getText());
        return super.visitClassDeclaration(ctx);
    }

    @Override
    public String visitStatement(Java8Parser.StatementContext ctx) {
        System.out.println("Statement: " + ctx.getText());
        return super.visitStatement(ctx);
    }

}
