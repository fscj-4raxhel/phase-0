package com.atguigu.java1;

public class MethodArgsTest {
public static void main(String[] args) {
	MethodArgsTest test = new MethodArgsTest();
	test.show(12);
	test.show("Hello","World");
	test.show();
}
	public void show(int i) {
		
	}
	
	public void show(String s) {
		
	}
	
	public void show(String...strs) {
		System.out.println("show(String ... srts)");
	}
}
