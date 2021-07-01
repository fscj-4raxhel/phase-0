package com.atguigu.java;

import org.junit.Test;

public class StringBufferBuilderTest {
    /**
     * String, StringBuffer, StringBuilder
     */
    @Test
    public void test1(){
        StringBuffer buffer1 = new StringBuffer("abc");
        buffer1.insert(1,"false");

        buffer1.reverse();
    }
}
