package fr.fleefie.designpatterns;

import fr.fleefie.designpatterns.abstractfactory.ExampleAbstractFactory;
import fr.fleefie.designpatterns.factory.ExampleFactory;
import fr.fleefie.designpatterns.singleton.ExampleSingleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lancement de tous les exemples !");

        ExampleFactory.run(1);
        ExampleAbstractFactory.run(1);
        ExampleSingleton.run();
    }
}
