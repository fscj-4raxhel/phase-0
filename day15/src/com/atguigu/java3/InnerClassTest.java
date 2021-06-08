package com.atguigu.java3;
/*
 * 
 * 
 */
public class InnerClassTest {
public static void main(String[] args) {
	//创建SS对象（静态的成员内部类）
	Person.SS ss =  new Person.SS();
	
	//创建AA对象，非静态成员内部类
	Person p1 = new Person();
	Person.AA aa = p1.new AA();
	
	aa.print("a NUll");
}
}

class Person{
	 
	String name = "Tom Parker";
	int age;
	
	public void eat() {
		System.out.println("Outter Class eat");
	}
	
	//非静态成员内部类
	class AA{
		
		String name = "AA";
		
		public AA() {
			
		}
		public void aaMethod() {
			//调用外部类的属性，省略的东西有点长
			Person.this.eat();
		}
		
		public void print(String name) {
			System.out.println(name);//形参
			System.out.println(this.name);//
			System.out.println(Person.this.name);
		}
		
	}
	//静态成员内部类
	static class SS{
		
		String name;
		int age;
		
		public void show() {
			System.out.println("Inner Class SS show");
//			eat(); 因为静态结构不能调用非静态的结构
		}
		
	}
	
	
	{
		class BB{
			
		}
	}
	
	public void mothod() {
		
		class Dog{
			
		}
	}
	
	public Person() {
		class CC{
			
		}
	}
}
