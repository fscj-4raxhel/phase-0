package com.atguigu.java;

/*
 * 这又是一个Java Bean，讲到反射的时候就能更好的理解这个概念
 * 
 */
public class Kids extends ManKind {
	private int yearsOld;

	public Kids() {
	}

	public Kids(int yearsOld) {
		this.yearsOld = yearsOld;
	}

	public int getYearsOld() {
		return yearsOld;
	}

	public void employeed() {
		System.out.println("kids should study not work. No job");
	}

	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}

	public void printAge() {
		System.out.println("The age of this Kid is: " + this.yearsOld);
	}
}
