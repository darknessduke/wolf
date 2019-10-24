package com.wolf.java8.defaulttest;

public interface Animal {
    public void run();
    default  void eat() {
        System.out.println("I'm eating");
    }
    default void sleep() {
        System.out.println("I'm sleeping");
    }
}
