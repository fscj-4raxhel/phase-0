package com.atguigu.java;

import org.junit.Test;

import java.io.*;

public class BufferedTest {
    /*
    * non text file copy
    * */
    @Test
    public void testBufferedStream() throws FileNotFoundException {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File srcFile = new File("someVides.avi");
            File destFile = new File("copyedVideo.avi");

            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            byte[] cbuf = new byte[1024];
            int len;
            while((len = bis.read(cbuf)) != -1){
                bos.write(cbuf,0,len);
                bos.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        if( bos != null) {
            try {
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if( bis != null) {
            try {
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        }

        

    }
}

