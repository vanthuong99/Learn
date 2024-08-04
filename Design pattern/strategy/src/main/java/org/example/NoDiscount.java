package org.example;

public class NoDiscount implements Promote {

    @Override
    public double doDiscount(double price) {
        return price;
    }
}
