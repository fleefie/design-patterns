package fr.fleefie.designpatterns.command;

/**
 * Classe représentant une commande concrète.
 */
public class ConcreteCommandB implements Command {
    /**
     * Classe réceptrice de la commande.
     */
    private Receiver receiver;
    /**
     * Paramètre(s) de la commande.
     */
    private int param;
    
    @Override
    public void execute() {
        System.out.println("[Command][CommandB] Je suis exécutée");
        receiver.operationB(param, false);
    }

    @Override
    public void undo() {
    
        System.out.println("[Command][CommandB] Je suis annulée");
        receiver.operationB(param, true);
    }

    /**
     * Constructeur.
     * @param receiver classe réceptrice
     * @param param paramètre de la commande
     */
    public ConcreteCommandB(Receiver receiver, int param) {
        this.receiver = receiver;
        this.param = param;
    }
}
