// Generated from C:/Users/samiq/Documents/GitHub/2021_INFOB314_G10/src/main/antlr4/be/unamur/info/b314/compiler\PlayPlus.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlayPlusLexer extends Lexer {
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
		VOID=78, FILEDECL=79, ID=80, FILENAME=81, NUMBER=82, NEWLINE=83, WS=84;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "SKIPA", "AFFECT", "LPAR", "RPAR", "COMMA", "PLUS", "MINUS", 
			"MOD", "MULT", "DIV", "SEMICOLON", "EQUALS", "COLON", "LTHAN", "MTHAN", 
			"LBRA", "RBRA", "WLD", "COMPUTE", "IF", "THEN", "ELSE", "WHILE", "SET", 
			"TO", "NEXT", "IMPORT", "FUNCTION", "RETURN", "LATITUDE", "LONGITUDE", 
			"GRID", "SIZE", "MAP", "RADIO", "AMMO", "FRUITS", "SODA", "COUNT", "LIFE", 
			"TRUE", "FALSE", "ENNEMI", "IS", "NORTH", "SOUTH", "EAST", "WEST", "GRAAL", 
			"OR", "NOT", "DIRT", "ROCK", "VINES", "ZOMBIE", "PLAYER", "NEARBY", "MOVE", 
			"SHOOT", "USE", "NOTHING", "AS", "DECLARE", "AND", "RETAIN", "BY", "DEFAULT", 
			"LOCAL", "DO", "DONE", "WHEN", "YOUR", "TURN", "BOOLEAN", "INTEGER", 
			"SQUARE", "VOID", "FILEDECL", "ID", "FILENAME", "NUMBER", "LETTER", "DIGIT", 
			"NEWLINE", "WS"
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
			"WS"
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


	public PlayPlusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PlayPlus.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2V\u0273\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\3\2\3\2\3\2\3\2\7\2\u00b4\n\2\f\2\16\2\u00b7\13\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\7\2\u00bf\n\2\f\2\16\2\u00c2\13\2\3\2\5\2\u00c5"+
		"\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$"+
		"\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3"+
		",\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3"+
		"\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\39\39\3"+
		"9\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3"+
		"<\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3A\3"+
		"A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3E\3E\3"+
		"E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3G\3G\3G\3H\3H\3H\3H\3H\3I\3I\3I\3"+
		"I\3I\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3"+
		"M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3P\3P\3P\3Q\3Q\3Q\7"+
		"Q\u024d\nQ\fQ\16Q\u0250\13Q\3R\3R\3R\7R\u0255\nR\fR\16R\u0258\13R\3S\5"+
		"S\u025b\nS\3S\6S\u025e\nS\rS\16S\u025f\3T\3T\3U\3U\3V\5V\u0267\nV\3V\3"+
		"V\3V\3V\3W\6W\u026e\nW\rW\16W\u026f\3W\3W\2\2X\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095"+
		"L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7\2\u00a9"+
		"\2\u00abU\u00adV\3\2\4\4\2C\\c|\4\2\13\13\"\"\2\u027b\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q"+
		"\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2"+
		"\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\3\u00c4"+
		"\3\2\2\2\5\u00c8\3\2\2\2\7\u00cd\3\2\2\2\t\u00d4\3\2\2\2\13\u00d6\3\2"+
		"\2\2\r\u00d8\3\2\2\2\17\u00da\3\2\2\2\21\u00dc\3\2\2\2\23\u00de\3\2\2"+
		"\2\25\u00e0\3\2\2\2\27\u00e2\3\2\2\2\31\u00e4\3\2\2\2\33\u00e6\3\2\2\2"+
		"\35\u00e8\3\2\2\2\37\u00ea\3\2\2\2!\u00ec\3\2\2\2#\u00ee\3\2\2\2%\u00f0"+
		"\3\2\2\2\'\u00f2\3\2\2\2)\u00f7\3\2\2\2+\u00ff\3\2\2\2-\u0102\3\2\2\2"+
		"/\u0107\3\2\2\2\61\u010c\3\2\2\2\63\u0112\3\2\2\2\65\u0116\3\2\2\2\67"+
		"\u0119\3\2\2\29\u011e\3\2\2\2;\u0125\3\2\2\2=\u012e\3\2\2\2?\u0135\3\2"+
		"\2\2A\u013e\3\2\2\2C\u0148\3\2\2\2E\u014d\3\2\2\2G\u0152\3\2\2\2I\u0156"+
		"\3\2\2\2K\u015c\3\2\2\2M\u0161\3\2\2\2O\u0168\3\2\2\2Q\u016d\3\2\2\2S"+
		"\u0173\3\2\2\2U\u0178\3\2\2\2W\u017d\3\2\2\2Y\u0183\3\2\2\2[\u018a\3\2"+
		"\2\2]\u018d\3\2\2\2_\u0193\3\2\2\2a\u0199\3\2\2\2c\u019e\3\2\2\2e\u01a3"+
		"\3\2\2\2g\u01a9\3\2\2\2i\u01ac\3\2\2\2k\u01b0\3\2\2\2m\u01b5\3\2\2\2o"+
		"\u01ba\3\2\2\2q\u01c0\3\2\2\2s\u01c7\3\2\2\2u\u01ce\3\2\2\2w\u01d5\3\2"+
		"\2\2y\u01da\3\2\2\2{\u01e0\3\2\2\2}\u01e4\3\2\2\2\177\u01ec\3\2\2\2\u0081"+
		"\u01ef\3\2\2\2\u0083\u01f7\3\2\2\2\u0085\u01fb\3\2\2\2\u0087\u0202\3\2"+
		"\2\2\u0089\u0205\3\2\2\2\u008b\u020d\3\2\2\2\u008d\u0213\3\2\2\2\u008f"+
		"\u0216\3\2\2\2\u0091\u021b\3\2\2\2\u0093\u0220\3\2\2\2\u0095\u0225\3\2"+
		"\2\2\u0097\u022a\3\2\2\2\u0099\u0232\3\2\2\2\u009b\u023a\3\2\2\2\u009d"+
		"\u0241\3\2\2\2\u009f\u0246\3\2\2\2\u00a1\u0249\3\2\2\2\u00a3\u0251\3\2"+
		"\2\2\u00a5\u025a\3\2\2\2\u00a7\u0261\3\2\2\2\u00a9\u0263\3\2\2\2\u00ab"+
		"\u0266\3\2\2\2\u00ad\u026d\3\2\2\2\u00af\u00b0\7\61\2\2\u00b0\u00b1\7"+
		",\2\2\u00b1\u00b5\3\2\2\2\u00b2\u00b4\13\2\2\2\u00b3\u00b2\3\2\2\2\u00b4"+
		"\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2"+
		"\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7,\2\2\u00b9\u00c5\7\61\2\2\u00ba"+
		"\u00bb\7\61\2\2\u00bb\u00bc\7\61\2\2\u00bc\u00c0\3\2\2\2\u00bd\u00bf\13"+
		"\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c5\5\u00ab"+
		"V\2\u00c4\u00af\3\2\2\2\u00c4\u00ba\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c7\b\2\2\2\u00c7\4\3\2\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7m\2\2\u00ca"+
		"\u00cb\7k\2\2\u00cb\u00cc\7r\2\2\u00cc\6\3\2\2\2\u00cd\u00ce\7c\2\2\u00ce"+
		"\u00cf\7h\2\2\u00cf\u00d0\7h\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7e\2\2"+
		"\u00d2\u00d3\7v\2\2\u00d3\b\3\2\2\2\u00d4\u00d5\7*\2\2\u00d5\n\3\2\2\2"+
		"\u00d6\u00d7\7+\2\2\u00d7\f\3\2\2\2\u00d8\u00d9\7.\2\2\u00d9\16\3\2\2"+
		"\2\u00da\u00db\7-\2\2\u00db\20\3\2\2\2\u00dc\u00dd\7/\2\2\u00dd\22\3\2"+
		"\2\2\u00de\u00df\7\'\2\2\u00df\24\3\2\2\2\u00e0\u00e1\7,\2\2\u00e1\26"+
		"\3\2\2\2\u00e2\u00e3\7\61\2\2\u00e3\30\3\2\2\2\u00e4\u00e5\7=\2\2\u00e5"+
		"\32\3\2\2\2\u00e6\u00e7\7?\2\2\u00e7\34\3\2\2\2\u00e8\u00e9\7<\2\2\u00e9"+
		"\36\3\2\2\2\u00ea\u00eb\7>\2\2\u00eb \3\2\2\2\u00ec\u00ed\7@\2\2\u00ed"+
		"\"\3\2\2\2\u00ee\u00ef\7]\2\2\u00ef$\3\2\2\2\u00f0\u00f1\7_\2\2\u00f1"+
		"&\3\2\2\2\u00f2\u00f3\7\60\2\2\u00f3\u00f4\7y\2\2\u00f4\u00f5\7n\2\2\u00f5"+
		"\u00f6\7f\2\2\u00f6(\3\2\2\2\u00f7\u00f8\7e\2\2\u00f8\u00f9\7q\2\2\u00f9"+
		"\u00fa\7o\2\2\u00fa\u00fb\7r\2\2\u00fb\u00fc\7w\2\2\u00fc\u00fd\7v\2\2"+
		"\u00fd\u00fe\7g\2\2\u00fe*\3\2\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7h\2"+
		"\2\u0101,\3\2\2\2\u0102\u0103\7v\2\2\u0103\u0104\7j\2\2\u0104\u0105\7"+
		"g\2\2\u0105\u0106\7p\2\2\u0106.\3\2\2\2\u0107\u0108\7g\2\2\u0108\u0109"+
		"\7n\2\2\u0109\u010a\7u\2\2\u010a\u010b\7g\2\2\u010b\60\3\2\2\2\u010c\u010d"+
		"\7y\2\2\u010d\u010e\7j\2\2\u010e\u010f\7k\2\2\u010f\u0110\7n\2\2\u0110"+
		"\u0111\7g\2\2\u0111\62\3\2\2\2\u0112\u0113\7u\2\2\u0113\u0114\7g\2\2\u0114"+
		"\u0115\7v\2\2\u0115\64\3\2\2\2\u0116\u0117\7v\2\2\u0117\u0118\7q\2\2\u0118"+
		"\66\3\2\2\2\u0119\u011a\7p\2\2\u011a\u011b\7g\2\2\u011b\u011c\7z\2\2\u011c"+
		"\u011d\7v\2\2\u011d8\3\2\2\2\u011e\u011f\7k\2\2\u011f\u0120\7o\2\2\u0120"+
		"\u0121\7r\2\2\u0121\u0122\7q\2\2\u0122\u0123\7t\2\2\u0123\u0124\7v\2\2"+
		"\u0124:\3\2\2\2\u0125\u0126\7h\2\2\u0126\u0127\7w\2\2\u0127\u0128\7p\2"+
		"\2\u0128\u0129\7e\2\2\u0129\u012a\7v\2\2\u012a\u012b\7k\2\2\u012b\u012c"+
		"\7q\2\2\u012c\u012d\7p\2\2\u012d<\3\2\2\2\u012e\u012f\7t\2\2\u012f\u0130"+
		"\7g\2\2\u0130\u0131\7v\2\2\u0131\u0132\7w\2\2\u0132\u0133\7t\2\2\u0133"+
		"\u0134\7p\2\2\u0134>\3\2\2\2\u0135\u0136\7n\2\2\u0136\u0137\7c\2\2\u0137"+
		"\u0138\7v\2\2\u0138\u0139\7k\2\2\u0139\u013a\7v\2\2\u013a\u013b\7w\2\2"+
		"\u013b\u013c\7f\2\2\u013c\u013d\7g\2\2\u013d@\3\2\2\2\u013e\u013f\7n\2"+
		"\2\u013f\u0140\7q\2\2\u0140\u0141\7p\2\2\u0141\u0142\7i\2\2\u0142\u0143"+
		"\7k\2\2\u0143\u0144\7v\2\2\u0144\u0145\7w\2\2\u0145\u0146\7f\2\2\u0146"+
		"\u0147\7g\2\2\u0147B\3\2\2\2\u0148\u0149\7i\2\2\u0149\u014a\7t\2\2\u014a"+
		"\u014b\7k\2\2\u014b\u014c\7f\2\2\u014cD\3\2\2\2\u014d\u014e\7u\2\2\u014e"+
		"\u014f\7k\2\2\u014f\u0150\7|\2\2\u0150\u0151\7g\2\2\u0151F\3\2\2\2\u0152"+
		"\u0153\7o\2\2\u0153\u0154\7c\2\2\u0154\u0155\7r\2\2\u0155H\3\2\2\2\u0156"+
		"\u0157\7t\2\2\u0157\u0158\7c\2\2\u0158\u0159\7f\2\2\u0159\u015a\7k\2\2"+
		"\u015a\u015b\7q\2\2\u015bJ\3\2\2\2\u015c\u015d\7c\2\2\u015d\u015e\7o\2"+
		"\2\u015e\u015f\7o\2\2\u015f\u0160\7q\2\2\u0160L\3\2\2\2\u0161\u0162\7"+
		"h\2\2\u0162\u0163\7t\2\2\u0163\u0164\7w\2\2\u0164\u0165\7k\2\2\u0165\u0166"+
		"\7v\2\2\u0166\u0167\7u\2\2\u0167N\3\2\2\2\u0168\u0169\7u\2\2\u0169\u016a"+
		"\7q\2\2\u016a\u016b\7f\2\2\u016b\u016c\7c\2\2\u016cP\3\2\2\2\u016d\u016e"+
		"\7e\2\2\u016e\u016f\7q\2\2\u016f\u0170\7w\2\2\u0170\u0171\7p\2\2\u0171"+
		"\u0172\7v\2\2\u0172R\3\2\2\2\u0173\u0174\7n\2\2\u0174\u0175\7k\2\2\u0175"+
		"\u0176\7h\2\2\u0176\u0177\7g\2\2\u0177T\3\2\2\2\u0178\u0179\7v\2\2\u0179"+
		"\u017a\7t\2\2\u017a\u017b\7w\2\2\u017b\u017c\7g\2\2\u017cV\3\2\2\2\u017d"+
		"\u017e\7h\2\2\u017e\u017f\7c\2\2\u017f\u0180\7n\2\2\u0180\u0181\7u\2\2"+
		"\u0181\u0182\7g\2\2\u0182X\3\2\2\2\u0183\u0184\7g\2\2\u0184\u0185\7p\2"+
		"\2\u0185\u0186\7p\2\2\u0186\u0187\7g\2\2\u0187\u0188\7o\2\2\u0188\u0189"+
		"\7k\2\2\u0189Z\3\2\2\2\u018a\u018b\7k\2\2\u018b\u018c\7u\2\2\u018c\\\3"+
		"\2\2\2\u018d\u018e\7p\2\2\u018e\u018f\7q\2\2\u018f\u0190\7t\2\2\u0190"+
		"\u0191\7v\2\2\u0191\u0192\7j\2\2\u0192^\3\2\2\2\u0193\u0194\7u\2\2\u0194"+
		"\u0195\7q\2\2\u0195\u0196\7w\2\2\u0196\u0197\7v\2\2\u0197\u0198\7j\2\2"+
		"\u0198`\3\2\2\2\u0199\u019a\7g\2\2\u019a\u019b\7c\2\2\u019b\u019c\7u\2"+
		"\2\u019c\u019d\7v\2\2\u019db\3\2\2\2\u019e\u019f\7y\2\2\u019f\u01a0\7"+
		"g\2\2\u01a0\u01a1\7u\2\2\u01a1\u01a2\7v\2\2\u01a2d\3\2\2\2\u01a3\u01a4"+
		"\7i\2\2\u01a4\u01a5\7t\2\2\u01a5\u01a6\7c\2\2\u01a6\u01a7\7c\2\2\u01a7"+
		"\u01a8\7n\2\2\u01a8f\3\2\2\2\u01a9\u01aa\7q\2\2\u01aa\u01ab\7t\2\2\u01ab"+
		"h\3\2\2\2\u01ac\u01ad\7p\2\2\u01ad\u01ae\7q\2\2\u01ae\u01af\7v\2\2\u01af"+
		"j\3\2\2\2\u01b0\u01b1\7f\2\2\u01b1\u01b2\7k\2\2\u01b2\u01b3\7t\2\2\u01b3"+
		"\u01b4\7v\2\2\u01b4l\3\2\2\2\u01b5\u01b6\7t\2\2\u01b6\u01b7\7q\2\2\u01b7"+
		"\u01b8\7e\2\2\u01b8\u01b9\7m\2\2\u01b9n\3\2\2\2\u01ba\u01bb\7x\2\2\u01bb"+
		"\u01bc\7k\2\2\u01bc\u01bd\7p\2\2\u01bd\u01be\7g\2\2\u01be\u01bf\7u\2\2"+
		"\u01bfp\3\2\2\2\u01c0\u01c1\7|\2\2\u01c1\u01c2\7q\2\2\u01c2\u01c3\7o\2"+
		"\2\u01c3\u01c4\7d\2\2\u01c4\u01c5\7k\2\2\u01c5\u01c6\7g\2\2\u01c6r\3\2"+
		"\2\2\u01c7\u01c8\7r\2\2\u01c8\u01c9\7n\2\2\u01c9\u01ca\7c\2\2\u01ca\u01cb"+
		"\7{\2\2\u01cb\u01cc\7g\2\2\u01cc\u01cd\7t\2\2\u01cdt\3\2\2\2\u01ce\u01cf"+
		"\7p\2\2\u01cf\u01d0\7g\2\2\u01d0\u01d1\7c\2\2\u01d1\u01d2\7t\2\2\u01d2"+
		"\u01d3\7d\2\2\u01d3\u01d4\7{\2\2\u01d4v\3\2\2\2\u01d5\u01d6\7o\2\2\u01d6"+
		"\u01d7\7q\2\2\u01d7\u01d8\7x\2\2\u01d8\u01d9\7g\2\2\u01d9x\3\2\2\2\u01da"+
		"\u01db\7u\2\2\u01db\u01dc\7j\2\2\u01dc\u01dd\7q\2\2\u01dd\u01de\7q\2\2"+
		"\u01de\u01df\7v\2\2\u01dfz\3\2\2\2\u01e0\u01e1\7w\2\2\u01e1\u01e2\7u\2"+
		"\2\u01e2\u01e3\7g\2\2\u01e3|\3\2\2\2\u01e4\u01e5\7p\2\2\u01e5\u01e6\7"+
		"q\2\2\u01e6\u01e7\7v\2\2\u01e7\u01e8\7j\2\2\u01e8\u01e9\7k\2\2\u01e9\u01ea"+
		"\7p\2\2\u01ea\u01eb\7i\2\2\u01eb~\3\2\2\2\u01ec\u01ed\7c\2\2\u01ed\u01ee"+
		"\7u\2\2\u01ee\u0080\3\2\2\2\u01ef\u01f0\7f\2\2\u01f0\u01f1\7g\2\2\u01f1"+
		"\u01f2\7e\2\2\u01f2\u01f3\7n\2\2\u01f3\u01f4\7c\2\2\u01f4\u01f5\7t\2\2"+
		"\u01f5\u01f6\7g\2\2\u01f6\u0082\3\2\2\2\u01f7\u01f8\7c\2\2\u01f8\u01f9"+
		"\7p\2\2\u01f9\u01fa\7f\2\2\u01fa\u0084\3\2\2\2\u01fb\u01fc\7t\2\2\u01fc"+
		"\u01fd\7g\2\2\u01fd\u01fe\7v\2\2\u01fe\u01ff\7c\2\2\u01ff\u0200\7k\2\2"+
		"\u0200\u0201\7p\2\2\u0201\u0086\3\2\2\2\u0202\u0203\7d\2\2\u0203\u0204"+
		"\7{\2\2\u0204\u0088\3\2\2\2\u0205\u0206\7f\2\2\u0206\u0207\7g\2\2\u0207"+
		"\u0208\7h\2\2\u0208\u0209\7c\2\2\u0209\u020a\7w\2\2\u020a\u020b\7n\2\2"+
		"\u020b\u020c\7v\2\2\u020c\u008a\3\2\2\2\u020d\u020e\7n\2\2\u020e\u020f"+
		"\7q\2\2\u020f\u0210\7e\2\2\u0210\u0211\7c\2\2\u0211\u0212\7n\2\2\u0212"+
		"\u008c\3\2\2\2\u0213\u0214\7f\2\2\u0214\u0215\7q\2\2\u0215\u008e\3\2\2"+
		"\2\u0216\u0217\7f\2\2\u0217\u0218\7q\2\2\u0218\u0219\7p\2\2\u0219\u021a"+
		"\7g\2\2\u021a\u0090\3\2\2\2\u021b\u021c\7y\2\2\u021c\u021d\7j\2\2\u021d"+
		"\u021e\7g\2\2\u021e\u021f\7p\2\2\u021f\u0092\3\2\2\2\u0220\u0221\7{\2"+
		"\2\u0221\u0222\7q\2\2\u0222\u0223\7w\2\2\u0223\u0224\7t\2\2\u0224\u0094"+
		"\3\2\2\2\u0225\u0226\7v\2\2\u0226\u0227\7w\2\2\u0227\u0228\7t\2\2\u0228"+
		"\u0229\7p\2\2\u0229\u0096\3\2\2\2\u022a\u022b\7d\2\2\u022b\u022c\7q\2"+
		"\2\u022c\u022d\7q\2\2\u022d\u022e\7n\2\2\u022e\u022f\7g\2\2\u022f\u0230"+
		"\7c\2\2\u0230\u0231\7p\2\2\u0231\u0098\3\2\2\2\u0232\u0233\7k\2\2\u0233"+
		"\u0234\7p\2\2\u0234\u0235\7v\2\2\u0235\u0236\7g\2\2\u0236\u0237\7i\2\2"+
		"\u0237\u0238\7g\2\2\u0238\u0239\7t\2\2\u0239\u009a\3\2\2\2\u023a\u023b"+
		"\7u\2\2\u023b\u023c\7s\2\2\u023c\u023d\7w\2\2\u023d\u023e\7c\2\2\u023e"+
		"\u023f\7t\2\2\u023f\u0240\7g\2\2\u0240\u009c\3\2\2\2\u0241\u0242\7x\2"+
		"\2\u0242\u0243\7q\2\2\u0243\u0244\7k\2\2\u0244\u0245\7f\2\2\u0245\u009e"+
		"\3\2\2\2\u0246\u0247\5\u00a3R\2\u0247\u0248\5\'\24\2\u0248\u00a0\3\2\2"+
		"\2\u0249\u024e\5\u00a7T\2\u024a\u024d\5\u00a7T\2\u024b\u024d\5\u00a9U"+
		"\2\u024c\u024a\3\2\2\2\u024c\u024b\3\2\2\2\u024d\u0250\3\2\2\2\u024e\u024c"+
		"\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u00a2\3\2\2\2\u0250\u024e\3\2\2\2\u0251"+
		"\u0256\5\u00a7T\2\u0252\u0255\5\u00a9U\2\u0253\u0255\5\u00a7T\2\u0254"+
		"\u0252\3\2\2\2\u0254\u0253\3\2\2\2\u0255\u0258\3\2\2\2\u0256\u0254\3\2"+
		"\2\2\u0256\u0257\3\2\2\2\u0257\u00a4\3\2\2\2\u0258\u0256\3\2\2\2\u0259"+
		"\u025b\5\21\t\2\u025a\u0259\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025d\3"+
		"\2\2\2\u025c\u025e\5\u00a9U\2\u025d\u025c\3\2\2\2\u025e\u025f\3\2\2\2"+
		"\u025f\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u00a6\3\2\2\2\u0261\u0262"+
		"\t\2\2\2\u0262\u00a8\3\2\2\2\u0263\u0264\4\62;\2\u0264\u00aa\3\2\2\2\u0265"+
		"\u0267\7\17\2\2\u0266\u0265\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0268\3"+
		"\2\2\2\u0268\u0269\7\f\2\2\u0269\u026a\3\2\2\2\u026a\u026b\bV\2\2\u026b"+
		"\u00ac\3\2\2\2\u026c\u026e\t\3\2\2\u026d\u026c\3\2\2\2\u026e\u026f\3\2"+
		"\2\2\u026f\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271\3\2\2\2\u0271"+
		"\u0272\bW\2\2\u0272\u00ae\3\2\2\2\16\2\u00b5\u00c0\u00c4\u024c\u024e\u0254"+
		"\u0256\u025a\u025f\u0266\u026f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}