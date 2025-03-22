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
		AND=1, OR=2, NOT=3, EQ=4, COMMA=5, SEMI=6, LPAREN=7, RPAREN=8, LCURLY=9, 
		RCURLY=10, INT=11, ID=12, WS=13, COKOLWIEK=14;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_def = 2, RULE_expr = 3, RULE_func = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "def", "expr", "func"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'and'", "'or'", "'not'", "'='", "','", "';'", "'('", "')'", "'{'", 
			"'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "OR", "NOT", "EQ", "COMMA", "SEMI", "LPAREN", "RPAREN", 
			"LCURLY", "RCURLY", "INT", "ID", "WS", "COKOLWIEK"
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
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
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
			setState(12); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(12);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(10);
					stat();
					}
					break;
				case 2:
					{
					setState(11);
					def();
					}
					break;
				}
				}
				setState(14); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 6152L) != 0) );
			setState(16);
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
	public static class StatContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PresentationParser.ID, 0); }
		public TerminalNode EQ() { return getToken(PresentationParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PresentationParser.SEMI, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PresentationParserListener ) ((PresentationParserListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PresentationParserListener ) ((PresentationParserListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PresentationParserVisitor ) return ((PresentationParserVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(26);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				match(ID);
				setState(19);
				match(EQ);
				setState(20);
				expr(0);
				setState(21);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				expr(0);
				setState(24);
				match(SEMI);
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
	public static class DefContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PresentationParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PresentationParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(PresentationParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PresentationParser.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(PresentationParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(PresentationParser.RCURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PresentationParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PresentationParser.COMMA, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PresentationParserListener ) ((PresentationParserListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PresentationParserListener ) ((PresentationParserListener)listener).exitDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PresentationParserVisitor ) return ((PresentationParserVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(ID);
			setState(29);
			match(LPAREN);
			setState(30);
			match(ID);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(31);
				match(COMMA);
				setState(32);
				match(ID);
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(RPAREN);
			setState(39);
			match(LCURLY);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6152L) != 0)) {
				{
				{
				setState(40);
				stat();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			match(RCURLY);
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
		public TerminalNode ID() { return getToken(PresentationParser.ID, 0); }
		public TerminalNode INT() { return getToken(PresentationParser.INT, 0); }
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PresentationParser.NOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(PresentationParser.AND, 0); }
		public TerminalNode OR() { return getToken(PresentationParser.OR, 0); }
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
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(49);
				match(ID);
				}
				break;
			case 2:
				{
				setState(50);
				match(INT);
				}
				break;
			case 3:
				{
				setState(51);
				func();
				}
				break;
			case 4:
				{
				setState(52);
				match(NOT);
				setState(53);
				expr(3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(62);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(56);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(57);
						match(AND);
						setState(58);
						expr(3);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(59);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(60);
						match(OR);
						setState(61);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PresentationParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(PresentationParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PresentationParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PresentationParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PresentationParser.COMMA, i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PresentationParserListener ) ((PresentationParserListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PresentationParserListener ) ((PresentationParserListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PresentationParserVisitor ) return ((PresentationParserVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(ID);
			setState(68);
			match(LPAREN);
			setState(69);
			expr(0);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(70);
				match(COMMA);
				setState(71);
				expr(0);
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(RPAREN);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000eP\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0004\u0000\r\b\u0000\u000b\u0000\f\u0000\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001b\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\"\b"+
		"\u0002\n\u0002\f\u0002%\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002*\b\u0002\n\u0002\f\u0002-\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u00037\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003?\b\u0003\n\u0003\f\u0003B\t\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004I\b"+
		"\u0004\n\u0004\f\u0004L\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0000"+
		"\u0001\u0006\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000U\u0000\f\u0001"+
		"\u0000\u0000\u0000\u0002\u001a\u0001\u0000\u0000\u0000\u0004\u001c\u0001"+
		"\u0000\u0000\u0000\u00066\u0001\u0000\u0000\u0000\bC\u0001\u0000\u0000"+
		"\u0000\n\r\u0003\u0002\u0001\u0000\u000b\r\u0003\u0004\u0002\u0000\f\n"+
		"\u0001\u0000\u0000\u0000\f\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001"+
		"\u0000\u0000\u0000\u000e\f\u0001\u0000\u0000\u0000\u000e\u000f\u0001\u0000"+
		"\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0011\u0005\u0000"+
		"\u0000\u0001\u0011\u0001\u0001\u0000\u0000\u0000\u0012\u0013\u0005\f\u0000"+
		"\u0000\u0013\u0014\u0005\u0004\u0000\u0000\u0014\u0015\u0003\u0006\u0003"+
		"\u0000\u0015\u0016\u0005\u0006\u0000\u0000\u0016\u001b\u0001\u0000\u0000"+
		"\u0000\u0017\u0018\u0003\u0006\u0003\u0000\u0018\u0019\u0005\u0006\u0000"+
		"\u0000\u0019\u001b\u0001\u0000\u0000\u0000\u001a\u0012\u0001\u0000\u0000"+
		"\u0000\u001a\u0017\u0001\u0000\u0000\u0000\u001b\u0003\u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0005\f\u0000\u0000\u001d\u001e\u0005\u0007\u0000\u0000"+
		"\u001e#\u0005\f\u0000\u0000\u001f \u0005\u0005\u0000\u0000 \"\u0005\f"+
		"\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000"+
		"#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$&\u0001\u0000\u0000"+
		"\u0000%#\u0001\u0000\u0000\u0000&\'\u0005\b\u0000\u0000\'+\u0005\t\u0000"+
		"\u0000(*\u0003\u0002\u0001\u0000)(\u0001\u0000\u0000\u0000*-\u0001\u0000"+
		"\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,.\u0001"+
		"\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000./\u0005\n\u0000\u0000/\u0005"+
		"\u0001\u0000\u0000\u000001\u0006\u0003\uffff\uffff\u000017\u0005\f\u0000"+
		"\u000027\u0005\u000b\u0000\u000037\u0003\b\u0004\u000045\u0005\u0003\u0000"+
		"\u000057\u0003\u0006\u0003\u000360\u0001\u0000\u0000\u000062\u0001\u0000"+
		"\u0000\u000063\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u00007@\u0001"+
		"\u0000\u0000\u000089\n\u0002\u0000\u00009:\u0005\u0001\u0000\u0000:?\u0003"+
		"\u0006\u0003\u0003;<\n\u0001\u0000\u0000<=\u0005\u0002\u0000\u0000=?\u0003"+
		"\u0006\u0003\u0002>8\u0001\u0000\u0000\u0000>;\u0001\u0000\u0000\u0000"+
		"?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000"+
		"\u0000A\u0007\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000CD\u0005"+
		"\f\u0000\u0000DE\u0005\u0007\u0000\u0000EJ\u0003\u0006\u0003\u0000FG\u0005"+
		"\u0005\u0000\u0000GI\u0003\u0006\u0003\u0000HF\u0001\u0000\u0000\u0000"+
		"IL\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000KM\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000MN\u0005\b\u0000"+
		"\u0000N\t\u0001\u0000\u0000\u0000\t\f\u000e\u001a#+6>@J";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}