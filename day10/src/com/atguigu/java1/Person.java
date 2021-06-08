package com.atguigu.java1;

public class Person {
	
	String name;
	private int age;
	
	public Person() {
		System.out.println("Person() --- ");
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setAge(int a) {
		if (a < 0 || a > 130) {
//			throw new RuntimeException("invalid input");
			System.out.println("invalid input");
			return;
		}
			age = a;
		
	}
	
	public int getAge() {
		return age;
	}

}
