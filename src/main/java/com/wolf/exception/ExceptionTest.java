package com.wolf.exception;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            throwChildException();
        } catch (SuperException e) {
            if (e instanceof  ChildException)
                System.out.println("child exception was caught");
        }
    }

    private static void throwChildException() {
        throw new ChildException();
    }
}