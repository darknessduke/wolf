package com.wolf.java8.stream;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest2 {
    public static void main(String args[]) {
        String str = new String("ABC");

        Optional<String> oStr = Optional.empty();

        System.out.println("str:");
        //System.out.println(StringUtils.isEmpty(oStr.get()));

        Optional<Optional<String>> nonEmptyOtionalGender = Optional.of(Optional.of("male"));
        System.out.println("Optional value   :: " + nonEmptyOtionalGender);
        System.out.println("Optional.map     :: " + nonEmptyOtionalGender.map(gender -> gender.map(String::toUpperCase)));
        System.out.println("Optional.flatMap :: " + nonEmptyOtionalGender.flatMap(gender -> gender.map(String::toUpperCase)));


        List<String> sList = Arrays.asList("A","B",null, "D","", "e");
        Optional<List<String>> s2List = Optional.ofNullable(sList);
        System.out.println(sList.stream().map(String::toUpperCase).map(String::trim));    }
}
