package org.mythread.ix;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by yanghai on 16-5-10.
 */
public class CountDown {
    public static CountDownLatch cdl=new CountDownLatch(2);
    public static void main(String[] args) {
        Task ts=new Task();
        Thread t=new Thread(ts);
        t.start();
        System.out.println("==========");
        try {
            cdl.await(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ok");
    }
}
class Task implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println("------------");
            Thread.sleep(1000);
            System.out.println("++++++++++++");
            CountDown.cdl.countDown();
            CountDown.cdl.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
