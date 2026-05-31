package fr.fleefie.designpatterns.decorator;

public class ConcreteDecoratorB extends Decorator {
    /**
     * Méthode exécutable pour ce décorateur concret.
     */
    @Override
    public void doStuff() {
        System.out.println("[Decorator][B][Avant] Je suis la fonctionnalité B !");
        this.decorated.doStuff();
        System.out.println("[Decorator][B][Après] La fonctionnalité B a fait son travail !");
    }

    /**
     * Constructeur publique, on peut construire cette implémentation.
     */
    public ConcreteDecoratorB(Component decorated) {
        super(decorated);
    }
}
