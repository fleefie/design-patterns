package fr.fleefie.designpatterns.factory;

/**
 * Deuxième implémentation du produit.
 */
public class ProductB implements Product {
    @Override
    public void runSomeCode() {
        System.out.println("[Factory] [Product] Je suis le produit B !");
    }
}
