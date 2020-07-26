package org.language;

/**
 * Created by yanghai on 16-8-5.
 */
class MyThread extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.print("x");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class TestThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        Object o=null;
    }
}
