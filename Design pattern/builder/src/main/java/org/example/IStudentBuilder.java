package org.example;

public interface IStudentBuilder {
    IStudentBuilder setId(String id);

    IStudentBuilder setName(String name);

    IStudentBuilder setAge(int age);

    IStudentBuilder setPhone(String phone);

    IStudentBuilder setEmail(String email);

    Student build();
}
