package com.atguigu.java1;

public class CheckAccountTest {
	public static void main(String[] args) {
		CheckAccount cacc = new CheckAccount(1122, 20000, 0.045, 5000);
		cacc.withdraw(5000);
		System.out.println("Your account balance is: " + cacc.getBalance());
		System.out.println("The overdrafy amount is: " + cacc.getOverdraft());
		cacc.withdraw(18000);
		System.out.println("Your account balance is: " + cacc.getBalance());
		System.out.println("The overdrafy amount is: " + cacc.getOverdraft());
		cacc.withdraw(3000);
		System.out.println("Your account balance is: " + cacc.getBalance());
		System.out.println("The overdrafy amount is: " + cacc.getOverdraft());
	}
}
