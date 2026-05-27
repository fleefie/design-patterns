package fr.fleefie.designpatterns.abstractfactory;

/**
 * Première implémentation de notre fabrique.
 * On créé ici des produits A.
 */
public class AbstractFactoryA extends AbstractFactory {
    /**
     * Méthode concrète de fabrique 1.
     * On retourne ici le produit 1A.
     *
     * @return Le produit 1A
     */
    @Override
    public Product1 createProduct1() {
        return new Product1A();
    }

    /**
     * Méthode concrète de fabrique 2.
     * On retourne ici le produit 2A.
     *
     * @return Le produit 2A
     */
    @Override
    public Product2 createProduct2() {
        return new Product2A();
    }
}
