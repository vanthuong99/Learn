package org.example;

public class Account {
    public String name;

    public Account(String name) {
        this.name = name;
    }

    public void open() {
        System.out.printf("Account %s opened.\n", this.name);
    }

    public void close() {
        System.out.printf("Account %s closed.\n", this.name);
    }
}
