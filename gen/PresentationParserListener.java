// Generated from /home/wojtek/Dokumenty/PWR/MGR/MIASI/Projekt/MIASI-Presentation-Generator/Presentation-Generator/src/PresentationParser.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by the {@code someSlide}
	 * labeled alternative in {@link PresentationParser#slide}.
	 * @param ctx the parse tree
	 */
	void enterSomeSlide(PresentationParser.SomeSlideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code someSlide}
	 * labeled alternative in {@link PresentationParser#slide}.
	 * @param ctx the parse tree
	 */
	void exitSomeSlide(PresentationParser.SomeSlideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lastSlide}
	 * labeled alternative in {@link PresentationParser#slide}.
	 * @param ctx the parse tree
	 */
	void enterLastSlide(PresentationParser.LastSlideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lastSlide}
	 * labeled alternative in {@link PresentationParser#slide}.
	 * @param ctx the parse tree
	 */
	void exitLastSlide(PresentationParser.LastSlideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textFunction}
	 * labeled alternative in {@link PresentationParser#func}.
	 * @param ctx the parse tree
	 */
	void enterTextFunction(PresentationParser.TextFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textFunction}
	 * labeled alternative in {@link PresentationParser#func}.
	 * @param ctx the parse tree
	 */
	void exitTextFunction(PresentationParser.TextFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code imageFunction}
	 * labeled alternative in {@link PresentationParser#func}.
	 * @param ctx the parse tree
	 */
	void enterImageFunction(PresentationParser.ImageFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code imageFunction}
	 * labeled alternative in {@link PresentationParser#func}.
	 * @param ctx the parse tree
	 */
	void exitImageFunction(PresentationParser.ImageFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lastFunction}
	 * labeled alternative in {@link PresentationParser#func}.
	 * @param ctx the parse tree
	 */
	void enterLastFunction(PresentationParser.LastFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lastFunction}
	 * labeled alternative in {@link PresentationParser#func}.
	 * @param ctx the parse tree
	 */
	void exitLastFunction(PresentationParser.LastFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code someParameter}
	 * labeled alternative in {@link PresentationParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterSomeParameter(PresentationParser.SomeParameterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code someParameter}
	 * labeled alternative in {@link PresentationParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitSomeParameter(PresentationParser.SomeParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lastParameter}
	 * labeled alternative in {@link PresentationParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterLastParameter(PresentationParser.LastParameterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lastParameter}
	 * labeled alternative in {@link PresentationParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitLastParameter(PresentationParser.LastParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PresentationParser#vector2}.
	 * @param ctx the parse tree
	 */
	void enterVector2(PresentationParser.Vector2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PresentationParser#vector2}.
	 * @param ctx the parse tree
	 */
	void exitVector2(PresentationParser.Vector2Context ctx);
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
}