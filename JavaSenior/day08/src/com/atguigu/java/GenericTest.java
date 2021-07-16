package com.atguigu.java;

import org.junit.Test;

import java.util.*;

public class GenericTest {
    @Test
    public void test1(){
        ArrayList list  = new ArrayList();
        list.add(78);
        list.add(76);
        list.add(89);
        list.add(88);
        //Problem 1: not type safe
//        list.add("Tom");

        for(Object score: list){
            //problem 2: ClassCastException
            int stuScore = (Integer) score;

            System.out.println(stuScore);
        }

    }

    @Test
    public void test2(){
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(78);
        list.add(76);
        list.add(89);
        list.add(65);
        //cannot compile
//        list.add("Tom");
        //Iteration method1
        for(Integer score: list){
            int stuScore = score;
            System.out.println(stuScore);
        }

        //Iteration method2
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
    @Test
    public void test3(){
        Map<String,Integer> map = new HashMap<String, Integer>();

        map.put("Tom",87);
        map.put("Jerry",87);
        map.put("Jack",67);

//        map.put(123,"Chris");

        //Nested generic type
        Set<Map.Entry<String,Integer>> entry = map.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator = entry.iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Integer> e = iterator.next();
            String key = e.getKey();
            Integer val = e.getValue();
            System.out.println("Key" + key + "====> value" + val);

        }
    }
    @Test
    public void test4(){
        ArrayList<String> list1 = new ArrayList<>();
        AbstractList<String> list2 = null;
        List<String> list3 = null;
        list2 = list1;
        list3= list1;
//        list2 = list3;
        list3 = list2;
    }
    public void show(ArrayList<String> list){

    }
    public void show(List<String> list){

    }

    @Test
    public void test5(){
        List<String> l1 = null;
        List<Object> l2 = null;

        List<?> list = null;

        list = l1;
        list = l2;

        List<String> l3 = new ArrayList<>();

        l3.add("AA");
        l3.add("BB");
        l3.add("CC");

        list = l3;
        //Cannot add elements to List<?>
//        list.add("ASV");
        // Except for null
        list.add(null);
    }

    public void iteration(List<?> l){
        Iterator<?> iterator = l.iterator();
        while(iterator.hasNext()){
            Object e = iterator.next();
            System.out.println(e);
        }
    }

    @Test
    public void test6(){

        List<? extends Order> list1 = null;
        List<? super Order> list2 = null;

        List<SubOrder> list3 = null;
        List<Order> list4 = null;
        List<Object> list5 = null;

        //extends <=
        list1 = list3;
        list1 = list4;
//        list1 = list5;
        //super >=


    }


}
