package com.atguigu.java;

/**
 * Create 3 windows to sell tickets, the total number of tickets is 100.
 */
class Window extends Thread {
    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(getName() + " sell ticket, ticket#: " + ticket);
                ticket--;
            } else {
                break;
            }
        }
    }
}

public class WindowTest {
    public static void main(String[] args) {
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();

        w1.setName("Window=1");
        w2.setName("Window=2");
        w3.setName("Window=3");
        w1.start();
        w2.start();
        w3.start();
    }
}
