package com.atguigu.java;

public class AbstractTest {
	public static void main(String[] args) {
//		Person p1 = new Person();
//		p1.eat();
	}
}

abstract class Creature{
	public abstract void breath();
}

abstract class Person extends Creature{

	String name;
	int age;

	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public abstract void eat();
	
	
	public void walk() {
		System.out.println("walk");
	}

}

class Student extends Person{

	public Student(String name, int age) {
		super(name,age);
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public void eat() {System.out.println("Hello");}
	
	public void breath() {System.out.println("学生应该呼吸新鲜的没有雾霾的空气");}
	
}
