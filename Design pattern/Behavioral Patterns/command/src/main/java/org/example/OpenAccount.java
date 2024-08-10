package org.example;

public class OpenAccount implements Command {
    private final Account account;

    public OpenAccount(Account account) {
        this.account = account;
    }

    @Override
    public void execute() {
        this.account.open();
    }
}
