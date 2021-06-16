package com.atguigu.java1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 解决线程安全问题方式三 ： Lock锁的方式 --- JDK 5.0新增
 */
class Window implements Runnable {
    private int ticket = 100;
    //1. 实例化ReentrantLock对象
    ReentrantLock lock = new ReentrantLock(true);

    @Override
    public void run() {
        while (true) {
            try {
                //2. 调用锁定方法
                lock.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " Sold ticket with number: " + ticket);
                    ticket--;
                } else {
                    break;
                }
            } finally {
                //2. 调用解锁方法
                lock.unlock();
            }
        }
    }
}

public class LockTest {
    public static void main(String[] args) {
        Window w = new Window();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);
        t1.setName("Window-1");
        t2.setName("Window-2");
        t3.setName("Window-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
