lexer grammar PlayPlusWords;

// Words

AFFECT: 'affect';
LPAR: '(';
RPAR: ')';
COMMA: ',';
PLUS: '+';
MINUS: '-';
MOD: '%';
MULT:'*';
DIV:'/';
SEMICOLON: ';';
EQUALS:'=';
COLON: ':';
LTHAN:'<';
MTHAN:'>';
LBRA:'[';
RBRA: ']';
WLD: '.wld';

// Identifiers

ID: LETTER (LETTER | DIGIT)* ;

NUMBER: (DIGIT)+;

fragment LETTER: 'A'..'Z' | 'a'..'z' ;
fragment DIGIT: '0'..'9' ;

// Comments -> ignored

COMMENT: '/*' .*? '*/' -> skip;

// Whitespaces -> ignored

NEWLINE: '\r'? '\n'  -> skip ;
WS: [ \t]+ -> skip ;


DECLARE:'declare';
AND : 'and';
RETAIN : 'retain';
BY: 'by';
DEFAULT:'default';
LOCAL: 'local';
DO:'do';
DONE:'done';
AS:'as';

// à verifier
BOOLEAN: 'Bool';
INTEGER:'Int';
SQUARE:'Case';
VOID: 'nil';




