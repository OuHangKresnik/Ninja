// Generated from DeciLan.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DeciLanParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Identifier=2, Type=3, PrimitiveType=4, JavaClassType=5, Literal=6, 
		StringLiteral=7, CharLiteral=8, BooleanLiteral=9, IntegerLiteral=10, LongLiteral=11, 
		FloatLiteral=12, DoubleLiteral=13, PACKAGE=14, IMPORT=15, INPUT=16, FUNCTION=17, 
		MODEL=18, RETURN=19, INT=20, LONG=21, DOUBLE=22, FLOAT=23, STRING=24, 
		BOOLEAN=25, CHAR=26, IF=27, ELSE=28, ELIF=29, TRUE=30, FALSE=31, NULL=32, 
		NAN=33, VOID=34, GT=35, LT=36, GTE=37, LTE=38, EQ=39, NEQ=40, ADD=41, 
		SUB=42, MUL=43, DIV=44, MOD=45, AND=46, OR=47, NOT=48, COLON=49, ASSIGN=50, 
		ADD_ASSIGN=51, SUB_ASSIGN=52, MUL_ASSIGN=53, DIV_ASSIGN=54, MOD_ASSIGN=55, 
		LPAREN=56, RPAREN=57, LBRACE=58, RBRACE=59, LBRACK=60, RBRACK=61, SEMI=62, 
		COMMA=63, DOT=64, WS=65, COMMENT=66, LINE_COMMENT=67, NEWLINE=68;
	public static final int
		RULE_packageDeclaration = 0, RULE_importDeclaration = 1, RULE_inputDeclaration = 2, 
		RULE_inputFieldsStatement = 3, RULE_functionDeclaration = 4, RULE_modelDeclaration = 5, 
		RULE_parameterList = 6, RULE_parameterDeclaration = 7, RULE_statement = 8, 
		RULE_localVariableDeclarationStatement = 9, RULE_variableAssignmentStatement = 10, 
		RULE_expression = 11, RULE_methodParameterList = 12;
	public static final String[] ruleNames = {
		"packageDeclaration", "importDeclaration", "inputDeclaration", "inputFieldsStatement", 
		"functionDeclaration", "modelDeclaration", "parameterList", "parameterDeclaration", 
		"statement", "localVariableDeclarationStatement", "variableAssignmentStatement", 
		"expression", "methodParameterList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.*'", null, null, null, null, null, null, null, null, null, null, 
		null, null, "'package'", "'import'", "'input'", "'func'", "'model'", "'return'", 
		"'int'", "'long'", "'double'", "'float'", "'string'", "'boolean'", "'char'", 
		"'if'", "'else'", "'elif'", "'true'", "'false'", "'null'", "'nan'", "'void'", 
		"'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'&&'", "'||'", "'!'", "':'", "'='", "'+='", "'-='", "'*='", "'/='", 
		"'%='", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "Identifier", "Type", "PrimitiveType", "JavaClassType", "Literal", 
		"StringLiteral", "CharLiteral", "BooleanLiteral", "IntegerLiteral", "LongLiteral", 
		"FloatLiteral", "DoubleLiteral", "PACKAGE", "IMPORT", "INPUT", "FUNCTION", 
		"MODEL", "RETURN", "INT", "LONG", "DOUBLE", "FLOAT", "STRING", "BOOLEAN", 
		"CHAR", "IF", "ELSE", "ELIF", "TRUE", "FALSE", "NULL", "NAN", "VOID", 
		"GT", "LT", "GTE", "LTE", "EQ", "NEQ", "ADD", "SUB", "MUL", "DIV", "MOD", 
		"AND", "OR", "NOT", "COLON", "ASSIGN", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
		"DIV_ASSIGN", "MOD_ASSIGN", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", 
		"RBRACK", "SEMI", "COMMA", "DOT", "WS", "COMMENT", "LINE_COMMENT", "NEWLINE"
	};
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
	public String getGrammarFileName() { return "DeciLan.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DeciLanParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(DeciLanParser.PACKAGE, 0); }
		public List<TerminalNode> Identifier() { return getTokens(DeciLanParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(DeciLanParser.Identifier, i);
		}
		public List<TerminalNode> DOT() { return getTokens(DeciLanParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(DeciLanParser.DOT, i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeciLanListener ) ((DeciLanListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeciLanListener ) ((DeciLanListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(PACKAGE);
			setState(27);
			match(Identifier);
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(28);
				match(DOT);
				setState(29);
				match(Identifier);
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			match(SEMI);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(DeciLanParser.IMPORT, 0); }
		public List<TerminalNode> Identifier() { return getTokens(DeciLanParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(DeciLanParser.Identifier, i);
		}
		public List<TerminalNode> DOT() { return getTokens(DeciLanParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(DeciLanParser.DOT, i);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeciLanListener ) ((DeciLanListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeciLanListener ) ((DeciLanListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(IMPORT);
			setState(38);
			match(Identifier);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(39);
				match(DOT);
				setState(40);
				match(Identifier);
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(46);
				match(T__0);
				}
			}

			setState(49);
			match(SEMI);
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

	public static class InputDeclarationContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(DeciLanParser.INPUT, 0); }
		public List<InputFieldsStatementContext> inputFieldsStatement() {
			return getRuleContexts(InputFieldsStatementContext.class);
		}
		public InputFieldsStatementContext inputFieldsStatement(int i) {
			return getRuleContext(InputFieldsStatementContext.class,i);
		}
		public InputDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeciLanListener ) ((DeciLanListener)listener).enterInputDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeciLanListener ) ((DeciLanListener)listener).exitInputDeclaration(this);
		}
	}

	public final InputDeclarationContext inputDeclaration() throws RecognitionException {
		InputDeclarationContext _localctx = new InputDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_inputDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(INPUT);
			setState(52);
			match(LBRACE);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(53);
				inputFieldsStatement();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			match(RBRACE);
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

	public static class InputFieldsStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DeciLanParser.Identifier, 0); }
		public TerminalNode Type() { return getToken(DeciLanParser.Type, 0); }
		public InputFieldsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputFieldsStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeciLanListener ) ((DeciLanListener)listener).enterInputFieldsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeciLanListener ) ((DeciLanListener)listener).exitInputFieldsStatement(this);
		}
	}

	public final InputFieldsStatementContext inputFieldsStatement() throws RecognitionException {
		InputFieldsStatementContext _localctx = new InputFieldsStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_inputFieldsStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(Identifier);
			setState(62);
			match(COLON);
			setState(63);
			match(Type);
			setState(64);
			match(SEMI);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(DeciLanParser.FUNCTION, 0); }
		public TerminalNode Type() { return getToken(DeciLanParser.Type, 0); }
		public TerminalNode Identifier() { return getToken(DeciLanParser.Identifier, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(DeciLanParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode VOID() { return getToken(DeciLanParser.VOID, 0); }
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeciLanListener ) ((DeciLanListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeciLanListener ) ((DeciLanListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionDeclaration);
		int _la;
		try {
			setState(95);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(FUNCTION);
				setState(67);
				match(Type);
				setState(68);
				match(Identifier);
				setState(69);
				parameterList();
				setState(70);
				match(LBRACE);
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Type) | (1L << IF) | (1L << LBRACE))) != 0)) {
					{
					{
					setState(71);
					statement();
					}
					}
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(77);
				match(RETURN);
				setState(78);
				expression(0);
				setState(79);
				match(SEMI);
				setState(80);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(FUNCTION);
				setState(83);
				match(VOID);
				setState(84);
				match(Identifier);
				setState(85);
				parameterList();
				setState(86);
				match(LBRACE);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << Type) | (1L << IF) | (1L << LBRACE))) != 0)) {
					{
					{
					setState(87);
					statement();
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(93);
				match(RBRACE);
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

	public static class ModelDeclarationContext extends ParserRuleContext {
		public TerminalNode MODEL() { return getToken(DeciLanParser.MODEL, 0); }
		public TerminalNode Type() { return getToken(DeciLanParser.Type, 0); }
		public TerminalNode Identifier() { return getToken(DeciLanParser.Identifier, 0); }
		public TerminalNode VOID() { return getToken(DeciLanParser.VOID, 0); }
		public ModelDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeciLanListener ) ((DeciLanListener)listener).enterModelDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeciLanListener ) ((DeciLanListener)listener).exitModelDeclaration(this);
		}
	}

	public final ModelDeclarationContext modelDeclaration() throws RecognitionException {
		ModelDeclarationContext _localctx = new ModelDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_modelDeclaration);
		try {
			setState(103);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(MODEL);
				setState(98);
				match(Type);
				setState(99);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(MODEL);
				setState(101);
				match(VOID);
				setState(102);
				match(Identifier);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeciLanListener ) ((DeciLanListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeciLanListener ) ((DeciLanListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameterList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(LPAREN);
			setState(115);
			_la = _input.LA(1);
			if (_la==Type) {
				{
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(106);
						parameterDeclaration();
						setState(107);
						match(COMMA);
						}
						} 
					}
					setState(113);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(114);
				parameterDeclaration();
				}
			}

			setState(117);
			match(RPAREN);
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

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(DeciLanParser.Type, 0); }
		public TerminalNode Identifier() { return getToken(DeciLanParser.Identifier, 0); }
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeciLanListener ) ((DeciLanListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeciLanListener ) ((DeciLanListener)listener).exitParameterDeclaration(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(Type);
			setState(120);
			match(Identifier);
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

	public static class StatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public VariableAssignmentStatementContext variableAssignmentStatement() {
			return getRuleContext(VariableAssignmentStatementContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode IF() { return getToken(DeciLanParser.IF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ELIF() { return getToken(DeciLanParser.ELIF, 0); }
		public TerminalNode ELSE() { return getToken(DeciLanParser.ELSE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeciLanListener ) ((DeciLanListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeciLanListener ) ((DeciLanListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(142);
			switch (_input.LA(1)) {
			case Type:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				localVariableDeclarationStatement();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				variableAssignmentStatement();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				match(LBRACE);
				setState(125);
				statement();
				setState(126);
				match(RBRACE);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				match(IF);
				setState(129);
				match(LPAREN);
				setState(130);
				expression(0);
				setState(131);
				match(RPAREN);
				setState(132);
				statement();
				setState(133);
				match(ELIF);
				setState(134);
				match(LPAREN);
				setState(135);
				expression(0);
				setState(136);
				match(RPAREN);
				setState(137);
				statement();
				setState(140);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(138);
					match(ELSE);
					setState(139);
					statement();
					}
					break;
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

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(DeciLanParser.Type, 0); }
		public VariableAssignmentStatementContext variableAssignmentStatement() {
			return getRuleContext(VariableAssignmentStatementContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeciLanListener ) ((DeciLanListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeciLanListener ) ((DeciLanListener)listener).exitLocalVariableDeclarationStatement(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(Type);
			setState(145);
			variableAssignmentStatement();
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

	public static class VariableAssignmentStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DeciLanParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(DeciLanParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ADD_ASSIGN() { return getToken(DeciLanParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(DeciLanParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(DeciLanParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(DeciLanParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(DeciLanParser.MOD_ASSIGN, 0); }
		public VariableAssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeciLanListener ) ((DeciLanListener)listener).enterVariableAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeciLanListener ) ((DeciLanListener)listener).exitVariableAssignmentStatement(this);
		}
	}

	public final VariableAssignmentStatementContext variableAssignmentStatement() throws RecognitionException {
		VariableAssignmentStatementContext _localctx = new VariableAssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableAssignmentStatement);
		try {
			setState(177);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(Identifier);
				setState(148);
				match(ASSIGN);
				setState(149);
				expression(0);
				setState(150);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(Identifier);
				setState(153);
				match(ADD_ASSIGN);
				setState(154);
				expression(0);
				setState(155);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(Identifier);
				setState(158);
				match(SUB_ASSIGN);
				setState(159);
				expression(0);
				setState(160);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				match(Identifier);
				setState(163);
				match(MUL_ASSIGN);
				setState(164);
				expression(0);
				setState(165);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(167);
				match(Identifier);
				setState(168);
				match(DIV_ASSIGN);
				setState(169);
				expression(0);
				setState(170);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(172);
				match(Identifier);
				setState(173);
				match(MOD_ASSIGN);
				setState(174);
				expression(0);
				setState(175);
				match(SEMI);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(DeciLanParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(DeciLanParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(DeciLanParser.Identifier, i);
		}
		public TerminalNode NULL() { return getToken(DeciLanParser.NULL, 0); }
		public TerminalNode NAN() { return getToken(DeciLanParser.NAN, 0); }
		public TerminalNode BooleanLiteral() { return getToken(DeciLanParser.BooleanLiteral, 0); }
		public TerminalNode Literal() { return getToken(DeciLanParser.Literal, 0); }
		public MethodParameterListContext methodParameterList() {
			return getRuleContext(MethodParameterListContext.class,0);
		}
		public TerminalNode MUL() { return getToken(DeciLanParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(DeciLanParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(DeciLanParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(DeciLanParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(DeciLanParser.SUB, 0); }
		public TerminalNode LT() { return getToken(DeciLanParser.LT, 0); }
		public TerminalNode LTE() { return getToken(DeciLanParser.LTE, 0); }
		public TerminalNode GT() { return getToken(DeciLanParser.GT, 0); }
		public TerminalNode GTE() { return getToken(DeciLanParser.GTE, 0); }
		public TerminalNode EQ() { return getToken(DeciLanParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(DeciLanParser.NEQ, 0); }
		public TerminalNode AND() { return getToken(DeciLanParser.AND, 0); }
		public TerminalNode OR() { return getToken(DeciLanParser.OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeciLanListener ) ((DeciLanListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeciLanListener ) ((DeciLanListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(180);
				match(NOT);
				setState(181);
				expression(4);
				}
				break;
			case 2:
				{
				setState(182);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << NULL) | (1L << NAN))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 3:
				{
				setState(183);
				_la = _input.LA(1);
				if ( !(_la==Literal || _la==BooleanLiteral) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 4:
				{
				setState(184);
				match(Identifier);
				setState(185);
				match(DOT);
				setState(186);
				match(Identifier);
				setState(187);
				match(LPAREN);
				setState(188);
				methodParameterList();
				setState(189);
				match(RPAREN);
				}
				break;
			case 5:
				{
				setState(191);
				match(Identifier);
				setState(192);
				match(LPAREN);
				setState(193);
				methodParameterList();
				setState(194);
				match(RPAREN);
				}
				break;
			case 6:
				{
				setState(196);
				match(LPAREN);
				setState(197);
				expression(0);
				setState(198);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(211);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(202);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(203);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(204);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(205);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(206);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(207);
						expression(3);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(208);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(209);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GTE) | (1L << LTE) | (1L << EQ) | (1L << NEQ) | (1L << AND) | (1L << OR))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(210);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class MethodParameterListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(DeciLanParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(DeciLanParser.Identifier, i);
		}
		public MethodParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DeciLanListener ) ((DeciLanListener)listener).enterMethodParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DeciLanListener ) ((DeciLanListener)listener).exitMethodParameterList(this);
		}
	}

	public final MethodParameterListContext methodParameterList() throws RecognitionException {
		MethodParameterListContext _localctx = new MethodParameterListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_methodParameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(216);
					match(Identifier);
					setState(217);
					match(COMMA);
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(223);
			match(Identifier);
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
		case 11:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3F\u00e4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\7\2!\n\2\f\2\16\2$\13\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\7\3,\n\3\f\3\16\3/\13\3\3\3\5\3\62\n\3\3\3\3"+
		"\3\3\4\3\4\3\4\7\49\n\4\f\4\16\4<\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\7\6K\n\6\f\6\16\6N\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\6\3\6\5\6b\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7j\n\7\3\b\3\b\3\b\3\b\7\bp\n\b\f\b\16\bs\13\b\3\b\5"+
		"\bv\n\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008f\n\n\5\n\u0091\n\n\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b4\n\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u00cb\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00d6"+
		"\n\r\f\r\16\r\u00d9\13\r\3\16\3\16\7\16\u00dd\n\16\f\16\16\16\u00e0\13"+
		"\16\3\16\3\16\3\16\2\3\30\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\7\4\2"+
		"\4\4\"#\4\2\b\b\13\13\3\2-/\3\2+,\4\2%*\60\61\u00f2\2\34\3\2\2\2\4\'\3"+
		"\2\2\2\6\65\3\2\2\2\b?\3\2\2\2\na\3\2\2\2\fi\3\2\2\2\16k\3\2\2\2\20y\3"+
		"\2\2\2\22\u0090\3\2\2\2\24\u0092\3\2\2\2\26\u00b3\3\2\2\2\30\u00ca\3\2"+
		"\2\2\32\u00de\3\2\2\2\34\35\7\20\2\2\35\"\7\4\2\2\36\37\7B\2\2\37!\7\4"+
		"\2\2 \36\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2\2"+
		"%&\7@\2\2&\3\3\2\2\2\'(\7\21\2\2(-\7\4\2\2)*\7B\2\2*,\7\4\2\2+)\3\2\2"+
		"\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\61\3\2\2\2/-\3\2\2\2\60\62\7\3\2\2\61"+
		"\60\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\7@\2\2\64\5\3\2\2\2\65\66"+
		"\7\22\2\2\66:\7<\2\2\679\5\b\5\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2"+
		"\2\2;=\3\2\2\2<:\3\2\2\2=>\7=\2\2>\7\3\2\2\2?@\7\4\2\2@A\7\63\2\2AB\7"+
		"\5\2\2BC\7@\2\2C\t\3\2\2\2DE\7\23\2\2EF\7\5\2\2FG\7\4\2\2GH\5\16\b\2H"+
		"L\7<\2\2IK\5\22\n\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2"+
		"NL\3\2\2\2OP\7\25\2\2PQ\5\30\r\2QR\7@\2\2RS\7=\2\2Sb\3\2\2\2TU\7\23\2"+
		"\2UV\7$\2\2VW\7\4\2\2WX\5\16\b\2X\\\7<\2\2Y[\5\22\n\2ZY\3\2\2\2[^\3\2"+
		"\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7=\2\2`b\3\2\2\2aD\3"+
		"\2\2\2aT\3\2\2\2b\13\3\2\2\2cd\7\24\2\2de\7\5\2\2ej\7\4\2\2fg\7\24\2\2"+
		"gh\7$\2\2hj\7\4\2\2ic\3\2\2\2if\3\2\2\2j\r\3\2\2\2ku\7:\2\2lm\5\20\t\2"+
		"mn\7A\2\2np\3\2\2\2ol\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2"+
		"sq\3\2\2\2tv\5\20\t\2uq\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7;\2\2x\17\3\2\2"+
		"\2yz\7\5\2\2z{\7\4\2\2{\21\3\2\2\2|\u0091\5\24\13\2}\u0091\5\26\f\2~\177"+
		"\7<\2\2\177\u0080\5\22\n\2\u0080\u0081\7=\2\2\u0081\u0091\3\2\2\2\u0082"+
		"\u0083\7\35\2\2\u0083\u0084\7:\2\2\u0084\u0085\5\30\r\2\u0085\u0086\7"+
		";\2\2\u0086\u0087\5\22\n\2\u0087\u0088\7\37\2\2\u0088\u0089\7:\2\2\u0089"+
		"\u008a\5\30\r\2\u008a\u008b\7;\2\2\u008b\u008e\5\22\n\2\u008c\u008d\7"+
		"\36\2\2\u008d\u008f\5\22\n\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0091\3\2\2\2\u0090|\3\2\2\2\u0090}\3\2\2\2\u0090~\3\2\2\2\u0090\u0082"+
		"\3\2\2\2\u0091\23\3\2\2\2\u0092\u0093\7\5\2\2\u0093\u0094\5\26\f\2\u0094"+
		"\25\3\2\2\2\u0095\u0096\7\4\2\2\u0096\u0097\7\64\2\2\u0097\u0098\5\30"+
		"\r\2\u0098\u0099\7@\2\2\u0099\u00b4\3\2\2\2\u009a\u009b\7\4\2\2\u009b"+
		"\u009c\7\65\2\2\u009c\u009d\5\30\r\2\u009d\u009e\7@\2\2\u009e\u00b4\3"+
		"\2\2\2\u009f\u00a0\7\4\2\2\u00a0\u00a1\7\66\2\2\u00a1\u00a2\5\30\r\2\u00a2"+
		"\u00a3\7@\2\2\u00a3\u00b4\3\2\2\2\u00a4\u00a5\7\4\2\2\u00a5\u00a6\7\67"+
		"\2\2\u00a6\u00a7\5\30\r\2\u00a7\u00a8\7@\2\2\u00a8\u00b4\3\2\2\2\u00a9"+
		"\u00aa\7\4\2\2\u00aa\u00ab\78\2\2\u00ab\u00ac\5\30\r\2\u00ac\u00ad\7@"+
		"\2\2\u00ad\u00b4\3\2\2\2\u00ae\u00af\7\4\2\2\u00af\u00b0\79\2\2\u00b0"+
		"\u00b1\5\30\r\2\u00b1\u00b2\7@\2\2\u00b2\u00b4\3\2\2\2\u00b3\u0095\3\2"+
		"\2\2\u00b3\u009a\3\2\2\2\u00b3\u009f\3\2\2\2\u00b3\u00a4\3\2\2\2\u00b3"+
		"\u00a9\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b4\27\3\2\2\2\u00b5\u00b6\b\r\1"+
		"\2\u00b6\u00b7\7\62\2\2\u00b7\u00cb\5\30\r\6\u00b8\u00cb\t\2\2\2\u00b9"+
		"\u00cb\t\3\2\2\u00ba\u00bb\7\4\2\2\u00bb\u00bc\7B\2\2\u00bc\u00bd\7\4"+
		"\2\2\u00bd\u00be\7:\2\2\u00be\u00bf\5\32\16\2\u00bf\u00c0\7;\2\2\u00c0"+
		"\u00cb\3\2\2\2\u00c1\u00c2\7\4\2\2\u00c2\u00c3\7:\2\2\u00c3\u00c4\5\32"+
		"\16\2\u00c4\u00c5\7;\2\2\u00c5\u00cb\3\2\2\2\u00c6\u00c7\7:\2\2\u00c7"+
		"\u00c8\5\30\r\2\u00c8\u00c9\7;\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00b5\3\2"+
		"\2\2\u00ca\u00b8\3\2\2\2\u00ca\u00b9\3\2\2\2\u00ca\u00ba\3\2\2\2\u00ca"+
		"\u00c1\3\2\2\2\u00ca\u00c6\3\2\2\2\u00cb\u00d7\3\2\2\2\u00cc\u00cd\f\5"+
		"\2\2\u00cd\u00ce\t\4\2\2\u00ce\u00d6\5\30\r\6\u00cf\u00d0\f\4\2\2\u00d0"+
		"\u00d1\t\5\2\2\u00d1\u00d6\5\30\r\5\u00d2\u00d3\f\3\2\2\u00d3\u00d4\t"+
		"\6\2\2\u00d4\u00d6\5\30\r\4\u00d5\u00cc\3\2\2\2\u00d5\u00cf\3\2\2\2\u00d5"+
		"\u00d2\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8\31\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7\4\2\2\u00db\u00dd"+
		"\7A\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7\4"+
		"\2\2\u00e2\33\3\2\2\2\23\"-\61:L\\aiqu\u008e\u0090\u00b3\u00ca\u00d5\u00d7"+
		"\u00de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}