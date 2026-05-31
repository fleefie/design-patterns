package fr.fleefie.designpatterns.decorator;

/**
 * Classe concrète réprésentant un exemple de composant.
 */
public class ConcreteComponentA extends Component {
    @Override
    public void doStuff() {
        System.out.println("[Decorator][ConcreteComponentA] Le composant de base fait quelque chose...");
    }

    public ConcreteComponentA() {}
}
