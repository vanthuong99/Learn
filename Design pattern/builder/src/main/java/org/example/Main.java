package org.example;

public class Main {
    public static void main(String[] args) {
        Student student = new StudentBuilder()
                .setId("1234567890")
                .setName("Tran Van A")
                .setAge(25)
                .setPhone("0987654321")
                .setEmail("abcdef@gmail.com")
                .build();
        student.printInfo();
    }
}
