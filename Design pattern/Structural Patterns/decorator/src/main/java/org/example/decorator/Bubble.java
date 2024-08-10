package org.example.decorator;

import org.example.base.IMilkTea;
import org.example.base.MilkTeaDecorator;

public class Bubble extends MilkTeaDecorator {
    public Bubble(IMilkTea iMilkTea) {
        super(iMilkTea);
    }

    @Override
    public double cost() {
        return 1d + super.cost();
    }
}
