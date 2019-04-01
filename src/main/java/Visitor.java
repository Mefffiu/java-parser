import antlr.Java8BaseVisitor;
import antlr.Java8Parser;

public class Visitor extends Java8BaseVisitor<String> {

    private DataCollector dataCollector;

    public Visitor(DataCollector dataCollector) {
        this.dataCollector = dataCollector;
    }

    @Override
    public String visitCastExpression(Java8Parser.CastExpressionContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitCastExpression(ctx);
    }

    @Override
    public String visitPostDecrementExpression_lf_postfixExpression(Java8Parser.PostDecrementExpression_lf_postfixExpressionContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitPostDecrementExpression_lf_postfixExpression(ctx);
    }

    @Override
    public String visitPostDecrementExpression(Java8Parser.PostDecrementExpressionContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitPostDecrementExpression(ctx);
    }

    @Override
    public String visitPostIncrementExpression_lf_postfixExpression(Java8Parser.PostIncrementExpression_lf_postfixExpressionContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitPostIncrementExpression_lf_postfixExpression(ctx);
    }

    @Override
    public String visitPostIncrementExpression(Java8Parser.PostIncrementExpressionContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitPostIncrementExpression(ctx);
    }

    @Override
    public String visitPostfixExpression(Java8Parser.PostfixExpressionContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitPostfixExpression(ctx);
    }

    @Override
    public String visitUnaryExpressionNotPlusMinus(Java8Parser.UnaryExpressionNotPlusMinusContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitUnaryExpressionNotPlusMinus(ctx);
    }

    @Override
    public String visitPreDecrementExpression(Java8Parser.PreDecrementExpressionContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitPreDecrementExpression(ctx);
    }

    @Override
    public String visitPreIncrementExpression(Java8Parser.PreIncrementExpressionContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitPreIncrementExpression(ctx);
    }

    @Override
    public String visitUnaryExpression(Java8Parser.UnaryExpressionContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitUnaryExpression(ctx);
    }

    @Override
    public String visitMultiplicativeExpression(Java8Parser.MultiplicativeExpressionContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitMultiplicativeExpression(ctx);
    }

    @Override
    public String visitAdditiveExpression(Java8Parser.AdditiveExpressionContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitAdditiveExpression(ctx);
    }

    @Override
    public String visitShiftExpression(Java8Parser.ShiftExpressionContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitShiftExpression(ctx);
    }

    @Override
    public String visitRelationalExpression(Java8Parser.RelationalExpressionContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitRelationalExpression(ctx);
    }

    @Override
    public String visitEqualityExpression(Java8Parser.EqualityExpressionContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitEqualityExpression(ctx);
    }

    @Override
    public String visitAndExpression(Java8Parser.AndExpressionContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitAndExpression(ctx);
    }

    @Override
    public String visitExclusiveOrExpression(Java8Parser.ExclusiveOrExpressionContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitExclusiveOrExpression(ctx);
    }

    @Override
    public String visitInclusiveOrExpression(Java8Parser.InclusiveOrExpressionContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitInclusiveOrExpression(ctx);
    }

    @Override
    public String visitConditionalAndExpression(Java8Parser.ConditionalAndExpressionContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitConditionalAndExpression(ctx);
    }

    @Override
    public String visitConditionalOrExpression(Java8Parser.ConditionalOrExpressionContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitConditionalOrExpression(ctx);
    }

    @Override
    public String visitConditionalExpression(Java8Parser.ConditionalExpressionContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitConditionalExpression(ctx);
    }

    @Override
    public String visitAssignmentOperator(Java8Parser.AssignmentOperatorContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitAssignmentOperator(ctx);
    }

    @Override
    public String visitLeftHandSide(Java8Parser.LeftHandSideContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitLeftHandSide(ctx);
    }

    @Override
    public String visitAssignment(Java8Parser.AssignmentContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitAssignment(ctx);
    }

    @Override
    public String visitAssignmentExpression(Java8Parser.AssignmentExpressionContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitAssignmentExpression(ctx);
    }

    @Override
    public String visitLambdaBody(Java8Parser.LambdaBodyContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitLambdaBody(ctx);
    }

    @Override
    public String visitInferredFormalParameterList(Java8Parser.InferredFormalParameterListContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitInferredFormalParameterList(ctx);
    }

    @Override
    public String visitLambdaParameters(Java8Parser.LambdaParametersContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitLambdaParameters(ctx);
    }

    @Override
    public String visitLambdaExpression(Java8Parser.LambdaExpressionContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitLambdaExpression(ctx);
    }

    @Override
    public String visitExpression(Java8Parser.ExpressionContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitExpression(ctx);
    }

    @Override
    public String visitConstantExpression(Java8Parser.ConstantExpressionContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitConstantExpression(ctx);
    }

    @Override
    public String visitDimExpr(Java8Parser.DimExprContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitDimExpr(ctx);
    }

    @Override
    public String visitDimExprs(Java8Parser.DimExprsContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitDimExprs(ctx);
    }

    @Override
    public String visitArrayCreationExpression(Java8Parser.ArrayCreationExpressionContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitArrayCreationExpression(ctx);
    }

    @Override
    public String visitMethodReference_lfno_primary(Java8Parser.MethodReference_lfno_primaryContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitMethodReference_lfno_primary(ctx);
    }

    @Override
    public String visitMethodReference_lf_primary(Java8Parser.MethodReference_lf_primaryContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitMethodReference_lf_primary(ctx);
    }

    @Override
    public String visitMethodReference(Java8Parser.MethodReferenceContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitMethodReference(ctx);
    }

    @Override
    public String visitArgumentList(Java8Parser.ArgumentListContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitArgumentList(ctx);
    }

    @Override
    public String visitMethodInvocation_lfno_primary(Java8Parser.MethodInvocation_lfno_primaryContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitMethodInvocation_lfno_primary(ctx);
    }

    @Override
    public String visitMethodInvocation_lf_primary(Java8Parser.MethodInvocation_lf_primaryContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitMethodInvocation_lf_primary(ctx);
    }

    @Override
    public String visitMethodInvocation(Java8Parser.MethodInvocationContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitMethodInvocation(ctx);
    }

    @Override
    public String visitArrayAccess_lfno_primary(Java8Parser.ArrayAccess_lfno_primaryContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitArrayAccess_lfno_primary(ctx);
    }

    @Override
    public String visitArrayAccess_lf_primary(Java8Parser.ArrayAccess_lf_primaryContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitArrayAccess_lf_primary(ctx);
    }

    @Override
    public String visitArrayAccess(Java8Parser.ArrayAccessContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitArrayAccess(ctx);
    }

    @Override
    public String visitFieldAccess_lfno_primary(Java8Parser.FieldAccess_lfno_primaryContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitFieldAccess_lfno_primary(ctx);
    }

    @Override
    public String visitFieldAccess_lf_primary(Java8Parser.FieldAccess_lf_primaryContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitFieldAccess_lf_primary(ctx);
    }

    @Override
    public String visitFieldAccess(Java8Parser.FieldAccessContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitFieldAccess(ctx);
    }

    @Override
    public String visitTypeArgumentsOrDiamond(Java8Parser.TypeArgumentsOrDiamondContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitTypeArgumentsOrDiamond(ctx);
    }

    @Override
    public String visitClassInstanceCreationExpression_lfno_primary(Java8Parser.ClassInstanceCreationExpression_lfno_primaryContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitClassInstanceCreationExpression_lfno_primary(ctx);
    }

    @Override
    public String visitClassInstanceCreationExpression_lf_primary(Java8Parser.ClassInstanceCreationExpression_lf_primaryContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitClassInstanceCreationExpression_lf_primary(ctx);
    }

    @Override
    public String visitClassInstanceCreationExpression(Java8Parser.ClassInstanceCreationExpressionContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitClassInstanceCreationExpression(ctx);
    }

    @Override
    public String visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(Java8Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(ctx);
    }

    @Override
    public String visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(Java8Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(ctx);
    }

    @Override
    public String visitPrimaryNoNewArray_lfno_primary(Java8Parser.PrimaryNoNewArray_lfno_primaryContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitPrimaryNoNewArray_lfno_primary(ctx);
    }

    @Override
    public String visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(Java8Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(ctx);
    }

    @Override
    public String visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(Java8Parser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(ctx);
    }

    @Override
    public String visitPrimaryNoNewArray_lf_primary(Java8Parser.PrimaryNoNewArray_lf_primaryContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitPrimaryNoNewArray_lf_primary(ctx);
    }

    @Override
    public String visitPrimaryNoNewArray_lfno_arrayAccess(Java8Parser.PrimaryNoNewArray_lfno_arrayAccessContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitPrimaryNoNewArray_lfno_arrayAccess(ctx);
    }

    @Override
    public String visitPrimaryNoNewArray_lf_arrayAccess(Java8Parser.PrimaryNoNewArray_lf_arrayAccessContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitPrimaryNoNewArray_lf_arrayAccess(ctx);
    }

    @Override
    public String visitPrimaryNoNewArray(Java8Parser.PrimaryNoNewArrayContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitPrimaryNoNewArray(ctx);
    }

    @Override
    public String visitPrimary(Java8Parser.PrimaryContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitPrimary(ctx);
    }

    @Override
    public String visitResource(Java8Parser.ResourceContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitResource(ctx);
    }

    @Override
    public String visitResourceList(Java8Parser.ResourceListContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitResourceList(ctx);
    }

    @Override
    public String visitResourceSpecification(Java8Parser.ResourceSpecificationContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitResourceSpecification(ctx);
    }

    @Override
    public String visitTryWithResourcesStatement(Java8Parser.TryWithResourcesStatementContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitTryWithResourcesStatement(ctx);
    }

    @Override
    public String visitFinally_(Java8Parser.Finally_Context ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitFinally_(ctx);
    }

    @Override
    public String visitCatchType(Java8Parser.CatchTypeContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitCatchType(ctx);
    }

    @Override
    public String visitCatchFormalParameter(Java8Parser.CatchFormalParameterContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitCatchFormalParameter(ctx);
    }

    @Override
    public String visitCatchClause(Java8Parser.CatchClauseContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitCatchClause(ctx);
    }

    @Override
    public String visitCatches(Java8Parser.CatchesContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitCatches(ctx);
    }

    @Override
    public String visitTryStatement(Java8Parser.TryStatementContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitTryStatement(ctx);
    }

    @Override
    public String visitSynchronizedStatement(Java8Parser.SynchronizedStatementContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitSynchronizedStatement(ctx);
    }

    @Override
    public String visitThrowStatement(Java8Parser.ThrowStatementContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitThrowStatement(ctx);
    }

    @Override
    public String visitReturnStatement(Java8Parser.ReturnStatementContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitReturnStatement(ctx);
    }

    @Override
    public String visitContinueStatement(Java8Parser.ContinueStatementContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitContinueStatement(ctx);
    }

    @Override
    public String visitBreakStatement(Java8Parser.BreakStatementContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitBreakStatement(ctx);
    }

    @Override
    public String visitEnhancedForStatementNoShortIf(Java8Parser.EnhancedForStatementNoShortIfContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitEnhancedForStatementNoShortIf(ctx);
    }

    @Override
    public String visitEnhancedForStatement(Java8Parser.EnhancedForStatementContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitEnhancedForStatement(ctx);
    }

    @Override
    public String visitStatementExpressionList(Java8Parser.StatementExpressionListContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitStatementExpressionList(ctx);
    }

    @Override
    public String visitForUpdate(Java8Parser.ForUpdateContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitForUpdate(ctx);
    }

    @Override
    public String visitForInit(Java8Parser.ForInitContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitForInit(ctx);
    }

    @Override
    public String visitBasicForStatementNoShortIf(Java8Parser.BasicForStatementNoShortIfContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitBasicForStatementNoShortIf(ctx);
    }

    @Override
    public String visitBasicForStatement(Java8Parser.BasicForStatementContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitBasicForStatement(ctx);
    }

    @Override
    public String visitForStatementNoShortIf(Java8Parser.ForStatementNoShortIfContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitForStatementNoShortIf(ctx);
    }

    @Override
    public String visitForStatement(Java8Parser.ForStatementContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitForStatement(ctx);
    }

    @Override
    public String visitDoStatement(Java8Parser.DoStatementContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitDoStatement(ctx);
    }

    @Override
    public String visitWhileStatementNoShortIf(Java8Parser.WhileStatementNoShortIfContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitWhileStatementNoShortIf(ctx);
    }

    @Override
    public String visitWhileStatement(Java8Parser.WhileStatementContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitWhileStatement(ctx);
    }

    @Override
    public String visitEnumConstantName(Java8Parser.EnumConstantNameContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitEnumConstantName(ctx);
    }

    @Override
    public String visitSwitchLabel(Java8Parser.SwitchLabelContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitSwitchLabel(ctx);
    }

    @Override
    public String visitSwitchLabels(Java8Parser.SwitchLabelsContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitSwitchLabels(ctx);
    }

    @Override
    public String visitSwitchBlockStatementGroup(Java8Parser.SwitchBlockStatementGroupContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitSwitchBlockStatementGroup(ctx);
    }

    @Override
    public String visitSwitchBlock(Java8Parser.SwitchBlockContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitSwitchBlock(ctx);
    }

    @Override
    public String visitSwitchStatement(Java8Parser.SwitchStatementContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitSwitchStatement(ctx);
    }

    @Override
    public String visitAssertStatement(Java8Parser.AssertStatementContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitAssertStatement(ctx);
    }

    @Override
    public String visitIfThenElseStatementNoShortIf(Java8Parser.IfThenElseStatementNoShortIfContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitIfThenElseStatementNoShortIf(ctx);
    }

    @Override
    public String visitIfThenElseStatement(Java8Parser.IfThenElseStatementContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitIfThenElseStatement(ctx);
    }

    @Override
    public String visitIfThenStatement(Java8Parser.IfThenStatementContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitIfThenStatement(ctx);
    }

    @Override
    public String visitStatementExpression(Java8Parser.StatementExpressionContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitStatementExpression(ctx);
    }

    @Override
    public String visitExpressionStatement(Java8Parser.ExpressionStatementContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitExpressionStatement(ctx);
    }

    @Override
    public String visitLabeledStatementNoShortIf(Java8Parser.LabeledStatementNoShortIfContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitLabeledStatementNoShortIf(ctx);
    }

    @Override
    public String visitLabeledStatement(Java8Parser.LabeledStatementContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitLabeledStatement(ctx);
    }

    @Override
    public String visitEmptyStatement(Java8Parser.EmptyStatementContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitEmptyStatement(ctx);
    }

    @Override
    public String visitStatementWithoutTrailingSubstatement(Java8Parser.StatementWithoutTrailingSubstatementContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitStatementWithoutTrailingSubstatement(ctx);
    }

    @Override
    public String visitStatementNoShortIf(Java8Parser.StatementNoShortIfContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitStatementNoShortIf(ctx);
    }

    @Override
    public String visitStatement(Java8Parser.StatementContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitStatement(ctx);
    }

    @Override
    public String visitLocalVariableDeclaration(Java8Parser.LocalVariableDeclarationContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitLocalVariableDeclaration(ctx);
    }

    @Override
    public String visitLocalVariableDeclarationStatement(Java8Parser.LocalVariableDeclarationStatementContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitLocalVariableDeclarationStatement(ctx);
    }

    @Override
    public String visitBlockStatement(Java8Parser.BlockStatementContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitBlockStatement(ctx);
    }

    @Override
    public String visitBlockStatements(Java8Parser.BlockStatementsContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitBlockStatements(ctx);
    }

    @Override
    public String visitBlock(Java8Parser.BlockContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitBlock(ctx);
    }

    @Override
    public String visitVariableInitializerList(Java8Parser.VariableInitializerListContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitVariableInitializerList(ctx);
    }

    @Override
    public String visitArrayInitializer(Java8Parser.ArrayInitializerContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitArrayInitializer(ctx);
    }

    @Override
    public String visitSingleElementAnnotation(Java8Parser.SingleElementAnnotationContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitSingleElementAnnotation(ctx);
    }

    @Override
    public String visitMarkerAnnotation(Java8Parser.MarkerAnnotationContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitMarkerAnnotation(ctx);
    }

    @Override
    public String visitElementValueList(Java8Parser.ElementValueListContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitElementValueList(ctx);
    }

    @Override
    public String visitElementValueArrayInitializer(Java8Parser.ElementValueArrayInitializerContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitElementValueArrayInitializer(ctx);
    }

    @Override
    public String visitElementValue(Java8Parser.ElementValueContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitElementValue(ctx);
    }

    @Override
    public String visitElementValuePair(Java8Parser.ElementValuePairContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitElementValuePair(ctx);
    }

    @Override
    public String visitElementValuePairList(Java8Parser.ElementValuePairListContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitElementValuePairList(ctx);
    }

    @Override
    public String visitNormalAnnotation(Java8Parser.NormalAnnotationContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitNormalAnnotation(ctx);
    }

    @Override
    public String visitAnnotation(Java8Parser.AnnotationContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitAnnotation(ctx);
    }

    @Override
    public String visitDefaultValue(Java8Parser.DefaultValueContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitDefaultValue(ctx);
    }

    @Override
    public String visitAnnotationTypeElementModifier(Java8Parser.AnnotationTypeElementModifierContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitAnnotationTypeElementModifier(ctx);
    }

    @Override
    public String visitAnnotationTypeElementDeclaration(Java8Parser.AnnotationTypeElementDeclarationContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitAnnotationTypeElementDeclaration(ctx);
    }

    @Override
    public String visitAnnotationTypeMemberDeclaration(Java8Parser.AnnotationTypeMemberDeclarationContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitAnnotationTypeMemberDeclaration(ctx);
    }

    @Override
    public String visitAnnotationTypeBody(Java8Parser.AnnotationTypeBodyContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitAnnotationTypeBody(ctx);
    }

    @Override
    public String visitAnnotationTypeDeclaration(Java8Parser.AnnotationTypeDeclarationContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitAnnotationTypeDeclaration(ctx);
    }

    @Override
    public String visitInterfaceMethodModifier(Java8Parser.InterfaceMethodModifierContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitInterfaceMethodModifier(ctx);
    }

    @Override
    public String visitInterfaceMethodDeclaration(Java8Parser.InterfaceMethodDeclarationContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitInterfaceMethodDeclaration(ctx);
    }

    @Override
    public String visitConstantModifier(Java8Parser.ConstantModifierContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitConstantModifier(ctx);
    }

    @Override
    public String visitConstantDeclaration(Java8Parser.ConstantDeclarationContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitConstantDeclaration(ctx);
    }

    @Override
    public String visitInterfaceMemberDeclaration(Java8Parser.InterfaceMemberDeclarationContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitInterfaceMemberDeclaration(ctx);
    }

    @Override
    public String visitInterfaceBody(Java8Parser.InterfaceBodyContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitInterfaceBody(ctx);
    }

    @Override
    public String visitExtendsInterfaces(Java8Parser.ExtendsInterfacesContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitExtendsInterfaces(ctx);
    }

    @Override
    public String visitInterfaceModifier(Java8Parser.InterfaceModifierContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitInterfaceModifier(ctx);
    }

    @Override
    public String visitNormalInterfaceDeclaration(Java8Parser.NormalInterfaceDeclarationContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitNormalInterfaceDeclaration(ctx);
    }

    @Override
    public String visitInterfaceDeclaration(Java8Parser.InterfaceDeclarationContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitInterfaceDeclaration(ctx);
    }

    @Override
    public String visitEnumBodyDeclarations(Java8Parser.EnumBodyDeclarationsContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitEnumBodyDeclarations(ctx);
    }

    @Override
    public String visitEnumConstantModifier(Java8Parser.EnumConstantModifierContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitEnumConstantModifier(ctx);
    }

    @Override
    public String visitEnumConstant(Java8Parser.EnumConstantContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitEnumConstant(ctx);
    }

    @Override
    public String visitEnumConstantList(Java8Parser.EnumConstantListContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitEnumConstantList(ctx);
    }

    @Override
    public String visitEnumBody(Java8Parser.EnumBodyContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitEnumBody(ctx);
    }

    @Override
    public String visitEnumDeclaration(Java8Parser.EnumDeclarationContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitEnumDeclaration(ctx);
    }

    @Override
    public String visitExplicitConstructorInvocation(Java8Parser.ExplicitConstructorInvocationContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitExplicitConstructorInvocation(ctx);
    }

    @Override
    public String visitConstructorBody(Java8Parser.ConstructorBodyContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitConstructorBody(ctx);
    }

    @Override
    public String visitSimpleTypeName(Java8Parser.SimpleTypeNameContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitSimpleTypeName(ctx);
    }

    @Override
    public String visitConstructorDeclarator(Java8Parser.ConstructorDeclaratorContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitConstructorDeclarator(ctx);
    }

    @Override
    public String visitConstructorModifier(Java8Parser.ConstructorModifierContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitConstructorModifier(ctx);
    }

    @Override
    public String visitConstructorDeclaration(Java8Parser.ConstructorDeclarationContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitConstructorDeclaration(ctx);
    }

    @Override
    public String visitStaticInitializer(Java8Parser.StaticInitializerContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitStaticInitializer(ctx);
    }

    @Override
    public String visitInstanceInitializer(Java8Parser.InstanceInitializerContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitInstanceInitializer(ctx);
    }

    @Override
    public String visitMethodBody(Java8Parser.MethodBodyContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitMethodBody(ctx);
    }

    @Override
    public String visitExceptionType(Java8Parser.ExceptionTypeContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitExceptionType(ctx);
    }

    @Override
    public String visitExceptionTypeList(Java8Parser.ExceptionTypeListContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitExceptionTypeList(ctx);
    }

    @Override
    public String visitThrows_(Java8Parser.Throws_Context ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitThrows_(ctx);
    }

    @Override
    public String visitReceiverParameter(Java8Parser.ReceiverParameterContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitReceiverParameter(ctx);
    }

    @Override
    public String visitLastFormalParameter(Java8Parser.LastFormalParameterContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitLastFormalParameter(ctx);
    }

    @Override
    public String visitVariableModifier(Java8Parser.VariableModifierContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitVariableModifier(ctx);
    }

    @Override
    public String visitFormalParameter(Java8Parser.FormalParameterContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitFormalParameter(ctx);
    }

    @Override
    public String visitFormalParameters(Java8Parser.FormalParametersContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitFormalParameters(ctx);
    }

    @Override
    public String visitFormalParameterList(Java8Parser.FormalParameterListContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitFormalParameterList(ctx);
    }

    @Override
    public String visitMethodDeclarator(Java8Parser.MethodDeclaratorContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitMethodDeclarator(ctx);
    }

    @Override
    public String visitResult(Java8Parser.ResultContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitResult(ctx);
    }

    @Override
    public String visitMethodHeader(Java8Parser.MethodHeaderContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitMethodHeader(ctx);
    }

    @Override
    public String visitMethodModifier(Java8Parser.MethodModifierContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitMethodModifier(ctx);
    }

    @Override
    public String visitMethodDeclaration(Java8Parser.MethodDeclarationContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitMethodDeclaration(ctx);
    }

    @Override
    public String visitUnannArrayType(Java8Parser.UnannArrayTypeContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitUnannArrayType(ctx);
    }

    @Override
    public String visitUnannTypeVariable(Java8Parser.UnannTypeVariableContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitUnannTypeVariable(ctx);
    }

    @Override
    public String visitUnannInterfaceType_lfno_unannClassOrInterfaceType(Java8Parser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitUnannInterfaceType_lfno_unannClassOrInterfaceType(ctx);
    }

    @Override
    public String visitUnannInterfaceType_lf_unannClassOrInterfaceType(Java8Parser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitUnannInterfaceType_lf_unannClassOrInterfaceType(ctx);
    }

    @Override
    public String visitUnannInterfaceType(Java8Parser.UnannInterfaceTypeContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitUnannInterfaceType(ctx);
    }

    @Override
    public String visitUnannClassType_lfno_unannClassOrInterfaceType(Java8Parser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitUnannClassType_lfno_unannClassOrInterfaceType(ctx);
    }

    @Override
    public String visitUnannClassType_lf_unannClassOrInterfaceType(Java8Parser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitUnannClassType_lf_unannClassOrInterfaceType(ctx);
    }

    @Override
    public String visitUnannClassType(Java8Parser.UnannClassTypeContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitUnannClassType(ctx);
    }

    @Override
    public String visitUnannClassOrInterfaceType(Java8Parser.UnannClassOrInterfaceTypeContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitUnannClassOrInterfaceType(ctx);
    }

    @Override
    public String visitUnannReferenceType(Java8Parser.UnannReferenceTypeContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitUnannReferenceType(ctx);
    }

    @Override
    public String visitUnannPrimitiveType(Java8Parser.UnannPrimitiveTypeContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitUnannPrimitiveType(ctx);
    }

    @Override
    public String visitUnannType(Java8Parser.UnannTypeContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitUnannType(ctx);
    }

    @Override
    public String visitVariableInitializer(Java8Parser.VariableInitializerContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitVariableInitializer(ctx);
    }

    @Override
    public String visitVariableDeclaratorId(Java8Parser.VariableDeclaratorIdContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitVariableDeclaratorId(ctx);
    }

    @Override
    public String visitVariableDeclarator(Java8Parser.VariableDeclaratorContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitVariableDeclarator(ctx);
    }

    @Override
    public String visitVariableDeclaratorList(Java8Parser.VariableDeclaratorListContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitVariableDeclaratorList(ctx);
    }

    @Override
    public String visitFieldModifier(Java8Parser.FieldModifierContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitFieldModifier(ctx);
    }

    @Override
    public String visitFieldDeclaration(Java8Parser.FieldDeclarationContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitFieldDeclaration(ctx);
    }

    @Override
    public String visitClassMemberDeclaration(Java8Parser.ClassMemberDeclarationContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitClassMemberDeclaration(ctx);
    }

    @Override
    public String visitClassBodyDeclaration(Java8Parser.ClassBodyDeclarationContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitClassBodyDeclaration(ctx);
    }

    @Override
    public String visitClassBody(Java8Parser.ClassBodyContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitClassBody(ctx);
    }

    @Override
    public String visitInterfaceTypeList(Java8Parser.InterfaceTypeListContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitInterfaceTypeList(ctx);
    }

    @Override
    public String visitSuperinterfaces(Java8Parser.SuperinterfacesContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitSuperinterfaces(ctx);
    }

    @Override
    public String visitSuperclass(Java8Parser.SuperclassContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitSuperclass(ctx);
    }

    @Override
    public String visitTypeParameterList(Java8Parser.TypeParameterListContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitTypeParameterList(ctx);
    }

    @Override
    public String visitTypeParameters(Java8Parser.TypeParametersContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitTypeParameters(ctx);
    }

    @Override
    public String visitClassModifier(Java8Parser.ClassModifierContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitClassModifier(ctx);
    }

    @Override
    public String visitNormalClassDeclaration(Java8Parser.NormalClassDeclarationContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitNormalClassDeclaration(ctx);
    }

    @Override
    public String visitClassDeclaration(Java8Parser.ClassDeclarationContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitClassDeclaration(ctx);
    }

    @Override
    public String visitTypeDeclaration(Java8Parser.TypeDeclarationContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitTypeDeclaration(ctx);
    }

    @Override
    public String visitStaticImportOnDemandDeclaration(Java8Parser.StaticImportOnDemandDeclarationContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitStaticImportOnDemandDeclaration(ctx);
    }

    @Override
    public String visitSingleStaticImportDeclaration(Java8Parser.SingleStaticImportDeclarationContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitSingleStaticImportDeclaration(ctx);
    }

    @Override
    public String visitTypeImportOnDemandDeclaration(Java8Parser.TypeImportOnDemandDeclarationContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitTypeImportOnDemandDeclaration(ctx);
    }

    @Override
    public String visitSingleTypeImportDeclaration(Java8Parser.SingleTypeImportDeclarationContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitSingleTypeImportDeclaration(ctx);
    }

    @Override
    public String visitImportDeclaration(Java8Parser.ImportDeclarationContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitImportDeclaration(ctx);
    }

    @Override
    public String visitPackageModifier(Java8Parser.PackageModifierContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitPackageModifier(ctx);
    }

    @Override
    public String visitPackageDeclaration(Java8Parser.PackageDeclarationContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitPackageDeclaration(ctx);
    }

    @Override
    public String visitCompilationUnit(Java8Parser.CompilationUnitContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitCompilationUnit(ctx);
    }

    @Override
    public String visitAmbiguousName(Java8Parser.AmbiguousNameContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitAmbiguousName(ctx);
    }

    @Override
    public String visitMethodName(Java8Parser.MethodNameContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitMethodName(ctx);
    }

    @Override
    public String visitExpressionName(Java8Parser.ExpressionNameContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitExpressionName(ctx);
    }

    @Override
    public String visitPackageOrTypeName(Java8Parser.PackageOrTypeNameContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitPackageOrTypeName(ctx);
    }

    @Override
    public String visitTypeName(Java8Parser.TypeNameContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitTypeName(ctx);
    }

    @Override
    public String visitPackageName(Java8Parser.PackageNameContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitPackageName(ctx);
    }

    @Override
    public String visitWildcardBounds(Java8Parser.WildcardBoundsContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitWildcardBounds(ctx);
    }

    @Override
    public String visitWildcard(Java8Parser.WildcardContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitWildcard(ctx);
    }

    @Override
    public String visitTypeArgument(Java8Parser.TypeArgumentContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitTypeArgument(ctx);
    }

    @Override
    public String visitTypeArgumentList(Java8Parser.TypeArgumentListContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitTypeArgumentList(ctx);
    }

    @Override
    public String visitTypeArguments(Java8Parser.TypeArgumentsContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitTypeArguments(ctx);
    }

    @Override
    public String visitAdditionalBound(Java8Parser.AdditionalBoundContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitAdditionalBound(ctx);
    }

    @Override
    public String visitTypeBound(Java8Parser.TypeBoundContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitTypeBound(ctx);
    }

    @Override
    public String visitTypeParameterModifier(Java8Parser.TypeParameterModifierContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitTypeParameterModifier(ctx);
    }

    @Override
    public String visitTypeParameter(Java8Parser.TypeParameterContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitTypeParameter(ctx);
    }

    @Override
    public String visitDims(Java8Parser.DimsContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitDims(ctx);
    }

    @Override
    public String visitArrayType(Java8Parser.ArrayTypeContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitArrayType(ctx);
    }

    @Override
    public String visitTypeVariable(Java8Parser.TypeVariableContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitTypeVariable(ctx);
    }

    @Override
    public String visitInterfaceType_lfno_classOrInterfaceType(Java8Parser.InterfaceType_lfno_classOrInterfaceTypeContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitInterfaceType_lfno_classOrInterfaceType(ctx);
    }

    @Override
    public String visitInterfaceType_lf_classOrInterfaceType(Java8Parser.InterfaceType_lf_classOrInterfaceTypeContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitInterfaceType_lf_classOrInterfaceType(ctx);
    }

    @Override
    public String visitInterfaceType(Java8Parser.InterfaceTypeContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitInterfaceType(ctx);
    }

    @Override
    public String visitClassType_lfno_classOrInterfaceType(Java8Parser.ClassType_lfno_classOrInterfaceTypeContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitClassType_lfno_classOrInterfaceType(ctx);
    }

    @Override
    public String visitClassType_lf_classOrInterfaceType(Java8Parser.ClassType_lf_classOrInterfaceTypeContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitClassType_lf_classOrInterfaceType(ctx);
    }

    @Override
    public String visitClassType(Java8Parser.ClassTypeContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitClassType(ctx);
    }

    @Override
    public String visitClassOrInterfaceType(Java8Parser.ClassOrInterfaceTypeContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitClassOrInterfaceType(ctx);
    }

    @Override
    public String visitReferenceType(Java8Parser.ReferenceTypeContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitReferenceType(ctx);
    }

    @Override
    public String visitFloatingPointType(Java8Parser.FloatingPointTypeContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitFloatingPointType(ctx);
    }

    @Override
    public String visitIntegralType(Java8Parser.IntegralTypeContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitIntegralType(ctx);
    }

    @Override
    public String visitNumericType(Java8Parser.NumericTypeContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitNumericType(ctx);
    }

    @Override
    public String visitPrimitiveType(Java8Parser.PrimitiveTypeContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitPrimitiveType(ctx);
    }

    @Override
    public String visitLiteral(Java8Parser.LiteralContext ctx){
        this.dataCollector.collectDataRow(ctx);
        return super.visitLiteral(ctx);
    }

}
