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
		VECTOR2=9, TEXT_BLOCK=10, PATH=11, WS=12, COKOLWIEK=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SLIDE", "TEXT", "IMAGE", "COLON", "NEW_LINE", "COMMENT", "INT", "ID", 
			"VECTOR2", "TEXT_BLOCK", "PATH", "WS", "COKOLWIEK"
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
		"\u0004\u0000\rk\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u00055\b\u0005\n\u0005"+
		"\f\u00058\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0004\u0006?\b\u0006\u000b\u0006\f\u0006@\u0001\u0007\u0001\u0007"+
		"\u0005\u0007E\b\u0007\n\u0007\f\u0007H\t\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\tT\b\t"+
		"\n\t\f\tW\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0004\n]\b\n\u000b\n\f\n"+
		"^\u0001\n\u0001\n\u0001\u000b\u0004\u000bd\b\u000b\u000b\u000b\f\u000b"+
		"e\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0000\u0000\r\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u0001\u0000\u0007\u0005\u0000 "+
		" 09AZ__az\u0001\u000009\u0003\u0000AZ__az\u0004\u000009AZ__az\u0006\u0000"+
		"\n\n  09AZ__az\u0004\u0000-9AZ__az\u0003\u0000\t\t\f\r  p\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0001\u001b\u0001\u0000\u0000\u0000\u0003!\u0001\u0000\u0000"+
		"\u0000\u0005&\u0001\u0000\u0000\u0000\u0007,\u0001\u0000\u0000\u0000\t"+
		".\u0001\u0000\u0000\u0000\u000b0\u0001\u0000\u0000\u0000\r>\u0001\u0000"+
		"\u0000\u0000\u000fB\u0001\u0000\u0000\u0000\u0011I\u0001\u0000\u0000\u0000"+
		"\u0013O\u0001\u0000\u0000\u0000\u0015Z\u0001\u0000\u0000\u0000\u0017c"+
		"\u0001\u0000\u0000\u0000\u0019i\u0001\u0000\u0000\u0000\u001b\u001c\u0005"+
		"S\u0000\u0000\u001c\u001d\u0005L\u0000\u0000\u001d\u001e\u0005I\u0000"+
		"\u0000\u001e\u001f\u0005D\u0000\u0000\u001f \u0005E\u0000\u0000 \u0002"+
		"\u0001\u0000\u0000\u0000!\"\u0005T\u0000\u0000\"#\u0005E\u0000\u0000#"+
		"$\u0005X\u0000\u0000$%\u0005T\u0000\u0000%\u0004\u0001\u0000\u0000\u0000"+
		"&\'\u0005I\u0000\u0000\'(\u0005M\u0000\u0000()\u0005A\u0000\u0000)*\u0005"+
		"G\u0000\u0000*+\u0005E\u0000\u0000+\u0006\u0001\u0000\u0000\u0000,-\u0005"+
		":\u0000\u0000-\b\u0001\u0000\u0000\u0000./\u0005\n\u0000\u0000/\n\u0001"+
		"\u0000\u0000\u000001\u0005/\u0000\u000012\u0005/\u0000\u000026\u0001\u0000"+
		"\u0000\u000035\u0007\u0000\u0000\u000043\u0001\u0000\u0000\u000058\u0001"+
		"\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u0000"+
		"79\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u00009:\u0005\n\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;<\u0006\u0005\u0000\u0000<\f\u0001\u0000\u0000"+
		"\u0000=?\u0007\u0001\u0000\u0000>=\u0001\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A\u000e"+
		"\u0001\u0000\u0000\u0000BF\u0007\u0002\u0000\u0000CE\u0007\u0003\u0000"+
		"\u0000DC\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000FD\u0001\u0000"+
		"\u0000\u0000FG\u0001\u0000\u0000\u0000G\u0010\u0001\u0000\u0000\u0000"+
		"HF\u0001\u0000\u0000\u0000IJ\u0005(\u0000\u0000JK\u0003\r\u0006\u0000"+
		"KL\u0005,\u0000\u0000LM\u0003\r\u0006\u0000MN\u0005)\u0000\u0000N\u0012"+
		"\u0001\u0000\u0000\u0000OP\u0005{\u0000\u0000PQ\u0005\n\u0000\u0000QU"+
		"\u0001\u0000\u0000\u0000RT\u0007\u0004\u0000\u0000SR\u0001\u0000\u0000"+
		"\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000"+
		"\u0000\u0000VX\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000XY\u0005"+
		"}\u0000\u0000Y\u0014\u0001\u0000\u0000\u0000Z\\\u0005\"\u0000\u0000[]"+
		"\u0007\u0005\u0000\u0000\\[\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000"+
		"\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0001\u0000"+
		"\u0000\u0000`a\u0005\"\u0000\u0000a\u0016\u0001\u0000\u0000\u0000bd\u0007"+
		"\u0006\u0000\u0000cb\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000"+
		"ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000"+
		"\u0000gh\u0006\u000b\u0000\u0000h\u0018\u0001\u0000\u0000\u0000ij\t\u0000"+
		"\u0000\u0000j\u001a\u0001\u0000\u0000\u0000\u0007\u00006@FU^e\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}