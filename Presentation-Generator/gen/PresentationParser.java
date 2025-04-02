// Generated from C:/Users/Adrian/Documents/Github/MIASI-Presentation-Generator/Presentation-Generator/src/PresentationParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PresentationParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SLIDE=1, TEXT=2, IMAGE=3, COLON=4, NEW_LINE=5, COMMENT=6, L_PAR=7, R_PAR=8, 
		COMMA=9, INT=10, ID=11, TEXT_BLOCK=12, PATH=13, WS=14, COKOLWIEK=15;
	public static final int
		RULE_program = 0, RULE_slide = 1, RULE_func = 2, RULE_parameter = 3, RULE_vector2 = 4, 
		RULE_expr = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "slide", "func", "parameter", "vector2", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'SLIDE'", "'TEXT'", "'IMAGE'", "':'", "'\\n'", null, "'('", "')'", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SLIDE", "TEXT", "IMAGE", "COLON", "NEW_LINE", "COMMENT", "L_PAR", 
			"R_PAR", "COMMA", "INT", "ID", "TEXT_BLOCK", "PATH", "WS", "COKOLWIEK"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PresentationParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PresentationParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PresentationParser.EOF, 0); }
		public List<SlideContext> slide() {
			return getRuleContexts(SlideContext.class);
		}
		public SlideContext slide(int i) {
			return getRuleContext(SlideContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PresentationParserListener ) ((PresentationParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PresentationParserListener ) ((PresentationParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PresentationParserVisitor ) return ((PresentationParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				slide();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SLIDE );
			setState(17);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SlideContext extends ParserRuleContext {
		public SlideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slide; }
	 
		public SlideContext() { }
		public void copyFrom(SlideContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SomeSlideContext extends SlideContext {
		public TerminalNode SLIDE() { return getToken(PresentationParser.SLIDE, 0); }
		public List<TerminalNode> NEW_LINE() { return getTokens(PresentationParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(PresentationParser.NEW_LINE, i);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public SomeSlideContext(SlideContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PresentationParserListener ) ((PresentationParserListener)listener).enterSomeSlide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PresentationParserListener ) ((PresentationParserListener)listener).exitSomeSlide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PresentationParserVisitor ) return ((PresentationParserVisitor<? extends T>)visitor).visitSomeSlide(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LastSlideContext extends SlideContext {
		public TerminalNode SLIDE() { return getToken(PresentationParser.SLIDE, 0); }
		public LastSlideContext(SlideContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PresentationParserListener ) ((PresentationParserListener)listener).enterLastSlide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PresentationParserListener ) ((PresentationParserListener)listener).exitLastSlide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PresentationParserVisitor ) return ((PresentationParserVisitor<? extends T>)visitor).visitLastSlide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlideContext slide() throws RecognitionException {
		SlideContext _localctx = new SlideContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_slide);
		int _la;
		try {
			setState(32);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new SomeSlideContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				match(SLIDE);
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(20);
					match(NEW_LINE);
					}
					}
					setState(23); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEXT || _la==IMAGE) {
					{
					{
					setState(25);
					func();
					}
					}
					setState(30);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new LastSlideContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(SLIDE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncContext extends ParserRuleContext {
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	 
		public FuncContext() { }
		public void copyFrom(FuncContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextFunctionContext extends FuncContext {
		public TerminalNode TEXT() { return getToken(PresentationParser.TEXT, 0); }
		public List<TerminalNode> NEW_LINE() { return getTokens(PresentationParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(PresentationParser.NEW_LINE, i);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public TextFunctionContext(FuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PresentationParserListener ) ((PresentationParserListener)listener).enterTextFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PresentationParserListener ) ((PresentationParserListener)listener).exitTextFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PresentationParserVisitor ) return ((PresentationParserVisitor<? extends T>)visitor).visitTextFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImageFunctionContext extends FuncContext {
		public TerminalNode IMAGE() { return getToken(PresentationParser.IMAGE, 0); }
		public List<TerminalNode> NEW_LINE() { return getTokens(PresentationParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(PresentationParser.NEW_LINE, i);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ImageFunctionContext(FuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PresentationParserListener ) ((PresentationParserListener)listener).enterImageFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PresentationParserListener ) ((PresentationParserListener)listener).exitImageFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PresentationParserVisitor ) return ((PresentationParserVisitor<? extends T>)visitor).visitImageFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LastFunctionContext extends FuncContext {
		public TerminalNode TEXT() { return getToken(PresentationParser.TEXT, 0); }
		public TerminalNode IMAGE() { return getToken(PresentationParser.IMAGE, 0); }
		public LastFunctionContext(FuncContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PresentationParserListener ) ((PresentationParserListener)listener).enterLastFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PresentationParserListener ) ((PresentationParserListener)listener).exitLastFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PresentationParserVisitor ) return ((PresentationParserVisitor<? extends T>)visitor).visitLastFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_func);
		int _la;
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new TextFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(TEXT);
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(35);
					match(NEW_LINE);
					}
					}
					setState(38); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(40);
					parameter();
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new ImageFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(IMAGE);
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(47);
					match(NEW_LINE);
					}
					}
					setState(50); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(52);
					parameter();
					}
					}
					setState(57);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				_localctx = new LastFunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				_la = _input.LA(1);
				if ( !(_la==TEXT || _la==IMAGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	 
		public ParameterContext() { }
		public void copyFrom(ParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SomeParameterContext extends ParameterContext {
		public TerminalNode ID() { return getToken(PresentationParser.ID, 0); }
		public TerminalNode COLON() { return getToken(PresentationParser.COLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(PresentationParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(PresentationParser.NEW_LINE, i);
		}
		public SomeParameterContext(ParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PresentationParserListener ) ((PresentationParserListener)listener).enterSomeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PresentationParserListener ) ((PresentationParserListener)listener).exitSomeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PresentationParserVisitor ) return ((PresentationParserVisitor<? extends T>)visitor).visitSomeParameter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LastParameterContext extends ParameterContext {
		public TerminalNode ID() { return getToken(PresentationParser.ID, 0); }
		public TerminalNode COLON() { return getToken(PresentationParser.COLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(PresentationParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(PresentationParser.NEW_LINE, i);
		}
		public LastParameterContext(ParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PresentationParserListener ) ((PresentationParserListener)listener).enterLastParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PresentationParserListener ) ((PresentationParserListener)listener).exitLastParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PresentationParserVisitor ) return ((PresentationParserVisitor<? extends T>)visitor).visitLastParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameter);
		int _la;
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new SomeParameterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(ID);
				setState(62);
				match(COLON);
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(63);
					match(NEW_LINE);
					}
					}
					setState(68);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(69);
				expr();
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(70);
					match(NEW_LINE);
					}
					}
					setState(73); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				}
				break;
			case 2:
				_localctx = new LastParameterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(ID);
				setState(76);
				match(COLON);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(77);
					match(NEW_LINE);
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83);
				expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Vector2Context extends ParserRuleContext {
		public Token x;
		public Token y;
		public TerminalNode L_PAR() { return getToken(PresentationParser.L_PAR, 0); }
		public TerminalNode COMMA() { return getToken(PresentationParser.COMMA, 0); }
		public TerminalNode R_PAR() { return getToken(PresentationParser.R_PAR, 0); }
		public List<TerminalNode> INT() { return getTokens(PresentationParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(PresentationParser.INT, i);
		}
		public Vector2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PresentationParserListener ) ((PresentationParserListener)listener).enterVector2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PresentationParserListener ) ((PresentationParserListener)listener).exitVector2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PresentationParserVisitor ) return ((PresentationParserVisitor<? extends T>)visitor).visitVector2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vector2Context vector2() throws RecognitionException {
		Vector2Context _localctx = new Vector2Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_vector2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(L_PAR);
			setState(87);
			((Vector2Context)_localctx).x = match(INT);
			setState(88);
			match(COMMA);
			setState(89);
			((Vector2Context)_localctx).y = match(INT);
			setState(90);
			match(R_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PresentationParser.INT, 0); }
		public Vector2Context vector2() {
			return getRuleContext(Vector2Context.class,0);
		}
		public TerminalNode TEXT_BLOCK() { return getToken(PresentationParser.TEXT_BLOCK, 0); }
		public TerminalNode PATH() { return getToken(PresentationParser.PATH, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PresentationParserListener ) ((PresentationParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PresentationParserListener ) ((PresentationParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PresentationParserVisitor ) return ((PresentationParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(INT);
				}
				break;
			case L_PAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				vector2();
				}
				break;
			case TEXT_BLOCK:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(TEXT_BLOCK);
				}
				break;
			case PATH:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				match(PATH);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000fc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0004\u0000\u000e\b\u0000\u000b\u0000\f"+
		"\u0000\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0004\u0001"+
		"\u0016\b\u0001\u000b\u0001\f\u0001\u0017\u0001\u0001\u0005\u0001\u001b"+
		"\b\u0001\n\u0001\f\u0001\u001e\t\u0001\u0001\u0001\u0003\u0001!\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0004\u0002%\b\u0002\u000b\u0002\f\u0002&\u0001"+
		"\u0002\u0005\u0002*\b\u0002\n\u0002\f\u0002-\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0004\u00021\b\u0002\u000b\u0002\f\u00022\u0001\u0002\u0005\u0002"+
		"6\b\u0002\n\u0002\f\u00029\t\u0002\u0001\u0002\u0003\u0002<\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003A\b\u0003\n\u0003\f\u0003D\t"+
		"\u0003\u0001\u0003\u0001\u0003\u0004\u0003H\b\u0003\u000b\u0003\f\u0003"+
		"I\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003O\b\u0003\n\u0003\f\u0003"+
		"R\t\u0003\u0001\u0003\u0003\u0003U\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005a\b\u0005\u0001\u0005\u0000\u0000\u0006"+
		"\u0000\u0002\u0004\u0006\b\n\u0000\u0001\u0001\u0000\u0002\u0003m\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0002 \u0001\u0000\u0000\u0000\u0004;\u0001"+
		"\u0000\u0000\u0000\u0006T\u0001\u0000\u0000\u0000\bV\u0001\u0000\u0000"+
		"\u0000\n`\u0001\u0000\u0000\u0000\f\u000e\u0003\u0002\u0001\u0000\r\f"+
		"\u0001\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f\r\u0001"+
		"\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0011\u0001"+
		"\u0000\u0000\u0000\u0011\u0012\u0005\u0000\u0000\u0001\u0012\u0001\u0001"+
		"\u0000\u0000\u0000\u0013\u0015\u0005\u0001\u0000\u0000\u0014\u0016\u0005"+
		"\u0005\u0000\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0017\u0001"+
		"\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001"+
		"\u0000\u0000\u0000\u0018\u001c\u0001\u0000\u0000\u0000\u0019\u001b\u0003"+
		"\u0004\u0002\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b\u001e\u0001"+
		"\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001"+
		"\u0000\u0000\u0000\u001d!\u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000"+
		"\u0000\u0000\u001f!\u0005\u0001\u0000\u0000 \u0013\u0001\u0000\u0000\u0000"+
		" \u001f\u0001\u0000\u0000\u0000!\u0003\u0001\u0000\u0000\u0000\"$\u0005"+
		"\u0002\u0000\u0000#%\u0005\u0005\u0000\u0000$#\u0001\u0000\u0000\u0000"+
		"%&\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000"+
		"\u0000\'+\u0001\u0000\u0000\u0000(*\u0003\u0006\u0003\u0000)(\u0001\u0000"+
		"\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001"+
		"\u0000\u0000\u0000,<\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000"+
		".0\u0005\u0003\u0000\u0000/1\u0005\u0005\u0000\u00000/\u0001\u0000\u0000"+
		"\u000012\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000023\u0001\u0000"+
		"\u0000\u000037\u0001\u0000\u0000\u000046\u0003\u0006\u0003\u000054\u0001"+
		"\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u00008<\u0001\u0000\u0000\u000097\u0001\u0000\u0000"+
		"\u0000:<\u0007\u0000\u0000\u0000;\"\u0001\u0000\u0000\u0000;.\u0001\u0000"+
		"\u0000\u0000;:\u0001\u0000\u0000\u0000<\u0005\u0001\u0000\u0000\u0000"+
		"=>\u0005\u000b\u0000\u0000>B\u0005\u0004\u0000\u0000?A\u0005\u0005\u0000"+
		"\u0000@?\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001\u0000"+
		"\u0000\u0000BC\u0001\u0000\u0000\u0000CE\u0001\u0000\u0000\u0000DB\u0001"+
		"\u0000\u0000\u0000EG\u0003\n\u0005\u0000FH\u0005\u0005\u0000\u0000GF\u0001"+
		"\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000"+
		"IJ\u0001\u0000\u0000\u0000JU\u0001\u0000\u0000\u0000KL\u0005\u000b\u0000"+
		"\u0000LP\u0005\u0004\u0000\u0000MO\u0005\u0005\u0000\u0000NM\u0001\u0000"+
		"\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001"+
		"\u0000\u0000\u0000QS\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000"+
		"SU\u0003\n\u0005\u0000T=\u0001\u0000\u0000\u0000TK\u0001\u0000\u0000\u0000"+
		"U\u0007\u0001\u0000\u0000\u0000VW\u0005\u0007\u0000\u0000WX\u0005\n\u0000"+
		"\u0000XY\u0005\t\u0000\u0000YZ\u0005\n\u0000\u0000Z[\u0005\b\u0000\u0000"+
		"[\t\u0001\u0000\u0000\u0000\\a\u0005\n\u0000\u0000]a\u0003\b\u0004\u0000"+
		"^a\u0005\f\u0000\u0000_a\u0005\r\u0000\u0000`\\\u0001\u0000\u0000\u0000"+
		"`]\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`_\u0001\u0000\u0000"+
		"\u0000a\u000b\u0001\u0000\u0000\u0000\u000e\u000f\u0017\u001c &+27;BI"+
		"PT`";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}