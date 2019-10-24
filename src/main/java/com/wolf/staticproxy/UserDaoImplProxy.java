package com.wolf.staticproxy;

public class UserDaoImplProxy implements UserDao {
    public UserDao target = new UserDaoImpl();

    @Override
    public void save() {
        target.save();
        System.out.println("saving in proxy");
    }

    @Override
    public void find() {
        target.find();
        System.out.println("finding in proxy");
    }

}
