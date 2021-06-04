package com.atguigu.java;

public class ManKind {
	private int sex;
	private int salary;

	public ManKind() {
	}

	public ManKind(int sex, int salary) {
		super();
		this.sex = sex;
		this.salary = salary;
	}

	public void manOrWoman() {
		String msg = (this.sex == 1) ? "man" : (this.sex == 0) ? "woman" : "unknown";
		System.out.println(msg);
	}

	public void employeed() {
		String msg = (this.salary == 0) ? "no job" : "job";
		System.out.println(msg);
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
