package org.mythread.ix;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;

/**
 * Created by yanghai on 16-8-10.
 */
class MyRun implements Runnable{
    public static CountDownLatch cdl=new CountDownLatch(5);
    @Override
    public void run() {
//        ………………
        System.out.println(Thread.currentThread().getName());
        cdl.countDown();
    }
}
public class Test {
    public static void main(String[] args) {
        MyRun myRun=new MyRun();
        for(int i=0;i<5;i++){
            Thread t=new Thread(myRun);
            t.start();
        }
        try {
            MyRun.cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("xxxxx");
    }
}
