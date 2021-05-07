grammar Task3;

// 1) Rules to specify the tokens of the language.

// TODO: insert rules here
    SELECT_ : 'SELECT'|'select';
	DELETE_ : 'DELETE'|'delete';
	UPDATE_ : 'UPDATE'|'update';
	WHERE_ : 'WHERE'|'where';
	FROM_ : 'FROM'|'from';
	SCOL : ';';
	COMMA : ',';
	STAR : '*';
	IDENTIFIER : LETTER+LETTER*;
	LETTER : [a-zA-Z];
	NUMBER : DIGIT+;
	DIGIT : [0-9];


// DON'T MODIFY BELOW THIS LINE

// 2) Rules that specify the grammar of the language.
// 
// We don't define a "real" SQL-like language for this exercise, but a trivial language that accepts
// any sequence of the legal tokens.

start:
	SELECT_
	| DELETE_
	| UPDATE_
	| WHERE_
	| FROM_
	| SCOL
	| COMMA
	| STAR
	| IDENTIFIER
	| NUMBER;

WS: [ \t\r\n]+ -> skip;
