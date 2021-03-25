// Generated from C:/Users/samiq/Documents/GitHub/2021_INFOB314_G10/src/main/antlr4/be/unamur/info/b314/compiler\PlayPlus.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlayPlusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, SKIPA=2, AFFECT=3, LPAR=4, RPAR=5, COMMA=6, PLUS=7, MINUS=8, 
		MOD=9, MULT=10, DIV=11, SEMICOLON=12, EQUALS=13, COLON=14, LTHAN=15, MTHAN=16, 
		LBRA=17, RBRA=18, WLD=19, COMPUTE=20, IF=21, THEN=22, ELSE=23, WHILE=24, 
		SET=25, TO=26, NEXT=27, IMPORT=28, FUNCTION=29, RETURN=30, LATITUDE=31, 
		LONGITUDE=32, GRID=33, SIZE=34, MAP=35, RADIO=36, AMMO=37, FRUITS=38, 
		SODA=39, COUNT=40, LIFE=41, TRUE=42, FALSE=43, ENNEMI=44, IS=45, NORTH=46, 
		SOUTH=47, EAST=48, WEST=49, GRAAL=50, OR=51, NOT=52, DIRT=53, ROCK=54, 
		VINES=55, ZOMBIE=56, PLAYER=57, NEARBY=58, MOVE=59, SHOOT=60, USE=61, 
		NOTHING=62, AS=63, DECLARE=64, AND=65, RETAIN=66, BY=67, DEFAULT=68, LOCAL=69, 
		DO=70, DONE=71, WHEN=72, YOUR=73, TURN=74, BOOLEAN=75, INTEGER=76, SQUARE=77, 
		VOID=78, FILEDECL=79, ID=80, FILENAME=81, NUMBER=82, NEWLINE=83, WS=84, 
		LETTER=85, DIGIT=86;
	public static final int
		RULE_root = 0, RULE_instruction = 1, RULE_impDecl = 2, RULE_fileDecl = 3, 
		RULE_fileName = 4, RULE_programmemonde = 5, RULE_programmestrat = 6, RULE_clauseDefault = 7, 
		RULE_clauseWhen = 8, RULE_varDecl = 9, RULE_type = 10, RULE_scalar = 11, 
		RULE_array = 12, RULE_fctDecl = 13, RULE_exprG = 14, RULE_exprD = 15, 
		RULE_exprEnt = 16, RULE_exprBool = 17, RULE_exprCase = 18, RULE_action = 19, 
		RULE_comment = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "instruction", "impDecl", "fileDecl", "fileName", "programmemonde", 
			"programmestrat", "clauseDefault", "clauseWhen", "varDecl", "type", "scalar", 
			"array", "fctDecl", "exprG", "exprD", "exprEnt", "exprBool", "exprCase", 
			"action", "comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'skip'", "'affect'", "'('", "')'", "','", "'+'", "'-'", 
			"'%'", "'*'", "'/'", "';'", "'='", "':'", "'<'", "'>'", "'['", "']'", 
			"'.wld'", "'compute'", "'if'", "'then'", "'else'", "'while'", "'set'", 
			"'to'", "'next'", "'import'", "'function'", "'return'", "'latitude'", 
			"'longitude'", "'grid'", "'size'", "'map'", "'radio'", "'ammo'", "'fruits'", 
			"'soda'", "'count'", "'life'", "'true'", "'false'", "'ennemi'", "'is'", 
			"'north'", "'south'", "'east'", "'west'", "'graal'", "'or'", "'not'", 
			"'dirt'", "'rock'", "'vines'", "'zombie'", "'player'", "'nearby'", "'move'", 
			"'shoot'", "'use'", "'nothing'", "'as'", "'declare'", "'and'", "'retain'", 
			"'by'", "'default'", "'local'", "'do'", "'done'", "'when'", "'your'", 
			"'turn'", "'boolean'", "'integer'", "'square'", "'void'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "SKIPA", "AFFECT", "LPAR", "RPAR", "COMMA", "PLUS", 
			"MINUS", "MOD", "MULT", "DIV", "SEMICOLON", "EQUALS", "COLON", "LTHAN", 
			"MTHAN", "LBRA", "RBRA", "WLD", "COMPUTE", "IF", "THEN", "ELSE", "WHILE", 
			"SET", "TO", "NEXT", "IMPORT", "FUNCTION", "RETURN", "LATITUDE", "LONGITUDE", 
			"GRID", "SIZE", "MAP", "RADIO", "AMMO", "FRUITS", "SODA", "COUNT", "LIFE", 
			"TRUE", "FALSE", "ENNEMI", "IS", "NORTH", "SOUTH", "EAST", "WEST", "GRAAL", 
			"OR", "NOT", "DIRT", "ROCK", "VINES", "ZOMBIE", "PLAYER", "NEARBY", "MOVE", 
			"SHOOT", "USE", "NOTHING", "AS", "DECLARE", "AND", "RETAIN", "BY", "DEFAULT", 
			"LOCAL", "DO", "DONE", "WHEN", "YOUR", "TURN", "BOOLEAN", "INTEGER", 
			"SQUARE", "VOID", "FILEDECL", "ID", "FILENAME", "NUMBER", "NEWLINE", 
			"WS", "LETTER", "DIGIT"
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
	public String getGrammarFileName() { return "PlayPlus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PlayPlusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(PlayPlusParser.DECLARE, 0); }
		public TerminalNode AND() { return getToken(PlayPlusParser.AND, 0); }
		public TerminalNode RETAIN() { return getToken(PlayPlusParser.RETAIN, 0); }
		public ProgrammestratContext programmestrat() {
			return getRuleContext(ProgrammestratContext.class,0);
		}
		public ProgrammemondeContext programmemonde() {
			return getRuleContext(ProgrammemondeContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(DECLARE);
			setState(43);
			match(AND);
			setState(44);
			match(RETAIN);
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(45);
				programmestrat();
				}
				break;
			case 2:
				{
				setState(46);
				programmemonde();
				}
				break;
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

	public static class InstructionContext extends ParserRuleContext {
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	 
		public InstructionContext() { }
		public void copyFrom(InstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComputeInstContext extends InstructionContext {
		public TerminalNode COMPUTE() { return getToken(PlayPlusParser.COMPUTE, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public ComputeInstContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterComputeInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitComputeInst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitComputeInst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ActionInstContext extends InstructionContext {
		public TerminalNode NEXT() { return getToken(PlayPlusParser.NEXT, 0); }
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public ActionInstContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterActionInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitActionInst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitActionInst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileInstContext extends InstructionContext {
		public TerminalNode WHILE() { return getToken(PlayPlusParser.WHILE, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public TerminalNode DO() { return getToken(PlayPlusParser.DO, 0); }
		public TerminalNode DONE() { return getToken(PlayPlusParser.DONE, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public WhileInstContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterWhileInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitWhileInst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitWhileInst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseInstContext extends InstructionContext {
		public TerminalNode IF() { return getToken(PlayPlusParser.IF, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public TerminalNode THEN() { return getToken(PlayPlusParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(PlayPlusParser.ELSE, 0); }
		public TerminalNode DONE() { return getToken(PlayPlusParser.DONE, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public IfElseInstContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterIfElseInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitIfElseInst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitIfElseInst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SkipInstContext extends InstructionContext {
		public TerminalNode SKIPA() { return getToken(PlayPlusParser.SKIPA, 0); }
		public SkipInstContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterSkipInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitSkipInst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitSkipInst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfInstContext extends InstructionContext {
		public TerminalNode IF() { return getToken(PlayPlusParser.IF, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public TerminalNode THEN() { return getToken(PlayPlusParser.THEN, 0); }
		public TerminalNode DONE() { return getToken(PlayPlusParser.DONE, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public IfInstContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterIfInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitIfInst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitIfInst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AffectInstrContext extends InstructionContext {
		public TerminalNode SET() { return getToken(PlayPlusParser.SET, 0); }
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public TerminalNode TO() { return getToken(PlayPlusParser.TO, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public AffectInstrContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterAffectInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitAffectInstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitAffectInstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		int _la;
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new SkipInstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(SKIPA);
				}
				break;
			case 2:
				_localctx = new IfInstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(IF);
				setState(51);
				exprD(0);
				setState(52);
				match(THEN);
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(53);
					instruction();
					}
					}
					setState(56); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIPA) | (1L << COMPUTE) | (1L << IF) | (1L << WHILE) | (1L << SET) | (1L << NEXT))) != 0) );
				setState(58);
				match(DONE);
				}
				break;
			case 3:
				_localctx = new IfElseInstContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				match(IF);
				setState(61);
				exprD(0);
				setState(62);
				match(THEN);
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(63);
					instruction();
					}
					}
					setState(66); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIPA) | (1L << COMPUTE) | (1L << IF) | (1L << WHILE) | (1L << SET) | (1L << NEXT))) != 0) );
				setState(68);
				match(ELSE);
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(69);
					instruction();
					}
					}
					setState(72); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIPA) | (1L << COMPUTE) | (1L << IF) | (1L << WHILE) | (1L << SET) | (1L << NEXT))) != 0) );
				setState(74);
				match(DONE);
				}
				break;
			case 4:
				_localctx = new WhileInstContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				match(WHILE);
				setState(77);
				exprD(0);
				setState(78);
				match(DO);
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(79);
					instruction();
					}
					}
					setState(82); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIPA) | (1L << COMPUTE) | (1L << IF) | (1L << WHILE) | (1L << SET) | (1L << NEXT))) != 0) );
				setState(84);
				match(DONE);
				}
				break;
			case 5:
				_localctx = new AffectInstrContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				match(SET);
				setState(87);
				exprG();
				setState(88);
				match(TO);
				setState(89);
				exprD(0);
				}
				break;
			case 6:
				_localctx = new ComputeInstContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(91);
				match(COMPUTE);
				setState(92);
				exprD(0);
				}
				break;
			case 7:
				_localctx = new ActionInstContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(93);
				match(NEXT);
				setState(94);
				action();
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

	public static class ImpDeclContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(PlayPlusParser.IMPORT, 0); }
		public TerminalNode FILEDECL() { return getToken(PlayPlusParser.FILEDECL, 0); }
		public ImpDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterImpDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitImpDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitImpDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpDeclContext impDecl() throws RecognitionException {
		ImpDeclContext _localctx = new ImpDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_impDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(IMPORT);
			setState(98);
			match(FILEDECL);
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

	public static class FileDeclContext extends ParserRuleContext {
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
		}
		public TerminalNode WLD() { return getToken(PlayPlusParser.WLD, 0); }
		public FileDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterFileDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitFileDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitFileDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileDeclContext fileDecl() throws RecognitionException {
		FileDeclContext _localctx = new FileDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fileDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			fileName();
			setState(101);
			matchWildcard();
			setState(102);
			match(WLD);
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

	public static class FileNameContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(PlayPlusParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(PlayPlusParser.LETTER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(PlayPlusParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(PlayPlusParser.DIGIT, i);
		}
		public FileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterFileName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitFileName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitFileName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileNameContext fileName() throws RecognitionException {
		FileNameContext _localctx = new FileNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fileName);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(LETTER);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(105);
					_la = _input.LA(1);
					if ( !(_la==LETTER || _la==DIGIT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class ProgrammemondeContext extends ParserRuleContext {
		public ClauseDefaultContext clauseDefault() {
			return getRuleContext(ClauseDefaultContext.class,0);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(PlayPlusParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PlayPlusParser.SEMICOLON, i);
		}
		public List<FctDeclContext> fctDecl() {
			return getRuleContexts(FctDeclContext.class);
		}
		public FctDeclContext fctDecl(int i) {
			return getRuleContext(FctDeclContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public ProgrammemondeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programmemonde; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterProgrammemonde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitProgrammemonde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitProgrammemonde(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrammemondeContext programmemonde() throws RecognitionException {
		ProgrammemondeContext _localctx = new ProgrammemondeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_programmemonde);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				setState(115);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(111);
					varDecl();
					setState(112);
					match(SEMICOLON);
					}
					break;
				case 2:
					{
					setState(114);
					fctDecl();
					}
					break;
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIPA) | (1L << COMPUTE) | (1L << IF) | (1L << WHILE) | (1L << SET) | (1L << NEXT))) != 0)) {
				{
				{
				setState(120);
				instruction();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			clauseDefault();
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

	public static class ProgrammestratContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(PlayPlusParser.WHEN, 0); }
		public TerminalNode YOUR() { return getToken(PlayPlusParser.YOUR, 0); }
		public TerminalNode TURN() { return getToken(PlayPlusParser.TURN, 0); }
		public ClauseDefaultContext clauseDefault() {
			return getRuleContext(ClauseDefaultContext.class,0);
		}
		public ImpDeclContext impDecl() {
			return getRuleContext(ImpDeclContext.class,0);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(PlayPlusParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PlayPlusParser.SEMICOLON, i);
		}
		public List<FctDeclContext> fctDecl() {
			return getRuleContexts(FctDeclContext.class);
		}
		public FctDeclContext fctDecl(int i) {
			return getRuleContext(FctDeclContext.class,i);
		}
		public List<ClauseWhenContext> clauseWhen() {
			return getRuleContexts(ClauseWhenContext.class);
		}
		public ClauseWhenContext clauseWhen(int i) {
			return getRuleContext(ClauseWhenContext.class,i);
		}
		public ProgrammestratContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programmestrat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterProgrammestrat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitProgrammestrat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitProgrammestrat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrammestratContext programmestrat() throws RecognitionException {
		ProgrammestratContext _localctx = new ProgrammestratContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_programmestrat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPORT) {
				{
				setState(128);
				impDecl();
				}
			}

			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				setState(135);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(131);
					varDecl();
					setState(132);
					match(SEMICOLON);
					}
					break;
				case 2:
					{
					setState(134);
					fctDecl();
					}
					break;
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(WHEN);
			setState(141);
			match(YOUR);
			setState(142);
			match(TURN);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHEN) {
				{
				{
				setState(143);
				clauseWhen();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			clauseDefault();
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

	public static class ClauseDefaultContext extends ParserRuleContext {
		public TerminalNode BY() { return getToken(PlayPlusParser.BY, 0); }
		public TerminalNode DEFAULT() { return getToken(PlayPlusParser.DEFAULT, 0); }
		public TerminalNode DO() { return getToken(PlayPlusParser.DO, 0); }
		public TerminalNode DONE() { return getToken(PlayPlusParser.DONE, 0); }
		public TerminalNode DECLARE() { return getToken(PlayPlusParser.DECLARE, 0); }
		public TerminalNode LOCAL() { return getToken(PlayPlusParser.LOCAL, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(PlayPlusParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PlayPlusParser.SEMICOLON, i);
		}
		public ClauseDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clauseDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterClauseDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitClauseDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitClauseDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClauseDefaultContext clauseDefault() throws RecognitionException {
		ClauseDefaultContext _localctx = new ClauseDefaultContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_clauseDefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(BY);
			setState(152);
			match(DEFAULT);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(153);
				match(DECLARE);
				setState(154);
				match(LOCAL);
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(155);
					varDecl();
					setState(156);
					match(SEMICOLON);
					}
					}
					setState(160); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
			}

			setState(164);
			match(DO);
			setState(166); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(165);
				instruction();
				}
				}
				setState(168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIPA) | (1L << COMPUTE) | (1L << IF) | (1L << WHILE) | (1L << SET) | (1L << NEXT))) != 0) );
			setState(170);
			match(DONE);
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

	public static class ClauseWhenContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(PlayPlusParser.WHEN, 0); }
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public TerminalNode DO() { return getToken(PlayPlusParser.DO, 0); }
		public TerminalNode DONE() { return getToken(PlayPlusParser.DONE, 0); }
		public TerminalNode DECLARE() { return getToken(PlayPlusParser.DECLARE, 0); }
		public TerminalNode LOCAL() { return getToken(PlayPlusParser.LOCAL, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(PlayPlusParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PlayPlusParser.SEMICOLON, i);
		}
		public ClauseWhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clauseWhen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterClauseWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitClauseWhen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitClauseWhen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClauseWhenContext clauseWhen() throws RecognitionException {
		ClauseWhenContext _localctx = new ClauseWhenContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_clauseWhen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(WHEN);
			setState(173);
			exprD(0);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(174);
				match(DECLARE);
				setState(175);
				match(LOCAL);
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(176);
					varDecl();
					setState(177);
					match(SEMICOLON);
					}
					}
					setState(181); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
			}

			setState(185);
			match(DO);
			setState(187); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(186);
				instruction();
				}
				}
				setState(189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIPA) | (1L << COMPUTE) | (1L << IF) | (1L << WHILE) | (1L << SET) | (1L << NEXT))) != 0) );
			setState(191);
			match(DONE);
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

	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode AS() { return getToken(PlayPlusParser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(ID);
			setState(194);
			match(AS);
			setState(195);
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

	public static class TypeContext extends ParserRuleContext {
		public ScalarContext scalar() {
			return getRuleContext(ScalarContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				scalar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				array();
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

	public static class ScalarContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(PlayPlusParser.BOOLEAN, 0); }
		public TerminalNode INTEGER() { return getToken(PlayPlusParser.INTEGER, 0); }
		public TerminalNode SQUARE() { return getToken(PlayPlusParser.SQUARE, 0); }
		public ScalarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterScalar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitScalar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitScalar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScalarContext scalar() throws RecognitionException {
		ScalarContext _localctx = new ScalarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_scalar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_la = _input.LA(1);
			if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (BOOLEAN - 75)) | (1L << (INTEGER - 75)) | (1L << (SQUARE - 75)))) != 0)) ) {
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

	public static class ArrayContext extends ParserRuleContext {
		public ScalarContext scalar() {
			return getRuleContext(ScalarContext.class,0);
		}
		public TerminalNode LBRA() { return getToken(PlayPlusParser.LBRA, 0); }
		public TerminalNode RBRA() { return getToken(PlayPlusParser.RBRA, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(PlayPlusParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PlayPlusParser.NUMBER, i);
		}
		public TerminalNode COMMA() { return getToken(PlayPlusParser.COMMA, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			scalar();
			setState(204);
			match(LBRA);
			{
			setState(205);
			match(NUMBER);
			}
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(206);
				match(COMMA);
				{
				setState(207);
				match(NUMBER);
				}
				}
			}

			setState(210);
			match(RBRA);
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

	public static class FctDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode AS() { return getToken(PlayPlusParser.AS, 0); }
		public TerminalNode FUNCTION() { return getToken(PlayPlusParser.FUNCTION, 0); }
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(PlayPlusParser.COLON, 0); }
		public TerminalNode DO() { return getToken(PlayPlusParser.DO, 0); }
		public TerminalNode RETURN() { return getToken(PlayPlusParser.RETURN, 0); }
		public TerminalNode DONE() { return getToken(PlayPlusParser.DONE, 0); }
		public ScalarContext scalar() {
			return getRuleContext(ScalarContext.class,0);
		}
		public List<TerminalNode> VOID() { return getTokens(PlayPlusParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(PlayPlusParser.VOID, i);
		}
		public ExprDContext exprD() {
			return getRuleContext(ExprDContext.class,0);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public TerminalNode DECLARE() { return getToken(PlayPlusParser.DECLARE, 0); }
		public TerminalNode LOCAL() { return getToken(PlayPlusParser.LOCAL, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(PlayPlusParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PlayPlusParser.SEMICOLON, i);
		}
		public FctDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fctDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterFctDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitFctDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitFctDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FctDeclContext fctDecl() throws RecognitionException {
		FctDeclContext _localctx = new FctDeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fctDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(ID);
			setState(213);
			match(AS);
			setState(214);
			match(FUNCTION);
			setState(215);
			match(LPAR);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(216);
				varDecl();
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(217);
					match(COMMA);
					setState(218);
					varDecl();
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(226);
			match(RPAR);
			setState(227);
			match(COLON);
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INTEGER:
			case SQUARE:
				{
				setState(228);
				scalar();
				}
				break;
			case VOID:
				{
				setState(229);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(232);
				match(DECLARE);
				setState(233);
				match(LOCAL);
				setState(237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(234);
					varDecl();
					setState(235);
					match(SEMICOLON);
					}
					}
					setState(239); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
			}

			setState(243);
			match(DO);
			setState(245); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(244);
				instruction();
				}
				}
				setState(247); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIPA) | (1L << COMPUTE) | (1L << IF) | (1L << WHILE) | (1L << SET) | (1L << NEXT))) != 0) );
			setState(249);
			match(RETURN);
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
			case LATITUDE:
			case LONGITUDE:
			case GRID:
			case MAP:
			case RADIO:
			case AMMO:
			case FRUITS:
			case SODA:
			case LIFE:
			case TRUE:
			case FALSE:
			case ENNEMI:
			case GRAAL:
			case NOT:
			case DIRT:
			case ROCK:
			case VINES:
			case ZOMBIE:
			case PLAYER:
			case NEARBY:
			case ID:
			case NUMBER:
				{
				setState(250);
				exprD(0);
				}
				break;
			case VOID:
				{
				setState(251);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(254);
			match(DONE);
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

	public static class ExprGContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode LBRA() { return getToken(PlayPlusParser.LBRA, 0); }
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public TerminalNode RBRA() { return getToken(PlayPlusParser.RBRA, 0); }
		public TerminalNode COMMA() { return getToken(PlayPlusParser.COMMA, 0); }
		public ExprGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprG; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprG(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprGContext exprG() throws RecognitionException {
		ExprGContext _localctx = new ExprGContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exprG);
		int _la;
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				match(ID);
				setState(258);
				match(LBRA);
				setState(259);
				exprD(0);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(260);
					match(COMMA);
					setState(261);
					exprD(0);
					}
				}

				setState(264);
				match(RBRA);
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

	public static class ExprDContext extends ParserRuleContext {
		public ExprEntContext exprEnt() {
			return getRuleContext(ExprEntContext.class,0);
		}
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PlayPlusParser.NOT, 0); }
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public ExprCaseContext exprCase() {
			return getRuleContext(ExprCaseContext.class,0);
		}
		public ExprGContext exprG() {
			return getRuleContext(ExprGContext.class,0);
		}
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
		public TerminalNode PLUS() { return getToken(PlayPlusParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PlayPlusParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(PlayPlusParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(PlayPlusParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(PlayPlusParser.MOD, 0); }
		public TerminalNode AND() { return getToken(PlayPlusParser.AND, 0); }
		public TerminalNode OR() { return getToken(PlayPlusParser.OR, 0); }
		public TerminalNode LTHAN() { return getToken(PlayPlusParser.LTHAN, 0); }
		public TerminalNode MTHAN() { return getToken(PlayPlusParser.MTHAN, 0); }
		public TerminalNode EQUALS() { return getToken(PlayPlusParser.EQUALS, 0); }
		public ExprDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprD(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprDContext exprD() throws RecognitionException {
		return exprD(0);
	}

	private ExprDContext exprD(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprDContext _localctx = new ExprDContext(_ctx, _parentState);
		ExprDContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_exprD, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(269);
				exprEnt();
				}
				break;
			case 2:
				{
				setState(270);
				exprBool();
				}
				break;
			case 3:
				{
				setState(271);
				match(NOT);
				setState(272);
				exprD(8);
				}
				break;
			case 4:
				{
				setState(273);
				exprCase();
				}
				break;
			case 5:
				{
				setState(274);
				exprG();
				}
				break;
			case 6:
				{
				setState(275);
				match(ID);
				setState(276);
				match(LPAR);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LATITUDE) | (1L << LONGITUDE) | (1L << GRID) | (1L << MAP) | (1L << RADIO) | (1L << AMMO) | (1L << FRUITS) | (1L << SODA) | (1L << LIFE) | (1L << TRUE) | (1L << FALSE) | (1L << ENNEMI) | (1L << GRAAL) | (1L << NOT) | (1L << DIRT) | (1L << ROCK) | (1L << VINES) | (1L << ZOMBIE) | (1L << PLAYER) | (1L << NEARBY))) != 0) || _la==ID || _la==NUMBER) {
					{
					setState(277);
					exprD(0);
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(278);
						match(COMMA);
						setState(279);
						exprD(0);
						}
						}
						setState(284);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(287);
				match(RPAR);
				}
				break;
			case 7:
				{
				setState(288);
				match(LPAR);
				setState(289);
				exprD(0);
				setState(290);
				match(RPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(326);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(324);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(294);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(295);
						match(PLUS);
						setState(296);
						exprD(17);
						}
						break;
					case 2:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(297);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(298);
						match(MINUS);
						setState(299);
						exprD(16);
						}
						break;
					case 3:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(300);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(301);
						match(MULT);
						setState(302);
						exprD(15);
						}
						break;
					case 4:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(303);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(304);
						match(DIV);
						setState(305);
						exprD(14);
						}
						break;
					case 5:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(306);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(307);
						match(MOD);
						setState(308);
						exprD(13);
						}
						break;
					case 6:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(309);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(310);
						match(AND);
						setState(311);
						exprD(11);
						}
						break;
					case 7:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(312);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(313);
						match(OR);
						setState(314);
						exprD(10);
						}
						break;
					case 8:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(315);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(316);
						match(LTHAN);
						setState(317);
						exprD(8);
						}
						break;
					case 9:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(318);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(319);
						match(MTHAN);
						setState(320);
						exprD(7);
						}
						break;
					case 10:
						{
						_localctx = new ExprDContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprD);
						setState(321);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(322);
						match(EQUALS);
						setState(323);
						exprD(6);
						}
						break;
					}
					} 
				}
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public static class ExprEntContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(PlayPlusParser.NUMBER, 0); }
		public TerminalNode LATITUDE() { return getToken(PlayPlusParser.LATITUDE, 0); }
		public TerminalNode LONGITUDE() { return getToken(PlayPlusParser.LONGITUDE, 0); }
		public TerminalNode GRID() { return getToken(PlayPlusParser.GRID, 0); }
		public TerminalNode SIZE() { return getToken(PlayPlusParser.SIZE, 0); }
		public TerminalNode COUNT() { return getToken(PlayPlusParser.COUNT, 0); }
		public TerminalNode MAP() { return getToken(PlayPlusParser.MAP, 0); }
		public TerminalNode RADIO() { return getToken(PlayPlusParser.RADIO, 0); }
		public TerminalNode AMMO() { return getToken(PlayPlusParser.AMMO, 0); }
		public TerminalNode FRUITS() { return getToken(PlayPlusParser.FRUITS, 0); }
		public TerminalNode SODA() { return getToken(PlayPlusParser.SODA, 0); }
		public TerminalNode LIFE() { return getToken(PlayPlusParser.LIFE, 0); }
		public ExprEntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprEnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprEnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprEnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprEnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprEntContext exprEnt() throws RecognitionException {
		ExprEntContext _localctx = new ExprEntContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exprEnt);
		int _la;
		try {
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(NUMBER);
				}
				break;
			case LATITUDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				match(LATITUDE);
				}
				break;
			case LONGITUDE:
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
				match(LONGITUDE);
				}
				break;
			case GRID:
				enterOuterAlt(_localctx, 4);
				{
				setState(332);
				match(GRID);
				setState(333);
				match(SIZE);
				}
				break;
			case MAP:
			case RADIO:
			case AMMO:
			case FRUITS:
			case SODA:
				enterOuterAlt(_localctx, 5);
				{
				setState(334);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAP) | (1L << RADIO) | (1L << AMMO) | (1L << FRUITS) | (1L << SODA))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(335);
				match(COUNT);
				}
				break;
			case LIFE:
				enterOuterAlt(_localctx, 6);
				{
				setState(336);
				match(LIFE);
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

	public static class ExprBoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(PlayPlusParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PlayPlusParser.FALSE, 0); }
		public TerminalNode ENNEMI() { return getToken(PlayPlusParser.ENNEMI, 0); }
		public TerminalNode IS() { return getToken(PlayPlusParser.IS, 0); }
		public TerminalNode NORTH() { return getToken(PlayPlusParser.NORTH, 0); }
		public TerminalNode SOUTH() { return getToken(PlayPlusParser.SOUTH, 0); }
		public TerminalNode EAST() { return getToken(PlayPlusParser.EAST, 0); }
		public TerminalNode WEST() { return getToken(PlayPlusParser.WEST, 0); }
		public TerminalNode GRAAL() { return getToken(PlayPlusParser.GRAAL, 0); }
		public ExprBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprBool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprBoolContext exprBool() throws RecognitionException {
		ExprBoolContext _localctx = new ExprBoolContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exprBool);
		int _la;
		try {
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				match(FALSE);
				}
				break;
			case ENNEMI:
				enterOuterAlt(_localctx, 3);
				{
				setState(341);
				match(ENNEMI);
				setState(342);
				match(IS);
				setState(343);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NORTH) | (1L << SOUTH) | (1L << EAST) | (1L << WEST))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case GRAAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(344);
				match(GRAAL);
				setState(345);
				match(IS);
				setState(346);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NORTH) | (1L << SOUTH) | (1L << EAST) | (1L << WEST))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class ExprCaseContext extends ParserRuleContext {
		public TerminalNode DIRT() { return getToken(PlayPlusParser.DIRT, 0); }
		public TerminalNode ROCK() { return getToken(PlayPlusParser.ROCK, 0); }
		public TerminalNode VINES() { return getToken(PlayPlusParser.VINES, 0); }
		public TerminalNode ZOMBIE() { return getToken(PlayPlusParser.ZOMBIE, 0); }
		public TerminalNode PLAYER() { return getToken(PlayPlusParser.PLAYER, 0); }
		public TerminalNode ENNEMI() { return getToken(PlayPlusParser.ENNEMI, 0); }
		public TerminalNode MAP() { return getToken(PlayPlusParser.MAP, 0); }
		public TerminalNode RADIO() { return getToken(PlayPlusParser.RADIO, 0); }
		public TerminalNode AMMO() { return getToken(PlayPlusParser.AMMO, 0); }
		public TerminalNode FRUITS() { return getToken(PlayPlusParser.FRUITS, 0); }
		public TerminalNode SODA() { return getToken(PlayPlusParser.SODA, 0); }
		public TerminalNode GRAAL() { return getToken(PlayPlusParser.GRAAL, 0); }
		public TerminalNode NEARBY() { return getToken(PlayPlusParser.NEARBY, 0); }
		public TerminalNode LBRA() { return getToken(PlayPlusParser.LBRA, 0); }
		public List<ExprDContext> exprD() {
			return getRuleContexts(ExprDContext.class);
		}
		public ExprDContext exprD(int i) {
			return getRuleContext(ExprDContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(PlayPlusParser.COMMA, 0); }
		public TerminalNode RBRA() { return getToken(PlayPlusParser.RBRA, 0); }
		public ExprCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterExprCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitExprCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitExprCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprCaseContext exprCase() throws RecognitionException {
		ExprCaseContext _localctx = new ExprCaseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exprCase);
		try {
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIRT:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				match(DIRT);
				}
				break;
			case ROCK:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				match(ROCK);
				}
				break;
			case VINES:
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
				match(VINES);
				}
				break;
			case ZOMBIE:
				enterOuterAlt(_localctx, 4);
				{
				setState(352);
				match(ZOMBIE);
				}
				break;
			case PLAYER:
				enterOuterAlt(_localctx, 5);
				{
				setState(353);
				match(PLAYER);
				}
				break;
			case ENNEMI:
				enterOuterAlt(_localctx, 6);
				{
				setState(354);
				match(ENNEMI);
				}
				break;
			case MAP:
				enterOuterAlt(_localctx, 7);
				{
				setState(355);
				match(MAP);
				}
				break;
			case RADIO:
				enterOuterAlt(_localctx, 8);
				{
				setState(356);
				match(RADIO);
				}
				break;
			case AMMO:
				enterOuterAlt(_localctx, 9);
				{
				setState(357);
				match(AMMO);
				}
				break;
			case FRUITS:
				enterOuterAlt(_localctx, 10);
				{
				setState(358);
				match(FRUITS);
				}
				break;
			case SODA:
				enterOuterAlt(_localctx, 11);
				{
				setState(359);
				match(SODA);
				}
				break;
			case GRAAL:
				enterOuterAlt(_localctx, 12);
				{
				setState(360);
				match(GRAAL);
				}
				break;
			case NEARBY:
				enterOuterAlt(_localctx, 13);
				{
				setState(361);
				match(NEARBY);
				setState(362);
				match(LBRA);
				setState(363);
				exprD(0);
				setState(364);
				match(COMMA);
				setState(365);
				exprD(0);
				setState(366);
				match(RBRA);
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

	public static class ActionContext extends ParserRuleContext {
		public TerminalNode MOVE() { return getToken(PlayPlusParser.MOVE, 0); }
		public TerminalNode NORTH() { return getToken(PlayPlusParser.NORTH, 0); }
		public TerminalNode SOUTH() { return getToken(PlayPlusParser.SOUTH, 0); }
		public TerminalNode EAST() { return getToken(PlayPlusParser.EAST, 0); }
		public TerminalNode WEST() { return getToken(PlayPlusParser.WEST, 0); }
		public TerminalNode SHOOT() { return getToken(PlayPlusParser.SHOOT, 0); }
		public TerminalNode USE() { return getToken(PlayPlusParser.USE, 0); }
		public TerminalNode MAP() { return getToken(PlayPlusParser.MAP, 0); }
		public TerminalNode RADIO() { return getToken(PlayPlusParser.RADIO, 0); }
		public TerminalNode FRUITS() { return getToken(PlayPlusParser.FRUITS, 0); }
		public TerminalNode SODA() { return getToken(PlayPlusParser.SODA, 0); }
		public TerminalNode DO() { return getToken(PlayPlusParser.DO, 0); }
		public TerminalNode NOTHING() { return getToken(PlayPlusParser.NOTHING, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_action);
		int _la;
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				match(MOVE);
				setState(371);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NORTH) | (1L << SOUTH) | (1L << EAST) | (1L << WEST))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case SHOOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				match(SHOOT);
				setState(373);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NORTH) | (1L << SOUTH) | (1L << EAST) | (1L << WEST))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case USE:
				enterOuterAlt(_localctx, 3);
				{
				setState(374);
				match(USE);
				setState(375);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAP) | (1L << RADIO) | (1L << FRUITS) | (1L << SODA))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 4);
				{
				setState(376);
				match(DO);
				setState(377);
				match(NOTHING);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(PlayPlusParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(COMMENT);
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
		case 15:
			return exprD_sempred((ExprDContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exprD_sempred(ExprDContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3X\u0181\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\5\2\62\n"+
		"\2\3\3\3\3\3\3\3\3\3\3\6\39\n\3\r\3\16\3:\3\3\3\3\3\3\3\3\3\3\3\3\6\3"+
		"C\n\3\r\3\16\3D\3\3\3\3\6\3I\n\3\r\3\16\3J\3\3\3\3\3\3\3\3\3\3\3\3\6\3"+
		"S\n\3\r\3\16\3T\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3b\n\3\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\7\6m\n\6\f\6\16\6p\13\6\3\7\3\7\3\7"+
		"\3\7\7\7v\n\7\f\7\16\7y\13\7\3\7\7\7|\n\7\f\7\16\7\177\13\7\3\7\3\7\3"+
		"\b\5\b\u0084\n\b\3\b\3\b\3\b\3\b\7\b\u008a\n\b\f\b\16\b\u008d\13\b\3\b"+
		"\3\b\3\b\3\b\7\b\u0093\n\b\f\b\16\b\u0096\13\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\6\t\u00a1\n\t\r\t\16\t\u00a2\5\t\u00a5\n\t\3\t\3\t\6\t\u00a9"+
		"\n\t\r\t\16\t\u00aa\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u00b6\n\n"+
		"\r\n\16\n\u00b7\5\n\u00ba\n\n\3\n\3\n\6\n\u00be\n\n\r\n\16\n\u00bf\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u00ca\n\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u00d3\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\7\17\u00de\n\17\f\17\16\17\u00e1\13\17\5\17\u00e3\n\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00e9\n\17\3\17\3\17\3\17\3\17\3\17\6\17\u00f0\n\17\r\17\16"+
		"\17\u00f1\5\17\u00f4\n\17\3\17\3\17\6\17\u00f8\n\17\r\17\16\17\u00f9\3"+
		"\17\3\17\3\17\5\17\u00ff\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u0109\n\20\3\20\3\20\5\20\u010d\n\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u011b\n\21\f\21\16\21\u011e\13"+
		"\21\5\21\u0120\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u0127\n\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\7\21\u0147\n\21\f\21\16\21\u014a\13\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u0154\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u015e\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0173\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u017d\n\25\3\26\3\26\3\26\2\3 \27\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\7\3\2WX\3\2MO\3\2%)\3\2\60\63\4"+
		"\2%&()\2\u01b8\2,\3\2\2\2\4a\3\2\2\2\6c\3\2\2\2\bf\3\2\2\2\nj\3\2\2\2"+
		"\fw\3\2\2\2\16\u0083\3\2\2\2\20\u0099\3\2\2\2\22\u00ae\3\2\2\2\24\u00c3"+
		"\3\2\2\2\26\u00c9\3\2\2\2\30\u00cb\3\2\2\2\32\u00cd\3\2\2\2\34\u00d6\3"+
		"\2\2\2\36\u010c\3\2\2\2 \u0126\3\2\2\2\"\u0153\3\2\2\2$\u015d\3\2\2\2"+
		"&\u0172\3\2\2\2(\u017c\3\2\2\2*\u017e\3\2\2\2,-\7B\2\2-.\7C\2\2.\61\7"+
		"D\2\2/\62\5\16\b\2\60\62\5\f\7\2\61/\3\2\2\2\61\60\3\2\2\2\62\3\3\2\2"+
		"\2\63b\7\4\2\2\64\65\7\27\2\2\65\66\5 \21\2\668\7\30\2\2\679\5\4\3\28"+
		"\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\7I\2\2=b\3\2\2\2"+
		">?\7\27\2\2?@\5 \21\2@B\7\30\2\2AC\5\4\3\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2"+
		"\2DE\3\2\2\2EF\3\2\2\2FH\7\31\2\2GI\5\4\3\2HG\3\2\2\2IJ\3\2\2\2JH\3\2"+
		"\2\2JK\3\2\2\2KL\3\2\2\2LM\7I\2\2Mb\3\2\2\2NO\7\32\2\2OP\5 \21\2PR\7H"+
		"\2\2QS\5\4\3\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\7I"+
		"\2\2Wb\3\2\2\2XY\7\33\2\2YZ\5\36\20\2Z[\7\34\2\2[\\\5 \21\2\\b\3\2\2\2"+
		"]^\7\26\2\2^b\5 \21\2_`\7\35\2\2`b\5(\25\2a\63\3\2\2\2a\64\3\2\2\2a>\3"+
		"\2\2\2aN\3\2\2\2aX\3\2\2\2a]\3\2\2\2a_\3\2\2\2b\5\3\2\2\2cd\7\36\2\2d"+
		"e\7Q\2\2e\7\3\2\2\2fg\5\n\6\2gh\13\2\2\2hi\7\25\2\2i\t\3\2\2\2jn\7W\2"+
		"\2km\t\2\2\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\13\3\2\2\2pn\3\2"+
		"\2\2qr\5\24\13\2rs\7\16\2\2sv\3\2\2\2tv\5\34\17\2uq\3\2\2\2ut\3\2\2\2"+
		"vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x}\3\2\2\2yw\3\2\2\2z|\5\4\3\2{z\3\2\2\2"+
		"|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081"+
		"\5\20\t\2\u0081\r\3\2\2\2\u0082\u0084\5\6\4\2\u0083\u0082\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u008b\3\2\2\2\u0085\u0086\5\24\13\2\u0086\u0087\7"+
		"\16\2\2\u0087\u008a\3\2\2\2\u0088\u008a\5\34\17\2\u0089\u0085\3\2\2\2"+
		"\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7J\2\2\u008f"+
		"\u0090\7K\2\2\u0090\u0094\7L\2\2\u0091\u0093\5\22\n\2\u0092\u0091\3\2"+
		"\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\5\20\t\2\u0098\17\3\2\2"+
		"\2\u0099\u009a\7E\2\2\u009a\u00a4\7F\2\2\u009b\u009c\7B\2\2\u009c\u00a0"+
		"\7G\2\2\u009d\u009e\5\24\13\2\u009e\u009f\7\16\2\2\u009f\u00a1\3\2\2\2"+
		"\u00a0\u009d\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u009b\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a8\7H\2\2\u00a7\u00a9\5\4\3\2\u00a8\u00a7\3\2"+
		"\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ad\7I\2\2\u00ad\21\3\2\2\2\u00ae\u00af\7J\2\2"+
		"\u00af\u00b9\5 \21\2\u00b0\u00b1\7B\2\2\u00b1\u00b5\7G\2\2\u00b2\u00b3"+
		"\5\24\13\2\u00b3\u00b4\7\16\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b2\3\2\2"+
		"\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba"+
		"\3\2\2\2\u00b9\u00b0\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bd\7H\2\2\u00bc\u00be\5\4\3\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c2\7I\2\2\u00c2\23\3\2\2\2\u00c3\u00c4\7R\2\2\u00c4\u00c5\7A\2\2\u00c5"+
		"\u00c6\5\26\f\2\u00c6\25\3\2\2\2\u00c7\u00ca\5\30\r\2\u00c8\u00ca\5\32"+
		"\16\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\27\3\2\2\2\u00cb\u00cc"+
		"\t\3\2\2\u00cc\31\3\2\2\2\u00cd\u00ce\5\30\r\2\u00ce\u00cf\7\23\2\2\u00cf"+
		"\u00d2\7T\2\2\u00d0\u00d1\7\b\2\2\u00d1\u00d3\7T\2\2\u00d2\u00d0\3\2\2"+
		"\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\7\24\2\2\u00d5"+
		"\33\3\2\2\2\u00d6\u00d7\7R\2\2\u00d7\u00d8\7A\2\2\u00d8\u00d9\7\37\2\2"+
		"\u00d9\u00e2\7\6\2\2\u00da\u00df\5\24\13\2\u00db\u00dc\7\b\2\2\u00dc\u00de"+
		"\5\24\13\2\u00dd\u00db\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2"+
		"\u00df\u00e0\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00da"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\7\7\2\2\u00e5"+
		"\u00e8\7\20\2\2\u00e6\u00e9\5\30\r\2\u00e7\u00e9\7P\2\2\u00e8\u00e6\3"+
		"\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00f3\3\2\2\2\u00ea\u00eb\7B\2\2\u00eb"+
		"\u00ef\7G\2\2\u00ec\u00ed\5\24\13\2\u00ed\u00ee\7\16\2\2\u00ee\u00f0\3"+
		"\2\2\2\u00ef\u00ec\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00ea\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\7H\2\2\u00f6\u00f8\5\4\3\2\u00f7"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fe\7 \2\2\u00fc\u00ff\5 \21\2\u00fd"+
		"\u00ff\7P\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\u0101\7I\2\2\u0101\35\3\2\2\2\u0102\u010d\7R\2\2\u0103\u0104"+
		"\7R\2\2\u0104\u0105\7\23\2\2\u0105\u0108\5 \21\2\u0106\u0107\7\b\2\2\u0107"+
		"\u0109\5 \21\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u010b\7\24\2\2\u010b\u010d\3\2\2\2\u010c\u0102\3\2\2\2\u010c"+
		"\u0103\3\2\2\2\u010d\37\3\2\2\2\u010e\u010f\b\21\1\2\u010f\u0127\5\"\22"+
		"\2\u0110\u0127\5$\23\2\u0111\u0112\7\66\2\2\u0112\u0127\5 \21\n\u0113"+
		"\u0127\5&\24\2\u0114\u0127\5\36\20\2\u0115\u0116\7R\2\2\u0116\u011f\7"+
		"\6\2\2\u0117\u011c\5 \21\2\u0118\u0119\7\b\2\2\u0119\u011b\5 \21\2\u011a"+
		"\u0118\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0117\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0127\7\7\2\2\u0122\u0123\7\6"+
		"\2\2\u0123\u0124\5 \21\2\u0124\u0125\7\7\2\2\u0125\u0127\3\2\2\2\u0126"+
		"\u010e\3\2\2\2\u0126\u0110\3\2\2\2\u0126\u0111\3\2\2\2\u0126\u0113\3\2"+
		"\2\2\u0126\u0114\3\2\2\2\u0126\u0115\3\2\2\2\u0126\u0122\3\2\2\2\u0127"+
		"\u0148\3\2\2\2\u0128\u0129\f\22\2\2\u0129\u012a\7\t\2\2\u012a\u0147\5"+
		" \21\23\u012b\u012c\f\21\2\2\u012c\u012d\7\n\2\2\u012d\u0147\5 \21\22"+
		"\u012e\u012f\f\20\2\2\u012f\u0130\7\f\2\2\u0130\u0147\5 \21\21\u0131\u0132"+
		"\f\17\2\2\u0132\u0133\7\r\2\2\u0133\u0147\5 \21\20\u0134\u0135\f\16\2"+
		"\2\u0135\u0136\7\13\2\2\u0136\u0147\5 \21\17\u0137\u0138\f\f\2\2\u0138"+
		"\u0139\7C\2\2\u0139\u0147\5 \21\r\u013a\u013b\f\13\2\2\u013b\u013c\7\65"+
		"\2\2\u013c\u0147\5 \21\f\u013d\u013e\f\t\2\2\u013e\u013f\7\21\2\2\u013f"+
		"\u0147\5 \21\n\u0140\u0141\f\b\2\2\u0141\u0142\7\22\2\2\u0142\u0147\5"+
		" \21\t\u0143\u0144\f\7\2\2\u0144\u0145\7\17\2\2\u0145\u0147\5 \21\b\u0146"+
		"\u0128\3\2\2\2\u0146\u012b\3\2\2\2\u0146\u012e\3\2\2\2\u0146\u0131\3\2"+
		"\2\2\u0146\u0134\3\2\2\2\u0146\u0137\3\2\2\2\u0146\u013a\3\2\2\2\u0146"+
		"\u013d\3\2\2\2\u0146\u0140\3\2\2\2\u0146\u0143\3\2\2\2\u0147\u014a\3\2"+
		"\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149!\3\2\2\2\u014a\u0148"+
		"\3\2\2\2\u014b\u0154\7T\2\2\u014c\u0154\7!\2\2\u014d\u0154\7\"\2\2\u014e"+
		"\u014f\7#\2\2\u014f\u0154\7$\2\2\u0150\u0151\t\4\2\2\u0151\u0154\7*\2"+
		"\2\u0152\u0154\7+\2\2\u0153\u014b\3\2\2\2\u0153\u014c\3\2\2\2\u0153\u014d"+
		"\3\2\2\2\u0153\u014e\3\2\2\2\u0153\u0150\3\2\2\2\u0153\u0152\3\2\2\2\u0154"+
		"#\3\2\2\2\u0155\u015e\7,\2\2\u0156\u015e\7-\2\2\u0157\u0158\7.\2\2\u0158"+
		"\u0159\7/\2\2\u0159\u015e\t\5\2\2\u015a\u015b\7\64\2\2\u015b\u015c\7/"+
		"\2\2\u015c\u015e\t\5\2\2\u015d\u0155\3\2\2\2\u015d\u0156\3\2\2\2\u015d"+
		"\u0157\3\2\2\2\u015d\u015a\3\2\2\2\u015e%\3\2\2\2\u015f\u0173\7\67\2\2"+
		"\u0160\u0173\78\2\2\u0161\u0173\79\2\2\u0162\u0173\7:\2\2\u0163\u0173"+
		"\7;\2\2\u0164\u0173\7.\2\2\u0165\u0173\7%\2\2\u0166\u0173\7&\2\2\u0167"+
		"\u0173\7\'\2\2\u0168\u0173\7(\2\2\u0169\u0173\7)\2\2\u016a\u0173\7\64"+
		"\2\2\u016b\u016c\7<\2\2\u016c\u016d\7\23\2\2\u016d\u016e\5 \21\2\u016e"+
		"\u016f\7\b\2\2\u016f\u0170\5 \21\2\u0170\u0171\7\24\2\2\u0171\u0173\3"+
		"\2\2\2\u0172\u015f\3\2\2\2\u0172\u0160\3\2\2\2\u0172\u0161\3\2\2\2\u0172"+
		"\u0162\3\2\2\2\u0172\u0163\3\2\2\2\u0172\u0164\3\2\2\2\u0172\u0165\3\2"+
		"\2\2\u0172\u0166\3\2\2\2\u0172\u0167\3\2\2\2\u0172\u0168\3\2\2\2\u0172"+
		"\u0169\3\2\2\2\u0172\u016a\3\2\2\2\u0172\u016b\3\2\2\2\u0173\'\3\2\2\2"+
		"\u0174\u0175\7=\2\2\u0175\u017d\t\5\2\2\u0176\u0177\7>\2\2\u0177\u017d"+
		"\t\5\2\2\u0178\u0179\7?\2\2\u0179\u017d\t\6\2\2\u017a\u017b\7H\2\2\u017b"+
		"\u017d\7@\2\2\u017c\u0174\3\2\2\2\u017c\u0176\3\2\2\2\u017c\u0178\3\2"+
		"\2\2\u017c\u017a\3\2\2\2\u017d)\3\2\2\2\u017e\u017f\7\3\2\2\u017f+\3\2"+
		"\2\2*\61:DJTanuw}\u0083\u0089\u008b\u0094\u00a2\u00a4\u00aa\u00b7\u00b9"+
		"\u00bf\u00c9\u00d2\u00df\u00e2\u00e8\u00f1\u00f3\u00f9\u00fe\u0108\u010c"+
		"\u011c\u011f\u0126\u0146\u0148\u0153\u015d\u0172\u017c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}