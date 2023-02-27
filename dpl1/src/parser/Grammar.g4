grammar Grammar
	;
import Lexicon
	;

start: 'class' IDENT ';' ('global' definitions)? 'create' IDENT+ ';'
		features 'end' 'main' (IDENT '(' ')' ';')+ 'end' ;

definitions: definition*
		   ;
		   
definition: 'types' defTuple+ 'end'
		  | 'vars' (expr ':' type ';')+
		  ;
		  
defTuple: 'deftuple' IDENT 'as' (IDENT ':' type)?
		;
		
		
features: 'feature' IDENT '(' functionParm* ')' returnType? 'is' localDefs  'do' sentence+ 'end'
		;

functionParm:  IDENT ':' type ','? 
			//MIRAR LO DEL SEMINARIO 3 PAR VER CÓMO HACÍA LOS DE LOS ARGS
			 ;

returnType: ':' type
		  ;
		  
localDefs: 'local' localDef+
		;

localDef: IDENT ':' type ';'
		;
		
sentence: 'print' expr? ';'
		| 'println' expr? ';'
		| 'read' expr ';'
		| 
		| expr ':=' expr ';'
		;

expr: INT_CONSTANT
	| REAL_CONSTANT
	| CHAR_CONSTANT 
	| IDENT
	| expr ',' expr 
	| expr ';'
	| expr '=' expr
	| expr '+' expr
	;

type: 'INTEGER'
	| 'DOUBLE'
    | 'CHARACTER' 
    | IDENT
	;