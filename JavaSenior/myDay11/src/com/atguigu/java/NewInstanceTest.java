package com.atguigu.java;

import org.junit.Test;

public class NewInstanceTest {
    @Test
    public void test1() throws InstantiationException, IllegalAccessException {
        Class<Person> clazz = Person.class;

        Object obj = clazz.newInstance();
        System.out.println(obj);
    }
}
