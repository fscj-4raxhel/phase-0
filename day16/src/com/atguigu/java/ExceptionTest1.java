package com.atguigu.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class ExceptionTest1 {

	@Test
	public void test2() {

		try {
			File file = new File("hello.txt");
			FileInputStream fis = new FileInputStream(file);

			int data = fis.read();
			while (data != -1) {
				System.out.println((char) data);
				data = fis.read();
			}
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void test1() {
		String str = "123";
		str = "abc";
		try {
			int num = Integer.parseInt(str);
			System.out.println("Hello ---- 1");
		} catch (NumberFormatException e) {
//			System.out.println("NumberFormatException occured...");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("NullPointerException occured...");
		} catch (Exception e) {
			System.out.println("Exception occured...");
		}

		System.out.println("Hello ---- 2");

	}

}
