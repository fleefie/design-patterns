package fr.fleefie.designpatterns.factory;

/**
 * Première implémentation du produit.
 */
public class ProductA implements Product {
    @Override
    public void runSomeCode() {
        System.out.println("[Factory] [Product] Je suis le produit A !");
    }
}
