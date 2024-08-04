package org.example.base;

public abstract class MilkTeaDecorator implements IMilkTea {
    private IMilkTea iMilkTea;

    protected MilkTeaDecorator(IMilkTea iMilkTea) {
        this.iMilkTea = iMilkTea;
    }

    public double cost() {
        return this.iMilkTea.cost();
    }
}
