package com.wolf.java8.optional;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        String name="Jerry";
        Optional<String> oStr = Optional.of(name);
        Optional<String> oStr1 = Optional.ofNullable(null);
        Optional<String> oEmpty = Optional.empty();
        String surname = null;
        String oStr2 = Optional.ofNullable(surname).orElse("John");
        String name3 = Optional.ofNullable(surname).orElseGet(() -> "john");

        int year = 2016;
        Optional<Integer> optionalInteger = Optional.of(year);
        System.out.println(optionalInteger.filter(y -> y == 2017).isPresent());


        oStr.ifPresent(name1 -> System.out.println("here:" + name.length()));
        System.out.println("ostr:" + oStr.isPresent());
        System.out.println("ostr1:" + oStr1.isPresent());
        System.out.println("ostr2:" + oStr2);
        System.out.println("name3:" + name3);

        System.out.println("ostr:" + oStr.toString());
        System.out.println("ostr1:" + oStr1.toString());

    }
}
