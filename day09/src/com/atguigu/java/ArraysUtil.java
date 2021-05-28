package com.atguigu.java;
/*
 * 自定义数组工具类
 * 
 */
public class ArraysUtil {


	//求数组的最大值
	public int getMax(int[] arr) {
		if (arr == null || arr.length == 0) {
			return -1;
		}else {
			int res = arr[0];
			for(int i = 0; i < arr.length; i++ ) {
				if(arr[i] > res) {
					res = arr[i];
				}
			}
			return res;
		}
	}
	//求数组的最小值
	public int getMin(int[] arr) {
		if (arr == null || arr.length == 0) {
			return -1;
		}else {
			int res = arr[0];
			for(int i = 0; i < arr.length; i++ ) {
				if(arr[i] < res) {
					res = arr[i];
				}
			}
			return res;
		}
	}
	//求数组的总和
	public int getSum(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}else {
			int res = arr[0];
			for(int i = 0; i < arr.length; i++ ) {
					res += arr[i];
			}
			return res;
		}
	}
	//求数组的平均值
	public int getAve(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}else {
			int res = getSum(arr);
			return res / arr.length;
		}
	}
	//反转数组
	public void reverse(int[] arr) {
		if (arr == null || arr.length == 0) {
			return;
		}else {
			for(int i = 0; i < arr.length / 2; i++) {
				int temp = arr[i];
				arr[i] = arr[arr.length - 1 -i];
				arr[arr.length -1 -i] = temp;
		}
	}
	}
	//复制数组
	public int[] copy(int[] arr) {
		return null;
	}
	//数组排序
	public void sort(int[] arr) {
		
	}
	//数组遍历
	public void print(int[] arr) {
		
	}
	
	//查找指定元素
	public int getIndex(int[] arr, int dest) {
		return -1;
	}
	
}
