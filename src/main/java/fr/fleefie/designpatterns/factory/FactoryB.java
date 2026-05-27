package fr.fleefie.designpatterns.factory;

/**
 * Deuxième implémentation de notre fabrique.
 * On override seulement la méthode de création.
 */
public class FactoryB extends Factory {
    /**
     * Méthode concrète de fabrique.
     * On retourne ici le deuxième produit.
     *
     * @return Le produit B
     */
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
