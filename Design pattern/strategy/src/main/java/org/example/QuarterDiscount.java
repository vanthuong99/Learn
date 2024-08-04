package org.example;

public class QuarterDiscount implements Promote {

    @Override
    public double doDiscount(double price) {
        return price * 0.75;
    }
}
