// Generated from DeciLan.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DeciLanParser}.
 */
public interface DeciLanListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DeciLanParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(DeciLanParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeciLanParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(DeciLanParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeciLanParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(DeciLanParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeciLanParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(DeciLanParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeciLanParser#inputDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInputDeclaration(DeciLanParser.InputDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeciLanParser#inputDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInputDeclaration(DeciLanParser.InputDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeciLanParser#inputFieldsStatement}.
	 * @param ctx the parse tree
	 */
	void enterInputFieldsStatement(DeciLanParser.InputFieldsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeciLanParser#inputFieldsStatement}.
	 * @param ctx the parse tree
	 */
	void exitInputFieldsStatement(DeciLanParser.InputFieldsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeciLanParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(DeciLanParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeciLanParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(DeciLanParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeciLanParser#modelDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterModelDeclaration(DeciLanParser.ModelDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeciLanParser#modelDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitModelDeclaration(DeciLanParser.ModelDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeciLanParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(DeciLanParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeciLanParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(DeciLanParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeciLanParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(DeciLanParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeciLanParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(DeciLanParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeciLanParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DeciLanParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeciLanParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DeciLanParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeciLanParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(DeciLanParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeciLanParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(DeciLanParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeciLanParser#variableAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignmentStatement(DeciLanParser.VariableAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeciLanParser#variableAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignmentStatement(DeciLanParser.VariableAssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeciLanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DeciLanParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeciLanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DeciLanParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeciLanParser#methodParameterList}.
	 * @param ctx the parse tree
	 */
	void enterMethodParameterList(DeciLanParser.MethodParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeciLanParser#methodParameterList}.
	 * @param ctx the parse tree
	 */
	void exitMethodParameterList(DeciLanParser.MethodParameterListContext ctx);
}