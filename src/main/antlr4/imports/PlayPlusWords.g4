lexer grammar PlayPlusWords;

// Words

AFFECT: 'affect';
LPAR: '(';
RPAR: ')';
COMMA: ',';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MOD: '%';
SEMICOLON: ';';
EQUALS: '=';
COLON: ':';
DO: 'do';
DONE: 'done';
LBRA: '[';
RBRA: ']';
AS: 'as';
LTHAN: '<';
MTHAN: '>';

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

//Type

BOOLEAN: 'Bool';
INTEGER: 'Int';
SQUARE: 'Case';
VOID: 'nil';