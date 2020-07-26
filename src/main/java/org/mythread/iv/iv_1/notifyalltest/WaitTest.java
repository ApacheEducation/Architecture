package org.mythread.iv.iv_1.notifyalltest;

/**
 * Created by yanghai on 16-5-8.
 */
public class WaitTest {
    public static void main(String[] args) {
        final WaitTest w = new WaitTest();
        for (int i = 0; i < 4; i++) {
            new Thread(new Runnable() {
                public void run() {
                    w.accessBlock();
                }
            }).start();
        }
    }
    private Object lock=new Object();
    private boolean isAccess = true;
    private boolean flag = true;
    public void accessBlock() {//1
        if (!isAccess) {
//1,2,3
            synchronized (lock) {
                try {
                    System.out.println(Thread.currentThread().getName() + "线程被阻塞.等待中...");
                    lock.wait();//如果不能访问,则线程等待
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }//0
        isAccess = false;//锁住,使一些线程在上面的方法中被阻塞
        System.out.println(Thread.currentThread().getName() + "线程访问中...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "开始操作---------");
        System.out.println(Thread.currentThread().getName() + "操作中-----------");
        System.out.println(Thread.currentThread().getName() + "结束操作---------");

        if(flag) {
            flag=false;
            synchronized (lock) {
                lock.notifyAll();
//                lock.notify();
            }
        }
    }
}
