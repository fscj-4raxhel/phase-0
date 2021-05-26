package com.atguigu.java;
/*
 * 设计类其实就是设计类的成员
 * 
 * 
 */
public class PersonTest {
	public static void main(String[] args) {
		//创建类的对象 == 实例化一个类
		Person p1 = new Person();
		//Scanner scanner = new Scanner (System.in);
		
		//调用对象的结构：属性、方法
		p1.name = "Tom";
		p1.isMale = true;
		System.out.println(p1.name);
		
		//调用方法
		p1.eat();
		p1.sleep();
		p1.talk("Chinese");
		
		Person p2 = new Person();
		System.out.println(p2.name);
		
		Person p3 = p1;//注意，此时没有新造一个对象
		p3.age = 10;
		System.out.println(p1.age);//10
	}

}

class Person{
	
	//属性 = Field = 成员变量
	String name;
	int age = 1;
	boolean isMale;
	//方法 = （成员）方法 = 函数
	public void eat() {
		System.out.println("People can eat");
		
	}
	
	public void sleep() {
		System.out.println("People can sleep");
		
	}
	
	public void talk(String language) {
		System.out.println("People can speak " + language);
		
	}
	
	
}