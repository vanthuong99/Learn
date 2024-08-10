package org.example.decorator;

import org.example.base.IMilkTea;
import org.example.base.MilkTeaDecorator;

public class WhiteBubble extends MilkTeaDecorator {
    public WhiteBubble(IMilkTea iMilkTea) {
        super(iMilkTea);
    }

    @Override
    public double cost() {
        return 1.5d + super.cost();
    }
}
