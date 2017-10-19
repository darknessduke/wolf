package com.wolf.designPattern.builder;

public class Worker {
    private PhoneBuilder phoneBuilder;
    public void setPhoneBuilder(PhoneBuilder phoneBuilder) {
        this.phoneBuilder = phoneBuilder;
    }

    public Phone getPhone() {
        return phoneBuilder.getPhone();
    }
    public void constructPhone() {
        phoneBuilder.createNewPhone();
        phoneBuilder.buildCPU();
        phoneBuilder.buildOS();
        phoneBuilder.buildBrand();
    }
}
