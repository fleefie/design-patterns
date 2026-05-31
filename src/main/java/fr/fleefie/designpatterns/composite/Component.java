package fr.fleefie.designpatterns.composite;

/**
 * Classe réprésentant un composant abstrait.
 * Cette interface est partagée entre les feuilles de l'arbre et les noeuds.
 *
 * Cette classe PEUT contenir les options de gestion des fils,
 * mais le client peut alors faire l'erreur de gérer une feuille comme
 * un composite.
 *
 * Dans le cas où une feuille peut devenir un composite, on préferera utilser
 * un patterne état. On suppose ici que la structure est immuable.
 */
public abstract class Component {
    /**
     * Méthode exécutable d'un composant.
     */
    public abstract void doStuff();

    /**
     * Un composant ne peut pas être créé seul.
     */
    protected Component() {}
}
