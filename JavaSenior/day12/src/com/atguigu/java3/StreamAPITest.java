package com.atguigu.java3;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPITest {


    @Test
    public void test1(){
//        default Stream<E> stream(){}
        List<Integer> ints = Arrays.asList(1,2,3,4,5,5);

        Stream<Integer> stream = ints.stream();

        Stream<Integer> parallelStream = ints.parallelStream();
    }
    @Test
    public void test2(){
        int[] arr = new int[]{1,2,3,4};
        IntStream stream = Arrays.stream(arr);

    }
    @Test
    public void test3(){
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6);

    }
    @Test
    public void test4(){
        /*
        public stati<T> Stream<T> interate(final T seed, final UnaryOperator<T> f)
         */
        Stream.iterate(0, t -> t + 2).limit(10).forEach(System.out::println);
        /*
        public stati<T> Stream<T> generate(Supplier<T> s)
         */
        Stream.generate(Math::random).limit(10).forEach(System.out::println);
    }
}
