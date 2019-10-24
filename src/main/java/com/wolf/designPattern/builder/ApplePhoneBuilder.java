package com.wolf.designPattern.builder;

public class ApplePhoneBuilder extends PhoneBuilder {
    @Override
    public void buildCPU() {
        phone.setCpu("A10");
    }
    @Override
    public void buildOS() {
        phone.setOs("IOS");
    }
    @Override
    public void buildBrand() {
        phone.setBrand("Apple");
    }
}
