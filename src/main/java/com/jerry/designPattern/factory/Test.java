package com.jerry.designPattern.factory;

public class Test {
    public static void main(String[] args) {
        Phone android = new AndroidFactory().createPhone();
        android.call();
    }
}