package com.atguigu.java;
/*
 * 使用冒泡排序，实现如下的数组从小到大排序。int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
 * 
 *  */
public class Day07ExcerTest {
public static void main(String[] args) {
	
	int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
	System.out.println("*******  Bubble Sort Array  *******");
	for(int i = arr.length - 1; i > 0; i--) {
		for(int j = 0; j < i; j ++) {
			if(arr[j] > arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}

	}
	for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
		}
	
	//reverse
	System.out.println();
	System.out.println("*******  Reverse Array  *******");
	int temp = 0;
	for(int i = 0; i < arr.length / 2; i++) {
		temp = arr[i];
		arr[i] = arr[arr.length - i - 1];
		arr[arr.length - i - 1] = temp;
	}
	for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
		}
	//copy
	System.out.println();
	System.out.println("*******  Copy Array  *******");
	int[] arr2 = new int[arr.length];
	for(int i = 0; i < arr.length; i++) {
		arr2[i] = arr[i];
	}
	for(int i = 0; i < arr2.length; i++) {
		System.out.print(arr2[i] + " ");
		}
	// linear search
	System.out.println();
	System.out.println("*******  Linear Search  *******");
	int tar = 22;
	boolean isFound = false;
	for(int i = 0; i < arr.length; i++) {
		if(arr[i] == tar) {
			System.out.println(tar + " is found at index " + i);
			isFound = true;
			break;
		}
	}
	if(!isFound) {
		System.out.println(tar + " is NOT found");
	}
}//main
}
