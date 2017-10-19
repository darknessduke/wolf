package com.jerry.designPattern.factory;

public class AppleFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }
}
