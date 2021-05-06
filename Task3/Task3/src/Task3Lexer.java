// Generated from .\Task3.g4 by ANTLR 4.9.2
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
		IDENTIFIER=9, LETTER=10, NUMBER=11, DIGIT=12, DIGITO=13, WS2=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SELECT_", "DELETE_", "UPDATE_", "WHERE_", "FROM_", "SCOL", "COMMA", 
			"STAR", "IDENTIFIER", "LETTER", "NUMBER", "DIGIT", "DIGITO", "WS2", "WS"
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
			"STAR", "IDENTIFIER", "LETTER", "NUMBER", "DIGIT", "DIGITO", "WS2", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u0091\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2.\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4J\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5V\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6`\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\6\n"+
		"i\n\n\r\n\16\nj\3\n\7\nn\n\n\f\n\16\nq\13\n\3\13\3\13\3\f\6\fv\n\f\r\f"+
		"\16\fw\3\f\7\f{\n\f\f\f\16\f~\13\f\3\r\3\r\3\16\3\16\3\17\6\17\u0085\n"+
		"\17\r\17\16\17\u0086\3\17\3\17\3\20\6\20\u008c\n\20\r\20\16\20\u008d\3"+
		"\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21\3\2\6\4\2C\\c|\3\2\63;\3\2\62;\5\2\13\f\17\17\""+
		"\"\2\u009b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3-\3\2\2"+
		"\2\5;\3\2\2\2\7I\3\2\2\2\tU\3\2\2\2\13_\3\2\2\2\ra\3\2\2\2\17c\3\2\2\2"+
		"\21e\3\2\2\2\23h\3\2\2\2\25r\3\2\2\2\27u\3\2\2\2\31\177\3\2\2\2\33\u0081"+
		"\3\2\2\2\35\u0084\3\2\2\2\37\u008b\3\2\2\2!\"\7U\2\2\"#\7G\2\2#$\7N\2"+
		"\2$%\7G\2\2%&\7E\2\2&.\7V\2\2\'(\7u\2\2()\7g\2\2)*\7n\2\2*+\7g\2\2+,\7"+
		"e\2\2,.\7v\2\2-!\3\2\2\2-\'\3\2\2\2.\4\3\2\2\2/\60\7F\2\2\60\61\7G\2\2"+
		"\61\62\7N\2\2\62\63\7G\2\2\63\64\7V\2\2\64<\7G\2\2\65\66\7f\2\2\66\67"+
		"\7g\2\2\678\7n\2\289\7g\2\29:\7v\2\2:<\7g\2\2;/\3\2\2\2;\65\3\2\2\2<\6"+
		"\3\2\2\2=>\7W\2\2>?\7R\2\2?@\7F\2\2@A\7C\2\2AB\7V\2\2BJ\7G\2\2CD\7w\2"+
		"\2DE\7r\2\2EF\7f\2\2FG\7c\2\2GH\7v\2\2HJ\7g\2\2I=\3\2\2\2IC\3\2\2\2J\b"+
		"\3\2\2\2KL\7Y\2\2LM\7J\2\2MN\7G\2\2NO\7T\2\2OV\7G\2\2PQ\7y\2\2QR\7j\2"+
		"\2RS\7g\2\2ST\7t\2\2TV\7g\2\2UK\3\2\2\2UP\3\2\2\2V\n\3\2\2\2WX\7H\2\2"+
		"XY\7T\2\2YZ\7Q\2\2Z`\7O\2\2[\\\7h\2\2\\]\7t\2\2]^\7q\2\2^`\7o\2\2_W\3"+
		"\2\2\2_[\3\2\2\2`\f\3\2\2\2ab\7=\2\2b\16\3\2\2\2cd\7.\2\2d\20\3\2\2\2"+
		"ef\7,\2\2f\22\3\2\2\2gi\5\25\13\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2"+
		"\2\2ko\3\2\2\2ln\5\25\13\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\24"+
		"\3\2\2\2qo\3\2\2\2rs\t\2\2\2s\26\3\2\2\2tv\5\31\r\2ut\3\2\2\2vw\3\2\2"+
		"\2wu\3\2\2\2wx\3\2\2\2x|\3\2\2\2y{\5\33\16\2zy\3\2\2\2{~\3\2\2\2|z\3\2"+
		"\2\2|}\3\2\2\2}\30\3\2\2\2~|\3\2\2\2\177\u0080\t\3\2\2\u0080\32\3\2\2"+
		"\2\u0081\u0082\t\4\2\2\u0082\34\3\2\2\2\u0083\u0085\t\5\2\2\u0084\u0083"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0089\b\17\2\2\u0089\36\3\2\2\2\u008a\u008c\t\5\2"+
		"\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\b\20\2\2\u0090 \3\2\2\2\16\2"+
		"-;IU_jow|\u0086\u008d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}