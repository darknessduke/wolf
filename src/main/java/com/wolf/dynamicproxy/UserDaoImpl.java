package com.wolf.dynamicproxy;

public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("Save in UserDaoImpl");
    }

    @Override
    public void find() {
        System.out.println("Find in UserDaoImpl");
    }
}
