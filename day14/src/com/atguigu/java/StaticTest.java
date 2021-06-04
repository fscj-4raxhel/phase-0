package com.atguigu.java;

public class StaticTest {
	public static void main(String[] args) {
		Chinese c1 = new Chinese();
		c1.name = "Ming Yao";
		c1.age = 40;
		
		Chinese c2 = new Chinese();
		c2.name = "Long Ma";
		c2.age = 30;
		
		c1.nation = "CNN";
		System.out.println(c2.nation);
		c2.nation = "China";
		Chinese.show();
		
				
	}
	
	
}


class Chinese{
	String name;
	int age;
	static String nation;
	
	public static void show() {
		System.out.println("I am a Chinese.");
	}
}