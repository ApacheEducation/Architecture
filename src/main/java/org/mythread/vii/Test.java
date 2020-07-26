package org.mythread.vii;

/**
 * Created by yanghai on 16-8-11.
 */
class MyThread extends Thread{
    public String getXxx() {
        return xxx;
    }

    public void setXxx(String xxx) {
        this.xxx = xxx;
    }

    private String xxx;


    @Override
    public void run() {
        System.out.println(xxx);
    }
}
class MyRunable implements Runnable{
    public String getXxx() {
        return xxx;
    }

    public void setXxx(String xxx) {
        this.xxx = xxx;
    }

    private String xxx;
    @Override
    public void run() {
        System.out.println(xxx);
    }
}
public class Test {
    public static void main(String[] args) {
//        MyThread t=new MyThread();
//        t.setXxx("aaa");
//        t.start();
//        MyThread t1=new MyThread();
//        t1.setXxx("bbb");
//        t1.start();
        MyRunable myRunable=new MyRunable();
        Thread t=new Thread(myRunable);
        myRunable.setXxx("xxx");

        MyRunable myRunable1=new MyRunable();
        myRunable1.setXxx("ttt");
        Thread t1=new Thread(myRunable1);
        t.start();
        t1.start();

    }
}
