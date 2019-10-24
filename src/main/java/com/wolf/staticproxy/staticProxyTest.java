package com.wolf.staticproxy;

public class staticProxyTest {
    public static void main(String[] args) {
        UserDaoImplProxy u = new UserDaoImplProxy();
        u.save();
        u.find();
    }
}
