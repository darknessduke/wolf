package com.wolf.java8.optional.list;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ListTest {
    public static void main(String[] args) {
        List<String> companyList = Arrays.asList("Microsoft", "ebay","incomm");

        Optional<List<String>> o = Optional.of(companyList);

        int size = o.map(List::size).orElse(0);
        System.out.println(size);
    }
}
