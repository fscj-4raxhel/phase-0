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
		
		//编译时通过，运行时不通过
		
		//example 1
//		Person p3 = new Woman();//多态性
//		Man m3 = (Man)p3;
//		//example 2
		//Person p4 = new Person();
		//Man m4 = (Man)p4;
		
		//编译时通过，运行时也通过
		Object obj = new Woman();
		Person p = (Person)obj;
		
		//编译不过
//		Man m5 = new Woman(); 类型不匹配，没有任何关系
	}
}
