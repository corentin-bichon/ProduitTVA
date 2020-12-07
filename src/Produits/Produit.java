package Produits;

public abstract class Produit {

    protected double prixProduitHT;

    public Produit(double prix) {
        this.prixProduitHT = prix;
    }

    public abstract double calculPrixTTC(int nbProduits);

    public abstract double calculPrixHT(int nbProduits);

    public abstract double calculPrixTVA(int nbProduits);

    public void saisirPrixHT(double prixHTSaisi) {
        prixProduitHT = prixHTSaisi;
    }

    public void commandeProduits(int prodA, int prodB) {

        double prixTTC = calculPrixTTC(prodA) + calculPrixTTC(prodB);
        System.out.println("Le prix TTC de la commande est de : " + prixTTC);

        double prixHT = calculPrixHT(prodA) + calculPrixHT(prodB);
        System.out.println("Le prix HT de la commande est de : " + prixHT);

        double prixTVA = calculPrixTVA(prodA) + calculPrixTVA(prodB);
        System.out.println("Le prix de la TVA de la commande est de : " + prixTVA);
    }
}