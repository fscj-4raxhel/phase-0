package com.atguigu.java;

import org.junit.Test;

public class GenericTest1 {
    @Test
    public void test1(){
        /* If generic type is not given in the declaration
        then the default type is java.lang.Object
        */
        Order order = new Order();

        Order<String> order1 = new Order<String>("orderAA",1001,"OrderAA");

    }

}
