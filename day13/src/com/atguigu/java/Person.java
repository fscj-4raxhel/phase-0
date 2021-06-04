package com.atguigu.java;

public class Person {
	String name;
	int age;

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void eat() {
		System.out.println("eat");
	}

	public void walk() {
		System.out.println("Person: walk ");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//
//		if (obj instanceof Person) {
//			Person aPerson = (Person) obj;
////			if(this.age == aPerson.age && this.name.equals(aPerson.name)) {
////			return true;	
////			}
////			
//			return this.age == aPerson.age && this.name.equals(aPerson.name);
//		} else {
//
//			return false;
//		}
//	}
	
	
}
