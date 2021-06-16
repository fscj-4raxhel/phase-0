package com.atguigu.java2;

class Number implements Runnable{
    private int number = 1;

    @Override
    public void run() {
        while(true)
        {
            synchronized (this) {
                notify();
                if(number < 100){
                    System.out.println(Thread.currentThread().getName() + " : " + number);
                    number++;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{break;}
            }
        }
    }
}
public class CommunicationTest {
    public static void main(String[] args) {
        Number number = new Number();
        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);

        t1.setName("Number-1:");
        t2.setName("Number-2:");

        t1.start();
        t2.start();

    }
}
