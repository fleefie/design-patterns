package fr.fleefie.designpatterns.decorator;

public class ConcreteDecoratorC extends Decorator {
    /**
     * Méthode exécutable pour ce décorateur concret.
     */
    @Override
    public void doStuff() {
        System.out.println("[Decorator][C][Avant] Je suis la fonctionnalité C !");
        this.decorated.doStuff();
        System.out.println("[Decorator][C][Après] La fonctionnalité C a fait son travail !");
    }

    /**
     * Constructeur publique, on peut construire cette implémentation.
     */
    public ConcreteDecoratorC(Component decorated) {
        super(decorated);
    }
}
