package fr.fleefie.designpatterns.factory;

/**
 * Patterne: Factory / Fabrique.
 */
public class ExampleFactory {
    
    /**
     * Méthode d'exemple d'utilisation de nos fabriques.
     *
     * @param type type de produit. 1 pour A, 2 pour B.
     */
    public static void run(int type) {
        // Utilisation de la méthode de fabrique pour le produit A
        Factory facA = new FactoryA();
        Product prodA = facA.createProduct();
        prodA.runSomeCode();
        // Ou encore...
        facA.doStuff();

        // Utilisation de la méthode de fabrique pour le produit B
        Factory facB = new FactoryB();
        Product prodB = facB.createProduct();
        prodB.runSomeCode();
        // Ou encore...
        facB.doStuff();

        // On peut également utiliser des conditions!
        Factory fac;
        Product prod;

        /* 
         * Point fort: Si on ajoute dans le futur un nouveau produit,
         * il suffit de l'ajouter dans ce bloc if-else coté client !
         * Point faible: On a créé six classes pour seulement deux produits !
         */
        if (type == 1)
            // Type 1
            fac = new FactoryA();
        else if (type == 2)
            // Type 2
            fac = new FactoryB();
        else
            // Type par défaut
            fac = new FactoryA();

        // Le type de prod est alors dépendant de l'argument, et chaque fabrique
        // peut lancer son propre code!
        prod = fac.createProduct();
        prod.runSomeCode();
    }
}
