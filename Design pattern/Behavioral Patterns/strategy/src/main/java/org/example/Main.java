package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.print("Start!!!\n");
        Random random = new Random();
        for (int i = 1; i <= 5; i++) {
            Ticket ticket = new Ticket();
            ticket.setName("Ticket " + i);
            ticket.setPrice(50 * i);
            int promoteType = random.nextInt(3);
            switch (promoteType) {
                case 0:
                    ticket.setPromote(new NoDiscount());
                    break;
                case 1:
                    ticket.setPromote(new QuarterDiscount());
                    break;
                default:
                    ticket.setPromote(new HaftDiscount());
            }
            System.out.printf("%s: %s -> %s -> %s\n", ticket.getName(), ticket.getPrice(), ticket.getPromote().getClass().getName(), ticket.getPriceAfterDiscount());
        }
        System.out.print("End!!!\n");
    }
}
