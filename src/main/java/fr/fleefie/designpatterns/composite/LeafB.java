package fr.fleefie.designpatterns.composite;

/**
 * Classe représentant une feuille de l'abre de composition.
 */
public class LeafB extends Component {
    /**
     * Méthode d'exécution.
     */
    @Override
    public void doStuff() {
        System.out.println("[Composite][LeafB] Je suis une feuille de type B");
    }

    /**
     * Constructeur accessible.
     */
    public LeafB() {};
}
