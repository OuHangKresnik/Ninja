/** 
 * Define a grammar called OuhangFirst
 * this grammar is similar to Java while much simpler
 */
grammar DeciLan;

/**
 * @header {
 * package java.ouhang.dsl.decisionmodel.antlr;
 *}
 */

/**
 * Package.
 */
packageDeclaration
    :    'package' Identifier (DOT Identifier)* ';'
    ; 
/**
 * Import.
 */
importDeclaration
    :    'import' Identifier (DOT Identifier)* ('.*')? ';'
    ;
/**
 * Inject.
 */
injectDeclaration
    :    'inject' '{' fieldStatement* '}'
    ;

/**
 * Input.
 */
inputDeclaration
    :    'input' '{' fieldStatement* '}'
    ;

fieldStatement
    :    Identifier ':' (Identifier | TypeWithParameters) ';'
    ;
/**
 * Function.
 */
functionDeclaration
    :    'func' (Identifier | TypeWithParameters) Identifier parameterList '{' statement* '}'
    ;

/**
 * Model.
 */
modelDeclaration
    :    'model' (Identifier | TypeWithParameters) Identifier '{' statement* '}'
    ;
parameterList
    :    '(' ((parameterDeclaration ',')* parameterDeclaration)? ')'
    ;
parameterDeclaration
    :    (Identifier | TypeWithParameters) Identifier
    ;

/**
 * Statement.
 */
statement
    :    localVariableDeclarationStatement
    |    variableAssignmentStatement
    |    exprCallMethod ';'
    |    '{' statement '}'
    |    'if' '(' expr ')' statement
         ('elif' '(' expr ')' statement)?
         ( 'else' statement )?
    |    returnStatement
    ;
returnStatement
    :    'return' expr ';'
    ;
localVariableDeclarationStatement
    :    (Identifier | TypeWithParameters) Identifier ';'
    |    (Identifier | TypeWithParameters) variableAssignmentStatement
    ;

variableAssignmentStatement
    :    Identifier ASSIGN expr ';'
    |    Identifier ADD_ASSIGN expr ';'
    |    Identifier SUB_ASSIGN expr ';'
    |    Identifier MUL_ASSIGN expr ';' 
    |    Identifier DIV_ASSIGN expr ';'
    |    Identifier MOD_ASSIGN expr ';' 
    ;

expr // Expression will always have a value
    :    exprBooleanOper | exprAddSub | exprMulDivMod | exprNot | exprAtom 
    ;

exprBooleanOper
    :    (exprAtom | exprNot | exprMulDivMod | exprAddSub) 
         ((LT | LTE | GT | GTE | EQ | NEQ | AND | OR) 
         (exprAtom | exprNot | exprMulDivMod | exprAddSub))+
    ;

exprAddSub
    :    (exprAtom | exprNot | exprMulDivMod) ((ADD | SUB) (exprAtom | exprNot | exprMulDivMod))+
    ;

exprMulDivMod
    :    (exprAtom | exprNot) ((MUL | DIV | MOD) (exprAtom | exprNot))+
    ;

exprNot
    :    NOT exprAtom
    ;

exprAtom
    :    Identifier | NULL | NAN | literal
    |    exprCallMethod 
    |    '(' expr ')'
    ;

exprCallMethod
    :    (Identifier '.')? Identifier '(' ((expr ',')* expr)?')'
    ;

/**
 * Tokens, include:
 * identifiers, types, literals, operators, separators and esc.
 */
Identifier // For Variable, Model or Function name
    :    [a-zA-Z] [a-zA-Z_0-9]*    // must start with letter
    ;
TypeWithParameters
    :    Identifier TypeParameters
    ;
TypeParameters  // doesn't support "extends", "super", template and array [] in type
    :    '<' (Identifier | TypeWithParameters) (',' (Identifier | TypeWithParameters))* '>'
    ;

/**
 * Literals, a much more simple version than Java literals.
 * For numeric literals, only support decimal.
 * Doesn't support scientific notation currently.
 */
literal
    : StringLiteral
    | BooleanLiteral
    | IntegerLiteral
    | LongLiteral
    | FloatLiteral
    | DoubleLiteral
    ;
StringLiteral //? support unicode should check
    :    '"' StringCharacters? '"'
    ;    
CharLiteral
    :    '\'' SingleCharacter '\''
    |    '\'' EscapeSequence '\''
    ;
BooleanLiteral
    :    TRUE | FALSE
    ;
IntegerLiteral
    :    NumericSign? (NonZeroDigits+ '0'*)* Digits
    ;
LongLiteral
    :    IntegerLiteral 'L'
    ;
FloatLiteral
    :    NumericSign? (NonZeroDigits+ '0'*)* Digits '.' Digits+ 'f'?
    ;
DoubleLiteral
    :    NumericSign? (NonZeroDigits+ '0'*)* Digits '.' Digits+ 'd'
    ;
fragment NumericSign
    :    [+-]
    ;
fragment Digits
    :    [0-9]
    ;
fragment NonZeroDigits
    :    [1-9]
    ;
fragment StringCharacters
    :    StringCharacter+
    ;
fragment StringCharacter
    :    ~["\\]
    ;
fragment SingleCharacter
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
WS            : [ \t\n\r\u000c]+    -> skip;
COMMENT       : '/*' .*? '*/'       -> skip;
LINE_COMMENT  : '//' ~[\r\n]*       -> skip;
/**
 * CR (Carriage Return): \r, used in Mac OS before X
 * LF (Line Feed): \n, used in Unix/Max OS X
 * CR + LF: \r\n, used in Windows
 */

