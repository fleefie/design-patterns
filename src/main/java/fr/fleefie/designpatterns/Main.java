package fr.fleefie.designpatterns;

import fr.fleefie.designpatterns.factory.ExampleFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lancement de tous les exemples !");

        ExampleFactory.run(1);
    }
}
