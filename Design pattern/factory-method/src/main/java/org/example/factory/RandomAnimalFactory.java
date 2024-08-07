package org.example.factory;

import org.example.animal.Animal;
import org.example.animal.Cat;
import org.example.animal.Dog;
import org.example.animal.Duck;

import java.util.Random;

public class RandomAnimalFactory implements AnimalFactory {

    @Override
    public Animal createAnimal() {
        Random random = new Random();
        switch (random.nextInt(3)) {
            case 0:
                return new Dog();
            case 1:
                return new Cat();
            case 2:
                return new Duck();
        }
        return null;
    }
}
