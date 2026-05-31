package fr.fleefie.designpatterns.command;

/**
 * Interface pour une commande.
 */
public interface Command {
    /**
     * Exécuter la commande.
     */
    void execute();

    /**
     * Annuler la commande.
     */
    void undo();
}
