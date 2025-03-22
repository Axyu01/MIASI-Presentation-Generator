// Generated from C:/Users/Adrian/Documents/Github/MIASI-Presentation-Generator/Presentation-Generator/src/PresentationParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PresentationParser}.
 */
public interface PresentationParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PresentationParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PresentationParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PresentationParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PresentationParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PresentationParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(PresentationParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PresentationParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(PresentationParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PresentationParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(PresentationParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PresentationParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(PresentationParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PresentationParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PresentationParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PresentationParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PresentationParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PresentationParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(PresentationParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link PresentationParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(PresentationParser.FuncContext ctx);
}