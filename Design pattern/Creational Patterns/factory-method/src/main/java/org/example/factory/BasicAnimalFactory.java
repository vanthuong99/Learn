package org.example.factory;

import org.example.animal.Animal;
import org.example.animal.Cat;
import org.example.animal.Dog;
import org.example.animal.Duck;

public class BasicAnimalFactory implements AnimalFactory {

    int type = 0;

    @Override
    public Animal createAnimal() {
        switch (type) {
            case 0:
                type++;
                return new Dog();
            case 1:
                type++;
                return new Cat();
            case 2:
                type = 0;
                return new Duck();
        }
        return null;
    }
}
