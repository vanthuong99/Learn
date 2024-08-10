package org.example;

public class HaftDiscount implements Promote {

    @Override
    public double doDiscount(double price) {
        return price * 0.5;
    }
}
