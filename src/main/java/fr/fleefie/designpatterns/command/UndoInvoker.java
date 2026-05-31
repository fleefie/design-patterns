package fr.fleefie.designpatterns.command;

/**
 * Invoker pour annuler une commande.
 */
public class UndoInvoker extends Invoker {
    @Override
    public void doCommand() {
        super.command.undo();
    }

    public UndoInvoker(Command command) {
        super(command);
    }
}
