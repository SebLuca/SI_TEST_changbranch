grammar PlayPlus;

import PlayPlusWords;


root: DECLARE AND RETAIN (programmestrat | programmemonde);

//p20 à voir avec l'autre règle instruction
instruction: SKIPA                                               #skipInst
            | IF exprD THEN instruction+ DONE                    #ifInst
            | IF exprD THEN instruction+ ELSE instruction+ DONE  #ifElseInst
            | WHILE exprD DO instruction+ DONE                   #whileInst
            | SET exprG TO exprD                                 #affectInstr
            | COMPUTE exprD                                      #computeInst
            | NEXT action                                        #actionInst
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

array : scalar LBRA (NUMBER) (COMMA(NUMBER))? RBRA
      ;

//page 22 déclaration de fonctions
fctDecl : ID AS FUNCTION LPAR (varDecl(COMMA varDecl)*)?RPAR COLON (scalar| VOID)
    (DECLARE LOCAL(varDecl SEMICOLON)+)?
    DO (instruction)+ RETURN (exprD| VOID) DONE;


//p19 expression gauche
exprG : ID                               #exprIdG
      | ID LBRA exprD(COMMA exprD)? RBRA #exprArrayG
      ;

//page 14 expressions droites
exprD : exprEnt                #exprEntD
      | exprD PLUS exprD       #exprPlusD
      | exprD MINUS exprD      #exprMinusD
      | exprD MULT exprD       #exprMultD
      | exprD DIV exprD        #exprDivD
      | exprD MOD exprD        #exprModD
      | exprBool               #expBoolD
      | exprD AND exprD        #exprAndD
      | exprD OR exprD         #exprOrD
      | NOT exprD              #exprNotD
      | exprD LTHAN exprD      #exprLthanD
      | exprD MTHAN exprD      #exprMthanD
      | exprD EQUALS exprD     #exprEqualsD
      | exprCase               #exprCaseD
      | exprG                  #exprGaucheD
      | ID LPAR (exprD(COMMA exprD)*)?RPAR  #exprAppelFonctionD
      | LPAR exprD RPAR        #exprDroiteD
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
action : MOVE ( NORTH | SOUTH | EAST | WEST)  #actionMove
       | SHOOT ( NORTH | SOUTH | EAST | WEST) #actionShoot
       | USE ( MAP | RADIO | FRUITS | SODA )  #actionUse
       | DO NOTHING                           #actionDoNothing
       ;

//p28 commentaires
comment: COMMENT;