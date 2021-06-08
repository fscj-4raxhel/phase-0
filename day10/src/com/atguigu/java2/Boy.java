package com.atguigu.java2;

public class Boy {
	private String name;
	private int age;
	
	public void setName(String i) {
		this.name = i;
	}
	
	public String getName() {
		return this.name;
	
	}
	
	public void setAge(int i) {
		this.age = i;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void marry(Girl girl) {
		System.out.println("I want to marry" + girl.getName());
	}
	
	public void shout() {
		if(this.age >= 22) {
			System.out.println("You can get married");
		}else {
			System.out.println("You can get married");
		}
	}
}
