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
		SLIDE=1, TEXT=2, IMAGE=3, COLON=4, NEW_LINE=5, COMMENT=6, INT=7, ID=8, 
		VECTOR2=9, TEXT_BLOCK=10, PATH=11, WS=12, COKOLWIEK=13;
	public static final int
		RULE_program = 0, RULE_slide = 1, RULE_func = 2, RULE_parameter = 3, RULE_expr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "slide", "func", "parameter", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'SLIDE'", "'TEXT'", "'IMAGE'", "':'", "'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SLIDE", "TEXT", "IMAGE", "COLON", "NEW_LINE", "COMMENT", "INT", 
			"ID", "VECTOR2", "TEXT_BLOCK", "PATH", "WS", "COKOLWIEK"
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
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				slide();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SLIDE );
			setState(15);
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
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new SomeSlideContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				match(SLIDE);
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(18);
					match(NEW_LINE);
					}
					}
					setState(21); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEXT || _la==IMAGE) {
					{
					{
					setState(23);
					func();
					}
					}
					setState(28);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new LastSlideContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
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
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new TextFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(TEXT);
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(33);
					match(NEW_LINE);
					}
					}
					setState(36); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(38);
					parameter();
					}
					}
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new ImageFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(IMAGE);
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(45);
					match(NEW_LINE);
					}
					}
					setState(48); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(50);
					parameter();
					}
					}
					setState(55);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				_localctx = new LastFunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
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
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new SomeParameterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(ID);
				setState(60);
				match(COLON);
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(61);
					match(NEW_LINE);
					}
					}
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(67);
				expr();
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(68);
					match(NEW_LINE);
					}
					}
					setState(71); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEW_LINE );
				}
				break;
			case 2:
				_localctx = new LastParameterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(ID);
				setState(74);
				match(COLON);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(75);
					match(NEW_LINE);
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(81);
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
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PresentationParser.INT, 0); }
		public TerminalNode VECTOR2() { return getToken(PresentationParser.VECTOR2, 0); }
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
		enterRule(_localctx, 8, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3712L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		"\u0004\u0001\rW\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0004\u0001\u0014\b\u0001\u000b\u0001\f\u0001"+
		"\u0015\u0001\u0001\u0005\u0001\u0019\b\u0001\n\u0001\f\u0001\u001c\t\u0001"+
		"\u0001\u0001\u0003\u0001\u001f\b\u0001\u0001\u0002\u0001\u0002\u0004\u0002"+
		"#\b\u0002\u000b\u0002\f\u0002$\u0001\u0002\u0005\u0002(\b\u0002\n\u0002"+
		"\f\u0002+\t\u0002\u0001\u0002\u0001\u0002\u0004\u0002/\b\u0002\u000b\u0002"+
		"\f\u00020\u0001\u0002\u0005\u00024\b\u0002\n\u0002\f\u00027\t\u0002\u0001"+
		"\u0002\u0003\u0002:\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003?\b\u0003\n\u0003\f\u0003B\t\u0003\u0001\u0003\u0001\u0003\u0004"+
		"\u0003F\b\u0003\u000b\u0003\f\u0003G\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003M\b\u0003\n\u0003\f\u0003P\t\u0003\u0001\u0003\u0003\u0003"+
		"S\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0000\u0005\u0000"+
		"\u0002\u0004\u0006\b\u0000\u0002\u0001\u0000\u0002\u0003\u0002\u0000\u0007"+
		"\u0007\t\u000b_\u0000\u000b\u0001\u0000\u0000\u0000\u0002\u001e\u0001"+
		"\u0000\u0000\u0000\u00049\u0001\u0000\u0000\u0000\u0006R\u0001\u0000\u0000"+
		"\u0000\bT\u0001\u0000\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n"+
		"\u0001\u0000\u0000\u0000\f\r\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000"+
		"\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000"+
		"\u0000\u000f\u0010\u0005\u0000\u0000\u0001\u0010\u0001\u0001\u0000\u0000"+
		"\u0000\u0011\u0013\u0005\u0001\u0000\u0000\u0012\u0014\u0005\u0005\u0000"+
		"\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000"+
		"\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000"+
		"\u0000\u0016\u001a\u0001\u0000\u0000\u0000\u0017\u0019\u0003\u0004\u0002"+
		"\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0019\u001c\u0001\u0000\u0000"+
		"\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000"+
		"\u0000\u001b\u001f\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000"+
		"\u0000\u001d\u001f\u0005\u0001\u0000\u0000\u001e\u0011\u0001\u0000\u0000"+
		"\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f\u0003\u0001\u0000\u0000"+
		"\u0000 \"\u0005\u0002\u0000\u0000!#\u0005\u0005\u0000\u0000\"!\u0001\u0000"+
		"\u0000\u0000#$\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001"+
		"\u0000\u0000\u0000%)\u0001\u0000\u0000\u0000&(\u0003\u0006\u0003\u0000"+
		"\'&\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000"+
		"\u0000)*\u0001\u0000\u0000\u0000*:\u0001\u0000\u0000\u0000+)\u0001\u0000"+
		"\u0000\u0000,.\u0005\u0003\u0000\u0000-/\u0005\u0005\u0000\u0000.-\u0001"+
		"\u0000\u0000\u0000/0\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u0000"+
		"01\u0001\u0000\u0000\u000015\u0001\u0000\u0000\u000024\u0003\u0006\u0003"+
		"\u000032\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000"+
		"\u0000\u000056\u0001\u0000\u0000\u00006:\u0001\u0000\u0000\u000075\u0001"+
		"\u0000\u0000\u00008:\u0007\u0000\u0000\u00009 \u0001\u0000\u0000\u0000"+
		"9,\u0001\u0000\u0000\u000098\u0001\u0000\u0000\u0000:\u0005\u0001\u0000"+
		"\u0000\u0000;<\u0005\b\u0000\u0000<@\u0005\u0004\u0000\u0000=?\u0005\u0005"+
		"\u0000\u0000>=\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001"+
		"\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AC\u0001\u0000\u0000\u0000"+
		"B@\u0001\u0000\u0000\u0000CE\u0003\b\u0004\u0000DF\u0005\u0005\u0000\u0000"+
		"ED\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000HS\u0001\u0000\u0000\u0000IJ\u0005\b\u0000"+
		"\u0000JN\u0005\u0004\u0000\u0000KM\u0005\u0005\u0000\u0000LK\u0001\u0000"+
		"\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001"+
		"\u0000\u0000\u0000OQ\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000"+
		"QS\u0003\b\u0004\u0000R;\u0001\u0000\u0000\u0000RI\u0001\u0000\u0000\u0000"+
		"S\u0007\u0001\u0000\u0000\u0000TU\u0007\u0001\u0000\u0000U\t\u0001\u0000"+
		"\u0000\u0000\r\r\u0015\u001a\u001e$)059@GNR";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}