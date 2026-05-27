package fr.fleefie.designpatterns.abstractfactory;

/**
 * Classe abstraite représentant la fabrique abstraite.
 * Cette fabrique va pouvoir créer un ensemble de produits. On peut aussi
 * utiliser une interface.
 */
public abstract class AbstractFactory {
    /**
     * Méthode abstraite de fabrique pour le produit 1.
     * Sera override par les fabriques concrètes.
     *
     * @return Le produit
     */
    public abstract Product1 createProduct1();

    /**
     * Méthode abstraite de fabrique pour le produit 2.
     * Sera override par les fabriques concrètes.
     *
     * @return Le produit
     */
    public abstract Product2 createProduct2();

    /**
     * Méthode d'exécution de la classe.
     * Dans certains cas, on aura des fabriques qui tourneront leur propre code,
     * dans ces cas, on peut garder la méthode originale et les produits par 
     * polymorphisme.
     *
     * On peut imaginer que la fabrique possède un état interne qui peut être
     * modifié et qui influence quel paramètres sont passé dans nos
     * produits, par exemple.
     */
    public void doStuff() {
        System.out.println("[Abstract Factory] je tourne ma logique");
        Product1 prod1 = createProduct1();
        Product2 prod2 = createProduct2();
        prod1.runSomeCode();
        prod2.runSomeCode();
    }
}
