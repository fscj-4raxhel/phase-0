package com.atguigu.java;

public class Student extends Person {
	String major;

	public Student() {

	}

	public Student(String major) {
		this.major = major;
	}

	public void study() {
		System.out.println("I study: " + this.major);
	}

	public void eat() {
		System.out.println("Student should eat more protein");
	}

	void show() {
		System.out.println("I am a Student");

	}

	public void walk(int distance) {
		System.out.println("重写的方法");
	}
}
