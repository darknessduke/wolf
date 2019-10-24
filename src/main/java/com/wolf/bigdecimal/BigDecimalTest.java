package com.wolf.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(17.95);
        BigDecimal b = new BigDecimal(22.000011321);

        System.out.println("b=" + b.setScale(2, RoundingMode.DOWN));
        BigDecimal total = new BigDecimal(0);
        total = total.add(a);
        total = total.add(b);

        System.out.println("total:" + total);
    }
}
