package com.atguigu.java;

public class TemplateTest {
	public static void main(String[] args) {
		
	Template t = new SubTemplate();
	t.spendTime();
	}

}

abstract class Template {
	public void spendTime() {
		long start = System.currentTimeMillis();

		code();// 不确定的部分

		long end = System.currentTimeMillis();

		System.out.println("Time elasped: " + (end - start));
	}

	public abstract void code();
}

class SubTemplate extends Template {

	@Override
	public void code() {
		boolean isPrime = true;
		for (int i = 2; i < 1000; i++) {
			for (int j = 2; j < Math.sqrt(i); j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				System.out.println("Found prime number " + i);
			isPrime = true;
		}
	}

}