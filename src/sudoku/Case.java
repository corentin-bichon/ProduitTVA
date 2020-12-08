package sudoku;

public class Case {

    private int positionX;
    private int positionY;
    private int numero;
    private boolean estInitial;

    /**
     * Instentie une case
     * @param positionX ligne du sudoku
     * @param positionY colonne du sudoku
     * @param numero    chiffre de la case
     * estInitial est � false car cette case n'est pas un num�ro de base
     * les num�ros de bases seront ajout�s apr�s
     */
    public Case(int positionX, int positionY, int numero) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.numero = numero;
        this.estInitial = false;
    }



    public void caseSelectionner() {

    }

    public int getNumero() {
        return numero;
    }

    /**
     * Le seul setter num�ro, pour modifier le num�ro de la case
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean getEstInitial() {
        return estInitial;
    }

    public void setEstInitial(boolean estInitial) {
        this.estInitial = estInitial;
    }


}
