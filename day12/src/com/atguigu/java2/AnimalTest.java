package com.atguigu.java2;

public class AnimalTest {
	public static void main(String[] args) {
		AnimalTest test = new AnimalTest();

		test.func(new Dog());
	}

	public void func(Animal animal) {
		animal.eat();
		animal.shout();
	}
	
	//如果没有多态，还要重载这个方法 
}

class Animal {
	public void eat() {
		System.out.println("animal: eat");
	}

	public void shout() {
		System.out.println("animal: shout");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("dog: eat");
	}

	public void shout() {
		System.out.println("Dog eats bones");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("Cat eats fish");
	}

	public void shout() {
		System.out.println("Miahsdf ");
	}

}