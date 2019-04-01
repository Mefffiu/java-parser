import antlr.Java8BaseVisitor;
import antlr.Java8Parser;

public class Visitor extends Java8BaseVisitor<String> {

    private DataCollector dataCollector;

    public Visitor(DataCollector dataCollector) {
        this.dataCollector = dataCollector;
    }

    @Override
    public String visitMethodInvocation(Java8Parser.MethodInvocationContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitMethodInvocation(ctx);
    }

    @Override
    public String visitTryWithResourcesStatement(Java8Parser.TryWithResourcesStatementContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitTryWithResourcesStatement(ctx);
    }

    @Override
    public String visitCatchClause(Java8Parser.CatchClauseContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitCatchClause(ctx);
    }

    @Override
    public String visitTryStatement(Java8Parser.TryStatementContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitTryStatement(ctx);
    }

    @Override
    public String visitReturnStatement(Java8Parser.ReturnStatementContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitReturnStatement(ctx);
    }

    @Override
    public String visitForStatement(Java8Parser.ForStatementContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitForStatement(ctx);
    }

    @Override
    public String visitDoStatement(Java8Parser.DoStatementContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitDoStatement(ctx);
    }

    @Override
    public String visitWhileStatement(Java8Parser.WhileStatementContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitWhileStatement(ctx);
    }

    @Override
    public String visitSwitchStatement(Java8Parser.SwitchStatementContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitSwitchStatement(ctx);
    }

    @Override
    public String visitIfThenElseStatement(Java8Parser.IfThenElseStatementContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitIfThenElseStatement(ctx);
    }

    @Override
    public String visitIfThenStatement(Java8Parser.IfThenStatementContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitIfThenStatement(ctx);
    }

    @Override
    public String visitConstantDeclaration(Java8Parser.ConstantDeclarationContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitConstantDeclaration(ctx);
    }

    @Override
    public String visitInterfaceDeclaration(Java8Parser.InterfaceDeclarationContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitInterfaceDeclaration(ctx);
    }

    @Override
    public String visitEnumDeclaration(Java8Parser.EnumDeclarationContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitEnumDeclaration(ctx);
    }

    @Override
    public String visitConstructorDeclaration(Java8Parser.ConstructorDeclarationContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitConstructorDeclaration(ctx);
    }

    @Override
    public String visitMethodDeclaration(Java8Parser.MethodDeclarationContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitMethodDeclaration(ctx);
    }

    @Override
    public String visitClassMemberDeclaration(Java8Parser.ClassMemberDeclarationContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitClassMemberDeclaration(ctx);
    }

    @Override
    public String visitClassDeclaration(Java8Parser.ClassDeclarationContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitClassDeclaration(ctx);
    }

    @Override
    public String visitPackageDeclaration(Java8Parser.PackageDeclarationContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitPackageDeclaration(ctx);
    }

    @Override
    public String visitImportDeclaration(Java8Parser.ImportDeclarationContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitImportDeclaration(ctx);
    }
}
