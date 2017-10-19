package com.jerry.designPattern.factory;

public class AndroidFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new AndroidPhone();
    }
}