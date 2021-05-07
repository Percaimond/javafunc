// Generated from C:\Users\danie\Downloads\pp3\Exercise1\Task3\Task3\src\Task3.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Task3Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT_=1, DELETE_=2, UPDATE_=3, WHERE_=4, FROM_=5, SCOL=6, COMMA=7, STAR=8, 
		IDENTIFIER=9, LETTER=10, NUMBER=11, DIGIT=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SELECT_", "DELETE_", "UPDATE_", "WHERE_", "FROM_", "SCOL", "COMMA", 
			"STAR", "IDENTIFIER", "LETTER", "NUMBER", "DIGIT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "';'", "','", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT_", "DELETE_", "UPDATE_", "WHERE_", "FROM_", "SCOL", "COMMA", 
			"STAR", "IDENTIFIER", "LETTER", "NUMBER", "DIGIT", "WS"
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


	public Task3Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Task3.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17~\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\5\2*\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"8\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4F\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5R\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\\\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\6\ne\n\n\r\n\16\nf\3\n\7\n"+
		"j\n\n\f\n\16\nm\13\n\3\13\3\13\3\f\6\fr\n\f\r\f\16\fs\3\r\3\r\3\16\6\16"+
		"y\n\16\r\16\16\16z\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\3\2\5\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\""+
		"\2\u0086\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3)\3\2\2\2\5\67\3\2\2\2\7E\3\2\2\2"+
		"\tQ\3\2\2\2\13[\3\2\2\2\r]\3\2\2\2\17_\3\2\2\2\21a\3\2\2\2\23d\3\2\2\2"+
		"\25n\3\2\2\2\27q\3\2\2\2\31u\3\2\2\2\33x\3\2\2\2\35\36\7U\2\2\36\37\7"+
		"G\2\2\37 \7N\2\2 !\7G\2\2!\"\7E\2\2\"*\7V\2\2#$\7u\2\2$%\7g\2\2%&\7n\2"+
		"\2&\'\7g\2\2\'(\7e\2\2(*\7v\2\2)\35\3\2\2\2)#\3\2\2\2*\4\3\2\2\2+,\7F"+
		"\2\2,-\7G\2\2-.\7N\2\2./\7G\2\2/\60\7V\2\2\608\7G\2\2\61\62\7f\2\2\62"+
		"\63\7g\2\2\63\64\7n\2\2\64\65\7g\2\2\65\66\7v\2\2\668\7g\2\2\67+\3\2\2"+
		"\2\67\61\3\2\2\28\6\3\2\2\29:\7W\2\2:;\7R\2\2;<\7F\2\2<=\7C\2\2=>\7V\2"+
		"\2>F\7G\2\2?@\7w\2\2@A\7r\2\2AB\7f\2\2BC\7c\2\2CD\7v\2\2DF\7g\2\2E9\3"+
		"\2\2\2E?\3\2\2\2F\b\3\2\2\2GH\7Y\2\2HI\7J\2\2IJ\7G\2\2JK\7T\2\2KR\7G\2"+
		"\2LM\7y\2\2MN\7j\2\2NO\7g\2\2OP\7t\2\2PR\7g\2\2QG\3\2\2\2QL\3\2\2\2R\n"+
		"\3\2\2\2ST\7H\2\2TU\7T\2\2UV\7Q\2\2V\\\7O\2\2WX\7h\2\2XY\7t\2\2YZ\7q\2"+
		"\2Z\\\7o\2\2[S\3\2\2\2[W\3\2\2\2\\\f\3\2\2\2]^\7=\2\2^\16\3\2\2\2_`\7"+
		".\2\2`\20\3\2\2\2ab\7,\2\2b\22\3\2\2\2ce\5\25\13\2dc\3\2\2\2ef\3\2\2\2"+
		"fd\3\2\2\2fg\3\2\2\2gk\3\2\2\2hj\5\25\13\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2"+
		"\2kl\3\2\2\2l\24\3\2\2\2mk\3\2\2\2no\t\2\2\2o\26\3\2\2\2pr\5\31\r\2qp"+
		"\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t\30\3\2\2\2uv\t\3\2\2v\32\3\2\2"+
		"\2wy\t\4\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\b\16"+
		"\2\2}\34\3\2\2\2\f\2)\67EQ[fksz\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}