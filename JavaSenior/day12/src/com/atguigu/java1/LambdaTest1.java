package com.atguigu.java1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

public class LambdaTest1 {
    //Lambda 1. no args no return value
    @Test
    public void test1(){
        Runnable r2 = () -> {System.out.println("Hello this is lambda");};
        r2.run();
    }
    //2. one argument no return value
    @Test
    public void test2(){
        Consumer<String> con = new Consumer<String>(){

            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        con.accept("What's the difference between lie and promise");

        Consumer<String> con1 = (String s) -> {
            System.out.println(s);
        };
        con1.accept("One is the listener takes it seriously while the " +
                "other is the speaker take it seriously");
    }

    //3. Data type is omitted, could be inferred by the compiler, which is called Type Inference
    @Test
    public void test3(){

        Consumer<String> con1 = (String s) -> {
            System.out.println(s);
        };
        con1.accept("One is the listener takes it seriously while the " +
                "other is the speaker take it seriously");
        Consumer<String> con2 = (s) -> {
            System.out.println(s);
        };
        con2.accept("One is the listener takes it seriously while the " +
                "other is the speaker take it seriously");
    }
    @Test
    public void test4(){

        ArrayList<String>  list = new ArrayList<>();//Type Inference
        int[] arr = {1,2,3};// Type Inference

    }

    //4. Lambda needs only one argument then the parenthesis could be omitted
    @Test
    public void test5(){

        Consumer<String> con1 = (s) -> {
            System.out.println(s);
        };
        con1.accept("One is the listener takes it seriously while the " +
                "other is the speaker take it seriously");
        System.out.println("*******");

        Consumer<String> con2 = s -> {
            System.out.println(s);
        };
        con2.accept("One is the listener takes it seriously while the " +
                "other is the speaker take it seriously");
    }
    //5. Lambda needs more than two args and multiple statements in the body and have return value
    @Test
    public void test6(){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("*******");
        Comparator<Integer> com2 = (o1,o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return o1.compareTo(o2);
        };
    }
    // When there is only one statement, the curly braces could be omitted
    @Test
    public void test7(){
        Comparator<Integer> com1 = (o1,o2) -> o1.compareTo(o2);

    }

}
