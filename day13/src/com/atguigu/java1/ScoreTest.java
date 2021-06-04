package com.atguigu.java1;

import java.util.Scanner;
import java.util.Vector;

public class ScoreTest {
	public static void main(String[] args) {
		// 1. 实例化Scanner，用于从键盘获取学生成绩
		Scanner scan = new Scanner(System.in);
		int maxScore = 0;
		// 2. 创建Vector 对象
		Vector v = new Vector();
		// 3. 通过for(;;)给Vector添加数组
		for(;;) {
			System.out.println("Input Student Score");
			int score = scan.nextInt();
			if(score < 0) break;
			if(score > 100) {
				
				System.out.println("数据非法， 重新输入");
				continue;
			}
			v.addElement(score);//自动装箱
			// 4. 获取学生成绩最大值
			if(maxScore < score) {
				maxScore = score;
			}
		}
		// 5.遍历Vector 得到每个学生的成绩，并与最大成绩比较，得到每个学生的等级
		char level;
		for(int i = 0; i < v.size(); i ++) {
			Object obj = v.elementAt(i);
			//JDK 5.0之前
//			Integer inScore = (Integer)obj;
//			int score = inScore.intValue();
			//JDK 5.0 之后
			int score = (int)obj;
			
			
			if(maxScore - score <= 10) {
				level = 'A';
			}else if(maxScore - score <= 20) {
				level = 'B';
			}else if (maxScore - score <= 30) {
				level = 'C';
			}else {
				level = 'D';
			}
		}
		
	}
}
