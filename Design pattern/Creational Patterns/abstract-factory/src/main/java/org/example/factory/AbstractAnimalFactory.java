package org.example.factory;

import org.example.animal.Animal;

public abstract class AbstractAnimalFactory implements AnimalFactory {

    @Override
    public abstract Animal createAnimal();
}
