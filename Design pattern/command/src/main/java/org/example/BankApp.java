package org.example;

public class BankApp {
    private Command openAccount;
    private Command closeAccount;

    public BankApp(Command openAccount, Command closeAccount) {
        this.openAccount = openAccount;
        this.closeAccount = closeAccount;
    }

    public void clickOpenAccount() {
        this.openAccount.execute();
    }

    public void clickCloseAccount() {
        this.closeAccount.execute();
    }
}
