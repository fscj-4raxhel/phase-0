package com.atguigu.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class ExceptionTest2 {

	public static void main(String[] args) {
		try {
			test2();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public static void test2() throws FileNotFoundException, IOException {
		test1();
	}

	@Test
	public static void test1() throws FileNotFoundException, IOException {
		File file = new File("hello.txt");
		FileInputStream fis = new FileInputStream(file);

		int data = fis.read();
		while (data != -1) {
			System.out.println((char) data);
			data = fis.read();
		}
		fis.close();
	}
}
