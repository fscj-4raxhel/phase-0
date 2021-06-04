package com.atguigu.java1;

public class BlockTest {
	public static void main(String[] args) {
		String desc = Person.desc;
		Person p1 = new Person();
		Person p2 = new Person();
		System.out.println(p1.getClass());
	}
}

class Person{
	
	String name;
	int age;
	static String desc = "I am a Person";
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public void eat() {
		System.out.println("eat");
		
	}
	// 代码块
	{
		System.out.println("Hello from code Block");
	}

	static {
		System.out.println("Hello from static code Block");
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
