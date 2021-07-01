package com.atguigu.java;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringTest1 {

    /**
     * String ===> byte[] call str.getBytes(); This process is called encoding
     * byte[] ===> String call constructor String(bytes); This process is called decoding
     */
    @Test
    public void test3() throws UnsupportedEncodingException {
        String str = "abc.123中国";
        byte[] bytes = str.getBytes();// use default charset UTF-8 to encode
        System.out.println(Arrays.toString(bytes));

        byte[] gbks = str.getBytes("gbk");
        System.out.println(Arrays.toString(gbks));

        String s1 = new String(bytes);
        System.out.println(s1);

        String s2 = new String(gbks);
        System.out.println(s2);//出现乱码

        String s3 = new String(gbks,"gbk");
        System.out.println(s3);

    }

    /**
     * String ===> char[] call str.toCharArray();
     * char[] ===> String call constructor String(charArr);
     */
    @Test
    public void test2(){
        char[] charArray = "abc.123".toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
        char[] charArr = new char[]{'h','e','l','l','o'};
        String str = new String(charArr);

    }
    /**
     * Convert String to Wrapper Class: call static method in wrapper class parseXXX(str)
     * Convert Wrapper  to String Class: call static method in String class str.valueOf()
     */
    @Test
    public void test1(){
        String s = "123";
        int num = Integer.parseInt(s);

        String s1 = String.valueOf(num);
        String s2 = s1 + "";

        System.out.println(s2 == s1);

    }
}
