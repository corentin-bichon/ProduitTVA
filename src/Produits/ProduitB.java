package Produits;

public class ProduitB extends Produit {

    final double POURCENTAGE_TVAB = 1.196;

    public ProduitB(double prix) {
        super(prix);
    }

    public double calculPrixHT(int nbProduits) {
        return nbProduits * prixProduitHT;
    }

    public double calculPrixTTC(int nbProduits) {
        return calculPrixHT(nbProduits) * POURCENTAGE_TVAB;
    }

    public double calculPrixTVA(int nbProduits) {
        return calculPrixTTC(nbProduits) - calculPrixHT(nbProduits);
    }
}