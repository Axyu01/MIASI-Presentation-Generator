// DELETE THIS CONTENT IF YOU PUT COMBINED GRAMMAR IN Parser TAB
lexer grammar PresentationLexer;
SLIDE: 'SLIDE';
TEXT : 'TEXT';
IMAGE : 'IMAGE';
COLON : ':' ;
NEW_LINE : '\n' ;
COMMENT: '//' [a-zA-Z_0-9 ]* '\n' -> skip;

INT : [0-9]+ ;
ID: [a-zA-Z_][a-zA-Z_0-9]* ;
VECTOR2: '('INT ',' INT')' ;
TEXT_BLOCK:'{\n'[a-zA-Z_0-9 \n]*'}' ;
WS: [ \t\r\f]+ -> skip ;

COKOLWIEK:.;