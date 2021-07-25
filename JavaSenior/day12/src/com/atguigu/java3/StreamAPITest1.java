package com.atguigu.java3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPITest1 {
    @Test
    //filter and slice
    public void test1(){
        List<Integer> list = Arrays.asList(1,2,3,4,5,3,4,5,6);
        //fileter (Predicate p)

        Stream<Integer> stream = list.stream();
        stream.filter(i -> i % 2 ==1 ).forEach(System.out::println);
        //limit(n): stop at the first n elements
        list.stream().limit(3).forEach(System.out::println);
        //Skip(n)L skip the first n elements, if less than n in the stream
        // then nothing happened distinct
        list.stream().distinct().forEach(System.out::println);

    }
    @Test
    public void test2(){
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        list.stream().map(String::toUpperCase).forEach(System.out::println);
        //flatMap(Function f) accetp a function as parameter, change each value
        // into another stream, then make them into one stream

    }
    @Test
    public void test4(){
        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList list2 = new ArrayList();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        list1.addAll(list2);
        System.out.println(list1.getClass());
    }
    @Test
    public void arraysTest(){
        List l1 = Arrays.asList(1, 2, 3);
        List l2 = Arrays.asList(4, 5, 6);
        l1.add(l2);

        System.out.println(l1);
    }
}
