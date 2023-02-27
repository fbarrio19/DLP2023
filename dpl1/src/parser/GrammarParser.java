// Generated from src\parser\Grammar.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
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
	public static final int
		RULE_start = 0, RULE_definitions = 1, RULE_definition = 2, RULE_defTuple = 3, 
		RULE_features = 4, RULE_functionParm = 5, RULE_returnType = 6, RULE_localDefs = 7, 
		RULE_localDef = 8, RULE_sentence = 9, RULE_expr = 10, RULE_type = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "definitions", "definition", "defTuple", "features", "functionParm", 
			"returnType", "localDefs", "localDef", "sentence", "expr", "type"
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

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(GrammarParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(GrammarParser.IDENT, i);
		}
		public FeaturesContext features() {
			return getRuleContext(FeaturesContext.class,0);
		}
		public DefinitionsContext definitions() {
			return getRuleContext(DefinitionsContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__0);
			setState(25);
			match(IDENT);
			setState(26);
			match(T__1);
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(27);
				match(T__2);
				setState(28);
				definitions();
				}
			}

			setState(31);
			match(T__3);
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				match(IDENT);
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
			setState(37);
			match(T__1);
			setState(38);
			features();
			setState(39);
			match(T__4);
			setState(40);
			match(T__5);
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				match(IDENT);
				setState(42);
				match(T__6);
				setState(43);
				match(T__7);
				setState(44);
				match(T__1);
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
			setState(49);
			match(T__4);
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

	public static class DefinitionsContext extends ParserRuleContext {
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public DefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitions; }
	}

	public final DefinitionsContext definitions() throws RecognitionException {
		DefinitionsContext _localctx = new DefinitionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__9) {
				{
				{
				setState(51);
				definition();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class DefinitionContext extends ParserRuleContext {
		public List<DefTupleContext> defTuple() {
			return getRuleContexts(DefTupleContext.class);
		}
		public DefTupleContext defTuple(int i) {
			return getRuleContext(DefTupleContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definition);
		int _la;
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(T__8);
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(58);
					defTuple();
					}
					}
					setState(61); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__11 );
				setState(63);
				match(T__4);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(T__9);
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(66);
					expr(0);
					setState(67);
					match(T__10);
					setState(68);
					type();
					setState(69);
					match(T__1);
					}
					}
					setState(73); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << IDENT))) != 0) );
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DefTupleContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(GrammarParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(GrammarParser.IDENT, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DefTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defTuple; }
	}

	public final DefTupleContext defTuple() throws RecognitionException {
		DefTupleContext _localctx = new DefTupleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_defTuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__11);
			setState(78);
			match(IDENT);
			setState(79);
			match(T__12);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(80);
				match(IDENT);
				setState(81);
				match(T__10);
				setState(82);
				type();
				}
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

	public static class FeaturesContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public LocalDefsContext localDefs() {
			return getRuleContext(LocalDefsContext.class,0);
		}
		public List<FunctionParmContext> functionParm() {
			return getRuleContexts(FunctionParmContext.class);
		}
		public FunctionParmContext functionParm(int i) {
			return getRuleContext(FunctionParmContext.class,i);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public FeaturesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_features; }
	}

	public final FeaturesContext features() throws RecognitionException {
		FeaturesContext _localctx = new FeaturesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_features);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__13);
			setState(86);
			match(IDENT);
			setState(87);
			match(T__6);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(88);
				functionParm();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(T__7);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(95);
				returnType();
				}
			}

			setState(98);
			match(T__14);
			setState(99);
			localDefs();
			setState(100);
			match(T__15);
			setState(102); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(101);
				sentence();
				}
				}
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << IDENT))) != 0) );
			setState(106);
			match(T__4);
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

	public static class FunctionParmContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionParmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParm; }
	}

	public final FunctionParmContext functionParm() throws RecognitionException {
		FunctionParmContext _localctx = new FunctionParmContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionParm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(IDENT);
			setState(109);
			match(T__10);
			setState(110);
			type();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(111);
				match(T__16);
				}
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

	public static class ReturnTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_returnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__10);
			setState(115);
			type();
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

	public static class LocalDefsContext extends ParserRuleContext {
		public List<LocalDefContext> localDef() {
			return getRuleContexts(LocalDefContext.class);
		}
		public LocalDefContext localDef(int i) {
			return getRuleContext(LocalDefContext.class,i);
		}
		public LocalDefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDefs; }
	}

	public final LocalDefsContext localDefs() throws RecognitionException {
		LocalDefsContext _localctx = new LocalDefsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_localDefs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__17);
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118);
				localDef();
				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
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

	public static class LocalDefContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LocalDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDef; }
	}

	public final LocalDefContext localDef() throws RecognitionException {
		LocalDefContext _localctx = new LocalDefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_localDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(IDENT);
			setState(124);
			match(T__10);
			setState(125);
			type();
			setState(126);
			match(T__1);
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

	public static class SentenceContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sentence);
		int _la;
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(T__18);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << IDENT))) != 0)) {
					{
					setState(129);
					expr(0);
					}
				}

				setState(132);
				match(T__1);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(T__19);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << IDENT))) != 0)) {
					{
					setState(134);
					expr(0);
					}
				}

				setState(137);
				match(T__1);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(T__20);
				setState(139);
				expr(0);
				setState(140);
				match(T__1);
				}
				break;
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case IDENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				expr(0);
				setState(143);
				match(T__21);
				setState(144);
				expr(0);
				setState(145);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode INT_CONSTANT() { return getToken(GrammarParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(GrammarParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(GrammarParser.CHAR_CONSTANT, 0); }
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_CONSTANT:
				{
				setState(150);
				match(INT_CONSTANT);
				}
				break;
			case REAL_CONSTANT:
				{
				setState(151);
				match(REAL_CONSTANT);
				}
				break;
			case CHAR_CONSTANT:
				{
				setState(152);
				match(CHAR_CONSTANT);
				}
				break;
			case IDENT:
				{
				setState(153);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(167);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(156);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(157);
						match(T__16);
						setState(158);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(159);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(160);
						match(T__22);
						setState(161);
						expr(3);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(162);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(163);
						match(T__23);
						setState(164);
						expr(2);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(165);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(166);
						match(T__1);
						}
						break;
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << IDENT))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00b1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\5\2 \n\2\3\2\3\2\6\2$\n\2\r\2"+
		"\16\2%\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2\60\n\2\r\2\16\2\61\3\2\3\2"+
		"\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\4\3\4\6\4>\n\4\r\4\16\4?\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\6\4J\n\4\r\4\16\4K\5\4N\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5V\n\5\3\6\3\6\3\6\3\6\7\6\\\n\6\f\6\16\6_\13\6\3\6\3\6\5\6c\n\6"+
		"\3\6\3\6\3\6\3\6\6\6i\n\6\r\6\16\6j\3\6\3\6\3\7\3\7\3\7\3\7\5\7s\n\7\3"+
		"\b\3\b\3\b\3\t\3\t\6\tz\n\t\r\t\16\t{\3\n\3\n\3\n\3\n\3\n\3\13\3\13\5"+
		"\13\u0085\n\13\3\13\3\13\3\13\5\13\u008a\n\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u0096\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u009d"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00aa\n\f\f\f\16"+
		"\f\u00ad\13\f\3\r\3\r\3\r\2\3\26\16\2\4\6\b\n\f\16\20\22\24\26\30\2\3"+
		"\4\2\33\35!!\2\u00bd\2\32\3\2\2\2\48\3\2\2\2\6M\3\2\2\2\bO\3\2\2\2\nW"+
		"\3\2\2\2\fn\3\2\2\2\16t\3\2\2\2\20w\3\2\2\2\22}\3\2\2\2\24\u0095\3\2\2"+
		"\2\26\u009c\3\2\2\2\30\u00ae\3\2\2\2\32\33\7\3\2\2\33\34\7!\2\2\34\37"+
		"\7\4\2\2\35\36\7\5\2\2\36 \5\4\3\2\37\35\3\2\2\2\37 \3\2\2\2 !\3\2\2\2"+
		"!#\7\6\2\2\"$\7!\2\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\'\3\2\2"+
		"\2\'(\7\4\2\2()\5\n\6\2)*\7\7\2\2*/\7\b\2\2+,\7!\2\2,-\7\t\2\2-.\7\n\2"+
		"\2.\60\7\4\2\2/+\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\63"+
		"\3\2\2\2\63\64\7\7\2\2\64\3\3\2\2\2\65\67\5\6\4\2\66\65\3\2\2\2\67:\3"+
		"\2\2\28\66\3\2\2\289\3\2\2\29\5\3\2\2\2:8\3\2\2\2;=\7\13\2\2<>\5\b\5\2"+
		"=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7\7\2\2BN\3\2\2\2"+
		"CI\7\f\2\2DE\5\26\f\2EF\7\r\2\2FG\5\30\r\2GH\7\4\2\2HJ\3\2\2\2ID\3\2\2"+
		"\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2M;\3\2\2\2MC\3\2\2\2N\7\3\2"+
		"\2\2OP\7\16\2\2PQ\7!\2\2QU\7\17\2\2RS\7!\2\2ST\7\r\2\2TV\5\30\r\2UR\3"+
		"\2\2\2UV\3\2\2\2V\t\3\2\2\2WX\7\20\2\2XY\7!\2\2Y]\7\t\2\2Z\\\5\f\7\2["+
		"Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`b\7\n\2\2"+
		"ac\5\16\b\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7\21\2\2ef\5\20\t\2fh\7\22"+
		"\2\2gi\5\24\13\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7"+
		"\7\2\2m\13\3\2\2\2no\7!\2\2op\7\r\2\2pr\5\30\r\2qs\7\23\2\2rq\3\2\2\2"+
		"rs\3\2\2\2s\r\3\2\2\2tu\7\r\2\2uv\5\30\r\2v\17\3\2\2\2wy\7\24\2\2xz\5"+
		"\22\n\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\21\3\2\2\2}~\7!\2\2~"+
		"\177\7\r\2\2\177\u0080\5\30\r\2\u0080\u0081\7\4\2\2\u0081\23\3\2\2\2\u0082"+
		"\u0084\7\25\2\2\u0083\u0085\5\26\f\2\u0084\u0083\3\2\2\2\u0084\u0085\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\u0096\7\4\2\2\u0087\u0089\7\26\2\2\u0088"+
		"\u008a\5\26\f\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3"+
		"\2\2\2\u008b\u0096\7\4\2\2\u008c\u008d\7\27\2\2\u008d\u008e\5\26\f\2\u008e"+
		"\u008f\7\4\2\2\u008f\u0096\3\2\2\2\u0090\u0091\5\26\f\2\u0091\u0092\7"+
		"\30\2\2\u0092\u0093\5\26\f\2\u0093\u0094\7\4\2\2\u0094\u0096\3\2\2\2\u0095"+
		"\u0082\3\2\2\2\u0095\u0087\3\2\2\2\u0095\u008c\3\2\2\2\u0095\u0090\3\2"+
		"\2\2\u0096\25\3\2\2\2\u0097\u0098\b\f\1\2\u0098\u009d\7\36\2\2\u0099\u009d"+
		"\7\37\2\2\u009a\u009d\7 \2\2\u009b\u009d\7!\2\2\u009c\u0097\3\2\2\2\u009c"+
		"\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\u00ab\3\2"+
		"\2\2\u009e\u009f\f\6\2\2\u009f\u00a0\7\23\2\2\u00a0\u00aa\5\26\f\7\u00a1"+
		"\u00a2\f\4\2\2\u00a2\u00a3\7\31\2\2\u00a3\u00aa\5\26\f\5\u00a4\u00a5\f"+
		"\3\2\2\u00a5\u00a6\7\32\2\2\u00a6\u00aa\5\26\f\4\u00a7\u00a8\f\5\2\2\u00a8"+
		"\u00aa\7\4\2\2\u00a9\u009e\3\2\2\2\u00a9\u00a1\3\2\2\2\u00a9\u00a4\3\2"+
		"\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\27\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\t\2\2"+
		"\2\u00af\31\3\2\2\2\25\37%\618?KMU]bjr{\u0084\u0089\u0095\u009c\u00a9"+
		"\u00ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}