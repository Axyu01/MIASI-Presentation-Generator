// Generated from C:/Users/Adrian/Documents/Github/MIASI-Presentation-Generator/Presentation-Generator/src/PresentationParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PresentationParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PresentationParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PresentationParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PresentationParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code someSlide}
	 * labeled alternative in {@link PresentationParser#slide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomeSlide(PresentationParser.SomeSlideContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lastSlide}
	 * labeled alternative in {@link PresentationParser#slide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastSlide(PresentationParser.LastSlideContext ctx);
	/**
	 * Visit a parse tree produced by the {@code textFunction}
	 * labeled alternative in {@link PresentationParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFunction(PresentationParser.TextFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imageFunction}
	 * labeled alternative in {@link PresentationParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageFunction(PresentationParser.ImageFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lastFunction}
	 * labeled alternative in {@link PresentationParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFunction(PresentationParser.LastFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code someParameter}
	 * labeled alternative in {@link PresentationParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomeParameter(PresentationParser.SomeParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lastParameter}
	 * labeled alternative in {@link PresentationParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastParameter(PresentationParser.LastParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PresentationParser#vector2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector2(PresentationParser.Vector2Context ctx);
	/**
	 * Visit a parse tree produced by {@link PresentationParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PresentationParser.ExprContext ctx);
}