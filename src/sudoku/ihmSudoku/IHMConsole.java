package sudoku.ihmSudoku;

import sudoku.Case;
import sudoku.Initialisationsudoku;

import java.util.Scanner;

/**
 * Classe pour faire un sudoku dans la console directement
 */
public class IHMConsole implements IHM {


    /**
     * Méthode static car elle n'a pas besoin que l'objet soit instancié pour être utilisé
     * il est préférable de mettres les attributs hors de la méthode mais c'était pour présenter le static
     */
    public static void AfficherJeux() {

        boolean stop = false ;

        int x;
        int y;
        int nb;

        Scanner clavier = new Scanner(System.in);

        //initialisation du Sudoku
        Initialisationsudoku sudokuJeux = new Initialisationsudoku();
        sudokuJeux.initialiserJeu(4);
        Case[] tableauJeux = sudokuJeux.getTableauSudoku();

        System.out.println("Sudoku de base");

        sudokuJeux.placerCase(0,0,1, true) ;
        sudokuJeux.placerCase(1,2,2, true) ;
        sudokuJeux.placerCase(3,1,3, true ) ;
        sudokuJeux.placerCase(3,3,4, true ) ;


        int i = -1 ;
        for( Case jeux: tableauJeux ) {
            i ++;
            if ( i%4 == 0) {
                System.out.println("");
            }
            System.out.print(jeux.getNumero() + " ");
        }

        //partie utilisateur
        while ( !stop ) {

            System.out.println("");
            System.out.println( "Entrez les coordonnées ");
            System.out.println("X : ");
            x = 2 ; //au lieu de x = clavier.nextInt();
            // on test directement pour evitez de faire à chaque fois la manipulation
            System.out.println("Y : ");
            y = 3 ;
            System.out.println("Nombre =");
            nb = 4 ;

            sudokuJeux.placerCase(x, y, nb, false);

            i = -1;
            for (Case jeux : tableauJeux) {
                i++;
                if (i % 4 == 0) {
                    System.out.println("");
                }
                System.out.print(jeux.getNumero() + " ");
            }

            stop = true ; //on arrete manuelement ( pas demandé )
        }
    }
}

