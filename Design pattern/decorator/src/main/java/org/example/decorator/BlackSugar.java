package org.example.decorator;

import org.example.base.IMilkTea;
import org.example.base.MilkTeaDecorator;

public class BlackSugar extends MilkTeaDecorator {
    public BlackSugar(IMilkTea iMilkTea) {
        super(iMilkTea);
    }

    @Override
    public double cost() {
        return 2d + super.cost();
    }
}
