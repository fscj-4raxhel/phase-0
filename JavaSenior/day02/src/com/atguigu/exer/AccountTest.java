package com.atguigu.exer;

class Account{
private double balance;

    public Account(double balance) {
        this.balance = balance;
    }
    public void deposite(double amt){
        if(amt > 0){
            balance += amt;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " Deposite Success, new balance: " + balance);
        }
    }
}
class Customer extends Thread{
    private Account account;

    public Customer(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.deposite(1000);
        }
    }
}
public class AccountTest {
    public static void main(String[] args) {
        Account acct = new Account(0);
        Customer c1 = new Customer(acct);
        Customer c2 = new Customer(acct);

        c1.setName("Customer-1");
        c2.setName("Customer-2");

        c1.start();
        c2.start();
    }
}
