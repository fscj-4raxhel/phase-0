package com.atguigu.java1;

import org.junit.Test;

public class WrapperTest {
	
	@Test
	public void test5() {
		String str1 = "123";
		
		int num2 = Integer.parseInt(str1); 
		System.out.println(num2 + 1);
		
		String st2 = "true";
		boolean b1 = Boolean.parseBoolean(st2);
		System.out.println(b1);
		
	}
	
	@Test
	public void test4() {
		
		//方式1:
		int num1 = 10;
		String str1 = num1 +"";
		//方法2:
		float f1 = 12.3f;
		String str2 = String.valueOf(f1);
		
		Double d1 = new Double(12.4);
		String str3 = String.valueOf(d1);
		
				
	}

	
	
	@Test
	public void test3() {
		int num1 = 10;
		method(num1);
		
		
	}
	
	public void method (Object obj) {
		
	}
	
	@Test
	public void test2() {
		Integer in1 = new Integer(12);
		int i1 = in1.intValue();
		System.out.println(i1);
		
		Float f1 = new Float(12.3);
		float f2 = f1.floatValue();
		System.out.println(f2);
		
	}
	
	@Test
	public void test1() {
		int num1 = 10;
		Integer in1 = new Integer(num1);
		System.out.println(in1.toString());
		Integer in2 = new Integer("123");
		System.out.println(in2.toString());
		
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("TrUe");
		
		System.out.println(b2);
		Boolean b3 = new Boolean("true123");
		System.out.println(b3);
		
		Order order = new Order();
		System.out.println(order.isMale);
		System.out.println(order.isFemale);
	}
}

class Order{
	boolean isMale;
	Boolean isFemale;
	
	
}
