package com.atguigu.java;

public class ArrayTest1 {
public static void main(String[] args) {
	String[][] arr2 = new String[3][5];
	
	System.out.println(arr2);//[[Ljava.lang.String;@2a139a55
	System.out.println(arr2[0]);//[Ljava.lang.String;@15db9742
	System.out.println(arr2[0][0]);//null
	
	String[][] arr1 = new String[3][];
	
	System.out.println(arr1);//[[Ljava.lang.String;@6d06d69c
	System.out.println(arr1[0]);//null
	System.out.println(arr1[0][0]);//java.lang.NullPointerException

}
}
