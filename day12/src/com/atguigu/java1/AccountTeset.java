package com.atguigu.java1;

public class AccountTeset {
	public static void main(String[] args) {
		Account acct = new Account(1122, 20000, 0.045);
		acct.withdraw(30000);
		System.out.println("Your account balance is: " + acct.getBalance());
		acct.withdraw(2500);
		acct.deposit(3000);
		System.out.println("Your account balance is: " + acct.getBalance());
		System.out.println("Your monthly interest rate is: " + acct.getMonthlyInterest());

	}
}
