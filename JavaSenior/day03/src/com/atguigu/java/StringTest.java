package com.atguigu.java;

import org.junit.Test;

public class StringTest {
    @Test
    public void test3(){
        String s1 = "javaEE";
        String s2 = "hadoop";

        String s3 = "javaEEhadoop";
        String s4 = "javaEE" + "hadoop";
        String s5 = s1 + "hadoop";
        String s6 = "javaEE" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//fasle
        System.out.println(s3 == s7);//fasle
        System.out.println(s5 == s6);//fasle
        System.out.println(s5 == s7);//fasle
        String s8 = s5.intern();

        System.out.println(s3 == s8);//true
    }
    @Test
    public void test2(){
        //此时的s1和s2的数据都在方法区的字符串常量池中
        String s1 = "JavaEE";
        String s2 = "JavaEE";

        //构造器的方式，此时的s3，s4保存的地址值，是数据在堆空间中开辟空间以后对应的地址值:
        String s3 = new String("JavaEE");
        String s4 = new String("JavaEE");

        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//false
        System.out.println(s1 == s4);//false
        System.out.println(s3 == s4);//false

    }
    @Test
    public void test1(){
        String s1 = "abc";//用字面量的方式定义，字面量：String literal
        String s2 = "abc";
//        s1 = "hello";

        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("**********");

        String s3 = "abc";
        s3 += "def";
        System.out.println(s2);
        System.out.println("**********");

        String s4 = "abc";
        String s5 = s4.replace('a', 'm');
        System.out.println(s4);
        System.out.println(s5);
    }
}
