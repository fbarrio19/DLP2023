// Generated from src\parser\Grammar.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, INT_CONSTANT=28, REAL_CONSTANT=29, CHAR_CONSTANT=30, 
		IDENT=31, LINE_COMMENT=32, MULTILINE_COMMENT=33, WHITESPACE=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", "IDENT", 
			"LINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "';'", "'global'", "'create'", "'end'", "'main'", "'('", 
			"')'", "'types'", "'vars'", "':'", "'deftuple'", "'as'", "'feature'", 
			"'is'", "'do'", "','", "'local'", "'print'", "'println'", "'read'", "':='", 
			"'='", "'+'", "'INTEGER'", "'DOUBLE'", "'CHARACTER'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", 
			"IDENT", "LINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACE"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u0114\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\35\5\35\u00ce\n\35\3\35\6\35\u00d1\n\35\r\35\16\35\u00d2\3\36\6"+
		"\36\u00d6\n\36\r\36\16\36\u00d7\3\36\3\36\6\36\u00dc\n\36\r\36\16\36\u00dd"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u00e7\n\37\3 \3 \7 \u00eb\n "+
		"\f \16 \u00ee\13 \3!\3!\3!\3!\7!\u00f4\n!\f!\16!\u00f7\13!\3!\5!\u00fa"+
		"\n!\3!\3!\3\"\3\"\3\"\3\"\3\"\7\"\u0103\n\"\f\"\16\"\u0106\13\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3#\6#\u010f\n#\r#\16#\u0110\3#\3#\4\u00f5\u0104\2$"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$\3\2\b\3\2\62;\4\2\13\f\17\17\4\2C\\c|\6\2\62;C\\aac|\3\3\f"+
		"\f\5\2\13\f\17\17\"\"\2\u011c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5M\3\2\2\2\7O\3\2\2\2\tV\3\2\2\2\13]\3"+
		"\2\2\2\ra\3\2\2\2\17f\3\2\2\2\21h\3\2\2\2\23j\3\2\2\2\25p\3\2\2\2\27u"+
		"\3\2\2\2\31w\3\2\2\2\33\u0080\3\2\2\2\35\u0083\3\2\2\2\37\u008b\3\2\2"+
		"\2!\u008e\3\2\2\2#\u0091\3\2\2\2%\u0093\3\2\2\2\'\u0099\3\2\2\2)\u009f"+
		"\3\2\2\2+\u00a7\3\2\2\2-\u00ac\3\2\2\2/\u00af\3\2\2\2\61\u00b1\3\2\2\2"+
		"\63\u00b3\3\2\2\2\65\u00bb\3\2\2\2\67\u00c2\3\2\2\29\u00cd\3\2\2\2;\u00d5"+
		"\3\2\2\2=\u00e6\3\2\2\2?\u00e8\3\2\2\2A\u00ef\3\2\2\2C\u00fd\3\2\2\2E"+
		"\u010e\3\2\2\2GH\7e\2\2HI\7n\2\2IJ\7c\2\2JK\7u\2\2KL\7u\2\2L\4\3\2\2\2"+
		"MN\7=\2\2N\6\3\2\2\2OP\7i\2\2PQ\7n\2\2QR\7q\2\2RS\7d\2\2ST\7c\2\2TU\7"+
		"n\2\2U\b\3\2\2\2VW\7e\2\2WX\7t\2\2XY\7g\2\2YZ\7c\2\2Z[\7v\2\2[\\\7g\2"+
		"\2\\\n\3\2\2\2]^\7g\2\2^_\7p\2\2_`\7f\2\2`\f\3\2\2\2ab\7o\2\2bc\7c\2\2"+
		"cd\7k\2\2de\7p\2\2e\16\3\2\2\2fg\7*\2\2g\20\3\2\2\2hi\7+\2\2i\22\3\2\2"+
		"\2jk\7v\2\2kl\7{\2\2lm\7r\2\2mn\7g\2\2no\7u\2\2o\24\3\2\2\2pq\7x\2\2q"+
		"r\7c\2\2rs\7t\2\2st\7u\2\2t\26\3\2\2\2uv\7<\2\2v\30\3\2\2\2wx\7f\2\2x"+
		"y\7g\2\2yz\7h\2\2z{\7v\2\2{|\7w\2\2|}\7r\2\2}~\7n\2\2~\177\7g\2\2\177"+
		"\32\3\2\2\2\u0080\u0081\7c\2\2\u0081\u0082\7u\2\2\u0082\34\3\2\2\2\u0083"+
		"\u0084\7h\2\2\u0084\u0085\7g\2\2\u0085\u0086\7c\2\2\u0086\u0087\7v\2\2"+
		"\u0087\u0088\7w\2\2\u0088\u0089\7t\2\2\u0089\u008a\7g\2\2\u008a\36\3\2"+
		"\2\2\u008b\u008c\7k\2\2\u008c\u008d\7u\2\2\u008d \3\2\2\2\u008e\u008f"+
		"\7f\2\2\u008f\u0090\7q\2\2\u0090\"\3\2\2\2\u0091\u0092\7.\2\2\u0092$\3"+
		"\2\2\2\u0093\u0094\7n\2\2\u0094\u0095\7q\2\2\u0095\u0096\7e\2\2\u0096"+
		"\u0097\7c\2\2\u0097\u0098\7n\2\2\u0098&\3\2\2\2\u0099\u009a\7r\2\2\u009a"+
		"\u009b\7t\2\2\u009b\u009c\7k\2\2\u009c\u009d\7p\2\2\u009d\u009e\7v\2\2"+
		"\u009e(\3\2\2\2\u009f\u00a0\7r\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7k\2"+
		"\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6"+
		"\7p\2\2\u00a6*\3\2\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa"+
		"\7c\2\2\u00aa\u00ab\7f\2\2\u00ab,\3\2\2\2\u00ac\u00ad\7<\2\2\u00ad\u00ae"+
		"\7?\2\2\u00ae.\3\2\2\2\u00af\u00b0\7?\2\2\u00b0\60\3\2\2\2\u00b1\u00b2"+
		"\7-\2\2\u00b2\62\3\2\2\2\u00b3\u00b4\7K\2\2\u00b4\u00b5\7P\2\2\u00b5\u00b6"+
		"\7V\2\2\u00b6\u00b7\7G\2\2\u00b7\u00b8\7I\2\2\u00b8\u00b9\7G\2\2\u00b9"+
		"\u00ba\7T\2\2\u00ba\64\3\2\2\2\u00bb\u00bc\7F\2\2\u00bc\u00bd\7Q\2\2\u00bd"+
		"\u00be\7W\2\2\u00be\u00bf\7D\2\2\u00bf\u00c0\7N\2\2\u00c0\u00c1\7G\2\2"+
		"\u00c1\66\3\2\2\2\u00c2\u00c3\7E\2\2\u00c3\u00c4\7J\2\2\u00c4\u00c5\7"+
		"C\2\2\u00c5\u00c6\7T\2\2\u00c6\u00c7\7C\2\2\u00c7\u00c8\7E\2\2\u00c8\u00c9"+
		"\7V\2\2\u00c9\u00ca\7G\2\2\u00ca\u00cb\7T\2\2\u00cb8\3\2\2\2\u00cc\u00ce"+
		"\7/\2\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf"+
		"\u00d1\t\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3:\3\2\2\2\u00d4\u00d6\t\2\2\2\u00d5\u00d4"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00db\7\60\2\2\u00da\u00dc\t\2\2\2\u00db\u00da\3"+
		"\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"<\3\2\2\2\u00df\u00e0\7)\2\2\u00e0\u00e1\n\3\2\2\u00e1\u00e7\7)\2\2\u00e2"+
		"\u00e3\7)\2\2\u00e3\u00e4\7^\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e7\7)\2\2"+
		"\u00e6\u00df\3\2\2\2\u00e6\u00e2\3\2\2\2\u00e7>\3\2\2\2\u00e8\u00ec\t"+
		"\4\2\2\u00e9\u00eb\t\5\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed@\3\2\2\2\u00ee\u00ec\3\2\2\2"+
		"\u00ef\u00f0\7\61\2\2\u00f0\u00f1\7,\2\2\u00f1\u00f5\3\2\2\2\u00f2\u00f4"+
		"\13\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f6\3\2\2\2"+
		"\u00f5\u00f3\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fa"+
		"\t\6\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\b!\2\2\u00fc"+
		"B\3\2\2\2\u00fd\u00fe\7\61\2\2\u00fe\u00ff\7\61\2\2\u00ff\u0100\7,\2\2"+
		"\u0100\u0104\3\2\2\2\u0101\u0103\13\2\2\2\u0102\u0101\3\2\2\2\u0103\u0106"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0107\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0107\u0108\7,\2\2\u0108\u0109\7\61\2\2\u0109\u010a\7\61"+
		"\2\2\u010a\u010b\3\2\2\2\u010b\u010c\b\"\2\2\u010cD\3\2\2\2\u010d\u010f"+
		"\t\7\2\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\b#\2\2\u0113F\3\2\2\2\r"+
		"\2\u00cd\u00d2\u00d7\u00dd\u00e6\u00ec\u00f5\u00f9\u0104\u0110\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}