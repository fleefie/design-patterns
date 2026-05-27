package fr.fleefie.designpatterns.singleton;

/**
 * Patterne: Singleton.
 */
public class ExampleSingleton {
    /**
     * Méthode d'exemple d'utilisation d'un singleton.
     */
    public static void run() {
        // On créé deux instances de notre singleton, qui sont liés à la même instance.
        IntegerSingletonEager sing1 = IntegerSingletonEager.getInstance();
        IntegerSingletonEager sing2 = IntegerSingletonEager.getInstance();

        // On observe qu'ils sont ici bien liés
        System.out.println("[Singleton] Singleton 1: " + sing1.getValue() + 
                           ", Singleton 2: " + sing2.getValue() + ".");
        
        System.out.println("[Singleton] On change la valeur de la première instance !");
        sing1.setValue(999);
        System.out.println("[Singleton] Singleton 1: " + sing1.getValue() + 
                           ", Singleton 2: " + sing2.getValue() + ".");


        System.out.println("[Singleton] On change la valeur de la deuxième instance !");
        sing2.setValue(999);
        System.out.println("[Singleton] Singleton 1: " + sing1.getValue() + 
                           ", Singleton 2: " + sing2.getValue() + ".");

        System.out.println("[Singleton] On instantie un troixième singleton !");
        IntegerSingletonEager sing3 = IntegerSingletonEager.getInstance();
        System.out.println("[Singleton] Valeur du troixième singleton: " + sing3.getValue());
    }
}
