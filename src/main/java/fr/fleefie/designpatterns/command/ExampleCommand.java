package fr.fleefie.designpatterns.command;

/**
 * Patterne: Command / commande.
 */

public class ExampleCommand {
    /**
     * Méthode d'exécution de l'exemple.
     */
    public static void run() {
        // On créé une classe réceptrice des commandes.
        Receiver rec = new Receiver();

        // On créé deux commandes.
        Command comA = new ConcreteCommandA(rec, 1);
        Command comB = new ConcreteCommandB(rec, 2);

        // On peut maintenant créer des invokers pour les commandes.
        // On peut imaginer que chaque Invoker est un boutton, par exemple.
        Invoker invokeComA = new Invoker(comA);
        Invoker invokeComB = new Invoker(comB);
        UndoInvoker undoComA = new UndoInvoker(comA);
        UndoInvoker undoComB = new UndoInvoker(comB);

        // On applique les commandes.
        invokeComA.doCommand();
        invokeComB.doCommand();
        undoComA.doCommand();
        undoComB.doCommand();
    }
}
