/** 
 * Define a grammar called OuhangFirst
 * this grammar is similar to Java while much simpler
 */
grammar OuhangFirst;

/**
 * Package.
 */
packageDeclaration
    :    PACKAGE Identifier ('.' Identifier)* ';'
    ; 
/**
 * Import.
 */
importDeclaration
    :    IMPORT Identifier ('.' Identifier)* ('.*')? ';'
    ;
/**
 * Input.
 */
inputDeclaration
    :    INPUT '{' inputFieldsStatement* '}'
    ;
inputFieldsStatement
    :    Identifier ':' Type ';'
    ;

/**
 * Function.
 */
functionDeclaration
    :    FUNCTION Type Identifier parameterList '{' statement* RETURN expression ';' '}'
    |    FUNCTION VOID Identifier parameterList '{' statement* '}'
    ;

/**
 * Model.
 */
modelDeclaration
    :    MODEL Type Identifier 
    |    MODEL VOID Identifier
    ;
fragment parameterList
    :    '(' (parameterDeclaration ',')* parameterDeclaration? ')'
    ;
parameterDeclaration
    :    Type Identifier
    ;

/**
 * Statement.
 */
statement
    :    localVariableDeclarationStatement
    |    variableAssignmentStatement
    |    '{' statement '}'
    |    IF '(' expression ')' statement
         ELIF '(' expression ')' statement
         ( ELSE statement )?
    ;

localVariableDeclarationStatement
    :    Type variableAssignmentStatement
    ;

variableAssignmentStatement
    |    Identifier ASSIGN expression ';'
    |    Identifier ADD_ASSIGN expression ';'
    |    Identifier SUB_ASSIGN expression ';'
    |    Identifier MUL_ASSIGN expression ';' 
    |    Identifier DIV_ASSIGN expression ';'
    |    Identifier MOD_ASSIGN expression ';' 
    ;

expression // Expression will always have a value
    :    (Identifier | NULL | NAN)
    |    (BooleanLiteral | Literal)
    |    Identifier '.' Identifier '(' methodParameterList ')'
    |    Identifier '(' methodParameterList ')' // from func
    |    '(' expression ')'
    |    NOT expression
    |    expression (MUL | DIV | MOD) expression
    |    expression (ADD | SUB) expression
    |    expression (LT | LTE | GT | GTE | EQ | NEQ | AND | OR) expression
    ;

fragment methodParameterList
    :    (Identifier ',')* Identifier
    ;

/**
 * Tokens, include:
 * identifiers, types, keywords, literals, operators, separators and esc.
 */
Identifier // For Variable, Model or Function name
    :    [a-zA-Z] [a-zA-Z_0-9]*    // must start with letter
    ;
Type // doesn't support array in Java like int[]
    :    PrimitiveType | JavaClassType
    ;
PrimitiveType
    :    INT | LONG | DOUBLE | FLOAT | BOOLEAN | STRING | CHAR
    ;
JavaClassType  // doesn't support "extends", "super", template and array in type
    :    Identifier | Identifier '<' JavaClassType '>'
    ;

/**
 * Literals, a much more simple version than Java literals.
 * For numeric literals, only support decimal.
 * Doesn't support scientific notation currently.
 */
Literal
    : StringLiteral
    | BooleanLiteral
    | IntegerLiteral
    | LongLiteral
    | FloatLiteral
    | DoubleLiteral
    ;
StringLiteral //? support unicode should check
    :    '"' (()+)? '"'
    ;    
CharLiteral
    :    '\'' SingleCharacter '\''
    |    '\'' EscapeSequence '\''
    ;
BooleanLiteral
    :    TRUE | FALSE
    ;
IntegerLiteral
    :    [+-]? ([1-9]+ 0*)* [0-9]
    ;
LongLiteral
    :    IntegerLiteral 'L'
    ;
FloatLiteral
    :    [+-]? ([1-9]+ 0*)* [0-9] '.' [0-9]+ 'f'?
    ;
DoubleLiteral
    :    [+-]? ([1-9]+ 0*)* [0-9] '.' [0-9]+ 'd'
    ;
fragment SingalCharacter
    :    ~['\\]
    ;
fragment EscapeSequence
    :    '\\' [btnfr"'\\]
    |    '\\' OctalDigit                              // Octal Escape
    |    '\\' OctalDigit OctalDigit                   // Octal Escape
    |    '\\' [0-3] OctalDigit OctalDigit             // Octal Escape
    |    '\\' 'u' HexDigit HexDigit HexDigit HexDigit // Unicode Escape
    ;
fragment OctalDigit
    :    [0-7]
    ;
fragment HexDigit
    :    [0-9a-fA-F]
    ;

/**
 * Keywords.
 */
PACKAGE       : 'package'   ;
IMPORT        : 'import'    ;
INPUT         : 'input'     ;
FUNCTION      : 'func'      ;
MODEL         : 'model'     ;
RETURN        : 'return'    ;

INT           : 'int'       ;
LONG          : 'long'      ;
DOUBLE        : 'double'    ;
FLOAT         : 'float'     ;
STRING        : 'string'    ;
BOOLEAN       : 'boolean'   ;
CHAR          : 'char'      ;

// Keywords for control: currently only contains if-else logic
IF            : 'if'   ;
ELSE          : 'else' ;
IFELSE        : 'elif' ;

TRUE          : 'true' ;
FALSE         : 'false';
NULL          : 'null' ;
NAN           : 'nan'  ;
VOID          : 'void' ;

// Operators
GT            : '>'    ;
LT            : '<'    ;
GTE           : '>='   ;
LTE           : '<='   ;
EQ            : '=='   ;
NEQ           : '!='   ;
ADD           : '+'    ;
SUB           : '-'    ;
MUL           : '*'    ;
DIV           : '/'    ;
MOD           : '%'    ;
AND           : '&&'   ;
OR            : '||'   ;
NOT           : '!'    ;
COLON         : ':'    ;

ASSIGN        : '='    ;
ADD_ASSIGN    : '+='   ;
SUB_ASSIGN    : '-='   ;
MUL_ASSIGN    : '*='   ;
DIV_ASSIGN    : '/='   ;
MOD_ASSIGN    : '%='   ;

// Separators
LPAREN        : '('    ;
RPAREN        : ')'    ;
LBRACE        : '{'    ;
RBRACE        : '}'    ;
LBRACK        : '['    ;
RBRACK        : ']'    ;
SEMI          : ';'    ;
COMMA         : ','    ;
DOT           : '.'    ;

// Ignore
WS            : [ \t\n\r]+    -> skip;
COMMENT       : '/*' .*? '*/'
              | '//' ~[\r\n]* -> skip;
/**
 * CR (Carriage Return): \r, used in Mac OS before X
 * LF (Line Feed): \n, used in Unix/Max OS X
 * CR + LF: \r\n, used in Windows
 */
NEWLINE       : '\r'? '\n' | '\r'
              ;

