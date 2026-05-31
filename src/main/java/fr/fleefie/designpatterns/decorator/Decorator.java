package fr.fleefie.designpatterns.decorator;

/**
 * Classe abstraitre représentant un décorateur abstrait.
 * On hérite de l'interfce Component.
 */
public abstract class Decorator extends Component {
    /**
     * Composant décoré, car nos décorateurs peuvent avoir besoin d'y accéder.
     * On n'oublie pas que ConcreteComponent suit cette même interface!
     */
    protected final Component decorated;

    /**
     * Constructeur protected, Decorator est une interface.
     * Ici, il fait sens d'utiliser une classe abstraite au moins...
     */
    protected Decorator(Component decorated) {
        this.decorated = decorated;
    }
}
