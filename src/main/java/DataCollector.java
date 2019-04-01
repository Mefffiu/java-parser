import antlr.Java8Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataCollector {
    private final Logger log = LoggerFactory.getLogger(getClass());

    private static final Map<Class, String> structures = new HashMap<>();
    static {
        structures.put(Java8Parser.CompilationUnitContext.class, "file_content"); // highest order structure

        structures.put(Java8Parser.CastExpressionContext.class, "cast_expression");
        structures.put(Java8Parser.PostDecrementExpression_lf_postfixExpressionContext.class, "post_decrement_expression_lf_postfix_expression");
        structures.put(Java8Parser.PostDecrementExpressionContext.class, "post_decrement_expression");
        structures.put(Java8Parser.PostIncrementExpression_lf_postfixExpressionContext.class, "post_increment_expression_lf_postfix_expression");
        structures.put(Java8Parser.PostIncrementExpressionContext.class, "post_increment_expression");
        structures.put(Java8Parser.PostfixExpressionContext.class, "postfix_expression");
        structures.put(Java8Parser.UnaryExpressionNotPlusMinusContext.class, "unary_expression_not_plus_minus");
        structures.put(Java8Parser.PreDecrementExpressionContext.class, "pre_decrement_expression");
        structures.put(Java8Parser.PreIncrementExpressionContext.class, "pre_increment_expression");
        structures.put(Java8Parser.UnaryExpressionContext.class, "unary_expression");
        structures.put(Java8Parser.MultiplicativeExpressionContext.class, "multiplicative_expression");
        structures.put(Java8Parser.AdditiveExpressionContext.class, "additive_expression");
        structures.put(Java8Parser.ShiftExpressionContext.class, "shift_expression");
        structures.put(Java8Parser.RelationalExpressionContext.class, "relational_expression");
        structures.put(Java8Parser.EqualityExpressionContext.class, "equality_expression");
        structures.put(Java8Parser.AndExpressionContext.class, "and_expression");
        structures.put(Java8Parser.ExclusiveOrExpressionContext.class, "exclusive_or_expression");
        structures.put(Java8Parser.InclusiveOrExpressionContext.class, "inclusive_or_expression");
        structures.put(Java8Parser.ConditionalAndExpressionContext.class, "conditional_and_expression");
        structures.put(Java8Parser.ConditionalOrExpressionContext.class, "conditional_or_expression");
        structures.put(Java8Parser.ConditionalExpressionContext.class, "conditional_expression");
        structures.put(Java8Parser.AssignmentOperatorContext.class, "assignment_operator");
        structures.put(Java8Parser.LeftHandSideContext.class, "left_hand_side");
        structures.put(Java8Parser.AssignmentContext.class, "assignment");
        structures.put(Java8Parser.AssignmentExpressionContext.class, "assignment_expression");
        structures.put(Java8Parser.LambdaBodyContext.class, "lambda_body");
        structures.put(Java8Parser.InferredFormalParameterListContext.class, "inferred_formal_parameter_list");
        structures.put(Java8Parser.LambdaParametersContext.class, "lambda_parameters");
        structures.put(Java8Parser.LambdaExpressionContext.class, "lambda_expression");
        structures.put(Java8Parser.ExpressionContext.class, "expression");
        structures.put(Java8Parser.ConstantExpressionContext.class, "constant_expression");
        structures.put(Java8Parser.DimExprContext.class, "dim_expr");
        structures.put(Java8Parser.DimExprsContext.class, "dim_exprs");
        structures.put(Java8Parser.ArrayCreationExpressionContext.class, "array_creation_expression");
        structures.put(Java8Parser.MethodReference_lfno_primaryContext.class, "method_reference_lfno_primary");
        structures.put(Java8Parser.MethodReference_lf_primaryContext.class, "method_reference_lf_primary");
        structures.put(Java8Parser.MethodReferenceContext.class, "method_reference");
        structures.put(Java8Parser.ArgumentListContext.class, "argument_list");
        structures.put(Java8Parser.MethodInvocation_lfno_primaryContext.class, "method_invocation_lfno_primary");
        structures.put(Java8Parser.MethodInvocation_lf_primaryContext.class, "method_invocation_lf_primary");
        structures.put(Java8Parser.MethodInvocationContext.class, "method_invocation");
        structures.put(Java8Parser.ArrayAccess_lfno_primaryContext.class, "array_access_lfno_primary");
        structures.put(Java8Parser.ArrayAccess_lf_primaryContext.class, "array_access_lf_primary");
        structures.put(Java8Parser.ArrayAccessContext.class, "array_access");
        structures.put(Java8Parser.FieldAccess_lfno_primaryContext.class, "field_access_lfno_primary");
        structures.put(Java8Parser.FieldAccess_lf_primaryContext.class, "field_access_lf_primary");
        structures.put(Java8Parser.FieldAccessContext.class, "field_access");
        structures.put(Java8Parser.TypeArgumentsOrDiamondContext.class, "type_arguments_or_diamond");
        structures.put(Java8Parser.ClassInstanceCreationExpression_lfno_primaryContext.class, "class_instance_creation_expression_lfno_primary");
        structures.put(Java8Parser.ClassInstanceCreationExpression_lf_primaryContext.class, "class_instance_creation_expression_lf_primary");
        structures.put(Java8Parser.ClassInstanceCreationExpressionContext.class, "class_instance_creation_expression");
        structures.put(Java8Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext.class, "primary_no_new_array_lfno_primary_lfno_array_access_lfno_primary");
        structures.put(Java8Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class, "primary_no_new_array_lfno_primary_lf_array_access_lfno_primary");
        structures.put(Java8Parser.PrimaryNoNewArray_lfno_primaryContext.class, "primary_no_new_array_lfno_primary");
        structures.put(Java8Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext.class, "primary_no_new_array_lf_primary_lfno_array_access_lf_primary");
        structures.put(Java8Parser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class, "primary_no_new_array_lf_primary_lf_array_access_lf_primary");
        structures.put(Java8Parser.PrimaryNoNewArray_lf_primaryContext.class, "primary_no_new_array_lf_primary");
        structures.put(Java8Parser.PrimaryNoNewArray_lfno_arrayAccessContext.class, "primary_no_new_array_lfno_array_access");
        structures.put(Java8Parser.PrimaryNoNewArray_lf_arrayAccessContext.class, "primary_no_new_array_lf_array_access");
        structures.put(Java8Parser.PrimaryNoNewArrayContext.class, "primary_no_new_array");
        structures.put(Java8Parser.PrimaryContext.class, "primary");
        structures.put(Java8Parser.ResourceContext.class, "resource");
        structures.put(Java8Parser.ResourceListContext.class, "resource_list");
        structures.put(Java8Parser.ResourceSpecificationContext.class, "resource_specification");
        structures.put(Java8Parser.TryWithResourcesStatementContext.class, "try_with_resources_statement");
        structures.put(Java8Parser.Finally_Context.class, "finally_");
        structures.put(Java8Parser.CatchTypeContext.class, "catch_type");
        structures.put(Java8Parser.CatchFormalParameterContext.class, "catch_formal_parameter");
        structures.put(Java8Parser.CatchClauseContext.class, "catch_clause");
        structures.put(Java8Parser.CatchesContext.class, "catches");
        structures.put(Java8Parser.TryStatementContext.class, "try_statement");
        structures.put(Java8Parser.SynchronizedStatementContext.class, "synchronized_statement");
        structures.put(Java8Parser.ThrowStatementContext.class, "throw_statement");
        structures.put(Java8Parser.ReturnStatementContext.class, "return_statement");
        structures.put(Java8Parser.ContinueStatementContext.class, "continue_statement");
        structures.put(Java8Parser.BreakStatementContext.class, "break_statement");
        structures.put(Java8Parser.EnhancedForStatementNoShortIfContext.class, "enhanced_for_statement_no_short_if");
        structures.put(Java8Parser.EnhancedForStatementContext.class, "enhanced_for_statement");
        structures.put(Java8Parser.StatementExpressionListContext.class, "statement_expression_list");
        structures.put(Java8Parser.ForUpdateContext.class, "for_update");
        structures.put(Java8Parser.ForInitContext.class, "for_init");
        structures.put(Java8Parser.BasicForStatementNoShortIfContext.class, "basic_for_statement_no_short_if");
        structures.put(Java8Parser.BasicForStatementContext.class, "basic_for_statement");
        structures.put(Java8Parser.ForStatementNoShortIfContext.class, "for_statement_no_short_if");
        structures.put(Java8Parser.ForStatementContext.class, "for_statement");
        structures.put(Java8Parser.DoStatementContext.class, "do_statement");
        structures.put(Java8Parser.WhileStatementNoShortIfContext.class, "while_statement_no_short_if");
        structures.put(Java8Parser.WhileStatementContext.class, "while_statement");
        structures.put(Java8Parser.EnumConstantNameContext.class, "enum_constant_name");
        structures.put(Java8Parser.SwitchLabelContext.class, "switch_label");
        structures.put(Java8Parser.SwitchLabelsContext.class, "switch_labels");
        structures.put(Java8Parser.SwitchBlockStatementGroupContext.class, "switch_block_statement_group");
        structures.put(Java8Parser.SwitchBlockContext.class, "switch_block");
        structures.put(Java8Parser.SwitchStatementContext.class, "switch_statement");
        structures.put(Java8Parser.AssertStatementContext.class, "assert_statement");
        structures.put(Java8Parser.IfThenElseStatementNoShortIfContext.class, "if_then_else_statement_no_short_if");
        structures.put(Java8Parser.IfThenElseStatementContext.class, "if_then_else_statement");
        structures.put(Java8Parser.IfThenStatementContext.class, "if_then_statement");
        structures.put(Java8Parser.StatementExpressionContext.class, "statement_expression");
        structures.put(Java8Parser.ExpressionStatementContext.class, "expression_statement");
        structures.put(Java8Parser.LabeledStatementNoShortIfContext.class, "labeled_statement_no_short_if");
        structures.put(Java8Parser.LabeledStatementContext.class, "labeled_statement");
        structures.put(Java8Parser.EmptyStatementContext.class, "empty_statement");
        structures.put(Java8Parser.StatementWithoutTrailingSubstatementContext.class, "statement_without_trailing_substatement");
        structures.put(Java8Parser.StatementNoShortIfContext.class, "statement_no_short_if");
        structures.put(Java8Parser.StatementContext.class, "statement");
        structures.put(Java8Parser.LocalVariableDeclarationContext.class, "local_variable_declaration");
        structures.put(Java8Parser.LocalVariableDeclarationStatementContext.class, "local_variable_declaration_statement");
        structures.put(Java8Parser.BlockStatementContext.class, "block_statement");
        structures.put(Java8Parser.BlockStatementsContext.class, "block_statements");
        structures.put(Java8Parser.BlockContext.class, "block");
        structures.put(Java8Parser.VariableInitializerListContext.class, "variable_initializer_list");
        structures.put(Java8Parser.ArrayInitializerContext.class, "array_initializer");
        structures.put(Java8Parser.SingleElementAnnotationContext.class, "single_element_annotation");
        structures.put(Java8Parser.MarkerAnnotationContext.class, "marker_annotation");
        structures.put(Java8Parser.ElementValueListContext.class, "element_value_list");
        structures.put(Java8Parser.ElementValueArrayInitializerContext.class, "element_value_array_initializer");
        structures.put(Java8Parser.ElementValueContext.class, "element_value");
        structures.put(Java8Parser.ElementValuePairContext.class, "element_value_pair");
        structures.put(Java8Parser.ElementValuePairListContext.class, "element_value_pair_list");
        structures.put(Java8Parser.NormalAnnotationContext.class, "normal_annotation");
        structures.put(Java8Parser.AnnotationContext.class, "annotation");
        structures.put(Java8Parser.DefaultValueContext.class, "default_value");
        structures.put(Java8Parser.AnnotationTypeElementModifierContext.class, "annotation_type_element_modifier");
        structures.put(Java8Parser.AnnotationTypeElementDeclarationContext.class, "annotation_type_element_declaration");
        structures.put(Java8Parser.AnnotationTypeMemberDeclarationContext.class, "annotation_type_member_declaration");
        structures.put(Java8Parser.AnnotationTypeBodyContext.class, "annotation_type_body");
        structures.put(Java8Parser.AnnotationTypeDeclarationContext.class, "annotation_type_declaration");
        structures.put(Java8Parser.InterfaceMethodModifierContext.class, "interface_method_modifier");
        structures.put(Java8Parser.InterfaceMethodDeclarationContext.class, "interface_method_declaration");
        structures.put(Java8Parser.ConstantModifierContext.class, "constant_modifier");
        structures.put(Java8Parser.ConstantDeclarationContext.class, "constant_declaration");
        structures.put(Java8Parser.InterfaceMemberDeclarationContext.class, "interface_member_declaration");
        structures.put(Java8Parser.InterfaceBodyContext.class, "interface_body");
        structures.put(Java8Parser.ExtendsInterfacesContext.class, "extends_interfaces");
        structures.put(Java8Parser.InterfaceModifierContext.class, "interface_modifier");
        structures.put(Java8Parser.NormalInterfaceDeclarationContext.class, "normal_interface_declaration");
        structures.put(Java8Parser.InterfaceDeclarationContext.class, "interface_declaration");
        structures.put(Java8Parser.EnumBodyDeclarationsContext.class, "enum_body_declarations");
        structures.put(Java8Parser.EnumConstantModifierContext.class, "enum_constant_modifier");
        structures.put(Java8Parser.EnumConstantContext.class, "enum_constant");
        structures.put(Java8Parser.EnumConstantListContext.class, "enum_constant_list");
        structures.put(Java8Parser.EnumBodyContext.class, "enum_body");
        structures.put(Java8Parser.EnumDeclarationContext.class, "enum_declaration");
        structures.put(Java8Parser.ExplicitConstructorInvocationContext.class, "explicit_constructor_invocation");
        structures.put(Java8Parser.ConstructorBodyContext.class, "constructor_body");
        structures.put(Java8Parser.SimpleTypeNameContext.class, "simple_type_name");
        structures.put(Java8Parser.ConstructorDeclaratorContext.class, "constructor_declarator");
        structures.put(Java8Parser.ConstructorModifierContext.class, "constructor_modifier");
        structures.put(Java8Parser.ConstructorDeclarationContext.class, "constructor_declaration");
        structures.put(Java8Parser.StaticInitializerContext.class, "static_initializer");
        structures.put(Java8Parser.InstanceInitializerContext.class, "instance_initializer");
        structures.put(Java8Parser.MethodBodyContext.class, "method_body");
        structures.put(Java8Parser.ExceptionTypeContext.class, "exception_type");
        structures.put(Java8Parser.ExceptionTypeListContext.class, "exception_type_list");
        structures.put(Java8Parser.Throws_Context.class, "throws_");
        structures.put(Java8Parser.ReceiverParameterContext.class, "receiver_parameter");
        structures.put(Java8Parser.LastFormalParameterContext.class, "last_formal_parameter");
        structures.put(Java8Parser.VariableModifierContext.class, "variable_modifier");
        structures.put(Java8Parser.FormalParameterContext.class, "formal_parameter");
        structures.put(Java8Parser.FormalParametersContext.class, "formal_parameters");
        structures.put(Java8Parser.FormalParameterListContext.class, "formal_parameter_list");
        structures.put(Java8Parser.MethodDeclaratorContext.class, "method_declarator");
        structures.put(Java8Parser.ResultContext.class, "result");
        structures.put(Java8Parser.MethodHeaderContext.class, "method_header");
        structures.put(Java8Parser.MethodModifierContext.class, "method_modifier");
        structures.put(Java8Parser.MethodDeclarationContext.class, "method_declaration");
        structures.put(Java8Parser.UnannArrayTypeContext.class, "unann_array_type");
        structures.put(Java8Parser.UnannTypeVariableContext.class, "unann_type_variable");
        structures.put(Java8Parser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext.class, "unann_interface_type_lfno_unann_class_or_interface_type");
        structures.put(Java8Parser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class, "unann_interface_type_lf_unann_class_or_interface_type");
        structures.put(Java8Parser.UnannInterfaceTypeContext.class, "unann_interface_type");
        structures.put(Java8Parser.UnannClassType_lfno_unannClassOrInterfaceTypeContext.class, "unann_class_type_lfno_unann_class_or_interface_type");
        structures.put(Java8Parser.UnannClassType_lf_unannClassOrInterfaceTypeContext.class, "unann_class_type_lf_unann_class_or_interface_type");
        structures.put(Java8Parser.UnannClassTypeContext.class, "unann_class_type");
        structures.put(Java8Parser.UnannClassOrInterfaceTypeContext.class, "unann_class_or_interface_type");
        structures.put(Java8Parser.UnannReferenceTypeContext.class, "unann_reference_type");
        structures.put(Java8Parser.UnannPrimitiveTypeContext.class, "unann_primitive_type");
        structures.put(Java8Parser.UnannTypeContext.class, "unann_type");
        structures.put(Java8Parser.VariableInitializerContext.class, "variable_initializer");
        structures.put(Java8Parser.VariableDeclaratorIdContext.class, "variable_declarator_id");
        structures.put(Java8Parser.VariableDeclaratorContext.class, "variable_declarator");
        structures.put(Java8Parser.VariableDeclaratorListContext.class, "variable_declarator_list");
        structures.put(Java8Parser.FieldModifierContext.class, "field_modifier");
        structures.put(Java8Parser.FieldDeclarationContext.class, "field_declaration");
        structures.put(Java8Parser.ClassMemberDeclarationContext.class, "class_member_declaration");
        structures.put(Java8Parser.ClassBodyDeclarationContext.class, "class_body_declaration");
        structures.put(Java8Parser.ClassBodyContext.class, "class_body");
        structures.put(Java8Parser.InterfaceTypeListContext.class, "interface_type_list");
        structures.put(Java8Parser.SuperinterfacesContext.class, "superinterfaces");
        structures.put(Java8Parser.SuperclassContext.class, "superclass");
        structures.put(Java8Parser.TypeParameterListContext.class, "type_parameter_list");
        structures.put(Java8Parser.TypeParametersContext.class, "type_parameters");
        structures.put(Java8Parser.ClassModifierContext.class, "class_modifier");
        structures.put(Java8Parser.NormalClassDeclarationContext.class, "normal_class_declaration");
        structures.put(Java8Parser.ClassDeclarationContext.class, "class_declaration");
        structures.put(Java8Parser.TypeDeclarationContext.class, "type_declaration");
        structures.put(Java8Parser.StaticImportOnDemandDeclarationContext.class, "static_import_on_demand_declaration");
        structures.put(Java8Parser.SingleStaticImportDeclarationContext.class, "single_static_import_declaration");
        structures.put(Java8Parser.TypeImportOnDemandDeclarationContext.class, "type_import_on_demand_declaration");
        structures.put(Java8Parser.SingleTypeImportDeclarationContext.class, "single_type_import_declaration");
        structures.put(Java8Parser.ImportDeclarationContext.class, "import_declaration");
        structures.put(Java8Parser.PackageModifierContext.class, "package_modifier");
        structures.put(Java8Parser.PackageDeclarationContext.class, "package_declaration");
        structures.put(Java8Parser.AmbiguousNameContext.class, "ambiguous_name");
        structures.put(Java8Parser.MethodNameContext.class, "method_name");
        structures.put(Java8Parser.ExpressionNameContext.class, "expression_name");
        structures.put(Java8Parser.PackageOrTypeNameContext.class, "package_or_type_name");
        structures.put(Java8Parser.TypeNameContext.class, "type_name");
        structures.put(Java8Parser.PackageNameContext.class, "package_name");
        structures.put(Java8Parser.WildcardBoundsContext.class, "wildcard_bounds");
        structures.put(Java8Parser.WildcardContext.class, "wildcard");
        structures.put(Java8Parser.TypeArgumentContext.class, "type_argument");
        structures.put(Java8Parser.TypeArgumentListContext.class, "type_argument_list");
        structures.put(Java8Parser.TypeArgumentsContext.class, "type_arguments");
        structures.put(Java8Parser.AdditionalBoundContext.class, "additional_bound");
        structures.put(Java8Parser.TypeBoundContext.class, "type_bound");
        structures.put(Java8Parser.TypeParameterModifierContext.class, "type_parameter_modifier");
        structures.put(Java8Parser.TypeParameterContext.class, "type_parameter");
        structures.put(Java8Parser.DimsContext.class, "dims");
        structures.put(Java8Parser.ArrayTypeContext.class, "array_type");
        structures.put(Java8Parser.TypeVariableContext.class, "type_variable");
        structures.put(Java8Parser.InterfaceType_lfno_classOrInterfaceTypeContext.class, "interface_type_lfno_class_or_interface_type");
        structures.put(Java8Parser.InterfaceType_lf_classOrInterfaceTypeContext.class, "interface_type_lf_class_or_interface_type");
        structures.put(Java8Parser.InterfaceTypeContext.class, "interface_type");
        structures.put(Java8Parser.ClassType_lfno_classOrInterfaceTypeContext.class, "class_type_lfno_class_or_interface_type");
        structures.put(Java8Parser.ClassType_lf_classOrInterfaceTypeContext.class, "class_type_lf_class_or_interface_type");
        structures.put(Java8Parser.ClassTypeContext.class, "class_type");
        structures.put(Java8Parser.ClassOrInterfaceTypeContext.class, "class_or_interface_type");
        structures.put(Java8Parser.ReferenceTypeContext.class, "reference_type");
        structures.put(Java8Parser.FloatingPointTypeContext.class, "floating_point_type");
        structures.put(Java8Parser.IntegralTypeContext.class, "integral_type");
        structures.put(Java8Parser.NumericTypeContext.class, "numeric_type");
        structures.put(Java8Parser.PrimitiveTypeContext.class, "primitive_type");
        structures.put(Java8Parser.LiteralContext.class, "literal");
    }

    private List<DataRow> dataRows;

    public DataCollector() {
        dataRows = new ArrayList<>();
    }

    private String findCodeFragment(ParseTree ctx) {
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

    private String findContext(ParseTree ctx) {
        for (ParseTree node = ctx.getParent(); node != null; node = node.getParent()) {
            for (Class structureClass : structures.keySet()) {
                if (node.getClass().equals(structureClass)) {
                    return structures.get(structureClass);
                }
            }
        }
        return null;
    }

    public void collectDataRow(ParseTree ctx) {
        DataRow dataRow = new DataRow();
        dataRow.setLabel(structures.get(ctx.getClass()));
        dataRow.setContext(findContext(ctx));
        dataRow.setCodeFragment(findCodeFragment(ctx).trim());
        dataRows.add(dataRow);
    }

    public List<DataRow> getDataRows() {
        log.info("Found " + dataRows.size() + " structures");
        return dataRows;
    }

}