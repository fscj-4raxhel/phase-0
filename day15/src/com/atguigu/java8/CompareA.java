package com.atguigu.java8;

public interface CompareA {

	public static void method1() {
		System.out.println("CompareA: Beijing");
	}

	public default void method2() {
		System.out.println("CompareA: Beijing");
	}// public 可以省略
	
	default void method3() {
		System.out.println("CompareA: Shanghai");
	}// public 可以省略

}
