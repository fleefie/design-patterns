package fr.fleefie.designpatterns.factory;

/**
 * Classe abstraite représente la fabrique.
 * Cette classe possède de la logique qui lui impose de créer un Product.
 */
public abstract class Factory {
    /**
     * Méthode abstraite de fabrique.
     * Sera override par les fabriques concrètes.
     *
     * @return Le produit
     */
    public abstract Product createProduct();

    /**
     * Méthode d'exécution de la classe.
     * Dans certains cas, on aura des fabriques qui tourneront leur propre code,
     * dans ces cas, on peut garder la méthode originale et un produit par 
     * polymorphisme.
     *
     * On peut imaginer que la fabrique possède un état interne qui peut être
     * modifié et qui influence quel paramètres sont passé dans notre
     * produit, par exemple.
     */
    public void doStuff() {
        System.out.println("[Factory] je tourne ma logique");
        Product prod = createProduct();
        prod.runSomeCode();
    }
}
