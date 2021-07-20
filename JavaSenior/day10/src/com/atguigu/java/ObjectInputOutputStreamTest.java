package com.atguigu.java;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStreamTest {
    @Test
    public void testObjectOutputStream() {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("data.dat"));
            oos.writeObject(new String("Rachel Zeng is lovely"));
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if(oos != null)
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
