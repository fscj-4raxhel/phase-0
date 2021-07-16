package com.atguigu.java3;

import org.junit.Test;

import java.io.File;

public class FileTest {
    @Test
    public void test1(){

        //constructor 1
        File file1 = new File("hello.txt");//relative to current module
        File file2 = new File("/Users/chris/hello.txt");//relative to current module
        //constructor 2
        File file3 = new File("/Users/chris", "JavaSenior");
        //constructor 3
        File file4 = new File(file3,"hi.txt");


    }
    @Test
    public void test2(){

        File file1 = new File("hello.txt");
        File file2 = new File("/Users/chris/hi.txt");

        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(file1.lastModified());

        System.out.println();

        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getPath());
        System.out.println(file2.getName());
        System.out.println(file2.getParent());
        System.out.println(file2.length());
        System.out.println(file2.lastModified());
    }

    @Test
    public void test3(){
        File file1 = new File("/Users/chris/Coding Bootcamp/Code/phase-0/JavaSenior");

        String[] res = file1.list();
        for(String str:res){
            System.out.println(str);
        }
        System.out.println();
        File[] ress = file1.listFiles();
        for(File aFile:ress){
            System.out.println(aFile);
        }

    }

    @Test
    public void test4(){
        File file1 = new File("hello.txt");

        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.exists());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.isHidden());
    }
}
