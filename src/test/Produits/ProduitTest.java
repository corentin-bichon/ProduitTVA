package test.Produits; 

import Produits.Produit;
import Produits.ProduitA;
import Produits.ProduitB;
import org.testng.annotations.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* Produit Tester. 
* 
* @author BICHON corentin
* @since <pre>déc. 7, 2020</pre> 
* @version 1.0 
*/ 
public class ProduitTest { 

@Before
public void before() throws Exception {
    int prixA = 85;
    int prixB = 52;
    ProduitA TestProduitA = new ProduitA(prixA);
    ProduitB TestProduitB = new ProduitB(prixB);
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: calculPrixTTC(int nbProduits) 
* 
*/ 
@Test
public void testCalculPrixTTC() throws Exception {
    int prixA = 85;
    int prixB = 52;
    ProduitA TestProduitA = new ProduitA(prixA);
    ProduitB TestProduitB = new ProduitB(prixB);
    TestProduitA.calculPrixTTC(8);
    TestProduitB.calculPrixTTC(9);
} 

/** 
* 
* Method: calculPrixHT(int nbProduits) 
* 
*/ 
@Test
public void testCalculPrixHT() throws Exception {
    int prixA = 85;
    int prixB = 52;
    ProduitA TestProduitA = new ProduitA(prixA);
    ProduitB TestProduitB = new ProduitB(prixB);
    TestProduitA.calculPrixHT(8);
    TestProduitB.calculPrixHT(9);
} 

/** 
* 
* Method: calculPrixTVA(int nbProduits) 
* 
*/ 
@Test
public void testCalculPrixTVA() throws Exception {
    int prixA = 85;
    int prixB = 52;
    ProduitA TestProduitA = new ProduitA(prixA);
    ProduitB TestProduitB = new ProduitB(prixB);
    TestProduitA.calculPrixTVA(8);
    TestProduitB.calculPrixTVA(9);
} 

/** 
* 
* Method: saisirPrixHT(double prixHTSaisi) 
* 
*/ 
@Test
public void testSaisirPrixHT() throws Exception {
    int prixA = 85;
    int prixB = 52;
    ProduitA TestProduitA = new ProduitA(prixA);
    ProduitB TestProduitB = new ProduitB(prixB);
    TestProduitA.saisirPrixHT(8);
    TestProduitB.saisirPrixHT(9);
} 

/** 
* 
* Method: commandeProduits(int prodA, int prodB) 
* 
*/ 
@Test
public void testCommandeProduits() throws Exception {
    int prixA = 85;
    int prixB = 52;
    ProduitA TestProduitA = new ProduitA(prixA);
    ProduitB TestProduitB = new ProduitB(prixB);
    TestProduitA.calculPrixTTC(8);
    TestProduitB.calculPrixTTC(9);

    TestProduitA.commandeProduits(5,6);
    TestProduitB.commandeProduits(5,6);

}


} 
