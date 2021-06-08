package com.atguigu.java;

public class ErrorTest {
	
	public static void main(String[] args) {
		
		//1. StackOverflowErrornjkhjhhkejhk,qhwk,rhqer
//		werqweweqe
//		main(args);
		
		//2. OOM Error
		Integer[] arr = new Integer[1024 * 1024 * 256];
		System.out.println("Ivan is here with me");
//		1 : 8 byte
//		1024: 8 MB
//		1024 * 1024 : 8GB
//		1024 * 1024 * 512  : 8 * 512 GB = 4 * 1024 GB;
	}

}