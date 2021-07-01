package com.atguigu.java;

import org.junit.Test;

public class IDEADebugTest {
    @Test
    public void StringBufferTest(){
        String str = null;
        StringBuffer sb = new StringBuffer();

        sb.append(str);
        System.out.println(sb.length());//4
        System.out.println(sb);// "null"

        StringBuffer sb1 = new StringBuffer(str);// NullPointerException
        System.out.println(sb1);

    }
}
