package fr.fleefie.designpatterns.factory;

/**
 * Première implémentation de notre fabrique.
 * On override seulement la méthode de création.
 */
public class FactoryA extends Factory {
    /**
     * Méthode concrète de fabrique.
     * On retourne ici le premier produit.
     *
     * @return Le produit A
     */
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
