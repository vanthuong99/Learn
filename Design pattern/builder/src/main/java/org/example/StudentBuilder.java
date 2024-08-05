package org.example;

public class StudentBuilder implements IStudentBuilder {
    private String id;
    private String name;
    private int age;
    private String phone;
    private String email;

    @Override
    public IStudentBuilder setId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public IStudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public IStudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public IStudentBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public IStudentBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public Student build() {
        return new Student(this.id, this.name, this.age, this.phone, this.email);
    }
}
