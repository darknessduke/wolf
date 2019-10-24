package com.wolf.stringTest;

import org.apache.commons.lang.StringUtils;

import java.math.BigDecimal;

public class FormatTest {
    public static void main(String[] args) {
        String test = String.format("1\n\tabc \t2");
        test.toUpperCase();
        System.out.println(test);
    }
}
