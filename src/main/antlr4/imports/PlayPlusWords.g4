lexer grammar PlayPlusWords;

// Comments -> ignored

COMMENT : '/*' (.*) '*/' -> skip;
SKIPA : 'skip';
// Words

ARENA:'arena';
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
COMPUTE: 'compute';
IF:'if';
THEN:'then';
ELSE:'else';
WHILE:'while';
SET:'set';
TO:'to';
NEXT:'next';
IMPORT:'import';
FUNCTION:'function';
RETURN:'return';
LATITUDE:'latitude';
LONGITUDE:'longitude';
GRID:'grid';
SIZE:'size';
MAP:'map';
RADIO:'radio';
AMMO:'ammo';
FRUITS:'fruits';
SODA:'soda';
COUNT:'count';
LIFE:'life';
TRUE:'true';
FALSE:'false';
ENNEMI:'ennemi';
IS:'is';
NORTH:'north';
SOUTH:'south';
EAST:'east';
WEST:'west';
GRAAL:'graal';
OR:'or';
NOT:'not';
DIRT:'dirt';
ROCK:'rock';
VINES:'vines';
ZOMBIE:'zombie';
PLAYER:'player';
NEARBY:'nearby';
MOVE:'move';
SHOOT:'shoot';
USE:'use';
NOTHING:'nothing';
AS:'as';
DECLARE:'declare';
AND : 'and';
RETAIN : 'retain';
BY: 'by';
DEFAULT:'default';
LOCAL: 'local';
DO:'do';
DONE:'done';

BOOLEAN: 'boolean';
INTEGER:'integer';
SQUARE:'square';


VOID: 'void';



// Identifiers

FILEDECL: FILENAME WLD;
ID: LETTER (LETTER | DIGIT)* ;
FILENAME: LETTER (DIGIT | LETTER)*;
NUMBER: (DIGIT)+;

fragment LETTER: 'A'..'Z' | 'a'..'z' ;
fragment DIGIT: '0'..'9' ;



// Whitespaces -> ignored

NEWLINE: '\r'? '\n'  -> skip ;
WS: [ \t]+ -> skip ;







