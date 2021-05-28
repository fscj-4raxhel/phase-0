package com.atguigu.java;

public class ArrayTest2 {
	public static void main(String[] args) {
		String[] arr = new String[] {"JJ", "DD", "MM", "BB","GG","AA"};
		
		//数组的复制
		String[] arr1 = new String[arr.length];
		for(int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i];
		}
		//数组的反转
		for(int i = 0; i < arr1.length / 2 ; i++) {
			String temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i -1] = temp;
		}
		//Search(linear search)
		String desc = "BB";
		
		boolean isFlag = true;
		for(int i = 0; i < arr.length; i++) {
			if(desc.equals(arr[i])) {
				System.out.println("Find item:" + desc + " at " + i);
				isFlag = false;
				break;
			}
		}
		if (isFlag) {
			System.out.println("item not found");
		}

	//Binary Search
	//prerequisite: sorted list
	boolean isNotFind = true;
	int[] arr2 = new int[] {-99, -34, 2,3,4,5,6,7,1234,12567,79345};
	int dest1 = -34;
	int head = 0;//初始的首索引
	int end = arr2.length;//初始的末索引
	
	while(head <= end) {
		int middle = (head + end)/2;
		if(dest1 == arr2[middle]) {
			System.out.println("Find item " + dest1 + " at " + middle);
			isNotFind = false;
			break;
		}else if (arr2[middle] > dest1){
			end = middle -1;
		}else {
			head = middle + 1;
		}
		
	}
	if(isNotFind){
		System.out.println("item not found");
	}
	}
}
