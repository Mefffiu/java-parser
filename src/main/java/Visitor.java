import antlr.Java8BaseVisitor;
import antlr.Java8Parser;

public class Visitor extends Java8BaseVisitor<String> {

    private DataCollector dataCollector = new DataCollector();

    // todo: add more structures?

    @Override
    public String visitMethodDeclaration(Java8Parser.MethodDeclarationContext ctx) {
        this.dataCollector.saveDataRow(Java8Parser.MethodDeclarationContext.class, ctx);
        return super.visitMethodDeclaration(ctx);
    }

    @Override
    public String visitClassDeclaration(Java8Parser.ClassDeclarationContext ctx) {
        this.dataCollector.saveDataRow(Java8Parser.ClassDeclarationContext.class, ctx);
        return super.visitClassDeclaration(ctx);
    }

    @Override
    public String visitMethodInvocation(Java8Parser.MethodInvocationContext ctx) {
        this.dataCollector.saveDataRow(Java8Parser.MethodInvocationContext.class, ctx);
        return super.visitMethodInvocation(ctx);
    }

    @Override
    public String visitImportDeclaration(Java8Parser.ImportDeclarationContext ctx) {
        this.dataCollector.saveDataRow(Java8Parser.ImportDeclarationContext.class, ctx);
        return super.visitImportDeclaration(ctx);
    }

    @Override
    public String visitTryStatement(Java8Parser.TryStatementContext ctx) {
        this.dataCollector.saveDataRow(Java8Parser.TryStatementContext.class, ctx);
        return super.visitTryStatement(ctx);
    }

    @Override
    public String visitIfThenStatement(Java8Parser.IfThenStatementContext ctx) {
        this.dataCollector.saveDataRow(Java8Parser.IfThenStatementContext.class, ctx);
        return super.visitIfThenStatement(ctx);
    }

    @Override
    public String visitForStatement(Java8Parser.ForStatementContext ctx) {
        this.dataCollector.saveDataRow(Java8Parser.ForStatementContext.class, ctx);
        return super.visitForStatement(ctx);
    }

    @Override
    public String visitWhileStatement(Java8Parser.WhileStatementContext ctx) {
        this.dataCollector.saveDataRow(Java8Parser.WhileStatementContext.class, ctx);
        return super.visitWhileStatement(ctx);
    }

    @Override
    public String visitSwitchStatement(Java8Parser.SwitchStatementContext ctx) {
        this.dataCollector.saveDataRow(Java8Parser.SwitchStatementContext.class, ctx);
        return super.visitSwitchStatement(ctx);
    }

    @Override
    public String visitReturnStatement(Java8Parser.ReturnStatementContext ctx) {
        this.dataCollector.saveDataRow(Java8Parser.ReturnStatementContext.class, ctx);
        return super.visitReturnStatement(ctx);
    }

}
