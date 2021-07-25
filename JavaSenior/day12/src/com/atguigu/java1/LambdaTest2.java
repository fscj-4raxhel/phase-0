package com.atguigu.java1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaTest2 {

    @Test
    public void test1(){
        happyTime(500,new Consumer<Double>(){
            @Override
            public void accept(Double aDouble) {
                System.out.println("I consumed" + aDouble + "dollars");
            }
        });
        happyTime(400,money -> System.out.println("I consumed" + money + "dollars" ));

    }

    public void happyTime(double money, Consumer<Double> con){
        con.accept(money);
    }
    @Test
    public void test2(){
        List<String> list = Arrays.asList("Beijing", "Nanjing");
    }
    public List<String> filterString(List<String> list, Predicate<String> pre){
        ArrayList<String> res = new ArrayList<>();

        for(String s : list){
            if(pre.test(s))
                res.add(s);
        }
        return res;
    }

}
