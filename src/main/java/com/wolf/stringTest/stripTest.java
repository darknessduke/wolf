package com.wolf.stringTest;

import org.apache.commons.lang.StringUtils;

public class stripTest {
    public static void main(String[] args) {
        String testStr1 = null;
        String testStr2 = "   abc   ";
        String testStr3 = "             ";
        /*
        System.out.println("stripToEmpty");
        System.out.println("[" + StringUtils.stripToEmpty(testStr1) + "]");
        System.out.println("[" + StringUtils.stripToEmpty(testStr2) + "]");
        System.out.println("[" + StringUtils.stripToEmpty(testStr3) + "]");
*/
        System.out.println("stripToNull");
        String a = null;
        System.out.println("a1 = [" + a + "]");

        a += StringUtils.stripToEmpty(testStr1);

        System.out.println("a = [" + a + "]");


        System.out.println("[" + StringUtils.stripToEmpty(testStr1) + "]");
        System.out.println("[" + StringUtils.stripToNull(testStr2) + "]");
        System.out.println("[" + StringUtils.stripToNull(testStr3) + "]");

        /*
        System.out.println("strip");
        System.out.println("[" + StringUtils.strip(testStr1) + "]");
        System.out.println("[" + StringUtils.strip(testStr2) + "]");
        System.out.println("[" + StringUtils.strip(testStr3) + "]");
        */



    }
}
