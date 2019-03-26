import antlr.Java8BaseVisitor;
import antlr.Java8Parser;

public class Visitor extends Java8BaseVisitor<String> {

    private DataCollector dataCollector = new DataCollector();

    // todo: add more structures?

    @Override
    public String visitImportDeclaration(Java8Parser.ImportDeclarationContext ctx) {
        this.dataCollector.saveDataRow(ctx);
        return super.visitImportDeclaration(ctx);
    }

    @Override
    public String visitClassDeclaration(Java8Parser.ClassDeclarationContext ctx) {
        this.dataCollector.saveDataRow(ctx);
        return super.visitClassDeclaration(ctx);
    }

    @Override
    public String visitMethodDeclaration(Java8Parser.MethodDeclarationContext ctx) {
        this.dataCollector.saveDataRow(ctx);
        return super.visitMethodDeclaration(ctx);
    }

    @Override
    public String visitIfThenStatement(Java8Parser.IfThenStatementContext ctx) {
        this.dataCollector.saveDataRow(ctx);
        return super.visitIfThenStatement(ctx);
    }

    @Override
    public String visitSwitchStatement(Java8Parser.SwitchStatementContext ctx) {
        this.dataCollector.saveDataRow(ctx);
        return super.visitSwitchStatement(ctx);
    }

    @Override
    public String visitWhileStatement(Java8Parser.WhileStatementContext ctx) {
        this.dataCollector.saveDataRow(ctx);
        return super.visitWhileStatement(ctx);
    }

    @Override
    public String visitForStatement(Java8Parser.ForStatementContext ctx) {
        this.dataCollector.saveDataRow(ctx);
        return super.visitForStatement(ctx);
    }

    @Override
    public String visitReturnStatement(Java8Parser.ReturnStatementContext ctx) {
        this.dataCollector.saveDataRow(ctx);
        return super.visitReturnStatement(ctx);
    }

    @Override
    public String visitTryStatement(Java8Parser.TryStatementContext ctx) {
        this.dataCollector.saveDataRow(ctx);
        return super.visitTryStatement(ctx);
    }

    @Override
    public String visitMethodInvocation(Java8Parser.MethodInvocationContext ctx) {
        this.dataCollector.saveDataRow(ctx);
        return super.visitMethodInvocation(ctx);
    }

}
