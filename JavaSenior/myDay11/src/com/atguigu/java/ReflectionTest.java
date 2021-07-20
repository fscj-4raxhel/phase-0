package com.atguigu.java;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {
    //Without reflection, this is what we could to with Person class
    @Test
    public void test1(){
        //1. Create object
        Person p1 = new Person("Tom",21);

        //2. call field and methods
        p1.age = 10;
        System.out.println(p1.toString());

        p1.show();

    }
    @Test
    public void test2() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException, NoSuchFieldException {
        //1. Create object through reflection
        Class clazz = Person.class;
        Constructor cons = clazz.getConstructor(String.class, int.class);
        Object obj = cons.newInstance("Tom", 12);
        Person p = (Person)obj;
        System.out.println(p.toString());
        //2.call field and methods through reflection
        //fields
        Field age = clazz.getDeclaredField("age");
        age.set(p,10);
        System.out.println(p.toString());
        //Methods
        Method show = clazz.getDeclaredMethod("show");
        show.invoke(p);
        
        //Call private constructs
        Constructor cons1 = clazz.getDeclaredConstructor(String.class);
        cons1.setAccessible(true);
        Person p1 = (Person)cons1.newInstance("Jerry");
        System.out.println(p1);

        //Call private fields
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p1,"HanMeimei");

        System.out.println(p1);

        // Call private methods
        Method showNation = clazz.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        String nation = (String) showNation.invoke(p1,"China");
        System.out.println(nation);
    }
    //How to get Runtime class object, instance of Class
    @Test
    public void test3() throws ClassNotFoundException {
        //1. Call the .class field of the runtime class
        Class<Person> clazz1 = Person.class;
        System.out.println(clazz1);

        //2. call getClass() from the instance of runtime class
        Person p1 = new Person();
        Class clazz2 = p1.getClass();
        System.out.println(clazz2);
        //3. Call static method forName(String classPath)
        Class clazz3 = Class.forName("com.atguigu.java.Person");
        System.out.println(clazz3);

        //4. Use Classloader
        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        Class clazz4 = classLoader.loadClass("com.atguigu.java.Person");
        System.out.println(clazz4);

    }
}
