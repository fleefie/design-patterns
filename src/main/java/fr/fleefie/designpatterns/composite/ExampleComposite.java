package fr.fleefie.designpatterns.composite;

/**
 * Patterne: Composite.
 */
public class ExampleComposite {
    /**
     * Méthode d'exécution de l'exemple.
     */
    public static void run() {
        // On créé notre arbre de composition récursif.
        // Forme:
        // Composite
        // |
        // +--Composite
        // |  +--LeafA
        // |  +--LeafB
        // |  +--LeafB
        // |
        // +--Composite
        //    +--LeafB
        Composite comp = new Composite()
                            .addChild(
                                new Composite()
                                    .addChild(
                                        new LeafA())
                                    .addChild(
                                        new LeafA())
                                    .addChild(
                                        new LeafB()))
                            .addChild(
                                new Composite()
                                    .addChild(
                                        new LeafB()));
        System.out.println("[Composite] Exemple d'exécution récursive...");
        comp.doStuff();
    }
}
