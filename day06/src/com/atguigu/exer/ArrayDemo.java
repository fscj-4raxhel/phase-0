package com.atguigu.exer;

import java.util.Scanner;

/*
 * 从键盘读入学生成绩，找出最高分， 并输出学生成绩等级。
 * 成绩>=最高分-10 等级为’A’
 * 成绩>=最高分-20 等级为’B’
 * 成绩>=最高分-30 等级为’C’
 * 其余 等级为’D’

 */
public class ArrayDemo {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("please enter the number of students:");
	int num = scan.nextInt();
	
	int[] scores = new int[num];
	System.out.println("Please enter " + num + "scores:");
	int maxScore = -1;
	for(int i = 0; i < scores.length; i++) {
		scores[i] = scan.nextInt();
		maxScore = (maxScore < scores[i])?scores[i]:maxScore;
	}
	System.out.println("Max Score is: " + maxScore);
	char level;
	for(int i =0; i < scores.length; i++) {
		if (maxScore - scores[i] <= 10) {
			level = 'A';
		}else if(maxScore - scores[i] <= 20) {
			level = 'B';
		}else if(maxScore - scores[i] <= 30) {
			level = 'C';
		}else {
			level = 'D';
		}
		System.out.println("Student " + i + "has score: " + level);
	}
}
}
