grammar PlayPlus;

import PlayPlusWords;

root: instruction+;

instruction: AFFECT LPAR ID COMMA expression RPAR   #affectInstr
           ;

expression: NUMBER                                  #constantExpr
          | ID                                      #variableExpr
          | left=expression op=(PLUS|MINUS) right=expression   #plusMinusExpr
          ;

//p20 à voir avec l'autre règle instruction
instruction: SKIP
           | IF exprD THEN instuction+ DONE
           | IF exprD THEN instruction+ ELSE instruction+ DONE
           | WHILE  exprD DO instruction+ DONE
           | SET exprG TO exprD
           | Compute exprD
           | NEXT action
           ;


// p24 importation d'un fichier d'initialisation
impDecl: '#' IMPORT fileDecl;

fileDecl: fileName WLD;

fileName: LETTER (DIGIT |LETTER )*;

// p25 description du programme
programme : DECLARE AND RETAIN
(varDecl SEMICOLON | fctDecl)*
(instruction)*
clauseDefault;

//p25 clause default
clauseDefault : BY DEFAULT // ou by default
    (DECLARE LOCAL(varDecl SEMICOLON)+)?
    DO (instruction)+ DONE;

//page 13 déclaration de variables
varDecl : ID AS type;

//page 13 type, scalar, array
type : scalar | array
     ;
scalar : BOOLEAN | INTEGER | SQUARE
       ;
array : scalar RBRA (DIGIT)+ (COMMA(DIGIT)+)? LPAR
      ;

//page 22 déclaration de fonctions
fctDecl : ID AS FUNCTION LPAR (varDecl(COMMA varDecl)*)?RPAR COLON (scalar| VOID)
    (DECLARE LOCAL(varDecl SEMICOLON)+)?
    DO (instruction)+ RETURN (exprD| VOID) DONE;

//page 14 expressions droites
exprD : exprEnt
      | exprBool
      | exprCase
      | exprG
      | ID LPAR (exprD(COMMA exprD)*)?RPAR
      | LPAR exprD RPAR
      ;

//page 15 expressions entières
exprEnt : INTEGER
        | LATITUDE | LOGITUDE | GRID SIZE
        |(MAP|RADIO|AMMO|FRUITS|SODA) COUNT
        | LIFE
        |exprD PLUS exprD
        |exprD MINUS exprD
        |exprD MULT exprD
        |exprD DIV exprD
        |exprD MOD exprD
        ;

//p17 expressions booléennes
exprBool : TRUE | FALSE
        | ENNEMI IS (NORTH | SOUTH | EAST| WEST)
        | GRAAL IS (NORTH | SOUTH| EAST| WEST)
        | exprD AND exprD
        | exprD OR exprD
        | NOT exprD
        | exprD LTHAN exprD
        | exprD MTHAN exprD
        | exprD EQUALS exprD
        ;
//p18 expressions types cases
exprCase : DIRT | ROCK | VINES | ZOMBIE | PLAYER | ENNEMI | MAP | RADIO | AMMO | FRUITS | SODA
           | GRAAL | NEARBY LBRA exprD COMMA exprD RBRA
           ;


