parser grammar PresentationParser;
options { tokenVocab=PresentationLexer; }

program : (slides+=slide)+ EOF ;

slide : SLIDE (NEW_LINE)+ (functions+=func)* #someSlide
    | SLIDE #lastSlide
    ;

func: TEXT (NEW_LINE)+ (params+=parameter)* #textFunction
    | IMAGE (NEW_LINE)+ (params+=parameter)* #imageFunction
    | (TEXT|IMAGE) #lastFunction
    ;

parameter : ID COLON (NEW_LINE)* expr (NEW_LINE)+ #someParameter
    | ID COLON (NEW_LINE)* expr #lastParameter
    ;

vector2 : L_PAR x=INT COMMA y=INT R_PAR ;
expr: INT
    | DOUBLE
    | vector2
    | TEXT_BLOCK
    | PATH
    ;
