package fr.fleefie.designpatterns.decorator;

/**
 * Classe concrète réprésentant un exemple de composant.
 */
public class ConcreteComponentB extends Component {
    @Override
    public void doStuff() {
        System.out.println("[Decorator][ConcreteComponentB] Le composant de base fait quelque chose...");
    }

    public ConcreteComponentB() {}
}
