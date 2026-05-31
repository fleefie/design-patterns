package fr.fleefie.designpatterns.command;

/**
 * Classe réceptrice des commandes.
 */
public class Receiver {
    public void operationA(int param, boolean isUndone) {
        if (isUndone)
            System.out.println("[Command][Receiver] Opération A annulée avec param " + param);
        else
            System.out.println("[Command][Receiver] Opération A appliquée avec param " + param);
    }

    public void operationB(int param, boolean isUndone) {
        if (isUndone)
            System.out.println("[Command][Receiver] Opération B annulée avec param " + param);
        else
            System.out.println("[Command][Receiver] Opération B appliquée avec param " + param);
    }
}
