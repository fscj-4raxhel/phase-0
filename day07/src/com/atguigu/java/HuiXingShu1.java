package com.atguigu.java;

import java.util.Scanner;

public class HuiXingShu1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please Enter the Size of the problem:");
		int size = scan.nextInt();
		
		int[][] arr = new int[size][size];
		
		int l = 0, top = 0, state = 0;// left and top limit
		int num = 1;//the next number to fill in
		int r = size -1, bot = size -1; // right and bottom limit 
		int row, col;// current position
		row = col = 0;
		
		while(num <= size * size) {
			System.out.println("State is: " + state);
			switch(state) {
			
			case 0:
				//going right
				while(col <= r) {
					arr[row][col] = num;
					num++;
					col++;
				}
				col = (col > r)?r : col;
				top ++;
				row ++;
				System.out.println("row index: " + row + " column index: " + col);
				break;
			case 1:
				//going down
				while(row <= bot) {
					arr[row][col] = num;
					num++;
					row++;
				}
				row = (row > bot)?bot : row;
				r--;
				col--;
				System.out.println("row index: " + row + " column index: " + col);
				break;
			case 2:
				//going left
				while(col >= l) {
					arr[row][col] = num;
					num++;
					col--;
				}
				bot--;
				row--;
				col = (col < l)?l : col;
				System.out.println("row index: " + row + " column index: " + col);
				break;
			case 3:
				//going up
				while(row >= top) {
					arr[row][col] = num;
					num++;
					row--;
				}
				row = (row < top)?top : row;
				l++;
				col++;
				System.out.println("row index: " + row + " column index: " + col);
				break;
			
			}
			
			//update state
			state = (state + 1) % 4;

			for(int i = 0; i < arr.length; i++) {
				for(int j=0; j<arr[i].length;j++) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.println();
		
			}
			System.out.println("********");
		}
		
		scan.close();
		System.out.print("Stopped");
}
}