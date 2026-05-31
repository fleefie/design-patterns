package fr.fleefie.designpatterns.command;

/**
 * Classe représentant une commande concrète.
 */
public class ConcreteCommandA implements Command {
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
        System.out.println("[Command][CommandA] Je suis exécutée");
        receiver.operationA(param, false);
    }

    @Override
    public void undo() {
    
        System.out.println("[Command][CommandA] Je suis annulée");
        receiver.operationA(param, true);
    }

    /**
     * Constructeur.
     * @param receiver classe réceptrice
     * @param param paramètre de la commande
     */
    public ConcreteCommandA(Receiver receiver, int param) {
        this.receiver = receiver;
        this.param = param;
    }
}
