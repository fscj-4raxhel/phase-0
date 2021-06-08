package com.atguigu.java;

public class AnimalTest {
	public static void main(String[] args) {
		Animal a = new Animal();
		
		a.name = "Big Yellow";
//		a.age = 1;
//		a.legs = 4;
		
		a.show();
		
		a.setLegs(4);
		a.show();
		
	}
}

class Animal{
	String name;
	private int age;
	private int legs;
	
	public void eat() {
		System.out.println("Animal Eat");
	}
	
	public void show() {
		
		System.out.println("name = " + name + ", age " + age + ", legs " + legs);
	}
	//对属性的设置
	public void setLegs(int l) {
		if( l >= 0 && l % 2 == 0) {
			legs = l;
		}else {
			legs = 0;
			//或者抛出异常
		}
		
	}
	//对属性的获取
	public int getLegs() {
		return legs;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public int getAge() {
		return age;
		
	}
	
}