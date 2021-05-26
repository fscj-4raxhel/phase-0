package com.atguigu.exer;

public class Person {
	 String name;
	 int age;
	 /**
	  * sex1: Male
	  * sex0: Female
	  */
	 int sex;
	 
	 public void study() {
		 System.out.println("Studying");
	 }
	 
	 public void showAge() {
		 System.out.println("age: " + age);
	 }
	 
	 public int addAge(int i) {
		 
		 age += i;
		 return age;
	 }
}
