package com.atguigu.java;

import java.util.Date;

public class EqualsTest {

	public static void main(String[] args) {

		int i = 10;
		int j = 10;
		
		Person p1 = new Man();
		Person p2 = p1;
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println("***********");
		//引用数据类型
		Person person1 = new Person("Tom", 21);
		Person person2 = new Person("Tom", 21);
		boolean p1_p2 = person1 == person2;
		System.out.println(p1_p2);//false
		
		String str1 = new String("atguigu");
		String str2 = new String("atguigu");
		System.out.println(str1 == str2);
		System.out.println("***********");
		System.out.println(person1.equals(person2));
		System.out.println(str1.equals(str2));
		
		Date date1 = new Date(1231231231L);
		Date date2 = new Date(1231231231L);
		
		
		
	}

}
