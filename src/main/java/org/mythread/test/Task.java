package org.mythread.test;

/**
 * Created by yanghai on 16-5-8.
 */
public class Task implements Runnable {
    private boolean flag=true;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {

        while(flag) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }
    }
}
