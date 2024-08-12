package org.example;

public class Main {
    public static void main(String[] args) {
        UserService admin = new UserServiceProxy("Admin 1", "admin");
        admin.load();
        admin.insert();

        UserService guest = new UserServiceProxy("Guest 1", "guest");
        guest.load();
        guest.insert();
    }
}
