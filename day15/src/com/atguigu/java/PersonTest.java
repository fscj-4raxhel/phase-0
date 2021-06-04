package com.atguigu.java;

public class PersonTest {
	public static void main(String[] args) {
		method(new Student());
		
		Worker worker = new Worker();
		method1(worker);//非匿名的类非匿名的对象
		
		method1(new Worker());//非匿名的类匿名的对象
		
		//创建了一个匿名字类的对象：P
		Person p = new Person() {

			@Override
			public void eat() {
				System.out.println("eat something");
				
			}

			@Override
			public void breath() {
				System.out.println("Breath hardly");
				
			}};
			
//			method1(p);
			
			//还能更懒：匿名字类的匿名对象
			method1(new Person() {

				@Override
				public void eat() {
					System.out.println("eat something");
					
				}

				@Override
				public void breath() {
					System.out.println("Breath hardly");
					
				}
				
			});
	}

	public static void method1(Person p) {
		p.eat();
		p.breath();
	}
	public static void method(Student s) {

	}
	
}

class Worker extends Person{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		
	}
	
}
