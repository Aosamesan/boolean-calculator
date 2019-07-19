// Generated from /Users/aosamesan/IdeaProjects/booleancalculator/src/main/java/com/aosamesan/parser/Calculator.g4 by ANTLR 4.7.2
package com.aosamesan.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPAREN=2, ID=3, TRUE=4, FALSE=5, OR=6, AND=7, XOR=8, IF=9, IFF=10, 
		WHITESPACE=11, NOT_OPERATOR=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LPAREN", "RPAREN", "ID", "TRUE", "FALSE", "OR", "AND", "XOR", "IF", 
			"IFF", "WHITESPACE", "NOT_OPERATOR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LPAREN", "RPAREN", "ID", "TRUE", "FALSE", "OR", "AND", "XOR", 
			"IF", "IFF", "WHITESPACE", "NOT_OPERATOR"
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


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16s\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5\'"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6/\n\6\3\7\3\7\3\7\5\7\64\n\7\3\7\3\7\3"+
		"\7\5\79\n\7\3\b\3\b\3\b\5\b>\n\b\3\b\3\b\3\b\3\b\5\bD\n\b\3\t\3\t\3\t"+
		"\3\t\5\tJ\n\t\3\n\5\nM\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\nZ\n\n\3\n\5\n]\n\n\3\13\3\13\5\13a\n\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13h\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\rr\n\r\2\2\16\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\27\b\2CGIUW\\cgiuw|"+
		"\4\2VVvv\4\2TTtt\4\2WWww\4\2GGgg\5\2\63\63VVvv\4\2HHhh\4\2CCcc\4\2NNn"+
		"n\4\2UUuu\5\2\62\62HHhh\4\2QQqq\4\2PPpp\4\2FFff\4\2ZZzz\4\2KKkk\4\2OO"+
		"oo\4\2RRrr\4\2[[{{\4\2\13\13\"\"\5\2##\u0080\u0080\u00ae\u00ae\2\u0086"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\3\33\3\2\2\2\5\35\3\2\2\2\7\37\3\2\2\2\t&\3\2\2\2\13.\3"+
		"\2\2\2\r8\3\2\2\2\17C\3\2\2\2\21I\3\2\2\2\23\\\3\2\2\2\25g\3\2\2\2\27"+
		"i\3\2\2\2\31q\3\2\2\2\33\34\7*\2\2\34\4\3\2\2\2\35\36\7+\2\2\36\6\3\2"+
		"\2\2\37 \t\2\2\2 \b\3\2\2\2!\"\t\3\2\2\"#\t\4\2\2#$\t\5\2\2$\'\t\6\2\2"+
		"%\'\t\7\2\2&!\3\2\2\2&%\3\2\2\2\'\n\3\2\2\2()\t\b\2\2)*\t\t\2\2*+\t\n"+
		"\2\2+,\t\13\2\2,/\t\6\2\2-/\t\f\2\2.(\3\2\2\2.-\3\2\2\2/\f\3\2\2\2\60"+
		"9\7-\2\2\61\63\7~\2\2\62\64\7~\2\2\63\62\3\2\2\2\63\64\3\2\2\2\649\3\2"+
		"\2\2\65\66\t\r\2\2\669\t\4\2\2\679\7\u222a\2\28\60\3\2\2\28\61\3\2\2\2"+
		"8\65\3\2\2\28\67\3\2\2\29\16\3\2\2\2:D\7,\2\2;=\7(\2\2<>\7(\2\2=<\3\2"+
		"\2\2=>\3\2\2\2>D\3\2\2\2?@\t\t\2\2@A\t\16\2\2AD\t\17\2\2BD\7\u2229\2\2"+
		"C:\3\2\2\2C;\3\2\2\2C?\3\2\2\2CB\3\2\2\2D\20\3\2\2\2EF\t\20\2\2FG\t\r"+
		"\2\2GJ\t\4\2\2HJ\7`\2\2IE\3\2\2\2IH\3\2\2\2J\22\3\2\2\2KM\7/\2\2LK\3\2"+
		"\2\2LM\3\2\2\2MN\3\2\2\2N]\7@\2\2OP\t\21\2\2P]\t\b\2\2QR\t\21\2\2RS\t"+
		"\22\2\2ST\t\23\2\2TY\t\n\2\2UZ\t\24\2\2VW\t\21\2\2WX\t\6\2\2XZ\t\13\2"+
		"\2YU\3\2\2\2YV\3\2\2\2Z]\3\2\2\2[]\7\u2194\2\2\\L\3\2\2\2\\O\3\2\2\2\\"+
		"Q\3\2\2\2\\[\3\2\2\2]\24\3\2\2\2^`\7>\2\2_a\7/\2\2`_\3\2\2\2`a\3\2\2\2"+
		"ab\3\2\2\2bh\7@\2\2cd\t\21\2\2de\t\b\2\2eh\t\b\2\2fh\7\u2b66\2\2g^\3\2"+
		"\2\2gc\3\2\2\2gf\3\2\2\2h\26\3\2\2\2ij\t\25\2\2jk\3\2\2\2kl\b\f\2\2l\30"+
		"\3\2\2\2mr\t\26\2\2no\t\16\2\2op\t\r\2\2pr\t\3\2\2qm\3\2\2\2qn\3\2\2\2"+
		"r\32\3\2\2\2\20\2&.\638=CILY\\`gq\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}