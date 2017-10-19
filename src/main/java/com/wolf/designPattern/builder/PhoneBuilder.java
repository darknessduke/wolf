package com.wolf.designPattern.builder;

public abstract class PhoneBuilder {
    protected Phone phone;

    public Phone getPhone() {
        return phone;
    }

    public void createNewPhone() {
        phone = new Phone();
    }
    public abstract void buildCPU();
    public abstract void buildOS();
    public abstract void buildBrand();
}
