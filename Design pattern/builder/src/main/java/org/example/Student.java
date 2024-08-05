package org.example;

public class Student {
    private String id;
    private String name;
    private int age;
    private String phone;
    private String email;

    public Student(String id, String name, int age, String phone, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public void printInfo() {
        System.out.printf("- id: %s\n- name: %s\n- age: %s\n- phone: %s\n- email: %s\n", this.id, this.name, this.age, this.phone, this.email);
    }
}
