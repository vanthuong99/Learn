package org.example;

import org.example.animal.Animal;
import org.example.factory.AnimalFactory;
import org.example.factory.BasicAnimalFactory;
import org.example.factory.RandomAnimalFactory;

public class Main {
    public static void main(String[] args) {
        AnimalFactory basicAnimalFactory = new BasicAnimalFactory();
        AnimalFactory randomAnimalFactory = new RandomAnimalFactory();
        System.out.println("Basic animal factory:");
        for (int i = 0; i < 10; i++) {
            Animal animal = basicAnimalFactory.createAnimal();
            animal.printName();
        }
        System.out.println("Random animal factory:");
        for (int i = 0; i < 10; i++) {
            Animal animal = randomAnimalFactory.createAnimal();
            animal.printName();
        }
    }
}
