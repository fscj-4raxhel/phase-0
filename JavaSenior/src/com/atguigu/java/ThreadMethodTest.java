package com.atguigu.java;

public class ThreadMethodTest {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + this.getPriority() + ":" + i);
//                    if(i % 2 == 0)
////                        yield();
//                    {
//                        try {
//                            sleep(1000);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
                }
            }
        };
        t1.setName("Anonymous-Thread");
        t1.start();
        //搞主线程也可以的
        Thread.currentThread().setName("Main-Thread");
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority() + ":" + i);
//            if(i == 20) {
//                try {
//                    t1.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
        }

    }

}
