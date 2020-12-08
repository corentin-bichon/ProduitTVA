package test.sudoku;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import sudoku.Case;
import sudoku.Initialisationsudoku;

import static org.testng.Assert.assertEquals;

class initialisationsudokuTest {

    @BeforeAll
    static void first() {
        System.out.println("----- Début Test InitialisationSudoku ----- ");
    }


    @BeforeEach
    void setUp() {
        System.out.println(" Test méthode :");
    }

    /**
     *
     * Method: InitialiserJeu(int nbCase)
     * Initialise le sudoku avec des valeurs par default (-1)
     * Le sudoku est vide, il prend juste 4 pour valeur ( test demandé )
     */
    @Test
    public void testInitialiserJeu1() throws Exception {
        Initialisationsudoku sudoku = new Initialisationsudoku();
        sudoku.initialiserJeu(4);
        Case[] tableauTest = sudoku.getTableauSudoku();

        int i = -1 ;
        for( Case test : tableauTest ) {
            i ++;
            if ( i%4 == 0) {
                System.out.println("");
            }
            System.out.print(test.getNumero());
        }
    }

    /**
      *
      * Method: InitialiserJeu(int nbCase)
      * Initialise le sudoku avec des valeurs par default (-1)
      * Le sudoku est vide
      */
     @ParameterizedTest
     @ValueSource(ints = {1, 2, 4, 25, 42})
     public void testInitialiserJeu2(int nbCase) throws Exception {
         Initialisationsudoku sudoku = new Initialisationsudoku();
         sudoku.initialiserJeu(nbCase);
         Case[] tableauTest = sudoku.getTableauSudoku();
         int i = -1 ;
         for( Case test : tableauTest ) {
             i ++;
             if ( i%nbCase == 0) {
                 System.out.println("");
                  }
                 System.out.print(test.getNumero());
            }
        }

    /**
     * On test si on peut placer une case dans le sudoku
     * Method: InitialiserJeu(int nbCase)
     * Initialise le sudoku avec des valeurs par default (-1)
     * Le sudoku est vide
     */
    @Test
    void placerCase() throws Exception {
        //initialisation du Sudoku
        Initialisationsudoku sudoku = new Initialisationsudoku();
        sudoku.initialiserJeu(4);
        Case[] tableauTest = sudoku.getTableauSudoku();

        //On verifi que le tableau a bien été initialisé
        assertEquals( tableauTest.length , 4*4 );


        System.out.println("Sudoku de base");

        sudoku.placerCase(0,0,1, true) ;
        sudoku.placerCase(1,2,2, true) ;
        sudoku.placerCase(3,1,3, true ) ;
        sudoku.placerCase(3,3,4, true ) ;


        int i = -1 ;
        for( Case test : tableauTest ) {
            i ++;
            if ( i%4 == 0) {
                System.out.println("");
            }
            System.out.print(test.getNumero() + " ");
        }

        System.out.println("");
        System.out.println("Sudoku de en cour de jeux");


        //on va tester en ce mettant à la place du joueur ( cad initial = false )
        sudoku.placerCase(0,0,1, false) ; //case initial donc aucun changelent
        sudoku.placerCase(1,3,3, false) ;  //changement car case pas tester
        sudoku.placerCase(3,0,2, false) ;
        sudoku.placerCase(3,2,1, false ) ;

         i = -1 ;
        for( Case test : tableauTest ) {
            i ++;
            if ( i%4 == 0) {
                System.out.println("");
            }
            System.out.print(test.getNumero() + " ");
        }
    }
}