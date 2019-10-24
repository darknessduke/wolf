package com.wolf.java8.optional.flatmap;

import java.util.Optional;

public class Person {
    String name;
    Integer age;
    String password;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<Integer> getAge() {
        return Optional.ofNullable(age);
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Optional<String> getPassword() {
        return  Optional.ofNullable(password);
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
