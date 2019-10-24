package com.wolf.java8.optional.flatmap;

import java.util.Optional;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("John",26);
        Optional personOptional = Optional.of(person);
/*
        Optional<Optional<String>> nameOptionalWrapper
                = personOptional.map(Person::getName);

 */
    }
}
