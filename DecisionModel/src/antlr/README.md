# Antlr (ANother Tool for Language Recoginition)
	This package contains my efforts & ideas using this tool.
	http://www.antlr.org/  
	A powerful parser generator for reading, processing, executing, or translating structured text or binary files.
## Background
	1. Lexer (Scanner; Tokenizer; Lexical analyser)
	 - During the first phase, the compiler reads the input and convert strings into tokens. `
	 - Regular expressions specify patterns to lexer so it can scan and match strings in the input  
	 - Tokens are components of the programming language such as keywords, identifiers, symbols, and operators.  
	 - Well known: Lex / Flex, JFlex
	2. Parser (Syntactical analyser)
	 - Organises tokens it receives into the allowed sequences defined by the grammar of the language  
	 - Usually parser will produce AST(Abstract Syntax Tree)  
	 - Well known: YACC

	3. AST
	 - 
	4. More
	 - RE = DFA, which has finite states that cannot perform unbounded counting  
	 - RE is subset of CFG; CFG: definition can be recursive  
	 - CFG specifies how to convert token stream into parse tree  
	 - Ambiguous grammar can result in different parse trees after parsing

## More Documentation About Antlr 4
	1. Comments: /\*\* \*/ and //
	2. Identifiers:
	 - Token names should always start with a capital letter for lexer  
	 - Antlr accepts Unicode characters
	3. Keywords:
	 - Antlr has reserved words: import, fragment, lexer, parser, grammar, return, locals, throws, catch, finally, mode, options, tokens.  
	 - do not use the word "rule" as a rule name as well.
	4. When writing the rules, be careful of ambiguity and the left-recursive rule. 