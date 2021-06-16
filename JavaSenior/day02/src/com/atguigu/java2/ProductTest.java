package com.atguigu.java2;

/**
 * The implementation of the classic consumer producer problem
 */

class Clerk{

    private int productCount = 0;
    public synchronized void produceProduct() {
        if(productCount < 20) {
            productCount++;
            notify();
            System.out.println(Thread.currentThread().getName() + ": start producing the " + productCount + "th product");
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void consumeProduct() {
        if(productCount > 0){
            System.out.println(Thread.currentThread().getName() + ": start consuming the " + productCount + "th product");
            productCount--;
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Producer extends Thread{
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName() + " start producing");
        while (true){
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.produceProduct();
        }
    }
}
class Consumer extends Thread{
    private Clerk clerk;
    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName() + " start consuming");
        while(true){

            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.consumeProduct();
        }
    }
}
public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer p1 = new Producer(clerk);
        p1.setName("Producer-1");
        Consumer c1 = new Consumer(clerk);
        c1.setName("Consumer-1");
        Consumer c2 = new Consumer(clerk);
        c2.setName("Consumer-2");
        p1.start();
        c1.start();
        c2.start();
    }
}
