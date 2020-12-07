package Produits;

public class ProduitA extends Produit {

    final double POURCENTAGE_TVAA = 1.055;

    public ProduitA(double prix) {
        super(prix);
    }

    public double calculPrixHT(int nbProduits) {
        return nbProduits * prixProduitHT;
    }

    public double calculPrixTTC(int nbProduits) {
        return calculPrixHT(nbProduits) * POURCENTAGE_TVAA;
    }

    public double calculPrixTVA(int nbProduits) {
        return calculPrixTTC(nbProduits) - calculPrixHT(nbProduits);
    }
}