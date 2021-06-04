package com.atguigu.java;

/*
 * Override <=> Overwrite
 * 
 * Polymorphism
 * 
 */
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.eat();
		
		Man man = new Man();
		man.eat();
		man.age = 25;
		man.earnMoney();
		
		System.out.println("*****");
	}
}
