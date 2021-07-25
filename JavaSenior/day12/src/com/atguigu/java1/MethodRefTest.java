package com.atguigu.java1;

import org.junit.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;

public class MethodRefTest {
    //Consumer: void accept(T t);
    // System.out.println(String s);
    // obj::method
    @Test
    public void test1(){
        //Lambda expression
        Consumer<String> con1 = str -> System.out.println(str);
        con1.accept("Beijng");

        System.out.println("*********");
        PrintStream ps = System.out;
        Consumer<String> con2 = ps::println;
        con2.accept("beijing");
    }

    // Class::static method
    // Comparator : int compare(T t1, T t2)
    // Integer int compare(T t1, T t2)
    @Test
    public void testr(){
        // Lambda expression
        Comparator<Integer> com1 = (t1, t2) -> Integer.compare(t1,t2);

        //Method reference
        Comparator<Integer> com2 = Integer::compare;

    }
    //Function : R apply(T t)
    // Math : Long round(Double d)
    @Test
    public void test4(){
        //Lambda
        Function<Double, Long> func1 = d -> Math.round(d);
        //Method Reference
        Function<Double, Long> func2 = Math::round;

    }
    //3. class :: instance methods
    // Comparator : int Compare(T t1, T t2)
    // String ; int t1.compareTo(t2)
    @Test
    public void test5(){
        Comparator<String> com1 = (s1,s2) -> s1.compareTo(s2);
        System.out.println(com1.compare("abc", "abd"));

    }
}
