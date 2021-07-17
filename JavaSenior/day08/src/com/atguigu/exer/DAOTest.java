package com.atguigu.exer;

import org.junit.Test;

import java.util.List;

public class DAOTest{
    @Test
    public void test1(){
        User u1 = new User(1,12,"Tom");
        User u2 = new User(3,2,"Jerry");
        DAO<User> userDAO = new DAO<>();
        userDAO.save("1",u1);
        List<User> userList = userDAO.list();
        for (User u : userList ) {
            System.out.println(u);
        }
        User element1 = userDAO.get("1");
        System.out.println("Before " + element1);
        userDAO.update("1", u2);
        element1 = userDAO.get("1");
        System.out.println("After " + element1);
        userDAO.save("2",u1);
        userList = userDAO.list();
        for (User u : userList ) {
            System.out.println(u);
        }
        User u3 = new User(2,21,"Dogge");
        userDAO.save("3,",u3);
        userList = userDAO.list();
        for (User u : userList ) {
            System.out.println(u);
        }
        userDAO.delete("3,");
        userList = userDAO.list();
        for (User u : userList ) {
            System.out.println(u);
        }

    }
}
