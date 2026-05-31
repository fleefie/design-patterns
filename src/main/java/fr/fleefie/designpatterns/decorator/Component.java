package fr.fleefie.designpatterns.decorator;

/**
 * Classe abstraite représentante un composant à décorer.
 */
public abstract class Component {
    /**
     * Méthode que le composant permet d'exécuter.
     */
    public abstract void doStuff();

    /**
     * Constructeur privé, Component est une interface.
     * Oui, on devrait utiliser une interface dans la vrai vie et dans un vrai
     * projet, mais le prof IMPOSE d'utiliser des classes abstraites même
     * lorsqu'on représente un contrat. Oui, c'est illogique, mais CE PROF
     * est illogique.
     */
    protected Component() {}
}
