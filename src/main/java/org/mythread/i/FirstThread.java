package org.mythread.i;

public class FirstThread extends Thread {
    private int i;
    public FirstThread(String name){
        super(name);
    }

    public void run() {
        for (; i < 2; i++) {
            System.out.println(this.getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.println(Thread.currentThread().getName()
                    + " " + i);
            if (i == 1) {
                new FirstThread("aaaaa").start();
                new FirstThread("bbbbb").start();
            }
        }
    }
}

