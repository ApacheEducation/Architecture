package org.mythread.ix;

import java.util.concurrent.locks.LockSupport;

/**
 * Created by yanghai on 16-5-14.
 */
class Thread1 extends Thread{
    public Thread1(String name){
        super.setName(name);
    }

    @Override
    public void run() {
        System.out.println("--------"+getName());
        LockSupport.park();
        System.out.println("++++++++"+getName());
    }
}
public class LockSupportDemo {
    public static Object obj=new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread1 t1=new Thread1("t1");
        Thread1 t2=new Thread1("t2");
        t1.start();
        Thread.sleep(1000);
        t2.start();
        Thread.sleep(1000);
        LockSupport.unpark(t1);
        Thread.sleep(1000);
        LockSupport.unpark(t2);
    }

}
