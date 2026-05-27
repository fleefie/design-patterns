package fr.fleefie.designpatterns.abstractfactory;

/**
 * Troixième implémentation de notre fabrique.
 * On créé ici des produits A1 et B2.
 */
public class AbstractFactoryAB extends AbstractFactory {
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
     * On retourne ici le produit 2B.
     *
     * @return Le produit 2B
     */
    @Override
    public Product2 createProduct2() {
        return new Product2B();
    }
}
