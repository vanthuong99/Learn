package org.example;

import org.example.factory.AnimalFactory;
import org.example.factory.FourLegAnimalFactory;
import org.example.factory.TwoLegAnimalFactory;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory;
        Random random = new Random();
        if (random.nextBoolean()) {
            animalFactory = new TwoLegAnimalFactory();
        } else {
            animalFactory = new FourLegAnimalFactory();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(animalFactory.createAnimal().getName());
        }
    }
}
