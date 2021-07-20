package com.atguigu.java2;

import com.atguigu.java.Person;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {
    @Test
    public void testField() throws Exception {
        Class clazz = Person.class;

        Person p = (Person)clazz.newInstance();
        //retrieve certain field, need public modifier
        Field id = clazz.getDeclaredField("id");

        id.set(p,1001);

    }
    @Test
    public void testField1() throws Exception{
        Class clazz = Person.class;

        Person p = (Person) clazz.newInstance();
        Field name = clazz.getDeclaredField("name");
        // Ensure than you could set
        name.setAccessible(true);

        name.set(p,"Tom");

        System.out.println(name.get(p));

    }
    @Test
    public void testMethod() throws Exception{
        Class clazz = Person.class;

        Person p = (Person) clazz.newInstance();

        //1. get certain methods
        Method show = clazz.getDeclaredMethod("show", String.class);
        //invoke(): parameter 1 name of the calleer
        // parameter 2 parameter list
        show.invoke(p,"CHN");//p.show("CHN");
    }
}
