// Generated from /home/bk/Desktop/pwr_projects/miasi/Presentation-Generator/src/PresentationLexer.g4 by ANTLR 4.13.2
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
		COMMA=9, INT=10, DOUBLE=11, ID=12, TEXT_BLOCK=13, PATH=14, WS=15, COKOLWIEK=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SLIDE", "TEXT", "IMAGE", "COLON", "NEW_LINE", "COMMENT", "L_PAR", "R_PAR", 
			"COMMA", "INT", "DOUBLE", "ID", "TEXT_BLOCK", "PATH", "WS", "COKOLWIEK"
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
			"R_PAR", "COMMA", "INT", "DOUBLE", "ID", "TEXT_BLOCK", "PATH", "WS", 
			"COKOLWIEK"
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
		"\u0004\u0000\u0010}\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005;\b\u0005\n\u0005\f\u0005>\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0004\tK\b\t\u000b"+
		"\t\f\tL\u0001\n\u0004\nP\b\n\u000b\n\f\nQ\u0001\n\u0001\n\u0004\nV\b\n"+
		"\u000b\n\f\nW\u0001\u000b\u0001\u000b\u0005\u000b\\\b\u000b\n\u000b\f"+
		"\u000b_\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\fe\b\f\n\f\f\fh"+
		"\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0005\rn\b\r\n\r\f\rq\t\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0004\u000ev\b\u000e\u000b\u000e\f\u000ew\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0000\u0000\u0010\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"\u0001\u0000\u0007\u0005\u0000  09AZ__az\u0001\u000009\u0003\u0000AZ_"+
		"_az\u0004\u000009AZ__az\u0006\u0000\n\n  09AZ__az\u0004\u0000-9AZ__az"+
		"\u0003\u0000\t\t\f\r  \u0084\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0001!\u0001\u0000\u0000\u0000\u0003\'\u0001\u0000"+
		"\u0000\u0000\u0005,\u0001\u0000\u0000\u0000\u00072\u0001\u0000\u0000\u0000"+
		"\t4\u0001\u0000\u0000\u0000\u000b6\u0001\u0000\u0000\u0000\rC\u0001\u0000"+
		"\u0000\u0000\u000fE\u0001\u0000\u0000\u0000\u0011G\u0001\u0000\u0000\u0000"+
		"\u0013J\u0001\u0000\u0000\u0000\u0015O\u0001\u0000\u0000\u0000\u0017Y"+
		"\u0001\u0000\u0000\u0000\u0019`\u0001\u0000\u0000\u0000\u001bk\u0001\u0000"+
		"\u0000\u0000\u001du\u0001\u0000\u0000\u0000\u001f{\u0001\u0000\u0000\u0000"+
		"!\"\u0005S\u0000\u0000\"#\u0005L\u0000\u0000#$\u0005I\u0000\u0000$%\u0005"+
		"D\u0000\u0000%&\u0005E\u0000\u0000&\u0002\u0001\u0000\u0000\u0000\'(\u0005"+
		"T\u0000\u0000()\u0005E\u0000\u0000)*\u0005X\u0000\u0000*+\u0005T\u0000"+
		"\u0000+\u0004\u0001\u0000\u0000\u0000,-\u0005I\u0000\u0000-.\u0005M\u0000"+
		"\u0000./\u0005A\u0000\u0000/0\u0005G\u0000\u000001\u0005E\u0000\u0000"+
		"1\u0006\u0001\u0000\u0000\u000023\u0005:\u0000\u00003\b\u0001\u0000\u0000"+
		"\u000045\u0005\n\u0000\u00005\n\u0001\u0000\u0000\u000067\u0005/\u0000"+
		"\u000078\u0005/\u0000\u00008<\u0001\u0000\u0000\u00009;\u0007\u0000\u0000"+
		"\u0000:9\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000><\u0001"+
		"\u0000\u0000\u0000?@\u0005\n\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0006"+
		"\u0005\u0000\u0000B\f\u0001\u0000\u0000\u0000CD\u0005(\u0000\u0000D\u000e"+
		"\u0001\u0000\u0000\u0000EF\u0005)\u0000\u0000F\u0010\u0001\u0000\u0000"+
		"\u0000GH\u0005,\u0000\u0000H\u0012\u0001\u0000\u0000\u0000IK\u0007\u0001"+
		"\u0000\u0000JI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000M\u0014\u0001\u0000\u0000"+
		"\u0000NP\u0007\u0001\u0000\u0000ON\u0001\u0000\u0000\u0000PQ\u0001\u0000"+
		"\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0001"+
		"\u0000\u0000\u0000SU\u0005.\u0000\u0000TV\u0007\u0001\u0000\u0000UT\u0001"+
		"\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000"+
		"WX\u0001\u0000\u0000\u0000X\u0016\u0001\u0000\u0000\u0000Y]\u0007\u0002"+
		"\u0000\u0000Z\\\u0007\u0003\u0000\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001"+
		"\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000"+
		"^\u0018\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`a\u0005{\u0000"+
		"\u0000ab\u0005\n\u0000\u0000bf\u0001\u0000\u0000\u0000ce\u0007\u0004\u0000"+
		"\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000"+
		"\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0001\u0000\u0000\u0000hf\u0001"+
		"\u0000\u0000\u0000ij\u0005}\u0000\u0000j\u001a\u0001\u0000\u0000\u0000"+
		"ko\u0005\"\u0000\u0000ln\u0007\u0005\u0000\u0000ml\u0001\u0000\u0000\u0000"+
		"nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000pr\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000rs\u0005\"\u0000"+
		"\u0000s\u001c\u0001\u0000\u0000\u0000tv\u0007\u0006\u0000\u0000ut\u0001"+
		"\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000"+
		"wx\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0006\u000e\u0000"+
		"\u0000z\u001e\u0001\u0000\u0000\u0000{|\t\u0000\u0000\u0000| \u0001\u0000"+
		"\u0000\u0000\n\u0000<LQW]dfow\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}