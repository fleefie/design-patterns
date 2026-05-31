package fr.fleefie.designpatterns.command;

/**
 * Classe capable d'utiliser une commande.
 */
public class Invoker {
    /**
     * La commande à exécuter.
     */
    protected Command command;

    /**
     * Constructeur.
     *
     * @param command la commande associée.
     */
    public Invoker(Command command) {
        this.command = command;
    }

    /**
     * Exécute la commande associée.
     */
    public void doCommand() {
        this.command.execute();
    }

    /**
     * Séléctionne la commande associée.
     *
     * @param command la commande.
     */
    public void setCommand(Command command) {
        this.command = command;
    }
}
