grammar PlayPlus;

import PlayPlusWords;

root: instruction+;

instruction: AFFECT LPAR ID COMMA expression RPAR   #affectInstr
           ;


expression: NUMBER                                  #constantExpr
          | ID                                      #variableExpr
          | left=expression op= (PLUS|MINUS) right=expression   #plusMinusExpr
          ;
scalar: BOOLEAN | INTEGER | SQUARE
      ;

array: scalar LBRA (DIGIT)+ (COMMA(DIGIT)+)? RBRA
     ;

type: scalar | array
    ;

vardecl: ID AS type
       ;
exprent: INTEGER
       | LATITUDE | LONGITUDE | GRID SIZE //TODO define LATITUDE LONGITUDE GRID SIZE
       | (MAP | RADIO | AMMO | FRUITS | SODA) COUNT //TODO define MAP RADIO AMMO FRUITS SODA
       | LIFE //TODO define LIFE
       | exprd PLUS exprd
       | exprd MINUS exprd
       | exprd MULT exprd
       | exprd DIV exprd
       | exprd MOD exprd
       ;

exprbool: TRUE | FALSE //TODO define TRUE FALSE
        | ENNEMI IS ( NORTH | SOUTH | EAST | WEST) //TODO define ENNEMI IS NORTH SOUTH EAST WEST
        | GRAAL IS ( NORTH | SOUTH | EAST | WEST) //TODO define GRAAL
        | exprd AND exprd //TODO define AND
        | exprd OR exprd //TODO define OR
        | NOT exprd //TODO define NOT
        | exprd LTHAN exprd
        | exprd MTHAN exprd
        | exprd EQUALS exprd
        ;

exprcase: DIRT | ROCK | VINES | ZOMBIE | PLAYER | ENNEMI | MAP | RADIO | AMMO | FRUITS | SODA | GRAAL | NEARBY LBRA exprd COMMA exprd RBRA //TODO define DIRT ROCK VINES ZOMBIE PLAYER NEARBY
        ;


exprd: exprent
     | exprbool
     | ExprCase
     | ExprG
     | ID( (exprd (COMMA exprd)*)? )
     | (exprd)
     ;

fctdecl: ID AS function ( (vardecl (COMMA vardecl)*)? )COLON ( scalar | VOID) //TODO declare function
       |(declare local (vardecl SEMICOLON)+) ? //TODO define declare local
       |DO (instruction)+ RETURN (exprd | VOID) DONE //TODO void
       ;

programme: declare and retain //TODO define declare and retain
         | LPAR vardecl SEMICOLON | fctdecl RPAR *
         | LPAR instruction RPAR *
         | clausedefault
         ;


clausedefault: by default //TODO define by default
             |LPAR declare local LPAR vardecl SEMICOLON RPAR + RPAR ?
             |DO LPAR instruction RPAR + DONE
             ;



