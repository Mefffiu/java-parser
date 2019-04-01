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

        structures.put(Java8Parser.LambdaBodyContext.class, "lambda_body");
        structures.put(Java8Parser.LambdaParametersContext.class, "lambda_parameters");
        structures.put(Java8Parser.LambdaExpressionContext.class, "lambda_expression");
        structures.put(Java8Parser.ArrayCreationExpressionContext.class, "array_creation_expression");
        structures.put(Java8Parser.MethodInvocationContext.class, "method_invocation");
        structures.put(Java8Parser.ClassInstanceCreationExpressionContext.class, "class_instance_creation_expression");
        structures.put(Java8Parser.TryWithResourcesStatementContext.class, "try_with_resources_statement");
        structures.put(Java8Parser.Finally_Context.class, "finally_");
        structures.put(Java8Parser.CatchClauseContext.class, "catch_clause");
        structures.put(Java8Parser.TryStatementContext.class, "try_statement");
        structures.put(Java8Parser.ThrowStatementContext.class, "throw_statement");
        structures.put(Java8Parser.ReturnStatementContext.class, "return_statement");
        structures.put(Java8Parser.EnhancedForStatementContext.class, "enhanced_for_statement");
        structures.put(Java8Parser.BasicForStatementContext.class, "basic_for_statement");
        structures.put(Java8Parser.ForStatementContext.class, "for_statement");
        structures.put(Java8Parser.DoStatementContext.class, "do_statement");
        structures.put(Java8Parser.WhileStatementContext.class, "while_statement");
        structures.put(Java8Parser.EnumConstantNameContext.class, "enum_constant_name");
        structures.put(Java8Parser.SwitchLabelContext.class, "switch_label");
        structures.put(Java8Parser.SwitchLabelsContext.class, "switch_labels");
        structures.put(Java8Parser.SwitchBlockStatementGroupContext.class, "switch_block_statement_group");
        structures.put(Java8Parser.SwitchBlockContext.class, "switch_block");
        structures.put(Java8Parser.SwitchStatementContext.class, "switch_statement");
        structures.put(Java8Parser.IfThenElseStatementContext.class, "if_then_else_statement");
        structures.put(Java8Parser.IfThenStatementContext.class, "if_then_statement");
        structures.put(Java8Parser.LocalVariableDeclarationContext.class, "local_variable_declaration");
        structures.put(Java8Parser.LocalVariableDeclarationStatementContext.class, "local_variable_declaration_statement");
        structures.put(Java8Parser.ConstantDeclarationContext.class, "constant_declaration");
        structures.put(Java8Parser.InterfaceBodyContext.class, "interface_body");
        structures.put(Java8Parser.ExtendsInterfacesContext.class, "extends_interfaces");
        structures.put(Java8Parser.InterfaceDeclarationContext.class, "interface_declaration");
        structures.put(Java8Parser.EnumBodyDeclarationsContext.class, "enum_body_declarations");
        structures.put(Java8Parser.EnumConstantContext.class, "enum_constant");
        structures.put(Java8Parser.EnumBodyContext.class, "enum_body");
        structures.put(Java8Parser.EnumDeclarationContext.class, "enum_declaration");
        structures.put(Java8Parser.ExplicitConstructorInvocationContext.class, "explicit_constructor_invocation");
        structures.put(Java8Parser.ConstructorBodyContext.class, "constructor_body");
        structures.put(Java8Parser.ConstructorDeclarationContext.class, "constructor_declaration");
        structures.put(Java8Parser.MethodBodyContext.class, "method_body");
        structures.put(Java8Parser.MethodHeaderContext.class, "method_header");
        structures.put(Java8Parser.MethodDeclarationContext.class, "method_declaration");
        structures.put(Java8Parser.ClassMemberDeclarationContext.class, "class_member_declaration");
        structures.put(Java8Parser.ClassBodyContext.class, "class_body");
        structures.put(Java8Parser.SuperinterfacesContext.class, "superinterfaces");
        structures.put(Java8Parser.SuperclassContext.class, "superclass");
        structures.put(Java8Parser.ClassDeclarationContext.class, "class_declaration");
        structures.put(Java8Parser.SingleStaticImportDeclarationContext.class, "single_static_import_declaration");
        structures.put(Java8Parser.ImportDeclarationContext.class, "import_declaration");
        structures.put(Java8Parser.PackageDeclarationContext.class, "package_declaration");
        structures.put(Java8Parser.MethodNameContext.class, "method_name");
        structures.put(Java8Parser.PackageNameContext.class, "package_name");
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