package com.atguigu.java1;

public class OverLoadExer {
	public static void main(String[] args) {
		
	}
	public void mOL(int i) {
		System.out.println(i * i);
	}
	public void mOL(int i, int j) {
		System.out.println(i * j);
	}
	public void mOL(String s) {
		System.out.println(s);
	}
	
	public int max(int i, int j) {
		return (i > j)? i :j;
	}
	
	public double max(double i, double j) {
		return (i > j)? i :j;
	}
}
