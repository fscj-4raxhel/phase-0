package com.atguigu.p2.bean;

/**
 * 这就是个Java bean了，为什么呢？
 * 1. public class
 * 2. 提供空参构造器
 * 3. 提供公共的getter setter 方法
 * @author Chris
 *
 */
public class Customer {
	private String name;
	private char gender;
	private int age;
	private String phone;
	private String email;

	public Customer(String name, char gender, int age, String phone, String email) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}

	public Customer() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
