package com.atguigu.java1;

import java.util.Date;

import org.junit.Test;

public class JUnitTest {

	@Test
	public void testEquals() {
		String s1 = "MM";
		String s2 = "MM";
		
		System.out.println(s1.equals(s2));
		
		Object obj = new String("GG");
		Date data = (Date)obj;
	}
	
}
