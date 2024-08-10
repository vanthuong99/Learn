package org.example.factory;

import org.example.animal.Animal;
import org.example.animal.Chicken;
import org.example.animal.Duck;

import java.util.Random;

public class TwoLegAnimalFactory extends AbstractAnimalFactory {

    @Override
    public Animal createAnimal() {
        Random random = new Random();
        switch (random.nextInt(2)) {
            case 0:
                return new Duck();
            case 1:
                return new Chicken();
        }
        return null;
    }
}
