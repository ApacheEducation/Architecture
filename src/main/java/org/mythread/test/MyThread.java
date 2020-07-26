package org.mythread.test;

/**
 * Created by yanghai on 16-5-7.
 */
public class MyThread extends Thread {
    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    private String str;
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(this.str);
            try {
                Thread.sleep(100);
                util.aaa="aaaa";
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
