package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectisonTest {
    @Test
    public void test1(){
        List list = new ArrayList();
        list.add(123);
        list.add(-123);
        list.add(-123);
        list.add(-123);
        list.add(-123);
        list.add(23);
        list.add(45);
        list.add(-13);
        list.add(11);

        System.out.println(list);

        Collections.reverse(list);

        Collections.shuffle(list);

//        Collections.sort(list);
        Collections.swap(list,1,2);

        int frequency = Collections.frequency(list,-123);
        System.out.println(frequency);

        //IndexOutOfBoundsException("Source does not fit in dest")
//        List dest = new ArrayList();
//        Collections.copy(dest,list);

        List dest = Arrays.asList(new Object[list.size()]);

        Collections.copy(dest,list);
        System.out.println(dest);

    }
}
