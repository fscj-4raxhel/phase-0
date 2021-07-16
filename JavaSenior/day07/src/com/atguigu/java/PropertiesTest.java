package com.atguigu.java;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws Exception{
        Properties pros = new Properties();
        FileInputStream fis = new FileInputStream("jdbc.properties");
        pros.load(fis);

        String name = pros.getProperty("name");
        String password = pros.getProperty("password");

        System.out.println("name=" + name + ", password  = " + password);

    }
}
