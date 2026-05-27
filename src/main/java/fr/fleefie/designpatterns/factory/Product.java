package fr.fleefie.designpatterns.factory;

/**
 * Interface (ou classe abstraite) représentant le produit de la fabrique,
 * soit donc la classe qui aurait été instanciée par {@code new Product}
 */
public interface Product {
    abstract void runSomeCode();
}
