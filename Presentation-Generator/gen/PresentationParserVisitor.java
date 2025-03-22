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
	 * Visit a parse tree produced by {@link PresentationParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(PresentationParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link PresentationParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(PresentationParser.DefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PresentationParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PresentationParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PresentationParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(PresentationParser.FuncContext ctx);
}