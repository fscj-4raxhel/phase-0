package com.atguigu.java2;

public class Girl {
	
	private String name;
	private int age;
	public int getAge() {
		return age;
	}
	public Girl() {
		super();
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void marry(Boy boy) {
		System.out.println("I want to marry "+ boy.getName());
		boy.marry(this);
	}
	/**
	 * 
	 * 比较两个对象的大小
	 * @param girl
	 * @return 正数：当前对象大；负数：当前对象小； 0当前对象与形参对象相等
	 */
	public int comparte(Girl girl) {
		return this.age - girl.age;
	}
}
