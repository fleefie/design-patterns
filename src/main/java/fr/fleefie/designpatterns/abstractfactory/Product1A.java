package fr.fleefie.designpatterns.abstractfactory;

/**
 * Première implémentation du produit 1.
 */
public class Product1A implements Product1 {
    @Override
    public void runSomeCode() {
        System.out.println("[Abstract Factory] [Product1] Je suis le produit 1A !");
    }
}
