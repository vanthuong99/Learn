package org.example;

public class UserServiceImpl implements UserService {
    private String name;

    public UserServiceImpl(String name) {
        this.name = name;
    }

    @Override
    public void load() {
        System.out.printf("%s loaded.\n", this.name);
    }

    @Override
    public void insert() {
        System.out.printf("%s inserted.\n", this.name);
    }
}
