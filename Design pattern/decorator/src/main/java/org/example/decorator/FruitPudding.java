package org.example.decorator;

import org.example.base.IMilkTea;
import org.example.base.MilkTeaDecorator;

public class FruitPudding extends MilkTeaDecorator {
    public FruitPudding(IMilkTea iMilkTea) {
        super(iMilkTea);
    }

    @Override
    public double cost() {
        return 3d + super.cost();
    }
}
