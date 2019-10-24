package com.wolf.java8.newTest;

public interface PersonFactory<P>{
    P create(String firstName, String lastName);
}
