grammar Calculator;

statement
    :   expression EOF
    ;

expression
    :   imply_expression
    |   expression op=IFF expression
    ;

imply_expression
    :   or_expression
    |   imply_expression op=IF imply_expression
    ;

or_expression
    :   and_expression
    |   or_expression op=OR or_expression
    ;

and_expression
    :   xor_expression
    |   and_expression op=AND and_expression
    |   and_expression and_expression
    ;

xor_expression
    :   not_expression
    |   xor_expression op=XOR xor_expression
    ;

not_expression
    :   operand
    |   op=NOT_OPERATOR not_expression
    ;

operand
    :   variable
    |   constant
    |   LPAREN expression RPAREN
    ;

variable
    :   ID
    ;

constant
    :   true_expression
    |   false_expression
    ;

true_expression
    :   TRUE
    ;

false_expression
    :   FALSE
    ;

LPAREN
    :   '('
    ;

RPAREN
    :   ')'
    ;

ID
    :   [a-eg-su-zA-EG-SU-Z]
    ;

TRUE
    :   [Tt][Rr][Uu][Ee]
    |   [Tt]
    |   '1'
    ;

FALSE
    :   [Ff][Aa][Ll][Ss][Ee]
    |   [Ff]
    |   '0'
    ;

OR
    :   '+'
    |   '|' '|'?
    |   [Oo][Rr]
    |   '∨'
    ;

AND
    :   '*'
    |   '&' '&'?
    |   [Aa][Nn][Dd]
    |   '∧'
    ;

XOR
    :   [Xx][Oo][Rr]
    |   '^'
    ;

IF
    :   '-'? '>'
    |   [Ii][Ff]
    |   [Ii][Mm][Pp][Ll]([Yy]|[Ii][Ee][Ss])
    |   '→'
    ;

IFF
    :   '<' '-'? '>'
    |   [Ii][Ff][Ff]
    |   '⭤'
    ;

WHITESPACE
    :   [ \t] -> skip
    ;

NOT_OPERATOR
    :   '!'
    |   '~'
    |   '¬'
    |   [Nn][Oo][Tt]
    ;