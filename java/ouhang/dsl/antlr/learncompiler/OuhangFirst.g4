// define a grammar called OuhangFirst
// this grammar is similar to Java while much simpler
grammar OuhangFirst;

// starting point
Identifier
	:	[a-zA-Z] [a-zA-Z_0-9]*	// must start with letter
	;

// Type, doesn't support array in Java like int[]
Type
	: 	PrimitiveType
	| 	JavaClassType
	;
ReturnType
	:	Type
	|	'void'
	;
PrimitiveType	
	:	INT | LONG | DOUBLE | FLOAT | BOOLEAN | STRING | CHAR
	;
// Doesn't support "extends", "super", template and array in type
JavaClassType
	:	Identifier
	|	Identifier '<' JavaClassType '>'
	;
// Input
InputDeclaration
	:	'input' '{' InputFieldsStatement* '}'
	;
InputFieldsStatement
	:	Identifier ':' Type ';'
	;

// Function
FunctionDeclaration
	:	'func'	ReturnType Identifier ParameterList '{' Statement '}'
	;
// Model
ModelDeclaration
	:	'model'	ReturnType	Identifier	'{' Statement '}'
	;
fragment ParameterList
	:	'(' (ParameterDeclaration ',')* ParameterDeclaration ')'

ParameterDeclaration
	: 	Type Identifier
	;
// Statement
Statement
	:	


// Keywords
PACKAGE		: 'package'		;
IMPORT		: 'import'		;
INPUT		: 'input'		;
FUNCTION	: 'func'		;
MODEL		: 'model'		;
RETURN		: 'return'		;

INT			: 'int'			;
LONG		: 'long'		;
DOUBLE		: 'double'		;
FLOAT		: 'float'		;
STRING		: 'string'		;
BOOLEAN		: 'boolean'		;
CHAR		: 'char'		;
TRUE		: 'true'		;
FALSE		" 'false'		;
NULL		: 'null'		;
NAN			: 'nan'			;
VOID		: 'void'		;

// Control: currently only contains if-else logic
IF			: 'if'			;
ELSE		: 'else'		;
IFELSE		: 'elif'		;

// Operators
ASSIGN		: '='	;
GT			: '>'	;
LT			: '<'	;
GTE			: '>='	;
LTE			: '<='	;
EQ			: '=='	;
ADD			: '+'	;
SUB			: '-'	;
MUL			: '*'	;
DIV			: '/'	;
MOD			: '%'	;
AND			: '&&'	;
OR			: '||'	;
NOT			: '!'	;
COLON		: ':'	;

ADD_ASSIGN	: '+='	;
SUB_ASSIGN	: '-='	;
MUL_ASSIGN	: '*='	;
DIV_ASSIGN	: '/='	;

// Separators
LPAREN		: '('	;
RPAREN		: ')'	;
LBRACE		: '{'	;
RBRACE		: '}'	;
LBRACK		: '['	;
RBRACK		: ']'	;
SEMI		: ';'	;
COMMA		: ','	;
DOT			: '.'	;

// Ignore
WS			: [ \t\n\r]+	-> skip;
COMMENT		: '/*' .*? '*/'
			| '//' ~[\r\n]*	-> skip;
// Common
// CR (Carriage Return): \r, used in Mac OS before X
// LF (Line Feed): \n, used in Unix/Max OS X
// CR + LF: \r\n, used in Windows
NEWLINE		: '\r'? '\n'
			| '\r'
			;
