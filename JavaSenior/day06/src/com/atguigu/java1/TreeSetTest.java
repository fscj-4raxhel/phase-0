package com.atguigu.java1;

import org.junit.Test;

import java.util.TreeSet;

public class TreeSetTest {
    @Test
    public void test1(){
        TreeSet set = new TreeSet();
        set.add(1234);
        set.add(1234);
//        set.add("AA");// This will raise ClassCaseException
        set.add(1234);


    }
}
