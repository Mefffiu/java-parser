import antlr.Java8BaseVisitor;
import antlr.Java8Parser;

public class Visitor extends Java8BaseVisitor<String> {

    private DataCollector dataCollector;

    public Visitor(DataCollector dataCollector) {
        this.dataCollector = dataCollector;
    }

    @Override
    public String visitLambdaBody(Java8Parser.LambdaBodyContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitLambdaBody(ctx);
    }

    @Override
    public String visitLambdaParameters(Java8Parser.LambdaParametersContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitLambdaParameters(ctx);
    }

    @Override
    public String visitLambdaExpression(Java8Parser.LambdaExpressionContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitLambdaExpression(ctx);
    }

    @Override
    public String visitArrayCreationExpression(Java8Parser.ArrayCreationExpressionContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitArrayCreationExpression(ctx);
    }

    @Override
    public String visitMethodInvocation(Java8Parser.MethodInvocationContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitMethodInvocation(ctx);
    }

    @Override
    public String visitClassInstanceCreationExpression(Java8Parser.ClassInstanceCreationExpressionContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitClassInstanceCreationExpression(ctx);
    }

    @Override
    public String visitTryWithResourcesStatement(Java8Parser.TryWithResourcesStatementContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitTryWithResourcesStatement(ctx);
    }

    @Override
    public String visitFinally_(Java8Parser.Finally_Context ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitFinally_(ctx);
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
    public String visitThrowStatement(Java8Parser.ThrowStatementContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitThrowStatement(ctx);
    }

    @Override
    public String visitReturnStatement(Java8Parser.ReturnStatementContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitReturnStatement(ctx);
    }

    @Override
    public String visitEnhancedForStatement(Java8Parser.EnhancedForStatementContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitEnhancedForStatement(ctx);
    }

    @Override
    public String visitBasicForStatement(Java8Parser.BasicForStatementContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitBasicForStatement(ctx);
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
    public String visitEnumConstantName(Java8Parser.EnumConstantNameContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitEnumConstantName(ctx);
    }

    @Override
    public String visitSwitchLabel(Java8Parser.SwitchLabelContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitSwitchLabel(ctx);
    }

    @Override
    public String visitSwitchLabels(Java8Parser.SwitchLabelsContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitSwitchLabels(ctx);
    }

    @Override
    public String visitSwitchBlockStatementGroup(Java8Parser.SwitchBlockStatementGroupContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitSwitchBlockStatementGroup(ctx);
    }

    @Override
    public String visitSwitchBlock(Java8Parser.SwitchBlockContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitSwitchBlock(ctx);
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
    public String visitLocalVariableDeclaration(Java8Parser.LocalVariableDeclarationContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitLocalVariableDeclaration(ctx);
    }

    @Override
    public String visitLocalVariableDeclarationStatement(Java8Parser.LocalVariableDeclarationStatementContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitLocalVariableDeclarationStatement(ctx);
    }

    @Override
    public String visitConstantDeclaration(Java8Parser.ConstantDeclarationContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitConstantDeclaration(ctx);
    }

    @Override
    public String visitInterfaceBody(Java8Parser.InterfaceBodyContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitInterfaceBody(ctx);
    }

    @Override
    public String visitExtendsInterfaces(Java8Parser.ExtendsInterfacesContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitExtendsInterfaces(ctx);
    }

    @Override
    public String visitInterfaceDeclaration(Java8Parser.InterfaceDeclarationContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitInterfaceDeclaration(ctx);
    }

    @Override
    public String visitEnumBodyDeclarations(Java8Parser.EnumBodyDeclarationsContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitEnumBodyDeclarations(ctx);
    }

    @Override
    public String visitEnumConstant(Java8Parser.EnumConstantContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitEnumConstant(ctx);
    }

    @Override
    public String visitEnumBody(Java8Parser.EnumBodyContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitEnumBody(ctx);
    }

    @Override
    public String visitEnumDeclaration(Java8Parser.EnumDeclarationContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitEnumDeclaration(ctx);
    }

    @Override
    public String visitExplicitConstructorInvocation(Java8Parser.ExplicitConstructorInvocationContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitExplicitConstructorInvocation(ctx);
    }

    @Override
    public String visitConstructorBody(Java8Parser.ConstructorBodyContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitConstructorBody(ctx);
    }

    @Override
    public String visitConstructorDeclaration(Java8Parser.ConstructorDeclarationContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitConstructorDeclaration(ctx);
    }

    @Override
    public String visitMethodBody(Java8Parser.MethodBodyContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitMethodBody(ctx);
    }

    @Override
    public String visitMethodHeader(Java8Parser.MethodHeaderContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitMethodHeader(ctx);
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
    public String visitClassBody(Java8Parser.ClassBodyContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitClassBody(ctx);
    }

    @Override
    public String visitSuperinterfaces(Java8Parser.SuperinterfacesContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitSuperinterfaces(ctx);
    }

    @Override
    public String visitSuperclass(Java8Parser.SuperclassContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitSuperclass(ctx);
    }

    @Override
    public String visitNormalClassDeclaration(Java8Parser.NormalClassDeclarationContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitNormalClassDeclaration(ctx);
    }

    @Override
    public String visitSingleStaticImportDeclaration(Java8Parser.SingleStaticImportDeclarationContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitSingleStaticImportDeclaration(ctx);
    }

    @Override
    public String visitSingleTypeImportDeclaration(Java8Parser.SingleTypeImportDeclarationContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitSingleTypeImportDeclaration(ctx);
    }

    @Override
    public String visitPackageDeclaration(Java8Parser.PackageDeclarationContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitPackageDeclaration(ctx);
    }

    @Override
    public String visitCompilationUnit(Java8Parser.CompilationUnitContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitCompilationUnit(ctx);
    }

    @Override
    public String visitMethodName(Java8Parser.MethodNameContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitMethodName(ctx);
    }

    @Override
    public String visitPackageName(Java8Parser.PackageNameContext ctx) {
        this.dataCollector.collectDataRow(ctx);
        return super.visitPackageName(ctx);
    }
}
