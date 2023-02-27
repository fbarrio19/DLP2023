lexer grammar Lexicon
	;

INT_CONSTANT
	: '-'? [0-9]+
	;
	
REAL_CONSTANT
	: [0-9]+ '.' [0-9]+
	;
	
CHAR_CONSTANT
	: '\'' ~[\t\r\n]  '\'' 
	| '\'\\n\''
	;
	
IDENT
	:[a-zA-Z][a-zA-Z_0-9]*
	;

LINE_COMMENT
	: '/*' .*? ('\n' | EOF) -> skip
	;

MULTILINE_COMMENT
	: '//*' .*? '*//' -> skip
	;

WHITESPACE
	: [ \t\r\n]+ -> skip
	;
