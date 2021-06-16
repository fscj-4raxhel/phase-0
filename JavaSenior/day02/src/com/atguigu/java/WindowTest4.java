package com.atguigu.java;

/**
 * 实现Runnable接口的方式
 */class Window4 extends Thread {
    private static int ticket = 100;
//    private static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            show();
        }
    }

    private static synchronized void show() {//这才是对的因为同步监视器是Window4.class
//    private synchronized void show() {//此时是错误的，因为同步监视器是this,所以是t1,t2,t3，一个线程一把锁，不成
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + " sold ticket # " + ticket);
            ticket--;
        }
    }

}



public class WindowTest4 {
    public static void main(String[] args) {
        Window4 t1 = new Window4();
        Window4 t2 = new Window4();
        Window4 t3 = new Window4();

        t1.setName("Window-1");
        t2.setName("Window-2");
        t3.setName("Window-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
