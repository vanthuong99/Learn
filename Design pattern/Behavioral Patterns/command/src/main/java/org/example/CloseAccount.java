package org.example;

public class CloseAccount implements Command {
    private final Account account;

    public CloseAccount(Account account) {
        this.account = account;
    }

    @Override
    public void execute() {
        this.account.close();
    }
}
