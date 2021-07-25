package com.atguigu.java3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StreamAPITest2 {
    //1. Match and search
    @Test
    public void test1(){
        List<Integer> l = new ArrayList<>();
        List<Integer> l2;
        System.out.println(l2.getClass());
        l2 = (ArrayList<Integer>)l;

        System.out.println(l2.getClass());
    }
}
