package com.atguigu.java;

public class BubbleSortTest {
public static void main(String[] args) {
	int[] arr = new int[] {43, 32, 76, -98, 0, 64, 33, -21, 32, 99};
	
	
	for(int i = arr.length - 1; i > 1; i--){
		for(int j = 0; j < i; j++) {
			if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j + 1] = temp;
			}
		}
		
	}
	
	for(int i = 0; i < arr.length; i++){
		System.out.print(arr[i] + "\t");
	}
}
}
