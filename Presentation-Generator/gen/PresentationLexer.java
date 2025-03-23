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
		SLIDE=1, TEXT=2, IMAGE=3, COLON=4, NEW_LINE=5, COMMENT=6, INT=7, ID=8, 
		VECTOR2=9, TEXT_BLOCK=10, WS=11, COKOLWIEK=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SLIDE", "TEXT", "IMAGE", "COLON", "NEW_LINE", "COMMENT", "INT", "ID", 
			"VECTOR2", "TEXT_BLOCK", "WS", "COKOLWIEK"
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
			"ID", "VECTOR2", "TEXT_BLOCK", "WS", "COKOLWIEK"
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
		"\u0004\u0000\fa\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u00053\b\u0005\n\u0005\f\u00056\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0004\u0006"+
		"=\b\u0006\u000b\u0006\f\u0006>\u0001\u0007\u0001\u0007\u0005\u0007C\b"+
		"\u0007\n\u0007\f\u0007F\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\tR\b\t\n\t\f\tU\t\t\u0001"+
		"\t\u0001\t\u0001\n\u0004\nZ\b\n\u000b\n\f\n[\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0000\u0000\f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0001\u0000\u0006\u0005\u0000  09AZ__az\u0001\u000009\u0003\u0000A"+
		"Z__az\u0004\u000009AZ__az\u0006\u0000\n\n  09AZ__az\u0003\u0000\t\t\f"+
		"\r  e\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0001"+
		"\u0019\u0001\u0000\u0000\u0000\u0003\u001f\u0001\u0000\u0000\u0000\u0005"+
		"$\u0001\u0000\u0000\u0000\u0007*\u0001\u0000\u0000\u0000\t,\u0001\u0000"+
		"\u0000\u0000\u000b.\u0001\u0000\u0000\u0000\r<\u0001\u0000\u0000\u0000"+
		"\u000f@\u0001\u0000\u0000\u0000\u0011G\u0001\u0000\u0000\u0000\u0013M"+
		"\u0001\u0000\u0000\u0000\u0015Y\u0001\u0000\u0000\u0000\u0017_\u0001\u0000"+
		"\u0000\u0000\u0019\u001a\u0005S\u0000\u0000\u001a\u001b\u0005L\u0000\u0000"+
		"\u001b\u001c\u0005I\u0000\u0000\u001c\u001d\u0005D\u0000\u0000\u001d\u001e"+
		"\u0005E\u0000\u0000\u001e\u0002\u0001\u0000\u0000\u0000\u001f \u0005T"+
		"\u0000\u0000 !\u0005E\u0000\u0000!\"\u0005X\u0000\u0000\"#\u0005T\u0000"+
		"\u0000#\u0004\u0001\u0000\u0000\u0000$%\u0005I\u0000\u0000%&\u0005M\u0000"+
		"\u0000&\'\u0005A\u0000\u0000\'(\u0005G\u0000\u0000()\u0005E\u0000\u0000"+
		")\u0006\u0001\u0000\u0000\u0000*+\u0005:\u0000\u0000+\b\u0001\u0000\u0000"+
		"\u0000,-\u0005\n\u0000\u0000-\n\u0001\u0000\u0000\u0000./\u0005/\u0000"+
		"\u0000/0\u0005/\u0000\u000004\u0001\u0000\u0000\u000013\u0007\u0000\u0000"+
		"\u000021\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u000042\u0001\u0000"+
		"\u0000\u000045\u0001\u0000\u0000\u000057\u0001\u0000\u0000\u000064\u0001"+
		"\u0000\u0000\u000078\u0005\n\u0000\u000089\u0001\u0000\u0000\u00009:\u0006"+
		"\u0005\u0000\u0000:\f\u0001\u0000\u0000\u0000;=\u0007\u0001\u0000\u0000"+
		"<;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000><\u0001\u0000\u0000"+
		"\u0000>?\u0001\u0000\u0000\u0000?\u000e\u0001\u0000\u0000\u0000@D\u0007"+
		"\u0002\u0000\u0000AC\u0007\u0003\u0000\u0000BA\u0001\u0000\u0000\u0000"+
		"CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000E\u0010\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GH\u0005"+
		"(\u0000\u0000HI\u0003\r\u0006\u0000IJ\u0005,\u0000\u0000JK\u0003\r\u0006"+
		"\u0000KL\u0005)\u0000\u0000L\u0012\u0001\u0000\u0000\u0000MN\u0005{\u0000"+
		"\u0000NO\u0005\n\u0000\u0000OS\u0001\u0000\u0000\u0000PR\u0007\u0004\u0000"+
		"\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000VW\u0005}\u0000\u0000W\u0014\u0001\u0000\u0000\u0000"+
		"XZ\u0007\u0005\u0000\u0000YX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000]^\u0006\n\u0000\u0000^\u0016\u0001\u0000\u0000\u0000_`\t"+
		"\u0000\u0000\u0000`\u0018\u0001\u0000\u0000\u0000\u0006\u00004>DS[\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}