package com.wolf.dynamicproxy;

public interface UserDao {
    public void save();
    public void find();
    default void invoke() {
        System.out.println("A test is going");
    }
}
