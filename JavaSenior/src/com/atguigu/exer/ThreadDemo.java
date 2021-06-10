package com.atguigu.exer;

/**
 * Create two threads one of them print all odd numbers less than 100 the other one print all even numbers less than 100
 */
public class ThreadDemo {
    public static void main(String[] args) {
//        OddThread ot = new OddThread();
//        EvenThread et = new EvenThread();
//
//        ot.start();
//        et.start();
        //匿名子类的方式
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 1)
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0)
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }.start();
    }
}

class OddThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1)
                System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0)
                System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
