package com.atguigu.java;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.util.Date;

public class AnnotationTest {
    public static void main(String[] args) {

        Date date = new Date(2021,12,21);
        @SuppressWarnings({"unused","rawtypes"})
        int number1;
    }
    @Test
    public void testGetAnnotation(){
        Class clazz = Student.class;
        Annotation[] annotations = clazz.getAnnotations();
        for (int i = 0; i < annotations.length; i++) {
            System.out.println(annotations[i]);
        }
    }
}

@MyAnnotation("hi")
class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void walk(){
        System.out.println("Person walk");
    }
    public void eat(){
        System.out.println("Person eat");
    }
}

interface Info{
    void show();
}

class Student extends Person implements Info{

    @Override
    public void walk() {
        System.out.println("Student walk");
    }

    @Override
    public void show() {

    }
}
