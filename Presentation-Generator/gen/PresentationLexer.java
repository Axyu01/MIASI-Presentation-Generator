// Generated from C:/Users/Adrian/Documents/Github/MIASI-Presentation-Generator/Presentation-Generator/src/PresentationLexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PresentationLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, NOT=3, EQ=4, COMMA=5, SEMI=6, LPAREN=7, RPAREN=8, LCURLY=9, 
		RCURLY=10, INT=11, ID=12, WS=13, COKOLWIEK=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AND", "OR", "NOT", "EQ", "COMMA", "SEMI", "LPAREN", "RPAREN", "LCURLY", 
			"RCURLY", "INT", "ID", "WS", "COKOLWIEK"
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


	public PresentationLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PresentationLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000eK\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0004\n8\b\n\u000b\n\f"+
		"\n9\u0001\u000b\u0001\u000b\u0005\u000b>\b\u000b\n\u000b\f\u000bA\t\u000b"+
		"\u0001\f\u0004\fD\b\f\u000b\f\f\fE\u0001\f\u0001\f\u0001\r\u0001\r\u0000"+
		"\u0000\u000e\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u0001\u0000\u0004\u0001\u000009\u0003\u0000AZ__az\u0004\u00000"+
		"9AZ__az\u0003\u0000\t\n\f\r  M\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0001\u001d\u0001\u0000\u0000\u0000\u0003!\u0001\u0000"+
		"\u0000\u0000\u0005$\u0001\u0000\u0000\u0000\u0007(\u0001\u0000\u0000\u0000"+
		"\t*\u0001\u0000\u0000\u0000\u000b,\u0001\u0000\u0000\u0000\r.\u0001\u0000"+
		"\u0000\u0000\u000f0\u0001\u0000\u0000\u0000\u00112\u0001\u0000\u0000\u0000"+
		"\u00134\u0001\u0000\u0000\u0000\u00157\u0001\u0000\u0000\u0000\u0017;"+
		"\u0001\u0000\u0000\u0000\u0019C\u0001\u0000\u0000\u0000\u001bI\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0005a\u0000\u0000\u001e\u001f\u0005n\u0000\u0000"+
		"\u001f \u0005d\u0000\u0000 \u0002\u0001\u0000\u0000\u0000!\"\u0005o\u0000"+
		"\u0000\"#\u0005r\u0000\u0000#\u0004\u0001\u0000\u0000\u0000$%\u0005n\u0000"+
		"\u0000%&\u0005o\u0000\u0000&\'\u0005t\u0000\u0000\'\u0006\u0001\u0000"+
		"\u0000\u0000()\u0005=\u0000\u0000)\b\u0001\u0000\u0000\u0000*+\u0005,"+
		"\u0000\u0000+\n\u0001\u0000\u0000\u0000,-\u0005;\u0000\u0000-\f\u0001"+
		"\u0000\u0000\u0000./\u0005(\u0000\u0000/\u000e\u0001\u0000\u0000\u0000"+
		"01\u0005)\u0000\u00001\u0010\u0001\u0000\u0000\u000023\u0005{\u0000\u0000"+
		"3\u0012\u0001\u0000\u0000\u000045\u0005}\u0000\u00005\u0014\u0001\u0000"+
		"\u0000\u000068\u0007\u0000\u0000\u000076\u0001\u0000\u0000\u000089\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":\u0016\u0001\u0000\u0000\u0000;?\u0007\u0001\u0000\u0000<>\u0007\u0002"+
		"\u0000\u0000=<\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001"+
		"\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@\u0018\u0001\u0000\u0000"+
		"\u0000A?\u0001\u0000\u0000\u0000BD\u0007\u0003\u0000\u0000CB\u0001\u0000"+
		"\u0000\u0000DE\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001"+
		"\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0006\f\u0000\u0000H\u001a"+
		"\u0001\u0000\u0000\u0000IJ\t\u0000\u0000\u0000J\u001c\u0001\u0000\u0000"+
		"\u0000\u0004\u00009?E\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}