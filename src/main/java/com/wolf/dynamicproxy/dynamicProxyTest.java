package com.wolf.dynamicproxy;

public class dynamicProxyTest {
    public dynamicProxyTest() {
        System.out.println("abc12324");

    }

    public static void main(String[] args) {
        UserDao test = new UserDaoImpl();
        test.invoke();
        UserDao target = new UserDaoImpl();
        System.out.println("target:" + target.getClass());
        UserDao proxy = (UserDao) new ProxyFactory(target).getProxyInstance();
        System.out.println("proxy instance:" + proxy.getClass());
        proxy.save();

        }
    }

