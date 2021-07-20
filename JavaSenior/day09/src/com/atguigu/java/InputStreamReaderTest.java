package com.atguigu.java;

import org.junit.Test;

import java.io.*;

public class InputStreamReaderTest {

    @Test
    public void test1() throws IOException {
        FileInputStream fis= new FileInputStream("dbcp.txt");
        InputStreamReader isr= new InputStreamReader(fis,"UTF-8");
        char[] cbuf = new char[1024];
        int len;
        while((len = isr.read(cbuf)) != -1){
            String str = new String(cbuf,0,len);
            System.out.print(str);
        }
        isr.close();
    }
    @Test
    public void test2() throws IOException {
        File file1 = new File("dbcp.txt");
        File file2 = new File("dbcp_gbk.txt");

        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);

        InputStreamReader isr = new InputStreamReader(fis,"utf-8");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"gbk");

        char[] cbuf = new char[20];
        int len;
        while((len = isr.read(cbuf)) != -1){
            osw.write(cbuf,0,len);
        }

        osw.close();
        isr.close();


    }

}
