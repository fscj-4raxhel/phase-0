package com.atguigu.java1;

public class BankTest {
}

class Bank {
    private Bank() {
    }

    private static Bank instance = null;

    public static Bank getInstance() {
        //方式一：效率稍差
//        synchronized (Bank.class) {
//            if (instance == null) {
//                instance = new Bank();
//            }
//            return instance;
//        }
        //方式二：效率稍高
        if (instance == null) {
            synchronized (Bank.class) {
                if (instance == null) {
                    instance = new Bank();
                }
            }
        }
        return instance;
    }
}