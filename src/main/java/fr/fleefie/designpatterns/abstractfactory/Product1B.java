package fr.fleefie.designpatterns.abstractfactory;

/**
 * Deuxième implémentation du produit 1.
 */
public class Product1B implements Product1 {
    @Override
    public void runSomeCode() {
        System.out.println("[Abstract Factory] [Product1] Je suis le produit 1B !");
    }
}
