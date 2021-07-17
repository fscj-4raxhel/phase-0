package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/**
 * InputStream  FileInputStream
 * OutputStream FileOutputSream
 * Reader       FileReader
 * Writer       FileWriter
 *
 */
public class FileReaderWriterTest {
    public static void main(String[] args) {
        File inFile = new File("hello.txt");//Relative to current project
        System.out.println(inFile.getAbsolutePath());
        File inFile1 = new File("day09/hello.txt");
        System.out.println(inFile1.getAbsolutePath());
    }
    /*
    Read the content of hello.txt into memory and display in console
     */
    @Test
    public void testFileReader() {
        FileReader fr = null;
        try {
            //1. Instantiate File object, indicate which file to operate on
            File inFile = new File("hello.txt");//Relative to current module
            //2. Provide Stream implementation class
            fr = new FileReader(inFile);
            //3. Reading data
            // read() return oen character. if reached EOF return -1
//        int data = fr.read();
//        while(data != -1){
//            System.out.println((char) data);
//            data = fr.read();
//        }
            int data;
            while((data = fr.read()) != -1){
                System.out.println((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. close the stream
            try {
                if(fr != null)
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
    //对read()操作升级，使用read的重载方法
    @Test
    public void testFileReader1(){
        FileReader fr = null;
        try {
            //1. Instantiate File object
            File file = new File("hello.txt");
            //2. Instantiate FiledReader
            fr = new FileReader(file);
            //3. Read data
            // read(char[] cbuf) 返回每次读入cbuf数组中的字符的个数，如果达到文件末尾，返回-1
            char[] cbuf = new char[5];
            int len;
            while((len = fr.read(cbuf)) != -1 ){
                //helloworld123ld
//                for (int i = 0; i < cbuf.length; i++) {
//                    System.out.print(cbuf[i]);
//                }
                // Correct way 1
//                for (int i = 0; i < len; i++) {
//                    System.out.print(cbuf[i]);
//                }
                // Correct way 2
                String str = new String(cbuf, 0 , len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. close stream
            try {
                if(fr != null)
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    /**
     * If the corresponding does not exist on disk, it will be created
     * instead of throwing exception
     * There is a parameter in the FileWriter constructor
     * boolean append which indicates to append or override.
     *
     */
    public void testFileWriter() {
        FileWriter fw = null;
        try {
            //1. Instantiate File object, indicate the file to write to
            File file = new File("hello1.txt");
            //2. Instantiate FileWriter object
            fw = new FileWriter(file,false);
            //3. Write
            fw.write("I have a dream!\n");
            fw.write("You need to have a dream too");
            //4. Close Write stream
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testFileReaderFileWriter(){
        FileReader fr = null;
        FileWriter fw = null;
        try {
            File source = new File("Hello.txt");
            File dest = new File("Hello2.txt");

            fr = new FileReader(source);
            fw = new FileWriter(dest);

            char[] cbuf = new char[5];
            int len;
            while((len = fr.read(cbuf)) != -1){
                fw.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fw != null)
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fr != null)
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}

