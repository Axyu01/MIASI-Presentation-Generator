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

expr: INT
    | VECTOR2
    | TEXT_BLOCK
    | PATH
    ;
