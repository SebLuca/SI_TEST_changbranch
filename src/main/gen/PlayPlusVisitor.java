// Generated from C:/Users/samiq/Documents/GitHub/2021_INFOB314_G10/src/main/antlr4/be/unamur/info/b314/compiler\PlayPlus.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PlayPlusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PlayPlusVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(PlayPlusParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code skipInst}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipInst(PlayPlusParser.SkipInstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifInst}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfInst(PlayPlusParser.IfInstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElseInst}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseInst(PlayPlusParser.IfElseInstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileInst}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileInst(PlayPlusParser.WhileInstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code affectInstr}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectInstr(PlayPlusParser.AffectInstrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code computeInst}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputeInst(PlayPlusParser.ComputeInstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actionInst}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionInst(PlayPlusParser.ActionInstContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#impDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpDecl(PlayPlusParser.ImpDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#fileDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileDecl(PlayPlusParser.FileDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#fileName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileName(PlayPlusParser.FileNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#programmemonde}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgrammemonde(PlayPlusParser.ProgrammemondeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#programmestrat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgrammestrat(PlayPlusParser.ProgrammestratContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#clauseDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClauseDefault(PlayPlusParser.ClauseDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#clauseWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClauseWhen(PlayPlusParser.ClauseWhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(PlayPlusParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PlayPlusParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#scalar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar(PlayPlusParser.ScalarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(PlayPlusParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#fctDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFctDecl(PlayPlusParser.FctDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#exprG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprG(PlayPlusParser.ExprGContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprD(PlayPlusParser.ExprDContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#exprEnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEnt(PlayPlusParser.ExprEntContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#exprBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBool(PlayPlusParser.ExprBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCase(PlayPlusParser.ExprCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(PlayPlusParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayPlusParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(PlayPlusParser.CommentContext ctx);
}