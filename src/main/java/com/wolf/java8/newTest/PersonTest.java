package com.wolf.java8.newTest;

public class PersonTest {
    public static void main(String[] args) {
        PersonFactory<Student> personFactory = Student::new;
        //Person person = personFactory.create("Peter","Pan");

    }
}
