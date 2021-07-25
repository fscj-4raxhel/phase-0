package com.atguigu.java1;

import org.junit.Test;

import java.util.Comparator;

public class LambdaTest {
    @Test
    public void test1(){

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("I love Beijing");
            }
        };
        r1.run();
    }

    Runnable r2 = () -> System.out.println("I love Toronto too");
    @Test
    public void test2(){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        int compare1 = com1.compare(22,21);
        System.out.println(compare1);
    }

    //Lambda expression
    Comparator<Integer> com2 = (o1,o2) -> Integer.compare(o1,o2);
    //Method reference
    Comparator<Integer> com3 = Integer :: compare;
}
