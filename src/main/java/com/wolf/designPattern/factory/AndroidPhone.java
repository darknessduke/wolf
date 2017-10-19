package com.wolf.designPattern.factory;

public class AndroidPhone implements Phone {
    @Override
    public void call() {
        System.out.println("This is Android Phone calling......");
    }
}
