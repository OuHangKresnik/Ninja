// Generated from /Users/hangou/work/ninja/Ninja/DecisionModel/src/antlr/DeciLan.g4 by ANTLR 4.5.1
package java.ouhang.decisionmodel.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DeciLanParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DeciLanVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DeciLanParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(DeciLanParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeciLanParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(DeciLanParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeciLanParser#injectDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInjectDeclaration(DeciLanParser.InjectDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeciLanParser#inputDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputDeclaration(DeciLanParser.InputDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeciLanParser#fieldStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldStatement(DeciLanParser.FieldStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeciLanParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(DeciLanParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeciLanParser#modelDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelDeclaration(DeciLanParser.ModelDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeciLanParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(DeciLanParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeciLanParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(DeciLanParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeciLanParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DeciLanParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeciLanParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(DeciLanParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeciLanParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(DeciLanParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeciLanParser#variableAssignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignmentStatement(DeciLanParser.VariableAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeciLanParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(DeciLanParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeciLanParser#exprBooleanOper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBooleanOper(DeciLanParser.ExprBooleanOperContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeciLanParser#exprAddSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(DeciLanParser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeciLanParser#exprMulDivMod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMulDivMod(DeciLanParser.ExprMulDivModContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeciLanParser#exprNot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNot(DeciLanParser.ExprNotContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeciLanParser#exprAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAtom(DeciLanParser.ExprAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeciLanParser#exprCallMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCallMethod(DeciLanParser.ExprCallMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeciLanParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(DeciLanParser.LiteralContext ctx);
}