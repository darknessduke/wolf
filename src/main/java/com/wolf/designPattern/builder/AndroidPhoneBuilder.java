package com.wolf.designPattern.builder;

public class AndroidPhoneBuilder extends PhoneBuilder {
    @Override
    public void buildCPU() {
        phone.setCpu("Qualcomm");
    }
    @Override
    public void buildOS() {
        phone.setOs("Android");
    }
    @Override
    public void buildBrand() {
        phone.setBrand("Google");
    }
}
