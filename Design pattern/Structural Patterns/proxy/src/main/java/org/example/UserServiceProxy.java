package org.example;

public class UserServiceProxy implements UserService {
    private String role;
    private UserServiceImpl userService;

    public UserServiceProxy(String name, String role) {
        this.role = role;
        this.userService = new UserServiceImpl(name);
    }

    @Override
    public void load() {
        this.userService.load();
    }

    @Override
    public void insert() {
        if (this.isAdmin()) {
            this.userService.insert();
        } else {
            throw new IllegalAccessError("Access denied.");
        }
    }

    private boolean isAdmin() {
        return "admin".equalsIgnoreCase(this.role);
    }
}
