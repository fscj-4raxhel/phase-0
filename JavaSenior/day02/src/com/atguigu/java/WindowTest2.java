package com.atguigu.java;

/**
 * 实现Runnable接口的方式
 */
class Window2 extends Thread {
    private static int ticket = 100;
//    private static Object obj = new Object();

    @Override
    public void run() {
        synchronized (Window2.class) {
            while (true) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + " sold ticket # " + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

public class WindowTest2 {
    public static void main(String[] args) {
        Thread t1 = new Window2();
        Thread t2 = new Window2();
        Thread t3 = new Window2();

        t1.setName("Window-1");
        t2.setName("Window-2");
        t3.setName("Window-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
