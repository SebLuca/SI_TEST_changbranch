// Generated from C:/Users/samiq/Documents/GitHub/2021_INFOB314_G10/src/main/antlr4/be/unamur/info/b314/compiler\PlayPlus.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlayPlusParser}.
 */
public interface PlayPlusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(PlayPlusParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(PlayPlusParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code skipInst}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterSkipInst(PlayPlusParser.SkipInstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code skipInst}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitSkipInst(PlayPlusParser.SkipInstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifInst}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterIfInst(PlayPlusParser.IfInstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifInst}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitIfInst(PlayPlusParser.IfInstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElseInst}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterIfElseInst(PlayPlusParser.IfElseInstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElseInst}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitIfElseInst(PlayPlusParser.IfElseInstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileInst}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterWhileInst(PlayPlusParser.WhileInstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileInst}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitWhileInst(PlayPlusParser.WhileInstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code affectInstr}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterAffectInstr(PlayPlusParser.AffectInstrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code affectInstr}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitAffectInstr(PlayPlusParser.AffectInstrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code computeInst}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterComputeInst(PlayPlusParser.ComputeInstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code computeInst}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitComputeInst(PlayPlusParser.ComputeInstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code actionInst}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterActionInst(PlayPlusParser.ActionInstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code actionInst}
	 * labeled alternative in {@link PlayPlusParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitActionInst(PlayPlusParser.ActionInstContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#impDecl}.
	 * @param ctx the parse tree
	 */
	void enterImpDecl(PlayPlusParser.ImpDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#impDecl}.
	 * @param ctx the parse tree
	 */
	void exitImpDecl(PlayPlusParser.ImpDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#fileDecl}.
	 * @param ctx the parse tree
	 */
	void enterFileDecl(PlayPlusParser.FileDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#fileDecl}.
	 * @param ctx the parse tree
	 */
	void exitFileDecl(PlayPlusParser.FileDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterFileName(PlayPlusParser.FileNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitFileName(PlayPlusParser.FileNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#programmemonde}.
	 * @param ctx the parse tree
	 */
	void enterProgrammemonde(PlayPlusParser.ProgrammemondeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#programmemonde}.
	 * @param ctx the parse tree
	 */
	void exitProgrammemonde(PlayPlusParser.ProgrammemondeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#programmestrat}.
	 * @param ctx the parse tree
	 */
	void enterProgrammestrat(PlayPlusParser.ProgrammestratContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#programmestrat}.
	 * @param ctx the parse tree
	 */
	void exitProgrammestrat(PlayPlusParser.ProgrammestratContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#clauseDefault}.
	 * @param ctx the parse tree
	 */
	void enterClauseDefault(PlayPlusParser.ClauseDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#clauseDefault}.
	 * @param ctx the parse tree
	 */
	void exitClauseDefault(PlayPlusParser.ClauseDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#clauseWhen}.
	 * @param ctx the parse tree
	 */
	void enterClauseWhen(PlayPlusParser.ClauseWhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#clauseWhen}.
	 * @param ctx the parse tree
	 */
	void exitClauseWhen(PlayPlusParser.ClauseWhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(PlayPlusParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(PlayPlusParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PlayPlusParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PlayPlusParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#scalar}.
	 * @param ctx the parse tree
	 */
	void enterScalar(PlayPlusParser.ScalarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#scalar}.
	 * @param ctx the parse tree
	 */
	void exitScalar(PlayPlusParser.ScalarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(PlayPlusParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(PlayPlusParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#fctDecl}.
	 * @param ctx the parse tree
	 */
	void enterFctDecl(PlayPlusParser.FctDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#fctDecl}.
	 * @param ctx the parse tree
	 */
	void exitFctDecl(PlayPlusParser.FctDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#exprG}.
	 * @param ctx the parse tree
	 */
	void enterExprG(PlayPlusParser.ExprGContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#exprG}.
	 * @param ctx the parse tree
	 */
	void exitExprG(PlayPlusParser.ExprGContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void enterExprD(PlayPlusParser.ExprDContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#exprD}.
	 * @param ctx the parse tree
	 */
	void exitExprD(PlayPlusParser.ExprDContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void enterExprEnt(PlayPlusParser.ExprEntContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#exprEnt}.
	 * @param ctx the parse tree
	 */
	void exitExprEnt(PlayPlusParser.ExprEntContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#exprBool}.
	 * @param ctx the parse tree
	 */
	void enterExprBool(PlayPlusParser.ExprBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#exprBool}.
	 * @param ctx the parse tree
	 */
	void exitExprBool(PlayPlusParser.ExprBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 */
	void enterExprCase(PlayPlusParser.ExprCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#exprCase}.
	 * @param ctx the parse tree
	 */
	void exitExprCase(PlayPlusParser.ExprCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(PlayPlusParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(PlayPlusParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayPlusParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(PlayPlusParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayPlusParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(PlayPlusParser.CommentContext ctx);
}