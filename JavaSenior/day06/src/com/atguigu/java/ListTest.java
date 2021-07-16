package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {

    @Test
    public void test2(){
        /*
        add(Object obj)
        remove(int index) remove(Object obj)
        set(int index, Object ele)
        get(int index)
        add(int index, Object ele)
        size()
        iteration: Iterator, enhanced for loop, for loop

         */
        ArrayList<Object> list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(new Person("Tom", 12));
        list.add(456);

        //Iterator

        Iterator<Object> iter = list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
    @Test
    public void test1(){
        ArrayList<Object> list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(new Person("Tom", 12));
        list.add(456);

        System.out.println(list);

        // void add(int index, Object ele)
        list.add(1,"BB");
        System.out.println(list);

        //boolean addAll(int index, Collection eles)
        List list1 = Arrays.asList(12,23,34);
        list.addAll(1, list1);
        System.out.println(list.size());

        //indexOf(Object obj) return -1 if not exists.

        //List sublist(int fromIndex, int toIndex) inclusive and exclusive
        list.subList(2,4);
    }

}
