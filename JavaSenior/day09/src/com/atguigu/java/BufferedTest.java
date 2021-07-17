package com.atguigu.java;

import org.junit.Test;

import java.io.*;

public class BufferedTest {
    /*
    * non text file copy
    * */
    @Test
    public void testBufferedStream() throws FileNotFoundException {
        File srcFile = new File("someVides.avi");
        File destFile = new File("copyedVideo.avi");

        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        

    }
}

