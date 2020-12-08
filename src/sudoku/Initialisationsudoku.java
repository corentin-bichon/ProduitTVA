package sudoku;

public class Initialisationsudoku {

    private Case[] tableauSudoku;

    /**
     *   Constructeur vide, u
     */
    public Initialisationsudoku() {}

    public void initialiserJeu(int nbCase) {
        int tailleTableau = nbCase * nbCase ;
        int numeroCase = -1 ;
        this.tableauSudoku = new Case[tailleTableau];
        for ( int i  = 0 ; i < nbCase ; i++) {
            for ( int j = 0 ; j < nbCase ; j++) {
                Case caseSudoku = new Case(i, j, -1);
                numeroCase ++;
                this.tableauSudoku[numeroCase] = caseSudoku;
            }
        }
    }


    public void placerCase(int x , int y , int nombre, boolean initial) {
        for( Case grille: this.tableauSudoku) {
            if ( grille.getPositionX() == x && grille.getPositionY() == y && !grille.getEstInitial())
            {
                grille.setNumero(nombre);
                grille.setEstInitial(initial);

            }
        }

    }

    public Case[] getTableauSudoku() {
        return this.tableauSudoku;
    }
}
