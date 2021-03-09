grammar PlayPlus;

import PlayPlusWords;


root: DECLARE AND RETAIN programmestrat | programmemonde;

//p20 à voir avec l'autre règle instruction
instruction: SKIPA
//           | IF exprD THEN instruction+ DONE  pour 2ème remise
//           | IF exprD THEN instruction+ ELSE instruction+ DONE   pour 2ème remise
//           | WHILE  exprD DO instruction+ DONE    pour 2ème remise
            | SET exprG TO exprD
            | COMPUTE exprD
            | NEXT action
            ;

// p24 importation d'un fichier d'initialisation

impDecl: IMPORT FILEDECL;



fileDecl: fileName.WLD
        ;


fileName: LETTER (DIGIT | LETTER )*;

// p25 description du

programmemonde :
(varDecl SEMICOLON | fctDecl)*
(instruction)*
clauseDefault;

programmestrat : impDecl?
(varDecl SEMICOLON | fctDecl)*
WHEN YOUR TURN
(clauseWhen)*
clauseDefault;

//p25 clause default
clauseDefault : BY DEFAULT // ou by default
    (DECLARE LOCAL(varDecl SEMICOLON)+)?
    DO (instruction)+ DONE;

clauseWhen : WHEN exprD
            (DECLARE LOCAL (varDecl SEMICOLON)+)?
            DO (instruction)+ DONE;

//page 13 déclaration de variables
varDecl : ID AS type;

//page 13 type, scalar, array
type : scalar | array
     ;

scalar : BOOLEAN | INTEGER | SQUARE
       ;

array : scalar LBRA (NUMBER)+ (COMMA(NUMBER)+)? RBRA
      ;

//page 22 déclaration de fonctions
fctDecl : ID AS FUNCTION LPAR (varDecl(COMMA varDecl)*)?RPAR COLON (scalar| VOID)
    (DECLARE LOCAL(varDecl SEMICOLON)+)?
    DO (instruction)+ RETURN (exprD| VOID) DONE;


//p19 expression gauche
exprG : ID
      | ID LBRA exprD(COMMA exprD)? RBRA
      ;

//page 14 expressions droites
exprD : exprEnt
      | exprD PLUS exprD
      | exprD MINUS exprD
      | exprD MULT exprD
      | exprD DIV exprD
      | exprD MOD exprD
      | exprBool
      | exprD AND exprD
      | exprD OR exprD
      | NOT exprD
      | exprD LTHAN exprD
      | exprD MTHAN exprD
      | exprD EQUALS exprD
      | exprCase
      | exprG
      | ID LPAR (exprD(COMMA exprD)*)?RPAR
      | LPAR exprD RPAR
      ;


//page 15 expressions entières
exprEnt : NUMBER
        | LATITUDE | LONGITUDE | GRID SIZE
        | (MAP|RADIO|AMMO|FRUITS|SODA) COUNT
        | LIFE
        ;

//p17 expressions booléennes
exprBool : TRUE | FALSE
         | ENNEMI IS (NORTH | SOUTH | EAST| WEST)
         | GRAAL IS (NORTH | SOUTH| EAST| WEST)
         ;

//p18 expressions types cases
exprCase : DIRT | ROCK | VINES | ZOMBIE | PLAYER | ENNEMI | MAP | RADIO | AMMO | FRUITS | SODA
           | GRAAL | NEARBY LBRA exprD COMMA exprD RBRA
           ;

//p20 action
action : MOVE ( NORTH | SOUTH | EAST | WEST)
       | SHOOT ( NORTH | SOUTH | EAST | WEST)
       | USE ( MAP | RADIO | FRUITS | SODA )
       | DO NOTHING
       ;

//p28 commentaires
comment: COMMENT;