package com.atguigu.exer;

public class YangHuiTest {
public static void main(String[] args) {
	//1. 声明并初始化二维数组
	int[][] yanghui = new int[10][];
	//2. 给数组的元素赋值
	for(int i =0; i < yanghui.length; i++) {
		yanghui[i] = new int[i+1];
		//首末元素，连续赋值
		yanghui[i][0] = yanghui[i][i] = 1;
		//给首末元素赋值
		//if(i > 1) {
		for(int j = 1; j < yanghui[i].length - 1; j++) {// j < i 是i错的！
			yanghui[i][j] = yanghui[i-1][j] + yanghui[i-1][j-1];
		}
		//}去掉也可以
	}
	//3. 遍历二维数组
	for(int i = 0; i < yanghui.length; i++) {
		for(int j = 0; j < yanghui[i].length; j++) {
			System.out.print(yanghui[i][j] + "\t");
		}
		System.out.println();
	}
}
}
