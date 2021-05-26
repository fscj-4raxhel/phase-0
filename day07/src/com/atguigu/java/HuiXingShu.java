package com.atguigu.java;

import java.util.Scanner;

public class HuiXingShu {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Please Enter the Size of the problem:");
	int size = scan.nextInt();

	int[][] arr = new int[size][size];
	
	int num = 1;//current number 
	int state = 0;// 0: going right; 1: going down; 2: going left; 3: going up
	int top = 0, left = 0;
	int bottom = size - 1, right = size - 1;
	int row = 0, column = 0;
	loop:while(true) {
		//1. 根据state往前走，填数字，结束是后更新top, left, bottom, right
		switch(state) {
		case 0://往右走
			for(int j = column; j <= right; j++) {
				arr[row][j] = num;
				column = j;
				num++;
				if(num > size * size) break loop;System.out.println("going right");
				for(int k = 0; k < arr.length; k++) {
					for(int m = 0; m < arr[k].length; m++){
						System.out.print(arr[k][m] + '\t');
					}
					System.out.println();
					
				}
			}
			top++;
			row = top;
			break;
		case 1://往下走
			for(int i = row; i <= bottom; i++) {
				arr[i][column] = num;
				row = i;
				num++;
				if(num > size * size) break loop;
				System.out.println("going down");
				for(int k = 0; k < arr.length; k++) {
					for(int j = 0; j < arr[k].length; j++){
						System.out.print(arr[k][j] + '\t');
					}
					System.out.println();
					
				}
			}
			
			right--;
			column = right;
			break;
		case 2://往左走
			for(int j = column; j >= left; j--) {
				arr[row][j] = num;
				column = j;
				num++;
				if(num > size * size) break loop;
				System.out.println("going left");
				for(int k = 0; k < arr.length; k++) {
					for(int m = 0; m < arr[k].length; m++){
						System.out.print(arr[k][m] + '\t');
					}
					System.out.println();
					
				}
			}
			
			left++;
			column = left;
			break;
		case 3://往上走
			for(int i = row; i >= top; i--) {
				arr[i][column] = num;
				row = i;
				num++;
				if(num > size * size) break loop;
				System.out.println("going up");
				for(int k = 0; k < arr.length; k++) {
					for(int m = 0; m < arr[k].length; m++){
						System.out.print(arr[k][m] + '\t');
					}
					System.out.println();
					
				}
			}
			top++;
			row = top;
			
			break;
		
		}
		//2. 更新state
		state = (state + 1) % 4;
		
	}
	System.out.println("Stoped");
	scan.close();
	
}
}