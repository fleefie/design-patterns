package fr.fleefie.designpatterns.decorator;

public class ConcreteDecoratorA extends Decorator {
    /**
     * Méthode exécutable pour ce décorateur concret.
     */
    @Override
    public void doStuff() {
        System.out.println("[Decorator][A][Avant] Je suis la fonctionnalité A !");
        this.decorated.doStuff();
        System.out.println("[Decorator][A][Après] La fonctionnalité A a fait son travail !");
    }

    /**
     * Constructeur publique, on peut construire cette implémentation.
     */
    public ConcreteDecoratorA(Component decorated) {
        super(decorated);
    }
}
