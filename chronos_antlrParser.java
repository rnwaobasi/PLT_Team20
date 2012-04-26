// $ANTLR 3.4 chronos_antlr.g 2012-04-25 23:18:14

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class chronos_antlrParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "BREAK_T", "CHAR", "COMMENT", "COURSELIST_T", "COURSE_T", "DAY_T", "DOUBLE_T", "ELSE_T", "EQ", "ESC_SEQ", "EXPONENT", "FLOAT", "FOREACH_T", "GEQ", "HEX_DIGIT", "ID", "IF_T", "INT", "INT_T", "IN_T", "LEQ", "NEQ", "NEW_T", "NOT", "OCTAL_ESC", "OR", "SCHEDULE_T", "STRING", "STRING_T", "TIME_T", "UNICODE_ESC", "WHITESPACE", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "';'", "'<'", "'='", "'>'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int AND=4;
    public static final int BREAK_T=5;
    public static final int CHAR=6;
    public static final int COMMENT=7;
    public static final int COURSELIST_T=8;
    public static final int COURSE_T=9;
    public static final int DAY_T=10;
    public static final int DOUBLE_T=11;
    public static final int ELSE_T=12;
    public static final int EQ=13;
    public static final int ESC_SEQ=14;
    public static final int EXPONENT=15;
    public static final int FLOAT=16;
    public static final int FOREACH_T=17;
    public static final int GEQ=18;
    public static final int HEX_DIGIT=19;
    public static final int ID=20;
    public static final int IF_T=21;
    public static final int INT=22;
    public static final int INT_T=23;
    public static final int IN_T=24;
    public static final int LEQ=25;
    public static final int NEQ=26;
    public static final int NEW_T=27;
    public static final int NOT=28;
    public static final int OCTAL_ESC=29;
    public static final int OR=30;
    public static final int SCHEDULE_T=31;
    public static final int STRING=32;
    public static final int STRING_T=33;
    public static final int TIME_T=34;
    public static final int UNICODE_ESC=35;
    public static final int WHITESPACE=36;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public chronos_antlrParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public chronos_antlrParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return chronos_antlrParser.tokenNames; }
    public String getGrammarFileName() { return "chronos_antlr.g"; }



    // $ANTLR start "translation_unit"
    // chronos_antlr.g:8:1: translation_unit : ( declarator ';' )* ( stmt )* ;
    public final void translation_unit() throws RecognitionException {
        try {
            // chronos_antlr.g:9:2: ( ( declarator ';' )* ( stmt )* )
            // chronos_antlr.g:9:4: ( declarator ';' )* ( stmt )*
            {
            // chronos_antlr.g:9:4: ( declarator ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DOUBLE_T||LA1_0==INT_T||LA1_0==NEW_T||LA1_0==STRING_T) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // chronos_antlr.g:9:5: declarator ';'
            	    {
            	    pushFollow(FOLLOW_declarator_in_translation_unit14);
            	    declarator();

            	    state._fsp--;


            	    match(input,45,FOLLOW_45_in_translation_unit15); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // chronos_antlr.g:9:21: ( stmt )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==BREAK_T||(LA2_0 >= FLOAT && LA2_0 <= FOREACH_T)||(LA2_0 >= ID && LA2_0 <= INT)||LA2_0==NOT||LA2_0==STRING||LA2_0==37||LA2_0==45) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // chronos_antlr.g:9:22: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_translation_unit20);
            	    stmt();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "translation_unit"



    // $ANTLR start "declarator"
    // chronos_antlr.g:11:1: declarator : ( primitive_declarator | derived_type_declarator );
    public final void declarator() throws RecognitionException {
        try {
            // chronos_antlr.g:12:2: ( primitive_declarator | derived_type_declarator )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==DOUBLE_T||LA3_0==INT_T||LA3_0==STRING_T) ) {
                alt3=1;
            }
            else if ( (LA3_0==NEW_T) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // chronos_antlr.g:12:4: primitive_declarator
                    {
                    pushFollow(FOLLOW_primitive_declarator_in_declarator32);
                    primitive_declarator();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // chronos_antlr.g:13:4: derived_type_declarator
                    {
                    pushFollow(FOLLOW_derived_type_declarator_in_declarator37);
                    derived_type_declarator();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "declarator"



    // $ANTLR start "primitive_declarator"
    // chronos_antlr.g:15:1: primitive_declarator : ( type_specifier ID | type_specifier ID '=' assignment_expr );
    public final void primitive_declarator() throws RecognitionException {
        try {
            // chronos_antlr.g:16:2: ( type_specifier ID | type_specifier ID '=' assignment_expr )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==DOUBLE_T||LA4_0==INT_T||LA4_0==STRING_T) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==ID) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==47) ) {
                        alt4=2;
                    }
                    else if ( (LA4_2==45) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // chronos_antlr.g:16:4: type_specifier ID
                    {
                    pushFollow(FOLLOW_type_specifier_in_primitive_declarator47);
                    type_specifier();

                    state._fsp--;


                    match(input,ID,FOLLOW_ID_in_primitive_declarator49); 

                    }
                    break;
                case 2 :
                    // chronos_antlr.g:17:4: type_specifier ID '=' assignment_expr
                    {
                    pushFollow(FOLLOW_type_specifier_in_primitive_declarator54);
                    type_specifier();

                    state._fsp--;


                    match(input,ID,FOLLOW_ID_in_primitive_declarator56); 

                    match(input,47,FOLLOW_47_in_primitive_declarator58); 

                    pushFollow(FOLLOW_assignment_expr_in_primitive_declarator60);
                    assignment_expr();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "primitive_declarator"



    // $ANTLR start "derived_type_declarator"
    // chronos_antlr.g:19:1: derived_type_declarator : ( NEW_T derived_type_specifier ID | NEW_T derived_type_specifier ID '=' assignment_expr );
    public final void derived_type_declarator() throws RecognitionException {
        try {
            // chronos_antlr.g:20:2: ( NEW_T derived_type_specifier ID | NEW_T derived_type_specifier ID '=' assignment_expr )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==NEW_T) ) {
                int LA5_1 = input.LA(2);

                if ( ((LA5_1 >= COURSELIST_T && LA5_1 <= COURSE_T)||LA5_1==SCHEDULE_T) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==ID) ) {
                        int LA5_3 = input.LA(4);

                        if ( (LA5_3==47) ) {
                            alt5=2;
                        }
                        else if ( (LA5_3==45) ) {
                            alt5=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // chronos_antlr.g:20:4: NEW_T derived_type_specifier ID
                    {
                    match(input,NEW_T,FOLLOW_NEW_T_in_derived_type_declarator70); 

                    pushFollow(FOLLOW_derived_type_specifier_in_derived_type_declarator72);
                    derived_type_specifier();

                    state._fsp--;


                    match(input,ID,FOLLOW_ID_in_derived_type_declarator74); 

                    }
                    break;
                case 2 :
                    // chronos_antlr.g:21:4: NEW_T derived_type_specifier ID '=' assignment_expr
                    {
                    match(input,NEW_T,FOLLOW_NEW_T_in_derived_type_declarator79); 

                    pushFollow(FOLLOW_derived_type_specifier_in_derived_type_declarator81);
                    derived_type_specifier();

                    state._fsp--;


                    match(input,ID,FOLLOW_ID_in_derived_type_declarator83); 

                    match(input,47,FOLLOW_47_in_derived_type_declarator85); 

                    pushFollow(FOLLOW_assignment_expr_in_derived_type_declarator87);
                    assignment_expr();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "derived_type_declarator"



    // $ANTLR start "stmt"
    // chronos_antlr.g:23:1: stmt : ( assignment_expr ';' | selection_stmt | iteration_stmt | jump_stmt ';' | ';' );
    public final void stmt() throws RecognitionException {
        try {
            // chronos_antlr.g:23:5: ( assignment_expr ';' | selection_stmt | iteration_stmt | jump_stmt ';' | ';' )
            int alt6=5;
            switch ( input.LA(1) ) {
            case FLOAT:
            case ID:
            case INT:
            case NOT:
            case STRING:
            case 37:
                {
                alt6=1;
                }
                break;
            case IF_T:
                {
                alt6=2;
                }
                break;
            case FOREACH_T:
                {
                alt6=3;
                }
                break;
            case BREAK_T:
                {
                alt6=4;
                }
                break;
            case 45:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // chronos_antlr.g:23:7: assignment_expr ';'
                    {
                    pushFollow(FOLLOW_assignment_expr_in_stmt95);
                    assignment_expr();

                    state._fsp--;


                    match(input,45,FOLLOW_45_in_stmt96); 

                    }
                    break;
                case 2 :
                    // chronos_antlr.g:24:4: selection_stmt
                    {
                    pushFollow(FOLLOW_selection_stmt_in_stmt101);
                    selection_stmt();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // chronos_antlr.g:25:4: iteration_stmt
                    {
                    pushFollow(FOLLOW_iteration_stmt_in_stmt106);
                    iteration_stmt();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // chronos_antlr.g:26:4: jump_stmt ';'
                    {
                    pushFollow(FOLLOW_jump_stmt_in_stmt111);
                    jump_stmt();

                    state._fsp--;


                    match(input,45,FOLLOW_45_in_stmt112); 

                    }
                    break;
                case 5 :
                    // chronos_antlr.g:27:4: ';'
                    {
                    match(input,45,FOLLOW_45_in_stmt117); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "stmt"



    // $ANTLR start "selection_stmt"
    // chronos_antlr.g:29:1: selection_stmt : IF_T assignment_expr '{' stmt '}' ( ELSE_T '{' stmt '}' )? ;
    public final void selection_stmt() throws RecognitionException {
        try {
            // chronos_antlr.g:30:2: ( IF_T assignment_expr '{' stmt '}' ( ELSE_T '{' stmt '}' )? )
            // chronos_antlr.g:30:4: IF_T assignment_expr '{' stmt '}' ( ELSE_T '{' stmt '}' )?
            {
            match(input,IF_T,FOLLOW_IF_T_in_selection_stmt127); 

            pushFollow(FOLLOW_assignment_expr_in_selection_stmt129);
            assignment_expr();

            state._fsp--;


            match(input,49,FOLLOW_49_in_selection_stmt131); 

            pushFollow(FOLLOW_stmt_in_selection_stmt132);
            stmt();

            state._fsp--;


            match(input,50,FOLLOW_50_in_selection_stmt133); 

            // chronos_antlr.g:30:36: ( ELSE_T '{' stmt '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ELSE_T) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // chronos_antlr.g:30:37: ELSE_T '{' stmt '}'
                    {
                    match(input,ELSE_T,FOLLOW_ELSE_T_in_selection_stmt136); 

                    match(input,49,FOLLOW_49_in_selection_stmt138); 

                    pushFollow(FOLLOW_stmt_in_selection_stmt139);
                    stmt();

                    state._fsp--;


                    match(input,50,FOLLOW_50_in_selection_stmt140); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "selection_stmt"



    // $ANTLR start "iteration_stmt"
    // chronos_antlr.g:32:1: iteration_stmt : FOREACH_T COURSE_T ID IN_T ID '{' ( stmt )* '}' ;
    public final void iteration_stmt() throws RecognitionException {
        try {
            // chronos_antlr.g:33:2: ( FOREACH_T COURSE_T ID IN_T ID '{' ( stmt )* '}' )
            // chronos_antlr.g:33:4: FOREACH_T COURSE_T ID IN_T ID '{' ( stmt )* '}'
            {
            match(input,FOREACH_T,FOLLOW_FOREACH_T_in_iteration_stmt152); 

            match(input,COURSE_T,FOLLOW_COURSE_T_in_iteration_stmt154); 

            match(input,ID,FOLLOW_ID_in_iteration_stmt156); 

            match(input,IN_T,FOLLOW_IN_T_in_iteration_stmt158); 

            match(input,ID,FOLLOW_ID_in_iteration_stmt160); 

            match(input,49,FOLLOW_49_in_iteration_stmt162); 

            // chronos_antlr.g:33:37: ( stmt )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==BREAK_T||(LA8_0 >= FLOAT && LA8_0 <= FOREACH_T)||(LA8_0 >= ID && LA8_0 <= INT)||LA8_0==NOT||LA8_0==STRING||LA8_0==37||LA8_0==45) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // chronos_antlr.g:33:38: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_iteration_stmt164);
            	    stmt();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            match(input,50,FOLLOW_50_in_iteration_stmt167); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "iteration_stmt"



    // $ANTLR start "jump_stmt"
    // chronos_antlr.g:35:1: jump_stmt : BREAK_T ;
    public final void jump_stmt() throws RecognitionException {
        try {
            // chronos_antlr.g:36:2: ( BREAK_T )
            // chronos_antlr.g:36:4: BREAK_T
            {
            match(input,BREAK_T,FOLLOW_BREAK_T_in_jump_stmt177); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "jump_stmt"



    // $ANTLR start "assignment_expr"
    // chronos_antlr.g:38:1: assignment_expr : cond_term ( OR cond_term )* ;
    public final void assignment_expr() throws RecognitionException {
        try {
            // chronos_antlr.g:39:2: ( cond_term ( OR cond_term )* )
            // chronos_antlr.g:39:4: cond_term ( OR cond_term )*
            {
            pushFollow(FOLLOW_cond_term_in_assignment_expr187);
            cond_term();

            state._fsp--;


            // chronos_antlr.g:39:14: ( OR cond_term )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==OR) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // chronos_antlr.g:39:15: OR cond_term
            	    {
            	    match(input,OR,FOLLOW_OR_in_assignment_expr190); 

            	    pushFollow(FOLLOW_cond_term_in_assignment_expr192);
            	    cond_term();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "assignment_expr"



    // $ANTLR start "cond_term"
    // chronos_antlr.g:41:1: cond_term : equiv_expr ( AND equiv_expr )* ;
    public final void cond_term() throws RecognitionException {
        try {
            // chronos_antlr.g:42:2: ( equiv_expr ( AND equiv_expr )* )
            // chronos_antlr.g:42:4: equiv_expr ( AND equiv_expr )*
            {
            pushFollow(FOLLOW_equiv_expr_in_cond_term204);
            equiv_expr();

            state._fsp--;


            // chronos_antlr.g:42:15: ( AND equiv_expr )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==AND) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // chronos_antlr.g:42:16: AND equiv_expr
            	    {
            	    match(input,AND,FOLLOW_AND_in_cond_term207); 

            	    pushFollow(FOLLOW_equiv_expr_in_cond_term209);
            	    equiv_expr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "cond_term"



    // $ANTLR start "equiv_expr"
    // chronos_antlr.g:44:1: equiv_expr : rel_expr ( ( EQ | NEQ ) rel_expr )* ;
    public final void equiv_expr() throws RecognitionException {
        try {
            // chronos_antlr.g:45:2: ( rel_expr ( ( EQ | NEQ ) rel_expr )* )
            // chronos_antlr.g:45:4: rel_expr ( ( EQ | NEQ ) rel_expr )*
            {
            pushFollow(FOLLOW_rel_expr_in_equiv_expr221);
            rel_expr();

            state._fsp--;


            // chronos_antlr.g:45:13: ( ( EQ | NEQ ) rel_expr )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==EQ||LA11_0==NEQ) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // chronos_antlr.g:45:15: ( EQ | NEQ ) rel_expr
            	    {
            	    if ( input.LA(1)==EQ||input.LA(1)==NEQ ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_rel_expr_in_equiv_expr233);
            	    rel_expr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "equiv_expr"



    // $ANTLR start "rel_expr"
    // chronos_antlr.g:47:1: rel_expr : math_expr ( ( '<' | '>' | GEQ | LEQ ) math_expr )* ;
    public final void rel_expr() throws RecognitionException {
        try {
            // chronos_antlr.g:48:2: ( math_expr ( ( '<' | '>' | GEQ | LEQ ) math_expr )* )
            // chronos_antlr.g:48:4: math_expr ( ( '<' | '>' | GEQ | LEQ ) math_expr )*
            {
            pushFollow(FOLLOW_math_expr_in_rel_expr246);
            math_expr();

            state._fsp--;


            // chronos_antlr.g:48:14: ( ( '<' | '>' | GEQ | LEQ ) math_expr )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==GEQ||LA12_0==LEQ||LA12_0==46||LA12_0==48) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // chronos_antlr.g:48:16: ( '<' | '>' | GEQ | LEQ ) math_expr
            	    {
            	    if ( input.LA(1)==GEQ||input.LA(1)==LEQ||input.LA(1)==46||input.LA(1)==48 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_math_expr_in_rel_expr266);
            	    math_expr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "rel_expr"



    // $ANTLR start "math_expr"
    // chronos_antlr.g:50:1: math_expr : math_term ( ( '+' | '-' ) math_term )* ;
    public final void math_expr() throws RecognitionException {
        try {
            // chronos_antlr.g:51:2: ( math_term ( ( '+' | '-' ) math_term )* )
            // chronos_antlr.g:51:4: math_term ( ( '+' | '-' ) math_term )*
            {
            pushFollow(FOLLOW_math_term_in_math_expr279);
            math_term();

            state._fsp--;


            // chronos_antlr.g:51:14: ( ( '+' | '-' ) math_term )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==40||LA13_0==42) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // chronos_antlr.g:51:16: ( '+' | '-' ) math_term
            	    {
            	    if ( input.LA(1)==40||input.LA(1)==42 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_math_term_in_math_expr291);
            	    math_term();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "math_expr"



    // $ANTLR start "math_term"
    // chronos_antlr.g:53:1: math_term : unary_expr ( ( '*' | '/' ) unary_expr )* ;
    public final void math_term() throws RecognitionException {
        try {
            // chronos_antlr.g:54:2: ( unary_expr ( ( '*' | '/' ) unary_expr )* )
            // chronos_antlr.g:54:4: unary_expr ( ( '*' | '/' ) unary_expr )*
            {
            pushFollow(FOLLOW_unary_expr_in_math_term304);
            unary_expr();

            state._fsp--;


            // chronos_antlr.g:54:15: ( ( '*' | '/' ) unary_expr )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==39||LA14_0==44) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // chronos_antlr.g:54:17: ( '*' | '/' ) unary_expr
            	    {
            	    if ( input.LA(1)==39||input.LA(1)==44 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unary_expr_in_math_term316);
            	    unary_expr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "math_term"



    // $ANTLR start "unary_expr"
    // chronos_antlr.g:56:1: unary_expr : ( NOT )* postfix_expr ;
    public final void unary_expr() throws RecognitionException {
        try {
            // chronos_antlr.g:57:2: ( ( NOT )* postfix_expr )
            // chronos_antlr.g:57:4: ( NOT )* postfix_expr
            {
            // chronos_antlr.g:57:4: ( NOT )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==NOT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // chronos_antlr.g:57:5: NOT
            	    {
            	    match(input,NOT,FOLLOW_NOT_in_unary_expr330); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            pushFollow(FOLLOW_postfix_expr_in_unary_expr334);
            postfix_expr();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "unary_expr"



    // $ANTLR start "postfix_expr"
    // chronos_antlr.g:59:1: postfix_expr : ( ID '.' )? primary_expr ( '(' ( argument_expr_list )? ')' )? ;
    public final void postfix_expr() throws RecognitionException {
        try {
            // chronos_antlr.g:60:2: ( ( ID '.' )? primary_expr ( '(' ( argument_expr_list )? ')' )? )
            // chronos_antlr.g:60:4: ( ID '.' )? primary_expr ( '(' ( argument_expr_list )? ')' )?
            {
            // chronos_antlr.g:60:4: ( ID '.' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==43) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // chronos_antlr.g:60:5: ID '.'
                    {
                    match(input,ID,FOLLOW_ID_in_postfix_expr345); 

                    match(input,43,FOLLOW_43_in_postfix_expr347); 

                    }
                    break;

            }


            pushFollow(FOLLOW_primary_expr_in_postfix_expr351);
            primary_expr();

            state._fsp--;


            // chronos_antlr.g:60:27: ( '(' ( argument_expr_list )? ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // chronos_antlr.g:60:29: '(' ( argument_expr_list )? ')'
                    {
                    match(input,37,FOLLOW_37_in_postfix_expr355); 

                    // chronos_antlr.g:60:33: ( argument_expr_list )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==FLOAT||LA17_0==ID||LA17_0==INT||LA17_0==NOT||LA17_0==STRING||LA17_0==37) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // chronos_antlr.g:60:34: argument_expr_list
                            {
                            pushFollow(FOLLOW_argument_expr_list_in_postfix_expr358);
                            argument_expr_list();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input,38,FOLLOW_38_in_postfix_expr362); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "postfix_expr"



    // $ANTLR start "primary_expr"
    // chronos_antlr.g:62:1: primary_expr : ( constant | ID | STRING | '(' assignment_expr ')' );
    public final void primary_expr() throws RecognitionException {
        try {
            // chronos_antlr.g:63:2: ( constant | ID | STRING | '(' assignment_expr ')' )
            int alt19=4;
            switch ( input.LA(1) ) {
            case FLOAT:
            case INT:
                {
                alt19=1;
                }
                break;
            case ID:
                {
                alt19=2;
                }
                break;
            case STRING:
                {
                alt19=3;
                }
                break;
            case 37:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // chronos_antlr.g:63:4: constant
                    {
                    pushFollow(FOLLOW_constant_in_primary_expr375);
                    constant();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // chronos_antlr.g:64:4: ID
                    {
                    match(input,ID,FOLLOW_ID_in_primary_expr380); 

                    }
                    break;
                case 3 :
                    // chronos_antlr.g:65:4: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_primary_expr385); 

                    }
                    break;
                case 4 :
                    // chronos_antlr.g:66:4: '(' assignment_expr ')'
                    {
                    match(input,37,FOLLOW_37_in_primary_expr390); 

                    pushFollow(FOLLOW_assignment_expr_in_primary_expr391);
                    assignment_expr();

                    state._fsp--;


                    match(input,38,FOLLOW_38_in_primary_expr392); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "primary_expr"



    // $ANTLR start "argument_expr_list"
    // chronos_antlr.g:68:1: argument_expr_list : ( assignment_expr ) ( ',' assignment_expr )* ;
    public final void argument_expr_list() throws RecognitionException {
        try {
            // chronos_antlr.g:69:2: ( ( assignment_expr ) ( ',' assignment_expr )* )
            // chronos_antlr.g:69:4: ( assignment_expr ) ( ',' assignment_expr )*
            {
            // chronos_antlr.g:69:4: ( assignment_expr )
            // chronos_antlr.g:69:5: assignment_expr
            {
            pushFollow(FOLLOW_assignment_expr_in_argument_expr_list403);
            assignment_expr();

            state._fsp--;


            }


            // chronos_antlr.g:69:22: ( ',' assignment_expr )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==41) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // chronos_antlr.g:69:23: ',' assignment_expr
            	    {
            	    match(input,41,FOLLOW_41_in_argument_expr_list407); 

            	    pushFollow(FOLLOW_assignment_expr_in_argument_expr_list409);
            	    assignment_expr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "argument_expr_list"



    // $ANTLR start "constant"
    // chronos_antlr.g:71:1: constant : ( INT | FLOAT );
    public final void constant() throws RecognitionException {
        try {
            // chronos_antlr.g:72:2: ( INT | FLOAT )
            // chronos_antlr.g:
            {
            if ( input.LA(1)==FLOAT||input.LA(1)==INT ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "constant"



    // $ANTLR start "type_specifier"
    // chronos_antlr.g:75:1: type_specifier : ( INT_T | DOUBLE_T | STRING_T );
    public final void type_specifier() throws RecognitionException {
        try {
            // chronos_antlr.g:76:2: ( INT_T | DOUBLE_T | STRING_T )
            // chronos_antlr.g:
            {
            if ( input.LA(1)==DOUBLE_T||input.LA(1)==INT_T||input.LA(1)==STRING_T ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "type_specifier"



    // $ANTLR start "derived_type_specifier"
    // chronos_antlr.g:80:1: derived_type_specifier : ( SCHEDULE_T | COURSE_T | COURSELIST_T );
    public final void derived_type_specifier() throws RecognitionException {
        try {
            // chronos_antlr.g:81:2: ( SCHEDULE_T | COURSE_T | COURSELIST_T )
            // chronos_antlr.g:
            {
            if ( (input.LA(1) >= COURSELIST_T && input.LA(1) <= COURSE_T)||input.LA(1)==SCHEDULE_T ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "derived_type_specifier"

    // Delegated rules


 

    public static final BitSet FOLLOW_declarator_in_translation_unit14 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_translation_unit15 = new BitSet(new long[]{0x0000202318F30822L});
    public static final BitSet FOLLOW_stmt_in_translation_unit20 = new BitSet(new long[]{0x0000202110730022L});
    public static final BitSet FOLLOW_primitive_declarator_in_declarator32 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_derived_type_declarator_in_declarator37 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_primitive_declarator47 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_primitive_declarator49 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_primitive_declarator54 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_primitive_declarator56 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_primitive_declarator58 = new BitSet(new long[]{0x0000002110510000L});
    public static final BitSet FOLLOW_assignment_expr_in_primitive_declarator60 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_T_in_derived_type_declarator70 = new BitSet(new long[]{0x0000000080000300L});
    public static final BitSet FOLLOW_derived_type_specifier_in_derived_type_declarator72 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_derived_type_declarator74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_T_in_derived_type_declarator79 = new BitSet(new long[]{0x0000000080000300L});
    public static final BitSet FOLLOW_derived_type_specifier_in_derived_type_declarator81 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_derived_type_declarator83 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_derived_type_declarator85 = new BitSet(new long[]{0x0000002110510000L});
    public static final BitSet FOLLOW_assignment_expr_in_derived_type_declarator87 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expr_in_stmt95 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_stmt96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_stmt_in_stmt101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_stmt_in_stmt106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_stmt_in_stmt111 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_stmt112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_stmt117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_T_in_selection_stmt127 = new BitSet(new long[]{0x0000002110510000L});
    public static final BitSet FOLLOW_assignment_expr_in_selection_stmt129 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_selection_stmt131 = new BitSet(new long[]{0x0000202110730020L});
    public static final BitSet FOLLOW_stmt_in_selection_stmt132 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_selection_stmt133 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ELSE_T_in_selection_stmt136 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_selection_stmt138 = new BitSet(new long[]{0x0000202110730020L});
    public static final BitSet FOLLOW_stmt_in_selection_stmt139 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_selection_stmt140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREACH_T_in_iteration_stmt152 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COURSE_T_in_iteration_stmt154 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_iteration_stmt156 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_IN_T_in_iteration_stmt158 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_iteration_stmt160 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_iteration_stmt162 = new BitSet(new long[]{0x0004202110730020L});
    public static final BitSet FOLLOW_stmt_in_iteration_stmt164 = new BitSet(new long[]{0x0004202110730020L});
    public static final BitSet FOLLOW_50_in_iteration_stmt167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_T_in_jump_stmt177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cond_term_in_assignment_expr187 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_OR_in_assignment_expr190 = new BitSet(new long[]{0x0000002110510000L});
    public static final BitSet FOLLOW_cond_term_in_assignment_expr192 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_equiv_expr_in_cond_term204 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_cond_term207 = new BitSet(new long[]{0x0000002110510000L});
    public static final BitSet FOLLOW_equiv_expr_in_cond_term209 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rel_expr_in_equiv_expr221 = new BitSet(new long[]{0x0000000004002002L});
    public static final BitSet FOLLOW_set_in_equiv_expr225 = new BitSet(new long[]{0x0000002110510000L});
    public static final BitSet FOLLOW_rel_expr_in_equiv_expr233 = new BitSet(new long[]{0x0000000004002002L});
    public static final BitSet FOLLOW_math_expr_in_rel_expr246 = new BitSet(new long[]{0x0001400002040002L});
    public static final BitSet FOLLOW_set_in_rel_expr250 = new BitSet(new long[]{0x0000002110510000L});
    public static final BitSet FOLLOW_math_expr_in_rel_expr266 = new BitSet(new long[]{0x0001400002040002L});
    public static final BitSet FOLLOW_math_term_in_math_expr279 = new BitSet(new long[]{0x0000050000000002L});
    public static final BitSet FOLLOW_set_in_math_expr283 = new BitSet(new long[]{0x0000002110510000L});
    public static final BitSet FOLLOW_math_term_in_math_expr291 = new BitSet(new long[]{0x0000050000000002L});
    public static final BitSet FOLLOW_unary_expr_in_math_term304 = new BitSet(new long[]{0x0000108000000002L});
    public static final BitSet FOLLOW_set_in_math_term308 = new BitSet(new long[]{0x0000002110510000L});
    public static final BitSet FOLLOW_unary_expr_in_math_term316 = new BitSet(new long[]{0x0000108000000002L});
    public static final BitSet FOLLOW_NOT_in_unary_expr330 = new BitSet(new long[]{0x0000002110510000L});
    public static final BitSet FOLLOW_postfix_expr_in_unary_expr334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_postfix_expr345 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_postfix_expr347 = new BitSet(new long[]{0x0000002100510000L});
    public static final BitSet FOLLOW_primary_expr_in_postfix_expr351 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_postfix_expr355 = new BitSet(new long[]{0x0000006110510000L});
    public static final BitSet FOLLOW_argument_expr_list_in_postfix_expr358 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_postfix_expr362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_primary_expr375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primary_expr380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primary_expr385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_primary_expr390 = new BitSet(new long[]{0x0000002110510000L});
    public static final BitSet FOLLOW_assignment_expr_in_primary_expr391 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_primary_expr392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expr_in_argument_expr_list403 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_argument_expr_list407 = new BitSet(new long[]{0x0000002110510000L});
    public static final BitSet FOLLOW_assignment_expr_in_argument_expr_list409 = new BitSet(new long[]{0x0000020000000002L});

}