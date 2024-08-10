package org.example;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("Nguyen Van A");

        Command openAccount = new OpenAccount(account);
        Command closeAccount = new CloseAccount(account);

        BankApp bankApp = new BankApp(openAccount, closeAccount);

        bankApp.clickOpenAccount();
        bankApp.clickCloseAccount();
    }
}
