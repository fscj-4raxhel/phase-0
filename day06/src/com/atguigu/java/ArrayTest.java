package com.atguigu.java;

/* 
 * 
 * 
 * 
 */
public class ArrayTest {
	
	public static void main(String[] args) {
		//default initialization value of Java array;
		
		int [] arr = new int[4];
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("****************");
		float [] arr2 = new float[4];
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("****************");
		char [] arr3 = new char[4];
		for(int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		System.out.println("****************");
		boolean [] arr4 = new boolean[4];
		for(int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}
	}

}
