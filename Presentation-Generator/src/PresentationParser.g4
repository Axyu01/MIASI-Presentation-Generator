parser grammar PresentationParser;
options { tokenVocab=PresentationLexer; }

program : (slide)+ EOF ;

slide : SLIDE (NEW_LINE)+ (func)* #someSlide
    | SLIDE #lastSlide
    ;

func: TEXT (NEW_LINE)+ (parameter)* #textFunction
    | IMAGE (NEW_LINE)+ (parameter)* #imageFunction
    | (TEXT|IMAGE) #lastFunction
    ;

parameter : ID COLON (NEW_LINE)* expr (NEW_LINE)+ #someParameter
    | ID COLON (NEW_LINE)* expr #lastParameter
    ;

vector2 : L_PAR x=INT COMMA y=INT R_PAR ;
expr: INT
    | vector2
    | TEXT_BLOCK
    | PATH
    ;
