package com.atguigu.java;

/**
 *
 * 实现Runnable接口的方式
 *
 */
class Window1 implements Runnable{
   private int ticket = 100;

   @Override
   public void run() {
      while (true){
         if(ticket > 0) {
            System.out.println(Thread.currentThread().getName() + " sold ticket # " + ticket);
            ticket--;
         }else{
            break;
         }
      }
   }
}
public class WindowTest1 {
   public static void main(String[] args) {
      Window1 w = new Window1();
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
