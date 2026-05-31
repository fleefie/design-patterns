package fr.fleefie.designpatterns.composite;

/**
 * Classe représentant une feuille de l'abre de composition.
 */
public class LeafA extends Component {
    /**
     * Méthode d'exécution.
     */
    @Override
    public void doStuff() {
        System.out.println("[Composite][LeafA] Je suis une feuille de type A");
    }

    /**
     * Constructeur accessible.
     */
    public LeafA() {};
}
