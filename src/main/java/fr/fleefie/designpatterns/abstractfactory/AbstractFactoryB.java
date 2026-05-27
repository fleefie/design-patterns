package fr.fleefie.designpatterns.abstractfactory;

/**
 * Deuxième implémentation de notre fabrique.
 * On créé ici des produits B.
 */
public class AbstractFactoryB extends AbstractFactory {
    /**
     * Méthode concrète de fabrique 1.
     * On retourne ici le produit 1B.
     *
     * @return Le produit 1B
     */
    @Override
    public Product1 createProduct1() {
        return new Product1B();
    }

    /**
     * Méthode concrète de fabrique 2.
     * On retourne ici le produit 2B.
     *
     * @return Le produit 2B
     */
    @Override
    public Product2 createProduct2() {
        return new Product2B();
    }
}
