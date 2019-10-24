package com.wolf.designPattern.builder;

public class Test {
    public static void main(String[] args){
        Worker worker=new Worker();
        PhoneBuilder appleBuilder=new ApplePhoneBuilder();
        worker.setPhoneBuilder(appleBuilder);
        worker.constructPhone();
        Phone phone = worker.getPhone();
        phone.info();
    }
}
