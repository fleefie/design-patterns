package fr.fleefie.designpatterns.decorator;

/**
 * Patterne: Decorator / Décorateur
 */
public class ExampleDecorator {
    /**
     * Méthode d'exécution pour cet exemple.
     */
    public static void run() {
        // On va pouvoir créer nos deux composants de base.
        Component compA = new ConcreteComponentA();
        Component compB = new ConcreteComponentB();

        // On peut déjà les exécuter sans problèmes.
        System.out.println("[Decorator] Exécution des composants de base...");
        compA.doStuff();
        compB.doStuff();

        // Maintenant, on peut, par héritae récursif, ajouter des composants
        // par décoration.
        Component decoratedA = 
            new ConcreteDecoratorA(
                    new ConcreteDecoratorC(
                        compA));
        Component decoratedB =
            new ConcreteDecoratorB(
                    new ConcreteDecoratorC(
                        compB));

        // Et on peut maintenant exécuter nos composants décorés!
        System.out.println("[Decorator] Exécution des composants décorés...");
        decoratedA.doStuff();
        decoratedB.doStuff();

        // On peut créer nos chaines d'héritage dans n'importe quel ordre et
        // avec n'importe quelle liste de décorateurs!
        Component decorated =
            new ConcreteDecoratorC(
                    new ConcreteDecoratorB(
                        new ConcreteDecoratorA(
                            new ConcreteComponentA())));
        System.out.println("[Decorator] Exécution du méga-décoré...");
        decorated.doStuff();
    }
}
