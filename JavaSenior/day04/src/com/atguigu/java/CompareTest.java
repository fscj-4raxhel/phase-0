package com.atguigu.java;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class CompareTest {
    @Test
    public void test1(){
        String arr[] = new String[]{"AA","KK","DD","JJ","MM","DOG"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    @Test
    public void test2(){
        Goods[] arr = new Goods[4];
        arr[0] = new Goods("Dell",12);
        arr[1] = new Goods("Alienware",22);
        arr[2] = new Goods("Razer",52);
        arr[3] = new Goods("ROG",62);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    @Test
    public void test3(){
        String arr[] = new String[]{"AA","KK","DD","JJ","MM","DOG"};
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(arr));


    }
}
class Goods implements Comparable{
    private String name;
    private double price;

    public Goods() {
    }

    public Goods(String name) {
        this.name = name;
    }

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Goods)
        {
            Goods goods = (Goods)o;
            if(this.price < goods.price){
                return 1;
            }else if (this.price > goods.price){
                return -1;
            }else{
                return 0;
            }

        }
        throw new RuntimeException("Type not matched!");
    }
}
