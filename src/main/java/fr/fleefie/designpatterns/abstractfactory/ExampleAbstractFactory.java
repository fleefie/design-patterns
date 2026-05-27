package fr.fleefie.designpatterns.abstractfactory;

/**
 * Patterne: Abstract Factory / Fabrique Abstraite.
 */
public class ExampleAbstractFactory {
    
    /**
     * Méthode d'exemple d'utilisation de nos fabriques.
     *
     * @param type type de produit. 1 pour A, 2 pour B, 3 pour 1A 2B.
     */
    public static void run(int type) {
        // Utilisation de la méthode de fabrique pour les produits A
        AbstractFactory facA = new AbstractFactoryA();
        Product1 prodA1 = facA.createProduct1();
        Product2 prodA2 = facA.createProduct2();
        prodA1.runSomeCode();
        prodA2.runSomeCode();
        // Ou encore...
        facA.doStuff();

        // Utilisation de la méthode de fabrique pour les produits B
        AbstractFactory facB = new AbstractFactoryB();
        Product1 prodB1 = facB.createProduct1();
        Product2 prodB2 = facB.createProduct2();
        prodB1.runSomeCode();
        prodB2.runSomeCode();
        // Ou encore...
        facB.doStuff();

        // Utilisation de la méthode de fabrique pour les produits A et B
        AbstractFactory facAB = new AbstractFactoryAB();
        Product1 prodAB1 = facAB.createProduct1();
        Product2 prodAB2 = facAB.createProduct2();
        prodAB1.runSomeCode();
        prodAB2.runSomeCode();
        // Ou encore...
        facAB.doStuff();

        // On peut également utiliser des conditions!
        AbstractFactory fac;
        Product1 prod1;
        Product2 prod2;

        if (type == 1)
            // Type A
            fac = new AbstractFactoryA();
        else if (type == 2)
            // Type B
            fac = new AbstractFactoryB();
        else if (type == 3)
            // Type AB
            fac = new AbstractFactoryAB();
        else
            // Type par défaut
            fac = new AbstractFactoryA();

        // Le type de prod est alors dépendant de l'argument, et chaque fabrique
        // peut lancer son propre code!
        prod1 = fac.createProduct1();
        prod2 = fac.createProduct2();
        prod1.runSomeCode();
        prod2.runSomeCode();
    }
}
