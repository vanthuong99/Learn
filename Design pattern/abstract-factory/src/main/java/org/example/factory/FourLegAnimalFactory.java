package org.example.factory;

import org.example.animal.Animal;
import org.example.animal.Cat;
import org.example.animal.Dog;

import java.util.Random;

public class FourLegAnimalFactory extends AbstractAnimalFactory {

    @Override
    public Animal createAnimal() {
        Random random = new Random();
        switch (random.nextInt(2)) {
            case 0:
                return new Dog();
            case 1:
                return new Cat();
        }
        return null;
    }
}
