package org.example;

import lombok.Data;

@Data
public class Ticket {
    private String name;
    private double price;
    private Promote promote;

    public double getPriceAfterDiscount() {
        return this.promote.doDiscount(this.price);
    }
}
