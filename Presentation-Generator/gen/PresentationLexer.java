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
		SLIDE=1, TEXT=2, IMAGE=3, COLON=4, NEW_LINE=5, COMMENT=6, L_PAR=7, R_PAR=8, 
		COMMA=9, INT=10, ID=11, TEXT_BLOCK=12, PATH=13, WS=14, COKOLWIEK=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SLIDE", "TEXT", "IMAGE", "COLON", "NEW_LINE", "COMMENT", "L_PAR", "R_PAR", 
			"COMMA", "INT", "ID", "TEXT_BLOCK", "PATH", "WS", "COKOLWIEK"
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
		"\u0004\u0000\u000fo\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u00059\b\u0005\n\u0005\f\u0005<\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0004\tI\b\t\u000b\t\f\tJ\u0001\n\u0001"+
		"\n\u0005\nO\b\n\n\n\f\nR\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000bX\b\u000b\n\u000b\f\u000b[\t\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0004\fa\b\f\u000b\f\f\fb\u0001\f\u0001\f\u0001"+
		"\r\u0004\rh\b\r\u000b\r\f\ri\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0000"+
		"\u0000\u000f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u0001\u0000\u0007\u0005\u0000  09AZ__az\u0001\u0000"+
		"09\u0003\u0000AZ__az\u0004\u000009AZ__az\u0006\u0000\n\n  09AZ__az\u0004"+
		"\u0000-9AZ__az\u0003\u0000\t\t\f\r  t\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0001\u001f"+
		"\u0001\u0000\u0000\u0000\u0003%\u0001\u0000\u0000\u0000\u0005*\u0001\u0000"+
		"\u0000\u0000\u00070\u0001\u0000\u0000\u0000\t2\u0001\u0000\u0000\u0000"+
		"\u000b4\u0001\u0000\u0000\u0000\rA\u0001\u0000\u0000\u0000\u000fC\u0001"+
		"\u0000\u0000\u0000\u0011E\u0001\u0000\u0000\u0000\u0013H\u0001\u0000\u0000"+
		"\u0000\u0015L\u0001\u0000\u0000\u0000\u0017S\u0001\u0000\u0000\u0000\u0019"+
		"^\u0001\u0000\u0000\u0000\u001bg\u0001\u0000\u0000\u0000\u001dm\u0001"+
		"\u0000\u0000\u0000\u001f \u0005S\u0000\u0000 !\u0005L\u0000\u0000!\"\u0005"+
		"I\u0000\u0000\"#\u0005D\u0000\u0000#$\u0005E\u0000\u0000$\u0002\u0001"+
		"\u0000\u0000\u0000%&\u0005T\u0000\u0000&\'\u0005E\u0000\u0000\'(\u0005"+
		"X\u0000\u0000()\u0005T\u0000\u0000)\u0004\u0001\u0000\u0000\u0000*+\u0005"+
		"I\u0000\u0000+,\u0005M\u0000\u0000,-\u0005A\u0000\u0000-.\u0005G\u0000"+
		"\u0000./\u0005E\u0000\u0000/\u0006\u0001\u0000\u0000\u000001\u0005:\u0000"+
		"\u00001\b\u0001\u0000\u0000\u000023\u0005\n\u0000\u00003\n\u0001\u0000"+
		"\u0000\u000045\u0005/\u0000\u000056\u0005/\u0000\u00006:\u0001\u0000\u0000"+
		"\u000079\u0007\u0000\u0000\u000087\u0001\u0000\u0000\u00009<\u0001\u0000"+
		"\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;=\u0001"+
		"\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=>\u0005\n\u0000\u0000>?\u0001"+
		"\u0000\u0000\u0000?@\u0006\u0005\u0000\u0000@\f\u0001\u0000\u0000\u0000"+
		"AB\u0005(\u0000\u0000B\u000e\u0001\u0000\u0000\u0000CD\u0005)\u0000\u0000"+
		"D\u0010\u0001\u0000\u0000\u0000EF\u0005,\u0000\u0000F\u0012\u0001\u0000"+
		"\u0000\u0000GI\u0007\u0001\u0000\u0000HG\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000"+
		"K\u0014\u0001\u0000\u0000\u0000LP\u0007\u0002\u0000\u0000MO\u0007\u0003"+
		"\u0000\u0000NM\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001"+
		"\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000Q\u0016\u0001\u0000\u0000"+
		"\u0000RP\u0001\u0000\u0000\u0000ST\u0005{\u0000\u0000TU\u0005\n\u0000"+
		"\u0000UY\u0001\u0000\u0000\u0000VX\u0007\u0004\u0000\u0000WV\u0001\u0000"+
		"\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Z\\\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"\\]\u0005}\u0000\u0000]\u0018\u0001\u0000\u0000\u0000^`\u0005\"\u0000"+
		"\u0000_a\u0007\u0005\u0000\u0000`_\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0001"+
		"\u0000\u0000\u0000de\u0005\"\u0000\u0000e\u001a\u0001\u0000\u0000\u0000"+
		"fh\u0007\u0006\u0000\u0000gf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000"+
		"\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0001\u0000"+
		"\u0000\u0000kl\u0006\r\u0000\u0000l\u001c\u0001\u0000\u0000\u0000mn\t"+
		"\u0000\u0000\u0000n\u001e\u0001\u0000\u0000\u0000\u0007\u0000:JPYbi\u0001"+
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