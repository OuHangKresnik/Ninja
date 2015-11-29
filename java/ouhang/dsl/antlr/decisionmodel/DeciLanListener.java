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
	 * Enter a parse tree produced by {@link DeciLanParser#injectDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInjectDeclaration(DeciLanParser.InjectDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeciLanParser#injectDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInjectDeclaration(DeciLanParser.InjectDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link DeciLanParser#fieldStatement}.
	 * @param ctx the parse tree
	 */
	void enterFieldStatement(DeciLanParser.FieldStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeciLanParser#fieldStatement}.
	 * @param ctx the parse tree
	 */
	void exitFieldStatement(DeciLanParser.FieldStatementContext ctx);
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
	 * Enter a parse tree produced by {@link DeciLanParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(DeciLanParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeciLanParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(DeciLanParser.ReturnStatementContext ctx);
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
	 * Enter a parse tree produced by {@link DeciLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(DeciLanParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeciLanParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(DeciLanParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeciLanParser#exprBooleanOper}.
	 * @param ctx the parse tree
	 */
	void enterExprBooleanOper(DeciLanParser.ExprBooleanOperContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeciLanParser#exprBooleanOper}.
	 * @param ctx the parse tree
	 */
	void exitExprBooleanOper(DeciLanParser.ExprBooleanOperContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeciLanParser#exprAddSub}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(DeciLanParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeciLanParser#exprAddSub}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(DeciLanParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeciLanParser#exprMulDivMod}.
	 * @param ctx the parse tree
	 */
	void enterExprMulDivMod(DeciLanParser.ExprMulDivModContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeciLanParser#exprMulDivMod}.
	 * @param ctx the parse tree
	 */
	void exitExprMulDivMod(DeciLanParser.ExprMulDivModContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeciLanParser#exprNot}.
	 * @param ctx the parse tree
	 */
	void enterExprNot(DeciLanParser.ExprNotContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeciLanParser#exprNot}.
	 * @param ctx the parse tree
	 */
	void exitExprNot(DeciLanParser.ExprNotContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeciLanParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void enterExprAtom(DeciLanParser.ExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeciLanParser#exprAtom}.
	 * @param ctx the parse tree
	 */
	void exitExprAtom(DeciLanParser.ExprAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeciLanParser#exprCallMethod}.
	 * @param ctx the parse tree
	 */
	void enterExprCallMethod(DeciLanParser.ExprCallMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeciLanParser#exprCallMethod}.
	 * @param ctx the parse tree
	 */
	void exitExprCallMethod(DeciLanParser.ExprCallMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeciLanParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(DeciLanParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeciLanParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(DeciLanParser.LiteralContext ctx);
}