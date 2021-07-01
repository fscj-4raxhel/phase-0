package com.atguigu.java;

import org.junit.Test;

import java.util.Date;

public class DateTimeTest {
    @Test
    public void test(){
        Date date1 = new Date();
        System.out.println(date1.toString());//Fri Jun 18 15:23:43 EDT 2021
    }
}
