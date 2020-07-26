package org.mythread.test;

/**
 * Created by yanghai on 16-5-7.
 */
public class Testmain {
    public static void main(String[] args) {
//        MyThread thread=new MyThread();
//        thread.setStr("aaaaa");
//        MyThread thread1=new MyThread();
//        thread1.setStr("bbbbbb");
//        thread.start();
//
//        thread1.start();
//        System.out.println("ok");
        Task task=new Task();
        Thread t=new Thread(task,"xxxx");
        t.setDaemon(true);
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
        System.out.println("000");
    }
}
