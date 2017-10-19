package com.jerry.designPattern.factory;

public class ApplePhone implements Phone {
    @Override
    public void call() {
        System.out.println("This is Apple Phone calling........");
    }
}
