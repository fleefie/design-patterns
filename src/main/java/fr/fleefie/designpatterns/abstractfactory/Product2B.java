package fr.fleefie.designpatterns.abstractfactory;

/**
 * Deuxième implémentation du produit 2.
 */
public class Product2B implements Product2 {
    @Override
    public void runSomeCode() {
        System.out.println("[Abstract Factory] [Product2] Je suis le produit 2B !");
    }
}
