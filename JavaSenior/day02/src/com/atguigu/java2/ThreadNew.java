package com.atguigu.java2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Since JDK 5.0, there is two new ways to create a thread. One of them is to implement the Callable interface
 */
class NumThread implements Callable{

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            if(i%2 == 0){
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}
public class ThreadNew {
    public static void main(String[] args) {
        NumThread numThread = new NumThread();

        FutureTask futureTask = new FutureTask(numThread);
        new Thread(futureTask).start();
        try {
            //get()返回值即为FutureTask构造器实参（是一个Callable接口的实现类的对象）重写的call()方法的返回值
            Object sum = futureTask.get();
            System.out.println("sum: " + sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
